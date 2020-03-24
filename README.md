# SmartWebCrawler

it is an easy Web Crawler With Java and Python

# Easy Web Crawler With Java

it is an easy Web Crawler with Java.

```
Language：Java
lib：Jsoup
Current latest version：v2.0
```
Key Point:

1.Jsoup delayed access to the content of the page

2. Then use Jsoup to parse the result of the request into a Document object

3. Visit the page like a JS according to the Document API

Article introduction：[Java爬虫获取某个页面中指定节点的内容](https://blog.csdn.net/hadues/article/details/88983055)

# Easy Web Crawler With Python

```
Language：Python

third-party lib：urllib,beautifulsoup4
```

If you want to crawl all the a tags of a URL, then you may try this beautifulsoup4 based crawler project I wrote.

- 1. install python 
```
https://www.python.org/downloads/
```
- 2. install BeautifulSoup Python lib

```
https://www.crummy.com/software/BeautifulSoup/bs4/download/4.6/
```
- 3. update pip version
```
python -m pip install --upgrade pip 
```
- 4.come into beautifulsoup folder，type 

```
pip install bs4
```
- 5.run the program

- Usage one：

The URL written in the default request code, records all the URLs directed by the a href tag in the UR

```
python SmartWebCrawler.py 
```
- Usage two:

命令行输入网址，将网址中所有的a href 标签执向的URL记录下来

```
python SmartWebCrawler.py http://www.runoob.com/
```

Article introduction：[Python爬虫获取某个网页所有的a标签中的超链接网址](https://blog.csdn.net/hadues/article/details/88981686)

