# SmartWebCrawler
it is an easy Web Crawler with HttpClient and JSoup.

like the website http://m.kaijiang.caishencai.com/cqssc/ ?

How to Get some data from a web site? 

***

`
public static void main(String[] args) {

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
	} 
	
	`
***

then you can get data like this as below:

***

`Result---------------------start:  

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

`  
