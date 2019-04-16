
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/json/table_ho_so_header.json"></script>
<script type="text/javascript">
    document
        .addEventListener(
            'DOMContentLoaded',
            function (event) {
                var config = {};
                // serveResource api
                var getDetailHoSo = '<portlet:resourceURL id="getDetailHoSo"></portlet:resourceURL>';
                var getRoleFilterStatus = '<portlet:resourceURL id="getRoleFilterStatus"></portlet:resourceURL>';
                var getHoSoKeHoachTable = '<portlet:resourceURL id="getHoSoKeHoachTable"></portlet:resourceURL>';
                var counterHoSoKeHoachTable = '<portlet:resourceURL id="counterHoSoKeHoachTable"></portlet:resourceURL>';
                var getHoSoThuTucTable = '<portlet:resourceURL id="getHoSoThuTucTable"></portlet:resourceURL>';
                var counterHoSoThuTucTable = '<portlet:resourceURL id="counterHoSoThuTucTable"></portlet:resourceURL>';
                var getHistoryTable = '<portlet:resourceURL id="getHistoryTable"></portlet:resourceURL>';
                var getPhanHoiTuCoQuanChuyenNganhTable = '<portlet:resourceURL id="getPhanHoiTuCoQuanChuyenNganhTable"></portlet:resourceURL>';
                var exportPDFDetail = '<portlet:resourceURL id="exportPDFDetail"></portlet:resourceURL>';
                var getThanhPhanHoSo = '<portlet:resourceURL id="getThanhPhanHoSo"></portlet:resourceURL>';
                var getFileThanhPhanVersionList = '<portlet:resourceURL id="getFileThanhPhanVersionList"></portlet:resourceURL>';
                var exportPDFDetailThanhPhan = '<portlet:resourceURL id="exportPDFDetailThanhPhan"></portlet:resourceURL>';
                var getThongTinKhaiBaoTable = '<portlet:resourceURL id="getThongTinKhaiBaoTable"></portlet:resourceURL>';
                var getDocTypes = '<portlet:resourceURL id="getDocTypes"></portlet:resourceURL>';
                var getFilterADVDataAPI = '<portlet:resourceURL id="getFilterADVDataAPI"></portlet:resourceURL>';
                var counterHoSoAll = '<portlet:resourceURL id="counterHoSoAll"></portlet:resourceURL>';
                var getGiayToXuatTrinhPhuongTien = '<portlet:resourceURL id="getGiayToXuatTrinhPhuongTien"></portlet:resourceURL>';
                var getGiayToXuatTrinh_39 = '<portlet:resourceURL id="getGiayToXuatTrinh_39"></portlet:resourceURL>';
                var getGiayToXuatTrinh_40 = '<portlet:resourceURL id="getGiayToXuatTrinh_40"></portlet:resourceURL>';
                var getGiayToXuatTrinh_48 = '<portlet:resourceURL id="getGiayToXuatTrinh_48"></portlet:resourceURL>';
                var getGiayToXuatTrinh_49 = '<portlet:resourceURL id="getGiayToXuatTrinh_49"></portlet:resourceURL>';
                var getGiayToXuatTrinh_50 = '<portlet:resourceURL id="getGiayToXuatTrinh_50"></portlet:resourceURL>';

                // check role show btn
                var checkThanhPhanActionButton = '<portlet:resourceURL id="checkThanhPhanActionButton"></portlet:resourceURL>';
                //action TT1
                var actionKeHoachURL = '<portlet:actionURL windowState="exclusive" name="actionKeHoachNhapCanh"></portlet:actionURL>';
                var actionThuTucURL = '<portlet:actionURL windowState="exclusive" name="actionThuTucNhapCanh"></portlet:actionURL>';
                var chuyenGiaoDienLenhDieuDongURL = '<portlet:actionURL windowState="exclusive" name="chuyenGiaoDienLenhDieuDong"></portlet:actionURL>';
                var kiemDuyetHoSoNhapCanhURL = '<portlet:actionURL windowState="exclusive" name="kiemDuyetHoSoNhapCanh"></portlet:actionURL>';
                //action TT2
                var actionKeHoachXuatCanhURL = '<portlet:actionURL windowState="exclusive" name="actionKeHoachXuatCanh"></portlet:actionURL>';
                var actionThuTucXuatCanhURL = '<portlet:actionURL windowState="exclusive" name="actionThuTucXuatCanh"></portlet:actionURL>';
                var kiemDuyetHoSoXuatCanhURL = '<portlet:actionURL windowState="exclusive" name="kiemDuyetHoSoXuatCanh"></portlet:actionURL>';
                // action all in one
                
                var hangHaiViewJX = new VueJX(
                    {
                        el: 'hangHaiViewJX',
                        pk: 1,
                        onScroll: 'onScroll',
                        data: {
                            ex11: true,
                            itemsGiayToXuatTrinhChoPhuongTien: [
                            ],
                            itemsGiayToXuatTrinh_39: [
                            ],
                            itemsGiayToXuatTrinh_40: [
                            ],
                            itemsGiayToXuatTrinh_48: [
                            ],
                            itemsGiayToXuatTrinh_49: [
                            ],
                            itemsGiayToXuatTrinh_50: [
                            ],
                            thoi_gian_dieu_dong: '',
                            ngay_cap: '',
                            ben_cang: '',
                            giay_phep_so: '',
                            cau_cang: '',
                            nguoi_ky: '',
                            muc_dic_neo_dau: '',
                            documentType: '0',
                            documentTypes: '',
                            
                            active_tab: null,
                            viewDefaultState: false,
                            loading_process_btn: false,
                            msgType: 0,
                            msg: '',
                            thong_bao_api: getPhanHoiTuCoQuanChuyenNganhTable,
                            ghi_chu_api: exportPDFDetail,
                            thanh_phan_ho_so_api: getThanhPhanHoSo,
                            file_list_api: getFileThanhPhanVersionList,
                            detail_tp_file_api: exportPDFDetailThanhPhan,
                            thong_tin_khai_bao_api: getThongTinKhaiBaoTable,
                            document_type_api: getDocTypes,
                            filter_adv_api: getFilterADVDataAPI,
                            loadingroleUserFilter: false,
                            loadingHoSoTable: false,
                            screen_state: 0,
                            detail: {
                                id: 0
                            },
                            detailThanhPhan: {},
                            roleUserFilterselectedCode: 0,
                            kehoachActions: [],
                            ykienReject: '',
                            ykien: '',
                            maritimeName: '',
                            btn_role_status: -1,
                            userSigns: [],
                            itemRoleSelected: null
                        },
                        schema: {
                            /** TODO menu filter */
                            'navigationFilter': {
                                'id': 'navigationFilter',
                                'name': 'navigationFilter',
                                'type': 'navigation',
                                'template': 'menu_template',
                                'template_content': 'hangHaiViewJX_form_template',
                                'events': {
                                    pickHoSo: function (item, index) {
                                        var vm = this;
                                        var filterleft = vm.$refs.filterleft;
                                        var filteradv = vm.$refs.filteradv;
                                        vm.documentType = item.code;
                                        filterleft.documentType = item;
                                        vm.roleUserFilterselected === -1;
                                        filteradv.status_label = "Kế hoạch";
                                        vm._initroleUserFilter(vm.documentType);
                                        vm._doFilterRoleData();
                                    },
                                    getDocumentTypes: function (config) {
                                        var vm = this;
                                        var filterleft = vm.$refs.filterleft;
                                        var filteradv = vm.$refs.filteradv;
                                        vm.documentType = filterleft.documentType.code;
                                        axios.get(counterHoSoAll).then(function (response) {
                                            var serializable = response.data;
                                            for (var key in serializable) {
                                                var idCounter = "tt_count_" + serializable[key]["code"];
                                                var idCounterEl = document.getElementById(idCounter);
                                                idCounterEl.innerHTML = serializable[key]["total"];
                                            }
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                        vm.documentTypes = filterleft.documentTypes;
                                        vm.loadingroleUserFilter = true;
                                        vm.roleUserFilterselected === -1;
                                        filteradv.status_label = "Kế hoạch";
                                        vm._doFilterRoleData();
                                    },
                                    thanhPhanSelected: function (config) {
                                        var vm = this;
                                        vm.detailThanhPhan = config.item;
                                        vm.detailThanhPhan['shipName'] = vm.detail['shipName'];
                                        vm.detailThanhPhan['documentName'] = vm.detail['documentName'];
                                        vm.detailThanhPhan['callSign'] = vm.detail['callSign'];
                                        vm.detailThanhPhan['messageType'] = config.item.messageType;
                                        vm.detailThanhPhan['documentYear'] = vm.detail['documentYear'];
                                        vm.detailThanhPhan['documentType'] = vm.detail['documentTypeCode'];
                                        vm.screen_state = 2;
                                        vm.viewDefaultState = false;
                                        window.history.pushState('', '', themeDisplay.getLayoutURL() + '/-/document/' + vm.detail['id'] + '/' + config.item.messageType);
                                        if (vm.detailThanhPhan['code'] === 'lenh_dieu_dong') {
                                            vm.btn_role_status = 2;
                                        } else if (vm.detailThanhPhan['messageType'] === 2014) {
                                            vm._getGiayToXuatTrinhPhuongTien();
                                            vm._getGiayToXuatTrinh_39();
                                            vm._getGiayToXuatTrinh_40();
                                            vm._getGiayToXuatTrinh_48();
                                            vm._getGiayToXuatTrinh_49();
                                            vm._getGiayToXuatTrinh_50();
                                        }
                                        setTimeout(() => {
                                            vm._changefileListVersion(vm.detailThanhPhan);
                                            vm._checkThanhPhanActionButton(config.item.messageType);
                                        }, 200);
                                    },
                                    _checkThanhPhanActionButton: function (messageType) {
                                        var vm = this;
                                        axios.get(checkThanhPhanActionButton, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'messageType': vm.detailThanhPhan.messageType,
                                                'roleType': vm.roleUserFilterselectedType,
                                                'REQUEST_CODE': vm.detailThanhPhan.requestCode,
                                                'documentType': vm.detailThanhPhan.documentType
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.btn_role_status = serializable.data;
                                            vm.userSigns = serializable.userSigns;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _changefileListVersion: function (item) {
                                        var vm = this;
                                        var pdfViewChild = vm.$refs.hanghaidetailpdf;
                                        pdfViewChild.file_lists = [];
                                        axios.get(getFileThanhPhanVersionList, {
                                            params: {
                                                'documentName': item.documentName,
                                                'documentYear': item.documentYear,
                                                'messageType': item.messageType,
                                                'documentType': item.documentType
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            if (serializable != null && serializable.length > 0) {
                                                pdfViewChild.nodata = false;
                                                pdfViewChild._showFile(serializable);
                                            } else {
                                                console.log("error get file thanh phan list");
                                                pdfViewChild.nodata = true;
                                                pdfViewChild.loadingPDF = false;
                                            }
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinhPhuongTien: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinhPhuongTien, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinhChoPhuongTien = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinh_39: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinh_39, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinh_39 = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinh_40: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinh_40, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinh_40 = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinh_48: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinh_48, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinh_48 = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinh_49: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinh_49, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinh_49 = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                    _getGiayToXuatTrinh_50: function () {
                                        var vm = this;
                                        axios.get(getGiayToXuatTrinh_50, {
                                            params: {
                                                'documentName': vm.detailThanhPhan.documentName,
                                                'documentYear': vm.detailThanhPhan.documentYear,
                                                'documentTypeCode': vm.detail.documentTypeCode,
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.itemsGiayToXuatTrinh_50 = serializable;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                    },
                                }
                            },
                            'roleUserFilter': {
                                'id': 'roleUserFilter',
                                'name': 'roleUserFilter',
                                'type': 'listgroup',
                                'show_counter': true,
                                'counter': 'counter',
                                'child_items': 'items',
                                'data_title': 'title',
                                'data_value': 'id',
                                'onLoad': '_initroleUserFilter',
                                'onClick': 'filterChange',
                                'events': {
                                    onScroll: function () {
                                    
                                    },
                                    _doFilterRoleData: function () {
                                        var vm = this;
                                        vm.khoDuLieuHoSoList = 1;
                                        var filterleft = vm.$refs.filterleft;
                                        var configParam = {};
                                        if (vm.roleUserFilterselected === -2 || vm.roleUserFilterselectedType === -2) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': filterleft.documentType.code,
                                                    'documentStatusCode': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
                                            vm._initHoSoThuTuc(configParam);
                                        } else if (vm.roleUserFilterselected === -1 || vm.roleUserFilterselectedType === -1) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': filterleft.documentType.code,
                                                    'requestState': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
                                            vm._initHoSoKeHoach(configParam);
                                        } else if (vm.roleUserFilterselected === 0 || vm.roleUserFilterselectedType === 0) {
                                            vm.loadingHoSoTable = false;
                                            axios.get(getHistoryTable, {
                                                params: {
                                                    'documentTypeCode': "document_history"
                                                }
                                            }).then(function (response) {
                                                var serializable = response.data;
                                                vm.khoDuLieuHoSoListItems = serializable.data;
                                                vm.khoDuLieuHoSoListTotal = Math.ceil(serializable.total / 15);
                                                vm.maritimeName = serializable.maritimeName;
                                                vm.loadingHoSoTable = true;
                                            }).catch(function (error) {
                                                console.log(error);
                                            });
                                        } else if (vm.roleUserFilterselectedType === -3 || vm.roleUserFilterselectedType === -4) {
                                            vm._khoDuLieuHoSoListTable();
                                        }
                                        
                                        if (vm.itemRoleSelected != null) {
                                            vm.filterChangeCount(vm.itemRoleSelected);
                                        }
                                    },
                                    fillCounterToMenu: function (rootIndex, childIndex, counter) {
                                        var filteredArray = this.roleUserFilterItems.filter(function(item){
                                            return item.index === rootIndex;
                                        });
                                        filteredArray[0].items[childIndex].counter = counter;
                                    },
                                    filterChangeCount: function (item) {
                                        var vm = this;
                                        console.log(item.items);

                                        console.log(vm.roleUserFilterselectedType);
                                        console.log("COUNTER");
                                        var filterleft = vm.$refs.filterleft;
                                        if (vm.roleUserFilterselectedType === -1) {
                                            var childIndex = 0;
                                            for (var key in item.items) {
                                                axios.get(counterHoSoKeHoachTable, {
                                                    params: {
                                                        'documentTypeCode': filterleft.documentType.code,
                                                        'requestState': item.items[key].code,
                                                        'rootIndex': 0,
                                                        'childIndex': childIndex
                                                    }
                                                }).then(function (response) {
                                                    var serializable = response.data;
                                                    vm.fillCounterToMenu(serializable.rootIndex, serializable.childIndex, serializable.total);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                });
                                                childIndex = childIndex + 1;
                                            }
                                        } else if (vm.roleUserFilterselectedType === -2) {
                                            var childIndex = 0;
                                            for (var key in item.items) {
                                                axios.get(counterHoSoThuTucTable, {
                                                    params: {
                                                        'documentTypeCode': filterleft.documentType.code,
                                                        'documentStatusCode': item.items[key].code,
                                                        'rootIndex': 1,
                                                        'childIndex': childIndex
                                                    }
                                                }).then(function (response) {
                                                    var serializable = response.data;
                                                    vm.fillCounterToMenu(serializable.rootIndex, serializable.childIndex, serializable.total);
                                                })
                                                .catch(function (error) {
                                                    console.log(error);
                                                });
                                                childIndex = childIndex + 1;
                                            }
                                        }
                                    },
                                    filterChange: function (item) {
                                        var vm = this;
                                        if (item.id === -1 || item.id === -2) {
                                            vm.itemRoleSelected = item;
                                        }
                                        vm.khoDuLieuHoSoListTotalCount = 0;
                                        var filterleft = vm.$refs.filterleft;
                                        var filteradv = vm.$refs.filteradv;
                                        vm.roleUserFilterselected = item.id;
                                        vm.roleUserFilterselectedType = item.type;
                                        vm.roleUserFilterselectedCode = item.code;
                                        vm.khoDuLieuHoSoListpage = 1;
                                        filteradv.status_label = item.title;
                                        if (vm.roleUserFilterselected === -1) {
                                            var childIndex = 0;
                                            for (var key in item.items) {
                                                axios.get(counterHoSoKeHoachTable, {
                                                    params: {
                                                        'documentTypeCode': filterleft.documentType.code,
                                                        'requestState': item.items[key].code,
                                                        'rootIndex': 0,
                                                        'childIndex': childIndex
                                                    }
                                                }).then(function (response) {
                                                    var serializable = response.data;
                                                    vm.fillCounterToMenu(serializable.rootIndex, serializable.childIndex, serializable.total);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                });
                                                childIndex = childIndex + 1;
                                            }
                                        } else if (vm.roleUserFilterselected === -2) {
                                            var childIndex = 0;
                                            for (var key in item.items) {
                                                axios.get(counterHoSoThuTucTable, {
                                                    params: {
                                                        'documentTypeCode': filterleft.documentType.code,
                                                        'documentStatusCode': item.items[key].code,
                                                        'rootIndex': 1,
                                                        'childIndex': childIndex
                                                    }
                                                }).then(function (response) {
                                                    var serializable = response.data;
                                                    vm.fillCounterToMenu(serializable.rootIndex, serializable.childIndex, serializable.total);
                                                })
                                                .catch(function (error) {
                                                    console.log(error);
                                                });
                                                childIndex = childIndex + 1;
                                            }
                                        }
                                        
                                        vm._doFilterRoleData();
                                    },
                                    _initroleUserFilter: function (data) {
                                        var vm = this;
                                        var configRole = {
                                            params: {
                                                'documentType': vm.documentType
                                            }
                                        }
                                        axios.get(
                                            getRoleFilterStatus, 
                                            configRole
                                        ).then(function (response) {
                                            var serializable = response.data;
                                            vm.loadingroleUserFilter = true;
                                            vm.roleUserFilterItems = serializable;
                                            if (serializable.length > 0) {
                                                vm.roleUserFilterselected = serializable[0]['id'];
                                                vm.roleUserFilterselectedType = serializable[0]['type'];
                                                vm.roleUserFilterselectedCode = serializable[0]['code'];
                                            }
                                            vm.roleUserFilterItemSelect = serializable[0];
                                            vm._doFilterRoleData();
                                        }).catch(function (error) {
                                            console.log(error);
                                            vm.roleUserFilterItems = [];
                                        });
                                    }
                                }
                            },
                            'khoDuLieuHoSoList': {
                                'id': 'khoDuLieuHoSoList',
                                'name': 'khoDuLieuHoSoList',
                                'type': 'table',
                                'cssClass': 'table-bordered danhSachHoSoTable__class table_border_right_none',
                                'item_key': 'id',
                                'headers': 'headers',
                                'no_data_text': 'Không có dữ liệu!',
                                'template': 'activity_expand_list_template',
                                'pagging': '_khoDuLieuHoSoListTable',
                                'onLoad': '_initHeaders',
                                'events': {
                                    filteraction: function () {
                                        this._khoDuLieuHoSoListTable();
                                    },
                                    _khoDuLieuHoSoListTable: function () {
                                        var vm = this;
                                        var configParam = {};
                                        var filterleft = vm.$refs.filterleft;
                                        if (vm.roleUserFilterselected === -2 || vm.roleUserFilterselectedType === -2) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': filterleft.documentType.code,
                                                    'documentStatusCode': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                    'start': vm.khoDuLieuHoSoListpage*15 - 15,
                                                    'end': vm.khoDuLieuHoSoListpage*15
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
                                            vm._initHoSoThuTuc(configParam);
                                        } else if (vm.roleUserFilterselected === -1 || vm.roleUserFilterselectedType === -1) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': filterleft.documentType.code,
                                                    'requestState': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                    'start': vm.khoDuLieuHoSoListpage*15 - 15,
                                                    'end': vm.khoDuLieuHoSoListpage*15
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
                                            vm._initHoSoKeHoach(configParam);
                                        } else if (vm.roleUserFilterselectedType === -3) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': 'document_sign',
                                                    'requestState': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                    'start': vm.khoDuLieuHoSoListpage*15 - 15,
                                                    'end': vm.khoDuLieuHoSoListpage*15
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
					                        vm._initHistoryTable(configParam);
                                        } else if (vm.roleUserFilterselectedType === -4) {
                                            configParam = {
                                                params: {
                                                    'documentTypeCode': 'document_approve',
                                                    'requestState': vm.roleUserFilterselectedCode,
                                                    'shipName': filterleft.shipName,
                                                    'maBanKhai': filterleft.documentName,
                                                    'callSign': filterleft.callSign,
                                                    'start': vm.khoDuLieuHoSoListpage*15 - 15,
                                                    'end': vm.khoDuLieuHoSoListpage*15
                                                }
                                            };
                                            vm.loadingHoSoTable = false;
					                        vm._initHistoryTable(configParam);
                                        }
                                    },
                                    _initHistoryTable: function(configParam) {
                                        var vm = this;
                                        axios.get(getHistoryTable, configParam).then(function (response) {
                                            var serializable = response.data;
                                            console.log(serializable);
                                            vm.khoDuLieuHoSoListItems = serializable.data;
                                            vm.khoDuLieuHoSoListTotal = Math.ceil(serializable.total / 15);
                                            vm.loadingHoSoTable = true;
                                        })
                                        .catch(function (error) {
                                            console.log(error);
                                            vm.khoDuLieuHoSoListItems = [];
                                            vm.loadingHoSoTable = true;
                                        });
                                    },
                                    _initHoSoKeHoach: function (configParam) {
                                        var vm = this;
                                        vm.khoDuLieuHoSoListTotalCount = 0;
                                        axios.get(
                                            getHoSoKeHoachTable, 
                                            configParam
                                        ).then(function (response) {
                                            var serializable = response.data;
                                            vm.khoDuLieuHoSoListItems = serializable.data;
                                            vm.khoDuLieuHoSoListTotalCount = serializable.total;
                                            vm.khoDuLieuHoSoListTotal = Math.ceil(serializable.total / 15);
                                            vm.maritimeName = serializable.maritimeName;
                                            vm.loadingHoSoTable = true;
                                        }).catch(function (error) {
                                            console.log(error);
                                            vm.khoDuLieuHoSoListItems = [];
                                            vm.loadingHoSoTable = true;
                                        });
                                    },
                                    _initHoSoThuTuc: function (configParam) {
                                        var vm = this;
                                        vm.khoDuLieuHoSoListTotalCount = 0;
                                        axios.get(
                                            getHoSoThuTucTable, 
                                            configParam
                                        ).then(function (response) {
                                            var serializable = response.data;
                                            vm.khoDuLieuHoSoListItems = serializable.data;
                                            vm.khoDuLieuHoSoListTotalCount = serializable.total;
                                            vm.khoDuLieuHoSoListTotal = Math.ceil(serializable.total / 15);
                                            vm.loadingHoSoTable = true;
                                        }).catch(function (error) {
                                            console.log(error);
                                            vm.khoDuLieuHoSoListItems = [];
                                            vm.loadingHoSoTable = true;
                                        });
                                    },
                                    _initHeaders: function () {
                                        this.khoDuLieuHoSoListheaders = JSON.parse(data_header);
                                    },
                                    toDetailHoSo: function (state, item) {
                                        var vm = this;
                                        vm.screen_state = state;
                                        vm.detail = item;
                                        vm.detail['maritimeName'] = vm.maritimeName;
                                        window.history.pushState('', '', themeDisplay.getLayoutURL() + '/-/document/' + item.id);	
                                    },
                                    callDetailHoSo: function () {
                                        var vm = this;
                                        var hanghaidetail = vm.$refs.hanghaidetail;
                                        axios.get(getDetailHoSo, {
                                            params: {
                                                'documentName':  vm.detail.documentName,
                                                'documentYear':  vm.detail.documentYear
                                            }
                                        }).then(function (response) {
                                            var serializable = response.data;
                                            vm.detail = serializable;
                                            vm.detail['maritimeName'] = vm.maritimeName;
                                        }).catch(function (error) {
                                            console.log(error);
                                        });
                                        if (hanghaidetail != null) {
                                            hanghaidetail.reloadKhaiBao();
                                        }
                                        
                                    },
                                    backState: function (state) {
                                        var vm = this;
                                        vm.screen_state = state;
                                        if (state === 0) {
                                            window.history.pushState('', '', themeDisplay.getLayoutURL());
                                        } else if (state === 1) {
                                            window.history.pushState('', '', themeDisplay.getLayoutURL() + '/-/document/' + vm.detail['id']);	
                                        }
                                    },
                                    callActionKeHoach: function (item, actionType, messageType, isConfirm, returnState) {
                                        var vm = this;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                            
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', msType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);
                                        if (messageType === 70 && vm.roleUserFilterselectedType !== -4
                                            && vm.roleUserFilterselectedType !== -3) {
                                            params.append('representative', vm.detail.giamDoc.representative);
                                        }
                                        var msType = 1985;
                                        if (messageType > -1) {
                                            msType = messageType;
                                        }
                                        if (messageType === 70) {
                                            configParam.params['LAN_CAP_LENH_DIEU_DONG'] = '1_LAN';
                                        }
                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                vm.loading_process_btn = true;
                                                axios.post(
                                                    actionKeHoachURL, 
                                                    params,
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                    
                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            
                                            vm.loading_process_btn = true;
                                            axios.post(
                                                actionKeHoachURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    callActionKeHoachLenhDieuDong: function (item, actionType, messageType, typeBtn, isConfirm, returnState) {
                                        var vm = this;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);
                                        if (typeBtn === 2) {
                                            params.append('LAN_CAP_LENH_DIEU_DONG', '1_LAN');
                                        } else if (typeBtn === 3) {
                                            params.append('DUYET_VA_GUI_LENH_DIEU_DONG', 'duyet_va_gui_ldd');
                                            params.append('1_LAN', '1_LAN');
                                        } else if (typeBtn === 4) {
                                            params.append('DUYET_VA_GUI_LENH_DIEU_DONG', 'duyet_va_gui_ldd');
                                            params.append('N_LAN', 'N_LAN');
                                        }
                                        
                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                vm.loading_process_btn = true;
                                                axios.get(
                                                    actionKeHoachURL, 
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";

                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            vm.loading_process_btn = true;
                                            axios.get(
                                                actionKeHoachURL, 
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    callActionThuTuc: function (item, actionType, messageType, isConfirm, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };

                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);

                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                axios.post(
                                                    actionThuTucURL, 
                                                    params,
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                    
                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            axios.post(
                                                actionThuTucURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    capLaiLenhDieuDong: function (item, messageType, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);

                                        var x = confirm("Bạn có muốn thực hiện hành động này?");
                                        if (x) {
                                            axios.post(
                                                chuyenGiaoDienLenhDieuDongURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                vm.btn_role_status = 2;
                                                vm.active_tab = 4;
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                        else {
                                            return false;
                                        }
                                    },
                                    kiemDuyetHoSoNhapCanh: function(item, messageType, actionType, btnActionType, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('BTN_ACTION_TYPE', btnActionType);
                                        params.append('itemsGiayToXuatTrinhChoPhuongTien', JSON.stringify(vm.itemsGiayToXuatTrinhChoPhuongTien));
                                        params.append('itemsGiayToXuatTrinh_39', JSON.stringify(vm.itemsGiayToXuatTrinh_39));
                                        params.append('itemsGiayToXuatTrinh_40', JSON.stringify(vm.itemsGiayToXuatTrinh_40));
                                        
                                        var x = confirm("Bạn có muốn thực hiện hành động này?");
                                        if (x) {
                                            axios.post(
                                                kiemDuyetHoSoNhapCanhURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                        else {
                                            return false;
                                        }
                                    },
                                    callActionKeHoachXuatCanh: function (item, actionType, messageType, isConfirm, returnState) {
                                        var vm = this;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);

                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                axios.post(
                                                    actionKeHoachXuatCanhURL, 
                                                    params,
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                    
                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            vm.loading_process_btn = true;
                                            axios.post(
                                                actionKeHoachXuatCanhURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    callActionThuTucXuatCanh: function (item, actionType, messageType, isConfirm, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);
                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                axios.post(
                                                    actionThuTucXuatCanhURL,
                                                    params,
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                    
                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            axios.post(
                                                actionThuTucXuatCanhURL,
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    callActionThuTucXuatCanhGiayTo: function (item, actionType, messageType, isConfirm, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('REQUEST_CODE', vm.detailThanhPhan.requestCode);
                                        if (isConfirm) {
                                            var x = confirm("Bạn có muốn thực hiện hành động này?");
                                            if (x) {
                                                axios.post(
                                                    actionThuTucXuatCanhURL,
                                                    params,
                                                    configParam
                                                ).then(function (response) {
                                                    vm.loading_process_btn = false;
                                                    var serializable = response.data;
                                                    vm.msgType = 1;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                    
                                                    vm.screen_state = returnState;
                                                    if (returnState === 0) {
                                                        vm._doFilterRoleData();
                                                    } else {
                                                        if (messageType > -1) {
                                                            vm._checkThanhPhanActionButton(messageType);
                                                        }
                                                        vm.callDetailHoSo();
                                                        hanghaidetailpart.reloadThanhPhan();
                                                    }
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                }).catch(function (error) {
                                                    console.log(error);
                                                    vm.loading_process_btn = false;
                                                    vm.msgType = 2;
                                                    vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                    setTimeout(function(e){
                                                        vm.msgType = 0;
                                                    }, 2000);
                                                });
                                            }
                                            else {
                                                return false;
                                            }
                                        } else {
                                            axios.post(
                                                actionThuTucXuatCanhURL,
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                var serializable = response.data;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                    },
                                    kiemDuyetHoSoXuatCanh: function(item, messageType, actionType, btnActionType, returnState) {
                                        var vm = this;
                                        vm.loading_process_btn = true;
                                        var hanghaidetailpart = vm.$refs.hanghaidetailpart;
                                        var configParam = {
                                        };
                                        var params = new FormData();
                                        params.append('documentName', item.documentName);
                                        params.append('documentYear', item.documentYear);
                                        params.append('messageType', messageType);
                                        params.append('ACTION_TYPE', actionType);
                                        params.append('BTN_ACTION_TYPE', btnActionType);
                                        params.append('itemsGiayToXuatTrinhChoPhuongTien', JSON.stringify(vm.itemsGiayToXuatTrinhChoPhuongTien));
                                        
                                        var x = confirm("Bạn có muốn thực hiện hành động này?");
                                        if (x) {
                                            axios.post(
                                                kiemDuyetHoSoXuatCanhURL, 
                                                params,
                                                configParam
                                            ).then(function (response) {
                                                vm.loading_process_btn = false;
                                                vm.msgType = 1;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thành công!";
                                                vm.screen_state = returnState;
                                                if (returnState === 0) {
                                                    vm._doFilterRoleData();
                                                } else {
                                                    if (messageType > -1) {
                                                        vm._checkThanhPhanActionButton(messageType);
                                                    }
                                                    vm.callDetailHoSo();
                                                    hanghaidetailpart.reloadThanhPhan();
                                                }
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            }).catch(function (error) {
                                                console.log(error);
                                                vm.loading_process_btn = false;
                                                vm.msgType = 2;
                                                vm.msg = "Yêu cầu của bạn được thực hiện thất bại!";
                                                setTimeout(function(e){
                                                    vm.msgType = 0;
                                                }, 2000);
                                            });
                                        }
                                        else {
                                            return false;
                                        }
                                    },
                                }
                            }
                        }
                    });

                hangHaiViewJX._builder('hangHaiViewJX');

            });
</script>

<style>
    .lenh_dieu_dong_form .input-group {
        padding: 0;
        padding-left: 0;
    }

    .lenh_dieu_dong_form .subheader {
        height: auto;
        min-height: 32px
    }

    .lenh_dieu_dong_form .lodo-pl0 {
        padding-left: 0 !important;
    }
    
    body .giay_to_xuat_trinh table.table th:nth-child(1) {
        width: 32px;
        padding: 0;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(2) {
        width: 300px;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(3) {
        width: 120px;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(4) {
        width: 120px;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(5) {
        width: 120px;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(7) {
        width: 20px;
    }
    body .giay_to_xuat_trinh table.table th:nth-child(8) {
        width: 20px;
    }
    body .table-bordered tbody > tr > td{
        border-right: 1px solid lightgray;
    }

</style>