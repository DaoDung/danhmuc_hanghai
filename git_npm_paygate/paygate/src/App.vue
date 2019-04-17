<template>
  <v-app>

    <v-content>
      <router-view></router-view>
    </v-content>
    
  </v-app>
</template>

<script>
  export default {
    data: () => ({}),
    created () {
      var vm = this
      vm.$nextTick(function () {
      })
    }
  }
</script>
