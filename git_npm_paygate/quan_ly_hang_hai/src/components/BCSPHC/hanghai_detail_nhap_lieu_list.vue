<template>
  <v-flex xs3 class="nhaplieulist">
    <v-card>
      <div>
        <v-btn @click="Them" style=" width: 100%; height: 38px;" color="#3563c1" class=" px-0 py-0 mx-0 my-0 font-weight-medium" ><span style="color: white">Thêm mới</span></v-btn>
      </div>
         <v-list label two-line class="px-0 py-0 mx-0 my-0" >
           <transition-group name="slide">
              <v-list-tile nava-item style="border-bottom: 1px solid #EEEEEE; display: block;" v-for="(item, index) in items" :key="index" avatar>
                <v-list-tile-content >
                  <v-list-tile-title class="font-weight-regular">{{item.violationPartName}}</v-list-tile-title>
                </v-list-tile-content>


                <v-list-tile-avatar style="width: 1%;" >
                  <v-btn  icon  style="font-size: 10px;" title="Sửa" @click="Sua(item)" class=" px-0 py-0 mx-0 my-0">
                    <v-icon color="blue">mdi-pencil-outline</v-icon>
                  </v-btn>
                    <v-btn title="Xóa" icon slot="activator" @click="Xoa(item)">
                      <v-icon color="red" >mdi-delete</v-icon></v-btn>
                </v-list-tile-avatar>
                
              </v-list-tile>
           </transition-group>
        </v-list>

    </v-card>
  </v-flex>
</template>
<script>
import axios from 'axios'
import $ from 'jquery'
export default {
  name: 'hanghai-detail-nhap-lieu-list',
  data () {
    return {
      items: [],
      selectNotification: {},
      url: '',
    }
  },
  methods: {
    getAPI () {
      return new Promise((resolve, reject) => {
        $.ajax({
          url: '?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit',
          type: 'GET',
          data: {
          },
          dataType: 'json',
          success: function (data) {
            resolve(data)
          },
          error: function (request, error) {
            reject(error)
          }
        })
      })
    },
    getdanhsach () {
      var vm = this
      vm.getAPI().then(result => {
        vm.url = result['getVmaAdministrativeViolations']
        axios.get(vm.url)
        .then(response => {
          this.items = response.data['data'] || []
        })
      })
    },
    Sua(item){
      this.$router.push({query: {action: 'sua', id: item.id}});
    },
    Xoa(item){
      var vm = this
      vm.getAPI().then(result => {
          vm.url = result['updateVmaAdministrativeViolation'] + '&LAN_XOA_DU_LIEU=LAN_XOA_DU_LIEU'
          let dataPost = new URLSearchParams()
          dataPost.append('id', item.id)
          axios.post(vm.url, dataPost)
          .then(() => {
              vm.getdanhsach()
              vm.dialog = false
          })
      })
    },
    Them(){
      this.$router.push({query: {action: 'them'}});
    }
  },
  computed: {
    action() {
      return this.$route.query.action;
    },
    id() {
      return this.$route.query.id;
    },
  }, 
  created () {
    this.getdanhsach()
  },
  watch: {

  },
  props: {
  }
}
</script>

<style scoped>
 .nhaplieulist .theme--light.v-list .v-list__tile__sub-title{
   color: black ! important;
 }
  .nhaplieulist .v-list__tile {
    padding: 0px! important;
  }
  .nhaplieulist .slide-enter{
    opacity: 0;
  }
  .nhaplieulist .slide-enter-active {
    animation: slide-in 1s ease-out forwards;
    transition: opacity 1s;
  }
  /* leave */
  .nhaplieulist .slide-leave{}
  .nhaplieulist .slide-leave-active{
    animation: slide-out 1s ease-out forwards;
    transition: opacity 1s;
    opacity: 0;
    position: absolute;
  }
  .nhaplieulist .slide-move {
    transition: transform 1s;
  }
  /* key frames */
  @keyframes slide-in {
    from {
      transform: translate(20px);
    }
    to {
      transform: translateY(0);
    }
  }
  @keyframes slide-out {
    from {
      transform: translateY(0);
    }
    to {
      transform: translateY(20px);
    }
  }
  v-list-tile{
    display: block; 
  }
</style>