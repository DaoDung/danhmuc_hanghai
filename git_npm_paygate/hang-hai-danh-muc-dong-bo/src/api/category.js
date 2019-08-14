import axios from 'axios'
window.getUrl = {
  'getDmSyncCategories': 'asdasdasdas'
}
window._categoryTable = [
  {
    "categoryId": 'DM_PORT',
    "categoryDescription": 'Bảng danh mục Khu vực hàng hải',
    "url" : 'UrlKhuVucHangHai'
  },
  {
    "categoryId": 'DM_VMA_TUGBOAT_COMPANY',
    "categoryDescription": 'DM_VMA_TUGBOAT_COMPANY',
    "url" : 'UrlKhuVucHangHai'
  },
  {
    "categoryId": 'DM_PORT_REGION',
    "categoryDescription": 'Bảng danh mục Khu vực hàng hải',
    "url" : 'UrlKhuVucHangHai'
  },
  {
    "categoryId": 'DM_PORT_WHARF',
    "categoryDescription": 'Bảng danh mục Cầu cảng',
    "url" : 'UrlDanhMucCauCang'
  },
  {
    "categoryId": 'DM_PORT_HARBOUR',
    "categoryDescription": 'Bảng danh mục Bến cảng',
    "url" : 'UrlDanhMucBenCang'
  },
  {
    "categoryId": 'DM_MARITIME',
    "categoryDescription": 'Bảng danh mục Cảng vụ hàng hải',
    "url" : 'UrlDanhMucCacVuHangHai'
  },
  {
    "categoryId": 'DM_DATAITEM_GROUP107',
    "categoryDescription": 'Bảng danh mục Cảng biển hàng hải',
    "url" : 'UrlDanhMucBenCangHangHai'
  },
  {
    "categoryId": 'DM_TUYEN_LUONG',
    "categoryDescription": 'Bảng danh mục tuyến luồng',
    "url" : 'UrlDanhMucTuyenLuong'
  },
  {
    "categoryId": 'DM_STATE',
    "categoryDescription": 'Bảng danh mục Cảng biển (Hải quan quản lý)',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_PORT',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_ARRIVAL_PURPOSE',
    "categoryDescription": 'Bảng danh mục Cảng biển (Hải quan quản lý)',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_SHIP_AGENCY',
    "categoryDescription": 'Bảng danh mục Cảng biển (Hải quan quản lý)',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_SHIP_TYPE',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_PASSPORT_TYPE',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_SECURITY_LEVEL',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_GOODS_TYPE',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_GOODS',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_PACKAGE',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_RANK_RATING',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_CARGO_ON_BOARD',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_REPRESENTATIVE',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_UNIT_GENERAL',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_DATAITEM_GROUP124',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_PILOT_COMPANY',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_TUGBOAT',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_PILOT_COMPANY',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_PILOT',
    "categoryDescription": 'Bảng danh mục danh sách công ty hoa ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_PILOT_CATEGORY',
    "categoryDescription": 'Bảng danh mục danh mục Hạng hoa  ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_SHIP_OWNER',
    "categoryDescription": 'Bảng danh mục danh sách chủ tàu ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_SECURITY_OFFICE',
    "categoryDescription": 'Bảng danh mục danh sách chủ tàu ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_SHIP_TYPE',
    "categoryDescription": 'DM_VMA_SHIP_TYPE ',
    "url" : 'UrlDanhMucCangBien'
  },
  {
    "categoryId": 'DM_VMA_SHIPYARD',
    "categoryDescription": 'DM_VMA_SHIPYARD',
    "url" : 'UrlKhuVucHangHai'
  },
  {
    "categoryId": 'VMA_TRANSACTION_DEPARTMENT',
    "categoryDescription": 'VMA_TRANSACTION_DEPARTMENT',
    "url" : 'UrlKhuVucHangHai'
  }
]
window.UrlKhuVucHangHai = [
  {
    "id": 1,
    "portRegionCode":75,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa',
    "role": true,
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa',
    "role": true
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa',
    "role": true
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":76,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":77,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 1,
    "portRegionCode":78,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 79,
    "portRegionCode":79,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  },
  {
    "id": 80,
    "portRegionCode":80,
    "portRegionNameVN": 'khu vực hàng hải VŨNG TÀU Demo ngày 22/08/2018',
    "portCodeCB": 'CẢNG BIỂN Hàng Hải VŨNG TÀU Demo ngày 22/08/2018',
    "isDelete": 'Đã đánh dấu xóa'
  }
]
window.UrlDanhMucBenCang = [
  {
    "portHarbourCode": 'BC460',
    "portHarbourNameVN": 'BẾN CẢNG B1 (TẠO MỚI 01)',
    "portCode": 'Vũng Tàu',
    "portRegionName": 'KHU VỰC HH VŨNG TÀU',
    'isDelete': 'Đã đánh dấu xóa'
  },
  {
    "portHarbourCode": 'BC150',
    "portHarbourNameVN": 'Bến cảng Baria Serece',
    "portCode": 'Vũng Tàu',
    "portRegionName": 'KHU VỰC HH VŨNG TÀU',
    'isDelete': 'Đang sử dụng'
  },
  {
    "portHarbourCode": 'BC460',
    "portHarbourNameVN": 'BẾN CẢNG B1 (TẠO MỚI 01)',
    "portCode": 'Vũng Tàu',
    "portRegionName": 'KHU VỰC HH VŨNG TÀU',
    'isDelete': 'Đã đánh dấu xóa'
  },
  {
    "portHarbourCode": 'BC460',
    "portHarbourNameVN": 'BẾN CẢNG B1 (TẠO MỚI 01)',
    "portCode": 'Vũng Tàu',
    "portRegionName": 'KHU VỰC HH VŨNG TÀU',
    'isDelete': 'Đã đánh dấu xóa'
  }

  
]
window.UrlDanhMucQuocGia = [
  {
    'code': 'asd',
    'name': 'adsa',
    'isDelete': 'hello'
  },
  {
    'code': 'asd',
    'name': 'adsa',
    'isDelete': 'hello'
  },
  {
    'code': 'asd',
    'name': 'adsa',
    'isDelete': 'hello'
  },
  {
    'code': 'asd',
    'name': 'adsa',
    'isDelete': 'hello'
  },
  {
    'code': 'asd',
    'name': 'adsa',
    'isDelete': 'hello'
  }
]
const hasClient = {
  getUrl (query, cb, errorcb) {
    setTimeout(() => cb(window.getUrl), 100)
  },
  getCategoryTableItems (query, cb, errorcb) {
    const result = {
      total: window._categoryTable.length,
      data: window._categoryTable
    }
    setTimeout(() => cb(result), 100)
  },
  getCategoryListItems (query, cb, errorcb) {
    let data = []
    if (query.params === 'DM_PORT_REGION') {
      data = window.UrlKhuVucHangHai
    }
    if (query.params === 'DM_PORT_HARBOUR') {
      data = window.UrlDanhMucBenCang
    }
    if (query.params === 'DM_STATE') {
      data = window.UrlDanhMucQuocGia
    }
    const result = {
      total: data.length,
      data: data
    }
    setTimeout(() => cb(result), 100)    
  },
  addCategoryListItems () {

  },
  editCategoryListItems () {

  },
  deleteCategoryListItems () {

  }
}

