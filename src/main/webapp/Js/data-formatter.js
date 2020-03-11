function dateFormatter(value, row, index) {
	if (value != 0) {
		var time = new Date(value);
		var y = time.getFullYear();
		var m = time.getMonth() + 1;
		var d = time.getDate();
		var h = time.getHours();
		var mm = time.getMinutes();
		var s = time.getSeconds();
		var a = y + '-' + (m < 10 ? '0' + m : m) + '-' + (d < 10 ? '0' + d : d)
				+ ' ' + (h < 10 ? '0' + h : h) + ':'
				+ (mm < 10 ? '0' + mm : mm) + ':' + (s < 10 ? '0' + s : s);
		return a;
	} else {
		return "";
	}
}

// 0否1是
function ifFormatter(value, row, index) {
	if (value == null)
		return '暂无角色信息';
	return value == 0 ? '否' : '是';
}


function setBodyHeight(){
	var o = document.getElementById("abc");
	window.parent.set_iFrame(o.clientHeight || o.offsetHeight);
}

function typeFormatter(value, row, index) {
	var typeName = '';
	switch (value) {
		case 1: typeName = '宏观政策';break;
		case 2: typeName = '财经热点';break;
		case 3: typeName = '市场分析';break;
		case 4: typeName = '矿方动态';break;
		case 5: typeName = '电力行业';break;
		case 6: typeName = '相关行业';break;
		case 7: typeName = '船运信息';break;
		case 8: typeName = '铁路信息';break;
		case 9: typeName = '公路信息';break;
		default: typeName = '暂无类别';break;
	}
	return typeName;
}