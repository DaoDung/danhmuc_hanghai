import TaiNanHangHai from '@/api/TaiNanHangHai'

const state = {
    maritimes: {},
    url: {},
    taiNanHangHai: {},
    total: Number,
}

const getters = {
    url: (state) => {
        return state.url
    },
    taiNanHangHai: (state) => {
        return state.taiNanHangHai
    },
    total: (state) => {
        return state.total
    }
}

const actions = {
    async getUrlInit ({commit}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (url) => {
                commit('setUrl', url)
                resolve(url)
            }
            let errorCb = (error) => {
                reject(error)
            }
            TaiNanHangHai.getUrlInit(queries, cb, errorCb)
        })
    },
    async getDanhSach ({ commit, getters }, queries) {
        return new Promise((resolve, reject) => {
            let cb = (result) => {
                commit('setTotal', result.total)
                resolve(result.data)
            }
            let errorCb = (error) => {
                reject(error)
            }
            TaiNanHangHai.getDanhSach( {url: getters.url.getdanhsach, params: queries}, cb, errorCb)
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
          TaiNanHangHai.getMaritimeCurrent({url: getters.url.getMaritimeCurrent, params: queries}, cb, errorCb)
        }) 
    },
    async themTaiNan ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            TaiNanHangHai.themTaiNan({url: getters.url.themTaiNan, params: queries}, cb, errorCb)
        })
    },
    async xoaTaiNan ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            TaiNanHangHai.xoaTaiNan({url: getters.url.xoaTaiNan, params: queries}, cb, errorCb)
        })
    },
    async suaTaiNan ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            TaiNanHangHai.suaTaiNan({url: getters.url.suaTaiNan, params: queries}, cb, errorCb)
        })
    },
    setTaiNanHangHai ({ commit,  }, queries) {
        commit('TaiNanHangHai', queries)
    },
}

const mutations = {
    setUrl (state, payload) {
        state.url = payload
    },
    TaiNanHangHai(state, payload) {
        state.taiNanHangHai = payload
    },
    setTotal (state, payload) {
        state.total = payload
    }
}

export default {
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}