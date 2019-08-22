import Vue from 'vue'
import Vuex from 'vuex'
import baocao from './modules/baocao'
Vue.use(Vuex)

export const store = new Vuex.Store({
  modules: {
    baocao
  }
})