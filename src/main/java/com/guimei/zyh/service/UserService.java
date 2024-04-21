package com.guimei.zyh.service;

import com.guimei.zyh.pojo.User;

/***
 * 作者：朱宇欢
 */

public interface UserService  {
    /**
     * 检查用户名是否存在的方法。
     *
     * @param username 要检查的用户名
     * @return 如果用户名存在，则返回对应的User对象；如果不存在，则返回null。
     */
    public User existUser(String username);

    /**
     * 添加新用户的方法。
     *
     * @param user 要添加的用户对象
     * @return 添加操作的结果，通常是新插入用户的ID或添加状态
     */
    public Integer addUser(User user);

    /**
     * 根据用户名获取用户ID的方法。
     *
     * @param userName 用户名
     * @return 对应的用户ID，如果找不到则返回null或特定错误值
     */
    public Integer getUid(String userName);

    /**
     * 删除用户的方法。
     *
     * @param username 要删除的用户名
     * @return 删除操作的结果，通常是影响的记录数或删除状态
     */
    public Integer deleteUser(String username);

    /**
     * 更新用户密码的方法。
     *
     * @param username 用户名
     * @param mima 新密码
     * @return 更新操作的结果，通常是影响的记录数或更新状态
     */
    public Integer updateUser(String username, String mima);

    /**
     * 修改用户信息的方法。
     *
     * @param user 更新后的用户对象
     * @return 修改操作的结果，通常是影响的记录数或修改状态
     */
    public Integer modifiedUser(User user);


}
