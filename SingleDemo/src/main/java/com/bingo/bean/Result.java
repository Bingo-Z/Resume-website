package com.bingo.bean;

import com.alibaba.fastjson.JSON;

public class Result {
    private int status;
    private String msg;
    private Object data;

    public Result(int i, String 工作经历新增成功) {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public Result(int status) {
        this.status = status;
    }

    public Result(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    public String toJSON(){
        return JSON.toJSONString(this);
    }
}
