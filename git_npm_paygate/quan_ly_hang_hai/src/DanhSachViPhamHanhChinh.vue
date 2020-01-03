<template>
    <v-layout>
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
        <div style="width:100%; padding-top: 20px;">
            <v-layout wrap>
                <v-flex xs12 class="d-flex justify-space-between">
                <div style="width:40%; font-size: 20px;">
                    <v-btn class="mx-2" fab dark small color="primary">
                    <v-icon dark>mdi-account-card-details</v-icon>
                    </v-btn>
                    <span style="margin-left:10px;">Quản lý vi phạm hành chính</span>
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
                            <th><span>Số quyết định</span></th>
                            <th><span>Ngày quyết định</span></th>
                            <th><span>Tên tổ chức, cá nhân</span></th>
                            <th><span>Địa chỉ</span></th>
                            <th><span>Phương tiện vi phạm liên quan</span></th>
                            <th><span>Ngày vi phạm</span></th>
                            <th><span>Ngày biên bản</span></th>
                            <th><span>Địa chỉ xảy vi phạm</span></th>
                            <th><span>Số biên bản vi phạm</span></th>
                            <th><span>Ngày chấp hành nộp tiền</span></th>
                            <th><span>Số biên lai</span></th>
                            <th><span>Ngày biên lai</span></th>
                            <th><span>Thao tác</span></th>
                        </tr>

                        </thead>
                        <tbody>
                        <tr v-for="(key, index) in danhSach" :key="index">
                            <td @click="openDialogChiTiet(key)">{{ page*pagesize - pagesize + index + 1}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.decisionNo}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.decisionDate}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.violationPartName}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.violationPartAddress}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.nameOfShip}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.violationDate}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.officialDate}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.officialPlace}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.officialNo}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.paymentDate}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.billNo}}</td>
                            <td @click="openDialogChiTiet(key)">{{key.billDay}}</td>
                            <td><span style="margin-left: 5px;margin-right: 5px;color: #00008b;" @click="xoa(key)"><strong>Xóa</strong></span></td>
                        </tr>
                        <tr v-if="danhSach.length === 0"><td :colspan="14" style="padding-left: 30%;">Không có dữ liệu</td></tr>
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
    </v-layout>
</template>
<script>
import axios from 'axios'
import $ from 'jquery'
export default {
    components: {
       
    },
    data () {
        return {
            dialogChiTiet: false,
            dialog: false,
            id: 0,
            pagesize: 10,
            page: 1,
            action: '',
            danhSach: [],
            item: {},
            total: null,
        }
    },
    created () {
        this.getDanhSach()
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
        getDanhSach () {
            var vm = this
            vm.getAPI().then(result => {
                vm.url = result['getVmaAdministrativeViolations']
                axios.get(vm.url)
                .then(response => {
                    vm.danhSach = response.data['data'] || []
                    vm.total = response.data['total']
                })
            })
        },
        openDialogThem() {
            this.$router.push({name: "chi-tiet-vi-pham-hanh-chinh", query: {action: 'them'}});
        },
        openDialogChiTiet(item) {
            this.$router.push({name: "chi-tiet-vi-pham-hanh-chinh", query: {action: 'sua', id: item.id}});
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
            var vm = this
            vm.getAPI().then(result => {
                vm.url = result['updateVmaAdministrativeViolation'] + '&LAN_XOA_DU_LIEU=LAN_XOA_DU_LIEU'
                let dataPost = new URLSearchParams()
                dataPost.append('id', vm.item.id)
                axios.post(vm.url, dataPost)
                .then(() => {
                    vm.getDanhSach()
                    vm.dialog = false
                })
            })
        },

        back() {
            this.$router.push({name: "quan-ly"});
        }
    } 
}
</script>