<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Cảng vụ hàng hải</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Ký hiệu cảng vụ:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.maritimeReference"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="maritimeReferenceRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thời điểm cập nhật</label>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field v-model="categoryModel.modifiedDate" prepend-icon="event" readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên cảng vụ hàng hải:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.maritimeNameVN"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="maritimeNameeRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên cảng vụ hàng hải (Tiếng Anh):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.maritimeName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="maritimeNameeRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tỉnh/ Thành phố:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.cityCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Địa chỉ đầy đủ:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.address"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
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
      maritimeReferenceRules: [
        v => !!v || "Ký hiệu cảng vụ là bắt buộc",
        v => (v && v.length <= 10) || "Ký hiệu không quá 10 ký tự"
      ],
      maritimeNameeRules: [v => !!v || "Tên cảng vụ là bắt buộc"],
      date: new Date().toISOString().substr(0, 10),
      menu: false,
      modal: false,
      menu2: false,
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        maritimeName: "",
        cityCode: "",
        address: "",
        maritimeReference: "",
        stateCode: ""
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
    let d = new Date();
    this.datee =
      d.getDate() +
      "/" +
      (d.getMonth() + 1) +
      "/" +
      d.getFullYear() +
      " " +
      d.getHours() +
      ":" +
      d.getMinutes();
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập Cảng vụ hàng hải";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới Cảng vụ hàng hải";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa Cảng vụ hàng hải";
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
        maritimeReference: this.categoryModel.maritimeReference,
        maritimeName: this.categoryModel.maritimeName,
        address: this.categoryModel.address,
        stateCode: this.categoryModel.stateCode,
        cityCode: this.categoryModel.cityCode,
        maritimeCode: this.id,
        maritimeNameVN: this.categoryModel.maritimeNameVN,
        syncVersion: this.categoryModel.syncVersion
      };

      await this.$store
        .dispatch("category/editCategoryListItems", params)
        .then();
      this.back();
    },
    async delCategory() {
      let params = {
        maritimeCode: this.id,
        categoryId: this.categoryId,
        syncVersion: this.categoryModel.syncVersion
      };

      await this.$store
        .dispatch("category/deleteCategoryListItems", params)
        .then();
      this.back();
    },
    async addCategory() {
      let params = {
        categoryId: this.categoryId,
        maritimeReference: this.categoryModel.maritimeReference,
        maritimeName: this.categoryModel.maritimeName,
        address: this.categoryModel.address,
        stateCode: this.categoryModel.stateCode,
        cityCode: this.categoryModel.cityCode,
        maritimeNameVN: this.categoryModel.maritimeNameVN
      };

      await this.$store
        .dispatch("category/addCategoryListItems", params)
        .then();
      this.back();
    },
    async getDetailCategory() {
      let vm = this;
      vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          maritimeCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.maritimeNameVN = res.maritimeNameVN;
            vm.categoryModel.maritimeName = res.maritimeName;
            vm.categoryModel.cityCode = res.cityCode;
            vm.categoryModel.address = res.address;
            vm.categoryModel.maritimeReference = res.maritimeReference;
            vm.categoryModel.stateCode = res.stateCode;
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
          });
      } else {
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
<style>
.form_cang_vu .v-input__slot {
  border: 1px solid #949494;
  border-bottom: 0px;
}
</style>

