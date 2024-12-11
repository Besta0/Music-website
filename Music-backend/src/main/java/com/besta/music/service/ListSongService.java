package com.besta.music.service;

import com.besta.music.entity.po.ListSong;

import java.util.List;

/**
 * 歌单里面歌曲 服务层
 *
 * @author: besta
 *
 */
public interface ListSongService {

    /**
     * 给歌单添加歌曲
     *
     * @param listSong 歌单信息
     * @return 添加结果
     */
    Boolean insert(ListSong listSong);

    /**
     * 修改歌单里歌曲
     *
     * @param listSong 歌单里歌曲
     * @return 结果
     */
    Boolean update(ListSong listSong);

    /**
     * 删除歌单里歌曲
     *
     * @param id 歌曲id
     * @return 结果
     */
    Boolean delete(Integer id);

    /**
     * 删除歌单里的歌曲
     *
     * @param songId     歌曲id
     * @param songListId 歌单id
     * @return 删除结果
     */
    Boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId);

    /**
     * 根据主键查询整个对象
     */
    ListSong selectByPrimaryKey(Integer id);

    /**
     * 根据歌单id查询歌曲
     *
     * @param songListId 歌单id
     * @return 歌曲列表
     */
    List<ListSong> listSongOfSongListId(Integer songListId);

}
