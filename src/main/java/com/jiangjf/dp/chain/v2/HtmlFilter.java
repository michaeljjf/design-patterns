package com.jiangjf.dp.chain.v2;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.setBody(request.getBody() + "--HtmlFilter()");
        chain.doFilter(request, response);
        response.setBody(response.getBody() + "--HtmlFilter()");
        return true;
    }
}
