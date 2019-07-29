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
          :rows-per-page-items="[10, 20, 30, 100]"
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{ props.item.stt }}</td>
                <td class="text-xs-center">{{ props.item.shipAgencyCode }}</td>
                <td class="text-xs-center">{{ props.item.shipAgencyNameVN }}</td>
                <td class="text-xs-center">{{ props.item.phone }}</td>
                <td class="text-xs-center">{{ props.item.fax }}</td>
                <td class="text-xs-center">{{ props.item.email }}</td>
                <td class="text-xs-center">{{ props.item.representative1 }}</td>
                <td class="text-xs-center">{{ props.item.representativeTitle1 }}</td>
                <td class="text-xs-center"  :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" : "Đang sử dụng"}}</td>
                <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
                  <span @click="infoCategory(props.item)" class="action-table">
                    <strong>Xem</strong>
                  </span>
                </td>             
              </tr>
            </template>
          </v-data-table>
        </div>
      </v-container>
    </v-flex>
  </div>
</template>
<script>
export default {
  data() {
    return {
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
      let data = this.$store.getters["category/categoryListItems"]
      data.map((item,index) =>{
        if (true) {
          item['stt']= index + 1
        }
      })
      return data
    },
    link () {
      let url = "http://10.21.201.75:8081/group/lanh-dao/quan-ly-thu-tuc-tau-bien?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=reportExel&p_p_cacheability=cacheLevelPage"
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
      let params = {
        categoryId: this.categoryId,
        shipAgencyCode: this.shipAgencyCode,
        shipAgencyNameVN: this.shipAgencyNameVN,
        addressVN: this.addressVN,
        phone: this.phone
      };
      this.$store.dispatch("category/searchCategoryListItems", params);
    },
    reportExel () {
      let params = {
        reportId: this.$route.query.categoryId
      }
      this.$store.dispatch("category/reportExel", params)
        .then()    
    }
  }
};
</script>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>