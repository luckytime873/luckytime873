package com.guimei.zyh.service.impl;

import com.guimei.zyh.dao.OrderDao;
import com.guimei.zyh.dao.impl.BaseDao;
import com.guimei.zyh.dao.impl.OrderDaoImpl;
import com.guimei.zyh.pojo.Order;
import com.guimei.zyh.pojo.OrderItem;
import com.guimei.zyh.service.OrderService;

import java.util.List;

/***
 * 作者：朱宇欢
 */
public class OrderServiceImpl extends BaseDao implements OrderService {
    private OrderDao orderDao=new OrderDaoImpl();

    @Override


    /**
     * 保存订单信息
     *
     * @param order 要保存的订单对象
     * @return 订单保存结果，通常返回订单ID或保存状态
     */
    public Integer saveOrder(Order order) {
        return orderDao.saveOrder(order);
    }

    /**
     * 删除指定ID的订单
     *
     * @param oid 要删除的订单ID
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    @Override
    public Integer deleteOrder(Integer oid) {
        return orderDao.deleteOrder(oid);
    }

    /**
     * 根据用户ID删除所有订单
     *
     * @param uid 用户ID
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    @Override
    public Integer deleteOrders(Integer uid) {
        return orderDao.deleteOrders(uid);
    }

    /**
     * 根据用户ID获取所有订单列表
     *
     * @param uid 用户ID
     * @return 用户的订单列表
     */
    @Override
    public List<Order> getOrders(Integer uid) {
        return orderDao.getOrders(uid);
    }

    /**
     * 保存订单项列表
     *
     * @param orderItems 订单项列表
     * @return 保存操作的结果，通常是影响的记录数或保存状态
     */
    @Override
    public Integer saveOrderItems(List<OrderItem> orderItems) {
        return orderDao.saveOrderItems(orderItems);
    }

    /**
     * 根据用户ID获取最新的订单
     *
     * @param uid 用户ID
     * @return 用户的最新订单信息
     */
    @Override
    public Order getLatestOrderByUid(Integer uid) {
        return orderDao.getLatestOrderByUid(uid);
    }

    /**
     * 根据订单ID获取订单项列表
     *
     * @param oid 订单ID
     * @return 订单对应的订单项列表
     */
    @Override
    public List<OrderItem> getOrderItems(Integer oid) {
        return orderDao.getOrderItems(oid);
    }

}