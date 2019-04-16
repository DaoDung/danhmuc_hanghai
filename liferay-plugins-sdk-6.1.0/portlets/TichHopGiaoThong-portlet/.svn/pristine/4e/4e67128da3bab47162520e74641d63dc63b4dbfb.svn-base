<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="reportViewJX"></div>

<!-- TODO reportViewJX template one page -->
<div id="reportViewJX_form_template" class="hidden">
  <div class="jx-content-wrap">
    <div class="layout wrap">
      <v-slide-x-transition>
        <div class="row-header flex-break">
          <div class="background-triangle-big"> {{doReportType.reportName}}</div>
          <div class="layout row wrap header_tools w-100-xs">
						{{cangVu.name}} : Từ <span class="text-bold primary--text">&nbsp;{{fromDate}}&nbsp;</span> đến <span class="text-bold primary--text">&nbsp;{{toDate}}</span>
          </div>
        </div>
      </v-slide-x-transition>
		
      <v-slide-x-transition>
		<div class="layout wrap">
				
			<div style="width: 100%;">
				<div style="width: 100%;" v-show="nodata && !loadingPDF">Không tìm thấy dữ liệu báo cáo</div>
				<div style="width: 100%;" id="dossierPDFView"></div>
			</div>

		</div>
      </v-slide-x-transition>
    
    </div>
	<div v-if="loadingPDF" style="width: 100%;">
		<content-placeholders :rounded="true">
			<content-placeholders-img />
			<content-placeholders-heading />
		</content-placeholders>
	</div>
  </div>
</div>

<!-- TODO Template Xây dựng navigation -->
<div id="menu_template" class="hidden">
	<div>
		<v-layout>
			<v-flex>
			  <div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
		     <v-select
				v-else
				v-model="doReportType"
				autocomplete
				:items="doReportTypes"
				return-object
				item-text="reportName"
				item-value="reportCode"
			></v-select>
			</v-flex>
			<v-flex>
				<div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
				<v-btn v-else icon class="mx-0 my-0 grey lighten-2" v-on:click.native="filterLeftSearch">
					<v-icon>search</v-icon>
				</v-btn>
			</v-flex>
		 </v-layout>
		<v-layout>
			<v-flex sm12>
				<div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
				<v-select
					v-else
					v-model="cangVu"
					autocomplete
					:items="cangVus"
					return-object
					item-text="name"
					item-value="code"
				></v-select>
			</v-flex>
		</v-layout>
		<v-layout>
			<v-flex sm12>
				<div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
				<div v-else jx-bind="createDate">

				</div>
			</v-flex>
		</v-layout>
		<v-layout>
			<v-flex sm12>
				<div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
				<div v-else jx-bind="fromDate">

				</div>
			</v-flex>
		</v-layout>
		<v-layout>
			<v-flex sm12>
				<div v-if="loadingData">
					<content-placeholders>
						<content-placeholders-text :lines="1" />
					</content-placeholders>
				</div>
				<div v-else jx-bind="toDate">

				</div>
			</v-flex>
		</v-layout>
	</div>
</div>

