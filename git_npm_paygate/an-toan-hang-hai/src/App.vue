<template>
  <v-app>
    <v-content>
      <TaiNanHangHai v-if="!isLoading"/>
    </v-content>
  </v-app>
</template>

<script>

import TaiNanHangHai from './components/TaiNanHangHai'
export default {
  name: 'App',
  components: {
    TaiNanHangHai
  },
  data: () => ({
    isLoading:  false
  }),
  created(){
    let vm = this
    vm.isLoading = true
    this.$nextTick(()=>{
      vm.$store.dispatch('TaiNanHangHai/getUrlInit').then(
        res => {
          vm.isLoading = false
          console.log('getUrlInit:', res)
        }
      );
    })
  }
};
</script>

<style>
  #app{
    widows: 100%;
    background-color: #e1e2e194;
  }
</style>
