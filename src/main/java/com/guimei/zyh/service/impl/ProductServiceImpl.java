package com.guimei.zyh.service.impl;

import com.guimei.zyh.dao.ProductDao;
import com.guimei.zyh.dao.UserDao;
import com.guimei.zyh.dao.impl.ProductDaoImpl;
import com.guimei.zyh.dao.impl.UserDaoImpl;
import com.guimei.zyh.pojo.Page;
import com.guimei.zyh.pojo.Good;
import com.guimei.zyh.pojo.Shopper;
import com.guimei.zyh.service.ProductService;

import java.util.List;


/***
 * 作者：朱宇欢
 */

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao=new ProductDaoImpl();
    private final UserDao userDao=new UserDaoImpl();


    @Override
    public Integer getId(String pName) {
        return productDao.getId(pName);
    }

    @Override
    public Good getOneProduct(Integer pid) {
       return productDao.getProductById(pid);
    }

    @Override
    public Good getProductByPName(String pName) {
        Good product=productDao.getProductByName(pName);
        return product;
    }

    @Override
    public Good getProductByDes(String des) {
        return  productDao.gteProductByDes(des);
    }

    @Override
    public Integer addToCollection(Integer uid, Integer pid, String pName) {
        //获取商品编号然后加入收藏夹
        return  productDao.addToCollection(uid,pid,pName);
    }

    @Override
    public Shopper getSeller(String sname) {
        return productDao.getSeller(sname);
    }

    @Override
    public Page<Good> page(String catName, Integer pageNo, Integer pageSize) {

        Page<Good> page = new Page<Good>();

        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = productDao.queryForPageTotalCount();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);

        // 设置当前页码
        page.setPageNo(pageNo);

        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Good> items = productDao.queryForPageItems(catName,pageNo,pageSize);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }

}
