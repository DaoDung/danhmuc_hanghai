<template>
  <v-flex xs12 style="width: 100%; background: #fff; position: relative;">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Sửa chữa tàu</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
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
      </v-layout>
    </v-flex>
    <v-from ref="formSuaChua" v-model="validFormSuaChua">
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
                
                v-model="detaiSuaChua.nameOfShip"
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
                
                v-model="detaiSuaChua.shipCaptain"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Đại lý:</v-flex>
            <v-flex xs9 class="ml-a">
              <v-text-field
                placeholder="Nhập đại lý"
                class="px-0 py-0 mx-0 my-0"
                v-model="detaiSuaChua.shipAgencyName"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Chủ tàu:</v-flex>
            <v-flex xs9 class="text-xs-left">
              <v-text-field
                placeholder="Nhập chủ tàu"
                class="px-0 py-0 mx-0 my-0"
                v-model="detaiSuaChua.shipOwnerName"
              ></v-text-field>
            </v-flex>
          </v-layout>
          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Người khai thác:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                placeholder="Nhập người khai thác"
                class="px-0 py-0 mx-0 my-0"
                v-model="detaiSuaChua.shipOperatorName"
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
              v-model="detaiSuaChua.flagStateOfShip"
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
                v-model="detaiSuaChua.callSign"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Số IMO:</v-flex>
            <v-flex xs7 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                placeholder="Nhập số IMO"
                v-model="detaiSuaChua.imoNumber"
              ></v-text-field>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Loại tàu:</v-flex>
            <v-flex xs7 class>
              <v-select
              clearable
              :items="shipTypeItems"
              item-text="shipTypeCode"
              item-value="shipTypeName"
              v-model="detaiSuaChua.shipTypeCode"
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
                v-model="detaiSuaChua.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
            </v-flex>
          </v-layout>

          <v-layout row wrap class="mb-2">
            <v-flex xs6>
              <v-flex xs12 class="ht" d-flex min>
                <v-flex xs6 class="pt-1">
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
                    v-model="detaiSuaChua.repairingFrom"
                  ></datetime-picker>
                </v-flex>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <v-flex xs12 class="ht" d-flex min>
                <v-flex xs5 class="pt-1 text-xs-center">
                  Thời gian đi
                  <span style="color: red;">(*)</span>:
                </v-flex>
                <v-flex xs6>
                  <datetime-picker
                    :first-day="1"
                    :show-dst="false"
                    :show-hours="true"
                    :show-minutes="true"
                    :show-seconds="false"
                    required
                    class="px-1 py-1 mx-0 my-0"
                    v-model="detaiSuaChua.repairingTo"
                  ></datetime-picker>
                </v-flex>
              </v-flex>
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
                  v-model="detaiSuaChua.shipYardOfficialNo"
                ></v-text-field>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs12 d-flex>
              <v-flex xs6>
                <v-flex xs12 class="ht" d-flex min>
                  <v-flex xs6>
                    Từ ngày
                    <span style="color: red;">(*)</span>:
                  </v-flex>
                  <v-flex xs6 class>
                    <datetime-picker
                      :first-day="1"
                      :show-dst="true"
                      :show-hours="false"
                      :show-minutes="false"
                      :show-seconds="false"
                      required
                      class="px-1 py-1 mx-0 my-0"
                      v-model="detaiSuaChua.testingFrom"
                    ></datetime-picker>
                  </v-flex>
                </v-flex>
              </v-flex>
              <v-flex xs6>
                <v-flex xs12 class="ht" d-flex min>
                  <v-flex xs5 class="ml-3 mt-1 text-xs-center">
                    Đến ngày
                    <span style="color: red;">(*)</span>:
                  </v-flex>
                  <v-flex xs6 class="ml-3">
                    <datetime-picker
                      :first-day="1"
                      :show-dst="false"
                      :show-hours="false"
                      :show-minutes="false"
                      :show-seconds="false"
                      required
                      class="px-1 py-1 mx-0 my-0"
                      v-model="detaiSuaChua.testingTo"
                    ></datetime-picker>
                  </v-flex>
                </v-flex>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row wrap >
            <v-flex xs3 class="pt-1">Đơn vị sửa chữa:</v-flex>
            <v-flex xs9 class>
              <v-text-field
                class="px-0 py-0 mx-0 my-0"
                placeholder="Nhập đơn vị sửa chữa"
                v-model="detaiSuaChua.shipYardCompanyName"
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
                v-model="detaiSuaChua.repairingReason"
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
    detaiSuaChua: {},
    validFormSuaChua: {},
    shipTypeItems: [],
    securityLevelItems: [],
    flagStateOfShipItems: []
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
      vm.detaiSuaChua = {}
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
    loadSuaChua: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailSuaChua', data).then(function (result) {
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themSuaChua: function () {
      var vm = this
      vm.detaiSuaChua['id'] = ''
      if (vm.$refs.formSuaChua.validate()) {
        vm.$store.dispatch('addSuaChua', vm.detaiSuaChua).then(function (result) {
          vm.detaiSuaChua = result
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
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detaiSuaChua = {}
    },
    luuSuaChua: function () {
      var vm = this
      if (vm.$refs.formSuaChua.validate()) {
        vm.$store.dispatch('editSuaChua', vm.detaiSuaChua).then(function (result) {
          vm.detaiSuaChua = result
        }).catch(function (xhr) {
          console.log(xhr)
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
