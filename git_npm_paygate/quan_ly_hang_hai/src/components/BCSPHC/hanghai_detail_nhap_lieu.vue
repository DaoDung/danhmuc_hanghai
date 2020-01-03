<template>
  <v-flex xs9 class="nhaplieu" style="position: relative;">
    <transition
          appear
          enter-class=""
          enter-active-class="animated fadeInRightBig"
          leave-class=""
          leave-active-class="animated flipInY">
      <v-card-text class="py-0 px-0; mx-0"  style="border: 1px solid #EEEEEE; height: 40px;  border-top: none; position: relative;">
        <div class="list-thu-tuc" style="display: flex">
          <div class="row-header">
            <div class="background-triangle-big"> <span>BÁO CÁO XỬ PHẠT VI PHẠM HÀNH CHÍNH</span> </div>
          </div>
          <v-layout row class="mt-2 ml-5">
            <label>Số quyết định:</label>
            <v-flex xs2  class="ml-2">
              <v-text-field 
              v-model="violation.decisionNo" 
              class="px-0 py-0 mx-0 my-0" 
              ></v-text-field>
            </v-flex>
            <label class="ml-3">Ngày quyết định:</label>
            <v-flex xs2 class="ml-2">
              <v-menu
                ref="menu1"
                :close-on-content-click="false"
                v-model="menu1"
                :nudge-right="40"
                lazy
                transition="scale-transition"
                offset-y
                full-width
                max-width="290px"
                min-width="290px"
                class="menu1"
              >
              <template v-slot:activator="{ on }">
                <v-text-field
                  slot="activator"
                  v-model="violation.decisionDate"
                  
                  v-on="on"
                 append-icon="mdi-calendar"
                  class="px-0 py-0 mx-0 my-0 "
                ></v-text-field>
              </template>

                <v-date-picker v-model="decisionDate" no-title @input="menu1 = false"></v-date-picker>
              </v-menu>
            </v-flex>
          </v-layout>
        </div>

        <v-dialog v-model="seclecDelete" max-width="440px">
          <v-card>
            <v-card-text>
              <v-card-title class="headline">Bạn có muốn xóa số {{violation.decisionNo}} không?</v-card-title>
            </v-card-text>
            <v-card-actions>
              <v-btn
              color="blue"
              
              outline
              class="mx-auto mr-3"
              style="color: #007bff;"
              
              >
                <v-icon  size="20" color="blue">reply</v-icon>Quay Lại
              </v-btn> 
              <v-btn
              color="green darken-1"
              
              outline
              class="mx-0"
              @click="Delete"
              >
                <v-icon  size="20" color="green darken-1">close</v-icon>Xóa
              </v-btn> 
            </v-card-actions>
          </v-card>
        </v-dialog> 
              <v-btn
              small
              color="#3563c1"
              class="mx-0"
              style="text-transform: none; color: #007bff; position: absolute;margin: -46px; right: 135px;"
              @click="QuayLai"
            >
              <v-icon class="mr-1" color="white" size="18">mdi-file-account</v-icon> <span style="color:white">Quay lại</span>
          </v-btn>
        <v-btn
          v-if="this.$route.query.action === 'them'"
          small
          color="#3563c1"
          class="mx-0 "
          style="text-transform: none; color: #007bff; position: absolute;margin: -46px; right: 21px; "
          @click="Add"
        >
          <v-icon class="mr-1" color="white" size="18">mdi-file-account</v-icon> <span style="color:white">Lưu lại</span>
        </v-btn>
        <v-btn
          v-if="this.$route.query.action === 'sua'"
          small
          color="#3563c1"
          class="mx-0"
          style="text-transform: none; color: #007bff; position: absolute; margin: -46px; right: 21px; "
          @click="Update"
        >
          <v-icon class="mr-1" color="white" size="18">mdi-pencil-outline</v-icon> <span style="color:white">Lưu lại</span>
        </v-btn>
      </v-card-text>
    </transition>
    <transition
          appear
          enter-class=""
          enter-active-class="animated fadeInRightBig"
          leave-class=""
          leave-active-class="animated flipInY">
      <v-card-text class="mt-0 p-1  mt-2" style="border-left: 1px solid #EEEEEE;">
        <v-form lazy-validation class="ml-3">
          <blockquote
            class="font-weight-bold px-0 py-0 mx-0 my-0"
            style="font-size: 16px;"
          >1. Thông tin chung:</blockquote>
          <v-layout row>
              <v-flex xs6>
              <blockquote
              class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
              style="font-size: 14px;"
              >1.1. Tên tổ chức cá nhân:</blockquote>
              <v-flex xs11 class="ml-4" >
                <v-text-field
                  v-model="violation.violationPartName"
                  class="px-0 py-0 mx-0 my-0"
                  
                ></v-text-field>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <blockquote
              class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
              style="font-size: 14px;"
            >1.2. Địa chỉ:</blockquote>
              <v-flex xs11 class="ml-3" >
                <v-text-field
                  v-model="violation.violationPartAddress"
                  class="px-0 py-0 mx-0 my-0"
                  
                ></v-text-field>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
                style="font-size: 14px;"
              >1.3. Phương tiện vi phạm liên quan (nếu có):</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-text-field
                  v-model="violation.nameOfShip"
                  class="px-0 py-0 mx-0 my-0 txt-u"
                  
                  style=" text-transform: uppercase;"
                ></v-text-field>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
                style="font-size: 14px;"
              >1.4. Tóm tắt nội dung vi phạm:</blockquote>
              <v-flex xs11   class="ml-3">
                <v-textarea 
                v-model="violation.violationBrief" 
                rows="3" 
                style="font-size: 13px;" 
                class="px-0 py-0 mx-0 my-0" 
                ></v-textarea>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
                style="font-size: 14px;"
              >1.5. Ngày vi phạm:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-menu
                ref="menu3"
                :close-on-content-click="false"
                v-model="menu3"
                :nudge-right="40"
                lazy
                transition="scale-transition"
                offset-y
                full-width
                max-width="290px"
                min-width="290px"
                class="menu3"
              >
              <template v-slot:activator="{ on }">
                <v-text-field
                  slot="activator"
                  v-model="violation.violationDate"
                  
                  v-on="on"
                 append-icon="mdi-calendar"
                  class="px-0 py-0 mx-0 my-0 "
                ></v-text-field>
              </template>
                <v-date-picker v-model="violationDate" no-title @input="menu3 = false"></v-date-picker>
              </v-menu>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
                style="font-size: 14px;"
              >1.6. Ngày biên bản:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-menu
                ref="menu4"
                :close-on-content-click="false"
                v-model="menu4"
                :nudge-right="40"
                lazy
                transition="scale-transition"
                offset-y
                full-width
                max-width="290px"
                min-width="290px"
                class="menu4"
              >
              <template v-slot:activator="{ on }">
                <v-text-field
                  slot="activator"
                  v-model="violation.officialDate"
                  
                  v-on="on"
                 append-icon="mdi-calendar"
                  class="px-0 py-0 mx-0 my-0 "
                ></v-text-field>
              </template>

                <v-date-picker v-model="officialDate" no-title @input="menu4 = false"></v-date-picker>
              </v-menu>
              </v-flex>
            </v-flex>
          </v-layout>
          
          <v-layout row>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
                style="font-size: 14px;"
              >1.7. Địa điểm xảy ra vi phạm:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-text-field
                  v-model="violation.officialPlace"
                  class="px-0 py-0 mx-0 my-0 txt-u"
                  
                  style=" text-transform: uppercase;"
                ></v-text-field>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
                style="font-size: 14px;"
              >1.8. Số biên bản vi phạm:</blockquote>
              <v-flex xs11   class="ml-3">
                <v-text-field
                  v-model="violation.officialNo"
                  class="px-0 py-0 mx-0 my-0 txt-u"
                  
                  style=" text-transform: uppercase;"
                ></v-text-field>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row>
            <v-flex xs12>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
                style="font-size: 14px;"
              >1.9. Ngày chấp hành nộp tiền:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-menu
                ref="menu5"
                :close-on-content-click="false"
                v-model="menu5"
                :nudge-right="40"
                lazy
                transition="scale-transition"
                offset-y
                full-width
                max-width="290px"
                min-width="290px"
                class="menu5"
              >
              <template v-slot:activator="{ on }">
                <v-text-field
                  slot="activator"
                  v-model="violation.paymentDate"
                  
                  v-on="on"
                 append-icon="mdi-calendar"
                  class="px-0 py-0 mx-0 my-0 "
                ></v-text-field>
              </template>

                <v-date-picker v-model="paymentDate" no-title @input="menu5 = false"></v-date-picker>
              </v-menu>
              </v-flex>
            </v-flex>
          </v-layout>

          <v-layout row>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-4"
                style="font-size: 14px;"
              >1.10. Số biên lai:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-text-field
                  v-model="violation.documentaryNo"
                  class="px-0 py-0 mx-0 my-0 txt-u"
                  
                  style=" text-transform: uppercase;"
                ></v-text-field>
              </v-flex>
            </v-flex>
            <v-flex xs6>
              <blockquote
                class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
                style="font-size: 14px;"
              >1.11. Ngày biên lai:</blockquote>
              <v-flex xs11 class="ml-4" style="height: 31px;">
                <v-menu
                ref="menu6"
                :close-on-content-click="false"
                v-model="menu6"
                :nudge-right="40"
                lazy
                transition="scale-transition"
                offset-y
                full-width
                max-width="290px"
                min-width="290px"
                class="menu6"
              >
              <template v-slot:activator="{ on }">
                <v-text-field
                  slot="activator"
                  v-model="violation.documentaryDate"
                  
                  v-on="on"
                 append-icon="mdi-calendar"
                  class="px-0 py-0 mx-0 my-0 "
                ></v-text-field>
              </template>
                <v-date-picker v-model="documentaryDate" no-title @input="menu6 = false"></v-date-picker>
              </v-menu>
              </v-flex>
            </v-flex>
          </v-layout>

          <blockquote
            class="font-weight-bold px-0 py-0 mx-0 my-0"
            style="font-size: 16px;"
          >2. Kết luận: </blockquote>
          <v-layout row class="ml-3">
            <blockquote>Tổng tiền:</blockquote>
            <v-flex class="ml-2 mr-5" xs1>
              <vue-numeric class="input-crurency" style="width: 100%;" currency-symbol-position="suffix" currency="đ" separator="," v-model="paymentAmount" min="0" max="9999999999999999999" ></vue-numeric>
            </v-flex>

            <blockquote class="ml-5">Người xử phạt:</blockquote>
            <v-flex xs2>
              <v-text-field v-model="violation.decisionOrganization" class="px-2 py-0 mx-0 my-0 " ></v-text-field>
            </v-flex>
          </v-layout>
        </v-form>
      </v-card-text>
    </transition>
        <v-data-table
          hide-default-footer
          class="elevation-1 xoa"
        >
          <template v-slot:header="{ props: { headers } }">
              <thead>
                <tr>
                  <td class="text-xs-left font-weight-regular" style="width: 10%;">
                   TT
                  </td>
                  <td class="text-xs-left font-weight-regular" style="width: 60%;">
                    NỘI DUNG XỬ PHẠT VI PHẠM HÀNH CHÍNH TRONG LĨNH VỰC HÀNG HẢI
                  </td>
                  <td class="text-xs-center" style="width:15%;"> 
                    KQ
                  </td>
                  <td class="text-xs-center" style="width: 10%;">
                    KL
                  </td>
                  <td  style="width: 5%;"></td>
                </tr>
              </thead>
          </template>
          <template v-slot:body="{ items }">
            <tbody v-if="false">
            </tbody>
          </template>
        </v-data-table>
        <nhaplieu-muc1 :muc1="muc1" :status="status1" @changeStatus="status => status1=status"/>
        <nhaplieu-muc2 :muc2="muc2" :status="status2" @changeStatus="status => status2=status"></nhaplieu-muc2>
        <nhaplieu-muc3 :muc3="muc3" :status="status3" @changeStatus="status => status3=status"></nhaplieu-muc3>
        <nhaplieu-muc4 :muc4="muc4" :status="status4" @changeStatus="status => status4=status"></nhaplieu-muc4>
        <nhaplieu-muc5 :muc5="muc5" :status="status5" @changeStatus="status => status5=status"></nhaplieu-muc5>
        <nhaplieu-muc6 :muc6="muc6" :status="status6" @changeStatus="status => status6=status"></nhaplieu-muc6>
        <nhaplieu-muc7 :muc7="muc7" :status="status7" @changeStatus="status => status7=status"></nhaplieu-muc7>
        <nhaplieu-muc8 :muc8="muc8" :status="status8" @changeStatus="status => status8=status"></nhaplieu-muc8>
        <nhaplieu-muc9 :muc9="muc9" :status="status9" @changeStatus="status => status9=status"></nhaplieu-muc9>
        <nhaplieu-muc10 :muc10="muc10" :status="status10" @changeStatus="status => status10=status"></nhaplieu-muc10>
        <nhaplieu-muc11 :muc11="muc11" :status="status11" @changeStatus="status => status11=status"></nhaplieu-muc11>
        <v-layout row style="justify-content: flex-end; ">
        <v-layout row wrap style="margin-top:10px; margin-left: 10px;">
          <blockquote
            class="font-weight-bold px-0 py-0 mx-0 my-0 ml-2"
            style="font-size: 14px; margin-top: 20px;"
            >Xử lý vi phạm:</blockquote>
          <v-layout row class="ml-3">
              <blockquote>Tiền phạt:</blockquote>
              <v-flex class="ml-2 mr-5" xs1>
              <v-text-field
                v-model="violation.amountInWords"
                :disabled = "false"
                class="my-0 py-0"
              ></v-text-field> 
              </v-flex>
          </v-layout>
        </v-layout>
        <div class="search-top-right">

          <v-btn
              v-if="this.$route.query.action === 'them'"
              small
              color="#3563c1"
              class="mx-0"
              style="text-transform: none; color: #007bff;  margin: 10px;  right: 30px; "
              @click="Add"
            >
              <v-icon class="mr-1" color="white" size="18">mdi-file-account</v-icon> <span style="color:white">Lưu lại</span>
            </v-btn>
            <v-btn  
              v-if="this.$route.query.action === 'sua'"
              small
              color="#3563c1"
              class="mx-0"
              style="text-transform: none; color: #007bff;  margin: 10px;  right: 30px; "
              @click="Update()"
            >
              <v-icon class="mr-1" color="white" size="18">edit</v-icon> <span style="color:white">Lưu lại</span>
            </v-btn>
        </div>
      </v-layout>
  </v-flex>
