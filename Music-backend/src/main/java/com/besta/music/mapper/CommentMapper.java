package com.besta.music.mapper;

import com.besta.music.entity.po.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 评论 持久层
 *
 * @author: besta
 *
 */
@Mapper
public interface CommentMapper {

    /**
     * 添加评论
     *
     * @param comment 评论内容
     * @return 添加结果
     */
    Integer insert(Comment comment);

    /**
     * 修改评论
     *
     * @param comment 评论内容
     * @return 修改结果
     */
    Integer update(Comment comment);

    /**
     * 删除评论
     *
     * @param id 评论id
     * @return 删除结果
     */
    Integer delete(Integer id);

    /**
     * 通过主键查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * 查询所有评论
     *
     * @return 所有评论
     */
    List<Comment> allComment();

    /**
     * 查询某个歌曲下的所有评论
     *
     * @param songId 歌曲id
     * @return 评论列表
     */
    List<Comment> commentOfSongId(Integer songId);

    /**
     * 查询某个歌单下的所有评论
     *
     * @param songListId 歌单id
     * @return 评论列表
     */
    List<Comment> commentOfSongListId(Integer songListId);
}

