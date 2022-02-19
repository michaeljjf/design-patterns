package com.jiangjf.dp.chain;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("996", "955");
        message.setMsg(msg);
    }
}
