<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0;" class="text ml-3" xs12><h3>PT TND {{detailPTTND.phuong_tien}} &nbsp;&nbsp;{{detailPTTND.registryNumber}}</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themPhuongTienThuyNoiDia()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deletePhuongTienThuyNoiDia()"
            >
              <v-icon size="20" color="red">close</v-icon>Xóa
            </v-btn>
            
            <v-btn
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="lamMoi()"
            >
              <v-icon size="20" color="green">refresh</v-icon>Refresh
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="luuPhuongTienThuyNoiDia()"
            >
              <v-icon size="17">save</v-icon>Lưu lại
            </v-btn>
            
            <v-btn
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="quayLai()"
            >
              <v-icon size="17">reply</v-icon>Quay lại
            </v-btn>
          </v-flex>
        </v-flex>
      </v-layout>
    </v-flex>
    <v-form
      ref="formPTTND"
      v-model="validFormPTTND"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs6 class="px-2">
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Tên phương tiện :</label></v-flex>
                <v-flex xs8>
                  <v-text-field clearable class="py-0 my-0"  placeholder="Nhập tên phương tiện" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND.shipName"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Số đăng ký:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field class="py-0 my-0"  placeholder="Nhập số đăng ký" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND.registryNumber"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Loại tàu:</label></v-flex>
                <v-flex xs8>
                  <v-select
                  clearable
                  placeholder="Chọn loại tàu"
                  :items="shipTypeItems"
                  item-text="shipTypeNameVN"
                  item-value="shipTypeCode"
                  v-model="detailPTTND.shipTypeCode"
                  class="py-0 my-0"
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12 class="mb-3">
              <v-layout row wrap>
                <v-flex xs3 class="pt-1">
                </v-flex>
                <v-flex xs8>
                  <v-checkbox clearable v-model="detailPTTND.hasTugBoat" hide-details style="height:15px;" label="Tàu kéo" class=""></v-checkbox>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Tên tàu kéo:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field clearable class="py-0 my-0" placeholder="Nhập tên tàu kéo" :disabled="!detailPTTND.hasTugBoat" v-model="detailPTTND.tugBoatName"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Tên sà lan:</label></v-flex>
                <v-flex xs8>
                  <v-text-field clearable class="py-0 my-0" placeholder="Nhập sà lan" v-model="detailPTTND.shipLashName"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Chủ tàu:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field clearable class="py-0 my-0"  placeholder="Nhập tên chủ tàu" v-model="detailPTTND.companyName"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Địa chỉ:</label></v-flex>
                <v-flex xs8>
                  <v-text-field clearable class="py-0 my-0" placeholder="Nhập địa chỉ"  v-model="detailPTTND.address"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Thuyền trưởng:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field clearable class="py-0 my-0"  placeholder="Nhập tên thuyền trưởng"  v-model="detailPTTND.nameOfMaster"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Hạng bằng TT:</label></v-flex>
                <v-flex xs8>
                  <v-select
                  clearable
                  :items="hangBangTtItems"
                  item-text="text"
                  item-value="value"
                  v-model="detailPTTND.hangBangTT"
                  class="py-0 my-0"
                  placeholder="Chọn hạng bằng TT"
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
        </v-flex>
        <v-flex xs6 class="px-2">
           <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Máy trưởng:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field clearable  placeholder="Nhập tên máy trưởng"  v-model="detailPTTND.chiefOfEngineer"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Hạng bằng MT:</label></v-flex>
                <v-flex xs8>
                  <v-select
                  clearable
                  :items="hangBangMtItems"
                  item-text="text"
                  item-value="value"
                  v-model="detailPTTND.hangBangMT"
                  class="py-0 my-0"
                  placeholder="Chọn hạng bằng MT"
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Loa (m):</label></v-flex>
                <v-flex xs8 class="">
                  <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND['loa']"></v-currency-field>
                  <!-- <v-text-field v-money="money" clearable class="py-0 my-0" placeholder="Chiều dài lớn nhất Lmax(m)"  v-model.lazy="detailPTTND.loa"
                  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Breadth:</label></v-flex>
                <v-flex xs8 class="">
                  <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND['breadth']"></v-currency-field>
                  <!-- <v-text-field clearable class="py-0 my-0" placeholder="Chiều rộng lớn nhất Bmax(m)"  v-model.lazy="detailPTTND.breadth"
                  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>GT:</label></v-flex>
                <v-flex xs8 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" v-model="detailPTTND['gt']"></v-currency-field>
                  <!-- <v-text-field clearable placeholder="Tổng dung tích" class="py-0 my-0"  v-model.lazy="detailPTTND.gt" 
                  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12> 
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>DWT:</label></v-flex>
                <v-flex xs8 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND['dwt']"></v-currency-field>
                  <!-- <v-text-field clearable placeholder="Lượng chiếm nước toàn tải" class="py-0 my-0"  v-model.lazy="detailPTTND.dwt"
                  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Công suất máy:</label></v-flex>
                <v-flex xs8 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailPTTND['power']"></v-currency-field>
                  <!-- <v-text-field clearable placeholder="Nhập công suất máy" class="py-0 my-0"  v-model.lazy="detailPTTND.power"
                  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="pt-1"><label>Ngày hết hạn đăng ký:</label></v-flex>
                <v-flex xs8 class="">
                  <v-flex xs12 lg6>
                    <date-DatetimePicker
                    v-model="detailPTTND['expiredDate']"
                    :first-day="1"
                    :show-dst="false"
                    :show-hours="false"
                    :show-minutes="false"
                    :show-seconds="false"
                    class="px-0 pb-1 mx-0 my-0">
                  </date-DatetimePicker>
                  </v-flex>
                </v-flex>
              </v-layout>
          </v-flex>
        </v-flex>
        </v-layout>
      </v-flex>
    </v-form>
  </div>
   
