import Vue from 'vue'
import './plugins/vuetify'
import App from './App.vue'
import router from './router'
import eventBus from './eventbus/index'
import vuescroll from 'vue-scroll'
import './assets/main.css'
import { store } from './store/store'

Vue.config.productionTip = false
Vue.use(vuescroll)
export { eventBus }
new Vue({
  router: router,
  store: store,
  render: h => h(App),
}).$mount('#app')
