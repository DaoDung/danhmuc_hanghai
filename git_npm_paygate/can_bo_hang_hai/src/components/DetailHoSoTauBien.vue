<template>
  <div>
    <danh-sach-tau-all
        v-if="listCodeTable.includes(code)"
        :code="code"
        :type="type"
        :documentName="documentName"
        :documentYear="documentYear"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
    </danh-sach-tau-all>
    <div v-else>
      <hang-hai-detail-tau-den-cang
      v-if="code === 'DanhSachTauDenCang'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-tau-den-cang>

      <hang-hai-detail-tau-di-chuyen
      v-if="code === 'DanhSachTauDiChuyen'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-tau-di-chuyen>
    </div>
  </div>
</template>

<script>
import HangHaiDetailDanhSachTauDenCang from './hang_hai/Detail_hang_hai/hanghai_detail_tau_den_cang.vue'
import HangHaiDetailDanhSachTauDiChuyen from './hang_hai/Detail_hang_hai/hanghai_detail_tau_di_chuyen.vue'
import DanhSachTauAll from './hang_hai/DanhSachTauAll.vue'

export default {
  // props: ['type', 'documentTypeCode', 'documentStatusCode', 'id', 'code', 'statusCode'],
  props: {
    type: '',
    documentTypeCode: '',
    documentStatusCode: '',
    id: '',
    code: '',
    statusCode: '',
    documentName: '',
    documentYear: ''
  },
  components: {
    'hang-hai-detail-tau-den-cang': HangHaiDetailDanhSachTauDenCang,
    'hang-hai-detail-tau-di-chuyen': HangHaiDetailDanhSachTauDiChuyen,
    'danh-sach-tau-all': DanhSachTauAll
  },
  computed: {
    // mapStatusCodeTable () {
    //   var vm = this
    //   if (vm.statusCode === '')
    // }
  },
  data: () => ({
    detail_model: {},
    listCodeTable: ['DanhSachViTriNeoDauTaiCang', 'DanhSachTauRoiCang', 'DanhSachTauLaiHoTro', 'DanhSachHoaTieuDanTau', 'DanhSachSuaChuaTau', 'DanhSachNhapTachDoan', 'DanhSachHaXuong', 'DanhSachThuTau', 'DanhSachDuTau', 'DanhSachGhiChuCanhBao']
  }),
  created () {
    let vm = this
    console.log('listCodeTable++++++++++', vm.listCodeTable)
    console.log('code++++++++++', vm.code)
    console.log('listCodeTable.includes(code)++++++++++', vm.listCodeTable.includes(vm.code))
    vm.$nextTick(function () {
      vm.reloadDetail()
    })
  },
  watch: {
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('renew')) {
        vm.reloadDetail()
      }
    }
  },
  methods: {
    reloadDetail: function () {
      var vm = this
      if (vm.code === 'DanhSachTauBien') {
        let detailTauBien = vm.$refs.detailTauBien
        if (detailTauBien !== null && detailTauBien !== undefined && detailTauBien !== 'undefined') {
          detailTauBien.loadDetailTauBien()
        }
      } else if (vm.code === 'DanhSachPhuongTienThuyNoiDia') {
        let detailPhuongTienThuyNoiDia = vm.$refs.detailPhuongTienThuyNoiDia
        if (detailPhuongTienThuyNoiDia !== null && detailPhuongTienThuyNoiDia !== undefined && detailPhuongTienThuyNoiDia !== 'undefined') {
        }
      }
    }
  }
}
</script>
