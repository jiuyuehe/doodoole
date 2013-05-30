<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>

<div id="page" class="shell">
	<%@ include file="/page/common/top.jsp"%>
	<script type="text/javascript">
function refresh(obj) {
	//getCode();
	$("#code").attr("src", "<%=basePath%>getCode");
}

</script>

	<div class="main_regist">
		<div class="wrapper">
			<h2 class="under">
				新用户注册
			</h2>
			<form class="form-horizontal" action="<%=basePath%>doRegister" method="post">
				<div class="control-group">
					<label class="control-label"  for="inputEmail">
						用户名：
					</label>
					<div class="controls">
						<input type="text"  placeholder="用户名">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label"  >
						密码：
					</label>
					<div class="controls">
						<input type="password" name="password" placeholder="密码">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" >
						重复密码：
					</label>
					<div class="controls">
						<input type="password" name="repassword" placeholder="再输入一次密码">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" >
						邮箱：
					</label>
					<div class="controls">
						<input type="text" name="email" placeholder="doo@doodoo.com">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" >
						验证码：
					</label>
					<div class="controls">
						<input type="text" class="input-mini" name="code"
							placeholder="验证码">
						<img title="点击更换" src="<%=basePath%>getCode? + Math.random()" id="code" onclick="javascript:refresh(this);">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">

						<button class="btn btn-info" type="submit">
							确认
						</button>

						<button class="btn btn-info" type="reset">
							重置
						</button>

					</div>
				</div>
			</form>

		</div>
	</div>



	<%@ include file="/page/common/footer.jsp"%>

	</body>
	</html>