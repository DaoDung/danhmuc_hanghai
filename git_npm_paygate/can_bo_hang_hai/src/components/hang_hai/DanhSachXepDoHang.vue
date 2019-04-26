<template>
    <div>
        <div style="display: flex; background-color: #fff;">
          <div class="search-top">
            <span style="margin: 0 10px;">
              Ngày: 
            </span>
            <v-menu
              ref="menuTopNeoTau"
              :close-on-content-click="false"
              v-model="menuTopNeoTau"
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
                v-model="searchTopNeoTau"
                persistent-hint
                class="pb-0 my-0"
              ></v-text-field>
              <v-date-picker v-model="dateSearchTopNeoTau" no-title @input="menuTopNeoTau = false"></v-date-picker>
            </v-menu>
            <v-icon size="17" style="margin-left: 10px; cursor: pointer;" @click="menuTopNeoTau = !menuTopNeoTau">date_range</v-icon>
          </div>
          <div class="search-top-right">
             <v-btn flat small class="mx-0"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
             <span>|</span>
             <v-btn flat small class="mx-0"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
          </div>
        </div>
        <v-data-table
        :headers="headersXepDoHang"
        :items="itemsXepDoHang"
        class="table-bordered danhSachHoSoTable__class pb-4"
        hide-actions
        :no-data-text="'Không tìm thấy kế hoạch nào'"
        :no-results-text="'Không tìm thấy kế hoạch nào'"
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
            <th>
              <v-text-field
              v-model="adv.tenTau4"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <datetime-picker
              v-model="adv.thoiGianDen"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianDen" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
            <th>
              <datetime-picker
              v-model="adv.thoiGianDi"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianDi" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
            </th>
            <th>
              <datetime-picker
              v-model="adv.thoiGianLamHang"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianLamHang" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
            </th>
            <th>
              <v-text-field
              v-model="adv.htHangHoaQuaCanh"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.benCangLamHang"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.viTriLamHang"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.hangHoa"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soContainer"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soTEU"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soTEURong"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soTan"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-select
                class="px-0 py-0 mx-0 my-0"
                :items="coHangNguyHiemItems"
                v-model="adv.coHangNguyHiem"
                item-text="itemText"
                item-value="itemValue"
              ></v-select>
            </th>
            <th>
              <v-text-field
              v-model="adv.ghiChu"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageXepDoHang * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.tenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianDen}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianDi}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianLamHang}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.htHangHoaQuaCang}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.benCangLamHang}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.viTriLamHang}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.hangHoa}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.soContainer}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.soTEU}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.soTEURong}}</td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.soTan}}</td>
          <td class="text-xs-center" style="padding-top: 5px !important;">
            <!-- <v-checkbox  v-model="props.item.coHangNguyHiem" disabled></v-checkbox> -->
            <input type="checkbox" disabled v-model="props.item.coHangNguyHiem" name="">
          </td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.ghiChu}}</td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsXepDoHang" :page="loadDataTablePageXepDoHang" custom-class="custom-tiny-class" 
            @tiny:change-page="paggingData" ></tiny-pagination> 
        </div>
      </div>
    </div>
</template>
<script>
// import router from '@/router'
// import Vue from 'vue/dist/vue.min.js'
import TinyPagination from './hanghai_pagination.vue'
// import toastr from 'toastr'
// import VueCtkDateTimePicker from 'vue-ctk-date-time-picker'
// import 'vue-ctk-date-time-picker/dist/vue-ctk-date-time-picker.css'
// Vue.component('vue-ctk-date-time-picker', VueCtkDateTimePicker)
import DatetimePicker from './DatetimePicker.vue'
export default {
  props: ['index'],
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker
  },
  data: () => ({
    headersXepDoHang: [
      {
        'text': 'STT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tên tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian đến',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian đi',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian <br> làm hàng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Hình thức H.H <br> qua cảng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Bến cảng <br> làm hàng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Vị trí làm hàng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Hàng hóa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số Container',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số TEU',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số TEU rỗng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số tấn',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Có hàng <br> nguy hiểm',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Ghi chú',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsXepDoHang: [
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      },
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      },
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      },
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      },
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      },
      {
        tenTau: 'HO TAY',
        thoiGianDen: '05/10/2015 09:22',
        thoiGianDi: '07/10/2015 06:00',
        thoiGianLamHang: '05/10/2015 14:41',
        htHangHoaQuaCang: 'NHAP KHAU',
        benCangLamHang: 'BẾN CẢNG HẠ LƯU PTSC',
        viTriLamHang: 'HL PTSC-4',
        hangHoa: 'CONTAINER',
        soContainer: '11',
        soTEU: '11',
        soTEURong: '',
        soTan: '223',
        coHangNguyHiem: false,
        ghiChu: 'Từ KH'
      }
    ],
    loadDataTablePageXepDoHang: 1,
    totalDsXepDoHang: 0,
    adv: {
      tenTau4: '',
      thoiGianDen: '',
      thoiGianDi: '',
      thoiGianLamHang: '',
      htHangHoaQuaCanh: '',
      benCangLamHang: '',
      viTriLamHang: '',
      hangHoa: '',
      soContainer: '',
      soTEU: '',
      soTEURong: '',
      soTan: '',
      coHangNguyHiem: '',
      ghiChu: ''
    },
    coHangNguyHiemItems: [
      {
        itemText: 'Có',
        itemValue: true
      },
      {
        itemText: 'Không',
        itemValue: false
      }
    ]
  }),
  computed: {
    loading () {
      return this.$store.getters.loading
    }
  },
  mounted () {
  },
  created () {
    var vm = this
    let query = vm.$router.history.current.query
    if (query.hasOwnProperty('page') && query['page'] !== 1) {
      vm.loadDataTablePageXepDoHang = query['page']
    } else {
      vm.loadDataTablePageXepDoHang = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageXepDoHang * 15 - 15,
      end: vm.loadDataTablePageXepDoHang * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsHoaTieuDanTau = result.data
      vm.totalDsHoaTieuDanTau = result.total
      vm.loading = false
    })
  },
  watch: {
    adv: {
      handler (val) {
        var vm = this
        vm.searchAdvTable()
      },
      deep: true
    },
    dateSearchTopNeoTau (val) {
      this.searchTopNeoTau = this.parseDate(val)
    },
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('page')) {
        vm.loadDataTablePageXepDoHang = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageXepDoHang * 15 - 15,
        end: vm.loadDataTablePageXepDoHang * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsTauRoiCang = result.data
        vm.totalDsTauRoiCang = result.total
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
    parseDate (date) {
      if (!date) return null
      console.log(date.split('-'))
      const [year, month, day] = date.split('-')
      return `${day.padStart(2, '0')}/${month.padStart(2, '0')}/${year}`
    },
    refreshSearch () {
      var vm = this
      vm.adv = {
        tenTau4: '',
        thoiGianDen: '',
        thoiGianDi: '',
        thoiGianLamHang: '',
        htHangHoaQuaCanh: '',
        benCangLamHang: '',
        viTriLamHang: '',
        hangHoa: '',
        soContainer: '',
        soTEU: '',
        soTEURong: '',
        soTan: '',
        coHangNguyHiem: '',
        ghiChu: ''
      }
    }
  },
  filters: {
  }
}
</script>
