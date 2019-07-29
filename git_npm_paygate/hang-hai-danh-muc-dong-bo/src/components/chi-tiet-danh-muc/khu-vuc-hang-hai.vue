<template>
<div>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Khu vực hàng hải</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Cảng vụ hàng hải:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="selectMaritime"
                    persistent-hint
                    :items="maritime"
                    item-text="maritimeNameVN"
                    item-value="maritimeCode"
                    readonly
                    height="25"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-select
                    v-model="selectMaritime"
                    item-text="maritimeNameVN"
                    item-value="maritimeNameVN"
                    :items="maritime"
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
                  <v-text-field v-model="categoryModel.modifiedDate" prepend-icon="event" readonly
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
                  <v-autocomplete
                    v-model="categoryModel.portCodeRef"
                    persistent-hint
                    :items="CangBienHangHai"
                    item-text="name"
                    item-value="node2"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="portCodeRules"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-text-field
                    v-model="categoryModel.portCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>-->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Khu vực hàng hải</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.portRegionName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                    required
                    :rules="portRegionNameRules"
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
</div>
</template>
<script>
export default {
  data() {
    return {
      maritime: [],
      CangBienHangHai: [],
      portCodeRules: [v => !!v || "Chưa chọn Cảng biển hàng hải"],
      portRegionNameRules: [v => !!v || "Chưa nhập tên Khu vực hàng hải"],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: '',
        maritimeNameVN: "",
        maritimeName: "",
        portCode: "",
        portRegionName: "",
        portCodeRef: '',
        portRegionRef: ''
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
      this.btnText = "Cập nhập khu vực hàng hải";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới khu vực hàng hải";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu khu vực hàng hải";
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
        portCodeRef: this.categoryModel.portCodeRef,
        portRegionCode: this.id,
        portRegionNameVN: this.categoryModel.portRegionName,
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
        portRegionCode: this.id,
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
        portCodeRef: this.categoryModel.portCodeRef,
        portRegionNameVN: this.categoryModel.portRegionName
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
          portRegionCode: this.id
        };
        await this.$store.dispatch("category/getDetailCategory", params).then(res => {
          vm.categoryModel.maritimeName = res.maritimeName;
          vm.categoryModel.portCode = res.portCode;
          vm.categoryModel.portRegionName = res.portRegionName;
          vm.categoryModel.portCodeRef = res.portCodeRef;
          vm.categoryModel.portRegionRef = res.portRegionRef;
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

          vm.selectMaritime = vm.categoryModel.portRegionRef;
        });
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_DATAITEM_GROUP107", maritimeCode: vm.categoryModel.portRegionRef})
          .then(res => {
            this.CangBienHangHai = res;
          });
      } else {
        await this.$store.dispatch("category/getMaritimeCurrent").then(res => {
          vm.categoryModel.maritimeCode = res.maritimeCode;
          vm.categoryModel.maritimeNameVN = res.maritimeNameVN;
        });
        vm.categoryModel.maritimeName = "";
        vm.categoryModel.portCode = "";
        vm.categoryModel.portRegionName = "";
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

        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_DATAITEM_GROUP107", status: '1' })
          .then(res => {
            this.CangBienHangHai = res;
          });
      
      }
    }
  }
};
</script>
<style>
.chi-tiet {
  width: 100%;
  border-bottom: 1px solid #e1e2e1;
}
.title-chitiet-danh-muc {
  font-size: 15px;
  color: #1976d2;
}
.title-chitiet {
  height: 40px;
}
.btn-chi-tiet-danhmuc {
  color: #1976d2;
}
.form-chi-tiet-danh-muc {
  width: 50%;
  margin: 0 auto;
}
.red--text {
  padding-left: 5px;
}
.chi-tiet .v-input {
  font-size: 13px;
}
.chi-tiet .v-text-field {
  padding-top: 0px;
  margin-top: 0px;
}
.btn-chi-tiet-danhmuc {
  padding: 5px 12px;
  font-weight: bold;
  background: #0b72ba;
  color: #fff;
  border-radius: 5px;
  height: 39px;
  margin: 0 5px;
  box-sizing: border-box;
}
.btn-chi-tiet-danhmuc i {
  color: #fff;
}
.teal--text.text--darken-2 {
  color: #fff !important;
  caret-color: #fff !important;
  font-size: 19px;
}
.teal--text .text--darken-2 {
  color: #fff !important;
  caret-color: #fff !important;
  font-size: 19px;
}
</style>
