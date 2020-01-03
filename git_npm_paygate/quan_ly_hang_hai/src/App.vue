<template>
  <v-app>
    <router-view></router-view> 
  </v-app>
</template>

<script>

export default {
  name: 'App',
  components: {
    
  },
  created(){
    this.$router.push({name: "quan-ly"});
    
  },
  data: () => ({
    //
  }),
};
</script>
<style>
.item-quanly{
  width: 20%;
  margin: 5px;

}
.item-quanly .v-card {
  border-radius: 10px!important;
  background-color: #316BB6!important;
  color: #fff!important;
}
.item-quanly .v-card:hover{
  border: 1px solid #1976d2;
  cursor: pointer;
}
</style>