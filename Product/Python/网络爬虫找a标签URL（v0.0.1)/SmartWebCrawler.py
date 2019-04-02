# -*- coding:utf-8 -*-
# python 3.7
#引入系统类库
import sys
# 使用文档解析类库
from bs4 import BeautifulSoup
# 使用网络请求类库
import urllib.request
# 输入网址
html_doc = "http://www.aynu.edu.cn/"
if len(sys.argv)>1:
   website=sys.argv[1]
   if(website is not None):
        html_doc= sys.argv[1]
# 获取请求
req = urllib.request.Request(html_doc)
# 打开页面
webpage = urllib.request.urlopen(req)
# 读取页面内容
html = webpage.read()
# 解析成文档对象
soup = BeautifulSoup(html, 'html.parser')   #文档对象
# 非法URL 1
invalidLink1='#'
# 非法URL 2
invalidLink2='javascript:void(0)'
# 集合
result=set()
# 计数器
mycount=0
#查找文档中所有a标签
for k in soup.find_all('a'):
    #print(k)
    #查找href标签
    link=k.get('href')
    # 过滤没找到的
    if(link is not None):
          #过滤非法链接
          if link==invalidLink1:
            pass
          elif link==invalidLink2:
            pass
          elif link.find("javascript:")!=-1:
            pass
          else:
            mycount=mycount+1
            #print(mycount,link)
            result.add(link)
#print("打印超链接个数:",mycount)
#print("打印超链接列表",result)
f = open(r'result.txt','w',encoding='utf-8')  #文件路径、操作模式、编码  # r''
for a in result:
    f.write(a+"\n")
f.close()
print("\r\n扫描结果已写入到result.txt文件中\r\n")