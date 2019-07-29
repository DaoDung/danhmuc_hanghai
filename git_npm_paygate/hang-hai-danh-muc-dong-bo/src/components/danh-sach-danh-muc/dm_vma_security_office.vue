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
                    persistent-hint
                    :items="maritime"
                    item-text="cityCode"
                    item-value="maritimeCode" 
                    height="15"   
                  >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs2>
              <v-layout align-center>
                <v-flex xs4>
                  <label>Địa chỉ:</label>
                </v-flex>
                <v-flex xs9>
                <v-text-field
                  v-model="selectCompanyAddress"
                  height="15"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs2>
              <v-layout align-center>
                <v-flex xs4>
                  <label>Cơ quan:</label>
                </v-flex>
                <v-flex xs7>
                  <v-text-field
                    v-model="selectCompanyName"
                    height="15"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs2>
              <v-layout align-center>
                <v-flex xs3>
                  <label>Email:</label>
                </v-flex>
                <v-flex xs9>
                <v-text-field
                  v-model="selectContactEmail"
                  height="15"
                ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs3>
              <v-layout align-center>
                <v-flex xs4>
                  <label>Số điện thoại:</label>
                </v-flex>
                <v-flex xs7>
                <v-text-field
                  v-model="selectTelNo"
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
          :rows-per-page-items="[10, 20, 30, 100]"
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{ props.item.stt }}</td>
                <td class="text-xs-center">{{ props.item.securityOfficeCode  }}</td>
                <td class="text-xs-center">{{ props.item.companyName }}</td>
                <td>{{ props.item.companyAddress}}</td>
                <td class="text-xs-center">{{ props.item.contactEmail}}</td>
                <td class="text-xs-center">{{ props.item.telNo}}</td>
                <td class="text-xs-center">{{ props.item.faxNo}}</td>
                <td class="text-xs-center">{{ props.item.remarks}}</td>
                <td class="text-xs-center" :class="{'td-trangthai': props.item.isDelete }">{{ props.item.isDelete ? "Đã đánh dấu xóa" :  "Đang sử dụng" }}</td>
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

export default {
  data () {
    return {
      maritime: [],
      selectSecurityOfficeCode: '',
      selectCompanyName: '',
      selectCompanyAddress: '',
      selectContactEmail: '',
      selectTelNo: '',
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
          text: 'Mã cơ quan',
          value: 'name',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Cơ quan quyết định bắt giữ',
          value: 'country',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Địa chỉ',
          value: 'city',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Thư điện tử',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số điện thoại',
          value: 'salary',
          align: 'center'
        },
        {
          sortable: false,
          text: 'Số Fax',
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
        maritimeCode: this.selectMaritime,
        // securityOfficeCode: this.selectSecurityOfficeCode,
        companyName: this.selectCompanyName,
        companyAddress: this.selectCompanyAddress,
        contactEmail: this.selectContactEmail,
        telNo: this.selectTelNo
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
      vm.$store.dispatch('category/getMaritimeCurrent')
          .then(res => {
          vm.selectMaritime = res.maritimeCode     
          })
    })
  },
  watch: {
  },
  methods: {
    editCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'sua-danh-muc', id: item.securityOfficeCode}})
    },
    delCategory (item) {
      this.$store.dispatch('category/setCategoryModel', item)
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'xoa-danh-muc', id: item.securityOfficeCode}})
    },
    addCategory () {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'them-danh-muc', id: 0}})
    },
    search () {
  
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        // securityOfficeCode: this.selectSecurityOfficeCode,
        companyName: this.selectCompanyName,
        companyAddress: this.selectCompanyAddress,
        contactEmail: this.selectContactEmail,
        telNo: this.selectTelNo
      }
      this.$store.dispatch('category/searchCategoryListItems', params)
        .then()
    },
    infoCategory (item) {
      this.$router.push({name: 'chi_tiet_danh_muc', query: {categoryId: this.$route.query.categoryId, aticon: 'chi-tiet-danh-muc', id: item.securityOfficeCode}})
    },
    reportExel () {
      let params = {
        reportId: this.$route.query.categoryId
      }
      this.$store.dispatch("category/reportExel", params)
        .then()    
    }   
  }
}
</script>
<style scoped>
.v-input{
  font-size: 13px;
}
</style>