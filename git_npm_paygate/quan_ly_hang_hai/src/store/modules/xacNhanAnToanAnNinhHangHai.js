import xacNhanAnToanAnNinhHangHai from '@/api/xacNhanAnToanAnNinhHangHai'

const state = {
    url: {},
    url2: {},
    total: Number,
    maritimeCurrent: {}
}

const getters = {
    url: (state) => {
        return state.url
    },
    url2: (state) => {
        return state.url2
    },
    total: (state) => {
        return state.total
    },
    maritimeCurrent: (state) => {
        return state.maritimeCurrent
    }
}

const actions = {
    async getUrlInit ({commit}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (url) => {
                commit('setUrl1', url)
                resolve(url)
            }
            let errorCb = (error) => {
                reject(error)
            }
            xacNhanAnToanAnNinhHangHai.getUrlInit(queries, cb, errorCb)
        })
    },
    async getUrlInit2 ({commit}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (url) => {
                commit('setUrl2', url)
                resolve(url)
            }
            let errorCb = (error) => {
                reject(error)
            }
            xacNhanAnToanAnNinhHangHai.getUrlInit2(queries, cb, errorCb)
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
            xacNhanAnToanAnNinhHangHai.getDanhSach( { getters: getters, params: queries}, cb, errorCb)
        })
    },
    // async getDetail ({ getters }, queries) {
    //     return new Promise((resolve, reject) => {
    //         let cb = (accidentList) => {
    //             resolve(accidentList)
    //         }
    //         let errorCb = (error) => {
    //             reject(error)
    //         }
    //         hoatDongNaoVet.getDetail( {url: getters.url.getDetailVmaHoatDongNaoVets, params: queries}, cb, errorCb)
    //     })
    // },
    // async them ({getters}, queries) {
    //     return new Promise((resolve, reject) => {
    //         let cb = (res) => {
    //             resolve(res)
    //         }
    //         let errorCb = (error) => {
    //             reject(error)
    //         }
    //         hoatDongNaoVet.them({url: getters.url.updateVmaHoatDongNaoVet, params: queries}, cb, errorCb)
    //     })
    // },
    // async xoa ({getters}, queries) {
    //     return new Promise((resolve, reject) => {
    //         let cb = (res) => {
    //             resolve(res)
    //         }
    //         let errorCb = (error) => {
    //             reject(error)
    //         }
    //         hoatDongNaoVet.xoa({url: getters.url.updateVmaHoatDongNaoVet, params: queries}, cb, errorCb)
    //     })
    // },
    // async sua ({getters}, queries) {
    //     return new Promise((resolve, reject) => {
    //         let cb = (res) => {
    //             resolve(res)
    //         }
    //         let errorCb = (error) => {
    //             reject(error)
    //         }
    //         hoatDongNaoVet.sua({url: getters.url.updateVmaHoatDongNaoVet, params: queries}, cb, errorCb)
    //     })
    // },
    async getMaritimeCurrent ({commit, getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                commit('setMaritimeCurrent', res)
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            xacNhanAnToanAnNinhHangHai.getMaritimeCurrent({url: getters.url.getMaritimeCurrent, params: queries}, cb, errorCb)
        })
    },
    async getDetail ({ getters }, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res)
            }
            let errorCb = (error) => {
                reject(error)
            }
            xacNhanAnToanAnNinhHangHai.getDetail( {url: getters.url.getDetailVmaHoatDongNaoVets, params: queries}, cb, errorCb)
        })
    }, 
    async loadDataDM ({getters}, queries) {
        return new Promise((resolve, reject) => {
            let cb = (res) => {
                resolve(res.data)
            }
            let errorCb = (error) => {
                reject(error)
            }
            xacNhanAnToanAnNinhHangHai.loadDataDM( {url: getters.url.getDetailVmaHoatDongNaoVets, params: queries}, cb, errorCb)
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
            xacNhanAnToanAnNinhHangHai.sua({url: getters.url2.updateVmaShipURL, params: queries}, cb, errorCb)
        })
    },
}

const mutations = {
    setUrl1 (state, payload) {
        state.url = payload
    },
    setUrl2 (state, payload) {
        state.url2 = payload
    },
    setTotal (state, payload) {
        state.total = payload
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