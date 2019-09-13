<template>
    <v-layout>
        <router-view></router-view> 
    </v-layout>
</template>

<script>


export default {
  name: 'TaiNanHangHai',
  components: {
  
  },
  data: () => ({
  }),
  created(){
    let vm = this
    this.$nextTick(()=>{
     
      vm.$store.dispatch('TaiNanHangHai/getUrlInit').then(
        res => {
          console.log('getUrlInit:', res)
          vm.$router.push({name: "danh_sach_tai_nan"});
        }
      );
    })
  }
};
</script>

<style>
  #app{
    widows: 100%;
  }
</style>
