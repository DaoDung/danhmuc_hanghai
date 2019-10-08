<template>
  <div id="BaoCao">
    <div id="filter-baocao">
      <div style="width: 100%; position: relative;">
        <div class="row-header" style="height: 38px; display:flex; justify-content: space-between; align-items: center; padding: 0 14px;">
          <v-btn class="btn-filter" color="primary" @click="boLoc">Bỏ lọc</v-btn>
          <v-btn class="btn-filter" color="primary" @click="xuatPDF">Xuất PDF</v-btn>
          <v-btn class="btn-filter" color="primary" @click="xuatExcel">Xuất Excel</v-btn>
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
                        v-model="selectNhomBC"
                        :items="nhomBC"
                        item-text="rptName"
                        item-value="rptCode"
                        height="20"
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
                        v-model="selectMauBC"
                        :items="mauBC"
                        item-text="rptName"
                        item-value="rptCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Ngày lập báo cáo-->
            <div class="item-filter">
                <div id="date-select" style=" width: 33%; align-items: center;">
                  <v-select
                    :items="items"
                    outlined
                    v-model="thongKeTheo"
                  ></v-select>
                </div>
            
                <div style=" width: 100%; margin-top: 8px;">
                    <div>
                      <div class="input-groups ngay-bao-cao">
                          <div class="lable-filter">
                              <label for="" >Ngày tạo:</label>
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
                                      v-model="createDateFomated"
                                      hint="MM/DD/YYYY format"
                                      persistent-hint
                                      @blur="date = parseDate(createDateFomated)"
                                      height="20"
                                      v-on="on"
                                  ></v-text-field>
                                  </template>
                                  <v-date-picker v-model="createDate" no-title @input="menu1 = false" locale="vn"></v-date-picker>
                              </v-menu>
                          </div>
                      </div>
                    </div>
                    <!--Ngày-->
                    <div v-if="thongKeTheo === 'Ngày'">
                        <div class="input-groups ngay-bao-cao">
                            <div class="lable-filter">
                                <label for="" >Từ ngày:</label>
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
                                        v-model="fromDateFomated"
                                        hint="MM/DD/YYYY format"
                                        persistent-hint
                                        
                                        @blur="date = parseDate(fromDateFomated)"
                                        height="20"
                                        v-on="on"
                                    ></v-text-field>
                                    </template>
                                    <v-date-picker v-model="fromDate" no-title @input="menu2 = false" locale="vn"></v-date-picker>
                                </v-menu>
                            </div>
                        </div>
                        <div class="input-groups ngay-bao-cao">
                            <div class="lable-filter">
                                <label for="" >Đến ngày:</label>
                            </div>
                            <div class="input-filter">
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
                                        v-model="toDateFomated"
                                        hint="MM/DD/YYYY format"
                                        persistent-hint
                                        
                                        @blur="date = parseDate(toDateFomated)"
                                        height="20"
                                        v-on="on"
                                    ></v-text-field>
                                    </template>
                                    <v-date-picker v-model="toDate" no-title @input="menu3 = false" locale="vn"></v-date-picker>
                                </v-menu>
                            </div>
                        </div>
                    </div>
                    <!--Tháng-->
                    <div v-if="thongKeTheo === 'Tháng'">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Tháng:</label>
                            </div>
                            <div class="input-filter">
                              <v-autocomplete
                                  v-model="selectThang"
                                  :items="thang"
                                  item-text="name"
                                  item-value="value"
                                  height="20"
                              ></v-autocomplete>
                            </div>
                        </div>
                    </div>
                    <!--Quý-->
                    <div v-if="thongKeTheo === 'Quý'">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Quý:</label>
                            </div>
                            <div class="input-filter">
                              <v-autocomplete
                                  v-model="selectQuy"
                                  :items="quy"
                                  item-text="name"
                                  item-value="value"
                                  height="20"
                              ></v-autocomplete>
                            </div>
                        </div>
                    </div>
                    <!--Năm-->
                    <div v-if="thongKeTheo === 'Năm'">
                        <div class="input-groups">
                            <div class="lable-filter">
                                <label for="" >Năm:</label>
                            </div>
                            <div class="input-filter">
                              <v-autocomplete
                                  v-model="selectNam"
                                  :items="nam"
                                  height="20"
                              ></v-autocomplete>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--Cảng vụ-->
            <div class="item-filter" v-if="optionSelect.maritimeCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Cảng vụ:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        v-model="selectCangVuHangHai"
                        :items="cangVuHangHai"
                        item-text="maritimeNameVN"
                        item-value="maritimeCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Cảng biển-->
            <div class="item-filter" v-if="optionSelect.portCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Cảng biển:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        v-model="selectCangBien"
                        :items="cangBien"
                        item-text="name"
                        item-value="node2"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Khu vực HH-->
            <div class="item-filter" v-if="optionSelect.portRegionCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Khu vực hàng hải:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectKhuVucHH"
                      :items="khuVucHH"
                      item-text="portRegionNameVN"
                      item-value="portRegionCode"
                      height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Bến cảng-->
            <div class="item-filter" v-if="optionSelect.portHarbourCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Bến cảng:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectBenCang"
                        :items="benCang"
                        item-text="portHarbourNameVN"
                        item-value="portHarbourCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Cầu cảng-->
            <div class="item-filter" v-if="optionSelect.portWharfCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Cầu Cảng:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectCauCang"
                        :items="cauCang"
                        item-text="portWharfNameVN"
                        item-value="portWharfCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Phòng ban-->
            <div class="item-filter" v-if="optionSelect.departmentCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Phòng ban:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectPhongBan"
                        :items="phongBan"
                        item-text="departmentName"
                        item-value="departmentCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Loại tàu-->
            <div class="item-filter" v-if="optionSelect.shipTypeCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Loại tàu:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectLoaiTau"
                        :items="loaiTau"
                        item-text="shipTypeNameVN"
                        item-value="shipTypeCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Quốc tịch-->
            <div class="item-filter" v-if="optionSelect.flagStateCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Quốc tịch:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectQuocTich"
                        :items="quocTich"
                        item-text="stateName"
                        item-value="stateCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
              <!--Tuyến Luồng-->
            <div class="item-filter" v-if="optionSelect.channelCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Tuyến luồng:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectTuyenLuong"
                        :items="tuyenLuong"
                        item-text="name"
                        item-value="dataItemId"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Loại HH-->
            <div class="item-filter" v-if="optionSelect.cargoCategorySelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Loại HH:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectLoaiHH"
                      :items="loaiHH"
                      item-text="name"
                      item-value="code0"
                      height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--HT Đơn vị tính-->
            <div class="item-filter" v-if="false">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >HT chuyến tải:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectHTChuyenTai"
                        :items="htChuyenTai"
                        item-text="goodsTypeNameVN"
                        item-value="goodsTypeCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--HT xếp dỡ-->
            <div class="item-filter" v-if="optionSelect.cargoUnloadingSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >HT xếp dỡ:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                        v-model="selectHTXepDo"
                        :items="htXepDo"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Nhóm HH-->
            <div class="item-filter" v-if="optionSelect.cargoGroupSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Nhóm HH:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectNhomHH"
                      :items="nhomHH"
                      height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Đại lý-->
            <div class="item-filter" v-if="optionSelect.shipAgencyCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Đại lý:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectDaiLy"
                        :items="daiLy"
                        item-text="shipAgencyNameVN"
                        item-value="shipAgencyCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--Chủ tàu-->
            <div class="item-filter" v-if="optionSelect.shipOwnerCodeSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >Chủ tàu:</label>
                </div>
                <div class="input-filter">
                    <v-autocomplete
                      v-model="selectChuTau"
                        :items="chuTau"
                        item-text="companyName"
                        item-value="shipOwnerCode"
                        height="20"
                    ></v-autocomplete>
                </div>
              </div>
            </div>
            <!--GT-->
            <div class="item-filter" v-if="optionSelect.grossTonnageSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >GT:</label>
                </div>
                <div class="input-filter">
                  <v-text-field
                    v-model="selectGT"
                    height="20"
                  ></v-text-field>
                </div>
              </div>
            </div>
            <!--DWT-->
            <div class="item-filter" v-if="optionSelect.deadWeightSelect === 1">
              <div class="input-groups">
                <div class="lable-filter">
                   <label for="" >DWT:</label>
                </div>
                <div class="input-filter">
                  <v-text-field
                    v-model="selectDWT"
                    height="20"
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
        <div class="background-triangle-big view_tp_pdf">{{tenMauBaoCao ? tenMauBaoCao : 'Mẫu báo cáo'}}</div>
        <div class="layout row wrap header_tools w-100-xs">Từ <span class="text-bold primary--text">&nbsp;{{fromDateFomated}}&nbsp;</span> đến <span class="text-bold primary--text">&nbsp;{{toDateFomated}}</span></div>
      </div>
      <div style="width: 100%; height: 700px;" v-if='!isLoading && (urlPDF === "")'>
        <span>Không tìm thấy dữ liệu báo cáo</span>
      </div>
      <div style="padding-left: 10px;padding-top:10px; height: 700px;" v-if="isLoading">
        <i class="fas fa-spinner fa-spin"></i><span>&nbsp;&nbsp;Loading...</span>
      </div>
      <div id="viewPdf" style="width:100%; height: 700px;" v-if='!isLoading && (urlPDF !== "")'> 
        <object :data="urlPDF" type="application/pdf" style="width:100%; height: 700px;">
          <embed :src="urlPDF" type="application/pdf" />
        </object>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios"

