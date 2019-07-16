<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Tàu neo đậu</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauNeodau()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteTauNeoDau()"
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
              @click="luuTauNeoDau()"
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
              flat
              v-if="!disabledForm"
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="luuTauDraftTauNeoDau()"
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
              @click="xacNhanTauNeoDau()"
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
              @click="duyetTauNeoDau()"
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
        <v-expansion-panel class="my-0" v-if="warningTauNeoDau['show']">
          <v-expansion-panel-content v-bind:value="false">
            <div slot="header" style=""><span class="text-bold primary--text pl-2"> Cảnh báo </span></div>
            <v-card>
              <v-card-title class="pt-0 px-0 adv__search__container">
                <v-alert
                  style="width: 100%;"
                  :value="true"
                  color="warning"
                  icon="priority_high"
                  outline
                  >
                  <div v-html="warningTauNeoDau['message']" ></div>
                  <div v-html="warningTauNeoDau['message']"></div>
                </v-alert>
              </v-card-title>
            </v-card>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-layout>
    </v-flex>
    <v-form
      ref="formTauNeoDau"
      :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm"
      v-model="validFormTauNeoDau"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs6 class="pr-1">

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian bắt đầu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailTauNeoDau['anchoringDateFrom']"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-1 py-1 mx-0 my-0"
                name="aa"
                ></datetime-picker>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian kết thúc:</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailTauNeoDau['anchoringDateTo']"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-1 py-1 mx-0 my-0"
                name="cc"
                ></datetime-picker>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Giờ neo:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập giờ neo" v-money="formatGT" v-model="detailTauNeoDau['anchoringDuration']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Đại lý <label style="color: red;">*</label>:</label> </v-flex>
              <v-flex  xs8 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập đại lý"  v-model="detailTauNeoDau['shipAgencyname']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Mục đích <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau['purposeCode']"
                class="py-0 my-0"
                placeholder="Mục đích"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <!-- --------------- -->
            
            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Từ bến:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau['portHarbourCode']"
                class="py-0 my-0"
                placeholder="Từ bến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Vị trí neo<label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portWharfItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau['anchoringPortWharfCode']"
                class="py-0 my-0"
                placeholder="Chọn vị trí neo"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Cảng rời cuối cùng<label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau['lastPortOfCallCode']"
                class="py-0 my-0"
                placeholder="Chọn cảng rời cuối cùng"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Vào cầu cảng <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portWharfItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau['portWharfCode']"
                class="py-0 my-0"
                placeholder="Vào cầu cảng"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <!-- -------------------- -->
          </v-flex>

          <v-flex xs6 class="px-2">
            
            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập quốc tịch" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Quốc tịch:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                placeholder="Nhập quốc tịch"
                autocomplete
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailTauNeoDau.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Hô hiệu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailTauNeoDau.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Số IMO:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailTauNeoDau.imoNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Loại tàu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                clearable
                autocomplete
                :items="shipTypeCodeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="detailTauNeoDau.shipTypeCode"
                class="py-0 my-0"
                placeholder="Chọn loại tàu"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Cấp độ an ninh:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                clearable
                autocomplete
                :items="securityLevelItems"
                item-text="text"
                item-value="value"
                v-model="detailTauNeoDau.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Chủ tàu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailTauNeoDau.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Người khai thác:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailTauNeoDau.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>NT:</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập NT" v-money="formatGT" v-model="detailTauNeoDau.nt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['nt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>GT:</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-money="formatGT" v-model="detailTauNeoDau.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['gt']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>DWT:</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-money="formatGT" v-model="detailTauNeoDau.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['dwt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Breadth (m):</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-money="formatClearanceHeight" v-model="detailTauNeoDau.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['breadth']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>LOA (m):</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauNeoDau.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập mớn nước thiết kế" v-money="formatClearanceHeight" v-model="detailTauNeoDau.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauNeoDau.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Công suất máy:</label></v-flex>
              <v-flex  xs8 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatGT" v-model="detailTauNeoDau.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauNeoDau['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Đơn vị:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                  clearable
                  autocomplete
                  :items="hangBangMtItems"
                  item-text="text"
                  item-value="value"
                  v-model="detailTauNeoDau.hangBangMT"
                  class="py-0 my-0"
                  placeholder="Chọn đơn vị"
                ></v-select>
              </v-flex>
            </v-layout>
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
export default {
  name: 'my-form',
  components: {
    'datetime-picker': DatetimePicker
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
    errorsMessage: {},
    disabledForm: false,
    warningTauNeoDau: {
      show: true,
      message: ''
    },
    formatClearanceHeight: {
      decimal: '.',
      thousands: ',',
      prefix: '',
      suffix: '',
      precision: 2,
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
    portItems: [],
    portWharfItems: [],
    shipTypeCodeItems: [],
    securityLevelItems: [],
    homeValue: 350000,
    detailTauNeoDau: {
      expiredDate: ''
    },
    money: {
      decimal: ',',
      thousands: '.',
      prefix: 'R$ ',
      suffix: ' #',
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
    validFormTauNeoDau: true,
    shipTypeItems: [],
    flagStateOfShipItems: []
  }),
  watch: {
    // notification (notification) {
    //   this.detailTauNeoDau = notification
    // }
    documentName (val) {
      var vm = this
      if (val && val !== '0') {
        if (!vm.id || vm.id === '0') {
          vm.disabledForm = true
        }
      }
    },
    id: function (newVal, oldVal) {
      var vm = this
      if (oldVal === '0' && newVal !== '0' || oldVal !== '0' && newVal === 0) {
        vm.loadPortWharf()
        vm.loadShipAgency()
        vm.loadPortHarbour()
        vm.loadPurpose()
        vm.loadCargo()
        vm.loadShipType()
        vm.loadChanelList()
      }
      if (newVal && newVal !== 0) {
        vm.loadTauNeoDau()
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
    vm.loadPortWharf()
    vm.loadShipAgency()
    vm.loadPortHarbour()
    vm.loadPurpose()
    vm.loadCargo()
    vm.loadShipType()
    vm.loadChanelList()
    if (vm.documentName && vm.documentName !== '0') {
      if (!vm.id || vm.id === '0') {
        vm.disabledForm = true
      }
    }
    if (vm.id && vm.id !== '0') {
      vm.loadTauNeoDau()
    } else {
      vm.loadInitData()
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
    loadInitData: function () {
      var vm = this
      let data = {
        'id': vm.id,
        'documentName': vm.documentName
      }
      vm.$store.dispatch('loadVmaShip', data).then(function (result) {
        vm.detailTauNeoDau = Object.assign(vm.detailTauNeoDau, result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    luuTauDraftTauNeoDau: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuTauNeoDau()
      } else {
        vm.themTauNeodau()
      }
    },
    duyetTauNeoDau: function () {
      var vm = this
      vm.detailTauNeoDau['state'] = 'ACTIVE'
      vm.luuTauNeoDau()
    },
    xacNhanTauNeoDau: function () {
      var vm = this
      vm.detailTauNeoDau['state'] = 'CONFIRM'
      vm.luuTauNeoDau()
    },
    loadTauNeoDau: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadTauNeoDau', data).then(function (result) {
        vm.detailTauNeoDau = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themTauNeodau: function () {
      var vm = this
      vm.detailTauNeoDau['id'] = ''
      if (vm.$refs.formTauNeoDau.validate()) {
        vm.$store.dispatch('addTauNeoDau', vm.detailTauNeoDau).then(function (result) {
          vm.detailTauNeoDau = result
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deleteTauNeoDau: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteTauNeoDau', data).then(function (result) {
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    lamMoi: function () {
      var vm = this
      vm.detailTauNeoDau = {}
    },
    luuTauNeoDau: function () {
      var vm = this
      if (vm.$refs.formTauNeoDau.validate()) {
        vm.$store.dispatch('editTauNeoDau', vm.detailTauNeoDau).then(function (result) {
          vm.detailTauNeoDau = result
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    quayLai: function () {
      var vm = this
      if (vm.documentName && vm.documentName !== '0') {
        if (vm.code === 'DanhSachTauDenCang' || vm.code === 'DanhSachTauDiChuyen') {
          window.history.back()
        } else {
          vm.$router.push({
            path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/' + vm.code
          })
        }
      } else {
        vm.$router.push({
          path: '/quan-ly-tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.code
        })
      }
    }
  }

}
</script>

