<template>
  <div>
    <v-navigation-drawer app clipped floating width="250" class="px-0 py-0" style="overflow: auto; padding: 0;">
      <jx-hanghai-filter-left
        ref="filterleft"
        :type="type"
        @changeHeader="headerDS"
        :document_type_code="documentTypeCode"
        :document_status_code="documentStatusCode"
        :role_filter_status="roleFilterStatus"
        :count_ho_so_api="counterTauBienAll"
        :counter_tau_bien_ke_hoach_table="countertauBienKeHoachTable"
        :counter_tau_bien_thu_tuc_table="countertauBienThuTucTable"
      >
    </jx-hanghai-filter-left>
    </v-navigation-drawer>

    <div style="width: 100%; position: relative;" class="filter__adv_class">
      <!-- <v-switch :label="supportData.langUITau[type]" v-model="switchTauBien" hide-details
      @change="changeType"
      style="position: absolute;
      left: 125px;
      top: 8px;
      width: 200px;
      z-index: 10;"
      ></v-switch> -->
      <v-expansion-panel class="my-0">
        <v-expansion-panel-content v-bind:value="false">
          <div slot="header"><span class="text-bold primary--text"> {{status_label}} </span></div>
        </v-expansion-panel-content>
      </v-expansion-panel>
    </div>
    
    <router-view></router-view>
  </div>
</template>

<script>
import FilterLeft from './hang_hai/hanghai_filter_left_tau_bien.vue'
import FilterADV from './hang_hai/hanghai_filter_adv.vue'
import router from '@/router'
import supportData from '../store/support_data.json'
// import axios from 'axios'

