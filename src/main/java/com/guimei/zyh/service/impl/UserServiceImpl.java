package com.guimei.zyh.service.impl;

import com.guimei.zyh.dao.UserDao;
import com.guimei.zyh.dao.impl.UserDaoImpl;
import com.guimei.zyh.pojo.User;
import com.guimei.zyh.service.UserService;

/***
 * 作者：朱宇欢
 */

public class UserServiceImpl  implements UserService {


    /**
     * 声明一个UserDao接口的实例，使用其实现类UserDaoImpl进行初始化。
     * 这个实例将用于后续的数据库操作。
     */
    private UserDao userDao = new UserDaoImpl();

    /**
     * 检查用户名是否存在的方法。
     *
     * @param username 要检查的用户名
     * @return 如果用户名存在，则返回对应的User对象；如果不存在，则返回null。
     */
    @Override
    public User existUser(String username) {
        User user = userDao.getUser(username);
        return user;
    }

    /**
     * 添加一个新用户的方法。
     *
     * @param user 要添加的用户对象
     * @return 插入操作的结果，通常是新插入用户的ID或插入状态
     */
    @Override
    public Integer addUser(User user) {
        return userDao.insertUser(user);
    }

    /**
     * 根据用户名获取用户ID的方法。
     *
     * @param userName 用户名
     * @return 对应的用户ID，如果找不到则返回null或特定错误值
     */
    @Override
    public Integer getUid(String userName) {
        return userDao.getUid(userName);
    }

    /**
     * 删除一个用户的方法。
     *
     * @param username 要删除的用户名
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    @Override
    public Integer deleteUser(String username) {
        return userDao.deleteUser(username);
    }

    /**
     * 更新用户密码的方法（当前实现未完成）。
     *
     * @param username 用户名
     * @param mima 新密码
     * @return 更新操作的结果，当前返回null，需要实现具体的更新逻辑
     */
    @Override
    public Integer updateUser(String username, String mima) {
        // 需要实现具体的更新逻辑
        return null;
    }

    /**
     * 修改用户信息的方法（当前实现未完成）。
     *
     * @param user 更新后的用户对象
     * @return 修改操作的结果，当前返回null，需要实现具体的修改逻辑
     */
    @Override
    public Integer modifiedUser(User user) {
        // 需要实现具体的修改逻辑
        return null;
    }
}
