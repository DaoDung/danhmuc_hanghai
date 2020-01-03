<template>
    <v-content>
        <div xs12 class="d-flex xs12 justify-center" style="padding-top: 40px;">
          <div class="item-quanly" @click="NextATHH()">
            <v-card height="100" class="d-flex align-center">
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Quản lý tai nạn hàng hải</h4>
            </v-card>
          </div>
          <div class="item-quanly" @click="NextQLVPHC()"> 
            <v-card height="100" class="d-flex align-center"> 
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Quản lý vi phạm hành chính</h4> 
            </v-card>
          </div>
        </div>
        <div class="d-flex xs12 justify-center">
          <div class="item-quanly" @click="NextQLHDNV()">
            <v-card height="100" class="d-flex align-center">
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Quản lý hoạt động nạo vét</h4>
            </v-card>
          </div>
          <div class="item-quanly" @click="NextQLTTCB()">
            <v-card height="100" class="d-flex align-center">
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Quản lý thông tin cảng biển</h4>
            </v-card>
          </div>
        </div>
        <div class="d-flex xs12 justify-center">
          <div class="item-quanly" @click="NextQLDNCB()">
            <v-card height="100" class="d-flex align-center">
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Quản lý doanh nghiệp cảng biển</h4>
            </v-card>
          </div>
          <div class="item-quanly" @click="NextXacNhanAnToanAnNinhHangHai()">
            <v-card height="100" class="d-flex align-center justify-center">
              <v-btn text icon color="warning">
                <v-icon>mdi-folder</v-icon>
              </v-btn>
              <h4> Xác nhận an toàn an ninh hàng hải</h4>
            </v-card>
          </div>
        </div>
    </v-content>
</template>
<script>


export default {
  methods: {
      NextQLHDNV () {
        this.$router.push({name: "quan-ly-hoat-dong-nao-vet"});
      },
      NextATHH () {
        this.$router.push({name: "quan-ly-an-toan-hang-hai"});
      },
      NextQLDNCB () {
        this.$router.push({name: "quan-ly-doanh-nghiep-cang-bien"});
      },
      NextQLTTCB () {
        this.$router.push({name: "quan-ly-thong-tin-cang-bien"});
      },
      NextQLVPHC () {
        this.$router.push({name: "quan-ly-vi-pham-hanh-chinh"});
      },
      NextXacNhanAnToanAnNinhHangHai () {
        this.$router.push({name: "xac-nhan-an-toan-an-ninh-hang-hai"});
      }
  }
}
</script>