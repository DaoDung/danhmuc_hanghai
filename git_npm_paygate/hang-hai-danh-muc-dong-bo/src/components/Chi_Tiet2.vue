<template>
  <div id="body-chi-tiet-danh-muc">
      <div class="row-header" style="height: 38px; overflow: hidden;">
        <div class="background-triangle-big view_tp_pdf">{{category.categoryDescription}}</div>
      </div>

      <BenCang v-if="this.$route.query.categoryId === 'DM_PORT_HARBOUR'"
      
      ></BenCang>
      <CangBienHangHai v-if="this.$route.query.categoryId === 'DM_DATAITEM_GROUP107'"
      
      ></CangBienHangHai>
      <CangVuHangHai v-if="this.$route.query.categoryId === 'DM_MARITIME'"
      
      ></CangVuHangHai>
      <CauCang v-if="this.$route.query.categoryId === 'DM_PORT_WHARF'"
        
      ></CauCang>
      <KhuVucHangHai v-if="this.$route.query.categoryId === 'DM_PORT_REGION'"
        
      ></KhuVucHangHai>
      <TuyenLuong v-if="this.$route.query.categoryId === 'DM_TUYEN_LUONG'"
        
      ></TuyenLuong>


      <!-------->
      <DMSTATE v-if="this.$route.query.categoryId === 'DM_STATE'"
      ></DMSTATE>
      <!-------->
      <DMPORT v-if="this.$route.query.categoryId === 'DM_PORT'"
      ></DMPORT>
      <!-------->
      <DMARRIVALPURPOSE v-if="this.$route.query.categoryId === 'DM_ARRIVAL_PURPOSE'"
      ></DMARRIVALPURPOSE>
      <!-------->
      <DMSHIPAGENCY v-if="this.$route.query.categoryId === 'DM_SHIP_AGENCY'"
      ></DMSHIPAGENCY>
      <!-------->
      <DMSHIPTYPE v-if="this.$route.query.categoryId === 'DM_SHIP_TYPE'"
      ></DMSHIPTYPE>
      <!-------->
      <DMDOCTYPE v-if="this.$route.query.categoryId === 'DM_DOC_TYPE'"
      ></DMDOCTYPE>
      <!-------->
      <DMPASSPORTTYPE v-if="this.$route.query.categoryId === 'DM_PASSPORT_TYPE'"
      ></DMPASSPORTTYPE>
      <!-------->
      <DMSECURITYLEVEL v-if="this.$route.query.categoryId === 'DM_SECURITY_LEVEL'"
      ></DMSECURITYLEVEL>
      <!-------->
      <DMGOODSTYPE v-if="this.$route.query.categoryId === 'DM_GOODS_TYPE'"
      ></DMGOODSTYPE>
      <!-------->
      <DMGOODS v-if="this.$route.query.categoryId === 'DM_GOODS'"
      ></DMGOODS>
      <!-------->
      <DMPACKAGE v-if="this.$route.query.categoryId === 'DM_PACKAGE'"
      ></DMPACKAGE>
      <!-------->
      <DMRANKRATING v-if="this.$route.query.categoryId === 'DM_RANK_RATING'"
      ></DMRANKRATING>
      <!-------->
      <DMCARGOONBOARD v-if="this.$route.query.categoryId === 'DM_CARGO_ON_BOARD'"
      ></DMCARGOONBOARD>
      <!-------->
      <DMREPRESENTATIVE v-if="this.$route.query.categoryId === 'DM_REPRESENTATIVE'"
      ></DMREPRESENTATIVE>
      <!-------->
      <DMUNITGENERAL v-if="this.$route.query.categoryId === 'DM_UNIT_GENERAL'"
      ></DMUNITGENERAL>
      <!-------->
      <DMDATAITEMGROUP124 v-if="this.$route.query.categoryId === 'DM_DATAITEM_GROUP124'"
      ></DMDATAITEMGROUP124>



            <!-------->
      <dmvmapilotcategory v-if="this.$route.query.categoryId=== 'DM_VMA_PILOT_CATEGORY'"
      ></dmvmapilotcategory>
            <!-------->
      <dmvmapilotcompany v-if="this.$route.query.categoryId=== 'DM_VMA_PILOT_COMPANY'"
      ></dmvmapilotcompany>
            <!-------->
      <dmvmapilot v-if="this.$route.query.categoryId=== 'DM_VMA_PILOT'"
      ></dmvmapilot>
            <!-------->
      <dmvmasecurityoffice v-if="this.$route.query.categoryId=== 'DM_VMA_SECURITY_OFFICE'"
      ></dmvmasecurityoffice>
            <!-------->
      <dmvmashipowner v-if="this.$route.query.categoryId=== 'DM_VMA_SHIP_OWNER'"
      ></dmvmashipowner>
            <!-------->
      <dmmashiptype v-if="this.$route.query.categoryId=== 'DM_VMA_SHIP_TYPE'"
      ></dmmashiptype>
            <!-------->
      <dmvmashipyard v-if="this.$route.query.categoryId=== 'DM_VMA_SHIPYARD'"
      ></dmvmashipyard>
            <!-------->
      <dmvmatugboatcompany v-if="this.$route.query.categoryId=== 'DM_VMA_TUGBOAT_COMPANY'"
      ></dmvmatugboatcompany>
            <!-------->
      <dmvmatugboat v-if="this.$route.query.categoryId=== 'DM_VMA_TUGBOAT'"
      ></dmvmatugboat>
            <!-------->
      <vmapilotviolation v-if="this.$route.query.categoryId=== 'VMA_PILOT_VIOLATION'"
      ></vmapilotviolation>
            <!-------->
      <vmashipcertificate v-if="this.$route.query.categoryId=== 'VMA_SHIP_CERTIFICATE'"
      ></vmashipcertificate>

                        <!-------->
      <vmaship v-if="this.$route.query.categoryId=== 'VMA_SHIP'"
      ></vmaship>
  </div>

