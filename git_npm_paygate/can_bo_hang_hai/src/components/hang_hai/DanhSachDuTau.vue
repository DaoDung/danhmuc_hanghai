<template>
    <div>
      <content-placeholders v-if="loading">
        <content-placeholders-img />
        <content-placeholders-heading />
      </content-placeholders>
      <div v-else>
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
             <v-btn flat small class="mx-0" @click="refreshSearch()" style="text-transform: none;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
             <span>|</span>
             <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
          </div>
        </div>
        <v-data-table
          :headers="headersDsDuTau"
          :items="itemsDsDuTau"
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
              <th>
                <v-text-field
                v-model="adv.tenTauDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <datetime-picker
                v-model="adv.thoiGianDenDSDT"
                :first-day="1"
                :show-dst="false"
                :show-hours="false"
                :show-minutes="false"
                :show-seconds="false"
                class="px-0 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
              <th>
                <datetime-picker
                v-model="adv.thoiGianDiDSDT"
                :first-day="1"
                :show-dst="false"
                :show-hours="false"
                :show-minutes="false"
                :show-seconds="false"
                class="px-0 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
              <th>
                <datetime-picker
                v-model="adv.ngayBatDuDSDT"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-0 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
              <th>
                <datetime-picker
                v-model="adv.ngayGiaiToaDSDT"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-0 py-0 mx-0 my-0"
                ></datetime-picker>
              </th>
              <th>
                <v-text-field
                v-model="adv.lyDoBatDuDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <v-text-field
                v-model="adv.coQuanRaQuyetDinhBatDuDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <v-text-field
                v-model="adv.diaDiemBatDuDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <v-text-field
                v-model="adv.coQuanRaQuyetDinhGiaiToaDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <v-text-field
                v-model="adv.sqdBatDuDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
              <th>
                <v-text-field
                v-model="adv.sqdGiaiToaDSDT"
                class="px-0 py-0 mx-0 my-0"
                ></v-text-field>
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
              {{ loadDataTablePageDSTND * 15 - 15 + props.index + 1 }}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.tenTauDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianDenDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianDiDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.ngayBatDuDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.ngayGiaiToaDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.lyDoBatDuDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">        
              {{props.item.coQuanRaQuyetDinhBatDuDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.diaDiemBatDuDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
              {{props.item.coQuanRaQuyetDinhGiaiToaDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
              {{props.item.sqdBatDuDSDT}}
            </td>
            <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.sqdGiaiToaDSDT}}
            </td>
          </template>
        </v-data-table>
        <div class="text-xs-right layout wrap" style="position: relative;">
          <div class="flex pagging-table px-2"> 
            <tiny-pagination :total="totalDsDuTau" :page="loadDataTablePageDSDT" custom-class="custom-tiny-class" 
              @tiny:change-page="paggingData" ></tiny-pagination> 
          </div>
        </div>
      </div>
    </div>
</template>
<script>
// import router from '@/router'
// import Vue from 'vue/dist/vue.min.js'
import TinyPagination from './hanghai_pagination.vue'
// import toastr from 'toastr'
import DatetimePicker from './DatetimePicker.vue'
// import VueCtkDateTimePicker from 'vue-ctk-date-time-picker'
// import 'vue-ctk-date-time-picker/dist/vue-ctk-date-time-picker.css'
// Vue.component('vue-ctk-date-time-picker', VueCtkDateTimePicker)
export default {
  props: ['type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker
  },
  data: () => ({
    adv: {
      tenTauDSDT
      thoiGianDenDSDT: '',
      thoiGianDiDSDT: '',
      ngayBatDuDSDT: '',
      ngayGiaiToaDSDT: '',
      lyDoBatDuDSDT: '',
      coQuanRaQuyetDinhBatDuDSDT: '',
      diaDiemBatDuDSDT: '',
      coQuanRaQuyetDinhGiaiToaDSDT: '',
      sqdBatDuDSDT: '',
      sqdGiaiToaDSDT: ''
    },
    headersDsDuTau: [
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
        'text': 'Ngày bắt giữ',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Ngày giải tỏa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Lý do bắt giữ',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Cơ quan ra quyết định <br> bắt giữ',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Cơ quan ra quyết định <br> giải tỏa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'SQĐ bắt giữ',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'SQĐ giải tỏa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsDsDuTau: [
    ],
    loadDataTablePageDSDT: 1,
    totalDsDuTau: 0
  }),
  computed: {
    loading () {
      return this.$store.getters.loading
    }
  },
  created () {
    var vm = this
    let query = vm.$router.history.current.query
    if (query.hasOwnProperty('page') && query['page'] !== 1) {
      vm.loadDataTablePageDSDT = query['page']
    } else {
      vm.loadDataTablePageDSDT = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageDSDT * 15 - 15,
      end: vm.loadDataTablePageDSDT * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsDsDuTau = result.data
      vm.totalDsDuTau = result.total
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
        vm.loadDataTablePageDSDT = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageDSDT * 15 - 15,
        end: vm.loadDataTablePageDSDT * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsDuTau = result.data
        vm.totalDsDuTau = result.total
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
    refreshSearch () {
      var vm = this
      vm.adv = {
        tenPtDSTND: '',
        loaiTauDSTND: '',
        tauKeoDSTND: '',
        gtDSTND: '',
        dwtDSTND: '',
        soNgToiDaDSTND: '',
        loaDSTND: '',
        soBangDSTND: '',
        breadthDSTND: '',
        soBangNtDSTND: '',
        capPtDSTND: '',
        congSuatMayDSTND: '',
        chuTauDSTND: '',
        diaChiDSTND: '',
        thuyenTruongDSTND: '',
        hangBangDSTND: '',
        mayTruongDSTND: '',
        hangBangMtDSTND: ''
      }
    }
  },
  filters: {
  }
}
</script>
