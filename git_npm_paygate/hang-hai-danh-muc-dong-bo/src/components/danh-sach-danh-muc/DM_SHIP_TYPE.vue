<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Loại tàu thuyền:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field v-model="shipTypeNameVN" height="15" @change="search"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12 class="text-xs-center">
              <div class="btn-group-danhmuc">
                  <button @click="search" class="btn-danhmnuc">Tìm kiếm</button>
                  <button class="btn-danhmnuc"><a :href="link">Xuất Excel</a></button>
              </div>  
            </v-flex>
          </v-layout>
        </v-container>
      </div>
    </v-flex>

    <v-flex xs12>
      <v-container fluid grid-list-md>
        <div class="tableEventList__class" style="width:70%;margin: 0 auto;">
          <v-data-table
          id = "table_search"
          no-data-text = "Không có dữ liệu"
          :headers = "headers"
          :items = "categoryList"
          hide-actions
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{  page*pagesize - pagesize + props.index + 1 }}</td>
                <td class="text-xs-center">{{ props.item.shipTypeCode }}</td>
            <td class="text-xs-center">{{ props.item.shipTypeNameVN }}</td>
            <td class="text-xs-center"  :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" : "Đang sử dụng"}}</td>
            <td class="text-xs-center" style="width: 90px;padding-left: 0px;padding-right: 5px;">
              <span @click="infoCategory(props.item)" class="action-table">
                <strong>Xem</strong>
              </span>
            </td>             
              </tr>
            </template>
          </v-data-table>
        </div>
        <div class="text-xs-right layout wrap" style="width:70%;margin: 0 auto;">
          <div class="flex pagging-table px-2"> 
            <tiny-pagination :page="page" :pagesize="pagesize" @tiny:change-page="paggingData"></tiny-pagination> 
          </div>
        </div>  
      </v-container>
    </v-flex>
  </div>
</template>
<script>
import TinyPagination from '../hanghai_pagination.vue'

export default {
  components: {
    'tiny-pagination': TinyPagination,
  },
  data() {
    return {
      pagesize: 10,
      page: 1,
      shipTypeNameVN: '',
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Mã loại tàu thuyền",
          align: "center"
        },
        {
          sortable: false,
          text: "Loại tàu thuyền",
          align: "center"
        },
        {
          sortable: false,
          text: "Trạng thái",
          align: "center"
        },
        {
          sortable: false,
          text: "Thao tác",
          align: "center"
        }
      ]
    };
  },
  computed: {
    categoryId() {
      return this.$route.query.categoryId;
    },
    categoryList () {
      return this.$store.getters["category/categoryListItems"]
    },
    link () {
      let originUrl = this.$store.getters["category/Url"]
      let url = originUrl.reportExel
      let params = {
        reportId: this.categoryId,
        shipTypeNameVN: this.shipTypeNameVN
      };
      for (const key in params) {
        if (params[key] !== '' && typeof params[key] != "undefined") {
          url += '&' + key + '=' + params[key]
        }
      }
      return url
    }
  },
  created() {
    this.$nextTick(() => {
    });
  },
  methods: {
    infoCategory(item) {
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "chi-tiet-danh-muc",
          id: item.shipTypeCode
        }
      });
    },
    search() {
      this.pagesize = 10
      this.page = 1
      let params = {
        categoryId: this.categoryId,
        shipTypeNameVN: this.shipTypeNameVN,
        start: 0,
        end: 10
      };
      this.$store.dispatch("category/searchCategoryListItems", params);
    },
    reportExel () {
      let params = {
        reportId: this.$route.query.categoryId
      }
      this.$store.dispatch("category/reportExel", params)
        .then()    
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page
      let vm = this
      let params = {
        categoryId: this.categoryId,
        shipTypeNameVN: this.shipTypeNameVN,
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };
      this.$store
        .dispatch("category/searchCategoryListItems", params)
        .then();
    }
  }
};
</script>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>