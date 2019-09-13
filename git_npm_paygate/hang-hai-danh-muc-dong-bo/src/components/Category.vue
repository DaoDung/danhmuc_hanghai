<template>
  <v-layout>
    <v-flex md2>
      <NaviFilter
      ></NaviFilter>
    </v-flex>
    <v-flex md10>
      <router-view></router-view> 
    </v-flex>
  </v-layout>
</template>
<script>
import NaviFilter from  './NaviFilter'

export default {
  name: 'Category',
  data () {
    return {
      categoryTableSelected: {}
    }
  },
  watch: {
  },
  components: {
    NaviFilter
  },
  computed: {
  },
  watch: {
  },
  created () {
  }
}
</script>
