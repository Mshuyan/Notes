### ☀️ maven项目中的build标签

+ 关键字

  `如何创建Maven项目`、`build标签`

+ 记录

  不使用模板创建maven项目时，pom.xml文件中不会生成build标签，编译时会报警告，所以以后创建非web项目时，使用maven模板创建：

  <img src="assets/1.png" width="600px"> 



---

### ☀️ maven项目导入依赖

> 在maven中导入依赖时，不知道怎么写依赖，可以在[MavenRepository](https://mvnrepository.com/)或[WebJar](https://www.webjars.org/)中查找依赖



---

### ☀️Failed to load class "org.slf4j.impl.StaticLoggerBinder"

> 有些插件使用了`slf4j`日志框架，但是该框架可能会报标题所示错误

在maven中导入如下依赖即可：

```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>1.7.7</version>
</dependency>
```

















