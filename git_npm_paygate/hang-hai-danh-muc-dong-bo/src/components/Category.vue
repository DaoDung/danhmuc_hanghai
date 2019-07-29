<template>
<v-container fluid  ma-0 pa-0>
  <v-layout>
    <v-flex md2>
      <NaviFilter
      ></NaviFilter>
    </v-flex>
    <v-flex md10>
      <router-view></router-view> 
    </v-flex>
  </v-layout>
</v-container>
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
