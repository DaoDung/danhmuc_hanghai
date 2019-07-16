<template>

  <v-layout wrap>
    <v-flex>
      <danh-sach-tau-all
        :code="code"
        :type="type"
        :documentYear="''"
        :documentName="''"
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
  props: ['type', 'documentTypeCode', 'documentStatusCode', 'code'],
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
      vm.changeHeader({
        type: vm.code
      })
    })
  },
  watch: {
    code: function (val) {
      var vm = this
      vm.changeHeader({
        type: val
      })
    }
  },
  methods: {
    changeHeader (item) {
      var vm = this
      vm.$emit('changeHeader', item.type)
    }
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
