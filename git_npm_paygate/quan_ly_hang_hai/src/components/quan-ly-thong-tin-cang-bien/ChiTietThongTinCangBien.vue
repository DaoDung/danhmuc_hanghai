<template>
  <v-dialog
    v-model="dialogChiTiet"
    max-width="1000"
  >
    <v-card>  
      <div style="width:100%; height: 40px; line-height:40px; padding-left: 20px; background-color: #1976d2; color: white;">
        <span><strong>Thông tin cảng biển {{MaritimeCode}}</strong></span>
      </div>
      <div  style="width: 100%; padding: 10px 20px;">
        <v-layout row wrap>
          <!-- <v-flex xs4 class="input-naovet">
            <label for="">Mã cảng vụ</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.maritimeCode"
            >
            </v-text-field>
          </v-flex> -->
          <v-flex xs4 class="input-naovet">
            <label for="">Số giấy chứng nhận</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.CertificateNo"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày cấp</label>
            <v-menu
              ref="menu5"
              v-model="menu5"
              :close-on-content-click="false"
              :return-value.sync="date"
              transition="scale-transition"
              offset-y
              min-width="290px"
            >
              <template v-slot:activator="{ on }">
                <v-text-field
                  v-model="ngayCap"
                  readonly
                  outlined
                  v-on="on"
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayCap" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu5 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu5.save(ngayCap)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày hiệu lực</label>
            <v-menu
              ref="menu6"
              v-model="menu6"
              :close-on-content-click="false"
              :return-value.sync="date"
              transition="scale-transition"
              offset-y
              min-width="290px"
            >
              <template v-slot:activator="{ on }">
                <v-text-field
                  v-model="ngayHieuLuc"
                  readonly
                  outlined
                  v-on="on"
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayHieuLuc" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu6 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu6.save(ngayHieuLuc)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Nơi cấp</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.IssuePlace"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Tên cảng biển</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.PortFacilityName"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Địa chỉ cảng biển</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.PortFacilityAddress"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Tên Sỹ quan an ninh cảng biển</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.SecurityName"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Số điện thoại</label>
            <v-text-field
              outlined
              v-model="thongTinCangBien.SecurityContact"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <br>
            <label for="" style="display:inline-block">Trạng thái thực hiện</label>
            <v-switch v-model="switch1" style="display:inline-block; margin-left: 10px;"></v-switch>
          </v-flex>
          <v-flex xs12 class="input-naovet">
            <label for="" style="font-size: 14px; color: black;">Phê duyệt cho:</label>
          </v-flex>
          <v-flex xs4>
            <v-layout wrap>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu khách</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauKhach"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho khách hàng cao tốc</label></v-flex>
                  <v-flex xs6><v-switch v-model="choKhachHangCaoToc"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu hàng cao tốc</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauHangCaoToc"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu hàng rời</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauHangRoi"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu dầu</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauDau"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu hóa chất</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauHoaChat"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu chở ga</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauChoGa"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho dàn khoan di động</label></v-flex>
                  <v-flex xs6><v-switch v-model="choDanKhoanDiDong"></v-switch></v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <v-layout wrap>
                  <v-flex xs6><label for="">Cho tàu hàng khác</label></v-flex>
                  <v-flex xs6><v-switch v-model="choTauHangKhac"></v-switch></v-flex>
                </v-layout>
              </v-flex>
            </v-layout>
          </v-flex>
          <v-flex xs4>
            <v-layout wrap>
              <v-flex xs12 class="input-naovet">
                <label for="" style="display:inline-block">Xác nhận kiểm tra lần 1</label>
                <v-switch v-model="xacNhanLan1" style="display:inline-block; margin-left: 10px;"></v-switch>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <label for="" style="display:inline-block">Xác nhận kiểm tra lần 2</label>
                <v-switch v-model="xacNhanLan2" style="display:inline-block; margin-left: 10px;"></v-switch>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <label for="" style="display:inline-block">Xác nhận kiểm tra lần 3</label>
                <v-switch v-model="xacNhanLan3" style="display:inline-block; margin-left: 10px;"></v-switch>
              </v-flex>
              <v-flex xs12 class="input-naovet">
                <label for="" style="display:inline-block">Xác nhận kiểm tra lần 4</label>
                <v-switch v-model="xacNhanLan4" style="display:inline-block; margin-left: 10px;"></v-switch>
              </v-flex>
            </v-layout>
          </v-flex>
          <v-flex xs4>
            <v-layout wrap>
              <v-flex xs12 class="input-naovet" v-if="xacNhanLan1">
                <label for="">Ngày điều tra lần 1</label>
                <v-menu
                  ref="menu"
                  v-model="menu"
                  :close-on-content-click="false"
                  :return-value.sync="date"
                  transition="scale-transition"
                  offset-y
                  min-width="290px"
                >
                  <template v-slot:activator="{ on }">
                    <v-text-field
                      v-model="ngayDieuTraLan1"
                      readonly
                      outlined
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker v-model="ngayDieuTraLan1" no-title scrollable locale="vn">
                    <v-spacer></v-spacer>
                    <v-btn text color="primary" @click="menu = false">Cancel</v-btn>
                    <v-btn text color="primary" @click="$refs.menu.save(ngayDieuTraLan1)">OK</v-btn>
                  </v-date-picker>
                </v-menu>
              </v-flex>
              <v-flex xs12 class="input-naovet" v-if="xacNhanLan2">
                <label for="">Ngày điều tra lần 2</label>
                <v-menu
                  ref="menu2"
                  v-model="menu2"
                  :close-on-content-click="false"
                  :return-value.sync="date"
                  transition="scale-transition"
                  offset-y
                  min-width="290px"
                >
                  <template v-slot:activator="{ on }">
                    <v-text-field
                      v-model="ngayDieuTraLan2"
                      readonly
                      outlined
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker v-model="ngayDieuTraLan2" no-title scrollable locale="vn">
                    <v-spacer></v-spacer>
                    <v-btn text color="primary" @click="menu2 = false">Cancel</v-btn>
                    <v-btn text color="primary" @click="$refs.menu2.save(ngayDieuTraLan2)">OK</v-btn>
                  </v-date-picker>
                </v-menu>
              </v-flex>
              <v-flex xs12 class="input-naovet" v-if="xacNhanLan3">
                <label for="">Ngày điều tra lần 3</label>
                <v-menu
                  ref="menu3"
                  v-model="menu3"
                  :close-on-content-click="false"
                  :return-value.sync="date"
                  transition="scale-transition"
                  offset-y
                  min-width="290px"
                >
                  <template v-slot:activator="{ on }">
                    <v-text-field
                      v-model="ngayDieuTraLan3"
                      readonly
                      outlined
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker v-model="ngayDieuTraLan3" no-title scrollable locale="vn">
                    <v-spacer></v-spacer>
                    <v-btn text color="primary" @click="menu3 = false">Cancel</v-btn>
                    <v-btn text color="primary" @click="$refs.menu3.save(ngayDieuTraLan3)">OK</v-btn>
                  </v-date-picker>
                </v-menu>
              </v-flex>
              <v-flex xs12 class="input-naovet" v-if="xacNhanLan4">
                <label for="">Ngày điều tra lần 4</label>
                <v-menu
                  ref="menu4"
                  v-model="menu4"
                  :close-on-content-click="false"
                  :return-value.sync="date"
                  transition="scale-transition"
                  offset-y
                  min-width="290px"
                >
                  <template v-slot:activator="{ on }">
                    <v-text-field
                      v-model="ngayDieuTraLan4"
                      readonly
                      outlined
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker v-model="ngayDieuTraLan4" no-title scrollable locale="vn">
                    <v-spacer></v-spacer>
                    <v-btn text color="primary" @click="menu4 = false">Cancel</v-btn>
                    <v-btn text color="primary" @click="$refs.menu4.save(ngayDieuTraLan4)">OK</v-btn>
                  </v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-layout>
      </div>
      <v-card-actions>
        <div class="flex-grow-1"></div>

        <v-btn
          color="primary"
          @click="submit"
        >
          {{btnText}}
        </v-btn>

        <v-btn
          color="primary"
          @click="closeDialog"
        >
          Thoát
        </v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>

