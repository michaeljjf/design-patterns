责任链模式
模拟Servlet的Filter、FilterChain，同时处理Request、Response
先处理Request，返回时反向执行Response处理，要达到的效果如下：
Request--HtmlFilter()--SensitiveFilter()
Response--SensitiveFilter()--HtmlFilter()