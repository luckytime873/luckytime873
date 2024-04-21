package com.guimei.zyh.pojo;

/***
 * 作者：朱宇欢
 */
public class Shopper {


    private Integer id;
    private String sname;
    private String phone;//联系电话
    private String des;//商家描述
    private Integer credit; //信誉度
    private Integer cmp; //差评数量  //也可以存储差评内容

    public Shopper() {
    }
    public Shopper(Integer id, String sname, String phone, String des, Integer credit, Integer cmp) {
        this.id = id;
        this.sname = sname;
        this.phone = phone;
        this.des = des;
        this.credit = credit;
        this.cmp = cmp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getCmp() {
        return cmp;
    }

    public void setCmp(Integer cmp) {
        this.cmp = cmp;
    }


}
