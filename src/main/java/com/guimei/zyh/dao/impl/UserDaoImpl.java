package com.guimei.zyh.dao.impl;

import com.guimei.zyh.dao.UserDao;
import com.guimei.zyh.pojo.User;


/***
 * 作者：朱宇欢
 */

public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public User getUser(String username) {
        String sql = "select `id` , `username` , `mima` from  user where username = ?";
        return queryForOne(User.class, sql,username);
    }


    @Override
    public Integer deleteUser(String username) {
        String sql = "delete from t_book where username = ?";
            return update(sql, username);
    }

    @Override
    public Integer insertUser(User user) {
        String sql = "insert into user(`username`,`mima`)values(?,?)";
        return update(sql, user.getUsername(),user.getMima());
    }

    @Override
    public Integer getUid(String userName) {
        String sql="select uid from user where username =?";
        return queryForOne(Integer.class,sql,userName);
    }





}
