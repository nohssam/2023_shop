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
		<tr>
			<td width="40%">제품Category</td>
			<td width="60%">
			</th>
		</tr>
		<tr>
			<td width="40%">제품번호</td>
			<td width="60%">
			</th>
		</tr>
		<tr>
			<td width="40%">제품이름</td>
			<td width="60%">
			</th>
		</tr>
		<tr>
			<td width="40%">제품판매사</td>
			<td width="60%">
			</th>
		</tr>
		<tr>
			<td width="40%">제품가격</td>
			<td width="60%">(할인가: )</td>
		</tr>
		<tr>
			<td colspan="2">제품설명</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><img src="images/" width="100"
				height="95"></td>
		</tr>
		<tr>
			<td colspan="2"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button"
				value="장바구니에 담기"
				onclick="javascript:location.href='addProduct.jsp?p_num='" /> <input
				type="button" value="장바구니 보기"
				onclick="javascript:location.href='cartList.jsp'" /></td>
		</tr>
	</table>
</body>
</html>