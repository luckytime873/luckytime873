<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.guimei.zyh.service.OrderService" %>
<%@ page import="com.guimei.zyh.service.impl.OrderServiceImpl" %>
<%@ page import="com.guimei.zyh.pojo.Order" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2024/4/21
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的订单</title>
</head>
<body>
<table class="buy" cellpadding="0" cellspacing="0">
    <tbody id="Table">
    <tr class="buytitle"><td colspan="6" class="b">确认商品价格与交易条件</td></tr>
    <tr>
        <td class="w364 b">&nbsp;&nbsp;&nbsp;&nbsp;订单编号</td>
        <td class="w100 b">支付金额</td>
        <td class="w100 b">优惠</td>
        <td class="w100 b">数量</td>
        <td class="w100 b">订单状态</td>
        <td class="w81 b">查看订单详情</td>
        <td class="w81 b">删除订单</td>
        <td class="w81 b"><a href="orderServlet?action=deleteOrders&uid=${requestScope.getSession().getAttribbute("uid")}">删除订单</a></td>删除所有订单</td>
    </tr>
    <!--购物车和商品表连表查询得到购物车里面的商品信息-->
    <%
        OrderService orderService=new OrderServiceImpl();
        HttpSession session1= request.getSession();
        Integer uid=(Integer)session1.getAttribute("uid");
        List<Order> orders=orderService.getOrders(uid);
        request.setAttribute("order",orders);
    %>
    <c:forEach items="${requestScope.page.items}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.total}</td>
            <td>${order.num}</td>
            <td>${order.youhui}</td>
            <td>${order.statusOfOrder}</td>
            <td><a href="orderServlet?action=getOrderItems&oid=${order.id}">查看订单详情</a></td>
            <td><a href="orderServlet?action=deleteOrder&oid=${order.id}">删除订单</a></td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
