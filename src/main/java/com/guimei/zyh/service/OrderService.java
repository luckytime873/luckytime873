package com.guimei.zyh.service;

import com.guimei.zyh.pojo.Order;
import com.guimei.zyh.pojo.OrderItem;

import java.util.List;

/***
 * 作者：朱宇欢
 */

public interface OrderService {

    /**
     * 保存订单到数据库的方法。
     *
     * @param order 要保存的订单对象
     * @return 保存操作的结果，通常是新订单的ID或保存状态
     */
    public Integer saveOrder(Order order);

    /**
     * 根据订单ID删除订单的方法。
     *
     * @param oid 要删除的订单ID
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    Integer deleteOrder(Integer oid);

    /**
     * 根据用户ID删除该用户所有订单的方法。
     *
     * @param uid 用户ID
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    public Integer deleteOrders(Integer uid);

    /**
     * 根据用户ID获取该用户的所有订单列表。
     *
     * @param uid 用户ID
     * @return 该用户的订单列表，如果无订单则返回空列表
     */
    public List<Order> getOrders(Integer uid);

    /**
     * 保存订单项到数据库的方法。
     *
     * @param orderItems 要保存的订单项列表
     * @return 保存操作的结果，通常是影响的记录数或保存状态
     */
    Integer saveOrderItems(List<OrderItem> orderItems);

    /**
     * 根据用户ID获取该用户最新的订单。
     *
     * @param uid 用户ID
     * @return 该用户的最新订单对象，如果无订单则返回null
     */
    Order getLatestOrderByUid(Integer uid);

    /**
     * 根据订单ID获取该订单的所有订单项列表。
     *
     * @param oid 订单ID
     * @return 该订单的订单项列表，如果无订单项则返回空列表
     */
    List<OrderItem> getOrderItems(Integer oid);

}
