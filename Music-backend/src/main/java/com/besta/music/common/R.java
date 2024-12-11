package com.besta.music.common;


import lombok.Data;

/**
 * 接口返回对象封装 - Result
 *
 * @author: besta
 */
@Data
public class R<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 状态消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R ok(Object data) {
        return new R(0, "成功", data);
    }

    public static R ok(String msg, Object data) {
        return new R(1, msg, data);
    }

    public static R ok(String msg) {
        return new R(1, msg, Boolean.TRUE);
    }

    public static R error(String msg) {
        return new R(0, msg, Boolean.FALSE);
    }

    public static R error(int code, String msg) {
        return new R(code, msg, Boolean.FALSE);
    }
}
