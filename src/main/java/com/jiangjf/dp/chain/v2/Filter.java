package com.jiangjf.dp.chain.v2;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public interface Filter {
    /**
     * 执行过滤
     *
     * @param request
     * @param response
     * @param chain
     */
    boolean doFilter(Request request, Response response, FilterChain chain);
}
