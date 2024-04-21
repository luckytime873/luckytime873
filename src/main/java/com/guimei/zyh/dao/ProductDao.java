package com.guimei.zyh.dao;

import com.guimei.zyh.pojo.CartItem;
import com.guimei.zyh.pojo.Good;
import com.guimei.zyh.pojo.Shopper;

import java.util.List;

/***
 * 作者：朱宇欢
 */

public interface ProductDao {

    public Good getProductById(Integer pid);
    public Good getProductByName(String pName);
    public Good gteProductByDes(String des);

    public Shopper getSeller(String sname);

    public Integer getId(String pName);  //查询出商品对应id；

    public Integer getProductFromRec(Integer uid,Integer pid);

    Integer addToCollection(Integer pid, Integer uid, String pName);


    //根据类别分页查询商品信息
    List<Good> queryForPageItems(String catName, int begin, int pageSize);

    Integer queryForPageTotalCount();

    Integer queryForPageTotalCountByPrice(int min, int max);

    List<CartItem> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
