<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
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
          :rows-per-page-items="[10, 20, 30, 100]"
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{ props.item.stt }}</td>
                <td class="text-xs-center">{{ props.item.securityLevelCode }}</td>
                <td class="text-xs-center">{{ props.item.securityLevelName }}</td>
                <td class="text-xs-center">{{ props.item.secutiryLevel }}</td>              
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
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Mã cấp độ anh ninh ",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên cấp độ an ninh",
          align: "center"
        },
        {
          sortable: false,
          text: "Cấp độ",
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
        portRegionNameVN: this.selectPortRegionNameVN,
        maritimeCode: this.selectMaritime
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
    let vm = this;
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
          id: item.stateCode
        }
      });
    },
    search() {
      let vm = this;
      let params = {
        categoryId: this.categoryId,
        portRegionNameVN: this.selectPortRegionNameVN,
        maritimeCode: this.selectMaritime
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