<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Kế hoạch tàu đến cảng</h3> </v-flex></v-flex>
        
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauDenCang()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteTauDenCang()"
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
              flat
              :disabled="!id || id === '0'"
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="luuTauDenCang()"
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
              @click="luuTauDen()"
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
              @click="xacNhanTauDen()"
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
              @click="duyetTauDen()"
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

        <v-expansion-panel class="my-0" v-if="warningTauDen['show']">
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
                  <div v-html="warningTauDen['message']" ></div>
                  <div v-html="warningTauDen['message']"></div>
                </v-alert>
              </v-card-title>
            </v-card>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-layout>
    </v-flex>
    <v-form
      :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm"
      ref="formTauDenCang"
      v-model="validFormTauDenCang"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs4 class="pr-1">

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thời gian đến PS :</label></v-flex>
              <v-flex xs7>
                <datetime-picker
                v-model="detailTauDenCang['timeOfArrival']"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-1 py-1 mx-0 my-0"
                ></datetime-picker>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Đại lý đến:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập đại lý đến"  v-model="detailTauDenCang['arrivalShipAgency']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>SĐT đại lý:</label></v-flex>
              <v-flex xs7>
                <v-text-field class="py-0 my-0"  placeholder="Nhập sđt"  v-model="detailTauDenCang['telNo']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cảng rời cuối cùng:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                autocomplete
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauDenCang['lastPortOfCallCode']"
                class="py-0 my-0"
                placeholder="Chọn cảng rời cuối"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tên quốc gia:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" placeholder="Nhập tên quốc gia" v-model="detailTauDenCang['portGoingToStateName']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Bến cảng đến:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                autocomplete
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauDenCang['arrivalPortCode']"
                class="py-0 my-0"
                placeholder="Chọn bến cảng đến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cầu cảng đến:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                autocomplete
                :items="portWharfItems"
                item-text="portWharfNameVN"
                item-value="portWharfCode"
                v-model="detailTauDenCang['portWharfCode']"
                class="py-0 my-0"
                placeholder="Chọn cầu cảng đến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cập mạn vào tàu:</label></v-flex>
              <v-flex xs7>
                <v-text-field clearable class="py-0 my-0" placeholder=""  v-model="detailTauDenCang['capMan']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mục đích:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" placeholder="Nhập mục đích" v-model="detailTauDenCang.purposeCode"
                ></v-text-field>
              </v-flex>
            </v-layout>
            
            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Hàng hóa:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                autocomplete
                :items="cargoItems"
                item-text="goodsTypeNameVN"
                item-value="goodsTypeCode"
                v-model="detailTauDenCang.cargoCode"
                class="py-0 my-0"
                placeholder="Chọn hàng hóa"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số hành khách :</label></v-flex>
              <v-flex xs3>
                <v-text-field class="py-0 my-0"  placeholder="Nhập số hành khách" v-money="formatGT" v-model="detailTauDenCang.passengerNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số thuyền viên:</label></v-flex>
              <v-flex  xs3 class="">
                <v-text-field class="py-0 my-0"  placeholder="Nhập số thuyền viên" v-money="formatGT" v-model="detailTauDenCang.crewNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số người khác:</label></v-flex>
              <v-flex xs3>
                <v-text-field class="py-0 my-0"  placeholder="Nhập số thuyền viên" v-money="formatGT" v-model="detailTauDenCang.crewNumberOther"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thuyền trưởng:</label></v-flex>
              <v-flex xs7>
                <v-text-field class="py-0 my-0"  placeholder="Nhập thuyền trưởng"  v-model="detailTauDenCang.shipCaptain"
                ></v-text-field>
              </v-flex>
            </v-layout>

          </v-flex>

          <v-flex xs4 class="pr-2">

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thời gian cập bến :</label></v-flex>
              <v-flex xs7>
                <datetime-picker
                v-model="detailTauDenCang['timeOfPORTArrival']"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-1 py-1 mx-0 my-0"
                ></datetime-picker>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thời gian thủ tục đến :</label></v-flex>
              <v-flex xs7>
                <datetime-picker
                v-model="detailTauDenCang['timeOfApproval']"
                :first-day="1"
                :show-dst="false"
                :show-hours="true"
                :show-minutes="true"
                :show-seconds="false"
                class="px-1 py-1 mx-0 my-0"
                ></datetime-picker>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mớn nước mũi (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước mũi" v-money="formatClearanceHeight" v-model="detailTauDenCang['shownDraftxF']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['shownDraftxF']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mớn nước lái (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước lái" v-money="formatClearanceHeight" v-model="detailTauDenCang['shownDraftxA']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['shownDraftxA']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tuyến luồng:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                autocomplete
                placeholder="Chọn tuyến luồng"
                :items="chanelListItems"
                item-text="name"
                item-value="code"
                v-model="detailTauDenCang.chanelCodeList"
                class="py-0 my-0"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số giờ neo không tính phí:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" placeholder="Nhập số giờ neo" v-model="detailTauDenCang['anchoringDuration']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"></v-flex>
              <v-flex  xs7 class="mb-3">
                <v-checkbox clearable v-model="detailTauDenCang['kdua']" hide-details style="height:15px;" label="Không đưa vào danh sách neo đậu" class=""></v-checkbox>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số LĐĐ:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" placeholder="Nhập số LĐĐ" v-model="detailTauDenCang.tugBoatName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Ghi chú tàu đến:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" multi-line rows="2" v-model="detailTauDenCang['remarks']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Loại thủ tục đến:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" multi-line rows="2" v-model="detailTauDenCang['loaiThuTuc']"
                ></v-text-field>
                <!-- <v-select
                  clearable
                  autocomplete
                  placeholder="Chọn loại thủ tục"
                  :items="shipTypeItems"
                  item-text="shipTypeNameVN"
                  item-value="shipTypeCode"
                  v-model="detailTauDenCang.shipTypeCode"
                  class="py-0 my-0"
                ></v-select> -->
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"></v-flex>
              <v-flex  xs7 class="">
                <v-checkbox clearable v-model="detailTauDenCang.hasTugBoat" hide-details style="height:15px;" label="Tàu chưa vào cảng" class=""></v-checkbox>
              </v-flex>
            </v-layout>
          </v-flex>

          <v-flex xs4 class="px-2">
            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập tên tàu" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Quốc tịch:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                autocomplete
                placeholder="Nhập quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailTauDenCang.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Hô hiệu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailTauDenCang.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số IMO:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailTauDenCang.imoNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Loại tàu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                autocomplete
                :items="shipTypeItems"
                item-text="shipTypeNameVN"
                item-value="shipTypeCode"
                v-model="detailTauDenCang.shipTypeCode"
                class="py-0 my-0"
                placeholder="Chọn loại tàu"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cấp độ an ninh:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                autocomplete
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                v-model="detailTauDenCang.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Chủ tàu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailTauDenCang.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Người khai thác:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailTauDenCang.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>NT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <input class="input-number-hh" placeholder="Nhập NT" type="text" v-money="formatGT" v-model="detailTauDenCang.nt" /> -->
                <!-- <v-text-field  placeholder="Nhập NT" v-model="detailTauDenCang.nt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['nt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>GT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-model="detailTauDenCang.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['gt']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>DWT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-model="detailTauDenCang.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['dwt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Breadth (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-model="detailTauDenCang.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['breadth']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>LOA (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập LOA" v-model="detailTauDenCang.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập mớn nước thiết kế" v-model="detailTauDenCang.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Chiều cao t.không" v-model="detailTauDenCang.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Công suất máy:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Công suất" v-model="detailTauDenCang.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDenCang['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Đơn vị:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                  clearable
                  autocomplete
                  :items="representativeItems"
                  item-text="repNameVN"
                  item-value="repCode"
                  v-model="detailTauDenCang.representative"
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
    errorsMessage: {},
    warningTauDen: {
      show: true,
      message: {
      }
    },
    disabledForm: false,
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
    lastPortOfCallCodeItems: [],
    arrivalPortCodeItems: [],
    portWharfItems: [],
    cargoItems: [],
    chanelListItems: [],
    shipTypeCodeItems: [],
    securityLevelItems: [],
    portHarbourItems: [],
    representativeItems: [],
    homeValue: 350000,
    detailTauDenCang: {
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
    validFormTauDenCang: true,
    shipTypeItems: [],
    flagStateOfShipItems: [],
    vmaShip: {},
    tempDocument: {},
    vmaShipOwner: {}
  }),
  watch: {
    // notification (notification) {
    //   this.detailTauDenCang = notification
    // }
    documentName (val) {
      var vm = this
      if (val && val !== '0') {
        vm.disabledForm = true
      }
    },
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
        vm.loadDonVi()
      } else {
        vm.loadTauDenCang()
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
    if (vm.documentName && vm.documentName !== '0') {
      if (!vm.id || vm.id === '0') {
        vm.disabledForm = true
      }
    }
    vm.loadShipType()
    vm.loadPortWharf()
    vm.loadShipAgency()
    vm.loadPortHarbour()
    vm.loadPurpose()
    vm.loadCargo()
    vm.loadChanelList()
    vm.loadsecurityLevel()
    vm.loadFlagStateOfShip()
    vm.loadDonVi()
    if (vm.id && vm.id !== '0') {
      vm.loadTauDenCang()
    } else {
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
    loadTauDenCang: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailTauDenCang', data).then(function (result) {
        vm.detailTauDenCang = vm.parseTimeTauDenCang(result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadInitData: function () {
      var vm = this
      let data = {
        'id': vm.id,
        'documentName': vm.documentName,
        'documentYear': vm.documentYear,
        'type': vm.type
      }
      vm.$store.dispatch('loadDetailHoSo', data).then(function (result) {
        vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, {
          callSign: result['callSign'],
          shipName: result['shipName'],
          flagStateOfShip: result['stateCode'],
          imoNumber: result['imo'],
          shipTypeCode: result['shipTypeCode'],
          nt: result['nt'],
          dwt: result['dwt']
        })
        vm.tempDocument = result
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadInitVmaShip: function () {
      var vm = this
      let data = {
        'id': vm.id,
        'imoNumber': vm.detailTauDenCang['imoNumber'],
        'callSign': vm.detailTauDenCang['callSign']
      }
      vm.$store.dispatch('loadDanhSachTauBien', data).then(function (result) {
        if (result.total) {
          var dataItem = result.data[0]
          vm.vmaShip = dataItem
          vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, {
            breadth: dataItem['breadth'],
            clearanceHeight: dataItem['clearanceHeight'],
            power: dataItem['power'],
            loa: dataItem['loa'],
            maxDraft: dataItem['maxDraft']
          })
        } else {
          vm.warningTauDen.message['1'] = '- Chưa có thông tin tàu!'
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadInitVmaShipOwner: function (data) {
      var vm = this
      let param = {
        categoryId: 'DM_VMA_SHIP_OWNER'
      }
      for (var key in data) {
        param[key] = data[key]
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        if (result.total) {
          var dataItem = result.data[0]
          if (param.hasOwnProperty('isShipOwner')) {
            vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, {
              shipOwnersName: dataItem['shipOwnersName']
            })
          } else {
            vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, {
              shipOperatorName: dataItem['shipOperatorName']
            })
          }
          vm.vmaShipOwner = dataItem
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    loadInitTemp_noticeShipMessage: function () {
      var vm = this
      let data = {
        'id': vm.id,
        'documentName': vm.documentName,
        'documentYear': vm.documentYear
      }
      vm.$store.dispatch('loadLenhDieuDongEXT', data).then(function (result) {
        if (result) {
          var dataItem = result.detail
          vm.vmaShip = dataItem
          vm.detailTauDenCang = Object.assign(vm.detailTauDenCang, {
            shownDraftxF: dataItem['shownDraftxF'],
            shownDraftxA: dataItem['shownDraftxA'],
            numberShiftingOrder: dataItem['numberShiftingOrder'],
            numberShiftingOrder: dataItem['numberShiftingOrder'],
            numberShiftingOrder: dataItem['numberShiftingOrder'],
          })
        }
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    luuTauDen: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuTauDenCang()
      } else {
        vm.themTauDenCang()
      }
    },
    duyetTauDen: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'ACTIVE'
      vm.luuTauDenCang()
    },
    xacNhanTauDen: function () {
      var vm = this
      vm.detailTauDenCang['state'] = 'CONFIRM'
      vm.luuTauDenCang()
    },
    themTauDenCang: function () {
      var vm = this
      vm.detailTauDenCang['id'] = ''
      vm.detailTauDenCang['noticeShipType'] = 1
      vm.detailTauDenCang['shipPosition'] = 1
      vm.detailTauDenCang['shipBoat'] = 'SHIP'
      vm.detailTauDenCang['markedAsArrival'] = 1
      if (vm.$refs.formTauDenCang.validate()) {
        vm.$store.dispatch('addVmaItinerarySchedule', vm.detailTauDenCang).then(function (result) {
          vm.detailTauDenCang = vm.parseTimeTauDenCang(result)
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.changeIdUrl(result['vmaItineraryScheduleId'])
            toastr.success('Thêm thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
          toastr.error('Thêm thất bại, vui lòng thử lại!')
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
          toastr.error('Xóa thất bại!')
          toastr.error(result.message)
        } else {
          toastr.success('Xóa thành công!')
        }
        vm.changeIdUrl('0')
      }).catch(function (xhr) {
        console.log(xhr)
        toastr.error('Xóa thất bại, vui lòng thử lại!')
      })
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    lamMoi: function () {
      var vm = this
      vm.detailTauDenCang = {}
    },
    luuTauDenCang: function () {
      var vm = this
      if (vm.$refs.formTauDenCang.validate()) {
        vm.$store.dispatch('updateVmaItinerarySchedule', vm.detailTauDenCang).then(function (result) {
          vm.detailTauDenCang = vm.parseTimeTauDenCang(result)
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
    parseTimeTauDenCang: function (modelTauDen) {
      var vm = this
      if (!modelTauDen) {
        console.log('valid tau den', modelTauDen)
        return
      }
      modelTauDen['timeOfArrival'] = vm.parseTimeStamp(modelTauDen['timeOfArrival'])
      modelTauDen['timeOfPORTArrival'] = vm.parseTimeStamp(modelTauDen['timeOfPORTArrival'])
      modelTauDen['timeOfApproval'] = vm.parseTimeStamp(modelTauDen['timeOfApproval'])
      return modelTauDen
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

