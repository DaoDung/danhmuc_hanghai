<template>
  <div style="width: 100%; background: #fff; position: relative;" class="extFormXuLy">
    <v-flex xs12 style="background: #e6e1e1;">
      <v-layout row wrap >
        <v-flex xs6><v-flex style="margin: 8px 0 9px 0; color: #1976d2;" class="text ml-3" xs12>
          <h3>Kế hoạch tàu di chuyển <span @click="showWarning = !showWarning" style="cursor: pointer; color: orange;" v-if="warningTauNeoDau" color="warning">(Cảnh báo)</span></h3> </v-flex>
        </v-flex>
        <v-flex xs6 class="text-xs-right pl-3" v-if="!documentName || documentName === '0'">
          <v-flex xs12 style="display: flex; margin-top: 4px; height: 21px; justify-content: flex-end;">
            <v-btn
              :disabled="id && id !== '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauDiChuyen()"
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
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="luuTauDiChuyen()"
            >
              <v-icon size="17">save</v-icon>Lưu lại
            </v-btn>
            
            <v-btn
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="quaylai()"
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
              @click="luuTauDraftTauDiChuen()"
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
              @click="xacNhanTauDiChuyen()"
            >
              <v-icon size="20">confirmation_number</v-icon>Xác nhận
            </v-btn>

            <v-btn
              v-if="!disabledForm"
              :disabled="!id || id === '0'"
              flat
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="themTauLaiHoTro()"
            >
              <v-icon size="20">add</v-icon> Thêm tàu lai hỗ trợ
            </v-btn>
            
            <v-btn
              v-if="!disabledForm"
              flat
              :disabled="!id || id === '0'"
              small
              class="mx-0 my-0"
              style="text-transform: none; color: #007bff; font-weight: normal;"
              @click="duyetTauDiChuyen()"
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
      </v-layout>
    </v-flex>
    <v-form
      ref="formTauDiChuyen"
      :style="{'opacity': disabledForm ? '0.6' : 1, 'pointer-events': disabledForm ? 'none' : 'auto'}"
      :disabled="disabledForm"
      v-model="validFormTauDiChuyen"
      lazy-validation
      class="mt-2"
   >
      <v-flex xs12 d-flex>
        <v-layout row wrap>
          <v-flex xs6 class="pr-1">

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Số lệnh điều động:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field class="py-0 my-0" placeholder="Nhập số lệnh điều động"  v-model="detailTauDiChuyen['certificateNo']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 pl-2"><label>Thời gian di chuyển:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauDiChuyen['timeOfDeparture']"
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
              <v-flex xs3 class="pt-1 px-2"><label>Thời gian kết thúc di chuyển:</label></v-flex>
              <v-flex xs9>
                <datetime-picker
                v-model="detailTauDiChuyen['timeOfDeparture']"
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
              <v-flex xs3 class="pt-1 px-2"><label>Đại lý <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="shipAgencyItems"
                item-text="shipAgencyNameVN"
                item-value="shipAgencyCode"
                v-model="detailTauDiChuyen['taxCodeOfShipownersAgents']"
                class="py-0 my-0"
                placeholder="Chọn đại lý"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Từ bến:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauDiChuyen['anchoringPortHarbourCode']"
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
                :items="portWharfItems"
                item-text="portWharfNameVN"
                item-value="portWharfCode"
                v-model="detailTauDiChuyen['anchoringPortWharfCode']"
                class="py-0 my-0"
                placeholder="Từ vị trí"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Đến bến:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="portHarbourItems"
                item-text="portHarbourNameVN"
                item-value="portHarbourCode"
                v-model="detailTauDiChuyen['shiftingPortHarbourCode']"
                class="py-0 my-0"
                placeholder="Đến bến"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Đến vị trí <label style="color: red;">*</label>:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="portWharfItems"
                item-text="portWharfNameVN"
                item-value="portWharfCode"
                v-model="detailTauDiChuyen['shiftingPortWharfCode']"
                class="py-0 my-0"
                placeholder="Đến vị trí"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Cập mạn vào tàu:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="portMaritimeItems"
                item-text="maritimeNameVN"
                item-value="maritimeCode"
                v-model="detailTauDiChuyen['nextMaritimePortCode']"
                class="py-0 my-0"
                placeholder="Cập mạn vào tàu"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Mục đích di chuyển:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="purposeItems"
                item-text="purposeName"
                item-value="purposeCode"
                v-model="detailTauDiChuyen['purposeCode']"
                class="py-0 my-0"
                placeholder="Chọn mục đích"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Hàng hóa:</label></v-flex>
              <v-flex xs9>
                <v-select
                clearable
                :items="cargoItems"
                item-text="goodsTypeNameVN"
                item-value="goodsTypeCode"
                v-model="detailTauDiChuyen['cargoCode']"
                class="py-0 my-0"
                placeholder="Chọn hàng hóa"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Mớn nước mũi (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước mũi" v-money="formatClearanceHeight" v-model="detailTauDiChuyen['shownDraftxF']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageShownDraftxF" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['shownDraftxF']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Mớn nước lái (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field class="py-0 my-0" placeholder="Nhập mớn nước lái" v-money="formatClearanceHeight" v-model="detailTauDiChuyen['shownDraftxA']"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageShownDraftxA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['shownDraftxA']"></v-currency-field>
              </v-flex>
            </v-layout>
            
            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Số thuyền viên:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số thuyền viên" v-money="formatGT" v-model="detailTauDiChuyen.crewNumber"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageCrewNumber" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['crewNumber']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Số hành khách  :</label></v-flex>
              <v-flex xs2>
                <!-- <v-text-field class="py-0 my-0"  placeholder="Nhập số hành khách" v-money="formatGT" v-model="detailTauDiChuyen.passengerNumber"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePassengerNumber" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['passengerNumber']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Tuyến luồng:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                clearable
                placeholder="Chọn tuyến luồng"
                :items="chanelListItems"
                item-text="name"
                item-value="code0"
                v-model="detailTauDiChuyen.chanelCodeList"
                class="py-0 my-0"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Ghi chú:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable class="py-0 my-0" multi-line rows="3" v-model="detailTauDiChuyen['remarks']"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <!-- -------------------- -->
          </v-flex>

          <v-flex xs6 class="px-2">
            
            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Tàu:</label> <label style="color: red;">*</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập tàu" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Quốc tịch:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                placeholder="Chọn quốc tịch"
                :items="flagStateOfShipItems"
                item-text="stateName"
                item-value="stateCode"
                v-model="detailTauDiChuyen.flagStateOfShip"
                class="py-0 my-0"
                :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']"
                clearable
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Hô hiệu:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập hô hiệu"  v-model="detailTauDiChuyen.callSign"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Số IMO:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập số IMO"  v-model="detailTauDiChuyen.imoNumber"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Loại tàu:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                clearable
                :items="shipTypeItems"
                item-text="shipTypeNameVN"
                item-value="shipTypeCode"
                v-model="detailTauDiChuyen.shipTypeCode"
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
                :items="securityLevelItems"
                item-text="securityLevelName"
                item-value="securityLevelCode"
                v-model="detailTauDiChuyen.securityLevelCode"
                class="py-0 my-0"
                placeholder="Chọn cấp độ an ninh"
                ></v-select>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Chủ tàu:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập tên chủ tàu"  v-model="detailTauDiChuyen.shipOwnersName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Người khai thác:</label></v-flex>
              <v-flex xs9 class="">
                <v-text-field clearable  placeholder="Nhập người khai thác"  v-model="detailTauDiChuyen.shipOperatorName"
                ></v-text-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>NT:</label></v-flex>
              <v-flex xs2 class="">
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageNT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['nt']"></v-currency-field>
                <!-- <v-text-field  placeholder="Nhập NT" v-money="formatGT" v-model="detailTauDiChuyen.nt"
                ></v-text-field> -->
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>GT:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập GT" v-money="formatGT" v-model="detailTauDiChuyen.gt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageGT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['gt']"></v-currency-field>
              </v-flex>
            </v-layout>


            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>DWT:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập DWT" v-money="formatGT" v-model="detailTauDiChuyen.dwt"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messageDWT" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['dwt']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Breadth (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập breadth" v-money="formatClearanceHeight" v-model="detailTauDiChuyen.breadth"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageBreadth" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['breadth']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>LOA (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauDiChuyen.loa"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageLOA" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['loa']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Mớn nước t.kế (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập mớn nước thiết kế" v-money="formatClearanceHeight" v-model="detailTauDiChuyen.maxDraft"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageMaxDraft" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['maxDraft']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Chiều cao t.không (m):</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatClearanceHeight" v-model="detailTauDiChuyen.clearanceHeight"
                ></v-text-field> -->
                <v-currency-field v-bind="formatClearanceHeight" :error-messages="errorsMessage.messageClearanceHeight" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['clearanceHeight']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Công suất máy:</label></v-flex>
              <v-flex xs2 class="">
                <!-- <v-text-field  placeholder="Nhập tên máy trưởng" v-money="formatGT" v-model="detailTauDiChuyen.power"
                ></v-text-field> -->
                <v-currency-field v-bind="formatGT" :error-messages="errorsMessage.messagePower" :rules="[v => !!v || 'Trường dữ liệu bắt buộc phải nhập']" v-model="detailTauDiChuyen['power']"></v-currency-field>
              </v-flex>
            </v-layout>

            <v-layout row wrap>
              <v-flex xs3 class="pt-1 px-2"><label>Đơn vị:</label></v-flex>
              <v-flex xs9 class="">
                <v-select
                  clearable
                  :items="representativeItems"
                  item-text="repNameVN"
                  item-value="repCode"
                  v-model="detailTauDiChuyen.representative"
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
import {eventBus} from '../../../event-bus/eventBus.js'
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
    showWarning: false,
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
    cargoItems: [],
    chanelListItems: [],
    securityLevelItems: [],
    homeValue: 350000,
    detailTauDiChuyen: {
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
    validFormTauDiChuyen: true,
    shipTypeItems: [],
    representativeItems: [],
    flagStateOfShipItems: [],
    purposeItems: [],
    portMaritimeItems: [],
    portHarbourItems: [],
    shipAgencyItems: []
  }),
  watch: {
    // notification (notification) {
    //   this.detailTauDiChuyen = notification
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
        vm.loadsecurityLevel()
        vm.loadDonVi()
      }
      if (newVal && newVal !== 0) {
        vm.loadTauDiChuyen()
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
    vm.loadPortWharf()
    vm.loadShipAgency()
    vm.loadPortHarbour()
    vm.loadPurpose()
    vm.loadCargo()
    vm.loadShipType()
    vm.loadChanelList()
    vm.loadsecurityLevel()
    vm.loadDonVi()
    vm.loadPortMaritime()
    vm.loadFlagStateOfShip()
    if (vm.id && vm.id !== '0') {
      vm.loadTauDiChuyen()
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
    loadPortMaritime: function () {
      var vm = this
      let param = {
        categoryId: 'DM_MARITIME'
      }
      if (vm.id && vm.id !== '0') {
        delete param['isDelete']
      } else {
        param['isDelete'] = 0
      }
      vm.$store.dispatch('loadDataDm', param).then(function (result) {
        vm.portMaritimeItems = result
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
        vm.detailTauDiChuyen = Object.assign(vm.detailTauDiChuyen, result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    luuTauDraftTauDiChuen: function () {
      var vm = this
      if (vm.id && vm.id !== '0') {
        vm.luuTauDiChuyen()
      } else {
        vm.themTauDiChuyen()
      }
    },
    duyetTauDiChuyen: function () {
      var vm = this
      vm.detailTauDiChuyen['state'] = 'ACTIVE'
      vm.luuTauDiChuyen()
    },
    xacNhanTauDiChuyen: function () {
      var vm = this
      vm.detailTauDiChuyen['state'] = 'CONFIRM'
      vm.luuTauDiChuyen()
    },
    parseTimeTauDiChuyen: function (modelTauDiChuyen) {
      var vm = this
      if (!modelTauDiChuyen) {
        console.log('valid tau di chuyen', modelTauDiChuyen)
        return
      }
      modelTauDiChuyen['timeOfDeparture'] = vm.parseTimeStamp(modelTauDiChuyen['timeOfDeparture'])
      return modelTauDiChuyen
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
    loadTauDiChuyen: function () {
      var vm = this
      let data = {
        'id': vm.id
      }
      vm.$store.dispatch('loadDetailTauDiChuyen', data).then(function (result) {
        vm.detailTauDiChuyen = vm.parseTimeTauDiChuyen(result)
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    themTauDiChuyen: function () {
      var vm = this
      vm.detailTauDiChuyen['id'] = ''
      if (vm.$refs.formTauDiChuyen.validate()) {
        vm.$store.dispatch('addTauDiChuyen', vm.detailTauDiChuyen).then(function (result) {
          vm.detailTauDiChuyen = vm.parseTimeTauDiChuyen(result)
          if (result.hasOwnProperty('errorCode')) {
            toastr.error('Thêm thất bại, vui lòng thử lại!')
            toastr.error(result.message)
          } else {
            vm.changeIdUrl(result['vmaScheduleShiftingId'])
            toastr.success('Thêm thành công!')
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
      vm.$store.dispatch('deleteTauDiChuyen', data).then(function (result) {
        if (result.hasOwnProperty('errorCode')) {
          toastr.error('Xóa thất bại, vui lòng thử lại!')
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
      vm.detailTauDiChuyen = {}
    },
    activeForm: function () {
      var vm = this
      vm.disabledForm = false
    },
    luuTauDiChuyen: function () {
      var vm = this
      if (vm.$refs.formTauDiChuyen.validate()) {
        vm.$store.dispatch('editTauDiChuyen', vm.detailTauDiChuyen).then(function (result) {
          vm.detailTauDiChuyen = vm.parseTimeTauDiChuyen(result)
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
    themTauLaiHoTro: function () {
      var vm = this
      console.log('them tau lai')
      vm.$router.push({
        path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.documentName + '/' + vm.documentYear + '/' + vm.documentTypeCode + '/DanhSachTauLaiHoTro/0'
      })
      eventBus.$emit('otherDataTauLai', {
        certificateNo: vm.detailTauDiChuyen['certificateNo']
      })
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

