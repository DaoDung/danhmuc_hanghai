<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Tàu lai</strong>
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
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Công ty tàu lai</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="categoryModel.tugboatCompanyCode"
                    persistent-hint
                    :items="tugBoatCompany"
                    item-text="tugboatCompanyName"
                    item-value="tugboatCompanyCode"
                    required
                    :rules="tugboatCompanyCodeRules"
                    height="25"
                  >
                    <template v-slot:append-outer></template>
                  </v-autocomplete>
                  <!-- <v-text-field
                    v-model="categoryModel.tugboatCompanyName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>-->
                </v-flex>
              </v-layout>
            </v-flex>
            <!-- <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã tàu lai:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.shipCode"
                    readonly
                    :disabled=" this.$route.query.aticon === 'them-danh-muc' "
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>-->
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên tàu lai</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.shipName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="shipNameRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Công suất máy (kW):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.power"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="powerRules"
                    
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Chiều dài lớn nhất:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.loa"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="loaRules"
                    
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Chiều rộng lớn nhất Bmax(m):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.breadth"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="breadthRules"
                    
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Lượng chiếm nước (không tải):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.displacement"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="displacementRules"
                    
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Giá dịch vụ (đồng/giờ):</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.vndUnitPrice"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Giá dịch vụ (USD/giờ):</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.usdUnitPrice"
                    
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
import {VMoney} from 'v-money'
export default {
  directives: {money: VMoney},
  data() {
    return {
      money: {
        decimal: ',',
        thousands: '.',
        precision: 2,
        masked: false
      },
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      shipNameRules: [v => !!v || "Chưa nhập tên tàu lai"],
      breadthRules: [v => !!v || "Chưa nhập chiều rộng lớn nhất "],
      displacementRules: [v => !!v || "Chưa nhập lượng chiếm nước"],
      loaRules: [v => !!v || "Chưa nhập chiều dài lớn nhất"],
      powerRules: [v => !!v || "Chưa nhập công suất tàu lai"],
      tugboatCompanyCodeRules: [v => !!v || "Chưa chọn công ty tàu lai"],
      maritime: [],
      tugBoatCompany: [],
      selectMaritime: "",
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: "",
        maritimeNameVN: "",
        tugboatCompanyCode: "",
        tugboatCompanyName: "",
        shipCode: "",
        shipName: "",
        power: "",
        loa: "",
        breadth: "",
        clearanceHeight: "",
        displacement: "",
        remarks: "",
        vndUnitPrice: "",
        usdUnitPrice: ""
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
      this.btnText = "Cập nhập tàu lai";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới tàu lai";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa tàu lai";
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
        tugboatCompanyCode: this.categoryModel.tugboatCompanyCode,
        // tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        _shipCode: this.id,
        _shipName: this.categoryModel.shipName,
        power: this.categoryModel.power,
        loa: this.categoryModel.loa,
        remarks: this.categoryModel.remarks,
        displacement: this.categoryModel.displacement,
        clearanceHeight: this.categoryModel.clearanceHeight,
        breadth: this.categoryModel.breadth,
        maritimeCode: this.categoryModel.maritimeCode,
        syncVersion: this.categoryModel.syncVersion,
        vndUnitPrice: this.categoryModel.vndUnitPrice,
        usdUnitPrice: this.categoryModel.usdUnitPrice
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
        // tugboatCompanyCode: this.categoryModel.tugboatCompanyCode,
        // tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        _shipCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // shipName: this.categoryModel.shipName,
        // power: this.categoryModel.power,
        // loa: this.categoryModel.loa,
        // remarks: this.categoryModel.remarks,
        // displacement: this.categoryModel.displacement,
        // clearanceHeight: this.categoryModel.clearanceHeight,
        // breadth: this.categoryModel.breadth,
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
        tugboatCompanyCode: this.categoryModel.tugboatCompanyCode,
        // tugboatCompanyName: this.categoryModel.tugboatCompanyName,
        // shipCode: this.id,
        _shipName: this.categoryModel.shipName,
        power: this.categoryModel.power,
        loa: this.categoryModel.loa,
        remarks: this.categoryModel.remarks,
        displacement: this.categoryModel.displacement,
        clearanceHeight: this.categoryModel.clearanceHeight,
        breadth: this.categoryModel.breadth,
        maritimeCode: this.categoryModel.maritimeCode,
        vndUnitPrice: this.categoryModel.vndUnitPrice,
        usdUnitPrice: this.categoryModel.usdUnitPrice
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
          _shipCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.tugboatCompanyCode = res.tugboatCompanyCode;
            vm.categoryModel.tugboatCompanyName = res.tugboatCompanyName;
            vm.categoryModel.shipCode = res.shipCode;
            vm.categoryModel.shipName = res.shipName;
            vm.categoryModel.clearanceHeight = res.clearanceHeight;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.power = res.power;
            vm.categoryModel.loa = res.loa;
            vm.categoryModel.breadth = res.breadth;
            vm.categoryModel.displacement = res.displacement;
            vm.categoryModel.syncVersion = res.syncVersion;
            vm.categoryModel.vndUnitPrice = res.vndUnitPrice;
            vm.categoryModel.usdUnitPrice = res.usdUnitPrice;

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
        .dispatch("category/getDanhMuc", {
          categoryId: "DM_VMA_TUGBOAT_COMPANY",
          maritimeCode: vm.categoryModel.maritimeCode,
        })
        .then(res => {
          vm.tugBoatCompany = res;
        });
      } else {
        vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = vm.maritimeCurrent.maritimeNameVN;
        this.$store
          .dispatch("category/getDanhMuc", {
            categoryId: "DM_VMA_TUGBOAT_COMPANY",
            isDelete: '0'
          })
          .then(res => {
            vm.tugBoatCompany = res;
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