</template>
<script>
import BenCang from './chi-tiet-danh-muc/ben-cang'
import CangBienHangHai from './chi-tiet-danh-muc/cang-bien-hang-hai'
import CangVuHangHai from './chi-tiet-danh-muc/cang-vu-hang-hai'
import CauCang from './chi-tiet-danh-muc/cau-cang'
import KhuVucHangHai from './chi-tiet-danh-muc/khu-vuc-hang-hai'
import TuyenLuong from './chi-tiet-danh-muc/tuyen-luong'


import DMSTATE from './chi-tiet-danh-muc/DM_STATE'
import DMPORT from './chi-tiet-danh-muc/DM_PORT'
import DMARRIVALPURPOSE from './chi-tiet-danh-muc/DM_ARRIVAL_PURPOSE'
import DMSHIPAGENCY from './chi-tiet-danh-muc/DM_SHIP_AGENCY'
import DMSHIPTYPE from './chi-tiet-danh-muc/DM_SHIP_TYPE'
import DMDOCTYPE from './chi-tiet-danh-muc/DM_DOC_TYPE'
import DMPASSPORTTYPE from './chi-tiet-danh-muc/DM_PASSPORT_TYPE'
import DMSECURITYLEVEL from './chi-tiet-danh-muc/DM_SECURITY_LEVEL'
import DMGOODSTYPE from './chi-tiet-danh-muc/DM_GOODS_TYPE'
import DMGOODS from './chi-tiet-danh-muc/DM_GOODS'
import DMPACKAGE from './chi-tiet-danh-muc/DM_PACKAGE'
import DMRANKRATING from './chi-tiet-danh-muc/DM_RANK_RATING'
import DMCARGOONBOARD from './chi-tiet-danh-muc/DM_CARGO_ON_BOARD'
import DMREPRESENTATIVE from './chi-tiet-danh-muc/DM_REPRESENTATIVE'
import DMUNITGENERAL from './chi-tiet-danh-muc/DM_UNIT_GENERAL'
import DMDATAITEMGROUP124 from './chi-tiet-danh-muc/DM_DATAITEM_GROUP124'



import dmvmapilotcategory from './chi-tiet-danh-muc/dm_vma_pilot_category'
import dmvmapilotcompany from './chi-tiet-danh-muc/dm_vma_pilot_company'
import dmvmapilot from './chi-tiet-danh-muc/dm_vma_pilot'
import dmvmasecurityoffice from './chi-tiet-danh-muc/dm_vma_security_office'
import dmvmashipowner from './chi-tiet-danh-muc/dm_vma_ship_owner'
import dmmashiptype from './chi-tiet-danh-muc/dm_vma_ship_type'
import dmvmashipyard from './chi-tiet-danh-muc/dm_vma_shipyard'
import dmvmatugboatcompany from './chi-tiet-danh-muc/dm_vma_tugboat_company'
import dmvmatugboat from './chi-tiet-danh-muc/dm_vma_tugboat'
import vmapilotviolation from './chi-tiet-danh-muc/vma_pilot_violation'
import vmashipcertificate from './chi-tiet-danh-muc/vma_ship_certificate'
import vmaship from './chi-tiet-danh-muc/vma_ship'

export default {
  components: {
    BenCang,
    CangBienHangHai,
    CangVuHangHai,
    CauCang,
    TuyenLuong,
    KhuVucHangHai,
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
    vmaship
  },
  data() {
    return {
    };
  },
  computed: {
    category() {
      return this.$store.getters["category/Category"];
    }

  },
  created () {
  },
  mounted() {
  },
  methods: {
  }
};
</script>
<style scoped>
#body-chi-tiet-danh-muc{

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
</style>