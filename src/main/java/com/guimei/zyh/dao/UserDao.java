package com.guimei.zyh.dao;

import com.guimei.zyh.pojo.User;

/***
 * 作者：朱宇欢
 */
public interface UserDao  {
    public Integer getUid(String userName);

    public User getUser(String username);

    public  Integer deleteUser(String username);

    public Integer insertUser(User user);
}
