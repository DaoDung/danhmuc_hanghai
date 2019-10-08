<template>
<div>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Công ty tàu lai</strong>
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
                  <label for="">Mã công ty tàu lai (MST):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.tugboatCompanyCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc' || this.$route.query.aticon === 'sua-danh-muc'"
                    :disabled="this.$route.query.aticon === 'them-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên công ty tàu lai</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.tugboatCompanyName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="tugboatCompanyNameRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Địa chỉ</label>
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
                  <label for>Số điện thoại</label>
                  
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
                  <label for>Số Fax</label>
                  
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
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thư điện tử</label>
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
            v-if="this.$route.query.aticon !== 'them-danh-muc'"
            @click="getDanhSachCon"
          >Xem danh sách tàu lai</button>
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
</div>

  
</template>
<script>
export default {
  data() {
    return {
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      tugboatCompanyNameRules: [v => !!v || "Chưa nhập tên công ty tàu lai"],
      maritime: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        maritimeName: "",
        tugboatCompanyCode: "",
        tugboatCompanyName: "",
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
      this.btnText = "Cập nhập công ty tàu lai";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới công ty tàu lai";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa công ty tàu lai";
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
        tugboatCompanyCode: this.id,
        tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        companyAddress: this.categoryModel.companyAddress,
        contactEmail: this.categoryModel.contactEmail,
        telNo: this.categoryModel.telNo,
        faxNo: this.categoryModel.faxNo,
        remarks: this.categoryModel.remarks,
        maritimeCode: this.categoryModel.maritimeCode,
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
        tugboatCompanyCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        // companyAddress: this.categoryModel.companyAddress,
        // contactEmail: this.categoryModel.contactEmail,
        // telNo: this.categoryModel.telNo,
        // faxNo: this.categoryModel.faxNo,
        // remarks: this.categoryModel.remarks,
        // maritimeCode: this.categoryModel.maritimeCode
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
        tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        companyAddress: this.categoryModel.companyAddress,
        contactEmail: this.categoryModel.contactEmail,
        telNo: this.categoryModel.telNo,
        faxNo: this.categoryModel.faxNo,
        remarks: this.categoryModel.remarks,
        maritimeCode: this.categoryModel.maritimeCode
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
          tugboatCompanyCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.tugboatCompanyCode = res.tugboatCompanyCode;
            vm.categoryModel.tugboatCompanyName = res.tugboatCompanyName;
            vm.categoryModel.companyAddress = res.companyAddress;
            vm.categoryModel.portHarbourNameVN = res.portHarbourNameVN;
            vm.categoryModel.telNo = res.telNo;
            vm.categoryModel.faxNo = res.faxNo;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.contactEmail = res.contactEmail;
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
    },
    getDanhSachCon () {
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: 'DM_VMA_TUGBOAT', tugboatCompanyCode: this.id}
      });  
    }
  }
};
</script>