import { RepositoryFactory } from '@/api/RepositoryFactory'
const BaoCaoApi =  RepositoryFactory.get('baocao')
export default {
  name: 'BaoCao',
  computed: {
    maritimeCurrent () {
      return this.$store.getters["baocao/maritimeCurrent"]
    },
    urlInit () {
      return this.$store.getters["baocao/Url"]
    }
  },
  data: vm => ({
        isLoading: false,
        urlPDF: '',
        nhomBC: [],
        mauBC: [],
        cangVuHangHai: [],
        cangBien: [],
        khuVucHH: [],
        benCang: [],
        cauCang: [],
        phongBan: [],
        loaiTau: [],
        quocTich: [],
        loaiHH: [],
        htChuyenTai: [],
        htXepDo: [],
        nhomHH: [],
        tuyenLuong: [],
        daiLy: [],
        chuTau: [],
        thang: [{name: 'Tháng 1', value: 0}, {name: 'Tháng 2', value: 1},{name: 'Tháng 3', value: 2},{name: 'Tháng 4', value: 3},{name: 'Tháng 5', value: 4},{name: 'Tháng 6', value: 5},{name: 'Tháng 7', value: 6},{name: 'Tháng 8', value: 7},{name: 'Tháng 9', value: 8},{name: 'Tháng 10', value: 9},{name: 'Tháng 11', value: 10},{name: 'Tháng 12', value: 11}],
        quy: [{name: 'Quý 1', value: 0}, {name: 'Quý 2', value: 1}, {name: 'Quý 3', value: 2}, {name: 'Quý 4', value: 3}],
        nam: [],
        items: ['Ngày', 'Tháng', 'Quý', 'Năm'],
        selectNhomBC: '',
        selectMauBC: '',
        selectCangVuHangHai: '',
        selectCangBien: '',
        selectKhuVucHH: '',
        selectBenCang: '',
        selectCauCang: '',
        selectPhongBan: '',
        selectLoaiTau: '',
        selectQuocTich: '',
        selectLoaiHH: '',
        selectHTChuyenTai: '',
        selectHTXepDo: '',
        selectNhomHH: '',
        selectDaiLy: '',
        selectChuTau: '',
        selectTuyenLuong: '',
        selectGT: '',
        selectDWT: '',
        selectTuNgay: '',
        selectDenNGay: '',
        selectThang: '',
        selectQuy: '',
        selectNam: '',
        selectNgayLap: '',
        isNgay: true,
        isThang: false,
        isQuy: false,
        isNam: false,
        menu1: false,
        menu2: false,
        menu3: false,
        createDate: new Date().toISOString().substr(0, 10),
        fromDate: new Date().toISOString().substr(0, 10),
        toDate: new Date().toISOString().substr(0, 10),
        createDateFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
        fromDateFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
        toDateFomated: vm.formatDate(new Date().toISOString().substr(0, 10)),
        thongKeTheo: 'Ngày',
        tenMauBaoCao: '',
        optionSelect: {
          maritimeCodeSelect: 0,
          portCodeSelect: 0,//cangbien
          portRegionCodeSelect: 0,
          portHarbourCodeSelect: 0,
          portWharfCodeSelect: 0,
          channelCodeSelect: 0,//tuyenluong
          departmentCodeSelect: 0,
          shipTypeCodeSelect: 0,
          flagStateCodeSelect: 0,
          grossTonnageSelect: 0,//GT
          deadWeightSelect: 0, //DWT
          cargoSelect: 0,// hang hoa
          cargoCategorySelect: 0,// Danh muc hang hoa
          cargoUnloadingSelect: 0, // Hàng hóa xếp dỡ
          cargoGroupSelect: 0,
          shipAgencyCodeSelect: 0,
          shipOwnerCodeSelect: 0,
        }
  }),
  watch: {
    createDate (val) {
      this.createDateFomated = this.formatDate(val)
    },
    fromDate (val) {
      this.fromDateFomated = this.formatDate(val)
    },
    toDate (val) {
      this.toDateFomated = this.formatDate(val)
    },
    selectNhomBC (val) {
      console.log(val)
      console.log(this.nhomBC)
      this.optionSelect = this.nhomBC.find((item) => item.rptCode === val)
      console.log(this.optionSelect)
      this.getMauBC(val)
      // let params = {
      //   rptLevel: 1,
      //   rptGroup: rptGroup,
      // }
      // this.getOptionSelect(params)
    },
    selectMauBC (val) {
      console.log(val)
      console.log(this.nhomBC)
      console.log(val)
      this.tenMauBaoCao = this.mauBC.find(item => item.rptCode === val).rptName ||  ''
      this.optionSelect = this.mauBC.find((item) => item.rptCode === val)
      console.log(this.optionSelect)
      // let params = {
      //   rptLevel: 2,
      //   rptGroup: rptGroup,
      // }
      // this.getOptionSelect(params)
    },
    async optionSelect (val) {
      if(val.maritimeCodeSelect === 1) {
        this.cangVuHangHai = await this.getMaritimes()
      }
      if(val.portCodeSelect === 1) {
        this.cangBien = await this.getDanhMuc('DM_DATAITEM_GROUP107')
      }
      if(val.portRegionCodeSelect === 1) {
        this.khuVucHH = await this.getDanhMuc('DM_PORT_REGION')
      }
      if(val.portHarbourCodeSelect === 1) {
        this.benCang = await this.getDanhMuc('DM_PORT_HARBOUR')
      }
      if(val.portWharfCodeSelect === 1) {
        this.cauCang = await this.getDanhMuc('DM_PORT_WHARF')
      }
      if(val.channelCodeSelect === 1) {
        this.tuyenLuong = await this.getDanhMuc('DM_TUYEN_LUONG')
      }
      if(val.departmentCodeSelect === 1) {
        this.phongBan = await this.getDanhMuc('VMA_TRANSACTION_DEPARTMENT')
      }
      if(val.shipTypeCodeSelect === 1) {
        this.loaiTau = await this.getDanhMuc('DM_SHIP_TYPE')
      }
      if(val.flagStateCodeSelect === 1) {
        this.quocTich = await this.getDanhMuc('DM_STATE')
      }
      // if(val.grossTonnageSelect === 1) {
      //   this.cangVuHangHai = this.getDanhMuc('DM_MARITIME')
      // }
      // if(val.deadWeightSelect === 1) {
      //   this.cangVuHangHai = this.getDanhMuc('DM_MARITIME')
      // }
      // if(val.cargoSelect === 1) {
      //   this.cangVuHangHai = this.getDanhMuc('DM_GOODS')
      // }
      if(val.cargoCategorySelect === 1) {
        this.loaiHH = await this.getDanhMuc('DM_DATAITEM_GROUP124')
      }
      if(val.cargoUnloadingSelect === 1) {
        this.htXepDo = await this.getDanhMuc('DM_DATAITEM_GROUP119')
      }
      if(val.cargoGroupSelect === 1) {
        this.nhomHH = await this.getDanhMuc('DM_DATAITEM_GROUP120')
      }
      if(val.shipAgencyCodeSelect === 1) {
        this.daiLy = await this.getDanhMuc('DM_SHIP_AGENCY')
      }
      if(val.shipOwnerCodeSelect === 1) {
        this.chuTau = await this.getDanhMuc('DM_VMA_SHIP_OWNER')
      }
    }

  },
  created () {
    let vm = this
    this.$nextTick( async () => {
      vm.getYear()
      vm.nhomBC = await vm.getNhomBC()
      console.log('Danh sach Nhom Bao Cao:', vm.nhomBC)
    });
  },
  methods: {
    forceFileDownload(response){
      const url = window.URL.createObjectURL(new Blob([response.data]))
      const link = document.createElement('a')
      link.href = url
      link.setAttribute('download', 'Excel.xls') //or any other extension
      document.body.appendChild(link)
      link.click()
    },
    xuatPDF() {
      let vm = this
      let params = {
        reportCode: this.selectMauBC,
        maritimeCode: this.selectCangVuHangHai || this.maritimeCurrent.maritimeCode,
        createDate: this.createDateFomated,
        fromDate: this.fromDateFomated,
        toDate: this.toDateFomated
      }
      var renderURLInit = "?p_p_id=baocaopmnvaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getReportPDF&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1"
      var orginURL = window.location.href
      var endPoit = orginURL + renderURLInit + '&reportCode=' + params.reportCode + '&maritimeCode=' + params.maritimeCode + '&createDate=' + params.createDate + '&fromDate=' + params.fromDate + '&toDate=' + params.toDate
      this.isLoading = true
      axios.get(endPoit).then(
        res => {
          console.log(res)
          vm.urlPDF = res.data.url
          vm.isLoading = false;
        }
      )
    },
    xuatExcel() {
      let params = {
        reportCode: this.selectMauBC,
        maritimeCode: this.selectCangVuHangHai || this.maritimeCurrent.maritimeCode,
        createDate: this.createDateFomated,
        fromDate: this.fromDateFomated,
        toDate: this.toDateFomated
      }
      var renderURLInit = "?p_p_id=baocaopmnvaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getReportEXCEL&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1"
      var orginURL = window.location.href
      var endPoit = orginURL + renderURLInit + '&reportCode=' + params.reportCode + '&maritimeCode=' + params.maritimeCode + '&createDate=' + params.createDate + '&fromDate=' + params.fromDate + '&toDate=' + params.toDate
      axios.get(endPoit).then(
        res => {
          console.log(res)
          if(res.data.url !== ''){
            let urlExcel = orginURL.substr(0, orginURL.lastIndexOf('/group')) +  res.data.url
            const link = document.createElement('a')
            link.href = urlExcel
            link.target = '_blank'
            document.body.appendChild(link)
            link.click()
          } else{
            alert('Không tìm thấy dữ liệu')
          }

        }
      )
    },
    boLoc() {
      console.log('CreateDateFomated:',this.createDateFomated),
      console.log('FromDateFomated:',this.fromDateFomated),
      console.log('ToDateFomated:',this.fromDateFomated),
      this.selectCangVuHangHai= ''
      this.selectCangBien= ''
      this.selectKhuVucHH= ''
      this.selectBenCang= ''
      this.selectCauCang= ''
      this.selectPhongBan= ''
      this.selectLoaiTau= ''
      this.selectQuocTich= ''
      this.selectLoaiHH= ''
      this.selectHTChuyenTai= ''
      this.selectHTXepDo= ''
      this.selectNhomHH= ''
      this.selectDaiLy= ''
      this.selectChuTau= ''
      this.selectTuyenLuong= ''
      this.selectGT= ''
      this.selectDWT= ''
      this.selectTuNgay= ''
      this.selectDenNGay= ''
      this.selectThang= ''
      this.selectQuy= ''
      this.selectNam= ''
      this.selectNgayLap= ''
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
    async getNhomBC(){
      let url = this.urlInit.getVmaReportCategory
      let params = {
        rptLevel: 1
      }
      let data = []
      await BaoCaoApi.getVmaReportCategory(url, params).then(
        (res) => {
          console.log('Ham getNhomBC:',res)
          data = res.data.data
        }
      )
      return data
    },
    getMauBC(rptGroup){
      let vm = this
      let url = this.urlInit.getVmaReportCategory
      let params = {
        rptLevel: 2,
        rptGroup: rptGroup
      }
      BaoCaoApi.getVmaReportCategory(url, params).then(
        (res) => {
          console.log('Ham getNhomBC:',res)
          vm.mauBC = res.data.data
        }
      )
    },
    async getOptionSelect(item){
      let vm = this
      let url = this.urlInit.getVmaReportCategory
      let params = {
        rptLevel: item.rptLevel,
        rptGroup: item.rptGroup,
      }
      await BaoCaoApi.getVmaReportCategory(url, params).then(
        (res) => {
          console.log('Ham getOptionSelect:',res)
          vm.optionSelect = res.data.data
          console.log('OptionSelect:',vm.optionSelect)
        }
      )
    
    },
    async getDanhMuc(categoryId){
      let url = this.urlInit.getDetailDmCategories
      let maritimeCode = this.maritimeCurrent.maritimeCode
      let params = {}
      if (categoryId === 'DM_DATAITEM_GROUP107' || categoryId === 'DM_PORT_REGION' || categoryId === 'DM_PORT_HARBOUR' || categoryId === 'DM_PORT_WHARF' || categoryId === 'VMA_TRANSACTION_DEPARTMENT' || categoryId === 'DM_TUYEN_LUONG'){
        params = {
          categoryId:  categoryId,
          maritimeCode: maritimeCode
        }
      }
      else {
        params = {
          categoryId: categoryId
        }
      }
      let data = []
      await BaoCaoApi.getDetailDmCategories(url, params).then(
        (res) => {
          console.log('Ham get danh muc:', res)
          data = res.data.data
        }
      )
      return data
    },
    async getMaritimes () {
      let url = this.urlInit.getMaritimes
      let data = []
      await BaoCaoApi.getMaritimes(url).then(
        (res) => {
          console.log('Ham getMaritimes:', res)
          data = res.data
        }
      )
      return data
    },
    getYear() {
      let currentYear = (new Date()).getFullYear();
      for(var i=0; i < 10; i++) {
        this.nam.push(currentYear)
        currentYear--
      }
    }
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
    width: 23%;
    box-shadow: 2px 0 5px -2px #888;
  }
  #ketqua-baocao{
    width: 87%;
  }
  #BaoCao .btn-filter{
    width: 30%!important;
    height: 24px!important;
    font-size: 9px!important;
  }
  #BaoCao .filter-list{
    width: 100%;
    padding-left: 18px;
    padding-right: 18px;
    padding-top: 18px;
    padding-bottom: 0px;
  }
  #BaoCao .input-groups{
    width: 100%;
    display: flex;
    align-items: center;
  }
  #BaoCao .lable-filter{
    width: 30%;
    font-size: 13px;
    font-weight: 600;
    color: #1976D2;
  }
  #BaoCao .input-filter{
    width: 70%;
  }
  #BaoCao .item-filter{
    display: inline-block;
    margin: 5px 0px;
    width: 100%;
  }
  #BaoCao .primary{
    background-color: #0b72ba;
  }
  #BaoCao .v-text-field__details {
    display: none!important;
  }
  #BaoCao .v-text-field {
      padding-top: 0px!important;
      margin-top: 0px!important;
  }
  #BaoCao .row-header{
    height: 38px;
    overflow: hidden;
    background-color: #e1e2e1;
    display: flex;
    align-items: center;
    width: 100%;
  }
  #BaoCao .background-triangle-big{
      padding: 10px 5px 10px 20px;
      width: auto;
      margin-right: 30px;
      background-color: #0b72ba;
      display: inline-block;
      text-align: right;
      color: #fff;
      position: relative;
  }
  #BaoCao .background-triangle-big:before, .background-triangle-small:before {
      content: "";
      position: absolute;
      top: 1px;
      transform: rotate(45deg);
      right: -4px;
      border-top: 28px solid #0b72ba;
      border-left: 28px solid transparent;
      border-bottom: 28px solid transparent;
  }
  #BaoCao .header_tools{
    padding: 30px;
    font-size: 13px;
  }
  #BaoCao .primary--text{
    color: #2372ba !important;
  }
  #BaoCao .text-bold{
    font-weight: bold;
  }
  #BaoCao .btn-time{
      width: 20%;
      height: 24px!important;
      font-size: 9px!important;
  }


  #BaoCao .v-autocomplete__content{
      max-height: 304px;
      min-width: 257px;
      top: 0px!important;
      left: -253px!important;
      transform-origin: left top;
      z-index: 8;
  }

  #BaoCao .v-list-item {
    font-size: 13px !important;
    height: 35px !important;
    padding: 0 10px !important;
    border-bottom: 1px dashed #d4caca !important;
  }
  #BaoCao .v-input{
    font-size: 13px;
  }

  #BaoCao .v-input__append-inner{
    margin-top: 6px;
  }
  #BaoCao .v-select__selections{
    padding: 2px 0;
  }
  #BaoCao .v-text-field--filled>.v-input__control>.v-input__slot, .v-text-field--full-width>.v-input__control>.v-input__slot, .v-text-field--outlined>.v-input__control>.v-input__slot {
      -webkit-box-align: stretch;
      -ms-flex-align: stretch;
      align-items: stretch;
      min-height: 36px!important;
  }
  #BaoCao .ngay-bao-cao .v-menu{
    position: relative;
  }
  #BaoCao .v-menu__content {
    position: absolute;
    top: 0px!important;
    left: 0px!important;
  }
  #BaoCao .v-date-picker-table .v-btn.v-btn--active {
    color: #2c2727!important;
  }
  #BaoCao .v-date-picker-header{
    background-color: #0b72ba;
    color: white;
  }
  #BaoCao .row{
    margin-right: 0px!important; 
    margin-left: 0px!important; 
  }
  #BaoCao .v-list-item__title {
    font-size: 13px!important;
  }
  #BaoCao .v-icon{
    font-size: 15px!important;
  }
  #BaoCao i{
    font-size: 15px!important;
  }
</style>
