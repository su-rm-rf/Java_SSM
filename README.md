# 需求
```
开发一个在线文档任务管理工具
```

> 纯手工从0到1编码，没有使用脚手架 <br/>
> 
> [前端项目GitHub地址](https://github.com/su-rm-rf/fe-step4) <br/>
> [后端项目GitHub地址](https://github.com/su-rm-rf/Java_SSM)

> 前端运行: <br/>
> npm run dev <br/>
> npm run ssr <br/>
> 
> 后端运行:
> 使用Maven打包，Tomcat部署 <br/>
> 
> 访问:
> http://localhost:8421/todo

# 技术栈
```
JDK版本：1.8
编辑器：IDEA
源码管理：Git
包管理器：Maven
语言：Java
容器框架：Spring
MVC框架：SpringMVC
对象关系映射：MyBatis
数据库：MySQL
```

# 组织结构
```
src/main
    java
        controller
        dao
        dto
        entity
        filter
        service
        util
    resources
        config
            applicationContext.xml
            dispatcherServlet.xml
            jdbc.properties
            mybatis.xml
    webapp
        WEB-INF
            web.xml
        index.jsp
test
pom.xml
```

# 其它事项：
```
关闭防火墙:
netsh advfirewall set global StatefulFTP disable
```

[IDEA中Maven依赖包下载不了的问题解决方案汇总](https://cloud.tencent.com/developer/article/2119091)

```
修改字体大小风格：
    File - Settings - Appearance & Behavior - Appearance - Override
    File - Settings - Editor - Colors & Fonts - Font - Save as - 重新定义

快捷键：
    包导入，继承实现导入：Alt+Enter
    复制：Ctrl+D
    移动：Ctrl+Shift+上/下
```