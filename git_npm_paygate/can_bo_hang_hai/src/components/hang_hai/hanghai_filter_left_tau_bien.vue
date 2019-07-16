<template>
  <div style="width: 100%; position: relative;">
    <v-layout v-if="type === 'ke_hoach' || type === 'thu_tuc'">
      <v-flex>
        <v-select
          v-model="documentType"
          autocomplete
          :items="doc_typesSelect"
          return-object
          item-text="name"
          item-value="code"
          @change="changeDocumentFilter($event)"
        ></v-select>
      </v-flex>
      <v-flex v-if="!payment">
        <v-btn icon class="mx-0 my-0 grey lighten-2" v-on:click.native="filterLeftSearch">
          <v-icon>search</v-icon>
        </v-btn>
      </v-flex>
    </v-layout>
    <v-text-field
      v-model="shipName"
      placeholder="Tên tàu"
    ></v-text-field>
    <v-text-field
      v-model="maBanKhai"
      placeholder="Mã bản khai"
    ></v-text-field>
    <v-text-field
      v-model="callSign"
      placeholder="Hô hiệu/ Số đăng ký"
    ></v-text-field>

    <div class="flex xs12">
      <!-- <div v-if="document_type_code == 0">
        <v-list-tile v-for="(item, index) in doc_types"
          v-bind:key="index"
          :to="{path: '/danh-sach-ho-so/' + type + '/' + item.code + '/' + 0, 
          query: {
            'shipName': shipName,
            'maBanKhai': maBanKhai,
            'callSign': callSign,
            'page': 1
          }
          }">

          <v-list-tile-action> 
            <v-icon color="primary">description</v-icon>
          </v-list-tile-action>

          <v-list-tile-content> 
            <v-list-tile-title> {{ item.name }} </v-list-tile-title>  
            <span :id="'tt_count_'+item.code" class="status__counter">
              <v-progress-circular :width="1" :size="16" indeterminate color="red"></v-progress-circular>
            </span>
          </v-list-tile-content>

        </v-list-tile>
      </div> -->

      <v-list class="py-0 nav_trang_thai_ho_so"> 
        <v-list-group :value="role_filter_status.id_active" 
          v-bind:key="index">
          <v-list-tile slot="activator" :to="'/quan-ly-tau-bien/' + type + '/' + document_type_code + '/' + document_status_code + '/DanhSachTauBien'">
            <v-list-tile-action> 
              <v-icon color="primary">{{ role_filter_status.action }}</v-icon> 
            </v-list-tile-action>
            <v-list-tile-content>
              <v-list-tile-title>{{ role_filter_status.title }}</v-list-tile-title>
              <span class="status__counter">{{ role_filter_status.counter }}</span> 
            </v-list-tile-content>
          </v-list-tile>

          <v-list-tile v-for="(subItem, subIndex) in role_filter_status.items"
            v-bind:key="subIndex" @click="changeHeader(subItem)"
            :to="{path: '/quan-ly-tau-bien/' + type + '/' + document_type_code + '/' + document_status_code + '/' + subItem.type, 
                  query: {
                    'page': 1
                  }
                  }">

            <v-list-tile-action> 
             <v-icon v-if="subItem.code == document_status_code">play_arrow</v-icon>
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

        </v-list-group> 
      </v-list>
    </div>

  </div>
</template>

<script>
import axios from 'axios'
import support from '../../store/support.json'
import router from '@/router'
const COMPONENT_NAME = 'jx-hanghai-filter-left'

