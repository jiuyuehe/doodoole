<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>

<div id="page" class="shell">
    <%@ include file="/page/common/top.jsp"%>
    
    <div id="main">
    <div class="cols one-cols">
			<div class="cl">&nbsp;</div>
            <div class="left_list">
            <ul>
            <li><a href="#">租房注意事项</a></li>
            <li><a href="#">租房注意事项</a></li>
            <li><a href="#">租房注意事项</a></li>
            <li><a href="#">租房注意事项</a></li>
            <li><a href="#">租房注意事项</a></li>
            </ul>
            </div>
            <!-- 左侧list结束-->
            <div class="right_list">
       
     	<div class="center_left">
         <div class="features">   
            <div class="title">帖子浏览</div>
                    <ul class="list">
                    <li><span>1</span><a href="#">Lorem ipsum dolor sit amet, </a><a href="#"> consectetur adipisicing elit, </a><a href="#"> consectetur adipisicing elit, sed do eiusmod</a></li>
                    <li><span>2</span><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</a></li>
                    <li><span>3</span><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</a></li>
                    <li><span>4</span><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</a></li>
                    </ul> 
         </div>   
        </div> 
			
			 <div class="col">
			
				<div class="main_post">
				
						<div class="wrapper">
						<h2 class="under">快速发帖</h2>
						<form id="ContactForm" method="post">
						<div>
							<div  class="wrapper">
								<span>用户名:</span>
								<input type="text" class="input" >
							</div>
							
							<div  class="wrapper">
								<span>验证码:</span>
								<input type="text" class="codeinput" >
								<img title="点击更换" id="code" onclick="javascript:refresh(this);" ><br/>
							</div>
						 
							<div  class="textarea_box">
								<span>Your Message:</span>
								<textarea name="textarea" cols="1" rows="1"></textarea>
							</div>
						
							<a href="#" onClick="document.getElementById('ContactForm').reset()">清空</a>
							<a href="#" onClick="document.getElementById('ContactForm').submit()">发表</a>
						</div>
					</form>
					
					</div>
					</div>
			</div>
			
        </div>  
        <div class="clear"></div>
       
    	</div>  
        <hr />
			<div class="cl">&nbsp;</div>
		</div>

 

    
	
	
	<%@ include file="/page/common/footer.jsp"%>

</body>
</html>