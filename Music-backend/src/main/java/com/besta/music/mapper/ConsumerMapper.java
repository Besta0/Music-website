package com.besta.music.mapper;

import com.besta.music.entity.po.Consumer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 前台用户相关 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface ConsumerMapper {

    /**
     * 添加前台用户
     *
     * @param consumer 前台用户信息
     * @return 结果
     */
    Integer insert(Consumer consumer);

    /**
     * 修改前台用户
     *
     * @param consumer 前台用户信息
     * @return 结果
     */
    Integer update(Consumer consumer);

    /**
     * 删除
     *
     * @param id 前台用户id
     * @return 结果
     */
    Integer delete(Integer id);

    /**
     * 根据主键查询整个对象
     *
     * @param id 主键id
     * @return 前台用户
     */
    Consumer selectByPrimaryKey(Integer id);

    /**
     * 查询所有前台用户
     *
     * @return 前台用户
     */
    List<Consumer> allConsumer();

    /**
     * 查看密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    Integer verifyPassword(String username, String password);

    /**
     * 根据账号查询
     *
     * @param username 账户名
     * @return 前台用户
     */
    Consumer getByUsername(String username);

}
