<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2024/4/17
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE	html PUBLIC	"-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html	xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>贵美商城</title>
    <link rel="stylesheet"	type="text/css"	href="../css/global.css"	/>
    <link rel="stylesheet"	type="text/css"	href="../css/layout.css"	/>
    <script type="text/JavaScript">
        function multiCheck(oThis){
            var oInput=document.getElementsByTagName("input");
            for (var i=1;i<oInput.length;i++){
                oInput[i].checked=oThis.checked;}
        }
    </script>
</head>
<body>
<div id="container">
    <iframe id="header" runat="server" src="./header.htm" width="980" height="136" frameborder="0" scrolling="no"></iframe>
    <table class="buy" cellpadding="0" cellspacing="0">
        <tbody id="Table">
        <tr class="buytitle"><td colspan="6" class="b">确认商品价格与交易条件</td></tr>
        <tr>
            <td class="w364 b">&nbsp;&nbsp;&nbsp;&nbsp;商品名</td>
            <td class="w100 b">原价</td>
            <td class="w100 b">优惠价</td>
            <td class="w100 b">打折</td>
            <td class="w100 b">数量</td>
            <td class="w81 b">加入购物车</td>
        </tr>
        <!--购物车和商品表连表查询得到购物车里面的商品信息-->

        <c:forEach items="${requestScope.page.items}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.pri}</td>
                <td>${product.nPri}</td>
                <td>${product.discount}</td>
                <td>${product.num}</td>
                <td><a href="cartServlet?action=addToCart&pid=${product.id}">加入购物车</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%--静态包含分页条--%>
    <%@include file="./page_nav.jsp"%>

    <input class="imginput h26" type="image" src="../images/cart.png" />加入购物车</td>
    <iframe id="footer" runat="server" src="footer.htm" width="980" height="136" frameborder="0" scrolling="no"></iframe>
</div> <!--container end-->
</body>
</html>

