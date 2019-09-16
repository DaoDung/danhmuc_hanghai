<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Đại lý</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Mã đại lý(MST):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.shipAgencyCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="shipAgencyCodeRules"
                  ></v-text-field>
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
                  <label for>Tên đại lý:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.shipAgencyNameVN"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="shipAgencyNameVNRules"
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
                    v-model="categoryModel.addressVN"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="addressVNRules"             
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số điện thoai:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.phone"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    :rules="phoneRules"  
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Fax:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.fax"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Email:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.email"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    :rules="emailRules" 
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Người đại diện:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.representative1"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Chức danh:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.representativeTitle1"
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
      btnText: "",
      shipAgencyCodeRules: [v => !!v || "Chưa nhập mã đại lý(MST)", v => {
        if(v.length < 10){
          return "Mã đại lý (MST) phải ít nhất 10 ký tự"
        }
        return true
      }],
      shipAgencyNameVNRules: [v => !!v || "Chưa nhập tên đại lý"],
      addressVNRules: [v => !!v || "Chưa địa chỉ"],
      phoneRules: [v => /((09|03|07|08|05)+([0-9]{8})\b)/g.test(v) || 'Số điện thoại không hợp lệ'],
      emailRules: [ v => /.+@.+/.test(v) || 'Email không hợp lệ'],
      categoryModel: {
        modifiedDate: "",
        shipAgencyCode: "",
        shipAgencyNameVN: "",
        addressVN: "",
        phone: "",
        fax: "",
        email: "",
        representative1: '',
        representativeTitle1: '',
        syncVersion: '',
      }
    };
  },
  computed: {
    categoryId() {
      return this.$route.query.categoryId;
    },
    id() {
      return this.$route.query.id;
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập đại lý";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới đại lý";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa đại lý";
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
    async getDetailCategory() {
      let vm = this;
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          shipAgencyCode: this.id
        };
        await this.$store.dispatch("category/getDetailCategory", params).then(
          res => {

            vm.categoryModel.shipAgencyCode = res.shipAgencyCode;
            vm.categoryModel.shipAgencyNameVN = res.shipAgencyNameVN;
            vm.categoryModel.addressVN = res.addressVN;
            vm.categoryModel.phone = res.phone;
            vm.categoryModel.fax = res.fax;
            vm.categoryModel.email = res.email;
            vm.categoryModel.representative1 = res.representative1;
            vm.categoryModel.representativeTitle1 = res.representativeTitle1;
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
          },
          error => {}
        );
      } else {
        // vm.categoryModel.shipAgencyCode = "";
        // vm.categoryModel.shipAgencyNameVN = "";
        // vm.categoryModel.addressVN = "";
        // vm.categoryModel.phone = "";
        // vm.categoryModel.fax = "";
        // vm.categoryModel.email = "";
        // vm.categoryModel.representative1 = "";
        // vm.categoryModel.representativeTitle1 = "";
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
    async editCategory() {
      let params = {
        categoryId: this.categoryId,
        shipAgencyCode: this.categoryModel.shipAgencyCode,
        shipAgencyNameVN: this.categoryModel.shipAgencyNameVN,
        phone: this.categoryModel.phone,
        fax: this.categoryModel.fax,
        email: this.categoryModel.email,
        addressVN: this.categoryModel.addressVN,
        representative1: this.categoryModel.representative1,
        representativeTitle1: this.categoryModel.representativeTitle1,
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
        shipAgencyCode: this.categoryModel.shipAgencyCode,
        // shipAgencyNameVN: this.categoryModel.shipAgencyNameVN,
        // phone: this.categoryModel.phone,
        // fax: this.categoryModel.fax,
        // email: this.categoryModel.email
        // addressVN: this.categoryModel.addressVN
        syncVersion: this.categoryModel.syncVersion
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
        shipAgencyCode: this.categoryModel.shipAgencyCode,
        shipAgencyNameVN: this.categoryModel.shipAgencyNameVN,
        phone: this.categoryModel.phone,
        fax: this.categoryModel.fax,
        email: this.categoryModel.email,
        addressVN: this.categoryModel.addressVN,
        representative1: this.categoryModel.representative1,
        representativeTitle1: this.categoryModel.representativeTitle1,
      };

      await this.$store
        .dispatch("category/addCategoryListItems", params)
        .then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    }
  }
};
</script>
