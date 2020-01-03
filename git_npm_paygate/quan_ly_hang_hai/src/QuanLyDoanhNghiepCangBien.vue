<template>
    <v-layout>
        <DataTable v-if="!isLoading"/>
    </v-layout>
</template>
<script>
import DataTable from './components/quan-ly-doanh-nghiep-cang-bien/DataTable'

export default {
    components: {
        DataTable
    },
    data () {
        return {
            isLoading: false,
        }
    },
    created () {
        let vm = this
        this.isLoading = true
        this.$nextTick(()=>{
            vm.$store.dispatch('doanhNghiepCangBien/getUrlInit').then(
                () => {
                    vm.isLoading = false
                }
            );
        })
    }       
}
</script>