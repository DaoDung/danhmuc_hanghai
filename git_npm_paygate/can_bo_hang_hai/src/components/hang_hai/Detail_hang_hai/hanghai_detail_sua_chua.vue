<template>
  <v-flex xs12 style="width: 100%; background: #fff; position: relative;">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Sửa chữa tàu <span @click="showWarning = !showWarning" style="cursor: pointer; color: orange;" v-if="warningSuaChua['show']" color="warning">(Cảnh báo)</span></h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themSuaChua()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteSuaChua()"
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
              @click="luuSuaChua()"
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
              @click="luuTauSuaChua()"
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
              @click="xacNhanTauSuaChua()"
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
              @click="duyetTauSuaChua()"
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
              <div v-html="item" v-for="(item, index) in warningSuaChua['message']"></div>
            </v-alert>
          </v-card-title>
        </v-card>
      </v-layout>
    </v-flex>
    
    <v-progress-linear v-if="loadingDetail" :indeterminate="true"></v-progress-linear>

    <v-form ref="formSuaChua" v-model="validFormSuaChua" lazy-validation :style="{'opacity': disabledForm  || loadingDetail ? '0.6' : 1, 'pointer-events': disabledForm || loadingDetail ? 'none' : 'auto'}"
      :disabled="disabledForm">
      <v-layout row wrap class="pl-2 mt-4">
        <v-flex xs5 class="ml-5">
          <v-layout row wrap >
            <v-flex xs3 class="pt-1">
              Tên tàu
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Nhập tên tàu"
                class="px-0 py-0 mx-0 my-0 txt-u"
                
                v-model="detailSuaChua.nameOfShip"
                style=" text-transform: uppercase;"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Thuyền trưởng:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Nhập thuyền trưởng"
                class="px-0 py-0 mx-0 my-0"
                
                v-model="detailSuaChua.shipCaptain"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Đại lý:</v-flex>
            <v-flex xs9 class="ml-a">
              <v-text-field
                placeholder="Nhập đại lý"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailSuaChua.shipAgencyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Chủ tàu:</v-flex>
            <v-flex xs9 class="text-xs-left">
              <v-text-field
                placeholder="Nhập chủ tàu"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailSuaChua.shipOwnerName"
              ></v-text-field>
            </v-flex>
          </v-layout>
          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Người khai thác:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Nhập người khai thác"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailSuaChua.shipOperatorName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Quốc tịch:</v-flex>
            <v-flex xs7 d-flex>
              <v-select
              placeholder="Nhập quốc tịch"
              :items="flagStateOfShipItems"
              item-text="stateName"
              item-value="stateCode"
              v-model="detailSuaChua.flagStateOfShip"
              class="py-0 my-0"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
              clearable
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Hô hiệu:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                placeholder="Nhập hô hiệu"
                v-model="detailSuaChua.callSign"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Số IMO:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                placeholder="Nhập số IMO"
                v-model="detailSuaChua.imoNumber"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Loại tàu:</v-flex>
            <v-flex xs7 class>
              <v-select
              clearable
              :items="shipTypeItems"
              item-text="shipTypeNameVN"
              item-value="shipTypeCode"
              v-model="detailSuaChua.shipTypeCode"
              class="py-0 my-0"
              placeholder="Chọn loại tàu"
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Câp độ an ninh:</v-flex>
            <v-flex xs7 class>
              <v-select
                clearable
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                v-model="detailSuaChua.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
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
              v-model="detailSuaChua.repairingFrom"
              ></datetime-picker>
            </v-flex>

          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">
              Thời gian đi
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs7>
              <datetime-picker
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              class="px-1 py-1 mx-0 my-0"
              v-model="detailSuaChua.repairingTo"
              ></datetime-picker>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex xs5 class="ml-5">
          <v-flex xs4 class="mb-2" style="">
            <h3 class="font-weight-bold">Sửa chữa</h3>
          </v-flex>
          <v-layout row wrap >
            <v-flex xs12 d-flex  min>
              <v-flex xs3 class="pt-1">Số quyết định:</v-flex>
              <v-flex xs9 class>
                <v-text-field
                  class="px-0 py-0 mx-0 my-0"
                  placeholder="Nhập số quyết định"
                  v-model="detailSuaChua.shipYardOfficialNo"
                ></v-text-field>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">
              Từ ngày
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
              v-model="detailSuaChua.testingFrom"
              ></datetime-picker>
            </v-flex>
            
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="mt-1">
              Đến ngày
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs7 class="ml-3">
              <datetime-picker
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              required
              class="px-1 py-1 mx-0 my-0"
              v-model="detailSuaChua.testingTo"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Đơn vị sửa chữa:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                placeholder="Nhập đơn vị sửa chữa"
                v-model="detailSuaChua.shipYardCompanyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">
              Lý do sửa chữa
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs9 class>
              <v-text-field
                rows="3"
                multi-line
                class="px-0 py-0 mx-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                v-model="detailSuaChua.repairingReason"
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
    loadingDetail: false,
    detailSuaChua: {},
    validFormSuaChua: {},
    shipTypeItems: [],
    securityLevelItems: [],
    flagStateOfShipItems: [],
    showWarning: false,
    warningSuaChua: {
      show: false,
      message: []
    },
    disabledForm: false
  }),
  components: {
    'datetime-picker': DatetimePicker
  },
  watch: {
    id: function (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadShipType()
        vm.loadsecurityLevel()
        vm.loadFlagStateOfShip()
      } else {
        vm.loadSuaChua()
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
    vm.loadsecurityLevel()
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadSuaChua()
    } else {
      vm.detailSuaChua = {}
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
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
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
    loadInitData: function () {
      var vm = this
      let param = {
        itineraryNo: vm.itineraryNo,
        documentName: vm.documentName,
        documentYear: vm.documentYear,
        type: 'VIEW'
      }
      vm.$store.dispatch('loadInitData', param).then(function (result) {
        vm.detailSuaChua = Object.assign(vm.detailSuaChua, vm.parseTimeTau(result))
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
    loadSuaChua: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.loadingDetail = true
      vm.$store.dispatch('loadDetailSuaChua', data).then(function (result) {
        if (!result.hasOwnProperty('errorCode')) {
          vm.detailSuaChua = Object.assign(vm.detailSuaChua, vm.parseTimeTau(result))
        }
        vm.loadingDetail = false
      }).catch(function (xhr) {
        console.log(xhr)
        vm.loadingDetail = false
      })
    },
    luuTauSuaChua: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuSuaChua()
      } else {
        vm.themSuaChua()
      }
    },
    duyetTauSuaChua: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'ACTIVE'
      vm.luuSuaChua()
    },
    xacNhanTauSuaChua: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'CONFIRM'
      vm.luuGiuTau()
    },
    themSuaChua: function () {
      var vm = this
      vm.detailSuaChua['id'] = ''
      vm.detailSuaChua['itineraryNo'] = ''
      if (vm.$refs.formSuaChua.validate()) {
        vm.$store.dispatch('addSuaChua', vm.detailSuaChua).then(function (result) {
          vm.detailSuaChua = Object.assign(vm.detailSuaChua, vm.parseTimeTau(result))
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailSuaChua = Object.assign(vm.detailSuaChua, vm.parseTimeTau(result))
            vm.changeIdUrl(result['vmaScheduleShipyardId'])
            toastr.success('Thêm phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deleteSuaChua: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteSuaChua', data).then(function (result) {
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Lưu thất bại, vui lòng thử lại!')
          toastr.error(result.message)
        } else {
          vm.changeIdUrl('0')
          toastr.success('Lưu phương tiện thành công!')
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailSuaChua = {}
    },
    luuSuaChua: function () {
      var vm = this
      if (vm.$refs.formSuaChua.validate()) {
        vm.$store.dispatch('editSuaChua', vm.detailSuaChua).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailSuaChua = Object.assign(vm.detailSuaChua, vm.parseTimeTau(result))
            toastr.success('Lưu phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    parseTimeTau: function (modelSuaChua) {
      var vm = this
      if (!modelSuaChua) {
        console.log('valid sua chua', modelSuaChua)
        return
      }
      modelSuaChua['repairingFrom'] = vm.parseTimeStamp(modelSuaChua['repairingFrom'])
      modelSuaChua['repairingTo'] = vm.parseTimeStamp(modelSuaChua['repairingTo'])
      modelSuaChua['testingFrom'] = vm.parseTimeStamp(modelSuaChua['testingFrom'])
      modelSuaChua['testingTo'] = vm.parseTimeStamp(modelSuaChua['testingTo'])
      return modelSuaChua
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
