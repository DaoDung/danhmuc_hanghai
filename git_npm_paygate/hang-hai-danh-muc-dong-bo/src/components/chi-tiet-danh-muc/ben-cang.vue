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
                    requeied
                    :rules="martimeRules"
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
                  <label for>Cảng biển hàng hải</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.portCodeHH"
                    readonly
                    requeied
                    :rules="portCodeHHRules"
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
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="portRegionCodeRules"
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
                  <v-text-field
                    v-model="categoryModel.portHarbourNameVN"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    requeied
                    :rules="portHarbourNameVNRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thứ tự hiển thị</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.sequenceNo"
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
      martimeRules: [v => !!v || "Chưa chọn Cảng vụ"],
      portCodeHHRules: [v => !!v || "Chưa chọn Cảng biển"],
      portRegionCodeRules: [v => !!v || "Chưa chọn Khu vực hàng hải"],
      portHarbourNameVNRules: [v => !!v || "Chưa nhập tên bến cảng"],
      portRegionCodeModel: "",
      maritime: [],
      KhuVucHangHai: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        maritimeName: "",
        portRegionNameVN: "",
        note: "",
        portHarbourNameVN: "",
        portHarbourCode: "",
        portRegion: "",
        portRegionCode: "",
        portCodeHH: "",
        sequenceNo: null
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
    portRegionCodeModel(val) {
      let vm = this;
      let khuVuc = this.KhuVucHangHai.find(e => e.portRegionCode === val)
      if(khuVuc.portCodeRef === ''){
         vm.categoryModel.portCodeHH = khuVuc.portCodeCB;
      } else {
        this.$store
          .dispatch("category/getDetailCategory", {categoryId: 'DM_DATAITEM_GROUP107', node2: khuVuc.portCodeRef})
          .then(res => {
            vm.categoryModel.portCodeHH = res.name
          })
      }
      this.categoryModel.portRegion = val;
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
        portRegion: this.categoryModel.portRegion,
        //portRegionCode: this.categoryModel.portRegionCode,
        portHarbourCode: this.id,
        note: this.categoryModel.note,
        portHarbourNameVN: this.categoryModel.portHarbourNameVN,
        syncVersion: this.categoryModel.syncVersion,
        sequenceNo: this.categoryModel.sequenceNo
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
        portHarbourCode: this.id,
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
        portRegion: this.categoryModel.portRegion,
        //portRegionCode: this.categoryModel.portRegionCode,
        note: this.categoryModel.note,
        portHarbourNameVN: this.categoryModel.portHarbourNameVN,
        sequenceNo: this.categoryModel.sequenceNo
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
          portHarbourCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeName = res.maritimeName;
            vm.categoryModel.portRegionNameVN = res.portRegionNameVN;
            vm.categoryModel.note = res.note;
            vm.categoryModel.portHarbourNameVN = res.portHarbourNameVN;
            vm.categoryModel.portHarbourCode = res.portHarbourCode;
            vm.categoryModel.portRegion = res.portRegion;
            vm.categoryModel.portRegionCode = res.portRegionCode;
            vm.categoryModel.portCodeHH = res.portCodeHH;
            vm.categoryModel.syncVersion = res.syncVersion;
            vm.categoryModel.sequenceNo = res.sequenceNo;
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
            vm.selectMaritime = vm.categoryModel.portRegionCode;
          });
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_PORT_REGION", maritimeCode: vm.categoryModel.portRegionCode })
          .then(res => {
            this.KhuVucHangHai = res;
            vm.portRegionCodeModel = vm.categoryModel.portRegion;
          });
      } else {
        vm.categoryModel.maritimeCode = this.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = this.maritimeCurrent.maritimeNameVN;
        this.$store
          .dispatch("category/getDanhMuc", {
            categoryId: "DM_PORT_REGION",
            isDelete: "0"
          })
          .then(res => {
            this.KhuVucHangHai = res;
          });
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
    }
  }
};
</script>

