<template>
  <div id="chi-tiet">
      <v-alert v-if="isAlertThanhCong" type="success" max-width="200" class="alert-chitiet">
        Thành công!
      </v-alert>
      <v-alert v-if="isAlertThatBai" type="error" max-width="200" class="alert-chitiet">
        Thất bại!
      </v-alert>
      <v-dialog 
        v-model="diaLogShip"
        max-width="600"
      >
        <v-card>
          <div id="dialog" style="width:100%; padding: 10px;">
            <table style="width:100%;">
                <thead>
                  <tr>
                    <th v-for="key in headers" :key="key.text">
                      <span>{{key.text}}</span>
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="(key, index) in ships" :key="index">
                    <td class="text-xs-center">{{ index + 1 }}</td>
                    <td class="text-xs-center" style="width:150px;">{{ key.shipName }}</td>
                    <td class="text-xs-center">{{ key.stateName }}</td>
                    <td class="text-xs-center">{{ key.imoNumber }}</td>
                    <td class="text-xs-center">{{ key.callSign }}</td>
                    <td class="text-xs-center" style="">
                      <span @click="chonTau(key)" class="action-table"><strong>Chọn</strong></span>
                    </td>
                  </tr>
                </tbody>
              </table>
          </div>


          <v-card-actions>
            <div class="flex-grow-1"></div>
            <v-btn small color="primary" dark @click="diaLogShip = false">Thoát</v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
      <v-flex xs12>
        <div style="width:100%; font-size: 25px; font-weight: 500; ">
          <span style="">Thông tin tai nạn</span>
        </div>
      </v-flex>
      <v-row>
        <v-col cols="6">
          <!--Tên tàu-->
          <v-flex xs12>
            <v-layout>
              <v-flex xs3>
                  <v-btn small color="primary" dark @click="diaLogShip=true">Chọn tàu</v-btn>
              </v-flex>
            </v-layout>
          </v-flex>
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tên tàu:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="ship.shipName"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Quốc tịch-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Quốc tịch:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="ship.flagStateOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Hô hiệu-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Hô hiệu:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="ship.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Số IMO-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số IMO:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="ship.imoNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Số ĐK-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số đăng ký:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="taiNanHangHai.registryNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Ngày tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Ngày tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu2"
                    v-model="menu2"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="ngayTaiNanFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(ngayTaiNanFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="ngayTaiNan" no-title @input="menu2 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Loại tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Loại tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.accidentType"
                    persistent-hint
                    :items="loaiTaiNan"
                    item-text="text"
                    item-value="value"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Mức độ-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Mức độ:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.accidentCriticalType"
                    persistent-hint
                    :items="mucDo"
                    item-text="text"
                    item-value="value"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Ngày điều tra-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Ngày điều tra:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu1"
                    v-model="menu1"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="ngayDieuTraFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(ngayDieuTraFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="ngayDieuTra" no-title @input="menu1 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
        <v-col cols="6">
          <!--Số người bị thương-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số người bị thương:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.numberOfInjured"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Tổn thất hàng hóa-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tổn thất hàng hóa:</label>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.remarksOfCargo"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Tổn thất môi trường-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tổn thất môi trường:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.remarksOfEnvironment"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Hạn nộp báo cáo-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Hạn nộp báo cáo:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu3"
                    v-model="menu3"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="hanNopBaoCaoFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(hanNopBaoCaoFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="hanNopBaoCao" no-title @input="menu3 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Đơn vị báo cáo-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Đơn vị báo cáo:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.portofAuthority"
                    persistent-hint
                    :items="cangVuHangHai"
                    item-text="maritimeNameVN"
                    item-value="maritimeCode"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Số người chết & mất tích-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số người chết & mất tích:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="taiNanHangHai.numberOfDead"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Đơn vị điều tra tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Đơn vị điều tra tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.investigationOffice"
                    persistent-hint
                    :items="cangVuHangHai"
                    item-text="maritimeNameVN"
                    item-value="maritimeCode"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Có hoa tiêu dẫn tàu-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4></v-flex>
              <v-flex xs8><input type="checkbox" v-model="pilotOnBoadModel"> Có hoa tiêu dẫn tàu<br></v-flex>
              <br>
              <br>
            </v-layout>
          </v-flex>
          <!--Có điều tra tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4></v-flex>
              <v-flex xs8><input type="checkbox" v-model="makeInvestigationModel"> Có điều tra tai nạn<br></v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Tổn thất phương tiện & CT GTVT-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Tổn thất phương tiện &amp; CT GTVT:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                  name="input-4-1"
                  v-model="taiNanHangHai.remarksOfShip"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Vị trí tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Vị trí tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                   v-model="taiNanHangHai.accidentRegion"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Tóm tắt vụ tại nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Tóm tắt vụ tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                  v-model="taiNanHangHai.accidentBrief"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Kết luận sử lý và kiến nghị-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Kết luận xử lý và kiến nghị:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                  v-model="taiNanHangHai.accidentConlusion"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <v-flex xs12 class="text-lg-right">
              <v-btn class="ma-2" color="primary" @click="submit">
                {{btnText}}
              </v-btn >
              <v-btn class="ma-2" @click="quayLai" color="primary">
                Quay lại
              </v-btn>
          </v-flex>
        </v-col>
      </v-row>
  </div>
