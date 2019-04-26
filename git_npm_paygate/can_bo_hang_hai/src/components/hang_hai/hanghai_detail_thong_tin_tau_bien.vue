<template>
  <div class="form ml-4">
    <v-flex xs12 d-flex>
      <v-flex xs6><v-flex class="mt-3 text" xs12><p>{{detailTauBien.tenTau}}</p> </v-flex></v-flex>
      <v-flex xs6>
        <v-flex class="mt-3" xs12 style="display: flex;">
        <div class="ml-2">
          <v-icon size="16">file_copy</v-icon>
          <a href="#" @click="Add"> Thêm mới</a>
        </div> 
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-2">
          <v-icon size="16"> close </v-icon>
          <a href="#" @click="Delete">Xóa</a>
        </div> 
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3 ">
          <v-icon size="16">replay</v-icon>
           <a href="" @click="Add"> Refresh</a>
        </div>
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3">
          <v-icon size="16">save</v-icon>
          <a href="" @click="Add">Lưu lại</a>
        </div>
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3">
          <v-icon size="16">reply</v-icon>
          <a href="" @click="Add">Quay lại</a>
        </div>
      </v-flex>
      </v-flex>
    </v-flex>
    <v-flex xs12 d-flex>
      <v-flex xs6>
        <v-flex xs12 class="ht" style="display: flex;" min>
            <v-flex xs3><p class="my-4">Tên tàu <span>(*)</span>:</p></v-flex>
            <v-flex xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" 
              v-model="detailTauBien.tenTau"
              :rules="[v => !!v || 'Tên phương tiện bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Quốc tịch<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1"  class="input-group--focused" 
              v-model="detailTauBien.quocTich"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Thuyền trưởng<span></span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-overflow-btn   :items="dropdown_edit" editable   hide-details class="pa-0 mt-3 " overflow></v-overflow-btn>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Chủ tàu<span></span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1"  class="input-group--focused" 
              v-model="detailTauBien.chuTau"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Đại lý<span></span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1"  class="input-group--focused" 
              v-model="detailTauBien.daiLy"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Loại tàu<span></span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" class="input-group--focused"
              v-model="detailTauBien.loaiTau" 
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">NT:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys" name="input-1"  class="input-group--focused"
              v-model="detailTauBien.nt" 
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">GT:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="money" name="input-1"  class="input-group--focused" 
              v-model="detailTauBien.gt"
              ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">DWT:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="money" v-model="detailTauBien.dwt" name="input-1" placeholder="Chủ đề thư" class="input-group--focused" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Công suất máy:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneysd" v-model="detailTauBien.congSuatMay" name="input-1"  class="input-group--focused" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Breadth(m):</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys" v-model="detailTauBien.breadth" name="input-1"  class="input-group--focused"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Loa (m):</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys" name="input-1" v-model="detailTauBien.loa" class="input-group--focused" ></v-text-field>
            </v-flex >
          </v-flex >
      </v-flex>
      <v-flex xs6>
        <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Mớ nước t.kế(m):</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1"  class="input-group--focused" v-model="detailTauBien.monNuocTke"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Chiều cao t.không(m):</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys"  name="input-1"  class="input-group--focused" v-model="detailTauBien.chieuCaoTKhong"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;"> 
            <v-flex xs3><p class="my-4">Hô hiệu:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" class="input-group--focused" v-model="detailTauBien.hoHieu"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Số IMO:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" class="input-group--focused" v-model="detailTauBien.soIMO"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class=" my-4">Cảng đăng ký:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1"  class="input-group--focused" v-model="detailTauBien.cangDangKy"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class=" my-4">Năm đóng tàu:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneysd" name="input-1"  class="input-group--focused" v-model="detailTauBien.namDongTau"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class=" my-4">Nước đóng tàu:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" class="input-group--focused" v-model="detailTauBien.nuocDongTau"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="mt-1" style="margin-left:23%; height:%;">
            <v-flex xs3 d-flex>
              <v-checkbox  hide-details style="height:15px;" label="Không neo" class=""></v-checkbox>
              </v-flex>
          </v-flex >
           <v-flex xs12 class="" style="display: flex;">
            <v-flex xs3><p class=" my-4">Ghi chú cảnh báo:</p></v-flex>
            <v-flex  xs10 class="">
              <v-textarea  name="input-1" class="input-group--focused" v-model="detailTauBien.ghiChuCanhBao"></v-textarea>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="" style="margin-left:23%; height:3%;">
            <v-flex xs3 d-flex>
              <v-checkbox  hide-details style="height:15px;" label="Không sử dụng" class=""></v-checkbox>
              </v-flex>
          </v-flex >
      </v-flex>
    </v-flex> 
  </div>
   
