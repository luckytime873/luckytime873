package com.guimei.zyh.pojo;


/***
 * 作者：朱宇欢
 */

//用户的收藏记录表
public class Gathering {
    private Integer id;
    private Integer uid;
    private Integer pid; //收藏的商品的id
    private String pName;//商品名称

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Gathering(Integer id, Integer uid, Integer pid) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
    }

    public Gathering() {
    }


}
