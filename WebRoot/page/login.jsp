<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>


<div id="page" class="shell">
    <%@ include file="/page/common/top.jsp"%>
     <script type="text/javascript">
    	function refresh(obj) {
           getCode();
    	}
    	
    	$(document).ready(function(){
  			getCode();
		});
    	
    	function getCode(){
    		$.ajax({
  					type: 'POST',
  					url: "<%=basePath%>getCode?"+Math.random(),
  					success: function(){
  						$("#code").attr("src","<%=basePath%>getCode");
  					}
					});
    	}
    </script>
    
    					<div class="main_regist">
						<div class="wrapper">
						<h2 class="under">用户登录</h2>
						<form id="ContactForm" method="post">
						<div>
							<div  class="wrapper">
								<span>用户名:</span>
								<input type="text" class="input" >
							</div>
							<div  class="wrapper">
								<span>密码:</span>
								<input type="text" class="input" >
							</div>
							<div  class="wrapper">
								<span>验证码:</span>
								<input type="text" name="randomCode" class="codeinput" >
								<img title="点击更换" id="code" onclick="javascript:refresh(this);" ><br/>
							</div>
							<!--  
							<div  class="textarea_box">
								<span>Your Message:</span>
								<textarea name="textarea" cols="1" rows="1"></textarea>
							</div>
							-->
							<a href="#" onClick="document.getElementById('ContactForm').reset()">清空</a>
							<a href="#" onClick="document.getElementById('ContactForm').submit()">登录</a>
						</div>
					</form>
					
					</div>
					</div>
					
	
	
	<%@ include file="/page/common/footer.jsp"%>

</body>
</html>