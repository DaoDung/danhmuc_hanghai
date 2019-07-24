<template>
  <v-flex xs12 style="margin:auto">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Giữ tàu <span @click="showWarning = !showWarning" style="cursor: pointer; color: orange;" v-if="warningGiuTau['show']" color="warning">(Cảnh báo)</span></h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; height: 21px; margin-top: 4px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themGiuTau()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteGiuTau()"
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
              @click="luuGiuTau()"
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

        <v-flex xs6 class="text-xs-right pl-3" v-else>
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              v-if="disabledForm"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="activeForm()"
            >
              <v-icon size="17">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              v-if="!disabledForm"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="luuHSGiuTau()"
            >
              <v-icon size="20">save</v-icon>Lưu
            </v-btn>
            
            <v-btn
              v-if="!disabledForm"
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="xacNhanGiuTau()"
            >
              <v-icon size="20">confirmation_number</v-icon>Xác nhận
            </v-btn>
            
            <v-btn
              flat
              v-if="!disabledForm"
              :disabled="!id || id === '0'"
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="duyetGiuTau()"
            >
              <v-icon size="17">done</v-icon>Duyệt
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

        <v-card v-if="showWarning" style="width: 100%;">
          <v-card-title class="pt-0 py-0 px-0 adv__search__container">
            <v-alert
              class="my-0"
              style="width: 100%;"
              :value="true"
              color="warning"
              icon="priority_high"
              outline
              >
              <div v-html="item" v-for="(item, index) in warningGiuTau['message']"></div>
            </v-alert>
          </v-card-title>
        </v-card>
      </v-layout>
    </v-flex>
    
    <v-form ref="formGiuTau" v-model="validFormGiuTau" lazy-validation :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm">
      <v-layout row warp class="mt-4">
        <v-flex xs5 class="ml-5">
          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">
              Tên tàu
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Nhập tên tàu"
                class="px-0 py-0 mx-0 my-0 txt-u"
                clearable
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                v-model="detailGiuTau.nameOfShip"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Thuyền trưởng:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                clearable
                placeholder="Nhập thuyền trưởng"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailGiuTau.shipCaptain"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Đại lý:</v-flex>
            <v-flex xs9 class="ml-a">
              <v-text-field
                clearable
                placeholder="Nhập đại lý"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailGiuTau.shipAgencyName"
              ></v-text-field>
            </v-flex>
          </v-layout>
          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Chủ tàu:</v-flex>
            <v-flex xs9 class="text-xs-left">
              <v-text-field
                min-width="100"
                placeholder="Nhập chủ tàu"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.shipOwnerName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Người khai thác:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                clearable
                autocomplete
                placeholder="Chọn người khai thác"
                class="px-0 py-0 mx-0 my-0"
                :items="shipOperatorItems"
                item-text="companyName"
                item-value="shipOwnerCode"
                v-model="detailGiuTau.shipOperatorCode"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Quốc tịch:</v-flex>
            <v-flex xs7 class>
              <v-select
              autocomplete
              placeholder="Chọn quốc tịch"
              :items="flagStateOfShipItems"
              item-text="stateName"
              item-value="stateCode"
              v-model="detailGiuTau.flagStateOfShip"
              class="py-0 my-0"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
              clearable
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Hô hiệu:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                placeholder="Nhập hô hiệu"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.callSign"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Số IMO:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                placeholder="Nhập số IMO"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.imoNumber"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Loại tàu:</v-flex>
            <v-flex xs7 class>
              <v-select
                clearable
                class="px-0 py-0 mx-0 my-0"
                autocomplete
                placeholder="Chọn loại tàu"
                :items="shipTypeItems"
                item-text="shipTypeNameVN"
                item-value="shipTypeCode"
                v-model="detailGiuTau.shipType"
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Cấp độ an ninh:</v-flex>
            <v-flex xs7 class>
              <v-select
                clearable
                placeholder="Chọn cấp độ an ninh"
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                class="px-0 py-0 mx-0 my-0"
                autocomplete
                v-model="detailGiuTau.securityLevelCode"
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">
              Thời gian đến
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs7 class>
              <datetime-picker
              
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              class="px-1 py-1 mx-0 my-0"
              v-model="detailGiuTau.timeOfDeparture"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="mt-1 text-xs-center">
              Thời gian đi
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs7 class="">
              <datetime-picker

              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              class="px-1 py-1 mx-0 my-0"
              v-model="detailGiuTau.timeOfArrival"
              ></datetime-picker>
            </v-flex>
          </v-layout>


          <v-layout row wrap >
            <v-flex xs4 class="my-2">
              <h3 class="font-weight-bold">Bắt giữ/Tạm giữ</h3>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Cơ quan ra QD bắt giữ:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Cơ quan bắt giữ"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.securityCompanyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Số QĐ bắt giữ:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Số QĐ quan bắt giữ"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.securityOfficialNo"
              ></v-text-field>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex xs5 class="ml-5">
          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">
              Ngày bắt giữ
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs7 class>
              <datetime-picker
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                required
                class="px-1 py-1 mx-0 my-0"
                v-model="detailGiuTau.securityDate"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Địa điểm bắt giữ:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Địa điểm bắt giữ"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.securityPlace"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1 text-xs-center pr-1">
              Lý do
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs9>
              <v-text-field
                multi-line
                rows="3"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                v-model="detailGiuTau.securityReason"
                class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs12>
              <h3 class="font-weight-bold">Giải tỏa</h3>
            </v-flex>
          </v-layout>

          <v-layout row wrap class="mt-2" >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Cơ quan ra QĐ giải tỏa:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Cơ quan ra QĐ"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.evacuateCompanyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Số QĐ giải tỏa:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Số QĐ giải tỏa"
                class="px-0 py-0 mx-0 my-0"
                clearable
                v-model="detailGiuTau.evacuateOfficialNo"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Thời gian giải tỏa:</v-flex>
            <v-flex xs5 class>
              <datetime-picker
                
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                required
                class="px-1 py-1 mx-0 my-0"
                v-model="detailGiuTau.evacuateReason"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1 text-xs-center pr-1">Lý do:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                multi-line
                rows="3"
                v-model="detailGiuTau.securityReason"
              ></v-text-field>
            </v-flex>
          </v-layout>
        </v-flex>
      </v-layout>
    </v-form>
  </v-flex>