<script>
document.addEventListener('DOMContentLoaded', function (event) {

	var getFilterProvidersURL = '<portlet:resourceURL id="getFilterProviders"></portlet:resourceURL>';
	var getReportPDF = '<portlet:resourceURL id="getReportPDF"></portlet:resourceURL>';

	var reportViewJX = new VueJX({
		el: 'reportViewJX',
		pk: 1,
		groupid: themeDisplay.getScopeGroupId(),
		data: {
			getFilterProvidersURL: getFilterProvidersURL,
			getReportPDF: getReportPDF,
			detailPage: false,
			reportType: {
				code: 'report_1',
				name: 'Báo cáo tổng hợp'
			},
			reportTypes: [
				{
					code: 'report_1',
					name: 'Báo cáo tổng hợp'
				},
				{
					code: 'report_2',
					name: 'Báo cáo đối chiếu'
				},
				{
					code: 'report_3',
					name: 'Báo cáo chi tiết'
				},
				{
					code: 'report_4',
					name: 'Báo cáo khác'
				}
			],
			doReportType: {
			},
			doReportTypes: [
			],
			cangVu: {
			},
			cangVus: [
			],
			loadingData: true,
			loadingPDF: false,
			nodata: true
		},
		onScroll: 'onScroll',
		schema: {
			/** TODO menu filter */
			'navigationFilter': {
				'id': 'navigationFilter',
				'name': 'navigationFilter',
				'type': 'navigation',
				'template': 'menu_template',
				'template_content': 'reportViewJX_form_template',
				'onLoad': 'onLoadData',
				'events': {
					onScroll: function(e) {
						
					},
					onLoadData: function() {
						var vm = this;
						vm.loadingData = true;
						var dateCur = new Date();
						var month = dateCur.getMonth() + 1;
						var day = dateCur.getDate();
						var year = dateCur.getFullYear();
						if (day < 10) {
							day = '0' + day;
						}
						if (month < 10) {
							month = '0' + month;
						}
						vm.createDate = day + "/" + month + "/" + year;
						vm.fromDate = day + "/" + month + "/" + year;
						vm.toDate = day + "/" + month + "/" + year;

						if (vm.doReportTypes.length <= 0) {
							axios.get(vm.getFilterProvidersURL, {
								params: {
									'mauBaoCao': vm.doReportType.reportCode,
									'maritimeCode': vm.cangVu.code,
									'ngayLap': "document_history",
									'tuNgay': "document_history",
									'denNgay': "document_history"
								}
							}).then(function (response) {
								var serializable = response.data;
								console.log(serializable);
								vm.doReportTypes = serializable.allReportTemplates;
								vm.doReportType = vm.doReportTypes[0];
								vm.cangVus = serializable.allDmMaritimes;

								if (serializable.hasOwnProperty('cangVu')) {
									vm.cangVu = serializable.cangVu;
								} else {
									vm.cangVu = vm.cangVus[0];
								}

								vm.loadingData = false;
							}).catch(function (error) {
								console.log(error);
								vm.loadingData = false;
							});
						}
					},
					filterLeftSearch: function() {
						var vm = this;
						vm.loadingPDF = true;
						var iFrame = document.getElementById("dossierPDFView")
						iFrame.innerHTML = ''
						vm.nodata = true;
						axios.get(vm.getReportPDF, {
								params: {
									'mauBaoCao': vm.doReportType.reportCode,
									'maritimeCode': vm.cangVu.code,
									'ngayLap': vm.createDate,
									'tuNgay': vm.fromDate,
									'denNgay': vm.toDate
								}
							}).then(function (response) {
								var serializable = response.data;
								console.log(serializable);
								if (serializable.url != '') {
									vm.nodata = false;
								}
								vm.loadingPDF = false;
								if (serializable.url != '') {
									iFrame.innerHTML =
            			'<iframe src="'+serializable.url+'" style="width:100%; height: 100vh;" frameborder="0"></iframe>';
								} else {
									vm.nodata = true;
								}
								
							}).catch(function (error) {
								console.log(error);
								vm.loadingPDF = false;
								vm.nodata = true;
							});
					}
				}
			},
			'createDate': {
				'id': 'createDate',
				'name': 'createDate',
				'type': 'date',
				'label': 'Ngày tạo',
				'placeholder': 'ngày lập',
				'controlClass': 'xs12',
				'append_icon': 'event',
				'events': {
					
				}
			},
			'fromDate': {
				'id': 'fromDate',
				'name': 'fromDate',
				'type': 'date',
				'label': 'Từ ngày',
				'controlClass': 'xs12',
				'append_icon': 'event',
				'events': {
					
				}
			},
			'toDate': {
				'id': 'toDate',
				'name': 'toDate',
				'type': 'date',
				'label': 'Đến ngày',
				'controlClass': 'xs12',
				'append_icon': 'event',
				'events': {
					
				}
			}
		}
	});

	reportViewJX._builder('reportViewJX');

});
</script>

<style>
	body #reportViewJX .menu__content.menu__content--select {
		margin-top: -6%;
	}
	body #reportViewJX .menuable__content__active {
		margin-top: -5%;
	}
	body .input-group--text-field label {
		position: relative !important;
	    top: 0;
	    left: 0;
	    font-weight: bold;
	    color: inherit !important;
	}
</style>