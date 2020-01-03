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
        <ChiTietThongTinCangBien :dialogChiTiet="dialogChiTiet" @closeDialog="dialogChiTiet = false" :action="action" :id="id" @them="them" @sua="sua"/>
        <v-layout wrap>
            <v-flex xs12 class="d-flex justify-space-between">
              <div style="width:40%; font-size: 20px;">
                <v-btn class="mx-2" fab dark small color="primary">
                  <v-icon dark>mdi-account-card-details</v-icon>
                </v-btn>
                <span style="margin-left:10px;">Quản lý thông tin cảng biển</span>
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
                <div class="table-danhsach" style="width: 1800px!important;">
                  <table>
                    <thead>
                      <!-- <tr>
                        <th v-for="key in headers" :key="key.text">
                          <span>{{key.text}}</span>
                        </th>
                      </tr> -->
                      <tr>
                        <th rowspan="2"><span>STT</span></th>
                        <th rowspan="2"><span>Mã cảng vụ</span></th>
                        <th rowspan="2"><span>Số Giấy chứng nhận</span></th>
                        <th rowspan="2"><span>Ngày cấp</span></th>
                        <th rowspan="2"><span>Ngày hiệu lực</span></th>
                        <th rowspan="2"><span>Nơi cấp</span></th>
                        <th rowspan="2"><span>Địa chỉ cảng biển</span></th>
                        <th rowspan="2"><span>Tên sỹ quan an ninh cảng biển</span></th>
                        <th rowspan="2"><span>Số điện thoại</span></th>
                        <th rowspan="2"><span>Trạng thái hiệu lực</span></th>
                        <th colspan="2"><span>Lần 1</span></th>
                        <th colspan="2"><span>Lần 2</span></th>
                        <th colspan="2"><span>Lần 3</span></th>
                        <th colspan="2"><span>Lần 4</span></th>
                        <th colspan="9"><span>Phê duyệt cho</span></th>
                        <th rowspan="2"><span>Thao tác</span></th>
                      </tr>
                      <tr>
                        <th><span>Xác nhận</span></th>
                        <th><span>Ngày</span></th>
                        <th><span>Xác nhận</span></th>
                        <th><span>Ngày</span></th>
                        <th><span>Xác nhận</span></th>
                        <th><span>Ngày</span></th>
                        <th><span>Xác nhận</span></th>
                        <th><span>Ngày</span></th>
                        <th><span>Tàu khách</span></th>
                        <th><span>Tàu khách cao tốc</span></th>
                        <th><span>Tàu hàng cao tốc</span></th>
                        <th><span>Tàu hàng rời</span></th>
                        <th><span>Tàu dầu</span></th>
                        <th><span>Tàu hóa chất</span></th>
                        <th><span>Tàu chở ga</span></th>
                        <th><span>Giàn khoan di động</span></th>
                        <th><span>Tàu hàng khác</span></th>
                      </tr>

                    </thead>
                    <tbody>
                      <tr v-for="(key, index) in danhSach" :key="index">
                        <td @click="openDialogChiTiet(key)">{{index + 1}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.MaritimeCode}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.CertificateNo}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.IssueDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ExpireDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.IssuePlace}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.PortFacilityAddress}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.SecurityName}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.SecurityContact}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ExpireStatus ? 'Có hiệu lực' : 'Hết hiệu lực'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.FirstAuthorized ? 'Đã xác nhận' : 'Chưa xác nhận'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.FirstVerificationDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.SecondAuthorized ? 'Đã xác nhận' : 'Chưa xác nhận'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.SecondVerificationDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ThirdAuthorized ? 'Đã xác nhận' : 'Chưa xác nhận'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ThirdVerificationDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.FourthAuthorized ? 'Đã xác nhận' : 'Chưa xác nhận'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.FourthVerificationDate.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.PassengerShipApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.PassengerHighSpeedApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.CargoHighSpeedApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.BulkCarrierApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.OilTankerApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ChemicalTankerApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.GasCarrierApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.MobileOffshoreApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.OtherCargoShipApproval ? 'Đã phê duyệt' : 'Chưa duyệt'}}</td>
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
import ChiTietThongTinCangBien from './ChiTietThongTinCangBien'
export default {
  components: {
    Pagination,
    ChiTietThongTinCangBien
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
        text: 'Số Giấy chứng nhận',  
      },
      {
        text: 'Ngày cấp',
      },
      {
        text: 'Ngày hiệu lực',
      },
      {
        text: 'Nơi cấp',
      },
      {
        text: 'Tên Cảng biển',
      },
      {
        text: 'Địa chỉ Cảng biển',
      },
      {
        text: 'Tên Sỹ quan an ninh cảng biển',
      },
      {
        text: 'Số điện thoại liên lạc',
      },
      {
        text: 'Trạng thái hiệu lực',
      },
      {
        text: 'Xác nhận kiểm tra lần 1',
      },
      {
        text: 'Ngày kiểm tra lần 1',
      },
      {
        text: 'Xác nhận kiểm tra lần 2',
      },
      {
        text: 'Ngày kiểm tra lần 2',
      },
      {
        text: 'Xác nhận kiểm tra lần 3',
      },
      {
        text: 'Ngày kiểm tra lần 3',
      },
      {
        text: 'Xác nhận kiểm tra lần 4',
      },
      {
        text: 'Ngày kiểm tra lần 4',
      },
      {
        text: 'Phê duyệt hoạt động(cho tàu khách)',
      },
      {
        text: 'Phê duyệt hoạt động(cho tàu khách cao tốc)',
      },
      {
        text: 'Phê duyệt hoạt động(cho tàu hàng cao tốc)',
      },
      {
        text: 'Phê duyệt hoạt động(Cho tàu dầu)',
      },
      {
        text: 'Phê duyệt hoạt động(Cho tàu hóa chất)',
      },
      {
        text: 'Phê duyệt hoạt động(cho tàu chở ga)',
      },
      {
        text: 'Phê duyệt hoạt động(Cho giàn khoan di động)',
      },
      {
        text: 'Phê duyệt hoạt động(Cho tàu hàng khác)',
      },
      {
        text: 'Đánh giấy xóa',
      },
      {
        text: 'Thời điểm cập nhập',
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
      return this.$store.getters["thongTinCangBien/total"]
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
      this.$store.dispatch('thongTinCangBien/getDanhSach', params).then(
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
      this.$store.dispatch('thongTinCangBien/getDanhSach', params).then(
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
      this.$store.dispatch('thongTinCangBien/xoa', this.item).then(
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
      this.$store.dispatch('thongTinCangBien/sua', e).then(
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