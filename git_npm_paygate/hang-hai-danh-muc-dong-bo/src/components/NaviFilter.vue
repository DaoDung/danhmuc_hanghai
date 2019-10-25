<template>
  <div id="bang-danh-muc">
    <!-- <div class="row-header" id="title-bang-danh-muc" style="height: 38px; overflow: hidden;">
      <div class="background-triangle-big view_tp_pdf">Bảng danh mục</div>
    </div> -->
    <div class="base-list">
      <ul v-for="(item, index) in catalogTableItems" :key="'v-list-tile'+index" >
        <li  @click="getListCategory(item)"
          :class="{'categoryTableActive': String(item.categoryId) === String(categoryId), 'category-dynamic': String(item.categoryId) === String(fixCategory.find( e => e === item.categoryId)), 'item-danh-muc': true}">
          <span>{{item.categoryDescription}}</span>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      fixCategory: [
        "DM_PORT_REGION",
        "DM_PORT_WHARF",
        "DM_PORT_HARBOUR",
        "DM_MARITIME",
        "DM_DATAITEM_GROUP107",
        "DM_TUYEN_LUONG",
        "DM_VMA_TUGBOAT_COMPANY",
        "DM_VMA_TUGBOAT",
        "DM_VMA_PILOT_COMPANY",
        "DM_VMA_PILOT",
        "DM_VMA_PILOT_CATEGORY",
        "DM_VMA_SHIP_OWNER",
        "DM_VMA_SHIPYARD",
        "DM_VMA_SECURITY_OFFICE",
        "DM_VMA_SHIP_TYPE",
        "VMA_TRANSACTION_DEPARTMENT",
        "DM_SHIP_AGENCY",
        "DM_PORT",
      ]
    };
  },
  computed: {
    catalogTableItems() {
      return this.$store.getters["category/categoryTableItems"];
    },
    categoryId() {
      return this.$route.query.categoryId;
    }
  },
  created() {},
  mounted() {
    let vm = this;
    this.$nextTick(() => {
      vm.runDispatchCategoryTable();
    });
  },
  watch: {
    selectCategoryTable(val) {
      this.$router.push({
        name: "danh_sach_danh_muc",
        query: { categoryId: val.categoryId }
      });
      this.$emit("selectCategoryTable", val);
    }
  },
  methods: {
    runDispatchCategoryTable() {
      let vm = this;
      this.$store.dispatch("category/getCategoryTableItems").then(
        res => {
            this.$router.push({
              path: "/danh-sach-danh-muc",
              query: { categoryId: res[0].categoryId }
            });
            this.$store.dispatch("category/setCategory", res[0])
              .then(res => {
              }, error => {
            });
        },
        error => {}
      );
    },
    getListCategory(item) {
      document.body.scrollTop = 0;
      document.documentElement.scrollTop = 0;
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: item.categoryId }
      });
      this.$store.dispatch("category/setCategory", item)
        .then(res => {
        }, error => {
        });
    }
  }
};
</script>
<style scoped>
.base-list {
  height: calc(100vh - 54px);
  overflow: auto;
  overflow-x: hidden;
  overflow-y: hidden;

}
.base-list:hover {
  overflow-y: inherit;
}
.item-catagogy-table {
  color: #43a047;
}
.categoryTableActive {
  background: #80808099;
}
.category-dynamic {
  color: #3563c1;
  font-weight: bold;
}
#bang-danh-muc {
  border-right: 1px solid #e8e8e8;
  height: 100%;
  box-sizing: border-box;
  background-color: #fff;
}
.item-danh-muc {
  border-bottom: 1px solid #e8e8e8;
  height: 35px;
  line-height: 35px;
  padding-left: 10px;
  overflow: hidden;
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
    font-size: 15px;
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
.base-list ul{
  padding: 0px;
  margin: 0px;
}
ul:hover{
  cursor: pointer;
}
.base-list ul li{
  list-style: none;
  font-size: 13px;
}
</style>
