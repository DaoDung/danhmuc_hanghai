<template>
  <div id="danh-sach">
    <v-layout row wrap>
      <v-alert v-if="isAlertThanhCong" type="success" max-width="200" class="alert-chitiet">
        Thành công!
      </v-alert>
      <v-alert v-if="isAlertThatBai" type="error" max-width="200" class="alert-chitiet">
        Thất bại!
      </v-alert>
      <v-dialog
        v-model="dialog"
        max-width="310"
      >
        <v-card>
          <div style="width:100%; padding: 10px;">
            <span>Bạn có chắc chắn muốn xóa dữ liệu này?</span>
          </div>


          <v-card-actions>
            <div class="flex-grow-1"></div>

            <v-btn
              color="primary darken-1"
              text
              @click="xoaItem"
            >
              Có
            </v-btn>

            <v-btn
              color="primary darken-1"
              text
              @click="dialog = false"
            >
              Không
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
      <v-flex xs12>
        <div style="width:100%; font-size: 28px;">
          <i class="mdi mdi-format-align-justify" aria-hidden="true"></i>
          <span style="margin-left:10px;">Tai nạn hàng hải</span>
        </div>
      </v-flex>
      <v-flex xs12>
        <div id="bang-danh-sach">
            <v-flex xs12 class="text-lg-right">
              <v-btn class="ma-2" tile color="primary" @click="them">
                <v-icon left>mdi-folder</v-icon> Thêm
              </v-btn>
            </v-flex>
            <div style="overflow-x: auto; width: 100%;">
              <table>
                <thead>
                  <tr>
                    <th v-for="key in headers" :key="key.text">
                      <span>{{key.text}}</span>
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td class="td-search">

                    </td>
                    <!--Search tên tàu-->
                    <td class="td-search">
                      <v-text-field
                        v-model="nameOfShipSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <!--Search quốc tịch-->
                    <td class="td-search">
                      <v-text-field
                        v-model="flagStateOfShipSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <!--Search IMO-->
                    <td class="td-search">
                      <v-text-field
                        v-model="imoNumberSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <!--Search hô hiệu-->
                    <td class="td-search">
                      <v-text-field
                        v-model="callSignSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <!--Search ĐK-->
                    <td class="td-search">
                      <v-text-field
                        v-model="registryNumberSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <td class="td-search">
                    </td>
                    <!--Search loại tai nạn-->
                    <td class="td-search">
                      <v-select
                        v-model="accidentTypeSearch"
                        autocomplete
                        :items="loaiTaiNan"
                        return-object
                        item-text="text"
                        item-value="value"
                        @change="searchTaiNan"
                      ></v-select>
                    </td>
                    <!--Search mức độ-->
                    <td class="td-search">
                      <v-select
                        v-model="accidentCriticalTypeSearch"
                        autocomplete
                        :items="mucDo"
                        return-object
                        item-text="text"
                        item-value="value"
                        @change="searchTaiNan"
                      ></v-select>
                    </td>
                    <!--Search số người chết-->
                    <td class="td-search">
                      <v-text-field
                        v-model="numberOfDeadSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <!--Search số người bị thương-->
                    <td class="td-search">
                      <v-text-field
                        v-model="numberOfInjuredSearch"
                        @change="searchTaiNan"
                      ></v-text-field>
                    </td>
                    <td class="td-search">

                    </td>
                    <td class="td-search">
                    </td>
                    <td class="td-search">
                    </td>
                    <td class="td-search">
                    </td>
                    <!--Search đơn vị báo cáo-->
                    <!-- <td class="td-search">
                      <v-select
                        v-model="portofAuthoritySearch"
                        autocomplete
                        :items="cangVuHangHai"
                        return-object
                        item-text="cityCode"
                        item-value="maritimeCode"
                        @change="searchTaiNan"
                      ></v-select>
                    </td> -->
                    <td class="td-search"></td>
                  </tr>
                  <tr v-for="(key, index) in danhSach" :key="index">
                    <td class="text-xs-center">{{ index + 1 }}</td>
                    <td class="text-xs-center" style="width:150px;">{{ key.nameOfShip }}</td>
                    <td class="text-xs-center">{{ key.flagStateOfShip }}</td>
                    <td class="text-xs-center">{{ key.imoNumber }}</td>
                    <td class="text-xs-center">{{ key.callSign }}</td>
                    <td class="text-xs-center">{{ key.registryNumber }}</td>
                    <td class="text-xs-center" style="width:100px;">{{ key.accidentTime }}</td>
                    <td class="text-xs-center">{{ getLoaiTaiNan(key.accidentType) }}</td>
                    <td class="text-xs-center">{{ getLoaiMucDo(key.accidentCriticalType) }}</td>
                    <td class="text-xs-center">{{  key.numberOfDead }}</td>
                    <td class="text-xs-center">{{ key.numberOfInjured }}</td>
                    <td class="text-xs-center">{{ key.pilotOnBoad === '1' ? 'Có':'Không' }}</td>
                    <td class="text-xs-center" >{{ key.makeInvestigation === '1' ? 'Có' : 'Không' }}</td>
                    <td class="text-xs-center" style="width:100px;">{{ key.investigationDate }}</td>
                    <td class="text-xs-center" style="width:100px;">{{ key.accidentOfficialDate  }}</td>
                    <!-- <td class="text-xs-center" style="width:150px;"></td> -->
                    <td class="text-xs-center" style="">
                      <span @click="sua(key)" class="action-table"><strong>Sửa</strong></span>
                      <span @click="xoa(key)" class="action-table"><strong>Xóa</strong></span>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
            <div class="text-xs-right layout wrap" style="position: relative;">
              <div class="flex pagging-table px-2"> 
                <tiny-pagination :page="page" :pagesize="pagesize" @tiny:change-page="paggingData"></tiny-pagination> 
              </div>
            </div>
            <!-- <v-data-table
                :headers= "headers"
                :items= "danhSach"
                no-data-text = "Không có dữ liệu"
                hide-default-footer
              >
              <template slot="headers" scope="props">
                <tr>
                  <th v-for="header in props.headers" :key="header.text"
                  >
                    {{ header.text }}
                  </th>
                  <th></th>
                </tr>
              </template>
              <template slot="items" slot-scope="props">
                <tr>
                  <td class="text-xs-center">{{ props.index + 1 }}</td>
                  <td class="text-xs-center">{{ props.item.nameOfShip }}</td>
                  <td class="text-xs-center">{{ props.item.flagStateOfShip }}</td>
                  <td class="text-xs-center">{{ props.item.imoNumber }}</td>
                  <td class="text-xs-center">Có</td>
                  <td class="text-xs-center">{{ props.item.callSign }}</td>
                  <td class="text-xs-center">{{ props.item.registryNumber }}</td>
                  <td class="text-xs-center">{{ props.item.accidentTime }}</td>
                  <td class="text-xs-center">{{ getLoaiTaiNan(props.item.accidentType) }}</td>
                  <td class="text-xs-center">{{ getLoaiMucDo(props.item.accidentCriticalType) }}</td>
                  <td class="text-xs-center">{{  props.item.numberOfDead }}</td>
                  <td class="text-xs-center">{{ props.item.numberOfInjured }}</td>
                  <td class="text-xs-center"></td>
                  <td class="text-xs-center">{{ props.item.pilotOnBoad ? 'Có':'Không' }}</td>
                  <td class="text-xs-center">{{ props.item.makeInvestigation ? 'Có' : 'Không' }}</td>
                  <td class="text-xs-center">{{ props.item.investigationDate }}</td>
                  <td class="text-xs-center">{{ props.item.accidentOfficialDate  }}</td>
                  <td class="text-xs-center"></td>
                  <td class="text-xs-center" style="width: 210px;padding-left: 0px;padding-right: 5px;">
                    <span @click="sua(props.item)" class="action-table"><strong>Sửa</strong></span>
                    <span @click="xoa(props.item)" class="action-table"><strong>Xóa</strong></span>
                  </td>
                </tr>
              </template>
            </v-data-table> -->
        </div>
      </v-flex>
    </v-layout>
  </div>
