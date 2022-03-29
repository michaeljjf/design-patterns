package com.jiangjf.dp.chain.v2;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.setBody("Request");
        Response response = new Response();
        response.setBody("Response");

        FilterChain chain = new FilterChain();
        chain.add(new HtmlFilter())
                .add(new SensitiveFilter())
                .doFilter(request, response);

        System.out.println(request.getBody());
        System.out.println(response.getBody());
    }
}
