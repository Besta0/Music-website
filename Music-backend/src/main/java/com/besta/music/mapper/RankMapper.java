package com.besta.music.mapper;

import com.besta.music.entity.po.Rank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 评价 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface RankMapper {

    /**
     * 新增评价
     *
     * @param rank 评价信息
     * @return 结果
     */
    Integer insert(Rank rank);

    /**
     * 查总分
     *
     * @param songListId 歌单
     * @return 总分
     */
    Integer selectScoreSum(Integer songListId);

    /**
     * 查总评分人数
     *
     * @param songListId 歌单
     * @return 查总评分人数
     */
    Integer selectRankNum(Integer songListId);

    /**
     * 查询所有评分记录
     *
     * @return 评分记录
     */
    List<Rank> selectRanks();

}
