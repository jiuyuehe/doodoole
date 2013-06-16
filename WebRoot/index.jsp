<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>

<div id="page" class="shell">
    <%@ include file="/page/common/top.jsp"%>
	<!-- Header -->
	<div id="header">
		<!-- Slider -->
		<div id="slider">
			<div id="slider-holder">
				图片轮播空间
			</div>
			<div class="slider-nav">
				<a href="#" class="prev">Previous</a>
				<a href="#" class="next">Next</a>
			</div>
		</div>
		<!-- END Slider -->	
	</div>
	<!-- END Header -->
	<!-- Main -->
	<div id="main">
		<!-- Three Column Content -->
		<div class="cols three-cols">
			<div class="cl">&nbsp;</div>
			<div class="col">
				<h2><img  src="css/images/forum.gif"/><a href="<%=basePath %>/showCategory" class="more1">热辣美女</a></h2>

				<p>今日更新：<font color="#FF0000">10条</font></p>
                <p>最新恢复：热烈庆祝论坛开通</p>
                <p>论坛版主：刚把的</p>
				<p></p>
			</div>
			<div class="col">
				<h2><img  src="css/images/forum.gif"/><a href="#" class="more1">青春不露点</a></h2>
				<p>今日更新：10条</p>
                <p>今日更新：10条</p>
                <p>今日更新：10条</p>
				<p></p>
			</div>
			<div class="col col-last">
				<h2><img  src="css/images/forum.gif"/><a href="#" class="more1">未成年就露点</a></h2>
				
				<p>今日更新：10条</p>
                <p>今日更新：10条</p>
                <p>今日更新：10条</p>
				
			</div>
			<div class="cl">&nbsp;</div>
		</div>
		<!-- END Three Column Content -->
       
	
		<!-- END Two Column Content -->
	</div>
	<!-- END Main -->
	<%@ include file="/page/common/footer.jsp"%>
</div>
</body>
</html>