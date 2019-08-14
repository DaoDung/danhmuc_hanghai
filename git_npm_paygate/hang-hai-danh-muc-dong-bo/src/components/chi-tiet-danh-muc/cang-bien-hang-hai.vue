<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Cảng biển hàng hải</strong>
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
                    :readonly="this.$route.query.aticon !== 'chi-tiet-danh-muc'"
                    required
                    :rules="maritimeRules"
                    height="25"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-select
                    v-model="selectMaritime"
                    item-text="maritimeNameVN"
                    item-value="maritimeNameVN"
                    :items="maritime"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  >
                  ></v-select>-->
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
                    v-model="categoryModel.validatedFrom"
                    prepend-icon="event"
                    readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Cảng biển hàng hải</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.name"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="nameRules"
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
                    v-model="categoryModel.note"
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
      nameRules: [v => !!v || "Chưa nhập tên Cảng biển hàng hải"],
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      btnText: "",
      maritime: [],
      selectMaritime: "",
      categoryModel: {
        syncVersion: "",
        validatedFrom: "",
        maritimeCode: "",
        maritimeNameVN: "",
        dataitemId: "",
        shortName: "",
        name: "",
        code0: "",
        status: "",
        node1: "",
        node2: "",
        cityCode: "",
        note: ""
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
      this.btnText = "Cập nhập Cảng biển hàng hải";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới Cảng biển hàng hải";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa Cảng biển hàng hải";
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
        dataitemId: this.id,
        name: this.categoryModel.name,
        node2: this.categoryModel.node2,
        code0: this.categoryModel.code0,
        note: this.categoryModel.note,
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
        node2: this.categoryModel.node2,
        note: this.categoryModel.note,
        name: this.categoryModel.name,
        code0: this.categoryModel.code0
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
          node2: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.dataitemId = res.dataItemId;
            vm.categoryModel.shortName = res.shortName;
            vm.categoryModel.name = res.name;
            vm.categoryModel.code0 = res.code0;
            vm.categoryModel.status = res.status;
            vm.categoryModel.node1 = res.node1;
            vm.categoryModel.syncVersion = res.syncVersion;
            (vm.categoryModel.node2 = res.node2),
              (vm.categoryModel.cityCode = res.cityCode),
              (vm.categoryModel.note = res.note);
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

            vm.selectMaritime = res.node1;
          });
      } else {

        vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = vm.maritimeCurrent.maritimeNameVN;

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

        vm.selectMaritime = vm.categoryModel.maritimeCode;
      }
    }
  }
};
</script>