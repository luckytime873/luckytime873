<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2024/4/17
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出售者信息</title>
</head>
<body>
<table class="buy" cellpadding="0" cellspacing="0">
    <tbody id="priceTable">
    <tr class="buytitle"><td colspan="6" class="b">确认商品价格与交易条件</td></tr>
    <tr>
        <td class="">&nbsp;&nbsp;&nbsp;&nbsp;出售者姓名</td>
        <td class="w100 b">电话</td>
        <td class="w100 b">商家描述</td>
        <td class="w100 b">信誉</td>
        <td class="w100 b">差评数量</td>
    </tr>
    <tr>
        <td class="">&nbsp;${requestScope.seller.sname}</td>
        <td class="w100 b">${requestScope.seller.phone}</td>
        <td class="w100 b">${requestScope.seller.des}</td>
        <td class="w100 b">${requestScope.seller.credit}</td>
        <td class="w100 b">${requestScope.seller.cmp}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