</template>
<script>
import DatetimePicker from '../DatetimePicker.vue'
import toastr from 'toastr'
toastr.options = {
  'closeButton': true,
  'timeOut': '3000'
}
export default {
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
  data: () => ({
    date: null,
    dateFormatted: null,
    menu: false,
    detailGiuTau: {},
    validFormGiuTau: true,
    shipTypeItems: [],
    securityLevelItems: [],
    shipOperatorItems: [],
    flagStateOfShipItems: [],
    showWarning: false,
    warningGiuTau: {
      show: false,
      message: []
    },
    disabledForm: false
  }),
  components: {
    'datetime-picker': DatetimePicker
  },
  watch: {
    id (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadShipType()
        vm.loadsecurityLevel()
        vm.loadFlagStateOfShip()
      } else {
        vm.loadGiuTau()
      }
    },
    documentName (val) {
      var vm = this
      if (val && val !== '0') {
        if (!vm.id || vm.id === '0') {
          vm.disabledForm = true
        }
      }
    }
  },
  created () {
    var vm = this
    vm.loadShipType()
    vm.loadFlagStateOfShip()
    vm.loadsecurityLevel()
    if (vm.id && vm.id !== '0') {
      vm.loadGiuTau()
    } else if (vm.documentName && vm.documentName !== '0') {
      vm.loadInitData()
    }
  },
  methods: {
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.securityLevelItems = result
      }).catch(function (xhr) {
        console.log(xhr)
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
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.shipOperatorItems = result
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
    luuHSGiuTau: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuGiuTau()
      } else {
        vm.themGiuTau()
      }
    },
    duyetGiuTau: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'ACTIVE'
      vm.luuGiuTau()
    },
    xacNhanGiuTau: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'CONFIRM'
      vm.luuGiuTau()
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
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
    loadGiuTau: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailGiuTau', data).then(function (result) {
        vm.detailGiuTau = Object.assign(vm.detailGiuTau, vm.parseTimeTau(result))
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themGiuTau: function () {
      var vm = this
      vm.detailGiuTau['id'] = ''
      if (vm.$refs.formGiuTau.validate()) {
        vm.$store.dispatch('addGiuTau', vm.detailGiuTau).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailGiuTau = Object.assign(vm.detailGiuTau, vm.parseTimeTau(result))
            vm.changeIdUrl(result['vmaScheduleSecurityId'])
            toastr.success('Thêm phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deleteGiuTau: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteGiuTau', data).then(function (result) {
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailGiuTau = {}
    },
    loadInitData: function () {
      var vm = this
      let param = {
        itineraryNo: vm.itineraryNo,
        documentName: vm.documentName,
        documentYear: vm.documentYear,
        type: 'VIEW'
      }
      vm.$store.dispatch('loadInitData', param).then(function (result) {
        vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, vm.parseTimeTau(result))
      })
    },
    luuGiuTau: function () {
      var vm = this
      if (vm.$refs.formGiuTau.validate()) {
        vm.$store.dispatch('editGiuTau', vm.detailGiuTau).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailGiuTau = Object.assign(vm.detailGiuTau, vm.parseTimeTau(result))
            toastr.success('Thêm phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    parseTimeTau: function (modelGiuTau) {
      var vm = this
      if (!modelGiuTau) {
        console.log('valid giu tau', modelGiuTau)
        return
      }
      modelGiuTau['timeOfDeparture'] = vm.parseTimeStamp(modelGiuTau['timeOfDeparture'])
      modelGiuTau['timeOfArrival'] = vm.parseTimeStamp(modelGiuTau['timeOfArrival'])
      modelGiuTau['securityDate'] = vm.parseTimeStamp(modelGiuTau['securityDate'])
      modelGiuTau['evacuateReason'] = vm.parseTimeStamp(modelGiuTau['evacuateReason'])
      return modelGiuTau
    },
    parseTimeStamp: function (time) {
      var resultTime = ''
      if (!time) {
        console.log('valid time!', time)
        return
      }
      if (typeof time === 'string') {
        time = parseInt(time)
      }
      var date = new Date(time)
      resultTime = date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' ' + date.getHours() + ':' + date.getMinutes()
      return resultTime
    },
    changeIdUrl: function (id) {
      var vm = this
      if (vm.documentName) {
        vm.$router.push({
          path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/' + vm.code + '/' + id
        })
      } else {
        vm.$router.push({
          path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + id + '/' + vm.code + '/detail'
        })
      }
    },
    quayLai: function () {
      var vm = this
      vm.$router.push({
        path: '' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.code
      })
    }
  }
}
</script>
