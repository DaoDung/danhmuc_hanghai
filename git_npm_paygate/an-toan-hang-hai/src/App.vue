<template>
  <v-app>
    <v-content>
      <TaiNanHangHai/>
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
  }
};
</script>

<style>
  #app{
    widows: 100%;
    background-color: #e1e2e194;
  }
</style>
