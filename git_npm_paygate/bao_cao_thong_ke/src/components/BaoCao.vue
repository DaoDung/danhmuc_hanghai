<template>
  <div id="BaoCao">
    <div id="filter-baocao">
      <div style="width: 100%; position: relative;">
        <div class="row-header" style="height: 38px; display:flex; justify-content: space-between; align-items: center; padding: 0 14px;">
          <v-btn class="btn-filter">Bỏ lọc</v-btn>
          <v-btn class="btn-filter">Xuất PDF</v-btn>
          <v-btn class="btn-filter">Xuất Excel</v-btn>
        </div>
        <div class="filter-list">
          <v-layout row wrap>
            <!--Nhóm báo cáo-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Nhóm báo cáo:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Mẫu báo cáo-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Mẫu báo cáo:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Ngày lập báo cáo-->
            <div class="item-filter">
                <div style=" width: 100%; align-items: center;">
                    <v-btn class="btn-time" @click="()=> {
                        isNgay=true 
                        isThang=false
                        isQuy=false
                        isNam=false
                    }">Ngày</v-btn>
                    <v-btn class="btn-time" @click="()=> {
                        isNgay=false 
                        isThang=true
                        isQuy=false
                        isNam=false
                    }">Tháng</v-btn>
                    <v-btn class="btn-time"  @click="()=> {
                        isNgay=false 
                        isThang=false
                        isQuy=true
                        isNam=false
                    }">Quý</v-btn>
                    <v-btn class="btn-time"  @click="()=> {
                        isNgay=false 
                        isThang=false
                        isQuy=false
                        isNam=true
                    }">Năm</v-btn>
                </div>
            
                <div style=" width: 100%; margin-top: 10px;">
                    <!--Ngày-->
                    <div v-if="isNgay">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Từ ngày:</label>
                            </div>
                            <div class="input-filter">
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
                                        v-model="dateFormatted"
                                        hint="MM/DD/YYYY format"
                                        persistent-hint
                                        
                                        @blur="date = parseDate(dateFormatted)"
                                        height="15"
                                        v-on="on"
                                    ></v-text-field>
                                    </template>
                                    <v-date-picker v-model="date" no-title @input="menu1 = false"></v-date-picker>
                                </v-menu>
                            </div>
                        </div>
                        <br>
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Đến ngày:</label>
                            </div>
                            <div class="input-filter">
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
                                        v-model="dateFormatted"
                                        hint="MM/DD/YYYY format"
                                        persistent-hint
                                        
                                        @blur="date = parseDate(dateFormatted)"
                                        height="15"
                                        v-on="on"
                                    ></v-text-field>
                                    </template>
                                    <v-date-picker v-model="date" no-title @input="menu2 = false"></v-date-picker>
                                </v-menu>
                            </div>
                        </div>
                    </div>
                    <!--Tháng-->
                    <div v-if="isThang">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Tháng:</label>
                            </div>
                            <div class="input-filter">

                            </div>
                        </div>
                    </div>
                    <!--Quý-->
                    <div v-if="isQuy">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Quý:</label>
                            </div>
                            <div class="input-filter">

                            </div>
                        </div>
                    </div>
                    <!--Năm-->
                    <div v-if="isNam">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Năm:</label>
                            </div>
                            <div class="input-filter">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--Cảng vụ-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Cảng vụ:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Cảng biển-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Cảng biển:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Khu vực HH-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Khu vực hàng hải:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Bến cảng-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Bến cảng:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Phòng ban-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Phòng ban:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Loại tàu-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Loại tàu:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Quốc tịch-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Quốc tịch:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Loại HH-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Loại HH:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--HT chuyến tải-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >HT chuyến tải:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--HT xếp dỡ-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >HT xếp dỡ:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Nhóm HH-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Nhóm HH:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Đại lý-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Đại lý:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Chủ tàu-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Chủ tàu:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        :items="components"
                        height="15"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--GT-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >GT:</label>
                </div>
                <div class="input-filter">
                  <v-text-field
                    height="15"
                  ></v-text-field>
                </div>
              </div>
            </div>
            <!--DWT-->
            <div class="item-filter">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >DWT:</label>
                </div>
                <div class="input-filter">
                  <v-text-field
                    height="15"
                  ></v-text-field>
                </div>
              </div>
            </div>
          </v-layout>
        </div>
      </div>
    </div>
    <div id="ketqua-baocao">
      <div class="row-header" style="height: 38px; overflow: hidden;">
        <div class="background-triangle-big view_tp_pdf">hhhhh sadasd</div>
        <div class="layout row wrap header_tools w-100-xs"> Hải Phòng : Từ <span class="text-bold primary--text">&nbsp;21/08/2019&nbsp;</span> đến <span class="text-bold primary--text">&nbsp;21/08/2019</span></div>
      </div>
      <div id="viewPdf" style="width:100%;">
          <iframe :src="your_url_to_pdf" width="100%" height="700px">
          </iframe>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BaoCao',
  components: {
    
  },
  data: vm => ({
        isNgay: true,
        isThang: false,
        isQuy: false,
        isNam: false,
        menu1: false,
        date: new Date().toISOString().substr(0, 10),
        dateFormatted: vm.formatDate(new Date().toISOString().substr(0, 10)),
        menu2: false,
        components: [
          'Autocompletes', 'Comboboxes', 'Forms', 'Inputs', 'Overflow Buttons', 'Selects', 'Selection Controls', 'Sliders', 'Textareas', 'Text Fields',
        ],
  }),
  watch: {
    dateSearchTopNeoTau (val) {
      this.searchTopNeoTau = this.parseDate(val)
    },
    date (val) {
      this.dateFormatted = this.formatDate(this.date)
    },
  },
  computed: {
    your_url_to_pdf () {
      return 'https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf'
    }
  },
  methods: {
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
}
</script>

