import axios from 'axios'
var renderURLInit = "?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit"
var orginURL = window.location.href
var endPoit = orginURL.substr(0, orginURL.lastIndexOf('#')) + renderURLInit
var endPoit2 = orginURL.substr(0, orginURL.lastIndexOf('#'))
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
    getUrlInit2(query, cb, errorCb){
        axios.get(endPoit2 + '?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit')
            .then((res) => {
                const result = res.data
                cb(result) 
            })
            .catch(function (error) {
                errorCb(error)
            })
    },
    getDanhSach(query, cb, errorCb){
        let Url = `?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=vma_ship_ship&p_p_cacheability=cacheLevelPage`
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(endPoit2 + Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })
    },
    getDetail (query, cb, errorCb) {
        let Url = `?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=vma_ship_detail&p_p_cacheability=cacheLevelPage`
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(endPoit2 + Url)
         .then((res) => {
          const result = res.data
          cb(result) 
         })
         .catch(function (error) {
            errorCb(error)
         })
    },
    loadDataDM (query, cb, errorCb) {
        let Url = `?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getDetailDmCategories&p_p_cacheability=cacheLevelPage`
        for (const key in query.params) {
          if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
            Url += '&' + key + '=' + query.params[key]
          }
        }
        axios.get(endPoit2 + Url)
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
    sua (query, cb, errorCb) {
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