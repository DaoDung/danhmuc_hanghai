<template>
  <div style="width: 100%; position: relative;">
    <div class="row-header" style="height: 38px;overflow: hidden;">
      <div class="background-triangle-big" @click="backtolistpdf()"> THÀNH PHẦN HỒ SƠ </div>
      <div class="layout row wrap header_tools row-blue">
      </div>
    </div>
    
    <div v-if="loadingList">
      <content-placeholders>
        <content-placeholders-text :lines="14" />
      </content-placeholders>
    </div>
    <ul class="list thanh_phan_hoso pr-2">
      <li class="list--group__container" v-for="(item, index) in thanhPhanLists" v-bind:key="item.code">
        <ul class="list--group__header" :index="index" :class='{"list--group__header--active": (thanhPhanSelected===item.code)}' @click.stop.prevent="selectThanhPhan(item, index, $event)">
          <li>
            <a class="list__tile list__tile--link">
              <div class="list__tile__action pl-3">
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/lenh_dieu_dong_on.png" alt="ldd" />
              </div>
              <div class="list__tile__content">
                <div class="list__tile__title">
                  {{item.name}}
                </div>
              </div>
              <div class="list__tile__action" v-if="item.state == 1 && item.available">
                <v-icon color="primary">done</v-icon>
              </div>
              <div class="list__tile__action" v-else-if="item.state == 0">
                <v-icon class="orange--text">warning</v-icon>
              </div>
            </a>
          </li>
        </ul>
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios'
const COMPONENT_NAME = 'jx-hanghai-detail-part'
import { eventBus } from '../../event-bus/eventBus.js'

export default {
  name: COMPONENT_NAME,
  props: {
    name: String,
    group_id: 0,
    thanh_phan_ho_so_api: '',
    detail_ho_so: {},
    type: '',
    code: '',
    document_type_code: '',
    document_name: '',
    document_year: 0
  },
  data () {
    return {
      thanhPhanLists: [],
      thanhPhanSelected: '',
      loadingList: true,
      messageTypeTemp: 0
    }
  },
  methods: {
    backtolistpdf: function () {
      this.thanhPhanSelected = 0
      this.$router.push({ path: '/ho-so/' + this.type + '/' + this.document_name + '/' + this.document_year + '/' + this.document_type_code + '/' + this.document_status_code,
        query: {
          'renew': Math.floor(Math.random() * (10 - 1 + 1)) + 1
        }
      })
    },
    reloadThanhPhanParam: function (url) {
      let vm = this
      let currentParams = vm.$router.history.current.params
      if (currentParams.hasOwnProperty('messageType')) {
        vm.messageTypeTemp = currentParams.messageType
      }
      vm.thanh_phan_ho_so_api = url
      vm.reloadThanhPhan()
    },
    reloadThanhPhan: function () {
      var vm = this
      vm.thanhPhanLists = []
      if (vm.thanh_phan_ho_so_api !== '') {
        let config = {
          params: {
            'documentType': vm.document_type_code,
            'documentName': vm.document_name,
            'documentYear': vm.document_year,
            'roleUserFilterselectedType': -1
          }
        }
        if (vm.type !== 'ke_hoach') {
          config.params.roleUserFilterselectedType = 0
        }
        vm.loadingList = true
        axios
          .get(vm.thanh_phan_ho_so_api, config)
          .then(function (response) {
            var serializable = response.data
            vm.thanhPhanLists = serializable
            eventBus.$emit('thanhphanlist', vm.thanhPhanLists)
            vm.loadingList = false
          })
          .catch(function (error) {
            console.log(error)
            vm.loadingList = false
          })
      }
    },
    selectThanhPhan: function (item, index, event) {
      var vm = this
      vm.thanhPhanSelected = item.code
      setTimeout(() => {
      }, 200)
    }
  }
}
</script>
