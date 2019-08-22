<template>
  <div id="app">
    <BaoCao/>
  </div>
</template>

<script>
import BaoCao from './components/BaoCao'
export default {
  name: 'app',
  components: {
    BaoCao
  },
  computed: {
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
