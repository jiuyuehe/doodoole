<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/page/common/header.jsp"%>

<div class="container">
	<div id="page" class="pull-left">
		<%@ include file="/page/common/top.jsp"%>
		<div>
			<ul class="breadcrumb">
				<li>
					<a href="#">Home</a>
					<span class="divider">/</span>
				</li>
				<li>
					<a href="#">Library</a>
					<span class="divider">/</span>
				</li>
				<li class="active">
					Data
				</li>
			</ul>
		</div>
		<div class="topic" align="center" style="border: 1px solid #ddd;">
			<div>
				<h2>
					titiletitiletitile
				</h2>
			</div>
			<div class="msg">
				<div>
					发表时间： 1982-02-02，回复数：19855条，支持数：185，反对数：5，评分：85
				</div>
				<div class="pagination"
					style="margin-top: 0px; margin-bottom: 0px; margin-left: 400px;">
					<ul>
						<li>
							<a href="#">«</a>
						</li>
						<li>
							<a href="#">1</a>
						</li>
						<li>
							<a href="#">2</a>
						</li>
						<li>
							<a href="#">3</a>
						</li>
						<li>
							<a href="#">4</a>
						</li>
						<li>
							<a href="#">5</a>
						</li>
						<li>
							<a href="#">»</a>
						</li>
					</ul>
				</div>
			</div>

			<div class="">
				dividual or compiled
Plugins can be included individually (though some have required dependencies), or all at once. Both bootstrap.js and bootstrap.min.js contain all plugins in a single file.

Data attributes
You can use all Bootstrap plugins purely through the markup API without writing a single line of JavaScript. This is Bootstrap's first class API and should be your first consideration when using a plugin.

That said, in some situations it may be desirable to turn this functionality off. Therefore, we also provide the ability to disable the data attribute API by unbinding all events on the body namespaced with `'data-api'`. This looks like this:

$('body').off('.data-api')
Alternatively, to target a specific plugin, just include the plugin's name as a namespace along with the data-api namespace like this:

$('body').off('.alert.data-api')
Programmatic API
We also believe you should be able to use all Bootstrap plugins purely through the JavaScript API. All public APIs are single, chainable methods, and return the collection acted upon.

$(".btn.danger").button("toggle").addClass("fat")
All methods should accept an optional options object, a string which targets a particular method, or nothing (which initiates a plugin with default behavior):

$("#myModal").modal()                       // initialized with defaults
$("#myModal").modal({ keyboard: false })   // initialized with no keyboard
$("#myModal").modal('show')                // initializes and invokes show immediately
Each plugin also exposes its raw constructor on a `Constructor` property: $.fn.popover.Constructor. If you'd like to get a particular plugin instance, retrieve it directly from an element: $('[rel=popover]').data('popover').

No Conflict
Sometimes it is necessary to use Bootstrap plugins with other UI frameworks. In these circumstances, namespace collisions can occasionally occur. If this happens, you may call .noConflict on the plugin you wish to revert the value of.

var bootstrapButton = $.fn.button.noConflict() // return $.fn.button to previously assigned value
$.fn.bootstrapBtn = bootstrapButton            // give $().bootstrapBtn the bootstrap functionality
Events
Bootstrap provides custom events for most plugin's unique actions. Generally, these come in an infinitive and past participle form - where the infinitive (ex. show) is triggered at the start of an event, and its past participle form (ex. shown) is trigger on the completion of an action.

All infinitive events provide preventDefault functionality. This provides the ability to stop the execution of an action before it starts.
			</div>
			<div class="well">
				userInfo:
			</div>
		</div>
		
		<%@ include file="/page/common/footer.jsp"%>
	</div>
</div>
