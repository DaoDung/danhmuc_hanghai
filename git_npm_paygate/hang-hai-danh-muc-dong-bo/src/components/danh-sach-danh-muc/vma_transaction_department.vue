<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Cảng vụ hàng hải:</label>
                </v-flex>
                <v-flex xs7>
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
                <v-flex xs5>
                  <label>Tên phòng ban:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field
                    v-model="departmentName"
                    height="15"
                  ></v-text-field> 
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
          hide-actions
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{  page*pagesize - pagesize + props.index + 1 }}</td>
                <td class="text-xs-center">{{ props.item.departmentCode}}</td>
                <td class="text-xs-center">{{ props.item.departmentName}}</td>
                <td class="text-xs-center">{{ props.item.maritimeNameVN }}</td>
                <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
                  <span @click="infoCategory(props.item)" class="action-table"><strong>Xem</strong></span>
                  <span @click="editCategory(props.item)" v-if="props.item.role" class="action-table"><strong>Sửa</strong></span>
                  <span @click="delCategory(props.item)" v-if="props.item.role" class="action-table"><strong>Xóa</strong></span>
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
  data () {
    return {
      pagesize: 10,
      page: 1,
      departmentName: '',
      selectMaritime: '',
      maritime: [],
      danhSach: [],
      headers: [
        {
          sortable: false,
          text: 'STT',
          align: 'center',
          value: 'name'
        },
        {
          sortable: false,
          text: 'Mã phòng ban',
          align: 'center',
          value: 'name'
        },
        {
          sortable: false,
          text: 'Tên phòng ban',
          align: 'center',
          value: 'country'
        },
        {
          sortable: false,
          text: 'Cảng vụ hàng hải',
          align: 'center',
          value: 'city'
        },
        {
          sortable: false,
          text: 'Thao tác',
          align: 'center',
          value: 'city'
        }
      ],     
    }
  },
  computed: {
    categoryId () {
      return this.$route.query.categoryId 
    },
    maritimeCurrent () {
      return this.$store.getters["category/maritimeCurrent"]
    },
    categoryList () {
      return this.$store.getters["category/categoryListItems"]
    },
    link () {
      let originUrl = this.$store.getters["category/Url"]
      let url = originUrl.reportExel
      let params = {
        reportId: this.categoryId,
        departmentName: this.departmentName,
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
  created () {
    let vm = this;
    this.$nextTick(() => {
      vm.$store.dispatch("category/getMaritime").then(
        res => {
          vm.maritime = res.data;
          vm.danhSach = vm.categoryList
          vm.danhSach.map(item => {
            let lt = vm.maritime.find(i => i.maritimeCode === item.portOfAuthority)
            item['maritimeNameVN'] = lt.maritimeNameVN
            return item
          })
        }
      );
    });
  },
  watch: {
    categoryList () {
      let vm = this
      vm.danhSach = vm.categoryList
      vm.danhSach.map(item => {
        let lt = vm.maritime.find(i => i.maritimeCode === item.portOfAuthority)
        item['maritimeNameVN'] = lt.maritimeNameVN
        return item
      })
    }
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.departmentCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.departmentCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.departmentCode}})
    },
    search() {
      this.pagesize = 10
      this.page = 1
      if (typeof this.selectMaritime == "undefined") {
        this.selectMaritime = ''
      }
      let params = {
        categoryId: this.categoryId,
        departmentName: this.departmentName,
        portOfAuthority: this.selectMaritime,
        start: 0,
        end: 10
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
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page
      let vm = this
      let params = {
        categoryId: this.categoryId,
        departmentName: this.departmentName,
        portOfAuthority: this.selectMaritime,
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };
      this.$store
        .dispatch("category/searchCategoryListItems", params)
        .then();
    }
  } 
}
</script>
<style>


</style>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>