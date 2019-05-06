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
           <v-btn flat small class="mx-0" @click="themMoi()"> <v-icon size="17">add</v-icon> Thêm mới</v-btn>
           <span>|</span>
           <v-btn flat small class="mx-0" @click="refreshSearch()" style="text-transform: none;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
           <span>|</span>
           <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
        </div>
      </div>
      <v-data-table
        :headers="headersNeoTau"
        :items="itemsNeoTau"
        class="table-bordered danhSachHoSoTable__class table-tau-bien"
        hide-actions
        style="max-width: 1095px;"
        :no-data-text="'Không tìm thấy tàu nào'"
        :no-results-text="'Không tìm thấy tàu nào'"
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
              v-model="adv.tenTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianBatDau" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
              <datetime-picker
              v-model="adv.thoiGianBatDau"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
            </th>
            <th>
              <v-text-field
              v-model="adv.mucDichNeo"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianKetThuc" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
              <datetime-picker
              v-model="adv.thoiGianKetThuc"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
            </th>
            <th>
              <v-text-field
              v-model="adv.viTriNeo"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.gioNeo"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-select
                :items="neoBoSungItems"
                v-model="adv.neoBoSung"
                class="px-0 py-0 mx-0 my-0"
              ></v-select>
            </th>
            <th>
              <v-select
                :items="phaoItems"
                v-model="adv.phao"
                class="px-0 py-0 mx-0 my-0"
              ></v-select>
            </th>
            <th>
              <v-select
                :items="hoatDongNoiThuyItems"
                v-model="adv.hoatDongNoiThuy"
                class="px-0 py-0 mx-0 my-0"
              ></v-select>
            </th>
            <th>
              <v-text-field
              v-model="adv.hangTrenTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.daiLy"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.chuTau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.khaiThac"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageNeoTau * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.thoiGianBatDau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.mucDichNeo}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.thoiGianKetThuc}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.viTriNeo}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.gioNeo}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px !important;">
            <input type="checkbox" v-model="props.item.neoBoSung" disabled name="">      
          </td>
          <td class="text-xs-center" style="padding-top: 5px !important;">
            <input type="checkbox" v-model="props.item.phao" disabled name="">      
          </td>
          <td class="text-xs-center" style="padding-top: 5px !important;">
            <input type="checkbox" v-model="props.item.hoatDongNoiThuy" disabled name="">
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.hangTrenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.daiLy}}</td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.chuTau}}</td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.khaiThac}}</td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsNeoTau" :page="loadDataTablePageNeoTau" custom-class="custom-tiny-class" 
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
    menuTopNeoTau: false,
    searchTopNeoTau: '',
    dateSearchTopNeoTau: '',
    adv: {
      tenTau: '',
      thoiGianBatDau: '',
      mucDichNeo: '',
      thoiGianKetThuc: '',
      viTriNeo: '',
      gioNeo: '',
      phao: '',
      hoatDongNoiThuy: '',
      hangTrenTau: '',
      daiLy: '',
      chuTau: '',
      khaiThac: ''
    },
    neoBoSungItems: [],
    hoatDongNoiThuyItems: [],
    headersNeoTau: [
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
        'type': 'select',
        'id': 'tenTau'
      },
      {
        'text': 'Thời gian <br> bắt đầu',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'thoiGianBatDau'
      },
      {
        'text': 'Mục đích neo',
        'align': 'center',
        'sortable': false,
        'type': 'text',
        'id': 'mucDichNeo'
      },
      {
        'text': 'Thời gian <br> kết thúc',
        'align': 'left',
        'sortable': false,
        'type': 'select',
        'id': 'thoiGianKetThuc'
      },
      {
        'text': 'Vị trí neo',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'viTriNeo'
      },
      {
        'text': 'Giờ neo',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'gioNeo'
      },
      {
        'text': 'Neo bổ sung',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'neoBoSung'
      },
      {
        'text': 'Phao',
        'align': 'left',
        'sortable': false,
        'type': 'select',
        'id': 'phao'
      },
      {
        'text': 'Hoạt động <br> nội thủy',
        'align': 'left',
        'sortable': false,
        'type': 'select',
        'id': 'hoatDongNoiThuy'
      },
      {
        'text': 'Hàng trên tàu',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'hangTrenTau'
      },
      {
        'text': 'Đại lý',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'daiLy'
      },
      {
        'text': 'Chủ tàu',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'chuTau'
      },
      {
        'text': 'Khai thác',
        'align': 'left',
        'sortable': false,
        'type': 'text',
        'id': 'khaiThac'
      }
    ],
    itemsNeoTau: [
      {
        tenTau: 'A DONG 18',
        thoiGianBatDau: '05/07/2018 22:00',
        mucDichNeo: 'CHO KE HOACH',
        thoiGianKetThuc: '09/07/2018 06:00',
        viTriNeo: 'A12',
        gioNeo: '80',
        neoBoSung: false,
        phao: true,
        hoatDongNoiThuy: false,
        hangTrenTau: '',
        daiLy: 'THUYỀN TRƯỞNG',
        chuTau: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG',
        khaiThac: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG'
      },
      {
        tenTau: 'A DONG 18',
        thoiGianBatDau: '05/07/2018 22:00',
        mucDichNeo: 'CHO KE HOACH',
        thoiGianKetThuc: '09/07/2018 06:00',
        viTriNeo: 'A12',
        gioNeo: '80',
        neoBoSung: true,
        phao: false,
        hoatDongNoiThuy: false,
        hangTrenTau: '',
        daiLy: 'THUYỀN TRƯỞNG',
        chuTau: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG',
        khaiThac: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG'
      },
      {
        tenTau: 'A DONG 18',
        thoiGianBatDau: '05/07/2018 22:00',
        mucDichNeo: 'CHO KE HOACH',
        thoiGianKetThuc: '09/07/2018 06:00',
        viTriNeo: 'A12',
        gioNeo: '80',
        neoBoSung: true,
        phao: false,
        hoatDongNoiThuy: false,
        hangTrenTau: '',
        daiLy: 'THUYỀN TRƯỞNG',
        chuTau: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG',
        khaiThac: 'CÔNG TY CỔ PHẦN VẬN TẢI XNK Á ĐÔNG'
      }
    ],
    loadDataTablePageNeoTau: 1,
    totalDsNeoTau: 0
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
      vm.loadDataTablePageNeoTau = query['page']
    } else {
      vm.loadDataTablePageNeoTau = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageNeoTau * 15 - 15,
      end: vm.loadDataTablePageNeoTau * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsNeoTau = result.data
      vm.totalDsNeoTau = result.total
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
        vm.loadDataTablePageNeoTau = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        start: vm.loadDataTablePageNeoTau * 15 - 15,
        end: vm.loadDataTablePageNeoTau * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsNeoTau = result.data
        vm.totalDsNeoTau = result.total
        vm.loading = false
      })
    }
  },
  methods: {
    themMoi () {
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
        tenTau: '',
        thoiGianBatDau: '',
        mucDichNeo: '',
        thoiGianKetThuc: '',
        viTriNeo: '',
        gioNeo: '',
        phao: '',
        hoatDongNoiThuy: '',
        hangTrenTau: '',
        daiLy: '',
        chuTau: '',
        khaiThac: ''
      }
    }
  },
  filters: {
  }
}
</script>
