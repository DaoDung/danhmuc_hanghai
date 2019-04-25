<template>

  <v-layout wrap>
    <v-flex>
      <content-placeholders v-if="loading">
        <content-placeholders-img />
        <content-placeholders-heading />
      </content-placeholders>

      <danh-sach-hoa-tieu-dan-tau
        v-if="code === 'hoaTieuDanTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-hoa-tieu-dan-tau>

      <danh-sach-neo-tau
        v-else-if="code === 'DanhSachNeoTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-neo-tau>

      <danh-sach-tau-den-cang
        v-else-if="code === 'DanhSachTauDenCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-tau-den-cang>

      <danh-sach-tau-di-chuyen
        v-else-if="code === 'DanhSachTauDiChuyen'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-tau-di-chuyen>

      <danh-sach-tau-lai-ho-tro
        v-else-if="code === 'DanhSachTauLaiHoTro'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-tau-lai-ho-tro>

      <danh-sach-tau-roi-cang
        v-else-if="code === 'DanhSachTauRoiCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-tau-roi-cang>

      <danh-sach-vi-tri-roi-cang
        v-else-if="code === 'DanhSachViTriTauRoiCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-vi-tri-roi-cang>

      <danh-sach-xep-do-hang
        v-else-if="code === 'DanhSachXepDoHang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-xep-do-hang>
    </v-flex>
  </v-layout>

</template>

<script>
import supportData from '../store/support_data.json'
import DanhSachHoaTieuDanTau from './hang_hai/DanhSachHoaTieuDanTau.vue'
import DanhSachNeoTau from './hang_hai/DanhSachNeoTau.vue'
import DanhSachTauDenCang from './hang_hai/DanhSachTauDenCang.vue'
import DanhSachTauDiChuyen from './hang_hai/DanhSachTauDiChuyen.vue'
import DanhSachTauLaiHoTro from './hang_hai/DanhSachTauLaiHoTro.vue'
import DanhSachTauRoiCang from './hang_hai/DanhSachTauRoiCang.vue'
import DanhSachViTriTauRoiCang from './hang_hai/DanhSachViTriTauRoiCang.vue'
import DanhSachXepDoHang from './hang_hai/DanhSachXepDoHang.vue'

export default {
  props: ['code', 'type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'tiny-pagination': TinyPagination,
    'danh-sach-hoa-tieu-dan-tau': DanhSachHoaTieuDanTau,
    'danh-sach-neo-tau': DanhSachNeoTau,
    'danh-sach-tau-den-cang': DanhSachTauDenCang,
    'danh-sach-tau-di-chuyen': DanhSachTauDiChuyen,
    'danh-sach-tau-lai-ho-tro': DanhSachTauLaiHoTro,
    'danh-sach-tau-roi-cang': DanhSachTauRoiCang,
    'danh-sach-vi-tri-roi-cang': DanhSachViTriTauRoiCang,
    'danh-sach-xep-do-hang': DanhSachXepDoHang
  },
  data: () => ({
    loading: true,
    supportData: supportData
  }),
  beforeCreate () {
    var vm = this
    vm.$nextTick(function () {
    })
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
    })
  },
  watch: {
  },
  methods: {
  },
  filters: {
    money (value) {
      if (value) {
        var moneyCur = (value / 1).toFixed(0).replace('.', ',')
        return moneyCur.toString().replace(/\B(?=(\d{3})+(?!\d))/g, '.') + ' VNĐ'
      } else {
        return ''
      }
    }
  }
}
</script>
