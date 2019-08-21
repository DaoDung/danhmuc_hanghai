<template>
  <div>
    <div class="chi-tiet">
      <v-container text-xs-center>
        <v-layout row wrap>
          <v-flex xs12>
            <div class="title-chitiet">
              <strong class="title-chitiet-danh-muc">Thông tin Phòng ban</strong>
            </div>
          </v-flex>
          <v-flex xs12>
            <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Cảng vụ hàng hải:</label>
                    <span class="red--text">(*)</span>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-autocomplete
                      v-model="selectMaritime"
                      persistent-hint
                      :items="maritime"
                      item-text="maritimeNameVN"
                      item-value="maritimeCode"
                      readonly
                      required
                      :rules="maritimeRules"
                      height="25"
                    >
                      <template v-slot:append-outer></template>
                    </v-autocomplete>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Mã phòng ban:</label>
                  </v-flex>
                  <v-flex xs12 md3>
                    <v-text-field
                      v-model="categoryModel.departmentCode"
                      :readonly="true"
                      height="25"
                    ></v-text-field>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Tên phòng ban:</label>
                    <span class="red--text">(*)</span>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-text-field
                      v-model="categoryModel.departmentName"
                      :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                      required
                      :rules="departmentNameRules"
                      height="25"
                    ></v-text-field>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Mã giao dịch VNĐ:</label>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-autocomplete
                      v-model="categoryModel.transactionTypeVND"
                      persistent-hint
                      :items="transactionType"
                      item-text="transactionTypeName"
                      item-value="transactionTypeCode"
                      height="25"
                      required
                      :rules="transactionTypeVNDRules"
                    >
                      <template v-slot:append-outer></template>
                    </v-autocomplete>
                  </v-flex>
                </v-layout>
              </v-flex>
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Mã giao dịch USD:</label>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-autocomplete
                      v-model="categoryModel.transactionTypeUSD"
                      persistent-hint
                      :items="transactionType"
                      item-text="transactionTypeName"
                      item-value="transactionTypeCode"
                      height="25"
                      required
                      :rules="transactionTypeUSDRules"
                    >
                      <template v-slot:append-outer></template>
                    </v-autocomplete>
                  </v-flex>
                </v-layout>
              </v-flex>
            </v-form>
          </v-flex>
          <v-flex xs12 class="text-lg-right">
            <button
              class="btn-chi-tiet-danhmuc"
              v-if="this.$route.query.aticon !== 'chi-tiet-danh-muc'"
              @click="submit"
            >{{btnText}}</button>
            <button flat class="btn-chi-tiet-danhmuc" @click="back">Quay lại</button>
          </v-flex>
        </v-layout>
      </v-container>
    </div>
    <v-dialog
      v-model="dialog"
      width="428px"
    >
      <v-card>
          <v-card-title>
            <span class="headline">Thay đổi phòng ban</span>
          </v-card-title>
          <v-card-text>
            <v-container>
              <v-row>
                <v-col cols="12" sm="6" md="4">
                  <v-text-field label="Tên tài khoản" readonly v-model="userModel.firstName"></v-text-field><br>
                </v-col>
                <v-col cols="12">
                  <v-text-field label="Địa chỉ email" readonly v-model="userModel.emailAddress"></v-text-field><br>
                </v-col>
                <v-col cols="12">
                  <v-autocomplete
                    label="Phòng ban"
                    v-model="selectPhongBan"
                    persistent-hint
                    :items="danhSachPhongBan"
                    item-text="departmentName"
                    item-value="departmentCode" 
                    height="15"   
                      >
                        <template v-slot:append-outer>

                        </template>
                  </v-autocomplete>
                </v-col>
              </v-row>
            </v-container>
          </v-card-text>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn color="blue darken-1" flat text @click="dialog = false">Thoát</v-btn>
            <v-btn color="blue darken-1" flat text @click="UpdateUser">Cập nhập</v-btn>
          </v-card-actions>
        </v-card>
    </v-dialog>
    <div id="danh-sach" v-if="this.$route.query.aticon === 'sua-danh-muc'">
      <v-flex xs12>
        <div class="title-chitiet text-md-center" style="padding-top: 5px; height: 20px;">
          <strong class="title-chitiet-danh-muc">Danh sách tài khoản</strong>
        </div>
      </v-flex>
      <v-flex xs12>
        <v-container fluid grid-list-md>
          <div class="tableEventList__class" style="width:70%;margin: 0 auto; overflow: hidden;">
            <v-container>
              <v-layout>
                <v-flex xs12>
                  <v-layout wrap row>
                    <v-flex xs5>
                      <v-layout align-center>
                        <v-flex xs3>
                          <label>Phòng ban:</label>
                        </v-flex>
                        <v-flex xs9>
                          <v-autocomplete
                            v-model="searchPhongBan"
                            persistent-hint
                            :items="danhSachPhongBan"
                            item-text="departmentName"
                            item-value="departmentCode" 
                            height="15"   
                              >
                                <template v-slot:append-outer>

                                </template>
                          </v-autocomplete>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12>
                      <v-data-table
                          v-model="selected"
                          v-bind:headers="headers"
                          v-bind:items="users"
                          select-all
                          item-key="userId"
                          no-data-text = "Không có dữ liệu"
                          hide-actions
                        >
                        <template slot="headers" scope="props">
                          <tr>
                            <th v-for="header in props.headers" :key="header.text"
                            >
                              {{ header.text }}
                            </th>
                            <th></th>
                          </tr>
                        </template>
                        <template slot="items" scope="props">
                          <tr>
                            <td class="text-xs-center">{{  page*pagesize - pagesize + props.index + 1 }}</td>
                            <td class="text-xs-center">{{ props.item.emailAddress }}</td>
                            <td class="text-xs-center">{{ props.item.firstName }}</td>
                            <td class="text-xs-center">{{ props.item.departmentName }}</td>
                            <td class="text-xs-center"> <span @click="thayDoiPhongBan(props.item)" class="action-table"><strong>Thay đổi phòng ban</strong></span></td>
                          </tr>
                        </template>
                      </v-data-table>
                    </v-flex>
                  </v-layout> 
                </v-flex>
              </v-layout>
            </v-container>

          </div>
          <div class="text-xs-right layout wrap" style="width: 70%;margin: 0 auto;">
            <div class="flex pagging-table px-2">
              <tiny-pagination :page="page" :pagesize="pagesize" @tiny:change-page="paggingData"></tiny-pagination>
            </div>
          </div> 
        </v-container>
      </v-flex>
    </div>
  </div>
