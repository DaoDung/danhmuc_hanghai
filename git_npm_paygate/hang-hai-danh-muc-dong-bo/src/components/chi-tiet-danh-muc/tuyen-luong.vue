<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Tuyến luồng</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Mã code:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.code0"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="code0Rules"
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
                  <v-text-field v-model="categoryModel.validatedFrom" prepend-icon="event" readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tuyến luồng</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.name"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="nameRules"
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
      code0Rules: [v => !!v || "Chưa nhập mã code"],
      nameRules: [v => !!v || "Chưa nhập tên tuyến luồng"],
      btnText: "",
      categoryModel: {
        syncVersion: "",
        validatedFrom: "",
        code0: "",
        name: "",
        node1: ""
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
      this.btnText = "Cập nhập tuyến luồng";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới tuyến luồng";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa tuyến luồng";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  watch: {
    category() {
      this.getDetailCategory();
    }
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
        code0: this.categoryModel.code0,
        name: this.categoryModel.name,
        dataitemId: this.id,
        syncVersion: this.categoryModel.syncVersion
      };
      await this.$store.dispatch("category/editCategoryListItems", params).then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async delCategory() {
      let params = {
        categoryId: this.categoryId,
        dataitemId: this.id,
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
        code0: this.categoryModel.code0,
        name: this.categoryModel.name
      };
      await this.$store.dispatch("category/addCategoryListItems", params).then();
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
          dataitemId: this.id
        };
        await this.$store.dispatch("category/getDetailCategory", params).then(
          res => {
            vm.categoryModel.code0 = res.code0;
            vm.categoryModel.name = res.name;
            vm.categoryModel.node1 = res.node1;
            vm.categoryModel.syncVersion = res.syncVersion;

            if (res.validatedFrom) {
              let date = new Date(res.validatedFrom);
              vm.categoryModel.validatedFrom =
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
        );
      } else {
        let date = new Date();
        vm.categoryModel.validatedFrom =
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
.form_tuyen_luong .v-input__slot {
  border: 1px solid #949494;
  border-bottom: 0px;
}
</style>

