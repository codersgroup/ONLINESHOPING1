<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="context" value="${pageContext.request.contextPath}" />




<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shoping-${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap themes CSS  -->
<link href="${css}/themes.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myStyle.css" rel="stylesheet">

</head>

<body>
	<div class="wraper">
		<!-- Navigation -->

		<%@include file="./shared/navigation.jsp"%>

		<div class="content">
		<hr>
			<!--home Page -->
			<c:if test="${userClickHome==true}">
				<%@ include file="./home.jsp"%>
			</c:if>

			<!--home Page -->
			<c:if test="${userClickAboutUs==true}">
				<%@ include file="./aboutUs.jsp"%>
			</c:if>



			<!--home Page -->
			<c:if test="${userClickContactUs==true}">
				<%@ include file="./contactUs.jsp"%>
			</c:if>

			<c:if test="${userClickAllProduct==true or userClickIdProduct==true}">
				<%@ include file="./listProducts.jsp"%>
			</c:if>

			<!-- /.container -->
		</div>

		<div class="fotter">
			<!-- Footer -->
			<%@ include file="./shared/fotter.jsp"%>
		</div>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/popper.min.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/myJavaScript.js"></script>
	</div>
</body>

</html>
