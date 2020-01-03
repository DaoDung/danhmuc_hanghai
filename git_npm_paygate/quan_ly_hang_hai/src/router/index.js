import Vue from 'vue'
import Router from 'vue-router'
import QuanLyHoatDongNaoVet from '../QuanLyHoatDongNaoVet.vue'
import QuanLyAnToanHangHai from '../QuanLyAnToanHangHai.vue'
import QuanLyDoanhNghiepCangBien from '../QuanLyDoanhNghiepCangBien.vue'
import QuanLyThongTinCangBien from '../QuanLyThongTinCangBien.vue'
import DanhSachViPhamHanhChinh from '../DanhSachViPhamHanhChinh.vue'
import ChiTietViPhamHanhChinh from '../ChiTietViPhamHanhChinh.vue'
import XacNhanAnToanAnNinhHangHai from '../XacNhanAnToanAnNinhHangHai.vue'

import QuanLy from '../QuanLy.vue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/quan-ly-hoat-dong-nao-vet',
      name: 'quan-ly-hoat-dong-nao-vet',
      component: QuanLyHoatDongNaoVet
    },
    {
      path: '/quan-ly',
      name: 'quan-ly',
      component: QuanLy
    },
    {
      path: '/quan-ly-an-toan-hang-hai',
      name: 'quan-ly-an-toan-hang-hai',
      component: QuanLyAnToanHangHai,
    },
    {
      path: '/quan-ly-doanh-nghiep-cang-bien',
      name: 'quan-ly-doanh-nghiep-cang-bien',
      component: QuanLyDoanhNghiepCangBien,
    },
    {
      path: '/quan-ly-thong-tin-cang-bien',
      name: 'quan-ly-thong-tin-cang-bien',
      component: QuanLyThongTinCangBien,
    },
    {
      path: '/quan-ly-vi-pham-hanh-chinh',
      name: 'quan-ly-vi-pham-hanh-chinh',
      component: DanhSachViPhamHanhChinh,
    },
    {
      path: '/xac-nhan-an-toan-an-ninh-hang-hai',
      name: 'xac-nhan-an-toan-an-ninh-hang-hai',
      component: XacNhanAnToanAnNinhHangHai,
    },
    {
      path: '/chi-tiet-vi-pham-hanh-chinh',
      name: 'chi-tiet-vi-pham-hanh-chinh',
      component: ChiTietViPhamHanhChinh,
    } 
  ]
})