package com.guimei.zyh.dao.impl;

import com.guimei.zyh.dao.CartRecDao;
import com.guimei.zyh.pojo.CartItem;


import java.util.List;
import java.util.Map;


/***
 * 作者：朱宇欢
 */

public class CartDaoImpl  extends BaseDao implements CartRecDao {

    //用户下次查看给购物车的时候只需要显示购物车商品的基本信息不需要显示以前购买的历史数量和总价
    public Integer addCartRec(CartItem cartItem){
      String sql="insert into cartrec (uid,cid,pid,pri,discount,pName,date)values(?,?,?,?,?,?,?)";
      return update(sql, cartItem.getUid(), cartItem.getCid(), cartItem.getPid(), cartItem.getPid(), cartItem.getPri(), cartItem.getDiscount(), cartItem.getpName(), cartItem.getDate());
    }

    @Override
    public Integer saveCart(Map<Integer, CartItem> cart) {
        Integer result=0;
        for (CartItem cartItem : cart.values()) {
            result =addCartRec(cartItem);
        }
        return result;
    }

    public Integer clear(Integer uid){
        String sql="delete from cartrec where uid=?";
        return update(sql,uid);
    }


    @Override
    public List<CartItem> queryForPageItems(int begin, int pageSize) {
        String sql = "select * from cartrec limit ?,?";
        return queryForList(CartItem.class,sql,begin,pageSize);
    }


    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from cartrec";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }


    @Override
    public Integer queryForPageTotalCountByPrice(int min, int max) {
        String sql = "select count(*) from cartrec where pri between ? and ?";
        Number count = (Number) queryForSingleValue(sql,min,max);
        return count.intValue();
    }

    @Override
    public List<CartItem> queryForPageItemsByPrice(int begin, int pageSize, int min, int max) {
        String sql = "select * from product where pri between ? and ? order by pri limit ?,?";
        return queryForList(CartItem.class,sql,min,max,begin,pageSize);
    }
}
