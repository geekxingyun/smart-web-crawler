# SmartWebCrawler

该项目提供一个Java和Python 网络爬虫的简易解决方案~

# Java 简易网络爬虫解决方案

it is an easy Web Crawler with HttpClient and JSoup.

它是一个简单的基于HttpClient 和JSoup的网络爬虫框架

like the website http://m.kaijiang.caishencai.com/cqssc/ ,if we want to get some data from the web site? 

像这个网址http://m.kaijiang.caishencai.com/cqssc/ ，如果我们想要获取这些数据从这个网站。

so what should we do?

我们应该怎么做？

now you just need do the three step as below:

现在你只需要做着三步：

1. added depdendency in your POM.xml 

              <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->   
		<dependency>   
			<groupId>org.jsoup</groupId>    
			<artifactId>jsoup</artifactId>   
			<version>1.11.3</version>   
		</dependency>  

		<!-- HttpClient http://hc.apache.org/ -->   
		<dependency>    
			<groupId>org.apache.httpcomponents</groupId>     
			<artifactId>httpclient</artifactId>    
			<version>4.5.5</version>    
		</dependency>   

2. copy the HttpClientTool.java to your project

3. then you can use it in the main method  like as below:

***



     String responseData = HttpClientTools.doGet("http://m.kaijiang.caishencai.com/cqssc/", "UTF-8");
		
     String html = responseData;
		
     // 通过Jsoup解析页面,生成一个document对象;
		
     Document doc = Jsoup.parse(html.toString());

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
***

4. that's all , then you can get data like this as below:

***

Result---------------------start:  

第20180526038期 2018-05-26 12:20:00 5 7 6 2 2 

第20180526037期 2018-05-26 12:10:00 9 3 1 7 8  

第20180526036期 2018-05-26 12:00:00 4 9 4 9 0  

第20180526035期 2018-05-26 11:50:00 0 9 6 9 9  

第20180526034期 2018-05-26 11:40:00 4 3 4 3 6  

第20180526033期 2018-05-26 11:30:00 2 3 5 6 5 

第20180526032期 2018-05-26 11:20:00 1 4 1 6 9 

第20180526031期 2018-05-26 11:10:00 4 6 4 9 3  

第20180526030期 2018-05-26 11:00:00 5 2 9 6 4  

第20180526029期 2018-05-26 10:50:00 9 2 6 8 2 

第20180526028期 2018-05-26 10:40:00 6 6 1 7 8 

第20180526027期 2018-05-26 10:30:00 4 2 1 3 8  

第20180526026期 2018-05-26 10:20:00 2 6 0 3 8  

第20180526025期 2018-05-26 10:10:00 6 8 1 8 4 

第20180526024期 2018-05-26 10:00:00 1 6 7 9 2  

第20180526023期 2018-05-26 01:55:00 8 3 7 1 1  

第20180526022期 2018-05-26 01:50:00 1 2 0 8 7  

第20180526021期 2018-05-26 01:45:00 3 0 4 5 2  

第20180526020期 2018-05-26 01:40:00 4 8 6 6 2  

第20180526019期 2018-05-26 01:35:00 6 8 5 4 6  

Result---------------------End

# Python 网络爬虫解决方案

如果想爬取一个网址所有的a标签可以试试我用Python写的项目————[网络爬虫找a标签URL](https://github.com/geekxingyun/SmartWebCrawler/tree/master/Product)

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

