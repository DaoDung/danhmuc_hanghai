<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="paymentViewJX"></div>

  <!-- TODO paymentViewJX template one page -->
  <div id="paymentViewJX_form_template" class="hidden">
    <div class="jx-content-wrap">
      <div class="layout wrap">
        <v-slide-x-transition>
          <div class="row-header flex-break" v-if="!detailPage">
            <div class="background-triangle-big"> Kết quả tìm kiếm</div>
            <div class="layout row wrap header_tools w-100-xs">
            
              <div class="flex xs8 sm5 solo" jx-bind="paymentMethodSearch" v-show="listgroupFilterselected != 2 && listgroupFilterselected === 0">
  
              </div>
  
              <div class="flex xs4 sm2" jx-bind="paymentConfirm" v-show="listgroupFilterselected != 2 && listgroupFilterselected === 0">
  
              </div>
  
              <div class="flex pr-3 w-100-xs" jx-bind="keywordsSearch" style="display: flex;display: -webkit-flex;">
  
              </div>
  
            </div>
          </div>
        </v-slide-x-transition>
        
        
        <v-slide-x-transition>
          <div class="layout wrap" :class='{"list--payment--done": listgroupFilterselected===9}' jx-bind="paymentList" v-if="!detailPage">
  
          </div>
        </v-slide-x-transition>
        
        <v-fab-transition>
	        <v-btn color="primary" dark fixed bottom right fab ripple v-show="offsetTop > 200"
	        v-on:click.native="onScrollTop">
	          <v-icon>keyboard_arrow_up</v-icon>
	        </v-btn>
      </v-fab-transition>
      
      </div>
    </div>
  </div>
	
	<!-- TODO paymentViewJX template one page view List detail template -->
<div id="activity_expand_list_template" class="hidden">
	<template slot="items" slot-scope="props">
		<td style="padding: 0 !important;"> 
			<div class="radio radio-primary">
				<label style="margin-left: 3px;" v-if="choiced === props.item.id">
					<v-btn class="mx-0 my-0 px-0 py-0" v-on:click="doSelectedPayment(props.item, props.index)" icon>
						<v-icon color="primary">radio_button_checked</v-icon>
					</v-btn>
				</label>
				<label style="margin-left: 3px;" v-else>
					<v-btn class="mx-0 my-0 px-0 py-0" v-on:click="doSelectedPayment(props.item, props.index)" icon>
						<v-icon>radio_button_unchecked</v-icon>
					</v-btn>
				</label>
			</div>
		</td>
		<td class="text-xs-center" style="width: 30px; padding: 0px !important;">{{ paymentListpage * 15 - 15 + props.index + 1 }}</td>
		<td class="text-xs-center">
		{{props.item.documentName}} <br/>
		<small v-if="props.item.paymenttype > 0" style="
		    color: #0e70bc;
		">( {{paymentTypeData[props.item.paymenttype]}} {{paymentMarkDelete[props.item.markasdeleted]}})</small>
		</td>
		<td class="text-xs-center">
		{{props.item.tenTau}}
		</td>
		<td class="text-xs-center">
		{{props.item.hoHieu}}
		</td>
		<td class="text-xs-center">
		{{props.item.imo}}
		</td>
		<td class="text-xs-center">
		{{props.item.quocTich}}
		</td>
		<td class="text-xs-center">
		{{props.item.daiLy}}
		</td>
		<td class="text-xs-center">{{props.item.debitnotenumber}}</td>
		<td class="text-xs-center"> {{props.item.reportdate | datetime}}</td>
		<td class="text-xs-center red--text btn--action-money">{{props.item.totalpayment | money}} {{props.item.currency}}</td>
		<td class="text-xs-left btn--action-ketoan" style="padding: 0 0 0 8px !important;">
			<v-btn flat class="mx-0 my-0" v-on:click.native="doSelectedPaymentEdit(props.item, props.index)" v-if="props.item.markasdeleted != 9">
				Cập nhật phí
			</v-btn>
			<v-btn flat class="mx-0 my-0" v-if="props.item.totalpayment > 0 && props.item.markasdeleted != 9"
				v-on:click.native="resendNoti(props.item, props.index)"
				:loading="loading_process_btn"
				:disabled="loading_process_btn"
			>
				Gửi lại TBP
			</v-btn>
    </td>
	</template>
