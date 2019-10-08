import Repository from "./Repository";

var renderURLInit = "?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit"
var orginURL = window.location.href
var endPoit = orginURL + renderURLInit

export default {
  getURLInit() {
    return Repository.get(`${endPoit}`);
  },
  getDetailDmCategories(url, query) {
    let queries = {
      start: -1,
      end: -1
    }
    Object.assign(queries, query)
    return Repository.get(`${url}`, {params: queries});
  },
  getMaritimeCurrent(url, query) {
    return Repository.get(`${url}`);
  },
  getMaritimes(url) {
    return Repository.get(`${url}`);
  },
  getVmaReportCategory(url, query){
    let queries = {
      start: -1,
      end: -1
    }
    Object.assign(queries, query)
    return Repository.get(`${url}`, {params: queries});
  }
};