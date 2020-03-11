<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${news.title }</title>
<meta content="" http-equiv="description">

<title>首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7">
<link href="${pageContext.request.contextPath}/news/detail/font/html5.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/news/detail/font/front.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/news/detail/font/jquery.ui.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/news/detail/font/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/news/detail/font/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/news/detail/font/common.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/news/detail/font/index.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/news/detail/font/slides_index.css">
<script src="${pageContext.request.contextPath}/news/detail/font/jquery.js"></script>
<script src="${pageContext.request.contextPath}/news/detail/font/slides_index.js"></script>
<script src="${pageContext.request.contextPath}/news/detail/font/slides.js"></script>
<script src="${pageContext.request.contextPath}/news/detail/font/jquery-ui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/news/detail/font/front.js" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
Cms.attachment("","10201","0","attach");
Cms.viewCount("","10201");
Cms.siteFlow("", location.href, document.referrer);
});
</script>
<style>
a {
	color: #000;
}

.biaoqian {
	line-height: 45px;
}
</style>
</head>
<body style="">
	<div class="wrapper">
		<div class="top">
			<div class="top_main">
				<ul>
					<li><a href="#" class="ser">客服中心</a>|<a href="#" style="cursor: default;">客服热线： 400-020-8000（非工作时间：15011089832）</a></li>
				</ul>
			</div>
		</div>
		<div class="clear"></div>
		<div class="daohang">

			<div class="nav">
				<div class="logo">
					<dl>
						<dt>
							<img src="${pageContext.request.contextPath}/news/detail/font/logo3.png" alt="Logo">
						</dt>
						<!--  <dd>原国电阳光采购平台</dd> -->
					</dl>
				</div>
				<div class="ulli">
					<ul>
						<li><a href="#" target="_self">首页</a></li>
						<li><a href="#" target="_self">阳光专区v2.1</a></li>
						<li><a href="#" target="_self">交易中心</a></li>
						<li><a href="#" target="_self">资讯中心</a></li>
						<li><a href="#" target="_self">物流中心</a></li>
						<li><a href="#" target="_self">会员中心</a></li>
						<li><a href="#" target="_self">供应链管理</a></li>
					</ul>
				</div>

			</div>
		</div>
		<!-- 左栏_begin -->
		<div class="main">
			<div class="biaoqian">
				当前位置：<a href="#" style="white-space: nowrap;">首页</a> &gt; <a href="#" class="lili-a">资讯中心</a> &gt; <a href="#" target="_blank">宏观政策</a> &gt; 正文
			</div>

			<div class="newsTex">
				<h1>${news.title }</h1>
				<div class="msgbar" align="center">
					发布时间： ${news.operatetime } &nbsp; 作者： ${news.author }&nbsp; 来源： ${news.source } &nbsp; 浏览次数：<span id="views">${news.count }</span>
				</div>
				<div class="newsCon">${news.context }</div>
				<!-- 上一篇，下一篇 -->
				<div class="pagebar"></div>
				<div class="other">

					<ul style="padding-left: 0px; margin-left: 0px; text-align: left;">
						<li style="padding-left: 0px; margin-left: 0px; text-align: left;"><strong>上一篇：</strong>无</li>
						<li><strong>下一篇：</strong><a href="http://fuel.powerec.net/hgzc/10174.jhtml">国务院关税税则委员会关于试行开展对美加征关税商品排除工作的公告</a></li>
					</ul>
				</div>


			</div>
			<style>
.news_index_bottom_href {
	margin: 8px;
	text-align: left;
	font-size: 15px;
	display: inline-block;
	position: relative;
	cursor: pointer;
	color: #337ab7
}
</style>
			<div class="lianjie">
				<h3>
					<a>友情链接</a>
				</h3>
				<div class="youqing">
					<div style="margin-right: 1%;">
						<p style="padding: 10px;">
							<a href="http://www.chnenergy.com.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=90&#39;)">
								国家能源集团 <!--          --> <!--          -->
							</a> <a href="http://www.cctd.com.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=53&#39;)">
								中国煤炭市场网 <!--          --> <!--          -->
							</a> <a href="http://www.shcce.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=75&#39;)">
								上海煤炭交易中心 <!--          --> <!--          -->
							</a> <a href="https://www.e-shenhua.com/ec/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=76&#39;)">
								神华煤炭交易网 <!--          --> <!--          -->
							</a> <a href="http://www.yitaigroup.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=79&#39;)">
								伊泰集团 <!--          --> <!--          -->
							</a> <a href="http://www.sxcoal.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=52&#39;)">
								中国煤炭资源网 <!--          --> <!--          -->
							</a> <a href="http://e.ctctc.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=54&#39;)">
								太原煤炭交易中心 <!--          --> <!--          -->
							</a> <a href="http://www.snctc.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=55&#39;)">
								陕西煤炭交易中心 <!--          --> <!--          -->
							</a> <a href="http://www.cqcoal.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=70&#39;)">
								秦皇岛煤炭网 <!--          --> <!--          -->
							</a> <a href="http://www.imcec.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=72&#39;)">
								内蒙古煤炭交易中心 <!--          --> <!--          -->
							</a> <a href="http://www.chinacoal.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=73&#39;)">
								中煤集团 <!--          --> <!--          -->
							</a> <a href="http://www.cnss.com.cn/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=74&#39;)">
								中国海事服务网 <!--          --> <!--          -->
							</a> <a href="http://www.dtcoalmine.com/" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=77&#39;)">
								同煤集团 <!--          --> <!--          -->
							</a> <a href="http://www.czce.com.cn/cn/index.htm" target="_blank" class="news_index_bottom_href"
								onclick="$.get(&#39;/friendlink_view.jspx?id=78&#39;)"> 郑州商品交易所 <!--          --> <!--          -->
							</a> <a href="http://www.sse.net.cn/home" target="_blank" class="news_index_bottom_href" onclick="$.get(&#39;/friendlink_view.jspx?id=51&#39;)">
								上海航运交易所 <!--          --> <!--          -->
							</a>

						</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 左栏_end -->
	<div class="clear-10"></div>
	<div class="footer">
		<div>
			<p class="footer_p">
				<a href="http://fuel.powerec.net/service/index.jhtml">客服中心</a>|<a href="http://fuel.powerec.net/contact/index.jhtml">联系我们</a>
			</p>
			<p>网站版权归国电燃料有限公司所有 京ICP备 05053479号-2 |京公网安备110102005596号-1</p>
			<p>地址：北京市昌平区未来科技城 邮编：102209 电话：400-020-8000（非工作时间：15011089832）、010-56978755 传真： 010-56978760</p>
			<p>电子邮箱：fuel@chnenergy.com.cn</p>
		</div>
	</div>

	<div id="cntvlive2-is-installed"></div>
</body>
</html>