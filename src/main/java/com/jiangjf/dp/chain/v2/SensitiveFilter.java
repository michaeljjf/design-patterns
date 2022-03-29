package com.jiangjf.dp.chain.v2;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.setBody(request.getBody() + "--SensitiveFilter()");
        chain.doFilter(request, response);
        response.setBody(response.getBody() + "--SensitiveFilter()");
        return true;
    }
}
