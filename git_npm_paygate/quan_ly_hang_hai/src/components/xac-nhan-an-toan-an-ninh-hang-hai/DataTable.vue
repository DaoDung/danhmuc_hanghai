<template>
    <div style="width:100%; padding-top: 20px;">
        <!--Dialog xoa-->
        <notifications group="foo" />
        <ChiTietXacNhanAnToanAnNinhHangHai :dialogChiTiet="dialogChiTiet" @closeDialog="dialogChiTiet = false" :action="action" :id="id" @them="them" @sua="sua"/>
        <v-layout wrap>
            <v-flex xs12 class="d-flex justify-space-between">
              <div style="width:40%; font-size: 20px;">
                <v-btn class="mx-2" fab dark small color="primary">
                  <v-icon dark>mdi-account-card-details</v-icon>
                </v-btn>
                <span style="margin-left:10px;">Xác nhận an toàn an ninh hàng hải</span>
              </div>
              <div>
                <v-btn class="ma-2" text outlined tile color="primary" @click="back">
                  <v-icon left>mdi-keyboard-backspace</v-icon> Quay lại
                </v-btn>
              </div>

            </v-flex>
            <v-flex xs12>
              <div style=" overflow-x: auto;" >
                <div class="table-danhsach" >
                  <table>
                    <thead>
                      <!-- <tr>
                        <th v-for="key in headers" :key="key.text">
                          <span>{{key.text}}</span>
                        </th>
                      </tr> -->
                      <tr>
                        <th><span>STT</span></th>
                        <th><span>Tên tàu</span></th>
                        <th><span>Quốc tịch</span></th>
                        <th><span>IMO</span></th>
                        <th><span>Hô hiệu</span></th>
                        <th><span>Loại tàu</span></th>
                        <th><span>GT</span></th>
                        <th><span>NT</span></th>
                        <th><span>DWT</span></th>
                        <th><span>Cấp độ an ninh</span></th>
                        <th><span>Xác nhận an toàn</span></th>
                      </tr>

                    </thead>
                    <tbody>
                      <tr v-for="(key, index) in danhSach" :key="index">
                        <td @click="openDialogChiTiet(key)">{{ page*pagesize - pagesize + index + 1}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.shipName}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.stateName}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.imoNumber}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.callSign}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.shipTypeName}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.gt}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.nt}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.dwt}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.violated ? 'Đang kiểm tra' : 'Không phải kiểm tra'}}</td>
                        <td @click="openDialogChiTiet(key)">{{getSecurityLevel(key.securityLevelCode)}}</td>
                      </tr>
                      <tr v-if="danhSach.length === 0"><td :colspan="11" style="padding-left: 30%;">Không có dữ liệu</td></tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </v-flex>
            <v-flex xs12>
              <Pagination :total="total" :page="page" :pagesize="pagesize" @tiny:change-page="paggingData"/>
            </v-flex>
        </v-layout>
    </div>
</template>

<script>
import Pagination from '../Pagination'
import ChiTietXacNhanAnToanAnNinhHangHai from './ChiTietXacNhanAnToanAnNinhHangHai'
export default {
  components: {
    Pagination,
    ChiTietXacNhanAnToanAnNinhHangHai
  },
  data: () => ({
    dialogChiTiet: false,
    dialog: false,
    id: 0,
    pagesize: 10,
    page: 1,
    action: '',
    danhSach: [],
    item: {},
  }),
  computed: {
    total () {
      return this.$store.getters["xacNhanAnToanAnNinhHangHai/total"]
    },
  },
  created () {
    let vm = this
    this.$nextTick(()=> {
      vm.getDanhSach()
    })
  },
  methods: {
    getDanhSach () {
      let vm = this
      this.pagesize = 10
      this.page = 1
      let params = {
        start: 0,
        end: 10,
        shipBoat: 'SHIP'
      }
      this.$store.dispatch('xacNhanAnToanAnNinhHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    openDialogThem() {
      this.dialogChiTiet = true
      this.action = 'them'
    },
    openDialogChiTiet(key) {
      this.dialogChiTiet = true
      this.action = 'sua'
      this.id = key.vmaShipId
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page
      let vm = this
      let params = {
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };
      this.$store.dispatch('xacNhanAnToanAnNinhHangHai/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    them(e) {
      let vm = this
      this.$store.dispatch('thongTinCangBien/them', e).then(
        res => {
          if (res.status === 1) {
            vm.dialogChiTiet = false
            vm.$notify({
              group: 'foo',
              title: 'Thành công',
              text: 'Thêm dữ liệu thành công!'
            });
            vm.getDanhSach()
          }
          else {
            vm.dialogChiTiet = false
            vm.$notify({
              group: 'foo',
              type: 'error',
              title: 'Thành bại',
              text: 'Thêm không thành công!'
            });
          }
        }
      );
    },
    sua(e) {
      let vm = this
      this.$store.dispatch('xacNhanAnToanAnNinhHangHai/sua', e).then(
        res => {
          if (!res.errorCode) {
            vm.dialogChiTiet = false
            vm.$notify({
              group: 'foo',
              title: 'Thành công',
              text: 'Cập nhập dữ liệu thành công!'
            });
            vm.getDanhSach()
          }
          else {
            vm.dialogChiTiet = false
            vm.$notify({
              group: 'foo',
              type: 'error',
              title: 'Thành bại',
              text: 'Cập nhập không thành công!'
            });
          }
        }
      ).finally(()=>{
        vm.dialogChiTiet = false
      });
    },
    back() {
      this.$router.push({name: "quan-ly"});
    },
    getSecurityLevel (string) {
      let securityLevelString = ''
      switch (string) {
        case '1':
          securityLevelString = 'Cấp độ 1'
          break
        case '2':
          securityLevelString = 'Cấp độ 2'
          break
        case '3':
          securityLevelString = 'Cấp độ 3'
          break
      }
      return securityLevelString
    },
  }
};
</script>
<style>
.table-danhsach{
  width: 100%;
  padding: 5px 10px 5px 10px;
}
.table-danhsach table{
  width: 100%;
  border-spacing: 1px;
  background-color: #fff;
  border-right: 1px solid #ddd;
  border-top: 1px solid #ddd;
}
.table-danhsach th{
  border-bottom: 1px solid #ddd;
  border-left: 0.5px solid #ddd;
  background-color: #88888829;
  color: rgb(26, 115, 232);
  font-size: 13px;
}
.table-danhsach td{
  border-bottom: 1px solid #ddd;
  border-left: 0.5px solid #ddd;
  font-size: 13px;
}
.table-danhsach td, .table-danhsach th{
  padding: 5px 5px;
}
.table-danhsach tr:hover{
  background-color: #82b1ff12;
  color: rgb(26, 115, 232);
}
/* .v-menu__content.theme--light.menuable__content__active {
    margin-top: -80px;
} */

</style>