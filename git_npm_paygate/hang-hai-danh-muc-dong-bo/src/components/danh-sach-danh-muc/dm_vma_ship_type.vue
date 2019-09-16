<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <!-- <v-flex xs3>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Mã công dụng tàu:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                
      
                  v-model="selectShipTypeCode"
                  height="15"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex> -->
            <v-flex xs4>
              <v-layout align-center>
                <v-flex xs5>
                  <label>Loại và Công dụng tàu:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                  v-model="selectShipTypeName"
                  height="15"
                   @change="search"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs5>
              <v-layout align-center>
                <div style="display:flex; justify-content: center;align-items: center; width:100%; height:38px;">
                  <input type="radio" id="one" value="applyShip" v-model="radios" style="margin-right:10px;">
                  <label for="one" style="margin-right:20px;">Của tàu biển</label>
                
                  <input type="radio" id="two" value="applyBoat" v-model="radios" style="margin-right:10px;">
                  <label for="two" style="margin-right:20px;">Của phương tiện thủy nội địa</label>
                  <!-- <v-radio-group v-model="radios" :mandatory="false">
                    <v-radio label="Của tàu biển" value="applyShip"></v-radio>
                    <v-radio label="Của phương tiện thủy nội địa" value="applyBoat"></v-radio>
                  </v-radio-group> -->
                </div>

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
          :items = "DanhSach"
          hide-actions
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{  page*pagesize - pagesize + props.index + 1 }}</td>
                <td class="text-xs-center">{{ props.item.shipTypeCode  }}</td>
                <td class="text-xs-center">{{ props.item.shipTypeName }}</td>
                <td class="text-xs-center">{{ props.item.shipTypeRefNameVn}}</td>
                <td class="text-xs-center">{{ props.item.remarks}}</td>
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
      //selectShipTypeCode: '',
      selectShipTypeName: '',
      DanhSach: [],
      radios: 'applyShip',
      LoaiTau: [],
      headers: [
        {
          sortable: false,
          text: 'STT',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Mã công dụng tàu',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Loại và Công dụng tàu',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Loại tàu MCQG',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ghi chú  ',
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
    categoryId () {
      return this.$route.query.categoryId 
    },
    categoryList () {
      return this.$store.getters["category/categoryListItems"]
    },
    link () {
      let originUrl = this.$store.getters["category/Url"]
      let url = originUrl.reportExel
      let applyShip = this.radios === 'applyShip' ? '1' : ''
      let applyBoat = this.radios === 'applyBoat' ? '1' : ''
      let params = {
        reportId: this.categoryId,
        shipTypeCode: this.selectShipTypeCode,
        shipTypeName: this.selectShipTypeName,
        applyShip: applyShip,
        applyBoat: applyBoat
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
    this.$nextTick(async ()=>{
      let vm =  this
      let applyShip = this.radios === 'applyShip' ? '1' : ''
      let applyBoat = this.radios === 'applyBoat' ? '1' : ''
      let params = {
        categoryId: this.categoryId,
        shipTypeCode: this.selectShipTypeCode,
        shipTypeName: this.selectShipTypeName,
        applyShip: applyShip,
        applyBoat: applyBoat
      }
      let search = await this.$store.dispatch('category/searchCategoryListItems', params)
      this.$store.dispatch("category/getDanhMuc", { categoryId: "DM_SHIP_TYPE"}).then(
        res => {
          vm.LoaiTau = res
          vm.DanhSach = vm.categoryList
          vm.DanhSach.map(item => {
            let lt = vm.LoaiTau.find(i => i.shipTypeCode === item.shipTypeRef)
            item['shipTypeRefNameVn'] = lt.shipTypeNameVN
            return item
          })
        }
      )

    })
  },
  watch: {
    categoryList () {
        let vm =  this
        this.$store.dispatch("category/getDanhMuc", { categoryId: "DM_SHIP_TYPE"}).then(
        res => {
          vm.LoaiTau = res
          vm.DanhSach = vm.categoryList
          vm.DanhSach.map(item => {
            let lt = vm.LoaiTau.find(i => i.shipTypeCode === item.shipTypeRef)
            item['shipTypeRefNameVn'] = lt.shipTypeNameVN
            return item
          })
        }
      )
    }
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.shipTypeCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.shipTypeCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    search () {
      this.pagesize = 10
      this.page = 1
      let applyShip = this.radios === 'applyShip' ? '1' : ''
      let applyBoat = this.radios === 'applyBoat' ? '1' : ''
      let params = {
        categoryId: this.categoryId,
        shipTypeCode: this.selectShipTypeCode,
        shipTypeName: this.selectShipTypeName,
        applyShip: applyShip,
        applyBoat: applyBoat,
        start: 0,
        end: 10
      }
      this.$store.dispatch('category/searchCategoryListItems', params)
        .then()
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.shipTypeCode}})
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
      let applyShip = this.radios === 'applyShip' ? '1' : ''
      let applyBoat = this.radios === 'applyBoat' ? '1' : ''
      let vm = this
      let params = {
        categoryId: this.categoryId,
        shipTypeCode: this.selectShipTypeCode,
        shipTypeName: this.selectShipTypeName,
        applyShip: applyShip,
        applyBoat: applyBoat,
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