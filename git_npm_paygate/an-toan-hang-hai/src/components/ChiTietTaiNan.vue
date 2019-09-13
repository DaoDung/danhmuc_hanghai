<template>
  <div id="chi-tiet">
      <v-flex xs12>
        <div style="width:100%; font-size: 25px; font-weight: 500; ">
          <span style="">Thông tin tai nạn</span>
        </div>
      </v-flex>
      <v-row>
        <v-col cols="6">
          <!--Tên tàu-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tên tàu:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="taiNanHangHai.nameOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Quốc tịch-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Quốc tịch:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="taiNanHangHai.flagStateOfShip"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Ngày tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Ngày tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu2"
                    v-model="menu2"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="ngayTaiNanFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(ngayTaiNanFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="ngayTaiNan" no-title @input="menu2 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Loại tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Loại tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.accidentType"
                    persistent-hint
                    :items="loaiTaiNan"
                    item-text="text"
                    item-value="value"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Mức độ-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Mức độ:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-autocomplete
                    v-model="taiNanHangHai.accidentCriticalType"
                    persistent-hint
                    :items="mucDo"
                    item-text="text"
                    item-value="value"
                  >
                    <template v-slot:append-outer></template>
                </v-autocomplete>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Ngày điều tra-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Ngày điều tra:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu1"
                    v-model="menu1"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="ngayDieuTraFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(ngayDieuTraFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="ngayDieuTra" no-title @input="menu1 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Số người chết & mất tích-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số người chết & mất tích:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  v-model="taiNanHangHai.numberOfDead"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Đơn vị điều tra tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Đơn vị điều tra tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.investigationOffice"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
        <v-col cols="6">
          <!--Số người bị thương-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Số người bị thương:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.numberOfInjured"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Tổn thất hàng hóa-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tổn thất hàng hóa:</label>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.remarksOfCargo"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Chi phí sửa chữa-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Chi phí sửa chữa:</label>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                  
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Tổn thất môi trường-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Tổn thất môi trường:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                   v-model="taiNanHangHai.remarksOfEnvironment"
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Hạn nộp báo cáo-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Hạn nộp báo cáo:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-menu
                    ref="menu3"
                    v-model="menu3"
                    :close-on-content-click="false"
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                >
                    <template v-slot:activator="{ on }">
                    <v-text-field
                        v-model="hanNopBaoCaoFomated"
                        
                        persistent-hint
                        @blur="date = parseDate(hanNopBaoCaoFomated)"
                        height="20"
                        v-on="on"
                    ></v-text-field>
                    </template>
                    <v-date-picker v-model="hanNopBaoCao" no-title @input="menu3 = false" locale="vn"></v-date-picker>
                </v-menu>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--Đơn vị báo cáo-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4 class="text-sm-left">
                <label for>Đơn vị báo cáo:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs8>
                <v-text-field
                
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-flex>
          <!--IMO-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4></v-flex>
              <v-flex xs8><input type="checkbox" > Có IMO<br></v-flex>
              <br>
            </v-layout>
          </v-flex>
          <!--Có hoa tiêu dẫn tàu-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4></v-flex>
              <v-flex xs8><input type="checkbox" v-model="taiNanHangHai.pilotOnBoad"> Có hoa tiêu dẫn tàu<br></v-flex>
              <br>
              <br>
            </v-layout>
          </v-flex>
          <!--Có điều tra tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs4></v-flex>
              <v-flex xs8><input type="checkbox"> Có điều tra tai nạn<br></v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Tổn thất phương tiện & CT GTVT-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Tổn thất phương tiện &amp; CT GTVT:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                  name="input-4-1"
                  v-model="taiNanHangHai.remarksOfShip"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Vị trí tai nạn-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Vị trí tai nạn:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                   v-model="taiNanHangHai.accidentRegion"
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <!--Ghi chú-->
          <v-flex xs12>
            <v-layout align-center>
              <v-flex xs2 class="text-sm-left">
                <label for>Ghi chú:</label>
                <span class="red--text">*</span>
              </v-flex>
              <v-flex xs10>
                <v-textarea
                  rows="2"
                  
                ></v-textarea>
              </v-flex>
            </v-layout>
          </v-flex>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="12">
          <v-flex xs12 class="text-lg-right">
              <v-btn class="ma-2" color="primary">
                {{btnText}}
              </v-btn >
              <v-btn class="ma-2" @click="quayLai" color="primary">
                Quay lại
              </v-btn>
          </v-flex>
        </v-col>
      </v-row>
  </div>
