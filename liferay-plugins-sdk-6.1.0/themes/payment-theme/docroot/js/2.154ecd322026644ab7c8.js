webpackJsonp([2],{260:function(t,e,n){var a=n(183)(n(263),n(276),null,null);t.exports=a.exports},263:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={props:["id","documentname","documentyear","maritimecode"],data:function(){return{payment:{}}},created:function(){var t=this;t.$nextTick(function(){var e={id:t.id,documentname:t.documentname,documentyear:t.documentyear,maritimecode:t.maritimecode};t.$store.dispatch("loadInitResource",e).then(function(e){t.payment=e})})},methods:{keypayURL:function(){console.log(this.documentname),console.log(this.documentyear),console.log(this.maritimecode)}}}},276:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("v-layout",{attrs:{row:""}},[n("v-flex",{attrs:{xs12:"",sm6:"","offset-sm3":"","mt-5":""}},[n("v-card",[n("nav",{staticClass:"toolbar theme--dark blue darken-2"},[n("div",{staticClass:"toolbar__content",staticStyle:{height:"64px"}},[n("div",[n("span",[t._v("CỔNG THANH TOÁN DVC TRỰC TUYẾN TÀU THUYỀN VÀO, RỜI CẢNG BIỂN ")]),t._v(" "),n("br"),t._v(" "),n("strong",{staticStyle:{"text-transform":"uppercase"}},[t._v("Cục Hàng Hải Việt Nam - Bộ Giao Thông Vận Tải")])]),t._v(" "),n("div",{staticClass:"spacer"})])]),t._v(" "),n("div",{staticClass:"list list--two-line mt-3"},[t.payment.message?n("v-layout",{attrs:{wrap:""}},[n("v-flex",{staticClass:"text-center",attrs:{xs12:"",sm6:""}},[n("v-btn",{nativeOn:{click:function(e){return t.keypayURL(e)}}},[n("v-icon",{attrs:{size:"16"}},[t._v("credit_card")]),t._v("  \n                Thanh toán trực tuyến\n              ")],1)],1),t._v(" "),n("v-flex",{staticClass:"text-center",attrs:{xs12:"",sm6:""}},[n("v-btn",{attrs:{to:"/payment/"+t.id+"/"+t.documentname+"/"+t.documentyear+"/"+t.maritimecode+"/upload"}},[n("v-icon",{attrs:{size:"16"}},[t._v("add_photo_alternate")]),t._v("  \n                Báo nộp chuyển khoản\n              ")],1)],1)],1):n("v-layout",{attrs:{wrap:""}},[n("v-flex",{staticClass:"text-center",attrs:{xs12:""}},[t._v("\n              Phiếu thanh toán không hợp lệ\n            ")])],1)],1)])],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=2.154ecd322026644ab7c8.js.map