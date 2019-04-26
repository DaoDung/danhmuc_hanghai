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
           <v-btn flat small class="mx-0" @click="refreshSearch()"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
           <span>|</span>
           <v-btn flat small class="mx-0"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
        </div>
      </div>
      <v-data-table
        :headers="headersDsThuyNoiDia"
        :items="itemsDsThuyNoiDia"
        class="table-bordered danhSachHoSoTable__class"
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
              v-model="adv.tenPtDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.loaiTauDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.tauKeoDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.gtDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.dwtDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soNgToiDaDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.loaDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soBangDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.breadthDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.soBangNtDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.capPtDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.congSuatMayDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.chuTauDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.diaChiDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.thuyenTruongDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.hangBangDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.mayTruongDSTND"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.hangBangMtDSTND"
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
          {{props.item.tenPtDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.loaiTauDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tauKeoDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.gtDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.dwtDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.soNgToiDaDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.loaDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.soBangDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.breadthDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.soBangNtDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.capPtDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.congSuatMayDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.chuTauDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.diaChiDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.thuyenTruongDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.hangBangDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.mayTruongDSTND}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.hangBangMtDSTND}}
          </td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsThuyNoiDia" :page="loadDataTablePageDSTND" custom-class="custom-tiny-class" 
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
    },
    headersDsThuyNoiDia: [
      {
        'text': 'STT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tên phương tiện',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Loại tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu kéo',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'GT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'DWT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số người <br> tối đa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'LOA <br> (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số bằng TT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Breadth',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Số bằng <br> MT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Cấp PT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Công suất máy',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Chủ tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Địa chỉ',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thuyền trưởng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Hạng bằng TT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Máy trưởng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Hạng bằng MT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsDsThuyNoiDia: [
    ],
    loadDataTablePageDSTND: 1,
    totalDsThuyNoiDia: 0
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
      vm.loadDataTablePageDSTND = query['page']
    } else {
      vm.loadDataTablePageDSTND = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageDSTND * 15 - 15,
      end: vm.loadDataTablePageDSTND * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsDsThuyNoiDia = result.data
      vm.totalDsThuyNoiDia = result.total
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
        vm.loadDataTablePageDSTND = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageDSTND * 15 - 15,
        end: vm.loadDataTablePageDSTND * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsThuyNoiDia = result.data
        vm.totalDsThuyNoiDia = result.total
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
