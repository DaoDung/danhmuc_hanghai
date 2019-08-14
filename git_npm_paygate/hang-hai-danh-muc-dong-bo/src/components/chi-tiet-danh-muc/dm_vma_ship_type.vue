<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Loại và Công dụng tàu</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-layout row wrap>
              <!-- <v-flex xs12 >
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for="">Mã công dụng tàu:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.shipTypeCode"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                  ></v-text-field>
                </v-flex>
              </v-layout>
              </v-flex>-->
              <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12 md4 class="text-sm-left">
                    <label for>Loại và công dụng tàu:</label>
                    <span class="red--text">(*)</span>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-text-field
                      v-model="categoryModel.shipTypeName"
                      :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
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
                    <label for>Loại tàu MCQG:</label>
                    <span class="red--text">(*)</span>
                  </v-flex>
                  <v-flex xs12 md8>
                    <v-autocomplete
                      v-model="categoryModel.shipTypeRef"
                      persistent-hint
                      :items="shipType"
                      item-text="shipTypeNameVN"
                      item-value="shipTypeCode"
                      required
                      :rules="shipTypeRefRules"
                      height="25"
                    >
                      <template v-slot:append-outer></template>
                    </v-autocomplete>
                    <!-- <v-text-field
                      v-model="categoryModel.shipTypeRef"
                      :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                      required
                      :rules="shipTypeRefRules"
                    ></v-text-field> -->
                  </v-flex>
                </v-layout>
              </v-flex>
                <v-flex xs12>
                <v-layout align-center>
                  <v-flex xs12>
                    <div style="display:flex; justify-content: center;align-items: center; width:100%; height:59px;">
                      <v-radio-group v-model="radios" row required :rules="radiosRules">
                        <v-radio
                          label="Của tàu biển"
                          value="applyShip"
                        ></v-radio>
                        <v-radio
                          label="Của phương tiện thủy nội địa"
                          value="applyBoat"
                        ></v-radio>
                      </v-radio-group>
                    </div>


                    <!-- <div style="display:flex; justify-content: center;align-items: center; width:100%; height:59px;">
                      <input type="radio" id="one" value="applyShip" v-model="radios" style="margin-right:10px;" required :rules="radiosRules">
                      <label for="one" style="margin-right:20px;">Của tàu biển</label>
                    
                      <input type="radio" id="two" value="applyBoat" v-model="radios" style="margin-right:10px;" required :rules="radiosRules">
                      <label for="two" style="margin-right:20px;">Của phương tiện thủy nội địa</label>
                    </div> -->
                    <!-- <v-radio-group v-model="radios" :mandatory="false" required :rules="[v=> !!v || 'Chưa chọn Của tàu biển hay phương tiện thủy nội địa']">
                      <v-radio label="Của tàu biển" value="applyShip"></v-radio>
                      <v-radio label="Của phương tiện thủy nội địa" value="applyBoat"></v-radio>
                    </v-radio-group> -->
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
            </v-layout>
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
      radios: '',
      radiosRules:  [v => !!v || "Chưa ô của Tàu biển/ Phương tiện thủy nội địa"],
      shipTypeRefRules: [v => !!v || "Chưa chọn loại tàu MCQG"],
      shipTypeNameRules: [v => !!v || "Chưa nhập tên Loại và Công dụng tàu"],
      btnText: "",
      shipType: [],
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        shipTypeCode: "",
        shipTypeName: "",
        applyShip: "",
        applyBoat: "",
        shipTypeRef: "",
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
      this.btnText = "Cập nhập Loại và Công dụng tàu";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới Loại và Công dụng tàu";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa Loại và Công dụng tàu";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  methods: {
    submit() {
      if (this.$route.query.aticon === "sua-danh-muc") {
        if(this.$refs.form.validate()){
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
        shipTypeCode: this.id,
        applyShip: this.radios === 'applyShip' ? 1 : 0,
        shipTypeName: this.categoryModel.shipTypeName,
        applyBoat: this.radios === 'applyBoat' ? 1 : 0,
        shipTypeRef: this.categoryModel.shipTypeRef,
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
        shipTypeCode: this.id,
        syncVersion: this.categoryModel.syncVersion
        // applyShip: this.categoryModel.applyShip,
        // shipTypeName: this.categoryModel.shipTypeName,
        // applyBoat: this.categoryModel.applyBoat,
        // shipTypeRef: this.categoryModel.shipTypeRef,
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
        // shipTypeCode: this.id,
        applyShip: this.radios === 'applyShip' ? 1 : 0,
        shipTypeName: this.categoryModel.shipTypeName,
        applyBoat: this.radios === 'applyBoat' ? 1 : 0,
        shipTypeRef: this.categoryModel.shipTypeRef,
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
      this.$store
        .dispatch("category/getDanhMuc", { categoryId: "DM_SHIP_TYPE" })
        .then(res => {
          vm.shipType = res;
          if ( this.$route.query.aticon === 'them-danh-muc'){
            vm.shipType = vm.shipType.filter(e => e.isDelete === 0)
          }
        });
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          shipTypeCode: this.id
        };
        this.$store
          .dispatch("category/getDetailCategory", params)
          .then(res => {
            vm.categoryModel.shipTypeCode = res.shipTypeCode;
            vm.categoryModel.applyShip = res.applyShip;
            vm.categoryModel.shipTypeName = res.shipTypeName;
            vm.categoryModel.applyBoat = res.applyBoat;
            vm.categoryModel.shipTypeRef = res.shipTypeRef;
            vm.categoryModel.remarks = res.remarks;
            vm.categoryModel.syncVersion = res.syncVersion;
            if(res.applyBoat){
              vm.radios = 'applyBoat'
            }
            if(res.applyShip){
              vm.radios = 'applyShip'
            }
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
