<template>
  <div>

    <hang-hai-detail-thong-tin-tau-bien
    v-if="code === 'DanhSachTauBien'"
    :type="type"
    ref="detailTauBien"
    :documentName="documentName"
    :documentYear="documentYear"
    :documentTypeCode="documentTypeCode"
    ></hang-hai-detail-thong-tin-tau-bien>

    <hang-hai-detail-hanh-trinh-phuong-tien
      v-if="code === 'DanhSachPhuongTienThuyNoiDia'"
      :type="type"
      ref="detailPhuongTienThuyNoiDia"
      :documentName="documentName"
      :documentYear="documentYear"
      :documentTypeCode="documentTypeCode"
    ></hang-hai-detail-hanh-trinh-phuong-tien>
  </div>
</template>

<script>
import HangHaiDetailThongTinTauBien from './hang_hai/hanghai_detail_thong_tin_tau_bien.vue'
import HangHaiDetailHanhTrinhPhuongTien from './hang_hai/hanghai_detail_hanh_trinh_phuong_tien.vue'

export default {
  props: ['code', 'type', 'documentName', 'documentYear', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'hang-hai-detail-thong-tin-tau-bien': HangHaiDetailThongTinTauBien,
    'hang-hai-detail-hanh-trinh-phuong-tien': HangHaiDetailHanhTrinhPhuongTien
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
