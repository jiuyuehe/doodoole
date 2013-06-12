<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/page/common/header.jsp"%>

<div class="container">

	<div id="page" class="pull-left">
<%@ include file="/page/common/top.jsp"%>
<form class="form-horizontal">
			<div class="control-group">
				<label class="control-label" for="inputEmail">
					标题：
				</label>
				<div class="controls">
					<input type="text" class="input-xxlarge" placeholder="Email">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">
					发表到：
				</label>
				<div class="controls">
					<select>
						<option>
							1
						</option>
						<option>
							2
						</option>
						<option>
							3
						</option>
						<option>
							4
						</option>
						<option>
							5
						</option>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">
					正文：
				</label>
				<div class="controls">
					<textarea style="width: 500px; height: 350px"></textarea>
					
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
				<div class="controls">
				<button type="submit" class="btn btn-large btn-info">
					发表
				</button>
				</div>
		</form>
		</div>
		</div>