package com.besta.music.service.impl;

import com.besta.music.entity.po.Rank;
import com.besta.music.mapper.RankMapper;
import com.besta.music.service.RankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 评价 服务层实现类
 *
 * @author: besta
 *
 */
@Service
@RequiredArgsConstructor
public class RankServiceImpl implements RankService {

    private final RankMapper rankMapper;

    /**
     * 新增评价
     *
     * @param rank 评价信息
     * @return 结果
     */
    @Override
    public Boolean insert(Rank rank) {
        return rankMapper.insert(rank) > 0;
    }

    /**
     * 计算平均分
     *
     * @param songListId 歌单id
     * @return 平均分
     */
    @Override
    public Integer rankOfSongListId(Integer songListId) {
        int rankNum = rankMapper.selectRankNum(songListId);
        if (rankNum == 0) {
            return 5;
        }
        return rankMapper.selectScoreSum(songListId) / rankNum;
    }

}
