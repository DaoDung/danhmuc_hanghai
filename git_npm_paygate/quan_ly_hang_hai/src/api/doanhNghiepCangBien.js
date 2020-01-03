import axios from 'axios'
var renderURLInit = "?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit"
var orginURL = window.location.href
var endPoit = orginURL.substr(0, orginURL.lastIndexOf('#')) + renderURLInit
let doanhNghiep = [
  {
    id: '1',
    maritimeCode: '44444',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 1',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '2',
    maritimeCode: '76342445',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 2',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '3',
    maritimeCode: '3464435',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 3',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '4',
    maritimeCode: '423671',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 4',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '5',
    maritimeCode: '888746',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 5',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '6',
    maritimeCode: '26574234',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 6',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '7',
    maritimeCode: '2474323',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 7',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '8',
    maritimeCode: '768443',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 8',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '9',
    maritimeCode: '324621',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 9',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '10',
    maritimeCode: '84533',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 10',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '11',
    maritimeCode: '1231246',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 11',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '12',
    maritimeCode: '574523',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 12',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '13',
    maritimeCode: '65423',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 13',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  },
  {
    id: '14',
    maritimeCode: '32423234',
    servicePortCompanyCode: 'MST90832',
    servicePortCompanyName: 'Doanh nghieepj 14',
    companyAddress: '648 Pham Van Dong',
    contactEmail: 'jsadkj@gmail.com',
    telNo: '02340923842',
    faxNo: '9032420',
    remarks: 'Ghi chu',
    isDelete: 1,
    markedAsDelete: 1,
    modifiedDate: '2019-01-01 23:23',
    requestedDate: '2019-01-01 23:23',
    syncVersion: '1.1'
  }
]
const hasClient = {
  getUrlInit(query, cb){
    let result = {
      jakshd: 'asdasda'
    }
    setTimeout(()=>{cb(result)}, 1000)
  },
  getDanhSach(query, cb){
    let result = {
      total: doanhNghiep.length,
      data: doanhNghiep
    }
    setTimeout(()=>{cb(result)}, 1000)
  },
  xoa (query, cb) {
    doanhNghiep.splice(doanhNghiep.indexOf(doanhNghiep.find(item => item.maritimeCode === query.params.maritimeCode)), 1)
    let result = {
      total: doanhNghiep.length,
      data: doanhNghiep
    }
    setTimeout(()=>{cb(result)}, 1000)
  },
  getDetail (query, cb) {
    let result = doanhNghiep.find(item =>item.id === query.params.id)
    setTimeout(()=>{cb(result)}, 1000)
  }
}
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
  them (query, cb, errorCb) {
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
  sua (query, cb, errorCb) {
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
  xoa (query, cb, errorCb) {
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
  getDetail (query, cb, errorCb) {
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
  getMaritimeCurrent (query, cb, errorCb) {
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
export default  orginURL.substr(0, 17) === 'http://localhost:' ? hasClient : hasServer