export default {
  props: {
    dialogChiTiet: {
      type: Boolean,
      default: false
    },
    action: {
      type: String,
      default: ''
    },
    id: {
      type: Number,
      default: 0,
    }
  },
  components: {
  },
  data: () => ({
    btnText: '',
    menu: false,
    menu2: false,
    menu3: false,
    menu4: false,
    menu5:false,
    menu6:false,
    ngayCap: new Date().toISOString().substr(0, 10),
    ngayHieuLuc: new Date().toISOString().substr(0, 10),
    ngayDieuTraLan1: new Date().toISOString().substr(0, 10),
    ngayDieuTraLan2: new Date().toISOString().substr(0, 10),
    ngayDieuTraLan3: new Date().toISOString().substr(0, 10),
    ngayDieuTraLan4: new Date().toISOString().substr(0, 10),
    thongTinCangBien: {},
    xacNhanLan1:  false,
    xacNhanLan2: false,
    xacNhanLan3: false,
    xacNhanLan4: false,
    choTauHangKhac:false,
    choDanKhoanDiDong: false,
    choTauChoGa: false,
    choTauHoaChat: false,
    choTauDau: false,
    choTauHangRoi: false,
    choTauHangCaoToc: false,
    choTauKhachCaoToc: false,
    choTauKhach: false,
    MaritimeCode: ''
  }),
  mounted() {
  },
  computed: {

  },
  watch: {
    dialogChiTiet(val) {
      if(val === true) {
        if (this.action === "sua") {
          this.btnText = "Cập nhập"
        } 
        if (this.action === "them") {
          this.btnText = "Thêm mới"
        }
        this.getDetail()
      }
      if (val === false) {
        this.closeDialog()
      }
    }
  },
  methods: {
    getDetail () {
      let vm = this
      this.$store.dispatch('hoatDongNaoVet/getMaritimeCurrent').then(
          res => {
            vm.MaritimeCode = res.maritimeCode
          }
        )
      if (this.action !== 'them') {
        let params = {
          ID: vm.id
        }
        this.$store.dispatch('thongTinCangBien/getDetail', params).then(
          res => {
            vm.thongTinCangBien = res
            vm.xacNhanLan1=  res.FirstAuthorized ? true : false
            vm.xacNhanLan2= res.SecondAuthorized ? true : false
            vm.xacNhanLan3= res.ThirdAuthorized ? true : false
            vm.xacNhanLan4= res.FourthAuthorized ? true : false
            vm.choTauHangKhac=res.OtherCargoShipApproval ? true : false
            vm.choDanKhoanDiDong= res.MobileOffshoreApproval ? true : false
            vm.choTauChoGa= res.GasCarrierApproval ? true : false
            vm.choTauHoaChat= res.ChemicalTankerApproval ? true : false
            vm.choTauDau= res.OilTankerApproval ? true : false
            vm.choTauHangRoi= res.BulkCarrierApproval ? true : false
            vm.choTauHangCaoToc= res.CargoHighSpeedApproval ? true : false
            vm.choTauKhachCaoToc= res.PassengerHighSpeedApproval ? true : false
            vm.choTauKhach= res.PassengerShipApproval ? true : false
            vm.ngayCap= new Date(res.IssueDate).toISOString().substr(0, 10)
            vm.ngayHieuLuc = new Date(res.ExpireDate).toISOString().substr(0, 10)
            vm.ngayDieuTraLan1= new Date(res.FirstVerificationDate).toISOString().substr(0, 10)
            vm.ngayDieuTraLan2= new Date(res.SecondVerificationDate).toISOString().substr(0, 10)
            vm.ngayDieuTraLan3= new Date(res.ThirdVerificationDate).toISOString().substr(0, 10)
            vm.ngayDieuTraLan4= new Date(res.FourthVerificationDate).toISOString().substr(0, 10)
          }
        )
      } else {
        vm.thongTinCangBien.ID = ''
        vm.thongTinCangBien.MaritimeCode = ''
        vm.thongTinCangBien.CertificateNo = ''
        vm.thongTinCangBien.IssueDate = ''
        vm.thongTinCangBien.ExpireDate = ''
        vm.thongTinCangBien.IssuePlace = ''
        vm.thongTinCangBien.PortFacilityName = ''
        vm.thongTinCangBien.PortFacilityAddress = ''
        vm.thongTinCangBien.SecurityName = ''
        vm.thongTinCangBien.SecurityContact = ''
        vm.thongTinCangBien.ExpireStatus = ''
        vm.thongTinCangBien.FirstAuthorized = ''
        vm.thongTinCangBien.FirstVerificationDate = ''
        vm.thongTinCangBien.SecondAuthorized = ''
        vm.thongTinCangBien.SecondVerificationDate = ''
        vm.thongTinCangBien.ThirdAuthorized = ''
        vm.thongTinCangBien.ThirdVerificationDate = ''
        vm.thongTinCangBien.FourthAuthorized = ''
        vm.thongTinCangBien.FourthVerificationDate = ''
        vm.thongTinCangBien.PassengerShipApproval = ''
        vm.thongTinCangBien.PassengerHighSpeedApproval = ''
        vm.thongTinCangBien.CargoHighSpeedApproval = ''
        vm.thongTinCangBien.BulkCarrierApproval = ''
        vm.thongTinCangBien.OilTankerApproval = ''
        vm.thongTinCangBien.ChemicalTankerApproval = ''
        vm.thongTinCangBien.GasCarrierApproval = ''
        vm.thongTinCangBien.MobileOffshoreApproval = ''
        vm.thongTinCangBien.OtherCargoShipApproval = ''
      }
    },
    submit () {
      if (this.action === "sua") {
        this.sua()
      }
      if (this.action === "them") {
        this.them()
      }
    },
    them(){
      let params = Object.assign({}, this.thongTinCangBien);
      params['IssueDate'] = new Date(this.ngayCap).getTime()
      params['ExpireDate'] = new Date(this.ngayHieuLuc).getTime()
      params['FirstVerificationDate'] = new Date(this.ngayDieuTraLan1).getTime()
      params['SecondVerificationDate'] = new Date(this.ngayDieuTraLan2).getTime()
      params['ThirdVerificationDate'] = new Date(this.ngayDieuTraLan3).getTime()
      params['FourthVerificationDate'] = new Date(this.ngayDieuTraLan4).getTime()
      params['FirstAuthorized'] = this.xacNhanLan1 ? '1' : '0'
      params['SecondAuthorized'] = this.xacNhanLan2 ? '1' : '0'
      params['ThirdAuthorized'] = this.xacNhanLan3 ? '1' : '0'
      params['FourthAuthorized'] = this.xacNhanLan4 ? '1' : '0'
      params['PassengerShipApproval'] = this.choTauKhach ? '1' : '0'
      params['PassengerHighSpeedApproval'] = this.choTauKhachCaoToc ? '1' : '0'
      params['CargoHighSpeedApproval'] = this.choTauHangCaoToc ? '1' : '0'
      params['BulkCarrierApproval'] = this.choTauHangRoi ? '1' : '0'
      params['OilTankerApproval'] = this.choTauDau ? '1' : '0'
      params['ChemicalTankerApproval'] = this.choTauHoaChat ? '1' : '0'
      params['GasCarrierApproval'] = this.choTauChoGa  ? '1' : '0'
      params['MobileOffshoreApproval'] = this.choDanKhoanDiDong ? '1' : '0'
      params['OtherCargoShipApproval'] = this.choTauHangKhac ? '1' : '0'
      params['MaritimeCode'] = this.MaritimeCode
      this.$emit('them', params)
    },
    sua(){
      let params = Object.assign({}, this.thongTinCangBien);
      params['IssueDate'] = new Date(this.ngayCap).getTime()
      params['ExpireDate'] = new Date(this.ngayHieuLuc).getTime()
      params['FirstVerificationDate'] = new Date(this.ngayDieuTraLan1).getTime()
      params['SecondVerificationDate'] = new Date(this.ngayDieuTraLan2).getTime()
      params['ThirdVerificationDate'] = new Date(this.ngayDieuTraLan3).getTime()
      params['FourthVerificationDate'] = new Date(this.ngayDieuTraLan4).getTime()
      params['FirstAuthorized'] = this.xacNhanLan1 ? '1' : '0'
      params['SecondAuthorized'] = this.xacNhanLan2 ? '1' : '0'
      params['ThirdAuthorized'] = this.xacNhanLan3 ? '1' : '0'
      params['FourthAuthorized'] = this.xacNhanLan4 ? '1' : '0'
      params['PassengerShipApproval'] = this.choTauKhach ? '1' : '0'
      params['PassengerHighSpeedApproval'] = this.choTauKhachCaoToc ? '1' : '0'
      params['CargoHighSpeedApproval'] = this.choTauHangCaoToc ? '1' : '0'
      params['BulkCarrierApproval'] = this.choTauHangRoi ? '1' : '0'
      params['OilTankerApproval'] = this.choTauDau ? '1' : '0'
      params['ChemicalTankerApproval'] = this.choTauHoaChat ? '1' : '0'
      params['GasCarrierApproval'] = this.choTauChoGa  ? '1' : '0'
      params['MobileOffshoreApproval'] = this.choDanKhoanDiDong ? '1' : '0'
      params['OtherCargoShipApproval'] = this.choTauHangKhac ? '1' : '0'
      params['MaritimeCode'] = this.MaritimeCode
      this.$emit('sua', params)
    },
    closeDialog() {
      this.$emit('closeDialog', false)
    }

  }
};
</script>
<style>
#chi-tiet{
  width: 100%;
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
.input-time{
  border-bottom: 1px solid;
  margin-bottom: 14px;
}
.input-group-chitiet{
  padding: 0 10px;
}
/*---------*/
.v-text-field--filled > .v-input__control > .v-input__slot, .v-text-field--full-width > .v-input__control > .v-input__slot, .v-text-field--outlined > .v-input__control > .v-input__slot {
    -webkit-box-align: stretch;
    -ms-flex-align: stretch;
    align-items: stretch;
    min-height: 24px!important;
}
.v-label{
  top: 9px!important;
  font-size: 13px!important;
}
.v-label--active{
  top: 18px!important;
}
.v-input{
  font-size: 13px!important;
}
.input-naovet{
  padding: 0 10px;
}
.v-card__title{
  
}
.input-naovet label{
   font-size: 13px;
   font-weight: bold;
   color: #3563c1;
}
.v-text-field.v-text-field--enclosed .v-input__prepend-outer, .v-text-field.v-text-field--enclosed .v-input__prepend-inner, .v-text-field.v-text-field--enclosed .v-input__append-inner, .v-text-field.v-text-field--enclosed .v-input__append-outer {
    margin-top: 0px!important;
}
.v-text-field.v-text-field--enclosed .v-text-field__details {
    margin-bottom: -6px!important;
}
.v-input--selection-controls {
    margin-top: 0px!important;
    padding-top: 0px!important;
}
</style>