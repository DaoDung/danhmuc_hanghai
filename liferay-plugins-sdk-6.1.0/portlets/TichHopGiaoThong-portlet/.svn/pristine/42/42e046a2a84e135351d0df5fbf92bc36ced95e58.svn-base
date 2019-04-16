function formatSizeUnits(bytes, decimals) {

	if      (bytes>=1000000000) {bytes=(bytes/1000000000).toFixed(decimals)+' GB';}
    else if (bytes>=1000000)    {bytes=(bytes/1000000).toFixed(decimals)+' MB';}
    else if (bytes>=1000)       {bytes=(bytes/1000).toFixed(decimals)+' KB';}
    else if (bytes>1)           {bytes=bytes+' bytes';}
    else if (bytes==1)          {bytes=bytes+' byte';}
    else                        {bytes='0 byte';}
    return bytes;
}

function roundNumber(number, decimals) { // Arguments: number to round,
	// number of decimal places
	var newnumber = new Number(number + '').toFixed(parseInt(decimals));
	return parseFloat(newnumber); // Output the result to the form field
	// (change for your purposes)
}

function reDrawSelectBox(selectName, changeName, changeName2, hiddenValue) {

	var hidSelectedPhuongXa = document.getElementById("hiddenPhuongXaId");
	if (!hiddenValue && hidSelectedPhuongXa)
		hiddenValue = hidSelectedPhuongXa.value;

	var id = document.getElementById(selectName).options[document
			.getElementById(selectName).selectedIndex].value;
	// if quan huyen is not selected then return
	if (id == "")
		return;

	var obj = document.getElementById(changeName);
	var obj2 = document.getElementById(changeName2);

	$.ajax({
		type : 'POST',
		url : url,
		data : {
			id : id
		},
		success : function(data) {

			// preferred
			var data2 = JSON.parse(data);
			// Xoa cac old item in select

			while (obj && obj.options.length > 1) {
				obj.remove(1);
			}

			while (obj2 && obj2.options.length > 1) {
				obj2.remove(1);
			}

			for ( var i = 0; i < data2.id.length; i++) {
				obj.add(new Option(data2.name[i], data2.id[i]), null);

				if (hiddenValue && (data2.id[i] == hiddenValue)) {
					obj.selectedIndex = i + 1;
				}
			}
		}
	});
}

// Back browser

// Ve lai danh sach don vi hanh chinh
function reDrawSelectPx(selectName, changeName, name) {

	var id = document.getElementById(selectName).options[document
			.getElementById(selectName).selectedIndex].value;
	var hidSelectedPhuongXa = document.getElementById(name);

	// if quan huyen is not selected then return
	if (id == "")
		return;

	var obj = document.getElementById(changeName);

	$.ajax({
		type : 'POST',
		url : url,
		data : {
			id : id
		},
		success : function(data) {

			// preferred
			var data2 = JSON.parse(data);
			// Xoa cac old item in select

			while (obj.options.length > 1) {
				obj.remove(1);
			}

			for ( var i = 0; i < data2.id.length; i++) {
				obj.add(new Option(data2.name[i], data2.id[i]), null);

				if (hidSelectedPhuongXa
						&& (data2.id[i] == hidSelectedPhuongXa.value)) {
					obj.selectedIndex = i + 1;
				}
			}
		}
	});
}

// Chuyen trang
function sendRedirect(url) {
	window.location = url;
}

// Calculate date diff then put value to one element
function calculateDateDiff(objId, dateFrom, dateTo) {

	var date1 = new Date(dateFrom.replace(/(\d{2})\/(\d{2})\/(\d{4})/,
			"$3/$2/$1"));
	var date2 = new Date(dateTo
			.replace(/(\d{2})\/(\d{2})\/(\d{4})/, "$3/$2/$1"));

	// alert(date1 + " " + date2);
	// var date1 = new Date(dateFrom);
	// var date2 = new Date(dateTo);

	var dateDiff = (date2.getTime() - date1.getTime()) / 86400000;

	if (!isNaN(dateDiff) && dateDiff > 0)
		document.getElementById(objId).value = dateDiff;
	else
		document.getElementById(objId).value = "N/a";

}

function viewFileUpload(url) {
	var w = 1000;
	var h = 500;
	var left = (screen.width / 2) - (w / 2);
	var top = (screen.height / 2) - (h / 2);
	popupWindow = window
			.open(
					url,
					'',
					'toolbar=no,  directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width='
							+ w
							+ ', height='
							+ h
							+ ', top='
							+ top
							+ ', left='
							+ left);
	popupWindow.focus();
}

function showDocumentPopup(viewDocumentURL, popupTitle) {

	AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {

		var dialog = new A.Dialog({
			title : popupTitle,
			draggable : true,
			modal : true,
			centered : true,
			width : $(window).width() * 0.8,
			height : $(window).height() * 0.7,

		}).plug(A.Plugin.IO, {
			uri : viewDocumentURL
		}).render();
	});
}


