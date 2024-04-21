package com.guimei.zyh.pojo;


/***
 * 作者：朱宇欢
 */
public class Order {
    private Integer id;
    private Integer uid;
    private Integer num;//用户购买的商品数量
    private Float total;//用户需要支付的总金额
    private Float youhui;//优惠

    private  int statusOfOrder;

    public int getStatusOfOrder() {
        return statusOfOrder;
    }

    public void setStatusOfOrder(int statusOfOrder) {
        this.statusOfOrder = statusOfOrder;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getYouhui() {
        return youhui;
    }

    public void setYouhui(Float youhui) {
        this.youhui = youhui;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
