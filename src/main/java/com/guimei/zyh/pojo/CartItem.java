package com.guimei.zyh.pojo;


import java.util.Date;

/***
 * 作者：朱宇欢
 */


//没有生成订单之前 用户可以对购物车进行修改 -》》修改购物车里面商品数量 删除相关的商品
//生成订单的时候用户从购物车里面选出相应的商品生成订单
//购物车记录表格 和cart 表格进行链表查询  取出购物车李的商品 生成对应的订单  用户在前端也米娜勾选
public class CartItem {
    private Integer id;
    private Integer cid;
    private Integer pid; //和商品记录表进行连表查询
    private float pri;//商品原价
    private float discount;//商品折扣
    private String pName;//商品名称
    private float total;//商品总价格
    private Integer num;
    private Integer uid;
    private Date date;//商品加入购物车的时间 根据时间从达到小排序查出所有的购物记录(分页）
    // 用户在前端勾选相应的购物记录的时候，获取所有的被勾选的购物记录的id，传送给后台，后台根据购物车生成相应的订单


    public CartItem() {
    }

    public CartItem(Integer id, Integer cid, Integer pid, float pri, float discount, String pName, float total, Integer num, Integer uid, Date date) {
        this.id = id;
        this.cid = cid;
        this.pid = pid;
        this.pri = pri;
        this.discount = discount;
        this.pName = pName;
        this.total = total;
        this.num = num;
        this.uid = uid;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public float getPri() {
        return pri;
    }

    public void setPri(float pri) {
        this.pri = pri;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}