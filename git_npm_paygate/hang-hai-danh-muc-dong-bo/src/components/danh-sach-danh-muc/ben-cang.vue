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
                    height="15"   
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                  <!-- <v-select
                    v-model="selectMaritime"
                    :items="maritime"
                    item-text="cityCode"
                    item-value="maritimeCode"                
                    height="15"
                  ></v-select> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs4>
              <v-layout align-center>
                <v-flex xs4>
                  <label>Khu vực hàng hải:</label>
                </v-flex>
                <v-flex xs8>
                  <v-autocomplete
                    v-model="selectKhuVucHangHai"
                    persistent-hint
                    :items="khuVucHangHai"
                    item-text="portRegionNameVN"
                    item-value="portRegionCode" 
                    height="15"   
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                  <!-- <v-select
                    v-model="selectKhuVucHangHai"
                    :items="khuVucHangHai"
                    item-text="portRegionNameVN"
                    item-value="portRegionCode"                 
                    height="15"
                  ></v-select> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs3>
                  <label>Bến cảng:</label>
                </v-flex>
                <v-flex xs9>
                <v-text-field
                
                  v-model="selectBenCang"
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
          :items = "categoryList"
          hide-actions
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{  page*pagesize - pagesize + props.index + 1 }}</td>
                <td class="text-xs-center">{{ props.item.portHarbourCode }}</td>
                <td class="text-xs-center">{{ props.item.portHarbourNameVN }}</td>
                <td class="text-xs-center">{{ props.item.portCodeCB }}</td>
                <td class="text-xs-center">{{ props.item.portRegionNameVN }}</td>
                <td class="text-xs-center"  :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" : "Đang sử dụng" }}</td>
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
import TinyPagination from '../hanghai_pagination.vue'

export default {
  components: {
    'tiny-pagination': TinyPagination,
  },
  data () {
    return {
      pagesize: 10,
      page: 1,
      selectBenCang: '',
      selectKhuVucHangHai: '',
      selectMaritime: '',
      maritime: [],
      khuVucHangHai: [],
      headers: [
        {
          sortable: false,
          text: 'STT',
          align: 'center',
          value: 'name'
        },
        {
          sortable: false,
          text: 'Mã Bến cảng',
          align: 'center',
          value: 'name'
        },
        {
          sortable: false,
          text: 'Tên Bến cảng',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Cảng biển hàng hải',
          align: 'center',
          value: 'city'
        },
        {
          sortable: false,
          text: 'Khu vực hàng hải',
          align: 'center',
          value: 'salary'
        },
        {
          sortable: false,
          text: 'Trạng thái',
          align: 'center',
          value: 'salary'
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
        maritimeCode: this.selectMaritime,
        portRegion: this.selectKhuVucHangHai,
        portHarbourName: this.selectBenCang
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
    // this.$refs.link.  
    this.$nextTick(async () => {
      vm.$store.dispatch('category/getMaritime')
        .then(res => {
            vm.maritime = res.data
        })

      vm.selectMaritime = vm.maritimeCurrent.maritimeCode     
      vm.$store.dispatch('category/getDanhMuc',{categoryId: 'DM_PORT_REGION'})
          .then(res => {
          vm.khuVucHangHai = res     
          })
    })
  },
  watch: {
    selectMaritime (val) {
      let vm = this
      this.$store.dispatch('category/getDanhMuc', {categoryId: 'DM_PORT_REGION', maritimeCode: val})
          .then(res => {
              vm.khuVucHangHai = res
              vm.selectKhuVucHangHai = ''
          })    
    }
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.portHarbourCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.portHarbourCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    search () {
      this.pagesize = 10
      this.page = 1
      if (typeof this.selectKhuVucHangHai == "undefined") {
        this.selectKhuVucHangHai = ''
      }
      if (typeof this.selectMaritime == "undefined") {
        this.selectMaritime = ''
      }
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        portRegion: this.selectKhuVucHangHai,
        portHarbourName: this.selectBenCang,
        start: 0,
        end: 10
      }
      this.$store.dispatch('category/searchCategoryListItems', params)
        .then()
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.portHarbourCode}})
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
        portRegion: this.selectKhuVucHangHai,
        portHarbourName: this.selectBenCang,
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
.table_ben_cang td{
  border-top: 0px solid #ddd;
  border-left: 1px solid #ddd;
  border-right: 1px solid #ddd;
  border-bottom:1px solid #ddd;
}
.table_ben_cang th{
  border-top: 1px solid #ddd;
  border-left: 1px solid #ddd;
  border-right: 1px solid #ddd;
  border-bottom:0px solid #ddd;
}
.table_khu_vuc_hang_hai th span{
  font-size: 1em;
}
</style>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>
