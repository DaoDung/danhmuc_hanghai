<template>
    <div>
      <content-placeholders v-if="loading">
        <content-placeholders-img />
        <content-placeholders-heading />
      </content-placeholders>
      <div style="max-width: 1100px;" v-else>
        <div style="display: flex; background-color: #fff;">
          <div class="search-top" v-if="listShowSearchDate.includes(code)">
            <span style="margin: 0 10px;">
              Ngày: 
            </span>
            <v-menu
              ref="menuTopTau"
              :close-on-content-click="false"
              v-model="menuTopTauAll"
              :nudge-right="40"
              lazy
              transition="scale-transition"
              offset-y
              full-width
              :style="{}"
              max-width="290px"
              min-width="290px"
            >
              <v-text-field
                slot="activator"
                v-model="searchTopTauAll"
                persistent-hint
                class="pb-0 my-0"
              ></v-text-field>
              <v-date-picker v-model="dateSearchTopTauAll" no-title @input="menuTopTauAll = false"></v-date-picker>
            </v-menu>
            <v-icon size="17" style="margin-left: 10px; cursor: pointer;" @click="menuTopTauAll = !menuTopTauAll">date_range</v-icon>
          </div>
          <div class="search-top-right">
            <v-btn v-if="listCodeAdd.includes(code) && code !== 'DanhSachTauLaiHoTro' && code !== 'DanhSachHoaTieuDanTau'" flat small class="mx-0" @click="themMoi()" style="text-transform: none; color: #1d52e8;"> <v-icon size="17">add</v-icon> Thêm mới</v-btn>
            <span v-if="listCodeAdd.includes(code) && code !== 'DanhSachTauLaiHoTro' && code !== 'DanhSachHoaTieuDanTau'">|</span>

            <v-btn v-if="documentName && code === 'DanhSachTauLaiHoTro'" flat small class="mx-0" @click="themMoiSuDungTauLai()" style="text-transform: none; color: #1d52e8;"> <v-icon size="17">add</v-icon> Sử dụng tàu lai</v-btn> 
            <span v-if="documentName && code === 'DanhSachTauLaiHoTro'">|</span>

            <v-btn v-if="documentName && code === 'DanhSachHoaTieuDanTau'" flat small class="mx-0" @click="themMoiSuDungHoaTieu()" style="text-transform: none; color: #1d52e8;"> <v-icon size="17">add</v-icon> Sử dụng hoa tiêu</v-btn> 
            <span v-if="documentName && code === 'DanhSachHoaTieuDanTau'">|</span>

             <v-btn flat small class="mx-0" @click="refreshSearch()" style="text-transform: none; color: #1d52e8;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
             <span>|</span>

             <v-btn flat small class="mx-0" style="text-transform: none; color: #1d52e8;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
          </div>
        </div>
        
        <content-placeholders v-if="loadingTableAlll">
          <content-placeholders-img />
          <content-placeholders-heading />
        </content-placeholders>

        <vue-scrolling-table
          :scroll-horizontal="scrollHorizontal"
          :scroll-vertical="scrollVertical"
          :sync-header-scroll="syncHeaderScroll"
          :sync-footer-scroll="syncFooterScroll"
          :include-footer="includeFooter"
          :dead-area-color="deadAreaColor"
          :class="{ freezeFirstColumn: freezeFirstColumn, 'fullWidthTauLai': code === 'DanhSachTauLaiHoTro', 'fullWidthHaXuong': code === 'DanhSachHaXuong', 'fullWidthGhiChu': code === 'DanhSachGhiChuCanhBao' }"
          v-else-if="code !== 'DanhSachViTriNeoDauTaiCang' && !loadingTableAlll"
        >
          <template slot="thead">
            <tr style="background: #eaeaea;">
              <th
                v-for="header in headersDsTauAll"
                :key="header.text"
                v-html="header.text"
                :style="header.style"
              >
              </th>
            </tr>

            <tr style="position: relative;">
              <th :style="headersDsTauAll[0]['style']">
              </th>
              <th v-for="(item, index) in headersDsTauAll" v-if="item.id !== 'stt'" style="position: relative;">
                <v-text-field
                  v-if="item['type'] === 'text'"
                  v-model="adv[item.id]"
                  @keyup.enter="searchAdvTable()"
                  class="px-1 py-0 mx-0 my-0"
                ></v-text-field>
                <v-select
                  v-else-if="item['type'] === 'select'"
                  item-text="itemText"
                  item-value="itemValue"
                  :items="itemsSup[item.items]"
                  v-model="adv[item.id]"
                  @input="searchAdvTable()"
                  class="px-1 py-0 mx-0 my-0"
                ></v-select>
                <datetime-picker
                  v-else
                  v-model="adv[item.id]"
                  :first-day="1"
                  :show-dst="false"
                  :show-hours="true"
                  :show-minutes="true"
                  :show-seconds="false"
                  @keyup.enter="searchAdvTable()"
                  @change-value="changeDate"
                  class="px-1 py-1 mx-0 my-0"
                ></datetime-picker>
              </th>
            </tr>
          </template>
          <template slot="tbody">
            <tr v-for="(item, index) in itemsDsTauAll" :key="item.id" style="cursor: pointer;">
              <td class="text-xs-center" style="padding-top: 5px; width: 2%;" :style="headersDsTauAll[0]['style']">
                {{ pageDataTableAll * 15 - 15 + index + 1 }}
              </td>
              <td v-if="itemKey.id !== 'stt'" @click="toDetailTauBien(item)" class="text-xs-center" v-for="(itemKey, index) in headersDsTauAll" style="padding-top: 5px;">
                {{item[itemKey.id]}}
              </td>
            </tr>
          </template>
        </vue-scrolling-table>

        <ejs-grid v-else :dataSource='itemsDsTauAll' :allowGrouping='true' :groupSettings='groupOptions' height='150px'>
            <e-columns>
                <e-column field='shipName' headerText='Tên tàu' textAlign='Center' width=120></e-column>
                <e-column field='anchoringPortWharfName' headerText='Bến cảng' textAlign='Center' width=120></e-column>
                <e-column field='flagStateOfShip' headerText='Quốc tịch' textAlign='Center' width=150></e-column>
                <e-column field='no' headerText='Cầu/ phao' textAlign='Center' width=150></e-column>
                <e-column field='anchoringDateFrom' headerText='Ngày đến' textAlign='Center' width=150></e-column>
                <e-column field='anchoringDateFrom' headerText='Ngày/ giờ vào cầu' textAlign='Center' width=150></e-column>
            </e-columns>
        </ejs-grid>

        <div class="text-xs-right layout wrap" style="position: relative;">
          <div class="flex pagging-table px-2"> 
            <tiny-pagination :total="totalDsAll" :page="pageDataTableAll" custom-class="custom-tiny-class" 
              @tiny:change-page="paggingData"></tiny-pagination> 
          </div>
        </div>
      </div>
    </div>
