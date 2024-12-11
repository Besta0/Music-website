package com.besta.music.service;

import com.besta.music.entity.po.Rank;

/**
 * 评价 服务层
 *
 * @author: besta
 *
 */
public interface RankService {

    /**
     * 新增评价
     *
     * @param rank 评价信息
     * @return 结果
     */
    Boolean insert(Rank rank);

    /**
     * 计算平均分
     *
     * @param songListId 歌单id
     * @return 平均分
     */
    Integer rankOfSongListId(Integer songListId);
}
