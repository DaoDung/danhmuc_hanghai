<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Công ty sửa chữa tàu</strong>
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
                  <label for>Thời điểm cập nhật:</label>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field v-model="categoryModel.modifiedDate"  readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên công ty sửa chữa tàu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.companyName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="companyNameRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>MST:</label>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="taxCodeModel"
                    :readonly="(this.$route.query.aticon === 'chi-tiet-danh-muc' || switch1  || this.$route.query.aticon === 'xoa-danh-muc') && this.$route.query.aticon !== 'sua-danh-muc'"
                    height="25"
                    :rules="taxCodeRules"
                    :error-messages="errors"
                    required
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 md2>
                  <span v-if="this.$route.query.aticon === 'them-danh-muc'">Lấy mã mặc định</span>
                </v-flex>
                <v-flex xs12 md2>
                  <v-switch
                    v-model="switch1"
                    v-if="this.$route.query.aticon === 'them-danh-muc'"
                  ></v-switch>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Địa chỉ:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.companyAddress"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thư điện tử:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.contactEmail"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số điện thoại:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.telNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số Fax:</label>
                 
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.faxNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Ghi chú:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-textarea
                    name="input-7-1"
                    v-model="categoryModel.remarks"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-textarea>
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
          <button flat class="btn-chi-tiet-danhmuc" @click="back">
            Quay lại
          </button>
        </v-flex>
      </v-layout>
    </v-container>
  </div>
</template>
<script>
import axios from 'axios'

export default {
  data() {
    return {
      taxCodeModel: '',
      switch1: false,
      errors: [],
      errorsTaxCode: true,
      taxCodeRules: [v => {
        if (this.$route.query.aticon === 'chi-tiet-danh-muc' || this.$route.query.aticon === 'xoa-danh-muc'){
          return true
        }
        if (this.$route.query.aticon === 'sua-danh-muc') {
          if (!!v === false) {
            return true
          } else {
            return this.errorsTaxCode || 'Mã số thuế bị trùng'
          }
        }
        if (this.switch1) {
          return this.switch1 
        } 
        if (this.switch1 === false) {
          if (!!v === false) {
            return 'Chưa nhập MST'
          } else {
            return this.errorsTaxCode || 'Mã số thuế bị trùng'
          }
            
        }
      }], 
      faxNoRules: [v => !!v || "Chưa nhập  số fax"],
      telNoRules: [v => !!v || "Chưa nhập số điện thoại"],
      contactEmailRules: [v => !!v || "Chưa nhập địa chỉ email"],
      companyAddressRules: [v => !!v || "Chưa nhập địa chỉ"],
      companyNameRules: [v => !!v || "Chưa tên công ty sửa chữa tàu"],
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      
      maritime: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        shipYardCode: "",
        taxCode: "",
        companyName: "",
        companyAddress: "",
        contactEmail: "",
        telNo: "",
        faxNo: "",
        remarks: ""
      }
    };
  },
  computed: {
    categoryId() {
      return this.$route.query.categoryId;
    },
    id() {
      return this.$route.query.id;
    },
    maritimeCurrent () {
      return this.$store.getters["category/maritimeCurrent"]
    },
    originUrl () {
      return this.$store.getters["category/Url"]
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập công ty sửa chữa tàu";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới công ty sửa chữa tàu";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa công ty sửa chữa tàu";
    }
  },
  watch: {
    switch1 (val) {
      if (val) {
        this.categoryModel.taxCode = ''
      }
    },
    taxCodeModel (val) {
      let vm = this
      if (vm.$route.query.aticon === 'sua-danh-muc'  && val !== '') {
        if (val === vm.categoryModel.taxCode) {
          vm.errorsTaxCode = true
        } else {
          vm.checkTaxCode(val).then(
            res => {
              vm.errors = res.status === '200' ? [] : ['Mã số thuế đã tồn tại']
              vm.errorsTaxCode = res.status === '200'
            }
          )
        }
      }
      if (this.$route.query.aticon === 'them-danh-muc'  && val !== '') {
        vm.checkTaxCode(val).then(
            res => {
              vm.errors = res.status === '200' ? [] : ['Mã số thuế đã tồn tại']
              vm.errorsTaxCode = res.status === '200'
            }
          )
      }

    }
  },
  mounted() {
    this.getDetailCategory();
  },
  methods: {
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
        maritimeCode: this.categoryModel.maritimeCode,
        shipYardCode: this.id,
        taxCode: this.taxCodeModel,
        companyName: this.categoryModel.companyName,
        companyAddress: this.categoryModel.companyAddress,
        contactEmail: this.categoryModel.contactEmail,
        telNo: this.categoryModel.telNo,
        faxNo: this.categoryModel.faxNo,
        remarks: this.categoryModel.remarks,
        syncVersion: this.categoryModel.syncVersion
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
        // maritimeCode: this.categoryModel.maritimeCode,
        shipYardCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // taxCode: this.categoryModel.taxCode,
        // companyName: this.categoryModel.companyName,
        // companyAddress: this.categoryModel.companyAddress,
        // contactEmail: this.categoryModel.contactEmail,
        // telNo: this.categoryModel.telNo,
        // faxNo: this.categoryModel.faxNo,
        // remarks: this.categoryModel.remarks
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
        maritimeCode: this.categoryModel.maritimeCode,
        // shipYardCode: this.categoryModel.shipYardCode,
        taxCode: this.taxCodeModel,
        companyName: this.categoryModel.companyName,
        companyAddress: this.categoryModel.companyAddress,
        contactEmail: this.categoryModel.contactEmail,
        telNo: this.categoryModel.telNo,
        faxNo: this.categoryModel.faxNo,
        remarks: this.categoryModel.remarks
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
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          shipYardCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.shipYardCode = res.shipYardCode;
            vm.categoryModel.taxCode = res.taxCode;
            vm.categoryModel.companyName = res.companyName;
            vm.categoryModel.companyAddress = res.companyAddress;
            vm.categoryModel.contactEmail = res.contactEmail;
            vm.categoryModel.telNo = res.telNo;
            vm.categoryModel.faxNo = res.faxNo;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.syncVersion = res.syncVersion;
            vm.taxCodeModel = vm.categoryModel.taxCode
            if (res.modifiedDate) {
              let date = new Date(res.modifiedDate);
              vm.categoryModel.modifiedDate =
                date.getDate() +
                "/" +
                (date.getMonth() + 1) +
                "/" +
                date.getFullYear() +
                "  " +
                date.getHours() +
                ":" +
                (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes());
            }

            vm.selectMaritime = vm.categoryModel.maritimeCode;
          });
      } else {
        vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = vm.maritimeCurrent.maritimeNameVN;
        let date = new Date();
        vm.categoryModel.modifiedDate =
          date.getDate() +
          "/" +
          (date.getMonth() + 1) +
          "/" +
          date.getFullYear() +
          "  " +
          date.getHours() +
          ":" +
          (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes());

        vm.selectMaritime = vm.categoryModel.maritimeCode;
      }
    },
    callApiCheckTaxCode (query, cb, errorcb) {
      let vm = this
      let url = vm.originUrl.checkMST + '&taxCode=' + query + '&type=2'
      axios.get(url).then( res => {
          cb(res.data)
        }).catch( error => {
          errorcb(error)
        })
    },
    async checkTaxCode (val) {
      let vm = this
      return new Promise((resolve, reject) => {
        let cb = (data) => {
          resolve(data)
        }
        let errorcb = error => {
          reject(error)
        }
        vm.callApiCheckTaxCode(val, cb, errorcb)
      })
    }
  }
};
</script>

