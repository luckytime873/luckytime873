<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2024/4/21
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单详情页面</title>
</head>
<body>
<table class="buy" cellpadding="0" cellspacing="0">
    <tbody id="Table">
    <tr class="buytitle"><td colspan="6" class="b">确认商品价格与交易条件</td></tr>
    <tr>
        <td class="w100 b">订单编号</td>
        <td class="w364 b">商品名称</td>
        <td class="w100 b">单价</td>
        <td class="w100 b">折扣</td>
        <td class="w100 b">数量</td>
        <td class="w100 b">总计</td>
     </tr>
    <!--购物车和商品表连表查询得到购物车里面的商品信息-->
    <c:forEach items="${requestScope.page.items}" var="orderItem">
        <tr>
            <td>${orderItem.id}</td>
            <td>${orderItem.pName}</td>
            <td>${orderItem.pri}</td>
            <td>${orderItem.discount}</td>
            <td>${orderItem.num}</td>
            <td>${orderItem.total}</td>
        </tr>
    </c:forEach>

        <tr class="buytitle">
            <td colspan="2" >补充您的邮件地址和联系人基本信息</td>
        </tr>
        <tr>
            <td class="a_r"><label for="username"></label>收件人</td>
            <td><input type="text" name="username" id="username" />${requestScope.order.getReceiver()}
        </tr>
        <tr>
            <td class="a_r"><label for="address">收货地址</label></td>
            <td id="selectPlace">
                <input type="text" name="address" id="address" />${requestScope.order.getaddress()}
            </td>
        </tr>
        <tr>
            <td class="a_r"><label for="tel">电&nbsp;&nbsp;&nbsp;话：</label></td>
            <td><input class="w30" type="text" name="code"  size="4" id="tel" />${requestScope.order.code}-<input class="w81" type="text" name="telnumber" size="8" />${requestScope.order.telNumber}-<input class="w30" type="text" name="branchnumber" size="4" />${requestScope.order.branchnumber}<span class="red b"></span>（区号-电话号码-分机）</td>
        </tr>
        <tr>
            <td class="h65">&nbsp;</td>
            <td><input class="imginput" type="submit" src="../images/submit.gif"/></td>
        </tr>
</table>

</body>
</html>
