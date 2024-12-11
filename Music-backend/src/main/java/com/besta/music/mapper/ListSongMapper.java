package com.besta.music.mapper;

import com.besta.music.entity.po.ListSong;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 歌单里面歌曲 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface ListSongMapper {

    /**
     * 给歌单添加歌曲
     *
     * @param listSong 歌单信息
     * @return 添加结果
     */
    Integer insert(ListSong listSong);

    /**
     * 修改歌单里面歌曲
     *
     * @param listSong 歌单里面歌曲信息
     * @return 结果
     */
    Integer update(ListSong listSong);

    /**
     * 给歌单删除歌曲
     *
     * @param id 歌曲id
     * @return 结果
     */
    Integer delete(Integer id);

    /**
     * 删除歌单里的歌曲
     *
     * @param songId     歌曲id
     * @param songListId 歌单id
     * @return 删除结果
     */
    Integer deleteBySongIdAndSongListId(Integer songId, Integer songListId);

    /**
     * 根据主键查询歌单里面歌曲
     *
     * @param id 歌曲id
     * @return 歌曲列表
     */
    ListSong selectByPrimaryKey(Integer id);

    /**
     * 根据歌单id查询歌曲
     *
     * @param songListId 歌单id
     * @return 歌曲列表
     */
    List<ListSong> listSongOfSongListId(Integer songListId);

    /**
     * 查询所有歌曲列表
     *
     * @return 歌曲列表
     */
    List<ListSong> allListSong();

}
