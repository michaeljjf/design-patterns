package com.jiangjf.dp.chain;

/**
 * 责任链模式
 *
 * @author jiangjf
 * @date 2022/2/19
 */
public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("<script>我是一名程序员，天天996</script>");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter())
                .add(new SensitiveFilter())
                .run(message);
        System.out.println(message);
    }
}
