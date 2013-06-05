/**
 * @autor jiuyeuhe
 * @description 主要用来些本网站的JavaScript 
 */

var broads={};

function getBroad(){
	$.ajax({
		type:"POST",
		url:"/getTopBroad",
		dataType:"json",
		success: function(data){
		alert(data);
		//修改页面数据。
		},
		error:function (data){
			alert(data)
		//服务器失败	
		}
	});
	
}