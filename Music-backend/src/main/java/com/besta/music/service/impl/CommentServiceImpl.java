package com.besta.music.service.impl;

import com.besta.music.entity.po.Comment;
import com.besta.music.mapper.CommentMapper;
import com.besta.music.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论 服务层实现类
 *
 * @author: besta
 *
 */
@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    /**
     * 添加评论
     *
     * @param comment 评论内容
     * @return 添加结果
     */
    @Override
    public Boolean insert(Comment comment) {
        return commentMapper.insert(comment) > 0;
    }

    /**
     * 修改评论
     *
     * @param comment 评论内容
     * @return 修改结果
     */
    @Override
    public Boolean update(Comment comment) {
        return commentMapper.update(comment) > 0;
    }

    /**
     * 删除评论
     *
     * @param id 评论id
     * @return 删除结果
     */
    @Override
    public Boolean delete(Integer id) {
        return commentMapper.delete(id) > 0;
    }

    /**
     * 通过主键查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    @Override
    public Comment selectByPrimaryKey(Integer id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有评论
     *
     * @return 所有评论
     */
    @Override
    public List<Comment> allComment() {
        return commentMapper.allComment();
    }

    /**
     * 查询某个歌曲下的所有评论
     *
     * @param songId 歌曲id
     * @return 评论列表
     */
    @Override
    public List<Comment> commentOfSongId(Integer songId) {
        return commentMapper.commentOfSongId(songId);
    }

    /**
     * 查询某个歌单下的所有评论
     *
     * @param songListId 歌单id
     * @return 评论列表
     */
    @Override
    public List<Comment> commentOfSongListId(Integer songListId) {
        return commentMapper.commentOfSongListId(songListId);
    }

}
