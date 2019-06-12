<template>

  <v-layout wrap>
    <v-flex>
      <danh-sach-tau-all
        :code="code"
        :type="type"
        :documentTypeCode="documentTypeCode"
        :documentStatusCode="documentStatusCode"
      >
      </danh-sach-tau-all>
    </v-flex>
  </v-layout>

</template>

<script>
import supportData from '../store/support_data.json'

import DanhSachTauAll from './hang_hai/DanhSachTauAll.vue'

export default {
  props: ['code', 'type', 'documentTypeCode', 'documentStatusCode'],
  components: {
    'danh-sach-tau-all': DanhSachTauAll
  },
  data: () => ({
    loading: true,
    supportData: supportData
  }),
  beforeCreate () {
    var vm = this
    vm.$nextTick(function () {
    })
  },
  created () {
    var vm = this
    vm.$nextTick(function () {
    })
  },
  watch: {
  },
  methods: {
  },
  filters: {
    money (value) {
      if (value) {
        var moneyCur = (value / 1).toFixed(0).replace('.', ',')
        return moneyCur.toString().replace(/\B(?=(\d{3})+(?!\d))/g, '.') + ' VNĐ'
      } else {
        return ''
      }
    }
  }
}
</script>
