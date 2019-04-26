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
          :headers="headerViTriTauTaiCang"
          :items="itemsViTriTauTaiCang"
          expand
          hide-actions
          item-key="name"
          ref="dTable"
          class="pb-4 table-bordered danhSachHoSoTable__class"
          :no-data-text="'Không tìm thấy thông tin nào'"
          :no-results-text="'Không tìm thấy thông tin nào'"
        >
          <template slot="headers" slot-scope="props">
            <tr style="background: #eaeaea;">
              <th
              v-for="header in props.headers"
              :key="header.text"
              v-html="header.text"
              style="width: 20%;"
              >
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <tr @click="props.expanded = !props.expanded">
              <td colspan="5" style="color: #0a8eec; cursor: pointer;">&nbsp;&nbsp;&nbsp;
                <v-icon v-if="!props.expanded" size="15" style="cursor: pointer;">add_box</v-icon> 
                <v-icon v-else size="15" style="cursor: pointer;">remove</v-icon> 
                Bến cảng: {{ props.item.name }}
              </td>
            </tr>
          </template>
          <template slot="expand" slot-scope="props" :value="true">
            <v-data-table hide-actions :items="props.item.data">
              <template slot="items" slot-scope="props">
                <tr>
                  <td class="text-xs-center" style="padding-top: 5px !important; width: 20%;">
                    {{props.item.tenTau}}
                  </td>
                  <td class="text-xs-center" style="padding-top: 5px !important; width: 20%;">
                    {{props.item.quocTich}}
                  </td>
                  <td class="text-xs-center" style="padding-top: 5px !important; width: 20%;">
                    {{props.item.cauPhao}}
                  </td>
                  <td class="text-xs-center" style="padding-top: 5px !important; width: 20%;">
                    {{props.item.ngayDen}}
                  </td>
                  <td class="text-xs-center" style="padding-top: 5px !important; width: 20%;">
                    {{props.item.ngayGioVaoCau}}
                  </td>
                </tr>  
              </template> 
            </v-data-table>
          </template>
        </v-data-table>
        <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsViTriTauRoiCang" :page="loadDataTablePageViTriTauRoiCang" custom-class="custom-tiny-class" 
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
  props: ['index'],
  components: {
    'tiny-pagination': TinyPagination,
    'datetime-picker': DatetimePicker
  },
  data: () => ({
    headerViTriTauTaiCang: [
      {
        'text': 'Tên tàu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Quốc tịch',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Cầu/ phao',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Ngày đến',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Ngày/ giờ vào cầu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsViTriTauTaiCang: [
      {
        name: 'Bến cảng container QT VN',
        data: [
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          }
        ]
      },
      {
        name: 'Bến cảng B',
        data: [
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          },
          {
            tenTau: 'HAIAN BELL',
            quocTich: 'VIET NAM',
            cauPhao: 'V3',
            ngayDen: '16/04/2019',
            ngayGioVaoCau: '16/04/2019 23:00'
          }
        ]
      }
    ],
    loadDataTablePageViTriTauRoiCang: 1,
    totalDsViTriTauRoiCang: 0
  }),
  computed: {
    loading () {
      return this.$store.getters.loading
    }
  },
  mounted () {
    for (let i = 0; i < this.itemsViTriTauTaiCang.length; i += 1) {
      const item = this.itemsViTriTauTaiCang[i]
      this.$set(this.$refs.dTable.expanded, item.name, true)
    }
  },
  created () {
    var vm = this
    let query = vm.$router.history.current.query
    if (query.hasOwnProperty('page') && query['page'] !== 1) {
      vm.totalDsViTriTauRoiCang = query['page']
    } else {
      vm.totalDsViTriTauRoiCang = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.totalDsViTriTauRoiCang * 15 - 15,
      end: vm.totalDsViTriTauRoiCang * 15
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
    dateSearchTopNeoTau (val) {
      this.searchTopNeoTau = this.parseDate(val)
    },
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('page')) {
        vm.totalDsViTriTauRoiCang = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        start: vm.totalDsViTriTauRoiCang * 15 - 15,
        end: vm.totalDsViTriTauRoiCang * 15
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
      vm.adv = {}
    }
  },
  filters: {
  }
}
</script>
