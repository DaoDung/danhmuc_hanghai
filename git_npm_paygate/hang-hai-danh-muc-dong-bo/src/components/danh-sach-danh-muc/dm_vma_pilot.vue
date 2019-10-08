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
                    persistent-hint
                    :items="maritime"
                    item-text="cityCode"
                    item-value="maritimeCode" 
                     @change="search"
                    height="15"   
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Công ty hoa tiêu:</label>
                </v-flex>
                <v-flex xs7>
                  <v-autocomplete
                    v-model="selectPilotCompanyCode"
                    persistent-hint
                    :items="pilotCompany"
                    item-text="pilotCompanyName"
                    item-value="pilotCompanyCode" 
                    height="15"
                     @change="search"
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <!-- <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Tên công ty hoa tiêu:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                  v-model="selectPilotCompanyName"
                  height="15"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex> -->
            <!-- <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Mã hoa tiêu:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                  v-model="selectPilotCode"
                  height="15"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex> -->
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Hạng hoa tiêu:</label>
                </v-flex>
                <v-flex xs7>
                  <v-autocomplete
                    v-model="selectPilotCategoryCode"
                    persistent-hint
                    :items="pilotCategory"
                    item-text="pilotCategoryName"
                    item-value="pilotCategoryCode" 
                    height="15"
                     @change="search"
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Tên hoa tiêu:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                  v-model="selectPilotName "
                  height="15"
                  @change="search"
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
                <td class="text-xs-center">{{ props.item.pilotCode  }}</td>
                <td class="text-xs-center">{{ props.item.pilotName }}</td>
                <td class="text-xs-center">{{ props.item.pilotCompanyName}}</td>
                <td class="text-xs-center">{{ props.item.pilotCertificateDate}}</td>
                <td class="text-xs-center">{{ props.item.pilotNo}}</td>
                <td class="text-xs-center">{{ props.item.pilotCertificateNo}}</td>
                <td class="text-xs-center">{{ props.item.pilotCategoryName}}</td>
                <td class="text-xs-center"  :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" :  "Đang sử dụng" }}</td>
                <td class="text-xs-center" style="width: 90px;padding-left: 0px;padding-right: 5px;">
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
import { async } from 'q';
import TinyPagination from '../hanghai_pagination.vue'

