package com.gjw.common.vo;

import java.io.Serializable;

/**
 * @Auther: zz-gjw
 * @Date: 2019/1/15 11:36
 * @Description:非分页查询结果集
 */
public class ResultVO implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

}
