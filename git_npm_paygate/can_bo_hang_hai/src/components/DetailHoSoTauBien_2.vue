<template>
  <div>

    <hang-hai-detail-thong-tin-tau-bien
      v-if="code === 'DanhSachTauBien'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauBien"
      ></hang-hai-detail-thong-tin-tau-bien>

      <hang-hai-detail-phuong-tien-thuy-noi-dia
      v-if="code === 'DanhSachPhuongTienThuyNoiDia'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailPhuongTienThuyNoiDia"
      ></hang-hai-detail-phuong-tien-thuy-noi-dia>

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

      <hang-hai-detail-tau-roi-cang
      v-if="code === 'DanhSachTauRoiCang'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-tau-roi-cang>

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

      <hang-hai-detail-tau-neo-dau
      v-if="code === 'DanhSachNeoTau'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-tau-neo-dau>

      <hang-hai-detail-tau-lai-ho-tro
      v-if="code === 'DanhSachTauLaiHoTro'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-tau-lai-ho-tro>

      <hang-hai-detail-hoa-tieu-dan-tau
      v-if="code === 'DanhSachHoaTieuDanTau'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-hoa-tieu-dan-tau>

      <hang-hai-detail-giu-tau
      v-if="code === 'DanhSachDuTau'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-giu-tau>

      <hang-hai-detail-khang-nghi-hang-hai
      v-if="code === 'DanhSachKhangNghiHangHai'"
      :id="id"
      :type="type"
      :code="code"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-khang-nghi-hang-hai>

      <hang-hai-detail-sua-chua-tau
      v-if="code === 'DanhSachSuaChuaTau'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-sua-chua-tau>
      
      <hang-hai-detail-ha-xuong
      v-if="code === 'DanhSachHaXuong'"
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-ha-xuong>
    <div v-else-if="statusCode === 'kehoach_pttnd_dencang'">
      <hang-hai-detail-pttnd-den-cang
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-pttnd-den-cang>
    </div>
    <div v-else-if="statusCode === 'kehoach_pttnd_roicang'">
      <hang-hai-detail-pttnd-roi-cang
      :id="id"
      :type="type"
      :code="code"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
      :documentStatusCode="documentStatusCode"
      :statusCode="statusCode"
      ref="detailTauDenCang"
      ></hang-hai-detail-pttnd-roi-cang>
    </div>
  </div>
</template>

<script>
import HangHaiDetailThongTinTauBien from './hang_hai/Detail_hang_hai/hanghai_detail_tau_bien.vue'
import HangHaiDetailPhuongTienThuyNoiDia from './hang_hai/Detail_hang_hai/hanghai_detail_phuong_tien_thuy_noi_dia.vue'
import HangHaiDetailDanhSachTauDenCang from './hang_hai/Detail_hang_hai/hanghai_detail_tau_den_cang.vue'
import HangHaiDetailDanhSachTauRoiCang from './hang_hai/Detail_hang_hai/hanghai_detail_tau_roi_cang.vue'
import HangHaiDetailDanhSachTauDiChuyen from './hang_hai/Detail_hang_hai/hanghai_detail_tau_di_chuyen.vue'
import HangHaiDetailDanhSachTauNeoDau from './hang_hai/Detail_hang_hai/hanghai_detail_tau_neo_dau.vue'
import HangHaiDetailDanhSachTauLaihoTro from './hang_hai/Detail_hang_hai/hanghai_detail_tau_lai_ho_tro.vue'
import HangHaiDetailDanhSachHoaTieuDanTau from './hang_hai/Detail_hang_hai/hanghai_detail_hoa_tieu_dan_tau.vue'
import HangHaiDetailDanhSachGiuTau from './hang_hai/Detail_hang_hai/hanghai_detail_giu_tau.vue'
import HangHaiDetailKhangNghiHangHai from './hang_hai/Detail_hang_hai/hanghai_detail_khang_cao.vue'
import HangHaiDetailSuaChuaTau from './hang_hai/Detail_hang_hai/hanghai_detail_sua_chua.vue'
import HangHaiDetailHaXuong from './hang_hai/Detail_hang_hai/hanghai_detail_ha_xuong.vue'
import HangHaiDetailPTTNDDenCang from './hang_hai/Detail_hang_hai/hanghai_detail_pttnd_den_cang.vue'
import HangHaiDetailPTTNRoiCang from './hang_hai/Detail_hang_hai/hanghai_detail_pttnd_roi_cang.vue'
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
    'hang-hai-detail-thong-tin-tau-bien': HangHaiDetailThongTinTauBien,
    'hang-hai-detail-phuong-tien-thuy-noi-dia': HangHaiDetailPhuongTienThuyNoiDia,
    'hang-hai-detail-tau-den-cang': HangHaiDetailDanhSachTauDenCang,
    'hang-hai-detail-tau-roi-cang': HangHaiDetailDanhSachTauRoiCang,
    'hang-hai-detail-tau-di-chuyen': HangHaiDetailDanhSachTauDiChuyen,
    'hang-hai-detail-tau-neo-dau': HangHaiDetailDanhSachTauNeoDau,
    'hang-hai-detail-tau-lai-ho-tro': HangHaiDetailDanhSachTauLaihoTro,
    'hang-hai-detail-hoa-tieu-dan-tau': HangHaiDetailDanhSachHoaTieuDanTau,
    'hang-hai-detail-giu-tau': HangHaiDetailDanhSachGiuTau,
    'hang-hai-detail-khang-nghi-hang-hai': HangHaiDetailKhangNghiHangHai,
    'hang-hai-detail-sua-chua-tau': HangHaiDetailSuaChuaTau,
    'hang-hai-detail-ha-xuong': HangHaiDetailHaXuong,
    'hang-hai-detail-pttnd-den-cang': HangHaiDetailPTTNDDenCang,
    'hang-hai-detail-pttnd-roi-cang': HangHaiDetailPTTNRoiCang,
    'danh-sach-tau-all': DanhSachTauAll
  },
  computed: {
    // mapStatusCodeTable () {
    //   var vm = this
    //   if (vm.statusCode === '')
    // }
  },
  data: () => ({
    detail_model: {}
  }),
  created () {
    let vm = this
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