</template>

<script>
// import axios from 'axios'
import DatetimePicker from '../DatetimePicker.vue'
import {VMoney} from 'v-money'
import toastr from 'toastr'
toastr.options = {
  'closeButton': true,
  'timeOut': '3000'
}
export default {
  name: 'my-form',
  components: {
    'date-DatetimePicker': DatetimePicker
  },
  props: {
    type: '',
    documentTypeCode: '',
    documentStatusCode: '',
    id: '',
    code: '',
    statusCode: '',
    documentName: '',
    documentYear: ''
  },
  directives: {money: VMoney},
  data: () => ({
    errorsMessage: {
    },
    homeValue: 350000,
    detailPTTND: {
      expiredDate: ''
    },
    formatClearanceHeight: {
      decimal: '.',
      thousands: ',',
      prefix: '',
      suffix: '',
      precision: 1,
      masked: false
    },
    formatGT: {
      decimal: '.',
      thousands: ',',
      prefix: '',
      suffix: '',
      precision: 0,
      masked: false
    },
    money: {
      decimal: ',',
      thousands: '.',
      prefix: '',
      suffix: '',
      precision: 2,
      masked: false
    },
    addNotification: {},
    enabled: false,
    thoiGianDiDSDT: '',
    hangBangTtItems: [
      {
        text: 'Hạng 1',
        value: 1
      },
      {
        text: 'Hạng 2',
        value: 2
      },
      {
        text: 'Hạng 3',
        value: 3
      },
      {
        text: 'Hạng 4',
        value: 4
      }
    ],
    hangBangMtItems: [
      {
        text: 'Hạng 1',
        value: 1
      },
      {
        text: 'Hạng 2',
        value: 2
      },
      {
        text: 'Hạng 3',
        value: 3
      },
      {
        text: 'Hạng 4',
        value: 4
      }
    ],
    validFormPTTND: true,
    shipTypeItems: []
  }),
  watch: {
    // notification (notification) {
    //   this.detailPTTND = notification
    // }
    detailPTTND: {
      handler: function (val) {
        var vm = this
        vm.validNumberInput()
      },
      deep: true
    },
    id (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadShipType()
      } else {
        vm.loadPhuongTienThuyNoiDia()
      }
    }
  },
  computed: {
    // principal: function () {
    //   return this.homeValue - this.downpayment
    // }
  },
  created () {
    var vm = this
    vm.loadShipType()
    if (vm.id && vm.id !== '0') {
      vm.loadPhuongTienThuyNoiDia()
    } else {
    }
  },
  methods: {
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.flagStateOfShipItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.portWharfItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.shipAgencyItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.portHarbourItems = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadPurpose: function () {
      var vm = this
      let param = {
        categoryId: 'DM_PURPOSE'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.purposeItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.cargoItems = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadShipType: function () {
      var vm = this
      let param = {
        categoryId: 'DM_SHIP_TYPE'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.shipTypeItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.chanelListItems = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    validNumberInput: function () {
      var vm = this
      var validGT = true
      var validDWT = true
      var validPower = true
      var validBreadth = true
      var validLOA = true
      if (!vm.detailPTTND['gt'] || vm.detailPTTND['gt'] === '0') {
        vm.errorsMessage['messageGT'] = 'Bắt buộc'
        validGT = false
      } else {
        delete vm.errorsMessage['messageGT']
        validGT = true
      }
      if (!vm.detailPTTND['dwt'] || vm.detailPTTND['dwt'] === '0') {
        vm.errorsMessage['messageDWT'] = 'Bắt buộc'
        validDWT = false
      } else {
        delete vm.errorsMessage['messageDWT']
        validDWT = true
      }
      if (!vm.detailPTTND['power'] || vm.detailPTTND['power'] === '0') {
        vm.errorsMessage['messagePower'] = 'Bắt buộc'
        validPower = false
      } else {
        delete vm.errorsMessage['messagePower']
        validPower = true
      }
      if (!vm.detailPTTND['breadth'] || vm.detailPTTND['breadth'] === '0') {
        vm.errorsMessage['messageBreadth'] = 'Bắt buộc'
        validBreadth = false
      } else {
        delete vm.errorsMessage['messageBreadth']
        validBreadth = true
      }
      if (!vm.detailPTTND['loa'] || vm.detailPTTND['loa'] === '0') {
        vm.errorsMessage['messageLOA'] = 'Bắt buộc'
        validLOA = false
      } else {
        delete vm.errorsMessage['messageLOA']
        validLOA = true
      }
      console.log('vm.errorsMessage++++++++', vm.errorsMessage)
      if (validGT && validDWT && validPower && validBreadth && validLOA) {
        console.log('valid TRUE!!!!!')
        return true
      } else {
        return false
      }
    },
    loadPhuongTienThuyNoiDia: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailPTTND', data).then(function (result) {
        vm.detailPTTND = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themPhuongTienThuyNoiDia: function () {
      var vm = this
      vm.detailPTTND['id'] = ''
      vm.detailPTTND['shipBoat'] = 'BOAT'
      var validNumberInput = vm.validNumberInput()
      if (vm.$refs.formPTTND.validate() && validNumberInput) {
        vm.$store.dispatch('addPhuongTienThuyNoiDia', vm.detailPTTND).then(function (result) {
          vm.detailPTTND = result
          vm.changeIdUrl(result.id)
          toastr.success('Thêm phương tiện thành công!')
        }).catch(function (xhr) {
          console.log(xhr)
          toastr.error('Thêm thất bại, vui lòng thử lại!')
        })
      }
    },
    deletePhuongTienThuyNoiDia: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deletePhuongTienThuyNoiDia', data).then(function (result) {
        toastr.success('Xóa thành công!')
        vm.changeIdUrl('0')
      }).catch(function (xhr) {
        console.log(xhr)
        toastr.error('Xóa thất bại, vui lòng thử lại!')
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailPTTND = {}
    },
    luuPhuongTienThuyNoiDia: function () {
      var vm = this
      var validNumberInput = vm.validNumberInput()
      if (vm.$refs.formPTTND.validate() && validNumberInput) {
        vm.$store.dispatch('editPhuongTienThuyNoiDia', vm.detailPTTND).then(function (result) {
          vm.detailPTTND = result
          toastr.success('Lưu thành công!')
        }).catch(function (xhr) {
          console.log(xhr)
          toastr.error('Lưu thất bại, vui lòng thử lại!')
        })
      }
    },
    changeIdUrl: function (id) {
      var vm = this
      vm.$router.push({
        path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + id + '/' + vm.code + '/detail'
      })
    },
    quayLai: function () {
      var vm = this
      vm.$router.push({
        path: '/quan-ly-tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.code
      })
    }
  }

}
</script>

