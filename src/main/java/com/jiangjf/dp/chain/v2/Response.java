package com.jiangjf.dp.chain.v2;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class Response {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "body='" + body + '\'' +
                '}';
    }
}
