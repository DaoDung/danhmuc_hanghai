<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Mã số thuế:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field v-model="shipAgencyCode"  height="15"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Tên đại lý:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field v-model="shipAgencyNameVN"  height="15"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Địa chỉ đại lý:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field v-model="addressVN"  height="15"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Số điện thoại:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field v-model="phone"  height="15"></v-text-field>
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

        <div class="tableEventList__class">
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
                <td class="text-xs-center">{{ props.item.shipAgencyCode }}</td>
                <td class="text-xs-center">{{ props.item.shipAgencyNameVN }}</td>
                <td class="text-xs-center">{{ props.item.phone }}</td>
                <td class="text-xs-center">{{ props.item.fax }}</td>
                <td class="text-xs-center">{{ props.item.email }}</td>
                <td class="text-xs-center">{{ props.item.representative1 }}</td>
                <td class="text-xs-center">{{ props.item.representativeTitle1 }}</td>
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
        <div class="text-xs-right layout wrap" style="position: relative;">
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
      shipAgencyCode:'',
      shipAgencyNameVN: '',
      addressVN: '',
      phone: '',
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "MST",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên đại lý",
          align: "center"
        },
        {
          sortable: false,
          text: "Phone",
          align: "center"
        },
        {
          sortable: false,
          text: "Fax",
          align: "center"
        },
        {
          sortable: false,
          text: "Email",
          align: "center"
        },
        {
          sortable: false,
          text: "Người đại diện",
          align: "center"
        },
        {
          sortable: false,
          text: "Chức danh",
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
        shipAgencyCode: this.shipAgencyCode,
        shipAgencyNameVN: this.shipAgencyNameVN,
        addressVN: this.addressVN,
        phone: this.phone
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
  },
  methods: {
    infoCategory(item) {
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "chi-tiet-danh-muc",
          id: item.shipAgencyCode
        }
      });
    },
    search() {
      this.pagesize = 10
      this.page = 1
      let params = {
        categoryId: this.categoryId,
        shipAgencyCode: this.shipAgencyCode,
        shipAgencyNameVN: this.shipAgencyNameVN,
        addressVN: this.addressVN,
        phone: this.phone,
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
        shipAgencyCode: this.shipAgencyCode,
        shipAgencyNameVN: this.shipAgencyNameVN,
        addressVN: this.addressVN,
        phone: this.phone,
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