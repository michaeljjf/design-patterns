package com.jiangjf.dp.chain;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public interface Filter {
    /**
     * 执行过滤
     *
     * @param message 消息体
     */
    void doFilter(Message message);
}