<template>
  <v-flex xs12 style="margin:auto">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Hạ xuồng</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
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
      </v-layout>
    </v-flex>
    <v-from ref="formThaXuong" v-model="validFormThaXuong">
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
            <v-flex xs9 class>
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
            <v-flex xs6>
              <v-flex xs12 class="ht" style="display: flex; " min>
                <v-flex xs6>
                  Thời gian đến
                  <span style="color: red;">(*)</span>:
                </v-flex>
                <v-flex xs6 class>
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
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <v-flex xs12 class="ht" d-flex min>
                <v-flex xs5 class="ml-3 mt-1 text-xs-center">
                  Thời gian đi
                  <span style="color: red;">(*)</span>:
                </v-flex>
                <v-flex xs6 class="pl-2">
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
              </v-flex>
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
    </v-from>
  </v-flex>
</template>
<script>
import DatetimePicker from '../DatetimePicker.vue'
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
    detailThaXuong: {},
    validThaXuong: true,
    shipTypeItems: [],
    securityLevelItems: [],
    flagStateOfShipItems: []
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
      } else {
        vm.loadThaXuong()
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
    themThaXuong: function () {
      var vm = this
      vm.detailThaXuong['id'] = ''
      if (vm.$refs.formThaXuong.validate()) {
        vm.$store
          .dispatch('addThaXuong', vm.detailThaXuong)
          .then(function (result) {
            vm.detailThaXuong = result
          })
          .catch(function (xhr) {
            console.log(xhr)
          })
      }
    },
    deleteThaXuong: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store
        .dispatch('deleteThaXuong', data)
        .then(function (result) {})
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
        vm.$store
          .dispatch('editThaXuong', vm.detailThaXuong)
          .then(function (result) {
            vm.detailThaXuong = result
          })
          .catch(function (xhr) {
            console.log(xhr)
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

