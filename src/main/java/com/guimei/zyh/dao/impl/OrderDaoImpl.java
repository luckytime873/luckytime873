package com.guimei.zyh.dao.impl;

import com.guimei.zyh.dao.OrderDao;
import com.guimei.zyh.pojo.Order;
import com.guimei.zyh.pojo.OrderItem;

import java.util.List;

/***
 * 作者：朱宇欢
 */

public class OrderDaoImpl extends BaseDao implements OrderDao {

    @Override
    public Order getLatestOrderByUid(Integer uid) {
        String sql="select * from order where uid=? order BY oid Desc limit 1";
        return queryForOne(Order.class,sql,uid);
    }

    @Override
    public Integer saveOrder(Order order) {
        String  sql="insert into order (uid,num,total,youhui) values(?,?,?,?)";
        return update(sql,order.getUid(),order.getNum(),order.getTotal(),order.getYouhui());
    }


    @Override
    public List<Order> getOrders(Integer uid) {
       String sql ="select * from order where uid=?";
       return queryForList(Order.class,sql,uid);
    }

    @Override
    public Integer deleteOrder(Integer oid) {
       String sql="delete from order where oid=?";
       return update(sql,oid);
    }

    @Override
    public Integer deleteOrders(Integer uid) {
            String sql="delete from order where uid=?";
        return update(sql,uid);
    }



    @Override
    public Integer saveOrderItems(List<OrderItem> orderItems) {
        Integer result=0;
        for (OrderItem orderItem:orderItems
             ) {
            String sql="insert into orderItem(oid,pid,num,discount,total,codeOfOrder,telNumBer,branchNumber,receiver,address)"+
                    "values(?,?,?,?,?,?,?,?,?,?,?)";
            result=update(sql,orderItem.getOid(),orderItem.getPid(),orderItem.getNum(),orderItem.getDiscount(),orderItem.getTotal(),orderItem.getCodeOfOrder(),orderItem.getTelNumber(),orderItem.getBranchNumber(),orderItem.getReceiver(),orderItem.getAddress());
                if(result==0){
                    return result;
                }
        }
        return result;
    }

    @Override
    public List<OrderItem> getOrderItems(Integer oid) {
        String sql="select * from orderItems where oid=?";
        return queryForList(OrderItem.class,sql,oid);
    }
}
