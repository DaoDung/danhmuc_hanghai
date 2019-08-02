<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Hoa tiêu</strong>
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
                <v-flex xs12 md4>
                  <v-text-field v-model="categoryModel.modifiedDate" prepend-icon="event" readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <!-- <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã công ty hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.pilotCompanyCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Công ty hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="categoryModel.pilotCompanyCode"
                    persistent-hint
                    :items="pilotCompany"
                    item-text="pilotCompanyName"
                    item-value="pilotCompanyCode"
                    required
                    :rules="pilotCompanyCodeRules"
                    height="25"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-text-field
                    v-model="categoryModel.pilotCompanyName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>-->
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Hạng hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="categoryModel.pilotCategoryCode"
                    persistent-hint
                    :items="pilotCategory"
                    item-text="pilotCategoryName"
                    item-value="pilotCategoryCode"
                    height="25"
                    required
                    :rules="pilotCategoryCodeRules"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-text-field 
                    v-model="categoryModel.pilotCategoryCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  >
                  </v-text-field>-->
                </v-flex>
              </v-layout>
            </v-flex>
            <!-- <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã hoa tiêu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.pilotCode"
                    readonly
                    :disabled="this.$route.query.aticon === 'them-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên hoa tiêu</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.pilotName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="pilotNameRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Ngày sinh:</label>
                </v-flex>
                <v-flex xs12 md4>
                  <v-dialog
                    ref="dialog2"
                    v-model="modal2"
                    :return-value.sync="categoryModel.pilotBOD"
                    persistent
                    lazy
                    full-width
                    width="290px"
                  >
                    <template v-slot:activator="{ on }">
                      <v-text-field
                        v-model="categoryModel.pilotBOD"
                        prepend-icon="event"
                        readonly
                        v-on="on"
                        height="25"
                      ></v-text-field>
                    </template>
                    <v-date-picker v-model="categoryModel.pilotBOD" scrollable>
                      <v-spacer></v-spacer>
                      <v-btn flat color="primary" @click="modal2 = false">Cancel</v-btn>
                      <v-btn
                        flat
                        color="primary"
                        @click="$refs.dialog2.save(categoryModel.pilotBOD)"
                      >OK</v-btn>
                    </v-date-picker>
                  </v-dialog>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Ngày cấp bằng:</label>
                </v-flex>
                <v-flex xs12 md4>
                  <v-dialog
                    ref="dialog3"
                    v-model="modal3"
                    :return-value.sync="categoryModel.pilotCertificateDate"
                    persistent
                    lazy
                    full-width
                    width="290px"
                  >
                    <template v-slot:activator="{ on }">
                      <v-text-field
                        v-model="categoryModel.pilotCertificateDate"
                        prepend-icon="event"
                        readonly
                        v-on="on"
                        height="25"
                      ></v-text-field>
                    </template>
                    <v-date-picker v-model="categoryModel.pilotCertificateDate" scrollable>
                      <v-spacer></v-spacer>
                      <v-btn flat color="primary" @click="modal3 = false">Cancel</v-btn>
                      <v-btn
                        flat
                        color="primary"
                        @click="$refs.dialog3.save(categoryModel.pilotCertificateDate)"
                      >OK</v-btn>
                    </v-date-picker>
                  </v-dialog>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số hiệu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.pilotNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="pilotNoRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Số bằng:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.pilotCertificateNo"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="pilotCertificateNoRules"
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
      pilotCategoryCodeRules: [v => !!v || "Chưa chọn Hạng hoa tiêu"],
      pilotCertificateNoRules: [v => !!v || "Chưa số hiệu bằng "],
      pilotNoRules: [v => !!v || "Chưa nhập số hiệu công ty "],
      pilotNameRules: [v => !!v || "Chưa nhập tên hoa tiêu"],
      pilotCompanyCodeRules: [v => !!v || "Chưa chọn Công ty hoa tiêu"],
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      modal: false,
      modal2: false,
      modal3: false,
      maritime: [],
      pilotCompany: [],
      pilotCategory: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        pilotCompanyCode: "",
        pilotCompanyName: "",
        pilotCode: "",
        pilotName: "",
        pilotNo: "",
        pilotBOD: "",
        pilotCertificateNo: "",
        pilotCertificateDate: "",
        pilotCategoryCode: "",
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
      this.btnText = "Cập nhập hoa tiêu";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới hoa tiêu";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa hoa tiêu";
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
        pilotCompanyCode: this.categoryModel.pilotCompanyCode,
        pilotCompanyName: this.categoryModel.pilotCompanyName,
        pilotCode: this.id,
        pilotName: this.categoryModel.pilotName,
        pilotNo: this.categoryModel.pilotNo,
        pilotBOD: this.categoryModel.pilotBOD,
        pilotCertificateNo: this.categoryModel.pilotCertificateNo,
        remarks: this.categoryModel.remarks,
        pilotCategoryCode: this.categoryModel.pilotCategoryCode,
        pilotCertificateDate: this.categoryModel.pilotCertificateDate,
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
        // pilotCompanyCode: this.categoryModel.pilotCompanyCode,
        // pilotCompanyName: this.categoryModel.pilotCompanyName,
        pilotCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // pilotName: this.categoryModel.pilotName,
        // pilotNo: this.categoryModel.pilotNo,
        // pilotBOD: this.categoryModel.pilotBOD,
        // pilotCertificateNo: this.categoryModel.pilotCertificateNo,
        // remarks: this.categoryModel.remarks,
        // pilotCategoryCode: this.categoryModel.pilotCategoryCode,
        // pilotCertificateDate: this.categoryModel.pilotCertificateDate,
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
        pilotCompanyCode: this.categoryModel.pilotCompanyCode,
        pilotCompanyName: this.categoryModel.pilotCompanyName,
        // pilotCode: this.categoryModel.pilotCode,
        pilotName: this.categoryModel.pilotName,
        pilotNo: this.categoryModel.pilotNo,
        pilotBOD: this.categoryModel.pilotBOD,
        pilotCertificateNo: this.categoryModel.pilotCertificateNo,
        remarks: this.categoryModel.remarks,
        pilotCategoryCode: this.categoryModel.pilotCategoryCode,
        pilotCertificateDate: this.categoryModel.pilotCertificateDate,
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
          pilotCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.pilotCompanyCode = res.pilotCompanyCode;
            vm.categoryModel.pilotCompanyName = res.pilotCompanyName;
            vm.categoryModel.pilotCode = res.pilotCode;
            vm.categoryModel.pilotName = res.pilotName;
            vm.categoryModel.pilotBOD = res.pilotBOD;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.pilotNo = res.pilotNo;
            vm.categoryModel.pilotCertificateNo = res.pilotCertificateNo;
            vm.categoryModel.pilotCertificateDate = res.pilotCertificateDate;
            vm.categoryModel.pilotCategoryCode = res.pilotCategoryCode;
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
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_COMPANY", maritimeCode: vm.categoryModel.maritimeCode})
          .then(res => {
            this.pilotCompany = res;
          });
        this.$store
          .dispatch("category/getDanhMuc", {
            categoryId: "DM_VMA_PILOT_CATEGORY",
            maritimeCode: vm.categoryModel.maritimeCode
          })
          .then(res => {
            this.pilotCategory = res;
          });
      } else {
        vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = vm.maritimeCurrent.maritimeNameVN;
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
          .dispatch("category/getDanhMuc", { categoryId: "DM_VMA_PILOT_COMPANY", maritimeCode: vm.categoryModel.maritimeCode, isDelete: '0'})
          .then(res => {
            this.pilotCompany = res;
          });
        this.$store
          .dispatch("category/getDanhMuc", {
            categoryId: "DM_VMA_PILOT_CATEGORY",
            maritimeCode: vm.categoryModel.maritimeCode,
            isDelete: '0'
          })
          .then(res => {
            this.pilotCategory = res;
          });
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