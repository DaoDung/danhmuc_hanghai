<template>
  <div style="background: #fff;" class="">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Tàu biển</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauBien()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteTauBien()"
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
              @click="luuTauBien()"
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
      :style="{'opacity': disabledForm || loadingDetail ? '0.6' : 1, 'pointer-events': disabledForm || loadingDetail ? 'none' : 'auto'}"
      :disabled="disabledForm || loadingDetail"
      ref="formTauBien"
      v-model="validFormTauBien"
      lazy-validation
    >
      <v-flex xs12 class="mt-2">
        <v-layout row wrap>
          <v-flex xs6>
          <v-flex xs12  min>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Tên tàu <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field v-model="detailTauBien.shipName" class="py-0 my-0" placeholder="Nhập tên tàu" required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Quốc tịch <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-select
                  autocomplete
                  placeholder="Nhập quốc tịch"
                  :items="flagStateOfShipItems"
                  item-text="stateName"
                  item-value="stateCode"
                  v-model="detailTauBien.flagStateOfShip"
                  class="py-0 my-0"
                  required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                  clearable
                 ></v-select>
                </v-flex>
              </v-layout>              
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Thuyền trưởng <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien.nameOfMaster" class="py-0 my-0" placeholder="Nhập tên thuyền trưởng"  
                 ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Chủ tàu <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-select
                  autocomplete
                  placeholder="Chọn chủ tàu"
                  :items="shipOwnerItems"
                  item-text="companyName"
                  item-value="shipOwnerCode"
                  v-model="detailTauBien.shipOwnerCode"
                  class="py-0 my-0"
                  required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                 ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Người khai thác <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-select
                  autocomplete
                  :items="shipOperatorItems"
                  item-text="companyName"
                  item-value="shipOwnerCode"
                  v-model="detailTauBien.shipOperatorCode"
                  class="py-0 my-0"
                  placeholder="Chọn người khai thác"
                  required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                 ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">NT <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['nt']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['nt']" class="py-0 my-0"
                 ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">GT <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['gt']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['gt']" class="py-0 my-0" placeholder="Tổng dung tích"
                 ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">DWT <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['dwt']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['dwt']" class="py-0 my-0" placeholder="Lượng chiếm nước toàn tải"></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Công suất máy <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['power']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['power']" placeholder="Nhập công suất máy" class="py-0 my-0"></v-text-field> -->
                </v-flex>
                <v-flex xs2 class="pl-1">
                  <v-select
                    style="max-width: 70%;"
                    autocomplete
                    disabled
                    class="my-0 py-0"
                    v-model="detailTauBien.unitPower"
                    :items="unitPowerItems"
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Breadth(m) <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['breadth']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['breadth']" placeholder="Nhập Breadth" class="py-0 my-0"  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">LOA (m) <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['loa']"></v-currency-field>
                  <!-- <v-text-field required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model.lazy="detailTauBien['loa']" placeholder="Loa" class="py-0 my-0"  ></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
            <v-layout row wrap>
              <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Mớn nước t.kế(m) <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
              <v-flex xs2 class="">
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['maxDraft']"></v-currency-field>
                <!-- <v-text-field class="py-0 my-0" v-model.lazy="detailTauBien['maxDraft']" placeholder="Nhập mớn nước thiết kế"
               ></v-text-field> -->
              </v-flex>
            </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Chiều cao t.không(m) <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs2 class="">
                  <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" required :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauBien['clearanceHeight']"></v-currency-field>
                  <!-- <v-text-field class="py-0 my-0" placeholder="Nhập chiều cao tĩnh không" v-model.lazy="detailTauBien['clearanceHeight']"></v-text-field> -->
                </v-flex>
              </v-layout>
            </v-flex>
        </v-flex>
        <v-flex xs6 class="pl-2">
            <v-flex xs12> 
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Hô hiệu <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field class="py-0 my-0" required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" placeholder="Nhập hô hiệu" v-model="detailTauBien.callSign"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Số IMO <label class="pt-1" style="color: red;">(*)</label>:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field   class="py-0 my-0" required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" placeholder="Nhập số IMO" v-model="detailTauBien.imoNumber"
                 ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Loại tàu (MCQG) <label class="pt-1" style="color: red;">(*)</label><label class="pt-1"></label>:</label></v-flex>
                <v-flex xs8 class="">
                 <v-select
                 autocomplete
                 placeholder="Chọn loại tàu"
                 :items="shipTypeItems"
                 item-text="shipTypeNameVN"
                 item-value="shipTypeCode"
                 v-model="detailTauBien.shipTypeCode"
                 class="py-0 my-0"
                 required
                  :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
               </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Loại và công dụng<label class="pt-1"></label>:</label></v-flex>
                <v-flex xs8 class="">
                 <v-select
                 autocomplete
                 placeholder="Chọn loại và công dụng"
                 :items="shipTypeVmaItems"
                 item-text="shipTypeNameVN"
                 item-value="shipTypeCode"
                 v-model="detailTauBien.vmaShipTypeCode"
                 class="py-0 my-0"
                 required
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
               </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Cấp tàu<label class="pt-1"></label>:</label></v-flex>
                <v-flex xs8 class="">
                 <v-select
                 disabled
                 autocomplete
                 placeholder="Chọn cấp tàu"
                 :items="levelBoardItems"
                 v-model="detailTauBien.levelBoard"
                 class="py-0 my-0"
                ></v-select>
               </v-flex>
              </v-layout>
            </v-flex>
             <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Cảng đăng ký:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field   class="py-0 my-0" placeholder="Nhập cảng đăng ký" v-model="detailTauBien.registryPortCode"
                 ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Năm đóng tàu:</label></v-flex>
                <v-flex xs2 class="">
                  <v-select
                    class="py-0 my-0"
                    placeholder="Chọn năm đóng tàu"
                    :items="yearItems"
                    v-model="detailTauBien.productionYear"
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Nước đóng tàu:</label></v-flex>
                <v-flex xs8 class="">
                  <v-select
                    autocomplete
                    placeholder="Nhập nước đóng tàu"
                    :items="flagStateOfShipItems"
                    item-text="stateName"
                    item-value="stateCode"
                    v-model="detailTauBien.productionCountry"
                    class="py-0 my-0"
                    required
                    :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                    clearable
                  ></v-select>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1"><label class="pt-1">Ghi chú cảnh báo:</label></v-flex>
                <v-flex xs8 class="">
                  <v-text-field multi-line  class="py-0 my-0" v-model="detailTauBien.remarks"></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12 class="">
              <v-layout row wrap>
                <v-flex xs3 class="text-xs-right pr-2 pt-1">
                </v-flex>
                <v-flex xs8 sm9>
                  <v-checkbox  hide-details v-model="detailTauBien.isDelete" style="height:15px;" label="Không sử dụng" class=""></v-checkbox>
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
import {VMoney} from 'v-money'
import toastr from 'toastr'
toastr.options = {
  'closeButton': true,
  'timeOut': '3000'
}
export default {
  name: 'my-form',
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
  data: () => {
    return {
      disabledForm: false,
      loadingDetail: false,
      errorsMessage: {
        // messageNT: '',
        // messageGT: '',
        // messageDWT: '',
        // messagePower: '',
        // messageBreadth: '',
        // messageLOA: '',
        // messageMaxDraft: '',
        // messageClearanceHeight: ''
      },
      unitPowerItems: ['KW', 'HP', 'CV'],
      yearItems: [
        2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980],
      levelBoardItems: [],
      detailTauBien: {
        unitPower: 'HP',
        productionYear: 2019
      },
      enabled: false,
      flagStateOfShipItems: [],
      shipOwnerItems: [],
      shipAgencyItems: [],
      shipTypeItems: [],
      shipTypeVmaItems: [],
      shipOperatorItems: [],
      validFormTauBien: true,
      formatClearanceHeight: {
        decimal: '.',
        thousands: ',',
        prefix: '',
        suffix: '',
        precision: 1,
        masked: false
      },
      formatYear: {
        decimal: '',
        thousands: '',
        prefix: '',
        suffix: '',
        precision: 0,
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
      formatLOA: {
        decimal: '.',
        thousands: ',',
        prefix: '',
        suffix: '',
        precision: 2,
        masked: false
      }
    }
  },
  watch: {
    detailTauBien: {
      handler: function (val) {
        var vm = this
        vm.validNumberInput()
      },
      deep: true
    },
    notification (notification) {
      this.ownNotification = notification
    },
    id (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadFlagStateOfShip()
        vm.loadShipOwner()
        vm.loadShipOperator()
        vm.loadShipType()
        vm.loadShipOwner()
        vm.loadVmaShipType()
        vm.loadDetailTauBien()
      } else {
        vm.loadDetailTauBien()
      }
    }
  },
  // watch: {
  //   id: function (newVal, oldVal) {
  //     var vm = this
  //     if (oldVal === '0' && newVal !== '0' || oldVal !== '0' && newVal === 0) {
  //       vm.loadFlagStateOfShip()
  //       vm.loadShipOwner()
  //       vm.loadShipOperator()
  //       vm.loadShipType()
  //       vm.loadShipOwner()
  //       vm.loadVmaShipType()
  //     }
  //     if (newVal && newVal !== 0) {
  //       vm.loadDetailTauBien()
  //     }
  //   }
  // },
  created () {
    var vm = this
    if (vm.id && vm.id !== '0') {
      vm.loadDetailTauBien()
    } else {
      // vm.detailTauBien = {}
    }
    vm.loadFlagStateOfShip()
    vm.loadShipOwner()
    vm.loadShipOperator()
    vm.loadShipType()
    vm.loadShipOwner()
    vm.loadVmaShipType()
  },
  computed: {
  },
  methods: {
    loadShipOwner: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_OWNER',
        isShipOwner: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.shipOwnerItems = result
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
        categoryId: 'DM_SHIP_TYPE',
        applyShip: 1
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
    loadVmaShipType: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_TYPE',
        applyShip: 1
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.shipTypeVmaItems = result
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
    loadDetailTauBien: function () {
      var vm = this
      console.log('load detail tau bien ++++++++++++++')
      let data = {
        'id': vm.id
      }
      vm.loadingDetail = true
      vm.$store.dispatch('loadDetailTauBien', data).then(function (result) {
        console.log('result++++++++++++++', result)
        if (!result.hasOwnProperty('errorCode')) {
          vm.detailTauBien = result
        }
        vm.loadingDetail = false
        console.log('vm.detailTauBien++++++++++++++', vm.detailTauBien)
      }).catch(function (xhr) {
        console.log(xhr)
        vm.loadingDetail = false
      })
    },
    validNumberInput: function () {
      var vm = this
      var validNT = true
      var validGT = true
      var validDWT = true
      var validPower = true
      var validBreadth = true
      var validLOA = true
      var validMaxDraft = true
      var validClearanceHeight = true
      if (!vm.detailTauBien['nt'] || vm.detailTauBien['nt'] === '0') {
        vm.errorsMessage['messageNT'] = 'Bắt buộc'
        validNT = false
      } else {
        console.log('false')
        delete vm.errorsMessage['messageNT']
        validNT = true
      }
      if (!vm.detailTauBien['gt'] || vm.detailTauBien['gt'] === '0') {
        vm.errorsMessage['messageGT'] = 'Bắt buộc'
        validGT = false
      } else {
        delete vm.errorsMessage['messageGT']
        validGT = true
      }
      if (!vm.detailTauBien['dwt'] || vm.detailTauBien['dwt'] === '0') {
        vm.errorsMessage['messageDWT'] = 'Bắt buộc'
        validDWT = false
      } else {
        delete vm.errorsMessage['messageDWT']
        validDWT = true
      }
      if (!vm.detailTauBien['power'] || vm.detailTauBien['power'] === '0') {
        vm.errorsMessage['messagePower'] = 'Bắt buộc'
        validPower = false
      } else {
        delete vm.errorsMessage['messagePower']
        validPower = true
      }
      if (!vm.detailTauBien['breadth'] || vm.detailTauBien['breadth'] === '0') {
        vm.errorsMessage['messageBreadth'] = 'Bắt buộc'
        validBreadth = false
      } else {
        delete vm.errorsMessage['messageBreadth']
        validBreadth = true
      }
      if (!vm.detailTauBien['loa'] || vm.detailTauBien['loa'] === '0') {
        vm.errorsMessage['messageLOA'] = 'Bắt buộc'
        validLOA = false
      } else {
        delete vm.errorsMessage['messageLOA']
        validLOA = true
      }
      if (!vm.detailTauBien['maxDraft'] || vm.detailTauBien['maxDraft'] === '0') {
        vm.errorsMessage['messageMaxDraft'] = 'Bắt buộc'
        validMaxDraft = false
      } else {
        delete vm.errorsMessage['messageMaxDraft']
        validMaxDraft = true
      }
      if (!vm.detailTauBien['clearanceHeight'] || vm.detailTauBien['clearanceHeight'] === '0') {
        vm.errorsMessage['messageClearanceHeight'] = 'Bắt buộc'
        validClearanceHeight = false
      } else {
        delete vm.errorsMessage['messageClearanceHeight']
        validClearanceHeight = true
      }
      console.log('vm.errorsMessage++++++++', vm.errorsMessage)
      if (validNT && validGT && validDWT && validPower && validBreadth && validLOA && validMaxDraft && validClearanceHeight) {
        console.log('valid TRUE!!!!!')
        return true
      } else {
        return false
      }
    },
    themTauBien: function () {
      var vm = this
      vm.detailTauBien['shipBoat'] = 'SHIP'
      vm.detailTauBien['id'] = ''
      var validNumberInput = vm.validNumberInput()
      if (vm.$refs.formTauBien.validate() && validNumberInput) {
        vm.$store.dispatch('addTauBien', vm.detailTauBien).then(function (result) {
          vm.detailTauBien = result
          if (result.id) {
            vm.changeIdUrl(result.id)
          }
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            toastr.success('Thêm tàu biển thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
          toastr.error('Thêm thất bại, vui lòng thử lại!')
        })
      }
    },
    deleteTauBien: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteTauBien', data).then(function (result) {
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Xóa thất bại, vui lòng thử lại!')
          toastr.error(result.message)
        } else {
          toastr.success('Xóa tàu biển thành công!')
        }
        vm.changeIdUrl('0')
      }).catch(function (xhr) {
        console.log(xhr)
        toastr.error('Xóa thất bại, vui lòng thử lại!')
      })
    },
    changePrice: function () {
      this.price = {
        c: 123456
      }
    },
    consoleValue: function () {
      console.log('price+++++++++', this.price)
    },
    lamMoi: function () {
      var vm = this
      vm.detailTauBien = {}
    },
    luuTauBien: function () {
      var vm = this
      var validNumberInput = vm.validNumberInput()
      if (vm.$refs.formTauBien.validate() && validNumberInput) {
        vm.$store.dispatch('editTauBien', vm.detailTauBien).then(function (result) {
          vm.detailTauBien = result
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            toastr.success('Lưu thành công!')
          }
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