function processReturnURL(returnURL) {

	if (returnURL && (returnURL != 'null'))
		sendRedirect(returnURL);
	else
		history.go(-1);
}

function toggleSubmitButton() {

	if (document.getElementById("sm").disabled) {
		document.getElementById("sm").disabled = false;
	} else {
		document.getElementById("sm").disabled = true;
	}
}


function setSelectedName(nameSelect, nameSet) {
	document.getElementById(nameSet).value = document.getElementById(nameSelect).options[document.getElementById(nameSelect).selectedIndex].text;
}

function setNameDVHC(nameSelect, nameSet) {
	document.getElementById(nameSet).value = document.getElementById(nameSelect).options[document.getElementById(nameSelect).selectedIndex].text;
}

function submitExportDataForm(idForm, idExtFile, valueExtFile) {
	document.getElementById(idExtFile).value = valueExtFile;
	document.getElementById(idForm).submit();
}

function printData() {
    document.getElementById('exportFilePDF').submit();
}


//kieu kien input text = area
function eventArea(key) {
	if ($("#input_"+key).val().length > 0) {
		$("#check_"+key).prop('checked', true);
	} else {
		$("#check_"+key).prop('checked', false);
	}
}

//validatar Kieu so
function validatorInt(key) {
	var data = $("#input_"+key).val();
	if (+data === parseInt(data)) {
		
	} else {
		$("#input_"+key).val("");
	}
}

//dieu kien cau 4
function changeHinhThuc(key) {
	if ($("#check_"+key).is(':checked')) {
		for (var i = 1; i <= 8; i++) {
			document.getElementById("radio_" + (key + i)).checked = false;
			document.getElementById("radio_" + (key + i)).disabled = true;
			document.getElementById("check_" + (key + i)).value = "";
		}
	} else {
		for (var i = 1; i <= 8; i++) {
			document.getElementById("radio_" + (key + i)).disabled = false;
		}
	}
}

//kiem tra dieu kien cau 9, cap so ho ngheo, co 5 check box
function changeRadio9(key, key1) {
	if (key === key1) {
		if (document.getElementById("radio_" + key).checked) {
			
			var elements = document.getElementsByName("radio_" + key1);

			for (var i = 0; i < elements.length; i++) {
				var a = elements[i].id.replace("radio_", "check_");
				
				if (elements[i].id == ("radio_" + key)) {
					document.getElementById(a).value = "on";
				} else {
					document.getElementById(a).value = "";
				}
			}
			for (var i = 1; i <= 5; i++) {
				document.getElementById("check_" + (key + i)).disabled = false;
				document.getElementById("check_" + (key + i)).checked = false;
			}
		}

	} else {
		if (document.getElementById("radio_" + key).checked) {
			
			var elements = document.getElementsByName("radio_" + key1);

			for (var i = 0; i < elements.length; i++) {
				var a = elements[i].id.replace("radio_", "check_");
				
				if (elements[i].id == ("radio_" + key)) {
					document.getElementById(a).value = "on";
				} else {
					document.getElementById(a).value = "";
				}
			}
			for (var i = 1; i <= 5; i++) {
				document.getElementById("check_" + (key - i)).disabled = true;
				document.getElementById("check_" + (key - i)).checked = false;
			}
		}
	}
}

//Dieu kien multi radio
function changeRadio(key, key1) {
	if (document.getElementById("radio_" + key).checked) {
		
		var elements = document.getElementsByName("radio_" + key1);

		for (var i = 0; i < elements.length; i++) {
			var a = elements[i].id.replace("radio_", "check_");
			
			if (elements[i].id == ("radio_" + key)) {
				document.getElementById(a).value = "on";
			} else {
				document.getElementById(a).value = "";
			}
		}
	}
}

//Dieu kien checkbok doi voi input text
function changeRequireNoiDung(key) {
	if (document.getElementById("check_"+key).checked) {
		document.getElementById("input_"+key).required = true;
	} else {
		document.getElementById("input_"+key).value = "";
		document.getElementById("input_"+key).required = false;
	}
}

//Dieu dien 2 radio
function requireRadio(key1, key2) {
	
	if (document.getElementById("radio_" + key1).checked) {
		document.getElementById("check_" + key1).value = "on";
	} else {
		document.getElementById("check_" + key1).value = "";
	}
	if (document.getElementById("radio_" + key2).checked) {
		document.getElementById("check_" + key2).value = "on";
	} else {
		document.getElementById("check_" + key2).value = "";
	}
}

//xu ly dieu kien select boox chon TTHC
function eventSelect(key) {
	var value = $('#select_' + key + ' option:selected').val();
	for (var i = 1; i <= 12; i++) {
		$('#select_' + (key + i)).val(value);
	}

	if (value != '0' || value != '') {
		document.getElementById("check_" + key).value = "on";
	}
}