package com.besta.music.service.impl;

import com.besta.music.entity.po.ListSong;
import com.besta.music.mapper.ListSongMapper;
import com.besta.music.service.ListSongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌单里面歌曲 服务层实现类
 *
 * @author: besta
 *
 */
@Service
@RequiredArgsConstructor
public class ListSongServiceImpl implements ListSongService {

    private final ListSongMapper listSongMapper;

    /**
     * 给歌单添加歌曲
     *
     * @param listSong 歌单信息
     * @return 添加结果
     */
    @Override
    public Boolean insert(ListSong listSong) {
        return listSongMapper.insert(listSong) > 0;
    }

    /**
     * 修改歌单里歌曲
     *
     * @param listSong 歌单里歌曲
     * @return 结果
     */
    @Override
    public Boolean update(ListSong listSong) {
        return listSongMapper.update(listSong) > 0;
    }

    /**
     * 删除歌单里歌曲
     *
     * @param id 歌曲id
     * @return 结果
     */
    @Override
    public Boolean delete(Integer id) {
        return listSongMapper.delete(id) > 0;
    }

    /**
     * 删除歌单里的歌曲
     *
     * @param songId     歌曲id
     * @param songListId 歌单id
     * @return 删除结果
     */
    @Override
    public Boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId) {
        return listSongMapper.deleteBySongIdAndSongListId(songId, songListId) > 0;
    }

    /**
     * 查询歌单里的歌曲
     *
     * @param id 歌曲id
     * @return 结果
     */
    @Override
    public ListSong selectByPrimaryKey(Integer id) {
        return listSongMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据歌单id查询歌曲
     *
     * @param songListId 歌单id
     * @return 歌曲列表
     */
    @Override
    public List<ListSong> listSongOfSongListId(Integer songListId) {
        return listSongMapper.listSongOfSongListId(songListId);
    }

}
