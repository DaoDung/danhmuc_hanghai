import Vue from 'vue'
import Router from 'vue-router'
import HomeDataTable from '@/components/Home_data_table.vue'
import Home from '@/components/Home.vue'
import HomeTauBien from '@/components/HomeTauBien.vue'
import HomeThanhToan from '@/components/HomeThanhToan.vue'
import HomeDataTableKeToan from '@/components/Home_data_table_ke_toan.vue'
import NotFound from '@/components/NotFound.vue'
import Detail from '@/components/Detail.vue'
import DetailHoSo from '@/components/DetailHoSo.vue'
import DetailTauBien from '@/components/DetailTauBien.vue'
import MessageType from '@/components/MessageType.vue'
import DetailHoSoTauBien from '@/components/DetailHoSoTauBien.vue'
import DetailHoSoTauBien2 from '@/components/DetailHoSoTauBien_2.vue'
import DetailHoSoAction from '@/components/DetailHoSoAction.vue'
import MessageTypeAction from '@/components/MessageTypeAction.vue'
import NoPermission from '@/components/NoPermission.vue'
import HomeDataTableQLTB from '@/components/Home_data_quanly_tau_bien.vue'
import DetailTB from '@/components/DetailTB.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/danh-sach-ho-so',
      component: Home,
      children: [
        {
          path: '/danh-sach-ho-so/:type/:documentTypeCode/:documentStatusCode',
          component: HomeDataTable,
          props: true
        }
      ],
      props: true
    },
    {
      path: '/quan-ly-tau-bien/:type/:documentTypeCode/:documentStatusCode',
      component: HomeTauBien,
      children: [
        {
          path: '/quan-ly-tau-bien/:type/:documentTypeCode/:documentStatusCode/:code',
          component: HomeDataTableQLTB,
          props: true
        }
      ],
      props: true
    },
    {
      path: '/tau-bien/:type/:documentTypeCode/:documentStatusCode/:id/:code',
      component: DetailTB,
      children: [
        {
          path: '/tau-bien/:type/:documentTypeCode/:documentStatusCode/:id/:code/:statusCode',
          component: DetailTauBien,
          props: true
        }
      ],
      props: true
    },
    {
      path: '/ho-so-phuong-tien/:type/:documentName/:documentYear/:documentTypeCode',
      component: Detail,
      children: [
        {
          path: '/ho-so-phuong-tien/:type/:documentName/:documentYear/:documentTypeCode/:code',
          component: DetailHoSoTauBien,
          props: true
        },
        {
          path: '/ho-so-phuong-tien/:type/:documentName/:documentYear/:documentTypeCode/:code/:id',
          component: DetailHoSoTauBien2,
          props: true
        }
      ],
      props: true
    },
    {
      path: '/ho-so/:type/:documentName/:documentYear/:documentTypeCode',
      component: Detail,
      children: [
        {
          path: '/ho-so/:type/:documentName/:documentYear/:documentTypeCode',
          component: DetailHoSo,
          children: [
            {
              path: '/ho-so/:type/:documentName/:documentYear/:documentTypeCode/:documentStatusCode',
              component: DetailHoSoAction,
              props: true
            }
          ],
          props: true
        },
        {
          path: '/ho-so/:type/:documentName/:documentYear/:documentTypeCode/:documentStatusCode/:messageType/:requestCode/:state',
          component: MessageType,
          children: [
            {
              path: '/ho-so/:type/:documentName/:documentYear/:documentTypeCode/:documentStatusCode/:messageType/:requestCode/:state',
              component: MessageTypeAction,
              props: true
            }
          ],
          props: true
        }
      ],
      props: true
    },
    {
      path: '/permission',
      component: NoPermission
    },
    {
      path: '*',
      component: NotFound
    },
    {
      path: '/danh-sach-phieu-thanh-toan/ke_toan',
      component: HomeThanhToan,
      children: [
        {
          path: '/danh-sach-phieu-thanh-toan/ke_toan/:paymentStatus',
          component: HomeDataTableKeToan,
          props: true
        }
      ],
      props: true
    }
  ]
})
