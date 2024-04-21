package com.guimei.zyh.pojo;


/***
 * 作者：朱宇欢
 */

//商品类别描述
public class Classification {
    private Integer id;//商品的编号
    private String catName;//商品类别名称

    public Classification(Integer id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public Classification() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }


}
