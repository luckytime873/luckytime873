package com.guimei.zyh.pojo;


import java.util.List;

/***
 * 作者：朱宇欢
 */

public class User {
    private String username;
    private String mima;
    private Integer id;
    private Integer sex;
    private String hobby;
    private String hobby2;
    private String hobby3;
    private String email;
    //存储自己收藏的商品的id 根据id 查出商品的信息（展示）
    private List<Integer> collections;

    public User(String username, String mima, Integer id) {
        this.username = username;
        this.mima = mima;
        this.id = id;
    }

    public User() {
    }



    public User(String username, String mima, Integer id, Integer sex, String hobby, String hobby2, String hobby3, String email) {
        this.username = username;
        this.mima = mima;
        this.id = id;
        this.sex = sex;
        this.hobby = hobby;
        this.hobby2 = hobby2;
        this.hobby3 = hobby3;
        this.email = email;
    }

    public String getHobby2() {
        return hobby2;
    }

    public void setHobby2(String hobby2) {
        this.hobby2 = hobby2;
    }

    public String getHobby3() {
        return hobby3;
    }

    public void setHobby3(String hobby3) {
        this.hobby3 = hobby3;
    }


    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*    private String salt;*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }
/*
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }*/


}
