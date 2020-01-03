<template>
  <v-dialog
    v-model="dialogChiTiet"
    max-width="1000"
  >
    <v-card>  
      <div style="width:100%; height: 40px; line-height:40px; padding-left: 20px; background-color: #1976d2; color: white;">
        <span><strong>Thông tin chi tiết hoạt động nạo vét</strong></span>
      </div>
      <div  style="width: 100%; padding: 10px 20px;">
        <v-layout row wrap>
          <v-flex xs4 class="input-naovet">
            <label for="">Tên công trình</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.ten_cong_trinh"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Chủ đầu tư</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.chu_dau_tu"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Nhà thầu thi công</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.nha_thau_thi_cong"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Tư vấn giám sát</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.tu_van_giam_sat"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">QĐ phê duyệt PA</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.quyet_dinh_phe_duyet"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Vị trí đổ chất nạo vét</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.vi_tri_do"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Tên phương tiện</label>
              <v-autocomplete
                v-model="hoatDongNaoVet.ten_phuong_tien"
                :items="ships"
                :loading="isLoading"
                :search-input.sync="searchShip"
                hide-no-data
                hide-selected
                item-text="shipName"
                item-value="shipName"
                outlined
              ></v-autocomplete>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Số đăng ký hành chính</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.so_dkhc"
            >
            </v-text-field>
          </v-flex>
          
          <v-flex xs4 class="input-naovet">
            <label for="">Cấp phương tiện</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.cap_phuong_tien"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Sức chở</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.suc_cho"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Công dụng</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.cong_dung"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số đăng kiểm</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.so_dang_kiem"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày cấp đăng kiểm</label>
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
                  v-model="ngayCapDangKiem"
                  readonly
                  outlined
                  v-on="on"
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayCapDangKiem" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu.save(ngayCapDangKiem)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày hết hạn đăng kiểm</label>
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
                  v-model="ngayHetHanDangKiem"
                  readonly
                  v-on="on"
                  outlined
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayHetHanDangKiem" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu2 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu2.save(ngayHetHanDangKiem)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày đến cảng</label>
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
                  v-model="ngayDenCang"
                  readonly
                  v-on="on"
                  outlined
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayDenCang" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu3 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu3.save(ngayDenCang)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số giấy phép tàu đến</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.so_giay_phep_tau_den"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày rời cảng</label>
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
                  v-model="ngayRoiCang"
                  readonly
                  outlined
                  v-on="on"
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayRoiCang" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu4 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu4.save(ngayRoiCang)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số giấy phép rời</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.so_giay_phep_roi"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Ngày cấp phép thi công</label>
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
                  v-model="ngayCapPhepThiCong"
                  readonly
                  v-on="on"
                  outlined
                ></v-text-field>
              </template>
              <v-date-picker v-model="ngayCapPhepThiCong" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu5 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu5.save(ngayCapPhepThiCong)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Hạn cấp phép</label>
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
                  v-model="hanCapPhep"
                  readonly
                  v-on="on"
                  outlined
                ></v-text-field>
              </template>
              <v-date-picker v-model="hanCapPhep" no-title scrollable locale="vn">
                <v-spacer></v-spacer>
                <v-btn text color="primary" @click="menu6 = false">Cancel</v-btn>
                <v-btn text color="primary" @click="$refs.menu6.save(hanCapPhep)">OK</v-btn>
              </v-date-picker>
            </v-menu>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Tổng thời gian thi công</label>
            <v-text-field
              outlined
               v-model="hoatDongNaoVet.tong_thoi_gian_thi_cong"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Số lượng hoạt động(rời/vào)</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.so_luot_hoat_dong"
            >
            </v-text-field>
          </v-flex>
          <v-flex xs4 class="input-naovet">
            <label for="">Khối lượng thi công</label>
            <v-text-field
              outlined
              v-model="hoatDongNaoVet.khoi_luong_thi_cong"
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
// import moment from 'moment'
import axios from 'axios'
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
    menu6: false,
    ngayCapDangKiem: new Date().toISOString().substr(0, 10),
    ngayHetHanDangKiem: new Date().toISOString().substr(0, 10),
    ngayDenCang: new Date().toISOString().substr(0, 10),
    ngayRoiCang: new Date().toISOString().substr(0, 10),
    ngayCapPhepThiCong: new Date().toISOString().substr(0, 10),
    hanCapPhep: new Date().toISOString().substr(0, 10),
    searchShip: '',
    isLoading: false,
    ships: [],
    hoatDongNaoVet: {},
    MaritimeCode: '',
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
    },
    searchShip (val) {
      if(val && val.length > 3) {
        if (this.isLoading) return
        this.isLoading = true
        let vm = this
        let orginURL = window.location.href
        let endPoit = orginURL.substr(0, orginURL.lastIndexOf('#'))
        let url = '?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=vma_ship_ship&p_p_cacheability=cacheLevelPage&start=-1&end=-1'
        let path = endPoit + url +  '&shipName=' + val
        axios.get(path)
          .then(res => {
            vm.ships = res.data.data
          })
          .finally(() => (this.isLoading = false))
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
        this.$store.dispatch('hoatDongNaoVet/getDetail', params).then(
          res => {
            vm.hoatDongNaoVet = res
            vm.ngayCapDangKiem= new Date(res.ngay_cap_dang_kiem).toISOString().substr(0, 10)
            vm.ngayHetHanDangKiem= new Date(res.ngay_het_han_dang_kiem).toISOString().substr(0, 10)
            vm.ngayDenCang= new Date(res.ngay_den_cang).toISOString().substr(0, 10)
            vm.ngayRoiCang= new Date(res.ngay_roi_cang).toISOString().substr(0, 10)
            vm.ngayCapPhepThiCong= new Date(res.ngay_cap_phep_hoat_dong_thi_cong).toISOString().substr(0, 10)
            vm.hanCapPhep= new Date(res.han_cap_phep_hoat_dong).toISOString().substr(0, 10)
            vm.searchShip = res.ten_phuong_tien
          }
        )
      } else {
        vm.hoatDongNaoVet.MaritimeCode = ''
        vm.hoatDongNaoVet.ma_hoat_dong_nao_vet = ''
        vm.hoatDongNaoVet.ten_cong_trinh = ''
        vm.hoatDongNaoVet.chu_dau_tu = ''
        vm.hoatDongNaoVet.nha_thau_thi_cong = ''
        vm.hoatDongNaoVet.tu_van_giam_sat = ''
        vm.hoatDongNaoVet.quyet_dinh_phe_duyet = ''
        vm.hoatDongNaoVet.vi_tri_do = ''
        vm.hoatDongNaoVet.ten_phuong_tien = ''
        vm.hoatDongNaoVet.so_dkhc = ''
        vm.hoatDongNaoVet.cap_phuong_tien = ''
        vm.hoatDongNaoVet.suc_cho = ''
        vm.hoatDongNaoVet.cong_dung = ''
        vm.hoatDongNaoVet.so_dang_kiem = ''
        vm.hoatDongNaoVet.ngay_cap_dang_kiem = ''
        vm.hoatDongNaoVet.ngay_het_han_dang_kiem = ''
        vm.hoatDongNaoVet.ngay_den_cang = ''
        vm.hoatDongNaoVet.so_giay_phep_tau_den = ''
        vm.hoatDongNaoVet.ngay_roi_cang = ''
        vm.hoatDongNaoVet.so_giay_phep_roi = ''
        vm.hoatDongNaoVet.ngay_cap_phep_hoat_dong_thi_cong = ''
        vm.hoatDongNaoVet.han_cap_phep_hoat_dong = ''
        vm.hoatDongNaoVet.tong_thoi_gian_thi_cong = ''
        vm.hoatDongNaoVet.so_luot_hoat_dong = ''
        vm.hoatDongNaoVet.khoi_luong_thi_cong = ''
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
      for (let key in this.hoatDongNaoVet){
        if(key === 'ngay_cap_dang_kiem') {
          this.hoatDongNaoVet[key] = new Date(this.ngayCapDangKiem).getTime()
        }
        if(key === 'ngay_het_han_dang_kiem') {
          this.hoatDongNaoVet[key] = new Date(this.ngayHetHanDangKiem).getTime()
        }
        if(key === 'ngay_den_cang') {
          this.hoatDongNaoVet[key] = new Date(this.ngayDenCang).getTime()
        }
        if(key === 'ngay_roi_cang') {
          this.hoatDongNaoVet[key] = new Date(this.ngayRoiCang).getTime()
        }
        if(key === 'ngay_cap_phep_hoat_dong_thi_cong') {
          this.hoatDongNaoVet[key] = new Date(this.ngayCapPhepThiCong).getTime()
        }
        if(key === 'han_cap_phep_hoat_dong') {
          this.hoatDongNaoVet[key] = new Date(this.hanCapPhep).getTime()
        }
        if(key === 'MaritimeCode') {
          this.hoatDongNaoVet[key] = this.MaritimeCode
        }
      }
      this.$emit('them', this.hoatDongNaoVet)
    },
    sua(){
      for (let key in this.hoatDongNaoVet){
        if(key === 'ngay_cap_dang_kiem') {
          this.hoatDongNaoVet[key] = new Date(this.ngayCapDangKiem).getTime()
        }
        if(key === 'ngay_het_han_dang_kiem') {
          this.hoatDongNaoVet[key] = new Date(this.ngayHetHanDangKiem).getTime()
        }
        if(key === 'ngay_den_cang') {
          this.hoatDongNaoVet[key] = new Date(this.ngayDenCang).getTime()
        }
        if(key === 'ngay_roi_cang') {
          this.hoatDongNaoVet[key] = new Date(this.ngayRoiCang).getTime()
        }
        if(key === 'ngay_cap_phep_hoat_dong_thi_cong') {
          this.hoatDongNaoVet[key] = new Date(this.ngayCapPhepThiCong).getTime()
        }
        if(key === 'han_cap_phep_hoat_dong') {
          this.hoatDongNaoVet[key] = new Date(this.hanCapPhep).getTime()
        }
        if(key === 'MaritimeCode') {
          this.hoatDongNaoVet[key] = this.MaritimeCode
        }
      }
      let params = Object.assign({}, this.hoatDongNaoVet);
      this.$emit('sua', params)
    },
    closeDialog() {
      this.$emit('closeDialog', false)
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
</style>