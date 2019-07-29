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
          :rows-per-page-items="[10, 20, 30, 100]"
          >
            <template slot="items" slot-scope="props">
              <tr>
                <td class="text-xs-center">{{ props.item.stt }}</td>
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
                <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
                  <span @click="infoCategory(props.item)" class="action-table"><strong>Xem</strong></span>
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
    categoryList () {
      let data = this.$store.getters["category/categoryListItems"]
      data.map((item,index) =>{
        if (true) {
          item['stt']= index + 1
        }
      })
      return data
    },
    khuVucHangHai () {
      return this.$store.getters["category/KhuVucHangHai"]
    },
    link () {
      let url = "http://10.21.201.75:8081/group/lanh-dao/quan-ly-thu-tuc-tau-bien?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=reportExel&p_p_cacheability=cacheLevelPage"
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
      vm.$store.dispatch('category/getMaritimeCurrent')
          .then(res => {
          vm.selectMaritime = res.maritimeCode     
          }, error => {
      })
      vm.$store.dispatch("category/getKhuVucHangHai")
          .then()
    })
  },
  watch: {
    selectKhuVucHangHai (val) {
      let vm = this
      this.$store.dispatch('category/getBenCang', val)
          .then(res => {
              vm.BenCang = res
          })    }
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
      let params = {
        categoryId: this.categoryId,
        maritimeCode: this.selectMaritime,
        holdPortRegionCode: this.selectKhuVucHangHai,
        holdPortHarbourCode: this.selectBenCang,
        portWharfNameVN: this.selectPortWharfNameVN
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
    }   
  }
}
</script>

<style scoped>
.v-input{
  font-size: 13px;
}
</style>