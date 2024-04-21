package com.guimei.zyh.pojo;


/***
 * 作者：朱宇欢
 */

//接收购物车记录表和商品表连表查询的信息
public class ProductInCart {
    private Integer pName;//产品名称
    private Integer pri;//产品原价
    private float discount;//产品折扣
    private Integer num;//产品数量

    public ProductInCart() {
    }

    public Integer getpName() {
        return pName;
    }

    public void setpName(Integer pName) {
        this.pName = pName;
    }

    public Integer getPri() {
        return pri;
    }

    public void setPri(Integer pri) {
        this.pri = pri;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
