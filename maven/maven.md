# maven

## 笔记

### 依赖传递

> 如果需要依赖传递，则父项目的打包方式必须声明为`pom`

### dependencyManagement与dependencies

> 资料参见[dependencyManagement与dependencies区别](https://blog.csdn.net/snn1410/article/details/52859788)

+ `dependencyManagement`中只是对依赖的声名，并没有真正的引入依赖，其作用是用于在（当前pom或子pom的）`dependencies`中引入依赖时，可以不用指定版本，使用在`dependencyManagement`中声名的版本的依赖

+ `dependencies`中是真正的引入依赖

### Spring IO Platform

> 参考资料：[spring io platform简介及示例](https://www.cnblogs.com/chenpi/p/6295855.html)
>
> 这是spring的1个依赖，可以在[spring官网](https://platform.spring.io/platform/)找到这个依赖
>
> 他的作用就是管理各种依赖之间版本，引入依赖时无需再指定版本，`spring io`自动帮你选择最合适的版本

#### spring中使用

+ 使用

  > 使用分为2种方式：导入、继承父pom

  + 导入（推荐）

    ```xml
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>io.spring.platform</groupId>
                <artifactId>platform-bom</artifactId>
                <version>Cairo-SR4</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    ```

  + 继承

    ```xml
    <parent>
        <groupId>io.spring.platform</groupId>
        <artifactId>platform-bom</artifactId>
        <version>Cairo-SR4</version>
        <relativePath/>
    </parent>
    ```

  > 此时，就可以不用指定版本号引入依赖了

+ 覆盖`spring io`提供的版本

  + 导入方式

    > 对于导入方式，如果想要覆盖`spring io`提供的版本，使用自己的版本，需要在`dependencyManagement`中手动声名（不区分前后）

    ```xml
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>io.spring.platform</groupId>
                <artifactId>platform-bom</artifactId>
                <version>Cairo-SR4</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.10</version>
                <scope>test</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    ```

  + 继承

    > 继承方式需要在`properties`标签中指定版本，来覆盖`spring io`中的版本

    ```xml
    <properties>
        ...
        <junit.version>4.11</junit.version>
    </properties>
    ```

#### springboot中使用

> + 创建springboot项目时，会自动将`spring-boot-starter-parent`继承为该项目的父依赖
> + 在`spring-boot-starter-parent`中已经集成了`spring io`，所以在springboot项目中无须再配置`spring io`
> + springboot中默认继承了`spring-boot-starter-parent`，所以需要以继承的方式使用`spring io`功能
> + springboot中也可以将`spring-boot-starter-parent`改为引入的方式，此时就可以以引入的方式使用`spring io`功能了

引入方式

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.0.5.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.16.20</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

#### maven plugin

> 无论在spring还是springboot中，使用继承方式时，pom中的plugin也无须指定版本；但是引入方式时，就必须指定版本了

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

#### 其他BOM

> platform-bom 属于用于依赖版本管理的BOM中的一种，除此之外还有：
>
> + spring-boot-dependencies
>
>   它本身就是一些依赖的父依赖（所以不需要引入他），如：
>
>   + platform-bom
>   + Spring-boot-starter-parant
>
> + spring-cloud-dependencies
>
> + spring-framework-bom
>
> + spring-integration-bom
>
> + spring-security-bom
>
> 这些BOM各自管理的依赖基本一人一部分，可以多个一起使用，一般来说用`platform-bom`就可以，发现没有被管理到的依赖再添加其他BOM

## 问题总结

### 依赖报红

> + 打开项目时，可能出现依赖无法正常导入的问题，很多依赖都是红色的，`reimport`也不行
>
> + 此时需要在maven中执行`clean`、`compile`，依赖就会自动重新下载下载，代码可以正常执行
>
> + 经过以上步骤后，meven窗口中依赖可能还会显示为红色波浪线，但是不影响运行，此时将pom文件中依赖全部屏蔽掉，点击`reimport`，再放开，即可