</template>

<script>
import TinyPagination from './pagination.vue'
export default {
  components: {
    'tiny-pagination': TinyPagination,
  },
  data: () => ({
    isAlertThanhCong: false,
    isAlertThatBai: false,
      nameOfShipSearch: '',
      flagStateOfShipSearch: '',
      imoNumberSearch: '',
      callSignSearch: '',
      registryNumberSearch: '',
      accidentTypeSearch: '',
      accidentCriticalTypeSearch: '',
      numberOfDeadSearch: '',
      numberOfInjuredSearch: '',
      portofAuthoritySearch: '',
      dialog: false,
      pagesize: 10,
      page: 1,
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên tàu",
          align: "center"
        },
        {
          sortable: false,
          text: "Quốc tịch",
          align: "center"
        },
        {
          sortable: false,
          text: "IMO",
          align: "center"
        },
        {
          sortable: false,
          text: "Hô hiệu",
          align: "center"
        },
        {
          sortable: false,
          text: "Số ĐK",
          align: "center"
        },
        {
          sortable: false,
          text: "Ngày tai nạn",
          align: "center"
        },
        {
          sortable: false,
          text: "Loại tai nạn",
          align: "center"
        },
        {
          sortable: false,
          text: "Mức độ",
          align: "center"
        },
        {
          sortable: false,
          text: "Số người chết/Mất tích",
          align: "center"
        },
        {
          sortable: false,
          text: "Số người bị thương",
          align: "center"
        },
        {
          sortable: false,
          text: "Có hoa tiêu dẫn tàu",
          align: "center"
        },
        {
          sortable: false,
          text: "Có điều tra tai nạn",
          align: "center"
        },
        {
          sortable: false,
          text: "Ngày điều tra",
          align: "center"
        },
        {
          sortable: false,
          text: "Hạn nộp báo cáo",
          align: "center"
        },
        // {
        //   sortable: false,
        //   text: "Đơn vị báo cáo",
        //   align: "center"
        // },
        {
          sortable: false,
          text: "Thao tác",
          align: "center"
        }
      ],
      item: {},
      danhSach: [],
      loaiTaiNan: [
        {
          value: '1',
          text: 'Đâm va/ mắc cạn'
        },
        {
          value: '2',
          text: 'Cháy/ nổ'
        },
        {
          value: '3',
          text: 'Nghiêng/ lật'
        },
        {
          value: '4',
          text: 'Rò rỉ'
        },
        {
          value: '5',
          text: 'Hỏng máy'
        },
        {
          value: '6',
          text: 'Thương tật/ nhiễm độc/ chết người'
        },
        {
          value: '7',
          text: 'Ô nhiễm xả thải'
        },
      ],
      mucDo: [
        {
          value: '1',
          text: 'Đặc biệt nghiêm trọng'       
        },
        {
          value: '2',
          text: 'Nghiêm trọng', 
        },
        {
          value: '3',
          text: 'Ít nghiêm trọng'
        }
      ],
      cangVuHangHai: []
  }),
  computed: {

  },
  created () {
    let vm = this
    this.$nextTick(()=> {
      vm.getDanhSach()
      vm.getCangVuHangHai()
    })
  },
  methods: {
    getDanhSach () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/getDanhSach').then(
        res => {
          vm.danhSach = res
          console.log(vm.danhSach)
        }
      )
    },
    getCangVuHangHai () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/getCangVuHangHai').then(
        res => {
          vm.cangVuHangHai = res
          console.log("Cang Vu Hang Hai: ",vm.cangVuHangHai)
        }
      )
    },
    getLoaiTaiNan (accidentType) {
      console.log(accidentType)
      let nameAccidentType = ''
      switch (accidentType) {
        case '1':
          nameAccidentType = 'Gây Đâm va/mắc cạn'
          break
        case '2':
          nameAccidentType = 'Cháy/ nổ'
          break
        case '3':
          nameAccidentType = 'Nghiêng/ lật'
          break
        case '4':
          nameAccidentType = 'Rò rỉ'
          break
        case '5':
          nameAccidentType = 'Do hỏng máy'
          break
        case '6':
          nameAccidentType = 'Thương tật/ nhiễm độc/ chết người'
          break
        case '7':
          nameAccidentType = 'Ô nhiễm/ xả thải'
          break

      }
      return nameAccidentType
    },
    getLoaiMucDo (accidentCriticalType) {
      let nameAccidentCriticalType = ''
      switch (accidentCriticalType) {
        case '1':
          nameAccidentCriticalType = 'Đặc biệt nghiêm trọng'
          break
        case '2':
          nameAccidentCriticalType = 'Nghiêm trọng'
          break
        case '3':
          nameAccidentCriticalType = 'Ít nghiêm trọng'
          break
      }
      return nameAccidentCriticalType
    },
    them() {
      // let params = {
      //   id: '',
      //   portofAuthority: '',
      //   accidentCode: '',
      //   numberOfDead: '',
      //   acidentTime: '',
      //   accidentRegion: '',
      //   accidentBrief: '',
      //   accidentConslusion: '',
      //   accidentType: '',
      //   accidentCriticalType: '',
      //   nameOfShip: '',
      //   accidentTime: '',
      //   imoNumber: '',
      //   callSign: '',
      //   flagStateOfShip: '',
      //   registryNumber: '',
      //   decisionNo: '',
      //   decisionDate: '',
      //   decisionOrganization: '',
      //   officialDate: '',
      //   officiaNo: '',
      //   officialPlace: '',
      //   violationDate: '',
      //   violationPartCode: '',
      //   issueDate: '',
      //   issueBy: '',
      //   violationPartName: '',
      //   violationPartAddress: '',
      //   representative: '',
      //   representativeTitle: '',
      //   modifiedDate: '',
      //   numberOfInjured: '',
      //   investigationDate: '',
      //   accidentOfficialDate: ''
      // }
      // this.$store.dispatch('TaiNanHangHai/setTaiNanHangHai', params)
      this.$router.push({name: "chi_tiet_tai_nan", query: {action: 'them-tai-nan'}});
    },
    xoa(item) {
      this.dialog = true;
      this.item = item
    },
    xoaItem () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/xoaTaiNan', this.item).then(
        res => {
          vm.dialog = false
          console.log('themDanhMuc:', res)
          vm.getDanhSach()
          if (res.status === 1) {
            vm.isAlertThanhCong= true
          } else {
            vm.isAlertThatBai= true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai= false
          },2000)
        }
      );
    },
    sua(key) {
      //this.$store.dispatch('TaiNanHangHai/setTaiNanHangHai', key)
      this.$router.push({name: "chi_tiet_tai_nan", query: {action: 'sua-tai-nan', id: key.id}});
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page
      let vm = this
      let params = {
        nameOfShip: this.nameOfShipSearch,
        flagStateOfShip: this.flagStateOfShipSearch,
        imoNumber: this.imoNumberSearch,
        callSign: this.callSignSearch,
        registryNumber: this.registryNumberSearch,
        accidentType: this.accidentTypeSearch.value,
        accidentCriticalType: this.accidentCriticalTypeSearch.value,
        numberOfDead: this.numberOfDeadSearch,
        numberOfInjured: this.numberOfInjuredSearch,
      };
      this.$store
        .dispatch("category/getDanhSach", params)
        .then();
    },
    searchTaiNan () {
      let vm = this
      this.pagesize = 10
      this.page = 1
      console.log(this.accidentTypeSearch)
      console.log(this.accidentCriticalTypeSearch)
      const params = {
        nameOfShip: this.nameOfShipSearch,
        flagStateOfShip: this.flagStateOfShipSearch,
        imoNumber: this.imoNumberSearch,
        callSign: this.callSignSearch,
        registryNumber: this.registryNumberSearch,
        accidentType: this.accidentTypeSearch.value,
        accidentCriticalType: this.accidentCriticalTypeSearch.value,
        numberOfDead: this.numberOfDeadSearch,
        numberOfInjured: this.numberOfInjuredSearch,
      }
      this.$store.dispatch('TaiNanHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
          console.log(vm.danhSach)
        }
      )
    }
  }
};
</script>
<style>
#danh-sach{
  width: 100%;
  padding: 0 20px;
}