</template>

<script>
import { setTimeout } from 'timers';
export default {
  data: (vm) => ({
    isAlertThanhCong: false,
    isAlertThatBai: false,
    diaLogShip: false,
     btnText: '', 
     loaiTaiNan: [
       {
         text: 'Tai nạn gây Đâm va/ mắc cạn',
         value: '1',
       },
       {
         text: 'Tai nạn gây Cháy/ nổ',
         value: '2',
       },
       {
         text: 'Tai nạn gây Nghiêng/ lật',
         value: '3',
       },
       {
         text: 'Tai nạn gây Rò rỉ',
         value: '4',
       },
       {
         text: 'Tai nạn do hỏng máy',
         value: '5',
       },
       {
         text: 'Tai gây Thương tật/ nhiễm độc/ chết người',
         value: '6',
       },
       {
         text: 'Tai nạn ô nhiễm xả thải',
         value: '7',
       }
     ],
     menu1: false,
     menu2: false,
     menu3: false,
     ngayDieuTraFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
     ngayTaiNanFomated:  vm.formatDate(new Date().toISOString().substr(0, 10)),
     hanNopBaoCaoFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
     mucDo: [
       {
         text: 'Tai nạn hàng hải đặc biệt nghiêm trọng',
         value: '1'
       },
       {
         text: 'Tai nạn hàng hải nghiêm trọng',
         value: '2'
       },
       {
         text: 'Tai nạn hàng hải ít nghiêm trọng',
         value: '3'
       }
     ],
     cangVuHangHai: [],
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
        }
     ],
     ships: [],
     ship: {},
     ngayDieuTra: '',
     ngayTaiNan: '',
     hanNopBaoCao: '',
     taiNanHangHai: {

     }
  }),
  created() {
    console.log('TaiNanHangHai:',this.taiNanHangHai)
    if (this.$route.query.action === "sua-tai-nan") {
      this.btnText = "Cập nhập";
    } 
    if (this.$route.query.action === "them-tai-nan") {
      this.btnText = "Thêm mới";
    }
    if (this.$route.query.action === "xoa-tai-nan") {
      this.btnText = "Xóa";
    }
    this.getDetail()
  },
  computed: {
    // taiNanHangHai () {
    //   return this.$store.getters["TaiNanHangHai/taiNanHangHai"]
    // }
    id () {
      return this.$route.query.id
    }
  },
  watch: {
    ngayDieuTra (val) {
      console.log('Ngay dieu tra change:',val)
      this.ngayDieuTraFomated = this.formatDate(val)
    },
    ngayTaiNan (val) {
      console.log('Ngay tai nan change:',val)
      this.ngayTaiNanFomated = this.formatDate(val)
    },
    hanNopBaoCao (val) {
      console.log('hanNopBaoCao change:',val)
      this.hanNopBaoCaoFomated = this.formatDate(val)
    },
    pilotOnBoadModel(){
      return this.taiNanHangHai.pilotOnBoad === '1' ? true : false
    } ,
    makeInvestigationModel () {
      return this.taiNanHangHai.makeInvestigation === '1' ? true : false
    }
  },
  methods: {
    getDetail () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/getCangVuHangHai').then(
        res => {
          vm.cangVuHangHai = res
          console.log("Cang Vu Hang Hai: ",vm.cangVuHangHai)
        }
      )
      this.$store.dispatch('TaiNanHangHai/getShips').then(
        res => {
          vm.ships = res
        }
      )
      if (this.$route.query.action !== 'them-tai-nan') {
        let params = {
          id: vm.id
        }
        this.$store.dispatch('TaiNanHangHai/getDetailVmaAccidentList', params).then(
          res => {
            vm.taiNanHangHai = res

            vm.ngayDieuTra =  new Date(vm.taiNanHangHai.investigationDate).toISOString().substr(0, 10)
            vm.ngayTaiNan =  new Date(vm.taiNanHangHai.accidentTime).toISOString().substr(0, 10)
            vm.hanNopBaoCao =  new Date(vm.taiNanHangHai.accidentOfficialDate).toISOString().substr(0, 10)
            vm.ngayDieuTraFomated=vm.formatDate(vm.ngayDieuTra)
            vm.ngayTaiNanFomated= vm.formatDate(vm.ngayTaiNan)
            vm.hanNopBaoCaoFomated=vm.formatDate(vm.ngayDieuTra)

            vm.ship.shipName = vm.taiNanHangHai.nameOfShip
            vm.ship.imoNumber = vm.taiNanHangHai.imoNumber
            vm.ship.flagStateOfShip = vm.taiNanHangHai.flagStateOfShip
            vm.ship.callSign =  vm.taiNanHangHai.callSign
          }
        )
      } else {
        vm.taiNanHangHai = {
          id: '',
          portofAuthority: '',
          accidentCode: '',
          numberOfDead: '',
          acidentTime: '',
          accidentRegion: '',
          accidentBrief: '',
          accidentConslusion: '',
          accidentType: '',
          accidentCriticalType: '',
          nameOfShip: '',
          accidentTime: '',
          imoNumber: '',
          callSign: '',
          flagStateOfShip: '',
          registryNumber: '',
          decisionNo: '',
          decisionDate: '',
          decisionOrganization: '',
          officialDate: '',
          officiaNo: '',
          officialPlace: '',
          violationDate: '',
          violationPartCode: '',
          issueDate: '',
          issueBy: '',
          violationPartName: '',
          violationPartAddress: '',
          representative: '',
          representativeTitle: '',
          modifiedDate: '',
          numberOfInjured: '',
          investigationDate: '',
          accidentOfficialDate: '',
          pilotOnBoad: '0',
          makeInvestigation: '0'
        }

        vm.ngayDieuTra = vm.taiNanHangHai.investigationDate
        vm.ngayTaiNan = vm.taiNanHangHai.accidentTime
        vm.hanNopBaoCao = vm.taiNanHangHai.accidentOfficialDate
        vm.ngayDieuTraFomated=vm.formatDate(vm.ngayDieuTra)
        vm.ngayTaiNanFomated= vm.formatDate(vm.ngayTaiNan)
        vm.hanNopBaoCaoFomated=vm.formatDate(vm.ngayDieuTra)

        vm.ship.shipName = vm.taiNanHangHai.nameOfShip
        vm.ship.imoNumber = vm.taiNanHangHai.imoNumber
        vm.ship.flagStateOfShip = vm.taiNanHangHai.flagStateOfShip
        vm.ship.callSign =  vm.taiNanHangHai.callSign
  }
    },
    quayLai(){
      this.$router.push({name: "danh_sach_tai_nan"})
    },
    formatDate (date) {
      if (!date) return null

      const [year, month, day] = date.split('-')
      return `${day}/${month}/${year}`
    },
    parseDate (date) {
      if (!date) return null

      const [month, day, year] = date.split('/')
      return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
    },
    submit () {
      if (this.$route.query.action === "sua-tai-nan") {
        this.suaDanhMuc()
      }
      if (this.$route.query.action === "them-tai-nan") {
        this.themTaiNan()
      }
    },
    themTaiNan(){
      console.log(this.ngayTaiNan)
      let vm = this
      for (let key in this.taiNanHangHai){
        if(key === 'pilotOnBoad'){
          this.taiNanHangHai[key] = this.pilotOnBoadModel ? '1' : '0'
        }
        if(key === 'makeInvestigation'){
          this.taiNanHangHai[key] = this.makeInvestigationModel? '1' : '0'
        }
        if(key === 'accidentTime') {
          this.taiNanHangHai[key] = this.ngayTaiNan
        }
        if(key === 'investigationDate') {
          this.taiNanHangHai[key] = this.ngayDieuTra
        }
        if(key === 'accidentOfficialDate') {
          this.taiNanHangHai[key] = this.hanNopBaoCao
        }
        if(key === 'nameOfShip') {
          this.taiNanHangHai[key] = this.ship.shipName
        }
        if(key === 'imoNumber') {
          this.taiNanHangHai[key] = this.ship.imoNumber
        }
        if(key === 'flagStateOfShip') {
          this.taiNanHangHai[key] = this.ship.flagStateOfShip
        }
        if(key === 'callSign') {
          this.taiNanHangHai[key] = this.ship.callSign
        }

      }
      console.log('Truoc khi them Tai Nan:', this.taiNanHangHai)
      this.$store.dispatch('TaiNanHangHai/themTaiNan', this.taiNanHangHai).then(
        res => {
          console.log('themTaiNan:', res)
          if (res.status === 1) {
            vm.isAlertThanhCong = true
          }
          else {
            vm.isAlertThatBai=  true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai=  false
          },2000)
        }
      );
    },
    suaDanhMuc(){
      let vm = this
      let params = Object.assign({}, this.taiNanHangHai);
      console.log(this.taiNanHangHai.pilotOnBoad)
      console.log(this.taiNanHangHai.makeInvestigation)
      params['pilotOnBoad'] = this.taiNanHangHai.pilotOnBoad ? '1' : '0'
      params['makeInvestigation'] = this.taiNanHangHai.makeInvestigation ? '1' : '0'
      params['accidentTime'] = this.ngayTaiNan
      params['investigationDate'] = this.ngayDieuTra
      params['accidentOfficialDate'] = this.hanNopBaoCao
      params['nameOfShip'] = this.ship.shipName
      params['imoNumber'] = this.ship.imoNumber
      params['flagStateOfShip'] =  this.ship.flagStateOfShip
      params['callSign'] = this.ship.callSign
      console.log('Truoc khi sua Tai Nan:', params)
      this.$store.dispatch('TaiNanHangHai/suaTaiNan', params).then(
        res => {
          console.log('themTaiNan:', res)
          if (res.status === 1) {
            vm.isAlertThanhCong = true
          }
          else {
            vm.isAlertThatBai=  true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai=  false
          },2000)
        }
      );
    },
    chonTau(key) {
      this.ship = key
      this.diaLogShip = false
    }
  }
};
</script>
<style>
#chi-tiet{
  width: 70%;
  margin: 0 auto;
}
.v-input{
  font-size: 13px;
}
.v-text-field {
  padding-top: 0px;
  margin-top: 0px;
}
.v-input__slot{
  margin-bottom: 0px;
}
.v-text-field input {
    -webkit-box-flex: 1;
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    line-height: 20px;
    padding: 0px 0 0px;
    max-width: 100%;
    min-width: 0px;
    width: 100%;
}
#chi-tiet label {
  font-size: 14px;
    color: #3563c1;
    font-weight: 700;
}
.alert-chitiet{
  position: fixed;
  top:0;
  right: 0;
  box-shadow: -3px 3px 0px 2px #1fff0824;
  z-index: 100;
}
</style>