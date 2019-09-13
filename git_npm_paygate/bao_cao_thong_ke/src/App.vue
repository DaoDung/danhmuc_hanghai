<template>
  <div id="app">
    <loading :active.sync="isLoading" 
      :is-full-page="false">
    </loading>
    <BaoCao v-if="!isLoading"/>
  </div>
</template>

<script>
import Loading from 'vue-loading-overlay';
import 'vue-loading-overlay/dist/vue-loading.css';
import BaoCao from './components/BaoCao'
export default {
  name: 'app',
  components: {
    BaoCao,
    Loading
  },
  computed: {
  },
  data() {
    return {
      isLoading: false
    }
  },
  created () {
    let vm = this
    vm.isLoading = true
    this.$nextTick( async () => {
      var getUrl1 = await vm.$store.dispatch("baocao/getURLInit")
      var maritimeCurrent = await vm.$store.dispatch("baocao/getMaritimeCurrent")
      vm.isLoading = false
    });
  }
}
</script>

<style>
#app {
  display: flex;
  width: 100%;
  font-family: 'Roboto', sans-serif;
}
</style>
