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
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/lenh_dieu_dong_on.png" alt="ldd" v-if="item.code === 'lenh_dieu_dong' && item.available"/>
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/lenh_dieu_dong_off.png" alt="ldd" v-else-if="item.code === 'lenh_dieu_dong' && !item.available"/>
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/giay_to_on.png" alt="gt" v-else-if=" (item.code === 'NC_23' || item.code === 'NC_24' || item.code === 'NC_25' || item.code === 'NC_2014' || item.code === 'NC_2018') && item.available"/>
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/giay_to_off.png" alt="gt" v-else-if=" (item.code === 'NC_23' || item.code === 'NC_24' || item.code === 'NC_25' || item.code === 'NC_2014' || item.code === 'NC_2018') && !item.available"/>
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/folder_on.png" alt="bk" v-else-if="item.available"/>
                <img style="margin-left: -5px;" src="/hang-hai-npm-theme/images/folder_off.png" alt="bk" v-else-if="!item.available"/>
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

    <div class="row-header" style="height: 38px;overflow: hidden;">
      <div class="background-triangle-big" :to="'/ho-so-phuong-tien/' + type + '/' + document_name + '/' + document_year + '/' + document_type_code"> QUẢN LÝ TÀU BIỂN </div>
      <div class="layout row wrap header_tools row-blue">
      </div>
    </div>
    
    <div class="flex xs12">
      <v-list> 
        
        <v-list-tile v-for="(subItem, subIndex) in itemsTauBien['items']"
            v-bind:key="subIndex"
            :disabled="subItem['available'] === false"
            :style="{'background': (thanhPhanSelected===subItem.type) ? '#dcdada' : ''}"
            :class='{"list--group__header--active": (thanhPhanSelected===subItem.type)}'
            @click="selectThanhPhanTauBien(subItem, subIndex)"
        >

            <v-list-tile-action style="padding-left: 12px;"> 
              <img src="/hang-hai-npm-theme/images/folder_on.png" alt="gt"/>
            </v-list-tile-action>

            <v-list-tile-content> 
              <v-list-tile-title> {{ subItem.title }} </v-list-tile-title>  
              <span v-if="subItem.counter > -1 && subItem.type !== 'DanhSachTauDenCang' && subItem.type !== 'DanhSachTauDiChuyen'" class="status__counter">
                {{subItem.counter}}
              </span>
              <span v-else-if="subItem.type !== 'DanhSachTauDenCang' && subItem.type !== 'DanhSachTauDiChuyen'" class="status__counter">
                <v-progress-circular :width="1" :size="16" indeterminate color="red"></v-progress-circular>
              </span>
            </v-list-tile-content>
            <v-list-tile-action v-if="subItem.type === 'DanhSachTauDenCang' && subItem.type === 'DanhSachTauDiChuyen'">
              <v-icon color="primary" v-if="subItem['available']">done</v-icon>
              <v-icon class="orange--text" v-else>warning</v-icon>
            </v-list-tile-action>
        </v-list-tile>

        <!-- <v-list-group :value="itemsTauBien['id_active']" 
          v-bind:key="itemsTauBien['id_active']">
          <v-list-tile slot="activator" :to="'/ho-so-phuong-tien/' + type + '/' + document_name + '/' + document_year + '/' + document_type_code">
            <v-list-tile-action style="padding-left: 12px;"> 
              <img src="/hang-hai-npm-theme/images/folder_on.png" alt="gt"/>
            </v-list-tile-action>
            <v-list-tile-content>
              <v-list-tile-title>{{ itemsTauBien.title }}</v-list-tile-title>
              <span class="status__counter">{{ itemsTauBien.counter }}</span> 
            </v-list-tile-content>
          </v-list-tile>

          <v-list-tile v-for="(subItem, subIndex) in itemsTauBien['items']"
            v-bind:key="subIndex"
            :to="{path: '/ho-so-phuong-tien/' + type + '/' + document_name + '/' + document_year + '/' + document_type_code + '/' + subItem.type, 
                  query: {
                    'page': 1
                  }
                  }">

            <v-list-tile-action style="padding-left: 12px;"> 
              <img src="/hang-hai-npm-theme/images/folder_on.png" alt="gt"/>
            </v-list-tile-action>

            <v-list-tile-content> 
              <v-list-tile-title> {{ subItem.title }} </v-list-tile-title>  
              <span v-if="subItem.counter > -1" class="status__counter">
                {{subItem.counter}}
              </span>
              <span v-else class="status__counter">
                <v-progress-circular :width="1" :size="16" indeterminate color="red"></v-progress-circular>
              </span>
            </v-list-tile-content>

          </v-list-tile>

        </v-list-group>  -->
      </v-list>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
const COMPONENT_NAME = 'jx-hanghai-detail-part'
import { eventBus } from '../../event-bus/eventBus.js'
import support from '../../store/support.json'

