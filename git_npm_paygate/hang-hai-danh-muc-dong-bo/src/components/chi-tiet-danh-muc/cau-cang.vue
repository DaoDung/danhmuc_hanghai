<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Cầu cảng</strong>
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
                  <label for>Cảng biển hàng hải:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <!-- <v-autocomplete
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
                  </v-autocomplete> -->
                  <v-text-field
                    v-model="categoryModel.portCodeHH"
                    readonly
                    required
                    :rules="portCodeHHRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Khu vực hàng hải:</label>
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
                  <label for>Bến cảng:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="categoryModel.portHarbourCode"
                    persistent-hint
                    :items="BenCang"
                    item-text="portHarbourNameVN"
                    item-value="portHarbourCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="portHarbourCodeRules"
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
                  <label for>Cầu cảng:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.portWharfName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="portWharfNameRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Lượng chiếm nước toàn tải:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.dwt"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    
                    :rules="dwtRules"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Chiều dài lớn nhất Lmax(m):</label>
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
                  <label for>Mớn nước thiết kế(m):</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.maxDraft"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    required
                    :rules="maxDraftRules"
                    
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
      maritimeRules: [v => !!v || "Chưa chọn Cảng vụ hàng hải"],
      portCodeHHRules: [v => !!v || "Chưa chọn Cảng biển hàng hải"],
      portWharfNameRules: [v => !!v || "Chưa nhập tên Cầu cảng"],
      portRegionCodeRules: [v => !!v || "Chưa chọn Khu vực hàng hải"],
      portHarbourCodeRules: [v => !!v || "Chưa chọn Bến Cảng"],
      dwtRules: [v => !!v || "Chưa nhập lượng chiếm nước toàn tải"],
      loaRules: [v => !!v || "Chưa nhập chiều dài lớn nhất Lmax(m)"],
      maxDraftRules: [v => !!v || "Chưa nhập mớn nước thiết kế(m)"],
      maritime: [],
      selectMaritime: "",
      portRegionCodeModel: "",
      btnText: "",
      money: {
        decimal: ',',
        thousands: '.',
        precision: 2,
        masked: false
      },
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        maritimeCode: '',
        maritimeNameVN: "",
        maritimeName: "",
        note: "",
        portWharfName: "",
        portCodeHH: "",
        portRegionNameVN: "",
        portRegionCode: "",
        portCodeBC: "",
        portHarbourCode: "",
        cityCode: "",
        dwt: '',
        loa: '',
        maxDraft: ''
      },
      BenCang: [],
      KhuVucHangHai: []
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
      this.btnText = "Cập nhập câù cảng";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới cầu cảng";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa cầu cảng";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  watch: {
    portRegionCodeModel(val) {
      let vm = this;
      if(this.$route.query.aticon !== 'them-danh-muc') {
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_PORT_HARBOUR", portRegion: val, maritimeCode: vm.categoryModel.maritimeCode})
          .then(res => {
            this.BenCang = res;
          });
      } else {
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_PORT_HARBOUR", isDelete: '0', portRegion: val, maritimeCode: vm.categoryModel.maritimeCode})
          .then(res => {
            this.BenCang = res;
          });      
      }
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
      this.categoryModel.portRegionCode = val;
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
        portRegionCode: this.categoryModel.portRegionCode,
        portHarbourCode: this.categoryModel.portHarbourCode,
        portWharfNameVN: this.categoryModel.portWharfName,
        note: this.categoryModel.note,
        portWharfCode: this.id,
        syncVersion: this.categoryModel.syncVersion,
        dwt: this.categoryModel.dwt,
        loa: this.categoryModel.loa,
        maxDraft: this.categoryModel.maxDraft
      };

      await this.$store
        .dispatch("category/editCategoryListItems", params)
        .then();
      this.back();
    },
    async delCategory() {
      let params = {
        categoryId: this.categoryId,
        portWharfCode: this.id,
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
        note: this.categoryModel.note,
        portRegionCode: this.categoryModel.portRegionCode,
        portHarbourCode: this.categoryModel.portHarbourCode,
        portWharfNameVN: this.categoryModel.portWharfName,
        dwt: this.categoryModel.dwt,
        loa: this.categoryModel.loa,
        maxDraft: this.categoryModel.maxDraft
      };

      await this.$store
        .dispatch("category/addCategoryListItems", params)
        .then();
      this.back();
    },
    async getDetailCategory() {
      let vm = this;
      this.$store.dispatch("category/getMaritime").then(res => {
        vm.maritime = res.data;
      });
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          portWharfCode: this.id
        };
        await this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.cityCode = res.cityCode;
            vm.categoryModel.maritimeName = res.maritimeName;
            vm.categoryModel.maritimeCode = res.maritimeCode;
            vm.categoryModel.note = res.note;
            vm.categoryModel.portWharfName = res.portWharfName;
            vm.categoryModel.portCodeHH = res.portCodeHH;
            vm.categoryModel.portRegionNameVN = res.portRegionNameVN;
            vm.categoryModel.portRegionCode = res.portRegionCode;
            vm.categoryModel.portCodeBC = res.portCodeBC;
            vm.categoryModel.portHarbourCode = res.portHarbourCode;
            vm.categoryModel.syncVersion = res.syncVersion;
            vm.categoryModel.dwt = res.dwt;
            vm.categoryModel.loa = res.loa;
            vm.categoryModel.maxDraft = res.maxDraft;
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
          .dispatch("category/getDanhMuc", { categoryId: "DM_PORT_REGION", maritimeCode: vm.categoryModel.maritimeCode})
          .then(res => {
            this.KhuVucHangHai = res;
            vm.portRegionCodeModel = vm.categoryModel.portRegionCode;
          });

      } else {
        vm.categoryModel.maritimeCode = vm.maritimeCurrent.maritimeCode;
        vm.categoryModel.maritimeNameVN = vm.maritimeCurrent.maritimeNameVN;
        this.$store
          .dispatch("category/getDanhMuc", { categoryId: "DM_PORT_REGION", isDelete: '0'})
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

