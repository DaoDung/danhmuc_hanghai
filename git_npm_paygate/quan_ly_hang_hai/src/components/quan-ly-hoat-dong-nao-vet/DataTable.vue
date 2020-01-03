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
        <ChiTietHoatDongNaoVet :dialogChiTiet="dialogChiTiet" @closeDialog="dialogChiTiet = false" :action="action" :id="id" @them="them" @sua="sua"/>
        <v-layout wrap>
            <v-flex xs12 class="d-flex justify-space-between">
              <div style="width:40%; font-size: 20px;">
                <v-btn class="mx-2" fab dark small color="primary">
                  <v-icon dark>mdi-account-card-details</v-icon>
                </v-btn>
                <span style="margin-left:10px;">Quản lý hoạt động nạo vét</span>
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
                <div class="table-danhsach" style="width: 1600px!important;">
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
                        <td @click="openDialogChiTiet(key)">{{index +1}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ten_cong_trinh}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.chu_dau_tu}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.nha_thau_thi_cong}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.tu_van_giam_sat}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.quyet_dinh_phe_duyet}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.vi_tri_do}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ten_phuong_tien}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.so_dkhc}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.cap_phuong_tien}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.suc_cho}}</td>  
                        <td @click="openDialogChiTiet(key)">{{key.cong_dung}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.so_dang_kiem}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ngay_cap_dang_kiem.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ngay_het_han_dang_kiem.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ngay_den_cang.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.so_giay_phep_tau_den}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ngay_roi_cang.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.so_giay_phep_roi}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.ngay_cap_phep_hoat_dong_thi_cong.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.han_cap_phep_hoat_dong.substr(0,10)}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.tong_thoi_gian_thi_cong}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.so_luot_hoat_dong}}</td>
                        <td @click="openDialogChiTiet(key)">{{key.khoi_luong_thi_cong}}</td>
                        <td><span style="margin-left: 5px;margin-right: 5px;color: #00008b;" @click="xoa(key)"><strong>Xóa</strong></span></td>
                      </tr>
                      
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
import ChiTietHoatDongNaoVet from './ChiTietHoatDongNaoVet'
export default {
  components: {
    Pagination,
    ChiTietHoatDongNaoVet
  },
  data: () => ({
    headers: [
      {
        text: 'STT',
      },
      {
        text: 'Tên công trình',
      },
      {
        text: 'Chủ đầu tư',  
      },
      {
        text: 'Nhà thầu thi công',
      },
      {
        text: 'Tư vấn giám sát',
      },
      {
        text: 'QĐ phê duyệt PA',
      },
      {
        text: 'Vị trí đổ chất nạo vét',
      },
      {
        text: 'Tên phương tiện',
      },
      {
        text: 'Số ĐKHC',
      },
      {
        text: 'Cấp phương tiện',
      },
      {
        text: 'Sức chở',
      },
      {
        text: 'Công dụng',
      },
      {
        text: 'Số đăng kiểm',
      },
      {
        text: 'Ngày cấp phép đăng kiểm',
      },
      {
        text: 'Ngày hết hạn đăng kiểm',
      },
      {
        text: 'Ngày đến cảng',
      },
      {
        text: 'Số giấy phép tàu đến',
      },
      {
        text: 'Ngày rời cảng',
      },
      {
        text: 'Số giấy phép rời',
      },
      {
        text: 'Ngày cấp phép hoạt động thi công',
      },
      {
        text: 'Hạn cấp phép',
      },
      {
        text: 'Tổng thời gian thi công',
      },
      {
        text: 'Số lượt hoạt động(vào/rời)',
      },
      {
        text: 'Khối lượng thi công',
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
      return this.$store.getters["hoatDongNaoVet/total"]
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
      this.$store.dispatch('hoatDongNaoVet/getDanhSach', params).then(
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
      this.$store.dispatch('hoatDongNaoVet/getDanhSach', params).then(
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
      this.$store.dispatch('hoatDongNaoVet/xoa', this.item).then(
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
      this.$store.dispatch('hoatDongNaoVet/them', e).then(
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
      this.$store.dispatch('hoatDongNaoVet/sua', e).then(
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