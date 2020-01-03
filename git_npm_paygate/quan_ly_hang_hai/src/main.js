import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import router from './router'
import { store } from './store/store'
import money from 'v-money'
import List from '@/components/BCSPHC/hanghai_detail_nhap_lieu_list'
import HTPT from '@/components/BCSPHC/hanghai_detail_nhap_lieu'

import Notifications from 'vue-notification'
import VueNumeric from 'vue-numeric'
Vue.use(Notifications)
Vue.use(HTPT)
Vue.use(List)
Vue.use(VueNumeric)
Vue.use(money, {precision: 4})
Vue.config.productionTip = false
Vue.component(HTPT.name, HTPT)
Vue.component(List.name, List)

Vue.notify({
  group: 'foo',
  title: 'Important message',
  text: 'Hello user! This is a notification!'
})
new Vue({
  vuetify,
  router: router,
  store: store,
  render: h => h(App)
}).$mount('#app')
