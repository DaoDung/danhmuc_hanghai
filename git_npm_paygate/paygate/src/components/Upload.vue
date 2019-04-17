<template>
  <div>
    <content-placeholders class="mt-3" v-if="false">
      <content-placeholders-text :lines="1" />
    </content-placeholders>
    <v-layout v-else row>
      <v-flex xs12 sm8 offset-sm2 mt-5>
        <v-card>
          <nav class="toolbar theme--dark blue darken-2">
            <div class="toolbar__content" style="height: 64px;">
              <div>
                <span>CỔNG THANH TOÁN DVC TRỰC TUYẾN TÀU THUYỀN VÀO, RỜI CẢNG BIỂN </span>
                <br>
                <strong style="text-transform: uppercase;">Cục Hàng Hải Việt Nam - Bộ Giao Thông Vận Tải</strong>
              </div>
              <div class="spacer"></div>
            </div>
          </nav>
          <div class="list list--two-line">
            <v-layout v-if="false /*!payment.message*/" wrap>
              <v-flex xs12 class="text-center">
                Phiếu thanh toán không hợp lệ
              </v-flex>
            </v-layout>
            <v-layout v-else wrap>
              <v-flex xs12 sm7>
                <v-layout wrap>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Tên hồ sơ: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.documentName}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Năm đăng ký hồ sơ: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.documentYear}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Mã số thuế doanh nghiệp: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.userCreated}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Cơ quan yêu cầu nộp phí: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.maritimecode}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Ngày thông báo nộp phí: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.reportDate | moment("DD/MM/YYYY")}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Nội dung yêu cầu nộp phí: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.content}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Số chứng từ: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>{{payment.debitnotenumber}}</v-subheader>
                  </v-flex>

                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader v-else>Tổng tiền: </v-subheader>
                  </v-flex>
                  <v-flex xs12 sm6>
                    <content-placeholders class="mt-1" v-if="false">
                      <content-placeholders-text :lines="1" />
                    </content-placeholders>
                    <v-subheader class="red--text text--darken-3" v-else>{{payment.fee}}</v-subheader>
                  </v-flex>

                </v-layout>
              </v-flex>
              <v-flex xs12 sm5 class="pr-2">
                <file-pond v-if="showFileUpload"
                  name="test"
                  ref="pond"
                  label-idle="<strong>ĐÍNH KÈM TỆP CHỨNG TỪ</strong> </br> Kéo thả hoặc tải lên... </br> Chứng từ thanh toán cho chuyển khoản là giấy yêu cầu nộp tiền vào ngân hàng hoặc hoá đơn chứng nhận giao dịch chuyển khoản được sinh ra"
                  allow-multiple="false"
                  accepted-file-types="image/jpeg, image/png"
                  :server="support.uploadURL + '&_paygateaction_WAR_TichHopGiaoThongportlet_idDebit=' + id + '&p_auth=' + payment.auth"
                  v-bind:files="myFiles"
                  v-on:init="handleFilePondInit"/>
              </v-flex>
            </v-layout>
            <v-layout wrap>
              <v-flex class="text-center mt-4">
                <v-btn :to="'/payment/' + id + '/' + documentname + '/' + documentyear + '/' + maritimecode">
                  <v-icon size="16">undo</v-icon> &nbsp;
                  Quay lại
                </v-btn>
                <v-btn color="primary" v-on:click.native="sendBaoNop"
                  :loading="loadingBtn"
                  :disabled="loadingBtn"
                >
                  <v-icon size="16">send</v-icon> &nbsp;
                  Gửi báo nộp chuyển khoản 
                </v-btn>
              </v-flex>
            </v-layout>
          </div>
        </v-card>
      </v-flex>
    </v-layout>
  </div>
</template>

<script>
import toastr from 'toastr'
import axios from 'axios'
import support from '../store/support.json'
// Import Vue FilePond
import vueFilePond from 'vue-filepond'

// Import FilePond styles
import 'filepond/dist/filepond.min.css'

// Import image preview plugin styles
import 'filepond-plugin-image-preview/dist/filepond-plugin-image-preview.min.css'

// Import image preview and file type validation plugins
import FilePondPluginFileValidateType from 'filepond-plugin-file-validate-type'
import FilePondPluginImagePreview from 'filepond-plugin-image-preview'

// Create component
const FilePond = vueFilePond(FilePondPluginFileValidateType, FilePondPluginImagePreview)

export default {
  props: ['id', 'documentname', 'documentyear', 'maritimecode'],
  data: () => ({
    loadingBtn: false,
    myFiles: [],
    showFileUpload: true,
    support: support,
    payment: {}
  }),
  components: {
    FilePond
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
      let param = {
        id: vm.id,
        documentname: vm.documentname,
        documentyear: vm.documentyear,
        maritimecode: vm.maritimecode
      }
      vm.$store.dispatch('loadInitResource', param).then(function (result) {
        vm.payment = result
      })
    })
  },
  methods: {
    handleFilePondInit: function () {
      console.log('FilePond has initialized')
    },
    handleFilePondProcessfile: function (error, file) {
      console.log('FilePond succesfully processed file' + file)
      console.log('FilePond succesfully processed file error' + error)
    },
    sendBaoNop () {
      let vm = this
      vm.loadingBtn = true
      let formData = new FormData()
      formData.append('idDebit', vm.id)

      axios.post(support.baoNopURL + '&p_auth=' + vm.payment.auth, formData, {
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      }).then(function (reponse) {
        console.log('upload file success!')
        vm.loadingBtn = false
        toastr.success('Báo nộp chuyển khoản của bạn được thực hiện thành công.')
      }).catch(function (xhr) {
        console.log(xhr)
        vm.loadingBtn = false
      })
    }
  }
}
</script>
