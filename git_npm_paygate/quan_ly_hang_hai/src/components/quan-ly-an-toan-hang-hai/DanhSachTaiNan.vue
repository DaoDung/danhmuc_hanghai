<template>
  <div id="danh-sach">
    <v-layout row wrap>
      <!-- <v-alert v-if="isAlertThanhCong" type="success" max-width="200" class="alert-chitiet">
        Thành công!
      </v-alert>
      <v-alert v-if="isAlertThatBai" type="error" max-width="200" class="alert-chitiet">
        Thất bại!
      </v-alert> -->
      <!--Dialog xoa-->
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
      <!--Dialog chi tiet-->
      <ChiTietTaiNan :dialogChiTiet="dialogChiTiet" @closeDialog="dialogChiTiet = false" @themTaiNan="themTaiNan" @suaTaiNan="suaTaiNan" :action="action" :id="id"/>
      <v-flex xs12 class="d-flex justify-space-between">
        <div style="width:20%; font-size: 28px;">
          <i class="mdi mdi-format-align-justify" aria-hidden="true"></i>
          <span style="margin-left:10px;">Tai nạn hàng hải</span>
        </div>
        <div>
          <v-btn class="ma-2" text outlined tile color="primary" @click="back">
            <v-icon left>mdi-keyboard-backspace</v-icon> Quay lại
          </v-btn>
          <v-btn class="ma-2" tile color="primary" @click="openDialogThem">
            <v-icon left>mdi-folder</v-icon> Thêm
          </v-btn>
        </div>
      </v-flex>
      <v-flex xs12>
        <div id="bang-danh-sach">
            <v-flex xs12 class="text-lg-right">

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
                      <v-combobox
                        v-model="accidentTypeSearch"
                        :items="loaiTaiNan"
                        item-text="text"
                        item-value="value"
                        @change="searchTaiNan"
                      ></v-combobox>
                    </td>
                    <!--Search mức độ-->
                    <td class="td-search">
                      <v-combobox
                        v-model="accidentCriticalTypeSearch"
                        :items="mucDo"
                        item-text="text"
                        item-value="value"
                        @change="searchTaiNan"
                      ></v-combobox>
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
                    <td class="td-search"></td>
                  </tr>
                  <tr v-for="(key, index) in danhSach" :key="index">
                    <td class="text-xs-center" @click=openDialogChiTiet(key)>{{ index + 1 }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) style="width:150px;">{{ key.nameOfShip }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.flagStateOfShip }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.imoNumber }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.callSign }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.registryNumber }}</td>
                    <td class="text-xs-center" style="width:100px;" @click=openDialogChiTiet(key) >{{ fomatDate(key.accidentTime) }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ getLoaiTaiNan(key.accidentType) }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ getLoaiMucDo(key.accidentCriticalType) }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{  key.numberOfDead }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.numberOfInjured }}</td>
                    <td class="text-xs-center" @click=openDialogChiTiet(key) >{{ key.pilotOnBoad === '1' ? 'Có':'Không' }}</td>
                    <td class="text-xs-center"  @click=openDialogChiTiet(key) >{{ key.makeInvestigation === '1' ? 'Có' : 'Không' }}</td>
                    <td class="text-xs-center" style="width:100px;" @click=openDialogChiTiet(key) >{{ fomatDate(key.investigationDate) }}</td>
                    <td class="text-xs-center" style="width:100px;" @click=openDialogChiTiet(key) >{{ fomatDate(key.accidentOfficialDate)  }}</td>
                    <!-- <td class="text-xs-center" style="width:150px;"></td> -->
                    <td class="text-xs-center" style="">
                      <!-- <span @click="sua(key)" class="action-table"><strong>Sửa</strong></span> -->
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

        </div>
      </v-flex>
    </v-layout>
  </div>
</template>

<script>
import TinyPagination from './pagination.vue'
import ChiTietTaiNan from './ChiTietTaiNan.vue'
export default {
  components: {
    'tiny-pagination': TinyPagination,
    ChiTietTaiNan
  },
  data: () => ({
    loadData: false,
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
      dialogChiTiet: false,
      action:'',
      id: 0,
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
  watch: {
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
      this.pagesize = 10
      this.page = 1
      let params = {
        start: 0,
        end: 10
      }
      this.$store.dispatch('TaiNanHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    getCangVuHangHai () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/getCangVuHangHai').then(
        res => {
          vm.cangVuHangHai = res
        }
      )
    },
    getLoaiTaiNan (accidentType) {
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
    openDialogThem() {
      this.dialogChiTiet = true
      this.action = 'them-tai-nan'
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
    openDialogChiTiet(key) {
      this.dialogChiTiet = true
      this.action = 'sua-tai-nan'
      this.id = key.id
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
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };
      this.$store.dispatch('TaiNanHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    searchTaiNan () {
      let vm = this
      this.pagesize = 10
      this.page = 1
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
        start: 0,
        end: 10
      }
      this.$store.dispatch('TaiNanHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    fomatDate(val){
      let date = new Date(val)
      let YYYY = date.getFullYear()
      let MM = (date.getMonth() + 1) <= 10 ? ('0' + (date.getMonth() + 1)) : (date.getMonth() + 1)
      let DD = date.getDate() <=10 ? ('0' + date.getDate()) : date.getDate()
      let HH = date.getHours() <= 10 ? ('0' + date.getHours()) : date.getHours()
      let II = date.getMinutes() <= 10 ? ('0' + date.getMinutes()) : date.getMinutes()
      let dateTime =  YYYY + '-' + MM + '-' + DD + ' ' + HH + ':' + II
      return dateTime
    },
    themTaiNan(e) {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/themTaiNan', e).then(
        res => {
          if (res.status === 1) {
            vm.dialogChiTiet = false
            vm.isAlertThanhCong= true
            vm.getDanhSach()
          }
          else {
            vm.dialogChiTiet = false
            vm.isAlertThatBai= true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai= false
          },2000)
        }
      );
    },
    suaTaiNan(e) {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/suaTaiNan', e).then(
        res => {
          if (res.status === 1) {
            vm.dialogChiTiet = false
            vm.isAlertThanhCong= true
            vm.getDanhSach()
          }
          else {
            vm.dialogChiTiet = false
            vm.isAlertThatBai= true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai= false
          },2000)
        }
      );
    },
    back () {
      this.$router.push({name: "quan-ly"});
    }
  },
};
</script>
<style>
#danh-sach{
  width: 100%;
  padding: 20px 20px;
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
  border-bottom: 1px solid #ddd;
  font-size: 13px;
}
#danh-sach tr:hover, #dialog tr:hover{
  background-color: #88888829;
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