</template>
<script>
import axios from 'axios'
import $ from 'jquery'
import NhaplieuMuc1 from './nhap_lieu_muc1.vue'
import NhaplieuMuc2 from './nhap_lieu_muc2.vue'
import NhaplieuMuc3 from './nhap_lieu_muc3.vue'
import NhaplieuMuc4 from './nhap_lieu_muc4.vue'
import NhaplieuMuc5 from './nhap_lieu_muc5.vue'
import NhaplieuMuc6 from './nhap_lieu_muc6.vue'
import NhaplieuMuc7 from './nhap_lieu_muc7.vue'
import NhaplieuMuc8 from './nhap_lieu_muc8.vue'
import NhaplieuMuc9 from './nhap_lieu_muc9.vue'
import NhaplieuMuc10 from './nhap_lieu_muc10.vue'
import NhaplieuMuc11 from './nhap_lieu_muc11.vue'
import seclectData from '@/json-data/list.json'
export default {
  name: 'my-detail-nhaplieu',
  data: () => ({
    seclecDelete: false,
    decisionDate: new Date().toISOString().substr(0,10),
    violationDate: new Date().toISOString().substr(0,10),
    officialDate: new Date().toISOString().substr(0,10),
    paymentDate: new Date().toISOString().substr(0,10),
    documentaryDate: new Date().toISOString().substr(0,10),
    menu1: false,
    menu2: false,
    menu3: false,
    menu4: false,
    menu5: false,
    menu6: false,
    url: '',
    result: true,
    violation: {},
    headers: [
      {
        text: 'TT',
        align: 'center',
        value: 'name',
        sortable: false
      },
      {
        text: 'NỘI DUNG XỬ PHẠT VI PHẠM HÀNH CHÍNH TRONG LĨNH VỰC HÀNG HẢI ',
        value: 'calories',
        align: 'center',
        sortable: false
      },
      {
        text: 'KQ ',
        value: 'calories',
        align: 'center',
        sortable: false
      },
      {
        text: 'KL',
        align: 'center',
        sortable: false
      }
    ],
    items: [
      {
        order: 'Mục 1',
        content: 'Vi phạm quy định về xây dựng, quản lý và khai thác kết cấu hạ tầng hàng hải',
        result: false
      }
    ],
    muc1: seclectData.section1.data.map(item => {
      item['value']=0 
      return item
    }),
    muc2: seclectData.section2.data.map(item => {
      item['value']=0 
      return item
    }),
    muc3: seclectData.section3.data.map(item => {
      item['value']=0 
      return item
    }),
    muc4: seclectData.section4.data.map(item => {
      item['value']=0 
      return item
    }),
    muc5: seclectData.section5.data.map(item => {
      item['value']=0 
      return item
    }),
    muc6: seclectData.section6.data.map(item => {
      item['value']=0 
      return item
    }),
    muc7: seclectData.section7.data.map(item => {
      item['value']=0 
      return item
    }),
    muc8: seclectData.section8.data.map(item => {
      item['value']=0 
      return item
    }),
    muc9: seclectData.section9.data.map(item => {
      item['value']=0 
      return item
    }),
    muc10: seclectData.section10.data.map(item => {
      item['value']=0 
      return item
    }),
    muc11: seclectData.section11.data.map(item => {
      item['value']=0 
      return item
    }),
    status1: seclectData.section1.status,
    status2: seclectData.section2.status,
    status3: seclectData.section3.status,
    status4: seclectData.section4.status,
    status5: seclectData.section5.status,
    status6: seclectData.section6.status,
    status7: seclectData.section7.status,
    status8: seclectData.section8.status,
    status9: seclectData.section9.status,
    status10: seclectData.section10.status,
    status11: seclectData.section11.status
  }),
  components: {
    'nhaplieu-muc1': NhaplieuMuc1,
    'nhaplieu-muc2': NhaplieuMuc2,
    'nhaplieu-muc3': NhaplieuMuc3,
    'nhaplieu-muc4': NhaplieuMuc4,
    'nhaplieu-muc5': NhaplieuMuc5,
    'nhaplieu-muc6': NhaplieuMuc6,
    'nhaplieu-muc7': NhaplieuMuc7,
    'nhaplieu-muc8': NhaplieuMuc8,
    'nhaplieu-muc9': NhaplieuMuc9,
    'nhaplieu-muc10': NhaplieuMuc10,
    'nhaplieu-muc11': NhaplieuMuc11
  },
  created(){
    this.getDetail()
  },
  methods: {
    getDetail(){
      let vm = this
      if(vm.$route.query.action === "sua"){
        vm.getAPI().then(result => {
          vm.url = result['getDetailVmaAdministrativeViolation']+'&id='+ vm.$route.query.id
          axios.get(vm.url)
          .then((res) => {
            vm.violation = res.data
            vm.violation['decisionDate'] = vm.formatDate(res.data.decisionDate.substr(0,10))
            vm.violation['violationDate'] = vm.formatDate(res.data.violationDate.substr(0,10))
            vm.violation['officialDate'] = vm.formatDate(res.data.officialDate.substr(0,10))
            vm.violation['paymentDate'] = vm.formatDate(res.data.paymentDate.substr(0,10))
            vm.violation['documentaryDate'] = vm.formatDate(res.data.documentaryDate.substr(0,10))
            let metaData = JSON.parse(res.data.metaData)
            vm.muc1= metaData.section1.data
            vm.muc2= metaData.section2.data
            vm.muc3= metaData.section3.data
            vm.muc4= metaData.section4.data
            vm.muc5= metaData.section5.data
            vm.muc6= metaData.section6.data
            vm.muc7= metaData.section7.data
            vm.muc8= metaData.section8.data
            vm.muc9= metaData.section9.data
            vm.muc10= metaData.section10.data
            vm.muc11= metaData.section11.data
            vm.status1 = metaData.section1.status
            vm.status2 = metaData.section2.status
            vm.status3 = metaData.section3.status
            vm.status4 = metaData.section4.status
            vm.status5 = metaData.section5.status
            vm.status6 = metaData.section6.status
            vm.status7 = metaData.section7.status
            vm.status8 = metaData.section8.status
            vm.status9 = metaData.section9.status
            vm.status10 = metaData.section10.status
            vm.status11 = metaData.section11.status
          })
        })
      } else {
        vm.violation = {}
        vm.violation['decisionDate'] = vm.formatDate(vm.decisionDate)
        vm.violation['violationDate'] = vm.formatDate(vm.violationDate)
        vm.violation['officialDate'] = vm.formatDate(vm.officialDate)
        vm.violation['paymentDate'] = vm.formatDate(vm.paymentDate)
        vm.violation['documentaryDate'] = vm.formatDate(vm.documentaryDate)
      }
    },
    QuayLai () {
      this.$router.push({name: "quan-ly-vi-pham-hanh-chinh"});
    },
    formatDate (date) {
      if (!date) return null
      const [year, month, day] = date.split('-')
      return `${day}/${month}/${year}`
    },
    getAPI () {
      return new Promise((resolve, reject) => {
        $.ajax({
          url: '?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit',
          type: 'GET',
          data: {
          },
          dataType: 'json',
          success: function (data) {
            resolve(data)
          },
          error: function (request, error) {
            reject(error)
          }
        })
      })
    },
    Add () {
      var vm = this
      vm.getAPI().then(result => {
        vm.url = result['updateVmaAdministrativeViolation'] + '&LAN_CAP_MOI_DU_LIEU=LAN_CAP_MOI_DU_LIEU'
        if (this.violation.decisionNo === '') {
          return alert('đã tồn tại')
        } else {
          let metaData = {
            section1: {
              status: vm.status1,
              data: vm.muc1,
            },
            section2: {
              status: vm.status2,
              data: vm.muc2,
            },
            section3: {
              status: vm.status3,
              data: vm.muc3,
            },
            section4: {
              status: vm.status4,
              data: vm.muc4,
            },
            section5: {
              status: vm.status5,
              data: vm.muc5,
            },
            section6: {
              status: vm.status6,
              data: vm.muc6,
            },
            section7: {
              status: vm.status7,
              data: vm.muc7,
            },
            section8: {
              status: vm.status8,
              data: vm.muc8,
            },
            section9: {
              status: vm.status9,
              data: vm.muc9,
            },
            section10: {
              status: vm.status10,
              data: vm.muc10,
            },
            section11: {
              status: vm.status11,
              data: vm.muc11,
            }
          }
          let dataPost = new URLSearchParams()
          for (const key in this.violation) {
            if(this.violation[key] !== '' && typeof this.violation[key] != "undefined" && key !== 'metaData') {
              dataPost.append(key, this.violation[key])
            }
          }
          dataPost.append('paymentAmount', JSON.stringify(vm.paymentAmount)) 
          dataPost.append('metaData', JSON.stringify(metaData))
          
          axios.post(vm.url, dataPost, {
            headers: {
              'Content-Type': 'application/x-www-form-urlencoded',
            }
          })
          .then(() => {
            vm.$router.push({name: "quan-ly-vi-pham-hanh-chinh"});
          })
        }
      })
    },
    Delete () {
      var vm = this
      vm.getAPI().then(result => {
        vm.url = result['updateVmaAdministrativeViolation'] + '&LAN_XOA_DU_LIEU=LAN_XOA_DU_LIEU'
        let config = {
          params: this.violation
        }
        axios.get(vm.url, config)
        .then(() => {
         
        })
      })
    },
    Update () {
      var vm = this
      vm.getAPI().then(result => {
        vm.url = result['updateVmaAdministrativeViolation'] + '&LAN_SUA_DU_LIEU=LAN_SUA_DU_LIEU'
        if (this.violation.decisionNo === '') {
          return alert('đã tồn tại')
        } else {
          let metaData = {
            section1: {
              status: vm.status1,
              data: vm.muc1,
            },
            section2: {
              status: vm.status2,
              data: vm.muc2,
            },
            section3: {
              status: vm.status3,
              data: vm.muc3,
            },
            section4: {
              status: vm.status4,
              data: vm.muc4,
            },
            section5: {
              status: vm.status5,
              data: vm.muc5,
            },
            section6: {
              status: vm.status6,
              data: vm.muc6,
            },
            section7: {
              status: vm.status7,
              data: vm.muc7,
            },
            section8: {
              status: vm.status8,
              data: vm.muc8,
            },
            section9: {
              status: vm.status9,
              data: vm.muc9,
            },
            section10: {
              status: vm.status10,
              data: vm.muc10,
            },
            section11: {
              status: vm.status11,
              data: vm.muc11,
            }
          }
          let dataPost = new URLSearchParams()
          for (const key in this.violation) {
            if(this.violation[key] !== '' && typeof this.violation[key] != "undefined" && key !== 'metaData') {
              dataPost.append(key, this.violation[key])
            }
          }
          dataPost.append('paymentAmount', JSON.stringify(vm.paymentAmount)) 
          dataPost.append('metaData', JSON.stringify(metaData))          
          axios.post(vm.url, dataPost, {
            headers: {
              'Content-Type': 'application/x-www-form-urlencoded',
            }
          })
          .then(() => {
            vm.$router.push({name: "quan-ly-vi-pham-hanh-chinh"});
          })
        }
      })
    },
  },
  watch: {
    action(){
      this.getDetail()
    },
    id(){
      this.getDetail()
    },
    decisionDate (val) {
      this.violation.decisionDate = this.formatDate(val)
    },
    violationDate (val) {
      this.violation.violationDate = this.formatDate(val)
    },
    officialDate (val) {
      this.violation.officialDate = this.formatDate(val)
    },
    paymentDate (val) {
      this.violation.paymentDate = this.formatDate(val)
    },
    documentaryDate (val) {
      this.violation.documentaryDate = this.formatDate(val)
    }
  },
  computed: {
    action() {
      return this.$route.query.action;
    },
    id() {
      return this.$route.query.id;
    },
    paymentAmount(){
      let sum = 0
      this.muc1.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc2.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc3.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc4.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc5.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc6.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc7.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc8.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc9.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc10.forEach(e=>{
        sum+= parseInt(e.value)
      })
      this.muc11.forEach(e=>{
        sum+= parseInt(e.value)
      })
      return sum
    }
  }
}
</script>
<style>
.nhaplieu .flex.xs4{
    font-size: 15px;
}
.nhaplieu input{
    font-size: 13px !important;
    height: 25px !important;
    font: cursive!important;
}
.nhaplieu .v-select__slot:hover{
     
}
.nhaplieu .v-text-field__slot:hover{
     
}
.nhaplieu input:focus{
  outline: none!important;
}
.nhaplieu .v-menu__activator .v-input__slot{
  height: 25px !important;
}
.nhaplieu .input-group:hover{
     
}
.nhaplieu th{
    border: 1px solid #EEEEEE;
    color: black!important;
}
.nhaplieu td{
    border: 1px solid #EEEEEE;
    border-right: 1px solid #EEEEEE;
    border-bottom: none;
    border-top:  none;
}
.nhaplieu .pe{
  pointer-events: none;
}
.nhaplieu table.v-datatable td:nth-child(1) {
  width: 8%;
  padding: 0px ! important;
  text-align: center ! important;
}
.nhaplieu table.v-datatable td:nth-child(2) {
  width: 65%;
  padding: 0px ! important;
}
.nhaplieu table.v-datatable td:nth-child(3) {
  width: 15%;
 padding: 0px ! important;
}
.nhaplieu table.v-datatable td:nth-child(4) {
  width: 10%;
  padding: 0px ! important;
}
.nhaplieu .text-xs-right input {
  text-align: right;
}
.nhaplieu .v-date-picker-table .v-btn.v-btn--active {
  color: blue !important;
}
.nhaplieu .menu1 .v-menu__content{
  left: 508px !important;
  top: 35px !important;
}
.nhaplieu .menu2 .v-menu__content{
  left: 711px !important;
  top: 272px !important;
}
.nhaplieu .menu3 .v-menu__content{
  left: 215px !important;
  top: 300px !important;
}
.nhaplieu .menu4 .v-menu__content{
  left: 750px !important;
  top: 300px !important;
}
.nhaplieu .menu5 .v-menu__content{
  left: 700px !important;
  top: 420px !important;
}
.nhaplieu .menu6 .v-menu__content{
  left: 750px !important;
  top: 470px !important;
}
.nhaplieu .background-triangle-big {
  background-color: #3563c1;
  display: inline-block;
  padding: 11px 15px;
  width: auto;
  text-align: right;
  color: white;
  position: relative;
  margin-right: 20px;
  text-transform: uppercase;
  cursor: pointer;
}
.nhaplieu .background-triangle-small {
  background-color: #3563c1;
  display: inline-block;
  padding: 3px;
  width: 25px;
  text-align: right;
  color: white;
  position: relative;
  margin-right: 20px;
  text-transform: uppercase;
}

.nhaplieu .background-triangle-small + div.header_tools, .background-triangle-big + div.header_tools {
  width: -webkit-calc( 100% - 100% );
  width: calc(100% - 100% );
  align-items: center
}
.nhaplieu .background-triangle-big:before {
  content: "";
  position: absolute;
  top: 1px;
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  right: -4px;
  border-top: 28px solid #3563c1;
  border-left: 28px solid transparent;
  border-bottom: 28px solid transparent;
}
.nhaplieu .background-triangle-small:before {
  content: "";
  position: absolute;
  top: 1px;
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  right: -2px;
  border-top: 19px solid #3563c1;
  border-left: 19px solid transparent;
  border-bottom: 19px solid transparent
}
.nhaplieu .v-card__text{
  padding: 0px !important;
}
.nhaplieu .v-text-field__slot{
 
}
.input-crurency{
  border-bottom: 1px solid;
}
</style>