</template>

<script>
import axios from 'axios'
export default {
  name: 'my-form',
  // props: {
  //   notification: {
  //     type: Object,
  //     default: null
  //   }
  // },
  props: ['type', 'documentName', 'documentYear', 'documentTypeCode'],
  data: () => {
    return {
      ownNotification: {},
      addNotification: {},
      enabled: false,
      money: { decimal: ',', thousands: '.', prefix: ' ', suffix: ' ', precision: 2, masked: false },
      moneys: { decimal: '.', thousands: '.', prefix: ' ', suffix: ' ', precision: 2, masked: false },
      moneysd: { decimal: '', thousands: '', prefix: ' ', suffix: ' ', precision: 0, masked: false },
      items: ['Loai tàu 1', 'loai tàu2', 'loại tàu 3', 'Loại tàu 4'],
      detailTauBien: {}
    }
  },
  watch: {
    notification (notification) {
      this.ownNotification = notification
    }
  },
  computed: {
    principal: function () {
      return this.homeValue - this.downpayment
    }
  },
  created () {
    var vm = this
    vm.loadDetailTauBien()
  },
  methods: {
    Add () {
      this.addNotification = this.ownNotification
      this.$emit('addNotification', this.addNotification)
      axios.post('http://localhost:100/hanhtrinh', {
        notificationType: this.addNotification.notificationType,
        sodangky: this.addNotification.sodangky,
        loaitau: this.addNotification.loaitau
      })
      .then(response => {
      })
      .catch(error => {
        console.log(error)
      })
    },
    Delete () {
      this.$emit('deleteNotification', this.ownNotification)
      axios.delete('http://localhost:100/hanhtrinh/' + this.ownNotification.id)
    },
    Update () {
      this.$emit('updateNotification', this.ownNotification)
    },
    loadDetailTauBien () {
      var vm = this
      let config = {
        'documentType': vm.documentType,
        'documentName': vm.documentName,
        'documentYear': vm.documentYear,
        'type': vm.type
      }
      vm.$store.dispatch('loadDetailTauBien', config).then(function (result) {
      }).catch(function (xhr) {
        console.log(xhr)
        vm.detailTauBien = {
          tenTau: '30 AUGUSTA',
          quocTich: 'VIET NAM',
          chuTau: 'MV Agusta',
          daiLy: 'AUGUSTA',
          loaiTau: '',
          nt: '19,458',
          gt: '30,308',
          dwt: '60,458',
          congSuatMay: '0',
          breadth: '32.00',
          loa: '206.98',
          monNuocTke: '',
          chieuCaoTKhong: '36.00',
          hoHieu: 'TCKV',
          soIMO: '',
          cangDangKy: '',
          namDongTau: '0',
          nuocDongTau: '',
          ghiChuCanhBao: ''
        }
      })
    }
  }

}
</script>

<style>
   .input-group--focused .v-text-field__slot{
      border: 1px solid rgba(0,0,0,.40);
      border-bottom: none;
  }  
.flex.xs1{
  flex-basis:15%;
  max-width: none;
}
.ht{
  height:56px;
}
.flex.xs1 p{
  color: #0d2434;
}
.flex.xs3 span{
  color: red;
}
.v-input--selection-controls{
  margin:0px;
  padding:0px;
}
.theme--light .v-label {
  margin-top: 10px;
  color: #000000;
  font-family: unset;
}
.v-input{
  width: 90%;
  font-family: Arial;
  /* font-weight: bold; */
  font-size: 15px;
}
.text p{
  font-family: Arial;
  font-weight: bold;
  font-size: 15px;
}
.v-overflow-btn .v-input__control{
  height: 32px;
}
.v-overflow-btn .v-input__slot{
  border: 1px solid rgba(0,0,0,.40);
      border-bottom: none;
}
.v-overflow-btn .v-input__append-inner{
  height: 65%;
}
</style>
