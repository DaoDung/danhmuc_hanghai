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
        :headers="headersTauDenCang"
        :items="itemsTauDenCang"
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
              v-model="tenTau3"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-select
                class="px-0 py-0 mx-0 my-0"
                :items="quocTichItems"
                v-model="quocTich2"
              ></v-select>
            </th>
            <th>
              <v-text-field
              v-model="hoHieu2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="gt2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="dwt2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="chieuDai2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="monNuoc2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="loaiHangHoa2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="viTriNeoDau2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="duKienDenVt2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="thoiGianRoiVt2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="daiLy3"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
            <th>
              <v-text-field
              v-model="tuyenLuong2"
              class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </th>
          </tr>
        </template>
        <template slot="items" slot-scope="props">
          <td class="text-xs-left" style="padding-top: 5px; width: 2%;">
            {{ loadDataTablePageTauDenCang * 15 - 15 + props.index + 1 }}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.tenTau3}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.quocTich2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.hoHieu2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.gt2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.dwt2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
          {{props.item.chieuDai2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">        
            {{props.item.monNuoc2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.loaiHangHoa2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.viTriNeoDau2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.duKienDenVt2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">
            {{props.item.thoiGianRoiVt2}}
          </td>
          <td class="text-xs-center" style="padding-top: 5px;">{{props.item.daiLy2}}</td>
          <td class="text-xs-center" style="padding-top: 5px;"> {{props.item.tuyenLuong2}}</td>
        </template>
      </v-data-table>
      <div class="text-xs-right layout wrap" style="position: relative;">
        <div class="flex pagging-table px-2"> 
          <tiny-pagination :total="totalDsTauDenCang" :page="loadDataTablePageTauDenCang" custom-class="custom-tiny-class" 
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
      tenTau3: '',
      quocTich2: '',
      hoHieu2: '',
      gt2: '',
      dwt2: '',
      chieuDai2: '',
      monNuoc2: '',
      loaiHangHoa2: '',
      viTriNeoDau2: '',
      duKienDenVt2: '',
      thoiGianRoiVt2: '',
      daiLy3: '',
      tuyenLuong2: ''
    },
    headersTauDenCang: [
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
        'text': 'Dự kiến đến VT',
        'align': 'center',
        'sortable': false,
        'id': 'stt'
      },
      {
        'text': 'Thời gian đến VT',
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
    itemsTauDenCang: [
      {
        tenTau3: 'Trường Nguyễn 89',
        quocTich2: 'VIET NAM',
        hoHieu2: 'HP 3901',
        gt2: '2442',
        dwt2: '4968',
        chieuDai2: '103',
        monNuoc2: '2.8',
        loaiHangHoa2: 'NIL',
        viTriNeoDau2: 'BP-04 HAI VAN',
        duKienDenVt2: '02:30',
        thoiGianRoiVt2: '05:00',
        daiLy2: 'TU TUC',
        tuyenLuong2: 'GIÒ GIA'
      },
      {
        tenTau3: 'Trường Nguyễn 89',
        quocTich2: 'VIET NAM',
        hoHieu2: 'HP 3901',
        gt2: '2442',
        dwt2: '4968',
        chieuDai2: '103',
        monNuoc2: '2.8',
        loaiHangHoa2: 'NIL',
        viTriNeoDau2: 'BP-04 HAI VAN',
        duKienDenVt2: '02:30',
        thoiGianRoiVt2: '05:00',
        daiLy2: 'TU TUC',
        tuyenLuong2: 'GIÒ GIA'
      },
      {
        tenTau3: 'Trường Nguyễn 89',
        quocTich2: 'VIET NAM',
        hoHieu2: 'HP 3901',
        gt2: '2442',
        dwt2: '4968',
        chieuDai2: '103',
        monNuoc2: '2.8',
        loaiHangHoa2: 'NIL',
        viTriNeoDau2: 'BP-04 HAI VAN',
        duKienDenVt2: '02:30',
        thoiGianRoiVt2: '05:00',
        daiLy2: 'TU TUC',
        tuyenLuong2: 'GIÒ GIA'
      },
      {
        tenTau3: 'Trường Nguyễn 89',
        quocTich2: 'VIET NAM',
        hoHieu2: 'HP 3901',
        gt2: '2442',
        dwt2: '4968',
        chieuDai2: '103',
        monNuoc2: '2.8',
        loaiHangHoa2: 'NIL',
        viTriNeoDau2: 'BP-04 HAI VAN',
        duKienDenVt2: '02:30',
        thoiGianRoiVt2: '05:00',
        daiLy2: 'TU TUC',
        tuyenLuong2: 'GIÒ GIA'
      },
      {
        tenTau3: 'Trường Nguyễn 89',
        quocTich2: 'VIET NAM',
        hoHieu2: 'HP 3901',
        gt2: '2442',
        dwt2: '4968',
        chieuDai2: '103',
        monNuoc2: '2.8',
        loaiHangHoa2: 'NIL',
        viTriNeoDau2: 'BP-04 HAI VAN',
        duKienDenVt2: '02:30',
        thoiGianRoiVt2: '05:00',
        daiLy2: 'TU TUC',
        tuyenLuong2: 'GIÒ GIA'
      }
    ],
    loadDataTablePageTauDenCang: 1,
    totalDsTauDenCang: 0
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
      vm.loadDataTablePageTauDenCang = query['page']
    } else {
      vm.loadDataTablePageTauDenCang = 1
    }
    let param = null
    vm.loading = true
    param = {
      type: vm.type,
      documentTypeCode: vm.documentTypeCode,
      documentStatusCode: vm.documentStatusCode,
      start: vm.loadDataTablePageTauDenCang * 15 - 15,
      end: vm.loadDataTablePageTauDenCang * 15
    }
    for (var key in query) {
      if (key !== 'page') {
        param[key] = query[key]
      }
    }
    vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
      vm.itemsTauDenCang = result.data
      vm.totalDsTauDenCang = result.total
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
        vm.loadDataTablePageTauDenCang = query['page']
      }
      let param = null
      vm.loading = true
      param = {
        type: vm.type,
        start: vm.loadDataTablePageTauDenCang * 15 - 15,
        end: vm.loadDataTablePageTauDenCang * 15
      }
      for (var key in query) {
        if (key !== 'page') {
          param[key] = query[key]
        }
      }
      vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
        vm.itemsTauDenCang = result.data
        vm.totalDsTauDenCang = result.total
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
        tenTau3: '',
        quocTich2: '',
        hoHieu2: '',
        gt2: '',
        dwt2: '',
        chieuDai2: '',
        monNuoc2: '',
        loaiHangHoa2: '',
        viTriNeoDau2: '',
        duKienDenVt2: '',
        thoiGianRoiVt2: '',
        daiLy3: '',
        tuyenLuong2: ''
      }
    }
  },
  filters: {
  }
}
</script>