</template>

<script>
export default {
  data: (vm) => ({
     btnText: '', 
     loaiTaiNan: [
       {
         text: 'Tai nạn gây Đâm va/ mắc cạn',
         value: '1',
       },
       {
         text: 'Tai nạn gây Cháy/ nổ',
         value: '2',
       },
       {
         text: 'Tai nạn gây Nghiêng/ lật',
         value: '3',
       },
       {
         text: 'Tai nạn gây Rò rỉ',
         value: '4',
       },
       {
         text: 'Tai nạn do hỏng máy',
         value: '5',
       },
       {
         text: 'Tai gây Thương tật/ nhiễm độc/ chết người',
         value: '6',
       },
       {
         text: 'Tai nạn ô nhiễm xả thải',
         value: '7',
       }
     ],
     menu1: false,
     menu2: false,
     menu3: false,
     ngayDieuTraFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
     ngayTaiNanFomated:  vm.formatDate(new Date().toISOString().substr(0, 10)),
     hanNopBaoCaoFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
     mucDo: [
       {
         text: 'Tai nạn hàng hải đặc biệt nghiêm trọng',
         value: '1'
       },
       {
         text: 'Tai nạn hàng hải nghiêm trọng',
         value: '2'
       },
       {
         text: 'Tai nạn hàng hải ít nghiêm trọng',
         value: '3'
       }
     ],
     ngayDieuTra: '',
     ngayTaiNan: '',
     hanNopBaoCao: ''
  }),
  created() {
    console.log(this.$route.query.action)
    if (this.$route.query.action === "sua-tai-nan") {
      this.btnText = "Cập nhập";
    } 
    if (this.$route.query.action === "them-tai-nan") {
      this.btnText = "Thêm mới";
    }
    if (this.$route.query.action === "xoa-tai-nan") {
      this.btnText = "Xóa";
    }
    this.ngayDieuTraFomated=this.formatDate(this.ngayDieuTra)
    this.ngayTaiNanFomated= this.formatDate(this.ngayTaiNan)
    this.hanNopBaoCaoFomated=this.formatDate(this.ngayDieuTra)
    this.ngayDieuTra = this.taiNanHangHai.investigationDate
    this.ngayTaiNan = this.taiNanHangHai.accidentTime
    this.hanNopBaoCao = this.taiNanHangHai.accidentOfficialDate
  },
  computed: {
    taiNanHangHai () {
      return this.$store.getters["TaiNanHangHai/taiNanHangHai"]
    }
  },
  watch: {
    ngayDieuTra (val) {
      console.log('Ngay dieu tra change:',val)
      this.ngayDieuTraFomated = this.formatDate(val)
    },
    ngayTaiNan (val) {
      console.log('Ngay tai nan change:',val)
      this.ngayTaiNanFomated = this.formatDate(val)
    },
    hanNopBaoCao (val) {
      console.log('hanNopBaoCao change:',val)
      this.hanNopBaoCaoFomated = this.formatDate(val)
    }
  },
  methods: {
    quayLai(){
      this.$router.push({name: "danh_sach_tai_nan"})
    },
    formatDate (date) {
      if (!date) return null

      const [year, month, day] = date.split('-')
      return `${day}/${month}/${year}`
    },
    parseDate (date) {
      if (!date) return null

      const [month, day, year] = date.split('/')
      return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
    }, 
  }
};
</script>
<style>
#chi-tiet{
  width: 70%;
  margin: 0 auto;
}
.v-input{
  font-size: 13px;
}
.v-text-field {
  padding-top: 0px;
  margin-top: 0px;
}
.v-input__slot{
  margin-bottom: 0px;
}
.v-text-field input {
    -webkit-box-flex: 1;
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    line-height: 20px;
    padding: 0px 0 0px;
    max-width: 100%;
    min-width: 0px;
    width: 100%;
}
#chi-tiet label {
  font-size: 14px;
    color: #3563c1;
    font-weight: 700;
}
</style>