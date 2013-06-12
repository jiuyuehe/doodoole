<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>

<body data-spy="scroll" data-target=".bs-docs-sidebar" youdao="bind">

	<div class="container">
			<div id="page" class="pull-left">
				<%@ include file="/page/common/top.jsp"%>
				<link rel="stylesheet" href="<%=basePath%>css/docs.css"
					type="text/css" media="all" />
				<div class="">
					<ul class="nav nav-list bs-docs-sidenav pull-left">
						<li class="active">
							<a href="#typography"><i class="icon-chevron-right"></i>技术论坛</a>
						</li>
						<li class="">
							<a href="#code"><i class="icon-chevron-right"></i> Code</a>
						</li>
						<li class="">
							<a href="#tables"><i class="icon-chevron-right"></i> 编程</a>
						</li>
						<li class="">
							<a href="#forms"><i class="icon-chevron-right"></i> 表单提交</a>
						</li>
						<li class="">
							<a href="#buttons"><i class="icon-chevron-right"></i> 按钮</a>
						</li>
						<li class="">
							<a href="#images"><i class="icon-chevron-right"></i> 图片</a>
						</li>
						<li class="">
							<a href="#icons"><i class="icon-chevron-right"></i>美女高清那个</a>
						</li>
					</ul>
				</div>
				<%@ include file="/page/content.jsp"%>
			</div>
</body>
</html>
