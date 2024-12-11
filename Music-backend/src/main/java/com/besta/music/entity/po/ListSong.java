package com.besta.music.entity.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 歌单里面的歌曲
 *
 * @author: besta
 *
 */
@Data
public class ListSong implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 歌曲id
     */
    private Integer songId;

    /**
     * 歌单id
     */
    private Integer songListId;

}
