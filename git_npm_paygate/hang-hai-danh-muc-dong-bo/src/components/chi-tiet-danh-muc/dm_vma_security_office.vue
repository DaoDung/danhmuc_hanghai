<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Cơ quan quyết định bắt giữ</strong>
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
                    height="25"
                    readonly
                    required
                    :rules="maritimeRules"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-select
                    v-model="selectMaritime"
                    item-text="maritimeNameVN"
                    item-value="maritimeCode"
                    :items="maritime"
                  >
                  ></v-select>-->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thời điểm cập nhật</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field v-model="categoryModel.modifiedDate"  readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <!-- <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã cơ quan ra quyết định bắt giữ:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.securityOfficeCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Cơ quan ra quyết định bắt giữ:</label>
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
                  <label for>Địa chỉ:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.companyAddress"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="companyAddressRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thư điện tử:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.contactEmail"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="contactEmailRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số điện thoại:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.telNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="telNoRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số Fax:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.faxNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="faxNoRules"
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
export default {
  data() {
    return {
      faxNoRules: [v => !!v || "Chưa nhập fax"],
      telNoRules: [v => !!v || "Chưa nhập số điện thoại", v => /((09|03|07|08|05)+([0-9]{8})\b)/g.test(v) || 'Số điện thoại không hợp lệ'],
      contactEmailRules: [v => !!v || "Chưa nhập email" , v => /.+@.+/.test(v) || 'Email không hợp lệ'],
      companyAddressRules: [v => !!v || "Chưa nhập địa chỉ"],
      companyNameRules: [v => !!v || "Chưa nhập tên công ty"],
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      maritime: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        securityOfficeCode: "",
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
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập Cơ quan quyết định bắt giữ";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới Cơ quan quyết định bắt giữ";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa Cơ quan quyết định bắt giữ";
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
        securityOfficeCode: this.id,
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
        securityOfficeCode: this.id,
        syncVersion: this.categoryModel.syncVersion
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
        // securityOfficeCode: this.categoryModel.securityOfficeCode,
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
          securityOfficeCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.securityOfficeCode = res.securityOfficeCode;
            vm.categoryModel.companyName = res.companyName;
            vm.categoryModel.companyAddress = res.companyAddress;
            vm.categoryModel.contactEmail = res.contactEmail;
            vm.categoryModel.telNo = res.telNo;
            vm.categoryModel.faxNo = res.faxNo;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.syncVersion = res.syncVersion;
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
        vm.selectMaritime = vm.categoryModel.maritimeCode;
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
      }
    }
  }
};
</script>

