import doanhNghiepCangBien from '@/api/doanhNghiepCangBien'

const state = {
    url: {},
    total: Number,
}

const getters = {
    url: (state) => {
        return state.url
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
            doanhNghiepCangBien.getUrlInit(queries, cb, errorCb)
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
            doanhNghiepCangBien.getDanhSach( {url: getters.url.getVmaServicePorts, params: queries}, cb, errorCb)
        })
    },
    async getDetail ({ getters }, queries) {
        return new Promise((resolve, reject) => {
            let cb = (accidentList) => {
                resolve(accidentList)
            }
            let errorCb = (error) => {
                reject(error)
            }
            doanhNghiepCangBien.getDetail( {url: getters.url.getDetailVmaServicePorts, params: queries}, cb, errorCb)
        })
    },
    async them ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            doanhNghiepCangBien.them({url: getters.url.updateVmaServicePort, params: queries}, cb, errorCb)
        })
    },
    async xoa ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            doanhNghiepCangBien.xoa({url: getters.url.updateVmaServicePort, params: queries}, cb, errorCb)
        })
    },
    async sua ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            doanhNghiepCangBien.sua({url: getters.url.updateVmaServicePort, params: queries}, cb, errorCb)
        })
    },
    async getMaritimeCurrent ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            doanhNghiepCangBien.getMaritimeCurrent({url: getters.url.getMaritimeCurrent, params: queries}, cb, errorCb)
        })
    }
}

const mutations = {
    setUrl (state, payload) {
        state.url = payload
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