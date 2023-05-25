package com.seig.consumer1;

public class ActionResult {

    private Integer statueCode;
    private String msg;
    private Object data;

    public ActionResult() {
    }

    public ActionResult(Integer statueCode, String msg, Object data) {
        this.statueCode = statueCode;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatueCode() {
        return statueCode;
    }

    public void setStatueCode(Integer statueCode) {
        this.statueCode = statueCode;
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