export default {
  components: {
    'tiny-pagination': TinyPagination,
  },
  data () {
    return {
      pagesize: 10,
      page: 1,
      maritime: [],
      pilotCompany: [],
      pilotCategory: [],
      selectPilotCompanyCode: '',
      selectPilotCompanyName: '',
      selectPilotCode: '',
      selectPilotName: '',
      selectPilotCategoryCode: '',
      selectMaritime: '',
      danhSach: [],
      danhSachHangHoaTieu: [],
      danhSachCongTyHoaTieu: [],
      headers: [
        {
          sortable: false,
          text: 'STT',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Mã hoa tiêu',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Hoa tiêu',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Công ty hoa tiêu',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ngày cấp bằng',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số hiệu',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số bằng',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Hạng hoa tiêu',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Trạng thái',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Thao tác',
          value: 'salary',
          align: 'center'
        }
      ],     
    }
  },
  computed: {
    pilotCompanyCode () {
      return this.$route.query.pilotCompanyCode 
    },
    maritimeCurrent () {
      return this.$store.getters["category/maritimeCurrent"]
    },
    categoryId () {
      return this.$route.query.categoryId 
    },
    categoryList () {
      return this.$store.getters["category/categoryListItems"]
    },
    link () {
      let originUrl = this.$store.getters["category/Url"]
      let url = originUrl.reportExel
      let params = {
        reportId: this.categoryId,
        maritimeCode: this.selectMaritime,
        pilotCompanyCode: this.selectPilotCompanyCode,
        // pilotCompanyName: this.selectPilotCompanyName,
        // pilotCode: this.selectPilotCode,
        pilotName: this.selectPilotName,
        pilotCategoryCode: this.selectPilotCategoryCode
      }
      for (const key in params) {
        if (params[key] !== '' && typeof params[key] != "undefined") {
          url += '&' + key + '=' + params[key]
        }
      }
      return url
    }
  },
  created () {
    let vm = this
    this.$nextTick( async () => {
      vm.$store.dispatch('category/getMaritime')
        .then(res => {
            vm.maritime = res.data
        })
      vm.selectMaritime = vm.maritimeCurrent.maritimeCode
      vm.$store.dispatch('category/getDanhMuc',{categoryId: 'DM_VMA_PILOT_COMPANY', maritimeCode: vm.selectMaritime})
          .then(res => {
          vm.pilotCompany = res     
          })
      vm.$store.dispatch('category/getDanhMuc',{categoryId: 'DM_VMA_PILOT_CATEGORY', maritimeCode: vm.selectMaritime})
          .then(res => {
          vm.pilotCategory = res     
          })
      this.selectPilotCompanyCode = this.pilotCompanyCode
      if (typeof this.selectPilotCompanyCode == "undefined") {
        this.selectPilotCompanyCode = ''
      }
      if (typeof this.selectPilotCategoryCode == "undefined") {
        this.selectPilotCategoryCode = ''
      }
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        pilotCompanyCode: this.selectPilotCompanyCode,
        // pilotCompanyName: this.selectPilotCompanyName,
        // pilotCode: this.selectPilotCode,
        pilotName: this.selectPilotName,
        pilotCategoryCode: this.selectPilotCategoryCode,
        start: 0,
        end: 10
      }
      let search = await this.$store.dispatch('category/searchCategoryListItems', params)
      vm.$store.dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_COMPANY", maritimeCode: vm.selectMaritime}).then(
        res => {
          vm.danhSachCongTyHoaTieu = res
          vm.danhSach = vm.categoryList
          vm.danhSach.map(item => {
            let lt = vm.danhSachCongTyHoaTieu.find(i => i.pilotCompanyCode === item.pilotCompanyCode)
            item['pilotCompanyName'] = lt.pilotCompanyName
            return item
          })
        }
      )
      vm.$store.dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_CATEGORY", maritimeCode: vm.selectMaritime}).then(
        res => {
          vm.danhSachHangHoaTieu = res
          vm.danhSach = vm.categoryList
          vm.danhSach.map(item => {
            let lt = vm.danhSachHangHoaTieu.find(i => i.pilotCategoryCode === item.pilotCategoryCode)
            item['pilotCategoryName'] = lt.pilotCategoryName
            return item
          })
        }
      )
    })
  },
  watch: {
    categoryList () {
        let vm =  this
        this.$store.dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_COMPANY", maritimeCode: vm.selectMaritime}).then(
          res => {
            vm.danhSachCongTyHoaTieu = res
            vm.danhSach = vm.categoryList
            vm.danhSach.map(item => {
              let lt = vm.danhSachCongTyHoaTieu.find(i => i.pilotCompanyCode === item.pilotCompanyCode)
              item['pilotCompanyName'] = lt.pilotCompanyName
              return item
            })
          }
        )
        this.$store.dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_CATEGORY", maritimeCode: vm.selectMaritime}).then(
          res => {
            vm.danhSachHangHoaTieu = res
            vm.danhSach = vm.categoryList
            vm.danhSach.map(item => {
              let lt = vm.danhSachHangHoaTieu.find(i => i.pilotCategoryCode === item.pilotCategoryCode)
              item['pilotCategoryName'] = lt.pilotCategoryName
              return item
            })
          }
        )
    }
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.pilotCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.pilotCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    search () {
      this.pagesize = 10
      this.page = 1
    
      if (typeof this.selectPilotCompanyCode == "undefined") {
        this.selectPilotCompanyCode = ''
      }
      if (typeof this.selectPilotCategoryCode == "undefined") {
        this.selectPilotCategoryCode = ''
      }
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        pilotCompanyCode: this.selectPilotCompanyCode,
        // pilotCompanyName: this.selectPilotCompanyName,
        // pilotCode: this.selectPilotCode,
        pilotName: this.selectPilotName,
        pilotCategoryCode: this.selectPilotCategoryCode,
        start: 0,
        end: 10
      }
      this.$store.dispatch('category/searchCategoryListItems', params)
        .then()
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.pilotCode}})
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
        maritimeCode: this.selectMaritime,
        pilotCompanyCode: this.selectPilotCompanyCode,
        // pilotCompanyName: this.selectPilotCompanyName,
        // pilotCode: this.selectPilotCode,
        pilotName: this.selectPilotName,
        pilotCategoryCode: this.selectPilotCategoryCode,
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

<style scoped>
.v-input{
  font-size: 13px;
}
</style>