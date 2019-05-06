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
           <v-btn flat small class="mx-0" @click="refreshSearch()" style="text-transform: none;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
           <span>|</span>
           <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
        </div>
      </div>
      <v-data-table
        :headers="headersHoaTieuDanTau"
        :items="itemsHoaTieuDanTau"
        class="table-bordered danhSachHoSoTable__class table-tau-bien"
        hide-actions
        style="max-width: 1095px;"
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
              v-model="adv.tau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.luot"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.hoaTieu"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.unknow"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.benCangLenTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.viTriLenTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.benCangRoiTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.viTriRoiTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <datetime-picker
              v-model="adv.thoiGianLenTau"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianLenTau" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
            </th>
            <th>
              <datetime-picker
              v-model="adv.thoiGianRoiTau"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianRoiTau" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageHoaTieu * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.luot}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.hoaTieu}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.unknow}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.benCangLenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.viTriLenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.benCangRoiTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.viTriRoiTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianLenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianRoiTau}}
          </td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsHoaTieuDanTau" :page="loadDataTablePageHoaTieu" custom-class="custom-tiny-class" 
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
      tau: '',
      luot: '',
      hoaTieu: '',
      unknow: '',
      benCangLenTau: '',
      viTriLenTau: '',
      benCangRoiTau: '',
      thoiGianLenTau: '',
      thoiGianRoiTau: ''
    },
    headersHoaTieuDanTau: [
      {
        'text': 'STT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Lượt',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Hoa tiêu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': '',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Bến cảng <br> lên tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Vị trí <br> lên tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Bến cảng <br> rời tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Vị trí <br> rời tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian <br> lên tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian <br> rời tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsHoaTieuDanTau: [
      {
        tau: 'HO TAY 1',
        luot: 'Di chuyển',
        hoaTieu: 'Bùi Đức Thắng',
        unknow: 'Ngoại hạng',
        benCangLenTau: 'Bến cảng hạ lưu PTSC',
        viTriLenTau: 'HL PTSC-1',
        benCangRoiTau: 'Bến cảng VIETSOVPE',
        viTriRoiTau: 'VSPT-1',
        thoiGianLenTau: '06/10/2018 18:00',
        thoiGianRoiTau: '08/10/2018 17:00'
      },
      {
        tau: 'STAR GEOGIA',
        luot: 'Lượt đến',
        hoaTieu: 'Bùi Đức Thắng',
        unknow: 'Ngoại hạng',
        benCangLenTau: 'Bến cảng hạ lưu PTSC',
        viTriLenTau: 'HL PTSC-1',
        benCangRoiTau: 'Bến cảng SERECE',
        viTriRoiTau: 'VSPT-1',
        thoiGianLenTau: '07/11/2018 13:00',
        thoiGianRoiTau: '09/11/2018 17:00'
      },
      {
        tau: 'HO TAY',
        luot: 'Lượt đến',
        hoaTieu: 'Bùi Đức Thắng',
        unknow: 'Ngoại hạng',
        benCangLenTau: 'Khu chuyền tải Gành Rái',
        viTriLenTau: 'B14',
        benCangRoiTau: 'Bến cảng VIETSOVPE',
        viTriRoiTau: 'B14',
        thoiGianLenTau: '09/11/2018 16:00',
        thoiGianRoiTau: '11/11/2018 15:00'
      }
    ],
    loadDataTablePageHoaTieu: 1,
    totalDsHoaTieuDanTau: 0
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
      vm.loadDataTablePageHoaTieu = query['page']
    } else {
      vm.loadDataTablePageHoaTieu = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageHoaTieu * 15 - 15,
      end: vm.loadDataTablePageHoaTieu * 15
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
        vm.loadDataTablePageHoaTieu = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageHoaTieu * 15 - 15,
        end: vm.loadDataTablePageHoaTieu * 15
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
        tau: '',
        luot: '',
        hoaTieu: '',
        unknow: '',
        benCangLenTau: '',
        viTriLenTau: '',
        benCangRoiTau: '',
        thoiGianLenTau: '',
        thoiGianRoiTau: ''
      }
    }
  },
  filters: {
  }
}
</script>
