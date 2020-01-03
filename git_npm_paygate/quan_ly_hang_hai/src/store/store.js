import Vue from 'vue'
import Vuex from 'vuex'
import TaiNanHangHai from './modules/TaiNanHangHai'
import hoatDongNaoVet from './modules/hoatDongNaoVet'
import doanhNghiepCangBien from './modules/doanhNghiepCangBien'
import thongTinCangBien from './modules/thongTinCangBien'
import xacNhanAnToanAnNinhHangHai from './modules/xacNhanAnToanAnNinhHangHai'
Vue.use(Vuex)

export const store = new Vuex.Store({
  modules: {
    TaiNanHangHai,
    hoatDongNaoVet,
    doanhNghiepCangBien,
    thongTinCangBien,
    xacNhanAnToanAnNinhHangHai
  }
})