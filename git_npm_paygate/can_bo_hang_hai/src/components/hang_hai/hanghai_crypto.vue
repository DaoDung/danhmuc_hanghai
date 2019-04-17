<template>
  <div style="width: 100%; position: relative;">
    <v-form v-model="extvaild" ref="extform">
      <div>
        <v-layout wrap>
          <v-flex xs12 sm2>
            Người ký <span class="red--text text--darken-3">*</span>:
          </v-flex>
          <v-flex xs12 sm4>
            {{canBoPheDuyet}}
          </v-flex>
          <v-flex xs12 sm6>
            
          </v-flex>
          
          <v-flex xs12 sm2>
            Ngày ký <span class="red--text text--darken-3">*</span>:
          </v-flex>
          <v-flex xs12 sm4>
            {{dateSign | moment("DD/MM/YYYY | HH:mm")}}
          </v-flex>
          <v-flex xs12 sm6>
            
          </v-flex>

          <v-flex xs12 sm2>
            Địa điểm ký <span class="red--text text--darken-3">*</span>:
          </v-flex>
          <v-flex xs12 sm4>
            <v-text-field
              v-model="signLocation"
              :rules="[v => !!v || 'địa điểm ký bắt buộc phải nhập']"
              required
            ></v-text-field>
          </v-flex>
          <v-flex xs12 sm6>
            
          </v-flex>
        </v-layout>
        
        <v-card-actions>
          <v-btn color="primary" v-on:click.native="callActionThuTucAllInOneURL(detail, messagetype, actiontype, -1, true, 0)"
            :loading="loading_process_btn"
            :disabled="loading_process_btn"
          >
            Xác nhận
            <span slot="loader">Loading...</span>
          </v-btn>
        </v-card-actions>
      </div>
    </v-form>
  </div>
</template>

<script>
const COMPONENT_NAME = 'jx-hanghai-crypto'

export default {
  name: COMPONENT_NAME,
  props: {
    name: String,
    detail: {
      canBoPheDuyet: '',
      signLocation: ''
    },
    messagetype: 0,
    actiontype: 0,
    computerhash: '',
    canBoPheDuyet: '',
    signLocation: ''
  },
  data () {
    return {
      loading_process_btn: false,
      pluginValid: false,
      sign: null,
      signFieldName: '',
      filePath: '',
      msgKey: 'error',
      cryptoFlag: 2,
      customMessage: '',
      dateSign: new Date()
    }
  },
  methods: {
    bindData (documentTypeCode, documentName, documentYear, type) {
      let vm = this
      let config = {
        'documentType': documentTypeCode,
        'documentName': documentName,
        'documentYear': documentYear,
        'type': type
      }
      vm.$store.dispatch('loadDetailHoSo', config).then(function (result) {
        vm.detail = result
        if (vm.detail !== null && vm.detail !== undefined && vm.detail !== 'undefined') {
          vm.canBoPheDuyet = vm.detail.canBoPheDuyet
          vm.signLocation = vm.detail.signLocation
        }
      })
    },
    doValidate () {
      let vm = this
      let result = false
      if (vm.$refs.extform.validate()) {
        result = true
      }
      return result
    },
    callActionThuTucAllInOneURL: function (item, messageType, actionType, desStatus, isConfirm, returnState) {
      let vm = this
      let config = {
        item: item,
        messageType: messageType,
        actionType: actionType,
        desStatus: desStatus,
        isConfirm: isConfirm,
        returnState: returnState,
        sign: vm.sign,
        signFieldName: vm.signFieldName,
        filePath: vm.filePath,
        signLocation: vm.signLocation
      }
      vm.$emit('kyso-submit-func', config)
    }
  }
}
</script>
