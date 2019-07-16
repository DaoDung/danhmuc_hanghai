<template>
  <div>
    <v-navigation-drawer app clipped floating width="250" style="overflow: auto; padding: 0;">
      <jx-hanghai-detail-part
        ref="filterleft"
        :type="type"
        :id="id"
        :code="code"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
    </jx-hanghai-detail-part>
    </v-navigation-drawer>

    <router-view></router-view>

  </div>
</template>

<script>
import DetailPart from './hang_hai/hanghai_detail_part_2.vue'

export default {
  props: ['type', 'documentTypeCode', 'documentStatusCode', 'id', 'code'],
  components: {
    'jx-hanghai-detail-part': DetailPart
  },
  data: () => ({
    initData: null,
    getThanhPhanHoSo: ''
  }),
  beforeCreate () {
    var vm = this
    vm.$nextTick(function () {
      let hanghaidetailpart = vm.$refs.hanghaidetailpart
      if (hanghaidetailpart !== null && hanghaidetailpart !== undefined && hanghaidetailpart !== 'undefined') {
        // hanghaidetailpart.loadThanhPhanTauBien()
      }
    })
  },
  watch: {
    // '$route': function (newRoute, oldRoute) {
    //   let vm = this
    //   let query = newRoute.query
    //   if (query.hasOwnProperty('renew')) {
    //     let hanghaidetailpart = vm.$refs.hanghaidetailpart
    //     if (hanghaidetailpart !== null && hanghaidetailpart !== undefined && hanghaidetailpart !== 'undefined') {
    //       hanghaidetailpart.reloadThanhPhanParam(vm.getThanhPhanHoSo)
    //     }
    //   }
    // }
  }
}
</script>
