package com.jiangjf.dp.chain;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class Message {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
