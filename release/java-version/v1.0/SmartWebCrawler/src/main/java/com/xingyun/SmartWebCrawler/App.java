package com.xingyun.SmartWebCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.xingyun.SmartWebCrawler.util.HttpClientTools;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String responseData = HttpClientTools.doGet("http://m.kaijiang.caishencai.com/cqssc/", "UTF-8");
		// System.out.println(responseData);
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
}
