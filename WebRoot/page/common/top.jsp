<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="top">
	<div class="cl">
		&nbsp;
	</div>
	<div>
		<h1 id="logo">
			<a href="#">多多乐</a>
		</h1>
		<div class="pull-right">
		<%	
			String userAccount =(String)session.getAttribute("userAccount");
			Integer  userId = (Integer)session.getAttribute("userId");
			
			if(userAccount!=null){
				out.print("<span class='span2'>");
				out.print("欢迎您："+"<a href='tologin'>"+userAccount+"</a>");
				out.print("</span>");
			}else{
				out.print("<span class='span2'>");
				out.print("<a href='tologin'>登录</a>");
				out.print("</span>");
			}
		%>
<%--			<span class="span2"><a href="<%=basePath%>tologin">登录</a> </span>--%>
			<br />
			<span class="span2"><a href="<%=basePath%>toregister">注册新用户</a>
			</span>
		</div>
		<div>
			12
		</div>
	</div>
	<div class="cl">
		&nbsp;
	</div>
	<div id="navigation">
		<ul>
			<li style="line-height: 20px">
				<a href="#" class="active"><span>doodoole论坛</span> </a>
			</li>

			<li class="right">
				<div class="input-append">
					<input class="span2" id="appendedInputButton" type="text">
					<button class="btn" type="button">
						Go!
					</button>
				</div>

			</li>
		</ul>
	</div>
</div>