export default {
  name: COMPONENT_NAME,
  props: {
    name: String,
    group_id: 0,
    thanh_phan_ho_so_api: '',
    detail_ho_so: {},
    type: '',
    document_type_code: '',
    document_status_code: '',
    document_name: '',
    document_year: 0
  },
  computed: {
    loadingInitData () {
      return this.$store.getters.loadingInitData
    }
  },
  created () {
    var vm = this
    vm.loadItineraryNo()
    eventBus.$on('selectTPTauBien', vm.changeThanhPhanSelected)
  },
  destroyed () {
    var vm = this
    eventBus.$off('selectTPTauBien', vm.changeThanhPhanSelected)
  },
  data () {
    return {
      thanhPhanLists: [],
      thanhPhanSelected: '',
      loadingList: true,
      messageTypeTemp: 0,
      itemsTauBien: support.filter_part_tau
    }
  },
  methods: {
    changeThanhPhanSelected: function (data) {
      var vm = this
      console.log('changeThanhPhanSelected++++++++++++++++', data)
      vm.thanhPhanSelected = data
    },
    loadItineraryNo: function () {
      var vm = this
      let param = {
        documentName: vm.document_name,
        documentYear: vm.document_year,
        type: vm.type
      }
      vm.$store.dispatch('loadItineraryNo', param)
    },
    loadRoleFilterStatus: function () {
      var vm = this
      let filter = {
        documentType: vm.document_type_code
      }
      vm.$store.getters.roleFilterStatus(filter).then(function (result) {
        // if (result && Array.isArray(result)) {
        //   for (var i = 0; i < result.length; i++) {
        //     if (result[i].id_active === 'quan_ly_tau') {
        //       vm.itemsTauBien = result[i]
        //       // vm.doTauBienFilterCount()
        //     }
        //   }
        // }
      })
    },
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
      vm.loadRoleFilterStatus()
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
            vm.checkAvailableKhDenCang()
          })
          .catch(function (error) {
            console.log(error)
            vm.loadingList = false
          })
      }
      // vm.doTauBienFilterCount()
    },
    doTauBienFilterCount () {
      let vm = this
      vm.loadingInitData.then(function (result) {
        var listDS = vm.itemsTauBien.items
        for (var i = 0; i < listDS.length; i++) {
          let item = listDS[i]
          let param = null
          param = {
            start: 0,
            end: 5,
            url: result[item.url]
          }
          vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
            result['total'] = result['total'] ? result['total'] : 0
            vm.changeCounter(i, result.total)
          })
        }
      })
    },
    changeCounter (index, total) {
      var vm = this
      console.log('index++++++++++', index)
      console.log('vm.itemsTauBien.items[i]++++++++', vm.itemsTauBien.items)
      vm.itemsTauBien.items[index]['counter'] = total
    },
    checkAvailableKhDenCang () {
      var vm = this
      let available = true
      if (vm.thanhPhanLists.length) {
        for (var i = 0; i < vm.thanhPhanLists.length; i++) {
          if (vm.thanhPhanLists[i].code === 'NC_3') {
            vm.itemsTauBien['items'].forEach(function (item) {
              if (item.type === 'DanhSachTauDenCang') {
                item['available'] = vm.thanhPhanLists[i].available
              }
            })
            available = vm.thanhPhanLists[i].available
          }
        }
      }
      console.log('available+++++++++++', available)
      return available
    },
    selectThanhPhanTauBien: function (item, index) {
      var vm = this
      vm.thanhPhanSelected = item.type
      if (item.type === 'DanhSachTauDenCang' || vm.type === 'DanhSachTauDiChuyen') {
        if (item['state'] === 1 && item['available']) {
          vm.$router.push({
            path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.document_name + '/' + vm.document_year + '/' + vm.document_type_code + '/' + item.type
          })
        } else {
          vm.$router.push({
            path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.document_name + '/' + vm.document_year + '/' + vm.document_type_code + '/DanhSachTauDenCang'
          })
        }
      } else {
        vm.$router.push({
          path: '/ho-so-phuong-tien/' + vm.type + '/' + vm.document_name + '/' + vm.document_year + '/' + vm.document_type_code + '/' + item.type
        })
      }
    },
    selectThanhPhan: function (item, index, event) {
      var vm = this
      vm.thanhPhanSelected = item.code
      setTimeout(() => {
        if (item.available || (item.code === 'NC_23' || item.code === 'NC_24' || item.code === 'NC_25' || item.code === 'NC_2014')) {
          let requestCodeView = 0
          if (item.requestCode.length > 0) {
            requestCodeView = item.requestCode
          }
          let orginURL = window.location.href
          let coma = window.location.href.lastIndexOf('#/')
          if (coma > 0) {
            orginURL = window.location.href.substr(0, coma)
          }
          if (item.messageType === 23 || item.messageType === '23') {
            if ((event.metaKey || event.ctrlKey) && event.type === 'click') {
              window.open(orginURL + '#/ho-so/' + this.type + '/' + this.document_name + '/' + this.document_year + '/' + this.document_type_code + '/' + this.document_status_code + '/' + item.messageType + '/' + requestCodeView + '/' + item.state + '?title=' + item.name)
            } else {
              location.replace(orginURL + '#/ho-so/' + this.type + '/' + this.document_name + '/' + this.document_year + '/' + this.document_type_code + '/' + this.document_status_code + '/' + item.messageType + '/' + requestCodeView + '/' + item.state + '?title=' + item.name)
            }
          } else {
            if ((event.metaKey || event.ctrlKey) && event.type === 'click') {
              window.open(orginURL + '#/ho-so/' + this.type + '/' + this.document_name + '/' + this.document_year + '/' + this.document_type_code + '/' + this.document_status_code + '/' + item.messageType + '/' + requestCodeView + '/' + item.state + '?title=' + item.name)
            } else {
              vm.$router.push({ path: '/ho-so/' + this.type + '/' + this.document_name + '/' + this.document_year + '/' + this.document_type_code + '/' + this.document_status_code + '/' + item.messageType + '/' + requestCodeView + '/' + item.state,
                query: {
                  title: item.name
                }
              })
            }
          }
        } else {
          alert('Không có ' + item.name + ' !')
        }
      }, 200)
    }
  }
}
</script>
