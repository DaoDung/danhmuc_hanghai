<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap>
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>KẾ HOẠCH PTTNĐ ĐẾN CẢNG</h3> 
        </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
          <v-flex xs12 style="display: flex; height: 21px; margin-top: 4px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themHoaTieuDanTau()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteHoaTieuDanTau()"
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
              @click="luuHoaTieuDanTau()"
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
    <v-form 
      ref="form" 
      :style="{'opacity': disabledForm  || loadingDetail ? '0.6' : 1, 'pointer-events': disabledForm || loadingDetail ? 'none' : 'auto'}"
      :disabled="disabledForm" 
      lazy-validation 
      class="v-formmm"
    >
      <v-layout row wrap class="formm_den" pa-2>
        <v-flex md5>
          <v-layout row wrap>
            <v-flex md4 class="pt-1">
              <label>Thời gian đến:</label>
            </v-flex>
            <v-flex md7 style="position: relative;">
              <date-time
              v-model="pttndTauDenCang['timeOfArrival']"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              class="input_last py 0 px 0"
              ></date-time>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Thời gian thủ tục đến:</label>
            </v-flex>
            <v-flex md7 style="position: relative;">
              <date-time
              v-model="pttndTauDenCang['chuaCO']"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              class="input_last py 0 px 0"
              ></date-time>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Đại lý:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              clearable
              placeholder="Nhập thời đại lý"
              v-model="pttndTauDenCang['arrivalShipAgencyCode']"
              class="py-0 my-0"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>SĐT Đại lý:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field clearable
              placeholder="Nhập SĐT" v-model="pttndTauDenCang['shipAgencyPhone']"  class="py-0 my-0"></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Số GP vào:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field clearable
              placeholder="Nhập số GP vào" v-model="pttndTauDenCang['certificateNo']"  class="py-0 my-0"></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Số thuyền viên:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['crewNumber']"
              clearable
              placeholder="Nhập số thuyền viên"
              class="py-0 my-0 input_last50"
              v-money="CrewNumber_format"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Số hành khách:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['passengerNumber']"
              clearable
              placeholder="Nhập số hành khách"
              class="py-0 my-0 input_last50"
              v-money="PassengerNumber_format"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Mục đích:</label>
            </v-flex>
            <v-flex md7>
              <v-select
              clearable
              :items="purposeItems"
              item-text="purposeName"
              item-value="purposeCode"
              v-model="pttndTauDenCang['purposeCode']"
              class="py-0 my-0"
              placeholder="Chọn mục đích"
              ></v-select>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Cảng rời cuối cùng:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['lastPortOfCallCode']"
              class="py-0 my-0"
              clearable
              placeholder="Nhập cảng rời cuối cùng"
              v-money="LastPortOfCallCode_format"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Hàng dỡ(trên GP):</label>
            </v-flex>
            <v-flex md7>
              <v-select
              clearable
              :items="cargoItems"
              item-text="goodsTypeNameVN"
              item-value="goodsTypeCode"
              v-model="pttndTauDenCang['HANGDO']"
              class="py-0 my-0"
              placeholder="Chọn hàng dỡ"
              ></v-select>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Khối lượng dỡ:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['kLUONG']"
              clearable
              placeholder="Nhập khối lượng"
              class="py-0 my-0 red--text"
              v-money="khoi_luong"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>TEU dỡ:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['numberTEU']"
              clearable
              placeholder="Nhập TEU dỡ"
              class="py-0 my-0 red--text"
              v-money="teu"
              ></v-text-field>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Bến cảng đến:</label>
            </v-flex>
            <v-flex md7>
              <v-select
              clearable
              :items="portHarbourItems"
              item-text="portHarbourNameVN"
              item-value="portHarbourCode"
              v-model="pttndTauDenCang['BENCANGDEN']"
              class="py-0 my-0"
              placeholder="Bến cảng đến"
              ></v-select>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Cầu cảng đến:</label>
            </v-flex>
            <v-flex md7>
              <v-select
              clearable
              :items="portWharfItems"
              item-text="portWharfNameVN"
              item-value="portWharfCode"
              v-model="pttndTauDenCang['CAUCANGDEN']"
              class="py-0 my-0"
              placeholder="Chọn cầu cảng đến"
              :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
              ></v-select>
            </v-flex>
            <v-flex md4 class="pt-1"></v-flex>
            <v-flex md7>
              <v-checkbox
              v-model="boxx"
              label="Cập mạn"
              value="boxx"
              style="font-size:1em;font-weight:none;"
              ></v-checkbox>
            </v-flex>
            <v-flex md4 class="pt-1">
              <label>Cập mạn vào tàu</label>
            </v-flex>
            <v-flex md7>
              <v-select
              v-if="boxx"
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0"
              :items="items"
              autocomplete
              clearable
              placeholder="Chọn tàu"
              ></v-select>
              <v-select
              v-else
              disabled
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0"
              :items="items"
              autocomplete
              placeholder="Chọn tàu"
              ></v-select>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex md6>
          <v-layout row wrap>
            <v-flex md3 class="pt-1">
              <label>Phương tiện:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['shipName']"
              clearable
              placeholder="Nhập phương tiện"
              class="py-0 my-0 red--text"
              v-money="NumberTEU_format"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Số ĐK:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              clearable
              placeholder="Nhập số ĐK"
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0 red--text input_last50"
              v-money="NumberTEU_format"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Loại PT:</label>
            </v-flex>
            <v-flex md4 class="pt-1">
              <v-select
              clearable
              :items="shipTypeItems"
              item-text="shipTypeCode"
              item-value="shipTypeName"
              v-model="pttndTauDenCang.shipTypeCode"
              class="py-0 my-0"
              placeholder="Chọn loại PT"
              autocomplete
              ></v-select>
            </v-flex>
            <v-flex md1 class="pt-1">
              <label>Cấp PT:</label>
            </v-flex>
            <v-flex md2>
              <v-select
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0"
              :items="items"
              autocomplete
              clearable
              placeholder="Chọn cấp PT"
              ></v-select>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Chủ PT:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0 red--text input_last50"
              v-money="format"
              clearable
              placeholder="Nhập chủ PT"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Địa chỉ:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['shipAgencyAddress']"
              class="py-0 my-0 red--text"
              v-money="format"
              clearable
              placeholder="Nhập địa chỉ"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Thuyền trưởng:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['shipCaptain']"
              clearable
              placeholder="Nhập thuyền trưởng"
              class="py-0 my-0 red--text"
              v-money="format"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Số bằng TT:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['pilotCertificateNo']"
              clearable
              placeholder="Nhập số bằng TT"
              class="py-0 my-0 red--text"
              v-money="format"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Hạng bằng TT:</label>
            </v-flex>
            <v-flex md7>
              <!-- <input type="text" class="input_last" v-model="hang_bang_tt"> -->
              <v-select
              v-model="pttndTauDenCang['nameOfMaster']"
              :items="hangbangtt"
              autocomplete
              clearable
              placeholder="Chọn hạng bằng"
              ></v-select>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Máy trưởng:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['pilotCertificateNo']"
              class="py-0 my-0 red--text"
              v-money="format"
              clearable
              placeholder="Nhập máy trưởng"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Số bằng MT:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['chuaCO']"
              class="py-0 my-0 red--text"
              v-money="format"
              clearable
              placeholder="Nhập số bằng MT"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Hạng bằng MT:</label>
            </v-flex>
            <v-flex md7>
              <v-select
              v-model="pttndTauDenCang['chiefOfEngineer']"
              class="py-0 my-0"
              :items="items"
              autocomplete
              clearable
              placeholder="Chọn hạng bằng"
              ></v-select>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Chiều dài:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['lOA']"
              class="py-0 my-0 red--text input_last50"
              v-money="dai"
              clearable
              placeholder="Nhập chiều dài"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Chiều rộng:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['breadth']"
              clearable
              placeholder="Nhập chiều rộng"
              class="py-0 my-0 red--text input_last50"
              v-money="rong"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>GRT:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['unitGRT']"
              class="py-0 my-0 red--text input_last50"
              v-money="format"
              clearable
              placeholder="Nhập GRT"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>DWT:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['dWT']"
              class="py-0 my-0 red--text input_last50"
              v-money="dwt"
              clearable
              placeholder="Nhập DWT"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Công suất máy:</label>
            </v-flex>
            <v-flex md7>
              <v-text-field
              v-model="pttndTauDenCang['power']"
              class="py-0 my-0 red--text input_last50"
              v-money="cong_xuat"
              clearable
              placeholder="Nhập công suất máy"
              ></v-text-field>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>Ngày HHĐK:</label>
            </v-flex>
            <v-flex md7 style="position: relative;">
              <date-time
              v-model="pttndTauDenCang['expiredDate']"
              :first-day="1"
              :show-dst="false"
              :show-hours="true"
              :show-minutes="true"
              :show-seconds="false"
              class="input_last"
              ></date-time>
            </v-flex>
            <v-flex md3 class="pt-1">
              <label>
                Đơn vị
                <span class="red--text">*</span>
              </label>
            </v-flex>
            <v-flex md7>
              <v-select
              clearable
              :items="representativeItems"
              item-text="repNameVN"
              item-value="repCode"
              v-model="pttndTauDenCang.representative"
              class="py-0 my-0"
              placeholder="Chọn đơn vị"
              ></v-select>
            </v-flex>
          </v-layout>
        </v-flex>
      </v-layout>
    </v-form>
  </div>
