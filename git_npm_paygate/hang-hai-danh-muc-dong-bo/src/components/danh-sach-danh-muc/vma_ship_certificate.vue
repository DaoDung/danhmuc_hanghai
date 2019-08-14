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
                <td>{{ props.item.maritimeCode  }}</td>
                <td>{{ props.item.IMONumber }}</td>
                <td>{{ props.item.callSign}}</td>
                <td>{{ props.item.VRCode}}</td>
                <td>{{ props.item.registryNumber}}</td>
                <td>{{ props.item.certificateCode}}</td>
                <td>{{ props.item.certificateName}}</td>
                <td>{{ props.item.certificateOrder}}</td>
                <td>{{ props.item.CertificateNo}}</td>
                <td>{{ props.item.description}}</td>
                <td>{{ props.item.certificateIssueDate}}</td>
                <td>{{ props.item.certificateExpiredDate}}</td>
                <td>{{ props.item.examinationDate}}</td>
                <td>{{ props.item.comment}}</td>
                <td>{{ props.item.isExamined}}</td>
                <td>{{ props.item.mandatory}}</td>
                <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
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
          text: 'Mã cảng vụ',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số IMO',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Hô hiệu',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số phân cấp',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số đăng ký hành chính',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Mã giấy phép',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Tên giấy phép',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Thứ tự hiển thị',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số GCN',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Nơi cấp GCN',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ngày cấp GCN',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ngày hết hạn GCN',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Ngày kiểm tra lần cuối',
          value: 'salary',
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
          text: 'Đã kiểm tra trước',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Bắt buộc kiểm tra',
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