var renderURLInit = "?p_p_id=danhmucriengaction_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit"
var orginURL = window.location.href
var endPoit = orginURL.substr(0, orginURL.lastIndexOf('#')) + renderURLInit


const hasServer = {
  getUrl (query, cb, errorCb) {
    axios.get(endPoit)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorCb(error)
     })
  },
  getUrl2 (query, cb, errorCb) {
    axios.get('http://10.21.201.75:8081/group/lanh-dao?p_p_id=vma_WAR_TichHopGiaoThongportlet&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_cacheability=cacheLevelPage&p_p_col_id=column-1&p_p_col_count=1&p_p_resource_id=getURLInit')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorCb(error)
     })
  },
  getCategoryTableItems (query, cb, errorcb) {
    axios.get(query.url + '&start=-1&end=-1')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  getCategoryListItems (query, cb, errorcb) {
    axios.get(query.url + '&categoryId=' + query.params + '&start=0&end=10')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  addCategoryListItems (query, cb, errorcb) {
    let Url = query.url + '&LAN_CAP_MOI_DU_LIEU=LAN_CAP_MOI_DU_LIEU'
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
    }) 
  },
  editCategoryListItems (query, cb, errorcb) {
    let Url = query.url + '&LAN_SUA_DU_LIEU=LAN_SUA_DU_LIEU'
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })    
  },
  deleteCategoryListItems (query, cb, errorcb) {
    let Url = query.url + '&LAN_XOA_DU_LIEU=LAN_XOA_DU_LIEU'
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     }) 
  },
  getDetailCategory (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     }) 
  },
  getMaritime (query, cb, errorcb) {
    axios.get(query.url)
    .then((res) => {
     const result = res.data
     cb(result) 
    })
    .catch(function (error) {
     errorcb(error)
    }) 
  },
  getMaritimeCurrent (query, cb, errorcb) {
    axios.get(query.url)
    .then((res) => {
     const result = res.data
     cb(result) 
    })
    .catch(function (error) {
     errorcb(error)
    }) 
  },
  // Tim kiem
  searchCategoryListItems (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  getDanhMuc (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '') {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url + '&start=-1&end=-1')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  getUsers (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '' && typeof query.params[key] != "undefined") {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  getVmaTransactionTypes (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '') {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url + '&start=-1&end=-1')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
  updateUserPort (query, cb, errorcb) {
    let Url = query.url + '&departmentCode=' + query.params.departmentCode + '&userId=' + query.params.userId + '&status=' + query.params.status
    axios.get(Url)
      .then((res) => {
      const result = res.data
      cb(result) 
      })
      .catch(function (error) {
      errorcb(error)
      })
  },
  reportExel (query, cb, errorcb) {
    axios.get(query.url + '&reportId='+ query.params.reportId)
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })   
  },
  getDanhMuc2 (query, cb, errorcb) {
    let Url = query.url
    for (const key in query.params) {
      if (query.params[key] !== '') {
        Url += '&' + key + '=' + query.params[key]
      }
    }
    axios.get(Url + '&start=-1&end=-1')
     .then((res) => {
      const result = res.data
      cb(result) 
     })
     .catch(function (error) {
      errorcb(error)
     })
  },
}  
//export default hasClient hasServer
export default hasServer