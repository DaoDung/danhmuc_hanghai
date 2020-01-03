<template>
  <div class="list_thu_tuc">
    <loading :active.sync="isLoading" 
      :is-full-page="true">
    </loading>
      <div id="title-danhsach" class="row-header" style="height: 38px; overflow: hidden;">
        <div class="background-triangle-big view_tp_pdf">{{category.categoryDescription}}</div>
      </div>
      <!--Bến Cảng-->
      <BenCang v-if="this.categoryId === 'DM_PORT_HARBOUR' && !isLoading"
      ></BenCang>
      <!--Cảng biển hàng hải-->
      <CangBienHangHai v-else-if="this.categoryId === 'DM_DATAITEM_GROUP107'  && !isLoading"
      ></CangBienHangHai>
      <!--Cảng vụ hàng hải-->
      <CangVuHangHai v-else-if="this.categoryId === 'DM_MARITIME'  && !isLoading"
      ></CangVuHangHai>
      <!--Cầu cảng-->
      <CauCang v-else-if="this.categoryId === 'DM_PORT_WHARF'  && !isLoading"
      ></CauCang>
      <!--Khu vực hàng hải-->
      <KhuVucHangHai v-else-if="this.categoryId === 'DM_PORT_REGION'  && !isLoading"
      ></KhuVucHangHai>
      <!--Tuyến luồng-->
      <TuyenLuong v-else-if="this.categoryId === 'DM_TUYEN_LUONG'  && !isLoading"
      ></TuyenLuong>
      <!-------->
      <DMSTATE v-else-if="this.categoryId === 'DM_STATE'  && !isLoading"
      ></DMSTATE>
      <!-------->
      <DMPORT v-else-if="this.categoryId === 'DM_PORT'  && !isLoading"
      ></DMPORT>
      <!-------->
      <DMARRIVALPURPOSE v-else-if="this.categoryId === 'DM_ARRIVAL_PURPOSE'  && !isLoading"
      ></DMARRIVALPURPOSE>
      <!-------->
      <DMSHIPAGENCY v-else-if="this.categoryId === 'DM_SHIP_AGENCY'  && !isLoading"
      ></DMSHIPAGENCY>
      <!-------->
      <DMSHIPTYPE v-else-if="this.categoryId === 'DM_SHIP_TYPE'  && !isLoading"
      ></DMSHIPTYPE>
      <!-------->
      <DMDOCTYPE v-else-if="this.categoryId === 'DM_DOC_TYPE'  && !isLoading"
      ></DMDOCTYPE>
      <!-------->
      <DMPASSPORTTYPE v-else-if="this.categoryId === 'DM_PASSPORT_TYPE'  && !isLoading"
      ></DMPASSPORTTYPE>
      <!-------->
      <DMSECURITYLEVEL v-else-if="this.categoryId === 'DM_SECURITY_LEVEL'  && !isLoading"
      ></DMSECURITYLEVEL>
      <!-------->
      <DMGOODSTYPE v-else-if="this.categoryId === 'DM_GOODS_TYPE'  && !isLoading"
      ></DMGOODSTYPE>
      <!-------->
      <DMGOODS v-else-if="this.categoryId === 'DM_GOODS'  && !isLoading"
      ></DMGOODS>
      <!-------->
      <DMPACKAGE v-else-if="this.categoryId === 'DM_PACKAGE'  && !isLoading"
      ></DMPACKAGE>
      <!-------->
      <DMRANKRATING v-else-if="this.categoryId === 'DM_RANK_RATING'  && !isLoading"
      ></DMRANKRATING>
      <!-------->
      <DMCARGOONBOARD v-else-if="this.categoryId === 'DM_CARGO_ON_BOARD'  && !isLoading"
      ></DMCARGOONBOARD>
      <!-------->
      <DMREPRESENTATIVE v-else-if="this.categoryId === 'DM_REPRESENTATIVE'  && !isLoading"
      ></DMREPRESENTATIVE>
      <!-------->
      <DMUNITGENERAL v-else-if="this.categoryId === 'DM_UNIT_GENERAL'  && !isLoading"
      ></DMUNITGENERAL>
      <!-------->
      <DMDATAITEMGROUP124 v-else-if="this.categoryId === 'DM_DATAITEM_GROUP124'  && !isLoading"
      ></DMDATAITEMGROUP124>

            <!-------->
      <dmvmapilotcategory v-else-if="this.categoryId === 'DM_VMA_PILOT_CATEGORY'  && !isLoading"
      ></dmvmapilotcategory>
            <!-------->
      <dmvmapilotcompany v-else-if="this.categoryId === 'DM_VMA_PILOT_COMPANY'  && !isLoading"
      ></dmvmapilotcompany>
            <!-------->
      <dmvmapilot v-else-if="this.categoryId === 'DM_VMA_PILOT'  && !isLoading"
      ></dmvmapilot>
            <!-------->
      <dmvmasecurityoffice v-else-if="this.categoryId === 'DM_VMA_SECURITY_OFFICE'  && !isLoading"
      ></dmvmasecurityoffice>
            <!-------->
      <dmvmashipowner v-else-if="this.categoryId === 'DM_VMA_SHIP_OWNER' && this.category.categoryDescription === 'Chủ tàu, người khai thác' && !isLoading"
      ></dmvmashipowner>
            <!-------->
      <dmmashiptype v-else-if="this.categoryId === 'DM_VMA_SHIP_TYPE'  && !isLoading"
      ></dmmashiptype>
            <!-------->
      <dmvmashipyard v-else-if="this.categoryId === 'DM_VMA_SHIPYARD'  && !isLoading"
      ></dmvmashipyard>
            <!-------->
      <dmvmatugboatcompany v-else-if="this.categoryId === 'DM_VMA_TUGBOAT_COMPANY'  && !isLoading"
      
      ></dmvmatugboatcompany>
            <!-------->
      <dmvmatugboat v-else-if="this.categoryId === 'DM_VMA_TUGBOAT'  && !isLoading"
      ></dmvmatugboat>
            <!-------->
      <vmapilotviolation v-else-if="this.categoryId === 'VMA_PILOT_VIOLATION'  && !isLoading"
      ></vmapilotviolation>
            <!-------->
      <vmashipcertificate v-else-if="this.categoryId === 'VMA_SHIP_CERTIFICATE'  && !isLoading"
      ></vmashipcertificate>

                  <!-------->
      <vmaship v-else-if="this.categoryId === 'VMA_SHIP'  && !isLoading"
      ></vmaship>

      <vmatransactiondepartment v-else-if="this.categoryId === 'VMA_TRANSACTION_DEPARTMENT'  && !isLoading"
      ></vmatransactiondepartment>
      <chuhangcanhankhac  v-else-if="this.categoryId === 'DM_VMA_SHIP_OWNER' && this.category.categoryDescription === 'Chủ hàng, cá nhân khác'  && !isLoading"></chuhangcanhankhac>
  </div>
