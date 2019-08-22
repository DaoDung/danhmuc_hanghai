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
      let cb = (Url) => {
        commit('setUrl', Url)
        resolve(Url)   
      }
      let errorCb = (error) => {
        reject(error)
      }
      BaoCaoApi.getURLInit()
        .then(
          (res) => {
            const result = res.data
            cb(result) 
          }
        ).catch(function (error) {
          errorCb(error)
        })
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
      let url = getters.Url.getMaritimeCurrent
      BaoCaoApi.getMaritimeCurrent(url)
        .then( res => {
          const result = res.data
          cb(result) 
        })
        .catch( err => {
          errorCb(err)
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
