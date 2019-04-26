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
        :headers="headersDsTauBien"
        :items="itemsDsTauBien"
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
              v-model="adv.tenTauDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.daiLyDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.shipDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.quocTichDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.hoHieuDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.chuTauDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.ngKhaiThacDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.loaiTauDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.capDoAnNinhDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.gtDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.dwtDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.phanLoaiDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.ntDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.loaDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.breadthDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.drafDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.chieuCaoDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.monNuocMuiDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.monNuocTkeDSTB"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageDSTB * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.tenTauDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.daiLyDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.shipDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.quocTichDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.hoHieuDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.chuTauDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.ngKhaiThacDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.loaiTauDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.capDoAnNinhDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.gtDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.dwtDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.phanLoaiDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.ntDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.loaDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.breadthDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.drafDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.chieuCaoDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.monNuocMuiDSTB}}</a>
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            <a href="javascript:;" @click="toDetailTauBien(props.item)">{{props.item.monNuocTkeDSTB}}</a>
          </td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsTauBien" :page="loadDataTablePageDSTB" custom-class="custom-tiny-class" 
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
      tenTauDSTB: '',
      daiLyDSTB: '',
      shipDSTB: '',
      quocTichDSTB: '',
      hoHieuDSTB: '',
      chuTauDSTB: '',
      ngKhaiThacDSTB: '',
      loaiTauDSTB: '',
      capDoAnNinhDSTB: '',
      gtDSTB: '',
      dwtDSTB: '',
      phanLoaiDSTB: '',
      ntDSTB: '',
      loaDSTB: '',
      breadthDSTB: '',
      drafDSTB: '',
      chieuCaoDSTB: '',
      monNuocMuiDSTB: '',
      monNuocTkeDSTB: ''
    },
    headersDsTauBien: [
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
        'text': 'Đại lý',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Ship ID CHH',
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
        'text': 'Hô hiệu',
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
        'text': 'Người khai thác',
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
        'text': 'Cấp độ <br> an ninh',
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
        'text': 'Phân loại',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'NT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Loa (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Breadth (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Draft',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Chiều cao <br> t.không (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Mớn nước mũi <br> (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Mớn nước t.kế <br> (m)',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsDsTauBien: [
    ],
    loadDataTablePageDSTB: 1,
    totalDsTauBien: 0
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
      vm.loadDataTablePageDSTB = query['page']
    } else {
      vm.loadDataTablePageDSTB = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageDSTB * 15 - 15,
      end: vm.loadDataTablePageDSTB * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsDsTauBien = result.data
      vm.totalDsTauBien = result.total
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
        vm.loadDataTablePageDSTB = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageDSTB * 15 - 15,
        end: vm.loadDataTablePageDSTB * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsDsTauBien = result.data
        vm.totalDsTauBien = result.total
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
    toDetailTauBien (item) {
      var vm = this
      vm.$router.push('/tau-bien/' + vm.code + '/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode)
    },
    refreshSearch () {
      var vm = this
      vm.adv = {
        tenTauDSTB: '',
        daiLyDSTB: '',
        shipDSTB: '',
        quocTichDSTB: '',
        hoHieuDSTB: '',
        chuTauDSTB: '',
        ngKhaiThacDSTB: '',
        loaiTauDSTB: '',
        capDoAnNinhDSTB: '',
        gtDSTB: '',
        dwtDSTB: '',
        phanLoaiDSTB: '',
        ntDSTB: '',
        loaDSTB: '',
        breadthDSTB: '',
        drafDSTB: '',
        chieuCaoDSTB: '',
        monNuocMuiDSTB: '',
        monNuocTkeDSTB: ''
      }
    }
  },
  filters: {
  }
}
</script>
