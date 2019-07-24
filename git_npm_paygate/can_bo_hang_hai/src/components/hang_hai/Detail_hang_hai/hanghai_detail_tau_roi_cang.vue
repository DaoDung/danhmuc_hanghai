<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12><h3>Kế hoạch tàu rời cảng <span @click="showWarning = !showWarning" style="cursor: pointer; color: orange;" v-if="warningTauRoi['show']" color="warning">(Cảnh báo)</span></h3> </v-flex></v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauRoiCang()"
            >
              <v-icon size="17" color="lavender">file_copy</v-icon>Thêm mới
            </v-btn>
            
            <v-btn
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="deleteTauRoiCang()"
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
              @click="luuTauRoiCang()"
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
              @click="luuTauRoi()"
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
              @click="xacNhanTauRoi()"
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
              @click="duyetTauRoi()"
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

        <v-card v-if="showWarning" style="width: 100%;">
          <v-card-title class="pt-0 py-0 px-0 adv__search__container">
            <v-alert
              class="my-0"
              style="width: 100%;"
              :value="true"
              color="warning"
              icon="priority_high"
              outline
              >
              <div v-html="item" v-for="(item, index) in warningTauRoi['message']"></div>
            </v-alert>
          </v-card-title>
        </v-card>
      </v-layout>
    </v-flex>
    <v-progress-linear v-if="loadingDetail" :indeterminate="true"></v-progress-linear>
    <v-form
      ref="formTauRoiCang"
      :style="{'opacity': disabledForm || loadingDetail ? '0.6' : 1, 'pointer-events': disabledForm || loadingDetail ? 'none' : 'auto'}"
      :disabled="disabledForm || loadingDetail"
      v-model="validFormTauRoiCang"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs4 class="pr-1">

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thời gian đi:</label></v-flex>
              <v-flex xs7>
                <datetime-picker
                v-model="detailTauRoiCang['timeOfDeparture']"
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
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Đại lý đi:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập đại lý đi"  v-model="detailTauRoiCang['departureShipAgency']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>SĐT đại lý:</label></v-flex>
              <v-flex xs7>
                <v-text-field class="py-0 my-0"  placeholder="Nhập sđt"  v-model="detailTauRoiCang['telNo']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cảng đến kế tiếp:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauRoiCang['nextMaritimePortCode']"
                class="py-0 my-0"
                placeholder="Chọn cảng kế tiếp"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tên quốc gia:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" placeholder="Nhập tên quốc gia" v-model="detailTauRoiCang['portGoingToStateName']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Bến cảng rời:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauRoiCang['shiftingPortHarbourCode']"
                class="py-0 my-0"
                placeholder="Chọn bến cảng rời"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Cầu cảng rời:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                :items="portWharfItems"
                item-text="portWharfNameVN"
                item-value="portWharfCode"
                v-model="detailTauRoiCang['shiftingPortWharfCode']"
                class="py-0 my-0"
                placeholder="Chọn cầu cảng rời"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mục đích:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0"  placeholder="Nhập mục đích"  v-model="detailTauRoiCang.purposeCode"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Hàng hóa:</label></v-flex>
              <v-flex xs7>
                <v-select
                clearable
                :items="cargoItems"
                item-text="goodsTypeNameVN"
                item-value="goodsTypeCode"
                v-model="detailTauRoiCang.cargoCode"
                class="py-0 my-0"
                placeholder="Chọn hàng hóa"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số tấn đi :</label></v-flex>
              <v-flex xs3>
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số hành khách" v-money="formatGT" v-model="detailTauRoiCang.numberTNE"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNumberTNE" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['numberTNE']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số hành khách  :</label></v-flex>
              <v-flex xs3>
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số hành khách" v-money="formatGT" v-model="detailTauRoiCang.passengerNumber"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePassengerNumber" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['passengerNumber']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số thuyền viên:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số thuyền viên" v-money="formatGT" v-model="detailTauRoiCang.crewNumber"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageCrewNumber" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['crewNumber']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số người khác:</label></v-flex>
              <v-flex xs3>
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số thuyền viên" v-money="formatGT" v-model="detailTauRoiCang.crewNumberOther"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageCrewNumberOther" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['crewNumberOther']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thuyền trưởng:</label></v-flex>
              <v-flex xs7>
                <v-text-field class="py-0 my-0"  placeholder="Nhập thuyền trưởng"  v-model="detailTauRoiCang.shipCaptain"
                ></v-text-field>
              </v-flex>
            </v-layout>

          </v-flex>

          <v-flex xs4 class="pr-2">

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Thời gian thủ tục đi :</label></v-flex>
              <v-flex xs7>
                <datetime-picker
                v-model="detailTauRoiCang['timeOfPORTArrival']"
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
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước mũi" v-money="formatClearanceHeight" v-model="detailTauRoiCang['shownDraftxF']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['nt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mớn nước lái (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước lái" v-money="formatClearanceHeight" v-model="detailTauRoiCang['shownDraftxA']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['nt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tuyến luồng:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                placeholder="Chọn tuyến luồng"
                :items="chanelListItems"
                item-text="name"
                item-value="code"
                v-model="detailTauRoiCang.chanelCodeList"
                class="py-0 my-0"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Ghi chú khi tàu đi:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable class="py-0 my-0" multi-line rows="2" v-model="detailTauRoiCang['remarks']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Loại thủ tục rời:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                  clearable
                  placeholder="Chọn loại thủ tục"
                  :items="shipTypeItems"
                  item-text="shipTypeNameVN"
                  item-value="shipTypeCode"
                  v-model="detailTauRoiCang.shipTypeCode"
                  class="py-0 my-0"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"></v-flex>
              <v-flex  xs7 class="">
                <v-checkbox clearable v-model="detailTauRoiCang.tauChuaRoiCang" hide-details style="height:15px;" label="Tàu chưa rời cảng" class=""></v-checkbox>
              </v-flex>
            </v-layout>
          </v-flex>

          <v-flex xs4 class="px-2">
            
            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập quốc tịch" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Quốc tịch:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                placeholder="Nhập quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailTauRoiCang.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Hô hiệu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailTauRoiCang.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Số IMO:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailTauRoiCang.iMONumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Loại tàu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                clearable
                :items="shipTypeCodeItems"
                item-text="shipTypeCode"
                item-value="shipTypeName"
                v-model="detailTauRoiCang.shipTypeCode"
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
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                v-model="detailTauRoiCang.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Chủ tàu:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailTauRoiCang.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Người khai thác:</label></v-flex>
              <v-flex  xs7 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailTauRoiCang.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>NT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập NT" v-money="formatGT" v-model="detailTauRoiCang.nt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['nt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>GT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-money="formatGT" v-model="detailTauRoiCang.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['gt']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>DWT:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-money="formatGT" v-model="detailTauRoiCang.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['dwt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Breadth (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-money="formatClearanceHeight" v-model="detailTauRoiCang.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['breadth']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>LOA (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauRoiCang.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập mớn nước thiết kế" v-money="formatClearanceHeight" v-model="detailTauRoiCang.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauRoiCang.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Công suất máy:</label></v-flex>
              <v-flex  xs3 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatGT" v-model="detailTauRoiCang.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messagePower" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauRoiCang['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs5 class="pt-1 text-xs-center pr-1"><label>Đơn vị:</label></v-flex>
              <v-flex  xs7 class="">
                <v-select
                  clearable
                  :items="representativeItems"
                  item-text="repNameVN"
                  item-value="repCode"
                  v-model="detailTauRoiCang.hangBangMT"
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
    loadingDetail: false,
    errorsMessage: {},
    showWarning: false,
    disabledForm: false,
    warningTauRoi: {
      show: true,
      message: []
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
    cargoItems: [],
    securityLevelItems: [],
    representativeItems: [],
    chanelListItems: [],
    flagStateOfShipItems: [],
    homeValue: 350000,
    detailTauRoiCang: {
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
    validFormTauRoiCang: true,
    shipTypeItems: []
  }),
  watch: {
    // notification (notification) {
    //   this.detailTauRoiCang = notification
    // }
    documentName (val) {
      var vm = this
      if (val && val !== '0') {
        if (!vm.id || vm.id === '0') {
          vm.disabledForm = true
        }
      }
    },
    id (val) {
      var vm = this
      if (!val || val === '0') {
        vm.loadPortWharf()
        vm.loadShipAgency()
        vm.loadPortHarbour()
        vm.loadPurpose()
        vm.loadCargo()
        vm.loadShipType()
        vm.loadChanelList()
        vm.loadsecurityLevel()
        vm.loadDonVi()
        vm.loadFlagStateOfShip()
      } else {
        vm.loadTauRoiCang()
      }
    }
  },
  computed: {
    loadingInitData () {
      return this.$store.getters.loadingInitData
    },
    itineraryNo () {
      return this.$store.getters.itineraryNo
    }
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
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadTauRoiCang()
    } else {
      if (vm.documentName) {
        vm.loadInitData()
      }
    }
    if (vm.documentName && vm.documentName !== '0') {
      if (!vm.id || vm.id === '0') {
        vm.disabledForm = true
      }
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
    loadTauRoiCang: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.loadingDetail = true
      vm.$store.dispatch('loadDetailTauRoiCang', data).then(function (result) {
        if (!result.hasOwnProperty('errorCode')) {
          vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, vm.parseTimeTau(result))
        }
        vm.loadingDetail = false
      }).catch(function (xhr) {
        console.log(xhr)
        vm.loadingDetail = false
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
        vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, vm.parseTimeTau(result))
      })
    },
    loadDetailHoSo: function () {
      var vm = this
      return new Promise(function (resolve, reject) {
        let data = {
          'documentName': vm.documentName,
          'documentYear': vm.documentYear,
          'type': vm.type
        }
        vm.$store.dispatch('loadDetailHoSo', data).then(function (result) {
          vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, {
            callSign: result['callSign'],
            shipName: result['shipName'],
            flagStateOfShip: result['stateCode'],
            imoNumber: result['imo'],
            shipTypeCode: result['shipTypeCode'],
            nt: result['nt'],
            dwt: result['dwt']
          })
          vm.tempDocument = result
          resolve(result)
        }).catch(function (xhr) {
          console.log(xhr)
          reject(xhr)
        })
      })
    },
    loadInitVmaShip: function (params) {
      var vm = this
      return new Promise(function (resolve, reject) {
        vm.loadingInitData.then(function (initData) {
          let data = {
            'shipBoat': 'SHIP',
            'imoNumber': params['imo'],
            'callSign': params['callSign'],
            'url': initData['getVmaShip_Ship_URL']
          }
          vm.$store.dispatch('loadDanhSachTauBien', data).then(function (result) {
            if (result.total) {
              var dataItem = result.data[0]
              vm.vmaShip = dataItem
              vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, {
                breadth: dataItem['breadth'],
                clearanceHeight: dataItem['clearanceHeight'],
                power: dataItem['power'],
                loa: dataItem['loa'],
                maxDraft: dataItem['maxDraft']
              })
              resolve(dataItem)
            } else {
              vm.warningTauRoi['show'] = true
              vm.warningTauRoi.message.push('- Chưa có thông tin tàu!')
              reject(false)
            }
            resolve(dataItem)
          }).catch(function (xhr) {
            console.log(xhr)
            reject(xhr)
          })
        })
      })
    },
    loadInitVmaShipOwner: function (data) {
      var vm = this
      return new Promise(function (resolve, reject) {
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
              vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, {
                shipOwnersName: dataItem['shipOwnersName']
              })
            } else {
              vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, {
                shipOperatorName: dataItem['shipOperatorName']
              })
            }
            vm.vmaShipOwner = dataItem
          } else {
            if (param.hasOwnProperty('isShipOwner')) {
              vm.warningTauRoi['show'] = true
              vm.warningTauRoi.message.push('- Chưa có thông tin chủ tàu!')
            } else {
              vm.warningTauRoi['show'] = true
              vm.warningTauRoi.message.push('- Chưa có thông tin người khai thác!')
            }
          }
          resolve(dataItem)
        }).catch(function (xhr) {
          console.log(xhr)
          if (param.hasOwnProperty('isShipOwner')) {
            vm.warningTauRoi['show'] = true
            vm.warningTauRoi.message.push('- Chưa có thông tin chủ tàu!')
          } else {
            vm.warningTauRoi['show'] = true
            vm.warningTauRoi.message.push('- Chưa có thông tin người khai thác!')
          }
          reject(xhr)
        })
      })
    },
    loadInitTemp_noticeShipMessage: function () {
      var vm = this
      return new Promise(function (resolve, reject) {
        let data = {
          'documentName': vm.documentName,
          'documentYear': vm.documentYear
        }
        vm.$store.dispatch('loadLenhDieuDongEXT', data).then(function (result) {
          if (result) {
            var dataItem = result.detail
            vm.vmaShip = dataItem
            vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, {
              shownDraftxF: dataItem['shownDraftxF'],
              shownDraftxA: dataItem['shownDraftxA'],
              numberShiftingOrder: dataItem['numberShiftingOrder']
            })
            resolve(dataItem)
          } else {
            reject(false)
          }
        }).catch(function (xhr) {
          console.log(xhr)
          reject(xhr)
        })
      })
    },
    loadInitShipAgencyFromCode: function (shipAgencyCode) {
      var vm = this
      return new Promise(function (resolve, reject) {
        let param = {
          categoryId: 'DM_SHIP_AGENCY',
          shipAgencyCode: shipAgencyCode
        }
        vm.$store.dispatch('loadDataDmDetail', param).then(function (result) {
          if (result.hasOwnProperty('errorCode')) {
            vm.warningTauRoi['show'] = true
            vm.warningTauRoi.message.push('- Không tìm thấy đại lý')
            reject(result)
          } else {
            vm.vmaShipAgency = result
            resolve(result)
          }
        }).catch(function (xhr) {
          console.log(xhr)
          vm.warningTauRoi['show'] = true
          vm.warningTauRoi.message.push('- Không tìm thấy đại lý')
          reject(xhr)
        })
      })
    },
    luuTauRoi: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuTauRoiCang()
      } else {
        vm.themTauRoiCang()
      }
    },
    duyetTauRoi: function () {
      var vm = this
      vm.detailTauRoiCang['state'] = 'ACTIVE'
      vm.luuTauRoiCang()
    },
    xacNhanTauRoi: function () {
      var vm = this
      vm.detailTauRoiCang['state'] = 'CONFIRM'
      vm.luuTauRoiCang()
    },
    themTauRoiCang: function () {
      var vm = this
      vm.detailTauRoiCang['id'] = ''
      vm.detailTauRoiCang['noticeShipType'] = 2
      vm.detailTauRoiCang['shipPosition'] = 3
      vm.detailTauRoiCang['shipBoat'] = 'SHIP'
      vm.detailTauRoiCang['markedAsDeparture'] = 1
      if (vm.$refs.formTauRoiCang.validate()) {
        vm.$store.dispatch('addVmaItinerarySchedule', vm.detailTauRoiCang).then(function (result) {
          vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, vm.parseTimeTau(result))
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.changeIdUrl(result['vmaItineraryScheduleId'])
            toastr.success('Thêm thành công!')
          }
        }).catch(function (xhr) {
          console.log(xhr)
        })
      }
    },
    deleteTauRoiCang: function () {
      var vm = this
      let data = {
        id: vm.id
      }
      vm.$store.dispatch('deleteTauRoiCang', data).then(function (result) {
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Xóa thất bại, vui lòng thử lại!')
          toastr.error(result.message)
        } else {
          toastr.success('Xóa thành công!')
        }
        vm.changeIdUrl('0')
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    lamMoi: function () {
      var vm = this
      vm.detailTauRoiCang = {}
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    luuTauRoiCang: function () {
      var vm = this
      if (vm.$refs.formTauRoiCang.validate()) {
        vm.$store.dispatch('updateVmaItinerarySchedule', vm.detailTauRoiCang).then(function (result) {
          vm.detailTauRoiCang = Object.assign(vm.detailTauRoiCang, vm.parseTimeTau(result))
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
    parseTimeTau: function (modelTauRoi) {
      var vm = this
      if (!modelTauRoi) {
        console.log('valid tau den', modelTauRoi)
        return
      }
      modelTauRoi['timeOfDeparture'] = vm.parseTimeStamp(modelTauRoi['timeOfDeparture'])
      modelTauRoi['timeOfPORTArrival'] = vm.parseTimeStamp(modelTauRoi['timeOfPORTArrival'])
      return modelTauRoi
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