</div>

<!-- TODO Template Xây dựng navigation -->
<div id="menu_template" class="hidden">
    <div class="layout row wrap px-0 py-0">
    	<div class="flex xs12 ">
			<div class="row-header layout" style="background-color: #e1e2e1;height: 38px;overflow: hidden;"><div class="background-triangle-big" style="max-width: 90px;padding: 10px 0px 0px 10px;"> TRẠNG THÁI </div> 
			<div class="layout row wrap header_tools row-blue px-0">
			<a class="text-bold primary--text text-right" style="color: #1976D2 !important;" @click="isAdv = !isAdv">
				Tìm kiếm nâng cao
				<v-icon size="16" color="primary" v-if="!isAdv">expand_more</v-icon>
				<v-icon size="16" color="primary" v-else>expand_less</v-icon>
			</a>
			</div></div>
		</div>
		<div class="layout row wrap px-2" v-if="isAdv">
			<v-flex xs12 class="px-0">
               <v-subheader class="pl-0 text-bold" style="
    height: 36px;
">Cảng vụ: {{cang_vu_label}}</v-subheader>
             </v-flex>
             <v-flex xs12 class="px-0">
                <v-select
                  label="Tàu đến/rời:"
                  v-model="positionCode"
                  autocomplete
                  :items="positionCodes"
                  item-text="name"
                  item-value="code"
                ></v-select>
              </v-flex>
              <v-flex xs12 class="pl-0">
                <v-text-field
                  label="Tên tàu:"
                  v-model="shipName"
                ></v-text-field>
              </v-flex>
              <v-flex xs12 class="pl-0">
                <v-text-field
                  label="Hô hiệu:"
                  v-model="callSign"
                ></v-text-field>
              </v-flex>
              <v-flex xs12 class="pl-0">
                <v-text-field
                  label="IMO:"
                  v-model="imo"
                ></v-text-field>
              </v-flex>
              <v-flex xs12 class="pl-0">
              <v-select
             		label="Quốc tịch:"
                  v-model="stateCode"
                  autocomplete
                  :items="stateCodes"
                  item-text="name"
                  item-value="code"
                ></v-select>
                </v-flex>
                <v-flex xs12 class="pl-0">
               <v-select
               label="Khu vực cảng:"
                  v-model="maritimeCode"
                  autocomplete
                  :items="maritimeCodes"
                  item-text="name"
                  item-value="code"
                ></v-select>
                </v-flex>
                <v-flex xs12 class="pl-0">
                <v-select
                label="Cảng tiếp theo:"
                  v-model="maritimeCodeNext"
                  autocomplete
                  :items="maritimeCodesTiepTheos"
                  item-text="name"
                  item-value="code"
                ></v-select>
                </v-flex>
		</div>
    	<div class="flex xs12 mb-0 px-0 panel-dossier-navigation" jx-bind="listgroupFilter"></div>
	</div>
	<input type="file" name="inputfile_temp" id="inputfile_temp" style="display:none" />
</div>

<div id="popUpPaymentFileEditTemplate">
    <div class="layout wrap payment-popup-edit" style="margin-top: 50px;">
        <v-flex xs12 sm2>
			<v-subheader class="pl-0">Mã bản khai:</v-subheader>
		</v-flex>
		<v-flex xs12 sm4>
			<v-subheader>{{detailModel.documentName}}</v-subheader>
		</v-flex>
		<v-flex xs12 sm2>
			<v-subheader>Ngày lập phiếu:</v-subheader>
		</v-flex>
		<v-flex xs12 sm4>
			<v-subheader class="px-0">{{detailModel.reportdate | datetime}}</v-subheader>
		</v-flex>
		<v-flex xs12 sm2>
			<v-subheader class="pl-0">Số phiếu tính tiền:</v-subheader>
		</v-flex>
		<v-flex xs12 sm4>
			<v-subheader>{{detailModel.debitnotenumber}}</v-subheader>
		</v-flex>
		<v-flex xs12 sm2>
			<v-subheader>Tổng tiền:</v-subheader>
		</v-flex>
		<v-flex xs8 sm3>
			<v-text-field
				v-model="detailModel.totalpayment"
				placeholder="tổng tiền ..."
				:rules="[rulesMoney.required]"
			></v-text-field>
		</v-flex>
		<v-flex xs4 sm1>
			<v-select
              v-bind:items="currencys"
              v-model="currency"
              single-line
              auto
              hide-details
            ></v-select>
		</v-flex>
		<v-flex xs12>
			<v-subheader class="pl-0">Nhập ý kiến:</v-subheader>
		</v-flex>
		<v-flex xs12>
			<v-text-field
				v-model="detailModel.comments"
				textarea
			></v-text-field>
		</v-flex>
    </div>
