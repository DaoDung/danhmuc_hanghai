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
          <div class="list list--two-line mt-3">
            <v-layout v-if="!payment.message" wrap>
              <v-flex xs12 class="text-center">
                Phiếu thanh toán không hợp lệ
              </v-flex>
            </v-layout>
            <v-layout v-else wrap>
              <div v-if="payment.thanhToanDone" style="width: 100%;text-align: center;">
                Hồ sơ: {{documentname}} đã thực hiện thanh toán trực tuyến qua KeyPay
              </div>
              <div v-else class="layout wrap">
                <v-flex xs12 sm6 class="text-center">
                  <v-btn :href="payment.keyPayURL">
                    <v-icon size="16">credit_card</v-icon> &nbsp;
                    Thanh toán trực tuyến
                  </v-btn>
                </v-flex>
                <v-flex xs12 sm6 class="text-center">
                  <v-btn :to="'/payment/' + id + '/' + documentname + '/' + documentyear + '/' + maritimecode + '/upload'">
                    <v-icon size="16">add_photo_alternate</v-icon> &nbsp;
                    Báo nộp chuyển khoản
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
export default {
  props: ['id', 'documentname', 'documentyear', 'maritimecode'],
  data: () => ({
    payment: {}
  }),
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
    keypayURL () {
      console.log(this.documentname)
      console.log(this.documentyear)
      console.log(this.maritimecode)
    }
  }
}
</script>
