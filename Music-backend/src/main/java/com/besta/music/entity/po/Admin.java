package com.besta.music.entity.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员
 *
 * @author: besta
 *
 */
@Data
public class Admin implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 账号
     */
    private String name;

    /**
     * 密码
     */
    private String password;

}
