import { RepositoryFactory } from '@/api/RepositoryFactory'
const BaoCaoApi =  RepositoryFactory.get('baocao')

const state = {
  Url: {},
  Category: {},
  maritimeCurrent: {},
}

const  getters = {
  Url: (state) => {
    return state.Url
  },
  Category: (state) => {
    return state.Category
  },
  maritimeCurrent: (state) => {
    return state.maritimeCurrent
  }
}

const actions = {
  async getURLInit ({ commit }, queries) {
    return new Promise((resolve, reject) => {
      BaoCaoApi.getURLInit()
        .then(
          (res) => {
            const result = res.data
            commit('setUrl', result)
            resolve(result)   
          }
        ).catch(function (error) {
          reject(error)
        })
    })
  },
  async getMaritimeCurrent ({ commit, getters }, queries) {
    return new Promise((resolve, reject) => {
      let url = getters.Url.getMaritimeCurrent
      BaoCaoApi.getMaritimeCurrent(url)
        .then( res => {
          const result = res.data
          commit('setMaritimeCurrent', result)
          resolve(result)
        })
        .catch( err => {
          reject(err)
        })
    })
  }
}
const mutations = {
  setUrl (state, payload) {
    state.Url = payload
  },
  setMaritimeCurrent (state, payload) {
    state.maritimeCurrent = payload
  }
}

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations
}
