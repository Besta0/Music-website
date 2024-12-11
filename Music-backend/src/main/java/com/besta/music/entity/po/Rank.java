package com.besta.music.entity.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 评价
 *
 * @author: besta
 *
 */
@Data
public class Rank implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer songListId;

    /**
     * 用户id
     */
    private Integer consumerId;

    /**
     * 评分
     */
    private Integer score;

}