</template>
<script>
  import {VMoney} from 'v-money'
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
    components: {
      'date-time': DatetimePicker
    },
    directives: {money: VMoney},
    data () {
      return {
        loadingDetail: false,
        disabledForm: false,
        boxx: true,
        pttndTauDenCang: {},
        khoi_luong: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 0,
          masked: false
        },
        teu: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 0,
          masked: false
        },
        dai: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 2,
          masked: false
        },
        rong: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 2,
          masked: false
        },
        cong_xuat: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 0,
          masked: false
        },
        dwt: {
          decimal: '.',
          thousands: ',',
          prefix: '',
          suffix: '',
          precision: 0,
          masked: false
        }
      }
    },
    watch: {
      id: function (val) {
        var vm = this
        if (!val || val === '0') {
          vm.loadPortWharf()
          vm.loadPortHarbour()
          vm.loadPurpose()
          vm.loadCargo()
          vm.loadShipType()
          vm.loadDonVi()
        } else {
          vm.loadPTTND_DenCang()
        }
      }
    },
    created () {
      var vm = this
      vm.loadPortWharf()
      vm.loadPortHarbour()
      vm.loadPurpose()
      vm.loadCargo()
      vm.loadShipType()
      vm.loadDonVi()
      if (vm.id && vm.id !== '0') {
        vm.loadPTTND_DenCang()
      } else if (vm.documentName && vm.documentName !== '0') {
        vm.loadInitData()
      }
    },
    methods: {
      loadDonVi: function () {
        var vm = this
        let param = {
          categoryId: 'DM_REPRESENTATIVE'
        }
        if (vm.id && vm.id !== '0') {
          delete param['isDelete']
        } else {
          param['isDelete'] = 0
        }
        vm.$store.dispatch('loadDataDm', param).then(function (result) {
          vm.representativeItems = result
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
      loadPTTND_DenCang: function () {
        var vm = this
        let data = {
          'id': vm.id
        }
        vm.loadingDetail = true
        vm.$store.dispatch('loadDetail_PTTND_DenCang', data).then(function (result) {
          if (!result.hasOwnProperty('errorCode')) {
            vm.pttndTauDenCang = result
          }
          vm.loadingDetail = false
        }).catch(function (xhr) {
          console.log(xhr)
          vm.loadingDetail = false
        })
      },
      themPTTNDTauDenCang: function () {
        var vm = this
        vm.pttndTauDenCang['id'] = ''
        if (vm.$refs.formTauDenCang.validate()) {
          vm.$store.dispatch('addPTTNDTauDenCang', vm.pttndTauDenCang).then(function (result) {
            if (result.hasOwnProperty('errorCode')) {
              toastr.error('Thêm thất bại, vui lòng thử lại!')
              toastr.error(result.message)
            } else {
              vm.pttndTauDenCang = Object.assign(vm.pttndTauDenCang, vm.parseTimeTau(result))
              vm.changeIdUrl(result['vmaShipId'])
              toastr.success('Thêm thành công!')
            }
          }).catch(function (xhr) {
            console.log(xhr)
          })
        }
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
      deletePTTNDTauDenCang: function () {
        var vm = this
        let data = {
          id: vm.id
        }
        vm.$store.dispatch('deletePTTNDTauDenCang', data).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Xóa thất bại!')
            toastr.error(result.message)
          } else {
            vm.changeIdUrl('0')
            toastr.success('Xóa thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      },
      lamMoi: function () {
        var vm = this
        vm.pttndTauDenCang = {}
      },
      luuTauDenCang: function () {
        var vm = this
        if (vm.$refs.formTauDenCang.validate()) {
          vm.$store.dispatch('editPhuongTienThuyNoiDia', vm.pttndTauDenCang).then(function (result) {
            vm.pttndTauDenCang = result
            if (result.hasOwnProperty('errorCode')) {
              toastr.error('Lưu thất bại, vui lòng thử lại!')
              toastr.error(result.message)
            } else {
              vm.pttndTauDenCang = Object.assign(vm.pttndTauDenCang, vm.parseTimeTau(result))
              toastr.success('Lưu thành công!')
            }
          }).catch(function (xhr) {
            console.log(xhr)
          })
        }
      },
      parseTimeTau: function (modelPTTNDTauDenCang) {
        var vm = this
        if (!modelPTTNDTauDenCang) {
          console.log('valid tau den', modelPTTNDTauDenCang)
          return
        }
        modelPTTNDTauDenCang['timeOfArrival'] = vm.parseTimeStamp(modelPTTNDTauDenCang['timeOfArrival'])
        modelPTTNDTauDenCang['expiredDate'] = vm.parseTimeStamp(modelPTTNDTauDenCang['expiredDate'])
        return modelPTTNDTauDenCang
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
          path: '/quan-ly-tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.code
        })
      }
    }
  }
</script>
