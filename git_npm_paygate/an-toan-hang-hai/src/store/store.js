import Vue from 'vue'
import Vuex from 'vuex'
import TaiNanHangHai from './modules/TaiNanHangHai'
Vue.use(Vuex)

export const store = new Vuex.Store({
  modules: {
    TaiNanHangHai
  }
})