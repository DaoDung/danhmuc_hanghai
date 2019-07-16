<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Hoa tiêu dẫn tàu</h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
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
              @click="luuDraftHoaTieuDanTau()"
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
              @click="xacNhanHoaTieuDanTau()"
            >
              <v-icon size="20">confirmation_number</v-icon>Xác nhận
            </v-btn>
            
            <v-btn
              v-if="!disabledForm"
              flat
              :disabled="!id || id === '0'"
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="duyetHoaTieuDanTau()"
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

        <v-expansion-panel class="my-0" v-if="warningHoaTieuDanTau['show']">
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
                  <div v-html="warningHoaTieuDanTau['message']" ></div>
                  <div v-html="warningHoaTieuDanTau['message']"></div>
                </v-alert>
              </v-card-title>
            </v-card>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-layout>
    </v-flex>
    <v-form
      ref="formHoaTieuDanTau"
      :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm"
      v-model="validFormHoaTieuDanTau"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs6 class="pr-1">

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian lên tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailHoaTieuDanTau['pilotDateFrom']"
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
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian rời tàu:</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailHoaTieuDanTau['pilotDateTo']"
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
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Đại lý <label style="color: red;">*</label>:</label> </v-flex>
              <v-flex  xs8 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập đại lý" v-model="detailHoaTieuDanTau['shipAgencyname']"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-text-field>
              </v-flex>
            </v-layout>
            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Bến cảng lên tàu:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailHoaTieuDanTau['anchoringPortHarbourCode']"
                class="py-0 my-0"
                placeholder="Từ bến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Vị trí lên tàu<label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portWharfItems"
                item-text="portWharfNameVN"
                item-value="portWharfCode"
                v-model="detailHoaTieuDanTau['anchoringPortWharfCode']"
                class="py-0 my-0"
                placeholder="Chọn vị trí"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Bến cảng rời tàu:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailHoaTieuDanTau['shiftingPortHarbourCode']"
                class="py-0 my-0"
                placeholder="Từ bến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Lượt <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <v-select
                clearable
                autocomplete
                :items="noticeShipTypeItems"
                item-text="text"
                item-value="value"
                v-model="detailHoaTieuDanTau['noticeShipType']"
                class="py-0 my-0"
                placeholder="Chọn lượt"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian đến <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailHoaTieuDanTau['pilotDateFrom']"
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
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Thời gian rời:</label></v-flex>
              <v-flex xs8>
                <datetime-picker
                v-model="detailHoaTieuDanTau['pilotDateTo']"
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
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Hoa tiêu <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs6>
                <v-select
                clearable
                autocomplete
                :items="pilotItems"
                item-text="pilotName"
                item-value="pilotCode"
                v-model="detailHoaTieuDanTau['pilotCode']"
                class="py-0 my-0"
                placeholder="Hoa tiêu"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
              <v-flex xs2>
                <v-chip label outline small color="red" @click="themHoaTieu()">Thêm hoa tiêu</v-chip>
              </v-flex>
            </v-layout>


            <!-- -------------------- -->
          </v-flex>

          <v-flex xs6 class="px-2">
            
            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập quốc tịch" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Quốc tịch:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                autocomplete
                placeholder="Nhập quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailHoaTieuDanTau.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
                <!-- <v-text-field clearable  placeholder="Nhập quốc tịch"  v-model="detailHoaTieuDanTau.flagStateOfShip"
                ></v-text-field> -->
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Hô hiệu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailHoaTieuDanTau.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Số IMO:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailHoaTieuDanTau.iMONumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Loại tàu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                clearable
                autocomplete
                :items="shipTypeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="detailHoaTieuDanTau.shipTypeCode"
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
                item-text="securiyLevelName"
                item-value="securityLevelCode"
                v-model="detailHoaTieuDanTau.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Chủ tàu:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailHoaTieuDanTau.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Người khai thác:</label></v-flex>
              <v-flex  xs8 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailHoaTieuDanTau.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>NT:</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập NT" v-money="formatGT" v-model="detailHoaTieuDanTau.nt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['nt']"></v-currency-field>
              </v-flex>

              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>LOA (m):</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailHoaTieuDanTau.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>GT:</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-money="formatGT" v-model="detailHoaTieuDanTau.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['gt']"></v-currency-field>
              </v-flex>

              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex  xs2 class="">
               <!--  <v-text-field  placeholder="Nhập mớn nước thiết kế" v-money="formatClearanceHeight" v-model="detailHoaTieuDanTau.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>DWT:</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-money="formatGT" v-model="detailHoaTieuDanTau.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['dwt']"></v-currency-field>
              </v-flex>

              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailHoaTieuDanTau.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Breadth (m):</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-money="formatClearanceHeight" v-model="detailHoaTieuDanTau.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['breadth']"></v-currency-field>
              </v-flex>

              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Công suất máy:</label></v-flex>
              <v-flex  xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatGT" v-model="detailHoaTieuDanTau.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailHoaTieuDanTau['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs4 class="pt-1 text-xs-center pr-1"><label>Đơn vị:</label></v-flex>
              <v-flex  xs8 class="">
                <v-select
                  clearable
                  autocomplete
                  :items="representativeItems"
                  item-text="repNameVN"
                  item-value="repCode"
                  v-model="detailHoaTieuDanTau.representative"
                  class="py-0 my-0"
                  placeholder="Chọn đơn vị"
                ></v-select>
              </v-flex>
            </v-layout>
          </v-flex>

          <v-flex xs12 sm12 class="mt-3">
            <v-layout row wrap v-for="(item, index) in listHoaTieu" :key="'hoatieu' + index">
              <v-flex xs12 sm4>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="text-xs-center pt-1 pr-1">
                    <label>Hoa tiêu {{index + 1}} <label v-if="index === 0" style="color: red;">*</label>:</label>
                  </v-flex>
                  <v-flex xs12 sm8>
                    <v-select
                    clearable
                    autocomplete
                    :items="pilotItems"
                    item-text="pilotName"
                    item-value="pilotCode"
                    v-model="listHoaTieu[index]['pilotCode']"
                    class="py-0 my-0"
                    placeholder="Hoa tiêu"
                    ></v-select>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 sm4>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="text-xs-center pt-1 pr-1">
                    <label>Hạng hoa tiêu {{index + 1}}:</label>
                  </v-flex>
                  <v-flex xs12 sm8>
                    <v-select
                    clearable
                    autocomplete
                    :items="pilotCategoryItems"
                    item-text="pilotCategoryName"
                    item-value="pilotCategoryCode"
                    v-model="listHoaTieu[index]['pilotCategoryCode']"
                    class="py-0 my-0"
                    placeholder="Hạng hoa tiêu"
                    ></v-select>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12 sm4>
                <v-layout row wrap>
                  <v-flex xs12 sm4 class="pt-1 text-xs-center pr-1">
                    <label>Cty hoa tiêu</label>
                  </v-flex>
                  <v-flex xs12 sm5>
                    <v-text-field class="py-0 my-0" placeholder="Nhập công suất" v-model="listHoaTieu[index]['pilotCompanyName']"
                    ></v-text-field>
                  </v-flex>
                  <v-flex xs12 sm3>
                    <v-chip label outline small color="red" @click="deleteHoaTieu(item, index)"><i class="material-icons">delete_forever</i></v-chip>
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
    disabledForm: false,
    warningHoaTieuDanTau: {
      show: false,
      message: ''
    },
    listHoaTieu: [],
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
    portHarbourItems: [],
    portWharfItems: [],
    securityLevelItems: [],
    shipItems: [],
    tugboatCompanyItems: [],
    pilotItems: [],
    pilotCategoryItems: [],
    representativeItems: [],
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
    detailHoaTieuDanTau: {
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
    validFormHoaTieuDanTau: true,
    shipTypeItems: [],
    flagStateOfShipItems: [],
    chanelListItems: []
  }),
  watch: {
    id: function (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadPortWharf()
        vm.loadShipAgency()
        vm.loadPortHarbour()
        vm.loadPurpose()
        vm.loadCargo()
        vm.loadShipType()
        vm.loadChanelList()
        vm.loadDonVi()
        vm.loadPilotCategory()
        vm.loadPilots()
        vm.loadsecurityLevel()
        vm.loadFlagStateOfShip()
      } else {
        vm.loadHoaTieuDanTau()
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
    // notification (notification) {
    //   this.detailHoaTieuDanTau = notification
    // }
  },
  computed: {
    // principal: function () {
    //   return this.homeValue - this.downpayment
    // }
  },
  created () {
    var vm = this
    if (vm.documentName && vm.documentName !== '0') {
      if (!vm.id || vm.id === '0') {
        vm.disabledForm = true
      }
    }
    vm.loadPortWharf()
    vm.loadShipAgency()
    vm.loadPortHarbour()
    vm.loadPurpose()
    vm.loadCargo()
    vm.loadShipType()
    vm.loadChanelList()
    vm.loadDonVi()
    vm.loadPilotCategory()
    vm.loadPilots()
    vm.loadsecurityLevel()
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadHoaTieuDanTau()
    } else {
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
    loadPilots: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_PILOT'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.pilotItems = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadPilotCategory: function () {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_PILOT_CATEGORY'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.pilotCategoryItems = result
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
    loadHoaTieuDanTau: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailHoaTieuDanTau', data).then(function (result) {
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
        vm.detailHoaTieuDanTau = Object.assign(vm.detailHoaTieuDanTau, result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    luuDraftHoaTieuDanTau: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuHoaTieuDanTau()
      } else {
        vm.themHoaTieuDanTau()
      }
    },
    duyetHoaTieuDanTau: function () {
      var vm = this
      vm.detailHoaTieuDanTau['state'] = 'ACTIVE'
      vm.luuHoaTieuDanTau()
    },
    xacNhanHoaTieuDanTau: function () {
      var vm = this
      vm.detailHoaTieuDanTau['state'] = 'CONFIRM'
      vm.luuHoaTieuDanTau()
    },
    themHoaTieuDanTau: function () {
      var vm = this
      vm.detailHoaTieuDanTau['id'] = ''
      vm.detailHoaTieuDanTau['listHoaTieu'] = JSON.stringify(vm.listHoaTieu)
      if (vm.$refs.formHoaTieuDanTau.validate()) {
        vm.$store.dispatch('addHoaTieuDanTau', vm.detailHoaTieuDanTau).then(function (result) {
          vm.detailHoaTieuDanTau = result
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            toastr.success('Thêm phương tiện thành công!')
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
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Xóa thất bại, vui lòng thử lại!')
          toastr.error(result.message)
        } else {
          toastr.success('Xóa phương tiện thành công!')
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailHoaTieuDanTau = {}
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    luuHoaTieuDanTau: function () {
      var vm = this
      if (vm.$refs.formHoaTieuDanTau.validate()) {
        vm.detailHoaTieuDanTau['listHoaTieu'] = JSON.stringify(vm.listHoaTieu)
        vm.$store.dispatch('editPhuongTienThuyNoiDia', vm.detailHoaTieuDanTau).then(function (result) {
          vm.detailHoaTieuDanTau = result
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Lưu thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            toastr.success('Lưu phương tiện thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    themHoaTieu: function () {
      var vm = this
      vm.listHoaTieu.push({})
    },
    deleteHoaTieu: function (item, index) {
      var vm = this
      vm.listHoaTieu.splice(index, 1)
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

