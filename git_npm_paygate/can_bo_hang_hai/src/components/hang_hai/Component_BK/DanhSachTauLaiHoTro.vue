<template>
    <div style="background-color: #fff;">
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
             <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">refresh</v-icon> Refresh</v-btn> 
             <span>|</span>
             <v-btn flat small class="mx-0" style="text-transform: none;"> <v-icon size="17">save</v-icon> Xuất file</v-btn>
           </div>
         </div>

        <v-data-table
        :headers="headerTauLaiHoTro"
        :items="itemsTauRoiCang"
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
              v-model="tau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="luot"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai1"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai3"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai4"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai5"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tauLai6"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="benCang"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="viTri"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <!-- <vue-ctk-date-time-picker v-model="thoiGianBatDau" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
              <datetime-picker
              v-model="thoiGianBatDau"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
            </th>
            <th>
             <!-- <vue-ctk-date-time-picker v-model="thoiGianKetThuc" placeholder="" format="DD/MM/YYYY hh:mm A" label=""></vue-ctk-date-time-picker> -->
             <datetime-picker
              v-model="thoiGianKetThuc"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              ></datetime-picker>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageTauLaiHoTro * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.luot}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tauLai1}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tauLai2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tauLai3}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tauLai4}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.tauLai5}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.tauLai6}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.benCang}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.viTri}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.thoiGianBatDau}}</td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.thoiGianKetThuc}}</td>
        </template>
      </v-data-table>
        <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsTauLaiHoTro" :page="loadDataTablePageTauLaiHoTro" custom-class="custom-tiny-class" 
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
  props: ['type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker
  },
  data: () => ({
    headerTauLaiHoTro: [
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
        'text': 'Tàu lai 1',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu lai 2',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu lai 3',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu lai 4',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu lai 5',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Tàu lai 6',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Bến cảng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Vị trí',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian <br> bắt đầu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian <br> kết thúc',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsViTriTauTaiCang: [
      {
        tau: 'A.P MOLLER',
        luot: 'Lượt đến',
        tauLai1: 'Tân cảng A99',
        tauLai2: 'KAMYA',
        tauLai3: 'TIEN THANG',
        tauLai4: '',
        tauLai5: '',
        tauLai6: '',
        benCang: 'BẾN CẢNG CONTAINER QUỐC TẾ CÁI MÉP',
        viTri: 'CẦU CẢNG TCTT',
        thoiGianBatDau: '16/09/2018 15:00',
        thoiGianKetThuc: '17/09/2018 16:00'
      },
      {
        tau: 'A.P MOLLER',
        luot: 'Lượt đến',
        tauLai1: 'Tân cảng A99',
        tauLai2: 'KAMYA',
        tauLai3: 'TIEN THANG',
        tauLai4: '',
        tauLai5: '',
        tauLai6: '',
        benCang: 'BẾN CẢNG CONTAINER QUỐC TẾ CÁI MÉP',
        viTri: 'CẦU CẢNG TCTT',
        thoiGianBatDau: '16/09/2018 15:00',
        thoiGianKetThuc: '17/09/2018 16:00'
      },
      {
        tau: 'A.P MOLLER',
        luot: 'Lượt đến',
        tauLai1: 'Tân cảng A99',
        tauLai2: 'KAMYA',
        tauLai3: 'TIEN THANG',
        tauLai4: '',
        tauLai5: '',
        tauLai6: '',
        benCang: 'BẾN CẢNG CONTAINER QUỐC TẾ CÁI MÉP',
        viTri: 'CẦU CẢNG TCTT',
        thoiGianBatDau: '16/09/2018 15:00',
        thoiGianKetThuc: '17/09/2018 16:00'
      }
    ],
    loadDataTablePageTauLaiHoTro: 1,
    totalDsTauLaiHoTro: 0
  }),
  computed: {
    loading () {
      return this.$store.getters.loading
    }
  },
  mounted () {
    // for (let i = 0; i < this.itemsViTriTauTaiCang.length; i += 1) {
    //   const item = this.itemsViTriTauTaiCang[i]
    //   this.$set(this.$refs.dTable.expanded, item.name, true)
    // }
  },
  created () {
    var vm = this
    let query = vm.$router.history.current.query
    if (query.hasOwnProperty('page') && query['page'] !== 1) {
      vm.loadDataTablePageTauLaiHoTro = query['page']
    } else {
      vm.loadDataTablePageTauLaiHoTro = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageTauLaiHoTro * 15 - 15,
      end: vm.loadDataTablePageTauLaiHoTro * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsTauRoiCang = result.data
      vm.totalDsTauLaiHoTro = result.total
      vm.loading = false
    })
  },
  watch: {
    dateSearchTopNeoTau (val) {
      this.searchTopNeoTau = this.parseDate(val)
    },
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('page')) {
        vm.loadDataTablePageTauLaiHoTro = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageTauLaiHoTro * 15 - 15,
        end: vm.loadDataTablePageTauLaiHoTro * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsTauRoiCang = result.data
        vm.totalDsTauLaiHoTro = result.total
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
    }
  },
  filters: {
  }
}
</script>