</template>
<script>
import TinyPagination from '../hanghai_pagination.vue'
export default {
  components: {
    'tiny-pagination': TinyPagination,
  },
  data() {
    return {
      dialog: false,
      selected: [],
      pagesize: 10,
      page: 1,
      danhSachPhongBan: [],
      departmentNameRules: [v => !!v || "Chưa nhập tên phòng ban"],
      transactionTypeVNDRules: [v => !!v || "Chưa chọn mã giao dịch VNĐ "],
      transactionTypeUSDRules: [v => !!v || "Chưa chọn mã giao dịch USD "],
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      maritime: [],
      transactionType: [],
      selectMaritime: "",
      selectPhongBan: '',
      searchPhongBan: '',
      btnText: "",
      categoryModel: {
        id: 0,
        maritimeCode: "",
        departmentCode: "",
        departmentName: "",
        transactionTypeVND: "",
        transactionTypeVND: ""
      },
      userModel: {
        departmentCode: "",
        departmentName: "",
        emailAddress: "",
        firstName: "",
        portCode: "",
        screenName: "",
        status: 0,
        userId: 0
      },
      headers: [
        {
          sortable: false,
          text: "STT",
          align: "center"
        },
        {
          sortable: false,
          text: "Tài khoản",
          align: "center"
        },
        {
          sortable: false,
          text: "Tên tài khoản",
          align: "center"
        },
        {
          sortable: false,
          text: "Phòng ban",
          align: "center"
        }
      ],
      users: []

    };
  },
  computed: {
    categoryId() {
      return this.$route.query.categoryId;
    },
    id() {
      return this.$route.query.id;
    },
    maritimeCurrent() {
      return this.$store.getters["category/maritimeCurrent"];
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập phòng ban";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới phòng ban";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Xóa phòng ban";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  watch: {
    searchPhongBan (val) {
      this.selectPhongBan = val
      let vm = this
      this.pagesize = 10
      this.page = 1
      let params = {
        departmentCode: vm.searchPhongBan,
        start: 0,
        end:  10
      };
      vm.$store
        .dispatch("category/getUsers", {departmentCode: val})
        .then(res => {
          vm.users = res;
        });
       
    }
  },
  methods: {
    thayDoiPhongBan (item) {
      this.dialog = true
      this.userModel = item
    },
    async UpdateUser () {
      if(this.selectPhongBan){
        let vm = this
        await this.$store.dispatch('category/updateUserPort', {user: this.userModel, departmentCode: this.selectPhongBan})
        this.dialog = false
        vm.$store
          .dispatch("category/getUsers", {departmentCode: vm.searchPhongBan})
          .then(res => {
            vm.users = res;
          });
      }
    },
    // toggleAll () {
    //   if (this.selected.length) this.selected = []
    //   else this.selected = this.users.slice()
    //   console.log(this.selected)
    // },
    submit() {
      if (this.$route.query.aticon === "sua-danh-muc") {
        if (this.$refs.form.validate()) {
          this.editCategory();
        }
      } else if (this.$route.query.aticon === "them-danh-muc") {
        if (this.$refs.form.validate()) {
          this.addCategory();
        }
      } else if (this.$route.query.aticon === "xoa-danh-muc") {
        this.delCategory();
      }
    },
    back() {
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async editCategory() {
      let params = {
        categoryId: this.categoryId,
        departmentCode: this.categoryModel.departmentCode,
        departmentName: this.categoryModel.departmentName,
        transactionTypeVND: this.categoryModel.transactionTypeVND,
        transactionTypeUSD: this.categoryModel.transactionTypeUSD
      };

      await this.$store
        .dispatch("category/editCategoryListItems", params)
        .then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async delCategory() {
      let params = {
        categoryId: this.categoryId,
        id: this.categoryModel.id,
        departmentCode: this.categoryModel.departmentCode,
        departmentName: this.categoryModel.departmentName,
        transactionTypeVND: this.categoryModel.transactionTypeVND,
        transactionTypeUSD: this.categoryModel.transactionTypeUSD
      };

      await this.$store
        .dispatch("category/deleteCategoryListItems", params)
        .then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async addCategory() {
      let params = {
        categoryId: this.categoryId,
        departmentCode: this.categoryModel.departmentCode,
        departmentName: this.categoryModel.departmentName,
        transactionTypeVND: this.categoryModel.transactionTypeVND,
        transactionTypeUSD: this.categoryModel.transactionTypeUSD
      };
      await this.$store
        .dispatch("category/addCategoryListItems", params)
        .then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async getDetailCategory() {
      let vm = this;
      this.$store.dispatch("category/getMaritime").then(res => {
        vm.maritime = res.data;
      });
      this.$store
        .dispatch("category/getDanhMuc", {categoryId: "VMA_TRANSACTION_DEPARTMENT", portOfAuthority: vm.maritimeCurrent.maritimeCode})
        .then(res => {
          this.danhSachPhongBan = res;
        });
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          departmentCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
            .then(res => {
              vm.categoryModel.portOfAuthority = res.portOfAuthority;
              vm.categoryModel.departmentCode = res.departmentCode;
              vm.categoryModel.departmentName = res.departmentName;
              vm.categoryModel.transactionTypeVND = res.transactionTypeVND;
              vm.categoryModel.transactionTypeUSD = res.transactionTypeUSD;
              vm.categoryModel.id = res.id;

              vm.selectMaritime = vm.categoryModel.portOfAuthority;
              vm.searchPhongBan = vm.categoryModel.departmentCode;
              vm.selectPhongBan = vm.categoryModel.departmentCode
            });
        vm.$store
          .dispatch("category/getVmaTransactionTypes",  {portOfAuthority: this.categoryModel.portOfAuthority})
          .then(res => {
            vm.transactionType = res;
          });
      } else {
        vm.categoryModel.portOfAuthority = vm.maritimeCurrent.maritimeCode;
        vm.selectMaritime = vm.categoryModel.portOfAuthority;
        console.log()
        vm.$store
          .dispatch("category/getVmaTransactionTypes", {portOfAuthority: vm.categoryModel.portOfAuthority})
          .then(res => {
            vm.transactionType = res;
          });

      }
    },
    paggingData (config) {
      this.pagesize = config.pagesize
      this.page = config.page 
      let vm = this
      let params = {
        departmentCode: vm.searchPhongBan,
        start: config.page*config.pagesize - config.pagesize,
        end:  config.page*config.pagesize
      };     
      this.$store
        .dispatch("category/getUsers", params)
        .then(res => {
          vm.users = res;
        });

    }
  }
};
</script>
<style scoped>
.v-input{
  font-size: 13px;
}
.v-table{
  background-color: #fff0;
}
.mx-auto.v-card.v-card--flat.v-sheet.theme--light {
  background-color: #fff0;
}
</style>