</template>
<script>
import Loading from 'vue-loading-overlay';
import 'vue-loading-overlay/dist/vue-loading.css';

import BenCang from './danh-sach-danh-muc/ben-cang'
import CangBienHangHai from './danh-sach-danh-muc/cang-bien-hang-hai'
import CangVuHangHai from './danh-sach-danh-muc/cang-vu-hang-hai'
import CauCang from './danh-sach-danh-muc/cau-cang'
import KhuVucHangHai from './danh-sach-danh-muc/khu-vuc-hang-hai'
import TuyenLuong from './danh-sach-danh-muc/tuyen-luong'

import DMSTATE from './danh-sach-danh-muc/DM_STATE'
import DMPORT from './danh-sach-danh-muc/DM_PORT'
import DMARRIVALPURPOSE from './danh-sach-danh-muc/DM_ARRIVAL_PURPOSE'
import DMSHIPAGENCY from './danh-sach-danh-muc/DM_SHIP_AGENCY'
import DMSHIPTYPE from './danh-sach-danh-muc/DM_SHIP_TYPE'
import DMDOCTYPE from './danh-sach-danh-muc/DM_DOC_TYPE'
import DMPASSPORTTYPE from './danh-sach-danh-muc/DM_PASSPORT_TYPE'
import DMSECURITYLEVEL from './danh-sach-danh-muc/DM_SECURITY_LEVEL'
import DMGOODSTYPE from './danh-sach-danh-muc/DM_GOODS_TYPE'
import DMGOODS from './danh-sach-danh-muc/DM_GOODS'
import DMPACKAGE from './danh-sach-danh-muc/DM_PACKAGE'
import DMRANKRATING from './danh-sach-danh-muc/DM_RANK_RATING'
import DMCARGOONBOARD from './danh-sach-danh-muc/DM_CARGO_ON_BOARD'
import DMREPRESENTATIVE from './danh-sach-danh-muc/DM_REPRESENTATIVE'
import DMUNITGENERAL from './danh-sach-danh-muc/DM_UNIT_GENERAL'
import DMDATAITEMGROUP124 from './danh-sach-danh-muc/DM_DATAITEM_GROUP124'


