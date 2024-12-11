package com.besta.music.service.impl;

import com.besta.music.entity.po.Song;
import com.besta.music.mapper.SongMapper;
import com.besta.music.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌曲 服务层实现类
 *
 * @author: besta
 *
 */
@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {

    private final SongMapper songMapper;

    /**
     * 添加歌曲
     *
     * @param song 歌曲信息
     * @return 结果
     */
    @Override
    public Boolean insert(Song song) {
        return songMapper.insert(song) > 0;
    }

    /**
     * 更新歌曲
     *
     * @param song 歌曲信息
     * @return 结果
     */
    @Override
    public Boolean update(Song song) {
        return songMapper.update(song) > 0;
    }

    /**
     * 删除歌曲
     *
     * @param id 歌曲id
     * @return 删除结果
     */
    @Override
    public Boolean delete(Integer id) {
        return songMapper.delete(id) > 0;
    }

    /**
     * 根据歌曲id查询歌曲对象
     *
     * @param id 歌曲id
     * @return 歌曲
     */
    @Override
    public Song selectByPrimaryKey(Integer id) {
        return songMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有歌曲
     *
     * @return 歌曲列表
     */
    @Override
    public List<Song> allSong() {
        return songMapper.allSong();
    }

    /**
     * 根据歌手名字精确查询歌曲
     *
     * @param name 歌手名
     * @return 歌曲列表
     */
    @Override
    public List<Song> songOfName(String name) {
        return songMapper.songOfName(name);
    }

    /**
     * 根据歌手名字模糊查询歌曲
     *
     * @param name 歌手名称
     * @return 歌曲列表
     */
    @Override
    public List<Song> likeSongOfName(String name) {
        return songMapper.likeSongOfName("%" + name + "%");
    }


    /**
     * 根据歌手id查询歌曲
     *
     * @param singerId 歌手id
     * @return 歌曲列表
     */
    @Override
    public List<Song> songOfSingerId(Integer singerId) {
        return songMapper.songOfSingerId(singerId);
    }

}
