package com.jiangjf.dp.chain;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class HtmlFilter implements Filter{
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("<", "【");
        msg = msg.replace(">", "】");
        message.setMsg(msg);
    }
}
