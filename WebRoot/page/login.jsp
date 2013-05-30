<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>


<div id="page" class="shell">
	<%@ include file="/page/common/top.jsp"%>
	<script type="text/javascript">
<%--function refresh(obj) {--%>
<%--	getCode();--%>
<%--}--%>
<%----%>
<%--$(document).ready(function() {--%>
<%--	getCode();--%>
<%--});--%>
<%----%>
<%--function getCode() {--%>
<%--	$.ajax( {--%>
<%--		type : 'POST',--%>
<%--		url : "<%=basePath%>getCode?" + Math.random(),--%>
<%--		success : function() {--%>
<%--			$("#code").attr("src", "<%=basePath%>getCode");--%>
<%--		}--%>
<%--	});--%>
<%--}--%>
</script>

	<div class="main_regist">
		<div class="wrapper">
			<h2 class="under">
				用户登录
			</h2>
			<form class="form-horizontal" action="<%=basePath%>login" method="post">
				<div class="control-group">
					<label class="control-label" for="inputEmail">
						用户名：
					</label>
					<div class="controls">
						<input type="text" id="inputEmail" placeholder="Email">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">
						密码：
					</label>
					<div class="controls">
						<input type="password" id="inputPassword" placeholder="Password">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<label class="checkbox"
							style="padding-top: 0px; margin-bottom: 15px;">
							<input type="checkbox">
							记住密码：
						</label>
						<button class="btn" type="submit">
							登录
						</button>
						<a href="<%=basePath%>toregister"
							style="padding-left: 0px; border-left-width: 20px; margin-left: 20px;">没有帐号？注册一个！</a>
					</div>
				</div>
			</form>

		</div>
	</div>



	<%@ include file="/page/common/footer.jsp"%>
</div>

</body>
</html>