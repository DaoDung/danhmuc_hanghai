<template>
  <div style="width: 100%; background: #fff; position: relative;">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>KẾ HOẠCH PTTNĐ RỜI CẢNG</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themPTTNDTauRoiCang()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deletePTTNDTauRoiCang()"
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
              @click="luuPTTNDTauRoiCang()"
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
    <v-form ref="form" class="v-formmm">
        <v-layout row wrap class="formm_den" pa-2>
          <v-flex md5>
            <v-layout row wrap>
                  <v-flex md4 xs12 class="pt-1">
                    <label>Thời gian đi:</label>
                  </v-flex>
                  <v-flex md7 xs12 sm7 style="position: relative;">
                   <date-time
                   v-model="pttndRoiCang['timeOfDeparture']"
                   :first-day="1"
                   :show-dst="false"
                   :show-hours="true"
                   :show-minutes="true"
                   :show-seconds="false"
                   class="input_last"
                   ></date-time>
                 </v-flex>
                 <v-flex md4 xs12 sm4 class="pt-1">
                  <label>Thời gian thủ tục đi:</label>
                </v-flex>
                <v-flex md7 xs12 style="position: relative;">
                 <date-time
                 v-model="pttndRoiCang['timeOfApproval']"
                 :first-day="1"
                 :show-dst="false"
                 :show-hours="true"
                 :show-minutes="true"
                 :show-seconds="false"
                 class="input_last"
                 ></date-time>
               </v-flex>
               <v-flex md4 xs12 class="pt-1">
                <label>Đại lý đi:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập thời đại lý"
                v-model="pttndRoiCang['chuaCO']" 
                class="py-0 my-0"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>SĐT Đại lý:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập SĐT đại lý"
                v-model="pttndRoiCang['shipAgencyPhone']" 
                class="py-0 my-0"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Số GP rời:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập GP rời"
                v-model="pttndRoiCang['numberRoi']" 
                
                class="py-0 my-0"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Số thuyền viên:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập số thuyền viên"
                v-model="pttndRoiCang['crewNumber']"
                class="py-0 my-0 input_last50"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Số hành khách:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập số hành khách"
                v-model="pttndRoiCang['passengerNumber']" 
                class="py-0 my-0 input_last50"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Mục đích:</label>
              </v-flex>
              <v-flex md7 xs12>
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
              <v-flex md4 xs12 class="pt-1">
                <label>Cảng đến kế tiếp:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập cảng kế tiếp"
                v-model="pttndRoiCang['portGoingToCode']" 
                class="py-0 my-0"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Hàng xếp(trên GP):</label>
              </v-flex>
              <v-flex md7 xs12>
                <!-- <input type="text" class="input_last" v-model="hang_do"> -->
                <v-select
                clearable
                :items="cargoItems"
                item-text="goodsTypeNameVN"
                item-value="goodsTypeCode"
                v-model="pttndRoiCang['HANGXEP']"
                class="py-0 my-0"
                placeholder="Chọn hàng xếp"
                ></v-select>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>Khối lượng xếp:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập thời đại lý"
                v-model="pttndRoiCang['numberTNE']" 
                class="py-0 my-0 red--text"
                v-money="khoi_luong"
                ></v-text-field>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <label>TEU xếp:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập TEU xếp"
                v-model="pttndRoiCang['numberTEU']" 
                class="py-0 my-0 red--text"
                v-money="teu"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <v-flex md6 xs12>
            <v-layout row wrap>
              <v-flex md3 xs12 class="pt-1">
                <label>Phương tiện:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập phương tiện"
                v-model="pttndRoiCang['shipName']" 
                class="py-0 my-0 red--text"
                ></v-text-field>
              </v-flex>
              <v-flex md3 xs12 class="pt-1">
                <label>Số ĐK:</label>
              </v-flex>
              <v-flex md7 xs12>
                 <v-text-field
                clearable
                placeholder="Nhập số ĐK"
                v-model="pttndRoiCang['registryNumber']" 
                class="py-0 my-0 red--text input_last50"
                ></v-text-field>
              </v-flex>
              <v-flex md3 xs12 class="pt-1">
                <label>Loại PT:</label>
              </v-flex>
              <v-flex md4 xs12 class="pt-1">
                <v-select
                clearable
                :items="shipTypeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="pttndRoiCang.shipTypeCode"
                class="py-0 my-0"
                placeholder="Chọn loại PT"
                autocomplete
                ></v-select>
             </v-flex>
             <v-flex md1 xs12 class="pt-1">
              <label>Cấp PT:</label>
            </v-flex>
            <v-flex md2 xs12>
              <v-select
              v-model="pttndRoiCang['chuaCO']"
              class="py-0 my-0"
              :items="items"
              placeholder="Chọn cấp PT"
              autocomplete
              clearable
              ></v-select>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Chủ PT:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập chủ PT"
              v-model="pttndRoiCang['shipOwnersName']" 
              class="py-0 my-0 red--text input_last50"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Địa chỉ:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập địa chỉ"
              v-model="pttndRoiCang['shipAgencyAddress']" 
              class="py-0 my-0 red--text "
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Thuyền trưởng:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập thuyền trưởng"
              v-model="pttndRoiCang['shipCaptain']" 
              class="py-0 my-0 red--text "
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Số bằng TT:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập số bằng TT"
              v-model="pttndRoiCang['pilotCertificateNo']" 
              class="py-0 my-0 red--text"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Hạng bằng TT:</label>
            </v-flex>
            <v-flex md7 xs12>
              <!-- <input type="text" class="input_last" v-model="hang_bang_tt"> -->
              <v-select
              v-model="pttndRoiCang['nameOfMaster']" 
              class="py-0 my-0"
              placeholder="Chọn hạng bằng TT"
              :items="hangbangtt"
              autocomplete
              ></v-select>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Máy trưởng:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập máy trưởng"
              v-model="pttndRoiCang['chiefOfEngineer']" 
              class="py-0 my-0 red--text"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Số bằng MT:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập số bằng MT"
              v-model="pttndRoiCang['pilotCertificateNo']" 
              class="py-0 my-0 red--text"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Hạng bằng MT:</label>
            </v-flex>
            <v-flex md7 xs12>
              <v-select
              placeholder="Chọn số bằng MT"
              v-model="pttndRoiCang['chiefOfEngineer']" 
              class="py-0 my-0"
              :items="items"
              autocomplete
              ></v-select>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Chiều dài:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập chiều dài"
              v-model="pttndRoiCang['loa']" 
              class="py-0 my-0 red--text input_last50"
              v-money="dai"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Chiều rộng:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập chiều rộng"
              v-model="pttndRoiCang['breadth']" 
              class="py-0 my-0 red--text input_last50"
              v-money="rong"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>GRT:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập GRT"
              v-model="pttndRoiCang['unitGRT']" 
              class="py-0 my-0 red--text input_last50"
              v-money="format"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>DWT:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập DWT"
              v-model="pttndRoiCang['dwt']"              
              class="py-0 my-0 red--text input_last50"
              v-money="dwt"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Công suất máy:</label>
            </v-flex>
            <v-flex md7 xs12>
               <v-text-field
                clearable
                placeholder="Nhập công suất máy"
              v-model="pttndRoiCang['power']" 
              class="py-0 my-0 red--text input_last50"
              v-money="cong_xuat"
              ></v-text-field>
            </v-flex>
            <v-flex md3 xs12 class="pt-1">
              <label>Ngày HHĐK:</label>
            </v-flex>
            <v-flex md7 xs12 style="position: relative;">
             <date-time
             v-model="pttndRoiCang['expiredDate']" 
             :first-day="1"
             :show-dst="false"
             :show-hours="true"
             :show-minutes="true"
             :show-seconds="false"
             class="input_last"
             ></date-time>
           </v-flex>
           <v-flex md3 xs12 class="pt-1">
            <label>Đơn vị <span class="red--text">*</span></label>
          </v-flex>
          <v-flex md7 xs12>
            <v-select
              clearable
              :items="representativeItems"
              item-text="repNameVN"
              item-value="repCode"
              v-model="pttndRoiCang.representative"
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
        boxx: true,
        pttndRoiCang: {},
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
          vm.loadPTTND_RoiCang()
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
        vm.loadPTTND_RoiCang()
      } else {
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
      loadPTTND_RoiCang: function () {
        var vm = this
        let data = {
          'id': vm.id
        }
        vm.$store.dispatch('loadDetail_PTTND_RoiCang', data).then(function (result) {
          vm.pttndRoiCang = result
        }).catch(function (xhr) {
          console.log(xhr)
        })
      },
      themPTTNDTauRoiCang: function () {
        var vm = this
        vm.detailTauDenCang['id'] = ''
        if (vm.$refs.formTauDenCang.validate()) {
          vm.$store.dispatch('addPTTNDTauRoiCang', vm.detailTauDenCang).then(function (result) {
            vm.pttndRoiCang = result
          }).catch(function (xhr) {
            console.log(xhr)
          })
        }
      },
      deletePTTNDTauRoiCang: function () {
        var vm = this
        let data = {
          id: vm.id
        }
        vm.$store.dispatch('deletePTTNDTauRoiCang', data).then(function (result) {
          vm.pttndRoiCang = {}
        }).catch(function (xhr) {
          console.log(xhr)
        })
      },
      lamMoi: function () {
        var vm = this
        vm.detailTauDenCang = {}
      },
      luuPTTNDTauRoiCang: function () {
        var vm = this
        if (vm.$refs.formTauDenCang.validate()) {
          vm.$store.dispatch('editPhuongTienThuyNoiDia', vm.detailTauDenCang).then(function (result) {
            vm.detailTauDenCang = result
          }).catch(function (xhr) {
            console.log(xhr)
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

