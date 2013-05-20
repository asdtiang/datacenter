s2sh
====
maven管理，直接导入myeclipse10就可以了，myeclipse10集成了maven,这个比较好。

strut2，hibernate4，jpa2，spring3的一个基本架构
dao层采用spring data和jpa一起实现。

spring data好处就是提供了分页实现，写一个接口就可以了，但不能写成共用方法，这也是一个问题。
封装下jpa可以实现通用的crud操作。

页面没有采用struts2的插件jquery实现ajax，直接引用的jquery库实现ajax。


struts2 的<sj:a href="url">text</sj:a> 这里的url不支持el表达式，当<s:url>也不支持。这让人非常的郁闷