export default {
  props: ['type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'jx-hanghai-filter-left': FilterLeft,
    'jx-hanghai-filter-adv': FilterADV
  },
  data: () => ({
    supportData: supportData,
    docTypes: [],
    roleFilterStatus: [],
    initData: null,
    counterTauBienAll: '',
    countertauBienKeHoachTable: '',
    countertauBienThuTucTable: '',
    cang_vu_name: '',
    tau_den_rois: [],
    quoc_tichs: supportData.data_state,
    khu_cuc_cangs: [],
    cang_den_tiep_theos: [],
    callBack: true,
    getFilterADVDataAPI: '',
    switchTauBien: true,
    status_label: ''
  }),
  computed: {
  },
  beforeCreate () {
    var vm = this
    vm.$nextTick(function () {
      vm.$store.dispatch('loadInitResource').then(function (result) {
        vm.initData = result
        if (vm.initData !== null) {
          vm.getFilterADVDataAPI = vm.initData.getFilterADVDataAPI
          vm.counterTauBienAll = vm.initData.counterTauBienAll
          vm.countertauBienKeHoachTable = vm.initData['countertauBienKeHoachTable']
          vm.countertauBienThuTucTable = vm.initData['countertauBienThuTucTable']
          vm.cang_vu_name = vm.initData.user['cangVuName']
          let emailNameHeader = document.getElementById('emailNameHeader')
          if (emailNameHeader !== null && emailNameHeader !== undefined && emailNameHeader !== 'undefined') {
            emailNameHeader.innerHTML = vm.initData.user.userName
          }
        }
      })
    })
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
      vm.doRolesInit(true)
    })
  },
  updated () {
  },
  watch: {
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let newDocumentStatusCode = newRoute.params.documentStatusCode
      let oldDocumentStatusCode = oldRoute.params.documentStatusCode
      let newdocumentTypeCode = newRoute.params.documentTypeCode
      let olddocumentTypeCode = oldRoute.params.documentTypeCode
      let newtype = newRoute.params.type
      let oldtype = oldRoute.params.type
      let allLoad = true
      if (newDocumentStatusCode !== oldDocumentStatusCode && newdocumentTypeCode === olddocumentTypeCode && newtype === oldtype) {
        allLoad = false
      }
      vm.doRolesInit(allLoad)
    }
  },
  methods: {
    doRolesInit (allLoad) {
      let vm = this
      let filterleft = vm.$refs.filterleft
      if (vm.documentTypeCode !== 0 && (vm.type === 'ke_hoach' || vm.type === 'thu_tuc' || vm.type === 'quan_ly_tau')) {
        let filter = {
          documentType: vm.documentTypeCode
        }
        if (allLoad) {
          vm.$store.getters.roleFilterStatus(filter).then(function (result) {
            // TODO
            vm.roleFilterStatus = result
            if (vm.type === 'ke_hoach') {
              setTimeout(() => {
                // filterleft.doTauBienKeHoachFilterCount()
                // filterleft.doTauBienFilterCount()
              }, 300)
            } else if (vm.type === 'thu_tuc') {
              setTimeout(() => {
                // filterleft.doTauBienThuTucFilterCount()
                // filterleft.doTauBienFilterCount()
              }, 300)
            }
          })
        }
      }
      if (allLoad && (vm.type === 'ke_hoach' || vm.type === 'thu_tuc')) {
        vm.$store.getters.docTypes.then(function (result) {
          vm.docTypes = result
          if (filterleft !== null && filterleft !== undefined && filterleft !== 'undefined') {
            filterleft.doInitUpdate()
          }
        })
      }
    },
    headerDS (code) {
      console.log(code)
      var vm = this
      switch (code) {
        case 'DanhSachTauBien': {
          vm.status_label = 'Danh sách tàu biển'
          break
        }
        case 'DanhSachPhuongTienThuyNoiDia': {
          vm.status_label = 'Danh sách phương tiện thủy nội địa'
          break
        }
        case 'DanhSachTauRoiCang': {
          vm.status_label = 'Danh sách tàu rời cảng'
          break
        }
        case 'DanhSachTauDenCang': {
          vm.status_label = 'Danh sách tàu đến cảng'
          break
        }
        case 'DanhSachTauDiChuyen': {
          vm.status_label = 'Danh sách tàu di chuyển'
          break
        }
        case 'DanhSachNeoTau': {
          vm.status_label = 'Danh sách tàu neo đậu'
          break
        }
        case 'DanhSachTauLaiHoTro': {
          vm.status_label = 'Danh sách tàu lai hỗ trợ'
          break
        }
        case 'DanhSachHoaTieuDanTau': {
          vm.status_label = 'Danh sách hoa tiêu dẫn tàu'
          break
        }
        case 'DanhSachXepDoHang': {
          vm.status_label = 'Danh sách xếp dỡ hàng'
          break
        }
        case 'DanhSachNhapTachDoan': {
          vm.status_label = 'Danh sách nhập tách đoàn'
          break
        }
        case 'DanhSachSuaChuaTau': {
          vm.status_label = 'Danh sách sửa chữa tàu'
          break
        }
        case 'DanhSachHaXuong': {
          vm.status_label = 'Danh sách hạ xuồng'
          break
        }
        case 'DanhSachThuTau': {
          vm.status_label = 'Danh sách thử tàu'
          break
        }
        case 'DanhSachDuTau': {
          vm.status_label = 'Danh sách giữ tàu'
          break
        }
        case 'DanhSachGhiChuCanhBao': {
          vm.status_label = 'Danh sách ghi chú cảnh báo'
          break
        }
        case 'DanhSachKhangNghiHangHai': {
          vm.status_label = 'Danh sách kháng nghị hàng hải'
          break
        }
        default: {
          vm.status_label = 'Danh sách kế hoạch chuyên tuyến'
          break
        }
      }
    },
    changeType (val) {
      let currentUrl = this.$router.history.current.path
      if (this.type === 'ke_hoach') {
        currentUrl = currentUrl.replace('ke_hoach', 'thu_tuc')
        router.push(currentUrl)
      } else {
        currentUrl = currentUrl.replace('thu_tuc', 'ke_hoach')
        router.push(currentUrl)
      }
    }
  }
}
</script>
