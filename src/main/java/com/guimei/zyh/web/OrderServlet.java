package com.guimei.zyh.web;

import com.guimei.zyh.service.OrderService;
import com.guimei.zyh.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * 作者：朱宇欢
 */

public class OrderServlet extends BaseServlet{
    private OrderService orderService=new OrderServiceImpl();
    public void deleteOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer uid=(Integer) req.getSession().getAttribute("uid");
        Integer oid=orderService.getLatestOrderByUid(uid).getId();
        orderService.deleteOrder(oid);
        req.getRequestDispatcher("./pages/order.jsp").forward(req,resp);
    }

    public void deleteOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer uid=(Integer) req.getSession().getAttribute("uid");
        orderService.deleteOrders(uid);
        req.getRequestDispatcher("./pages/order.jsp").forward(req,resp);
    }

    public void showOrderItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer oid= Integer.valueOf(req.getParameter("oid"));
        orderService.getOrderItems(oid);
        req.getRequestDispatcher("./pages/OrderItemsShow.jsp").forward(req,resp);

    }

}
