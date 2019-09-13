<template>
  <div id="danh-sach">
    <v-flex xs12>
      <div class="filter-danhmuc">
        <v-container fluid grid-list-md>
          <v-layout row wrap>
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
                <td>{{ props.item.shipName  }}</td>
                <td>{{ props.item.shipPreviousName }}</td>
                <td>{{ props.item.shipTypeMT}}</td>
                <td>{{ props.item.shipTypeCode}}</td>
                <td>{{ props.item.shipBoat === 'SHIP' ? 'Tàu biển' : 'PTTND'}}</td>
                <td>{{ props.item.sasTugBoat ? 'Có' : 'Không'}}</td>
                <td>{{ props.item.tugBoatName}}</td>
                <td>{{ props.item.nameOfMaster}}</td>
                <td>{{ props.item.flagStateOfShip}}</td>
                <td>{{ props.item.remarks}}</td>
                <td>{{ props.item.isDelete ? "Đã đánh dấu xóa" :  "Đang sử dụng" }}</td>
                <td class="text-xs-center" style="width: 90px;padding-left: 0px;padding-right: 5px;">
                  <span @click="infoCategory(props.item)" class="action-table"><strong>Xem</strong></span>
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
      maritime: [],
      BenCang: [],
      selectBenCang: '',
      selectKhuVucHangHai: '',
      selectPortWharfNameVN: '',
      selectMaritime: '',
      headers: [
        {
          sortable: false,
          text: 'STT',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Tên tàu/ Tên phương tiện',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Tên cữ',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Loại tàu (theo MCQG)',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Loại và công dụng tàu',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Là Tàu biển hay Phương tiện thủy nội địa',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'PTTND Có tàu kéo xà lan',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Tên tàu kéo xà lan',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Thuyền trưởng',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Quốc tịch',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ghi chú',
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
    maritimeCurrent () {
      return this.$store.getters["category/maritimeCurrent"]
    },
    categoryList () {
      return this.$store.getters["category/categoryListItems"]
    },
    khuVucHangHai () {
      return this.$store.getters["category/KhuVucHangHai"]
    },
    link () {
      let originUrl = this.$store.getters["category/Url"]
      let url = originUrl.reportExel
      let params = {
        reportId: this.categoryId,
        maritimeCode: this.selectMaritime,
        holdPortRegionCode: this.selectKhuVucHangHai,
        holdPortHarbourCode: this.selectBenCang,
        portWharfNameVN: this.selectPortWharfNameVN
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
    this.$nextTick( () => {
      vm.$store.dispatch('category/getMaritime')
        .then(res => {
            vm.maritime = res.data
        })
      vm.selectMaritime = vm.maritimeCurrent.maritimeCode
    })
  },
  watch: {
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.portWharfCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.portWharfCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    search () {
      this.pagesize = 10
      this.page = 1
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        holdPortRegionCode: this.selectKhuVucHangHai,
        holdPortHarbourCode: this.selectBenCang,
        portWharfNameVN: this.selectPortWharfNameVN,
        start: 0,
        end: 10
      }
      this.$store.dispatch('category/searchCategoryListItems', params)
        .then()
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.portWharfCode}})
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
        holdPortRegionCode: this.selectKhuVucHangHai,
        holdPortHarbourCode: this.selectBenCang,
        portWharfNameVN: this.selectPortWharfNameVN,
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