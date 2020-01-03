<template>
    <v-layout>
        <DanhSachTaiNan v-if="!isLoading"/>
    </v-layout>
</template>
<script>
import DanhSachTaiNan from './components/quan-ly-an-toan-hang-hai/DanhSachTaiNan'

export default {
    components: {
        DanhSachTaiNan
    },
    data () {
        return {
            isLoading: false,
            res: null
        }
    },
    created () {
        let vm = this
        this.isLoading = true
        this.$nextTick(()=>{
            vm.$store.dispatch('TaiNanHangHai/getUrlInit').then(
                res => {
                    vm.res = res
                    vm.isLoading = false
                }
            );
        })
    }  
}
</script>