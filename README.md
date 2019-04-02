# SmartWebCrawler

该项目提供一个Java和Python 网络爬虫的简易解决方案~

# Java 网络爬虫解决方案

it is an easy Web Crawler with JSoup.
它是一个简单的基于JSoup的网络爬虫框架

使用语言：Java
相关类库：Jsoup

```
1. added depdendency in your POM.xml 
1. 添加项目依赖

```
              <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->   
		<dependency>   
			<groupId>org.jsoup</groupId>    
			<artifactId>jsoup</artifactId>   
			<version>1.11.3</version>   
		</dependency>  
```		
3.then you can use it in the main method  like as below:
3.然后你可以使用它在主方法中这样调用
```
public class App {
	
	private static String URL="http://m.kaijiang.caishencai.com/cqssc/";
	public static void main(String[] args) throws IOException {
		
		//通过延迟2000毫秒然后再去请求可解决js异步加载获取不到数据的问题
		Document doc=Jsoup.connect(URL).timeout(2000).get();
		// 通过class的名字得到（即XX）,一个数组对象Elements里面有我们想要的数据,至于这个div的值呢你打开浏览器按下F12就知道了;
		Elements elements = doc.getElementsByClass("kaij-boxer kaij-boxer2");
		System.out.println("Result---------------------start:");
		for (Element element : elements) {
			// 打印出每一个节点的信息;你可以选择性的保留你想要的数据,一般都是获取个固定的索引;
			if (element != null) {
				System.out.println(element.text());
			}
		}
		System.out.println("Result---------------------End");
	}
}
```
4.that's all , then you can get data like this as below:
4.然后我们可以看到如下的结果：
```
Result---------------------start:
第20190402053期 2019-04-02 21:40:00 0 3 8 3 7
第20190402052期 2019-04-02 21:20:00 0 7 4 6 4
第20190402051期 2019-04-02 21:00:00 5 7 3 8 1
第20190402050期 2019-04-02 20:40:00 7 9 8 4 0
第20190402049期 2019-04-02 20:20:00 5 6 0 7 2
第20190402048期 2019-04-02 20:00:00 4 1 6 7 8
第20190402047期 2019-04-02 19:40:00 2 2 2 7 2
第20190402046期 2019-04-02 19:20:00 8 2 9 2 0
第20190402045期 2019-04-02 19:00:00 1 3 0 4 7
第20190402044期 2019-04-02 18:40:00 9 1 7 0 3
第20190402043期 2019-04-02 18:20:00 6 7 9 0 8
第20190402042期 2019-04-02 18:00:00 6 2 8 7 5
第20190402041期 2019-04-02 17:40:00 4 6 0 3 0
第20190402040期 2019-04-02 17:20:00 7 5 7 3 8
第20190402039期 2019-04-02 17:00:00 1 5 0 1 9
第20190402038期 2019-04-02 16:40:00 5 9 9 9 1
第20190402037期 2019-04-02 16:20:00 5 8 8 2 0
第20190402036期 2019-04-02 16:00:00 4 4 9 5 1
第20190402035期 2019-04-02 15:40:00 4 5 6 8 6
第20190402034期 2019-04-02 15:20:00 9 8 8 3 1
Result---------------------End
```

# Python 网络爬虫解决方案

使用语言：Python

相关类库：urllib,beautifulsoup4

---

如果想爬取一个网址所有的a标签，那么你或许可以试试我写的这个基于beautifulsoup4的爬虫项目

[Python爬虫获取某个网页所有的a标签中的超链接网址](https://blog.csdn.net/hadues/article/details/88981686)

> 交流即分享，分享才能进步！不对之处，还请各位前辈多多指教。  by 星云

---
# 关于我

[星云CSDN博客](https://blog.csdn.net/hadues)

[星云博客园](http://www.cnblogs.com/xingyunblog)

[星云阿里云栖博客](https://yq.aliyun.com/u/xingyunsky)

[星云GitHub](https://github.com/geekxingyun)

[星云GitHub Page](http://www.520geek.cn)

[星云微博](https://weibo.com/xingyunsky)

# 免费加入我的知识星球

<p><a href="https://github.com/geekxingyun/SpringBootBestPracticesSample/blob/master/resources/images/my_world.png?raw=true"> <img src="https://github.com/geekxingyun/SpringBootBestPracticesSample/blob/master/resources/images/my_world.png?raw=true" width="253" height="340"><a><p>

# 联系我

> QQ：2864438285　
> 
> Email：fairy_xingyun@hotmail.com   

# 赞助支持

<h2>微信赞赏二维码</h2>
<p><img src="https://img2018.cnblogs.com/blog/622489/201812/622489-20181215164147325-217176189.png" alt="" width="303" height="282"></p>
<h2>支付宝赞赏二维码</h2>
<p><img src="https://img2018.cnblogs.com/blog/622489/201812/622489-20181215164420863-364321980.png" alt="" width="297" height="303"></p>