</div>

<script>
document.addEventListener('DOMContentLoaded', function (event) {

	var getPaymentDataURL = '<portlet:resourceURL id="getPaymentData"></portlet:resourceURL>';
	var actionKeToanURL = '<portlet:actionURL windowState="exclusive" name="actionKeToan"></portlet:actionURL>';
	var actionKeToanUpdatePaymentURL = '<portlet:actionURL windowState="exclusive" name="actionKeToanUpdatePayment"></portlet:actionURL>';
	var getFilterADVDataAPI = '<portlet:resourceURL id="getFilterADVDataAPI"></portlet:resourceURL>';
	var paymentMarkDeleteData = {
			'0': '',
			'1': '',
			'2': '',
			'9': '',
			'11': 'báo nộp chuyển khoản',
			'12': 'thanh toán trực tuyến'
	}
	var paymentTypeData = {
			'0': '',
			'1': 'chuyển khoản',
			'2': 'trực tuyến'
	}
	var paymentViewJX = new VueJX({
		el: 'paymentViewJX',
		pk: 1,
		groupid: themeDisplay.getScopeGroupId(),
		data: {
			currencys: ['VND','USD'],
			currency: 'VND',
			imo: '',
			maritimeCodes: [],
	      maritimeCodesTiepTheos: [],
	      positionCodes: [],
	      stateCodes: [],
	      maritimeCode: null,
	      maritimeCodeNext: null,
	      positionCode: null,
	      stateCode: null,
	      shipName: '',
	      callSign: '',
			getFilterADVDataAPI: getFilterADVDataAPI,
			cang_vu_label: '',
			isAdv: true,
			paymentMarkDelete: paymentMarkDeleteData,
			paymentTypeData: paymentTypeData,
			offsetTop: 0,
			detailPage: false,
			viewmore: false,
			showmore: false,
			choiced: 0,
			loading_process_btn: false,
			detailModel: {

			},
			xem_them: 'Không tìm thấy phiếu thanh toán nào',
			rulesMoney: {
				required: function(value) {
					return !!value || 'Tổng tiền bắt buộc phải nhập.';	
				},
				number: function(value) {
					var pattern = /^\d+$/;
					return pattern.test(value) || 'Tổng tiền sai định dạng.';
				}
			}
		},
		onScroll: 'onScroll',
		schema: {
			/** TODO menu filter */
			'navigationFilter': {
				'id': 'navigationFilter',
				'name': 'navigationFilter',
				'type': 'navigation',
				'template': 'menu_template',
				'template_content': 'paymentViewJX_form_template'
			},
			'popUpPaymentFileEdit' : {
				'id': 'popUpPaymentFileEdit',
				'name': 'popUpPaymentFileEdit',
				"type": "dialogsm",
				'icon_save': 'undo',
				'label_save': 'Quay lại',
				"color": "primary",
				"template": "popUpPaymentFileEditTemplate",
				"events": {
					popUpPaymentFileEditClose: function () {
						this.popUpPaymentFileEdit = false;
					},
					popUpPaymentFileEditSave: function () {
						var vm = this;

						var configParam = {
                                        
						};
						
						var params = new FormData();
						params.append('id', vm.detailModel.id);
						params.append('DOCUMENT_NAME', vm.detailModel.documentName);
						params.append('DOCUMENT_YEAR', vm.detailModel.documentYear);
						params.append('totalpayment', vm.detailModel.totalpayment);
						params.append('ykienReject', vm.detailModel.comments);
						params.append('currency', vm.currency);
						
						axios.post(
							actionKeToanUpdatePaymentURL, 
							params,
							configParam
						).then(function (response) {
							vm._inipaymentList(false);
						}).catch(function (error) {
							console.log(error);
						});

						vm.popUpPaymentFileEdit = false;
					},
					resendNoti: function (item) {
						var vm = this;
						vm.loading_process_btn = true;
						var x = confirm("Bạn có muốn Gửi lại thông báo phí?");
						if (x) {
							vm.detailModel = item;
							vm.popUpPaymentFileEditSave();
							vm.snackbarpaymentViewJX = true;
							vm.snackbartextpaymentViewJX = "Gửi thông báo phí thành công.";
							vm.loading_process_btn = false;
						}
						else {
							vm.loading_process_btn = false;
							return false;
						}
					}
				}
			},
			'listgroupFilter': {
				'id': 'listgroupFilter',
				'name': 'listgroupFilter',
				'type': 'listgroup',
				'child_items': 'items',
				'data_title': 'title',
				'data_value': 'id',
				'onLoad': '_initlistgroupFilter',
				'onClick': 'filterChange',
				'events': {
					doSelectedPaymentEdit: function (item, index) {
						var vm = this;
						vm.detailModel = item;
						vm.detailModel['index'] = index;
						vm.choiced = item.id;
						vm.popUpPaymentFileEdit = true;
						console.log(vm.detailModel)
					},
					doSelectedPayment: function (item, index) {
						var vm = this;
						vm.detailModel = item;
						vm.detailModel['index'] = index;
						vm.choiced = item.id;
					},
					filterChange: function (item) {
						var vm = this;
						vm.paymentListpage = 1;
						if (item.id == '2') {
							vm.listgroupFilterselected = 9;
						} else {
							vm.listgroupFilterselected = 0;
						}
						vm.paymentListpage = 1
						if (vm.isAdv) {
							vm._inipaymentList(true);
						} else {
							vm._inipaymentList(false);
						};
					},
					_initlistgroupFilter: function () {
						this.listgroupFilterItems = [
							{
								action: 'folder',
								action_active: 'folder_open',
								id: '0',
								title: 'Xác nhận thanh toán',
								active: true
							},
							{
								action: 'folder',
								action_active: 'folder_open',
								id: '2',
								title: 'Đã xử lý'
							}
						];
						var vm = this;
					      axios
					        .get(vm.getFilterADVDataAPI)
					        .then(function (response) {
					        	var serializable = response.data;
					        	vm.maritimeCodes = serializable.cang_vu_list;
					            vm.maritimeCodesTiepTheos = serializable.cang_tiep_theo;
					            vm.positionCodes = serializable.tau_den_roi_list;
					            vm.stateCodes = serializable.quoc_tich_list;
					            vm.cang_vu_label = serializable.cang_vu_label;

					            vm.maritimeCodesTiepTheos.unshift({
					              'code': '',
					              'name': 'Toàn bộ'
					            });
					            vm.maritimeCodes.unshift({
					              'code': '',
					              'name': 'Toàn bộ'
					            });
					            vm.positionCodes.unshift({
					              'code': '',
					              'name': 'Toàn bộ'
					            });
					            vm.stateCodes.unshift({
					              'code': '',
					              'name': 'Toàn bộ'
					            });
					        }).catch(function (error) {
					          console.log(error);
					        });
					}
				}
			},
			/** TODO filter component */
			'paymentMethodSearch': {
				'id': 'paymentMethodSearch',
				'name': 'paymentMethodSearch',
				'type': 'radio',
				'label': '',
				'labelClass': '',
				'controlClass': 'xs12',
				'switch_inline': true,
				'tabindex': 0,
				'items': [
					{
						'label': 'Tiền mặt',
						'color': 'blue darken-2',
						'value': '0',
					},
					{
						'label': 'Chuyển khoản',
						'color': 'blue darken-2',
						'value': '1',
					}
				],
				'onLoad': '_initpaymentMethodSearch',
				'events': {
					_initpaymentMethodSearch: function () {

						this.paymentMethodSearch = '0';

					}
				}
			},
			'paymentConfirm': {
				'id': 'paymentConfirm',
				'name': 'paymentConfirm',
				'cssClass': 'btn--flat ml-0 pl-0',
				'label': 'Xác nhận',
				'type': 'button',
				'left_icon': 'done_all',
				'onClick': 'paymentConfirmAction',
				'events': {
					paymentConfirmAction: function () {
						var vm = this;

						var documentN = vm.detailModel['documentName'];
						if (typeof documentN == 'undefined') {
							alert('Chưa chọn phiếu thanh toán nào?. ');
							return;
						}
						var labelBtn = 'Xác nhận';

						var dateConfirmPayment = new Date();
						var month = dateConfirmPayment.getMonth() + 1;
						var day = dateConfirmPayment.getDate();
						var year = dateConfirmPayment.getFullYear();

						var dialogContent = '<strong>Ngày xác nhận thu phí: </strong> ' + day + '/' + month + '/' + year + ' <br/>';
						dialogContent += '<strong>Người thực hiện: </strong> ' + themeDisplay.getUserName() + ' <br/>';
						dialogContent += '<strong>Hình thức thanh toán: </strong> ' + vm.paymentMethodSearch + ' <br/>';
						dialogContent += '<strong>Xác nhận thu phí cho: </strong> ' + vm.detailModel['documentName'] + ' . <br/>';

						vm.$dialog.confirm(dialogContent, {
							html: true,
							loader: true,
							okText: labelBtn,
							cancelText: 'Quay lại',
							animation: 'fade'
						})
							.then(function(dialog){
								var configParam = {
                                        
                                };
                                var params = new FormData();
                                params.append('DOCUMENT_NAME', vm.detailModel.documentName);
                                params.append('DOCUMENT_YEAR', vm.detailModel.documentYear);
								params.append('paymenttype', vm.paymentMethodSearch);
                                axios.post(
                                	actionKeToanURL, 
                                    params,
                                    configParam
                                ).then(function (response) {
                                	vm._inipaymentList();
                                }).catch(function (error) {
                                    console.log(error);
                                });
                                
								dialog.close();
							})
							.catch(function(e){
								console.log('process aborted');
							})
					}
				}
			},
			'keywordsSearch': {
				'id': 'keywordsSearch',
				'name': 'keywordsSearch',
				'type': 'text',
				'placeholder': 'Tìm kiếm theo từ khoá mã bản khai, số phiếu',
				'solo': true,
				'append_icon': 'search',
				'onKeyup': 'filterTableKeywords',
				'events': {
					filterTableKeywords: function (event) {
						var vm = this;
						if (event.keyCode === 13 || vm.keywordsSearch.length > 3 || vm.keywordsSearch.length === 0) {
							vm.isAdv = false
							vm._inipaymentList(false);
						}
					}
				}
			},
			/** TODO menu filter */
			'paymentList': {
				'id': 'paymentList',
				'name': 'paymentList',
				'type': 'table',
				'cssClass': 'table-bordered danhSachPaymentTable__class danhSachHoSoTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'activity_expand_list_template',
				'paggingcustom': '_paggingPaymentList',
				'next': '_nextPaymentList',
				'previous': '_previousPaymentList',
				'onLoad': '_inipaymentList',
				'events': {
					_inipaymentList: function (isAdvandSearch) {

						var vm = this;
						
						vm.viewmore = true;
						this.paymentListheaders = [
							{
								text: 'STT',
								align: 'center',
								sortable: false,
								value: 'stt'
							},
							{
								text: 'Mã bản khai',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'Tên tàu',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'Hô hiệu',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'IMO',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'Quốc tịch',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'Đại lý',
								align: 'center',
								sortable: false,
								value: 'col1'
							},
							{
								text: 'Số phiếu tính tiền',
								align: 'center',
								sortable: false,
								value: 'col2'
							},
							{
								text: 'Ngày lập phiếu',
								align: 'center',
								sortable: false,
								value: 'col3'
							},
							{
								text: 'Tổng tiền',
								align: 'center',
								sortable: false,
								value: 'col4'
							},
							{
								text: 'Hành động',
								align: 'center',
								sortable: false,
								value: 'col4'
							}
						];
					      var positionCodeStr = '';
					      var stateCodeStr = '';
					      var maritimeCodeStr = '';
					      var maritimeCodeNextStr = '';

					        positionCodeStr = vm.positionCode;
					        stateCodeStr = vm.stateCode;
					        maritimeCodeStr = vm.maritimeCode;
					        maritimeCodeNextStr = vm.maritimeCodeNext;
					      
						var config = {
							params: {
                                'markasdeleted': vm.listgroupFilterselected,
								'start': vm.paymentListpage*15 - 15,
								'end': vm.paymentListpage*15,
								'keywordsSearch': vm.keywordsSearch,
								'isAdv': isAdvandSearch,
								'positionCode': positionCodeStr,
						        'imo': vm.imo,
						        'stateCode': stateCodeStr,
						        'portRegionCode': maritimeCodeStr,
						        'maritimeCodeNext': maritimeCodeNextStr,
						       	'shipName': vm.shipName,
						       	'callSign': vm.callSign
                            }
						}
						if (vm.listgroupFilterselected == 9) {
							config.params['markasdeleted'] = '1,2,9,12'
						} else if (vm.listgroupFilterselected == 0) {
							config.params['markasdeleted'] = '0,11'
						}
						axios.get(getPaymentDataURL, config).then(function (response) {
                            var serializable = response.data;
                            vm.paymentListItems = serializable.data;
                            vm.paymentListTotal = Math.ceil(serializable.total / 15);
                            vm.paymentListTotalCount = serializable.total;
                        }).catch(function (error) {
                            console.log(error);
                        });

					},
					_paggingPaymentList: function(config) {
						this.paymentListpage = config.page
						if (this.isAdv) {
							this._inipaymentList(true);
						} else {
							this._inipaymentList(false);
						};
					},
					_nextPaymentList: function() {
						
					},
					_previousPaymentList: function() {
						
					},
					toPaymentDetail: function (index) {
					},
					_showFile: function (options) {
						
					},
					paggingPaymentList: function(){
					},
					onScroll(e) {
						this.offsetTop = window.pageYOffset || document.documentElement.scrollTop
					},
					onScrollTop (e) {
						window.scrollBy(0, -99999)
					}
				}
			}

		}
	});

	paymentViewJX._builder('paymentViewJX');

});
</script>

