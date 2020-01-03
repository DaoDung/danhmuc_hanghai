import axios from 'axios'
var renderURLInit = "?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit"
var orginURL = window.location.href
var endPoit = orginURL.substr(0, orginURL.lastIndexOf('#')) + renderURLInit
// window._danhSachTaiNan = [
//     {
//         id: 1,
//         portofAuthority: '19',
//         accidentCode: '1',
//         acidentTime: '2014-10-01 17:24:30.0',
//         accidentRegion: 'Ngõ 32, Hoàng Quốc Việt',
//         accidentBrief: 'Thật là kinh khủng',
//         accidentConslusion: 'Kết luật sử lý và khiến nghị',
//         accidentType: '1',
//         accidentTime: '2014-10-01 17:24:30.0',
//         accidentCriticalType: '1',
//         nameOfShip: 'Tên tàu 1 Kết luật sử lý và khiến nghị',
//         imoNumber: '214323',
//         callSign: '38233',
//         flagStateOfShip: 'Việt Nam',
//         registryNumber: '233331',
//         decisionNo: '23321',
//         decisionDate: '2014-10-01 17:24:30.0',
//         decisionOrganization: 'Cơ quan Hải Phòng',
//         officialDate: '2014-10-01 17:24:30.0',
//         officiaNo: '23',
//         officialPlace: 'Hải Dương',
//         violationDate: '2014-10-01 17:24:30.0',
//         violationPartCode: '234324234',
//         issueDate: '2014-10-01 17:24:30.0',
//         issueBy: 'Phả Lại',
//         violationPartName: 'Đơn vị Hải Phòng',
//         violationPartAddress: 'Hải Phòng',
//         representative: 'Đào Văn Dũng',
//         representativeTitle: 'Tổng thống',
//         modifiedDate: '2014-10-01 17:24:30.0',
//         numberOfDead: '2',
//         numberOfInjured: '3',
//         investigationDate: '2014-10-01 17:24:30.0',
//         accidentOfficialDate: '2014-10-01 17:24:30.0',
//         investigationOffice: 'Đơn vị điều tra 1',
//         remarksOfCargo: 'Hỏng quạt',
//         remarksOfEnvironment: 'Đổ cây',
//         remarksOfShip: 'Hỏng xe',
//         pilotOnBoad: 1
//     },
//     {
//         id: 2,
//         portofAuthority: '19',
//         accidentCode: '1',
//         numberOfDead: '2',
//         acidentTime: '2014-10-01 17:24:30.0',
//         accidentRegion: 'Ngõ 32, Hoàng Quốc Việt',
//         accidentBrief: 'Thật là kinh khủng',
//         accidentConslusion: 'Kết luật sử lý và khiến nghị',
//         accidentType: '1',
//         accidentCriticalType: '1',
//         nameOfShip: 'Tên tàu 2',
//         accidentTime: '2014-10-01 17:24:30.0',
//         imoNumber: '214323',
//         callSign: '38233',
//         flagStateOfShip: 'Việt Nam',
//         registryNumber: '233331',
//         decisionNo: '23321',
//         decisionDate: '2014-10-01 17:24:30.0',
//         decisionOrganization: 'Cơ quan Hải Phòng',
//         officialDate: '2014-10-01 17:24:30.0',
//         officiaNo: '23',
//         officialPlace: 'Hải Dương',
//         violationDate: '2014-10-01 17:24:30.0',
//         violationPartCode: '234324234',
//         issueDate: '2014-10-01 17:24:30.0',
//         issueBy: 'Phả Lại',
//         violationPartName: 'Đơn vị Hải Phòng',
//         violationPartAddress: 'Hải Phòng',
//         representative: 'Đào Văn Dũng',
//         representativeTitle: 'Tổng thống',
//         modifiedDate: '2014-10-01 17:24:30.0',
//         numberOfInjured: '3',
//         investigationDate: '2014-10-01 17:24:30.0',
//         accidentOfficialDate: '2014-10-01 17:24:30.0',
//         investigationOffice: 'Đơn vị điều tra 1',
//         remarksOfCargo: 'Hỏng quạt',
//         remarksOfEnvironment: 'Đổ cây',
//         remarksOfShip: 'Hỏng xe',
//         pilotOnBoad: 0
//     },
//     {
//         id: 3,
//         portofAuthority: '19',
//         accidentCode: '1',
//         acidentTime: '2014-10-01 17:24:30.0',
//         accidentRegion: 'Ngõ 32, Hoàng Quốc Việt',
//         accidentBrief: 'Thật là kinh khủng',
//         accidentConslusion: 'Kết luật sử lý và khiến nghị',
//         accidentType: '1',
//         accidentTime: '2014-10-01 17:24:30.0',
//         accidentCriticalType: '1',
//         nameOfShip: 'Tên tàu 3',
//         imoNumber: '214323',
//         callSign: '38233',
//         numberOfDead: '2',
//         numberOfInjured: '3',
//         flagStateOfShip: 'Việt Nam',
//         registryNumber: '233331',
//         decisionNo: '23321',
//         decisionDate: '2014-10-01 17:24:30.0',
//         decisionOrganization: 'Cơ quan Hải Phòng',
//         officialDate: '2014-10-01 17:24:30.0',
//         officiaNo: '23',
//         officialPlace: 'Hải Dương',
//         violationDate: '2014-10-01 17:24:30.0',
//         violationPartCode: '234324234',
//         issueDate: '2014-10-01 17:24:30.0',
//         issueBy: 'Phả Lại',
//         violationPartName: 'Đơn vị Hải Phòng',
//         violationPartAddress: 'Hải Phòng',
//         representative: 'Đào Văn Dũng',
//         representativeTitle: 'Tổng thống',
//         modifiedDate: '2014-10-01 17:24:30.0',
//         investigationDate: '2014-10-01 17:24:30.0',
//         accidentOfficialDate: '2014-10-01 17:24:30.0',
//         investigationOffice: 'Đơn vị điều tra 1',
//         remarksOfCargo: 'Hỏng quạt',
//         remarksOfEnvironment: 'Đổ cây',
//         remarksOfShip: 'Hỏng xe',
//         pilotOnBoad: 1
//     }
// ]
// const hasClient = {
//     getUrlInit(query, cb, errorCb){
//         const url = {
//             getDanhSach: 'getDanhSach',
//             themTaiNan: 'themTaiNan',
//             xoaTaiNan: 'xoaTaiNan',
//             suaTaiNan: 'suaTaiNan',
//         }
//         setTimeout(() => cb(url), 100)
//     },
//     getDanhSach(query, cb, errorCb){
//         const result = {
//             data: [...window._danhSachTaiNan],
//             total: window._danhSachTaiNan.length
//         }
//         setTimeout(() => cb(result), 100)
//     },
//     getMaritimeCurrent(query, cb){
//         const resuls = {
//             maritimeCode: 'Hải Phòng',
//             maritimeNameVN: 'Cảng vụ hải Phòng'
//         }
//         setTimeout(() => cb(resuls), 100)
//     },
//     themTaiNan (query, cb) {
//         let result = {}
//         for (let key in  query.params) {
//             if (key === 'id') {
//                 result[key]= Math.floor(Math.random() * 10000) + 1
//             }
//             else {
//                 result[key] = query.params[key]
//             }
//         }
//         window._danhSachTaiNan.push(result)
//         setTimeout(() => cb(window._danhSachTaiNan), 100)
//     },
//     suaTaiNan (query, cb) {
//         let selected = window._danhSachTaiNan.find(item => item.id === query.params.id)
//         window._danhSachTaiNan.splice(window._danhSachTaiNan.indexOf(selected), 1)
//         window._danhSachTaiNan.push(query.params)
//         setTimeout(() => cb(window._danhSachTaiNan), 100)
//     },
//     xoaTaiNan (query, cb) {
//         let selected = window._danhSachTaiNan.find(item => item.id === query.params.id)
//         window._danhSachTaiNan.splice(window._danhSachTaiNan.indexOf(selected), 1)
//         setTimeout(() => cb(window._danhSachTaiNan), 100)
//     }
// }
const hasServer = {
    getUrlInit(query, cb, errorCb){
        axios.get(endPoit)
            .then((res) => {
                const result = res.data
                cb(result) 
            })
            .catch(function (error) {
                errorCb(error)
            })
    },
    getDanhSach(query, cb, errorCb){
        let Url = query.url
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })
    },
    getCangVuHangHai (query, cb, errorcb) {
        axios.get(query.url + '&start=-1&end=-1')
        .then((res) => {
         const result = res.data.data
         cb(result) 
        })
        .catch(function (error) {
         errorcb(error)
        }) 
    },
    getMaritimeCurrent(query, cb, errorCb){
        axios.get(query.url)
        .then((res) => {
         const result = res.data
         cb(result) 
        })
        .catch(function (error) {
            errorCb(error)
        }) 
    },
    themTaiNan (query, cb, errorCb) {
        let Url = query.url + '&LAN_CAP_MOI_DU_LIEU=LAN_CAP_MOI_DU_LIEU'
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
        }) 
    },
    suaTaiNan (query, cb, errorCb) {
        let Url = query.url + '&LAN_SUA_DU_LIEU=LAN_SUA_DU_LIEU'
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })  
    },
    xoaTaiNan (query, cb, errorCb) {
        let Url = query.url + '&LAN_XOA_DU_LIEU=LAN_XOA_DU_LIEU'
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })
    },
    getShips (query, cb, errorCb) {
        let url = '?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=vma_ship_ship&p_p_cacheability=cacheLevelPage&start=-1&end=-1&shipBoat=SHIP'
        axios.get(orginURL.substr(0, orginURL.lastIndexOf('#')) + url + '&shipName=' + query.shipName)
        .then((res) => {
         const result = res.data.data
         cb(result) 
        })
        .catch(function (error) {
           errorCb(error)
        }) 
    },
    getDetailVmaAccidentList (query, cb, errorCb) {
        let Url = query.url
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })
    },
}
export default hasServer