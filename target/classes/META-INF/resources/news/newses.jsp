<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@ include file="/tabledata.jsp"%>
</head>
<body>
	<div id="abc" class="panel panel-dark-head">
		<div class="panel-heading">
			<h4 class="panel-title">用户信息列表</h4>
		</div>
		<table id="news_table">
		</table>
	</div>

	<div id="toolbar" class="btn-group">
		<button id="btn_edit" type="button" class="btn btn-default">
			<span class="fa fa-edit" aria-hidden="true"></span>&nbsp;修改
		</button>
		<button id="btn_delete" type="button" class="btn btn-default">
			<span class="fa fa-trash-o" aria-hidden="true"></span>&nbsp;删除
		</button>
	</div>

	<script type="text/javascript">
		
		$(function(){
			$('#news_table').bootstrapTable({
				url : '${pageContext.request.contextPath}/news/getNewses',
				method : 'get',
				toolbar : '#toolbar',
				striped : true,
				cache : false,
				pagination : true,
				sidePagination : "server",
				pageNumber : 1,
				pageSize : 10,
				pageList : [ 10, 25, 50, 100 ],
				showColumns : true,
				showRefresh : true,
				clickToSelect : true,
				uniqueId : "id",
				columns : [ { checkbox : true, visible: true }, 
							{ field : 'title', title : '资讯标题', width : 200, align : 'left', formatter : 
								function ifFormatter(value, row, index) {
									return '<a href="#" style="text-decoration: none;" onclick="seeNews(\''+row.id+'\')" target="_blank">'+value+'</a>';
								}
							},
							{ field : 'type', title : '资讯类别', width : 90, align : 'center', formatter : typeFormatter},
							{ field : 'author', title : '资讯作者', width : 90, align : 'center' },
							{ field : 'source', title : '资讯来源', width : 100, align : 'center' },
							{ field : 'operatetime', title : '发布时间', width : 120, align : 'center', formatter : dateFormatter},
							{ field : 'count', title : '浏览次数', width : 90 , align : 'center'}
						  ],
				queryParams : function(params) {
					var queryData = {
							pageSize : params.limit,
							pageNumber : (params.offset / params.limit) + 1
					};
					return queryData;
				}
			});
			
			$('#btn_edit').click(function(){
				var newses = $('#news_table').bootstrapTable('getSelections');
				if(newses.length > 1 || newses.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				//window.parent.openIframe('${pageContext.request.contextPath}/news/updateNews.jsp?id=' + newses[0].id);
			});			
			
			$('#btn_delete').click(function(){
				var newses = $('#news_table').bootstrapTable('getSelections');
				if(newses.length > 1 || newses.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				window.parent.openModel('${pageContext.request.contextPath}/deleteModal.jsp?id=' + newses[0].id + '&type=news');
			});			
		});
		
		function seeNews(id){
			window.open('${pageContext.request.contextPath}/news/seeNews?id=' + id);
		}
		window.parent.setMainDivHeight(0);
		window.parent.set_iFrame(680);
	</script>
</body>
</html>





















