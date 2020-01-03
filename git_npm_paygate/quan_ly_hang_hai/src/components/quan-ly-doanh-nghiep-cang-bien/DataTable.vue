<template>
    <div style="width:100%; padding-top: 20px;">
      <!--Dialog xoa-->
      <notifications group="foo" />
      <v-dialog
        v-model="dialog"
        max-width="310"
      >
        <v-card>
          <div style="width:100%; padding: 10px;">
            <span>Bạn có chắc chắn muốn xóa dữ liệu này?</span>
          </div>


          <v-card-actions>
            <div class="flex-grow-1"></div>

            <v-btn
              color="primary darken-1"
              text
              @click="xoaItem"
            >
              Có
            </v-btn>

            <v-btn
              color="primary darken-1"
              text
              @click="dialog = false"
            >
              Không
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
        <ChiTietDoanhNghiepCangBien :dialogChiTiet="dialogChiTiet" @closeDialog="dialogChiTiet = false" :action="action" :id="id" @them="them" @sua="sua"/>
        <v-layout wrap>
            <v-flex xs12 class="d-flex justify-space-between">
              <div style="width:40%; font-size: 20px;">
                <v-btn class="mx-2" fab dark small color="primary">
                  <v-icon dark>mdi-account-card-details</v-icon>
                </v-btn>
                <span style="margin-left:10px;">Quản lý doanh nghiệp cảng biển</span>
              </div>
              <div>
                <v-btn class="ma-2" text outlined tile color="primary" @click="back">
                  <v-icon left>mdi-keyboard-backspace</v-icon> Quay lại
                </v-btn>
                <v-btn class="ma-2" tile color="primary" @click="openDialogThem">
                  <v-icon left>mdi-folder</v-icon> Thêm
                </v-btn>
              </div>
            </v-flex>
            <v-flex xs12>
              <div style=" overflow-x: auto;" >
                <div class="table-danhsach">
                  <table>
                    <thead>
                      <tr>
                        <th v-for="key in headers" :key="key.text">
                          <span>{{key.text}}</span>
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr v-for="(key, index) in danhSach" :key="index">
                        <td  @click="openDialogChiTiet(key)">{{index +1}}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.MaritimeCode }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.ServicePortCompanyCode }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.ServicePortCompanyName }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.CompanyAddress }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.ContactEmail }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.TelNo }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.FaxNo }}</td>
                        <td  @click="openDialogChiTiet(key)">{{ key.Remarks }}</td>
                        <td><span style="margin-left: 5px;margin-right: 5px;color: #00008b;" @click="xoa(key)"><strong>Xóa</strong></span></td>
                      </tr>
                      <tr v-if="danhSach.length === 0"><td :colspan="headers.length" style="padding-left: 30%;">Không có dữ liệu</td></tr>
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
import ChiTietDoanhNghiepCangBien from './ChiTietDoanhNghiepCangBien'
export default {
  components: {
    Pagination,
    ChiTietDoanhNghiepCangBien
  },
  data: () => ({
    headers: [
      {
        text: 'STT',
      },
      {
        text: 'Mã cảng vụ',
      },
      {
        text: 'MST',  
      },
      {
        text: 'Tên doanh nghiệp cảng biển',
      },
      {
        text: 'Địa chỉ',
      },
      {
        text: 'Thư điện tử',
      },
      {
        text: 'Số điện thoại',
      },
      {
        text: 'Số Fax',
      },
      {
        text: 'Ghi chú',
      },
      {
        text: 'Thao tác'
      }
    ],
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
      return this.$store.getters["doanhNghiepCangBien/total"]
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
        end: 10
      }
      this.$store.dispatch('doanhNghiepCangBien/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    openDialogThem() {
      this.dialogChiTiet = true
      this.action = 'them'
      this.id = 0
    },
    openDialogChiTiet(key) {
      this.dialogChiTiet = true
      this.action = 'sua'
      this.id = key.ID
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page
      let vm = this
      let params = {
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };
      this.$store.dispatch('doanhNghiepCangBien/getDanhSach', params).then(
        res => {
          vm.danhSach = res
        }
      )
    },
    xoa(item) {
      this.dialog = true;
      this.item = item
    },
    xoaItem () {
      let vm = this
      this.$store.dispatch('doanhNghiepCangBien/xoa', this.item).then(
        res => {
          vm.dialog = false
          vm.getDanhSach()
          if (res.status === 1) {
            vm.isAlertThanhCong= true
          } else {
            vm.isAlertThatBai= true
          }
          setTimeout(()=>{
            vm.isAlertThanhCong = false
            vm.isAlertThatBai= false
          },2000)
        }
      );
    },
    them(e) {
      let vm = this
      this.$store.dispatch('doanhNghiepCangBien/them', e).then(
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
      this.$store.dispatch('doanhNghiepCangBien/sua', e).then(
        res => {
          if (res.status === 1) {
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
      );
    },
    back() {
      this.$router.push({name: "quan-ly"});
    }
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