package com.besta.music.service.impl;

import com.besta.music.entity.po.Collect;
import com.besta.music.mapper.CollectMapper;
import com.besta.music.service.CollectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收藏 服务层实现类
 *
 * @author: besta
 *
 */
@Service
@RequiredArgsConstructor
public class CollectServiceImpl implements CollectService {

    private final CollectMapper collectMapper;

    /**
     * 添加收藏
     *
     * @param collect 收藏信息
     * @return 结果
     */
    @Override
    public Boolean insert(Collect collect) {
        return collectMapper.insert(collect) > 0;
    }

    /**
     * 删除收藏
     *
     * @param id 收藏id
     * @return 结果
     */
    @Override
    public Boolean delete(Integer id) {
        return collectMapper.delete(id) > 0;
    }

    /**
     * 删除收藏
     *
     * @param userId 用户id
     * @param songId 歌曲id
     * @return 删除结果
     */
    @Override
    public Boolean deleteByUserIdSongId(Integer userId, Integer songId) {
        return collectMapper.deleteByUserIdSongId(userId, songId) > 0;
    }

    /**
     * 查询所有收藏
     *
     * @return 收藏列表
     */
    @Override
    public List<Collect> allCollect() {
        return collectMapper.allCollect();
    }

    /**
     * 查询某个用户的收藏列表
     *
     * @param userId 用户id
     * @return 收藏列表
     */
    @Override
    public List<Collect> collectOfUserId(Integer userId) {
        return collectMapper.collectOfUserId(userId);
    }

    /**
     * 查询某个用户是否已经收藏了某个歌曲
     *
     * @param userId 用户id
     * @param songId 歌曲id
     * @return 是否收藏
     */
    @Override
    public Boolean existSongId(Integer userId, Integer songId) {
        return collectMapper.existSongId(userId, songId) > 0;
    }
}
