<!--
 * 首页
 *
 * @Author: Besta
 * @Date: 2023-11-26
-->
<template>
    <div class="home">
        <swiper />
        <div class="section" v-for="(item, index) in songsList" :key="index">
            <div class="section-title"><i :class="item.icon" style="font-size: 34px;"></i><b style="font-size: 32px;"> {{ item.name }}</b></div>
            <content-list :contentList="item.list"></content-list>
        </div>
    </div>
</template>

<script>
import Swiper from "../components/Swiper";
import contentList from "../components/ContentList";
import { getAllSinger, getAllSongList } from "../api/index";
import {mapGetters} from 'vuex';
export default {
    name: "home",
    components: {
        Swiper,
        contentList,
    },
    computed:{
      ...mapGetters([
        'listOfSongs',      //当前播放列表
        'userId',           //当前登录用户id
      ])
    },
    data() {
        return {
            songsList: [
                { name: "歌单", list: [], icon:"iconfont icon-r-list" },
                { name: "歌手", list: [], icon:"iconfont icon-r-love" },
            ],
        };
    },
    created() {
        this.getSongList(this.userId);
        this.getSinger();
    },
    methods: {
        getSongList(userId) {
          console.log("userId == " + userId)
            //获取推荐歌单
            getAllSongList(userId)
                .then((res) => {
                    this.songsList[0].list = res.slice(0, 10);
                })
                .catch((e) => {
                    if (e.data == undefined) {
                        if (
                            e ==
                            "TypeError: Cannot read properties of undefined (reading 'status')"
                        ) {
                            e = "Network Error";
                        }
                        this.$message({
                            showClose: true,
                            message: e,
                            type: "error",
                            duration: 5000,
                        });
                    } else {
                        this.$message({
                            showClose: true,
                            message: e.data,
                            type: "error",
                            duration: 5000,
                        });
                    }
                });
        },
        getSinger() {
            //获取前十名歌手
            getAllSinger()
                .then((res) => {
                    this.songsList[1].list = res.slice(0, 10);
                })
                .catch((e) => {
                    if (e.data == undefined) {
                        if (
                            e ==
                            "TypeError: Cannot read properties of undefined (reading 'status')"
                        ) {
                            e = "Network Error";
                        }
                        this.$message({
                            showClose: true,
                            message: e,
                            type: "error",
                            duration: 5000,
                        });
                    } else {
                        this.$message({
                            showClose: true,
                            message: e.data,
                            type: "error",
                            duration: 5000,
                        });
                    }
                });
        },
    },
};
</script>

<style lang="scss" scoped>
@import "../assets/css/home.scss";
</style>