</template>

<script>
import Vue from 'vue'
import { GridPlugin, Group } from '@syncfusion/ej2-vue-grids'
import TinyPagination from './hanghai_pagination.vue'
import DatetimePicker from './DatetimePicker.vue'
import DatetimePicker2 from './DatetimePicker_bk2.vue'
import support from '@/store/support.json'
import VueScrollingTable from 'vue-scrolling-table'
Vue.use(GridPlugin)
export default {
  props: {
    code: '',
    type: '',
    documentYear: '',
    documentName: '',
    documentTypeCode: '',
    documentStatusCode: '',
    noticeShipType: ''
  },
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker,
    'datetime-picker-2': DatetimePicker2,
    'vue-scrolling-table': VueScrollingTable
  },
  provide: {
    grid: [Group]
  },
  data: () => ({
    ccc: '',
    listCodeAdd: ['DanhSachTauBien', 'DanhSachPhuongTienThuyNoiDia', 'DanhSachTauDenCang', 'DanhSachTauRoiCang', 'DanhSachNeoTau', 'DanhSachSuaChuaTau', 'DanhSachHaXuong', 'DanhSachThuTau', 'DanhSachDuTau', 'DanhSachGhiChuCanhBao', 'DanhSachKhangNghiHangHai', 'DanhSachKeHoachChuyenTuyen', 'DanhSachHoaTieuDanTau', 'DanhSachTauLaiHoTro', 'DanhSachTauDiChuyen'],
    listShowSearchDate: ['DanhSachViTriNeoDauTaiCang', 'DanhSachTauDenCang', 'DanhSachTauDiChuyen', 'DanhSachNeoTau'],
    scrollHorizontal: true,
    scrollVertical: true,
    syncHeaderScroll: true,
    syncFooterScroll: true,
    includeFooter: true,
    deadAreaColor: '#DDDDDD',
    freezeFirstColumn: true,
    adv: {},
    itemsSup: {
    },
    itemsDsTauAll: [],
    totalDsAll: 0,
    pageDataTableAll: 1,
    menuTopTauAll: false,
    searchTopTauAll: '',
    dateSearchTopTauAll: '',
    groupData: [],
    groupOptions: { columns: ['anchoringPortWharfName'] },
    urlDanhSach: '',
    loadingTableAlll: false
  }),
  computed: {
    itineraryNo () {
      var vm = this
      return vm.$store.getters.itineraryNo
    },
    loading () {
      return this.$store.getters.loading
    },
    loadingInitData () {
      return this.$store.getters.loadingInitData
    },
    headersDsTauAll () {
      var vm = this
      console.log(vm.code)
      switch (vm.code) {
        case 'DanhSachTauBien': {
          return support.headersDsTauBien
        }
        case 'DanhSachPhuongTienThuyNoiDia': {
          return support.headersDsThuyNoiDia
        }
        case 'DanhSachTauRoiCang': {
          return support.headersTauRoiCang
        }
        case 'DanhSachTauDenCang': {
          return support.headersTauDenCang
        }
        case 'DanhSachTauDiChuyen': {
          return support.headersKHTauDiChuyen
        }
        case 'DanhSachNeoTau': {
          return support.headersNeoTau
        }
        case 'DanhSachTauLaiHoTro': {
          return support.headerTauLaiHoTro
        }
        case 'DanhSachHoaTieuDanTau': {
          return support.headersHoaTieuDanTau
        }
        case 'DanhSachXepDoHang': {
          return support.headersXepDoHang
        }
        case 'DanhSachNhapTachDoan': {
          return support.headersKHTauDiChuyen
        }
        case 'DanhSachSuaChuaTau': {
          return support.headersDsSuaChuaTau
        }
        case 'DanhSachHaXuong': {
          return support.headersDsHaXuong
        }
        case 'DanhSachThuTau': {
          return support.headersKHTauDiChuyen
        }
        case 'DanhSachDuTau': {
          return support.headersDsDuTau
        }
        case 'DanhSachGhiChuCanhBao': {
          return support.headersDsGhiChu
        }
        case 'DanhSachKhangNghiHangHai': {
          return support.headersDsKhangNghi
        }
        default: {
          return support.headersDsKeHoachChuyenTuyen
        }
      }
    }
  },
  created () {
    var vm = this
    let query = vm.$router.history.current.query
    if (query.hasOwnProperty('page') && query['page'] !== 1) {
      vm.pageDataTableAll = parseInt(query['page']) ? parseInt(query['page']) : 1
    } else {
      vm.pageDataTableAll = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      start: vm.pageDataTableAll * 15 - 15,
      end: vm.pageDataTableAll * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.changeUrlGetList().then(function (result) {
      param['url'] = vm.urlDanhSach
      console.log('vm.urlDanhSach+++++++++++++++', vm.urlDanhSach)
      vm.loadDataTable(param)
    })
  },
  mounted () {
    var vm = this
    vm.loadDataOther()
  },
  watch: {
    // adv: {
    //   handler (val) {
    //     var vm = this
    //     vm.searchAdvTable()
    //   },
    //   deep: true
    // },
    dateSearchTopTauAll (val) {
      this.searchTopTauAll = this.parseDate(val)
    },
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('page')) {
        vm.pageDataTableAll = parseInt(query['page']) ? parseInt(query['page']) : 1
      } else {
        vm.pageDataTableAll = 1
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        start: vm.pageDataTableAll * 15 - 15,
        end: vm.pageDataTableAll * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.changeUrlGetList().then(function (result) {
        param['url'] = vm.urlDanhSach
        console.log('vm.urlDanhSach+++++++++++++++', vm.urlDanhSach)
        vm.loadDataTable(param)
        vm.loadDataOther()
      })
    }
  },
  methods: {
    themMoi () {
      var vm = this
      if (vm.documentName && vm.documentName !== '0') {
        vm.$router.push({
          path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/' + vm.code + '/0'
        })
      } else {
        vm.$router.push({
          path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/0/' + vm.code + '/detail'
        })
      }
    },
    loadDataOther () {
      var vm = this
      vm.headersDsTauAll.forEach(function (item, index) {
        if (item['type'] === 'select') {
          if (item.id === 'shipTypeCode') {
            vm.loadShipType()
          } else if (item.id === 'flagStateOfShip') {
            vm.loadFlagStateOfShip()
          } else if (item.id === 'thang') {
            vm.itemsSup['thangItems'] = support.thangItems
          } else if (item.id === 'khongGiaiQuyetRoiCang') {
            vm.itemsSup['khongGiaiQuyetRoiCangItems'] = [{
              itemText: 'Tạm dừng',
              itemValue: 1
            }, {
              itemText: 'Không yêu cầu',
              itemValue: 0
            }]
          } else if (item.id === 'coHienThiCanhBao') {
            vm.itemsSup['coHienThiCanhBaoItems'] = [{
              itemText: 'Có',
              itemValue: 1
            }, {
              itemText: 'Không',
              itemValue: 0
            }]
          }
        }
      })
    },
    changeDate: function (data) {
      var vm = this
      vm.searchAdvTable()
    },
    changeUrlGetList: function (val) {
      var vm = this
      return new Promise(function (resolve, reject) {
        vm.loadingInitData.then(function (result) {
          switch (vm.code) {
            case 'DanhSachViTriNeoDauTaiCang': {
              vm.urlDanhSach = result['getVmaScheduleAnchorage_Port_URL']
              break
            }
            case 'DanhSachTauBien': {
              vm.urlDanhSach = result['getVmaShip_Ship_URL']
              break
            }
            case 'DanhSachPhuongTienThuyNoiDia': {
              vm.urlDanhSach = result['getVmaShip_Boat_URL']
              break
            }
            case 'DanhSachTauRoiCang': {
              vm.urlDanhSach = result['getVmaItinerarySchedule_Leave_URL']
              break
            }
            case 'DanhSachTauDenCang': {
              vm.urlDanhSach = result['getVmaItinerarySchedule_Come_URL']
              break
            }
            case 'DanhSachTauDiChuyen': {
              vm.urlDanhSach = result['getVmaScheduleShiftingURL']
              break
            }
            case 'DanhSachNeoTau': {
              vm.urlDanhSach = result['getVmaScheduleAnchorage_Ship_URL']
              break
            }
            case 'DanhSachTauLaiHoTro': {
              vm.urlDanhSach = result['getVmaScheduleTugboatURL']
              break
            }
            case 'DanhSachHoaTieuDanTau': {
              vm.urlDanhSach = result['getVmaSchedulePilotURL']
              break
            }
            case 'DanhSachXepDoHang': {
              vm.urlDanhSach = result['getDanhSachXepDoHang']
              break
            }
            case 'DanhSachNhapTachDoan': {
              vm.urlDanhSach = result['getVmaScheduleMergingURL']
              break
            }
            case 'DanhSachSuaChuaTau': {
              vm.urlDanhSach = result['getVmaScheduleShipyardURL']
              break
            }
            case 'DanhSachHaXuong': {
              vm.urlDanhSach = result['getVmaScheduleLaunchingURL']
              break
            }
            case 'DanhSachThuTau': {
              vm.urlDanhSach = result['getVmaScheduleTestingURL']
              break
            }
            case 'DanhSachDuTau': {
              vm.urlDanhSach = result['getVmaScheduleSecurityURL']
              break
            }
            case 'DanhSachGhiChuCanhBao': {
              vm.urlDanhSach = result['getVmaItineraryRemarksURL']
              break
            }
            case 'DanhSachKhangNghiHangHai': {
              vm.urlDanhSach = result['getDanhSachKhangNghiHangHai']
              break
            }
            default: {
              vm.urlDanhSach = result['getVmaScheduleXlineURL']
            }
          }
          resolve(true)
        }).catch(function (xhr) {
          reject(false)
        })
      })
    },
    loadDataTable: function (param) {
      var vm = this
      console.log('vm.code++++++++++', vm.code)
      if (vm.code === 'DanhSachTauBien') {
        param['shipBoat'] = 'SHIP'
      }
      if (vm.code === 'DanhSachPhuongTienThuyNoiDia') {
        param['shipBoat'] = 'BOAT'
      }
      if (vm.code === 'DanhSachTauDenCang') {
        param['shipBoat'] = 'SHIP'
        param['shipPosition'] = 1
      }
      if (vm.code === 'DanhSachTauRoiCang') {
        param['shipBoat'] = 'SHIP'
        param['shipPosition'] = 2
      }
      if (vm.documentName && vm.documentName !== '0') {
        param['itineraryNo'] = ''
      }
      if (vm.code === 'DanhSachTauLaiHoTro') {
        param['noticeShipType'] = vm.noticeShipType ? vm.noticeShipType : 4
      }
      vm.loadingTableAlll = true
      console.log('param++++++++++++', param)
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsTauAll = result.data
        vm.totalDsAll = result.total
        vm.loading = false
        vm.loadingTableAlll = false
      })
    },
    loadFlagStateOfShip: function () {
      var vm = this
      let param = {
        categoryId: 'DM_STATE'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.flagStateOfShipItems = result
        if (Array.isArray(result)) {
          result = result.map(item => {
            return {
              itemText: item.stateName,
              itemValue: item.stateCode
            }
          })
          vm.itemsSup['quocTichItems'] = result
        } else {
          vm.itemsSup['quocTichItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadShipType: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SHIP_TYPE',
        applyShip: 1
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          result = result.map(item => {
            return {
              itemText: item.shipTypeNameVN,
              itemValue: item.shipTypeCode
            }
          })
          vm.itemsSup['shipTypeItems'] = result
        } else {
          vm.itemsSup['shipTypeItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadDonVi: function () {
      var vm = this
      let param = {
        categoryId: 'DM_REPRESENTATIVE'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['representativeItems'] = result.map(item => {
            return {
              itemText: item['repNameVN'],
              itemValue: item['repCode']
            }
          })
        } else {
          vm.itemsSup['representativeItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadsecurityLevel: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SECURITY_LEVEL'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['securityLevelItems'] = result.map(item => {
            return {
              itemText: item['securityLevelName'],
              itemValue: item['securityLevelCode']
            }
          })
        } else {
          vm.itemsSup['securityLevelItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadPortWharf: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PORT_WHARF'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['portWharfItems'] = result.map(item => {
            return {
              itemText: item['portWharfNameVN'],
              itemValue: item['portWharfCode']
            }
          })
        } else {
          vm.itemsSup['portWharfItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadShipAgency: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SHIP_AGENCY'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['shipAgencyItems'] = result.map(item => {
            return {
              itemText: item['shipAgencyNameVN'],
              itemValue: item['shipAgencyCode']
            }
          })
        } else {
          vm.itemsSup['shipAgencyItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadPortHarbour: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PORT_HARBOUR'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['portHarbourItems'] = result.map(item => {
            return {
              itemText: item['portHarbourNameVN'],
              itemValue: item['portHarbourCode']
            }
          })
        } else {
          vm.itemsSup['portHarbourItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadPurpose: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PURPOSE'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['purposeItems'] = result.map(item => {
            return {
              itemText: item['purposeName'],
              itemValue: item['purposeCode']
            }
          })
        } else {
          vm.itemsSup['purposeItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadCargo: function () {
      var vm = this
      let param = {
        categoryId: 'DM_CARGO_ON_BOARD'
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (Array.isArray(result)) {
          vm.itemsSup['cargoItems'] = result.map(item => {
            return {
              itemText: item['goodsTypeNameVN'],
              itemValue: item['goodsTypeCode']
            }
          })
        } else {
          vm.itemsSup['cargoItems'] = []
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    searchAdvTable () {
      var vm = this
      let current = vm.$router.history.current
      let newQuery = current.query
      if (!newQuery) {
        newQuery = {}
      }
      for (var key in newQuery) {
        if (vm.adv.hasOwnProperty(key)) {
          delete newQuery[key]
        }
      }
      console.log('newQuery+++++++++', newQuery)
      console.log('newQuery+++++++++', vm.adv)
      vm.$router.push({
        path: current.path,
        query: {
          ...newQuery,
          ...vm.adv
        }
      })
    },
    parseDate (date) {
      if (!date) return null
      console.log(date.split('-'))
      const [year, month, day] = date.split('-')
      return `${day.padStart(2, '0')}/${month.padStart(2, '0')}/${year}`
    },
    paggingData (config) {
      let vm = this
      let current = vm.$router.history.current
      let newQuery = current.query
      let queryString = '?'
      newQuery['page'] = ''
      for (let key in newQuery) {
        if (newQuery[key] !== '' && newQuery[key] !== 'undefined' && newQuery[key] !== undefined) {
          queryString += key + '=' + newQuery[key] + '&'
        }
      }
      queryString += 'page=' + config.page
      vm.$router.push({
        path: current.path + queryString
      })
    },
    themMoiSuDungTauLai () {
      var vm = this
      vm.$router.push({
        path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/DanhSachTauLaiHoTro/0'
      })
    },
    themMoiSuDungHoaTieu () {
      var vm = this
      vm.$router.push({
        path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/DanhSachHoaTieuDanTau/0'
      })
    },
    toDetailTauBien (item) {
      var vm = this
      var id = 0
      if (vm.code === 'DanhSachTauDenCang' || vm.code === 'DanhSachTauRoiCang') {
        id = item['vmaItineraryScheduleId']
      } else if (vm.code === 'DanhSachTauLaiHoTro') {
        id = item['vmaScheduleTugboatId']
      } else if (vm.code === 'DanhSachHoaTieuDanTau') {
        id = item['vmaSchedulePilotId']
      } else if (vm.code === 'DanhSachSuaChuaTau') {
        id = item['vmaScheduleShipyardId']
      } else if (vm.code === 'DanhSachNhapTachDoan') {
        id = item['vmaScheduleMergingId']
      } else if (vm.code === 'DanhSachHaXuong') {
        id = item['vmaScheduleLaunchingId']
      } else if (vm.code === 'DanhSachThuTau') {
        id = item['vmaScheduleTestingId']
      } else if (vm.code === 'DanhSachDuTau') {
        id = item['vmaScheduleSecurityId']
      } else if (vm.code === 'DanhSachGhiChuCanhBao') {
        id = item['vmaItineraryRemarksId']
      } else if (vm.code === 'DanhSachTauBien' || vm.code === 'DanhSachPhuongTienThuyNoiDia') {
        id = item['vmaShipId']
      }
      console.log('id-----tau+++++++++++++++', id)
      if (vm.documentName && vm.documentName !== '0') {
        vm.$router.push({
          path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/' + vm.code + '/' + id
        })
      } else {
        vm.$router.push({
          path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + id + '/' + vm.code + '/detail'
        })
      }
    },
    refreshSearch () {
      var vm = this
      for (var key in vm.adv) {
        vm.adv[key] = ''
      }
      vm.searchAdvTable()
    }
  },
  filters: {
  }
}
</script>
<style>
  /*@import '../../../node_modules/@syncfusion/ej2-base/styles/material.css'*/
  @import "../../../node_modules/@syncfusion/ej2-vue-grids/styles/material.css"
</style>
