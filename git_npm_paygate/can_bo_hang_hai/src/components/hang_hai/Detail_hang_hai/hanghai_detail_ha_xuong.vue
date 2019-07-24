<template>
  <v-flex xs12 style="margin:auto">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Hạ xuồng <span @click="showWarning = !showWarning" style="cursor: pointer; color: orange;" v-if="warningHaXuong['show']" color="warning">(Cảnh báo)</span></h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; height: 21px; margin-top: 4px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themThaXuong()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteThaXuong()"
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
              @click="luuThaXuong()"
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
              @click="luuTauThaXuong()"
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
              @click="xacNhanTauHaXuong()"
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
              @click="duyetTauHaXuong()"
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
              <div v-html="item" v-for="(item, index) in warningHaXuong['message']"></div>
            </v-alert>
          </v-card-title>
        </v-card>
      </v-layout>
    </v-flex>
    <v-form ref="formThaXuong" v-model="validFormThaXuong" lazy-validation :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm">
      <v-layout row wrap class="pl-2 mt-4">
        <v-flex xs5 class="pl-5">
          <v-layout row wrap>
            <v-flex xs3 class="pt-1">
              Tên tàu
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0 txt-u"
                clearable
                placeholder="Nhập tên tàu"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                v-model="detailThaXuong.nameOfShip"
              ></v-text-field>
            </v-flex>
          </v-layout>
          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Thuyền trưởng:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập thuyền trưởng"
                v-model="detailThaXuong.shipCaptain"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Đại lý:</v-flex>
            <v-flex xs9 class="ml-a">
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập đại lý"
                v-model="detailThaXuong.shipAgencyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Chủ tàu:</v-flex>
            <v-flex xs9 class="text-xs-left">
              <v-text-field
                min-width="100"
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập chủ tàu"
                v-model="detailThaXuong.shipOwnerName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Người khai thác:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                hight="10"
                clearable
                placeholder="Nhập người khai thác"
                v-model="detailThaXuong.shipOperatorName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Quốc tịch:</v-flex>
            <v-flex xs7 d-flex>
              <v-select
              autocomplete
              placeholder="Nhập quốc tịch"
              :items="flagStateOfShipItems"
              item-text="stateName"
              item-value="stateCode"
              v-model="detailThaXuong.flagStateOfShip"
              class="py-0 my-0"
              clearable
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Hô hiệu:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập hô hiệu"
                v-model="detailThaXuong.callSign"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Số IMO:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập IMO"
                v-model="detailThaXuong.imoNumber"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Loại tàu:</v-flex>
            <v-flex xs7 class>
              <v-select
                class="px-0 py-0 mx-0 my-0"
                autocomplete
                clearable
                placeholder="Chọn loại tàu"
                :items="shipTypeItems"
                item-text="shipTypeNameVN"
                item-value="shipTypeCode"
                v-model="detailThaXuong.shipType"
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3 class="pt-1">Cấp độ an ninh:</v-flex>
            <v-flex xs7 class>
              <v-select
                placeholder="Chọn cấp độ an ninh"
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                class="px-0 py-0 mx-0 my-0"
                autocomplete
                clearable
                v-model="detailThaXuong.securityLevelCode"
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
              v-model="detailThaXuong.timeOfDeparture"
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
              v-model="detailThaXuong.timeOfArrival"
              ></datetime-picker>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex xs6 class="ml-5">
          <v-layout row wrap>
            <v-flex xs4 class="mb-2">
              <h3 class="font-weight-bold">Khu vực thả xuồng</h3>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs4 class="pt-1">Thời gian bắt đầu thả xuồng:</v-flex>
            <v-flex xs6 class>
              <datetime-picker
                
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                required
                class="px-1 py-1 mx-0 my-0"
                v-model="detailThaXuong.launchingFrom"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs4 class="pt-1">Thời gian kết thúc thả xuồng:</v-flex>
            <v-flex xs6 class>
              <datetime-picker
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                required
                class="px-1 py-1 mx-0 my-0"
                v-model="detailThaXuong.launchingTo"
              ></datetime-picker>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs4 class="pt-1">Khu vực thả xuồng:</v-flex>
            <v-flex xs8 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                clearable
                placeholder="Nhập khu vực thả xuồng"
                v-model="detailThaXuong.launchingPlace"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs4 class="pt-1">
              Mục đích thả xuồng
              <span style="color: red;">(*)</span>:
            </v-flex>
            <v-flex xs8 class>
              <v-text-field
                multi-line
                placeholder="Nhập mục đích"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailThaXuong.launchingReason"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                rows="3"
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
    showWarning: false,
    warningHaXuong: {
      show: false,
      message: []
    },
    detailThaXuong: {},
    validThaXuong: true,
    shipTypeItems: [],
    securityLevelItems: [],
    flagStateOfShipItems: [],
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
        vm.loadPortWharf()
        vm.loadShipAgency()
        vm.loadPortHarbour()
        vm.loadPurpose()
        vm.loadCargo()
        vm.loadChanelList()
        vm.loadsecurityLevel()
        vm.loadFlagStateOfShip()
      } else {
        vm.loadThaXuong()
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
    vm.loadPortWharf()
    vm.loadShipAgency()
    vm.loadPortHarbour()
    vm.loadPurpose()
    vm.loadCargo()
    vm.loadChanelList()
    vm.loadsecurityLevel()
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadThaXuong()
    } else {
      vm.detailThaXuong = {}
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
    luuTauThaXuong: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuThaXuong()
      } else {
        vm.themThaXuong()
      }
    },
    duyetTauHaXuong: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'ACTIVE'
      vm.luuThaXuong()
    },
    xacNhanTauHaXuong: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'CONFIRM'
      vm.luuThaXuong()
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
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
        vm.detailThaXuong = Object.assign(vm.detailThaXuong, vm.parseTimeTau(result))
      })
    },
    loadThaXuong: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailHaXuong', data).then(function (result) {
        vm.detailThaXuong = Object.assign(vm.detailThaXuong, vm.parseTimeTau(result))
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themThaXuong: function () {
      var vm = this
      vm.detailThaXuong['id'] = ''
      vm.detailThaXuong['itineraryNo'] = ''
      vm.detailThaXuong['documentName'] = vm.documentName
      vm.detailThaXuong['documentYear'] = vm.documentYear
      if (vm.$refs.formThaXuong.validate()) {
        vm.$store
          .dispatch('addThaXuong', vm.detailThaXuong)
          .then(function (result) {
            if (result.hasOwnProperty('errorCode')) {
              toastr.error('Thêm thất bại, vui lòng thử lại!')
              toastr.error(result.message)
            } else {
              vm.detailThaXuong = Object.assign(vm.detailThaXuong, vm.parseTimeTau(result))
              vm.changeIdUrl(result['vmaScheduleLaunchingId'])
              toastr.success('Thêm phương tiện thành công!')
            }
          })
          .catch(function (xhr) {
            console.log(xhr)
          })
      }
    },
    deleteThaXuong: function () {
      var vm = this
      let data = {
        vmaScheduleLaunchingId: vm.id
      }
      vm.$store
        .dispatch('deleteThaXuong', data)
        .then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Xóa thất bại!')
            toastr.error(result.message)
          } else {
            toastr.success('Xóa thành công!')
          }
          vm.changeIdUrl('0')
        })
        .catch(function (xhr) {
          console.log(xhr)
        })
    },
    lamMoi: function () {
      var vm = this
      vm.detailThaXuong = {}
    },
    luuThaXuong: function () {
      var vm = this
      if (vm.$refs.formThaXuong.validate()) {
        vm.$store.dispatch('editThaXuong', vm.detailThaXuong).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailThaXuong = Object.assign(vm.detailThaXuong, vm.parseTimeTau(result))
            toastr.success('Lưu phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    parseTimeTau: function (modelHaXuong) {
      var vm = this
      if (!modelHaXuong) {
        console.log('valid ha xuong', modelHaXuong)
        return
      }
      modelHaXuong['timeOfDeparture'] = vm.parseTimeStamp(modelHaXuong['timeOfDeparture'])
      modelHaXuong['timeOfArrival'] = vm.parseTimeStamp(modelHaXuong['timeOfArrival'])
      modelHaXuong['launchingFrom'] = vm.parseTimeStamp(modelHaXuong['launchingFrom'])
      modelHaXuong['launchingTo'] = vm.parseTimeStamp(modelHaXuong['launchingTo'])
      return modelHaXuong
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
      })
    }
  }
}
</script>

