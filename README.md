# VedioDemo
安卓实现播放网络视频demo

条件：
视频得通过浏览器的URL直接可以浏览播放，建议把视频放在本地电脑，在映射到Tomcat的服务器上（我另外下载的Tomcat）。
具体操作：在Tomcat的server.xml里做一下修改： 
#在</Host>的前面添加 <Context path="/PersonalHomePage" docBase="D:\PersonalHomePage" debug="0" reloadable="true" /> 即可。

