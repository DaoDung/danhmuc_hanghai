<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Bến cảng hàng hải</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <form class="form-chi-tiet-danh-muc">
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
                    item-value="maritimeNameVN"
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
                  <label for>Thời điểm cập nhật</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
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
                  <v-text-field
                    v-model="categoryModel.portCodeHH"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
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
                  <v-autocomplete
                    v-model="portRegionCodeModel"
                    persistent-hint
                    :items="KhuVucHangHai"
                    item-text="portRegionNameVN"
                    item-value="portRegionCode"
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
                  <label for>Bến cảng</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field v-model="categoryModel.portHarbourNameVN"
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
                  <v-textarea name="input-7-1" v-model="categoryModel.note"></v-textarea>
                </v-flex>
              </v-layout>
            </v-flex>
          </form>
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
  props: {
    category: {
      type: Object,
      default: {}
    }
  },
  data() {
    return {
      date: new Date().toISOString().substr(0, 10),
      menu: false,
      modal: false,
      menu2: false,
      maritime: [],
      selectMaritime: "",
      portRegionCodeModel: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: 0,
        maritimeNameVN: "",
        maritimeName: "",
        portRegionNameVN: "",
        note: "",
        portHarbourNameVN: "",
        portHarbourCode: "",
        portRegion: "",
        portRegionCode: "",
        portCodeHH: ""
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
    KhuVucHangHai() {
      return this.$store.getters["category/KhuVucHangHai"];
    }
  },
  created() {
    if (this.$route.query.aticon === "sua-danh-muc") {
      this.btnText = "Cập nhập bến cảng";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới bến cảng";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa bến cảng";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  watch: {
    category() {
      this.getDetailCategory();
    },
    portRegionCodeModel(val) {
      let vm = this;
      this.$store.dispatch("category/getCangBienHangHai", val).then(
        res => {
          vm.categoryModel.portCodeHH = res.portCodeHH;
        },
        error => {}
      );
      this.categoryModel.portRegion = val;
    }
  },
  methods: {
    submit() {
      if (this.$route.query.aticon === "sua-danh-muc") {
        this.editCategory();
      } else if (this.$route.query.aticon === "them-danh-muc") {
        this.addCategory();
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
        portRegion: this.categoryModel.portRegion,
        portRegionCode: this.categoryModel.portRegionCode,
        portHarbourCode: this.id,
        note: this.categoryModel.note,
        portHarbourNameVN: this.categoryModel.portHarbourNameVN,
        syncVersion: this.categoryModel.syncVersion
      };
      let vm = this;
      await this.$store.dispatch("category/editCategoryListItems", params).then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async delCategory() {
      let params = {
        categoryId: this.categoryId,
        portHarbourCode: this.id,
        syncVersion: this.categoryModel.syncVersion
      };
      let vm = this;
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
        portRegion: this.categoryModel.portRegion,
        portRegionCode: this.categoryModel.portRegionCode,
        note: this.categoryModel.note,
        portHarbourNameVN: this.categoryModel.portHarbourNameVN
      };
      let vm = this;
      await this.$store.dispatch("category/addCategoryListItems", params).then();
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    async getDetailCategory() {
      let vm = this;
      this.$store.dispatch("category/getMaritime").then(
        res => {
          vm.maritime = res.data;
        },
        error => {}
      );
      await this.$store.dispatch("category/getMaritimeCurrent").then(
        res => {
          vm.categoryModel.maritimeCode = res.maritimeCode;
          vm.categoryModel.maritimeNameVN = res.maritimeNameVN;
        },
        error => {}
      );
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          portHarbourCode: this.id
        };
        await this.$store.dispatch("category/getDetailCategory", params).then(
          res => {
            vm.categoryModel.maritimeName = res.maritimeName;
            vm.categoryModel.portRegionNameVN = res.portRegionNameVN;
            vm.categoryModel.note = res.note;
            vm.categoryModel.portHarbourNameVN = res.portHarbourNameVN;
            vm.categoryModel.portHarbourCode = res.portHarbourCode;
            vm.categoryModel.portRegion = res.portRegion;
            vm.categoryModel.portRegionCode = res.portRegionCode;
            vm.categoryModel.portCodeHH = res.portCodeHH;
            vm.categoryModel.syncVersion = res.syncVersion;

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

            vm.portRegionCodeModel = vm.categoryModel.portRegion;
            vm.selectMaritime = vm.categoryModel.maritimeName;
          },
          error => {}
        );
      } else {
        vm.categoryModel.maritimeName = "";
        vm.categoryModel.portRegionNameVN = "";
        vm.categoryModel.note = "";
        vm.categoryModel.portHarbourNameVN = "";
        vm.categoryModel.portHarbourCode = "";
        vm.categoryModel.portRegion = "";
        vm.categoryModel.portRegionCode = "";
        vm.categoryModel.portCodeHH = "";
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

        vm.selectMaritime = vm.categoryModel.maritimeNameVN;
      }
    }
  }
};
</script>

<style>
.form_ben_cang .v-input__slot {
  border: 1px solid #949494;
  border-bottom: 0px;
}
</style>