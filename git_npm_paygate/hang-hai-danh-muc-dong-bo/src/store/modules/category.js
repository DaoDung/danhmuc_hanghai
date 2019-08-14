import categoryApi from '@/api/category'

const state = {
  Url: {},
  Url2: {},
  categoryModel: {},
  categoryTableItems: [],
  totalCategoryTableItems: 0,
  categoryListItems: [],
  Category: {},
  maritimeCurrent: {},
  totalCategory: 0
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
  Category: (state) => {
    return state.Category
  },
  maritimeCurrent: (state) => {
    return state.maritimeCurrent
  },
  totalCategory: (state) => {
    return state.totalCategory
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
  async getCategoryTableItems ({ commit, getters }, queries) {
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
      categoryApi.getCategoryTableItems({url: getters.Url.getDmSyncCategories}, cb, errorCb)
    }) 
  },
  async getCategoryListItems ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (categoryList) => {
        let data = categoryList.data
        commit('setCategoryListItems', data)
        commit('setTotalCategory', categoryList.total)
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
  async getMaritimeCurrent ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (MaritimeCurrent) => {
        commit('setMaritimeCurrent', MaritimeCurrent)
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
        commit('setTotalCategory', categoryList.total)
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
  async getUsers ({commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Users) => {
        commit('setTotalCategory', Users.total)
        resolve(Users.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getUsers({url: getters.Url.getUsers, params: queries}, cb, errorCb)
    }) 
  },
  async getVmaTransactionTypes ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Data) => {
        resolve(Data.data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      categoryApi.getVmaTransactionTypes({url: getters.Url.getVmaTransactionTypes, params: queries}, cb, errorCb)
    }) 
  },
  async updateUserPort ({getters }, queries) {
    return new Promise((resolve, reject) => {
      let cb = (Data) => {
        resolve(Data)
      }
      let errorCb = (error) => {
        reject(error)
      }
      let url =[]
      let departmentCode = queries.departmentCode
      queries.users.forEach(function(element) {
        let params = {
          departmentCode: departmentCode,
          userId: element.userId,
          status: element.status
        }
        let callApi = categoryApi.updateUserPort({url: getters.Url.updateUserPort, params: params}, cb, errorCb)
        url.push(callApi)
      })
      console.log(url)
      Promise.all(url)

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
  setCategory (state, payload) {
    state.Category = payload
  },
  setMaritimeCurrent (state, payload) {
    state.maritimeCurrent = payload
  },
  setTotalCategory (state, payload) {
    state.totalCategory = payload
  }
 }

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations
}