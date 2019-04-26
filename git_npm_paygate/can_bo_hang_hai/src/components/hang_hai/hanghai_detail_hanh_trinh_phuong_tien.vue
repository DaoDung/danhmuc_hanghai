<template>
  <div class="form ml-4" >
    <v-flex xs12 d-flex>
      <v-flex xs6><v-flex class="mt-3 text" xs12><p>PT TND {{ownNotification.phuong_tien}}</p> </v-flex></v-flex>
      <v-flex xs6 d-flex>
        <v-flex class="mt-3" xs12 style="display: flex; height: 21px;">
        <div class="ml-2">
          <v-icon size="16">file_copy</v-icon>
          <a href="#" @click="Add"> Thêm mới</a>
        </div> 
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3 ">
          <v-icon size="16">replay</v-icon>
           <a href="#"> Refresh</a>
        </div>
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3">
          <v-icon size="16">save</v-icon>
          <a href="#" @click="Add">Lưu lại</a>
        </div>
        <div class="ml-2" style="border-right: 1px solid #aecaf0;"></div>
        <div class="ml-3">
          <v-icon size="16">reply</v-icon>
          <a href="#" @click="Add">Quay lại</a>
        </div>
      </v-flex>
      </v-flex>
    </v-flex>
    <v-flex xs12 d-flex>
      <v-flex xs6>
          <v-flex xs12 class="ht" style="display: flex;" min>
            <v-flex xs3><p class="my-4">Tên phương tiện <span>(*)</span>:</p></v-flex>
            <v-flex xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.phuong_tien"
              :rules="[v => !!v || 'Tên phương tiện bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Số đăng ký<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.sodangky"
              :rules="[v => !!v || 'Tên số đăng ký bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Loại tàu<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="" >
              <v-overflow-btn   :items="dropdown_edit" editable   hide-details class="pa-0 mt-3 " overflow></v-overflow-btn>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="mt-1 " style="margin-left:23%; height:3%;">
            <v-flex xs3 d-flex>
              <v-checkbox v-model="enabled" hide-details style="height:15px;" label="Tàu kéo" class=""></v-checkbox>
              </v-flex>
          </v-flex >
          <v-flex xs12 class="ht " style="display: flex;">
            <v-flex xs3><p class="my-4">Tên tàu kéo<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field :disabled="!enabled"  class="input-group--focused"  v-model="ownNotification.taukeo"
              :rules="[v => !!v || 'Tên tàu kéo bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Tên sà lan<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.salan"
              :rules="[v => !!v || 'Tên sà lan bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Chủ tàu<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.chutau"
              :rules="[v => !!v || 'Tên chủ tàu bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Địa chỉ<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field   name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.diachi"
              :rules="[v => !!v || 'Tên địa chỉ bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Thuyền trưởng<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.thuyentruong"
              :rules="[v => !!v || 'Tên thuyền trưởng bắt buộc phải nhập']" ></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Hạng bằng TT<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-overflow-btn   :items="dropdown_edit" editable   hide-details class="pa-0 mt-3 " overflow></v-overflow-btn>
            </v-flex >
          </v-flex >
      </v-flex>
      <v-flex xs6>
         <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Máy trưởng<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.may_truong"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Hạng bằng MT<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-overflow-btn   :items="dropdown_edit" editable   hide-details class="pa-0 mt-3 " overflow></v-overflow-btn>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Loa (m)<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys" name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.loa"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Breadth<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneys"  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.breadth"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">GT<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="moneysd"  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.gt" 
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
          <v-flex xs12 class="ht" style="display: flex;"> 
            <v-flex xs3><p class="my-4">DWT<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="money" name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.dwt"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class="my-4">Công suất máy<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="">
              <v-text-field v-money="money"  name="input-1" placeholder="" class="input-group--focused" v-model="ownNotification.cong_xuat_may"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
            </v-flex >
          </v-flex >
           <v-flex xs12 class="ht" style="display: flex;">
            <v-flex xs3><p class=" my-4">Ngày hết hạn đăng ký<span>(*)</span>:</p></v-flex>
            <v-flex  xs10 class="" >
              <v-flex xs12 lg6>
                <datetime-picker
                 v-model="thoiGianDiDSDT"
                  :first-day="1"
                  :show-dst="false"
                  :show-hours="false"
                  :show-minutes="false"
                  :show-seconds="false"
                  class="px-0 py-0 mx-0 my-0">
                </datetime-picker>
              </v-flex>
            </v-flex >
          </v-flex >
      </v-flex>
    </v-flex>
  </div>
   
</template>

<script>
import axios from 'axios'
import DatetimePicker from './DatetimePicker.vue'
export default {
  name: 'my-form',
  components: {
    'datetime-picker': DatetimePicker
  },
  props: {
    notification: {
      type: Object,
      default: null
    }
  },
  data: () => ({
    homeValue: 350000,
    ownNotification: {},
    addNotification: {},
    enabled: false,
    money: { decimal: ',', thousands: '.', prefix: ' ', suffix: ' ', precision: 2, masked: false },
    moneys: { decimal: '.', thousands: '.', prefix: ' ', suffix: ' ', precision: 2, masked: false },
    moneysd: { decimal: '', thousands: '', prefix: ' ', suffix: ' ', precision: 0, masked: false },
    dropdown_edit: [ { text: 'Loại 1' }, { text: 'Loại 2' }, { text: 'Loại 3' }, { text: 'Loại 4' }, { text: 'Loại 5' } ],
    thoiGianDiDSDT: ''
  }),
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
  methods: {
    Add () {
      this.addNotification = this.ownNotification
      this.$emit('addNotification', this.addNotification)
      axios.post('http://localhost:100/hanhtrinh', {
        notificationType: this.addNotification.notificationType,
        sodangky: this.addNotification.so_dang_ky,
        loaitau: this.addNotification.loai_tau,
        phuong_tien: this.addNotification.phuong_tien,
        taukeo: this.addNotification.tau_keo,
        salan: this.addNotification.sa_lan,
        chutau: this.addNotification.chu_tau,
        diachi: this.addNotification.dia_chi,
        thuyentruong: this.addNotification.thuyen_truong,
        may_truong: this.addNotification.may_truong,
        loa: this.addNotification.loa,
        breadth: this.addNotification.breadth,
        dwt: this.addNotification.dwt,
        gt: this.addNotification.gt,
        cong_xuat_may: this.addNotification.cong_xuat_may,
        dang_ky: this.addNotification.dang_ky
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
    formatDate (date) {
      if (!date) return null

      const [year, month, day] = date.split('-')
      return `${month}/${day}/${year}`
    },
    parseDate (date) {
      if (!date) return null

      const [month, day, year] = date.split('/')
      return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
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
