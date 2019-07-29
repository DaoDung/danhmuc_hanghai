<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs6>
                  <label>Cảng vụ hàng hải:</label>
                </v-flex>
                <v-flex xs8>
                  <v-autocomplete
                    v-model="selectMaritime"
                    :items="maritime"
                    item-text="cityCode"
                    item-value="maritimeCode"
                    width="30"
                  
                    height="15"
                  ></v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs7>
                  <label>Cảng biển hàng hải:</label>
                </v-flex>
                <v-flex xs8>
                  <v-text-field v-model="selectPortCode" height="15"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs7>
                  <label>Khu vực hàng hải:</label>
                </v-flex>
                <v-flex xs8>
                  <v-text-field v-model="selectPortRegionNameVN" height="15"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12 class="text-xs-center">
              <div class="btn-group-danhmuc">
                  <button @click="search" class="btn-danhmnuc">Tìm kiếm</button>
                  <button @click="addCategory" class="btn-danhmnuc">Thêm mới</button>
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
          :items = "danhSach"
          :rows-per-page-items="[10, 20, 30, 100]"
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{ props.item.stt }}</td>
                <td class="text-xs-center">{{ props.item.portRegionCode }}</td>
                <td class="text-xs-center">{{ props.item.portRegionNameVN }}</td>
                <td class="text-xs-center">{{ props.item.name }}</td>
                <td class="text-xs-center" :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" : "Đang sử dụng"}}</td> 
                <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
                  <span @click="infoCategory(props.item)" class="action-table"><strong>Xem</strong></span>
                  <span @click="editCategory(props.item)" v-if="props.item.role" class="action-table"><strong>Sửa</strong></span>
                  <span @click="delCategory(props.item)" v-if="props.item.role" class="action-table"><strong>Xóa</strong></span>
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
import { async } from 'q';
export default {
  data() {
    return {
      selectPortCode: '',
      selectPortRegionNameVN: "",
      maritime: [],
      CangBienHangHai: [],
      danhSach: [],
      selectMaritime: "",
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Mã khu vực hàng hải",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên khu vực hàng hải",
          align: "center"
        },
        {
          sortable: false,
          text: "Cảng biển hàng hải",
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
          value: "salary",
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
        maritimeCode: this.selectMaritime,
        portCode: this.selectPortCode
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
    this.$nextTick( async () => {
      vm.$store.dispatch("category/getMaritime").then(
        res => {
          vm.maritime = res.data;
        }
      );
      await vm.$store.dispatch("category/getMaritimeCurrent").then(
        res => {
          vm.selectMaritime = res.maritimeCode;
        }
      );
      vm.$store.dispatch("category/getDanhMuc", { categoryId: "DM_DATAITEM_GROUP107", maritimeCode: vm.selectMaritime}).then(
        res => {
          vm.CangBienHangHai = res
          vm.danhSach = vm.categoryList
          vm.danhSach.map(item => {
            let lt = vm.CangBienHangHai.find(i => i.node2 === item.portCodeRef)
            item['name'] = lt.name
            return item
          })
        }
      )
    });
  },
  watch: {
    categoryList () {
        let vm =  this
        this.$store.dispatch("category/getDanhMuc", { categoryId: "DM_DATAITEM_GROUP107", maritimeCode: vm.selectMaritime}).then(
        res => {
          vm.CangBienHangHai = res
          vm.danhSach = vm.categoryList
          vm.danhSach.map(item => {
            let lt = vm.CangBienHangHai.find(i => i.node2 === item.portCodeRef)
            item['name'] = lt.name
            return item
          })
        }
      )
    }
  },
  methods: {
    editCategory(item) {
      this.$store.dispatch("category/setCategoryModel", item);
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "sua-danh-muc",
          id: item.portRegionCode
        }
      });
    },
    delCategory(item) {
      this.$store.dispatch("category/setCategoryModel", item);
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "xoa-danh-muc",
          id: item.portRegionCode
        }
      });
    },
    addCategory() {
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "them-danh-muc",
          id: 0
        }
      });
    },
    infoCategory(item) {
      this.$router.push({
        name: "chi_tiet_danh_muc",
        query: {
          categoryId: this.$route.query.categoryId,
          aticon: "chi-tiet-danh-muc",
          id: item.portRegionCode
        }
      });
    },
    search() {
    if (typeof this.selectMaritime == "undefined") {
        this.selectMaritime = ''
    }
    let params = {
      categoryId: this.categoryId,
      portRegionNameVN: this.selectPortRegionNameVN,
      maritimeCode: this.selectMaritime,
      portCode: this.selectPortCode
    };
    this.$store
      .dispatch("category/searchCategoryListItems", params)
      .then();
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
<style>

</style>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>
