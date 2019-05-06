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
           <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17" >save</v-icon> Xuất file</v-btn>
        </div>
      </div>
      <v-data-table
        :headers="headersDsKeHoachChuyenTuyen"
        :items="itemsDsKeHoachChuyenTuyen"
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
              v-model="adv.donViKhaiThacKHCT"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-select
                :items="thangItems"
                v-model="adv.thangKHCT"
                class="px-0 py-0 mx-0 my-0"
              ></v-select>
            </th>
            <th>
              <v-text-field
              v-model="adv.soChuyenKHCT"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageDSKN * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.donViKhaiThacKHCT}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.thangKHCT}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.soChuyenKHCT}}
          </td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsKeHoachChuyenTuyen" :page="loadDataTablePageDSKHCT" custom-class="custom-tiny-class" 
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
    thangItems: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12],
    adv: {
      donViKhaiThacKHCT: '',
      thangKHCT: '',
      soChuyenKHCT: ''
    },
    headersDsKeHoachChuyenTuyen: [
      {
        'text': 'STT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Đơn vị khai thác',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tháng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số chuyến trong tháng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsDsKeHoachChuyenTuyen: [
    ],
    loadDataTablePageDSKHCT: 1,
    totalDsKeHoachChuyenTuyen: 0
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
      vm.loadDataTablePageDSKHCT = query['page']
    } else {
      vm.loadDataTablePageDSKHCT = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageDSKHCT * 15 - 15,
      end: vm.loadDataTablePageDSKHCT * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsDsKeHoachChuyenTuyen = result.data
      vm.totalDsKeHoachChuyenTuyen = result.total
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
        vm.loadDataTablePageDSKHCT = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageDSKHCT * 15 - 15,
        end: vm.loadDataTablePageDSKHCT * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsKeHoachChuyenTuyen = result.data
        vm.totalDsKeHoachChuyenTuyen = result.total
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
        donViKhaiThacKHCT: '',
        thangKHCT: '',
        soChuyenKHCT: ''
      }
    }
  },
  filters: {
  }
}
</script>
