<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Cảng biển</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <v-form ref="form" lazy-validation class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Mã cảng biển:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.portCode"
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
                  <v-text-field v-model="categoryModel.modifiedDate"  readonly
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Tên cảng biển:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.portName"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Phân loại:</label>  
                </v-flex>
                <v-flex xs12 md8>
                  <v-autocomplete
                    v-model="categoryModel.portType"
                    :items="listPhanLoai"
                    item-text="name"
                    item-value="value"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-autocomplete>
                </v-flex>
              </v-layout>
            </v-flex>
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Thứ tự:</label>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.portOrder"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
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
      date: new Date().toISOString().substr(0, 10),
      menu: false,
      modal: false,
      menu2: false,
      btnText: "",
      categoryModel: {
        syncVersion: "",
        modifiedDate: "",
        id: 0,
        portName: "",
        portCode: "",
        portType: '0',
        portOrder: ''
      },
      listPhanLoai: [
        { value: '0', name: 'Cảng biển'}, 
        { value: '1', name: 'Cảng thủy nội địa'},
        { value: '2', name: 'Cảng ngoài đảo(tuyến bờ ra đảo)'}
      ],
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
      this.btnText = "Cập nhập cảng biển";
    } else if (this.$route.query.aticon === "them-danh-muc") {
      this.btnText = "Thêm mới cảng biển";
    } else if (this.$route.query.aticon === "xoa-danh-muc") {
      this.btnText = "Đánh dấu xóa cảng biển";
    }
  },
  mounted() {
    this.getDetailCategory();
  },
  methods: {
    back() {
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    submit() {
      if (this.$route.query.aticon === "sua-danh-muc") {
        if (this.$refs.form.validate()) {
          this.editCategory();
        }
      }
    },
    async editCategory() {
      let params = {
        categoryId: this.categoryId,
        portName: this.categoryModel.portName,
        portCode: this.categoryModel.portCode,
        portOrder: this.categoryModel.portOrder,
        portType: this.categoryModel.portType,
        syncVersion: this.categoryModel.syncVersion,
      };

      await this.$store
        .dispatch("category/editCategoryListItems", params)
        .then();
      this.back();
    },
    getDetailCategory() {
      let vm = this;
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          portId: this.id,
        };
        this.$store.dispatch("category/getDetailCategory", params).then(
          res => {
            vm.categoryModel.portName = res.portName;
            vm.categoryModel.portCode = res.portCode;
            vm.categoryModel.portType = res.portType;
            vm.categoryModel.syncVersion= res.syncVersion;
            vm.categoryModel.portOrder = res.portOrder;
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
          },
          error => {}
        );
      } else {
        vm.categoryModel.portCode = "";
        vm.categoryModel.portName = "";
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
