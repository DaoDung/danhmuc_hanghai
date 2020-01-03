<template>
  <v-dialog
    v-model="dialogChiTiet"
    max-width="1000"
  >
  
    <v-card>  
      <div style="width:100%; height: 40px; line-height:40px; padding-left: 20px; background-color: #1976d2; color: white;">
        <span><strong>Thông tin chi tiết</strong></span>
      </div>
      <div  style="width: 100%; padding: 10px 20px;">
        <v-layout row wrap>
          <v-flex xs3 class="input-naovet">
            <label for="">Tên tàu</label>
            <v-text-field
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.shipName"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Quốc tịch</label>
            <v-select
              autocomplete
              :items="flagStateOfShipItems"
              item-text="stateName"
              item-value="stateCode"
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.flagStateOfShip"
              clearable
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Hô hiệu</label>
            <v-text-field
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.callSign"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Số IMO</label>
            <v-text-field
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.imoNumber"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Thuyền trưởng</label>
            <v-text-field
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.nameOfMaster"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs3 class="input-naovet">
            <label for="">Đại lý</label>
            <v-select
            clearable
            autocomplete
            outlined
            :items="shipAgencyItems"
            item-text="shipAgencyNameVN"
            item-value="shipAgencyCode"
            v-model="xacNhanAnToanAnNinhHangHai['shipAgencyCode']"
            :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
            height="24"
            ></v-select>
          </v-flex>
          
          <v-flex xs3 class="input-naovet">
            <label for="">Chủ tàu</label>
            <v-select
              autocomplete
              outlined
              :items="shipOwnerItems"
              item-text="companyName"
              item-value="shipOwnerCode"
              v-model="xacNhanAnToanAnNinhHangHai.shipOwnerCode"
              height="24"
            ></v-select>
          </v-flex>
          
          <v-flex xs3 class="input-naovet">
            <label for="">Người khai thác</label>
            <v-select
            autocomplete
            :items="shipOperatorItems"
            item-text="companyName"
            item-value="shipOwnerCode"
            outlined
            height="24"
            v-model="xacNhanAnToanAnNinhHangHai.shipOperatorCode"
            ></v-select>
          </v-flex>
          
          <v-flex xs3 class="input-naovet">
            <label for="">NT</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.nt"
            >
            </v-text-field>
          </v-flex>

          <v-flex xs3 class="input-naovet">
            <label for="">GT</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.gt"
      
            >
            </v-text-field>
          </v-flex>

          <v-flex xs3 class="input-naovet">
            <label for="">DWT</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.dwt"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Công suất</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.power"
            >
            </v-text-field>
          </v-flex>
            <v-flex xs3 class="input-naovet">
            <label for="">Rộng(m)</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.breadth"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">LOA</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.loa"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Mớn nước t.kế</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.maxDraft"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Chiều cao(m)</label>
            <v-text-field
              outlined
              type="number"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.clearanceHeight"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Loại tàu</label>
            <v-select
            autocomplete
            :items="shipTypeItems"
            item-text="shipTypeNameVN"
            item-value="shipTypeCode"
            outlined
            v-model="xacNhanAnToanAnNinhHangHai.shipTypeCode"
            height="24"

          ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Loại và công dụng tàu</label>
            <v-select
            autocomplete
            outlined
            :items="shipTypeItems"
            item-text="shipTypeNameVN"
            height="24"
            item-value="shipTypeCode"
            v-model="xacNhanAnToanAnNinhHangHai.shipTypeMT"
          ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Phân cấp</label>
            <v-select
            autocomplete
            item-text="itemText"
            item-value="itemValue"
            height="24"
            :items="vrCodeItems"
            outlined
            v-model="xacNhanAnToanAnNinhHangHai['vrCode']"
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Cảng đăng ký</label>
            <v-select
            autocomplete
            outlined
            :items="dmPortItems"
            item-text="portName"
            item-value="portCode"
            height="24"
            v-model="xacNhanAnToanAnNinhHangHai['registryPortCode']"
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Năm đóng tàu</label>
            <v-select
              :items="yearItems"
              outlined
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai['productionYear']"
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Nước đóng tàu</label>
            <v-select
              autocomplete
              outlined
              :items="flagStateOfShipItems"
              item-text="stateName"
              item-value="stateCode"
              height="24"
              v-model="xacNhanAnToanAnNinhHangHai.productionCountry"
  
              clearable
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Cấp độ an ninh</label>
              <v-select
              clearable
              autocomplete
              outlined
              :items="securityLevelItems"
              item-text="securityLevelName"
              item-value="securityLevelCode"
              v-model="xacNhanAnToanAnNinhHangHai['securityLevelCode']"
              height="24"
              ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Xác nhận an toàn</label>
            <v-select
            clearable
            autocomplete
            outlined
            :items="violatedItems"
            item-text="itemText"
            item-value="itemValue"
            v-model="xacNhanAnToanAnNinhHangHai['violated']"
            height="24"
            ></v-select>
          </v-flex>
          <v-flex xs3 class="input-naovet">
            <label for="">Ghi chú cảnh báo</label>
            <v-text-field 

            multi-line outlined v-model="xacNhanAnToanAnNinhHangHai.remarks"></v-text-field>

          </v-flex>
          <v-flex xs3 class="input-naovet">

            <v-checkbox label="Phá dỡ tàu biển" v-model="xacNhanAnToanAnNinhHangHai['deconstructed']" value="0"></v-checkbox>

          </v-flex>
          <v-flex xs3 class="input-naovet">

            <v-checkbox :label="xacNhanAnToanAnNinhHangHai['violated'] === '0' || xacNhanAnToanAnNinhHangHai['violated'] === 0 ? 'Xác nhận kiểm tra an toàn hàng hải' : 'Đang kiểm tra, chưa cho xuất bến'" v-model="xacNhanAnToanAnNinhHangHai['violated']" value="0"></v-checkbox>

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
    xacNhanAnToanAnNinhHangHai: {},
    unitPowerItems: ['KW', 'HP', 'CV'],
    yearItems: [
      2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980],
    levelBoardItems: [],
    flagStateOfShipItems: [],
    shipOwnerItems: [],
    shipAgencyItems: [],
    dmPortItems: [],
    shipTypeItems: [],
    shipTypeVmaItems: [],
    shipOperatorItems: [],
    securityLevelItems: [],
    violatedItems: [
      {
        itemText: 'Đang kiểm tra',
        itemValue: 1
      },
      {
        itemText: 'Không phải kiểm tra',
        itemValue: 0
      }
    ],
    vrCodeItems: [
      {
        itemText: 'Không hạn chế',
        itemValue: 'VR'
      },
      {
        itemText: 'Hạn chế I',
        itemValue: 'VRH1'
      },
      {
        itemText: 'Hạn chế II',
        itemValue: 'VRH2'
      },
      {
        itemText: 'Hạn chế III',
        itemValue: 'VRH3'
      },
      {
        itemText: 'Tàu < 200 DWT',
        itemValue: 'VR200'
      }
    ],

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
      this.$store.dispatch('xacNhanAnToanAnNinhHangHai/getMaritimeCurrent').then(
          res => {
            vm.MaritimeCode = res.maritimeCode
          }
        )
      if (this.action !== 'them') {
        let params = {
          vmaShipId: vm.id
        }
        this.$store.dispatch('xacNhanAnToanAnNinhHangHai/getDetail', params).then(
          res => {
            vm.xacNhanAnToanAnNinhHangHai = res
          }
        )
        vm.loadFlagStateOfShip()
        vm.loadShipOwner()
        vm.loadShipOperator()
        vm.loadShipType()
        vm.loadVmaShipType()
        vm.loadDMPort()
        vm.loadShipAgency()
        vm.loadsecurityLevel()
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
      let params = Object.assign({}, this.xacNhanAnToanAnNinhHangHai);
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
      let params = Object.assign({}, this.xacNhanAnToanAnNinhHangHai);
      this.$emit('sua', params)
    },
    closeDialog() {
      this.$emit('closeDialog', false)
    },
    loadShipOwner: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_OWNER',
        isShipOwner: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.shipOwnerItems = result
      })
    },
    loadShipAgency: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SHIP_AGENCY'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.shipAgencyItems = result
      })
    },
    loadsecurityLevel: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SECURITY_LEVEL'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.securityLevelItems = result
      })
    },
    loadFlagStateOfShip: function () {
      var vm = this
      let param = {
        categoryId: 'DM_STATE'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.flagStateOfShipItems = result
      })
    },
    loadPortWharf: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PORT_WHARF'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.portWharfItems = result
      })
    },
    loadShipOperator: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_OWNER',
        isShipOperator: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.shipOperatorItems = result
      })
    },
    loadPortHarbour: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PORT_HARBOUR'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.portHarbourItems = result
      })
    },
    loadDMPort: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PORT'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.dmPortItems = result
      })
    },
    loadPurpose: function () {
      var vm = this
      let param = {
        categoryId: 'DM_ARRIVAL_PURPOSE'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.purposeItems = result
      })
    },
    loadCargo: function () {
      var vm = this
      let param = {
        categoryId: 'DM_CARGO_ON_BOARD'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.cargoItems = result
      })
    },
    loadShipType: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SHIP_TYPE',
        applyShip: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.shipTypeItems = result
      })
    },
    loadVmaShipType: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_TYPE',
        applyShip: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.shipTypeVmaItems = result
      })
    },
    loadChanelList: function () {
      var vm = this
      let param = {
        categoryId: 'DM_TUYEN_LUONG'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      param['start'] = -1
      param['end'] = -1
      vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/loadDataDM', param).then(function (result) {
        vm.chanelListItems = result
      })
    },
    loadDetailTauBien: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.loadingDetail = true
      vm.$store.dispatch('loadDetailTauBien', data).then(function (result) {
        if (!result.hasOwnProperty('errorCode')) {
          vm.detailTauBien = Object.assign(vm.detailTauBien, result)
        }
        vm.loadingDetail = false
      })
    },
   
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