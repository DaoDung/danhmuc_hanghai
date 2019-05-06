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
        :headers="headersTauRoiCang"
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
              v-model="adv.tenTau2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-select
                class="px-0 py-0 mx-0 my-0"
                :items="quocTichItems"
                v-model="adv.quocTich"
              ></v-select>
            </th>
            <th>
              <v-text-field
              v-model="adv.hoHieu"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.gt"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.dwt"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.chieuDai"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.monNuoc"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.loaiHangHoa"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.viTriNeoDau"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.duKienRoiSg"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.daiLy3"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="adv.tuyenLuong"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageTauRoiCang * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tenTau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.quocTich}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.hoHieu}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.gt}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.dwt}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.chieuDai}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.monNuoc}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.loaiHangHoa}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.viTriNeoDau}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.duKienRoiSg}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.daiLy}}</td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.tuyenLuong}}</td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsTauRoiCang" :page="loadDataTablePageTauRoiCang" custom-class="custom-tiny-class" 
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
    adv: {
      tenTau2: '',
      quocTich: '',
      quocTichItems: [],
      hoHieu: '',
      gt: '',
      dwt: '',
      chieuDai: '',
      monNuoc: '',
      loaiHangHoa: '',
      viTriNeoDau: '',
      duKienRoiSg: '',
      daiLy2: '',
      tuyenLuong: ''
    },
    headersTauRoiCang: [
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
        'text': 'Chiều dài',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Mớn nước',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Loại hàng hóa',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Vị trí neo đậu',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Dự kiến rời SG',
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
        'text': 'Tuyến luồng',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      }
    ],
    itemsTauRoiCang: [
      {
        tenTau: 'HANSA HOMBURG',
        quocTich: 'LIBERIA',
        hoHieu: 'D5RH5',
        gt: '18265',
        dwt: '23568',
        chieuDai: '175.00',
        monNuoc: '9.5',
        loaiHangHoa: 'CONTAINER 15000',
        viTriNeoDau: 'C.LAI 1',
        duKienRoiSg: '00:00',
        daiLy: 'ISS-GEMADEPT',
        tuyenLuong: 'SG-VT'
      },
      {
        tenTau: 'CIMBRIA',
        quocTich: 'LIBERIA',
        hoHieu: 'D5RH5',
        gt: '23568',
        dwt: '36975',
        chieuDai: '225.00',
        monNuoc: '9.5',
        loaiHangHoa: 'CONTAINER',
        viTriNeoDau: 'C.LAI 5',
        duKienRoiSg: '06:20',
        daiLy: 'TAM CANG JSC',
        tuyenLuong: 'SG-VT'
      },
      {
        tenTau: 'HANSA HOMBURG',
        quocTich: 'LIBERIA',
        hoHieu: 'D5RH5',
        gt: '18265',
        dwt: '23568',
        chieuDai: '175.00',
        monNuoc: '9.5',
        loaiHangHoa: 'CONTAINER 15000',
        viTriNeoDau: 'C.LAI 1',
        duKienRoiSg: '00:00',
        daiLy: 'ISS-GEMADEPT',
        tuyenLuong: 'SG-VT'
      }
    ],
    loadDataTablePageTauRoiCang: 1,
    totalDsTauRoiCang: 0
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
      vm.loadDataTablePageTauRoiCang = query['page']
    } else {
      vm.loadDataTablePageTauRoiCang = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageTauRoiCang * 15 - 15,
      end: vm.loadDataTablePageTauRoiCang * 15
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
        vm.loadDataTablePageTauRoiCang = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        documentTypeCode: vm.documentTypeCode,
        documentStatusCode: vm.documentStatusCode,
        start: vm.loadDataTablePageTauRoiCang * 15 - 15,
        end: vm.loadDataTablePageTauRoiCang * 15
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
        tenTau2: '',
        quocTich: '',
        quocTichItems: [],
        hoHieu: '',
        gt: '',
        dwt: '',
        chieuDai: '',
        monNuoc: '',
        loaiHangHoa: '',
        viTriNeoDau: '',
        duKienRoiSg: '',
        daiLy2: '',
        tuyenLuong: ''
      }
    }
  },
  filters: {
  }
}
</script>
