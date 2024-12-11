package com.besta.music.controller;

import com.besta.music.common.R;
import com.besta.music.entity.po.Collect;
import com.besta.music.service.CollectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 收藏 控制层
 *
 * @author: besta
 * 1
 */
@RestController
@RequestMapping("/collect")
@RequiredArgsConstructor
public class CollectController {

    private final CollectService collectService;

    /**
     * 添加收藏
     *
     * @param userId 用户id
     * @param type   收藏类型（0歌曲1歌单）
     * @param songId 歌曲id
     * @return 添加结果
     */
    @PostMapping(value = "/add")
    public R addCollect(Integer userId, Byte type, Integer songId) {
        if (songId == null) {
            return R.error("收藏歌曲为空");
        }
        if (collectService.existSongId(userId, songId)) {
            deleteCollect(userId,songId);
            return R.ok("取消收藏成功");
        }
        //保存到收藏的对象中
        Collect Collect = new Collect();
        Collect.setUserId(userId);
        Collect.setType(type);
        Collect.setSongId(songId);
        //保存成功
        if (collectService.insert(Collect)) {
            return R.ok("收藏成功");
        }

        return R.error("收藏失败");
    }

    /**
     * 删除收藏
     *
     * @param userId 用户id
     * @param songId 歌曲id
     * @return 删除结果
     */
    @GetMapping(value = "/delete")
    public Boolean deleteCollect(Integer userId, Integer songId) {
        return collectService.deleteByUserIdSongId(userId, songId);
    }

    /**
     * 查询所有收藏
     *
     * @return 收藏列表
     */
    @GetMapping(value = "/allCollect")
    public List<Collect> allCollect() {
        return collectService.allCollect();
    }

    /**
     * 查询某个用户的收藏列表
     *
     * @param userId 用户id
     * @return 收藏列表
     */
    @GetMapping(value = "/collectOfUserId")
    public List<Collect> collectOfUserId(Integer userId) {
        return collectService.collectOfUserId(userId);
    }

}
