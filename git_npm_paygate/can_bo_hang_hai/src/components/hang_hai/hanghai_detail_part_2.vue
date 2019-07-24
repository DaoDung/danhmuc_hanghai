<template>
  <div style="width: 100%; position: relative;">
    <div class="row-header" style="height: 38px;overflow: hidden;">
      <div class="background-triangle-big" @click="toDetail()"> THÀNH PHẦN HỒ SƠ </div>
      <div class="layout row wrap header_tools row-blue">
      </div>
    </div>
    
    <div v-if="loadingList">
      <content-placeholders>
        <content-placeholders-text :lines="14" />
      </content-placeholders>
    </div>
    <ul class="list thanh_phan_hoso">
      <li class="list--group__container" v-for="(item, index) in thanhPhanLists" v-bind:key="item.code">
        <ul class="list--group__header" :index="index" :class='{"list--group__header--active": (thanhPhanSelected === item.code)}' @click.stop.prevent="selectThanhPhan(item, index, $event)">
          <li>
            <a class="list__tile list__tile--link">
              <div class="list__tile__action pl-3">
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/folder_on.png" alt="ldd" />
              </div>
              <div class="list__tile__content">
                <div class="list__tile__title">
                  {{item.name}}
                </div>
              </div>
              <div class="list__tile__action">
                <!-- <v-icon color="primary">done</v-icon> -->
              </div>
            </a>
          </li>
        </ul>
      </li>
    </ul>
  </div>
</template>

<script>
// import axios from 'axios'
import support from '../../store/support.json'
const COMPONENT_NAME = 'jx-hanghai-detail-part'
// import { eventBus } from '../../event-bus/eventBus.js'

export default {
  name: COMPONENT_NAME,
  props: {
    type: '',
    documentTypeCode: '',
    documentStatusCode: '',
    id: '',
    code: ''
  },
  computed: {
    thanhPhanLists () {
      var vm = this
      if (vm.code === 'DanhSachTauBien') {
        console.log(support.TPHS_ThongTinTauBien)
        return support.TPHS_ThongTinTauBien
      } else if (vm.code === 'DanhSachPhuongTienThuyNoiDia') {
        return support.TPHS_ThongTinPTTND
      } else {
        return support.TPHS_ThongTinTauBien
      }
    }
  },
  data () {
    return {
      thanhPhanSelected: '',
      loadingList: false,
      messageTypeTemp: 0
    }
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
      // vm.loadThanhPhanTauBien()
    })
  },
  methods: {
    loadThanhPhanTauBien: function () {
      var vm = this
      vm.loadingList = true
      vm.$store.dispatch('loadThanhPhanTauBien', {}).then(function (result) {
        vm.thanhPhanLists = result
        vm.loadingList = false
      }).catch(function (xhr) {
        console.log(xhr)
      })
    },
    toDetail: function () {
      var vm = this
      vm.$router.push({
        path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.id + '/' + vm.code + '/detail'
      })
    },
    selectThanhPhan: function (item, index, event) {
      var vm = this
      vm.thanhPhanSelected = item.code
      vm.$router.push({
        path: '/tau-bien/' + vm.type + '/' + vm.documentTypeCode + '/' + vm.documentStatusCode + '/' + vm.id + '/' + vm.code + '/' + item.code
      })
      setTimeout(() => {
      }, 200)
    }
  }
}
</script>
