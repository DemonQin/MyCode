package org.example.po;

public class ResultInfo {
    private Integer code=200;
    private String msg="suucess";

    private Object result;

    public void setResult(Object result) {
        this.result = result;
    }


    @Override
    public String toString() {
        return "ResultInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
