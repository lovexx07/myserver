package com.rechblend.px.domain;

import java.io.Serializable;

public class JsonData implements Serializable {
    //状态吗 0表示成功 -1表示失败
    private int code;

    private Object data;
    private String msg;

    public static JsonData buildSuccess(String msg){
        return new JsonData(1, "success", msg);
    }

    public static JsonData buildSuccess(){
        return new JsonData(1, "success", null);
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
