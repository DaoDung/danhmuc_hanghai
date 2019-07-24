<template>
  <v-flex xs12 style="width: 100%; background: #fff; position: relative;">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Kháng nghị hàng hải</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themKhangCao()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteKhangCao()"
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
              @click="luuKhangCao()"
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
    <v-progress-linear v-if="loadingDetail" :indeterminate="true"></v-progress-linear>
    <v-from ref="formKhangCao" 
      :style="{'opacity': disabledForm  || loadingDetail ? '0.6' : 1, 'pointer-events': disabledForm || loadingDetail ? 'none' : 'auto'}"
      :disabled="disabledForm" 
      lazy-validation 
      v-model="validFormKhangCao"
    >
      <v-layout row wrap class="pl-3 mt-4">
        <v-flex xs5 class="ml-5">
          <v-layout row wrap>
            <v-flex xs3>
              Tên tàu
              <span>(*)</span>:
            </v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0 txt-u"
                clearable
                placeholder="Nhập tên tàu"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                v-model="detailKhangCao.nameOfShip"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Thuyền trưởng:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                clearable
                placeholder="Nhập thuyền trưởng"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.shipCaptain"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Đại lý:</v-flex>
            <v-flex xs9 class="ml-a">
              <v-text-field
                clearable
                placeholder="Nhập đại lý"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.shipAgencyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Chủ tàu:</v-flex>
            <v-flex xs9 class="text-xs-left">
              <v-text-field
                clearable
                placeholder="Nhập chủ tàu"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.shipOwnerName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Người khai thác:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                clearable
                placeholder="Nhập người khai thác"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.shipOperatorName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Quốc tịch:</v-flex>
            <v-flex xs5 d-flex>
              <v-select
                autocomplete
                placeholder="Chọn quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailKhangCao.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Hô hiệu:</v-flex>
            <v-flex xs5 class>
              <v-text-field
                clearable
                placeholder="Nhập hô hiệu"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.callSign"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Số IMO:</v-flex>
            <v-flex xs5 class>
              <v-text-field
                clearable
                placeholder="Nhập IMO"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.imoNumber"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Loại tàu:</v-flex>
            <v-flex xs5 class>
              <v-select
                clearable
                autocomplete
                :items="shipTypeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="detailKhangCao.shipTypeCode"
                class="py-0 my-0"
                placeholder="Chọn loại tàu"
                ></v-select>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex xs6 class="ml-5">
          <v-layout row wrap>
            <v-flex xs3>Cấp độ an ninh:</v-flex>
            <v-flex xs8 class>
              <v-select
                clearable
                placeholder="Chọn cấp dộ an ninh"
                autocomplete
                class="px-0 py-0 mx-0 my-0"
                :items="securityLevelItems"
                item-text="securiyLevelName"
                item-value="securityLevelCode"
                v-model="detailKhangCao.securityLevelCode"
              ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs6>
              <v-flex xs12 d-flex min>
                <v-flex xs6>
                  Thời gian đến
                  <span>(*)</span>:
                </v-flex>
                <v-flex xs5 class>
                  <datetime-picker
                    
                    :first-day="1"
                    :show-dst="false"
                    :show-hours="true"
                    :show-minutes="true"
                    :show-seconds="false"
                    required
                    class="px-1 py-1 mx-0 my-0"
                    v-model="detailKhangCao.timeOfDeparture"
                  ></datetime-picker>
                </v-flex>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <v-layout row wrap>
                <v-flex xs5 class="pl-2 mt-1">
                  Thời gian đi
                  <span>(*)</span>:
                </v-flex>
                <v-flex xs5 class="ml-3">
                  <datetime-picker
                    
                    :first-day="1"
                    :show-dst="false"
                    :show-hours="true"
                    :show-minutes="true"
                    :show-seconds="false"
                    required
                    class="px-1 py-1 mx-0 my-0"
                    v-model="detailKhangCao.timeOfArrival"
                  ></datetime-picker>
                </v-flex>
              </v-layout>
            </v-flex>
          </v-layout>

          <v-layout row wrap>
            <v-flex xs3>Thời gian nhận kháng cáo:</v-flex>
            <v-flex xs8 class>
              <v-text-field
                clearable
                placeholder="Nhập thời gian nhận"
                class="px-0 py-0 mx-0 my-0"
                v-model="detailKhangCao.protestDate"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap style="">
            <v-flex xs3>
              Nội dung
              <span>(*)</span>
            </v-flex>
            <v-flex xs8 class>
              <v-text-field
                multi-line
                rows="3"
                v-model="detailKhangCao.protestRemarks"
                class="px-0 py-0 mx-0 my-0"
              ></v-text-field>
            </v-flex>
          </v-layout>
        </v-flex>
      </v-layout>
    </v-from>
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
    disabledForm: false,
    detailKhangCao: {},
    shipTypeItems: [],
    validFormKhangCao: {},
    securityLevelItems: [],
    flagStateOfShipItems: [],
    portWharfItems: [],
    shipAgencyItems: [],
    portHarbourItems: [],
    purposeItems: [],
    cargoItems: [],
    chanelListItems: []
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
        vm.loadKhangCao()
      }
    }
  },
  created () {
    var vm = this
    vm.loadShipType()
    vm.loadsecurityLevel()
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadKhangCao()
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
    loadKhangCao: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.loadingDetail = true
      vm.$store.dispatch('loadDetailKhangCao', data).then(function (result) {
        if (!result.hasOwnProperty('errorCode')) {
          vm.detailKhangCao = Object.assign(vm.detailKhangCao, vm.parseTimeTau(result))
        }
        vm.loadingDetail = false
      }).catch(function (xhr) {
        console.log(xhr)
        vm.loadingDetail = false
      })
    },
    themKhangCao: function () {
      var vm = this
      vm.detailKhangCao['id'] = ''
      if (vm.$refs.formKhangCao.validate()) {
        vm.$store.dispatch('addKhangCao', vm.detailKhangCao).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailKhangCao = Object.assign(vm.detailKhangCao, vm.parseTimeTau(result))
            vm.changeIdUrl(result['vmaItineraryProtest'])
            toastr.success('Thêm phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deleteKhangCao: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteKhangCao', data).then(function (result) {
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Xóa thất bại!')
          toastr.error(result.message)
        } else {
          toastr.success('Xóa thành công!')
        }
        vm.changeIdUrl('0')
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
        vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, vm.parseTimeTau(result))
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailKhangCao = {}
    },
    luuKhangCao: function () {
      var vm = this
      if (vm.$refs.formKhangCao.validate()) {
        vm.$store.dispatch('editKhangCao', vm.detailKhangCao).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.detailKhangCao = Object.assign(vm.detailKhangCao, vm.parseTimeTau(result))
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
        path: '' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.code
      })
    }
  }
}
</script>
