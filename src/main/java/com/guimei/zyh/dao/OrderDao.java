package com.guimei.zyh.dao;

import com.guimei.zyh.pojo.Order;
import com.guimei.zyh.pojo.OrderItem;

import java.util.List;
/***
 * 作者：朱宇欢
 */

//用户的总账单包含多个订单
public interface OrderDao {

    public Order getLatestOrderByUid(Integer uid);

    public Integer saveOrder(Order order);
    public List<Order> getOrders(Integer uid);//获取用户的所有订单

    public Integer deleteOrder(Integer oid);
    public Integer deleteOrders(Integer uid);

    Integer saveOrderItems(List<OrderItem> orderItems);

    List<OrderItem> getOrderItems(Integer oid);
}
