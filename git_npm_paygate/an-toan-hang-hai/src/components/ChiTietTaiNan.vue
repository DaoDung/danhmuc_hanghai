<template>
  <v-dialog
    v-model="dialogChiTiet"
    max-width="1000"
  >
    <v-card>  
      <v-card-title class="headline grey lighten-2" primary-title>
        <span class="headline">Thông tin tai nạn</span>
      </v-card-title>
      <div style="width:100%; padding: 10px 25px 0 25px;">
        <div id="chi-tiet">
          <v-dialog 
            v-model="diaLogShip"
            max-width="600"
          >
            <v-card>
              <v-card-title class="headline grey lighten-2" primary-title>
                <span class="headline">Danh sách tàu</span>
              </v-card-title>
              <div id="dialog" style="width:100%; padding: 10px;">
                <table style="width:100%;">
                    <thead>
                      <tr>
                        <th v-for="key in headers" :key="key.text">
                          <span>{{key.text}}</span>
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr v-for="(key, index) in ships" :key="index">
                        <td class="text-xs-center">{{ index + 1 }}</td>
                        <td class="text-xs-center" style="width:150px;">{{ key.shipName }}</td>
                        <td class="text-xs-center">{{ key.stateName }}</td>
                        <td class="text-xs-center">{{ key.imoNumber }}</td>
                        <td class="text-xs-center">{{ key.callSign }}</td>
                        <td class="text-xs-center" style="">
                          <span @click="chonTau(key)" class="action-table"><strong>Chọn</strong></span>
                        </td>
                      </tr>
                    </tbody>
                  </table>
              </div>


              <v-card-actions>
                <div class="flex-grow-1"></div>
                <v-btn small color="primary" dark @click="diaLogShip = false">Thoát</v-btn>
              </v-card-actions>
            </v-card>
          </v-dialog>
          <!-- <v-flex xs12>
            <div style="width:100%; font-size: 25px; font-weight: 500; ">
              <span style="">Thông tin tai nạn</span>
            </div>
          </v-flex> -->
          <v-flex xs12 class="text-lg-left">
            <v-btn small color="primary" dark @click="diaLogShip=true" width="80">Chọn tàu</v-btn>
          </v-flex>
          <v-flex xs12>
            <v-form ref="form" lazy-validation>
              <v-flex xs12>
                <v-layout align-center justify-content>
                  
                    <!--Tên tàu-->
                    <v-flex xs6 class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Tên tàu:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="ship.shipName"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Quốc tịch-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Quốc tịch:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="ship.flagStateOfShip"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                    <!--Số hiệu-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Hô hiệu:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="ship.callSign"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Số IMO-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Số IMO:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="ship.imoNumber"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                    <!--Số ĐK-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Số đăng ký:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="taiNanHangHai.registryNumber"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Loại tai nạn-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Loại tai nạn:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-autocomplete
                              v-model="taiNanHangHai.accidentType"
                              persistent-hint
                              :items="loaiTaiNan"
                              item-text="text"
                              item-value="value"
                            >
                              <template v-slot:append-outer></template>
                          </v-autocomplete>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                    <!--Mức độ-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Mức độ:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-autocomplete
                              v-model="taiNanHangHai.accidentCriticalType"
                              persistent-hint
                              :items="mucDo"
                              item-text="text"
                              item-value="value"
                            >
                              <template v-slot:append-outer></template>
                          </v-autocomplete>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Hạn nộp báo cáo-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Hạn nộp báo cáo:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs4>
                          <datetime-picker
                            v-model="hanNopBaoCao"
                            :first-day="1"
                            :show-dst="false"
                            :show-hours="true"
                            :show-minutes="true"
                            :show-seconds="false"
                          ></datetime-picker>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                
                  <!--Số người bị thương-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout align-center>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Số người bị thương:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-text-field
                          v-model="taiNanHangHai.numberOfInjured"
                        ></v-text-field>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  <!--Ngày diều tra tai nạn-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout align-center>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Ngày điều tra:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs4>
                        <datetime-picker
                          v-model="ngayDieuTra"
                          :first-day="1"
                          :show-dst="false"
                          :show-hours="true"
                          :show-minutes="true"
                          :show-seconds="false"
                        ></datetime-picker>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                
                    <!--Tổn thất môi trường-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Tổn thất môi trường:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="taiNanHangHai.remarksOfEnvironment"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Ngày tai nạn-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Ngày tai nạn:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs4>
                          <datetime-picker
                            v-model="ngayTaiNan"
                            :first-day="1"
                            :show-dst="false"
                            :show-hours="true"
                            :show-minutes="true"
                            :show-seconds="false"
                          ></datetime-picker>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                    <!--Đơn vị điều tra tai nạn-->
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Đơn vị điều tra tai nạn:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-autocomplete
                              v-model="taiNanHangHai.investigationOffice"
                              persistent-hint
                              :items="cangVuHangHai"
                              item-text="maritimeNameVN"
                              item-value="maritimeCode"
                            >
                              <template v-slot:append-outer></template>
                          </v-autocomplete>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Có hoa tiêu dẫn tàu/ Có điều tra tai nạn-->
                    <v-flex xs6 class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs6>
                          <input type="checkbox" v-model="taiNanHangHai.pilotOnBoad" true-value="1" false-value="0"> Có hoa tiêu dẫn tàu<br>
                        </v-flex>
                        <v-flex xs6>
                          <input type="checkbox" v-model="taiNanHangHai.makeInvestigation"  true-value="1" false-value="0"> Có điều tra tai nạn<br>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                  <!--Đơn vị báo cáo-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout align-center>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Đơn vị báo cáo:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-autocomplete
                            v-model="taiNanHangHai.portofAuthority"
                            persistent-hint
                            :items="cangVuHangHai"
                            item-text="maritimeNameVN"
                            item-value="maritimeCode"
                          >
                            <template v-slot:append-outer></template>
                        </v-autocomplete>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  <!--Tổn thất về hàng hóa-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout align-center>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Tổn thất hàng hóa:</label>
                      </v-flex>
                      <v-flex xs8>
                        <v-text-field
                          v-model="taiNanHangHai.remarksOfCargo"
                        ></v-text-field>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  
                    <v-flex xs6  class="input-group-chitiet">
                      <v-layout align-center>
                        <v-flex xs4 class="text-sm-left">
                          <label for>Số người chết:</label>
                          <span class="red--text">*</span>
                        </v-flex>
                        <v-flex xs8>
                          <v-text-field
                            v-model="taiNanHangHai.numberOfDead"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <!--Số người chết và mất tích-->
                    <v-flex xs6  class="input-group-chitiet">

                    </v-flex>
                  
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                   <!--Tổn thất phương tiện & CT GTVT-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Tổn thất phương tiện &amp; CT GTVT:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-textarea
                          rows="4"
                          name="input-4-1"
                          v-model="taiNanHangHai.remarksOfShip"
                        ></v-textarea>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  <!--Vị trí tai nạn:-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Vị trí tai nạn:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-textarea
                          rows="4"
                          v-model="taiNanHangHai.accidentRegion"
                        ></v-textarea>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                   <!--Tóm tắt vụ tai nạn-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Tóm tắt vụ tai nạn:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-textarea
                          rows="4"
                          v-model="taiNanHangHai.accidentBrief"
                        ></v-textarea>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                  <!--Kết luận sử lý và kiến nghị-->
                  <v-flex xs6  class="input-group-chitiet">
                    <v-layout>
                      <v-flex xs4 class="text-sm-left">
                        <label for>Kết luận xử lý và kiến nghị:</label>
                        <span class="red--text">*</span>
                      </v-flex>
                      <v-flex xs8>
                        <v-textarea
                          rows="4"
                          v-model="taiNanHangHai.accidentConclusion"
                        ></v-textarea>
                      </v-flex>
                    </v-layout>
                  </v-flex>
                </v-layout>
              </v-flex>           
            </v-form>
          </v-flex>




        </div>
      </div>


      <v-card-actions>
        <div class="flex-grow-1"></div>

        <v-btn
          color="primary"
          @click="submit"
        >
          {{btnText}}
        </v-btn>

        <v-btn
          color="primary"
          @click="closeDialog"
        >
          Thoát
        </v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>