<style>

	.btn-view {
	    min-height: 38px;
	    box-shadow: none !important;
	    border-radius: 0px;
	    background-color: #4cbff1 !important;
	    color: white !important;
	}
	.panel-dossier-navigation .list__tile--link {
	    color: #2a2a2a !important;
	    font-size: 13px;
	    height: auto;
	}
	table.table thead th {
	    white-space: normal !important;
	}
	body .danhSachPaymentTable__class {
	    margin-top: 5px !important;
	    padding: 0;
	    border-top: 0;
	}
	table .input-group--hide-details.checkbox {
		display: none;
	}
	body .list__tile__action {
	    min-width: 40px;
	}
	body .flex.switch-label {
		display: none;
	}
	body .btn--action-ketoan {
    	width: 245px;
	}
	body btn--action-money {
		width: 150px;
	}
	body .btn--action-ketoan .btn__content:before {
		top: 10% !important;
    	height: 80% !important;
		background: #2372ba;
	}
	body .payment-popup-edit .subheader{
		height: 32px;
	}
	body .list--payment--done table th:last-child,
	body .list--payment--done table td:last-child {
		display: none !important;
	}
	html body .dialog .card__actions {
		padding: 6px 0px 6px;
	}
	body .datatable--select-all .radio .btn .btn__content .icon {
    	font-size: 16px;
	}
	body .navigation-drawer .row-header .icon {
		font-size: 17px;
	}
	body .navigation-drawer .input-group--text-field label {
	    position: inherit;
	    top: 0;
	    left: 0;
	    font-weight: bold;
	    color: #0d71bb !important;
	    font-size: 12px;
	}
	body .navigation-drawer .input-group label {
	    line-height: 15px;
   		 height: 15px;
	}
	body .table__overflow.table-bordered thead th:nth-child(2) {
	    width: 10px;
	    padding: 0;
	}
	body .table__overflow.table-bordered thead th:nth-child(11) {
	    width: 150px;
	    padding: 0;
	}
</style>