<style>
#BaoCao {
  display: flex;
  width: 100%;
  font-family: 'Roboto', sans-serif;
}
#filter-baocao{
  width: 25%;
}
#ketqua-baocao{
  width: 75%;
}
.btn-filter{
  width: 30%!important;
  height: 24px!important;
  font-size: 9px!important;
}
.filter-list{
  width: 100%;
  padding-left: 18px;
  padding-right: 18px;
  padding-top: 18px;
  padding-bottom: 0px;
}
.input-groups{
  width: 100%;
  display: flex;
  align-items: center;
}
.lable-filter{
  width: 30%;
  font-size: 13px;
  font-weight: 600;
  color: #1976D2;
}
.input-filter{
  width: 70%;
}
.item-filter{
  display: inline-block;
  margin: 5px 0px;
  width: 100%;
}
.v-text-field__details {
  display: none!important;
}
.v-text-field {
    padding-top: 0px!important;
    margin-top: 0px!important;
}
.row-header{
  height: 38px;
  overflow: hidden;
  background-color: #e1e2e1;
  display: flex;
  align-items: center;
  width: 100%;
}
.background-triangle-big{
    padding: 10px 5px 10px 15px;
    width: auto;
    margin-right: 30px;
    background-color: #0b72ba;
    display: inline-block;
    text-align: right;
    color: #fff;
    position: relative;
}
.background-triangle-big:before, .background-triangle-small:before {
    content: "";
    position: absolute;
    top: 1px;
    transform: rotate(45deg);
    right: -4px;
    border-top: 28px solid #0b72ba;
    border-left: 28px solid transparent;
    border-bottom: 28px solid transparent;
}
.header_tools{
  padding: 30px;
  font-size: 13px;
}
.primary--text{
  color: #2372ba !important;
}
.text-bold{
  font-weight: bold;
}
.btn-time{
    width: 20%;
    height: 24px!important;
    font-size: 9px!important;
}


.v-autocomplete__content{
    max-height: 304px;
    min-width: 257px;
    top: 0px!important;
    left: 0px!important;
    transform-origin: left top;
    z-index: 8;
}

.v-list-item {
  font-size: 13px !important;
  height: 35px !important;
  padding: 0 10px !important;
  border-bottom: 1px dashed #d4caca !important;
}
.v-input{
  font-size: 13px;
}
</style>
