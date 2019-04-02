

当前版本v2.0

版本升级说明：

```
v1.0 版本只能解决一些最简单的数据爬取，如果页面内容是js异步请求而来就会存在问题。

去掉了HttpClient类库，使用Jsoup内置的请求库

可以爬取js加载的网页页面内容
```

核心思想

1.Jsoup延迟访问页面的内容

2.然后使用Jsoup将请求的结果解析成Document对象

3.根据Document API像操作JS一样访问页面

--- 

1. added depdendency in your POM.xml 
1. 添加依赖到pom.xml中

              <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->   
		<dependency>   
			<groupId>org.jsoup</groupId>    
			<artifactId>jsoup</artifactId>   
			<version>1.11.3</version>   
		</dependency>  

3.then you can use it in the main method  like as below:
3.主方法中这样调用
```

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
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
4.然后我们可以看到这样的结果：
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
