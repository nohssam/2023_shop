<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	margin: 10px auto;
	width: 600;
	border-collapse: collapse;
	font-size: 8pt;
	border-color: navy;
}

table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<tr bgcolor="#dedede">
			<th width="10%">제품번호</th>
			<th width="10%">이미지</th>
			<th width="35%">제품명</th>
			<th width="20%">제품가격</th>
			<th width="25%">비고</th>
		</tr>

		<tr align="center">
			<td></td>
			<td><img src="images/" width="100" height="95"></td>
			<td><a href="product_content.jsp?prod_num="> </a></td>
			<td>할인가 : 원<br> <font color="red">()</font>
			</td>
			<td>시중 가격 : 원</td>
		</tr>

	</table>
</body>
</html>