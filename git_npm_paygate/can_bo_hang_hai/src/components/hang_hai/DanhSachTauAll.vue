<template>
    <div>
      <content-placeholders v-if="loading">
        <content-placeholders-img />
        <content-placeholders-heading />
      </content-placeholders>
      <div v-else style="max-width: 1220px;">
        <div style="display: flex; background-color: #fff;">
          <div class="search-top">
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
             <v-btn flat small class="mx-0" @click="refreshSearch()" style="text-transform: none;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
             <span>|</span>
             <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
          </div>
        </div>
        <!-- <v-data-table
          :headers="headersDsTauAll"
          :items="itemsDsTauAll"
          class="table-bordered danhSachHoSoTable__class table-tau-bien"
          hide-actions
          :no-data-text="'Không tìm thấy kế hoạch nào'"
          :no-results-text="'Không tìm thấy kế hoạch nào'"
          style="max-width: 1095px;"
        >
          <template slot="headers" slot-scope="props">
            <tr style="background: #eaeaea;">
              <th
                v-for="header in props.headers"
                :key="header.text"
                v-html="header.text"
              >
              </th>
            </tr>
            <tr class="" style="border-bottom: 1px solid #ccc;">
              <th>
              </th>
              <th v-for="(item, index) in headersDsTauAll" v-if="item.id !== 'stt'">
                <v-text-field
                  v-if="item['type'] === 'text'"
                  v-model="adv[item.id]"
                  class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
                <v-select
                  v-else-if="item['type'] === 'select'"
                  item-text="itemText"
                  item-value="itemValue"
                  :items="itemsSup[item.items]"
                  v-model="adv[item.id]"
                  class="px-0 py-0 mx-0 my-0"
                ></v-select>
                <datetime-picker
                  v-else
                  v-model="adv[item.id]"
                  :first-day="1"
                  :show-dst="false"
                  :show-hours="false"
                  :show-minutes="false"
                  :show-seconds="false"
                  class="px-0 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
              {{ pageDataTableAll * 15 - 15 + props.index + 1 }}
            </td>
            <td class="text-xs-center" v-for="key in props.item" style="padding-top: 5px;">
              {{props.item[key]}}
            </td>
          </template>
        </v-data-table> -->

        <vue-scrolling-table
          class="ml-2"
          :scroll-horizontal="scrollHorizontal"
          :scroll-vertical="scrollVertical"
          :sync-header-scroll="syncHeaderScroll"
          :sync-footer-scroll="syncFooterScroll"
          :include-footer="includeFooter"
          :dead-area-color="deadAreaColor"
          :class="{ freezeFirstColumn: freezeFirstColumn }"
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

            <tr>
              <th :style="headersDsTauAll[0]['style']">
              </th>
              <th v-for="(item, index) in headersDsTauAll" v-if="item.id !== 'stt'">
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
                  @keyup.enter="searchAdvTable()"
                  class="px-1 py-0 mx-0 my-0"
                ></v-select>
                <datetime-picker
                  v-else
                  v-model="adv[item.id]"
                  :first-day="1"
                  :show-dst="false"
                  :show-hours="false"
                  :show-minutes="false"
                  :show-seconds="false"
                  @change="searchAdvTable()"
                  class="px-1 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
            </tr>
          </template>
          <template slot="tbody">
            <tr v-for="(item, index) in itemsDsTauAll" :key="item.id">
              <td class="text-xs-center" style="padding-top: 5px; width: 2%;" :style="headersDsTauAll[0]['style']">
                {{ pageDataTableAll * 15 - 15 + index + 1 }}
              </td>
              <td v-if="key !== 'id'" class="text-xs-center" v-for="(value, key) in item" style="padding-top: 5px;">
                {{value}}
              </td>
            </tr>
          </template>
        </vue-scrolling-table>

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
import TinyPagination from './hanghai_pagination.vue'
import DatetimePicker from './DatetimePicker.vue'
import support from '@/store/support.json'
import VueScrollingTable from 'vue-scrolling-table'
export default {
  props: ['code', 'type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker,
    'vue-scrolling-table': VueScrollingTable
  },
  data: () => ({
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
    itemsDsTauAll: [
      {
        id: 1,
        tenPtDSTND: 'tenPtDSTND',
        loaiTauDSTND: 'loaiTauDSTND',
        tauKeoDSTND: 'tauKeoDSTND',
        gtDSTND: 'gtDSTND',
        dwtDSTND: 'dwtDSTND',
        soNgToiDaDSTND: 'soNgToiDaDSTND',
        loaDSTND: 'loaDSTND',
        soBangDSTND: 'soBangDSTND',
        breadthDSTND: 'breadthDSTND',
        soBangNtDSTND: 'soBangNtDSTND',
        capPtDSTND: 'ascbcbcb',
        congSuatMayDSTND: 'congSuatMayDSTND',
        chuTauDSTND: 'chuTauDSTND',
        diaChiDSTND: 'diaChiDSTND',
        thuyenTruongDSTND: 'thuyenTruongDSTND',
        hangBangDSTND: 'hangBangDSTND',
        mayTruongDSTND: 'mayTruongDSTND',
        hangBangMtDSTND: 'hangBangMtDSTND'
      },
      {
        id: 2,
        tenPtDSTND: 'tenPtDSTND',
        loaiTauDSTND: 'loaiTauDSTND',
        tauKeoDSTND: 'tauKeoDSTND',
        gtDSTND: 'gtDSTND',
        dwtDSTND: 'dwtDSTND',
        soNgToiDaDSTND: 'soNgToiDaDSTND',
        loaDSTND: 'loaDSTND',
        soBangDSTND: 'soBangDSTND',
        breadthDSTND: 'breadthDSTND',
        soBangNtDSTND: 'soBangNtDSTND',
        capPtDSTND: 'ascbcbcb',
        congSuatMayDSTND: 'congSuatMayDSTND',
        chuTauDSTND: 'chuTauDSTND',
        diaChiDSTND: 'diaChiDSTND',
        thuyenTruongDSTND: 'thuyenTruongDSTND',
        hangBangDSTND: 'hangBangDSTND',
        mayTruongDSTND: 'mayTruongDSTND',
        hangBangMtDSTND: 'hangBangMtDSTND'
      },
      {
        id: 3,
        tenPtDSTND: 'tenPtDSTND',
        loaiTauDSTND: 'loaiTauDSTND',
        tauKeoDSTND: 'tauKeoDSTND',
        gtDSTND: 'gtDSTND',
        dwtDSTND: 'dwtDSTND',
        soNgToiDaDSTND: 'soNgToiDaDSTND',
        loaDSTND: 'loaDSTND',
        soBangDSTND: 'soBangDSTND',
        breadthDSTND: 'breadthDSTND',
        soBangNtDSTND: 'soBangNtDSTND',
        capPtDSTND: 'ascbcbcb',
        congSuatMayDSTND: 'congSuatMayDSTND',
        chuTauDSTND: 'chuTauDSTND',
        diaChiDSTND: 'diaChiDSTND',
        thuyenTruongDSTND: 'thuyenTruongDSTND',
        hangBangDSTND: 'hangBangDSTND',
        mayTruongDSTND: 'mayTruongDSTND',
        hangBangMtDSTND: 'hangBangMtDSTND'
      },
      {
        id: 4,
        tenPtDSTND: 'tenPtDSTND',
        loaiTauDSTND: 'loaiTauDSTND',
        tauKeoDSTND: 'tauKeoDSTND',
        gtDSTND: 'gtDSTND',
        dwtDSTND: 'dwtDSTND',
        soNgToiDaDSTND: 'soNgToiDaDSTND',
        loaDSTND: 'loaDSTND',
        soBangDSTND: 'soBangDSTND',
        breadthDSTND: 'breadthDSTND',
        soBangNtDSTND: 'soBangNtDSTND',
        capPtDSTND: 'ascbcbcb',
        congSuatMayDSTND: 'congSuatMayDSTND',
        chuTauDSTND: 'chuTauDSTND',
        diaChiDSTND: 'diaChiDSTND',
        thuyenTruongDSTND: 'thuyenTruongDSTND',
        hangBangDSTND: 'hangBangDSTND',
        mayTruongDSTND: 'mayTruongDSTND',
        hangBangMtDSTND: 'hangBangMtDSTND'
      }
    ],
    totalDsAll: 0,
    pageDataTableAll: 1,
    menuTopTauAll: false,
    searchTopTauAll: '',
    dateSearchTopTauAll: ''
  }),
  computed: {
    loading () {
      return this.$store.getters.loading
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
        case 'headersTauRoiCang': {
          return support.headersDsTauBien
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
      vm.pageDataTableAll = query['page']
    } else {
      vm.pageDataTableAll = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.pageDataTableAll * 15 - 15,
      end: vm.pageDataTableAll * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsDsTauAll = result.data
      vm.totalDsAll = result.total
      vm.loading = false
    })
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
        vm.pageDataTableAll = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.pageDataTableAll * 15 - 15,
        end: vm.pageDataTableAll * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsTauAll = result.data
        vm.totalDsAll = result.total
        vm.loading = false
      })
    }
  },
  methods: {
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
