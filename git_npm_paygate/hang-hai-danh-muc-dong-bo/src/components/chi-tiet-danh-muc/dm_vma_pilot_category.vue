<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Hạng hoa tiêu</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <!-- <v-flex xs12 >
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã hạng hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.pilotCategoryCode"
                    readonly
                    :disabled="this.$route.query.aticon === 'them-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên hạng hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.pilotCategoryName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="pilotCategoryNameRules"
                    height="25"
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
                  <v-text-field
                    v-model="categoryModel.modifiedDate"
                    
                    readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>

            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Giới hạn chiều dài tối đa:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.maxLength"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="maxLengthRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Trọng tải đăng ký toàn phần:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.grossTonage"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="grossTonageRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thời gian dẫn tàu an toàn:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.safeTime"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="safeTimeRules"
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
          <button flat class="btn-chi-tiet-danhmuc" @click="back">Quay lại</button>
        </v-flex>
      </v-layout>
    </v-container>
  </div>
</template>
<script>
export default {
  data() {
    return {
      safeTimeRules: [v => !!v || "Chưa nhập thời gian dẫn tàu an toàn"],
      grossTonageRules: [v => !!v || "Chưa nhập trọng tải"],
      maxLengthRules: [v => !!v || "Chưa nhập giới hạn chiều dài tối đa"],
      pilotCategoryNameRules: [v => !!v || "Chưa tên hạng hoa tiêu"],
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        pilotCategoryCode: "",
        pilotCategoryName: "",
        maxLength: "",
        grossTonage: "",
        safeTime: "",
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
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập hạng hoa tiêu";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới hạng hoa tiêu";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa hạng hoa tiêu";
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
        pilotCategoryCode: this.id,
        pilotCategoryName: this.categoryModel.pilotCategoryName,
        maxLength: this.categoryModel.maxLength,
        grossTonage: this.categoryModel.grossTonage,
        safeTime: this.categoryModel.safeTime,
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
        pilotCategoryCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // pilotCategoryName: this.categoryModel.pilotCategoryName,
        // maxLength: this.categoryModel.maxLength,
        // grossTonage: this.categoryModel.grossTonage,
        // safeTime: this.categoryModel.safeTime,
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
        // pilotCategoryCode: this.categoryModel.pilotCategoryCode,
        pilotCategoryName: this.categoryModel.pilotCategoryName,
        maxLength: this.categoryModel.maxLength,
        grossTonage: this.categoryModel.grossTonage,
        safeTime: this.categoryModel.safeTime,
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
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          pilotCategoryCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.pilotCategoryCode = res.pilotCategoryCode;
            vm.categoryModel.pilotCategoryName = res.pilotCategoryName;
            vm.categoryModel.maxLength = res.maxLength;
            vm.categoryModel.grossTonage = res.grossTonage;
            vm.categoryModel.safeTime = res.safeTime;
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

