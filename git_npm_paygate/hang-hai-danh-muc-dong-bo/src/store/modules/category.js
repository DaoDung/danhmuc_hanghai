import categoryApi from '@/api/category'

const state = {
  Url: {},
  Url2: {},
  categoryModel: {},
  categoryTableItems: [],
  totalCategoryTableItems: 0,
  categoryListItems: [],
  PortRegionNameVNs: [],
  KhuVucHangHai: [],
  Category: {}
}

const getters = {
  categoryTableItems: (state) => {
    return state.categoryTableItems
  },
  totalCategoryTableItems: (state) => {
    return state.totalCategoryTableItems
  },
  categoryListItems: (state) => {
    return state.categoryListItems
  },
  Url: (state) => {
    return state.Url
  },
  Url2: (state) => {
    return state.Url2
  },
  categoryModel: (state) => {
    return state.categoryModel
  },
  PortRegionNameVNs: (state) => {
    return state.PortRegionNameVNs
  },
  KhuVucHangHai: (state) => {
    return state.KhuVucHangHai
  },
  Category: (state) => {
    return state.Category
  }
}

const actions = {

  async getUrl ({ commit }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Url) => {
        commit('setUrl', Url)
        resolve(Url)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getUrl(queries, cb, errorCb)
    })
  },
  async getUrl2 ({ commit }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Url) => {
        commit('setUrl2', Url)
        resolve(Url)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getUrl2(queries, cb, errorCb)
    })
  },
  async getCategoryTableItems ({ commit }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryTable) => {
        let data = categoryTable.data
        data.splice(0,1)
        commit('setCategoryTableItems', data)
        resolve(data)
      }
      let errorCb = (error) => {
    
        reject(error)
      }
      categoryApi.getCategoryTableItems(queries, cb, errorCb)
    }) 
  },
  async getCategoryListItems ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        let data = categoryList.data
        commit('setCategoryListItems', data)
        resolve(data)
      }
      let errorCb = (error) => {

        reject(error)
      }
      categoryApi.getCategoryListItems({url: getters.Url.getDetailDmCategories, params: queries}, cb, errorCb)
    }) 
  },
  async getDetailCategory ({ getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        resolve(categoryList)
      }
      let errorCb = (error) => {
      
        reject(error)
      }
      categoryApi.getDetailCategory({url: getters.Url.getDetail, params: queries}, cb, errorCb)
    }) 
  },
  async getMaritime ({ getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Maritime) => {
        resolve(Maritime)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getMaritime({url: getters.Url.getMaritimes, params: queries}, cb, errorCb)
    }) 
  },
  async getPortRegionNameVNs ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (PortRegionNameVNs) => {
        commit('setPortRegionNameVNs', PortRegionNameVNs.data)
        resolve(PortRegionNameVNs)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getPortRegionNameVNs({url: getters.Url.getPortRegionNameVNs, params: queries}, cb, errorCb)
    }) 
  },
  async getMaritimeCurrent ({ getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (MaritimeCurrent) => {
        resolve(MaritimeCurrent)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getMaritimeCurrent({url: getters.Url.getMaritimeCurrent, params: queries}, cb, errorCb)
    }) 
  },
  async addCategoryListItems ({ getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        //commit('setCategoryListItems', categoryList.data)
        resolve(categoryList.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.addCategoryListItems({url: getters.Url.actionUpdateDanhmuc, params: queries}, cb, errorCb)
    }) 
  },
  async editCategoryListItems ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        //commit('setCategoryListItems', categoryList.data)
        resolve(categoryList.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.editCategoryListItems({url: getters.Url.actionUpdateDanhmuc, params: queries}, cb, errorCb)
    }) 
  },
  async deleteCategoryListItems ({ getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        resolve(categoryList)
      }
      let errorCb = (error) => {
      
        reject(error)
      }
      categoryApi.deleteCategoryListItems({url: getters.Url.actionUpdateDanhmuc, params: queries}, cb, errorCb)
    }) 
  },
  async searchCategoryListItems ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        commit('setCategoryListItems', categoryList.data)
        resolve(categoryList.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.searchCategoryListItems({url: getters.Url.getDetailDmCategories, params: queries}, cb, errorCb)
    }) 
  },
  setCategoryModel ({ commit}, queries) {
    commit('setCategoryModel', queries)
  },
  async getKhuVucHangHai ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (KhuVucHangHai) => {
        commit('setKhuVucHangHai', KhuVucHangHai.data)
        resolve(KhuVucHangHai.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getKhuVucHangHai({url: getters.Url.getDetailDmCategories, params: queries}, cb, errorCb)
    }) 
  },
  async getBenCang ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (BenCang) => {
        resolve(BenCang.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getBenCang({url: getters.Url.getBenCang, params: queries}, cb, errorCb)
    }) 
  },
  async getCangBienHangHai ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (CangBienHangHai) => {
        resolve(CangBienHangHai)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getCangBienHangHai({url: getters.Url.getCangBienHangHai, params: queries}, cb, errorCb)
    }) 
  },
  async setCategory({ commit}, queries) {
    commit('setCategory', queries)
  },
  async getDanhMuc ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (DanhMuc) => {
        resolve(DanhMuc.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getDanhMuc({url: getters.Url.getDetailDmCategories, params: queries}, cb, errorCb)
    }) 
  },
  async reportExel ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (DanhMuc) => {
        resolve(DanhMuc.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.reportExel({url: getters.Url.reportExel, params: queries}, cb, errorCb)
    }) 
  },
  async getDanhMuc2 ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (DanhMuc) => {
        resolve(DanhMuc.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getDanhMuc2({url: getters.Url2.getVmaShip_Ship_URL, params: queries}, cb, errorCb)
    }) 
  },
}

const mutations = {
  setCategoryTableItems (state, payload) {
    state.categoryTableItems = payload
  },
  setCategoryListItems (state, payload) {
    state.categoryListItems = payload
  },
  setUrl (state, payload) {
    state.Url = payload
  },
  setUrl2 (state, payload) {
    state.Url2 = payload
  },
  setCategoryModel (state, payload) {
    state.categoryModel = payload
  },
  setPortRegionNameVNs (state, payload) {
    state.PortRegionNameVNs = payload
  },
  setKhuVucHangHai (state, payload) {
    state.KhuVucHangHai = payload
  },
  setCategory (state, payload) {
    state.Category = payload
  }
 }

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations
}