import dmvmapilotcategory from './danh-sach-danh-muc/dm_vma_pilot_category'
import dmvmapilotcompany from './danh-sach-danh-muc/dm_vma_pilot_company'
import dmvmapilot from './danh-sach-danh-muc/dm_vma_pilot'
import dmvmasecurityoffice from './danh-sach-danh-muc/dm_vma_security_office'
import dmvmashipowner from './danh-sach-danh-muc/dm_vma_ship_owner'
import dmmashiptype from './danh-sach-danh-muc/dm_vma_ship_type'
import dmvmashipyard from './danh-sach-danh-muc/dm_vma_shipyard'
import dmvmatugboatcompany from './danh-sach-danh-muc/dm_vma_tugboat_company'
import dmvmatugboat from './danh-sach-danh-muc/dm_vma_tugboat'
import vmapilotviolation from './danh-sach-danh-muc/vma_pilot_violation'
import vmashipcertificate from './danh-sach-danh-muc/vma_ship_certificate'
import vmaship from './danh-sach-danh-muc/vma_ship'
import vmatransactiondepartment from './danh-sach-danh-muc/vma_transaction_department'
import chuhangcanhankhac from './danh-sach-danh-muc/chu-hang-ca-nhan-khac'

export default {
  components: {
    Loading,
    BenCang,
    CangBienHangHai,
    CangVuHangHai,
    CauCang,
    KhuVucHangHai,
    TuyenLuong,
    DMSTATE,
    DMPORT,
    DMARRIVALPURPOSE,
    DMSHIPAGENCY,
    DMSHIPTYPE,
    DMDOCTYPE,
    DMPASSPORTTYPE,
    DMSECURITYLEVEL,
    DMGOODSTYPE,
    DMGOODS,
    DMPACKAGE,
    DMRANKRATING,
    DMCARGOONBOARD,
    DMREPRESENTATIVE,
    DMUNITGENERAL,
    DMDATAITEMGROUP124,
    dmvmapilotcategory,
    dmvmapilotcompany,
    dmvmapilot,
    dmvmasecurityoffice ,
    dmvmashipowner,
    dmmashiptype,
    dmvmashipyard, 
    dmvmatugboatcompany, 
    dmvmatugboat,
    vmapilotviolation, 
    vmashipcertificate,
    vmaship,
    vmatransactiondepartment,
    chuhangcanhankhac
  },
  data() {
    return {
      isLoading: false
    };
  },
  created() {
    const vm = this
    this.$nextTick(() => {
      vm.runDispatchCategoryList(vm.categoryId)
    })
  },
  computed: {
    categoryId () {
      return this.$route.query.categoryId
    },
    category () {
      return this.$store.getters["category/Category"]
    }
  },
  watch: {
    categoryId (val) {
      this.runDispatchCategoryList(val)
    }
  },
  methods: {
    runDispatchCategoryList(id) {
      let vm = this;
      let params = id;
      this.isLoading = true
      this.$store
        .dispatch("category/getCategoryListItems", params)
        .then(res => {
          vm.isLoading = false
        }, error => {
          vm.isLoading = false
        });
      
    }
  }
};
</script>

<style scoped>
.list_thu_tuc{
  box-sizing: border-box;
}
.row-header{
  height: 38px;
  overflow: hidden;
  background-color: #e1e2e1;
  display: flex;
  align-items: center;
  width: 100%;
}
.background-triangle-big{
    padding: 10px 5px 10px 15px;
    width: auto;
    margin-right: 30px;
    background-color: #0b72ba;
    display: inline-block;
    text-align: right;
    color: #fff;
    position: relative;
}
.background-triangle-big:before, .background-triangle-small:before {
    content: "";
    position: absolute;
    top: 1px;
    transform: rotate(45deg);
    right: -4px;
    border-top: 28px solid #0b72ba;
    border-left: 28px solid transparent;
    border-bottom: 28px solid transparent;
}
.v-input{
  font-size: 13px;
}
</style>