export default {
  name: COMPONENT_NAME,
  props: {
    id: '',
    name: String,
    group_id: 0,
    document_type_api: '',
    role_filter_api: '',
    type: '',
    document_type_code: '',
    document_status_code: '',
    count_ho_so_api: '',
    counter_tau_bien_ke_hoach_table: '',
    counter_tau_bien_thu_tuc_table: ''
  },
  computed: {
    loadingInitData () {
      return this.$store.getters.loadingInitData
    }
  },
  data () {
    return {
      documentType: {},
      shipName: '',
      maBanKhai: '',
      callSign: '',
      doc_typesSelect: [],
      doc_types: [],
      loading: true,
      isThuTuc: false,
      payment: false,
      initDataFilter: {},
      activeIndex: 0,
      role_filter_status: support.role_filter_status_ke_hoach
    }
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
      vm.$store.dispatch('loadInitResource').then(function (result) {
        let initData = result
        vm.initDataFilter = result
        vm.isThuTuc = initData.user.isThuTuc
      })
      let query = vm.$router.history.current.query
      if (query.hasOwnProperty('daKy') && query.daKy) {
        vm.activeIndex = 1
      }
    })
  },
  watch: {
    '$route': function (newRoute, oldRoute) {
      let vm = this
      let query = newRoute.query
      if (query.hasOwnProperty('payment') && query.payment) {
        vm.payment = true
      } else {
        vm.payment = false
      }
    },
    type: function (val) {
      let vm = this
      if (val === 'ke_hoach') {
        vm.role_filter_status = support.role_filter_status_ke_hoach
      } else {
        vm.role_filter_status = support.role_filter_status_thu_tuc
      }
    }
  },
  methods: {
    toReloadListData (typeData) {
      let vm = this
      vm.activeIndex = 0
      router.push({path: '/danh-sach-ho-so/' + typeData + '/0/0',
        query: {
          'renew': Math.floor(Math.random() * (10 - 1 + 1)) + 1,
          'shipName': vm.shipName,
          'maBanKhai': vm.maBanKhai,
          'callSign': vm.callSign,
          'page': 1
        }
      })
    },
    toReloadListDataDKS (typeData) {
      let vm = this
      vm.activeIndex = 1
      router.push({path: '/danh-sach-ho-so/' + typeData + '/0/0',
        query: {
          'renew': Math.floor(Math.random() * (10 - 1 + 1)) + 1,
          'shipName': vm.shipName,
          'maBanKhai': vm.maBanKhai,
          'callSign': vm.callSign,
          'daKy': true,
          'page': 1
        }
      })
    },
    doInitUpdate () {
      let vm = this
      vm.loading = true
      vm.doc_types = vm.$parent.$parent.docTypes
      let query = vm.$router.history.current.query
      vm.maBanKhai = query['maBanKhai']
      vm.shipName = query['shipName']
      vm.callSign = query['callSign']
      if (vm.doc_typesSelect.length === 0) {
        vm.doc_typesSelect = Array.from(vm.doc_types)
        vm.doc_typesSelect.unshift({
          'code': '0',
          'name': 'Toàn bộ thủ tục',
          'typeCode': '0'
        })
        if (vm.document_type_code === '0') {
          vm.documentType = vm.doc_typesSelect[0]
        } else {
          for (let key in vm.doc_typesSelect) {
            if (vm.doc_typesSelect[key]['code'] === vm.document_type_code) {
              vm.documentType = vm.doc_typesSelect[key]
            }
          }
        }
      }
      if (this.document_type_code === '0') {
        setTimeout(() => {
          this.doCounterHoSo()
        }, 200)
      }
      vm.loading = false
    },
    filterLeftSearch: function () {
      let vm = this
      router.push({
        path: '/danh-sach-ho-so/' + vm.type + '/' + vm.document_type_code + '/' + vm.document_status_code,
        query: {
          'shipName': vm.shipName,
          'maBanKhai': vm.maBanKhai,
          'callSign': vm.callSign,
          'page': 1
        }
      })
      if (vm.document_type_code === '0') {
        vm.doCounterHoSo()
      }
      if (vm.type === 'ke_hoach') {
        vm.doTauBienKeHoachFilterCount()
      } else if (vm.type === 'thu_tuc') {
        vm.doTauBienThuTucFilterCount()
      }
    },
    changeDocumentFilter: function (data) {
      this.shipName = ''
      this.maBanKhai = ''
      this.callSign = ''
      router.push('/danh-sach-ho-so/' + this.type + '/' + data.code + '/0')
    },
    doCounterHoSo () {
      let vm = this
      axios.get(vm.count_ho_so_api, {
        params: {
          'shipName': vm.shipName !== '' ? encodeURIComponent(vm.shipName) : '',
          'maBanKhai': vm.maBanKhai,
          'callSign': vm.callSign,
          'isDTND': vm.initDataFilter.user.isDTND,
          'isDTNDCam': vm.initDataFilter.user.isDTNDCam
        }
      }).then(function (response) {
        var serializable = response.data
        for (var key in serializable) {
          var idCounter = 'tt_count_' + serializable[key]['code']
          var idCounterEl = document.getElementById(idCounter)
          if (idCounterEl != null) {
            idCounterEl.innerHTML = serializable[key]['total']
          }
        }
      }).catch(function (error) {
        console.log(error)
      })
    },
    // fillCounterToMenu (rootIndex, childIndex, counter) {
    //   if (this.type === 'thu_tuc') {
    //     rootIndex = 1
    //   }
    //   let filteredArray = this.role_filter_status.filter(function (item) {
    //     return item.index === rootIndex
    //   })
    //   filteredArray[0].items[childIndex].counter = counter
    // },
    changeHeader (item) {
      var vm = this
      vm.$emit('changeHeader', item.type)
    },
    doTauBienFilterCount () {
      let vm = this
      vm.loadingInitData.then(function (result) {
        var listDS = vm.role_filter_status.items
        for (var i = 0; i < listDS.length; i++) {
          let item = listDS[i]
          if (item.url) {
            let param = null
            param = {
              start: 0,
              end: 5,
              url: result[item.url]
            }
            vm.$store.dispatch('loadDanhSachTauBien', param).then(function (result) {
              console.log('result.total++++++++', result.total)
              vm.role_filter_status.items[i]['counter'] = result.total ? result.total : 0
            })
          }
        }
      })
    },
    doTauBienKeHoachFilterCount () {
      let vm = this
      let childIndex = 0
      console.log('filter_ke_hoach_tau_bien+++++++++++++++++++++')
      let items = vm.role_filter_status.items
      for (let keyItem in items) {
        axios.get(vm.counter_tau_bien_ke_hoach_table, {
          params: {
            'documentTypeCode': vm.document_type_code,
            'requestState': items[keyItem]['code'],
            'rootIndex': 0,
            'childIndex': childIndex,
            'shipName': vm.shipName !== '' ? encodeURIComponent(vm.shipName) : '',
            'documentName': vm.maBanKhai,
            'callSign': vm.callSign,
            'isDTND': vm.initDataFilter.user.isDTND,
            'isDTNDCam': vm.initDataFilter.user.isDTNDCam
          }
        }).then(function (response) {
          let serializable = response.data
          vm.role_filter_status.items[childIndex].counter = serializable.total
        }).catch(function (error) {
          console.log(error)
        })
        childIndex = childIndex + 1
      }
    },
    doTauBienThuTucFilterCount () {
      let vm = this
      let childIndex = 0
      console.log('---------------------------filter_thu_tuc_tau_bien')
      let items = vm.role_filter_status.items
      for (let keyItem in items) {
        axios.get(vm.counter_tau_bien_thu_tuc_table, {
          params: {
            'documentTypeCode': vm.document_type_code,
            'documentStatusCode': items[keyItem]['code'],
            'rootIndex': 0,
            'childIndex': childIndex,
            'shipName': vm.shipName !== '' ? encodeURIComponent(vm.shipName) : '',
            'maBanKhai': vm.maBanKhai,
            'callSign': vm.callSign,
            'isDTND': vm.initDataFilter.user.isDTND,
            'isDTNDCam': vm.initDataFilter.user.isDTNDCam
          }
        }).then(function (response) {
          let serializable = response.data
          vm.role_filter_status.items[childIndex].counter = serializable.total
        }).catch(function (error) {
          console.log(error)
        })
        childIndex = childIndex + 1
      }
    }
  }
}
</script>
