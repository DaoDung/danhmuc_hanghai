import Vue from 'vue'
import Vuex from 'vuex'
import category from './modules/category'
Vue.use(Vuex)

export const store = new Vuex.Store({
  modules: {
    category
  }
})