package com.besta.music.mapper;

import com.besta.music.entity.po.Collect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 收藏 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface CollectMapper {

    /**
     * 添加收藏
     *
     * @param collect 收藏信息
     * @return 结果
     */
    Integer insert(Collect collect);

    /**
     * 删除收藏
     *
     * @param id id
     * @return 结果
     */
    Integer delete(Integer id);

    /**
     * 删除收藏
     *
     * @param userId 用户id
     * @param songId 歌曲id
     * @return 删除结果
     */
    Integer deleteByUserIdSongId(@Param("userId") Integer userId, @Param("songId") Integer songId);

    /**
     * 查询所有收藏
     *
     * @return 收藏列表
     */
    List<Collect> allCollect();

    /**
     * 查询某个用户的收藏列表
     *
     * @param userId 用户id
     * @return 收藏列表
     */
    List<Collect> collectOfUserId(Integer userId);

    /**
     * 查询某个用户是否已经收藏了某个歌曲
     *
     * @param userId 用户id
     * @param songId 歌曲id
     * @return 是否收藏
     */
    Integer existSongId(@Param("userId") Integer userId, @Param("songId") Integer songId);

}
