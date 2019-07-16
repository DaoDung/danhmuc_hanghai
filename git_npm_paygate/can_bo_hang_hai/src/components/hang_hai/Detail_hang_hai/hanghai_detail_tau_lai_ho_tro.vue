<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Tàu lai hỗ trợ</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauLaiHoTro()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteTauLaiHoTro()"
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
              @click="luuTauLaiHoTro()"
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
              @click="luuTauDraftTauLaiHoTro()"
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
              @click="xacNhanTauLaiHoTro()"
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
              @click="duyetTauLaiHoTro()"
            >
              <v-icon size="17">done</v-icon>Duyệt
            </v-btn>

            <v-btn
              v-if="!disabledForm"
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themHoaTieu()"
            >
              <v-icon size="17" color="lavender">add</v-icon>Sử dụng hoa tiêu
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
        <v-expansion-panel class="my-0" v-if="warningTauLaiHoTro['show']">
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
                  <div v-html="warningTauLaiHoTro['message']" ></div>
                  <div v-html="warningTauLaiHoTro['message']"></div>
                </v-alert>
              </v-card-title>
            </v-card>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-layout>
    </v-flex>

    <v-form
      ref="formTauLaiHoTro"
      :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm"
      v-model="validFormTauLaiHoTro"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs6 class="pr-1">

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Thời gian bắt đầu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauLaiHoTro['tugDateFrom']"
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
              <v-flex xs3 class="pt-1 px-2"><label>Thời gian kết thúc:</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauLaiHoTro['tugDateTo']"
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
              <v-flex xs3 class="pt-1 px-2"><label>Đại lý <label style="color: red;">*</label>:</label> </v-flex>
              <v-flex xs9 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập đại lý" v-model="detailTauLaiHoTro['shipAgencyname']"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Từ bến:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                autocomplete
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauLaiHoTro['anchoringPortHarbourCode']"
                class="py-0 my-0"
                placeholder="Từ bến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Từ vị trí <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                autocomplete
                :items="portWharfItems"
                item-text="text"
                item-value="value"
                v-model="detailTauLaiHoTro['anchoringPortWharfCode']"
                class="py-0 my-0"
                placeholder="Chọn vị trí"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Lượt <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                autocomplete
                :items="noticeShipTypeItems"
                item-text="text"
                item-value="value"
                v-model="detailTauLaiHoTro['noticeShipType']"
                class="py-0 my-0"
                placeholder="Chọn lượt"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>
            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Thời gian đến <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauLaiHoTro['anchoringDateFrom']"
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
              <v-flex xs3 class="pt-1 px-2"><label>Thời gian rời:</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauLaiHoTro['anchoringDateTo']"
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

            <v-layout row wrap class="mt-2">
              <v-flex xs3 class="pt-1 px-2"><label>Tàu lai <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs6>
                <v-select
                clearable
                autocomplete
                :items="purposeItems"
                item-text="purposeName"
                item-value="purposeCode"
                v-model="detailTauLaiHoTro['purposeCode']"
                class="py-0 my-0"
                placeholder="Tàu lai"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
              <v-flex xs2>
                <v-chip label outline small color="red" @click="themTaulai()">Thêm tàu lai</v-chip>
              </v-flex>
            </v-layout>


            <!-- -------------------- -->
          </v-flex>

          <v-flex xs6 class="px-2">
            
            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập quốc tịch" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Quốc tịch:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                autocomplete
                placeholder="Nhập quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailTauLaiHoTro.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Hô hiệu:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailTauLaiHoTro.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Số IMO:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailTauLaiHoTro.imoNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Loại tàu:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                clearable
                autocomplete
                :items="shipTypeCodeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="detailTauLaiHoTro.shipTypeCode"
                class="py-0 my-0"
                placeholder="Chọn loại tàu"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Cấp độ an ninh:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                clearable
                autocomplete
                :items="securityLevelItems"
                item-text="text"
                item-value="value"
                v-model="detailTauLaiHoTro.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Chủ tàu:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailTauLaiHoTro.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Người khai thác:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailTauLaiHoTro.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>NT:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập NT" v-money="formatGT" v-model="detailTauLaiHoTro.nt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['nt']"></v-currency-field>
              </v-flex>

              <v-flex xs3 class="pt-1 px-2"><label>LOA (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauLaiHoTro.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>GT:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-money="formatGT" v-model="detailTauLaiHoTro.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['gt']"></v-currency-field>
              </v-flex>

              <v-flex xs3 class="pt-1 px-2"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập mớn nước thiết kế" v-money="formatClearanceHeight" v-model="detailTauLaiHoTro.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>DWT:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-money="formatGT" v-model="detailTauLaiHoTro.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['dwt']"></v-currency-field>
              </v-flex>

              <v-flex xs3 class="pt-1 px-2"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauLaiHoTro.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Breadth (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-money="formatClearanceHeight" v-model="detailTauLaiHoTro.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageBreadth" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['breadth']"></v-currency-field>
              </v-flex>

              <v-flex xs3 class="pt-1 px-2"><label>Công suất máy:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatGT" v-model="detailTauLaiHoTro.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauLaiHoTro['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Đơn vị:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                  clearable
                  autocomplete
                  :items="representativeItems"
                  item-text="repNameVN"
                  item-value="repCode"
                  v-model="detailTauLaiHoTro.representative"
                  class="py-0 my-0"
                  placeholder="Chọn đơn vị"
                ></v-select>
              </v-flex>
            </v-layout>
          </v-flex>

          <v-flex xs12 sm12 class="mt-3">
            <v-layout row wrap v-for="(item, index) in listTauLai" :key="'taulai' + index">
              <v-flex xs12 sm4>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="text-xs-center pt-1 pr-1">
                    <label>Tàu lai {{index + 1}} <label v-if="index === 0" style="color: red;">*</label>:</label>
                  </v-flex>
                  <v-flex xs12 sm8>
                    <v-select
                    clearable
                    autocomplete
                    :items="shipItems"
                    item-text="shipName"
                    item-value="shipCode"
                    v-model="listTauLai[index]['shipCode']"
                    class="py-0 my-0"
                    placeholder="Tàu lai"
                    ></v-select>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 sm5>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="text-xs-center pt-1 pr-1">
                    <label>Công ty tàu lai {{index + 1}}:</label>
                  </v-flex>
                  <v-flex xs12 sm8>
                    <v-select
                    clearable
                    autocomplete
                    :items="tugboatCompanyItems"
                    item-text="tugboatCompanyName"
                    item-value="tugboatCompanyCode"
                    v-model="listTauLai[index]['tugboatCompanyCode']"
                    class="py-0 my-0"
                    placeholder="Công ty tàu lai"
                    ></v-select>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 sm3>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="pt-1 text-xs-center pr-1">
                    <label>Công suất</label>
                  </v-flex>
                  <v-flex xs12 sm5>
                    <v-text-field class="py-0 my-0" placeholder="Nhập công suất" v-model="listTauLai[index]['power']"
                    ></v-text-field>
                  </v-flex>
                  <v-flex xs12 sm3>
                    <v-chip label outline small color="red" @click="deleteTaulai(item, index)"><i class="material-icons">delete_forever</i></v-chip>
                  </v-flex>
                </v-layout>
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
import {eventBus} from '../../../event-bus/eventBus.js'
import toastr from 'toastr'
toastr.options = {
  'closeButton': true,
  'timeOut': '3000'
}
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
    otherData: {},
    errorsMessage: {},
    warningTauLaiHoTro: {
      show: false,
      message: ''
    },
    disabledForm: false,
    listTauLai: [],
    formatClearanceHeight: {
      decimal: '.',
      thousands: ',',
      prefix: '',
      suffix: '',
      precision: 1,
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
    shipItems: [],
    tugboatCompanyItems: [],
    noticeShipTypeItems: [
      {
        text: 'Lượt vào',
        value: 1
      },
      {
        text: 'Lượt rời',
        value: 2
      },
      {
        text: 'Lượt quá cảnh',
        value: 3
      },
      {
        text: 'Lượt di chuyển',
        value: 4
      }
    ],
    homeValue: 350000,
    detailTauLaiHoTro: {
      expiredDate: ''
    },
    money: {
      decimal: ',',
      thousands: '.',
      prefix: '',
      suffix: '',
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
    validFormTauLaiHoTro: true,
    shipTypeItems: [],
    representativeItems: []
  }),
  watch: {
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
      if (vm.documentName && vm.documentName !== '0') {
        if (!vm.id || vm.id === '0') {
          vm.disabledForm = true
        }
      }
      if (oldVal === '0' && newVal !== '0' || oldVal !== '0' && newVal === 0) {
        vm.loadPortWharf()
        vm.loadShipAgency()
        vm.loadPortHarbour()
        vm.loadPurpose()
        vm.loadCargo()
        vm.loadShipType()
        vm.loadChanelList()
        vm.loadsecurityLevel()
        vm.loadDonVi()
      }
      if (newVal && newVal !== 0) {
        vm.loadTauLaiHoTro()
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
    vm.loadsecurityLevel()
    vm.loadDonVi()
    if (vm.id && vm.id !== '0') {
      vm.loadTauLaiHoTro()
    } else {
      vm.loadInitData()
    }
  },
  destroyed () {
    var vm = this
    eventBus.$off('otherDataTauLai', vm.initOtherData)
  },
  mounted () {
    var vm = this
    eventBus.$on('otherDataTauLai', vm.initOtherData)
    console.log('otherData+++++++++++++TAU LAI_________________', vm.otherData)
  },
  methods: {
    initOtherData: function (data) {
      var vm = this
      vm.otherData = data
    },
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
    loadTauLaiHoTro: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetaiTauLaiHoTro', data).then(function (result) {
        vm.detailTauLaiHoTro = result
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
        vm.detailTauLaiHoTro = Object.assign(vm.detailTauLaiHoTro, result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    luuTauDraftTauLaiHoTro: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuTauLaiHoTro()
      } else {
        vm.themTauLaiHoTro()
      }
    },
    duyetTauLaiHoTro: function () {
      var vm = this
      vm.detailTauLaiHoTro['state'] = 'ACTIVE'
      vm.luuTauLaiHoTro()
    },
    xacNhanTauLaiHoTro: function () {
      var vm = this
      vm.detailTauLaiHoTro['state'] = 'CONFIRM'
      vm.luuTauLaiHoTro()
    },
    parseTimeTauLaiHoTro: function (modelTauLaiHoTro) {
      var vm = this
      if (!modelTauLaiHoTro) {
        console.log('valid tau di chuyen', modelTauLaiHoTro)
        return
      }
      modelTauLaiHoTro['tugDateFrom'] = vm.parseTimeStamp(modelTauLaiHoTro['tugDateFrom'])
      modelTauLaiHoTro['tugDateTo'] = vm.parseTimeStamp(modelTauLaiHoTro['tugDateTo'])
      modelTauLaiHoTro['anchoringDateFrom'] = vm.parseTimeStamp(modelTauLaiHoTro['anchoringDateFrom'])
      modelTauLaiHoTro['anchoringDateTo'] = vm.parseTimeStamp(modelTauLaiHoTro['anchoringDateTo'])
      return modelTauLaiHoTro
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
    themTauLaiHoTro: function () {
      var vm = this
      vm.detailTauLaiHoTro['id'] = ''
      if (vm.$refs.formTauLaiHoTro.validate()) {
        vm.$store.dispatch('addTauLaiHoTro', vm.detailTauLaiHoTro).then(function (result) {
          vm.detailTauLaiHoTro = vm.parseTimeTauLaiHoTro(result)
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            toastr.success('Lưu thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deletePhuongTienThuyNoiDia: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deletePhuongTienThuyNoiDia', data).then(function (result) {
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailTauLaiHoTro = {}
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    luuTauLaiHoTro: function () {
      var vm = this
      if (vm.$refs.formTauLaiHoTro.validate()) {
        vm.$store.dispatch('editPhuongTienThuyNoiDia', vm.detailTauLaiHoTro).then(function (result) {
          vm.detailTauLaiHoTro = vm.parseTimeTauLaiHoTro(result)
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    themTaulai: function () {
      var vm = this
      vm.listTauLai.push({})
    },
    themHoaTieu: function () {
      var vm = this
      vm.$router.push({
        path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/DanhSachHoaTieuDanTau/0'
      })
    },
    deleteTaulai: function (item, index) {
      var vm = this
      vm.listTauLai.splice(index, 1)
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

<!-- <style>
   .input-group--focused .v-text-field__slot{
      border: 1px solid rgba(0,0,0,.40);
      border-bottom: none;
  }  
.flex.xs1{
  flex-basis:15%;
  max-width: none;
}
.ht{
  height:56px;
}
.flex.xs1 p{
  color: #0d2434;
}
.v-input--selection-controls{
  margin:0px;
  padding:0px;
}
.theme--light .v-label {
  margin-top: 10px;
  color: #000000;
  font-family: unset;
}
.v-input{
  width: 90%;
  font-family: Arial;
  /* font-weight: bold; */
  font-size: 15px;
}
.text p{
  font-family: Arial;
  font-weight: bold;
  font-size: 15px;
}
.v-overflow-btn .v-input__control{
  height: 32px;
}
.v-overflow-btn .v-input__slot{
  border: 1px solid rgba(0,0,0,.40);
      border-bottom: none;
}
.v-overflow-btn .v-input__append-inner{
  height: 65%;
}
</style> -->
