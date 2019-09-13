import Vue from 'vue'
import Router from 'vue-router'
import ChiTietTaiNan from '@/components/ChiTietTaiNan.vue'
import DanhSachTaiNan from '@/components/DanhSachTaiNan.vue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/danh-sach-tai-nan',
      name: 'danh_sach_tai_nan',
      component: DanhSachTaiNan
    },
    {
      path: '/chi-tiet-tai-nan',
      name: 'chi_tiet_tai_nan',
      component: ChiTietTaiNan
    }  
  ]
})