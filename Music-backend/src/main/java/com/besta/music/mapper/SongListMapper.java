package com.besta.music.mapper;

import com.besta.music.entity.po.SongList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 歌单 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface SongListMapper {

    /**
     * 添加歌单
     *
     * @param songList 歌单信息
     * @return 结果
     */
    Integer insert(SongList songList);

    /**
     * 修改歌单
     *
     * @param songList 歌单信息
     * @return 结果
     */
    Integer update(SongList songList);

    /**
     * 删除歌单
     *
     * @param id 歌单id
     * @return 删除结果
     */
    Integer delete(Integer id);

    /**
     * 查询歌单
     *
     * @param id 歌单id
     * @return 歌单
     */
    SongList selectByPrimaryKey(Integer id);

    /**
     * 查询所有歌单
     *
     * @return 歌单列表
     */
    List<SongList> allSongList();

    /**
     * 根据标题精确查询歌单列表
     *
     * @param title 标题
     * @return 歌单列表
     */
    List<SongList> songListOfTitle(String title);

    /**
     * 根据标题模糊查询歌单列表
     *
     * @param title 标题
     * @return 歌单列表
     */
    List<SongList> likeTitle(String title);

    /**
     * 根据风格模糊查询歌单列表
     *
     * @param style 歌单风格
     * @return 歌单列表
     */
    List<SongList> likeStyle(String style);

}
