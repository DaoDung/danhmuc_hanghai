<template>

  <v-layout wrap>
    <v-flex>
      <content-placeholders v-if="loading">
        <content-placeholders-img />
        <content-placeholders-heading />
      </content-placeholders>
      <danh-sach-du-tau
        v-else-if="code === 'DanhSachDuTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-du-tau>

      <danh-sach-ghi-chu-canh-bao
        v-else-if="code === 'DanhSachGhiChuCanhBao'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-ghi-chu-canh-bao>

      <danh-sach-ha-xuong
        v-else-if="code === 'DanhSachHaXuong'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-ha-xuong>
  
      <danh-sach-hoa-tieu-dan-tau
        v-else-if="code === 'DanhSachHoaTieuDanTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-hoa-tieu-dan-tau>
      
      <danh-sach-ke-hoach-chuyen-tuyen
        v-else-if="code === 'DanhSachKeHoachChuyenTuyen'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-ke-hoach-chuyen-tuyen>

      <danh-sach-kien-nghi-hang-hai
        v-else-if="code === 'DanhSachKhangNghiHangHai'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-kien-nghi-hang-hai>

      <danh-sach-neo-tau
        v-else-if="code === 'DanhSachNeoTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-neo-tau>

      <danh-sach-phuong-tien-thuy-noi-dia
        v-else-if="code === 'DanhSachPhuongTienThuyNoiDia'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-phuong-tien-thuy-noi-dia>
      

      <danh-sach-sua-chua-tau
        v-else-if="code === 'DanhSachSuaChuaTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-sua-chua-tau>

      <danh-sach-tau-bien
        v-else-if="code === 'DanhSachTauBien'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-tau-bien>

      <danh-sach-tau-den-cang
        v-else-if="code === 'DanhSachTauDenCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-tau-den-cang>

      <danh-sach-tau-di-chuyen
        v-else-if="code === 'DanhSachTauDiChuyen'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-tau-di-chuyen>

      <danh-sach-tau-lai-ho-tro
        v-else-if="code === 'DanhSachTauLaiHoTro'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-tau-lai-ho-tro>

      <danh-sach-tau-roi-cang
        v-else-if="code === 'DanhSachTauRoiCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-tau-roi-cang>

      <danh-sach-thu-tau
        v-else-if="code === 'DanhSachThuTau'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-thu-tau>

      <danh-sach-vi-tri-tau-roi-cang
        v-else-if="code === 'DanhSachViTriTauRoiCang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-vi-tri-tau-roi-cang>

      <danh-sach-xep-do-hang
        v-else-if="code === 'DanhSachXepDoHang'"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      ></danh-sach-xep-do-hang>
    </v-flex>
  </v-layout>

</template>

<script>
import supportData from '../store/support_data.json'

import DanhSachDuTau from './hang_hai/DanhSachDuTau.vue'
import DanhSachGhiChuCanhBao from './hang_hai/DanhSachGhiChuCanhBao.vue'
import DanhSachHaXuong from './hang_hai/DanhSachHaXuong.vue'
import DanhSachHoaTieuDanTau from './hang_hai/DanhSachHoaTieuDanTau.vue'
import DanhSachKeHoachChuyenTuyen from './hang_hai/DanhSachKeHoachChuyenTuyen.vue'
import DanhSachKhangNghiHangHai from './hang_hai/DanhSachKhangNghiHangHai.vue'
import DanhSachNeoTau from './hang_hai/DanhSachNeoTau.vue'
import DanhSachPhuongTienThuyNoiDia from './hang_hai/DanhSachPhuongTienThuyNoiDia.vue'
import DanhSachSuaChuaTau from './hang_hai/DanhSachSuaChuaTau.vue'
import DanhSachTauBien from './hang_hai/DanhSachTauBien.vue'
import DanhSachTauDenCang from './hang_hai/DanhSachTauDenCang.vue'
import DanhSachTauDiChuyen from './hang_hai/DanhSachTauDiChuyen.vue'
import DanhSachTauLaiHoTro from './hang_hai/DanhSachTauLaiHoTro.vue'
import DanhSachTauRoiCang from './hang_hai/DanhSachTauRoiCang.vue'
import DanhSachThuTau from './hang_hai/DanhSachThuTau.vue'
import DanhSachViTriTauRoiCang from './hang_hai/DanhSachViTriTauRoiCang.vue'
import DanhSachXepDoHang from './hang_hai/DanhSachXepDoHang.vue'

export default {
  props: ['code', 'type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'danh-sach-du-tau': DanhSachDuTau,
    'danh-sach-ghi-chu-canh-bao': DanhSachGhiChuCanhBao,
    'danh-sach-ha-xuong': DanhSachHaXuong,
    'danh-sach-hoa-tieu-dan-tau': DanhSachHoaTieuDanTau,
    'danh-sach-ke-hoach-chuyen-tuyen': DanhSachKeHoachChuyenTuyen,
    'danh-sach-kien-nghi-hang-hai': DanhSachKhangNghiHangHai,
    'danh-sach-neo-tau': DanhSachNeoTau,
    'danh-sach-phuong-tien-thuy-noi-dia': DanhSachPhuongTienThuyNoiDia,
    'danh-sach-sua-chua-tau': DanhSachSuaChuaTau,
    'danh-sach-tau-bien': DanhSachTauBien,
    'danh-sach-tau-den-cang': DanhSachTauDenCang,
    'danh-sach-tau-di-chuyen': DanhSachTauDiChuyen,
    'danh-sach-tau-lai-ho-tro': DanhSachTauLaiHoTro,
    'danh-sach-tau-roi-cang': DanhSachTauRoiCang,
    'danh-sach-thu-tau': DanhSachThuTau,
    'danh-sach-vi-tri-tau-roi-cang': DanhSachViTriTauRoiCang,
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
