<template>
  <v-dialog
    v-model="dialogChiTiet"
    max-width="1000"
  >
    <v-card>  
      <div style="width:100%; height: 40px; line-height:40px; padding-left: 20px; background-color: #1976d2; color: white;">
        <span><strong>Thông tin doanh nghiệp cảng biển {{MaritimeCode}}</strong></span>
      </div>
      <div  style="width: 100%; padding: 10px 20px;">
        <v-layout row wrap>
          <!-- <v-flex xs4 class="input-naovet">
            <label for="">Mã cảng vụ</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.MaritimeCode"
            >
            </v-text-field>
          </v-flex> -->
          <v-flex xs4 class="input-naovet">
            <label for="">Mã doanh nghiệp cảng biển (MST)</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.ServicePortCompanyCode"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Tên doanh nghiệp cảng biển</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.ServicePortCompanyName"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Địa chỉ</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.CompanyAddress"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Thư điện tử</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.ContactEmail"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số Fax</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.FaxNo"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số điện thoại</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.TelNo"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ghi chú</label>
            <v-text-field
              outlined
              v-model="doanhNghiepCangBien.Remarks"
            >
            </v-text-field>
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
    doanhNghiepCangBien: {},
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
        this.$store.dispatch('doanhNghiepCangBien/getDetail', params).then(
          res => {
            vm.doanhNghiepCangBien = res
          }
        )
      } else {
        vm.doanhNghiepCangBien.ID = ''
        vm.doanhNghiepCangBien.MaritimeCode = ''
        vm.doanhNghiepCangBien.ServicePortCompanyCode = ''
        vm.doanhNghiepCangBien.ServicePortCompanyName = ''
        vm.doanhNghiepCangBien.CompanyAddress = ''
        vm.doanhNghiepCangBien.ContactEmail = ''
        vm.doanhNghiepCangBien.TelNo = ''
        vm.doanhNghiepCangBien.FaxNo = ''
        vm.doanhNghiepCangBien.Remarks = ''
      }
    },
    formatDate (date) {
      let YYYY = date.getFullYear()
      let MM = (date.getMonth() + 1) <= 10 ? ('0' + (date.getMonth() + 1)) : (date.getMonth() + 1)
      let DD = date.getDate() <=10 ? ('0' + date.getDate()) : date.getDate()
      let HH = date.getHours() <= 10 ? ('0' + date.getHours()) : date.getHours()
      let II = date.getMinutes() <= 10 ? ('0' + date.getMinutes()) : date.getMinutes()
      let dateTime =  DD + '/' + MM + '/' + YYYY + ' ' + HH + ':' + II
      return dateTime
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
      let params = Object.assign({}, this.doanhNghiepCangBien);
      params['MaritimeCode'] = this.MaritimeCode
      this.$emit('them', params)
    },
    sua(){
      let params = Object.assign({}, this.doanhNghiepCangBien);
      this.$emit('sua', params)
    },
    chonTau(key) {
      this.ship = key
      this.diaLogShip = false
    },
    closeDialog() {
      this.$emit('closeDialog', false)
    },
    loadData(bool) {
      this.$emit('loadData', bool)
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
</style>