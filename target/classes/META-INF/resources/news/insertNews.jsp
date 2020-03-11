<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>系统主页</title>
<meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1">
<%@ include file="/tabledata.jsp"%>
<link href="${pageContext.request.contextPath}/css/bootstrap-override.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/ckeditor/config.js"></script>
<style>
.form-control {
	border-radius: 5px;
	height: 30px;
}
</style>

</head>
<body>
	<div id="abc" class="panel panel-dark-head">
		<div class="panel-heading">
			<h4 class="panel-title">新增资讯信息</h4>
		</div>
		<!-- panel-heading -->
		<div class="panel-body nopadding">
			<form id="newsForm" method="post" class="form-bordered">
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯标题</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="title" name="title" placeholder="请输入资讯标题">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯类别</label>
					<div class="col-sm-8">
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="1" name="type" id="type1"><label for="type1">宏观政策</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="2" name="type" id="type2"><label for="type2">财经热点</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="3" name="type" id="type3"><label for="type3">市场分析</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="4" name="type" id="type4"><label for="type4">矿方动态</label>
						</div>
						<br>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="5" name="type" id="type5"><label for="type5">电力行业</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="6" name="type" id="type6"><label for="type6">相关行业</label>
						</div>
						<br>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="7" name="type" id="type7"><label for="type7">船运信息</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="8" name="type" id="type8"><label for="type8">铁路信息</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="9" name="type" id="type9"><label for="type9">公路信息</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯作者</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="author" name="author" placeholder="请输入资讯作者">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯来源</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="source" name="source" value="中国煤炭资源网" placeholder="请输入资讯来源">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯内容</label>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<textarea class="ckeditor" name="context"></textarea>
					</div>
				</div>
				<div class="form-group" style="text-align: center;">
					<div class="col-sm-12" style="text-align: center;">
						<input type="button" class="btn btn-default" onclick="submitForm()" value="提交" /> &nbsp;&nbsp;&nbsp;&nbsp;
						<button type="reset" class="btn btn-default">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		window.parent.set_iFrame(1100);
		window.parent.setMainDivHeight('1200px');

		$(function() {
			toastr.options = {
				positionClass : "toast-center-center",
				timeOut : "10000",
				showMethod : "fadeIn",
				hideMethod : "fadeOut",
				onclick : function() {
					window.location.href = '${pageContext.request.contextPath}/news/newses.jsp';
				}
			};
		});

		function submitForm() {
			var form = {
				title : $('#title').val(),
				type : $("input[name='type']:checked").val(),
				author : $('#author').val(),
				source : $('#source').val(),
				context : CKEDITOR.instances.context.getData()
			};
			$.post('${pageContext.request.contextPath}/news/insert', form,
				function(data) {
					if (data == 1) {
						toastr.success('<strong>成功&nbsp;! </strong>&nbsp;&nbsp;请到数据列表进行查看。');
					} else {
						toastr.error('<strong>失败&nbsp;! </strong>&nbsp;&nbsp;请检查数据正确性或联系管理员。');
					}

					setTimeout(
							function() {
								window.location.href = '${pageContext.request.contextPath}/news/newses.jsp';
							}, 11000);

				}, "json");
		}
	</script>
</body>
</html>