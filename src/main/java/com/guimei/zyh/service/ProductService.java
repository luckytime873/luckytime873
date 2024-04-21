package com.guimei.zyh.service;

import com.guimei.zyh.pojo.Page;
import com.guimei.zyh.pojo.Good;
import com.guimei.zyh.pojo.Shopper;

/***
 * 作者：朱宇欢
 */

public interface ProductService {
    public Integer getId(String pName);
    public Good getOneProduct(Integer pid);
    public Good getProductByPName(String pName);
    public Good getProductByDes(String des);
    public Integer addToCollection(Integer uid,Integer pid, String pName);
    //收藏记录表
    //加入用户的收藏夹
    public Shopper getSeller(String sname);
    public Page<Good> page(String catName, Integer pageNo, Integer pageSize);

}
