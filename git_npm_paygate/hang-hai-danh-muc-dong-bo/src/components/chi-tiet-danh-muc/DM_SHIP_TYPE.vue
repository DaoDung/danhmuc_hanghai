<template>
  <div class="chi-tiet">
    <v-container text-xs-center>
      <v-layout row wrap>
        <v-flex xs12>
          <div class="title-chitiet">
            <strong class="title-chitiet-danh-muc">Thông tin Loại tàu thuyền (Một cửa quốc gia)</strong>
          </div>
        </v-flex>
        <v-flex xs12>
          <form class="form-chi-tiet-danh-muc">
            <v-flex xs12>
              <v-layout align-center>
                <v-flex xs12 md4 class="text-sm-left">
                  <label for>Mã loại tàu thuyền:</label>
                  <span class="red--text">(*)</span>
                </v-flex>
                <v-flex xs12 md3>
                  <v-text-field
                    v-model="categoryModel.shipTypeCode"
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
                  <label for>Loại tàu thuyền:</label>
                  <span class="red--text">(*)</span>
                  <br />
                  <span>( Một cửa quốc gia )</span>
                </v-flex>
                <v-flex xs12 md8>
                  <v-text-field
                    v-model="categoryModel.shipTypeNameVN"
                    :readonly="this.$route.query.aticon === 'chi-tiet-danh-muc'"
                    height="25"
                  ></v-text-field>
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
        shipTypeNameVN: "",
        shipTypeCode: ""
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
  methods: {
    back() {
      this.$router.push({
        path: "/danh-sach-danh-muc",
        query: { categoryId: this.$route.query.categoryId }
      });
    },
    getDetailCategory() {
      let vm = this;
      if (this.$route.query.aticon !== "them-danh-muc") {
        let params = {
          categoryId: this.categoryId,
          shipTypeCode: this.id
        };
        this.$store.dispatch("category/getDetailCategory", params).then(
          res => {
            vm.categoryModel.shipTypeCode = res.shipTypeCode;
            vm.categoryModel.shipTypeNameVN = res.shipTypeNameVN;

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
        vm.categoryModel.shipTypeCode = "";
        vm.categoryModel.shipTypeNameVN = "";
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
