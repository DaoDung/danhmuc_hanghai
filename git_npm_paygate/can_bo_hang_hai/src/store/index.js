import Vue from 'vue'
import Vuex from 'vuex'
import toastr from 'toastr'
import axios from 'axios'
import support from './support.json'
// import router from '@/router'

Vue.use(toastr)
Vue.use(Vuex)

export const store = new Vuex.Store({
  state: {
    initData: null,
    loading: false,
    loadingTable: false,
    loadingSubmit: false,
    error: null,
    docTypes: null,
    roleFilterStatus: null,
    userSignsData: null
  },
  actions: {
    clearError ({commit}) {
      commit('clearError')
    },
    loadInitResource ({commit, state}) {
      if (state.initData == null) {
        return new Promise(function (resolve, reject) {
          let param = {}
          let orginURL = window.location.href
          let coma = window.location.href.lastIndexOf('#/')
          if (coma > 0) {
            orginURL = window.location.href.substr(0, coma)
          }
          var url1 = new Promise(function (resolve, reject) {
            axios.get(orginURL + support.renderURLInit, param).then(function (response) {
              let serializable = response.data
              resolve(serializable)
            }).catch(function (error) {
              console.log(error)
              reject(error)
            })
          })
          var url2 = new Promise(function (resolve, reject) {
            axios.get(orginURL + support.renderURLInit2, param).then(function (response) {
              let serializable = response.data
              resolve(serializable)
            }).catch(function (error) {
              console.log(error)
              reject(error)
            })
          })
          var url3 = new Promise(function (resolve, reject) {
            axios.get(orginURL + support.renderURLInit3, param).then(function (response) {
              let serializable = response.data
              resolve(serializable)
            }).catch(function (error) {
              console.log(error)
              reject(error)
            })
          })
          Promise.all([url1, url2, url3]).then(function (results) {
            var data = Object.assign(results[0], results[1], results[2])
            commit('setInitData', data)
            resolve(data)
          }).catch(function (xhr) {
            commit('setInitData', null)
            reject(null)
          })
        })
      } else {
        return new Promise((resolve, reject) => {
          resolve(state.initData)
        })
      }
    },
    loadHomeDataTable ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: data
          }
          if (data.type === 'ke_hoach') {
            param.params['requestState'] = data.documentStatusCode
          } else if (data.type === 'thu_tuc') {
            param.params['documentStatusCode'] = data.documentStatusCode
          }
          param.params['isDTND'] = state.initData.user.isDTND
          param.params['isDTNDCam'] = state.initData.user.isDTNDCam
          let urlRequest = ''
          if (data.type === 'ke_hoach') {
            urlRequest = state.initData.getHoSoKeHoachTable
          } else if (data.type === 'thu_tuc') {
            urlRequest = state.initData.getHoSoThuTucTable
          } else if (data.type === 'lanh_dao') {
            urlRequest = state.initData.getHistoryTable
            param.params['documentTypeCode'] = 'document_sign'
          } else if (data.type === 'van_thu') {
            urlRequest = state.initData.getHistoryTable
            param.params['documentTypeCode'] = 'document_approve'
          } else {
            urlRequest = state.initData.getHoSoKeHoachTable
          }
          axios.get(urlRequest, param).then(function (response) {
            let serializable = response.data
            console.log(serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadThanhPhanTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getThanhPhanTauBien, data).then(function (response) {
            let serializable = response.data
            console.log(serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDanhSachTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          // if (data.type === 'ke_hoach') {
          //   param.params['requestState'] = data.documentStatusCode
          // } else if (data.type === 'thu_tuc') {
          //   param.params['documentStatusCode'] = data.documentStatusCode
          // }
          // param.params['isDTND'] = state.initData.user.isDTND
          // param.params['isDTNDCam'] = state.initData.user.isDTNDCam
          let urlRequest = data.url
          let query = {}
          for (var key in data) {
            if (key !== 'url') {
              query[key] = data[key]
            }
          }
          let param = {
            params: query
          }
          // if (data.type === 'ke_hoach') {
          //   urlRequest = state.initData.getHoSoKeHoachTable
          // } else if (data.type === 'thu_tuc') {
          //   urlRequest = state.initData.getHoSoThuTucTable
          // } else if (data.type === 'lanh_dao') {
          //   urlRequest = state.initData.getHistoryTable
          //   param.params['documentTypeCode'] = 'document_sign'
          // } else if (data.type === 'van_thu') {
          //   urlRequest = state.initData.getHistoryTable
          //   param.params['documentTypeCode'] = 'document_approve'
          // } else {
          //   urlRequest = state.initData.getHoSoKeHoachTable
          // }
          axios.get(urlRequest, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadLenhDieuDongEXT ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: data
          }
          axios.get(state.initData.getLenhDieuDongEXT, param).then(function (response) {
            let serializable = response.data
            console.log(serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadHomeDataPaymentTable ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: data
          }
          axios.get(state.initData.getPaymentData, param).then(function (response) {
            let serializable = response.data
            console.log(serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDocTypes ({commit, state}) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getDocTypes).then(function (response) {
            let serializable = response.data
            commit('setDocTypes', serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadRoleFilterStatus ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              documentType: filter.documentType
            }
          }
          axios.get(state.initData.getRoleFilterStatus, param).then(function (response) {
            let serializable = response.data
            commit('setRoleFilterStatus', serializable)
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailHoSo ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentType': filter.documentType,
              'documentName': filter.documentName,
              'documentYear': filter.documentYear,
              'type': filter.type
            }
          }
          axios.get(state.initData.getDetailByDocumentName, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadFlagStateOfShip ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getFlagStateOfShip, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadShipOwner ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getShipOwner, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDataDm ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: {}
        }
        for (var key in data) {
          param.params[key] = data[key]
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getDetailDmCategories, param).then(function (response) {
            let serializable = response.data['data']
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDataDmDetail ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: {}
        }
        for (var key in data) {
          param.params[key] = data[key]
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getDetail, param).then(function (response) {
            let serializable = response.data['data']
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadChanelList ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getDetailDmCategories, {
            params: {
              categoryId: 'DM_TUYEN_LUONG'
            }
          }).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadPortWharf ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getPortWharf, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadShipType ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getShipType, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadChanelCodeList ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getChanelCodeList, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadPort ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getPort, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadPurpose ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getPurpose, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadCargo ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getCago, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadShipAgency ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getShipAgency, {}).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'vmaShipId': data.id
            }
          }
          axios.get(state.initData.getVmaShip_Detail_URL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailPTTND ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'vmaShipId': data.id
            }
          }
          axios.get(state.initData.getVmaShip_Detail_URL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailHoaTieuDanTau ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'id': data.id,
              'documentType': data.documentType,
              'documentName': data.documentName,
              'documentYear': data.documentYear,
              'type': data.type
            }
          }
          axios.get(state.initData.getDetailHoaTieuDanTau, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetail_PTTND_DenCang ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'id': data.id,
              'documentType': data.documentType,
              'documentName': data.documentName,
              'documentYear': data.documentYear,
              'type': data.type
            }
          }
          axios.get(state.initData.getDetailPTTNDDenCang, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailTauDenCang ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'vmaItineraryScheduleId': data.id
            }
          }
          axios.get(state.initData.getVmaItinerarySchedule_Detail_URL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailTauDiChuyen ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'vmaScheduleShiftingId': data.id
            }
          }
          axios.get(state.initData.getVmaScheduleShifting_Detail_URL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetaiTauLaiHoTro ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'id': data.id,
              'documentType': data.documentType,
              'documentName': data.documentName,
              'documentYear': data.documentYear
            }
          }
          axios.get(state.initData.getDetailTauBien, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadDetailTauRoiCang ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'vmaItineraryScheduleId': data.id
            }
          }
          axios.get(state.initData.getVmaItinerarySchedule_Detail_URL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addPTTNDTauDenCang ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addPTTNDTauDenCang, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          console.log('state.initData.addVmaShipURL++++++++++', state.initData.addVmaShipURL)
          let param = {
            params: data
          }
          axios.get(state.initData.addVmaShipURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    deleteTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: data
          }
          axios.get(state.initData.deleteTauBien, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    editTauBien ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.updateVmaShipURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    deletePhuongTienThuyNoiDia ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.deletePhuongTienThuyNoiDia, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    editPhuongTienThuyNoiDia ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.updateVmaShipURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addPhuongTienThuyNoiDia ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: data
          }
          axios.get(state.initData.addVmaShipURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addTauDiChuyen ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addVmaScheduleShiftingURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    editTauDiChuyen ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.updateVmaScheduleShiftingURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addTauRoiCang ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addTauRoiCang, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addTauNeoDau ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addVmaScheduleAnchorageURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addTauLaiHoTro ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addTauLaiHoTro, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addHoaTieuDanTau ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addHoaTieuDanTau, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addVmaItinerary ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addVmaItineraryScheduleURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    addVmaItinerarySchedule ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.addVmaItineraryScheduleURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    updateVmaItinerarySchedule ({commit, state}, data) {
      return new Promise((resolve, reject) => {
        let param = {
          params: data
        }
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.updateVmaItineraryScheduleURL, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadKhaiBaoHoSo ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentName': filter.maBanKhai,
              'documentYear': filter.documentYear
            }
          }
          axios.get(state.initData.getThongTinKhaiBaoTable, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadMessageType23EXT ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentName': filter.maBanKhai,
              'documentYear': filter.documentYear
            }
          }
          axios.get(state.initData.getMessageType23EXT, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadPhanHoi ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentName': filter.maBanKhai,
              'documentYear': filter.documentYear
            }
          }
          axios.get(state.initData.getPhanHoiTuCoQuanChuyenNganhTable, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadGhiChu ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentName': filter.maBanKhai,
              'documentYear': filter.documentYear,
              'ministryCode': filter.ministryCode
            }
          }
          axios.get(state.initData.exportPDFDetail, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    loadUserSigns ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'documentType': filter.documentType,
              'documentName': filter.documentName,
              'documentYear': filter.documentYear,
              'messageType': filter.messageType,
              'REQUEST_CODE': filter.requestCode,
              'roleType': filter.roleType
            }
          }
          axios.get(state.initData.checkThanhPhanActionButton, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    getListPortWharf ({commit, state}, filter) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          let param = {
            params: {
              'harbourCode': filter.harbourCode,
              'documentName': filter.documentName,
              'documentYear': filter.documentYear
            }
          }
          axios.get(state.initData.getListPortWharf, param).then(function (response) {
            let serializable = response.data
            resolve(serializable)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    },
    getTinMois ({commit, state}) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          axios.get(state.initData.getNotifications).then(function (response) {
            let serializable = response.data
            resolve(serializable.data)
          }).catch(function (error) {
            console.log(error)
            reject(error)
          })
        })
      })
    }
  },
  mutations: {
    setLoading (state, payload) {
      state.loading = payload
    },
    setLoadingTable (state, payload) {
      state.loadingTable = payload
    },
    setLoadingSubmit (state, payload) {
      state.loadingSubmit = payload
    },
    setError (state, payload) {
      state.error = payload
    },
    setInitData (state, payload) {
      state.initData = payload
    },
    clearError (state) {
      state.error = null
    },
    setDocTypes (state, payload) {
      state.docTypes = payload
    },
    setRoleFilterStatus (state, payload) {
      state.roleFilterStatus = payload
    }
  },
  getters: {
    loading (state) {
      return state.loading
    },
    loadingTable (state) {
      return state.loadingTable
    },
    loadingSubmit (state) {
      return state.loadingSubmit
    },
    loadingInitData (state) {
      return new Promise((resolve, reject) => {
        store.dispatch('loadInitResource').then(function (result) {
          resolve(result)
        })
      })
    },
    error (state) {
      return state.error
    },
    index (state) {
      return state.index
    },
    docTypes (state) {
      if (state.docTypes === null) {
        return new Promise((resolve, reject) => {
          store.dispatch('loadDocTypes').then(function (result) {
            resolve(result)
          })
        })
      } else {
        return new Promise((resolve, reject) => {
          resolve(state.docTypes)
        })
      }
    },
    roleFilterStatus (state) {
      return (filter) => {
        return new Promise((resolve, reject) => {
          store.dispatch('loadRoleFilterStatus', filter).then(function (result) {
            resolve(result)
          })
        })
      }
    }
  }
})