#danh-sach table, #dialog table {

  border-radius: 3px;
  background-color: #fff;
  overflow-x: auto;
  border-spacing: 1px;
  border-right: 1px solid #ddd;
  border-top: 1px solid #ddd;
}

#danh-sach th, #dialog th {
  background-color: #3563c1!important;
  border-bottom: 1px solid #ddd;
  color: #fff;
  font-size: 13px;
}

#danh-sach td, #dialog td {
  background-color: #f9f9f9;
  border-bottom: 1px solid #ddd;
  font-size: 13px;
}

#danh-sach th,#danh-sach td, #dialog th, #dialog td {
  padding: 5px 10px;
  border-left: 0.5px solid #ddd;
}
.td-search {

}
#danh-sach .td-search .v-text-field__details{
  display: none;
}
#danh-sach th.active {
  color: #fff;
}

#danh-sach th.active .arrow {
  opacity: 1;
}

.arrow {
  display: inline-block;
  vertical-align: middle;
  width: 0;
  height: 0;
  margin-left: 5px;
  opacity: 0.66;
}

.arrow.asc {
  border-left: 4px solid transparent;
  border-right: 4px solid transparent;
  border-bottom: 4px solid #fff;
}

.arrow.dsc {
  border-left: 4px solid transparent;
  border-right: 4px solid transparent;
  border-top: 4px solid #fff;
}
.action-table{
  margin-left: 5px;
  margin-right: 5px;
  color: darkblue;
}
.action-table:hover{
  cursor: pointer;
}       
</style>
