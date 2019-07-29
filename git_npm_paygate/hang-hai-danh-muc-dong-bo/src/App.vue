<template>
  <v-app id="app">
    <loading :active.sync="isLoading" 
      :is-full-page="false">
    </loading>
    <v-content>
      <Category v-if="!isLoading"></Category>
    </v-content>
  </v-app>
</template>

<script>
import Loading from 'vue-loading-overlay';
import Category from './components/Category';
import 'vue-loading-overlay/dist/vue-loading.css';
import { async } from 'q';
export default {
  name: "App",
  components: {
    Loading,
    Category
  },
  data() {
    return {
      isLoading: false,
    };
  },
  created() {
    let vm = this
    vm.isLoading = true
    this.$nextTick( async () => {
      var getUrl1 = await vm.$store.dispatch("category/getUrl")
      //var getUrl2 = await vm.$store.dispatch("category/getUrl2")
      //console.log('call success', getUrl1, getUrl2)
      vm.isLoading = false
    });
  }
};
</script>
<style>
  #app{
    font-family: 'Roboto', sans-serif;
    line-height: 1.5;
    font-size: 13px;
  }
</style>
