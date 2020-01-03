<template>
    <v-layout>
        <DataTable v-if="!isLoading"/>
    </v-layout>
</template>
<script>
import DataTable from './components/xac-nhan-an-toan-an-ninh-hang-hai/DataTable'


export default {
    components: {
        DataTable
    },
    data () {
        return {
            isLoading: false,
            url: null,
            url2: null,
            maritimeCurrent: null,
        }
    },
    created () {
        let vm = this
        this.isLoading = true
        this.$nextTick( async ()=>{
            vm.url = await vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/getUrlInit')
            vm.url2 = await vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/getUrlInit2')
            vm.maritimeCurrent = await vm.$store.dispatch('xacNhanAnToanAnNinhHangHai/getMaritimeCurrent')
             vm.isLoading = false
        })
    }       
}
</script>