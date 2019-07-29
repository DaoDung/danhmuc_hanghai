import Vue from 'vue'
import Router from 'vue-router'
import Chi_Tiet from '@/components/Chi_Tiet2.vue'
import DanhSach from '@/components/Danh_Sach_CT.vue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/danh-sach-danh-muc',
      name: 'danh_sach_danh_muc',
      component: DanhSach,
      props: true     
    },
    {
      path: '/chi-tiet-danh-muc',
      name: 'chi_tiet_danh_muc',
      component: Chi_Tiet,
      props: true     
    }  
  ]
})