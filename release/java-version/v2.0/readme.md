当前版本v2.0

版本升级说明：

```
v1.0 版本只能解决一些最简单的数据爬取，如果页面内容是js异步请求而来就会存在问题。

v2.0去掉了HttpClient类库，使用Jsoup内置的请求库

v2.0支持爬取js加载的网页页面内容
```

核心思想

1.Jsoup延迟访问页面的内容

2.然后使用Jsoup将请求的结果解析成Document对象

3.根据Document API像操作JS一样访问页面

--- 

博文介绍：[Java爬虫获取某个页面中指定节点的内容](https://blog.csdn.net/hadues/article/details/88983055)