import moment from 'moment'
import DatetimePicker from './DatetimePicker.vue'
import { setTimeout } from 'timers';
import { EventBus } from '@/eventbus'
export default {
  props: {
    dialogChiTiet: {
      type: Boolean,
      default: false
    },
    action: {
      type: String,
      default: ''
    },
    id: {
      type: Number,
      default: 0,
    }
  },
  components: {
    'datetime-picker': DatetimePicker
  },
  data: (vm) => ({
    isAlertThanhCong: false,
    isAlertThatBai: false,
    diaLogShip: false,
     btnText: '', 
     loaiTaiNan: [
       {
         text: 'Tai nạn gây Đâm va/ mắc cạn',
         value: '1',
       },
       {
         text: 'Tai nạn gây Cháy/ nổ',
         value: '2',
       },
       {
         text: 'Tai nạn gây Nghiêng/ lật',
         value: '3',
       },
       {
         text: 'Tai nạn gây Rò rỉ',
         value: '4',
       },
       {
         text: 'Tai nạn do hỏng máy',
         value: '5',
       },
       {
         text: 'Tai gây Thương tật/ nhiễm độc/ chết người',
         value: '6',
       },
       {
         text: 'Tai nạn ô nhiễm xả thải',
         value: '7',
       }
     ],
     mucDo: [
       {
         text: 'Tai nạn hàng hải đặc biệt nghiêm trọng',
         value: '1'
       },
       {
         text: 'Tai nạn hàng hải nghiêm trọng',
         value: '2'
       },
       {
         text: 'Tai nạn hàng hải ít nghiêm trọng',
         value: '3'
       }
     ],
     cangVuHangHai: [],
     headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên tàu",
          align: "center"
        },
        {
          sortable: false,
          text: "Quốc tịch",
          align: "center"
        },
        {
          sortable: false,
          text: "IMO",
          align: "center"
        },
        {
          sortable: false,
          text: "Hô hiệu",
          align: "center"
        }
     ],
     ships: [],
     ship: {},
     ngayDieuTra: vm.formatDate(new Date()),
     ngayTaiNan: vm.formatDate(new Date()),
     hanNopBaoCao: vm.formatDate(new Date()),
     taiNanHangHai: {

     }
  }),
  mounted() {
  },
  computed: {

  },
  watch: {
    dialogChiTiet(val) {
      console.log('aaaaaaaaaaa:',val)
      if(val === true) {
        console.log('TaiNanHangHai:',this.taiNanHangHai)
        if (this.action === "sua-tai-nan") {
          this.btnText = "Cập nhập"
        } 
        if (this.action === "them-tai-nan") {
          this.btnText = "Thêm mới"
        }
        this.getDetail()
      }
      if (val === false) {
        this.closeDialog()
      }
    }
  },
  methods: {
    getDetail () {
      let vm = this
      this.$store.dispatch('TaiNanHangHai/getCangVuHangHai').then(
        res => {
          vm.cangVuHangHai = res
          console.log("Cang Vu Hang Hai: ",vm.cangVuHangHai)
        }
      )
      this.$store.dispatch('TaiNanHangHai/getShips').then(
        res => {
          vm.ships = res
        }
      )
      if (this.action !== 'them-tai-nan') {
        let params = {
          id: vm.id
        }
        this.$store.dispatch('TaiNanHangHai/getDetailVmaAccidentList', params).then(
          res => {
            vm.taiNanHangHai = res

            if (vm.taiNanHangHai.investigationDate >= 0) {
              vm.ngayDieuTra = vm.formatDate(new Date((vm.taiNanHangHai.investigationDate)))
            }
            if(vm.taiNanHangHai.accidentTime >= 0) {
              vm.ngayTaiNan = vm.formatDate(new Date((vm.taiNanHangHai.accidentTime)))
            }
            if(vm.taiNanHangHai.accidentOfficialDate >= 0) {
              vm.hanNopBaoCao = vm.formatDate(new Date((vm.taiNanHangHai.accidentOfficialDate)))
            }

            vm.ship.shipName = vm.taiNanHangHai.nameOfShip
            vm.ship.imoNumber = vm.taiNanHangHai.imoNumber
            vm.ship.flagStateOfShip = vm.taiNanHangHai.flagStateOfShip
            vm.ship.callSign =  vm.taiNanHangHai.callSign
          }
        )
      } else {
        vm.taiNanHangHai = {
          id: '',
          portofAuthority: '',
          accidentCode: '',
          numberOfDead: '',
          acidentTime: '',
          accidentRegion: '',
          accidentBrief: '',
          accidentConclusion: '',
          accidentType: '',
          accidentCriticalType: '',
          nameOfShip: '',
          accidentTime: '',
          imoNumber: '',
          callSign: '',
          flagStateOfShip: '',
          registryNumber: '',
          decisionNo: '',
          decisionDate: '',
          decisionOrganization: '',
          officialDate: '',
          officiaNo: '',
          officialPlace: '',
          violationDate: '',
          violationPartCode: '',
          issueDate: '',
          issueBy: '',
          violationPartName: '',
          violationPartAddress: '',
          representative: '',
          representativeTitle: '',
          modifiedDate: '',
          numberOfInjured: '',
          investigationDate: '',
          accidentOfficialDate: '',
          pilotOnBoad: '0',
          makeInvestigation: '0'
        }

        vm.ship.shipName = vm.taiNanHangHai.nameOfShip
        vm.ship.imoNumber = vm.taiNanHangHai.imoNumber
        vm.ship.flagStateOfShip = vm.taiNanHangHai.flagStateOfShip
        vm.ship.callSign =  vm.taiNanHangHai.callSign
  }
    },
    formatDate (date) {
      let YYYY = date.getFullYear()
      let MM = (date.getMonth() + 1) <= 10 ? ('0' + (date.getMonth() + 1)) : (date.getMonth() + 1)
      let DD = date.getDate() <=10 ? ('0' + date.getDate()) : date.getDate()
      let HH = date.getHours() <= 10 ? ('0' + date.getHours()) : date.getHours()
      let II = date.getMinutes() <= 10 ? ('0' + date.getMinutes()) : date.getMinutes()
      let dateTime =  DD + '/' + MM + '/' + YYYY + ' ' + HH + ':' + II
      return dateTime
    },
    submit () {
      if (this.action === "sua-tai-nan") {
        this.suaDanhMuc()
      }
      if (this.action === "them-tai-nan") {
        this.themTaiNan()
      }
    },
    themTaiNan(){
      console.log(this.ngayTaiNan)
      let vm = this
      for (let key in this.taiNanHangHai){
        if(key === 'accidentTime') {
          this.taiNanHangHai[key] = moment(this.ngayTaiNan, 'DD/MM/YYYY HH:mm').toDate().getTime()
        }
        if(key === 'investigationDate') {
          this.taiNanHangHai[key] = moment(this.ngayDieuTra, 'DD/MM/YYYY HH:mm').toDate().getTime()
        }
        if(key === 'accidentOfficialDate') {
          this.taiNanHangHai[key] = moment(this.hanNopBaoCao, 'DD/MM/YYYY HH:mm').toDate().getTime()
        }
        if(key === 'nameOfShip') {
          this.taiNanHangHai[key] = this.ship.shipName
        }
        if(key === 'imoNumber') {
          this.taiNanHangHai[key] = this.ship.imoNumber
        }
        if(key === 'flagStateOfShip') {
          this.taiNanHangHai[key] = this.ship.flagStateOfShip
        }
        if(key === 'callSign') {
          this.taiNanHangHai[key] = this.ship.callSign
        }

      }
      console.log('Truoc khi them Tai Nan:', this.taiNanHangHai)
      this.$emit('themTaiNan', this.taiNanHangHai)
    },
    suaDanhMuc(){
      let vm = this
      let params = Object.assign({}, this.taiNanHangHai);
      params['accidentTime'] = moment(this.ngayTaiNan, 'DD/MM/YYYY HH:mm').toDate().getTime()
      params['investigationDate'] = moment(this.ngayDieuTra, 'DD/MM/YYYY HH:mm').toDate().getTime()
      params['accidentOfficialDate'] = moment(this.hanNopBaoCao, 'DD/MM/YYYY HH:mm').toDate().getTime()
      params['nameOfShip'] = this.ship.shipName
      params['imoNumber'] = this.ship.imoNumber
      params['flagStateOfShip'] =  this.ship.flagStateOfShip
      params['callSign'] = this.ship.callSign
      console.log('Truoc khi sua Tai Nan:', params)
      this.$emit('suaTaiNan', params)
    },
    chonTau(key) {
      this.ship = key
      this.diaLogShip = false
    },
    closeDialog() {
      this.$emit('closeDialog', false)
    },
    loadData(bool) {
      this.$emit('loadData', bool)
    }

  }
};
</script>
<style>
#chi-tiet{
  width: 100%;
  margin: 0 auto;
}
.v-input{
  font-size: 13px;
}
.v-text-field {
  padding-top: 0px;
  margin-top: 0px;
}
.v-input__slot{
  margin-bottom: 0px;
}
.v-text-field input {
    -webkit-box-flex: 1;
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    line-height: 20px;
    padding: 0px 0 0px;
    max-width: 100%;
    min-width: 0px;
    width: 100%;
}
#chi-tiet label {
  font-size: 14px;
  color: #3563c1;
  font-weight: 700;
}
.alert-chitiet{
  position: fixed;
  top:0;
  right: 0;
  box-shadow: -3px 3px 0px 2px #1fff0824;
  z-index: 100;
}
.input-time{
  border-bottom: 1px solid;
  margin-bottom: 14px;
}
.input-group-chitiet{
  padding: 0 10px;
}
</style>