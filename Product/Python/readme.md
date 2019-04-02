
博文介绍：[Python爬虫获取某个网页所有的a标签中的超链接网址](https://blog.csdn.net/hadues/article/details/88981686)

```
1. 安装python 

https://www.python.org/downloads/

2. 安装BeautifulSoup Python 类库

https://www.crummy.com/software/BeautifulSoup/bs4/download/4.6/

3. 升级pip到最新版本
python -m pip install --upgrade pip 

4.在命令行进入beautifulsoup的安装目录下，输入pip install bs4

5.运行此程序

用法一：

默认请求代码中写入的网址,将网址中所有的a href 标签执向的URL记录下来

python SmartWebCrawler.py 

用法二:

命令行输入网址，将网址中所有的a href 标签执向的URL记录下来

python SmartWebCrawler.py http://www.runoob.com/
```
