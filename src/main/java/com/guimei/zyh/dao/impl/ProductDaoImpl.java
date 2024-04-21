package com.guimei.zyh.dao.impl;

import com.guimei.zyh.dao.ProductDao;
import com.guimei.zyh.pojo.CartItem;
import com.guimei.zyh.pojo.Good;
import com.guimei.zyh.pojo.Shopper;

import java.util.List;

/***
 * 作者：朱宇欢
 */
public class ProductDaoImpl extends BaseDao implements ProductDao {


    @Override
    public Good getProductById(Integer pid) {
        String sql="select * from product where pid=?";
        return queryForOne(Good.class,sql,pid);
    }

    @Override
    public Good getProductByName(String pName) {
        String sql="select * from product where pName = ? ";
        return queryForOne(Good.class,sql,pName);
    }

    @Override
    public Good gteProductByDes(String des) {
        String sql="select * from product where des=? ";
        return queryForOne(Good.class,sql,des);
    }

    @Override
    public Shopper getSeller(String sname) {
        String sql="select * from seller where sname =?  ";
        return queryForOne(Shopper.class,sql,sname);
    }


    @Override
    public Integer getId(String pName) {
        String sql="select * from product where pName = ?";
        return queryForOne(Integer.class,sql,pName);
    }

    @Override
    public Integer getProductFromRec(Integer uid, Integer pid) {
        return null;
    }

    @Override
    public Integer addToCollection(Integer pid,Integer uid,String pName) {
        String sql="insert into collection(uid,pid,pName)values(uid,pid,pName)";
        return update(sql,uid,pid,pName);
    }



    //根据类别分页查询商品信息
    @Override
    public List<Good> queryForPageItems(String catName, int begin, int pageSize) {
        String sql = "select * from product where catName=?  limit ?,?";
        return queryForList(Good.class,sql,begin,pageSize);
    }


    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from product";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }


    @Override
    public Integer queryForPageTotalCountByPrice(int min, int max) {
        String sql = "select count(*) from product where pri between ? and ?";
        Number count = (Number) queryForSingleValue(sql,min,max);
        return count.intValue();
    }

    @Override
    public List<CartItem> queryForPageItemsByPrice(int begin, int pageSize, int min, int max) {
        String sql = "select * from product where pri between ? and ? order by pri limit ?,?";
        return queryForList(CartItem.class,sql,min,max,begin,pageSize);
    }



}
