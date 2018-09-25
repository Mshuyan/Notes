#  Java

## 基础

### java编程方向

1)  java se 桌面开发

2)  java ee web开发

3)  java me 手机开发

> java se是所有方向的基础

### 学习路线

> ![ABAAC44CBAD46C5248B392AFEB197387](media/image1.png){width="4.686805555555556in" height="4.374305555555556in"}
>
> 项目层次结构：
>
> ![](media/image2.png){width="3.28125in" height="2.9277777777777776in"}

### 原码、反码、补码

> 正数：
>
> 原码、反码、补码均相同：5 = 00000101
>
> 负数：
>
> 原码：正数的最高位（符号位）变1 -5 = 10000101
>
> 反码：原码除了符号位，其余为取反 -5 = 11111010
>
> 补码：反码+1 -5 = 11111011

一般数字二进制均用补码表示

### 跨平台原理

> 源代码编译为字节码文件，字节码文件（class）是可以在JVM（Java虚拟机）上运行的文件，然后在不同平台安装JVM，即可实现同一份代码在不同平台运行。

### JVM、JRE、JDK概述

> JVM：Java虚拟机
>
> JRE：Java运行环境，包含JVM
>
> JDK：Java开发工具，包含JRE

### 搭建开发环境

1.  下载JDK，安装jdk，目录不要有空格、中文等，安装完成jdk后提示安装jre，安装jdk时已经安装了jre，这里不要再次安装

2.  配置环境变量

> 我的电脑 --\>属性 -\>高级系统设置 -\>高级 -\>环境变量
>
> 在用户变量或系统变量的Path字段后添加";D:\\develop\\jdk1.8.0\_111\\bin\\"，重新打开cmd窗口，输入javac即可看到java的相关信息
>
> 注：
>
> 用户变量只对当前用户生效，系统变量对所有用户生效
>
> 添加的内容为jdk安装目录下的bin文件夹目录

### 编译、运行

> 编译：
>
> 使用javac命令对"\*.java"文件进行编译，对每个类生成1个文件名与类名相同的"\*.class"文件

运行：

> 使用java命令运行"\*.class"文件

### 基本语法

1.  严格区分大小写

2.  在同一个源文件中，可以定义多个类，但是只有1个类可以定义为public类，并且文件名需要与public类名相同。

### 注释

1.  单行注释："//"

2.  多行注释："/\* \*/"

3.  文档注释："/\*\* \*/",用于生成API文档

### Editplus使用

1.  自定义工具：

> 工具 -\>配置用户工具 -\>组名，自定义一组工具
>
> 添加工具 -\>应用程序
>
> 编译：
>
> ![](media/image3.png){width="3.142361111111111in" height="2.792361111111111in"}
>
> 运行：
>
> ![](media/image4.png){width="3.1458333333333335in" height="2.795138888888889in"}
>
> 如果要把字节码文件单独放在一个文件夹下，则：
>
> 编译：
>
> ![](media/image5.png){width="2.717361111111111in" height="2.4145833333333333in"}
>
> 运行：
>
> ![](media/image6.png){width="2.714583333333333in" height="2.4118055555555555in"}
>
> 使用"Ctrl + 1"进行编译；"Ctrl + 2"进行运行

### 基本类型

> ![](media/image7.png){width="5.216666666666667in" height="2.1416666666666666in"}

### 位运算度

> 位运算符是按位操作,所以包括符号位

### 移位操作

a)  移位操作均包括符号位

b)  实际移动为数 = 移动为数 % 数据类型bit数

<!-- -->

1.  算数左移（\<\<）:

> 用0补位

2.  算数右移（\>\>）：

> 用符号位补位

3.  逻辑右移（\>\>\>）：

> 用0补位
>
> 没有逻辑左移（\<\<\<）；

### 控制外层循环

> ![](media/image8.png){width="4.4222222222222225in" height="2.2263888888888888in"}
>
> continue也可以这么用

### 方法重载

> 在同一个类中，可以定义多个同名函数，只要参数列表不同即可，对返回值没有要求。这几个方法之间是重载关系。
>
> ![](media/image9.png){width="4.331944444444445in" height="1.8583333333333334in"}

### 递归

> 定义：递归指的是一个过程：函数不断引用自身，直到引用的对象已知。
>
> 比如快速排序算法：
>
> ![](media/image10.png){width="3.6569444444444446in" height="3.0625in"}

### 数组声明与初始化

1.  静态初始化

> 完整写法
>
> int\[\] arr = new int\[\]{1,2,3};
>
> int arr\[\] = new int\[\]{1,2,3};
>
> 这种方法可以先声明后初始化
>
> int\[\] arr；arr = new int\[\]{1,2,3};
>
> int arr\[\]；arr = new int\[\]{1,2,3};
>
> 简单写法
>
> int\[\] arr = {1,2,3};
>
> int arr\[\] = {1,2,3};
>
> 这种方法必须在声明时直接初始化

2.  动态初始化

> int\[\] arr = new int\[ len \]; 自动初始化为0

### main函数数组参数

> public static void main( String\[\] args)
>
> { }
>
> 其中"String\[\] args"为字符串数组参数，通过args.length可以知道参数个数
>
> ![](media/image11.png){width="3.4166666666666665in" height="1.2708333333333333in"}

### 多维数组

> java中多维数组与C语言中不同
>
> C语言：每个维度大小相同
>
> java：每个维度大小可以不同

### 增强for循环

增强for循环只查看数组中的元素，不关心索引，且不能修改数组中元素

> **适用范围：**
>
> 数组、实现Iterable接口的类
>
> **java实现原理：**
>
> 源代码：
>
> ![](media/image12.png){width="3.384027777777778in" height="1.53125in"}
>
> 反编译代码：
>
> ![](media/image13.png){width="3.6145833333333335in" height="2.259027777777778in"}

### 方法的可变参数

> 对方法的参数是数组时，为了避免定义数组再当作参数传递的麻烦，可使用可变参数
>
> 语法：
>
> 方法名 ( 元素类型 ... 数组名) { }；
>
> **java实现原理**
>
> 源代码：
>
> ![](media/image14.png){width="3.40625in" height="1.9875in"}
>
> 反编译代码：
>
> ![](media/image15.png){width="4.885416666666667in" height="2.81875in"}
>
> 可变参数必须作为最后一个参数，且最多有1个可变参数，否则编译出错：
>
> 正确写法：![](media/image16.png){width="2.4583333333333335in" height="0.10416666666666667in"}
>
> 错误写法：![](media/image17.png){width="2.4270833333333335in" height="0.14583333333333334in"}
>
> 错误写法：![](media/image18.png){width="2.3645833333333335in" height="0.15625in"}

### object类

> object是一个根类，可以表示任意类型的数据
>
> 比如：System类中的arraycopy方法
>
> ![](media/image19.png){width="4.645833333333333in" height="0.5in"}
>
> src、dest仅为object类型的，所以可以拷贝任意类型的数组

### native修饰符

> 底层使用C/C++写好的方法在java中需要使用native进行声明才可以使用
>
> 比如：System类中的arraycopy方法
>
> ![](media/image19.png){width="4.645833333333333in" height="0.5in"}

### 读取控制台输入

> ![](media/image20.png){width="5.229166666666667in" height="3.03125in"}

### final关键字

> final可以修饰变量、方法、类

1.  当变量不希望被改变时，可以用final修饰，final变量必须赋初值，且在本类还是子类中都不可以被修改（相当于C语言中const）

2.  当某个方法不希望被重写时，可以用final

3.  当某个类不希望被继承时，可以用final

> 例子：
>
> ![](media/image21.png){width="3.5833333333333335in" height="1.5416666666666667in"}

### String与new String 区别

1.  String

> 使用"String a = "abc";"方式定义字符串时，如果1个字符串初始化后没有改变过，再使用相同的方法定义另一个内容相同的字符串时，后面的字符串变量会指向前面的字符串变量的地址。但是如果第1个字符串改变过，后面定义的字符串内容无论与改变前得内容相同，还是改变后的内容相同，均无法再与第1个字符串变量地址相同。
>
> ![](media/image22.png){width="3.7291666666666665in" height="0.84375in"}

2.  new String

> 使用"String a = new String("abc");"方式定义字符串时，无论第一个字符串是否改变过，无论内容是否相同，都会重新开辟空间

### this、super

1)  super（参数）：调用父类中的某一个构造函数（只能放在构造函数中的第一条语句） 

2)  this（参数）：调用本类中另一种形成的构造函数（只能放在构造函数中的第一条语句）

3)  super:　它引用当前对象的直接父类中的成员（用来访问直接父类中被隐藏的父类中成员数据或函数，基类与派生类中有相同成员定义时如：super.变量名    super.成员函数据名（实参）

4)  this：它代表当前对象名（在程序中易产生二义性之处，应使用this来指明当前对象；如果函数的形参与类中的成员数据同名，这时需用this来指明成员变量名）

5)  调用super()必须写在子类构造方法的第一行，否则编译不通过。每个子类构造方法的第一条语句，都是隐含地调用super()，如果父类没有这种形式的构造函数，那么在编译的时候就会报错。

6)  this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：static变量,static方法，static语句块。

### String与byte互转

1.  byte转String

> String s = new String(byte\[\], int off, int len);

2.  String 转 byte

> byte bytes\[\] = s.getBytes();

### String与char互转

1.  char转String

> String s = new String(char\[\], int off, int len);

3.  String 转 char

> char chars\[\] = s.toCharArray();

### 枚举

-------------------
  **enum** MyEnum{\
  ***NUM1***,\
  ***NUM2\
  ***}

-------------------

## IDE

### Myeclipse

#### 编码配置

> 参见[[html工程的Myeclipse配置]{.underline}](#htmlcssjs):

#### JUnit单元测试

> 当需要测试某个方法时,写一个"public void 函数名()"的函数，在该函数内部写上测试代码，函数上面写上"\@Test"，如有错误右键导入Test包和导入JUnit插件，选中该函数，右键 run as JUnit Test 即可

#### 快捷键 

  功能           快捷键          备注
-------------- --------------- ----------------------------------------
  单行注释       Ctrl+/          "//"双斜线注释，在html中不起作用
  多行注释       ctrl+shift+/    "/\*\*/"尽量使用这种注释
  取消多行注释   ctrl+shift+\\   "取消多行注释"
  代码提示       Alt+/           提示可能要输入的代码，导入需要导入的包
  错误处理       ctrl+1          代码有错误时查看提示的错误处理方法
  代码格式化     ctrl+shift+F    将代码重新排版
                                 
                                 
                                 

### IDEA

#### 目录结构

##### 使用配置文件

> 用户使用IDEA过程中设置的使用习惯、快捷键等可以通过导入配置文件移动到另一台电脑，该配置文件在"C:\\Users\\Administrator\\.IntelliJIdea2017.2"目录下

##### JVM配置文件

> IDEA安装目录"IDEA/bin/idea64.exe.vmoptions"
>
> 其中，Xms和Xmx分别为jvm最小和最大运行内存

##### 编辑区字体修改

> File setting Editor font

##### 编码设置

> File setting Editor file encoding

#### 插件配置

> 如果使用IDEA时缺少某些插件,可以使用如下方法添加插件

-   在当前工程下,fileclose project，来到如下界面

> ![](media/image23.png){width="4.260416666666667in" height="2.655452755905512in"}

-   configure plugins，勾选需要的插件

## 类

### 定义

> 一个全面的类的定义：
>
> ![](media/image24.png){width="2.96875in" height="1.6458333333333333in"}

### 类变量（静态变量）

1.  被static修饰的成员变量是类变量，与对象无关（加载类时已经被定义，无论多少个对象在内存中只存在1个这个变量）

2.  类变量可以通过对象进行访问，也可以通过类名直接进行访问（普通变量不可以）

> 定义：访问修饰符 static 数据类型 变量名 = 初始值；
>
> ![](media/image25.png){width="5.768055555555556in" height="4.275in"}
>
> 可以看出，p2中age的改变不会影响p1中age的值；但是p2中total的改变会影响p1中total的值。

### 构造方法

> 构造方法名与类名相同，没有返回值（不需要写），构造方法在创建一个对象时自动执行，一个类可以有多个参数互不相同的构造方法。
>
> ![](media/image26.png){width="2.8125in" height="2.2694444444444444in"}
>
> 默认构造方法：在没有定义构造方法时，系统自动定义1个没有参数没有内容的构造方法；如果定义了构造方法，系统将不再自动定义默认构造方法。
>
> 在构造方法的第一行，系统会自动执行"super();"来调用父类的没有参数的构造方法，如果父类没有无参数的构造方法，编译会报错。需要使用super显式的调用父类有参数的构造方法

### 类方法（静态方法）

1.  不依靠对象进行访问的方法，即使没有定义对象，也可以通过类直接使用

2.  只能访问静态变量

> 语法：语法修饰符 static 返回值类型 函数名 ( 参数类型 参数 )
>
> ![](media/image27.png){width="3.8541666666666665in" height="2.9166666666666665in"}

### 静态代码块、非静态代码块

> **静态代码块**：
>
> 在加载类时执行1次的区域，创不创建对象都会执行。

语法: static { 执行语句 }；

![](media/image28.png){width="4.416666666666667in" height="3.120138888888889in"}

![](media/image29.png){width="4.583333333333333in" height="4.347222222222222in"}

**非静态代码块**：

每次创建对象时，执行构造函数之前执行的代码

语法：{ }；

![](media/image30.png){width="4.300694444444445in" height="4.291666666666667in"}

### 构造方法、静态代码块、非静态代码块执行顺序

> ![](media/image31.png){width="5.768055555555556in" height="4.5125in"}
>
> 分析：
>
> 创建1个girl对象的过程是：先加载父类，再加载子类，再创建父类对象，再创建子类对象，所以打印结果如图

### 包

1.  定义：

> 就是将字节码文件放在对应的目录下，同一个目录下的字节码文件属于同一个包

2.  作用：

<!-- -->

1)  区分相同名字的类

2)  管理类

3)  控制访问范围

<!-- -->

3.  语法：

> package com.shuyan;
>
> 在eclipse中可以先新建包，再在包中新建类，则自动将类放入对应的包

4.  命名规范：

> 全部小写字母，用"."隔开

5.  引入包：import com.shuyan.\*;

### 访问控制修饰符

  **访问级别**   **访问控制修饰符**   **同类**   **同包**   **子类**   **不同包**
-------------- -------------------- ---------- ---------- ---------- ------------
  公开           public               √          √          √          √
  受保护         protected            √          √          √          ×
  默认           没有修饰符           √          √          ×          ×
  私有           private              √          ×          ×          ×

### java面向对象编程-四（三）大特征

> 抽象（说三大特征时不包括这个）、封装、继承、多态

### 抽象

> 提取公共属性、行为来研究问题的方法叫做抽象

### 封装

> 把抽象出来的数据和对数据的操作封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作（成员方法），才能对数据进行操作

### 继承

> 当多个类存在相同的属性和方法时,可以从这些类中抽象出父类来定义这些属性和方法,所有继承他的子类都会父类定义的属性和方法.这样可以避免代码重复.
>
> 语法: class 子类 extends 父类
>
> 规则:

1)  子类最多直接继承1个父类

2)  java所有类都是object子类

### 多态

> 定义：
>
> 一个引用（类型）在不同情况下的多种状态
>
> 理解：
>
> 通过父类来调用在不同（孙）子类中父类的方法或在子类中重写的方法
>
> 规则：

1.  只有父类中存在的变量可以用多态调用（根本不关心子类中变量）

2.  只有父类中存在的方法可以用多态调用（如果子类中进行了重写，则调用子类中的方法）

> 语法：
>
> 父类 对象名 = new 子类();
>
> 例子：
>
> 错误：
>
> ![](media/image32.png){width="3.678472222222222in" height="2.3020833333333335in"}
>
> 正确：
>
> ![](media/image33.png){width="3.6791666666666667in" height="3.89375in"}

### 方法覆盖(重写)

> **定义**:
>
> 子类中有一个方法和其父类中的某个方法的名称、返回类型、参数一样，则子类中的方法覆盖了父类中的方法。
>
> **规则**：
>
> 子类中的方法不能缩小父类方法的访问权限
>
> **注意：**
>
> 子类中可以存在父类中存在的变量，但此时子类使用该变量时没有任何限制，等同于父类中不存在该同名变量。

### 抽象类

定义：

> 当父类中的一些方法不能确定但子类中必须有时，可以用abstract关键字来修饰该类和方法，来要求他的子类必须重写该方法。父类叫做抽象类

语法：

> abstract class 父类名
>
> {
>
> abstract 符文修饰符 返回值类型 抽象方法名 ( 参数类型 参数);
>
> }

规则：

1.  抽象方法所在的类必须是抽象类，但抽象类不一定包含抽象方法

2.  抽象方法不能实现，只能重写

3.  抽象类不能被实例化，但可以用来定义一个对象

4.  抽象类中可以有变量，没有访问修饰符限制；抽象类中的变量是不是静态变量完全由加没加static决定；抽象类中变量可以不被初始化。（这点和接口不同）

5.  抽象类可以继承抽象类，并且 可以不用重写抽象方法

例程：

> ![](media/image34.png){width="5.766666666666667in" height="3.1993055555555556in"}

### 接口

定义：

> 接口就是把一些没有内容的方法封装到一起，到某个类要使用该接口时，在根据具体情况实现这些方法。
>
> 接口可以理解为全部是抽象方法的抽象类

语法：

interface 接口类 //接口

{

变量类型 变量；

访问修饰符 返回值类型 方法名 （参数类型 参数）；

> }
>
> class 类 implements 接口类 //实现了该接口的类
>
> {
>
> }
>
> class 类
>
> {
>
> 访问修饰符 返回值类型 方法名 （接口类 接口）
>
> {
>
> //参数可以传入所有实现了该接口的类的对象
>
> }
>
> }

规则：

1.  接口中的方法不能有方法体，不能使用private和protected修饰，即使不修饰，默认也是public方法；接口被继承后所有函数都要被实现

2.  接口不能被实例化，但可以用来定义1个对象

3.  一个类可以实现多个接口

> 语法：class 类名 implements 接口A，接口B {}

4.  接口中可以有变量，但是必须为public static final变量，并且默认就是该类型的变量；接口中的变量必须初始化。（这点和抽象类不同）

5.  接口不可以继承其他类，但可以继承其他接口（抽象类可以继承其他类）

> 例程：
>
> ![](media/image35.png){width="5.288888888888889in" height="4.729166666666667in"}

### 前期绑定、后期绑定

> 前期绑定：在编译时就可以确定一个对象的类型
>
> 定义变量：int a；在编译的时候就知道时int类型的
>
> 后期绑定：在编译时无法确定一个对象的类型，运行的时候才可以确定
>
> 接口：Usb usb；在编译时，不知道是Camoral还是phone，运行的时候才知道

## 集合

3.  目的：为了解决数组无法动态改变空间的缺陷，引入集合类

4.  相同点：

> 都是java集合类，都可以存放对象

5.  集合类结构

> ![](media/image36.png){width="4.3125in" height="1.9895833333333333in"}

### 同步性、数据增长

1.  同步性

> 集合类分为同步和异步的集合类。多线程操作同一个数据时可能会造成数据出错，所以需要同步的集合类，同步的集合类内部有一种锁的机制，可以保证数据的安全性，但是这样效率会下降；而异步集合类内部没有这种锁的机制，没办法保证多线程操作时数据安全性，但是效率更高。所以当单线程操作数据时使用异步集合类效率更高，多线程操作数据时使用Hashtable来保证数据安全性。

2.  数据增长

> 向集合内增加元素时，如果元素的数目超出了目前长度，则需要扩展内部空间，每次扩展的空间越大则数据增长速度越快。数据增长快的集合类可以避免不必要的资源开销，但是数据量不是很大时会造成资源浪费。所以当需要保存大量数据时使用数据增长速度快的集合类有一些优势。

### List结构集合类

1.  主要包括：ArrayList、LinkedList、Vector、Stack

2.  以ArrayList为例：

> 包：java.util.\*
>
> 例程：
>
> ![](media/image37.png){width="5.768055555555556in" height="3.55in"}

3.  List结构集合类查找数据方式

    a.  for循环

    b.  增强for循环

    c.  iterator迭代器

4.  异同

<!-- -->

a)  LinkedList、Vector、Stack用法与ArryList大同小异

b)  Stack类的add是向前加，新加的在最前面，其他的一般都加在最后

c)  Vector是同步的，ArrayList是异步的

d)  Vector数据增长速度为原来1倍；ArrayList数据增长速度为原来50%

<!-- -->

1)  #### LinkedList

    1.  该集合是Queue接口的实现类，所以这个集合是队列，具备先进先出的特点
    
    2.  使用该集合时，放入或取出元素时，尽量使用offer和poll方法，不要使用add和remove方法
    
    3.  例程参见：[[代码]{.underline}](#代码-12)

<!-- -->

3.  ### Map结构集合类

    6.  主要包括：HashMap、Hashtable

    7.  以HashMap为例

        1.  包：java.util.\*

        2.  增

> put( Object key ,Object value)
>
> 这里使用"键 \<= =\> 值"对的方式，键key是唯一的，put同一个键会把前面的覆盖

3.  查

> 可以直接通过containsKey和containsValue方法来通过键/值查看是否有该对象

4.  取出对象

> 通过get( Object key)可以直接通过键取出对象

5.  遍历

> 由于这里没有下表，只有键值，而遍历时我们无法知道所有的键值，所以遍历时需要用到迭代器iterator
>
> ![](media/image38.png){width="5.768055555555556in" height="1.2125in"}
>
> 注意：这里并不会按照放入的顺序取出，顺序没有规律
>
> **还有2中遍历方式：**

![image39.png](media/image39.png){width="4.736111111111111in" height="2.5245647419072617in"}

> 这里第1中时先获取所有的key，在获取value
>
> 第2中是循环获取键值对

3.  异同

<!-- -->

a)  相同点：

> HashMap与Hashtable使用方法基本一致

b)  不同点

<!-- -->

i.  历史原因

> Hashtable是基于陈旧的Dictionary类的，HashMap是Java1.2引进的Map接口的一个实现。

ii. 同步性

> HashMap是异步的，Hashtable是同步的

iii. 值

> HashMap可以把空值作为key或value，但是Hashtable不可以

4.  ### Set集合类

    8.  主要包括HashSet、TreeSet

    9.  Set集合类只存放不存在的对象，如果有1个对象已经存在，则添加会失败

    10. 以HashSet为例：

+--------------------------------------------------------+
| [Set]{.underline}set = **new**[HashSet]{.underline}(); |
|                                                        |
| //增                                                   |
|                                                        |
| [set.add(\"1\")]{.underline};                          |
|                                                        |
| [set.add(\"2\")]{.underline};                          |
|                                                        |
| //删                                                   |
|                                                        |
| set.remove(\"1\");                                     |
|                                                        |
| //遍历                                                 |
|                                                        |
| //增强for循环方式                                      |
|                                                        |
| **for**(Object item : set){                            |
|                                                        |
| System.***out***.println((String)item);                |
|                                                        |
| }                                                      |
|                                                        |
| //迭代器                                               |
|                                                        |
| [Iterator]{.underline}it = set.iterator();             |
|                                                        |
| **while**(it.hasNext())                                |
|                                                        |
| System.***out***.println(it.next());                   |
+--------------------------------------------------------+

### 集合的选取

1)  如果要求线程安全，选择Vector、Hashtable

2)  如果不考虑线程安全，选择ArrayList、LinkedList、HashMap，效率更高

3)  如果要求键值对，使用HashMap、Hashtable

4)  如果数据量很大，又要求线程安全，选择Vector

### 异步集合在多线程中使用

#### 线程安全

> 异步集合ArrayList等在多线程中使用时会引发线程同步问题，可以使用Collections中的synchronizedList、synchronizedMap、synchronizedSet等方法解决

--------------------------------------------------------------------------------
  List\<String\> **list** = Collections.*synchronizedList*(**new** ArrayList());
  --------------------------------------------------------------------------------

#### 迭代、获取、移除

> 在多线程中对集合中元素进行迭代、获取、移除时不能使用集合本身的方法，需要使用迭代器，例：
>
> ![](media/image40.png){width="5.768055555555556in" height="2.8805555555555555in"}

## 泛型

### 引入

**不使用泛型的代码：**

> ![](media/image41.png){width="5.729166666666667in" height="3.5520833333333335in"}
>
> 上述代码中，从ArrayList中获取数据时必须进行强制转换，否则编译报错，但是一旦强转类型与原类型不一致，编译不会报错，运行会出错，所以这种使用方式是不安全的。
>
> 为了解决上面的问题，Java在1.5版本中引入了泛型，它可以在ArrayList定义时就指定里面可以存放的数据的类型，如果存放的不是这样的类型编译的时候就会报错；而且在取出元素时也无需进行强制类型转换了。这样使用更安全。

**使用泛型的代码**：

![](media/image42.png){width="4.604166666666667in" height="3.4375in"}

*我的感悟：*

> *使用泛型则限制了List中只能存放同一类型的数据，没有父子类关系的两种类型不能放进去。这样其实对ArrayList的使用是一种限制。*
>
> *使用一个类型定义1个list后，只能放入使用类型和其子类类型的数据，只能用使用类型及其父类类型取出。*

### 泛型理解

> 泛型的使用，就是在使用某个使用了泛型的类、接口、方法时，先指定这个泛型的类型，当指定了这个泛型的类型后，后面所有使用该泛型的参数或变量，必须传递的是前面设定的数据类型，编译器会自动对你设定的类型和操作时的类型进行检查，如果不一致就会报错。
>
> 泛型可以被指定为任意类型，这一点上他和object类型很像

### 反射机制

> 对于泛型的数据，可以通过反射机制获取他的类型、所有方法、方法的返回值类型、参数类型等信息。
>
> ![](media/image43.png){width="5.489583333333333in" height="3.3125in"}

### 用途

> 泛型可以用在类、接口、方法的创建中，分别称为泛型类、泛型接口、泛型方法

#### 泛型在集合上的应用

> 参见：[[引入]{.underline}](#引入)

#### 泛型方法

+-------------------------------------------------------------------+
| //泛型声明放在返回值之前                                          |
|                                                                   |
| **public**\<T\>**void** change(T\[\] arr,**int**idx1,**int**idx2) |
|                                                                   |
| {                                                                 |
|                                                                   |
| T [temp]{.underline} = arr\[idx1\];                               |
|                                                                   |
| arr\[idx1\] = arr\[idx2\];                                        |
|                                                                   |
| arr\[idx2\] = arr\[idx1\];                                        |
|                                                                   |
| }                                                                 |
+-------------------------------------------------------------------+

#### 泛型类

> 参见[[反射机制]{.underline}](#反射机制)

9.  ### 泛型使用规则

    11. 只有object类型可以作为泛型的书籍类型，int等不可以

10. ### 好处

    12. 安全简单

    13. 提高代码重用率

11. ### 优点

![image43.png](media/image44.png){width="5.388888888888889in" height="1.605201224846894in"}

## 反射

### 反射应用

> 容器（服务器）启动后，加载xml配置文件，解析后拿到配置内容，根据配置内容加载\*.class文件，通过反射创建实例，就可以拿到class文件中的方法、变量、构造函数等。

### 通过反射调用方法

#### 加载"\*.class"文件并获取class对象

> 3种方法：

-   类名

-   实例

-   Class.forName("类的包名+类名")（推荐）

其中：

1.  第3种方法会抛出找不到类的异常

2.  全路径获取方法：选中类名 右键 Copy Qualified Name

#### 获取构造方法

其中：

> 第2种方式中，获取构造方法的函数getConstructor的参数是class类型的可变参数，所以需要把原构造方法的参数列表中的每个参数加上".class"作为getConstructor的参数

#### 创建实例

> 其中：
>
> 第1中方式无需获取构造函数，即可创建实例，但是只适用于构造方法是无参的类。
>
> 第2种方法可以使用有参的构造方法创建实例，但是需要先获取构造方法

#### 获取、设置属性

> 属性就是类内的变量
>
> 其中：

1.  获取属性的方法getDeclaredField的参数为属性名称（变量名）

2.  操作属性前必须执行setAccessible方法

#### 获取、执行方法

> 其中：

1.  获取方法时需要指明方法名和参数列表

2.  执行方法前需要先设置可执行属性

> ![](media/image44.png){width="5.385416666666667in" height="1.6041666666666667in"}

## 异常处理

### 异常分类

1.  检查性异常：java.lang.Exception

2.  运行期异常：java.lang.RuntimeException

3.  错误：java.lang.Error

> 这三种异常都是 java.lang.Throwable的子孙类，java.lang.Exception和java.lang.Error继承自java.lang.THrowable，而java.lang.RuntimeException继承自java.lang.Exception。

### 检查性异常

> 编译时报的异常，不是语法使用错误造成的错误，而是处理不够完善造成的潜在危险。比如打开文件、连接IP
>
> ![](media/image45.png){width="5.395833333333333in" height="3.1354166666666665in"}
>
> 上面的代码就是如果这个文件不存在时，程序不知道应该如何处理，所以会报出异常，让程序员把程序考虑的更加完整。

### 运行期异常

> 在编译过程中无法预知，程序运行期间才能发生的错误， 比如：0做被除数；内存访问越界

### 错误

> 不是由于程序本身原因出现的错误，而是系统环境造成的错误，比如内存耗尽。这类错误一般很少见

### 异常处理

> 对于检查性异常和运行期异常，可以进行异常处理
>
> 有两种方式处理异常：

1.  在发生异常的地方直接处理

> try...catch...finally

2.  将异常抛给调用者，由调用者处理

### 直接处理异常

> try{
>
> //可能存在异常的需要执行的语句
>
> }
>
> catch ( Exception e ){
>
> //catch块是用来捕获()内指定的类型的异常的
>
> //如果异常类型不匹配，也不会执行catch
>
> //发生异常之后，程序会立刻停止执行
>
> //如果这个异常没有被捕获，则会立刻停止运行
>
> //如果这个异常被捕获了，则跳到catch块中进行处理
>
> //处理之后，程序会跳过try...catch块，执行下面的finally或其他语句
>
> //不会执行try中发生异常的地方下面的语句
>
> }
>
> finally{
>
> //无论是否发生异常finally一般都会执行的
>
> //任何方式退出try或catch块之前，程序会跳到finally中执行，如果finally中没有return等退出finally块的语句，则会执行完finally后回到try或catch块最后继续执行；如果finally中有return等，则直接退出函数，不会再回到try或catch块中
>
> //进入finally之间，try...catch中语句已经执行完毕，finally中对变量的操作不会影响try...catch中的执行结果
>
> }
>
> ![](media/image46.png){width="5.768055555555556in" height="3.7305555555555556in"}

1.  try后面可以有多个catch，但是catch的异常类型不可以重复；

2.  try...catch...finally可以搭配使用：

> try...catch
>
> try...finally //如果try中没有异常可以这么用（没必要这么用）
>
> try...catch...finally

3.  以下情况finally不会执行

<!-- -->

a)  finally块中发生异常

> 这种情况情况其实也执行了，只不过在finally里挺住或跳出了，并未执行全

b)  线程死亡

c)  前面使用了system.exit();

d)  关闭CPU

### 异常抛给调用者

1.  定义

> 当存在异常，但不想处理时，可以通过throws把异常抛给这个方法的调用者

2.  语法：

> ![](media/image47.png){width="4.666666666666667in" height="1.9791666666666667in"}

3.  重写一个方法时，父类中方法没有抛出异常，子类中重写该方法时也不能抛出异常

> ![](media/image48.png){width="5.768055555555556in" height="1.5993055555555555in"}

19. ### 自定义抛出异常

    14. 语法：

> ![](media/image49.png){width="4.385416666666667in" height="0.8541666666666666in"}

15. 自定义异常多用于调试

16. 自定义异常同样需要进行处理

#### 自定义异常类

> 定义1个类继承Exception类，并重写4个public构造方法

## 线程

### 线程创建及启动

1.  线程状态转换

> ![](media/image50.png){width="5.768055555555556in" height="2.747916666666667in"}

2.  Java中1个类当作线程使用有2中方法：

    a.  继承Thread类，并重写run函数

    b.  实现Runnable接口，并重写run函数

    c.  将某对象的方法放入1个线程的对象

3.  继承Thread类创建线程

> ![](media/image51.png){width="4.53125in" height="4.072916666666667in"}

4.  Runnable接口创建线程（推荐）

    d.  用途

> 当某个类已经继承了其他父类时无法再继承Thread类，此时就需要使用Rnnable接口来使用线程

e.  例程

> ![](media/image52.png){width="5.768055555555556in" height="3.463888888888889in"}

5.  将某对象的方法放入1个线程的对象

> ![](media/image53.png){width="3.5520833333333335in" height="4.5in"}

### 线程并发

> 一个进程中创建多个线程同时在运行叫做线程并发
>
> ![](media/image54.png){width="4.291666666666667in" height="2.15625in"}

### 线程同步

> 一个实现了Runnable接口的类的对象可以被放进多个线程对象中并启动，但是运行中修改的都是那1个实现了Runnable接口的类的对象内的变量
>
> ![](media/image55.png){width="4.78125in" height="4.979166666666667in"}
>
> 多个线程访问一个资源时会导致资源混乱，此时需要将正在被线程访问的资源保护起来，其他线程排队等待

### 实现线程同步的几种方法

1)  #### synchronized

    17. 语法

> ![](media/image56.png){width="2.0625in" height="0.6666666666666666in"}
>
> "()"中就是要同步到哪个对象锁，访问相同对象锁的线程之间是互斥的

18. 优缺点

<!-- -->

1)  synchronized是在JVM层面实现的，它在锁定时如果抛出异常，JVM会自动将锁释放掉，不会因为出现异常没有释放锁造成死锁

2)  在资源竞争不是很激烈的情况下使用synchronized很合适，因为编译器会对它进行优化。但是竞争激烈的时候性能下降很烈害。

3)  synchronized对象锁不能被interrupt

    19. 例程

> ![](media/image57.png){width="4.875in" height="5.041666666666667in"}

#### ReentrantLock 

> 使用Lock对象来创建临界区

1.  优缺点

<!-- -->

1)  Lock的锁定时通过代码实现的，无法享受由JVM自动释放锁，所以需要锁定的代码必须放到try...finally块中，出现异常时会跳转到finally中释放锁防止造成死锁

2)  资源竞争不激烈时，性能比synchronized差一点点，但是资源竞争激烈时还能维持常态

3)  ReentrantLock提供多样化的同步，比如时间限制的同步，可以被interrupt的同步

<!-- -->

2.  例程

> ![](media/image58.png){width="3.6666666666666665in" height="5.208333333333333in"}

#### Atomic

> 不激烈情况下，性能比synchronized略逊，而激烈的时候，也能维持常态。激烈的时候，Atomic的性能会优于ReentrantLock一倍左右。但是其有一个缺点，就是只能同步一个值，一段代码中只能出现一个Atomic的变量，多于一个同步无效。因为他不能在多个Atomic之间同步。

## IO编程

### 文件流

1.  定义

> 流：数据在数据源（文件和）程序（内存）之间经历的路径
>
> 输入流：数据从数据源（文件）到程序（内存）的路径
>
> 输出流：数据从程序（内存）到数据源（文件）的路径

2.  文件流分类

> 字节流：使用字节读写二进制文件及任何类型文件（图片、视频、音频）
>
> 字符流：使用字符读写文本文件（txt、word、Excel）

3.  文件格式

> 一个文件最前面有一段文件头，保存了文件的信息（大小、格式等）

4.  IO编程类的使用

         字节流         字符流
------ -------------- --------
  输入   InputStream    Reader
  输出   OutputStream   Writer

23. ### 文件大小及硬盘原理

    20. 一个文件的大小都是4kB的倍数，因为4KB时硬盘的最小存储单位，就像flash中1页

    21. 硬盘中有很多磁道，每个块的大小是4KB，文件按从前 顺序写每个块，由于不断地增删修改文件，就会造成一个文件不是连续的存储在硬盘中，需要不断地指向才能找到文章的文件，这样会产生很多的碎片，碎片越多寻道时间越长。所以硬盘有缓存来尽量减少碎片

24. ### File类

> 文件流是内存和文件之间的通道，学习文件流之前先要学习文件File类

1.  创建文件对象

> File f = new File(\"d:\\\\a.txt\");

2.  得到文件绝对路径

> String f\_path = f.getAbsolutePath();

3.  得到文件大小（字节数）

> long f\_len = f.length();

4.  是否可读

> boolean f\_canRead = f.canRead();

5.  判断文件是否文在

> boolean f\_exist = f.exists();

6.  创建文件

> f.createNewFile();
>
> 目录不存在则抛出异常
>
> 文件已经存在则创建失败

7.  创建文件夹对象

> File fd = new File(\"d:\\\\ff\");
>
> 文件夹就是特殊的文件

8.  判断文件对象是否是文件夹

> boolean fd\_exist = fd.isDirectory();
>
> 同时也可以用来判断该文件夹是否存在

9.  创建文件夹

> fd.mkdir();

10. 获取文件夹下所有文件

> File list\[\] = fd.listFiles();

### 字节流读写文件

1)  #### 读文件

    22. 分别定义文件对象和字节流对象，将字节流对象指向文件对象才开始读；或者直接创建一个指向某文件的字节流对象
    
    23. 一定要在finally中关闭字节流
    
    24. 如果定义字节流时文件不存在，则会抛出异常
    
    25. 同一个流没有关闭读一次之后会自动记住 读到哪，下次接着从这里读

> ![](media/image59.png){width="3.875in" height="4.45in"}

#### 写文件

1.  创建字节流对象时，如果new FileOutputStream(File file, Boolean append)的第二个参数为false，则创建这个字节流对象时就会清空文本；如果为true则不会清空文本；默认为false。如果想在原文本后追加，则设为true。

2.  定义字节输出流时有没有该文件都可以，但是不可以没有该路径

> ![](media/image60.png){width="3.6354166666666665in" height="4.427083333333333in"}

### 字符流读写文件

#### 读文件

    26. 分别定义文件对象和字符流对象，将字符流对象指向文件对象才开始读；或者直接创建一个指向某文件的字符流对象
    
    27. 一定要在finally中关闭字符流
    
    28. 如果定义字符流时文件不存在，则会抛出异常
    
    29. 同一个流没有关闭读一次之后会自动记住 读到哪，下次接着从这里读

> ![](media/image61.png){width="3.3993055555555554in" height="2.7708333333333335in"}

#### 写文件

1.  创建字符流对象时，如果new FileWriter(File file, Boolean append)的第二个参数为false，则创建这个字符流对象时就会清空文本；如果为true则不会清空文本；默认为false。如果想在原文本后追加，则设为true。

<!-- -->

3.  定义字符输出流时有没有该文件都可以，但是不可以没有该路径

> ![](media/image62.png){width="3.8333333333333335in" height="2.8541666666666665in"}

27. ### 缓冲字符流

    30. 为了提高效率，引入了缓冲字符流BufferedRewader和BufferedWriter直接操作String

    31. 缓冲字符流就是把字符流FileReader对象放入BufferedReader中缓存一下，所以使用缓冲字符流时必须先定义一个字符流对象放到缓冲字符流中

    32. 同一个流没有关闭读一次之后会自动记住 读到哪，下次接着从这里读

    33. 追加仍然是修改FileWriter的第二个参数为true，没有文件可以，但是不能没有路径，因为是把FileWriter进行了缓冲，所以很多属性与EileWriter相同

> ![](media/image63.png){width="5.34375in" height="3.8854166666666665in"}

### 记事本项目

#### 菜单条

> ![](media/image64.png){width="4.559027777777778in" height="1.375in"}

## JDBC

### 基础知识

#### 介绍

> JDBC是java连接数据库的驱动。

##### 分类

1.  JDBC-ODBC桥连接

2.  本地协议纯java驱动程序（JDBC）

3.  网络协议纯java驱动程序

4.  本地API

> 前两种为常用的方式

##### Hibernate

虽然JDBC在java语言层面实现了统一，但是不同数据库仍存在很多差异。为了更好的实现跨数据库操作，诞生了Hibernate项目。Hibernate时对JDBC的在封装，实现了对数据库操作更宽泛的统一和更好的可移植性

#### JDBC原理

> ![](media/image65.png){width="5.768055555555556in" height="2.2576388888888888in"}

### sqlserver

> 看本章之前先安装sql server2000数据库

#### 连接数据库

> 这里介绍2种连接数据库的方式：JDBC-ODBC和JDBC

##### JDBC-ODBC

> 使用JDBC-ODBC方式操作数据库之前，必须配置数据源，才能操作数据库。

###### 配置数据源

> 控制面板 管理工具 数据源（ODBC）
>
> ![](media/image66.png){width="4.114583333333333in" height="3.3805555555555555in"}
>
> DSN：系统DSN则系统所有用户均可使用；用户DSN则当前用户可使用
>
> ![](media/image67.png){width="4.083333333333333in" height="3.015277777777778in"}
>
> ![](media/image68.png){width="4.174305555555556in" height="2.90625in"}
>
> 给数据源起个名字
>
> 服务器可以在下拉表中选择局域网内服务器，也可以输入"local"或"."选择本地数据库

![](media/image69.png){width="4.249305555555556in" height="2.9583333333333335in"}

![](media/image70.png){width="4.25in" height="2.9583333333333335in"}

后面的全部确定即可

###### 连接数据库

1)  创建数据库连接、通道对象

> ![](media/image71.png){width="1.84375in" height="0.3541666666666667in"}
>
> 因为这两个资源要在finally中关闭，所以必须在try...catch外定义，下面数据库的操作要放在try...catch中

2)  加载驱动

> ![](media/image72.png){width="3.5416666666666665in" height="0.3958333333333333in"}

3)  创建数据库连接

> ![](media/image73.png){width="5.768055555555556in" height="0.8222222222222222in"}

4)  使用Statement执行sql语句

> 创建Statement对象
>
> ![](media/image74.png){width="2.9375in" height="0.625in"}
>
> 上面几步完成，就可以操作数据库了
>
> 以增加数据为例，使用executeUpdate函数执行sql语句：
>
> ![](media/image75.png){width="5.768055555555556in" height="1.2444444444444445in"}
>
> 在java里操作数据库时，无论字段的类型是数字还是字符，都带单引号，能保证一定不会出错。

5)  关闭资源

> 上面的操作均在try...catch块中完成，在finally中必须关闭资源
>
> 关闭资源的顺序为创建的反序
>
> ![](media/image76.png){width="3.0in" height="1.8333333333333333in"}

##### JDBC

> JDBC方式连接数据库无需配置数据源。
>
> JDBC方式必须在工程中手动引入下面三个jar包：
>
> ![](media/image77.png){width="1.5104166666666667in" height="0.7604166666666666in"}

###### 连接数据库

1)  创建对象

> ![](media/image78.png){width="2.1979166666666665in" height="0.53125in"}
>
> 因为这三个资源要在finally中关闭，所以必须在try...catch外定义，下面数据库的操作要放在try...catch中

2)  加载驱动

> ![](media/image79.png){width="4.65625in" height="0.20833333333333334in"}
>
> 该驱动需要引入上面的3个jar包

3)  创建数据库连接

> ![](media/image80.png){width="5.768055555555556in" height="0.3277777777777778in"}
>
> 其中：

1)  127.0.0.1：服务器IP地址，本机是127.0.0.1

2)  1433：服务器端口号，sqlserver2000默认1433，可在"sqlserver网络实用工具 TCP/IP 属性中查看"

3)  company：要连接的数据库名

4)  sa：用户名

5)  943397：密码

<!-- -->

4)  通过PreparedStatement执行sql语句

> ![](media/image81.png){width="4.8125in" height="0.8854166666666666in"}

5)  关闭资源

> ![](media/image82.png){width="3.375in" height="2.1041666666666665in"}
>
> 按打开的反序关闭

#### 操作数据库

##### 使用Statement执行sql语句

> 操作数据库的基本操作为增删改查，增删改使用executeUpdata函数，返回值为影响的行数；查使用executeQuery函数返回结果为结果集ResultSet
>
> 在java里操作数据库时，无论字段的类型是数字还是字符，都带单引号，能保证一定不会出错。
>
> 创建Statement：
>
> ![](media/image83.png){width="2.75in" height="0.20833333333333334in"}

###### 增

> ![](media/image84.png){width="5.768055555555556in" height="0.7819444444444444in"}

###### 删

> ![](media/image85.png){width="5.302083333333333in" height="0.7916666666666666in"}

###### 改

> ![](media/image86.png){width="5.768055555555556in" height="0.7298611111111111in"}

###### 查

> 查找使用executeQuery函数，返回结果为ResultSet结果集：
>
> 刚返回的ResultSet指向第0行，第0行为null，通过next()不断指向下一行才可取出结果，执行next()后，如果有下一行则返回真，没有则返回假。
>
> ResultSet通过getInt(n)或getString(n)，可取出第n列的数据，列从1 开始；getInt或getString的传参数也可以是列名，如：rs.getString("ename")
>
> ![](media/image87.png){width="5.768055555555556in" height="0.7208333333333333in"}
>
> ResultSet也需要在finally中进行关闭

##### Statement与PreparedStatement

###### 相同

> Statement和PreparedStatement都可以把sql语句从java程序发送到指定数据库并执行

###### 注入漏洞

> ![](media/image88.png){width="4.989583333333333in" height="2.0833333333333335in"}
>
> 上述语句中的查询语句中，无论用户名密码对不对，只要or后面的条件为真，一样可以查到该条记录

###### 区别

1)  直接使用Statement，驱动程序会直接将语句交给数据库；而PreparedStatement会有预编译的过程，并且对语句做字符集的转换。

> 好处：

A.  多次重复执行的语句，PreparedStatement效率更高，更适合使用batch（批量操作）

B.  可以较好的解决系统本地化问题

<!-- -->

2)  PreparedStatement使用"？"赋值可以防止sql注入漏洞，使用字符串拼接方式不可以

##### 使用PreparedStatement执行sql语句

1.  PreparedStatement需要先指定sql语句，在执行操作

> ![](media/image89.png){width="2.75in" height="0.7604166666666666in"}

2.  每次操作数据库都需要重新指定PreparedStatement

3.  问号赋值

> ![](media/image90.png){width="5.768055555555556in" height="0.4583333333333333in"}
>
> 可以使用问号赋值的方式在指定sql语句后再指定sql语句中？的内容
>
> setInt或setString的第一个参数是要替换第几个问号，第二个参数是替换的内容
>
> 使用问号赋值的方式可以防止sql注入漏洞，但是使用字符串拼接的方式即使使用了PreparedStatement也不可以防止sql注入漏洞

##### 操作数据库、表

> 对于DDL语句（数据定义语言(CREATE，ALTER，DROP，DECLARE)），执行需要使用execute函数
>
> execute函数：
>
> ![](media/image91.png){width="5.768055555555556in" height="1.4548611111111112in"}

###### 创建数据库

> ![](media/image92.png){width="3.9895833333333335in" height="0.34375in"}

###### 创建表

> ![](media/image93.png){width="4.895833333333333in" height="0.3333333333333333in"}

###### 备份数据库

> ![](media/image94.png){width="5.768055555555556in" height="0.3486111111111111in"}

### mysql

#### 连接数据库

##### 导入mysql的jdbc驱动文件

> mysql需要 jdbc驱动文件：![](media/image95.png){width="2.5208333333333335in" height="0.2604166666666667in"}
>
> 在 工程中新建lib文件夹，将驱动文件粘贴到该文件夹下，右键驱动文件 build path add to build path

##### 连接数据库

1)  创建对象

> ![](media/image96.png){width="3.8958333333333335in" height="0.5104166666666666in"}
>
> 因为这三个资源要在finally中关闭，所以必须在try...catch外定义，下面数据库的操作要放在try...catch中

2)  加载驱动

> ![](media/image97.png){width="2.9166666666666665in" height="0.34375in"}
>
> 加载驱动前需要引入上面的驱动包

3)  创建数据库连接

+----------------------------------------------------------------------------------------------------------------------+
| con = DriverManager.*getConnection*                                                                                  |
|                                                                                                                      |
| (**\"jdbc:mysql://127.0.0.1:3306/mydb1?useUnicode=true&amp;characterEncoding=UTF-8\"**,**\"root\"**,**\"943397\"**); |
+----------------------------------------------------------------------------------------------------------------------+

> 其中：

1)  127.0.0.1：服务器IP地址，本机是127.0.0.1

2)  3306：服务器端口号，mysql默认3306

3)  mydb1：要连接的数据库名

4)  为防止中文出现乱码，最好加上下面这段固定的字符串：

> ?useUnicode=true&amp;characterEncoding=UTF-8
>
> 这里的UTF-8是字符编码，需要与创建数据库的编码保持一致，可以通过下面命令查看：
>
> ![](media/image98.png){width="5.768055555555556in" height="0.8743055555555556in"}

5)  root：用户名

6)  943397：密码

<!-- -->

4)  通过PreparedStatement执行sql语句

> ![](media/image99.png){width="3.6666666666666665in" height="1.0625in"}

5)  关闭资源

> ![](media/image100.png){width="3.3333333333333335in" height="2.15625in"}
>
> 按打开的反序关闭

#### 批处理

##### Statement

###### 方法

-   void addBatch(String sql) //将sql添加到批处理

-   int\[\] excuteBatch() //执行批处理;返回值为包含批中每个命令的一个元素的更新计数所组成的数组

-   void clearBatch() //清空批处理；当批量执行大量操作时，因为批处理加入的命令越多越占内存，所以需要将所有数据分组进行批处理，每次执行完一组批处理后，需要清空批处理

###### 例程

##### PreparedStatement

###### 方法

-   void addBatch() //将sql添加到批处理

-   int\[\] excuteBatch() //执行批处理;返回值为包含批中每个命令的一个元素的更新计数所组成的数组

-   void clearBatch() //清空批处理；当批量执行大量操作时，因为批处理加入的命令越多越占内存，所以需要将所有数据分组进行批处理，每次执行完一组批处理后，需要清空批处理

###### 例程

--------------------------------------------------------------------
  pst = ct.prepareStatement(**\"insert into test1 values(?,?)\"**);\
  **for** (**int** i = 0; i \<100 ; i++) {\
  pst.setInt(1,i);\
  pst.setString(2,**\"name\"**+Integer.*toString*(i));\
  pst.addBatch();\
  }\
  pst.executeBatch();

--------------------------------------------------------------------

##### 总结

> Statement适合做不同sql语句的批处理，没有提供预处理，性能较低
>
> PreparedStatement适合做相同SQL的批处理，提供了预处理，性能较高

#### 预处理功能

> 在mysql中PreparedStatement的预处理功能默认没有开启，想要使用预处理功能，需要满足2个条件：

1.  mysql驱动jar包版本在5.1.13以上

2.  在url中添加如下3个参数：

> url=jdbc:mysql:///day17?useServerPrepStmts=true&cachePrepStmts=true&rewriteBatchedStatements=true

#### 事务

##### 操作事务

> JDBC中操作事务使用的是[[事务]{.underline}](#事务-1)中的方式2，使用Connection对象中的方法：[[setAutoCommit]{.underline}](#setautocommit)、[[setSavepoint]{.underline}](#setsavepoint)、[[rollback]{.underline}](#rollback)、[[commit]{.underline}](#commit)
>
> 例程：

-------------------------------
  ct.setAutoCommit(**false**);\
  st.executeUpdate();\
  ct.rollback();\
  ct.commit();\
  *//需要设置才能恢复自动提交\
  *ct.setAutoCommit(**true**);

-------------------------------

##### 事务隔离级别

> 事务隔离性引发的问题参见：[[隔离性]{.underline}](#隔离性)
>
> 设置事务隔离级别使用[[setTransactionIsolation]{.underline}](#settransactionisolation)方法

#### 连接池

##### 介绍

###### 定义

> 英文名：DataSource（数据源）
>
> 就是创建1个容器，用于装入多个Connection对象，在使用连接对象时，从容器中取出1个Connection对象，使用完成后，将这个对象重新装入容器中。这个容器就是连接池

###### 优点

> 节省创建连接和释放连接时的时间资源和内存资源

##### DBCP连接池（了解）

###### jar包

> ![](media/image101.png){width="1.90625in" height="0.4791666666666667in"}

###### 使用

####### 手动配置

--------------------------------------------------------------
  *//创建dbcp连接池对象\
  *BasicDataSource bds = **new** BasicDataSource();\
  *//设置驱动、url、username、password\
  *bds.setDriverClassName(**\"com.mysql.jdbc.Driver\"**);\
  bds.setUrl(**\"jdbc:mysql:///mydb1\"**);\
  bds.setUsername(**\"root\"**);\
  bds.setPassword(**\"943397\"**);\
  Connection con = bds.getConnection();\
  *//\...\...执行操作\
  //因为使用了连接池，这里不是关闭con对象，而是重新放回连接池\
  *con.close();

--------------------------------------------------------------

####### 自动配置

1.  配置文件

> 编写properties文件，配置driverClassName、url、username、passwd等字段：1
>
> 文件名：dbcp.properties

----------------------------------------------
  **driverClassName**=**com.mysql.jdbc.Driver\
  url**=**jdbc:mysql:///mydb1\
  username**=**root\
  password**=**943397**

----------------------------------------------

2.  代码

  -------------------------------------------------------------------------------
  *//获取配置文件的properties对象\
  *Properties pt = **new** Properties();\
  FileInputStream fs = **new** FileInputStream(**\"E:\\\\dbcp.properties\"**);\
  pt.load(fs);\
  *//获取dbcp连接池对象\
  *DataSource ds = BasicDataSourceFactory.*createDataSource*(pt);\
  Connection con = ds.getConnection();\
  *//\...\...执行操作\
  //因为使用了连接池，这里不是关闭con对象，而是重新放回连接池\
  *con.close();

  -------------------------------------------------------------------------------

##### C3P0连接池（必会）

###### jar包

> ![](media/image102.png){width="1.5104166666666667in" height="0.2604166666666667in"}

###### 使用

####### 手动配置

-----------------------------------------------------------------
  *//创建C3P0连接池对象\
  *ComboPooledDataSource cpds = **new** ComboPooledDataSource();\
  *//设置驱动、url、username、password\
  *cpds.setDriverClass(**\"com.mysql.jdbc.Driver\"**);\
  cpds.setJdbcUrl(**\"jdbc:mysql:///mydb1\"**);\
  cpds.setUser(**\"root\"**);\
  cpds.setPassword(**\"943397\"**);\
  Connection con = cpds.getConnection();\
  *//\...\...执行操作\
  //因为使用了连接池，这里不是关闭con对象，而是重新放回连接池\
  *con.close();

-----------------------------------------------------------------

####### 自动配置

1.  C3P0的配置文件可以是properties文件或xml文件

2.  如果C3P0配置文件名为"c3p0.properties"或"c3p0-config.xml"，并且放置在classpath路径下（对应WEB应用就是classes目录），那么C3P0会自动找到这个文件

3.  注意，上条的配置文件直接放在src下即可，项目部署时会自动搬过去

<!-- -->

1.  XML配置文件

> 在src下新建"c3p0-config.xml"文件：

------------------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"UTF-8\"***?\>\
  *\<**c3p0-config**\>\
  \<**default-config**\>\
  \<**property name=\"driverClass\"**\>com.mysql.jdbc.Driver\</**property**\>\
  \<**property name=\"jdbcUrl\"**\>jdbc:mysql:///mydb1\</**property**\>\
  \<**property name=\"user\"**\>root\</**property**\>\
  \<**property name=\"password\"**\>943397\</**property**\>\
  \</**default-config**\>\
  \</**c3p0-config**\>

------------------------------------------------------------------------------

2.  properties配置文件

> 在src下新建"c3p0.properties"文件：

  --
  --

3.  代码

  -----------------------------------------------------------------
  *//创建C3P0连接池对象，自动寻找配置文件\
  *ComboPooledDataSource cpds = **new** ComboPooledDataSource();\
  Connection con = cpds.getConnection();\
  *//\...\...执行操作\
  //因为使用了连接池，这里不是关闭con对象，而是重新放回连接池\
  *con.close();

  -----------------------------------------------------------------

###### 连接池工具类

-------------------------------------------------------------------------------------
  **public class** DataSourceUtil {\
  **private static** ComboPooledDataSource *cpds* = **new** ComboPooledDataSource();\
  **public static** Connection getConnection() **throws** SQLException {\
  **return** *cpds*.getConnection();\
  }\
  **public static** DataSource getDataSource(){\
  **return** *cpds*;\
  }\
  }

-------------------------------------------------------------------------------------

##### tomcat内置连接池

> 不常用，未作笔记，如使用重新查看视频学习

#### 元数据

> 元数据（metaData）指数据库中库、表、列的定义信息；表的字段名称就是表的定义信息

1.  DatabaseMetaData 数据库元数据

<!-- -->

3.  ParameterMetaData 参数元数据（sql中？占位符的信息）

4.  ResultSetMetaData 结果集元数据

##### DatabaseMetaData

> 用于获取数据库相关信息

###### 获取数据库元数据

> 通过connection对象使用getMetaData方法获取

-------------------------------------------
  DatabaseMetaData dmd = con.getMetaData();
  -------------------------------------------

###### API

####### getDriverName

> 功能：获取驱动名称

####### getUserName

> 功能：获取用户名

####### getURL

> 功能：获取URL

####### getDatabaseProductName

> 功能：获取数据库名称

####### getDatabaseProductVersion

> 功能：获取数据库版本

####### getPrimaryKeys

> 功能：获取主键相关信息
>
> 语法：ResultSet getPrimaryKeys（String catalog，String schema，String table）
>
> 参数：前两个不要管直接给null就可以，table：表名
>
> 返回值：结果集
>
> 例：获取主键名称

--------------------------------------------------------------------
  ResultSet rs = dmd.getPrimaryKeys(**null**,**null**,**\"emp\"**);\
  **if**(rs.next())\
  System.***out***.println(rs.getObject(4));

--------------------------------------------------------------------

##### ParameterMetaData

> 用于获取sql语句中占位符相关信息

###### 获取ParameterMetaData

> 通过PreparedStatement的getParameterMeteData方法获取

--------------------------------------------------------------------------------------------------
  PreparedStatement ps = con.prepareStatement(**\"select** *\** **from emp where empno = ?;\"**);\
  ParameterMetaData pmd = ps.getParameterMetaData();

--------------------------------------------------------------------------------------------------

###### API

####### getParameterCount

> 功能：获取占位符参数个数

##### ResultSetMetaData

> 获取结果集相关信息

###### 获取结果集元数据

> 功能ResultSet的getMetaData方法获取

-------------------------------------------
  ResultSet rs = ps.executeQuery();\
  ResultSetMetaData rmd = rs.getMetaData();

-------------------------------------------

###### API

####### getColumnCount

> 功能：获取列数量

####### getColumnName

> 功能：获取指定列的列名称
>
> 语法：String getColumnName（int column）
>
> 参数：指定的列

####### getColumnTypeName

> 功能：获取指定列的类型
>
> 语法：String getColumnTypeName（int column）
>
> 参数：指定的列

#### dbutils

##### 介绍

> 他就是JDBC封装工具，使用dbutils可以简化操作

###### jar包

> ![](media/image103.png){width="1.9791666666666667in" height="0.2708333333333333in"}

##### QueryRunner类

> 该类用于执行sql语句的类，query方法用于执行select；update方法用于执行update、delete、insert；batch方法用于执行批处理

(1) ###### 获取QueryRunner对象

    -   使用无参构造方法

---------------------------------------------
  QueryRunner runner = **new** QueryRunner();
  ---------------------------------------------

-   这种方法创建的QueryRunner。事务可以自己控制

-   该方法创建的QueryRunner在使用query、update、batch方法时，一般与带Connection参数的方法配合使用

    -   使用有参构造方法

----------------------------------------------------------------
  ComboPooledDataSource cpds = **new** ComboPooledDataSource();\
  QueryRunner runner = **new** QueryRunner(cpds);

----------------------------------------------------------------

-   使用有参数的构造方法创建QueryRunner，参数是连接池对象，这种方法创建的QueryRunner，事务必须自动提交，无法自己控制

-   该方法创建的QueryRunner在使用query、update、batch方法时，一般与不带Connection参数的方法配合使用

###### query方法

> 该方法有很多构造方法，一般使用无参构造方法创建QueryRunner时，使用带Connection参数的query方法；使用有参构造方法创建QueryRunner时，使用不带Connection参数的query方法；sql语句中用到？占位符时，需要使用带可变参数的query方法

-   **语法**

    -   **\<T\> T query(Connection conn, String sql, ResultSetHandler\<T\> rsh)**

> 使用无参构造方法创建QueryRunner，并且sql语句中没有？占位符时使用该方法

-   **\<T\> T query(Connection conn, String sql, ResultSetHandler\<T\> rsh, Object\... params)**

> 使用无参构造方法创建QueryRunner，并且sql语句中有？占位符时使用该方法

-   **\<T\> T query(String sql, ResultSetHandler\<T\> rsh)**

> 使用有参构造方法创建QueryRunner，并且sql语句中没有？占位符时使用该方法

-   **\<T\> T query(String sql, ResultSetHandler\<T\> rsh, Object\... params)**

> 使用有参构造方法创建QueryRunner，并且sql语句中有？占位符时使用该方法

-   **参数**

    -   conn：Connection数据库连接对象

    -   sql：sql语句

    -   rsh：实现接了ResultSetHandler接口的类的对象，用于将返回的ResultSet进行封装

    -   params：可变参数，用于给sql语句中的可变参数赋值

-   **返回值**

> 对结果集封装之后的结果

-   **例程**

####### 例程1

--------------------------------------------------------------------------------------------------------
  ComboPooledDataSource cpds = **new** ComboPooledDataSource();\
  Connection con = cpds.getConnection();\
  QueryRunner runner = **new** QueryRunner();\
  String sql = **\"select \* from dept\"**;\
  List\<deptBean\> list = runner.query(con,sql,**new** BeanListHandler\<deptBean\>(deptBean.**class**));

--------------------------------------------------------------------------------------------------------

####### 例程2

-------------------------------------------------------------------------------------------------------
  ComboPooledDataSource cpds = **new** ComboPooledDataSource();\
  QueryRunner runner = **new** QueryRunner(cpds);\
  String sql = **\"select \* from dept where deptno=?\"**;\
  List\<deptBean\> list = runner.query(sql,**new** BeanListHandler\<deptBean\>(deptBean.**class**),10);

-------------------------------------------------------------------------------------------------------

> 其中，BeanListHandler是ResultSetHandler的实现类，deptBean是对dept表中字段进行封装的javaBean类

###### update

> ![](media/image104.png){width="5.768055555555556in" height="1.93125in"}
>
> 与query用法基本相同，自行查阅jar包附带的API

###### batch

> ![](media/image105.png){width="5.768055555555556in" height="1.0027777777777778in"}
>
> 与query用法也基本相同，差别在于batch中是使用二维数组传递占位符的参数

##### ResultSetHandler接口

> 用于定义结果集的封装；它提供9个实现类，可以进行不同的封装

###### 自定义ResultSetHandler接口实现类

> 绝大多数情况下使用ResultSetHandler接口的9大实现类即可满足需求，对于特殊需求的时候才会使用该方法

---------------------------------------------------------------------------------------------
  **public void** test1() **throws** SQLException {\
  QueryRunner runner = **new** QueryRunner(**new** ComboPooledDataSource());\
  String sql = **\"select \* from dept\"**;\
  List\<deptBean\> list = runner.query(sql, **new** ResultSetHandler\<List\<deptBean\>\>() {\
  \@Override\
  *//执行sql后会自动电影该方法并将resultset对象传入\
  ***public** List\<deptBean\> handle(ResultSet resultSet) **throws** SQLException {\
  List\<deptBean\> list = **new** ArrayList\<deptBean\>();\
  **while** (resultSet.next()){\
  deptBean d = **new** deptBean();\
  d.setDeptno(resultSet.getInt(**\"deptno\"**));\
  d.setDname(resultSet.getString(**\"dname\"**));\
  d.setLoc(resultSet.getString(**\"loc\"**));\
  list.add(d);\
  }\
  **return** list;\
  }\
  });\
  }

---------------------------------------------------------------------------------------------

###### 九大实现类

####### ArrayHandler

> 将结果集中第一条记录封装到Object数组，数组中每个元素就是记录中的字段值
>
> ![](media/image106.png){width="4.927083333333333in" height="0.2916666666666667in"}

####### ArrayListHandler

> 将结果集每条记录先封装到数组，再将所有的数组封装到list集合中
>
> ![](media/image107.png){width="4.020833333333333in" height="0.375in"}

####### BeanHandler

> 将结果集中第一条记录封装到1个JavaBean对象中
>
> ![](media/image108.png){width="3.5104166666666665in" height="0.4583333333333333in"}
>
> 该类使用了泛型，用于将数据封装到用户自定义的JavaBean中
>
> 参数"\*.class"用于使用反射实现对数据的封装

####### BeanListHandler

> 将结果集中每条记录封装到JavaBean中，再将JavaBean封装到list集合
>
> ![](media/image109.png){width="3.9166666666666665in" height="0.3854166666666667in"}

####### ColmnListHandler

> 将结果集中指定列的数据封装到list集合中
>
> ![](media/image110.png){width="3.8333333333333335in" height="0.3645833333333333in"}

####### MapHandler

> 将结果集中第一条记录封装到map集合中，key为字段名
>
> ![](media/image111.png){width="5.510416666666667in" height="0.3125in"}

####### MapListHandler

> 将结果集中每条记录封装到Map集合中，再将所有的Map集合封装到list集合中
>
> ![](media/image112.png){width="4.71875in" height="0.4270833333333333in"}

####### KeyedHandler

> 将结果集中每条记录封装到Map集合中，再将所有的Map集合封装到另外1个map集合中，外层map集合的key为指定列的字段值

![](media/image113.png){width="4.958333333333333in" height="0.375in"}

####### ScalarHandler

> 进行单值查询，查询类似于"select count(\*) from account"语句时返回结果就是1个数字，使用该类进行封装

![](media/image114.png){width="5.3125in" height="0.20852799650043743in"}

> 注意：使用该类进行封装时，返回值只可以强转为long类型，强转为int等类型会出错

###### 模拟BeanHandler实现

---------------------------------------------------------------------------
  **public class** MyBeanHandler **implements** ResultSetHandler{\
  **private** Class **clazz**;\
  **public** MyBeanHandler(Class clazz) {\
  **this**.**clazz** = clazz;\
  }\
  \
  \@Override\
  **public** Object handle(ResultSet resultSet) **throws** SQLException {\
  Object obj = **null**;\
  **try** {\
  *//在clazz类上做内省获取这个类的信息\
  *BeanInfo bif = *getBeanInfo*(**clazz**);\
  *//获取javaBean类的属性的描述\
  *PropertyDescriptor\[\] pds = bif.getPropertyDescriptors();\
  *//获取结果集中第一条记录\
  ***if**(resultSet.next()) {\
  *//使用无参构造方法创建1个clazz类的对象\
  *obj = **clazz**.newInstance();\
  *//遍历所有属性描述\
  ***for** (PropertyDescriptor pd : pds) {\
  *//获取1个属性名\
  *String name = pd.getName();\
  *//获取1个属性的set方法\
  *Method writeMethod = pd.getWriteMethod();\
  *//使用obj对象执行这个属性的set方法，将结果集中对应的字段设置到obj对象中\
  ***if** (writeMethod != **null**){\
  writeMethod.invoke(obj,resultSet.getObject(name));\
  }\
  }\
  }\
  } **catch** (IntrospectionException e) {\
  e.printStackTrace();\
  } **catch** (IllegalAccessException e) {\
  e.printStackTrace();\
  } **catch** (InstantiationException e) {\
  e.printStackTrace();\
  } **catch** (InvocationTargetException e) {\
  e.printStackTrace();\
  }\
  **return** obj;\
  }\
  }

---------------------------------------------------------------------------

##### DbUtils类

> 它提供关于关闭资源以及事务rollback、commit操作

##### 使用dbutils执行sql语句时？参数问题

使用dbutils执行sql语句，？参数会自动加上单引号，所以需要注意如下问题：

###### 以模糊查询为例

--------------------------------------------------------------------
  String sql = **\"select \* from customer where ? like \'%?%\'\"**;
  --------------------------------------------------------------------

> 对于上面这条语句，如果第1个？赋值为name，第2个问号赋值为j；则会变成：

-----------------------------------------------------------------
  **\"select \* from customer where \'name\' like \'%\'j\'%\'\"**
  -----------------------------------------------------------------

> 这条语句中有2个错误：

1.  name是字段名，不能使用单引号括起来，所以这里必须使用字符串进行拼接

2.  第2个参数中单引号导致了明显错误，应该是

  -------------
  **\'%j%\'**
  -------------

> 所以第2个参数需要单引号及其中内容全部作为参数传入

正确语句：

----------------------------------------------------------------------------------------------------------------------
  String sql = **\"select \* from customer where \"** + select +**\" like ?\"**;\
  List\<Customer\> list = **null**;\
  **try** {\
  list = **runner**.query(sql, **new** BeanListHandler\<Customer\>(Customer.**class**),**\"\'%\"**+cont+**\"%\'\"**);\
  } **catch** (SQLException e) {\
  e.printStackTrace();\
  }\
  **return** list;

----------------------------------------------------------------------------------------------------------------------

#### UUID

> 使用数据库时，如果ID字段是主键，并且是字符串类型的，在添加数据时，可以使用UUID来生成1个ID：

---------------------------------------------
  **public class** IdUtil {\
  **public static** String getId(){\
  **return** UUID.*randomUUID*().toString();\
  }\
  }

---------------------------------------------

> 这个ID重复的概率是10亿分之一。

### WEB三层架构中使用JDBC

> 在web三层架构中使用JDBC时，获取连接、开始事务、提交事务等操作一般在service层完成，dao层一般只将最基本的单条语句进行封装即可

### API

#### DriverManager

DriverManager类是1个数据库驱动的容器，可以同时加载多个数据库的驱动，在建立连接时（获取Connection对象）通过url参数决定使用哪个数据库的驱动

#### Connection

4.  用来获取PrepareStatement对象，向数据库发送sql语句

5.  操作事务

##### prepareStatement

> 功能：获取PreparedStatement对象
>
> 语法：PreparedSatament prepareStatement()

##### createStatement

> 功能：获取Statement对象
>
> 语法：Statement createStatement()

##### setAutoCommit

> 语法：void setAutoCommit(boolean autoCommit)
>
> 功能：设置是否启用自动提交事务
>
> 参数： autoCommit：true：启用；false：不启用

##### setSavepoint

> 功能：在当前事务中创建1个保存点
>
> 语法：
>
> 该方法有2个重载的方法：

-   Savepoint setSavepoint()

-   Savepoint setSavepoint(String name)

> 参数：保存点的名称

返回值：Savepoint对象，用于回滚

##### rollback

> 该方法有2个重载的方法：

-   void roolback()

> 功能：回滚到上一次提交的状态

-   void rollback(Savepoint savepoint)

> 参数：要回滚的保存点
>
> 功能：回滚到指定的保存点，该保存点到现在的地方之间没有提交过才能成功

##### commit

> 语法：void commit()
>
> 功能：提交事务

##### setTransactionIsolation

> 语法：void setTransactionIsolation (int level)
>
> 功能：设置事务隔离级别
>
> 参数：level：隔离级别，可取值如下：
>
> Connection.TRANSACTION\_READ\_UNCOMMITTED
>
> Connection.TRANSACTION\_READ\_COMMITTED
>
> Connection.TRANSACTION\_REPEATABLE\_READ
>
> Connection.TRANSACTION\_SERIALIZABLE

#### PreparedStatement

1.  执行sql语句

    i.  executeUpdate //执行增、删、改语句，返回int，代表影响行数

    ii. executeQuery //执行查语句，返回结果集ResultSet

<!-- -->

6.  批处理

    iii. addBatch //将sql语句添加到批处理

    iv. executeBatch //执行批处理

    v.  clearBatch //清空批处理

#### ResultSet

> 默认ResultSet只能向下遍历（next()）,也可以设置为滚动的结果集，可以向上遍历或者通过行号定位

##### 获取滚动结果集

> 通过Connection获取PreparedStatement对象时，使用Connection对象的带resultSetType、resultSetConcurrency参数的preparedStatement方法获取，那么使用得到的PreparedStatement对象获取结果集时，获取到的结果集就是滚动结果集。

**参数：**

1.  resultSetType

> 结果集类型，只能是以下值之一：
>
> ResultSet.TYPE\_FORWARD\_ONLY
>
> 该常量指示光标只能向前移动的 ResultSet 对象的类型。
>
> ResultSet.TYPE\_SCROLL\_INSENSITIVE
>
> 该常量指示可滚动但通常不受 ResultSet 底层数据更改影响的 ResultSet 对象的类型。
>
> ResultSet.TYPE\_SCROLL\_SENSITIVE
>
> 该常量指示可滚动并且通常受 ResultSet 底层数据更改影响的 ResultSet 对象的类型

2.  resultSetConcurrency

> 并发类型，只能是以下值之一：
>
> ResultSet.CONCUR\_READ\_ONLY
>
> 该常量指示不可以更新的 ResultSet 对象的并发模式。（就是查询到结果后，在使用过程中，如果数据库中数据改变了，结果集中数据不会跟着改变）
>
> ResultSet.CONCUR\_UPDATABLE
>
> 该常量指示可以更新的 ResultSet 对象的并发模式。（就是查询到结果后，在使用过程中，如果数据库中数据改变了，结果集中数据不会跟着改变）

这两个参数的常用组合有3种：

ResultSet.TYPE\_FORWARD\_ONLY，ResultSet.CONCUR\_READ\_ONLY

ResultSet.TYPE\_SCROLL\_INSENSITIVE，ResultSet.CONCUR\_READ\_ONLY

> ResultSet.TYPE\_SCROLL\_SENSITIVE，ResultSet.CONCUR\_UPDATABLE

**例程：**

----------------------------------------------------------------------------------------------------------------------------------------------------------
  **public void** jdbc() **throws** SQLException {\
  Connection con = **null**;\
  PreparedStatement ps = **null**;\
  ResultSet rs = **null**;\
  **try** {\
  Class.*forName*(**\"com.mysql.jdbc.Driver\"**);\
  con = DriverManager.*getConnection*(**\"jdbc:mysql://127.0.0.1:3306/mydb1?useUnicode=true&amp;characterEncoding=UTF-8\"**,**\"root\"**,**\"943397\"**);\
  ps = con.prepareStatement(**\"select** *\** **from emp\"**, ResultSet.***TYPE\_SCROLL\_SENSITIVE***,ResultSet.***CONCUR\_UPDATABLE***);\
  rs = ps.executeQuery();\
  rs.absolute(2);\
  **while** (rs.previous()){\
  System.***out***.println(rs.getString(**\"ename\"**));\
  }\
  } **catch** (Exception e) {\
  e.printStackTrace();\
  }**finally** {\
  **if**(rs != **null**){\
  rs.close();\
  }\
  **if**(ps != **null**){\
  ps.close();\
  }\
  **if**(con != **null**){\
  con.close();\
  }\
  }\
  }

----------------------------------------------------------------------------------------------------------------------------------------------------------

##### next

> 语法：boolean next()
>
> 功能：将光标移动至结果集下一行
>
> 返回值：是否有下一行数据

##### previous

> 语法：boolean previous()
>
> 功能：将光标移动至结果集上一行
>
> 返回值：是否有上一行数据
>
> 说明：默认光标在第一行之前，所以向前移动之前需要重新定位光标位置

##### absolute

> 语法：boolean absolute(int row)
>
> 功能：将光标移动至结果集指定行
>
> 参数：row：指定的第几行
>
> 返回值：是否有该行数据

##### beforeFirst

> 语法：void beforeFirst(void)
>
> 功能：将光标移动至结果集第一行之前

##### afterLast

> 语法：void afterLast()
>
> 功能：将光标移至结果集最后一行之后

##### updateRow

> 语法：void updateRow()
>
> 功能：用此 ResultSet 对象的当前行的新内容更新底层数据库。

## 网络编程

### 基础知识

#### OSI与TCP/IP参考模型

> ![](media/image115.png){width="4.708333333333333in" height="2.0416666666666665in"}

#### tracert

> 执行"tracert IP地址"，即可知道连接到这个IP经过了哪些路由，每次经过的路由不太一致
>
> ![](media/image116.png){width="5.768055555555556in" height="2.765972222222222in"}

#### 特殊IP

##### 局域网广播

> 255.255.255.255

##### 对子网广播

> 网络号.255.255.255

##### 回路（自己ping自己）

> 127.x.x.x；x为任意值，除去127.0.0.0和127.255.255.255

#### 端口port

##### 端口作用

> 1个IP相当于1个公司，每个端口都相当于1个业务员
>
> 每个业务员负责与1个公司的业务对接，不能所有公司都与同1个业务员对接，那每个公司都会接到很多跟自己业务没关系的信息，这个业务员也会很累
>
> 每个端口负责1个服务的监听，不能所有服务都用同1个端口监听，那每个服务都会收到很多垃圾信息，这个端口效率也很慢

##### 端口范围

> 0\~65535

##### 查看端口状态

> netstat --an

##### 查看监听端口的进程ID

> netstat --anb
>
> 通过这个命令获取到监听这个端口的进程ID后，即可通过结束这个进程来关闭这个端口

##### 端口分类

> 0号端口：
>
> 保留端口
>
> 1\~1024端口：
>
> 有名端口，即被某程序固定使用，一般程序员不使用
>
> ![](media/image117.png){width="3.9583333333333335in" height="0.4375in"}
>
> 1025\~65535端口：
>
> 动态端口，程序员可以使用

##### 注意事项

1.  在计算机（尤其服务器）要尽量少开端口

2.  1个端口只能被1个程序监听

#### URL

##### 概念

> 统一资源定位符
>
> ![](media/image118.png){width="4.802083333333333in" height="0.84375in"}
>
> 简单的说就是本地磁盘或者Internet上资源的地址的唯一表示方法
>
> 如：
>
> 网页上某个图片的属性中可以看到他的URL地址
>
> ![](media/image119.png){width="4.239583333333333in" height="2.0881944444444445in"}
>
> 本地磁盘中某个资源的属性中的位置也是这个资源的URL
>
> ![](media/image120.png){width="3.9270833333333335in" height="2.6041666666666665in"}

##### URL组成

> ![](media/image121.png){width="3.5208333333333335in" height="0.5833333333333334in"}

1.  协议

> 一般是http协议

2.  IP地址

> 可以使用域名，会通过域名解析自动解析为IP地址

3.  端口号

> 如果没有显示端口号，则是默认端口80

4.  资源名称

> 该IP地址的设备上的资源的路径加名称

### 代码实现

#### 流程

> ![](media/image122.png){width="4.739583333333333in" height="3.3020833333333335in"}

#### 代码实现

##### server端监听、等待连接

> ![](media/image123.png){width="4.0in" height="2.8958333333333335in"}
>
> 1个端口被监听后在有1个程序（可能还是这个程序）再监听这个端口，会产生异常：
>
> ![](media/image124.png){width="4.708333333333333in" height="0.8958333333333334in"}

##### client端发送连接请求

> ![](media/image125.png){width="5.083333333333333in" height="2.9166666666666665in"}
>
> 如果找到这个连接，则会继续运行，如果没有找到这个链接，则会抛出异常

##### 收发数据

> 这部分客户端和服务端是相同的
>
> ![](media/image126.png){width="5.768055555555556in" height="1.2284722222222222in"}
>
> 如果连接因为某种原因已经中断了，继续想socket内发送或读取数据，将产生如下异常：
>
> ![](media/image127.png){width="5.25in" height="0.84375in"}

## 注解

### 定义

#### 格式

> 格式：\@注解名称
>
> 例如：\@Override //该注解表示它下面的方法必须是个重写的方法

1)  #### 作用

    1.  注解是用来描述程序应该如何运行的，他是给编译器、解释器、JVM使用的

> 例如：使用了"\@Override"注解的方法如果不是重写的方法则会报错

2.  注解可以将代码解耦合

### jdk中自带3个注解

#### \@Override

作用：给编译器使用，用于描述下面的方法时1个重写的方法

注意：

在jdk1.5中，该注解只能描述继承中的重写

在jdk1.6中，该注解也可以描述接口、抽象类的实现中的重写

#### \@Deprecates

> 作用：用于描述这是1个过时的方法

#### \@SuperWarning("类型")

作用：忽略某类型的警告

类型：

-   unused 变量未使用

-   deprecation 使用了不赞成使用的类或方法时的警告

-   unchecked 执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型。

-   fallthrough 当 Switch 程序块直接通往下一种情况而没有 Break 时的警告。

-   path 在类路径、源文件路径等中有不存在的路径时的警告。?

-   serial 当在可序列化的类上缺少 serialVersionUID 定义时的警告。?

-   finally 任何 finally 子句不能正常完成时的警告。

-   all 关于以上所有情况的警告。

> 例：忽略该类中所有警告

----------------------------------
  \@SuppressWarnings(**\"all\"**)\
  **class** Animal{\
  }

----------------------------------

### 自定义注解

#### 如何自定义注解

> 使用"\@interface 注解名 { }"自定义注解
>
> 例：

-----------------------------------
  @**interface** MyAnnotationTest{\
  }

-----------------------------------

#### 本质

> 上面的自定义注解生成的class文件反编译之后代码如下：

+-----------------------------------------------+
| interface MyAnnotationTest extends Annotation |
|                                               |
| {                                             |
|                                               |
| }                                             |
+-----------------------------------------------+

> "\@interface"的本质就是：定义1个接口，并让这个接口继承Annotation接口，但是不可以自己定义1个接口并继承该接口，必须使用"\@interface"。

#### 注解成员

##### 成员变量

> 自定义注解中可以有成员变量，但是接口中的成员变量必须为常量，所以基本不使用

1.  ##### 成员方法

    7.  在开发中，使用注解时，我们一般只研究他的成员方法

    8.  我们一般关注解中的成员方法叫做注解中的属性

<!-- -->

(1) ###### 注解中属性的类型

    2.  注解中属性的类型，指的是注解中成员方法的返回值
    
    <!-- -->
    
    9.  属性的类型只能是以下几种：
    
        -   基本类型：

> 整型：byte、short、int、long
>
> 浮点：float、double
>
> 字符：char
>
> 逻辑：boolean

-   String

-   Class

-   enum

-   其他注解类型

-   以上类型的一维数组

10. 例

  ------------------------------------
  @**interface** MyAnnotationTest{\
  **int** fun1();\
  String fun2();\
  Class fun3();\
  MyEnum fun4();\
  MyAnnotationTest1 fun5();\
  String\[\] fun6();\
  }\
  @**interface** MyAnnotationTest1{\
  }\
  **enum** MyEnum{\
  ***NUM1***,\
  ***NUM2\
  ***}

  ------------------------------------

###### 注解中属性的使用

####### 必须赋值

注解中的属性，如果没有默认值，则在使用注解时必须给属性赋值

####### 默认值

> 注解中的属性可以赋1个默认值
>
> 方法：定义属性时，后面加上：default 默认值
>
> 例：

-------------------------------
  **int** fun1() **default** 1;
  -------------------------------

####### 注解中属性赋值

3.  单值赋值

> 在使用时：\@注解(属性 = 值)

----------------------------
  \@MyAnnotationTest(fun1=1)
  ----------------------------

4.  数组赋值

    1.  如果只为数组赋1个值

> 在使用时：\@注解(属性 = 值)

----------------------------
  \@MyAnnotationTest(fun2=1)
  ----------------------------

2.  如果为数组赋多个值

> 在使用时：\@注解(属性 ={值1，值2})

--------------------------------
  \@MyAnnotationTest(fun2={1,2})
  --------------------------------

5.  属性名称为value

> 如果属性名为value，则可以省略属性名
>
> 例：

-----------------------------
  \@MyAnnotationTest(value=1)
  -----------------------------

> 可以写成

-----------------------
  \@MyAnnotationTest(1)
  -----------------------

6.  多个属性赋值

> 注解中存在多个属性时，赋值需要使用"，"分割
>
> 例：

---------------------------------
  \@MyAnnotationTest(value=1,i=2)
  ---------------------------------

> 注意：
>
> 此时，即使注解中存在value属性，但是因为还存在其他必须赋值的属性，所以value属性名不能省略了

#### 元注解

> 元注解就是修饰注解的注解

##### \@Retention

-   作用：指定注解给谁使用

-   属性：RetentionPolicy value();

-   说明：

> RetentionPolicy是1个枚举类型，取值如下：

-   RetentionPolicy.SOURCE：

> 给编译器使用，编译之后就抛弃该元注解修饰的自定义注解

-   RetentionPolicy.CLASS：

> 给解释器使用，jvm加载完成后就抛弃该元注解修饰的自定义注解

-   RetentionPolicy.RUNTIME：

> jvm加载完成后该元注解修饰的自定义注解仍然存在，开发人员可以通过反射来获取注解相关信息

-   java代码执行过程

> ![](media/image128.png){width="3.75in" height="0.4314162292213473in"}

##### \@Target

-   作用：定义注解的使用位置

-   属性：ElementType\[\] value();

-   说明：

> ElementType是1个枚举类型，取值如下：
>
> ![](media/image129.png){width="2.4270833333333335in" height="2.3475076552930885in"}

-   例：

> 自定义注解上加上\@Target元注解后，该自定义注解只能在类、接口、和方法上：

--------------------------------------------------------------
  \@Target({ElementType.***TYPE***,ElementType.***METHOD***})\
  @**interface** MyAnnotationTest{\
  **int** value();\
  }

--------------------------------------------------------------

2.  ##### \@Documented

    -   作用：通过javadoc生成文档时，是否抽取注解描述；如果是，则加上该元注解

3.  ##### \@Inherited

    -   作用：描述当前注解是否具有继承性，如果是，则加上该元注解

    -   继承性：父类中的方法使用了1个自定义注解，继承该父类的子类在重写父类的方法时，如果也想使用该自定义注解，则要求该自定义注解具有继承性，那么在定义该自定义注解时需要加上\@Inherited元注解

#### 反射操作注解

> 只有Retention设置为RUNTIME的自定义注解才可以使用反射操作

1.  ##### 步骤

    3.  获取使用了注解的（方法、变量）所在的类的class

> 在不同的地方操作注解，获取class的方法不同，参见[[Class获取的方式]{.underline}](#class获取的方式)

4.  获取使用了注解的（方法、变量）

> 通过上面获取到的class的getDeclaredMethod方法获取

5.  判断该方法是否使用了指定的注解

> 通过上面获取到的Method的isAnnotationPresent方法判断

6.  获取注解

> 通过上面获取到的Method的getAnnotation方法获取

7.  获取注解中属性的值

> 使用上面获取到的Annotation对象的对应方法获取

##### 例

> 参见[[银行转账]{.underline}](#银行转账)

#### 案例

##### 银行转账

###### 目的

了解如何通过反射获取注解的属性

###### 需求

> 编写1个函数，功能为如果没超过最大金额，则打印"A向B转账x元钱"，如果超过最大金额则抛出异常；最大金额来自注解的属性

###### 代码

####### 自定义注解

---------------------------------------------
  \@Target(ElementType.***METHOD***)\
  \@Retention(RetentionPolicy.***RUNTIME***)\
  **public** @**interface** BankInfo {\
  **int** maxMoney();\
  }

---------------------------------------------

####### 使用注解

-----------------------------------------------------------------------------------------------------------------------------------
  \@BankInfo(maxMoney = 5000)\
  **public void** account(String from, **int** money, String to) **throws** NoSuchMethodException {\
  *//获取本方法的Method对象\
  *Method account = **this**.getClass().getDeclaredMethod(**\"account\"**, String.**class**, **int**.**class**, String.**class**);\
  *//判断是否使用了BankInfo注解\
  ***boolean** flag = account.isAnnotationPresent(BankInfo.**class**);\
  **if**(flag){\
  *//获取注解\
  *BankInfo bankInfo = account.getAnnotation(BankInfo.**class**);\
  *//获取最大转账金额\
  ***int** maxMoney = bankInfo.maxMoney();\
  **if**(money \> maxMoney){\
  **throw new** RuntimeException(**\"超出最大转账金额\"**);\
  }\
  System.***out***.println(from+**\" 向 \"**+to+**\" 转账\"** + money + **\"元\"**);\
  }\
  }

-----------------------------------------------------------------------------------------------------------------------------------

## 类加载器

### 作用

> 类加载器负责将.class文件加载到内存中，并为之生成对应的java.lang.Class对象

### 初始类加载器

> 当JVM启动时，会形成由3个类加载器组成的初始类加载器层次结构：

-   引导类加载器

> 名称：BootStrap
>
> 加载内容：JRE/lib/rt.jar；基本类库

-   扩展类加载器

> 名称：ExtClassLoader
>
> 加载内容：JRE/lib/ext/\*.jar；扩展包中的类

-   应用类加载器（系统类加载器）

> 名称：AppClassLoader或SystemClassLoader
>
> 加载内容：工程中CLASSPATH指定的所有jar包或目录

### 全盘负责委托机制

3.  classloader加载类采用的是全盘负责委托机制

4.  全盘负责

> 当1个ckassloader加载1个class的时候，这个class依赖和引用的其他class通常也由这个classloader负责载入

5.  委托机制

> 先让父类加载器寻找，只有在父类找不到的时候才从自己的路径中寻找

6.  cache机制

> 类加载还采用了cache机制，如果cache（缓存）中保存了这个class就直接返回它，如果没有才从文件中读取和转换为class并保存入cache，这就是为什么修好了class蚕食必须重启JVM才能生效，并且类只加载1次的原因

### 自定义类加载器

#### 作用

> 当自定义的类，与rt.jar中自带的类出现包名与类名均相同时，由于rt.jar中的类已经被引导类加载器加载，并保存在缓存中，所以当加载到自定义的类时，JVM认为已经被加载就不会加载自定义的类。
>
> 此时如果想继续加载自定义的类，就需要用到自定义加载器

#### 步骤

7.  创建1个类继承ClassLoader

8.  重写findClass方法，在该方法中使用defineClass方法将class文件转换为class对象

9.  得到class对象后，只能通过反射调用该类中的方法

#### 代码

##### 自定义类加载器

> 这段代码是通用的，无需任何更改即可加载任意类

--------------------------------------------------------------------------------------
  **public class** MyClassLoader **extends** ClassLoader {\
  *//工程中的classes目录\
  ***private** String **rootDir**;\
  **public** MyClassLoader(String rootDir) {\
  **this**.**rootDir** = rootDir;\
  }\
  **protected** Class\<?\> findClass(String name) **throws** ClassNotFoundException {\
  *//将"包名+类名"中的"."替换为"\\\\"，得到该类文件相对于classes目录的相对路径\
  *String extname = name.replace(**\".\"**, **\"\\\\\"**);\
  *//获取该类文件的绝对磁盘路径\
  *String filename = **rootDir** + **\"\\\\\"** + extname + **\".class\"**;\
  *//读取类文件并转换为byte数组\
  *ByteArrayOutputStream baos = **new** ByteArrayOutputStream();\
  **try** {\
  InputStream is = **new** FileInputStream(filename);\
  **int** len = -1;\
  **byte**\[\] b = **new byte**\[1024\];\
  **while** ((len = is.read(b)) != -1) {\
  baos.write(b, 0, len);\
  }\
  baos.flush();\
  baos.close();\
  is.close();\
  **byte**\[\] data = baos.toByteArray();\
  *//使用defineClass方法将类转换为class对象\
  ***return** defineClass(name,data,0,data.**length**);\
  } **catch** (Exception e) {\
  e.printStackTrace();\
  }\
  **return null**;\
  }\
  }

--------------------------------------------------------------------------------------

##### 使用自定义类加载器

---------------------------------------------------------------------
  *//得到classes目录\
  *String rootDir = test.**class**.getResource(**\"/\"**).getPath();\
  *//得到自定义类加载器对象\
  *MyClassLoader mcl = **new** MyClassLoader(rootDir);\
  *//获取类的class对象\
  *Class clazz = mcl.findClass(**\"cn.itcast.demo.MimeType\"**);\
  *//调用类中的方法\
  *clazz.getDeclaredMethod(**\"show\"**).invoke(clazz.newInstance());

---------------------------------------------------------------------

## 常用demo

1.  ### 读取"\*.properties"文件

    1.  文件

> jabc.properties文件内容如下：
>
> ![](media/image130.png){width="2.3333333333333335in" height="0.625in"}
>
> 读出该文件中指定参数的值

2.  直接读取配置文件指定字段

> ![](media/image131.png){width="5.395833333333333in" height="0.7291666666666666in"}

3.  获取properties文件的properties对象

  -------------------------------------------------------------------------------
  Properties pt = **new** Properties();\
  FileInputStream fs = **new** FileInputStream(**\"E:\\\\dbcp.properties\"**);\
  pt.load(fs)

  -------------------------------------------------------------------------------

### ThreadLocal在线程内传递对象

#### 问题

> 情景如下：
>
> 编写了1个工具类使用static方法来获取数据库连接，在服务器的应用中每个请求是1个单独的线程，在同一线程中为了在不同的函数中操作同一个事务，需要同一线程中所有方法使用同一个Connection对象，而不同线程之间不可以使用相同的Connection对象，否则不同线程之间操作的也是同一个事务了；这就要求在同一线程中的方法都需要考虑将connection对象作为参数进行传递。
>
> 而实际开发中，制定接口的人可能不会考虑将connection对象这个参数，从而无法实现上述功能，此时可以使用ThreadLocal类在线程中进行对象传递

#### ThreadLocal介绍

> ThreadLocal类是1个泛型类，该类中存在1个key为线程ID的MAP集合，通过get、set方法获取该集合中当前线程对应的泛型对象。一般用该类定义1个static对象，使用get、set方法在同一线程中进行对象传递。

#### 例程

-----------------------------------------------------------------------------------
  **public class** ThreadLoc {\
  *//定义1个泛型为String的静态ThreadLocal对象\
  ***private static** ThreadLocal\<String\> *tl*= **new** ThreadLocal\<String\>();\
  *//同一个线程中调用该方法返回的就是同一个对象\
  ***public static** String getStr(){\
  String str = *tl*.get();\
  **if**(str == **null**){\
  str = **new** String(**\"123\"**);\
  }\
  **return** str;\
  }\
  }

-----------------------------------------------------------------------------------

### Class获取的方式

34. （类、接口）.class

  -------------------------------------------------------------------------------
  Class\<MyAnnotationTest\> myAnnotationTestClass = MyAnnotationTest.**class**;
  -------------------------------------------------------------------------------

35. 对象.getClass()

  ------------------------------------------------------
  MyAnnotation myAnnotation = **new** MyAnnotation();\
  myAnnotation.getClass();

  ------------------------------------------------------

36. Class.forName("类名")

  ----------------------------------------
  Class.*forName*(**\"MyAnnotation\"**);
  ----------------------------------------

37. this.getClass()

> 如果在本类中获取自己类的class可以使用该方法

----------------------
  **this**.getClass();
  ----------------------

### 创建线程

#### 实现Runable接口

> 参见[[异步处理]{.underline}](#异步处理)

# 数据库

## 数据库基础

### 文件VS数据库

1.  文件无法保证安全性

2.  文件不利于查询和管理

3.  文件不利于存放大量数据

4.  文件在程序中控制不方便

### 数据库定义

> 按照数据结构来组织、存储和管理数据的仓库

### 各种数据库介绍

1)  #### access

    1.  隶属公司：微软
    
    2.  小型数据库，操作方便，对内存、CPU要求低，适合做小型项目

#### sql server

1.  隶属公司：微软

2.  不支持linux、unix

3.  中型数据库

#### mysql

1.  隶属公司：瑞典AB公司

2.  很多功能免费；linux上运行方便

3.  大型数据库

#### db2

1.  隶属公司：ibm

2.  海量数据库：处理海量数据的优选，伸缩性、可配置性很高

3.  适合做电信级项目，售后服务很好

#### Sybase

1.  隶属公司：美国Sybase公司，原本和微软是一家的，后来微软退出了

2.  大型数据库

3.  在linux系统上性能更好

#### Informix

1.  隶属公司：ibm

2.  中型数据库

3.  安全性极高，银行喜欢用

#### oracle

1.  隶属公司：美国oracle公司

2.  大型数据库

### 数据库选择

> 根据以下几点进行选择：

3.  成本

> 成本低的，不能选择oracle这种买数据库本身很贵的

4.  功能多少

5.  并发性

> 最终用户多少

4\. 安全性

安全性最好的就是DB2和oracle

5\. 操作系统

## sql server

1.  ### sql server2000安装

    1.  sqlserver2000与win7兼容性很差，建议win7不要使用2000版本

    2.  下载"sql server2000简体中文版4合1".

> 由于兼容性问题,不同系统安装存在一定差异,下面分别进行介绍:

1)  win xp:

> 不能安装企业版,只能安装个人版
>
> 运行4合1安装包中的" AUTORUN.EXE"文件 安装个人版安装sqlserver2000组件 安装数据库服务器

2)  win7 x86:

> 可以正常运行
>
> 运行4合1安装包中的" AUTORUN.EXE"文件 安装任意版本安装sqlserver2000组件 安装数据库服务器

3)  win7 x64:

> 存在兼容问题,打开要安装版本（DEVELOPER（开发版）、PERSONAL（个人版）、STANDARD（标准版）、ENTERPRISE（企业版））目录下的"x86/setup/ SETUPSQL.EXE"文件，遇到兼容性问题继续

后面的步骤就都一致了

2.  一路点击下一步，如果遇到"某程序已经在计算机上创建挂起的文件操作，运行程序之前必须重启计算机"，则下载"SQLfix"工具进行修复即可。

3.  如果要修改程序文件和数据文件的位置，在点击到"安装类型"时修改。

4.  在服务账号界面将账号设置修改为"使用本地系统账号"

5.  到"身份验证模式"界面，改为混合模式，输入sa（超级管理员）密码

6.  除win2000外的系统需要打补丁SQL2000-KB884525-SP4-x86-CHS

> 运行SQL2000-KB884525-SP4-x86-CHS.exe文件，将需要的补丁进行压缩
>
> 运行解压路径下的"setup.bat"文件，遇兼容性问题跳过；输入sa密码后选择升级，一路继续

### 使用

#### 服务管理器

> ![](media/image132.png){width="3.03125in" height="2.5in"}

38. "当启动OS时自动启动服务"为开机自启,还可以在服务中设置启动方式

39. 中间按钮分别为启动服务器、暂停服务器、停止服务器

#### 企业管理器

> 图形化界面方式操作sql server2000 的工具

1.  层次结构

> sqlserver2000中可以创建多个sqlserver实例,每个sqlserver实例中有很多数据库,数据库中有很多数据对象.
>
> 数据对象有很多种,包括:表、触发器、存储过程等等
>
> ![](media/image133.png){width="3.1770833333333335in" height="3.375in"}

2.  修改为每次输入密码才可以登录

> 右键一个sqlserver实例编辑sqlserver注册属性使用sqlserver身份验证，输入登录名，勾选"总是提示输入登录名和密码"

3.  修改sa密码

> 安全性登录，右边窗口找到sa用户，右键属性常规密码

4.  新建用户

> 安全性登录右键新建登录，在这里配置新用户信息

5.  新建数据库

> 数据库右键新建数据库

6.  默认系统会显示很多系统表，可以让其隐藏

> 右击"（LOCAL）（WindowsNT）"编辑sqlserver注册属性取消勾选"显示系统数据库和系统对象"

7.  新建表

> 选中建好数据库里的表，工具栏点击新建
>
> ![](media/image134.png){width="3.1958333333333333in" height="1.8069444444444445in"}
>
> 输入字段名、字段类型、字段长度、是否允许为空
>
> ![](media/image135.png){width="3.415277777777778in" height="0.8770833333333333in"}
>
> 保存时提示输入表名，关闭表即可
>
> ![](media/image136.png){width="3.138888888888889in" height="0.6833333333333333in"}

8.  打开表

> 右击一个表，打开表，返回所有行
>
> ![](media/image137.png){width="2.138888888888889in" height="0.9868055555555556in"}

9.  增删改查

> 增：
>
> 在表中直接录入即可
>
> 删：
>
> 选中1行右键删除
>
> 改：
>
> 直接选中修改
>
> 查：
>
> 企业管理器不利于查询
>
> 对表修改后需要运行才可以保存数据

#### 查询分析器

> 命令行(sql语句)操作sql server2000的工具

1.  SQL语言分为4部分

> 数据定义语言（DDL），例如：CREATE、DROP、ALTER等语句
>
> 数据操作语句（DML），例如：INSERT、UPDATE、DELETE语句
>
> 数据查询语句（DQL），例如：SELECT语句
>
> 数据控制语句（DCL），例如：GRANT、REVOKE、COMMIT、ROLLBACK等语句

40. 打开查询分析器，输入密码登录

> 在这里选择要操作的数据库
>
> ![](media/image138.png){width="3.7333333333333334in" height="0.33541666666666664in"}

输入sql语句后点击运行才生效

![](media/image139.png){width="3.714583333333333in" height="0.5909722222222222in"}

执行成功后需要刷新才可以看见新建的数据库

![](media/image140.png){width="2.111111111111111in" height="2.0701388888888888in"}

41. 只执行部分语句，其他语句不注释但是不执行

> 选中要执行的语句，点击运行

### SQL语句

SQL分类：

DDL---数据定义语言(CREATE，ALTER，DROP，DECLARE)

DML---数据操纵语言(SELECT，DELETE，UPDATE，INSERT)

DCL---数据控制语言(GRANT，REVOKE，COMMIT，ROLLBACK)

#### 注释

> "\--"表示注释该行
>
> ![](media/image141.png){width="0.9715277777777778in" height="0.21666666666666667in"}

#### 切换数据库

> use 数据库名 go 要执行的语句
>
> ![](media/image142.png){width="2.4243055555555557in" height="1.3965277777777778in"}

#### 增

##### 创建数据库

> create database 数据库名
>
> ![](media/image143.png){width="2.4055555555555554in" height="0.3298611111111111in"}

##### 创建表

> create table 表名 (字段名 字段类型(字段字节数), ... )
>
> ![](media/image144.png){width="2.4902777777777776in" height="1.1034722222222222in"}

##### 插入数据

###### 插入所有字段

> insert into 表名 values（字段1，字段2，...）

![](media/image145.png){width="3.158333333333333in" height="0.5638888888888889in"}

###### 插入部分字段

insert into 表名 （字段列表） values（值列表）

> 对于没有指定不允许为空的字段可以插入时只插入字段列表中指定的字段，且值列表的类型及个数要与字段列表相符，没有插入的字段将为NULL；

![](media/image146.png){width="2.3680555555555554in" height="1.1979166666666667in"}

###### 插入顺序

> 插入数据时不是向后添加的，如果之前有删除的行，新添加的行会先把那行补上，没有空位了再向后添加

###### 复制行

> 将某表中的字段复制并插入到另一张表，要求要插入行的字段类型及数量相同
>
> ![](media/image147.png){width="4.010416666666667in" height="0.19791666666666666in"}
>
> 将test表中已有的testName字段复制并插入到test表中

#### 删

##### 删除数据库

> drop database 数据库名
>
> ![](media/image148.png){width="2.03125in" height="0.21875in"}

##### 删除表

drop table 表名

> ![](media/image149.png){width="1.226388888888889in" height="0.2076388888888889in"}

##### 删除记录

###### 删除表中行

delete from 表名 where 条件

![](media/image150.png){width="2.5944444444444446in" height="0.21666666666666667in"}

###### 删除表中重复行

> 步骤：
>
> 将表中取消重复行的数据复制到一张临时表，然后清空本表，将临时表内容复制过来，然后删除临时表

例：

> ![](media/image151.png){width="2.8854166666666665in" height="0.5729166666666666in"}

#### 改

##### 修改数据

功能：改1个或多个字段

语法：update 表名 set 字段名1=新值，字段2=新值 where 条件

> ![](media/image152.png){width="3.4243055555555557in" height="0.18888888888888888in"}

##### 修改字段

> ![](media/image153.png){width="4.4375in" height="2.6979166666666665in"}

#### 查

##### 查表

> [[查表]{.underline}](#查表-1)

##### 查数据库

> 数用户表： select count(1) from sysobjects where xtype=\'U\'
>
> 数视图: select count(1) from sysobjects where xtype=\'V\'
>
> 数存储过程： select count(1) from sysobjects where xtype=\'P\'
>
> 查看用户表：  SELECT \* FROM sysobjects WHERE (xtype = \'U\')
>
> C = CHECK 约束 
>
> D = 默认值或 DEFAULT 约束 
>
> F = FOREIGN KEY 约束 
>
> L = 日志 
>
> FN = 标量函数 
>
> IF = 内嵌表函数 
>
> P = 存储过程 
>
> PK = PRIMARY KEY 约束（类型是 K） 
>
> RF = 复制筛选存储过程 
>
> S = 系统表 
>
> TF = 表函数 
>
> TR = 触发器 
>
> U = 用户表 
>
> UQ = UNIQUE 约束（类型是 K） 
>
> V = 视图 
>
> X = 扩展存储过程

#### 条件筛选

##### 一个条件

sql语句 where 条件

![](media/image154.png){width="2.5944444444444446in" height="0.2076388888888889in"}

##### 等于用"="，不能用"=="

![](media/image155.png){width="3.1034722222222224in" height="0.21666666666666667in"}

##### 不等于用"！="或 "\<\>"

> ![](media/image156.png){width="3.0833333333333335in" height="0.2916666666666667in"}

##### 多条件"与"

sql语句 where 条件1 and 条件2

![](media/image157.png){width="4.358333333333333in" height="0.19791666666666666in"}

##### 多条件"或"

sql语句 where 条件1 or 条件2

![](media/image158.png){width="4.263888888888889in" height="0.19791666666666666in"}

##### 非，不成立

> sql语句 where not 条件
>
> ![](media/image159.png){width="3.3645833333333335in" height="0.25in"}

##### 多条件组合

多个条件组合使用"()"

![](media/image160.png){width="5.768055555555556in" height="0.1840277777777778in"}

##### 值为null的字段做条件时不可以使用"="，只能使用"is"![](media/image161.png){width="3.1069444444444443in" height="0.17916666666666667in"} 

> is null 判断是否为null
>
> sql语句 where 字段名 is null
>
> ![](media/image162.png){width="3.1131944444444444in" height="0.1701388888888889in"}

##### between在某范围内（包含边界）

sql语句 where 字段名 between 范围1 and 范围2

![](media/image163.png){width="4.329861111111111in" height="0.17916666666666667in"}

##### in、not in

in：在某些值范围内

not in：不在某些值范围内

sql语句 where 字段名 in （值列表）

![](media/image164.png){width="3.716666666666667in" height="0.27361111111111114in"}

也可以用用其他语句的结果作为值列表

> select \* from \[tablename\] where \[日期\] in (select \[日期\] from \[tb\] where 条件\... )
>
> \--查询表tablename里\[日期\]在 （表tb 里符合条件 的 日期）。

##### like（模糊条件）

1.  语法

> sql语句 like ' 模糊条件 '
>
> \%：表示0到多个字符
>
> \_：表示单个字符

2.  显示名字首字母为M的行

> ![](media/image165.png){width="3.3208333333333333in" height="0.1701388888888889in"}

3.  显示名字第3字母为T的行

> ![](media/image166.png){width="3.4902777777777776in" height="0.2076388888888889in"}

##### is null 判断是否为null

sql语句 where 字段名 is null

![](media/image162.png){width="3.1131944444444444in" height="0.1701388888888889in"}

### 查表

#### 根据字段查询

select 字段1,字段2，... from 表名

![](media/image167.png){width="1.5847222222222221in" height="0.3298611111111111in"}

#### 根据条件查询

select \* from 表名 where 条件

![](media/image154.png){width="2.5944444444444446in" height="0.2076388888888889in"}

条件参见[[条件筛选]{.underline}](#条件筛选)

#### 取消重复行

select distinct 字段 from 表名 where 条件

要查询的字段完全相同的记录只保留1个

![](media/image168.png){width="3.8868055555555556in" height="0.1701388888888889in"}

#### 使用查询结果建表

> 语法：select 字段 into 表名1 from 表名2
>
> 把表2复制到表1
>
> 表1必须为不存在的表
>
> 例：![](media/image169.png){width="2.84375in" height="0.15625in"}
>
> 将test表中取消 重复行的结果放入一张新表temp1中

#### 算数表达式查询

以下表为例：

> ![](media/image170.png){width="2.4340277777777777in" height="0.7923611111111111in"}

1)  算数表达式查询可以直接进行算术运算

> ![](media/image171.png){width="2.045138888888889in" height="1.0416666666666667in"}

2)  对于值为null的数据无论怎么运算都是null，所以需要使用isnull来判断，如果是null则当做0用

![](media/image172.png){width="3.51875in" height="0.9333333333333333in"}

#### 使用列的别名

select 字段 as 列别名 from 表名

其中：

1)  字段也可以换位算数表达式

2)  as也可以不用

3)  列别名可以使用双引号、单引号或没有引号

![](media/image173.png){width="3.497916666666667in" height="0.9013888888888889in"}

#### isnull 

查询某字段时如果值为null则用某值替换

select isnull(字段名，替换值) from 表名

例如：

> ![](media/image174.png){width="2.763888888888889in" height="0.19791666666666666in"}
>
> 查询family表中fmlcomm字段，如果为null用0替换

注意区分isnull和[[is null 判断是否为null]{.underline}](#is-null-判断是否为null)

#### order by按顺序查表

1.  语法

> sql语句 字段 from 表名 order by 字段1 排序方式，字段2 排序方式，...
>
> 排序方式：asc升序 desc降序 默认升序

2.  例

> 单一排序：
>
> ![](media/image175.png){width="3.0944444444444446in" height="0.2548611111111111in"}
>
> 按名字排序

多重排序：

![](media/image176.png){width="4.0569444444444445in" height="0.21666666666666667in"}

先按工资升序排序，工资相同的行再按名字升序排序

使用别名排序：

按算数表达式结果排序有2种方式：

![](media/image177.png){width="3.9243055555555557in" height="0.19791666666666666in"}

![](media/image178.png){width="3.8583333333333334in" height="0.2076388888888889in"}

但是一般使用后者，用别名进行排序

#### 分组函数

> sql函数不能进行使用"\>、\<、="等进行判断
>
> 一般情况下，sql函数不能和其他字段一起作为要查询的内容，除非使用了group by等特殊用法的情况；因为前者sql函数的结果数目与字段的结果数目不一定相同，而后者有多少组就一定有多少个sql函数的结果

1.  min

> 功能：最小值（不计null）
>
> 例：![](media/image179.png){width="1.9597222222222221in" height="0.1625in"}

2.  max

> 功能：最大值（不计null）
>
> 例：![](media/image180.png){width="4.479166666666667in" height="0.11944444444444445in"}

3.  avg

> 功能：平均值（不计null）
>
> 例：![](media/image181.png){width="4.479166666666667in" height="0.14791666666666667in"}

4.  sum

> 功能：求和（不计null）
>
> 例：![](media/image182.png){width="1.9597222222222221in" height="0.16875in"}

5.  count

> 功能：返回指定字段不为null的记录数，\*表示所有行数
>
> 例：![](media/image183.png){width="2.0284722222222222in" height="0.13194444444444445in"}

#### group by

> 功能：按多个字段分组

语法：

> select sql函数1，sql函数2，...，字段1，字段2，... from 表名 group by 字段1，字段2，...

1.  先按字段1分组，在从分组结果中按字段2分组，...，再对虽有的分组按sql函数进行计算

2.  from前字段要和group by后字段一一对应，顺序可以不同

例：显示每个部门平均工资和最高工资

> ![](media/image184.png){width="3.9243055555555557in" height="0.16041666666666668in"}
>
> 显示每个部门每个岗位平均工资和最低工资
>
> ![](media/image185.png){width="4.48125in" height="0.1701388888888889in"}

#### having

功能：和group by配套使用，对分组后的结果进行筛选

语法：select sql函数，...，字段，... from 表名 group by 字段 having 筛选条件

> having的筛选条件里不能使用别名

例：显示平均工资低于2000的部门号和它的平均工资

> ![](media/image186.png){width="4.072916666666667in" height="0.11458333333333333in"}

#### 数据分组总结

1.  分组函数只能出现在选择列表（select后）、having、order by子句中

2.  如果select语句中同时出现group by，having，order by

> 则顺序为：group by，having，order by

3.  如果分组函数和列或表达式同时出现在选择列表中，则列或表达式必须出现在group by子句中。

#### 表的别名

> select \[别名.\]字段 from 表名 别名
>
> ![](media/image187.png){width="2.298611111111111in" height="0.28541666666666665in"}
>
> 表起了别名之后，要么用"别名."，要么不要指定表，不可以使用"表名."，下面的用法是错误的：
>
> ![](media/image188.png){width="2.8180555555555555in" height="0.23402777777777778in"}

#### 多表查询

> 语法:select 字段1，... from 表1，表2，...

1.  要查询的字段可以是要查询的任意表中的字段；但是如果该字段是要查询的表中存在的同名字段，则应该使用"表.字段"的方式

2.  这样查表的结果是把每张表的每一行进行组合输出；如：两张表分别为5行和10行，则会输出50个结果，这样就造成了"笛卡尔积"问题。为了避免该问题，应该根据需求增加筛选条件来避免这个问题。

> 如：显示雇员名、雇员工资、雇员所在部门号
>
> ![](media/image189.png){width="4.329861111111111in" height="0.3020833333333333in"}
>
> 这样就可以在employee表中的每个员工在department表中只对应1行数据

#### 表的连接

内连接和外连接中的inner和outer均可省略

##### 内连接

> 语法：
>
> select 字段 from 表1 join 表2 on 匹配条件
>
> 内连接的另一种写法（隐式内链接）：
>
> select 字段 from 表1，表2 where 匹配条件
>
> 功能：显示两张表中所有匹配的记录

例：显示所有父子关系，不包括无父无儿的人

> ![](media/image190.png){width="4.697916666666667in" height="0.4791666666666667in"}

##### 外连接

> 左外连：
>
> 语法：select 字段 from 表1 left (outer) join 表2 on 匹配条件
>
> 功能：左边表的记录全部显示，如果没有匹配的记录就用null填
>
> 例：显示所有父亲及其儿子的名字
>
> ![](media/image191.png){width="4.579861111111111in" height="0.1423611111111111in"}
>
> 右外连：
>
> 语法：select 字段 from 表1 right (outer) join 表2 on 匹配条件
>
> 功能：右边表的记录全部显示，如果没有匹配的记录就用null填
>
> 例：显示所有儿子及其父亲的名字
>
> ![](media/image192.png){width="4.579861111111111in" height="0.15833333333333333in"}
>
> 完整外连接：
>
> 语法：select 字段 from 表1 full (outer) join 表2 on 匹配条件
>
> 功能：左右边表的记录都全部显示，如果没有匹配的记录就用null填

例：显示所有人的父子关系，包括无父无儿的人

##### 自连接

一个表与自身进行连接，称为自连接

自连接是使用连接的1种思想，没有特殊语法

例题：查找出自己和上级的名字

分析：自己和上级都在同一张表中，可以将同一张表看成两张表进行查询

![](media/image193.png){width="5.34375in" height="0.21180555555555555in"}

#### 子查询

> 子查询又叫嵌套查询，指嵌入在其他sql语句中的select语句

##### 单行子查询

> 子查询返回结果为1行数据，此时可以在筛选条件中用"="
>
> 例：显示和smith在同一部门的所有员工
>
> 分析：子查询要找到smith所在部门，该结果为1条数据
>
> ![](media/image194.png){width="4.458333333333333in" height="0.3333333333333333in"}

##### 多行子查询

> 子查询返回结果为多行数据，此时不可以在筛选条件中用"="等 ，可以用"in"等
>
> 例：查询和部门10的工作相同的雇员的名字
>
> 分析：子查询要找到10号部门都有哪些工作
>
> ![](media/image195.png){width="3.8541666666666665in" height="0.34375in"}

##### 在from子句中使用子查询

> 把子查询结果起个别名作为1张临时表放在from子句后，进行查询

例：显示高于部门平均工资的员工的信息

> 分析：现有一张表里有所有员工的部门及工资，如果再有一张表里面有每个部门的平均工资，这个问题就简单了。所以可以用子查询来建立一张临时表，来实现

![](media/image196.png){width="5.25in" height="0.27361111111111114in"}

#### 分页查询

##### top

> top后面的数字代表要取出前几条记录

##### 按入职时间取出前5个员工

> ![](media/image197.png){width="3.4375in" height="0.20833333333333334in"}

##### 按入职时间取出第6到10个员工

> ![](media/image198.png){width="3.8958333333333335in" height="0.4895833333333333in"}
>
> 先找出前5，把剩下的排序再取出前5

#### 获取表的字段属性

> SELECT syscolumns.name,systypes.name,syscolumns.isnullable, syscolumns.length FROM syscolumns, systypes WHERE syscolumns.xusertype = systypes.xusertype AND syscolumns.id = object\_id ( \' 你的表名 \' )
>
> ![](media/image199.png){width="2.8854166666666665in" height="0.84375in"}

### 命名规范

1.  必须以字母、下划线、汉字开头

2.  长度不能超过128字符

3.  不要使用sqlserver保留字

4.  只能使用如下字符：A-Z，a-z，0-9，\$，\#，\_等

### 数据类型

#### 字符型

##### char

定长；最大8000字符（8000字节）；非Unicode编码

用法：char(10)

![](media/image200.png){width="1.2333333333333334in" height="0.47152777777777777in"}

定长：指定多少字节，就会分配多少字节，没有使用的字节用空格补全

最大8000字符：char类型最大分配8000字符，再大就报错

非Unicode编码：

> Unicode编码：无论字母还是汉字，都使用2个字节表示
>
> 非Unicode编码：字母使用1个字节表示，汉字使用2个字节表示
>
> 涉及中文时尽量使用Unicode编码

##### varchar

变长；最大8000字符（8000字节）；非Unicode编码

用法：varchar(10)

> ![](media/image201.png){width="1.2381944444444444in" height="0.5in"}

变长：使用多少字节就分配多少字节，节省空间

##### char VS varchar：

char浪费空间，但是效率高；varchar节省空间，但是效率低

如果一个字段的长度固定，要使用char，这样可以提升查询效率

##### ntext

变长；最大2\^30 -- 1个字符（2\^31 -- 1个字节）；Unicode编码

##### text

变长；最大2\^31 -- 1个字符（2\^31 -- 1个字节）；非Unicode编码

##### nchar

定长；最大4000字符（8000字节）；Unicode编码

##### nvarchar

变长；最大4000字符（8000字节）；Unicode编码

##### 字符型选择

1.  如果字段有汉字，选用带'n'的类型（nchar、nvarchar、ntext）；如果字段中没有汉字，选择不带n的类型（char、varchar、text）

2.  如果字段长度固定，使用char或nchar，否则选择其他类型

3.  如果字段超过8000字节，则使用text或ntext

4.  如果一些特殊字符在nvarchar中没有，如日文某些名片，只能选择varchar，转到nvarchar会丢失

#### 数字型

> bit：0到1
>
> bigint：8字节，有符号
>
> int：4字节，有符号
>
> smallint：2字节，有符号
>
> tinyint：1字节，无符号
>
> float：放小数，不推荐
>
> float存1.211会变成1.21100000000000001
>
> 可以使用float\[n\]来指定保留几位小数，n在1\~53之间
>
> numeric：小数；强烈推荐
>
> numeric(p,s)：p指定整数和小数总位数，范围1\~39；s指定小数位数，范围0\~p，s默认为0；也可以写成numeric（n）来表示整数

#### 日期类型

1.  datetime

> 表示时间，最小到毫秒
>
> sqlserver提供了专门获取时间的函数getdate()获取当前时间
>
> ![](media/image202.png){width="2.2333333333333334in" height="1.3840277777777779in"}
>
> 如果插入的不是当前时间，可以直接以字符型"YYYY-MM-DD"来指定datetime类型的时间
>
> ![](media/image203.png){width="2.9715277777777778in" height="0.2076388888888889in"}

2.  timestamp（时间戳）

#### 图片

1.  image

> 用于在数据库中保存图片，但是一般只要在考虑突变安全性的时候，才将图片放入数据库，而且不要太大
>
> 一般数据库中只保留图片的路径，而将图片放入图片服务器，网页收到该路径后会自动去该地址加载图片；图片服务器要求带宽足够，但是任何人都可以访问，并不安全

#### 视频

1.  binary

> 用于存放视频
>
> 一般在数据库中存放路径，把视频放在文件服务器。

### 约束

#### not null（非空）

> 非空字段在插入数据时必须为列提供数据
>
> 例：
>
> ![](media/image204.png){width="4.822916666666667in" height="1.511111111111111in"}

#### unique（唯一）

> 唯一字段，可以为空，不可以重复，一张表中可以有多个
>
> 例：
>
> ![](media/image205.png){width="4.614583333333333in" height="2.1034722222222224in"}

#### identity

1.  语法：identity（n，m）表示该字段自增，从n开始每次加m

2.  identity字段不能在插入时指定该字段的值；不能修改该字段的值；被删除的该字段的值不会再次被使用

#### 主键

1.  主键是一张表中的唯一标识符，不能出现重复

2.  任何类型均可以定义为主键

3.  主键是不能为空的字段

4.  一个表中只能有1个主键，但是可以有复合主键

5.  语法

> create table 表名 （字段名 字段类型 primary key）
>
> ![](media/image206.png){width="3.81875in" height="1.0819444444444444in"}

6.  复合主键

> 符合主键就是将多个字段作为1个主键
>
> 语法：
>
> create table 表名 （字段1 字段类型，字段2 字段类型，primary key（字段1，字段2））
>
> ![](media/image207.png){width="2.4791666666666665in" height="1.0in"}

7.  行级定义、表级定义

> 行级定义：
>
> 创建表时，写完字段立马指定其属性；如单一主键的定义

表级定义：

所有字段写完后，在指定某些字段的属性；如复合主键定义

#### 外键

> 如果需要一张表中的某个字段的值必须在某张表（其他表或自己）中的某个字段存在唯一的与之对应的值，则需要使用外键（如某员工的所属部门），使用外键的是从表，外键指向的表是主表

42. 外键只能定义在从表，并指向主表的主键或unique字段

43. 外键和主键数据类型要一致

44. 增加或修改某外键时，新值必须是指向的表的主键中存在的值

45. 一个表中可以创建多个外键

46. 语法

> create table 表名 （字段名 字段类型 foreign key references 表名（主键字段名））
>
> ![](media/image208.png){width="3.1666666666666665in" height="1.59375in"}

#### check（检查）

> 强制该字段的数据必须满足某条件
>
> 例:
>
> ![](media/image209.png){width="4.36875in" height="1.4375in"}

#### default（默认）

> 如果插入时未指定default字段的值，则会自动使用默认参数
>
> ![](media/image210.png){width="5.135416666666667in" height="2.46875in"}

### sql函数

##### min 

> 功能：最小值（不计null）
>
> 例：![](media/image179.png){width="1.9597222222222221in" height="0.1625in"}

##### max

> 功能：最大值（不计null）
>
> 例：![](media/image180.png){width="4.479166666666667in" height="0.11944444444444445in"}

##### avg

> 功能：平均值（不计null）
>
> 例：![](media/image181.png){width="4.479166666666667in" height="0.14791666666666667in"}

##### sum

> 功能：求列的和（不计null）
>
> 例：![](media/image182.png){width="1.9597222222222221in" height="0.16875in"}

##### count

> 功能：返回指定字段不为null的记录数，\*表示所有行数
>
> 例：![](media/image183.png){width="2.0284722222222222in" height="0.13194444444444445in"}

##### getdate

> 功能：获取当前时间（年、月、日、时、分、秒、毫秒）
>
> ![](media/image202.png){width="2.2333333333333334in" height="1.3840277777777779in"}

##### datediff

> 语法：datediff（datepart，startdate，enddate）
>
> 功能：计算startdate和enddate这两个时间隔了多长时间
>
> 参数：datepart：规定在日期的哪一部分计算差额
>
> ![](media/image211.png){width="4.0in" height="2.5416666666666665in"}
>
> 例：找出入职超过12年的员工
>
> ![](media/image212.png){width="5.041666666666667in" height="0.19791666666666666in"}

##### datepart

> 语法：datepart（datepart，date）
>
> 功能：返回指定日期date的datepart指定日期部分
>
> 例：将所有样按照入职月份进行排序
>
> ![](media/image213.png){width="4.145833333333333in" height="0.22916666666666666in"}

##### upper

> 功能：将字符串转换为大写字符串
>
> 例：按大写输出员工姓名
>
> ![](media/image214.png){width="2.5104166666666665in" height="0.19791666666666666in"}

##### lower

> 功能：将字符串转换为小写字符串
>
> 例：按小写输出员工姓名
>
> ![](media/image215.png){width="2.5104166666666665in" height="0.21875in"}

##### len

> 功能：获取字符串长度
>
> 例：输出名字为5个字符的员工信息
>
> ![](media/image216.png){width="3.2604166666666665in" height="0.1875in"}

##### substring

> 语法：substring（str,start,len）
>
> 功能：将str字符串从第1个字符开始截取len个字符串
>
> 例：显示所有远的首字母
>
> ![](media/image217.png){width="3.03125in" height="0.20833333333333334in"}

##### 字符串拼接

> 使用"+"即可完成字符串拼接
>
> 例：将所有员工的首字母大写
>
> ![](media/image218.png){width="5.768055555555556in" height="0.1986111111111111in"}

##### replace

> replace（str1，str2，str3）
>
> 功能：将字符串str1中的str2替换为str3
>
> 例：将员工名字中的a全部替换为A
>
> ![](media/image219.png){width="3.2604166666666665in" height="0.22916666666666666in"}

### 备份恢复

#### 分离、附加

> 分离就是将数据库卸载下来。分离后在sql server安装目录下的"MSSQL/Data"目录下可以找到"数据库名.MDF"和"数据库名\_log.LDF"文件，这是该数据库分离后的文件，将这两个文件复制到其他地方即可完成备份。该数据库分离后不能再使用了
>
> 附加就是将分离后放入数据库重新关联到sql server数据库上

##### 企业管理器

> **分离**：
>
> ![](media/image220.png){width="3.34375in" height="2.872916666666667in"}
>
> **附加：**
>
> ![](media/image221.png){width="3.2395833333333335in" height="1.5152777777777777in"}
>
> ![](media/image222.png){width="5.03125in" height="2.4208333333333334in"}
>
> ![](media/image223.png){width="4.65625in" height="3.1354166666666665in"}

#### 备份还原

> 备份数据库是指将数据库文件从sql server中备份出来，这样用户可以用来恢复或复用。备份数据库不会影响到源数据库的使用。

##### 企业管理器

> **备份：**
>
> ![](media/image224.png){width="3.3333333333333335in" height="2.152083333333333in"}
>
> ![](media/image225.png){width="5.768055555555556in" height="4.711111111111111in"}
>
> **还原：**
>
> ![](media/image226.png){width="3.0416666666666665in" height="1.445138888888889in"}
>
> ![](media/image227.png){width="5.768055555555556in" height="4.1618055555555555in"}

##### 查询分析器

> **备份：**
>
> 语法：backup database 数据库名 to disk = 'bak文件路径'
>
> 例：
>
> ![](media/image228.png){width="4.333333333333333in" height="0.2604166666666667in"}
>
> **还原：**
>
> 语法：restore database 数据库名 from disk='bak文件路径'
>
> 例：
>
> ![](media/image229.png){width="4.59375in" height="0.21875in"}

## oracle

### 基础

#### 3层结构

> ![](media/image230.png){width="5.768055555555556in" height="2.798611111111111in"}

#### 9i与10g区别

1.  10g中增加了网格计算，g代表网格计算

2.  安装变简单了

3.  增加了浏览器管理

### oracle安装

> 安装环境：winXP x86

#### 下载安装文件

> ![](media/image231.png){width="1.9270833333333333in" height="0.4583333333333333in"}
>
> 其中：
>
> 第1个为client端，类似于sqlserver中的查询分析器
>
> 第2个为数据库端
>
> 经测试，win7x64版本无法安装

#### 安装数据库端

1.  将zip文件解压，并放入纯英文路径下，点击setup.exe文件。

2.  基本安装

> 打开setup.exe后出现界面，先进性基本安装：
>
> oracle主目录位置：
>
> 建议在自己打算安装oracle的位置先建2个文件夹："./myOracle/"和"./myOracle/oracle"。目录中不可以有中文或特殊字符
>
> oracle主目录位置选择为"./myOracle/oracle"目录

创建启动数据库：

勾选此项会在安装时自动创建1个数据库实例（默认数据库）

> 每创建1个数据库实例时，会自动创建3个用户（按权限从大到小排序）：sys（超级管理员）、system（管理员用户）、scott（普通用户）
>
> 密码必须以字符开头，我设置的密码是"sssssyyy"

3.  产品特定的先决条件检查

> 除网络配置外，其他的应该全部没问题
>
> ![](media/image232.png){width="5.768055555555556in" height="1.1805555555555556in"}
>
> 直接下一步，遇到警告忽略即可：
>
> ![](media/image233.png){width="2.9472222222222224in" height="1.2708333333333333in"}
>
> 下面直接安装即可

4.  口令管理

> 直到遇到下面界面：
>
> ![](media/image234.png){width="3.609027777777778in" height="2.4479166666666665in"}
>
> 此时，Scott用户属于锁定状态（locked），不能使用，需要点击"口令管理"，找到Scott用户，将"是否锁定账户"一栏取消选中，并输入口令（也可以在后面使用命令解锁该账户）
>
> ![](media/image235.png){width="4.489583333333333in" height="2.977777777777778in"}

5.  配置

> 安装完成后在系统的"管理 服务" 中将所有oracle服务设置为手动启动

一般来说，做项目只需要启动最后的2个服务：

![](media/image236.png){width="2.34375in" height="0.40625in"}

6.  验证

> 在cmd中输入"sqlplus"，进入oracle（命令行方式）
>
> 在cmd中输入"sqlplusw"，进入oracle（sqlplus方式）

#### 安装client端

##### PLSQL\_developer

1.  下载PLSQL\_developer汉化破解版

> ![](media/image237.png){width="2.5in" height="0.6145833333333334in"}

2.  安装

> 点击![](media/image238.png){width="1.9791666666666667in" height="0.1875in"}进行安装

3.  汉化

> 点击![](media/image239.png){width="2.1979166666666665in" height="0.23958333333333334in"}进行汉化，最后会另外跳出来1个窗口，不用管，直接在主窗口点灰色的对号即可

4.  破解

> 进入软件后，点击：帮助 注册
>
> 打开![](media/image240.png){width="2.4166666666666665in" height="0.1875in"}软件
>
> 按下图输入内容进行注册：
>
> ![](media/image241.png){width="4.364583333333333in" height="2.2625in"}

### oracle使用

#### oracle客户端

##### sqlplus

> 这是oracle自带的在dos下操作的client

在cmd中输入"sqlplus"，进入sqlplus（命令行方式）

在cmd中输入"sqlplusw"，进入sqlplus（sqlplus方式）

##### pl/sql developer

###### 命令窗口

> 文件 新建 command window

#### 基本使用

##### 解锁账户

1.  使用system用户登录（密码为安装时在基本安装中创建 默认数据库时指定的密码）

2.  执行"alter user 用户名 account unlock;"（必须有分号）

## MySQL

### 基础

#### 特点

1.  开源

2.  免费

3.  跨平台

4.  处理并发性（13000个），安全稳定

5.  对资源要求不高

#### 3层结构

> ![](media/image242.png){width="3.5in" height="1.1354166666666667in"}
>
> 与oracle相同

### 安装

> 安装包版本：5.6.16
>
> 安装教程百度
>
> 安装完成后需要将"./ MySQL\\MySQL Server 5.6\\bin\\"目录 添加到系统环境变量

### 使用

#### 登录

##### cmd命令行

1.  mysql --u 用户名 --p密码

> ![](media/image243.png){width="1.9479166666666667in" height="0.17708333333333334in"}

2.  mysql --u 用户名 --p；执行后再输入密码

> ![](media/image244.png){width="3.4791666666666665in" height="0.3854166666666667in"}

##### mysql-gui-tools

> mysql图形化界面管理工具
>
> 打开![](media/image245.png){width="1.2291666666666667in" height="0.25069444444444444in"}
>
> ![](media/image246.png){width="3.2708333333333335in" height="2.76875in"}
>
> ![](media/image247.png){width="3.2708333333333335in" height="2.5340277777777778in"}

### sql语句

#### 注释

> "\--"表示注释该行
>
> ![](media/image248.png){width="3.0520833333333335in" height="0.20833333333333334in"}

#### 切换数据库

> use 数据库名
>
> ![](media/image249.png){width="1.4375in" height="0.3229166666666667in"}

#### 增

##### 创建数据库

> create database \[if not exists\] 数据库名 \[character set 字符编码\] \[collate 校对规则\]；
>
> 校对规则不重要
>
> ![](media/image250.png){width="5.768055555555556in" height="0.4840277777777778in"}

##### 创建表

> ![](media/image251.png){width="2.5208333333333335in" height="1.1770833333333333in"}
>
> 如果不指定字符集和校对规则，则继承所在数据库的，如果创建数据库时未指定，则取决于安装时候选择的字符集，可以使用"show create database 数据库名"查看
>
> ![](media/image252.png){width="3.0520833333333335in" height="1.0729166666666667in"}

##### 增加表字段

> alter table 表名 add 字段1 字段类型，add 字段2 字段类型，\...
>
> 例：
>
> ![](media/image253.png){width="5.375in" height="0.3958333333333333in"}

##### 插入数据

###### 插入所有字段

> insert into 表名 values（字段1，字段2，...）

![](media/image145.png){width="3.158333333333333in" height="0.5638888888888889in"}

###### 插入部分字段

insert into 表名 （字段列表） values（值列表）

> 对于没有指定不允许为空的字段可以插入时只插入字段列表中指定的字段，且值列表的类型及个数要与字段列表相符，没有插入的字段将为NULL；

![](media/image146.png){width="2.3680555555555554in" height="1.1979166666666667in"}

###### 插入顺序

> 插入数据时是向后添加的，如果之前有删除的行，新添加的行也会直接向后添加

###### 复制行

> 将某表中的字段复制并插入到另一张表，要求要插入行的字段类型及数量相同
>
> ![](media/image147.png){width="4.010416666666667in" height="0.19791666666666666in"}
>
> 将test表中已有的testName字段复制并插入到test表中

#### 删

##### 删除数据库

> 参见：sqlserver[[删除数据库]{.underline}](#删除数据库)

##### 删除表

> 参见：sqlserver[[删除表]{.underline}](#删除表)

##### 删除字段

> alter table 表名 drop 字段1，drop 字段2，...；

例：

![](media/image254.png){width="4.28125in" height="0.3854166666666667in"}

##### 删除记录

> 参见：sqlserver[[删除记录]{.underline}](#删除记录)

(1) 如果该条记录中的主键有外键指向它，则不能删除

###### truncate

> 功能：删除表所有记录，保留表结构，不可回滚
>
> delete也可以删除表记录，但是可以回滚，参见[[自动提交事务]{.underline}](#事务操作)
>
> 语法：truncate table 表名；
>
> 例：
>
> ![](media/image255.png){width="4.041666666666667in" height="0.8854166666666666in"}

#### 改

##### 修改数据

> 参见sqlserver[[修改数据]{.underline}](#修改数据)

##### 修改表

###### 修改表字段

> alter table 表名 modify 字段名1 新字段类型，modify 字段名2 新字段类型，...
>
> 只能修改列的类型，不能修改列名
>
> 例：
>
> ![](media/image256.png){width="5.768055555555556in" height="0.34791666666666665in"}

###### 修改列名

> alter table 表名 change column 原字段名 新字段名 字段类型，change column 原字段名 新字段名 字段类型，...；

例：

![](media/image257.png){width="5.768055555555556in" height="0.4673611111111111in"}

###### 修改表名

> rename table 原表名 to 新表名；
>
> 例：
>
> ![](media/image258.png){width="3.2083333333333335in" height="0.3958333333333333in"}

###### 修改表的字符集

> alter table 表名 character set 字符集；

例：

![](media/image259.png){width="3.8645833333333335in" height="0.4166666666666667in"}

###### 添加列

> alter table 表名 add 字段 类型 约束；

例：

![](media/image260.png){width="3.28125in" height="0.5625in"}

###### 删除列

> alter table 表名 drop 字段；

例：

![](media/image261.png){width="3.40625in" height="0.6354166666666666in"}

#### 查

##### 查表

> 参见[[查表]{.underline}](#查表-3)

##### 查看表的字段信息

> desc 表名；
>
> 例：
>
> ![](media/image262.png){width="5.302083333333333in" height="2.4166666666666665in"}

##### 查数据库

###### 显示所有数据库

> show databases；
>
> ![](media/image263.png){width="1.7604166666666667in" height="1.7166666666666666in"}

###### 显示数据库创建语句

> show create database 数据库名；
>
> ![](media/image264.png){width="5.768055555555556in" height="1.0527777777777778in"}

##### 查看mysql数据库配置信息

###### 查看所有配置信息

> show variables；

###### 查看mysql运行时状态信息

> show global variables；

###### 根据条件查询配置信息

> show variables like '...'
>
> 例：查看系统字符集
>
> ![](media/image265.png){width="3.0in" height="0.21875in"}

###### 设置配置

> set 配置项 = 值；
>
> 例：设置客户端字符集为utf8
>
> ![](media/image266.png){width="3.34375in" height="0.3958333333333333in"}

#### 条件筛选

> 参见sqlserver[[条件筛选]{.underline}](#条件筛选)

### 查表

#### 根据字段查询

> 参见sqlserver[[根据字段查询]{.underline}](#根据字段查询)

#### 根据条件查询

> 参见sqlserver[[根据条件查询]{.underline}](#根据条件查询)

#### 取消重复行

> 参见sqlserver[[取消重复行]{.underline}](#取消重复行)

#### 使用表达式查询

> select 表达式 from 表名；
>
> ![](media/image267.png){width="2.8229166666666665in" height="1.2083333333333333in"}

#### 使用列的别名

> 参见sqlserver[[使用列的别名]{.underline}](#使用列的别名)

#### ifnull

> 参见[[isnull]{.underline}](#isnull)，关键字不同，用法相同

#### order by

> 参见sqlserver[[order by按顺序查表]{.underline}](#order-by按顺序查表)

#### group by

> 功能：按多个字段分组

语法：

> select sql函数1，sql函数2，...，字段1，字段2，... from 表名 group by 字段1，字段2，...

3.  先按字段1分组，在从分组结果中按字段2分组，...，再对现有的分组按sql函数进行计算

4.  与sqlserver不同，from前字段与group by后字段可以不对应，但是一般不这样做

> 例：将所有信息按name分组
>
> ![](media/image268.png){width="3.8333333333333335in" height="1.0208333333333333in"}
>
> ![](media/image269.png){width="3.53125in" height="0.4479166666666667in"}

#### having

> 参见sqlserver [[having]{.underline}](#having)

#### 分页查询

> 语法：select \* from test limit M,N；
>
> 功能：在查询结果中，从第M条（M=0代表第1条）开始取，取出N条记录
>
> 例：从下表中取出第4\~7条数据
>
> ![](media/image270.png){width="1.3541666666666667in" height="2.03125in"}
>
> 答案：
>
> ![](media/image271.png){width="3.2604166666666665in" height="1.53125in"}

### 数据类型

#### 数值型

##### bit

> bit\[(M)\]
>
> M指定位数，默认1，范围1\~64
>
> 在dos下对bit类型的查询需要使用bin
>
> 例：
>
> ![](media/image272.png){width="2.9895833333333335in" height="1.2291666666666667in"}

##### tinyint

> 1个字节，相当于C语言中char类型，可以表示为有符号和无符号
>
> 语法：
>
> tinyint \[(M)\] \[unsigned\] \[zerofill\]
>
> M：与zerofill配合使用，指定10进制的显示位数，默认为该类型最大值位数
>
> unsigned：该类型默认为有符号数，加上unsigned则变为无符号数
>
> zerofill：显示为M指定位数的10进制数，数值位数小于M指定位数用0补充，数值位数大于M指定位数则全部显示；使用了zerofill该字段自动变为unsigned类型
>
> 例：
>
> ![](media/image273.png){width="4.3125in" height="2.1979166666666665in"}

##### bool、boolean

> 布尔型，使用0/1表示真假，两个类型名都可以表示布尔型
>
> 插入时可以使用"0/1"，也可以使用"true、false"
>
> 例：
>
> ![](media/image274.png){width="3.90625in" height="0.17708333333333334in"}
>
> ![](media/image275.png){width="2.5416666666666665in" height="0.20833333333333334in"}
>
> ![](media/image276.png){width="3.1458333333333335in" height="0.20833333333333334in"}

##### smallint

> 2个字节，相当于C语言中short类型，可以表示为有符号和无符号
>
> 语法：
>
> smallint \[(M)\] \[unsigned\] \[zerofill\]

参数说明与例程：

> 与[[tinyint]{.underline}](#tinyint)同理。

##### mediumint

> 3个字节，可以表示为有符号和无符号
>
> 语法：
>
> mediumint \[(M)\] \[unsigned\] \[zerofill\]

参数说明与例程：

> 与[[tinyint]{.underline}](#tinyint)同理。

##### int

> 4个字节，相当于C原因中int，可以表示为有符号和无符号
>
> 语法：
>
> mediumint \[(M)\] \[unsigned\] \[zerofill\]

参数说明与例程：

> 与[[tinyint]{.underline}](#tinyint)同理。

##### bigint

> 8个字节，相当于C原因中long，可以表示为有符号和无符号
>
> 语法：
>
> bigint \[(M)\] \[unsigned\] \[zerofill\]

参数说明与例程：

> 与[[tinyint]{.underline}](#tinyint)同理。

##### float

> 4字节

语法：

> FLOAT\[(M,D)\] \[UNSIGNED\] \[ZEROFILL\]
>
> M,D：M为总位数，D为小数位数；小数部分在插入时如果位数大于D，则会被四舍五入，如果小于D，则会补0；整数部分超出范围则会报错；不指定M,D则插入时是几位，查询时就说几位。
>
> unsigned：该类型默认为有符号数，加上unsigned则变为无符号数
>
> zerofill：显示为M指定位数的10进制小数（包括小数点），数值位数小于M指定位数用0补充，数值位数大于M指定位数则全部显示；使用了zerofill该字段自动变为unsigned类型

##### double

> 8字节

语法：

> DOUBLE\[(M,D)\] \[UNSIGNED\] \[ZEROFILL\]

参数说明同[[float]{.underline}](#float)

##### decimal、numuric

> 变长，可以用来存放小数或整数
>
> 语法：
>
> decimal \[(M,D)\]
>
> numuric \[(M,D)\]
>
> M,D：M为总位数，D为小数位数；小数部分在插入时如果位数大于D，则会被四舍五入，如果小于D，则会补0；整数部分超出范围则会报错；不指定M,D则表示整数。

#### 文本、二进制

##### char

> 定长，每个数值的长度都等于M，不足的使用空格补在后面
>
> 语法：
>
> char(M)
>
> M：M个字节，0 \<= M \<= 255

##### varchar

> 变长，每个数值长度为L+1
>
> 语法：
>
> varchar(M)
>
> M：最大存储字节数，使用时根据具体字符定长度；其中L \<= M 且0 \<= M \<= 65535

##### binary

> 定长，每个数值的长度都等于M，
>
> 语法：
>
> binary(M)
>
> M：M个字节，0 \<= M \<= 255

##### varbinary

> 变长，每个数值长度为L+1
>
> 语法：
>
> varbinary(M)
>
> M：最大存储字节数，使用时根据具体数值定长度；其中L \<= M 且0 \<= M \<= 65535

##### tinyblob、tinytext

> 变长，每个数值长度为L+1，L\<2\^8
>
> tinyblob存二进制，tinytext存文本

语法：

tinyblob

tinytext

##### blob、text

> 变长，每个数值长度为L+1，L\<2\^16
>
> blob存二进制，text存文本

语法：

blob

text

##### mediumblob、mediumblob

> 变长，每个数值长度为L+1，L\<2\^24
>
> mediumblob存二进制，mediumblob存文本

语法：

mediumblob

mediumblob

##### longblob、longtext

> 变长，每个数值长度为L+1，L\<2\^32
>
> longblob存二进制，longtext存文本

语法：

longblob

longtext

##### 字符类型、二进制类型选择

###### 字符类型

> 若某列长度固定且在255内，尽量使用char，节省查询时间；否则根据长度选择其他字符类型

###### 二进制类型

> 若某列长度固定且在255内，尽量使用binary，节省查询时间；否则根据长度选择其他二进制类型

#### 时间类型

##### date

> 日期类型（年-月-日）
>
> 插入数据时会自动把年月日截取出来并保存

例：

![](media/image277.png){width="3.96875in" height="1.9791666666666667in"}

##### datetime

> 日期时间类型（年-月-日 时：分：秒）
>
> 插入数据时会自动用0补全为"年-月-日 时：分：秒"并保存

例：

![](media/image278.png){width="4.010416666666667in" height="1.9895833333333333in"}

##### timestamp

> 邮戳类型，该类型可以保存"年-月-日 时：分：秒"
>
> 与datetime区别：当修改某条记录时，该列会自动更新为当前时间
>
> 插入数据时如果不指定该字段，将会自动将该字段设为当前时间，如果指定了，将设为指定的时间

例：

![](media/image279.png){width="4.447916666666667in" height="6.197916666666667in"}

### 约束

#### 主键

参见sqlserver[[主键]{.underline}](#identity)

#### auto\_increment

功能：自增长，仅限于修饰主键

例：

> ![](media/image280.png){width="5.761805555555555in" height="2.0305555555555554in"}

#### unique（唯一）

> 唯一字段，可以为null，不可以重复，一张表中可以有多个
>
> 与sqlserver不同，这里null可以重复
>
> 例：
>
> ![](media/image281.png){width="5.0625in" height="2.2395833333333335in"}

#### not null

> 参见sqlserver[[not null（非空）]{.underline}](#not-null非空)

#### 外键

> 如果需要一张表中的某个字段的值必须在某张表（其他表或自己）中的某个字段存在唯一的与之对应的值，则需要使用外键（如某员工的所属部门），使用外键的是从表，外键指向的表是主表

47. 外键只能定义在从表，并指向主表的主键或unique字段

48. 外键和主键数据类型要一致

49. 增加或修改某外键时，新值（null除外）必须是指向的表的主键中存在的值

50. 一个表中可以创建多个外键

> 语法：
>
> constraint 外键名 foreign key（从表的外键列） references 主表（主键列）
>
> 例：
>
> ![](media/image282.png){width="5.768055555555556in" height="0.31319444444444444in"}

### sql函数

##### now

> 功能：获取当前年-月-日-时-分-秒
>
> 例：
>
> ![](media/image283.png){width="2.65625in" height="1.1354166666666667in"}

##### count

> 参见sqlserver [[count]{.underline}](#count)

##### sum

> 参见sqlserver [[sum]{.underline}](#sum)

##### avg

> 参见sqlserver [[avg]{.underline}](#avg)

##### max

> 参见 sqlserver [[max]{.underline}](#max)

##### min

> 参见 sqlserver [[min]{.underline}](#min)

##### current\_date

> 功能：返回当前日期
>
> 当需要单独返回年、月、日时，使用year、month、day将该函数括起来即可
>
> 例：返回当前日期
>
> ![](media/image284.png){width="3.2708333333333335in" height="0.9791666666666666in"}
>
> 返回当前年
>
> ![](media/image285.png){width="3.8541666666666665in" height="1.0208333333333333in"}

##### current\_time

> 功能：返回当前时间
>
> 当需要单独返回时、分、秒时，使用hour、minute、second将该函数括起来即可
>
> 例：返回当前时间
>
> ![](media/image286.png){width="3.3333333333333335in" height="1.0208333333333333in"}
>
> 返回当前分钟
>
> ![](media/image287.png){width="4.0in" height="1.0in"}

##### current\_timestamp

> 功能：返回当前时间戳
>
> 例：
>
> ![](media/image288.png){width="3.7604166666666665in" height="0.9895833333333334in"}

##### 截取时间或日期

> 功能：从时间日期 格式数据中截取出时间部分或日期部分
>
> 语法：
>
> date（时间日期）
>
> time（时间日期）
>
> 例：截取日期
>
> ![](media/image289.png){width="3.0729166666666665in" height="0.9791666666666666in"}
>
> 截取时间：
>
> ![](media/image290.png){width="3.25in" height="1.03125in"}

##### date\_add

> 语法：date\_add( 日期/时间日期/邮戳 , interval 数 type);
>
> 第一个参数可以是date、datetime、timestamp
>
> 第二个参数就是type时间单位的具体数值
>
> interval是固定的关键字，type是时间单位，可以是year、hour等，具体参见下图：
>
> ![](media/image291.png){width="4.666666666666667in" height="5.041666666666667in"}
>
> 功能：计算时间加上1个时间后的时间
>
> 例：
>
> ![](media/image292.png){width="4.8125in" height="1.0625in"}

##### date\_sub

> 语法：date\_sub( 日期/时间日期/邮戳 , interval 数 type);
>
> 语法参见[[date\_add]{.underline}](#date_add)
>
> 功能：计算时间减去1个时间后的时间
>
> 例：
>
> ![](media/image293.png){width="4.708333333333333in" height="1.0416666666666667in"}

##### datediff

> 语法：datediff（日期1，日期2）
>
> 功能：计算日期1减去日期2的日期差（结果为天）
>
> 例：
>
> ![](media/image294.png){width="4.364583333333333in" height="0.9895833333333334in"}

##### timediff

> 语法：timediff（时间1，时间2）
>
> 功能：计算时间1减去时间2的时间差（结果为时分秒）
>
> 两个参数必须为datetime类型，否则返回null
>
> 例：
>
> ![](media/image295.png){width="4.875in" height="1.0520833333333333in"}

##### charset

> 语法：charset（字段）
>
> 功能：返回某个字段的字符集
>
> 例：
>
> ![](media/image296.png){width="3.6145833333333335in" height="1.1666666666666667in"}

##### concat

> 语法：concat（字符型，字符型）
>
> 功能：字符串连接
>
> 例：
>
> ![](media/image297.png){width="3.5in" height="1.0520833333333333in"}

##### instr

> 语法：instr（字符串1，字符串2）
>
> 功能：返回字符串2在字符串1中出现的位置，没有返回0，第1位为 1
>
> 例：
>
> ![](media/image298.png){width="3.7916666666666665in" height="1.0in"}

##### ucase

> 语法：ucase（字符串）
>
> 功能：转成大写
>
> 例：
>
> ![](media/image299.png){width="3.0416666666666665in" height="0.9791666666666666in"}

##### lcase

> 语法：lcase（字符串）
>
> 功能：转成小写
>
> 例：
>
> ![](media/image300.png){width="3.0520833333333335in" height="0.9895833333333334in"}

##### left

> 语法：left（字符串，长度）
>
> 功能：从字符串中的左边其取一定长度个字符
>
> 例：
>
> ![](media/image301.png){width="3.46875in" height="0.9791666666666666in"}

##### length

> 语法：length（字符串）
>
> 功能：返回字符串长度
>
> 例：
>
> ![](media/image302.png){width="3.5416666666666665in" height="0.9895833333333334in"}

##### replace

> 语法：replace（字符串1，字符串2，字符串3）
>
> 功能：在字符串1中将字符串2替换为字符串3
>
> 例：
>
> ![](media/image303.png){width="4.25in" height="1.03125in"}

##### strcmp

> 语法：strcmp（字符串1，字符串 2）
>
> 功能：逐字符比较两字符串大小，字符串1大返回1，字符串2大返回-1，相等返回0
>
> 例：
>
> ![](media/image304.png){width="4.416666666666667in" height="1.0208333333333333in"}

##### substring

> 语法：substring（字符串1，起点，长度）
>
> 功能：从字符串中的指定位置开始截取一定长度的字符
>
> 例：
>
> ![](media/image305.png){width="4.072916666666667in" height="1.1458333333333333in"}

##### 去除前后端空格

> 语法： ltrim（字符串）
>
> rtrim（字符串）
>
> trim（字符串）
>
> 功能：去除字符串前端、后端、或前后端的空格
>
> 例：
>
> ![](media/image306.png){width="5.768055555555556in" height="0.9548611111111112in"}

##### abs

> 语法：abs（数）
>
> 功能：取绝对值

##### bin

> 语法：bin（十进制数）
>
> 功能：十进制数转为二进制数
>
> 例：
>
> ![](media/image307.png){width="2.9479166666666665in" height="1.0in"}

##### ceiling

> 语法：ceiling（数）
>
> 功能：向上取整
>
> 例：
>
> ![](media/image308.png){width="3.3333333333333335in" height="1.0in"}

##### floor

> 语法：floor（数）
>
> 功能：向下取整

##### conv

> 语法：conv（字符串，进制m，进制n）
>
> 功能：进制转换。将表示数的字符串，从m进制数转换为n进制数
>
> 例：
>
> ![](media/image309.png){width="3.59375in" height="0.9895833333333334in"}

##### format

> 语法：format（数，小数位数）
>
> 功能：以"AAA,AAA.BBBBBB"的形式显示保留一定位数的小数
>
> 例：
>
> ![](media/image310.png){width="4.25in" height="1.0104166666666667in"}

##### hex

> 语法：hex（数）
>
> 功能：转换为16进制

##### least

> 语法：least（数1，数2，...）
>
> 功能：求最小数

##### mod

> 语法：mod（被除数，除数）
>
> 功能：求余
>
> 例：
>
> ![](media/image311.png){width="2.8645833333333335in" height="1.0in"}

##### rand

> 语法：rand（n）或rand（）
>
> 功能：生成随机数

##### md5

> 语法：md5（str）
>
> 功能：将字符串进行md5加密
>
> 例：将user表中所有password字段进行md5加密：

-------------------------------------------
  update user set password = md5(password);
  -------------------------------------------

### 事务

#### 概念

> 事务就是1个事件，组成这个事件可能有多个单元，要求这些单元要么都成功，要么都不成功
>
> 如：A向B转账看作1个事务，组成这个事务的有2个单元：从A中转出，转入到B中；需求决定：这两个单元要么都成功，要么都不能成功

作用：保证数据完整性

#### 事务操作

> 事务的操作只针对DML语句有效，其他语句会直接操作数据源

##### 方式1

-   start transation; //开启事务

-   //操作

-   rollback; //回滚到开启事务之前的状态

-   commit; //提交事务

1.  开启事务

> mysql数据库执行开启事务后，所有操作先放到缓存中，需要手动提交事务才能真正提交到数据库中

2.  回滚与提交

> 回滚是回滚到开启事务之前的状态
>
> 提交事务是将开启事务之后的操作提交到数据库
>
> 执行回滚、提交之后，事务又会恢复到开启事务之前的状态，事务会自动提交

3.  例

+-----------------------------------------------------------------------+
| start TRANSACTION;                                                    |
|                                                                       |
| insert into user values(null,\'alex\',\'123456\',\'123456\@qq.com\'); |
|                                                                       |
| COMMIT;                                                               |
|                                                                       |
| start TRANSACTION;                                                    |
|                                                                       |
| delete from user;                                                     |
|                                                                       |
| ROLLBACK;                                                             |
+-----------------------------------------------------------------------+

##### 方式2

-   set autocommit = false; //将自动提交设置为false

-   savepoint 保存点; //设置1个保存点，用于回滚

-   //操作

-   rollback to 保存点 ； //回滚到保存点（保存点到现在之间没有提交过）

-   rollback； //回滚到上一次提交的状态

-   commit； //提交事务

1.  关闭自动提交事务

> mysql数据库默认事务是自动提交的（执行1条sql就会提交1条），将自动提交事务关闭后，只有收到提交才会将事务应用到数据库。

2.  例：

> ![](media/image312.png){width="3.2291666666666665in" height="1.90625in"}

#### 事务特性

10. 原子性

> 事务是1个不可分割的工作单位，事务中操作要么都发生，要吗都不发生

11. 一致性

> 事务前后数据的完整性必须一致

12. 隔离性

> 多个用户并发访问数据时，事务之间不能互相干扰，多个并发事务之间数据要相互隔离。如果不考虑隔离性将产生一系列问题，参见[[隔离性引发的问题]{.underline}](#隔离性)

13. 持久性

> 事务一旦提交，数据库中数据的改变就是永久性的，接下来即使数据库发生故障也不应该对其有任何影响

##### 隔离性

(1) ###### 引发的问题

    4.  脏读

> 并发的两个事务，一个事务读取到另一个事务未提交的数据

5.  不可重复读

> 两次读取得到的数据不一致（update）；并发的两个事务，A事务在B事务提交前后读到的数据不一致

6.  虚读（幻读）

> 两次读取得到的数据不一致（insert）

7.  丢失更新

> 后提交的事务将先提交的事务覆盖

###### 解决方案

> 事务隔离性引发的问题可以通过设置事务隔离级别进行解决

####### 隔离级别

-   Serializable（串行化、锁表）

> 可避免脏读、不可重复度、虚读

-   Repeatable read

> 可避免脏读、不可重复读

-   Read commited

> 可避免脏读

-   Read uncommited

> 最低级别，以上情况均无法保证

一般使用中间两个等级，两边的两个等级性能或安全性太低

####### 解决效果

1.  避免脏读

> 避免脏读后，事务只能读取到已经提交的数据

2.  避免不可重复读

> 避免不可重复读后，事务只能读取到开启事务时已经提交的数据，并且在开启事务后其他事务提交了新的数据，本事务的数据也不会更新，直到本事务被提交并且开启新事务才能读取到更新后的数据。

3.  Serializable

> 如果设置为这种，事务的操作必须等其他事务提交之后才能执行，性能很低

####### 操作事务隔离级别

> mysql中：
>
> 查看：select @\@tx\_isolation

mysql中默认Repeatable read

oracle中默认Read commited

设置：set session transaction isolation level 级别

> JDBC中：参见[[事务隔离级别]{.underline}](#事务隔离级别)

###### 丢失更新解决方案

> 使用数据库时设置隔离级别一般没人设置为最高，但是这样就无法解决丢失更新的问题。
>
> 对于丢失更新的问题，可以将隔离级别设置为最高进行解决，但是该方法是进行锁表，这样会大大影响效率。

####### 悲观锁

> 悲观锁是认为丢失记录一定会发生；在数据库中对记录进行锁定

1.  共享锁（读锁）

> 在sql语句后加上"lock in share mode"对记录加上共享锁；
>
> 加上共享锁之后，再使用带有排他锁的语句将会阻塞，但是再使用共享锁将可以正常操作，对于已经使用了排他锁的语句，在使用共享锁也会被阻塞

2.  排他锁（写锁）

> 排他锁无法与其他锁共存，如果对某条记录已经加了任意锁，在使用排他锁，将被阻塞；如果某条记录加了排他锁，在使用任意锁，也将被阻塞。
>
> delete、insert、update命令默认带有排他锁；select语句想要使用排他锁，需要使用select ... for update

**总结**：

使用悲观锁解决丢失更新，可以将select语句加上排他锁即可

####### 乐观锁

> 乐观锁是认为丢失记录一般不会；增加1个版本字段进行解决。
>
> 例如在表中加入1个时间戳字段，每次更新数据时该字段会自动更新，开启事务后先查询出要修改的记录，然后进行业务处理，然后在修改数据库中数据时在where中加入上次查询记录中的时间戳字段作为条件，如果commit失败则重新处理

### 备份恢复

#### 备份

> 在dos下执行下面语句，而非mysql控制台：

1)  直接输入密码

> mysqldump -no-defaults -h IP地址 --u 用户名 --p密码 数据库名 \> 存放路径

2)  后输密码

> mysqldump -no-defaults -h IP地址 --u 用户名 --p数据库名 \> 存放路径
>
> 例：
>
> ![](media/image313.png){width="4.875in" height="0.9173611111111111in"}

#### 恢复

> 恢复需要在mysql控制台执行
>
> 语句：
>
> source 备份文件名
>
> 例：

1)  创建空的数据库

> ![](media/image314.png){width="3.0in" height="0.3229166666666667in"}
>
> 数据库名可以与原来不同

2)  切换到该数据库

> ![](media/image315.png){width="1.5208333333333333in" height="0.34375in"}

3)  恢复

> ![](media/image316.png){width="2.3958333333333335in" height="0.19791666666666666in"}
>
> 没有看见ERROR即恢复成功

### mysql中文乱码

> 通过"show variables like 'char%'"可以看到mysql有6处用到字符集：
>
> ![](media/image317.png){width="5.768055555555556in" height="3.2625in"}
>
> 解决方案：

修改my.ini文件第64行，将"default-character-set=utf8"改为"default-character-set=gbk"，然后重启mysql服务

#### client

> 客户端使用的字符集，默认utf8
>
> 而cmd窗口默认使用ANSI编码，所以可能会造成乱码
>
> ![](media/image318.png){width="3.9479166666666665in" height="3.0208333333333335in"}

#### connection

> 连接数据库的字符集，如果程序没有指定则按服务器默认字符集设置

#### database

> 某个库的字符集设定，如果没有指定则按数据库服务器的字符集设置

#### result

> 数据库给客户端 返回时使用的字符集，如果没有设定则使用数据库默认字符集

#### server

> 数据库安装时指定的默认字符集

#### system

> 数据库系统使用的字符集

### 建表原则

#### 一对多

> 一对多指的是类似于员工与部门的关系。1个部门可以有很多员工，但是1个员工只能属于1个部门。
>
> 这种表的建表原则就是：在"一方"的表中设置1个主键，在"多方"的表中设置1个外键指向"一方"表中的主键

#### 多对多

> 多对多指的时类似于学生与课程的关系。1个学生可以选择多个课程，1个课程也可以被多个学生选择。
>
> 这种表的建表原则就是：在学生表和课程表中均设置1个主键，然后创建1张表分别设置外键指向两张表的主键

# HTML+CSS+JS

## html

### html介绍

> 全称HyperText Markup Language，译为超文本标记语言。不是1种编程语言 ，是1种描述性的标记语言，用于描述超文本中内容的显示方式，比如字体颜色大小 等。
>
> Html时通过标签定义的语言，代码都是由标签所组成。

### html基础

#### 格式

1)  格式

+--------------------------+
| \<!DOCTYPEhtml\>         |
|                          |
| \<html\>                 |
|                          |
| \<head\>                 |
|                          |
| \<!\--                   |
|                          |
| 存放属性信息，辅助性信息 |
|                          |
| 引入外部文件（重要）     |
|                          |
| head部分会先加载         |
|                          |
| \--\>                    |
|                          |
| \</head\>                |
|                          |
| \<body\>                 |
|                          |
| \<!\--                   |
|                          |
| 存放真正的数据           |
|                          |
| \--\>                    |
|                          |
| \</body\>                |
|                          |
| \</html\>                |
+--------------------------+

1.  所有标签都是以"\<...\>"开始，以"\</...\>"结束

2.  所有内容均放在"\<html\>...\</html\>"标签内部，其内部只有"\<head\>...\</head\>"和"\<body\>...\</body\>"两部分

3.  head标签用于存放属性信息、辅助性信息和引入外部文件；head部分会先加载，在执行body部分

4.  body标签用于存放真正的数据

<!-- -->

2)  例子

> 程序：

+----------------------------------------------------------------------+
| \<!DOCTYPEhtml\>                                                     |
|                                                                      |
| \<html\>                                                             |
|                                                                      |
| \<head\>                                                             |
|                                                                      |
| \<title\>假装这里有标题\</title\>                                    |
|                                                                      |
| \</head\>                                                            |
|                                                                      |
| \<body\>                                                             |
|                                                                      |
| [\<fontcolor=*\"red\"*\>假装这里有内容\</font\>]{.underline} \<br/\> |
|                                                                      |
| 这是第二行                                                           |
|                                                                      |
| \</body\>                                                            |
|                                                                      |
| \</html\>                                                            |
+----------------------------------------------------------------------+

显示效果：

> ![image299.png](media/image319.png){width="4.597222222222222in" height="1.011111111111111in"}

#### 注意事项

##### 开始结束标签

多数标签都是有开始标签和结束标签的，其中个别标签只有单一功能或没有要修饰的内容，则可以在标签内结束

> 如：

-   有开始结束标签：标题标签

  -----------------------------------
  \<title\>假装这里有标题\</title\>
  -----------------------------------

-   无开始结束标签：换行

  ---------
  \<br/\>
  ---------

##### 属性

> 想要对被标签修饰的内容进行更丰富的操作，就用到了标签中的属性，通过对属性值得修改增加更多的效果选择
>
> 属性与属性值之间使用"="连接，属性值可以用双引号、单引号或者不用引号，一般用双引号，或者根据公司规定的书写规范
>
> 如：设置颜色

----------------------------------------------------------------------------------------
  [\<fontcolor=*\"blue\"*size=*\'5\'*face=*隶书*\> 假装这里由内容 \</font\>]{.underline}
  ----------------------------------------------------------------------------------------

### html工程的Myeclipse配置

#### 配置工作空间编码

Windows \-\-- preferences \-\-- general \-\-- workspace

右侧 Text file encoding \-\-- 选择UTF-8

#### 新建工程

> 新建"Web project"，在"WebRoot"目录下新建folder来管理html文件，新建1个名为"demo1"的folder，在demo1下新建"HTML(Basic Templates)"文件，输入html文件名后点Next，选择版本为4.xxx，该版本选择1次再创建默认就是这个版本了

-   HTML文件：

> HTML(Basic Templates)：基本模板的html文件
>
> HTML(Advanced Templates)：高级模板的html文件

#### 配置html文件编码

创建HTML文件后，如果不是UTF-8，通过下图可见：

> ![image300.png](media/image320.png){width="5.319444444444445in" height="1.1340277777777779in"}

可以进行设置：

> Windows \-\-- preferences \-\-- Files and Editors \-\-- HTML
>
> 右侧Creating files \-\-- Encoding选择UTF-8
>
> ![image301.png](media/image321.png){width="4.208333333333333in" height="2.640972222222222in"}

#### 配置html文件默认打开方式

> Windows \-\-- preferences \-\-- general \-\-- editor \-\-- file Associatons
>
> 右侧File types中选择"\*.html"，下面Associated editors中选择"Myeclipse Html Editor"（如果没有点击Add，interbal editor中搜索并添加），点击default

### html标签

#### 排版标签

##### 注释

语法：\<!\-- 注释内容 \--\>

例：

-   代码

  -------------------
  \<!\-- 注释 \--\>
  -------------------

##### 换行标签

语法：\<br /\>

例：

-   代码

+---------------------------------------------+
| \<fontcolor=*\"red\"*\>文本\</font\>\<br/\> |
|                                             |
| \<fontcolor=*\"red\"*\>第二行\</font\>      |
+---------------------------------------------+

-   效果

> ![image302.png](media/image322.png){width="1.2083333333333333in" height="0.5104166666666666in"}

##### 水平线

###### 基本使用

语法：\<hr /\>

特点：

1.  无论是否手动换行，水平线会自动把自己放在单独1行

2.  水平线默认居中

例：

-   代码

+---------------------------------------------+
| \<fontcolor=*\"red\"*\>文本\</font\>\<br/\> |
|                                             |
| \<hr/\>                                     |
+---------------------------------------------+

-   效果

> ![image303.png](media/image323.png){width="5.760416666666667in" height="0.3194444444444444in"}

###### 颜色属性

语法：

1.  \<hr color="颜色"/\>，其中颜色为各种颜色的英文单词（如：red、green、blue）

2.  \<hr clolor="\#RGB"/\>，其中RGB为3组16进制数（如"\#ab12cc"）

例：

-   代码

+---------------------------------------------+
| \<fontcolor=*\"red\"*\>文本\</font\>\<br/\> |
|                                             |
| \<hrcolor=*\"red\"*/\>                      |
|                                             |
| \<hrcolor=*\"\#ab12cc\"*/\>                 |
+---------------------------------------------+

-   效果

> ![image304.png](media/image324.png){width="5.760416666666667in" height="0.4527777777777778in"}

###### 宽度属性

语法：

1.  \<hr width="值px"\>，其中值为宽度为多少像素

2.  \<hr width="值%"\>，其中值为浏览器显示页面的宽度的百分比

> 区别：
>
> 像素设置宽度为固定宽度，百分比设置宽度会随着拖动浏览器页面宽度而改变

例：

-   代码

+--------------------------+
| \<hrwidth=*\"200px\"*/\> |
|                          |
| \<hrwidth=*\"30%\"*/\>   |
+--------------------------+

-   效果

> 拖动前：
>
> ![image305.png](media/image325.png){width="5.760416666666667in" height="0.24791666666666667in"}
>
> 拖动后：
>
> ![image306.png](media/image326.png){width="5.75in" height="0.1951388888888889in"}

##### 段落标签

###### 基本使用

语法：\<p\> \... \</p\>

功能：段落标签开始和结束位置留1空行

例：

-   代码：

+--------------------+
| 静夜思\<br\>       |
|                    |
| 床前明月光，\<br\> |
|                    |
| \<p\>              |
|                    |
| 疑是地上霜。\<br\> |
|                    |
| 举头望明月，\<br\> |
|                    |
| \</p\>             |
|                    |
| 低头思故乡。\<br\> |
+--------------------+

-   效果

> ![image307.png](media/image327.png){width="1.2777777777777777in" height="1.476388888888889in"}

###### 对齐属性

> 语法：\<p align="center"\>...\</p\>
>
> 功能：指定标签内内容的对其方式，center为居中，left为左对齐，right为右对齐

###### class属性

> 同[[class属性]{.underline}](#htmlcssjs)

###### id属性

> 同[[id属性]{.underline}](#htmlcssjs)

##### 空格

> 语法：&nbsp;
>
> 功能：代表空格
>
> 普通空格出现在行首将被忽略，出现在两个字之间，多个空格将只保留1个空格，如要打出多个空格，可以使用该标签
>
> 例：

-   代码：

  ---------------------------------
  静&nbsp;&nbsp;&nbsp; 夜思\<br\>
  ---------------------------------

-   效果：

> ![image308.png](media/image328.png){width="1.0416666666666667in" height="0.22916666666666666in"}

##### 块级元素

###### 基本使用

> 语法：\<div\>\</div\>
>
> 功能：
>
> 在页面中声明一块区域，可以放入其他内容（文字、标签...）。div内的内容和div外的内容都会自动换行另起一行。

###### class属性

> 语法：\<divclass=*\"值\"*\>\</div\>

功能：

> 将class属性设置1个值，多个标签可以使用相同的class属性值，多用于css中通过class属性值设置样式，也可用于js中

###### id属性

> 语法：\<divid=*\"值\"*\>\</div\>

功能：

> 将id属性设置1个值，多个标签可以但是不要使用相同的id属性值，多用于js中，也可用于css中通过id属性值设置样式

##### 行内标签

###### 基本使用

> 语法：\<span\>\</span\>
>
> 功能：
>
> 在页面中声明一块区域，可以放入其他内容（文字、标签...）。span标签内的内容和div外的内容都不会自动换行

###### class属性

> 同[[class属性]{.underline}](#htmlcssjs)

###### id属性

> 同[[id属性]{.underline}](#htmlcssjs)

#### 字体标签

##### font标签

###### 基本使用

> 语法：\<font\>\</font\>
>
> 功能：将文字标记起来，并设置文字显示效果

###### 颜色属性

> 参见[[颜色]{.underline}](#htmlcssjs)

###### 字体大小

> 语法：\<font size="值"\>\</font\>
>
> 功能：设置字体大小，范围1\~7，超出最小或最大，则按最小或最大显示

默认为3，\<font size="+2"\>，代表设置字体大小为5

###### 字体类型

语法：\<font face="值"\>\</font\>

功能：设置字体类型，如：隶书、楷体等...

##### 标题标签

> 语法：\<h1\>\</h1\> \~ \<h6\>\</h6\>
>
> 功能：从一级标题到6级标题，字体主键减小，并且自动换行
>
> 例：

-   代码：

+-----------------------+
| \<h1\>一级标题\</h1\> |
|                       |
| \<h2\>二级标题\</h2\> |
|                       |
| \<h3\>三级标题\</h3\> |
|                       |
| \<h4\>四级标题\</h4\> |
|                       |
| \<h5\>五级标题\</h5\> |
|                       |
| \<h6\>六级标题\</h6\> |
+-----------------------+

-   效果：

> ![image309.png](media/image329.png){width="1.7361111111111112in" height="2.765277777777778in"}

##### 粗体

> 语法：\<b\>\</b\>

##### 斜体

> 语法：\<i\>\</i\>

##### 特殊字符

  符号   语法    备注
------ ------- ------
  \<     &lt;    
  \>     &gt;    
  &      &amp;   

例：

-   代码：

+--------------------------------+
| 1[\<]{.underline}2 4\>3 \<br\> |
|                                |
| a[\<bc\>]{.underline}d \<br\>  |
|                                |
| a&lt;b c&gt;d \<br\>           |
|                                |
| a&amp;b; \<br\>                |
+--------------------------------+

-   显示效果

> ![image310.png](media/image330.png){width="0.9305555555555556in" height="0.8361111111111111in"}

##### 滚动效果

> 语法：\<marquee\>\</marquee\>
>
> 功能：将图片、文字等滚动显示
>
> 例：

-   代码：

+--------------+
| \<marquee\>  |
|              |
| 我真帅       |
|              |
| \</marquee\> |
+--------------+

#### 列表标签

##### 数据格式化列表

> 语法：

+-----------------------+
| [\<dl\>]{.underline}  |
|                       |
| \<dt\>上层数据\</dt\> |
|                       |
| \<dd\>下层数据\</dd\> |
|                       |
| \<dd\>下层数据\</dd\> |
|                       |
| \</dl\>               |
+-----------------------+

功能：将数据进行列表格式化，自动对齐缩进

例：

-   代码：

+-----------------------+
| [\<dl\>]{.underline}  |
|                       |
| \<dt\>上层数据\</dt\> |
|                       |
| \<dd\>下层数据\</dd\> |
|                       |
| \<dd\>下层数据\</dd\> |
|                       |
| \</dl\>               |
+-----------------------+

-   显示效果：

> ![image311.png](media/image331.png){width="1.4305555555555556in" height="0.7201388888888889in"}

##### 有序列表

###### 基本用法

> 语法：

+----------------------+--+
| [\<ol\>]{.underline} |  |
|                      |  |
| \<li\>条目1\</li\>   |  |
|                      |  |
| \<li\>条目2\</li\>   |  |
|                      |  |
| \<li\>条目3\</li\>   |  |
|                      |  |
| \</ol\>              |  |
+----------------------+--+

> 功能：将数据排列为有序号的列表
>
> 例：

-   代码：

+----------------------+
| [\<ol\>]{.underline} |
|                      |
| \<li\>条目1\</li\>   |
|                      |
| \<li\>条目2\</li\>   |
|                      |
| \<li\>条目3\</li\>   |
|                      |
| \</ol\>              |
+----------------------+

-   显示效果

> ![image312.png](media/image332.png){width="1.0138888888888888in" height="0.8465277777777778in"}

###### 序号类型属性

> 语法：\<ol type="值"\>\</ol\>
>
> 功能：设置有序列表的序号类型：
>
> 1：按1、2、3排序
>
> a：按a、b、c排序
>
> i：按i、ii、iii排序
>
> 等等
>
> 默认按1、2、3排序
>
> 例：

-   代码：

+----------------------------------+
| [\<oltype=*\"a\"*\>]{.underline} |
|                                  |
| \<li\>条目1\</li\>               |
|                                  |
| \<li\>条目2\</li\>               |
|                                  |
| \<li\>条目3\</li\>               |
|                                  |
| \</ol\>                          |
+----------------------------------+

-   显示效果

> ![image313.png](media/image333.png){width="0.9583333333333334in" height="0.6875in"}

###### 序号开始位置属性

> 语法：\<ol start="值"\>\</ol\>
>
> 功能：序号从第几个开始，值为数字
>
> 例：

-   代码：

+-----------------------------------+
| [\<olstart=*\"3\"*\>]{.underline} |
|                                   |
| \<li\>条目1\</li\>                |
|                                   |
| \<li\>条目2\</li\>                |
|                                   |
| \<li\>条目3\</li\>                |
|                                   |
| \</ol\>                           |
+-----------------------------------+

-   显示效果

> ![image314.png](media/image334.png){width="1.2361111111111112in" height="0.775in"}

##### 无序列表

###### 基本用法

> 语法：

+----------------------+
| [\<ul\>]{.underline} |
|                      |
| \<li\>条目1\</li\>   |
|                      |
| \<li\>条目2\</li\>   |
|                      |
| \<li\>条目3\</li\>   |
|                      |
| \</ul\>              |
+----------------------+

> 功能：将数据排列为有项目符号的列表
>
> 例：

-   代码：

+----------------------+
| [\<ul\>]{.underline} |
|                      |
| \<li\>条目1\</li\>   |
|                      |
| \<li\>条目2\</li\>   |
|                      |
| \<li\>条目3\</li\>   |
|                      |
| \</ul\>              |
+----------------------+

-   显示效果

> ![image315.png](media/image335.png){width="1.0694444444444444in" height="0.8305555555555556in"}

###### 项目符号类型属性

> 语法：\<ul type="值"\>\</ul\>
>
> 功能：设置 无序列表的项目符号类型：
>
> circle：空心圆
>
> disc：实心圆
>
> square：方块
>
> 默认是实心圆

例：

-   代码：

+---------------------------------------+
| [\<ultype=*\"square\"*\>]{.underline} |
|                                       |
| \<li\>条目1\</li\>                    |
|                                       |
| \<li\>条目2\</li\>                    |
|                                       |
| \<li\>条目3\</li\>                    |
|                                       |
| \</ul\>                               |
+---------------------------------------+

-   显示效果

> ![image316.png](media/image336.png){width="0.9861111111111112in" height="0.6847222222222222in"}

#### 图片标签

> 使用图片标签，先要将图片 加入到工程：

1.  WebRoot下新建folder，名为"imgs"来管理图片

2.  将图片拷贝到该目录下

##### 显示图片

> 语法：\<img src="图片相对路径"/\>
>
> 功能：加载相对路径中的图片并显示
>
> 例：

-   代码：

  ------------------------------------
  \<imgsrc=*\"../imgs/girl.jpg\"*/\>
  ------------------------------------

-   显示效果

> ![image317.png](media/image337.png){width="2.611111111111111in" height="1.6840277777777777in"}

##### 显示宽度、高度属性

> 语法： \<img src=\"图片\" width=\"值\" height=\"值\"/\>
>
> 功能：设置图片显示的高度、宽度，使用方法参见：[[宽度]{.underline}](#htmlcssjs)

##### 图片说明文字属性

> 语法：\<img src=\"图片\" alt=\"说明文字\"/\>
>
> 功能：设置图片说明文字，鼠标悬停在图片上时显示的文字，现在浏览器基本不支持了
>
> 例：

-   代码

  --------------------------------------------------
  \<imgsrc=*\"../imgs/girl.jpg\"*alt=*\"美女\"*/\>
  --------------------------------------------------

##### 滚动显示图片

-   代码：

+------------------------------------+
| \<marquee\>                        |
|                                    |
| \<imgsrc=*\"../imgs/girl.jpg\"*/\> |
|                                    |
| \</marquee\>                       |
+------------------------------------+

#### 超链接标签

##### 链接资源

> 语法：\<a href="链接地址"\>\</a\>
>
> 功能：将文字等内容显示为可链接的内容，点击该内容可以访问链接地址
>
> 说明：

(1) 链接地址中需要指明协议：

    -   file文件协议（默认）

> 在本地寻找链接资源

-   http协议

> 在网络上寻找链接资源

-   自定义协议

> 浏览器解析不了的协议，默认找操作系统的应用程序

(2) 超链接失效

> 将href属性的值设置为"javascript:void(0)"，即可让这个超链接显示为超链接，但是点击之后不能做任何跳转操作

(3) 超链接访式请求后台时，请求是get方式，get方式在后台获取参数时出现乱码，参见：[[get方式：]{.underline}](#get方式)

(4) 浏览器可以解析的资源，默认打开资源；解析不了的资源，弹出下载窗口

> 例：

-   代码：

+--------------------------------------------------------------+
| \<ahref=*\"../imgs/girl.jpg\"*\>美女\</a\>                   |
|                                                              |
| \<ahref=*\"http://www.baidu.com\"*\>百度\</a\>               |
|                                                              |
| \<ahref=*\"thunder://123.avi\"*\>123.[avi]{.underline}\</a\> |
|                                                              |
| \<ahref=*\"../imgs/girl.rar\"*\>girl.rar\</a\>               |
+--------------------------------------------------------------+

-   运行结果：

> ![image318.png](media/image338.png){width="1.4027777777777777in" height="0.24791666666666667in"}
>
> 点击美女：
>
> ![image319.png](media/image339.png){width="1.6111111111111112in" height="1.0131944444444445in"}
>
> 点击百度：
>
> ![image320.png](media/image340.png){width="3.2916666666666665in" height="0.9770833333333333in"}
>
> 点击123.avi
>
> ![image321.png](media/image341.png){width="1.9861111111111112in" height="1.8895833333333334in"}
>
> 点击girl.rar
>
> ![image322.png](media/image342.png){width="2.3055555555555554in" height="1.4375in"}

##### 定位资源

> 语法：\<a name="锚点名"\>锚点显示内容\</a\>
>
> 功能：定义1个锚点，用于使用\<a href="\#锚点名"\>\</a\>返回到该锚点位置
>
> 例：

-   代码：

+---------------------------------------------------+
| \<aname=*\"name1\"*\>锚点1\</a\> \<br\>           |
|                                                   |
| \<aname=*\"name2\"*\>锚点2\</a\> \<br\>           |
|                                                   |
| \<ahref=*\"\#name1\"*\>返回锚点1位置\</a\> \<br\> |
|                                                   |
| \<ahref=*\"\#name2\"*\>返回锚点2位置\</a\> \<br\> |
+---------------------------------------------------+

-   运行效果：

> ![image323.png](media/image343.png){width="0.9861111111111112in" height="0.9236111111111112in"}
>
> 如果将锚点穿插在很长的内容内，点击返回锚点1就会显示到锚点1所在位置。

#### 表格标签

##### 基本使用

> 语法：

+-----------------------------------------+
| \<table\>                               |
|                                         |
| \<caption\>表格标题\</caption\>         |
|                                         |
| \<!\-- 第1行 \--\>                      |
|                                         |
| \<tr\>                                  |
|                                         |
| \<td\>1行 1格\</td\> \<!\-- 第1格 \--\> |
|                                         |
| \<td\>1行 2格\</td\> \<!\-- 第2格 \--\> |
|                                         |
| \<td\>1行 3格\</td\> \<!\-- 第3格 \--\> |
|                                         |
| \</tr\>                                 |
|                                         |
| \<!\-- 第2行 \--\>                      |
|                                         |
| \<tr\>                                  |
|                                         |
| \<th\>2行 1格\</th\> \<!\-- 第1格 \--\> |
|                                         |
| \<th\>2行 2格\</th\> \<!\-- 第2格 \--\> |
|                                         |
| \<th\>2行 3格\</th\> \<!\-- 第3格 \--\> |
|                                         |
| \</tr\>                                 |
|                                         |
| \</table\>                              |
+-----------------------------------------+

> 功能：插入1个表格
>
> 说明：
>
> \<table\>\</table\>：这里的内容为表格的内容
>
> \<caption\>\</caption\>：定义表格标题
>
> \<tr\>\</tr\>：代表1行，有多少个该标签有多少行，行内内容在 该标签内定义。
>
> \<td\>\</td\>：表示1个单元格，字体不加粗，默认左对齐
>
> \<th\>\</th\>：表示1个单元格，字体加粗，默认居中

例：

-   代码：

+--------------------------------------+
| \<table\>                            |
|                                      |
| \<caption\>用户列表\</caption\>      |
|                                      |
| \<!\-- 第1行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<th\>序号\</th\> \<!\-- 第1格 \--\> |
|                                      |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\> |
|                                      |
| \<th\>性别\</th\> \<!\-- 第3格 \--\> |
|                                      |
| \</tr\>                              |
|                                      |
| \<!\-- 第2行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<td\>1\</td\> \<!\-- 第1格 \--\>    |
|                                      |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\> |
|                                      |
| \<td\>男\</td\> \<!\-- 第3格 \--\>   |
|                                      |
| \</tr\>                              |
|                                      |
| \<!\-- 第3行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<td\>2\</td\> \<!\-- 第1格 \--\>    |
|                                      |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\> |
|                                      |
| \<td\>女\</td\> \<!\-- 第3格 \--\>   |
|                                      |
| \</tr\>                              |
|                                      |
| \</table\>                           |
+--------------------------------------+

-   显示效果

> ![image324.png](media/image344.png){width="1.3472222222222223in" height="1.04375in"}

##### table属性

###### 边框线

> 语法：\<table border="值"\>\</table\>
>
> 功能：显示单元格边框线和表格边框线，其中的值为表格边框线的宽度
>
> 例：

-   代码：

+--------------------------------------+
| \<tableborder=*\"2\"*\>              |
|                                      |
| \<caption\>用户列表\</caption\>      |
|                                      |
| \<!\-- 第1行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<th\>序号\</th\> \<!\-- 第1格 \--\> |
|                                      |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\> |
|                                      |
| \<th\>性别\</th\> \<!\-- 第3格 \--\> |
|                                      |
| \</tr\>                              |
|                                      |
| \<!\-- 第2行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<td\>1\</td\> \<!\-- 第1格 \--\>    |
|                                      |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\> |
|                                      |
| \<td\>男\</td\> \<!\-- 第3格 \--\>   |
|                                      |
| \</tr\>                              |
|                                      |
| \<!\-- 第3行 \--\>                   |
|                                      |
| \<tr\>                               |
|                                      |
| \<td\>2\</td\> \<!\-- 第1格 \--\>    |
|                                      |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\> |
|                                      |
| \<td\>女\</td\> \<!\-- 第3格 \--\>   |
|                                      |
| \</tr\>                              |
|                                      |
| \</table\>                           |
+--------------------------------------+

-   显示效果

> ![image325.png](media/image345.png){width="1.4861111111111112in" height="1.1930555555555555in"}

###### 宽度、高度

> 语法：\<table width="值" height="值"\>
>
> 功能：设置表格宽度、高度，值的设置方法参见[[宽度]{.underline}](#htmlcssjs)
>
> 例：

-   代码：

+--------------------------------------------------------+
| \<tableborder=*\"2\"*width=*\"50%\"*height=*\"30%\"*\> |
|                                                        |
| \<caption\>用户列表\</caption\>                        |
|                                                        |
| \<!\-- 第1行 \--\>                                     |
|                                                        |
| \<tr\>                                                 |
|                                                        |
| \<th\>序号\</th\> \<!\-- 第1格 \--\>                   |
|                                                        |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\>                   |
|                                                        |
| \<th\>性别\</th\> \<!\-- 第3格 \--\>                   |
|                                                        |
| \</tr\>                                                |
|                                                        |
| \<!\-- 第2行 \--\>                                     |
|                                                        |
| \<tr\>                                                 |
|                                                        |
| \<td\>1\</td\> \<!\-- 第1格 \--\>                      |
|                                                        |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\>                   |
|                                                        |
| \<td\>男\</td\> \<!\-- 第3格 \--\>                     |
|                                                        |
| \</tr\>                                                |
|                                                        |
| \<!\-- 第3行 \--\>                                     |
|                                                        |
| \<tr\>                                                 |
|                                                        |
| \<td\>2\</td\> \<!\-- 第1格 \--\>                      |
|                                                        |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\>                   |
|                                                        |
| \<td\>女\</td\> \<!\-- 第3格 \--\>                     |
|                                                        |
| \</tr\>                                                |
|                                                        |
| \</table\>                                             |
+--------------------------------------------------------+

-   显示效果：

> ![image326.png](media/image346.png){width="2.5555555555555554in" height="1.2305555555555556in"}

###### 背景色

> 语法：\<table bgcolor="值"\>\</table\>
>
> 功能：设置表格背景色，值的设置方法参见[[颜色]{.underline}](#htmlcssjs)
>
> 例：

-   代码

+---------------------------------------------+
| \<tableborder=*\"2\"*bgcolor=*\"yellow\"*\> |
|                                             |
| \<caption\>用户列表\</caption\>             |
|                                             |
| \<!\-- 第1行 \--\>                          |
|                                             |
| \<tr\>                                      |
|                                             |
| \<th\>序号\</th\> \<!\-- 第1格 \--\>        |
|                                             |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\>        |
|                                             |
| \<th\>性别\</th\> \<!\-- 第3格 \--\>        |
|                                             |
| \</tr\>                                     |
|                                             |
| \<!\-- 第2行 \--\>                          |
|                                             |
| \<tr\>                                      |
|                                             |
| \<td\>1\</td\> \<!\-- 第1格 \--\>           |
|                                             |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\>        |
|                                             |
| \<td\>男\</td\> \<!\-- 第3格 \--\>          |
|                                             |
| \</tr\>                                     |
|                                             |
| \<!\-- 第3行 \--\>                          |
|                                             |
| \<tr\>                                      |
|                                             |
| \<td\>2\</td\> \<!\-- 第1格 \--\>           |
|                                             |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\>        |
|                                             |
| \<td\>女\</td\> \<!\-- 第3格 \--\>          |
|                                             |
| \</tr\>                                     |
|                                             |
| \</table\>                                  |
+---------------------------------------------+

-   显示效果

> ![image327.png](media/image347.png){width="1.4444444444444444in" height="1.2152777777777777in"}

###### 边框颜色

> 语法：\<table bordercolor="值"\>
>
> 功能：设置表格边框线颜色，值设置方法参见[[颜色]{.underline}](#htmlcssjs)
>
> 例：

-   代码

+-----------------------------------------------+
| \<tableborder=*\"3\"*bordercolor=*\"blue\"*\> |
|                                               |
| \<caption\>用户列表\</caption\>               |
|                                               |
| \<!\-- 第1行 \--\>                            |
|                                               |
| \<tr\>                                        |
|                                               |
| \<th\>序号\</th\> \<!\-- 第1格 \--\>          |
|                                               |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\>          |
|                                               |
| \<th\>性别\</th\> \<!\-- 第3格 \--\>          |
|                                               |
| \</tr\>                                       |
|                                               |
| \<!\-- 第2行 \--\>                            |
|                                               |
| \<tr\>                                        |
|                                               |
| \<td\>1\</td\> \<!\-- 第1格 \--\>             |
|                                               |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\>          |
|                                               |
| \<td\>男\</td\> \<!\-- 第3格 \--\>            |
|                                               |
| \</tr\>                                       |
|                                               |
| \<!\-- 第3行 \--\>                            |
|                                               |
| \<tr\>                                        |
|                                               |
| \<td\>2\</td\> \<!\-- 第1格 \--\>             |
|                                               |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\>          |
|                                               |
| \<td\>女\</td\> \<!\-- 第3格 \--\>            |
|                                               |
| \</tr\>                                       |
|                                               |
| \</table\>                                    |
+-----------------------------------------------+

-   显示效果

> ![image328.png](media/image348.png){width="1.4444444444444444in" height="1.2138888888888888in"}

##### tr属性

###### 对齐方式

> 语法：\<tr align="值"\>\</align\>
>
> 功能：设置一行内所有单元格的对齐方式，值参见[[对齐]{.underline}](#htmlcssjs)
>
> 例：

-   代码

+----------------------------------------+
| \<tableborder=*\"3\"*width=*\"50%\"*\> |
|                                        |
| \<caption\>用户列表\</caption\>        |
|                                        |
| \<!\-- 第1行 \--\>                     |
|                                        |
| \<tralign=*\"center\"*\>               |
|                                        |
| \<th\>序号\</th\> \<!\-- 第1格 \--\>   |
|                                        |
| \<th\>姓名\</th\> \<!\-- 第2格 \--\>   |
|                                        |
| \<th\>性别\</th\> \<!\-- 第3格 \--\>   |
|                                        |
| \</tr\>                                |
|                                        |
| \<!\-- 第2行 \--\>                     |
|                                        |
| \<tralign=*\"center\"*\>               |
|                                        |
| \<td\>1\</td\> \<!\-- 第1格 \--\>      |
|                                        |
| \<td\>舒岩\</td\> \<!\-- 第2格 \--\>   |
|                                        |
| \<td\>男\</td\> \<!\-- 第3格 \--\>     |
|                                        |
| \</tr\>                                |
|                                        |
| \<!\-- 第3行 \--\>                     |
|                                        |
| \<tr\>                                 |
|                                        |
| \<td\>2\</td\> \<!\-- 第1格 \--\>      |
|                                        |
| \<td\>程杰\</td\> \<!\-- 第2格 \--\>   |
|                                        |
| \<td\>女\</td\> \<!\-- 第3格 \--\>     |
|                                        |
| \</tr\>                                |
|                                        |
| \</table\>                             |
+----------------------------------------+

-   显示效果

> ![image329.png](media/image349.png){width="2.4722222222222223in" height="1.1576388888888889in"}
>
> 前两行为居中，第3行为默认的左对齐

##### td属性

###### 宽度、高度

> 语法：\<td width="值" height="值"\>\</td\>
>
> 功能：
>
> 设置单元格宽度、高度，设置之后整行、列都会跟着改变，每行、列设置了多个宽度或高度，以最大的为准；值的设置方法参见[[宽度]{.underline}](#htmlcssjs)

###### 合并单元格

> 语法： 行合并：\<td rowspan="值"\>\</td\>
>
> 列合并：\<td colspan="值"\>\</td\>
>
> 功能：将1个单元格占用n行n列显示出现
>
> 显示1大列使用行合并，显示1大行使用列合并
>
> 值为合并几行几列
>
> 例：

-   代码：

+---------------------------------------+
| \<tableborder=*\"3\"*\>               |
|                                       |
| \<caption\>用户列表\</caption\>       |
|                                       |
| \<tr\>                                |
|                                       |
| \<th\>序号\</th\>                     |
|                                       |
| \<th\>姓名\</th\>                     |
|                                       |
| \<th\>性别\</th\>                     |
|                                       |
| \<th\>职业\</th\>                     |
|                                       |
| \</tr\>                               |
|                                       |
| \<tr\>                                |
|                                       |
| \<td\>1\</td\>                        |
|                                       |
| \<td\>谢霆锋\</td\>                   |
|                                       |
| \<td\>男\</td\>                       |
|                                       |
| \<tdrowspan=*\"3\"*\>演员\</td\>      |
|                                       |
| \</tr\>                               |
|                                       |
| \<tr\>                                |
|                                       |
| \<td\>2\</td\>                        |
|                                       |
| \<td\>张柏芝\</td\>                   |
|                                       |
| \<td\>女\</td\>                       |
|                                       |
| \</tr\>                               |
|                                       |
| \<tr\>                                |
|                                       |
| \<td\>3\</td\>                        |
|                                       |
| \<td\>王菲\</td\>                     |
|                                       |
| \<td\>女\</td\>                       |
|                                       |
| \</tr\>                               |
|                                       |
| \<tr\>                                |
|                                       |
| \<tdcolspan=*\"4\"*\>一个3个人\</td\> |
|                                       |
| \</tr\>                               |
|                                       |
| \</table\>                            |
+---------------------------------------+

-   显示效果：

> ![image330.png](media/image350.png){width="2.111111111111111in" height="1.6930555555555555in"}

#### 表单标签

> 表单标签内存放的时与用户进行交互的控件，所有控件都要放在\<form\>\</form\>标签内

##### 输入

> 语法：\<inputtype=*[\"类型\"]{.underline}*/\>
>
> 功能：定义1个输入框，输入框类型由type指定。

###### type属性

####### 文本框

> 语法：\<inputtype=*\"text\"*/\>
>
> 例：

-   代码

+----------------------------------------------+
| \<form\>                                     |
|                                              |
| 输入用户名：\<inputtype=*\"text\"*/\> \<br\> |
|                                              |
| \</form\>                                    |
+----------------------------------------------+

-   显示效果

> ![image331.png](media/image351.png){width="2.6944444444444446in" height="0.32222222222222224in"}

####### 密码框

> 语法：\<inputtype=*\"password\"*/\>

例：

-   代码：

+------------------------------------------------+
| \<form\>                                       |
|                                                |
| 输入密码：\<inputtype=*\"password\"*/\> \<br\> |
|                                                |
| \</form\>                                      |
+------------------------------------------------+

-   显示效果

> ![image332.png](media/image352.png){width="2.5in" height="0.375in"}

####### 单选按钮

> 语法：\<inputtype=*\"radio\"*/\>按钮显示内容

功能：定义1个单选按钮

1.  分组属性

> 语法：\<inputtype=*\"radio\"*name=*\"组名\"*/\>按钮显示内容
>
> 功能：为单选按钮指定分组，组名相同的单选按钮是1组，一组中只能选择1个按钮

2.  例：

    -   代码：

+-----------------------------------------------------------------+
| \<form\>                                                        |
|                                                                 |
| 选择性别：\<inputtype=*\"radio\"*name=*\"sex\"*/\>男            |
|                                                                 |
| \<inputtype=*\"radio\"*name=*\"sex\"*checked=*\"checked\"*/\>女 |
|                                                                 |
| \</form\>                                                       |
+-----------------------------------------------------------------+

-   显示效果

> ![image333.png](media/image353.png){width="1.8194444444444444in" height="0.3659722222222222in"}

####### 多选按钮

> 语法：\<inputtype=*\"checkbox\"*\>显示内容

功能：定义1个多选按钮

例：

-   代码：

+-----------------------------------------------------------------+
| \<form\>                                                        |
|                                                                 |
| 选择爱好：\<inputtype=*\"checkbox\"*checked=*\"checked\"*\>篮球 |
|                                                                 |
| \<inputtype=*\"checkbox\"*checked=*\"checked\"*\>足球           |
|                                                                 |
| \<inputtype=*\"checkbox\"*\>乒乓球                              |
|                                                                 |
| \<inputtype=*\"checkbox\"*\>网球                                |
|                                                                 |
| \</form\>                                                       |
+-----------------------------------------------------------------+

-   显示效果

> ![image334.png](media/image354.png){width="3.4027777777777777in" height="0.3638888888888889in"}

####### 重置按钮

> 语法：\<inputtype=*\"reset\"*/\>

功能：定义一个重置按钮，用于重置该表单中所有控件的你默认值

例：

-   代码

+-----------------------------------------------------------------+
| \<form\>                                                        |
|                                                                 |
| 选择爱好：\<inputtype=*\"checkbox\"*checked=*\"checked\"*\>篮球 |
|                                                                 |
| \<inputtype=*\"checkbox\"*checked=*\"checked\"*\>足球           |
|                                                                 |
| \<inputtype=*\"checkbox\"*\>乒乓球                              |
|                                                                 |
| \<inputtype=*\"checkbox\"*\>网球 \<br\>                         |
|                                                                 |
| \<inputtype=*\"reset\"*/\>                                      |
|                                                                 |
| \</form\>                                                       |
+-----------------------------------------------------------------+

-   效果

> ![image335.png](media/image355.png){width="3.361111111111111in" height="0.5722222222222222in"}
>
> 点击重置，表单内控件全部恢复为默认属性

####### 提交表单

> 语法：\<inputtype=*\"submit\"*/\>

功能：

> 定义提交表单按钮，点击该按钮后，浏览器会向后台提交该表单内所有控件的name属性的值和value的值。地址栏的地址内容后面会显示出表单的内容

例：

-   代码

+--------------------------------------------------------------------------+
| \<form\>                                                                 |
|                                                                          |
| 输入用户名：\<inputtype=*\"text\"*name=*\"username\"*/\> \<br/\>         |
|                                                                          |
| 输入密码：\<inputtype=*\"password\"*name=*\"password\"*\> \<br\>         |
|                                                                          |
| 选择性别：\<inputtype=*\"radio\"*name=*\"sex\"*value=*\"nan\"*\>男       |
|                                                                          |
| \<inputtype=*\"radio\"*name=*\"sex\"*value=*\"nv\"*\>女 \<br\>           |
|                                                                          |
| 选择爱好：\<inputtype=*\"checkbox\"*name=*\"love\"*value=*\"lq\"*/\>篮球 |
|                                                                          |
| \<inputtype=*\"checkbox\"*name=*\"love\"*value=*\"zq\"*/\>足球           |
|                                                                          |
| \<inputtype=*\"checkbox\"*name=*\"love\"*value=*\"ppq\"*/\>乒乓球        |
|                                                                          |
| \<inputtype=*\"checkbox\"*name=*\"love\"*value=*\"wq\"*/\>网球 \<br/\>   |
|                                                                          |
| \<inputtype=*\"reset\"*/\>                                               |
|                                                                          |
| \<inputtype=*\"submit\"*/\>                                              |
|                                                                          |
| \</form\>                                                                |
+--------------------------------------------------------------------------+

-   运行结果：

> ![image336.png](media/image356.png){width="3.8194444444444446in" height="1.0715277777777779in"}
>
> 点击提交表单后：
>
> ![image337.png](media/image357.png){width="5.760416666666667in" height="0.9854166666666667in"}

####### 文件选择组件

> 语法：\<inputtype=*\"file\"*name=*\"名称\"*\>

功能：定义1个文件选择组件，可以用来选择本地文件

例：

-   代码

+------------------------------------------------------------+
| \<form\>                                                   |
|                                                            |
| 上传附件：\<inputtype=*\"file\"*name=*\"myfile\"*\>\<br/\> |
|                                                            |
| \</form\>                                                  |
+------------------------------------------------------------+

-   效果

> ![image338.png](media/image358.png){width="3.1944444444444446in" height="0.32222222222222224in"}

####### 隐藏组件

> 语法：\<inputtype=*\"hidden\"*name=*\"名称\"*value=*\"值\"*\>\<br\>\<br\>

功能：

> 定义1个隐藏组件，用于存放一些对用户不可见的信息；比如注册需要2个页面完成，第1个页面的信息可以先用隐藏组件放在第2个页面上，注册完同一传给后台

####### 按钮

> 语法：\<inputtype=*\"button\"*value=*\"按钮显示名称\"*\>

功能：定义1个按钮

####### 图片

> 语法：\<inputtype=*\"image\"*src=*\"图片\"*\>

功能：定义1个图片按钮，功能与提交表单相同

###### checked属性

> 语法：\<inputtype=*[\"类型\"]{.underline}*checked=*\"checked\"*/\>

功能：

> 设置单选按钮、多选按钮等控件的默认选中状态，同一组中多个单选按钮被设置为默认选中状态时，以最后1个为准

###### name属性

> 语法：\<inputtype=*[\"类型\"]{.underline}*name=*\"名称\"*/\>
>
> 功能：

-   所有控件都需要有name属性，相当于字段名

-   对于单选按钮、多选按钮等控件，需要一组按钮使用同一个name名称

-   对于单选按钮，同一组中的单选按钮只能选择1个

###### value属性

> 语法：\<inputtype=[*\"类型\"*values]{.underline}=*\"值\"*/\>

功能：

> 对于输入类控件，指定该值就是指定了默认输入内容；
>
> 对于选择类控件，指定该值就是为每个控件设置1个值，用来在提交时提交该组控件选择的内容
>
> 对于重置按钮和提交表单按钮，value的值为按钮显示的内容

##### 下拉框

> 语法：

+--------------------------------------------------------------------+
| \<form\>                                                           |
|                                                                    |
| \<selectname=*\"名称\"*\>                                          |
|                                                                    |
| \<optionvalue=*\"值\"*selected=*\"selected\"*\>显示内容\</option\> |
|                                                                    |
| \...                                                               |
|                                                                    |
| \<optionvalue=*\"值\"*\>显示内容\</option\>                        |
|                                                                    |
| \</select\>                                                        |
|                                                                    |
| \</form\>                                                          |
+--------------------------------------------------------------------+

> 功能：
>
> 定义一个下拉框,selected用来定义那个是被默认选择的
>
> 例：

-   代码

+------------------------------------------------------------------------------+
| \<form\>                                                                     |
|                                                                              |
| \<selectname=*\"city\"*\>                                                    |
|                                                                              |
| \<optionvalue=*\"none\"*selected=*\"selected\"*\>\-\--请选择\-\--\</option\> |
|                                                                              |
| \<optionvalue=*\"bj\"*\>北京\</option\>                                      |
|                                                                              |
| \<optionvalue=*\"sh\"*\>上海\</option\>                                      |
|                                                                              |
| \<optionvalue=*\"sz\"*\>深圳\</option\>                                      |
|                                                                              |
| \</select\>                                                                  |
|                                                                              |
| \</form\>                                                                    |
+------------------------------------------------------------------------------+

-   效果

> ![image339.png](media/image359.png){width="1.1111111111111112in" height="0.9652777777777778in"}

##### 文本域

> 语法：\<textarearows=*\"可显示行数\"*cols=*\"可显示列数\"*name=*\"名称\"*\>默认文本\</textarea\>

功能：定义1个最多可显示多少行多少列的文本域，超出该范围会显示滚动条

例：

-   代码

+--------------------------------------------------------------------------+
| \<form\>                                                                 |
|                                                                          |
| \<textarearows=*\"10\"*cols=*\"10\"*name=*\"textarr\"*\>123\</textarea\> |
|                                                                          |
| \</form\>                                                                |
+--------------------------------------------------------------------------+

-   效果

> ![image340.png](media/image360.png){width="1.1944444444444444in" height="1.6819444444444445in"}

##### 日历组件

###### 将组件导入到工程下的web目录下

> ![](media/image361.png){width="2.1455653980752407in" height="1.489397419072616in"}

###### 在需要使用日历组件的页面导入js文件

--------------------------------------------------------------------------------------------------------------------------------------------------------------
  \<**script language=\"javascript\" type=\"text/javascript\" src=\"\${**pageContext.request.contextPath**}/My97DatePicker/WdatePicker.js\"**\>\</**script**\>
  --------------------------------------------------------------------------------------------------------------------------------------------------------------

###### 使用组件

--------------------------------------------------------------------------------------------------------------------------------------------------
  \<**input type=\"text\" name=\"birthday\" value=\"\${**c.birthday**}\" class=\"Wdate\" onClick=\"*WdatePicker***()**\" readonly=\"readonly\"**\>
  --------------------------------------------------------------------------------------------------------------------------------------------------

##### form属性

###### 表单提交路径

> 语法：\<formaction=*\"路径\"*\>\</form\>

功能：指定表单提交路径，可以是：后台、http网址、html页面

###### 表单提交方式

> 语法：\<formmethod=*[\"提交方式\"]{.underline}*\>\</form\>

功能：指定表单的提交方式，提交方式有很多种，常用：post、get（默认）

post、get区别：

1)  get方式会把提交内容显示在地址栏，post不会

2)  get方式说明网站安全级别较低，post方式说明安全级别较高

3)  get方式不支持大数据，post支持大数据

###### encType

> 属性规定在发送到服务器之前应该如何对表单数据进行编码。

-   语法

  ------------------------------
  \<form enctype=\"*value*\"\>
  ------------------------------

-   属性值

+-----------------------------------+------------------------------------------------+
| 值                                | 描述                                           |
+===================================+================================================+
| application/x-www-form-urlencoded | 在发送前编码所有字符（默认）                   |
+-----------------------------------+------------------------------------------------+
| multipart/form-data               | 不对字符编码。                                 |
|                                   |                                                |
|                                   | 在使用包含文件上传控件的表单时，必须使用该值。 |
+-----------------------------------+------------------------------------------------+
| text/plain                        | 空格转换为 \"+\" 加号，但不对特殊字符编码。    |
+-----------------------------------+------------------------------------------------+

## CSS

### CSS介绍

1.  用于设置网页显示效果（设置样式）

2.  CSS将网页显示效果与内容分离（耦合性）。HTML只需要把文本内容封装起来，不用属性，CSS来控制显示效果，如果想修改显示效果，只需要更高CSS即可；网页换肤就是这么做的。

### CSS与HTML结合

#### style属性

> 语法：\<divstyle=\"css代码\"\>\</div\>

功能：设置div样式，仅对当前div有效

例：

-   代码：

+-----------------------------------------------------------+
| \<divstyle=\"background-color: *green*;color: *red*\"\>   |
|                                                           |
| [css]{.underline}与[html]{.underline}结合方式1：style属性 |
|                                                           |
| \</div\>                                                  |
+-----------------------------------------------------------+

-   效果

> ![image341.png](media/image362.png){width="2.375in" height="0.23958333333333334in"}

#### style标签

> 语法：\<styletype=*\"text/css\"*\>**CSS代码**\</style\>

功能：设置div样式，对当前html文件中div有效

该标签需要放在head标签内

例：

-   代码：

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| **div**{                                                                    |
|                                                                             |
| background-color: *green*;                                                  |
|                                                                             |
| color: *red*;                                                               |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<div\>[css]{.underline}与[html]{.underline}结合方式2：style标签\</div\>    |
|                                                                             |
| \<div\>[css]{.underline}与[html]{.underline}结合方式2：style标签\</div\>    |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果：

> ![image342.png](media/image363.png){width="2.375in" height="0.5in"}

#### 引入外部CSS文件（import）

> 语法：

+------------------------------+
| \<styletype=*\"text/css\"*\> |
|                              |
| \@import*url(\"css文件\")*;  |
|                              |
| \</style\>                   |
+------------------------------+

> 功能：
>
> 将样式写在单独的"\*.css"文件中，在html文件内、head标签内的style标签内引入外部css文件，即可将样式应用到引用这个样式的html页面上。这样多个页面修改样式，只需要修改css文件即可

例：

-   代码：

> demo1.css：

+---------------------------+
| **div**{                  |
|                           |
| background-color:*green*; |
|                           |
| color: *blue*;            |
|                           |
| }                         |
+---------------------------+

> demo1.html：

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| \@import*url(\"./demo1.css\")*;                                             |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<div\>[css]{.underline}与[html]{.underline}结合方式2：style标签\</div\>    |
|                                                                             |
| \<div\>[css]{.underline}与[html]{.underline}结合方式2：style标签\</div\>    |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果

> ![image343.png](media/image364.png){width="2.4166666666666665in" height="0.5104166666666666in"}

#### 引入外部文件（link）

> 语法：\<linkrel=*\"stylesheet\"*type=*\"text/css\"*href=*\"css文件\"*\>

功能：

> 功能与[[引入外部CSS文件（import）]{.underline}](#htmlcssjs)相同，只是写法不同；该方法link标签要写在head标签内

### CSS规范

+------------------------+
| **选择器名称**{        |
|                        |
| 属性名:*属性值*;       |
|                        |
| 属性名:*属性值*;       |
|                        |
| 属性名:*属性值属性值*; |
|                        |
| }                      |
+------------------------+

1.  属性之间用分号隔开

2.  属性与属性值用冒号连接

3.  如果属性有多个值，多个值之间用空格隔开

### 选择器

#### 作用

> 用于指定css代码作用于哪个标签

#### 基本选择器

##### 标签名选择器

> 作用于哪种标签：
>
> div{}： 作用于div标签上
>
> span{}： 作用于span标签上

##### 类选择器

> 语法：

-   *.class名称*{}

-   **标签***.class名称*{}

> 功能：
>
> 在html标签上指定class属性

-   通过".class名称"将样式作用于所有标签中与css给定class属性相同的html标签上

-   通过"标签.class名称"将样式作用于指定标签中与css给定class属性相同的html标签上

例：

-   代码

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| *.class1*{                                                                  |
|                                                                             |
| background-color: *yellow*;                                                 |
|                                                                             |
| color:*red*;                                                                |
|                                                                             |
| }                                                                           |
|                                                                             |
| **div***.class1*{                                                           |
|                                                                             |
| color:*blue*;                                                               |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<divclass=*\"class1\"*\>床前明月光\</div\>                                 |
|                                                                             |
| \<div\>疑是地上霜\</div\>                                                   |
|                                                                             |
| \<spanclass=*\"class1\"*\>举头望明月\</span\>                               |
|                                                                             |
| \<span\>低头思故乡\</span\>                                                 |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果：

> ![image344.png](media/image365.png){width="2.0277777777777777in" height="0.6756944444444445in"}

##### id选择器

> 语法：*\#id名称*{}

功能：

> 在html标签上指定id属性
>
> 通过"\#id名称"将样式作用于与css给定id属性相同的html标签上

例：

-   代码

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<style type=*\"text/css\"*\>                                               |
|                                                                             |
| *\#id1*{                                                                    |
|                                                                             |
| background-color: *yellow*;                                                 |
|                                                                             |
| color: *red*;                                                               |
|                                                                             |
| }                                                                           |
|                                                                             |
| *\#id2*{                                                                    |
|                                                                             |
| background-color: *green*;                                                  |
|                                                                             |
| color: *pink*;                                                              |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<divid=*\"id1\"*\>床前明月光\</div\>                                       |
|                                                                             |
| \<divid=*\"id2\"*\>疑是地上霜\</div\>                                       |
|                                                                             |
| \<spanid=*\"id1\"*\>举头望明月\</span\>                                     |
|                                                                             |
| \<span\>低头思故乡\</span\>                                                 |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果

> ![image345.png](media/image366.png){width="1.8888888888888888in" height="0.7194444444444444in"}

#### 扩展选择器

##### 关联选择器

> 语法：**标签1标签2**{css代码}

功能：当标签嵌套时，仅对标签1下的标签2使用样式

例：

-   代码：

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| **divfont**{                                                                |
|                                                                             |
| color: *red*;                                                               |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<div\>床前\<font\>明月\</font\>光\</div\>                                  |
|                                                                             |
| \<div\>疑是地上霜\</div\>                                                   |
|                                                                             |
| \<span\>举头望\<font\>明月\</font\>\</span\>                                |
|                                                                             |
| \<span\>低头思故乡\</span\>                                                 |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果

> ![image346.png](media/image367.png){width="1.7916666666666667in" height="0.6875in"}
>
> 仅对div标签下的font标签使用该样式

##### 组合选择器

> 语法：**选择器1,选择器2**{css代码}

功能：对多个不同的选择器使用相同的样式，不同选择器直接用逗号隔开

例：

-   代码

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| **div,span**{                                                               |
|                                                                             |
| color: *red*;                                                               |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<div\>床前明月光\</div\>                                                   |
|                                                                             |
| \<div\>疑是地上霜\</div\>                                                   |
|                                                                             |
| \<span\>举头望明月\</span\>                                                 |
|                                                                             |
| \<span\>低头思故乡\</span\>                                                 |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果

> ![image347.png](media/image368.png){width="1.9305555555555556in" height="0.7090277777777778in"}
>
> 对div标签名选择器和span标签名选择器都使用相同的样式

##### 伪元素选择器

> 语法：**标签***:选择器名称*{css代码}

功能：使用已经提供好的选择器

例：

-   代码

+-----------------------------------------------------------------------------+
| \<html\>                                                                    |
|                                                                             |
| \<head\>                                                                    |
|                                                                             |
| \<metahttp-equiv=*\"Content-Type\"*content=*\"text/html; charset=UTF-8\"*\> |
|                                                                             |
| \<title\>Insert title here\</title\>                                        |
|                                                                             |
| \<styletype=*\"text/css\"*\>                                                |
|                                                                             |
| **input***:FOCUS* {                                                         |
|                                                                             |
| background-color: *yellow*;                                                 |
|                                                                             |
| }                                                                           |
|                                                                             |
| \</style\>                                                                  |
|                                                                             |
| \</head\>                                                                   |
|                                                                             |
| \<body\>                                                                    |
|                                                                             |
| \<inputtype=*\"text\"*/\>                                                   |
|                                                                             |
| \</body\>                                                                   |
|                                                                             |
| \</html\>                                                                   |
+-----------------------------------------------------------------------------+

-   效果

> ![image348.png](media/image369.png){width="1.8472222222222223in" height="0.3645833333333333in"}
>
> 获取焦点后背景色变为css指定样式

### 优先级

1.  优先级作用

> 内容取对自己有效的最高优先级样式显示

2.  优先级规则

> 一般情况下：优先级从低到高顺序为：从上到下，从外到内
>
> 特殊情况下：标签名选择器 \< 类选择器 \< ID选择器 \< style属性

## JavaScript

### js介绍

#### 简介

1.  基于对象和事件驱动的脚本语言，作用于浏览器上

2.  用来实现动态效果

#### 特点

8.  交互性

9.  安全性（不可以访问本地硬盘）

10. 跨平台性

### js与html结合

#### script标签

> 语法：\<scripttype=*\"text/javascript\"*\>JS代码\</script\>

功能：

> 通过script标签的形式将js与html结合；
>
> script标签可以放在html文件中任意位置，但是建议放在body后面

例：

-   代码：

+--------------------------------------+
| \<scripttype=*\"text/javascript\"*\> |
|                                      |
| //弹出提示框，内容为"hello world"    |
|                                      |
| alert(\"hello world\");              |
|                                      |
| \</script\>                          |
+--------------------------------------+

-   效果

> ![image349.png](media/image370.png){width="1.8194444444444444in" height="1.8298611111111112in"}

#### 引入外部文件

> 新建file，编写js文件

语法：\<scripttype=*\"text/javascript\"*src=*\"js文件\"*\>\</script\>

功能：

> 使用引用外部文件的方式将js与html结合；使用这种方式时，script标签内的内容将被忽略，使用js文件中内容
>
> script标签可以放在html文件中任意位置，但是建议放在body后面

例：

-   代码：

> demo1.js代码：

-----------------------
  alert(\"beautiful\");
  -----------------------

> demo1.html代码：

+--------------------------------------------------------------+
| \<scripttype=*\"text/javascript\"*src=*\"../js/demo1.js\"*\> |
|                                                              |
| //使用外部引用方式时，这里的内容会被忽略                     |
|                                                              |
| alert(\"hello world\");                                      |
|                                                              |
| \</script\>                                                  |
+--------------------------------------------------------------+

-   效果

> ![image350.png](media/image371.png){width="1.6527777777777777in" height="1.8305555555555555in"}

### 语法

> js的与于java基本相同，这里把不同的地方列出来

#### 定义变量

语法：**var** data = 值;

功能：js时若类型语言，所有数据类型均使用"var"定义

#### 数据类型

> 字符串：**var** str =\"str\";
>
> 数字： **var** num =123;
>
> 布尔： **var** bl =**true**;
>
> 引用： **var** p =**null**;
>
> 未定义：**var** un; （声明但是没有赋值的变量）

#### 获取数据类型

> 语法：**typeof**(变量);

功能：获取变量的数据类型

返回值：string、number、boolean、object、undefined

例：

-   代码

+-------------------------+
| **var** str =\"str\";   |
|                         |
| **var** num =123;       |
|                         |
| **var** bl =**true**;   |
|                         |
| **var** p =**null**;    |
|                         |
| **var** un;             |
|                         |
| alert(**typeof**(str)); |
|                         |
| alert(**typeof**(num)); |
|                         |
| alert(**typeof**(bl));  |
|                         |
| alert(**typeof**(p));   |
|                         |
| alert(**typeof**(un));  |
+-------------------------+

-   效果

> ![image351.png](media/image372.png){width="1.2083333333333333in" height="1.4680555555555554in"}
>
> ![image352.png](media/image373.png){width="1.3194444444444444in" height="1.4895833333333333in"}
>
> ![image353.png](media/image374.png){width="1.3194444444444444in" height="1.4701388888888889in"}
>
> ![image354.png](media/image375.png){width="1.2083333333333333in" height="1.4680555555555554in"}
>
> ![image355.png](media/image376.png){width="1.4027777777777777in" height="1.4694444444444446in"}

#### 运算符

##### 算数运算符

> 有js是弱类型语言，所以在算数运算发上与java有所不同，具体需要开发中去体会
>
> 例：

  表达式            结果
----------------- -----------------
  3710/1000\*1000   3710
  "12"+1            "121"
  "12"-1            11
  "abc"-1           NaN（类型出错）
  false+1           1
  true+1            2

##### 比较运算符

  运算符   意义
-------- --------------
  ==       比较值
  ===      比较值和类型

#### 数组

##### 数组定义

> 数组定义3种方法：

1.  var arr = \[2,3,4\]; //定义时指定元素

2.  var arr = new Array(5); //定义时指定长度

3.  var arr = new Array(2,3,4); //定义时指定元素

##### 数组特性

51. 数组长度可变

52. 可以通过arr.length获取数组长度

53. 数组内可以存放任意类型数据

54. 新添加元素下标远大于现有长度时，会添加到指定下标位置，为指定元素的位置会留空

55. 通过write(arr)可以直接打印数组内所有元素

##### 例程

-   代码

+---------------------------------------------------+
| **var** arr1 = \[2,3,4\];                         |
|                                                   |
| **var** arr2 =**new**Array(2);                    |
|                                                   |
| **var** arr3 =**new**Array(2,3,4);                |
|                                                   |
| window.document.writeln(arr1.length +\"\<br\>\"); |
|                                                   |
| arr3\[4\] =\"abc\";                               |
|                                                   |
| window.document.writeln(arr3 +\"\<br\>\");        |
|                                                   |
| window.document.writeln(arr3.length +\"\<br\>\"); |
+---------------------------------------------------+

-   效果

> ![image356.png](media/image377.png){width="0.875in" height="0.8020833333333334in"}

#### 函数

##### 函数定义

+------------------------------+
| **function**方法名(参数列表) |
|                              |
| {                            |
|                              |
| 方法体;                      |
|                              |
| }                            |
+------------------------------+

1.  函数定义没有返回值类型

<!-- -->

8.  参数列表不必带参数类型，直接把形参列出来

9.  返回值可有可没有

##### 例程

-   代码

+----------------------------+
| //函数定义                 |
|                            |
| **function**add(num1,num2) |
|                            |
| {                          |
|                            |
| **return**(num1+num2);     |
|                            |
| }                          |
|                            |
| //函数调用                 |
|                            |
| alert(add(\"12\",2));      |
+----------------------------+

-   效果

> ![image357.png](media/image378.png){width="1.5in" height="1.8229166666666667in"}

##### js函数特性

1.  js中函数不能重载，同名函数会调用离调用地方最近定义的这个函数名的函数（无论参数如何）

<!-- -->

10. js函数的参数过多时，会从前向后取需要的参数个数；参数过少时函数依然会执行，不过会产生意想不到的后果

11. 如果调用函数时没有"（参数列表）"这部分内容，返回的是整个函数体代码

##### 动态函数

> 将参数列表和函数体内容作为2个参数，来定义Function对象的定义对象的方法叫做动态函数

例：

-   代码

+---------------------------------------------------------------------+
| **var** sum =**new**Function(\"num1,num2\",\"return (num1+num2)\"); |
|                                                                     |
| alert(sum(2,3));                                                    |
+---------------------------------------------------------------------+

-   效果

> ![image358.png](media/image379.png){width="1.2083333333333333in" height="1.4680555555555554in"}

##### 匿名函数

> 匿名函数就是：通过赋值的方式指定函数名，定义的时候不指定函数名。
>
> 语法：**var** 函数名 =**function**(参数列表){函数体};
>
> 例：

-   代码

+-----------------------------------------------------------+
| document.getElementById(\"div\").onclick =**function**(){ |
|                                                           |
| alert(\"clicked\");                                       |
|                                                           |
| }                                                         |
+-----------------------------------------------------------+

-   效果

> 产生点击事件就会执行定义的这个函数

#### 全局变量、局部变量

##### 定义

> 全局变量：在script标签内部定义的变量
>
> 局部变量：在函数内部定义的变量

##### 例

+--------------------------------------------------+
| **var** a =1; //全局变量a                        |
|                                                  |
| **for**(**var** i=0; i\<3; i++) //全局比变量i    |
|                                                  |
| {}                                               |
|                                                  |
| **function**abs(num) //局部变量[num]{.underline} |
|                                                  |
| {                                                |
|                                                  |
| **var**temp=1; //局部变量[temp]{.underline}      |
|                                                  |
| }                                                |
+--------------------------------------------------+

### BOM

> BOM：浏览器对象模型

#### 对象

  对象        隶属于   说明                     说明
----------- -------- ------------------------ --------
  window               窗口对象                 
  Navigator   window   和浏览器版本相关的对象   
  Screen      window   和屏幕相关的对象         
  History     window   和浏览器历史相关的对象   
  Location    window   和浏览器地址相关的对象   地址栏
  document    window   文档对象                 

### 事件

#### 事件绑定

> 通过控件(事件源)的属性可以进行事件绑定
>
> 例：

+--------------------------------------------------------------------------+
| \<body\>                                                                 |
|                                                                          |
| \<inputtype=*\"button\"*value=*\"测试\"*onclick=\"button1\_onclick()\"\> |
|                                                                          |
| \</body\>                                                                |
|                                                                          |
| \<scripttype=*\"text/javascript\"*\>                                     |
|                                                                          |
| **function** button1\_onclick()                                          |
|                                                                          |
| {                                                                        |
|                                                                          |
| alert(\"good guy\");                                                     |
|                                                                          |
| }                                                                        |
|                                                                          |
| \</script\>                                                              |
+--------------------------------------------------------------------------+

> 说明：

6.  在js代码中定义事件函数

7.  在html代码中，通过给时间属性赋值为函数名的方式来绑定事件

#### 事件分类

##### onmousemove

> 功能:鼠标移动事件,鼠标在绑定该事件的区域内移动1个像素就触发1个事件

##### onmouseout

> 功能:鼠标移出事件,鼠标移出绑定该事件的区域时发生

##### onmouseover

> 功能:鼠标悬停事件,鼠标悬停在绑定该事件的区域时发生

##### onclick

> 功能：点击事件

##### ondblclick

> 功能:双击事件

##### onload

> 功能：加载事件,打开网页时发生

##### onunload

> 功能:卸载事件,关闭网页时发生；大部分浏览器已经不支持该事件

##### onfocus

> 功能：获取焦点事件

##### onblur

> 功能：失去焦点事件

##### onkeyup

> 功能：按键抬起事件

##### onchange

> 功能:选择项改变事件,多用于select下拉框等控件

##### onsubmit

> 功能：表单提交事件，提交表单时发生
>
> 说明：
>
> 绑定onsubmit事件时，必须使用"onsubmit="return 函数()""进行绑定，并且该事件的函数必须有bool类型的返回值，用来决定是否提交该表单，该函数内一般做表单校验的工作

例：

-   代码

+----------------------------------------------------------------------+
| \<body\>                                                             |
|                                                                      |
| \<formaction=*\"../html/test2.html\"*onsubmit=\"**return** run()\"\> |
|                                                                      |
| \<inputtype=*\"text\"*id=*\"userid\"*\>\<br\>                        |
|                                                                      |
| \<inputtype=*\"submit\"*\>                                           |
|                                                                      |
| \</form\>                                                            |
|                                                                      |
| \</body\>                                                            |
|                                                                      |
| \<scripttype=*\"text/javascript\"*\>                                 |
|                                                                      |
| **function** run(){                                                  |
|                                                                      |
| **var** input= document.getElementById(\"userid\"); //校验表单       |
|                                                                      |
| **if**(input.value == \"\")                                          |
|                                                                      |
| **return false**; //不提及表单                                       |
|                                                                      |
| **else**                                                             |
|                                                                      |
| **return true**; //提交表单（默认返回true）                          |
|                                                                      |
| }                                                                    |
|                                                                      |
| \</script\>                                                          |
+----------------------------------------------------------------------+

-   效果：

> ![image360.png](media/image380.png){width="1.9444444444444444in" height="0.66875in"}
>
> 如果不输入内容，点击提交无反应，有内容会跳到下一个页面

### DOM

#### 介绍

> DOM就是文档对象模型
>
> 文档：标记型文档（HTML/XML）
>
> 对象：封装属性、方法
>
> 模型：共性特征的体现

#### DOM解析HTML

> DOM想要解析标记型文档，先要使用解析器进行解析
>
> 对于HTML，浏览器就可以解析
>
> 对于XML，需要自己创建解析器
>
> 目标：通过DOM方法，把HTML全部内容封装为对象

56. 浏览器解析HTML

> 当浏览器加载HTML文件后，会在内存中把html文件中的元素（标签）、文本、属性用树状结构表示出来
>
> 然后把HTML文件中所有内容封装成如下几种对象：

-   整个文档的对象：Document

-   元素（标签）对象：Element

-   属性对象：（没提供具体对象名称）

-   文本对象：（没提供具体对象名称）

-   节点对象：Node

> 标签、文本、属性在树状结构中都是节点，所以Node相当于他们的父类，一些方法可以通过Node进行实现；另外，Document对象也属于Node'的对象

#### DHTML介绍

> DHTML又叫做动态"动态的HTML"，就是4种语言的结合：

-   html ：使用标签封装数据

-   css ：设置样式

-   dom ：把html提供为对象，来对html进行操作

-   js ：提供逻辑

### 常用对象、方法

#### string对象

##### 声明

> string对象的声明有2种方式：

57. var str = "abc";

58. var str = new String("abc");

##### 属性

###### length

> 语法：变量.length
>
> 功能：获取字符串长度

##### 方法

###### bold

> 语法：变量.bold();
>
> 功能：使用粗体显示字符串
>
> 例：

-   代码

+-----------------------------------------+
| **var** str =\"str\";                   |
|                                         |
| document.write(str.bold() +\"\<br\>\"); |
+-----------------------------------------+

-   效果

> ![image361.png](media/image381.png){width="0.5555555555555556in" height="0.35625in"}

###### fontcolor

> 语法：变量.fontcolor(颜色)
>
> 功能：设置字体颜色
>
> 例：

-   代码：

+-----------------------------------------------------+
| **var** str =\"str\";                               |
|                                                     |
| document.write(str.fontcolor(\"red\") +\"\<br\>\"); |
+-----------------------------------------------------+

-   效果

> ![image362.png](media/image382.png){width="0.4444444444444444in" height="0.33819444444444446in"}

###### fontsize

> 语法：变量.fontsize(字体大小)
>
> 功能：设置字体大小1\~7

###### link

> 语法：变量.link(链接地址)
>
> 功能：将字符串设置为连接标签

###### sub

> 语法：变量.sub()
>
> 功能：将字符串显示为下标

###### sup

> 语法：变量.sup()
>
> 功能：将字符串显示为上标

###### charat

> 语法：变量.charat(下标值)
>
> 功能：返回值得位置的字符（从0开始）

###### indexof

> 语法：变量.indexof(字符串,起始位置)
>
> 功能：检索指定字符串在变量字符串中首次出现的位置
>
> 第1个参数必须有
>
> 第2个参数可以没有，表示起始检索位置

###### replace

> 语法：变量.replace(字符串1，字符串2)
>
> 功能：把变量中的字符串1替换为字符串2

###### substring

> 语法：变量.substring(起始位置，结束位置)
>
> 功能：截取起始结束位置直接的字符串，不含起始不包含结束

###### substr

> 语法：变量.substr(起始位置，长度)
>
> 功能：从起始位置开始截取一定长度的字符串

#### Array对象

##### concat

> 语法：变量.concat(参数)
>
> 功能：连接元素或数组，但是结果并未改变变量数组的值
>
> 参数可以是多个元素或数组
>
> 例：

-   代码

+--------------------------------------------------------------------+
| **var** a1 = \[\"n\",\"o\",\"\"\];                                 |
|                                                                    |
| **var** a2 =**new**Array(\"f\",\"a\",\"i\");                       |
|                                                                    |
| **var** a3 = \[\"r\",\"!\"\];                                      |
|                                                                    |
| document.write(a1.concat(a2,a3,\"u\",\"n\",\"fair\") +\"\<br\>\"); |
|                                                                    |
| document.write(a1);                                                |
+--------------------------------------------------------------------+

-   效果

> ![image363.png](media/image383.png){width="1.5416666666666667in" height="0.5729166666666666in"}

##### join

> 语法：变量.join(分割字符)
>
> 功能：将数组放入1个字符串，并用指定字符进行分割，默认参数为逗号
>
> 例：

-   代码

+---------------------------------+
| **var** a4 = \[2017,10,3\];     |
|                                 |
| document.write(a4.join(\"-\")); |
+---------------------------------+

-   效果

> ![image364.png](media/image384.png){width="0.9166666666666666in" height="0.28125in"}

##### pop

> 功能：删除并返回数组最后1个元素

##### push

> 功能：向数组的末尾添加多个新的元素，并返回新的长度

##### shift

> 功能：删除并返回数组的第1个元素

##### unshift

> 功能：向数组的开始位置添加多个元素，并返回新的数组的长度

##### sort

> 功能：将数组排序

#### date对象

##### 定义

> 语法：var 变量 = new Date(参数);
>
> 功能：
>
> 定义1个date对象，可以设置参数来指定该变量的时间，没有参数代表当前时间
>
> 参数：
>
> 毫秒数：通过将1970年月1日添加或减去一定毫秒数来指定时间日期
>
> 年，月，日，时，分，秒，毫秒：直接指定时间日期

##### toLocalString

> 语法：变量.toLocalString();
>
> 功能：转换为本地的时间日期格式

##### toLocalDateString

> 语法：变量.toLocalDateString();
>
> 功能：转换为本地的日期格式，只保留日期部分

##### toLocalTimeString

> 语法：变量.toLocalTimeString();
>
> 功能：转换为本地的时间格式，只保留时间部分

##### getDate

> 功能：返回"日"

##### getDay

> 功能：返回星期（0\~6）

##### getMonth

> 功能：返回月（0\~11）

##### getFullYear

> 功能：返回年份

##### getTime

> 功能：返回1970到指定时间的毫秒数

##### setTime

> 功能：通过将1970年1月1日添加或减去指定的毫秒数来计算时间日期
>
> 也可以在定义date对象时指定毫秒数来定义时间

##### parse

> 语法：Date.parse(str);
>
> 功能：解析时间日期字符串并返回1970年1月1日到该日期的毫秒数

#### Math对象

##### abs

> 功能：绝对值

##### ceil

> 功能：向上取整

##### floor

> 功能：向下取整

##### round

> 功能：四舍五入

##### random

> 功能：产生0\~1之间随机数

#### 正则表达式对象

> 功能：对输入内容进行校验

##### 定义

> 语法：

a.  var reg = new RegExp("表达式");

b.  var reg = /表达式/ //常用

c.  var reg = /\^表达式\$/ //常用

##### 匹配

> 语法：

a.  exec(str); //不常用

b.  test(str); //常用

> 功能：

c.  exec：匹配上返回匹配结果，否则返回null

d.  test：匹配上返回true，负责返回false

##### 例程

1.  例程1

-   代码

+---------------------------------+
| **var** reg =/\^runoo+b\$/;     |
|                                 |
| **if**(reg.test(\"runoob\"))    |
|                                 |
| document.write(\"你说得对\");   |
|                                 |
| **else**                        |
|                                 |
| document.write(\"你说的不对\"); |
+---------------------------------+

-   效果

> ![image365.png](media/image385.png){width="0.9305555555555556in" height="0.2923611111111111in"}

1.  更简单的方式

+----------------------------------------+
| **if**(/\^runoo+b\$/.test(\"runoob\")) |
|                                        |
| document.write(\"你说得对\");          |
|                                        |
| **else**                               |
|                                        |
| document.write(\"你说的不对\");        |
+----------------------------------------+

#### 全局函数

##### eval

> 语法：eval(str);
>
> 功能：

-   解析字符串并执行字符串中的js代码

-   将json字符串转换为js对象的数组

##### isNaN

> 语法：isNaN(参数)
>
> 功能：如果参数为非数字值返回true，否则返回false

##### parseInt

> 语法：parseInt(str,index);
>
> 功能：解析字符串并返回整数
>
> str：被解析的字符串
>
> index：进制数

#####  编码、解码

> 为防止中文乱码，字符串需要进行编码与解码，才能进行传递与传输

###### 3种方式

1.  encodeURI、decodeURI

> 多用于URL跳转

2.  encodeURIComponent、decodeURIComponent

> 多用于传递参数

3.  escape、unescape

> 对字符串进行Unicode编码与解码

###### 区别

> 编码过程，有些字符不进行编码：
>
> encodeURI：82个不进行编码
>
> encodeURIComponent：71个不进行编码
>
> escape：69个不进行编码
>
> 具体哪些不进行编码参看手册

###### 例程

-   代码

+-----------------------------------------------------+
| **var** str =\"abc真牛逼\";                         |
|                                                     |
| document.write(str +\"\<br\>\");                    |
|                                                     |
| **var** str\_encode =encodeURI(str);                |
|                                                     |
| document.write(str\_encode +\"\<br\>\");            |
|                                                     |
| document.write(decodeURI(str\_encode) +\"\<br\>\"); |
+-----------------------------------------------------+

-   效果

> ![image366.png](media/image386.png){width="3.25in" height="0.6020833333333333in"}

#### Navigater对象

> [[BOM]{.underline}](#htmlcssjs)中的1个对象

##### userAgent属性

> 功能：获取浏览器相关信息
>
> 例：

-   代码

  -----------------------------
  alert(navigator.userAgent);
  -----------------------------

-   效果

> ![image367.png](media/image387.png){width="3.486111111111111in" height="1.3125in"}

#### History对象

> [[BOM]{.underline}](#htmlcssjs)中的1个对象

##### back

> 语法：History.back();
>
> 功能：返回上1个页面

##### forword

> 语法：History.forward();
>
> 功能：去下1个页面

##### go

> 语法：History.go(参数)
>
> 功能：跳转到某个页面
>
> 参数为1，相当于forward()
>
> 参数为-1，相当于back();

#### Location对象

> [[BOM]{.underline}](#htmlcssjs)中的1个对象

##### href属性

> 功能： 作为右值：获取当前页面的URL地址
>
> 作为左值：跳转到某个URL地址
>
> 例：

-   获取URL

<!-- -->

-   代码

  -----------------------
  alert(location.href);
  -----------------------

-   效果

> ![image368.png](media/image388.png){width="3.6944444444444446in" height="1.3506944444444444in"}

-   跳转到URL

<!-- -->

-   代码

  -------------------------------------------
  location.href = \"http://www.baidu.com\";
  -------------------------------------------

#### window对象

> [[BOM]{.underline}](#htmlcssjs)中的1个对象

##### alert

> 语法：\[window.\]alert(内容);

功能：弹出提示框，内容为参数；"window.可以省略"

例：

-   代码

  ---------------------
  alert(\"no fair\");
  ---------------------

-   效果

> ![image369.png](media/image389.png){width="1.5277777777777777in" height="1.80625in"}

##### confirm

> 语法：var ret = confirm("询问内容");
>
> 功能：
>
> 弹出1个询问框，询问框内包含确认和取消按钮，询问内筒通过参数指定，点击确定返回true，点击取消返回false

##### setInterval

> 语法：var id = setInterval("函数",毫秒);
>
> 功能：定时执行指定函数，每隔一定时间执行1次；并返回该定时器ID

##### clearInterval

> 语法：clearInterval(id)
>
> 功能：通过setInterval启动定时器后，使用该方法通过定时ID停止该定时器

##### setTimeout

> 语法：var id = setTimeout("函数",毫秒);
>
> 功能：超时执行指定函数，指定时间一到，只执行1次；并返回该定时器ID

##### clearTimeout

> 语法：clearTimeout(id)
>
> 功能：通过setTimeout启动定时器后，使用该方法通过定时ID停止该定时器

##### open

> 语法：open(URL,name,features,replace)
>
> 功能：使用给定参数打开浏览器窗口
>
> URL： 指定URL地址，可以
>
> name：指定窗口名称，可以为空
>
> features：指定窗口高度、宽度等属性，可以为空
>
> replace：暂时忽略此参数
>
> 如果中间某个参数不指定，需要使用双引号表示该参数
>
> 例：

-   代码

  ---------------------------------------------------------------
  open(\"http://www.baidu.com\",\"\",\"width=600 height=500\");
  ---------------------------------------------------------------

-   效果

> ![image370.png](media/image390.png){width="2.486111111111111in" height="2.1680555555555556in"}

##### opener属性

> 功能：
>
> 返回创建本窗口的父窗口的引用，得到该引用才能获取父窗口的属性和执行父窗口的操作

##### close

> 语法：close()
>
> 功能：关闭窗口

#### document对象

> [[BOM]{.underline}](#htmlcssjs)中的1个对象，同时也是[[DOM]{.underline}](#htmlcssjs)中的1个对象。页面内的内容均属于document对象的内容

##### write

> 语法： window.document.write(内容);

功能：向html页面内输出内容

内容可以为html代码

例：

-   代码：

  ---------------------------------------------------
  window.document.write(\"用户名：\<br/\>密码：\");
  ---------------------------------------------------

-   效果

> ![image371.png](media/image391.png){width="0.9583333333333334in" height="0.6388888888888888in"}

##### getElementById

> 语法：var obj = document.getElementById(id);
>
> 功能：通过标签ID获取标签对象
>
> 例：

-   代码

+---------------------------------------------------------------------------------+
| \<body\>                                                                        |
|                                                                                 |
| \<inputtype=*\"text\"*id=*\"textid\"*name=*\"username\"*value=*\"434224591\"*\> |
|                                                                                 |
| \</body\>                                                                       |
|                                                                                 |
| \<scripttype=*\"text/javascript\"*\>                                            |
|                                                                                 |
| **var** obj = document.getElementById(\"textid\");                              |
|                                                                                 |
| alert(obj.value);                                                               |
|                                                                                 |
| \</script\>                                                                     |
+---------------------------------------------------------------------------------+

-   效果

> ![image372.png](media/image392.png){width="1.1666666666666667in" height="1.1868055555555554in"}

##### getElementsByName

> 语法：var arr = document.getElementsByName(name);
>
> 功能：通过标签name属性获取元素对象的集合（返回数组）
>
> 例：

-   代码

+--------------------------------------------------------+
| \<body\>                                               |
|                                                        |
| \<inputtype=*\"text\"*name=*\"username\"*\>\<br\>      |
|                                                        |
| \<inputtype=*\"text\"*name=*\"user\"*\>\<br\>          |
|                                                        |
| \</body\>                                              |
|                                                        |
| \<scripttype=*\"text/javascript\"*\>                   |
|                                                        |
| **var** input1 = document.getElementsByName(\"user\"); |
|                                                        |
| document.write(input1.length + \"\<br\>\");            |
|                                                        |
| \</script\>                                            |
+--------------------------------------------------------+

-   效果

> ![image373.png](media/image393.png){width="1.9444444444444444in" height="0.9402777777777778in"}

##### getElementsByTagName

> 语法：var arr = document.getElementsByTagName(标签名称)
>
> 功能：通过标签名称（input、div、table等）获取元素对象的集合（返回数组）
>
> 该方法被谁调用，获取的就是谁下面的元素对象的集合，如：

-   document.getElementsByTagName(标签名称)

> //在整个页面下寻找指定标签

-   元素. getElementsByTagName(标签名称)

> //在该元素的所有子节点中寻找指定标签

功能：

-   代码

+------------------------------------------------------------+
| \<body\>                                                   |
|                                                            |
| \<inputtype=*\"text\"*name=*\"username\"*\>\<br\>          |
|                                                            |
| \<inputtype=*\"text\"*name=*\"user\"*\>\<br\>              |
|                                                            |
| \</body\>                                                  |
|                                                            |
| \<scripttype=*\"text/javascript\"*\>                       |
|                                                            |
| **var** input2 = document.getElementsByTagName(\"input\"); |
|                                                            |
| document.write(input2.length);                             |
|                                                            |
| \</script\>                                                |
+------------------------------------------------------------+

-   效果

> ![image374.png](media/image394.png){width="1.6666666666666667in" height="0.7659722222222223in"}

##### createElement

> 语法：var ele = document.createElement(标签名称);
>
> 功能：创建标签
>
> 参数标签名称：input、li、th等
>
> 返回值：标签对象
>
> 例：

-   代码

+----------------------------------------------------+
| \<body\>                                           |
|                                                    |
| \<ulid=*\"ulid\"*\>                                |
|                                                    |
| \<li\>北京\</li\>                                  |
|                                                    |
| \<li\>上海\</li\>                                  |
|                                                    |
| \<li\>广州\</li\>                                  |
|                                                    |
| \</ul\>                                            |
|                                                    |
| \</body\>                                          |
|                                                    |
| \<scripttype=*\"text/javascript\"*\>               |
|                                                    |
| **var** li = document.createElement(\"li\");       |
|                                                    |
| **var** value = document.createTextNode(\"深圳\"); |
|                                                    |
| li.appendChild(value);                             |
|                                                    |
| **var** ul = document.getElementById(\"ulid\");    |
|                                                    |
| ul.appendChild(li);                                |
|                                                    |
| \</script\>                                        |
+----------------------------------------------------+

-   效果

> ![image375.png](media/image395.png){width="1.0138888888888888in" height="1.0763888888888888in"}

##### createTextNode

> 语法：var text = document.createTextNode(文本)
>
> 功能：创建文本对象
>
> 参数：文本内容
>
> 返回值：文本对象
>
> 例：参见[[createElement]{.underline}](#htmlcssjs)例程

#### Element对象

> 元素对象，可以理解为标签对象，参见[[DOM解析HTML]{.underline}](#htmlcssjs)

##### getAttribute

> 语法：var att = 元素.getAttribute(属性名称);
>
> 功能：获取属性值
>
> 类似于"元素.属性名称"，但是两者不完全相同，推荐"元素.属性名称"

例：

-   代码

+----------------------------------------------+
| **var** li = document.createElement(\"li\"); |
|                                              |
| //下面两种方式结果相同，但还是有区别         |
|                                              |
| **var** val1 = li.getAttribute(\"value\");   |
|                                              |
| **var** val2 = li.value; //推荐这种          |
+----------------------------------------------+

##### setAttribute

> 语法：元素.setAttribute(属性名称,属性值);
>
> 功能：设置属性值
>
> 类似于"元素.属性名称"，但是两者不完全相同，推荐"元素.属性名称"

##### removeAttribute

> 语法：元素.removeAttribute(属性名称)
>
> 功能：删除属性

##### getElementsByTagName

> 参见：document对象中的[[getElementsByTagName]{.underline}](#htmlcssjs)方法

##### getAttributeNode

> 语法：var attNode = 元素.getAttributeNode(属性名称);
>
> 功能：获取属性对象（节点）
>
> 参数：属性名称
>
> 返回值：属性对象

##### innerHTML属性

> 功能：获取和设置元素的文本内容
>
> 例：

-   代码

+----------------------------------------------------------------+
| \<body\>                                                       |
|                                                                |
| \<spanid=*\"spanid\"*\>我是span\</span\>\<br\>                 |
|                                                                |
| \</body\>                                                      |
|                                                                |
| \<scripttype=*\"text/javascript\"*\>                           |
|                                                                |
| document.getElementById(\"spanid\").onclick = **function** (){ |
|                                                                |
| alert(this.innerHTML);                                         |
|                                                                |
| this.innerHTML = \"我变了\";                                   |
|                                                                |
| }                                                              |
|                                                                |
| \</script\>                                                    |
+----------------------------------------------------------------+

-   效果

![image376.png](media/image396.png){width="2.2222222222222223in" height="1.5805555555555555in"}![image377.png](media/image397.png){width="0.7777777777777778in" height="0.33125in"}

#### 节点对象

> 参见[[DOM解析HTML]{.underline}](#htmlcssjs)

##### nodename、nodetype、nodevalue属性

> 不同类型的节点获取到的这三个属性值是不同的：

              元素       属性       文本
----------- ---------- ---------- ----------
  nodename    标签名称   属性名称   \#text
  nodetype    1          2          3
  nodevalue   null       属性值     文本内容

> 例：

-   代码

+------------------------------------------------------------------+
| \<body\>                                                         |
|                                                                  |
| \<inputtype=*\"text\"*id=*\"user\"*value=*\"beautiful\"*\>\<br\> |
|                                                                  |
| \<spanid=*\"spanid\"*\>我是span\</span\>\<br\>                   |
|                                                                  |
| \</body\>                                                        |
|                                                                  |
| \<scripttype=*\"text/javascript\"*\>                             |
|                                                                  |
| **var** ele = document.getElementById(\"user\");                 |
|                                                                  |
| document.write(ele.nodeName + \"\<br\>\");                       |
|                                                                  |
| document.write(ele.nodeType + \"\<br\>\");                       |
|                                                                  |
| document.write(ele.nodeValue + \"\<br\>\");                      |
|                                                                  |
| **var** att = ele.getAttributeNode(\"type\");                    |
|                                                                  |
| document.write(att.nodeName + \"\<br\>\");                       |
|                                                                  |
| document.write(att.nodeType + \"\<br\>\");                       |
|                                                                  |
| document.write(att.nodeValue + \"\<br\>\");                      |
|                                                                  |
| **var** span = document.getElementById(\"spanid\");              |
|                                                                  |
| **var** text = span.firstChild;                                  |
|                                                                  |
| document.write(text.nodeName + \"\<br\>\");                      |
|                                                                  |
| document.write(text.nodeType + \"\<br\>\");                      |
|                                                                  |
| document.write(text.nodeValue + \"\<br\>\");                     |
|                                                                  |
| \</script\>                                                      |
+------------------------------------------------------------------+

-   效果

![image378.png](media/image398.png){width="1.8194444444444444in" height="2.390972222222222in"}

##### parentNode属性

> 语法：节点.parentNode
>
> 功能：获取父节点。返回的永远是1个元素节点，因为只有元素节点才能有子节点

##### childNodes属性

> 语法：节点.childNodes
>
> 功能：返回所有子节点的集合
>
> 该方法会把空格等也作为子节点返回，不推荐

##### 节点关系属性

-   节点关系（包括空格）

<!-- -->

-   firstChild（第一个节点）

-   lastChild（最后一个节点）

-   nextSibling（下1个同级节点）

-   previousSibling（上一个同级节点）

a)  这几个属性是IE6推出的节点关系属性，至今还在延用，但是这些属性会把空格、元素、文本、属性等均作为节点，返回结果不准确，所以不推荐这种用法获取元素对象

b)  当获取文本对象时，可以使用这些属性，因为文本对象用firstElementChild等属性无法获取

    -   节点关系（不包括空格）

-   firstElementChild（第一个元素节点）

-   lastElementChild（最后一个元素节点）

-   nextElementSibling（下一个同级节点）

-   previousElementSibling（上一个同级节点）

a)  这几个属性是IE9之后推出的，他们只对元素节点进行统计，所以需要获取元素节点时推荐使用该方法

##### hasChildNodes

> 语法：var b = 节点.hasChildNodes();
>
> 功能：检查节点是否包含子节点（空格、文本对象、元素均算为子节点）

##### hasAttributes

> 语法：var b = 节点.hasAttributes();
>
> 功能：检查是否包含属性

##### appendChild

> 语法：节点.appendChild(对象)
>
> 功能：将对象添加到节点的子节点的末尾作为子节点
>
> 参数：作为子节点的对象
>
> 注意:该对象是被移动到指定位置,并非复制,该对象原来所在位置将不再存在这个对象
>
> 例：参见[[createElement]{.underline}](#htmlcssjs)例程

##### insertBefore

> 语法：父节点.insertBefore(新节点,已有节点)
>
> 功能：在父节点下的已有节点之前添加新的子节点
>
> 注意:该对象是被移动到指定位置,并非复制,该对象原来所在位置将不再存在这个对象

##### replaceChild

> 语法：父节点.replaceChild(新节点,旧节点);
>
> 功能：将父节点下的某个节点替换为新的节点
>
> 注意:该对象是被移动到指定位置,并非复制,该对象原来所在位置将不再存在这个对象

##### removeChild

> 语法：父节点.removeChild(子节点)
>
> 功能：从父节点的子节点中删除指定节点

##### cloneNode

> 语法：节点.cloneNode(是否复制子节点);
>
> 功能：复制节点；复制谁，谁调用该方法
>
> 参数： false：只复制该节点
>
> true：复制该节点及其子节点

### 获取标签对象的方法

#### 通过document对象的方法获取

> 参见：[[getElementById]{.underline}](#getelementbyid)、[[getElementsByName]{.underline}](#getelementsbyname)、[[getElementsByTagName]{.underline}](#getelementsbytagname)方法

#### 通过form的name属性和form表单中标签的name属性获取

> 此方法仅适用于获取form表单中的标签
>
> 为form标签指定name属性，并为form表单中的标签指定name属性，通过如下方法获取form中的标签：

------------------------------------
  **document**.form的name.标签的name
  ------------------------------------

例：

--------------------------------------------------------------------------------------------
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *run*() {\
  **var** ele = **document**.**form1**.**username**;\
  }\
  \</**script**\>\
  \</**head**\>\
  \<**body**\>\
  \<**form name=\"form1\" action=\"\#\" method=\"post\" onsubmit=\"return** *run*()**\"**\>\
  \<**input type=\"text\" name=\"username\"**\>\
  \</**form**\>\
  \</**body**\>

--------------------------------------------------------------------------------------------

### 常用demo

#### 全选全不选

##### 需求

> ![](media/image399.png){width="1.8025612423447068in" height="1.375in"}
>
> 选中第一行的checkbox后，下面的所有checkbox变为选中状态，取消选中第一行的checkbox后，下面所有的checkbox变为非选中状态

##### 实现

-   第一行的checkbox指定id属性，并绑定onclick事件

  -------------------------------------------------------------------------
  \<**input type=\"checkbox\" id=\"main\" onclick=\"***changed*()**\"**\>
  -------------------------------------------------------------------------

-   剩下的checkbox指定相同的name属性

  ---------------------------------------------
  \<**input type=\"checkbox\" name=\"ck\"**\>
  ---------------------------------------------

-   在js中实现changed方法

  ------------------------------------------------------------
  \<**script type=\"text/javascript\"**\>\
  **function** *changed*() {\
  **var** mck = **document**.getElementById(**\"main\"**);\
  **var** flag = mck.**checked**;\
  **var** cks = **document**.getElementsByName(**\"ck\"**);\
  **for**(**var** i=0; i\<cks.**length**; i++){\
  cks\[i\].**checked** = flag;\
  }\
  }\
  \</**script**\>

  ------------------------------------------------------------

#### js中清空select中的option

> 将select下拉框的长度设置为0即可清空select，如果想保留前n项，则设置length为n，则后面的会被清空

+-----------------------------------------------------------+
| **var** city = **document**.getElementById(**\"city\"**); |
|                                                           |
| city.**length** = 1;                                      |
+-----------------------------------------------------------+

# XML

1.  ## XML简介

    1.  简介

> XML就是可扩展标记语言,和html类似
>
> 可扩展:标签是自定义的

2.  XML作用

> 描述有关系的数据

3.  应用

<!-- -->

(1) 作为配置文件

(2) 在系统与系统之间进行数据传输

## XML语法

### 文档声明

#### 写法

--------------------------------------------------
  \<?xml version=*\"1.0\"* encoding=*\"UTF-8\"*?\>
  --------------------------------------------------

> 该格式固定，并且"?xml"为整体，中间不可以有空格

#### 属性

> version：版本，一般为"1.0"，还有"1.1"版本，但是一般不用
>
> encoding：字符集，一般为"UTF-8"
>
> standalone：是否为独立文件，值为yes或no，如果是no可以引入外部文件
>
> 但是不写该属性一样可以引入外部文件，所以该属性可以不写

#### 注意

11. 文档声明必须放在xml文件的第一行第一列

12. 为防止乱码，保存时的编码需要与声明中编码一致

### 元素

1)  #### 语法规范

    59. 开始标签和结束标签的写法必须遵循如下语法：

> 包含标签主体： \<asc\>主体\</asc\>
>
> 不包含标签主体： \<asc/\>

有一些在html中可以省略的部分，在这里不可以省略

60. 不能交叉嵌套

61. 有且仅有1个根节点

#### 命名规范

13. 区分大小写

14. 不能以"xml"开头，无论大小写

<!-- -->

71. ### 属性

    62. 属性是自定义的

    63. 同1个元素上不能出现重复的属性

    64. 属性值只可以使用双引号或单引号

72. ### 注释

> xml注释与html相同：
>
> \<!\-- \--\>

###  转义字符

  特殊字符   替代字符
---------- ----------
  &          &amp;
  \<         &lt;
  \>         &gt;
  "          &quot;
  '          &apos

### CDATA

#### 作用

> CDATA区中的内容无论是代码还是特殊字符，都会被作为纯文本处理

#### 语法

--------------------------
  \<!\[CDATA\[ 内容 \]\]\>
  --------------------------

## 约束

### 简介

> 约束就是使用xml的时候，人为的增加一些规则，如果编写者没有按照约束的规则编写xml文件，即使符合xml语法，也会报错

### DTD约束

1)  #### 编写、引用DTD约束文件步骤

    3.  新建"\*.dtd"约束文件
    
    4.  在第一行第一列写上文档声明：

--------------------------------------------------
  \<?xml version=*\"1.0\"* encoding=*\"UTF-8\"*?\>
  --------------------------------------------------

5.  根据需求将所有需要出现的元素在DTD文件中编写出来，语法如下：

  ----------------------
  \<!ELEMENT元素名称\>
  ----------------------

6.  判断元素是简单元素还是复杂元素

> 有子节点的元素是复杂元素；没有子节点的元素是简单元素

将每个元素加上元素类型：

简单元素：

--------------------------------
  \<!ELEMENT元素名称(\#PCDATA)\>
  --------------------------------

复杂元素：

-------------------------------------------
  \<!ELEMENT元素名称 (子节点,子节点,\...)\>
  -------------------------------------------

> xml中子节点的顺序必须与这里的顺序一致

7.  在xml文件中引用DTD文件

  -----------------------------------------
  \<!DOCTYPE根节点SYSTEM\"DTD文件地址\"\>
  -----------------------------------------

#### DTD于XML关联的3种方式

##### 直接在XML中编写DTD代码

--------------------------------
  \<!DOCTYPE根节点 \[DTD代码\]\>
  --------------------------------

##### 引入本地DTD文件

-----------------------------------------
  \<!DOCTYPE根节点SYSTEM\"DTD文件地址\"\>
  -----------------------------------------

##### 引入网络DTD文件

--------------------------------------------------------
  \<!DOCTYPE根节点PUBLIC\"DTD文件名称\"\"DTD文件地址\"\>
  --------------------------------------------------------

#### DTD语法

##### 元素定义

-   语法：

  ------------------------------
  \<!ELEMENT元素名称元素类型\>
  ------------------------------

-   元素类型：

<!-- -->

-   (\#PCDATA)：只有文本的元素使用该元素类型

-   EMPTY：没有子节点也没有文本的元素使用该类型

-   ANY：任意类型，可以随意出现子节点或文本

-   (子节点,子节点,...)：只有子节点的元素使用该对象

    -   子节点之间使用","隔开：

> 在XML文件中该元素的标签下必须有该元素的所有子节点并且按顺序出现

-   子节点之间使用"\|"隔开：

> 在XML文件中该元素标签下必须有且仅有1个这些子节点中的1个

-   (子节点+)

> 该节点可出现1次或多次

-   (子节点\*)

> 该节点可出现0次或多次

-   (子节点?)

> 该节点可出现0次或1次

例：

![image379.png](media/image400.png){width="4.486111111111111in" height="0.25972222222222224in"}

##### 属性定义

-   语法：

+-----------------------+
| \<!ATTLIST元素名称    |
|                       |
| 属性名1 属性类型 约束 |
|                       |
| 属性名2 属性类型 约束 |
|                       |
| \...                  |
|                       |
| \>                    |
+-----------------------+

-   属性类型

<!-- -->

-   CDATA：文本类型

-   (值1\|值2\|...)：枚举类型，值可以是可选值中的1个

-   ID：代表唯一的值，不能只出现数字

<!-- -->

-   约束

<!-- -->

-   \#REQUIRED：必须的

-   \#IMPLIED：可选的

-   \#FIEXED "值"：固定值

> 该属性在XML中可以不指定，但是写了就必须是固定值

-   "默认值"：指定该字段默认值

##### 实体定义

> 功能：
>
> 就是在DTD文件中给某个内容指定一个别名，再XML文件中就可以通过别名引用这段内容，相当于C语言中的宏定义

语法：\<!ENTITY 别名 "值"\> //在DTD文件中定义别名

&别名; //在XML文件中引用别名

### schema约束

1)  #### schema与DTD区别

    11. schema符合xml语法结构
    
    12. schema可以解析
    
    13. schema对名称空间支持较好
    
    14. schema支持更多的数据类型，用户也可以自定义数据类型

#### 编写引用schema约束文件步骤

15. 新建"\*.xsd"文件

16. 在第1行第1列加入文档声明

  --------------------------------------------------
  \<?xml version=*\"1.0\"* encoding=*\"UTF-8\"*?\>
  --------------------------------------------------

17. 引入名称空间

  ---------------------------------------------------------------------
  \<schemaxmlns=*\"http://www.w3.org/2001/XML\_Schema\"*\>\</schema\>
  ---------------------------------------------------------------------

18. 根据需求编写约束文件

19. 

#### schema语法

1.  ##### 基本规则

    4.  预定义元素和属性

    5.  schema约束文件后缀名为xsd

    6.  schema约束文件只能有1个根节点，名称文schema

## XML编程

### 解析XML

#### 解析技术

> XML解析技术主要有2种：DOM和SAX
>
> 一些公司提供了一些解析器来支持DOM和SAX技术，常用的是：JAXP和Dom4j

1.  ##### DOM和SAX解析区别

    20. DOM解析XML

> 在内存中形成树状结构，并提供如下对象：
>
> Document：代表整个文档
>
> Element：元素
>
> Attr：属性
>
> Text：文本
>
> Node：节点

优点：方便增删改操作

缺点：如果文件过大，容易造成内存溢出

21. SAX解析XML

> 基于事件驱动，边读边解析
>
> 优点：不会产生内存溢出问题
>
> 缺点：不能做增删改操作
>
> （DOM4J会以优化后的方式生成树状结构，减小内存溢出概率，也可以增删改）

##### JAXP和DOM4J区别

-   JAXP

> 使用SAX方式解析，不会生成树状结构，没办法做增删改操作
>
> 想用增删改操作只能选择DOM方式

-   DOM4J

> 使用SAX方式解析，会使用优化后的方式生成树状结构，减小内存溢出概率，也可以做增删改操作

#### JAXP解析XML

##### DOM方式

###### 步骤

1.  解析

    a.  获取DocumentBuilderFactory（解析器工厂）类的对象

    b.  获取DocumentBuilder（解析器）对象

    c.  解析XML文件，返回document对象

2.  执行操作

3.  回写（需要修改XML文件时使用）

    d.  获取TransformerFactory（回写工厂）类的对象

    e.  获取Transformer（回写）类的对象

    f.  调用回写方法进行回写

###### 例程

+-----------------------------------------------------------------------------------------+
| //1.解析XML                                                                             |
|                                                                                         |
| //a)获取DocumentBuilderFactory对象                                                      |
|                                                                                         |
| DocumentBuilderFactory factory = DocumentBuilderFactory.*newInstance*();                |
|                                                                                         |
| //b)获取解析器对象                                                                      |
|                                                                                         |
| DocumentBuilder builder = factory.newDocumentBuilder();                                 |
|                                                                                         |
| //c)解析XML                                                                             |
|                                                                                         |
| Document doc = builder.parse(\"src/demo1.xml\");                                        |
|                                                                                         |
| //2.执行操作                                                                            |
|                                                                                         |
| NodeList list1 = doc.getElementsByTagName(\"作者\"); //根据标签名获取元素集合           |
|                                                                                         |
| **for**(**int**i=0; i\<list1.getLength(); i++)                                          |
|                                                                                         |
| {                                                                                       |
|                                                                                         |
| Node node = list1.item(i);                                                              |
|                                                                                         |
| System.***out***.println(node.getTextContent()); //打印标签文本内容                     |
|                                                                                         |
| }                                                                                       |
|                                                                                         |
| NodeList list2 = doc.getElementsByTagName(\"书\");                                      |
|                                                                                         |
| Node node1 = list2.item(list2.getLength()-1);                                           |
|                                                                                         |
| Element ele = doc.createElement(\"猫\");                                                |
|                                                                                         |
| ele.setTextContent(\"我是TOM\");                                                        |
|                                                                                         |
| node1.appendChild(ele);                                                                 |
|                                                                                         |
| //3.回写                                                                                |
|                                                                                         |
| //a)获取TransformerFactory对象                                                          |
|                                                                                         |
| TransformerFactory tFactory = TransformerFactory.*newInstance*();                       |
|                                                                                         |
| //b)获取Transformer对象                                                                 |
|                                                                                         |
| Transformer transformer = tFactory.newTransformer();                                    |
|                                                                                         |
| //c)回写                                                                                |
|                                                                                         |
| transformer.transform(**new** DOMSource(doc), **new** StreamResult(\"src/demo1.xml\")); |
+-----------------------------------------------------------------------------------------+

#### DOM4J解析XML(SAX方式)

##### 介绍

1.  SAX方式解析XML逻辑性较强,需要先得到根节点,然后一层一层的获取对象,不可以像DOM方式那样直接获取对象

2.  DOM4J底层是用List实现的，所以当要增删某个节点时，可以直接获取其父节点下的子节点的结合，然后像操作List集合那样操作即可

<!-- -->

10. ##### 步骤

    -   下载jar包：dom4j-1.6.1

    -   解压后将dom4j-1.6.1.jar文件添加到WEB工程的"WEBRoot WEB-INF lib"目录下

    -   解析

        -   获取解析器对象

        -   解析XML,返回document对象

    -   操作

        -   获取根节点

        -   由根节点一层一层的找到需要的节点进行操作

    -   回写

        -   创建回写对象

        -   回写文件

        -   关闭流

##### 例程

+--------------------------------------------------------------------------------------+
| //1.解析                                                                             |
|                                                                                      |
| //a)获取解析器对象                                                                   |
|                                                                                      |
| SAXReader reader = **new** SAXReader();                                              |
|                                                                                      |
| //b)解析XML，返回document对象                                                        |
|                                                                                      |
| Document doc = reader.read(\"src/dom4j\_test.xml\");                                 |
|                                                                                      |
| //2.操作                                                                             |
|                                                                                      |
| //a)获取根节点                                                                       |
|                                                                                      |
| Element EleRoot = doc.getRootElement();                                              |
|                                                                                      |
| //b)处理                                                                             |
|                                                                                      |
| List\<Element\>list = [EleRoot.elements(\"书\")]{.underline}; //获取所有书的节点集合 |
|                                                                                      |
| Element book2 = list.get(1); //获取第2本书                                           |
|                                                                                      |
| Element author = book2.element(\"作者\"); //获取作者元素                             |
|                                                                                      |
| System.***out***.println(author.getText()); //打印作者文本内容                       |
|                                                                                      |
| Element cat = book2.addElement(\"猫\"); //添加猫元素                                 |
|                                                                                      |
| cat.setText(\"我是TOM\"); //设置猫元素文本                                           |
|                                                                                      |
| //3.回写                                                                             |
|                                                                                      |
| //a)创建回写对象                                                                     |
|                                                                                      |
| XMLWriter wr = **new** XMLWriter(**new** FileOutputStream(\"src/dom4j\_test.xml\")); |
|                                                                                      |
| //b)回写文件                                                                         |
|                                                                                      |
| wr.write(doc);                                                                       |
|                                                                                      |
| //c)关闭流                                                                           |
|                                                                                      |
| wr.close();                                                                          |
+--------------------------------------------------------------------------------------+

##### 方法

###### XMLWriter

> 功能：创建回写对象
>
> 说明：new的时候有2个参数：

-   out：指定输出流和输出文件路径

-   format：指定输出格式，漂亮格式/压缩格式、字符集等，参见：[[OutputFormat]{.underline}](#htmlcssjs)

###### OutputFormat

> 功能：输出格式：漂亮格式/压缩格式、字符集等
>
> 例：

+----------------------------------------------------------------------+
| OutputFormat format = OutputFormat.*createPrettyPrint*(); //漂亮格式 |
|                                                                      |
| format = OutputFormat.*createCompactFormat*(); //压缩格式            |
|                                                                      |
| format.setEncoding(\"GBK\"); //设置字符集                            |
+----------------------------------------------------------------------+

##### XPATH

###### 作用

> 提供一种写法，方便找到标签

###### 步骤

1.  导入jar包

> 在web工程中导入DOM4J的jar包下的lib目录下的"jaxen-1.1-beta-6.jar"包

2.  解析XML文件，获取document对象

+--------------------------------------------+
| SAXReader sr = **new** SAXReader();        |
|                                            |
| Document doc = sr.read(\"src/myweb.xml\"); |
+--------------------------------------------+

3.  获取节点

> 使用XPATH方式获取节点时，只能通过document对象或Element对象使用如下2个方法获取：

-   selectNodes("XPATH语法") //返回符合XPATH语法的节点的集合

> 返回值：List\<Node\>，泛型为Node的List集合

-   selectSingleNode("XPATH语法") //返回查找到的符合XPATH语法的第1个节点

###### XPATH语法

+------+--------------------------------------------+
| 符号 | 说明                                       |
+======+============================================+
| /    | 1)  放在开始表示根节点                     |
|      |                                            |
|      | 2)  不放在开始表示层级关系                 |
+------+--------------------------------------------+
| //   | 只能放在开始，表时无论是否为根节点         |
+------+--------------------------------------------+
| \*   | 表示该层下的所有子节点                     |
+------+--------------------------------------------+
| \[\] | 表示第几个节点，它不可与"//"一起使用       |
+------+--------------------------------------------+
| @    | 表示属性                                   |
+------+--------------------------------------------+
| =    | 表示相等                                   |
+------+--------------------------------------------+
| ./   | 表示当前结点下的子节点（当前节点的下一层） |
+------+--------------------------------------------+
| .//  | 表示当前节点下的所有节点（无论层级关系）   |
+------+--------------------------------------------+

> **例：**

  语法                 解释                              备注
-------------------- --------------------------------- -----------------------
  /AAA                 获取根节点AAA                     
  /AAA/BBB/CCC         获取AAA节点下BBB节点下的CCC节点   AAA为根节点
  //BBB                获取所有名为BBB的节点             无论层级关系
  //BBB/CCC            获取所有BBB节点下的CCC节点        无论BBB节点在什么位置
  /AAA/\*              获取根节点AAA下的左右子节点       
  /\*/\*/DDD           获取第3层标签名为DDD的所有标签    
  //\*                 获取所有节点                      
  /AAA/BBB\[1\]        获取AAA节点下的第1个BBB节点       AAA为根节点
  /AAA/BBB\[last()\]   获取AAA节点下的最后1个BBB节点     AAA为根节点
  //\@id               返回所有的ID属性                  
  //BBB\[\@id\]        返回所有含有id属性的BBB节点       
  //BBB\[\@id="b1"\]   返回所有id属性值为b1的BBB标签     

# 服务器

## 网络结构

> 网络结构常见的分为2种：

-   C/S

> 介绍：client/server，客户端/服务器
>
> 例子：QQ、快播
>
> 优点：交互性好，服务器压力较小
>
> 缺点：更新需要下载

-   B/S

> 介绍：browser/server，浏览器/服务器
>
> 例子：淘宝、京东
>
> 优点：服务器更新就行
>
> 缺点：服务器压力大

## Tomcat

### Tomcat版本选择

![image380.png](media/image401.png){width="5.760416666666667in" height="2.5555555555555554in"}

> 请根据运行环境选择适当的版本

77. ### 安装

    8.  安装JDK，配置环境变量

    -   先安装JDK，注意路径不要有中文、空格、特殊字符

    -   配置JAVA\_HOME环境变量

> 系统变量中新建环境变量，变量名：JAVA\_HOME；变量值：JDK安装路径

![image381.png](media/image402.png){width="3.7222222222222223in" height="1.5118055555555556in"}

-   配置CLASS\_PATH环境变量

> 用户变量中新建变量，变量名：CLASS\_PATH；变量值：

--------------------------------------------------
  .;%JAVA\_HOME%\\lib;%JAVA\_HOME%\\lib\\tools.jar
  --------------------------------------------------

![image382.png](media/image403.png){width="3.7222222222222223in" height="1.5118055555555556in"}

-   配置path环境变量

> 找到系统变量中的path变量，选中编辑，在最后添上：

---------------------
  ;%JAVA\_HOME%\\bin;
  ---------------------

![image383.png](media/image404.png){width="3.7222222222222223in" height="1.5118055555555556in"}

9.  安装tomcat

> 尽量使用绿色版，现在使用6.0版本：

![image384.png](media/image405.png){width="1.8472222222222223in" height="0.24861111111111112in"}

> 解压后放在某个没有中文、空格、特殊字符的路径下即可

10. 启动停止tomcat

> 启动：运行tomcat目录下的bin目录下的"startup.bat"文件
>
> 启动后的命令行窗口不能关，关了服务器停了
>
> 停止：运行tomcat目录下的bin目录下的"shutdown.bat"文件

### Tomcat目录结构

![image385.png](media/image406.png){width="2.75in" height="2.5208333333333335in"}

-   bin：工具文件夹

-   conf：配置文件

-   lib：服务器运行时使用的jar包

-   logs：tomcat运行期间打印log信息

-   temp： 运行时产生的临时文件

-   webapps：浏览器通过IP端口可访问的根目录就是这个文件夹

-   work：JSP翻译成servlet程序

### 常见启动问题

#### 启动命令行窗口一闪而过

> 环境变量配置不正确，参见：tomcat[[安装]{.underline}](#htmlcssjs)

#### 端口占用

> 问题：
>
> 服务器无法正常启动，logs目录下的日志中显示：

![image386.png](media/image407.png){width="4.819444444444445in" height="0.20069444444444445in"}

> 解决：

a)  结束占用端口应用程序

> cmd命令行输入"netstat -ano"命令查看占用端口的PID，在任务管理器中找到PID相同的应用程序结束进程

b)  修改端口

> 找到"./tomcat/conf/server.xml"文件，修改如下内容中port
>
> 的值来修改端口

![image387.png](media/image408.png){width="3.3055555555555554in" height="0.5416666666666666in"}

### 基础

#### 默认端口

> Tomcat默认端口为8080，输入"IP:端口"即可访问服务器

![image388.png](media/image409.png){width="2.138888888888889in" height="1.4416666666666667in"}

#### 访问网页

> 将html文件或项目放到"./tomcat/webapps/"目录下，即可通过服务器访问该页面
>
> 例：

![image389.png](media/image410.png){width="2.9444444444444446in" height="0.8951388888888889in"}

![image390.png](media/image411.png){width="2.9444444444444446in" height="1.0409722222222222in"}

#### web资源目录结构

webapps下面的每个目录都是1个web资源（项目），每个web资源的目录结构应该遵守如下结构：

![image391.png](media/image412.png){width="3.5555555555555554in" height="1.132638888888889in"}

使用myeclipse开发会自动生成该结构

### Tomcat与Myeclipse2017集成

> Myeclipse中有1个自带的tomcat，但是修改了一些东西，所以使用自己安装的tomcat
>
> windows preferences servers Runtime Environments

![image392.png](media/image413.png){width="3.3194444444444446in" height="2.74375in"}

> 点击Add：

![image393.png](media/image414.png){width="2.7083333333333335in" height="2.9145833333333333in"}

> 选择tomcat服务，勾选"Create a new local server"，点击next

![image394.png](media/image415.png){width="3.4166666666666665in" height="2.888888888888889in"}

> 然后在工具栏即可启动关闭服务器

![image395.png](media/image416.png){width="3.1527777777777777in" height="1.7722222222222221in"}

### 发布项目

#### 步骤

> 点击tomcat图标左边的"Manage Deployments"按钮

![image396.png](media/image417.png){width="2.4027777777777777in" height="1.2791666666666666in"}

在Modle栏选择项目，点击Add

![image397.png](media/image418.png){width="4.861111111111111in" height="2.7270833333333333in"}

选择要发布的服务器，点击finish

![image398.png](media/image419.png){width="3.5694444444444446in" height="3.4569444444444444in"}

到此该项目发布完成，完成后项目中的文件发生任何更改，会自动同步到tomcat的web资源目录下

#### 问题

##### 如果最后一步出现如下内容：

![image399.png](media/image420.png){width="5.111111111111111in" height="0.28055555555555556in"}

> 请检查项目中使用的servlet版本

### 虚拟路径

> Myeclipse2015之后的版本，创建WEB项目时，会自动将项目名称作为这个项目的虚拟路径，并且复制该项目、重命名该项目时，该虚拟路径不会改变。
>
> 该虚拟路径可以在"项目上右键 Properties Deployment Assebly"中的"Web Context Root"设置项中进行查看和更改
>
> 当项目发布时，工程下的WebRoot目录会重命名为虚拟路径的名字后，将该路径下的所有内容复制到Tomcat的Webapps目录下。

### 管理员配置

> 浏览器输入"localhost"访问本机tomcat服务器，进入后点击"Tomcat Manager"弹出登录界面，点击取消，弹出如下界面，提示如何配置管理员密码

![image400.png](media/image421.png){width="5.760416666666667in" height="0.8666666666666667in"}

> 根据提示，打开tomcat目录下的"./conf/tomcat-users.xml"文件，更改为如下内容：

+-----------------------------------------------------------------------+
| \<?xmlversion=*\'1.0\'*encoding=*\'utf-8\'*?\>                        |
|                                                                       |
| \<tomcat-users\>                                                      |
|                                                                       |
| \<rolerolename=*\"manager\"*/\>                                       |
|                                                                       |
| \<userusername=*\"admin\"*password=*\"943397\"*roles=*\"manager\"*/\> |
|                                                                       |
| \</tomcat-users\>                                                     |
+-----------------------------------------------------------------------+

> 管理员用户名为"admin"，密码为"943397"
>
> 设置后，重启服务器，该设置就生效了

### 部署项目3种方式

#### 项目复制到webapps目录下

> 这种方式就是Myeclipse发布项目使用的方式

#### 直接修改tomcat配置文件

> 打开tomcat下的"conf/server.xml"文件，找到Host标签，在Host标签内加入如下内容：

-------------------------------------------------------------------
  \<ContextdocBase=*\"真实路径\"*path=*\"/虚拟路径\"*\>\</Context\>
  -------------------------------------------------------------------

> 如：

-----------------------------------------------------------------
  \<ContextdocBase=*\"D:\\test\"*path=*\"/itcast\"*\>\</Context\>
  -----------------------------------------------------------------

> 重启服务器后，即可通过"http://localhost/itcast/test.html"访问"D:\\test\\test.html"页面了

#### 自己编写1个配置文件（推荐）

-   创建目录

> 在tomcat的conf目录下，创建"/引擎名称/主机名称"的2层目录
>
> 其中：

-   引擎名称

> 就是conf目录下server.xml文件中，Engine标签的name属性的值

-   主机名称

> 就是conf目录下server.xml文件中，Host标签的name属性的值

如现在server.xml文件中：

> Engine标签的name属性为：\<Enginename=*\"Catalina\"*

Host标签的name属性为：\<Hostname=*\"localhost\"*

则创建后的目录为：

D:\\develop\\apache-tomcat-6.0.14\\conf\\Catalina\\localhost

-   编写xml文件

> 在上面创建完的目录下，新建xxx.xml文件，该文件的名字xxx就是该项目的虚拟路径。
>
> xml文件内容：

+------------------------------------------------+
| \<?xmlversion=*\"1.0\"*encoding=*\"UTF-8\"*?\> |
|                                                |
| \<ContextdocBase=*\"真实路径\"*\>\</Context\>  |
+------------------------------------------------+

> 如：编写adc.xml文件，内容为：

+------------------------------------------------+
| \<?xmlversion=*\"1.0\"*encoding=*\"UTF-8\"*?\> |
|                                                |
| \<ContextdocBase=*\"D:\\test\"*\>\</Context\>  |
+------------------------------------------------+

则可以通过"localhost/abc/test.html"访问"D:\\test\\test.html"

### 访问目录时列出目录下的可访问链接

> 修改tomcat/conf/web.xml文件中112行，listings属性的值为true，则可以实现访问地位为目录时，自动列出该目录下的可访问链接

![image401.png](media/image422.png){width="3.7916666666666665in" height="0.34375in"}

## WEB通信原理

### DNS域名解析

#### 域名

> 在http://www.baidu.com这个网址中：

-   http://：这是http协议

-   .baidu.com：这是域名

#### 域名解析过程

> 当访问一个网址时，浏览器会先在本地的Hosts系统文件中寻找这个域名对应的IP地址，如果找到了，会直接使用该IP访问这个网址
>
> 如果在本地找不到对应的IP，会去网络上的DNS域名解析器中寻找该域名对应的IP地址，如果找到了，就使用这个IP访问该网址，如果找不到浏览器会报错

### HTTP协议

#### 简介

> HTTP协议，就是超文本传输协议
>
> 基于TCP链接的传输协议
>
> HTTP协议默认端口是80
>
> 基于请求和响应的模式（先有请求，后有响应）

#### Telnet了解HTTP

##### 开启Telnet功能

> 控制面板 程序 打开和关闭windows功能，勾选Telnet客户端

##### 使用Telnet

-   启动本地服务器

-   cmd窗口输入"telnet localhost 80" ，连接本地服务器

-   输入"ctrl+\]"，出现内容后回车，解决乱码问题

-   输入如下内容，发送1次请求：

+-----------------------------+
| GET /abc/test.html HTTP/1.1 |
|                             |
| host:localhost              |
+-----------------------------+

> 按2次回车

-   接收到响应

+----------------------------------------------+
| HTTP/1.1 200 OK                              |
|                                              |
| Server: Apache-Coyote/1.1                    |
|                                              |
| ETag: W/\"14-1507475148010\"                 |
|                                              |
| Last-Modified: Sun, 08 Oct 2017 15:05:48 GMT |
|                                              |
| Content-Type: text/html                      |
|                                              |
| Content-Length: 14                           |
|                                              |
| Date: Sun, 08 Oct 2017 16:58:03 GMT          |
|                                              |
| \<h1\>HELLO\</h1\>                           |
+----------------------------------------------+

> 其中：除最后一行以外，时请求头，最后一行为请求体

#### 请求

1.  ##### 捕获请求包

    22. 编写提交表单html代码

+------------------------------------------------------------------+
| \<formmethod=*\"get\"*\>                                         |
|                                                                  |
| \<h1\>GET方式提交表单\</h1\>\<br\>                               |
|                                                                  |
| 请输入账号：\<inputtype=*\"text\"*name=*\"userg\"*\>\<br\>       |
|                                                                  |
| 请输入密码：\<inputtype=*\"password\"*name=*\"passwdg\"*\>\<br\> |
|                                                                  |
| \<inputtype=*\"submit\"*value=*\"提交\"*\>\<br\>                 |
|                                                                  |
| \</form\>                                                        |
|                                                                  |
| \<formmethod=*\"post\"*\>                                        |
|                                                                  |
| \<h1\>POST方式提交表单\</h1\>\<br\>                              |
|                                                                  |
| 请输入账号：\<inputtype=*\"text\"*name=*\"userp\"*\>\<br\>       |
|                                                                  |
| 请输入密码：\<inputtype=*\"password\"*name=*\"passwdp\"*\>\<br\> |
|                                                                  |
| \<inputtype=*\"submit\"*value=*\"提交\"*\>\<br\>                 |
|                                                                  |
| \</form\>                                                        |
+------------------------------------------------------------------+

2.  使用IE浏览器打开该网页，按F12，下面选择网络选项卡，点击开始按钮开始捕获

![image402.png](media/image423.png){width="5.760416666666667in" height="0.5034722222222222in"}

3.  使用get方式提交表单后，双击进入第1包数据，捕获到如下信息

![image403.png](media/image424.png){width="5.760416666666667in" height="2.00625in"}

4.  同样方式捕获post方式提交表单，双击进入第1包数据后，取出请求标头和请求正文的内容，捕获到如下信息：

![image404.png](media/image425.png){width="5.760416666666667in" height="2.25625in"}

##### 请求头

> 这里列举重要的请求头

1.  If-Modified-Since：和响应头Last-Modified、状态码304一起控制缓存

2.  Referer

> 功能：记住当前网页来源（从哪个页面跳进来的）
>
> 作用：防盗链；盗链就是别人的页面连接到我的页面，不是从我自己的页面跳转的，参见[[防盗链]{.underline}](#htmlcssjs)

3.  User-Agent：判断当前浏览器版本

#### 响应

##### 捕获响应包

> 捕获请求包时的页面，捕获到请求后，双击进入第1包数据，取出响应标头和响应正文的内容，捕获到如下信息：

![image405.png](media/image426.png){width="5.760416666666667in" height="2.2847222222222223in"}

##### 响应行

> 响应行包含：协议版本、状态码、状态描述

###### 协议版本

> HTTP/1.1

###### 状态码

-   状态码分类：

![image406.png](media/image427.png){width="5.347222222222222in" height="1.604861111111111in"}

-   常用状态码

    -   200：请求成功处理，一切OK

    -   302：请求重定向

    -   304：服务器端资源没有改动，通知客户端查找本地缓存

    -   404：客户端访问资源不存在

    -   500：服务器内部出错

##### 响应头

> 重要响应头

-   Location：和302一起完成重定向

-   Last-Modified:和请求头If-Modified-Since、状态码304一起控制缓存

-   Refresh：完成页面定时跳转

-   Content-Disposition：设置打开方式

-   禁用缓存头:

+-------------------------+
| Expires: -1             |
|                         |
| Cache-Control: no-cache |
|                         |
| Pragma: no-cache        |
+-------------------------+

# MVC

## servlet

1.  ### 简介

    7.  servlet在J2EE中是1个接口，他有3个实现类：FacesServlet、GenaricServlet、HttpServlet，其中，后两个是需要会的

    8.  实现servlet接口需要实现下面5个方法：

![image407.png](media/image428.png){width="4.944444444444445in" height="1.6819444444444445in"}

9.  servlet用来接收和响应从客户端发来的请求

### 原理

> 编写代码实现servlet接口，tomcat接收到请求后在web.xml中寻找该请求对应的class文件，然后通过反射机制调用该类中实现的servlet接口中的方法，来实现接收和响应客户端发来的请求的目的

### 入门程序

#### EditPlus开发

1.  ##### 步骤

    11. 创建WEB项目目录结构

    12. 编写1个类，实现servlet接口，这里不直接实现servlet接口，继承GenericServlet类来间接实现该接口

    13. 设置临时环境变量，导入servlet-api.jar包，该包位于tomcat的lib目录下；临时环境变量仅对当前窗口有效

    14. 编译类，连包带class文件放入".../WEB-INF/classes/"下

    15. 编写web.xml配置文件，配置用户的请求哪个url'时调用该类中的方法

    16. 测试

##### 代码

###### 创建WEB项目目录结构

> 在tomcat/webapps目录下创建如下WEB项目目录结构：

![image408.png](media/image429.png){width="2.7777777777777777in" height="1.4104166666666667in"}

###### 在classes下编写servlet程序

+-----------------------------------------------------------------+
| //定义包结构，连包带class文件都要放在classes目录下              |
|                                                                 |
| **package** cn.servlet;                                         |
|                                                                 |
| //引入servlet包                                                 |
|                                                                 |
| **import** javax.servlet.\*;                                    |
|                                                                 |
| //通过集成GenericServlet避免将servlet接口中全部方法实现         |
|                                                                 |
| **publicclass** HelloServlet **extends** GenericServlet{        |
|                                                                 |
| /\*                                                             |
|                                                                 |
| 实现service方法；                                               |
|                                                                 |
| 该方法用于接收和响应客户端的请求                                |
|                                                                 |
| 参数：                                                          |
|                                                                 |
| req：客户端发来的请求                                           |
|                                                                 |
| res：发给客户端的响应                                           |
|                                                                 |
| \*/                                                             |
|                                                                 |
| **publicvoid** service(ServletRequest req, ServletResponse res) |
|                                                                 |
| **throws** ServletException, java.io.IOException{               |
|                                                                 |
| //向客户端发送响应数据                                          |
|                                                                 |
| res.getWriter().write(\"hello servlet\");                       |
|                                                                 |
| }                                                               |
|                                                                 |
| }                                                               |
+-----------------------------------------------------------------+

###### 设置临时环境变量

-   目标

> 将"servlet-app.jar"文件设置为临时环境变量

-   步骤

> 在该HelloServlet.java所在目录下打开cmd窗口，输入如下内容来设置临时环境变量：
>
> 格式：set classpath=%classpath%;xxxx.jar
>
> 这里：set classpath=%classpath%; D:\\develop\\apache-tomcat-8.5.16\\lib\\servlet-api.jar

###### 编译

> 在上面的cmd窗口中使用如下命令编译HelloServlet.java文件：
>
> javac --d . HelloServlet.java
>
> 其中：
>
> -d：带包编译
>
> .：编译到当前目录

###### 编写web.xml

+-------------------------------------------------------------------------------------------------------------------+
| \<?xmlversion=*\"1.0\"*encoding=*\"ISO-8859-1\"*?\>                                                               |
|                                                                                                                   |
| \<web-appxmlns=*\"http://xmlns.jcp.org/xml/ns/javaee\"*                                                           |
|                                                                                                                   |
| xmlns:xsi=*\"http://www.w3.org/2001/XMLSchema-instance\"*                                                         |
|                                                                                                                   |
| xsi:schemaLocation=*\"http://xmlns.jcp.org/xml/ns/javaee*                                                         |
|                                                                                                                   |
| *http://xmlns.jcp.org/xml/ns/javaee/web-app\_3\_1.xsd\"*                                                          |
|                                                                                                                   |
| version=*\"3.1\"*\>                                                                                               |
|                                                                                                                   |
| \<!\-- [servlet]{.underline}标签，用来告诉服务器[servlet]{.underline}-name对应的[servlet]{.underline}-class \--\> |
|                                                                                                                   |
| \<servlet\>                                                                                                       |
|                                                                                                                   |
| \<!\-- 定义1个[servlet]{.underline}-name，一般与类名相同，必须唯一 \--\>                                          |
|                                                                                                                   |
| \<servlet-name\>HelloServlet\</servlet-name\>                                                                     |
|                                                                                                                   |
| \<!\-- 定义1个[servlet]{.underline}-class，内容为包名和类名 \--\>                                                 |
|                                                                                                                   |
| \<servlet-class\>cn.servlet.HelloServlet\</servlet-class\>                                                        |
|                                                                                                                   |
| \</servlet\>                                                                                                      |
|                                                                                                                   |
| \<!\-- [servlet]{.underline}-mapping标签，用来告诉服务器，[url]{.underline}对应的[servlet]{.underline}-name \--\> |
|                                                                                                                   |
| \<servlet-mapping\>                                                                                               |
|                                                                                                                   |
| \<!\-- 这里的[servlet]{.underline}-name需要[servlet]{.underline}标签内的[servlet]{.underline}-name一一对应 \--\>  |
|                                                                                                                   |
| \<servlet-name\>HelloServlet\</servlet-name\>                                                                     |
|                                                                                                                   |
| \<!\-- 定义客户端发送请求的[url]{.underline} \--\>                                                                |
|                                                                                                                   |
| \<url-pattern\>/hello\</url-pattern\>                                                                             |
|                                                                                                                   |
| \</servlet-mapping\>                                                                                              |
|                                                                                                                   |
| \</web-app\>                                                                                                      |
+-------------------------------------------------------------------------------------------------------------------+

> 服务器接收到请求后，会在web.xml文件中的\<servlet-mapping\>标签内寻找对应的\<url-pattern\>标签，然后找到对应的servlet-name，再根据servlet-name在\<servlet\>标签内找到对应的\<servlet-class\>标签，然后使用该标签的内容找到对应的class文件，使用反射的原理调用该类中实现的servlet接口中的方法，来达到接收和响应请求的目的

###### 测试

> 访问"localhost/servlet01/hello",显示如下界面：

![image409.png](media/image430.png){width="3.1666666666666665in" height="0.6979166666666666in"}

#### Myeclipse开发

1.  ##### 步骤

    -   编写代码（直接实现servlet接口）

    -   编写web.xml配置文件

    -   发布项目

    -   测试

##### 代码

###### 编写代码

> 这里的开发步骤不准确，准确步骤参见：[[MyEclipse开发servlet程序步骤]{.underline}](#htmlcssjs)

1.  新建web工程

> 创建项目时不要直接finishe，一步一步next直到可以选择自动添加web.xml文件

2.  在src下新建包结构和类

![image410.png](media/image431.png){width="1.9722222222222223in" height="0.8347222222222223in"}

3.  新建类，并实现servlet接口

> myeclipse常见工程时自动导入了java.servlet包，所以使用Myeclipse时不需要导包

+----------------------------------------------------------------------+
| **package** cn.itcast.servlet;                                       |
|                                                                      |
| **import** java.io.IOException;                                      |
|                                                                      |
| **import** javax.servlet.\*;                                         |
|                                                                      |
| **publicclass** Servlet01 **implements** Servlet{                    |
|                                                                      |
| **publicvoid** service(ServletRequest arg0, ServletResponse arg1)    |
|                                                                      |
| **throws** ServletException, IOException {                           |
|                                                                      |
| arg1.getWriter().write(\"hello servlet\");                           |
|                                                                      |
| }                                                                    |
|                                                                      |
| **publicvoid** destroy() {                                           |
|                                                                      |
| }                                                                    |
|                                                                      |
| **public** ServletConfig getServletConfig() {                        |
|                                                                      |
| **returnnull**;                                                      |
|                                                                      |
| }                                                                    |
|                                                                      |
| **public** String getServletInfo() {                                 |
|                                                                      |
| **returnnull**;                                                      |
|                                                                      |
| }                                                                    |
|                                                                      |
| **publicvoid** init(ServletConfig arg0) **throws**ServletException { |
|                                                                      |
| }                                                                    |
|                                                                      |
| }                                                                    |
+----------------------------------------------------------------------+

###### 编写web.xml文件

> 找到web.xml文件，右键 Open with Myeclipse XML Editor打开xml文件，删除web-app标签内所有内容重新编写，编写后内容如下：

+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| \<?xmlversion=*\"1.0\"*encoding=*\"UTF-8\"*?\>                                                                                                                                                                                                                         |
|                                                                                                                                                                                                                                                                        |
| \<web-appxmlns:xsi=*\"http://www.w3.org/2001/XMLSchema-instance\"*xmlns=*\"http://xmlns.jcp.org/xml/ns/javaee\"*xsi:schemaLocation=*\"http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app\_3\_1.xsd\"*id=*\"WebApp\_ID\"*version=*\"3.1\"*\> |
|                                                                                                                                                                                                                                                                        |
| \<!\-- [servlet]{.underline}标签，用来告诉服务器[servlet]{.underline}-name对应的[servlet]{.underline}-class \--\>                                                                                                                                                      |
|                                                                                                                                                                                                                                                                        |
| \<servlet\>                                                                                                                                                                                                                                                            |
|                                                                                                                                                                                                                                                                        |
| \<!\-- 定义1个[servlet]{.underline}-name，一般与类名相同，必须唯一 \--\>                                                                                                                                                                                               |
|                                                                                                                                                                                                                                                                        |
| \<servlet-name\>HelloServlet\</servlet-name\>                                                                                                                                                                                                                          |
|                                                                                                                                                                                                                                                                        |
| \<!\-- 定义1个[servlet]{.underline}-class，内容为包名和类名 \--\>                                                                                                                                                                                                      |
|                                                                                                                                                                                                                                                                        |
| \<servlet-class\>cn.servlet.HelloServlet\</servlet-class\>                                                                                                                                                                                                             |
|                                                                                                                                                                                                                                                                        |
| \</servlet\>                                                                                                                                                                                                                                                           |
|                                                                                                                                                                                                                                                                        |
| \<!\-- [servlet]{.underline}-mapping标签，用来告诉服务器，[url]{.underline}对应的[servlet]{.underline}-name \--\>                                                                                                                                                      |
|                                                                                                                                                                                                                                                                        |
| \<servlet-mapping\>                                                                                                                                                                                                                                                    |
|                                                                                                                                                                                                                                                                        |
| \<!\-- 这里的[servlet]{.underline}-name需要[servlet]{.underline}标签内的[servlet]{.underline}-name一一对应 \--\>                                                                                                                                                       |
|                                                                                                                                                                                                                                                                        |
| \<servlet-name\>HelloServlet\</servlet-name\>                                                                                                                                                                                                                          |
|                                                                                                                                                                                                                                                                        |
| \<!\-- 定义客户端发送请求的[url]{.underline} \--\>                                                                                                                                                                                                                     |
|                                                                                                                                                                                                                                                                        |
| \<url-pattern\>/hello\</url-pattern\>                                                                                                                                                                                                                                  |
|                                                                                                                                                                                                                                                                        |
| \</servlet-mapping\>                                                                                                                                                                                                                                                   |
|                                                                                                                                                                                                                                                                        |
| \</web-app\>                                                                                                                                                                                                                                                           |
+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+

###### 发布项目

1.  在server窗中中，选中停掉要使用的tomcat，右击tomcat Add/Remove Deployments来发布项目

2.  展开tomcat，右击刚发布的项目 Publish，将项目同步到tomcat的目录下，如果已同步将没有Publish选项

###### 测试

> 启动tomcat，访问[[http://localhost/servletdemo/servlet01]{.underline}](http://localhost/servletdemo/servlet01)，显示页面如下：

![image411.png](media/image432.png){width="3.513888888888889in" height="0.6354166666666666in"}

#### servlet执行过程

65. 启动tomcat时，服务器会对web.xml进行解析

66. 服务器接到请求后会在web.xml中寻找对应的url，然后找到与之对应的servlet-name，再根据servlet-name找到对应的servlet-class，然后使用该标签的内容找到对应的class文件，使用反射的原理调用该类中实现的servlet接口中的方法，来达到接收和响应请求的目的

### 生命周期

#### 讲解

> servlet生命周期有3步：初始化、服务、销毁

17. 初始化

> 默认当第1次接收到请求时，服务器先创建servlet实例，然后调用init方法进行初始化
>
> 也可以配置为服务器一启动就创建servlet实例，然后执行初始化

18. 服务

> 每次接到请求时，服务器调用server方法

19. 销毁

> 当服务器停止运行前调用destroy方法进行销毁

#### 代码验证

+-------------------------------------------------------------------------+
| **package** cn.itcast.servlet;                                          |
|                                                                         |
| **import** java.io.IOException;                                         |
|                                                                         |
| **import** javax.servlet.\*;                                            |
|                                                                         |
| **publicclass** Servlet02 **implements** Servlet {                      |
|                                                                         |
| **publicvoid** init(ServletConfig config) **throws** ServletException { |
|                                                                         |
| System.***out***.println(\"init\...\");                                 |
|                                                                         |
| }                                                                       |
|                                                                         |
| **publicvoid** service(ServletRequest req, ServletResponse res)         |
|                                                                         |
| **throws** ServletException, IOException {                              |
|                                                                         |
| System.***out***.println(\"service\...\");                              |
|                                                                         |
| }                                                                       |
|                                                                         |
| **publicvoid** destroy() {                                              |
|                                                                         |
| System.***out***.println(\"destroy\...\");                              |
|                                                                         |
| }                                                                       |
|                                                                         |
| **public** ServletConfig getServletConfig() {                           |
|                                                                         |
| **returnnull**;                                                         |
|                                                                         |
| }                                                                       |
|                                                                         |
| **public**String getServletInfo() {                                     |
|                                                                         |
| **returnnull**;                                                         |
|                                                                         |
| }                                                                       |
|                                                                         |
| }                                                                       |
+-------------------------------------------------------------------------+

23. 先将项目发布，并启动服务器

24. 当第一次发送请求时，打印如下：

![image412.png](media/image433.png){width="1.125in" height="0.3020833333333333in"}

> 说明第一次接到请求时创建实例并初始化，初始化之后执行服务函数

25. 再次发送请求时，打印如下：

![image413.png](media/image434.png){width="0.9861111111111112in" height="0.65in"}

> 说明每次接到请求只执行服务函数，不再初始化

26. 当关闭服务器时，打印如下：

![image414.png](media/image435.png){width="1.0416666666666667in" height="0.16666666666666666in"}

> 说明在关闭服务器时执行销毁 函数

91. ### 服务器运行过程

    67. 浏览器向服务器发送请求

    68. 首次请求时创建servlet实例，并执行初始化

> 如何找到servlet类参见[[servlet执行过程]{.underline}](#htmlcssjs)
>
> 在整个服务器中，每个servlet实例只有1个

69. 创建请求对象request和响应对象response

70. 服务器将request和response作为参数调用service方法

71. 执行service方法，向response中写入响应信息

72. 服务器读取response响应信息

73. 服务器向浏览器发送响应

### servlet开发步骤

#### servlet接口、类之间关系

![image415.png](media/image436.png){width="1.2916666666666667in" height="1.9805555555555556in"}

#### 开发步骤

27. 编写1个类，继承HttpServlet类

28. 重写doGet和doPost方法

> 这两个方法在HttpServlet中，service函数会根据请求方式自动选择调用这两个方法，所以重写这两个方法即可

29. 如果需要重写init方法，重写无参的init方法

> 有参数和无参数的init方法均在GenericServlet类中，有参数的init会调用无参数的init方法，所以这里重写无参的init即可

30. 配置web.xml文件

#### MyEclipse开发servlet程序步骤

31. 新建web工程，第一页起完名字直接finishe即可

> 入门程序[[编写代码]{.underline}](#htmlcssjs)中的方式不准确，以此处为准

32. 新建包结构

33. 在包下新建servlet，不是新建class

![image416.png](media/image437.png){width="1.3194444444444444in" height="0.7416666666666667in"}

> 第一页按如下内容输入：

![image417.png](media/image438.png){width="4.111111111111111in" height="2.5569444444444445in"}

> 第2页按如下内容输入：

![image418.png](media/image439.png){width="4.416666666666667in" height="2.0770833333333334in"}

> 此时，web.xml文件自动配置完成，继承HttpServlet的类也自动生成，并自动重新了新建servlet时勾选的方法doGet和doPost

### web.xml配置

#### servlet自动加载

> servlet实例默认在第一次访问时被创建（参见声明周期[[讲解]{.underline}](#htmlcssjs)），也可以配置为启动服务器时创建servlet实例

**方法**：

在web.xml中需要自动加载的servlet标签内加入如下标签：

-----------------------------------------------
  \<load-on-startup\>优先级\</load-on-startup\>
  -----------------------------------------------

其中：

1.  优先级

> 是1个正整数，优先级越小的越先加载，优先级相等的从上到下按顺序加载

**例：**

+-------------------------------------------------------------------+
| \<servlet\>                                                       |
|                                                                   |
| \<servlet-name\>ServletDemo1\</servlet-name\>                     |
|                                                                   |
| \<servlet-class\>cn.itcast.servlet.ServletDemo1\</servlet-class\> |
|                                                                   |
| \<load-on-startup\>1\</load-on-startup\>                          |
|                                                                   |
| \</servlet\>                                                      |
+-------------------------------------------------------------------+

#### servlet映射（访问路径）

> servlet映射又叫虚拟路径访问路径或访问路径
>
> 使用web.xml中的\<servlet-mapping\>标签内的\<url-pattern\>标签进行配置

##### 访问路径的3种配置方式

1)  完全路径匹配

> 以/开头
>
> 例：

---------------------------------------
  \<url-pattern\>/demo5\</url-pattern\>
  ---------------------------------------

> 访问的地址与访问路径必须完全匹配才能找到该servlet

2)  目录匹配

> 以/开头，以/\*结尾
>
> 例：

--------------------------------------------
  \<url-pattern\>/servlet/\*\</url-pattern\>
  --------------------------------------------

访问到".../servlet"或".../servlet/"后面跟上任意内容均可访问

3)  扩展名匹配

> 不能以/开头，就是"\*.xxx"，其中xxx为扩展名，一般为"\*.do"、"\*.action"
>
> 例：

--------------------------------------
  \<url-pattern\>\*.do\</url-pattern\>
  --------------------------------------

> 访问到项目目录后，后面跟上任意内容都可以，只要最后以"\*.do"结尾即可访问

##### 3种配置方式优先级

> 当某个路径可以匹配到web.xml中的多个虚拟路径时，访问优先级最高的方式配置的虚拟路径
>
> 3中配置方式优先级为：
>
> 完全路径匹配 \> 路径匹配 \> 扩展匹配
>
> 当配置方式也相同时，匹配到的是最接近的虚拟路径

**例：**

![image419.png](media/image440.png){width="4.361111111111111in" height="2.40625in"}

##### error页面虚拟路径

> 查看tomcat/config/web.xml文件可见，服务器将访问路径"/"配置为服务器自带的DefaultServlet的访问路径，当服务器发生错误时，自动跳转到这个路径；所以配置访问路径时不要配置为"/"

#### 配置servlet初始化参数

> 在web.xml中，可以配置servlet的初始化参数；这些初始化参数会被服务器创建为ServletConfig对象，在调用servlet接口中的init方法时作为参数传入，详细参见：[[ServletConfig]{.underline}](#htmlcssjs)
>
> 格式为，在servlet标签下加入如下内容：

+-------------------------------------+
| \<init-param\>                      |
|                                     |
| \<param-name\>user\</param-name\>   |
|                                     |
| \<param-value\>root\</param-value\> |
|                                     |
| \</init-param\>                     |
+-------------------------------------+

注意：

8.  1个init-param标签只能有1对name：value标签，多个参数需要放在多个init-param标签内

9.  注意标签顺序，load-on-startup标签应该放在init-param标签后

#### 配置全局初始化参数

> 在web.xml文件中，可以配置全局初始化参数，供所有servlet程序使用，这些参数可以通过[[ServletContext（域对象）]{.underline}](#htmlcssjs)获取
>
> 格式为，在servlet标签外计入如下内容：

+---------------------------------------+
| \<context-param\>                     |
|                                       |
| \<param-name\>encoding\</param-name\> |
|                                       |
| \<param-value\>UTF-8\</param-value\>  |
|                                       |
| \</context-param\>                    |
+---------------------------------------+

注意：

5.  与[[配置servlet初始化参数]{.underline}](#htmlcssjs)相同，1个context-param标签只能有1对name：value标签，多个参数需要放在多个context-param标签内

#### 配置全局错误页面

> 在web.xml中，可以配置服务器出现错误时显示的页面，如果指定了状态码，可以为单独的状态码指定错误页面，如果没有指定状态码，则所有的错误都显示该页面，
>
> 格式为：

--------------------------------------------------
  \<**error-page**\>\
  \<**error-code**\>404\</**error-code**\>\
  \<**location**\>/jsp/error.jsp\</**location**\>\
  \</**error-page**\>

--------------------------------------------------

### web开发中的路径

> 在web开发中，无论是绝对路径还是相对路径，都是基于虚拟路径的

#### 相对路径

某项目的目录结构如下：

![image420.png](media/image441.png){width="1.3194444444444444in" height="1.0694444444444444in"}

根目录下有1.html文件和html文件夹，html文件夹下有2.html文件

某servlet类在web.xml中配置的url为"/demo5"

此时：

> 1.html的访问路径为"localhost/项目名/1.html"

2.html的访问路径为"localhost/项目名/html/2.html"

servlet类访问路径为"localhost/项目名/demo5"

所以：

> 1.html中访问servlet类的相对路径为"./demo5"
>
> 2.html中访问servlet类的相对路径为"../demo5"

#### 绝对路径

34. 前端绝对路径

> 在html、css、js等前端文件中使用绝对路径时，需要从项目名开始写绝对路径，格式"/项目名/......"

例：

访问day09项目下的demo5

相对路径：/day09/demo5

35. 后端绝对路径

> 在后台的代码中使用绝对路径，需要省略项目名

例：

访问day09项目下的demo5

相对路径： /demo5

### HttpServletResponse

> 响应对象，用于向客户端返回内容

#### 重定向

> 重定向是客户端发来1次请求，服务器接到请求之后返回客户端302状态码和重定向的url，然后客户端再向该url发送请求
>
> 重定向与转发区别参见：[[转发与重定向区别]{.underline}](#htmlcssjs)
>
> 重定向需要302状态码和location响应头共同完成
>
> 由于重定向是将新的url发给客户端由客户端向该url发送新的请求，所以url需要带项目名
>
> 例：接到请求重定向到1.html

+--------------------------------------------------------------------------------------------------+
| //设置状态码                                                                                     |
|                                                                                                  |
| response.setStatus(302);                                                                         |
|                                                                                                  |
| //设置location响应头，重定向到servletPrj项目下的1.[html]{.underline}（客户端中虚拟路径带项目名） |
|                                                                                                  |
| response.setHeader(\"location\", \"servletPrj/1.html\");                                         |
+--------------------------------------------------------------------------------------------------+

还有另外1个函数可以实现重定向，相当于上面2步，参见： [[sendRedirect]{.underline}](#sendredirect)

#### 页面定时跳转

##### 不读秒

> 多长时间后跳转到哪个页面，需要用refresh响应头完成
>
> refresh响应头的值的写法为"秒数;url=新地址"
>
> 例：接到请求起5秒后跳转到1.html

----------------------------------------------------------------
  response.setHeader(\"refresh\", \"5;url=/servletPrj/1.html\");
  ----------------------------------------------------------------

此方法相当于设置html文件的如下标签：

--------------------------------------------------------------------------
  \<meta http-equiv=*\"refresh\"* content=*\"5;url=/ServletPrj/2.html\"*\>
  --------------------------------------------------------------------------

该属性也会像[[setContentType]{.underline}](#htmlcssjs)一样，在http协议传输过程中该设置项会体现在http的响应头中

##### 读秒

+-------------------------------------------------------------------------------+
| \<html\>                                                                      |
|                                                                               |
| \<head\>                                                                      |
|                                                                               |
| \<meta http-equiv=*\"Content-Type\"* content=*\"text/html; charset=UTF-8\"*\> |
|                                                                               |
| \<!\-- 直接在页面设置定时跳转 \--\>                                           |
|                                                                               |
| \<meta http-equiv=*\"refresh\"* content=*\"5;url=/ServletPrj/2.html\"*\>      |
|                                                                               |
| \<title\>Insert title here\</title\>                                          |
|                                                                               |
| \</head\>                                                                     |
|                                                                               |
| \<!\-- 加载时运行run函数 \--\>                                                |
|                                                                               |
| \<body onload=\"run()\"\>                                                     |
|                                                                               |
| \<!\-- 通过span的id获取要改变的内容 \--\>                                     |
|                                                                               |
| \<h1\>页面\<span id=*\"sp1\"*\>5\</span\>秒后跳转\</h1\>                      |
|                                                                               |
| \</body\>                                                                     |
|                                                                               |
| \<script type=*\"text/javascript\"*\>                                         |
|                                                                               |
| **var** x = 5;                                                                |
|                                                                               |
| **function** run(){                                                           |
|                                                                               |
| **var** span = document.getElementById(\"sp1\");                              |
|                                                                               |
| span.innerHTML = x;                                                           |
|                                                                               |
| x\--;                                                                         |
|                                                                               |
| window.setTimeout(\"run()\", 1000);                                           |
|                                                                               |
| }                                                                             |
|                                                                               |
| \</script\>                                                                   |
|                                                                               |
| \</html\>                                                                     |
+-------------------------------------------------------------------------------+

#### 控制缓存

> 控制缓存需要Last-Modified:和请求头If-Modified-Since、状态码304一起完成

##### 缓存过程

> ![image421.png](media/image442.png){width="5.760416666666667in" height="3.011111111111111in"}

##### 禁用浏览器缓存

###### 应用

> 该功能多用于网银系统

###### 实现过程

> 禁用浏览器的缓存，与[[缓存过程]{.underline}](#htmlcssjs)介绍的内容没什么关系（不知道为啥），直接设置3个响应头信息即可：

  **头信息**     **值**     **说明**
-------------- ---------- -----------------------------------------------
  Cach-control   no-cache   
  Expires        -1         该头为日期类型，必须使用setDateHeader方法设置
  Progma         no-cache   

###### 例程

+------------------------------------------------------+
| response.setHeader(\"Cache-control\", \"no-cache\"); |
|                                                      |
| response.setDateHeader(\"Expires\", -1);             |
|                                                      |
| response.setHeader(\"Progma\", \"no-cache\");        |
+------------------------------------------------------+

#### 文件下载

1.  ##### 步骤

    20. 设置头信息Content-Disposition的值为attachment;filename=文件名

    21. 将文件读入到输入流FileInputStream

    22. 获取response对象中的输出流OutPutStream

    23. 将输入流内容复制到输出流

##### 例程

+---------------------------------------------------------------------------------+
| //设置头信息                                                                    |
|                                                                                 |
| String path = getServletContext().getRealPath(\"/img/girl.jpg\");               |
|                                                                                 |
| **int** index = path.lastIndexOf(\"\\\\\");                                     |
|                                                                                 |
| String filename = path.substring(index+1);                                      |
|                                                                                 |
| response.setHeader(\"Content-Disposition\", \"attachment;filename=\"+filename); |
|                                                                                 |
| //将文件读入到输入流                                                            |
|                                                                                 |
| FileInputStream [is]{.underline} = **new** FileInputStream(path);               |
|                                                                                 |
| //获取输出流                                                                    |
|                                                                                 |
| OutputStream os = response.getOutputStream();                                   |
|                                                                                 |
| //输入流拷贝到输出流                                                            |
|                                                                                 |
| **int** len;                                                                    |
|                                                                                 |
| **byte**\[\] buff = **new** **byte**\[1024\];                                   |
|                                                                                 |
| **while**((len = is.read(buff))!= -1)                                           |
|                                                                                 |
| os.write(buff,0,len);                                                           |
+---------------------------------------------------------------------------------+

##### 文件名乱码

> 当设置Content-Disposition头信息时，文件名为中文，则会产生乱码问题，此时需要针对不同浏览器分别处理，此处使用视频教程中的方法进行处理，如果开发中个别浏览器出现问题，百度一下该种浏览器的设置方法分类进行处理即可：

-------------------------------------------------------------------------------------------------------
  String agent = request.getHeader(**\"user-agent\"**);\
  **if** (agent.contains(**\"Firefox\"**)) {\
  *//火狐浏览器\
  *BASE64Encoder base64Encoder = **new** BASE64Encoder();\
  filename = **\"=?utf-8?B?\"** + base64Encoder.encode(filename.getBytes(**\"utf-8\"**)) + **\"?=\"**;\
  }\
  **else**{\
  *//其他浏览器\
  *filename = URLEncoder.*encode*(filename,**\"utf-8\"**);\
  }\
  response.setHeader(**\"Content-Disposition\"**, **\"attachment;filename=\"** + filename);

-------------------------------------------------------------------------------------------------------

> 将文件名转为UTF-8编码后再设置到Content-Disposition头信息中即可解决中文名乱码问题。

#### 验证码

1.  ##### 步骤

    24. 获取画布对象,

    25. 获取画笔

    26. 画1个与画布大小相同的有填充色的矩形来画出有颜色的画布

    27. 准备数据,将数据画到画布上

    28. 画干扰线

    29. 将图片输出到客户端

##### 代码

----------------------------------------------------------------------------------------------
  *//获取画布\
  ***int** height = 30;\
  **int** width = 120;\
  BufferedImage img = **new** BufferedImage(width,height,BufferedImage.***TYPE\_INT\_RGB***);\
  *//获取画笔\
  *Graphics2D g = (Graphics2D) img.getGraphics();\
  *//画填充的矩形\
  *g.setColor(Color.***YELLOW***);\
  g.fillRect(0,0,width,height);\
  *//画边框\
  *g.setColor(Color.***BLUE***);\
  g.drawRect(0,0,width-1,height-1);\
  *//画数据\
  *g.setColor(Color.***MAGENTA***);\
  g.setFont(**new** Font(**\"隶书\"**,Font.***BOLD***,20));\
  String data = **\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\"**;\
  Random r = **new** Random();\
  **for** (**int** i = 0; i \< 4; i++) {\
  *//随机-30\~30的角度，计算为弧度，将画笔旋转一定角度画字，来实现字的旋转，\
  // 旋转之后需要将画笔旋转回原来的角度，再画下一个字，否则效果是整行的旋转\
  ***int** jiaodu = r.nextInt(60) - 30;\
  **double** hudu = jiaodu \* Math.***PI*** / 180;\
  g.rotate(hudu,20+i\*20,20);\
  **char** ch = data.charAt(r.nextInt(data.length()));\
  g.drawString(**\"\"**+ch,20+i\*20,20);\
  *//画笔旋转回原来角度\
  *g.rotate(-hudu,20+i\*20,20);\
  }\
  *//画干扰线\
  *g.setColor(Color.***GREEN***);\
  **for** (**int** i = 0; i \< 4; i++) {\
  g.drawLine(r.nextInt(width),r.nextInt(height),r.nextInt(width),r.nextInt(height));\
  }\
  *//输出到页面\
  *ImageIO.*write*(img,**\"jpg\"**,response.getOutputStream());

----------------------------------------------------------------------------------------------

> 效果：

##### 点击刷新验证码

-------------------------------------------------------------------------------------
  \<**body**\>\
  \<**table**\>\
  \<**tr**\>\
  \<**td**\>验证码\</**td**\>\
  \<**td**\>\
  \<**input type=\"text\"**\>\
  \<**img src=\"/Servlet02\" id=\"imgid\" onclick=\"***run*()**\"**\>\
  \</**td**\>\
  \</**tr**\>\
  \</**table**\>\
  \</**body**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *run*() {\
  **var** img=**document**.getElementById(**\"imgid\"**);\
  *\<!\-- 防止取内存中取数据，需要保证每次请求内容不同，在后面加上毫秒时间实现 \--\>\
  *img.**src** = **\"/Servlet02?\"** + **new** Date().getTime();\
  }\
  \</**script**\>

-------------------------------------------------------------------------------------

#### API

##### setContentType

> 功能：设置获取字符和浏览器打开文件时使用的字符编码
>
> 参数：String，代表如何设置字符编码
>
> 说明：
>
> 该方法适用于使用字符流PrintWriter对象（参见[[getWriter]{.underline}](#htmlcssjs)）向页面输出中文时，解决产生乱码的问题
>
> 该方法相当于分别设置获取字符和浏览器打开文件时使用的编码
>
> 例：

-------------------------------------------------------
  response.setContentType(\"text/html;charset=UTF-8\");
  -------------------------------------------------------

> 这一句相当于如下两句：

+----------------------------------------------------------------------+
| //设置获取字符时使用的字符编码                                       |
|                                                                      |
| response.setCharacterEncoding(\"UTF-8\");                            |
|                                                                      |
| //设置打开文件时使用的字符编码                                       |
|                                                                      |
| response.setHeader(\"Content-Type\", \" text/html; charset=UTF-8\"); |
+----------------------------------------------------------------------+

##### setCharacterEncoding

> 功能：设置获取字符流时使用的字符编码
>
> 参数：String：字符编码
>
> 说明：该方法适用于设置获取字符流PrintWriter对象时使用的字符编码

例：

+-------------------------------------------+
| //设置获取字符时使用的字符编码            |
|                                           |
| response.setCharacterEncoding(\"UTF-8\"); |
+-------------------------------------------+

##### getWriter

> 功能：获取字符输出流
>
> 参数：无
>
> 返回值：PrintWriter对象

###### write

> 功能：向客户端输出内容
>
> 参数：String：输出的内容
>
> 返回值：无
>
> 说明：
>
> 如果出现中文乱码，是获取字符流和浏览器打开文件时使用的字符编码不一致造成，参见[[setContentType]{.underline}](#htmlcssjs)
>
> 例：
>
> 向客户端输出"hello"

----------------------------------------
  response.getWriter().write(\"hello\");
  ----------------------------------------

##### getOutputStream

> 功能：获取字节输出流
>
> 参数：无
>
> 返回值：ServletOutputStream对象

###### write

> 功能：向页面输出字节数组
>
> 参数：byte\[\]：输出内容的字节数组
>
> 说明：
>
> 如果出现中文乱码，是获取字节流和浏览器打开文件时使用的字符编码不一致造成，分别对这两个编码进行设置即可

例：

+----------------------------------------------------------------------+
| //使用UTF-8转换成byte数组，相当于设置获取字节流时使用的字符编码      |
|                                                                      |
| **byte**\[\] b = \"中文\".getBytes(\"UTF-8\");                       |
|                                                                      |
| //设置打开文件时使用的字符编码                                       |
|                                                                      |
| response.setHeader(\"Content-Type\", \" text/html; charset=UTF-8\"); |
|                                                                      |
| //向页面输出字节数组                                                 |
|                                                                      |
| response.getOutputStream().write(b);                                 |
+----------------------------------------------------------------------+

##### setStatus

> 功能：设置http协议响应行中的状态码
>
> 参数：int sc：状态码
>
> 返回值：无
>
> 例：

--------------------------
  response.setStatus(302);
  --------------------------

##### setHeader

> 功能：设置响应头（1个key对应1个value）
>
> 参数： String name：哪个响应头
>
> String value：响应头设置的内容

返回值：无

说明：

> 设置的响应头信息，在http传输过程中，会设置到响应头中，浏览器会对应这些信息进行处理；上面这种是使用在servlet中的方法，在html文件中，可以通过设置\<meta\>标签设置这些信息；两者达到的效果是相同的

例：

------------------------------------------------------------------------
  response.setHeader(\"Content-Type\", \" *text/html; charset=UTF-8*\");
  ------------------------------------------------------------------------

在http协议传输过程中该设置项会体现在http的响应头中：

相当于直接在html文件中设置如下标签：

-------------------------------------------------------------------------------
  \<meta http-equiv=*\"Content-Type\"* content=*\"text/html; charset=UTF-8\"*\>
  -------------------------------------------------------------------------------

##### setIntHeader

> 功能：使用int类型的value设置响应头（1个key对应1个value）
>
> 参数： String name：哪个响应头
>
> int value：响应头设置的int类型的值

##### setDateHeader

> 功能：使用date类型的value设置响应头（1个key对应1个value）
>
> 参数： String name：哪个响应头
>
> long value：响应头设置的日期，单位毫秒
>
> 使用时需要先将日期转换为毫秒数，再作为该方法的参数使用

##### addHeader

> 功能：向某个响应头添加value（1个key对应多个value）
>
> 参数： String name：哪个响应头
>
> String value：向响应头添加的内容
>
> 例：

+-------------------------------------+
| response.addHeader(\"aa\", \"bb\"); |
|                                     |
| response.addHeader(\"aa\", \"cc\"); |
+-------------------------------------+

> 此时aa对应2个值：bb和cc

##### addIntHeader

> 功能：向某个响应头添加int类型的value（1个key对应多个value）
>
> 参数： String name：哪个响应头
>
> int value：响应头添加的int类型的值

##### addDateHeader

> 功能：向某个响应头添加date类型的value（1个key对应多个value）
>
> 参数： String name：哪个响应头
>
> long value：响应头添加的日期，单位毫秒
>
> 使用时需要先将日期转换为毫秒数，再作为该方法的参数使用

##### sendRedirect

功能：将客户端发来的请求重定向到另一个url

参数： String location：重定向的url

返回值：无

例：

------------------------------------------------
  response.sendRedirect(\"/ServletPrj/1.html\");
  ------------------------------------------------

##### addCookie

> 功能：向响应头中添加Cookie
>
> 参数：Cookie：Cookie对象
>
> 返回值：无
>
> 说明：如果存在同名cookie则替换，没有则添加
>
> 例：参见：[[入门程序]{.underline}](#htmlcssjs)

### HttpServletRequest

> 请求对象，用户获取用户的请求信息

#### 获取浏览器

> 当后天需要根据不同浏览器进行处理时，需要获取浏览器来分别进行处理

1.  ##### 步骤

    74. 获取请求头User-Agent

    75. 不同浏览器包含不同字符，根据是否包含关键字符判断浏览器版本

##### 代码

+-----------------------------------------------------+
| String browser = request.getHeader(\"User-Agent\"); |
|                                                     |
| **if**(browser.contains(\"Trident \"))              |
|                                                     |
| System.***out***.println(\"我是IE\");               |
|                                                     |
| **else** **if**(browser.contains(\"FireFox\"))      |
|                                                     |
| System.***out***.println(\"我是火狐\");             |
|                                                     |
| **else** **if**(browser.contains(\"Chrome\"))       |
|                                                     |
| System.***out***.println(\"我是Google或360\");      |
+-----------------------------------------------------+

#### 防盗链

> 通过referer请求头判断是从哪个网页跳转过来的，如果不在自己允许的连接之内则认为是盗链

代码：

------------------------------------------------------------
  String refer = request.getHeader(**\"referer\"**);\
  **if**(refer.equals(**\"http://192.168.1.222/1.html\"**))\
  System.***out***.println(**\"从我的网站访问的\"**);\
  **else\
  **System.***out***.println(**\"非法链接跳转过来的\"**);

------------------------------------------------------------

#### 获取参数乱码问题

> 使用[[getParameter]{.underline}](#htmlcssjs)等方法获取参数时，如果参数值为中文时会出现乱码的问题

##### post方式：

> 获取参数前，执行[[setCharacterEncoding]{.underline}](#htmlcssjs)方法将字符编码设置为UTF-8

##### get方式：

> 将参数的值先用"ISO-8859-1"编码解为byte数组，再使用"UTF-8"转为字符串
>
> 例：

--------------------------------------------------------------------------
  String user = request.getParameter(**\"user\"**);\
  user = **new** String(user.getBytes(**\"ISO-8859-1\"**),**\"UTF-8\"**);\
  System.***out***.println(user);

--------------------------------------------------------------------------

#### request域

> request域对象的作用范围是1次请求，并且每次请求对应1个request域对象。接到1次请求后，本次的request域对象就生效了，当执行完响应的代码后，request域对象就失效了。
>
> request域对象可以像[[ServletContext（域对象）]{.underline}](#htmlcssjs)那样使用[[getAttribute]{.underline}](#htmlcssjs)、[[setAttribute]{.underline}](#htmlcssjs)、[[removeAttribute]{.underline}](#htmlcssjs)方法，但是作用范围不同，并且没有体现在web.xml文件中。
>
> request域对象多用于转发中，前面接到请求的servlet程序可以在request域中通过setAtrribute方法设置属性，接到转发的请求的servlet程序或jsp文件可以获得该属性。
>
> request域使用参见[[转发]{.underline}](#htmlcssjs)和[[转发和重定向实现登录验证]{.underline}](#htmlcssjs)

#### 转发

##### 转发

> 转发是1个servlet程序接到1次请求后，在服务器内部直接将请求转发给另1个servlet程序，后面的servlet程序对客户端做出响应
>
> 由于转发是在服务器内部完成，所以新的url不能带项目名

例：

> 访问servlet01，使用request域设置属性name为alan，并转发给servlet02

-----------------------------------------------------------------------------
  request.setAttribute(**\"name\"**,**\"alan\"**);\
  request.getRequestDispatcher(**\"/Servlet02\"**).forward(request,response);

-----------------------------------------------------------------------------

servlet02接到请求后将name属性的值输出给客户端

------------------------------------------------------------
  String name = (String)request.getAttribute(**\"name\"**);\
  response.getWriter().write(name);

------------------------------------------------------------

效果：

##### 转发与重定向区别

36. 请求响应次数

> 重定向：2次请求2次响应
>
> 转发：1次请求，1次响应

37. 地址栏

> 重定向：接到最后1次响应后地址栏显示最后1个servlet的地址
>
> 转发：接到响应后地址栏显示一开始输入的地址

38. url写法

> 重定向：新的url发给客户端由客户端发起新的请求，所有url如果是本服务器内部的地址，需要带项目名
>
> 转发：在服务器内部完成，新的url不能带项目名

39. request域

> 重定向：是2次请求，不能使用request域向后面的servlet传递属性
>
> 转发：1次请求，可以使用request域向后面的servlet传递属性

40. url范围

> 重定向：可以重定向到任何url，比如百度
>
> 转发：只能转发给服务器内部的地址

#### 转发和重定向实现登录验证

> 本功能需要在servlet中使用request域设置属性，并转发给jsp文件，将该属性值显示出来

**代码：**

**login.jsp代码：**

--------------------------------------------------------------------------------------------------
  \<**body**\>\
  *\<!\-- msg为属性名，servlet程序转发到本页面时通过设定msg属性的值来决定这个位置显示的内容 \--\>\
  ***\${**msg**}\
  **\<**form action=\"Servlet01\" method=\"post\"**\>\
  \<**table border=\"1\" width=\"50%\"**\>\
  \<**tr align=\"center\"**\>\
  \<**td**\>账号\</**td**\>\
  \<**td**\>\<**input type=\"text\" name=\"user\"**\>\</**td**\>\
  \</**tr**\>\
  \<**tr align=\"center\"**\>\
  \<**td**\>密码\</**td**\>\
  \<**td**\>\<**input type=\"password\" name=\"passwd\"**\>\</**td**\>\
  \</**tr**\>\
  \<**tr align=\"center\"**\>\
  \<**td colspan=\"2\"**\>\
  \<**input type=\"submit\"**\>\
  \</**td**\>\
  \</**tr**\>\
  \</**table**\>\
  \</**form**\>\
  \</**body**\>

--------------------------------------------------------------------------------------------------

**loginSuccess.html代码：**

--------------------------------
  \<**body**\>\
  \<**h1**\>登录成功\</**h1**\>\
  \</**body**\>

--------------------------------

**servlet01代码：**

------------------------------------------------------------------------------
  String user = request.getParameter(**\"user\"**);\
  String passwd = request.getParameter(**\"passwd\"**);\
  **if**(user.equals(**\"admin\"**) && passwd.equals(**\"admin\"**))\
  response.sendRedirect(**\"/loginSuccess.html\"**);\
  **else\
  **{\
  *//设置msg属性的值并转发给jsp文件，jsp文件就可以根据该属性值显示内容\
  *request.setAttribute(**\"msg\"**,**\"用户名或密码错误\"**);\
  request.getRequestDispatcher(**\"/login.jsp\"**).forward(request,response);\
  }

------------------------------------------------------------------------------

**效果：**

登录前：

登录成功：

登陆失败：

#### API

##### getRemoteAddr

> 功能：获取访问本链接的客户端IP
>
> 参数：无
>
> 返回值：String：IP地址

##### getMethod

> 功能：获取请求方式
>
> 参数：无
>
> 返回值：请求方式（get、post等）

##### getContextPath

> 功能：获取根虚拟路径
>
> 参数：无
>
> 返回值：根虚拟路径
>
> 说明：
>
> 根虚拟路径就是整个项目所在的虚拟路径，就是[[直接修改tomcat配置文件]{.underline}](#htmlcssjs)中讲到的context标签的path属性的值，如果该值为空，则该项目下的所有内容可以直接通过"localhost"进行访问，此时该方法获取的根虚拟路径也为空
>
> 该虚拟路径就使用IDEA配置tomcat时下面的属性值：

##### getHeader

> 功能：获取头信息
>
> 参数：String：头信息名称
>
> 返回值：头信息的值
>
> 例：参见[[获取浏览器]{.underline}](#htmlcssjs)

##### getIntHeader

> 功能：获取头信息的值为int类型的请求头
>
> 参数：String：头信息名称
>
> 返回值：int：头信息的值

##### getDateHeader

> 功能：获取头信息的值为日期类型的请求头
>
> 参数：String：头信息名称
>
> 返回值：long：头信息的值
>
> 说明：使用时返回的是日期的毫秒数，需要转换为日期使用

##### getParameter

> 功能：获取提交的表单中指定参数的值
>
> 参数：String：参数名称
>
> 返回值：String：参数的值
>
> 说明：

-   如果参数不存在，则返回null，如果该参数有多个值则只返回第1个

-   如果页面上表单中的encType属性设置为"multipart/form-data"，则无法通过getParameter相关的方法获取参数了，只能通过[[FileItem类]{.underline}](#fileitem类)获取

##### getParameterValues

> 功能：获取提交表单中指定参数的所有值
>
> 参数：String：参数名称
>
> 返回值：String\[\]：参数的值的数组

##### getParameterMap

> 功能：获取提交的表单中的所有参数的键值对
>
> 参数：无
>
> 返回值：Map\<String,String\[\]\>：以map集合的形式返回所有的参数名称对应的所有参数值
>
> 例：

-------------------------------------------------------------------------
  Map\<String,String\[\]\> param = request.getParameterMap();\
  *//获取所有key\
  *Set\<String\> keys = param.keySet();\
  *//遍历所有key\
  ***for** (String key:keys) {\
  *//获取每个key对应的值\
  *String\[\] values = param.get(key);\
  System.***out***.println(key + **\":\"** + Arrays.*toString*(values));\
  }

-------------------------------------------------------------------------

##### setCharacterEncoding

> 功能：设置请求缓冲区的字符编码
>
> 参数：String：字符编码
>
> 返回值：无
>
> 例：
>
> 设置请求缓冲区字符编码为UTF-8，解决使用post方式提交表单包含中文时存在乱码问题

----------------------------------------------
  request.setCharacterEncoding(**\"UTF-8\"**);
  ----------------------------------------------

##### getCookies

> 功能：获取客户端发来的所有cookie对象
>
> 参数：无
>
> 返回值：此请求中包含的所有 Cookie 的数组，如果该请求没有 cookie，则返回 null
>
> 例：参见：[[入门程序]{.underline}](#htmlcssjs)

##### getSession

> 功能：获取每个浏览器的请求对应的session对象
>
> 参数：无
>
> 返回值：Session ：session对象

##### getRequestURI

> 功能：获取请求路径的中的虚拟根路径及以后的部分
>
> 参数：无
>
> 返回值：字符串
>
> 例：请求全路径为：[[http://localhost/upload/upload.jsp]{.underline}](http://localhost/upload/upload.jsp)
>
> 则使用该函数返回的是/upload/upload.jsp

##### getRequestURL

> 功能：获取请求路径
>
> 参数：无
>
> 返回值：字符串
>
> 例：请求全路径为：[[http://localhost/upload/upload.jsp]{.underline}](http://localhost/upload/upload.jsp)
>
> 则使用该函数返回的就是：[[http://localhost/upload/upload.jsp]{.underline}](http://localhost/upload/upload.jsp)

##### getInputStream

> 功能：获取1个字节流，字节流的内容为请求正文的内容
>
> 参数：无
>
> 返回值：字节输入流
>
> 例：

-----------------------------------------------------
  ServletInputStream is = request.getInputStream();\
  **int** len = -1;\
  **byte**\[\] arr = **new byte**\[1024\];\
  **while** ((len=is.read(arr)) != -1){\
  System.***out***.print(**new** String(arr,0,len));\
  }

-----------------------------------------------------

### ServletConfig

> ServletConfig类用来在调用实现了servlet接口的类中重写的init方法时，作为参数向init方法提供web.xml中的配置信息。
>
> init方法的ServletConfig参数被GenericServlet重写时自动保存在类中了，不重写init（ServletConfig config）方法时，可以直接通过getServletConfig方法拿到自己的ServletConfig对象

#### getServletName

> 功能：获取web.xml文件中对应的servlet下servlet-name标签的内容
>
> 参数：无
>
> 返回值：String
>
> 例：

+------------------------------------------------------------------------+
| ServletConfig config = getServletConfig();                             |
|                                                                        |
| System.***out***.println(\"servlet-name : \"+config.getServletName()); |
+------------------------------------------------------------------------+

#### getInitParameterNames

> 功能：获取web.xml中对应的servlet下所有param-name标签的内容
>
> 参数：无
>
> 返回值：Enumeration，这是1个泛型接口，指定为String类型后，可以通过hasMoreElements方法和nextElelment方法获取所有的param-name
>
> 例：

+----------------------------------------------------------+
| Enumeration\<String\>e = config.getInitParameterNames(); |
|                                                          |
| **while**(e.hasMoreElements())                           |
|                                                          |
| {                                                        |
|                                                          |
| String name = e.nextElement();                           |
|                                                          |
| String value = config.getInitParameter(name);            |
|                                                          |
| System.***out***.println(name + \" : \" + value);        |
|                                                          |
| }                                                        |
+----------------------------------------------------------+

#### getInitParameter

> 功能：获取web.xml中对应的servlet下指定的param-name对应的param-value的内容
>
> 参数：指定的param-name的内容
>
> 返回值：对应的param-value的内容

例：

+---------------------------------------------------+
| String value = config.getInitParameter(\"user\"); |
|                                                   |
| System.***out***.println(\"user : \"+value);      |
+---------------------------------------------------+

### ServletContext（域对象）

1)  #### 定义

    30. 服务器启动时，会为每个WEB应用程序创建1个对应的ServletContext对象，它代表当前的web应用

> 1个服务器下有多个web应用程序，1个web应用程序下有多个servlet程序，而1个ServletContext对象对应1个应用程序，所以1个应用程序下的所有servlet程序共用1个ServletContext对象

31. ServletContext对象可以通过ServletConfig对象的getServletContext方法获取

32. 1个web应用程序下的所有Servlet共用1个ServletContext对象，所以servlet对象之间可以通过ServletContext对象实现通讯

#### 作用

##### 获取全局初始化参数

> 全局初始化参数参见：[[配置全局初始化参数]{.underline}](#htmlcssjs)
>
> 全局初始化参数可以被该web应用程序下所有的servlet获取到
>
> 全局初始化参数获取方法参见[[getInitParameterNames]{.underline}](#getinitparameternames-1)和[[getInitParameter]{.underline}](#getinitparameter-1)

##### 实现数据共享

> 在web.xml中定义1个全局的变量，在该web应用程序下的所有servlet程序都可以使用[[getAttribute]{.underline}](#htmlcssjs)方法获取变量值，[[setAttribute]{.underline}](#htmlcssjs)方法设置变量值，[[removeAttribute]{.underline}](#htmlcssjs)方法删除web.xml中的全局变量

例：统计网站访问次数

在web.xml中定义全局变量count

+------------------------------------+
| \<context-param\>                  |
|                                    |
| \<param-name\>count\</param-name\> |
|                                    |
| \<param-value\>0\</param-value\>   |
|                                    |
| \</context-param\>                 |
+------------------------------------+

servlet程序

+------------------------------------------------------------+
| ServletConfig config = getServletConfig();                 |
|                                                            |
| ServletContext context = config.getServletContext();       |
|                                                            |
| //获取全局参数                                             |
|                                                            |
| Integer count = (Integer)context.getAttribute(\"count\");  |
|                                                            |
| //设置全局参数                                             |
|                                                            |
| context.setAttribute(\"count\", ++count);                  |
|                                                            |
| response.setContentType(\"text/html;charset=UTF-8\");      |
|                                                            |
| response.getWriter().write(\"网站共被访问\"+count+\"次\"); |
+------------------------------------------------------------+

运行结果：

![image423.png](media/image443.png){width="1.5277777777777777in" height="0.39444444444444443in"}

##### 读取资源文件

> 使用ServletContext对象可以根据虚拟路径获取项目下的资源文件

例：

db.properties文件在WebRoot目录下

+-------------------------------------------------------------------------------------+
| **public** **void** doGet(HttpServletRequest request, HttpServletResponse response) |
|                                                                                     |
| **throws** ServletException, IOException {                                          |
|                                                                                     |
| ServletContext context = getServletContext();                                       |
|                                                                                     |
| //1.通过getResourceAsStream直接回去InputStream对象                                  |
|                                                                                     |
| InputStream input1 = context.getResourceAsStream(\"/db.properties\");               |
|                                                                                     |
| read(input1);                                                                       |
|                                                                                     |
| //2.先获取文件的磁盘绝对路径，再获取InputStream对象                                 |
|                                                                                     |
| String path = context.getRealPath(\"/db.properties\");                              |
|                                                                                     |
| InputStream input2 = **new** FileInputStream(path);                                 |
|                                                                                     |
| read(input2);                                                                       |
|                                                                                     |
| }                                                                                   |
|                                                                                     |
| **void** read(InputStream input) **throws** IOException{                            |
|                                                                                     |
| Properties pro = **new** Properties();                                              |
|                                                                                     |
| pro.load(input);                                                                    |
|                                                                                     |
| String username = pro.getProperty(\"username\");                                    |
|                                                                                     |
| String password = pro.getProperty(\"password\");                                    |
|                                                                                     |
| String desc = pro.getProperty(\"desc\");                                            |
|                                                                                     |
| System.***out***.println(\"username = \"+username);                                 |
|                                                                                     |
| System.***out***.println(\"password = \"+password);                                 |
|                                                                                     |
| System.***out***.println(\"desc = \"+desc);                                         |
|                                                                                     |
| }                                                                                   |
+-------------------------------------------------------------------------------------+

#### API

##### 获取ServletContext对象

###### 通过ServletConfig对象获取

> 步骤：

-   先获取ServletConfig对象

-   通过ServletConfig对象的getServletContext方法获取ServletContext对象

> 例：

+--------------------------------------------------------------------+
| ServletConfigconfig = getServletConfig();                          |
|                                                                    |
| ServletContext [context]{.underline} = config.getServletContext(); |
+--------------------------------------------------------------------+

###### 直接获取

-------------------------------------------------------------
  ServletContext [context]{.underline} = getServletContext();
  -------------------------------------------------------------

##### getInitParameterNames

> 功能：获取web.xml中所有全局初始化参数中param-name标签的内容
>
> 参数：无
>
> 返回值：Enumeration，这是1个泛型接口，指定为String类型后，可以通过hasMoreElements方法和nextElelment方法获取所有的param-name
>
> 例：

+-----------------------------------------------------------+
| Enumeration\<String\>e = context.getInitParameterNames(); |
|                                                           |
| **while**(e.hasMoreElements())                            |
|                                                           |
| {                                                         |
|                                                           |
| String name = e.nextElement();                            |
|                                                           |
| String value = config.getInitParameter(name);             |
|                                                           |
| System.***out***.println(name + \" : \" + value);         |
|                                                           |
| }                                                         |
+-----------------------------------------------------------+

##### getInitParameter

> 功能：获取web.xml中全局初始化参数中指定param-name对应的param-value的内容
>
> 参数：指定的param-name的内容
>
> 返回值：对应的param-value的内容

例：

+----------------------------------------------------+
| String value = context.getInitParameter(\"user\"); |
|                                                    |
| System.***out***.println(\"user : \"+value);       |
+----------------------------------------------------+

##### getAttribute

> 功能：获取web.xml中的全局参数
>
> 参数：String；全局参数名称
>
> 返回值：Object；返回指定的全局参数值
>
> 例：参见[[实现数据共享]{.underline}](#htmlcssjs)

##### setAttribute

> 功能：设置web.xml中的全局参数的值
>
> 参数：String；全局参数名称
>
> Object；设置的内容
>
> 返回值：无
>
> 例：参见[[实现数据共享]{.underline}](#htmlcssjs)

##### removeAttribute

> 功能：删除web.xml中的全局参数
>
> 参数：String name：参数名
>
> 返回值：无
>
> 例：删除web.xml文件中的count全局参数

-------------------------------------
  context.removeAttribute(\"count\");
  -------------------------------------

##### getResourceAsStream

功能：通过虚拟路径获取文件输入流

参数：String path：文件的虚拟路径

返回值：该文件的InputSrteam对象

例：参见[[读取资源文件]{.underline}](#htmlcssjs)

##### getRealPath

功能：根据虚拟路径获取文件的绝对磁盘路径

参数：String path：文件的虚拟路径

返回值：String realpath：文件的绝对磁盘路径

> 例：参见[[读取资源文件]{.underline}](#htmlcssjs)

### cookie和session

#### 会话

##### 什么是会话

> 用户打开浏览器，访问多个web资源，关闭浏览器，整个过程为1次会话

#### cookie技术（客户端技术）

##### cookie原理

> 以用户购买手电筒、电视为例：

41. 用户购买1个手电筒，向服务器端发送1次请求，服务器根据请求编cookie并通过响应头将cookie回写到客户端，客户端会将cookie保存下来

42. 用户下次请求同一网站时，比如购买电视机，会将cookie回传给服务器，服务器会重新编写1个cookie回传给客户端

43. 直到用户购买结账，通过cookie内容获取用户要购买的商品，进行结账

##### cookie生命周期

> Cookie在生成时就会被指定一个Expire值，这就是Cookie的生存周期，在这个周期内Cookie有效，超出周期Cookie就会被清除。有些页面将Cookie的生存周期设置为"0"（默认）或负值，这样在关闭页面时（一次会话），就马上清除Cookie，不会记录用户信息，更加安全。

##### cookie的修改

###### cookie的区分

> 两个cookie必须name和path属性均相同，才会被认为是同1个cookie，任意1个不同，都会被认为是2个cookie

###### cookie修改

> 修改1个cookie时，如果之前对path属性进行过设置，必须在这里对path重新设置1次，才能替换掉原来的cookie，否则会出现2个同名的cookie

##### 入门程序

###### 需求

> 通过cookie获取上次访问时间，如果第1次访问显示欢迎，后面每次显示上次访问时间

###### 程序

---------------------------------------------------------------------------------------------------------
  response.setContentType(**\" text/html; charset=UTF-8\"**);\
  *//获取请求中所有Cookie\
  *Cookie\[\] cks = request.getCookies();\
  *//返回Cookie数组为空代表request中没有Cookie\
  ***if**(cks == **null**)\
  response.getWriter().write(**\"欢迎光临1\"**);\
  **else\
  **{\
  *//轮训所有Cookie，找到需要的Cookie则显示上次时间，否则显示欢迎光临\
  ***boolean** flag = **true**;\
  **for** (Cookie ck: cks) {\
  **if**(ck.getName().equals(**\"last\"**))\
  {\
  *//由于Cookie的value中有空格等符号时会显示乱码，需要使用UTF-8进行解码输出\
  *response.getWriter().write(**\"上次访问时间：\"**+ URLDecoder.*decode*(ck.getValue(),**\"UTF-8\"**));\
  flag = **false**;\
  }\
  }\
  **if**(flag)\
  response.getWriter().write(**\"欢迎光临2\"**);\
  }\
  *//创建日期格式化对象\
  *SimpleDateFormat sdf = **new** SimpleDateFormat(**\"yyyy-MM-dd HH:mm:ss\"**);\
  *//得到当前时间格式化后的字符串\
  *String last = sdf.format(**new** Date());\
  *//创建Cookie对象，但是Cookie的value中出现空格等字符时会出问题，所以需要使用UTF-8进行编码\
  *Cookie c = **new** Cookie(**\"last\"**,URLEncoder.*encode*(last,**\"UTF-8\"**));\
  *//向响应对象中添加Cookie\
  *response.addCookie(c);

---------------------------------------------------------------------------------------------------------

##### API

###### 创建Cookie对象

> 语法：

---------------------------------------------------------
  Cookie ck = **new** Cookie(**\"name\"**,**\"value\"**);
  ---------------------------------------------------------

> 注意：
>
> 创建Cookie对象时，value的值建议全部使用"URLEncoder.*encode(String,encodo)*"进行编码，否则Cookie的value中存在空格等字符时会出错

###### getName

> 功能：获取Cookie的name
>
> 参数：无
>
> 返回值：String
>
> 例：参见[[入门程序]{.underline}](#htmlcssjs)

###### getValue

> 功能：获取Cookie的value
>
> 参数：无
>
> 返回值：String
>
> 例：参见[[入门程序]{.underline}](#htmlcssjs)

###### setMaxAge

> 功能：设置有效时间
>
> 参数：
>
> int：有效时间（单位秒），该值为0（默认）或负值时表示该cookie是1个会话级别的cookie，关闭浏览器就失效

返回值 ：无

说明：

> 当需要修改用户浏览器中已有cookie的有效时间时，必须重设该cookie的有效路径，并且必须与原有路径一致。

例：设置cookie有效时间为1小时

--------------------------
  ck.setMaxAge(1\*60\*60);
  --------------------------

###### setPath

> 功能：设置有效路径
>
> 参数：1个文件夹的虚拟路径
>
> 返回值：无
>
> 说明：

10. cookie的有效路径必须为1个文件夹的虚拟路径，不可以是1个servlet等文件的虚拟路径

11. 默认有效路径为添加cookie的servlet所在的文件夹的虚拟路径

> 例：

----------------------------
  ck.setPath(**\"/demo\"**);
  ----------------------------

###### setDomain

> 功能：设置有效域名
>
> 参数：String：域名
>
> 返回值：无
>
> 例：如：
>
> 新浪的域名：[[www.sina.com.cn]{.underline}](http://www.sina.com.cn)
>
> 新浪体育域名：sports.sina.com.cn
>
> 如果想访问这两个域名都带着cookie，需要设置有效域名为".sina.com.cn"，则以该域名结尾的域名都会带着该cookie

-------------------------------------
  ck.setDomain(**\".sina.com.cn\"**);
  -------------------------------------

#### seesion技术（服务器端技术）

##### session原理

以用户购买手电筒、电视为例：

44. 用户购买1个手电筒，向服务器端发送1次请求，服务器根据请求创建1个使用唯一key标识的session空间，并将用户请求的信息存入到session空间内，通过响应头将key回写到客户端，客户端会将key保存下来

45. 用户下次购买电视机，会将key回传给服务器，服务器会将新的请求信息放入到该key指定的session空间内，将该key重新回传给客户端

46. 直到用户购买结账，通过key内容获取用户要购买的商品，进行结账

##### session介绍

> 服务器为每个浏览器创建1个session（会话）对象，注意：1个浏览器独占1个session对象（默认）。
>
> 浏览器访问servlet时，第1次访问是没有session的id的，调用了request对象的getSession方法会自动创建1个session对象，后面的访问会带着id回来，再调用getSession方法会自动找到那个session
>
> 一次会话结束后，服务器端的session还在，不过浏览器依旧丢失了session的key，所以无法找到上个会话中的session
>
> 浏览器禁用了cookie功能，cookie功能和session将都不能使用
>
> session的销毁：

a.  强行关闭服务器

b.  session过期，默认连续30min无操作会过期，该时间可以在tomcat/conf/web.xml中的session-timeout标签中进行配置

c.  主动调用invalidate方法销毁

##### session域对象

47. 范围：1次会话；存个人相关的数据

##### API

###### setAttribute

> 功能：以键值对的形式向session对象中设置内容
>
> 参数： String name：键
>
> Object value：值
>
> 返回值：无

###### getAttribute

> 功能：通过key获取session对象中对应的value
>
> 参数：String name：键
>
> 返回值：Object：值

###### getId

> 功能：获取session的唯一ID
>
> 参数：无
>
> 返回值：String：session的唯一ID

###### invalidate

> 功能：销毁session
>
> 参数：无
>
> 返回值：无

### Listener

#### 介绍

##### Servlet规范中的3种技术

在javaweb规范中定义了3种技术：

-   Servlet：处理客户端请求

-   Listener：事件监听

-   Filter：

##### Javaweb中的监听器及作用

> 主要用于监听javaweb中常用对象（request、session、application）的3种类型操作：

-   对象的创建与销毁

-   对象的属性变化

-   Session绑定javaBean

##### 监听器接口

> Javaweb中的每个常用对象的每种操作都有对应的监听器进行监听，如下面接口：

1.  创建与销毁

    a.  Request对象

> 监听器：ServletRequestListener

b.  Session对象

> 监听器：HttpSessionListener

c.  Application对象

> 监听器：servletContextListener

2.  属性变化

    d.  Request对象

> 监听器：ServletRequestAttributeListener

e.  Session对象

> 监听器：HttpSessionAttributeListener

f.  Application对象

> 监听器：servletContextAttributeListener

3.  session绑定javaBean

    g.  HttpSessionBindingListener

> 这个监听器可以让javaBean对象感知到自己被绑定到session中或从session中移除

h.  HttpSessionActivationListener

> 这个监听器可以让javaBean感知到它被钝化（停止服务器时，session被保存到文件中，session中的javaBean也被保存到文件，这叫钝化）或活化（从文件中恢复）

##### 用途

> 监听器在web主流开发中一般用不到，但是可以用于完成一些性能监视操作。比如session的生命周期设置为多少比较合适，就可以监听一下session一般多长时间销毁，来决定周期设置为多久比较合适。

#### 应用

14. 实现各个监听器的接口

15. 创建与销毁、属性变化的监听器不需要需要在web.xml中进行配置，session绑定JavaBean不需要

##### 属性变化

> 以session为例

1.  编写1个类实现HttpSessionAttributeListener接口

  ---------------------------------------------------------------------------------------
  **public class** MySessionListener **implements** HttpSessionAttributeListener {\
  *//session对象及操作操作可以通过参数完成\
  ***public void** attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {\
  System.***out***.println(**\"添加属性\"**);\
  }\
  **public void** attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {\
  System.***out***.println(**\"修改属性\"**);\
  }\
  **public void** attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {\
  System.***out***.println(**\"移除属性\"**);\
  }\
  }

  ---------------------------------------------------------------------------------------

1.  将该类注册为监听器

  ------------------------------------------------------------------------------------
  \<**listener**\>\
  \<**listener-class**\>cn.itcast.customer.MySessionListener\</**listener-class**\>\
  \</**listener**\>

  ------------------------------------------------------------------------------------

2.  在jsp中进行测试

  --------------------------------------------------------
  **\<%\
  **session.setAttribute(**\"sname\"**,**\"svalue\"**);\
  session.setAttribute(**\"sname\"**,**\"ssss\"**);\
  session.removeAttribute(**\"sname\"**);\
  **%\>**

  --------------------------------------------------------

##### session绑定javaBean

> 不常用，用的时候回头看视频

### Filter

#### 介绍

> Filter也称之为过滤器，它是Servlet技术中最实用的技术，WEB开发人员通过Filter技术，对web服务器管理的所有web资源：例如Jsp, Servlet, 静态图片文件或静态 html 文件等进行拦截，从而实现一些特殊的功能。例如实现URL级别的权限访问控制、过滤敏感词汇、压缩响应信息等一些高级功能
>
> 从技术角度来讲，Filter是1个接口；这个接口中有1个doFilter方法，这是真正进行过滤的方法，Filter需要在web.xml中进行配置

#### 入门程序

1.  ##### 代码

    -   编写类实现Filter接口

---------------------------------------------------------------------------------------------------------------------------------------------------------------
  **public class** demo1 **implements** Filter {\
  **public void** init(FilterConfig filterConfig) **throws** ServletException {\
  }\
  **public void** doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) **throws** IOException, ServletException {\
  *//请求或响应被拦截时调用该函数，需要执行下面方法请求或响应才会被放行，否则被拦截\
  *filterChain.doFilter(servletRequest,servletResponse);\
  }\
  **public void** destroy() {\
  }\
  }

---------------------------------------------------------------------------------------------------------------------------------------------------------------

2.  配置web.xml文件

+---------------------------------------------------------------+
| \<**filter**\>\                                               |
| \<**filter-name**\>demo1\</**filter-name**\>\                 |
| \<**filter-class**\>cn.itcast.demo.demo1\</**filter-class**\> |
|                                                               |
| \<**init-param**\>\                                           |
| \<**param-name**\>encoding\</**param-name**\>\                |
| \<**param-value**\>utf-8\</**param-value**\>\                 |
| \</**init-param**\>\                                          |
| \</**filter**\>\                                              |
| \<**filter-mapping**\>\                                       |
| \<**filter-name**\>demo1\</**filter-name**\>                  |
|                                                               |
| *\<!\-- 需要过滤的路径 \--\>*\                                |
| \<**url-pattern**\>/index.jsp\</**url-pattern**\>\            |
| \</**filter-mapping**\>                                       |
+---------------------------------------------------------------+

##### 原理

> 在web.xml中进行配置，哪个过滤器拦截哪些路径，当发生请求时，请求就会被过滤器拦截到，自动调用该拦截器中的doFilter方法。在doFliter方法中进行处理，如果调用了filterChain.doFilter(servletRequest,servletResponse);方法，请求被放行，否则该请求被拦截。

##### 配置Filter

###### \<url-pattern\>配置方式

> 它有3中配置方式，参见：[[访问路径的3种配置方式]{.underline}](#访问路径的3种配置方式)

###### \<servlet-name\>

-   作用是针对某一个servlet进行拦截，他需要的是servlet的名称

-   使用servlet-name指定需要拦截的servlet时，无法确定拦截顺序

###### \<dispatcher\>

> 设置对哪些请求方式进行拦截，可取值如下：

-   REQUEST //直接请求（默认）

-   FORWARD //转发

-   INCLUDE //通过\<jsp:include page=\"xxx.jsp\" /\>，嵌入进来的页面，每嵌入的一个页面，都会走一次指定的过滤器

-   ERROR //手动配置了ERROR页面时，如果产生错误并转发到错误页面时，就会走一次指定的筛选器

#### 生命周期

1.  创建

> Filter在服务器启动时创建，并自动调用接口中的init方法

2.  拦截

> 每次对该过滤器需要过滤的路径进行访问时，都会调用doFilter方法进行拦截

3.  销毁

> 服务器关闭时对filter进行销毁并自动调用destroy方法

#### Filter链

-   在web应用中，可以使用多个Filter对同一资源进行过滤。这些Filter组合起来称之为1个Filter链

-   Web服务器根据Filter在web.xml中的\<filter-mapping\>的注册顺序，来决定先调用哪个Filter

-   Filter链的执行顺序如图：

> ![](media/image444.png){width="3.4791666666666665in" height="1.8995931758530185in"}

**代码验证**：

16. Filter1

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------
  **public class** Filter1 **implements** Filter {\
  **public void** init(FilterConfig filterConfig) **throws** ServletException {\
  }\
  **public void** doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) **throws** IOException, ServletException {\
  System.***out***.println(**\"Filter1 start\"**);\
  filterChain.doFilter(servletRequest,servletResponse);\
  System.***out***.println(**\"Filter1 end\"**);\
  }\
  **public void** destroy() {\
  }\
  }

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------

17. Filter2

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------
  **public class** Filter2 **implements** Filter {\
  **public void** init(FilterConfig filterConfig) **throws** ServletException {\
  }\
  **public void** doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) **throws** IOException, ServletException {\
  System.***out***.println(**\"Filter2 start\"**);\
  filterChain.doFilter(servletRequest,servletResponse);\
  System.***out***.println(**\"Filter2 end\"**);\
  }\
  **public void** destroy() {\
  }\
  }

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------

18. Servlet

  ---------------------------------------------------------------------------------------------------------------------------------
  \@WebServlet(name = **\"demo1Servlet\"**,urlPatterns = {**\"/demo11\"**})\
  **public class** demo1Servlet **extends** HttpServlet {\
  **protected void** doPost(HttpServletRequest request, HttpServletResponse response) **throws** ServletException, IOException {\
  doGet(request,response);\
  }\
  **protected void** doGet(HttpServletRequest request, HttpServletResponse response) **throws** ServletException, IOException {\
  System.***out***.println(**\"demo11\"**);\
  }\
  }

  ---------------------------------------------------------------------------------------------------------------------------------

19. Web.xml

  --------------------------------------------------------------------
  \<**filter**\>\
  \<**filter-name**\>filter1\</**filter-name**\>\
  \<**filter-class**\>cn.itcast.Filter.Filter1\</**filter-class**\>\
  \</**filter**\>\
  \<**filter-mapping**\>\
  \<**filter-name**\>filter1\</**filter-name**\>\
  \<**url-pattern**\>/demo11\</**url-pattern**\>\
  \</**filter-mapping**\>\
  \<**filter**\>\
  \<**filter-name**\>filter2\</**filter-name**\>\
  \<**filter-class**\>cn.itcast.Filter.Filter2\</**filter-class**\>\
  \</**filter**\>\
  \<**filter-mapping**\>\
  \<**filter-name**\>filter2\</**filter-name**\>\
  \<**url-pattern**\>/demo11\</**url-pattern**\>\
  \</**filter-mapping**\>

  --------------------------------------------------------------------

**运行结果：**

访问demo11的运行结果如下：

![](media/image445.png){width="1.2394280402449693in" height="1.333167104111986in"}

#### FilterConfig

> FilterConfig是init方法的参数，在调用init方法时可以通过FilterConfig参数获取如下内容：

-   获取Filter名称

> 参见[[getFilterName]{.underline}](#getfiltername)

-   获取Filter初始化参数

> 参见[[getInitParameter]{.underline}](#getinitparameter-2)、[[getInitParameterNames]{.underline}](#getinitparameternames-2)

-   获取ServletContext对象

> 参见[[getServletContext]{.underline}](#getservletcontext)

##### getFilterName

> 语法：String getFilterName()
>
> 功能：获取该filter的名称（在web.xml中配置的filter-name属性）
>
> 参数：无
>
> 返回值：String：该filter的名称
>
> 例：

---------------------------------------------------
  String filterName = filterConfig.getFilterName();
  ---------------------------------------------------

##### getInitParameter

> 语法：String getInitParameter(String name)
>
> 功能：获取filter的初始化参数
>
> 参数：name：web.xml中配置的参数名称
>
> 返回值：String：该参数名称对应的参数值
>
> 例：
>
> 在web.xml中配置初始化参数

----------------------------------------------------------------
  \<**filter**\>\
  \<**filter-name**\>demo1\</**filter-name**\>\
  \<**filter-class**\>cn.itcast.demo.demo1\</**filter-class**\>\
  \<**init-param**\>\
  \<**param-name**\>encoding\</**param-name**\>\
  \<**param-value**\>utf-8\</**param-value**\>\
  \</**init-param**\>\
  \</**filter**\>\
  \<**filter-mapping**\>\
  \<**filter-name**\>demo1\</**filter-name**\>\
  *\<!\-- 需要过滤的路径 \--\>\
  *\<**url-pattern**\>/index.jsp\</**url-pattern**\>\
  \</**filter-mapping**\>

----------------------------------------------------------------

> 在init方法中获取encoding参数的值

--------------------------------------------------------------------
  String encoding = filterConfig.getInitParameter(**\"encoding\"**);
  --------------------------------------------------------------------

##### getInitParameterNames

> 语法：Enumeration\<E\> getInitParameterNames()
>
> 功能：获取所有初始化参数的名字
>
> 参数：无
>
> 返回值：Enumeration，这是1个泛型接口，指定为String类型后，可以通过hasMoreElements方法和nextElelment方法获取所有的param-name
>
> 例：

-------------------------------------------------------------------
  Enumeration\<String\> en = filterConfig.getInitParameterNames();\
  **while**(en.hasMoreElements()){\
  System.***out***.println(en.nextElement());\
  }

-------------------------------------------------------------------

##### getServletContext

> 语法：ServletContext getServletContext()
>
> 功能：获取ServletContext对象
>
> 参数：无
>
> 返回值：ServletContext对象
>
> 例：

-------------------------------------------------------
  ServletContext sc = filterConfig.getServletContext();
  -------------------------------------------------------

#### 案例

1.  ##### 禁用jsp页面缓存

    1.  为什么需要禁用

> 为了得到实时信息

2.  怎样禁用jsp页面缓存

<!-- -->

1.  在jsp页面上进行配置

  -----------------------------------------------------------------
  \<**meta http-equiv=\"pragma\" content=\"no-cache\"**\>\
  \<**meta http-equiv=\"cache-control\" content=\"no-cache\"**\>\
  \<**meta http-equiv=\"expires\" content=\"0\"**\>

  -----------------------------------------------------------------

2.  通过Filter控制

    -   Filter代码

-----------------------------------------------------------------------
  HttpServletResponse response = (HttpServletResponse)servletResponse;\
  response.setDateHeader(**\"Expires\"**,-1);\
  response.setHeader(**\"Cache-Control\"**,**\"no-cache\"**);\
  response.setHeader(**\"Pragma\"**,**\"no-cache\"**);

-----------------------------------------------------------------------

-   Web.xml中配置

  -----------------------------------------------
  \<**url-pattern**\>\*.jsp\</**url-pattern**\>
  -----------------------------------------------

##### 设置图片缓存时间

###### 浏览器缓存机制

> 当第一次访问1个带有图片的页面时，会产生2次请求2次响应：

-   先请求页面，响应页面

-   然后请求图片，响应图片

> 此时图片已经被缓存下来。第二次访问时，由于图片已经被缓存下来，只会请求页面，不会请求图片。

###### 设置缓存时间意义

> 对于服务器中不经常变化的文件或静态资源，设置客户端缓存时间可以减少对服务器的请求次数，来提高服务器效率

###### 如何设置图片缓存时间

-   Filter代码

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------
  **public void** doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) **throws** IOException, ServletException {\
  HttpServletResponse response = (HttpServletResponse)servletResponse;\
  response.setDateHeader(**\"Expires\"**,System.*currentTimeMillis*()+60\*60\*24\*10\*1000);\
  filterChain.doFilter(servletRequest,servletResponse);\
  }

  ---------------------------------------------------------------------------------------------------------------------------------------------------------------

-   Web.xml

  --------------------------------------------------------------------
  \<**filter**\>\
  \<**filter-name**\>imgFilter\</**filter-name**\>\
  \<**filter-class**\>cn.itcast.Filter.Filter1\</**filter-class**\>\
  \</**filter**\>\
  \<**filter-mapping**\>\
  \<**filter-name**\>imgFilter\</**filter-name**\>\
  \<**url-pattern**\>\*.bmp\</**url-pattern**\>\
  \</**filter-mapping**\>

  --------------------------------------------------------------------

##### 自动登录

> 代码参见day21工程的autologin，其中几个注意事项如下：

###### 域对象使用

> 用户名密码等用户信息在一次会话中需要存储到session域中，而不能存储到request域中，session域的范围是1次会话，而request域的范围是1次请求，在session中就不用一次回话中的每次请求都进行自动登录了。

###### 不是所有页面都需要自动登录

> 登录界面等就不需要进行自动登录，否则用户无法进行登录操作。该功能需要在filter中通过代码实现

###### 用户名中文

> 如果用户名为中文，则会在如下方面存在乱码问题：

-   请求发送到后台servlet过程

> 在filter中对请求设置utf-8编码：

----------------------------------------------
  request.setCharacterEncoding(**\"utf-8\"**);
  ----------------------------------------------

-   用户信息存储到cookie过程

> 存cookie时对用户名进行编码，取cookie时进行解码
>
> 存：

------------------------------------------------------------------------------------------------------------
  Cookie ck = **new** Cookie(**\"user\"**, URLEncoder.*encode*(username,**\"UTF-8\"**)+**\"::\"**+password);
  ------------------------------------------------------------------------------------------------------------

> 取：

----------------------------------------------
  URLDecoder.*decode*(strs\[0\],**\"UTF-8\"**)
  ----------------------------------------------

###### MD5加密

3.  原理

> **明文 + 密钥 密文**
>
> 基本所有算法都是按如上原理进行加密，但是很多算法都是可逆的（通过密文和密钥可以得到明文），而MD5加密是不可逆的。

4.  Mysql实现

> 可以直接在数据库中使用md5函数对字段进行加密，参见[[md5]{.underline}](#md5)

5.  Java实现

> 下面这段代码会用就可以，不用记，输入明文，输出密文：

--------------------------------------------------------------------------------------
  **public class** md5Util {\
  **public static** String md5(String plainText){\
  **byte**\[\] secreBytes = **null**;\
  **try** {\
  secreBytes = MessageDigest.*getInstance*(**\"md5\"**).digest(plainText.getBytes());\
  } **catch** (NoSuchAlgorithmException e) {\
  e.printStackTrace();\
  }\
  String md5code = **new** BigInteger(1,secreBytes).toString(16);\
  **for** (**int** i = 0; i \<(32-md5code.length()) ; i++) {\
  md5code = **\"0\"** + md5code;\
  }\
  **return** md5code;\
  }\
  }

--------------------------------------------------------------------------------------

##### url级别权限控制

> 这是1中粗粒度权限控制，细粒度权限控制参见[[权限控制案例]{.underline}](#权限控制案例)

###### 需求

url级别权限控制就是对页面进行如下限制：

-   对于没有登录的用户，只可访问登录等页面

-   对于user用户，只可访问部分页面

-   对于admin用户，可以访问所有页面

###### 分析

> 针对每个角色写1个"\*.properties"配置文件，在配置文件中配置该角色可以访问哪些页面。创建1个filter用于权限控制，每次filter初始化时将每种角色可访问的页面读出放在集合内，每个请求过来时根据用户的角色和请求的路径判断是否可以放行。

##### 全局编码过滤器

###### 需求

> 将request对象中的参数内容进行编码过滤，防止出现中文乱码的问题

###### 原理

> 编写1个filter，请求执行servlet之前先执行filter，在filter中对request对象使用装饰的方法进行功能增强。
>
> 转码可以将Map集合中的value中的每个字符串使用getBytes("iso8859-1")使用iso8859-1编码取出，在转换成utf-8再存回。但是已经转换为utf-8的字符串不能再以iso8859-1编码取出进行转换，反而会乱码，所以转换只能执行1次
>
> 增强是指重写父类的getParameter、getParameterValues、getParameterMap方法，由于转换只能执行1次，所以可以在构造方法中进行编码转换，然后将map即可存下，上面3个需要重写的方法在map即可中寻找需要的内容即可。

###### 装饰

> 步骤：

-   装饰类必须与被装饰类实现同1接口或继承同1父类

-   在装饰类中持有1个被装饰对象的引用

-   重写方法，进行功能增强

> 注意：如果父类没有无参的构造方法，子类需要在构造方法第一行显式的调用父类有参数的构造方法，参见[[构造方法]{.underline}](#构造方法)
>
> 这里装饰request对象继承HttpServletRequest接口的实现类HttpServletRequestWrapper进行装饰。

###### 代码实现

####### 装饰类

-----------------------------------------------------------------------------------
  **class** MyRequest **extends** HttpServletRequestWrapper{\
  **private** Map\<String,String\[\]\> **map** = **null**;\
  **public** MyRequest(HttpServletRequest request) {\
  **super**(request);\
  **map** = request.getParameterMap();\
  **if**(**map** == **null**)\
  **return**;\
  **for**(String key:**map**.keySet()){\
  String\[\] strs = **map**.get(key);\
  **for**(**int** i=0; i\<strs.**length**; i++){\
  **try** {\
  strs\[i\] = **new** String(strs\[i\].getBytes(**\"iso8859-1\"**),**\"utf-8\"**);\
  } **catch** (UnsupportedEncodingException e) {\
  e.printStackTrace();\
  }\
  }\
  }\
  }\
  \
  \@Override\
  **public** String getParameter(String name) {\
  **if**(**map** == **null**)\
  **return null**;\
  String\[\] strs = **map**.get(name);\
  **if**((strs == **null**) \|\| (strs.**length** == 0))\
  **return null**;\
  **return** strs\[0\];\
  }\
  \
  \@Override\
  **public** String\[\] getParameterValues(String name) {\
  **if**(**map** == **null**)\
  **return null**;\
  **return map**.get(name);\
  }\
  \
  \@Override\
  **public** Map\<String, String\[\]\> getParameterMap() {\
  **return map**;\
  }\
  }

-----------------------------------------------------------------------------------

####### filter

---------------------------------------------------------------------------------------------------------------------------------------------------------------
  **public void** doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) **throws** IOException, ServletException {\
  HttpServletRequest request = (HttpServletRequest)servletRequest;\
  HttpServletResponse response = (HttpServletResponse)servletResponse;\
  MyRequest myRequest = **new** MyRequest(request);\
  filterChain.doFilter(myRequest,response);\
  }

---------------------------------------------------------------------------------------------------------------------------------------------------------------

### Web.xml中配置Filter、Listener、servlet

1.  在web.xml中配置时，必须按照Filter、Listener、Servlet的顺序进行配置

<!-- -->

3.  初始化参数

> Servlet、Filter可以配置初始化参数；listener没有初始化参数，如果要用，就用servlet的全局初始化参数

### servlet3.0特性

#### 注解替换配置文件

> 使用servlet3.0时，可以使用注解替代web.xml配置文件

##### \@WebServlet

1.  name

    -   属性定义

---------------------------------
  String name() **default \"\"**;
  ---------------------------------

-   作用

> 定义servlet名称，相当于web.xml中的servlet-name标签

2.  value

    -   属性定义

------------------------------------
  String\[\] value() **default** {};
  ------------------------------------

-   作用

> 与urlPatterns属性作用相同，定义servlet的访问路径，相当与web.xml中的url-pattern标签
>
> 该属性不能与urlPatterns属性一起出现
>
> 1个servlet可以定义多个访问路径

3.  urlPatterns

    -   属性定义

------------------------------------------
  String\[\] urlPatterns() **default** {};
  ------------------------------------------

-   作用

> 与value属性作用相同，定义servlet的访问路径，相当与web.xml中的url-pattern标签
>
> 该属性不能与value属性一起出现
>
> 1个servlet可以定义多个访问路径

4.  loadStartup

    -   属性定义

-----------------------------------------
  **int** loadOnStartup() **default** -1;
  -----------------------------------------

-   作用

> 是否在加载servlet时启动该servlet
>
> 相当于load-on-startup标签，参见[[servlet自动加载]{.underline}](#servlet自动加载)

5.  initParams

    -   属性定义

-----------------------------------------------
  WebInitParam\[\] initParams() **default** {};
  -----------------------------------------------

> 该属性的类型为WebInitParam注解的数组

-   作用

> 配置servlet初始化参数，相当与init-param标签，参见[[配置servlet初始化参数]{.underline}](#配置servlet初始化参数)

-   例

  ------------------------------------------------------------------------------------
  \@WebServlet(initParams = {\@WebInitParam(name=**\"user\"**,value = **\"tom\"**)})
  ------------------------------------------------------------------------------------

6.  asyncSupported

    -   属性定义

-------------------------------------------------
  **boolean** asyncSupported() **default false**;
  -------------------------------------------------

-   作用：

> 设置servlet是佛支持异步处理，参见[[异步处理]{.underline}](#异步处理)
>
> true：支持；false：不支持（默认）

-   例：

  -----------------------------------------
  \@WebServlet(asyncSupported = **true**)
  -----------------------------------------

##### \@WebFilter

> 该注解的属性与WebServlet属性差不多

##### \@WebListener

> 该注解属性与WebServlet属性差不多

##### web.xml与注解共存

> web.xml和上述注解可以同时使用，但是web.xml的web-app标签中有1个属性可以设置是否使上述注解失效
>
> metadata-complete：
>
> false：不让上述注解失效
>
> true：设置让上述注解失效

#### 文件上传

> servlet3.0特性只影响服务器端代码，前端代码与[[浏览器端]{.underline}](#浏览器端)相同

##### \@MultipartConfig

> 要在servlet上加上该注解，表示接受multipart/form-data请求
>
> ![](media/image446.png){width="3.377357830271216in" height="0.40681758530183726in"}

##### 如何上传

> 通过request获取Part对象，该对象中保存了上传文件的信息，使用该对象的write方法将文件写入某个位置

----------------------------------------
  *//参数为file组件name属性\
  *Part f = request.getPart(**\"f\"**);\
  f.write(**\"d:/upload/a.txt\"**);

----------------------------------------

##### 问题

###### 获取上传文件名

> 通过Part对象获取Content-Disposition头获取完整文件名在截取需要的文件名

-----------------------------------------------------------------------
  *//获取原路径+文件名\
  *String filename = f.getHeader(**\"Content-Disposition\"**);\
  *//截取文件名\
  *filename = filename.substring(filename.lastIndexOf(**\"\\\\\"**)+1);

-----------------------------------------------------------------------

###### 上传文件名乱码

> 使用post请求乱码解决方案：

----------------------------------------------
  request.setCharacterEncoding(**\"utf-8\"**);
  ----------------------------------------------

###### 多文件上传

> 使用getParts方法获取Part对象

#### 异步处理

##### 定义

> 在开发中，如果需要1个请求的响应时间较长，可以将servlet中做的事进行异步处理，将与响应信息相关联的代码使用传统方式处理，对于可以在后台自动完成的操作单独启动1个线程进行处理
>
> 传统方式servlet不支持在servlet中启动线程

##### 操作

-   允许servlet支持异步

> 在servlet上加上注解：

-----------------------------------------
  \@WebServlet(asyncSupported = **true**)
  -----------------------------------------

-   获取异步上下文对象

> 将异步上下文对象通过新线程类的构造方法传入，在新线程中可以通过异步上下文对象使用request、response对象

-------------------------------------------------
  AsyncContext startAsync = request.startAsync();
  -------------------------------------------------

-   创建线程

> 创建线程有2种方式，这里使用第一种：

-   实现Runable接口，重写run方法，创建参数为异步上下文对象的构造方法

-   继承类

  --------------------------------------------------------
  **class** AsyncThread **implements** Runnable {\
  **private** AsyncContext **startAsync**;\
  **public** AsyncThread(AsyncContext startAsync) {\
  **this**.**startAsync** = startAsync;\
  }\
  \@Override\
  **public void** run() {\
  **try** {\
  Thread.*sleep*(2000);\
  } **catch** (InterruptedException e) {\
  e.printStackTrace();\
  }\
  ServletRequest request = **startAsync**.getRequest();\
  String name = request.getParameter(**\"name\"**);\
  System.***out***.println(name+**\" send end\"**);\
  }\
  }

  --------------------------------------------------------

-   监听异步线程执行完毕，执行清理工作

  -------------------------------------------------------------------------------
  startAsync.addListener(**new** AsyncListener() {\
  **public void** onComplete(AsyncEvent asyncEvent) **throws** IOException {\
  *//执行清理工作\
  *}\
  **public void** onTimeout(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  **public void** onError(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  **public void** onStartAsync(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  });

  -------------------------------------------------------------------------------

-   在传统servlet中执行操作，并启动线程

> 传统servlet中执行需要立即响应的操作，并启动异步线程

-----------------------------------------------------------
  **new** Thread(**new** AsyncThread(startAsync)).start();\
  String name = request.getParameter(**\"name\"**);\
  System.***out***.println(name+**\"send return\"**);

-----------------------------------------------------------

##### 例：

###### 需求

> 模拟接到注册请求后立刻返回响应，并在异步线程中发送邮件验证用户身份。

###### 代码

---------------------------------------------------------------------------------------------------------------------------------
  \@WebServlet(asyncSupported = **true**,urlPatterns = **\"/async\"**)\
  **public class** asynServlet **extends** HttpServlet {\
  **protected void** doPost(HttpServletRequest request, HttpServletResponse response) **throws** ServletException, IOException {\
  doGet(request,response);\
  }\
  \
  **protected void** doGet(HttpServletRequest request, HttpServletResponse response) **throws** ServletException, IOException {\
  AsyncContext startAsync = request.startAsync();\
  startAsync.addListener(**new** AsyncListener() {\
  **public void** onComplete(AsyncEvent asyncEvent) **throws** IOException {\
  *//执行清理工作\
  *}\
  **public void** onTimeout(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  **public void** onError(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  **public void** onStartAsync(AsyncEvent asyncEvent) **throws** IOException {\
  }\
  });\
  **new** Thread(**new** AsyncThread(startAsync)).start();\
  String name = request.getParameter(**\"name\"**);\
  System.***out***.println(name+**\"send return\"**);\
  }\
  }\
  \
  **class** AsyncThread **implements** Runnable {\
  **private** AsyncContext **startAsync**;\
  **public** AsyncThread(AsyncContext startAsync) {\
  **this**.**startAsync** = startAsync;\
  }\
  \@Override\
  **public void** run() {\
  **try** {\
  Thread.*sleep*(2000);\
  } **catch** (InterruptedException e) {\
  e.printStackTrace();\
  }\
  ServletRequest request = **startAsync**.getRequest();\
  String name = request.getParameter(**\"name\"**);\
  System.***out***.println(name+**\" send end\"**);\
  }\
  }

---------------------------------------------------------------------------------------------------------------------------------

###### 注意

> response的输出流（getWriter、getOutputstream），在响应未完全返回时，如果缓冲区未满，不会返回响应
>
> 也就是再异步操作中，如果在传统servlet方法中向前台输出1句话，由于异步线程未退出并且缓冲区没有填满，所以不会立刻向前台返回，所以看到的现象是传统servlet和异步线程汇中向前台输出的内容是一起返回的，如果传统servlet中输出的内容足以将缓冲区填满，则传统servlet中内容会立即返回

### 动态代理

#### 代理模式

##### 作用

1)  屏蔽对真实行为的访问，让程序更加安全

2)  可以对真实行为的调用进行控制

##### 实现步骤

1)  代理类与被代理类实现同一接口或继承同一父类

2)  在代理类中持有被代理类对象

3)  在代理类中用被代理类的行为

##### 案例

###### 王婆代理潘金莲被西门庆勾搭

####### 接口

潘金莲和王婆实现的同一接口：KindWomen

-----------------------------------
  **public interface** KindWomen {\
  **void** throwEye();\
  **void** doSomething();\
  }

-----------------------------------

####### 被代理类

潘金莲实现KindWomen接口

--------------------------------------------------
  **public class** pjl **implements** KindWomen {\
  **public void** throwEye() {\
  System.***out***.println(**\"潘金莲抛媚眼\"**);\
  }\
  **public void** doSomething() {\
  System.***out***.println(**\"潘金莲羞羞\"**);\
  }\
  }

--------------------------------------------------

####### 代理类

王婆实现KindWomen接口

持有被代理类对象

调用被代理类的行为

-------------------------------------------------
  **public class** wp **implements** KindWomen {\
  **private** KindWomen **women**;\
  **public** wp(KindWomen women) {\
  **this**.**women** = women;\
  }\
  **public void** throwEye() {\
  **women**.throwEye();\
  }\
  **public void** doSomething() {\
  **women**.doSomething();\
  }\
  }

-------------------------------------------------

####### 调用

> 西门庆通过王婆让潘金莲抛媚眼

-------------------------------------------------
  **public class** xmq {\
  **public static void** main(String\[\] args) {\
  KindWomen pjl = **new** pjl();\
  wp wp = **new** wp(pjl);\
  wp.throwEye();\
  }\
  }

-------------------------------------------------

#### 动态代理

##### 定义

> 动态代理是在代理模式的基础上发展来的，作用与代理模式相同。
>
> 动态代理不需要代理类，他是一种通用的方法可以对任意类进行代理

##### 实现

动态代理的实现有2种方式：

-   通过jdk中的Proxy类实现

> 这种方式要求被代理类必须实现了接口

-   通过cglib实现

> 任意类均可进行代理

这里讲的是使用Proxy类实现

(1) ###### 原理

    -   调用Proxy类的newProxyInstanse方法获取1个被代理类所实现的接口的对象
    
        1.  调用时将被代理类的相关信息作为参数传入，来决定为哪个类代理
    
        2.  调用时传入1个InvocationHandler接口的实现类对象，并重写这个接口的invoke方法，在该方法中决定是否执行被代理类的真实行为
    
    20. 通过接口对象代理执行被代理类中的方法

###### newProxyInstanse

语法：Object newProxyInstanse(ClassLoader loader,Class\<?\>\[\] interfaces,InvocationHandler h)

功能：

> 通过传入被代理类的相关信息，和1个InvocationHandler接口的实现类对象，获得1个被代理类所实现的接口的对象

参数：

loader：

被代理类的类加载器，通过被代理类的Class对象的getClassLoader方法获得

interfaces：

被代理类所有实现的接口，通过被代理类的Class对象的getInterfaces方法获取

h：

> InvocationHandler接口的实现类的对象，通过代理调用被代理对象中的方法时，会执行这个接口中的invoke方法，在invoke方法中控制对真实行为的访问

返回值：

Object：

> 被代理类所实现的接口的对象
>
> 因为类型为Object，所以需要强转为该接口类型的对象

例：

------------------------------------------------------------------------------------------------
  **final** KindWomen pjl = **new** pjl();\
  KindWomen wp = (KindWomen)Proxy.*newProxyInstance*(pjl.getClass().getClassLoader(),\
  pjl.getClass().getInterfaces(),\
  **new** InvocationHandler() {\
  \@Override\
  **public** Object invoke(Object proxy, Method method, Object\[\] args) **throws** Throwable {\
  **return** method.invoke(pjl, args);\
  }\
  });

------------------------------------------------------------------------------------------------

###### InvovationHandler

> 这是1个接口，这个接口中有1个需要实现的方法
>
> 通过代理调用被代理对象中的方法时，会执行这个接口中的invoke方法

------------------------------------------------------------------------------------------------
  **public** Object invoke(Object proxy, Method method, Object\[\] args) **throws** Throwable {\
  **return** method.invoke(pjl, args);\
  }

------------------------------------------------------------------------------------------------

> method：要被执行的方法
>
> args：该方法的参数列表
>
> 在该方法中执行了method.invoke(pjl,args)，则表示允许对真实行为及进行访问，否则表示不允许。

###### 例

------------------------------------------------------------------------------------------------
  **final** KindWomen pjl = **new** pjl();\
  KindWomen wp = (KindWomen)Proxy.*newProxyInstance*(pjl.getClass().getClassLoader(),\
  pjl.getClass().getInterfaces(),\
  **new** InvocationHandler() {\
  \@Override\
  **public** Object invoke(Object proxy, Method method, Object\[\] args) **throws** Throwable {\
  **return** method.invoke(pjl, args);\
  }\
  });\
  wp.throwEye();

------------------------------------------------------------------------------------------------

#### 权限控制案例

> 代码参见day24-powerControl工程

##### 需求

> 使用动态代理和注解实现细粒度权限控制，之前的[[url级别权限控制]{.underline}](#url级别权限控制)是粗粒度的权限控制。
>
> 在[[自动登录]{.underline}](#自动登录)案例基础上，登陆成功后跳转到book.jsp页面，页面上有add、update、delete、search4个连接，这4个连接都跳转到bookServlet，在数据库中为每个用户分配4个操作中的权限，在程序中，拿到用户的权限和要做的操作需要的权限，来判断是否允许用户执行该操作。操作的权限使用注解实现。

##### 实现

###### 思路

> 正常思路：
>
> servlet根据请求参数判断用户需要执行的操作，然后调用service层中对应的方法执行操作
>
> 动态代理思路：
>
> service层需要进行权限控制的方法通过实现接口的方式实现，在service层之前增加1个类来获取service类的动态代理对象，然后在servlet中根据用户需要执行的操作，使用该动态代理对象执行service层接口中的方法来执行操作。权限的控制在获取动态代理对象时实现。

###### 注意

-   因为service层的类是被代理对象，所以service层的类必须通过实现接口的方法实现，将需要进行权限控制的方法写在接口中。

-   数据库中的表及数据

> users表：

+-------------------------------------------------+
| CREATE TABLE users(                             |
|                                                 |
| id INT PRIMARY KEY AUTO\_INCREMENT,             |
|                                                 |
| username varchar(40),                           |
|                                                 |
| password varchar(40)                            |
|                                                 |
| );                                              |
|                                                 |
| INSERT INTO users values(NULL,\'aaa\',\'111\'); |
|                                                 |
| INSERT INTO users values(NULL,\'bbb\',\'111\'); |
|                                                 |
| INSERT INTO users values(NULL,\'ccc\',\'111\'); |
+-------------------------------------------------+

> privileges表（权限表）：

+---------------------------------------------------+
| CREATE TABLE PRIVILEGES(                          |
|                                                   |
| id int PRIMARY key AUTO\_INCREMENT,               |
|                                                   |
| name varchar(40)                                  |
|                                                   |
| );                                                |
|                                                   |
| INSERT INTO privileges values(null,\'添加图书\'); |
|                                                   |
| INSERT INTO privileges values(null,\'修改图书\'); |
|                                                   |
| INSERT INTO privileges values(null,\'查看图书\'); |
|                                                   |
| INSERT INTO privileges values(null,\'删除图书\'); |
+---------------------------------------------------+

> userprivilege表(中间表):

+--------------------------------------------------------+
| CREATE TABLE userprivilege(                            |
|                                                        |
| user\_id INT,                                          |
|                                                        |
| privilege\_id INT,                                     |
|                                                        |
| FOREIGN KEY (user\_id) REFERENCES users(id),           |
|                                                        |
| FOREIGN KEY (privilege\_id) REFERENCES PRIVILEGES(id), |
|                                                        |
| PRIMARY key(user\_id,privilege\_id)                    |
|                                                        |
| );                                                     |
|                                                        |
| INSERT INTO userprivilege values(1,1);                 |
|                                                        |
| INSERT INTO userprivilege values(1,2);                 |
|                                                        |
| INSERT INTO userprivilege values(1,3);                 |
|                                                        |
| INSERT INTO userprivilege values(2,1);                 |
+--------------------------------------------------------+

-   使用注解标注方法所需权限

> 创建注解：

---------------------------------------------
  \@Retention(RetentionPolicy.***RUNTIME***)\
  \@Target(ElementType.***METHOD***)\
  \@Inherited\
  **public** @**interface** BookInfo {\
  String value();\
  }

---------------------------------------------

> 注解需要标注在接口内的方法上，因为动态代理是通过代理对象调用接口中的方法实现；注解的值必须属于privileges表中的权限：

---------------------------------------------------
  **public interface** BookServiceInterface {\
  \@BookInfo(**\"添加图书\"**)\
  **void** add(User user) **throws** Exception;\
  \@BookInfo(**\"修改图书\"**)\
  **void** update(User user) **throws** Exception;\
  \@BookInfo(**\"删除图书\"**)\
  **void** delete(User user) **throws** Exception;\
  \@BookInfo(**\"查找图书\"**)\
  **void** search(User user) **throws** Exception;\
  }

---------------------------------------------------

> 通过isAnnotationPresent方法判断需要执行的方法是否有注解
>
> 通过getAnnotation方法获取注解，然后通过注解获取注解的属性值

-   权限控制

> 查找数据库中当前用户拥有的权限，与执行方法需要的权限进行对比，进行权限控制

## JSP

### JSP简介

1)  #### 介绍

    12. jsp的全称是"java server pages"，译为java服务器端的页面。
    
    13. jsp可以写HTML+java代码+JSP代码
    
    14. servlet和JSP是运行在服务器端的两种动态资源

#### 作用

> 如果没有JSP，后台输出1个界面必须使用getwriter().write方法一点一点输出，这种方式有如下几种缺点：

12. 开发人员必须十分熟悉java代码

13. 不利于页面调试和维护

14. 很难利用网页设计工具进行页面设计

> JSP可以像html那样写页面，最终翻译成servlet程序，编译后就可以访问，这样自动将页面转换为servlet程序的过程，就可以解决以上的缺点

#### JSP运行原理

> 编写JSP代码 编译器将JSP代码翻译成servlet 编译 访问

### 基础

#### 脚本元素

1.  ##### 3种写法

    15. \<%! %\>：定义类、成员变量、方法（不常用，容易引起线程安全问题）

    16. \<%= %\>：输出语句（输出到页面，不能有分号，翻译成servlet程序在service方法内）;也可用于在html语句中使用\<% %\>中定义的变量

+-------------------------------------------------------+
| **\<%= \"hello\" %\>**                                |
|                                                       |
| **\<%** String path = **\"/demo/1.servlet\"**; **%\>\ |
| **\<**a href=\" \<%=** path **%\> \"**\>\</**a**\>    |
+-------------------------------------------------------+

17. \<% %\>：写语句，定义变量（翻译成servlet后在service方法内）

  ----------------------------------------------------
  *\<!\-- 输出10行10列的表格 \--\>\
  *\<**table border=\"1\" width=\"50%\"**\>\
  **\<% for** (**int** i = 0; i \< 10; i++) { **%\>\
  **\<**tr align=\"center\"**\>\
  **\<% for**(**int** j = 0; j \< 10; j++) { **%\>\
  **\<**td**\>1\</**td**\>\
  **\<%** } **%\>\
  **\</**tr**\>\
  **\<%**} **%\>\
  **\</**table**\>

  ----------------------------------------------------

##### 理解

> 将jsp翻译为servlet程序时，对于没有使用脚本元素标签的内容，直接使用write方法输出到页面；对于使用使用"\<%! %\>"的内容使用print方法输出到页面；对于使用"\<% %\>"的内容，则直接替换到servlet程序中的对应位置
>
> 脚本元素类似于C语言中的宏定义

#### jsp页面注释

> 因为jsp支持html、java、jsp代码，所以jsp页面支持3种注释：

1.  HTML注释：\<!\-- \--\>

> JSP文件中存在，翻译成java文件存在，页面中也存在

2.  JAVA注释：//、/\*\*/、/\*\* \*/

> jsp文件中存在，翻译成java文件存在，页面中不存在

3.  JSP注释：\<%\-- \--%\>

> 只在JSP文件中存在

### JSP指令元素

#### 功能

-   用于只是JSP执行某些步骤

-   用于只是JSP表现特定行为

#### 语法格式

-----------------------------------------
  \<%@ **指令元素 属性名**=**属性值** %\>
  -----------------------------------------

#### 3大指令

##### page

> 设置JSP页面的全局属性，
>
> 只有import可以出现多次，其他的只能出现1次
>
> 新建1个jsp文件后，第一行就是page指令：
>
> ![](media/image447.png){width="5.519444444444445in" height="0.2465277777777778in"}

**属性：**

###### language

> 设置jsp文件允许嵌入的语言，只支持java（不需要改变）

###### extends

> 设置本jsp文件翻译成servlet后的来继承的类，默认继承了一些类，改变后会被替换掉（不需要改变）

###### session

> 默认是true（不需要改变），此时在这里可以直接使用session变量来操作session，如果session属性设为false，则需要通过getSession方法自己获取session了

例：

------------------------------------------------------
  **\<%\
  **session.setAttribute(**\"name\"**,**\"value\"**);\
  **%\>**

------------------------------------------------------

###### import

> 导包，与java中import需用相同，可以使用多次，在IDEA中"Alt+Enter"自动导包
>
> 例：

------------------------------------------------------------------------------------------
  \<%@ **page import**=\"**java.util.ArrayList**\" %\>\
  \<%@ **page import**=\"**java.util.List**\" %\>\
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\<%\
  **List list = **new** ArrayList();\
  **%\>\
  **\</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

###### buffer

> 设置缓冲区大小，默认8k，这个缓冲区就是通过servlet向页面输出内容的缓冲区（不需要修改）

###### autoFlush

> 设置是否自动刷新buffer缓冲区，如果设为true，缓冲区溢出时正常输出，如果设为false，则出现异常（默认true，不需要修改）

###### errorPage

> 指定错误页面，如果页面出现异常时跳转到该错误页面（一般使用[[配置全局错误页面]{.underline}](#配置全局错误页面)，不使用这里的errorPage属性，但是这里的优先级更高）

例：当页面出现异常时，跳转到error.jsp页面

----------------------------------------------
  \<%@**page errorPage**=\"**error.jsp**\" %\>
  ----------------------------------------------

###### isErrorPage

> 设置本页面是否可以使用exception对象，默认为false

例：使用exception对象向页面输出错误信息

-----------------------------------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" **isErrorPage**=\"**true**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  亲，出错了\
  **\<%=** exception.getMessage()**%\>\
  **\</**body**\>\
  \</**html**\>

-----------------------------------------------------------------------------------------------------------------------

######  contentType

> 服务器输出所有内容采用的编码

例：

-----------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>
  -----------------------------------------------------------------------------------------

###### pageEncoding

> JSP翻译成servlet文件时采用的编码

例：

---------------------------------------------
  \<%@**page pageEncoding**=\"**UTF-8**\" %\>
  ---------------------------------------------

###### isELIgnored

> 是否忽略EL表达式，true：忽略EL表达式，jsp中不可以使用EL表达式了，被当做文本输出

例：设为false，可以使用EL表达式

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<%@**page isELIgnored**=\"**false**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\<%\
  **request.setAttribute(**\"name\"**,**\"123\"**);\
  **%\>\
  \${**name**}\
  **\</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

显示效果：

![](media/image448.png){width="3.234027777777778in" height="0.7534722222222222in"}

> 设为true，忽略EL表达式

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<%@**page isELIgnored**=\"**true**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\<%\
  **request.setAttribute(**\"name\"**,**\"123\"**);\
  **%\>\
  \${**name**}\
  **\</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

显示效果：

![](media/image449.png){width="3.532638888888889in" height="0.8180555555555555in"}

##### include

###### 静态包含

> 静态包含就是通过include指令，在生成servlet程序前，将多个jsp文件内的内容替换到指定的位置，最终生成1个servlet程序
>
> 一般，被包含的jsp文件中只保留body标签内的内容和指令，其他内容全部去掉
>
> 语法：

----------------------------------------------------------------
  \<%@**include file**=\"**要包含的文件的地址（静态包含）**\"%\>
  ----------------------------------------------------------------

> 例：head.jsp

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**h3**\>这是网页头\</**h3**\>

------------------------------------------------------------------------------------------

> body.jsp

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**h3**\>这是网页体\</**h3**\>

------------------------------------------------------------------------------------------

> foot.jsp

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**h3**\>这是网页尾\</**h3**\>

------------------------------------------------------------------------------------------

> main.jsp

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  \<%@**include file**=\"**head.jsp**\"%\>\
  \<%@**include file**=\"**body.jsp**\"%\>\
  \<%@**include file**=\"**foot.jsp**\"%\>\
  \</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

> 显示效果：
>
> ![](media/image450.png){width="1.6674781277340331in" height="0.8752471566054243in"}
>
> 查看页面元素结果：
>
> ![](media/image451.png){width="2.540188101487314in" height="2.5974026684164477in"}

###### 动态包含

> 参见[[\<jsp:include\>]{.underline}](#jspinclude)

##### taglib

> 用于在JSP页面中导入标签库，然后使用标签库中的标签编写JSP代码
>
> 标签库需要事先下载，并导入到工程中
>
> 语法：

----------------------------------------------------------------------------
  \<%@**taglib uri**=\"**标签库文件名**\" **prefix**=\"**标签的前缀名**\"%\>
  ----------------------------------------------------------------------------

> 属性：

d.  uri：标签库文件名，标签库文件中的uri标签的内容

e.  prefix：标签的前缀名，标签库文件中short-name标签的内容

> 例：先将标签库导入到工程

--------------------------------------------------------------------------------------
  \<%@**taglib uri**=\"**http://java.sun.com/jsp/jstl/core**\" **prefix**=\"**c**\"%\>
  --------------------------------------------------------------------------------------

### 内置对象

> 内置对象就是在jsp中无需自己定义，可以直接使用的对象

#### request

> 它是用HttpServletRequest类定义的内置对象，方法参见：[[HttpServletRequest]{.underline}](#httpservletrequest)

#### response

> 它是用HttpServletResponse类定义的内置对象，方法参见：[[HttpServletResponse]{.underline}](#httpservletresponse)

#### session

> 它是用HttpSession类定义的内置对象，方法参见：[[seesion技术（服务器端技术）]{.underline}](#seesion技术服务器端技术)

#### application

> 他是用ServletContext类定义的内置对象，方法参见：[[ServletContext（域对象）]{.underline}](#servletcontext域对象)

#### config

> 他是用ServletConfig类定义的内置对象，方法参见：[[ServletConfig]{.underline}](#servletconfig)

#### exception

> 他是用Throwable类定义的内置对象
>
> 这是和异常相关的对象
>
> 使用该对象的前提是page指令的isErrorPage属性需要设为true
>
> 该对象不常用

#### page

> 他是用Object定义的对象，代表当前页面，不常用

#### out

> 他是用JspWriter类定义的对象，用于向页面输出内容
>
> response.getWriter()返回的是PrintWriter对象，该对象输出的内容会直接放到response对象的缓冲区
>
> 而JspWriter对象输出的内容，要先在别的地方进行一下缓存，然后在放到response对象的缓冲区
>
> 然后统一进行输出。所以PrintWriter对象输出的所有内容一定是放在前面的，而JspWriter对象输出的内容一定是放在PrintWriter对象输出内容的后面的

例：分别使用"\<%= %\>"、out内置对象、response.getWriter向页面输出内容

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\<%=\"hello\" %\>\
  \<%**out.print(**\"AAAA\"**); **%\>\
  \<%**response.getWriter().write(**\"BBBB\"**);**%\>\
  **\</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

翻译后的servlet代码

------------------------------------------------------
  out.write(**\"\<html\>\\r\\n\"**);\
  out.write(**\"\<head\>\\r\\n\"**);\
  out.write(**\" \<title\>Title\</title\>\\r\\n\"**);\
  out.write(**\"\</head\>\\r\\n\"**);\
  out.write(**\"\<body\>\\r\\n\"**);\
  out.print(**\"hello\"** );\
  out.write(**\'\\r\'**);\
  out.write(**\'\\n\'**);\
  out.print(**\"AAAA\"**);\
  out.write(**\'\\r\'**);\
  out.write(**\'\\n\'**);\
  response.getWriter().write(**\"BBBB\"**);\
  out.write(**\"\\r\\n\"**);\
  out.write(**\"\</body\>\\r\\n\"**);\
  out.write(**\"\</html\>\\r\\n\"**);

------------------------------------------------------

可见，\<%= %\>也是使用out对象进行输出

但是这里在执行时分为2步：

f.  将JspWriter对象输出的内容先放到别的缓冲区

> 将PrintWriter对象输出的内容直接放到response对象的缓冲区

g.  将别的缓冲区内的内容放到response对象的缓冲区

> 所以最终呈现的效果如下：
>
> ![](media/image452.png){width="1.6625in" height="0.3638888888888889in"}
>
> 查看页面元素的代码如下：
>
> ![](media/image453.png){width="1.7402777777777778in" height="1.9868055555555555in"}

#### pageContext

1.  这是1个域对象，代表当前页面

<!-- -->

a.  可以在自己的域中存取值

b.  可以向其他的域中存取值：

> setAttribute(String name, Object value, int scope)
>
> getAttribute(String name, int scope)
>
> 其中scope参数用于指定存取的域，可取值如下：
>
> APPLICATION\_SCOPE
>
> PAGE\_SCOPE
>
> REQUEST\_SCOPE
>
> SESSION\_SCOPE
>
> 例：

---------------------------------------------------------------------------------------
  pageContext.setAttribute(**\"name\"**,**\"meimei\"**);\
  *//等效于\
  *pageContext.setAttribute(**\"name\"**,**\"meimei\"**,pageContext.***PAGE\_SCOPE***);

---------------------------------------------------------------------------------------

c.  查找域中的属性

> findAttribute（String name）
>
> 该函数用于查找域中的属性，如果多个域中存在相同的属性，则返回最小的域的该属性，

2.  可以获取其他的8个对象

> 用于编写框架或通用性较高的代码

### JSP动态标签

#### \<jsp:forward\>

> 在jsp页面中完成转发，使用服务器端路径
>
> 属性：

15. page：要转发的页面，使用服务器端路径

> 例：

------------------------------------------------------------
  \<**jsp:forward page=\"error.jsp\"**\>\</**jsp:forward**\>
  ------------------------------------------------------------

#### \<jsp:param\>

> 它和\<jsp:include\>、\<jsp:forward\>、\<jsp:plugin\>一起使用，用来传递参数
>
> 属性：

1.  name：参数名

2.  value：参数值

> 例：与\<jsp:forward\>一起使用，向error.jsp页面传递参数

---------------------------------------------------------------------
  \<**jsp:forward page=\"error.jsp\"**\>\
  \<**jsp:param name=\"name\" value=\"meimei\"**\>\</**jsp:param**\>\
  \</**jsp:forward**\>

---------------------------------------------------------------------

> 在error.jsp中获取属性

----------------------------------------------------------------
  **\<%** out.print(request.getParameter(**\"name\"**)); **%\>**
  ----------------------------------------------------------------

#### \<jsp:include\>

> 动态包含，静态包含参见[[静态包含]{.underline}](#静态包含)
>
> 动态包含的原理：
>
> 1个jsp文件中包含多个jsp文件时，当该文件被访问时，该文件和被动态包含的jsp文件每个都会被翻译成独立的servlet程序并且被编译，最后将编译后的结果按顺序复制到一起显示出来
>
> 与静态包含相同，被包含的jsp文件中只保留body标签内的内容和指令，其他内容全部去掉，并且最后查看页面元素的代码也是完全相同的
>
> 例：这是依旧使用静态包含里的head.jsp、body.jsp、foot.jsp
>
> main.jsp内容如下:

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  \<**jsp:include page=\"head.jsp\"**\>\</**jsp:include**\>\
  \<**jsp:include page=\"body.jsp\"**\>\</**jsp:include**\>\
  \<**jsp:include page=\"foot.jsp\"**\>\</**jsp:include**\>\
  \
  \</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

> 显示效果：
>
> ![](media/image454.png){width="1.2597222222222222in" height="1.2986111111111112in"}
>
> 查看页面元素
>
> ![](media/image455.png){width="1.792361111111111in" height="3.2729166666666667in"}

#### \<jsp:useBean\>

jsp中使用javaBean时，使用该标签为在本jsp文件中需要使用的javaBean类指定1个id，后面使用动态标签设置获取数据时，需要使用该ID进行操作

属性：

1.  id：为该类起1个id名称

2.  class：javaBean类的全路径

例：参见[[动态标签封装数据]{.underline}](#动态标签)

#### \<jsp:setProperty\>

jsp中使用javaBean时，使用该标签将接收到的表单参数设置到1个javaBean对象中

属性：

1.  name：使用\<jsp:useBean\>标签指定的id

2.  property：要设置的属性名，可以一一进行设置，也可以使用"\*"将所有表单参数中与javaBean中属性名相同的属性进行设置

例：参见[[动态标签封装数据]{.underline}](#动态标签)

#### \<jsp:getProperty\>

jsp中使用javaBean时，使用该标签从封装后的javaBean对象中获取属性并打印到页面中

属性：

1.  name：使用\<jsp:useBean\>标签指定的id

2.  property：要获取的属性名，1次只能获取1个

例：参见[[动态标签封装数据]{.underline}](#动态标签)

### EL表达式

> 语法：\${表达式}

##### 获取域对象中的内容

1.  当多个域中存在相同的属性时，需要指定获取哪个域中的属性，如果不指定，会先从最小的域开始找，

> 例：获取pageContext域中的name属性

----------------------------
  **\${**pageScope.name**}**
  ----------------------------

2.  EL表达式可以设置为被忽略状态，此时的EL表达式将会被作为字符串输出到页面，参见[[isELIgnored]{.underline}](#iselignored)

3.  如果属性名中包含".-\\"等特殊字符，需要使用如下方法获取

  --------------------------------------------------------------
  **\<%\
  **request.setAttribute(**\"upload.msg\"**,**\"success\"**);\
  **%\>\
  \${**requestScope\[**\"upload.msg\"**\]**}**

  --------------------------------------------------------------

###### 获取域中属性的值

> 例：参见[[转发和重定向实现登录验证]{.underline}](#htmlcssjs)

###### 获取域中的数组的值

---------------------------------------------------
  **\<%\
  **String\[\] args = {**\"妹妹\"**,**\"哥哥\"**};\
  request.setAttribute(**\"args\"**,args);\
  **%\>\
  \${**args\[0\]**}**

---------------------------------------------------

###### 获取域中List集合的值

---------------------------------------------------------
  **\<%\
  **List\<String\> list = **new** ArrayList\<String\>();\
  list.add(**\"美美\"**);\
  list.add(**\"波波\"**);\
  request.setAttribute(**\"list\"**,list);\
  **%\>\
  \${**list\[1\]**}**

---------------------------------------------------------

###### 获取域中MAP集合的值

-------------------------------------------------------------------
  **\<%\
  **Map\<String,String\> map = **new** HashMap\<String,String\>();\
  map.put(**\"aa\"**,**\"东东\"**);\
  map.put(**\"bb\"**,**\"嘻嘻\"**);\
  request.setAttribute(**\"map\"**,map);\
  **%\>\
  \${**map.aa**}**

-------------------------------------------------------------------

当map集合中的key含有".-\\"等特殊字符时，需要使用如下方法获取

----------------------------------
  **\${**map\[**\"cc.dd\"**\]**}**
  ----------------------------------

###### 获取域中集合中javaBean对象的属性值

----------------------------------------------------------------------------------
  **\<%\
  ***//User是1个javaBean类\
  *List\<User\> ulist = **new** ArrayList\<User\>();\
  *//User类的有参构造方法是给user和passwd属性赋值\
  *ulist.add(**new** User(**\"强强\"**,**\"茶茶\"**));\
  ulist.add(**new** User(**\"云云\"**,**\"阿里\"**));\
  request.setAttribute(**\"ulist\"**,ulist);\
  **%\>\
  ***\<!\-- 先通过下标获取集合中的javaBean对象，再通过.获取对象中的属性的值 \--\>\
  ***\${**ulist\[1\].user**}**

----------------------------------------------------------------------------------

###### 获取域中javaBean中的集合

-------------------------------------------------------------
  **\<%\
  **List\<fileBean\> list = **new** ArrayList\<fileBean\>();\
  pageInfoBean info = **new** pageInfoBean();\
  info.setPageItems(list);\
  request.setAttribute(**\"info\"**,info);\
  **%\>\
  \${**info.pageItems**}**

-------------------------------------------------------------

> 注意：

-   **\${**requestScope\[**\"upload.msg\"**\]**}**

> 这种形式获取属性值时，引号中的特殊字符".-\\"等都会被当作普通字符处理，不会认为存在上下级关系，所以如果1个属性的名字就是"A.B"，而不是A下有个属性B时，可以使用这种形式获取属性值

-   但是在这里，"info.pageItems"表示的是info下有个子属性叫做pageItems，存在上下级关系，所以在这里绝对不能使用上面这种方式获取属性值，只能使用**\${**info.pageItems**}**的形式

-   如果使用的是**\${**info.pageItems**}**的形式，则如果设置info的属性名时，包含了特殊字符，则没办法当作普通名处理，所以设置info的属性名时，不要使用特殊字符

-   **建议设置属性名时，均不要使用特殊字符**

##### EL表达式运算

###### 算数运算

算数运算指的是基本的"+-\*/"运算

例：

-----------------------------------------
  **\<%\
  **request.setAttribute(**\"a1\"**,20);\
  request.setAttribute(**\"a2\"**,10);\
  **%\>\
  \${**a1 + a2**}**

-----------------------------------------

###### 关系运算

关系运算包括:

![](media/image456.png){width="4.868216316710411in" height="1.3333333333333333in"}

例：

--------------------------------------------------
  **\<%\
  **request.setAttribute(**\"a1\"**,20);\
  request.setAttribute(**\"a2\"**,10);\
  **%\>\
  \${**a1 \> a2**}** *\<!\--显示true\--\>\
  ***\${**a1 **eq** a2**}** *\<!\--显示false\--\>*

--------------------------------------------------

###### 逻辑运算符

逻辑运算包括：

![](media/image457.png){width="4.989583333333333in" height="0.9573501749781277in"}

例：

-------------------------------------------------------
  **\<%\
  **request.setAttribute(**\"a1\"**,20);\
  request.setAttribute(**\"a2\"**,10);\
  **%\>\
  \${**a1 \>= a2 && a1 != a2**}** *\<!\--显示true\--\>\
  ***\${not** (a1 **eq** a2)**}** *\<!\--显示true\--\>*

-------------------------------------------------------

##### 获取WEB常用对象

###### pageScope

代表pageContext域中用于保存属性的Map对象

就是在EL表达式中指定使用pageContext域中的属性的对象，参见[[获取域对象中的内容]{.underline}](#获取域对象中的内容)

###### requestScope

代表request域中用于保存属性的Map对象

就是在EL表达式中指定使用request域中的属性的对象，参见[[获取域对象中的内容]{.underline}](#获取域对象中的内容)

###### sessionScope

代表session域中用于保存属性的Map对象

就是在EL表达式中指定使用session域中的属性的对象，参见[[获取域对象中的内容]{.underline}](#获取域对象中的内容)

###### applicationScope

代表servletContext域中用于保存属性的Map对象

就是在EL表达式中指定使用servletContext域中的属性的对象，参见[[获取域对象中的内容]{.underline}](#获取域对象中的内容)

###### param

表示1个保存了所有请求参数的Map对象

相当于[[getParameter]{.underline}](#getparameter)方法

例：获取提交上来的表单中的user属性的值

填写表单的页面：

---------------------------------------------------------------
  \<**form action=\"/jsp/jsp/ELdemo2.jsp\" method=\"post\"**\>\
  账号：\<**input type=\"text\" name=\"user\"**\>\<**br**\>\
  \<**input type=\"submit\" value=\"登录\"**\>\
  \</**form**\>

---------------------------------------------------------------

ELDemo2.jsp：

------------------------
  **\${**param.user**}**
  ------------------------

###### paramValues

表示1个保存了所有请求参数的Map对象，他返回的是String\[\]

相当于[[getParameterValues]{.underline}](#getparametervalues)方法

例：获取爱好属性的值

填写表单的页面：

------------------------------------------------------------------------------
  \<**form action=\"/jsp/jsp/ELdemo2.jsp\" method=\"post\"**\>\
  爱好：\<**input type=\"checkbox\" name=\"love\" value=\"girl\"**\>美女\
  \<**input type=\"checkbox\" name=\"love\" value=\"money\"**\>金钱\<**br**\>\
  \<**input type=\"submit\" value=\"登录\"**\>\
  \</**form**\>

------------------------------------------------------------------------------

ELDemo2.jsp：

-----------------------------------
  **\${**paramValues.love\[0\]**}**
  -----------------------------------

###### header

表示1个保存了http请求头字段的Map对象

相当于[[getHeader]{.underline}](#getheader)方法

例：

----------------------------
  **\${**header.referer**}**
  ----------------------------

###### headerValues

> 表示1个保存了http请求头字段的Map对象，返回String\[\]；当某个请求头中包含多个值时，使用该方法
>
> 注意：如果头里含有"-"，例如：Accept-Encoding，则要headerValues\[\"Accept-Encoding\"\]

###### initParam

获取web.xml中配置的全局初始化参数

例：在web.xml中配置全局初始化参数username

------------------------------------------------
  \<**context-param**\>\
  \<**param-name**\>username\</**param-name**\>\
  \<**param-value**\>root\</**param-value**\>\
  \</**context-param**\>

------------------------------------------------

在jsp文件中使用EL表达式获取username的值

--------------------------------
  **\${**initParam.username**}**
  --------------------------------

###### cookie

表示1个保存了所有cookie的Map对象

> 相当于[[getCookies]{.underline}](#getcookies)
>
> 语法：

-------------------------------------
  **\${**cookie.cookie名称.value**}**
  -------------------------------------

> 例：获取名字为last的cookie的值

-------------------------------
  **\${**cookie.last.value**}**
  -------------------------------

###### pageContext

> 与[[pageContext]{.underline}](#pagecontext)是1个东西，不过这里将内置对象pageContext中的部分get、set方法全部当做属性使用
>
> 例：

--------------------------------------------
  **\${**pageContext.request.remoteAddr**}**
  --------------------------------------------

### JSTL标签库

#### 介绍

##### JSTL是什么

JSP标准标签库

##### 作用

-   提供给JavaWeb开发人员一套标准通用的标签函数库

-   和EL来取代传统的直接在页面上嵌入java程序的做法（\<% %\>），以提高程序可读性、维护性和方便性

#### 使用

##### 导入jar包

下载"jakarta-taglibs-standard-1.1.2.zip"文件，解压后将lib目录下的两个jar包导入到工程：

![](media/image458.png){width="1.03125in" height="0.4583333333333333in"}

##### 导入标签库

本课程讲解"c.tld"核心标签库，打开刚才带入的standard.jar包，META-INF下的"c.tld"就是核心标签库

在需要使用标签库的jsp文件中，使用[[taglib]{.underline}](#taglib)指令导入标签库，其属性值为：

uri：c.tld文件中第12行，uri标签的内容

prefix：c.tld文件中第11行，short-name标签的内容

> 例：c.tld文件内容：
>
> ![](media/image459.png){width="4.760416666666667in" height="0.5416666666666666in"}
>
> 导入标签库语句：

--------------------------------------------------------------------------------------
  \<%@**taglib uri**=\"**http://java.sun.com/jsp/jstl/core**\" **prefix**=\"**c**\"%\>
  --------------------------------------------------------------------------------------

#### c.tld标准标签库

##### \<c:set\>

功能：

-   向4个域对象中存入值

  -------------------------------------------------------------------
  \<**c:set var=\"i\" value=\"10\" scope=\"page\"**\>\</**c:set**\>
  -------------------------------------------------------------------

-   修改域中javaBean对象的属性的值

  ---------------------------------------------------------------------------------------
  **\<%\
  **User user = **new** User();\
  user.setName(**\"美美\"**);\
  user.setValue(**\"12\"**);\
  request.setAttribute(**\"user\"**,user);\
  **%\>\
  \${**user.name**}**\<**br**\>\
  \<**c:set target=\"\${**user**}\" property=\"name\" value=\"唐嫣\"**\>\</**c:set**\>\
  **\${**user.name**}**\<**br**\>

  ---------------------------------------------------------------------------------------

属性：

-   var：变量名

-   value：变量值

-   scope：指定放在哪个域中

-   target：域中的javaBean对象，需要使用EL表达式指定

-   property：javaBean对象中的哪个属性

##### \<c:if\>

功能：判断语句

语法：

------------------------------------------
  \<**c:if test=\"\${** 判断条件**}\"**\>\
  执行语句\
  \</**c:if**\>

------------------------------------------

属性：

-   test：判断条件，使用EL表达式进行判断

-   var：将test的结果保存在var指定的变量中

-   scope：var指定的变量放在哪个域中

> 例：

--------------------------------------------------------------------
  \<**c:set var=\"i\" value=\"10\" scope=\"page\"**\>\</**c:set**\>\
  \<**c:if test=\"\${** i== 10**}\"**\>\
  i = 10 *\<!\-- 输出到页面的内容 \--\>\
  *\</**c:if**\>

--------------------------------------------------------------------

##### \<c:out\>

功能：向页面输出内容

> 属性：

-   value：输出的内容，输出字符串时可以直接赋值为字符串；输出变量时需要使用EL表达式

    -   输出字符

---------------------------------------------
  \<**c:out value=\"hello\"**\>\</**c:out**\>
  ---------------------------------------------

-   输出变量

  -------------------------------------------------------------------------
  \<**c:set var=\"name\" value=\"Alan\" scope=\"page\"**\>\</**c:set**\>\
  \<**c:out value=\"\${**name**}\"**\>\</**c:out**\>

  -------------------------------------------------------------------------

-   default：默认输出内容；当输出的变量找不到时，自动输出该属性的内容

> 例：没有passwd变量时输出"没有此内容"

-----------------------------------------------------------------------------
  \<**c:out value=\"\${**passwd**}\" default=\"没有此内容\"**\>\</**c:out**\>
  -----------------------------------------------------------------------------

-   escapeXml：是否对"\>\<\\\'\~"等特殊字符进行转义，默认为true；设置为true时，无法将html代码输出到页面，设置为false可以将html代码输出到页面

> 例：设置为true

----------------------------------------------------------------------------------------
  \<**c:out value=\"\<a href=\'\#\'\>超链接\</a\>\" escapeXml=\"true\"**\>\</**c:out**\>
  ----------------------------------------------------------------------------------------

> 显示效果：
>
> ![](media/image460.png){width="2.0104166666666665in" height="0.2708333333333333in"}
>
> 设置为false

-----------------------------------------------------------------------------------------
  \<**c:out value=\"\<a href=\'\#\'\>超链接\</a\>\" escapeXml=\"false\"**\>\</**c:out**\>
  -----------------------------------------------------------------------------------------

> 显示效果：
>
> ![](media/image461.png){width="0.625in" height="0.3125in"}

##### \<c:remove\>

功能：删除指定域中的属性

属性：

-   var：属性名

-   scope：域

例：

---------------------------------------------------------------
  \<**c:remove var=\"name\" scope=\"page\"**\>\</**c:remove**\>
  ---------------------------------------------------------------

##### \<c:catch\>

功能：捕获异常，相当于try\...catch语句

属性：

-   var：定义1个变量，将在本标签内产生的异常存储到这个变量内，然后可以通过\${变量.messege}将异常输出到页面

例：

---------------------------------
  \<**c:catch var=\"e\"**\>\
  **\<%\
  int** i = 10/0;\
  **%\>\
  **\</**c:catch**\>\
  **\${**e.message**}**\<**br**\>

---------------------------------

##### \<c:choose\>、\<c:when\>、\<c:otherwise\>

功能：这3个标签组合，达到"if\...else if\...else"的判断逻辑效果

属性：

-   \<c:when test=\"\${判断语句}\"\>：只有when标签有1个test属性，与[[\<c:if\>]{.underline}](#cif)中的test属性相同

例：

-----------------------------------------------------------------------
  \<**c:set var=\"temp\" value=\"15\" scope=\"page\"**\>\</**c:set**\>\
  \<**c:choose**\>\
  \<**c:when test=\"\${**temp \>= 20**}\"**\>\
  temp \>= 20\
  \</**c:when**\>\
  \<**c:when test=\"\${**temp \>= 10**}\"**\>\
  20 \> temp \>= 10\
  \</**c:when**\>\
  \<**c:otherwise**\>\
  temp \< 10\
  \</**c:otherwise**\>\
  \</**c:choose**\>\<**br**\>

-----------------------------------------------------------------------

##### \<c:foreach\>

功能：

-   循环遍历，相当于增强for循环语句：for(String str : sArr)

  ---------------------------------------------------------
  **\<%\
  **String sarr\[\] = {**\"a\"**,**\"b\"**,**\"c\"**};\
  request.setAttribute(**\"sarr\"**,sarr);\
  **%\>\
  **\<**c:forEach var=\"str\" items=\"\${**sarr**}\"**\>\
  **\${**str**}\
  **\</**c:forEach**\>

  ---------------------------------------------------------

-   迭代数据，相当于正常的for循环语句

  -----------------------------------------------------------------
  \<**c:forEach var=\"i\" begin=\"10\" end=\"20\" step=\"1\"**\>\
  **\${**i**}\
  **\</**c:forEach**\>\<**br**\>

  -----------------------------------------------------------------

属性：

-   var：

> 用于循环遍历时：从数组或集合中取出的1个对象，相当于增强for循环中：前面的变量
>
> 用于迭代数据时：迭代的变量，相当于for循环里的i

-   items：（用于循环遍历）需要变量的数组或集合，相当于增强for循环中：后面的数组或集合

-   begin：（用于迭代数据）迭代变量的初始值

-   end：（用于迭代数据）迭代变量的最大值

-   step：（用于迭代数据）迭代的步长

-   varStatus：记录循环相关信息的对象，其属性有：

    -   index：类型：number；意义：用于循环遍历时，就是数组或集合的下标；用于迭代数据时，与迭代变量值相同

    -   count：类型：number；意义：循环次数

    -   first：类型：boolean；意义：是否是第一次循环

    -   last：类型：boolean；意义：是否是最后一次循环

例：

--------------------------------------------------------------------------------------------------------------------------
  **\<%\
  **String sarr\[\] = {**\"a\"**,**\"b\"**,**\"c\"**,**\"e\"**,**\"f\"**,**\"g\"**,**\"h\"**,**\"i\"**,**\"j\"**,**\"k**;\
  request.setAttribute(**\"sarr\"**,sarr);\
  **%\>\
  **\<**c:forEach var=\"str\" items=\"\${**sarr**}\" varStatus=\"status\"**\>\
  \<**c:choose**\>\
  \<**c:when test=\"\${**status.first**}\"**\>\
  \<**font color=\"blue\"**\>**\${**str**}**\</**font**\>\
  \</**c:when**\>\
  \<**c:when test=\"\${**status.last**}\"**\>\
  \<**font color=\"red\"**\>**\${**str**}**\</**font**\>\
  \</**c:when**\>\
  \<**c:when test=\"\${**status.count % 3 == 0**}\"**\>\
  \<**font color=\"\#ffc0cb\"**\>**\${**str**}**\</**font**\>\
  \</**c:when**\>\
  \<**c:otherwise**\>\
  **\${**str**}\
  **\</**c:otherwise**\>\
  \</**c:choose**\>\
  **\${**status.index**}**\<**br**\>\
  \</**c:forEach**\>\<**br**\>

--------------------------------------------------------------------------------------------------------------------------

显示效果：

![](media/image462.png){width="0.6770833333333334in" height="2.1979166666666665in"}

##### \<c:import\>

功能：页面包含

属性：

-   url：要包含的页面的url

-   context：虚拟路径，一般为根虚拟路径（用不用都行）

-   var：将包含的页面保存到该属性中，后面可以通过显示该变量来显示包含的页面的内容

-   scope：var指定的变量的域范围

例：

-   直接显示

  -----------------------------------------------------
  \<**c:import url=\"demo1.jsp\"**\>\</**c:import**\>
  -----------------------------------------------------

-   保存到变量中在现实

  -------------------------------------------------------------------------------
  \<**c:import url=\"demo1.jsp\" var=\"i\" scope=\"page\"**\>\</**c:import**\>\
  **\${**i**}**

  -------------------------------------------------------------------------------

##### \<c:param\>

功能：向\<c:import\>标签包含的页面传递参数，一般放在\<c:import\>标签内

属性：

-   name：属性名称

-   value：属性的值

例：

--------------------------------------------------------------------
  \<**c:import url=\"demo1.jsp\"**\>\
  \<**c:param name=\"demo2\_i\" value=\"meiei\"**\>\</**c:param**\>\
  \</**c:import**\>

--------------------------------------------------------------------

此时在demo1.jsp文件中就可以获取该属性

-------------------------------------------------------
  **\<%=**request.getParameter(**\"demo2\_i\"**)**%\>**
  -------------------------------------------------------

##### \<c:url\>

功能：

-   用于在jsp页面中构造1个url地址，其主要目的是实现URL重写，URL重写就是将会话标识号以参数形式附加在URL地址后面（其实就是cookie的追踪技术）

属性：

-   var：将附加了会话标识的url地址保存到该变量中，在后面进行使用

-   value：没有加会话标识的url地址

-   scope：var指定的变量的域范围

-   context：虚拟路径（无所谓）

例：生成附加会话标识的url地址，并将1个超链接指向该地址

---------------------------------------------------------------------------
  \<**c:url var=\"j\" value=\"demo1.jsp\" scope=\"page\"**\>\</**c:url**\>\
  \<**a href=\"\${**j**}\"**\>demo1\</**a**\>

---------------------------------------------------------------------------

##### \<c:redirect\>

功能：重定向

属性：

-   url：重定向的地址

-   context：虚拟路径（无所谓）

例：

---------------------------------------------------------
  \<**c:redirect url=\"demo1.jsp\"**\>\</**c:redirect**\>
  ---------------------------------------------------------

#### fn.tld标签库（EL函数）

该标签库内的内容均是操作字符串的，与jdk中函数很像

EL函数用法：\${ fn:函数}

![](media/image463.png){width="4.447916666666667in" height="2.4182075678040245in"}

##### length

功能：返回字符串的长度

例：

-------------------------------------
  **\${** fn:length(**\"abc\"**)**}**
  -------------------------------------

#### fmt国际化标签

> 该部分内用需要结合[[国际化]{.underline}](#国际化)一同理解

##### 导入国际化标签库

> jstl标签库中包含fmt国际化标签库，使用jstl标签库并导入fmt标签库：

-   将jstl标签库导入工程：

> ![](media/image464.png){width="1.6145833333333333in" height="0.6770833333333334in"}

-   导入标签库

  -------------------------------------------------------------------------
  \<%\@taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %\>
  -------------------------------------------------------------------------

##### \<fmt:setLocale\>

> 功能：
>
> 创建Locale对象，ResourceBundle需要根据该对象决定获取资源包中哪种语言对应的文件
>
> 属性：

-   value

> 创建Locale对象时需要的参数，也就是指定语言和国家，例如"zh-CN"

-   scope

> 该对象的作用范围，默认page（本页）

##### \<fmt:setBundle\>

> 功能：
>
> 创建ResourceBundle对象，该对象指向的资源包的基名由basename属性决定，语言由上面设定的Locale对象决定，有了这些信息，ResourceBundle对象就知道应该从那个文件中获取文本内容了

属性：

-   basename

> 资源包的基名

-   var

> 存储使用本标签创建的ResourceBundle对象的变量

-   scope

> 该对象的作用范围，默认page（本页）

##### \<fmt:message\>

> 功能：从ResourceBundle对象中获取文本内容
>
> 属性：

-   bundle

> 从哪个ResourceBundle对象中获取

-   key

> 要获取的文本内容的key

-   var

> 存储获取到的文本内容的变量

### 自定义EL函数

#### 编写java类

方法必须是静态方法

----------------------------------------------------
  **public class** MyEL {\
  **public static** String sayHelloTo(String name){\
  **return \"Hello \"** + name;\
  }\
  }

----------------------------------------------------

#### 创建标签库配置文件

> 在WEB-INF目录下创建"tld"文件夹，里面创建"\*.tld"文件（标签库配置文件）
>
> ![](media/image465.png){width="4.926248906386702in" height="4.330188101487314in"}
>
> 创建后文件：

-------------------------------------------------------------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"ISO-8859-1\"***?\>\
  \
  *\<**taglib xmlns=\"http://java.sun.com/xml/ns/javaee\"\
  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\
  xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary\_2\_1.xsd\"\
  version=\"2.1\"**\>\
  \
  \<**tlib-version**\>1.0\</**tlib-version**\>\
  \<**short-name**\>myshortname\</**short-name**\>\
  \<**uri**\>http://mycompany.com\</**uri**\>\
  \
  *\<!\-- Invoke \'Generate\' action to add tags or functions \--\>\
  \
  *\</**taglib**\>

-------------------------------------------------------------------------------------------------------------------------

#### 配置标签库配置文件

##### 配置uri和short-name

> 分别配置short-name和uri标签的内容，没有特殊要求，合理即可；引用该标签库时，[[taglib]{.underline}](#taglib)的uri属性和prefix属性的值分别为这两个标签的内容

-------------------------------------------------
  \<**short-name**\>mel\</**short-name**\>\
  \<**uri**\>http://www.itcast.cn/mel\</**uri**\>

-------------------------------------------------

##### 配置自定义EL函数

------------------------------------------------------------------------------------------------------
  *\<!\-- 配置自定义EL函数 \--\>\
  *\<**function**\>\
  *\<!\-- 配置方法名称 \--\>\
  *\<**name**\>sayHi\</**name**\>\
  *\<!\-- 配置类的全路径 \--\>\
  *\<**function-class**\>cn.itcast.el.MyEL\</**function-class**\>\
  *\<!\-- 配置方法的签名（返回值、函数名、参数） \--\>\
  *\<**function-signature**\>java.lang.String sayHelloTo(java.lang.String)\</**function-signature**\>\
  \</**function**\>

------------------------------------------------------------------------------------------------------

#### 测试

编写jsp文件使用自定义的EL函数：

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<%@**taglib uri**=\"**http://www.itcast.cn/mel**\" **prefix**=\"**mel**\"%\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>Title\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\${**mel:sayHi(**\"唐嫣\"**)**}\
  **\</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

显示效果：

![](media/image466.png){width="0.9791666666666666in" height="0.3333333333333333in"}

### 自定义标签

#### 原理

> 自定义标签的格式，在tld标签配置文件中进行约束，然后按照tld文件中的约束使用该标签；
>
> 在配置tld文件时，会为自定义标签配置1个实现了SimpleTag接口的类的全路径，执行该标签时，服务器会自动按顺序调用该类中实现的如下接口方法：

1.  setJspContext(IspContext pc)；传入pageContext对象

2.  setParent(JspTag parent)；传入父标签对象

3.  setJspBody(JspFragment jspBody)；传入标签体内容

4.  doTag()；执行标签

> 实际应用中，使用继承SimpleTagSupport类来实现自定义标签的类；由于该父类会将上面的前3个方法传入的内容保存起来，我们只重写doTag方法即可，其他内容均可以调用该父类中对于的get方法获取

#### 编写java类

> 编写1个java类，继承SimpleTagSupport类，并重写doTag方法；标签被调用时，服务器会自动调用该方法

##### 重写doTag方法

重写该方法时来决定该标签实现的功能

##### SimpleTagSupport类的方法

###### getJspContext

> 返回值：JspContext对象
>
> 功能：获取调用setJspContext接口方法时传入的JspContext对象；该对象时pageContext类的父类，可以强转成pageContext对象来使用，pageContext对象用法参见[[pageContext]{.underline}](#pagecontext)

###### getParent

> 返回值：JspTag对象
>
> 功能：获取调用setParent接口方法时传入的JspTag对象

###### getJspBody

> 返回值：JspFragment对象
>
> 功能：获取调用setJspBody接口方法时传入的JspFragment对象，该对象是标签体的内容

##### JspFragment类的方法

###### invoke

> 参数：Writer out：输出流
>
> 返回值：无
>
> 功能：将该对象的内容（标签体的内容）输出到指定的out输出流中，如果参数为null，自动输出到pageContext的out对象中

#### 配置标签库配置文件

创建"\*.tld"文件，并配置uri和short-name标签

配置自定义标签：

----------------------------------------------------------
  \<**tag**\>\
  *\<!\-- 配置自定义标签名 \--\>\
  *\<**name**\>print\</**name**\>\
  *\<!\-- 配置自定义标签类的全路径 \--\>\
  *\<**tag-class**\>cn.itcast.tag.MyTag\</**tag-class**\>\
  *\<!\-- 配置自定义标签体 empty代表没有标签体\--\>\
  *\<**body-content**\>empty\</**body-content**\>\
  \</**tag**\>

----------------------------------------------------------

##### \<body-content\>标签可选值

-   empty：不能有标签体内容

-   scriptless：标签体内容不能时java代码片段，但是可以是EL、JSTL等

-   JSP：可以是任意东西，但是SimpleTag不支持（不使用该方法）

-   tagdependent：标签提内容无论是什么都不会做运算（不使用该方法）

#### 测试

-   自定义标签类

  -----------------------------------------------------------------
  **public class** MyTag **extends** SimpleTagSupport {\
  **public void** doTag() **throws** JspException, IOException {\
  getJspBody().invoke(getJspContext().getOut());\
  }\
  }

  -----------------------------------------------------------------

-   配置自定义标签

  ---------------------------------------------------------
  \<**tag**\>\
  \<**name**\>out\</**name**\>\
  \<**tag-class**\>cn.itcast.tag.MyTag\</**tag-class**\>\
  \<**body-content**\>scriptless\</**body-content**\>\
  \</**tag**\>

  ---------------------------------------------------------

-   使用该标签

  ------------------------------------
  \<**mt:out**\>Hello\</**mt:out**\>
  ------------------------------------

-   ![](media/image467.png){width="0.6145833333333334in" height="0.21875in"}效果

#### 补充demo

##### 自定义标签显示radio按钮

> 根据后台的性别，来决定哪个按钮被默认选中

-   自定义标签类

  ----------------------------------------------------------------------------------------------------------------------------------------------------
  **public class** GenderTag **extends** SimpleTagSupport {\
  *//自定义标签中使用的属性必须在此定义对应的变量，并生成get、set方法\
  //使用标签时，对某个属性进行了传值，那个值就会传给本类中对应的变量\
  ***private** String **gender**;\
  **public** String getGender() {\
  **return gender**;\
  }\
  **public void** setGender(String gender) {\
  **this**.**gender** = gender;\
  }\
  \
  \@Override\
  **public void** doTag() **throws** JspException, IOException {\
  *//根据标签的gender属性，决定页面显示内容\
  *String str = **null**;\
  **if**(**gender**.equals(**\"男\"**)){\
  str = **\"\<input type=\'radio\' name=\'gender\' value=\'男\' checked=\'checked\'\>男\<input type=\'radio\' name=\'gender\' value=\'女\'\>女\"**;\
  }**else**{\
  str = **\"\<input type=\'radio\' name=\'gender\' value=\'男\'\>男\<input type=\'radio\' name=\'gender\' value=\'女\' checked=\'checked\'\>女\"**;\
  }\
  *//向页面输出\
  *getJspContext().getOut().write(str);\
  }\
  }

  ----------------------------------------------------------------------------------------------------------------------------------------------------

-   配置自定义标签

  ---------------------------------------------------------------------------------
  \<**tag**\>\
  \<**name**\>sex\</**name**\>\
  \<**tag-class**\>cn.itcast.customer.tag.GenderTag\</**tag-class**\>\
  \<**body-content**\>empty\</**body-content**\>\
  *\<!\-- 指定属性 \--\>\
  *\<**attribute**\>\
  \<**name**\>gender\</**name**\>*\<!\-- 属性名称\--\>\
  *\<**required**\>true\</**required**\>*\<!\--属性必须使用\--\>\
  *\<**rtexprvalue**\>true\</**rtexprvalue**\>*\<!\--属性值可以接受EL表达式\--\>\
  *\</**attribute**\>\
  \
  \</**tag**\>

  ---------------------------------------------------------------------------------

-   使用自定义标签

  -------------------------------------------------
  性别：\<my:sex gender=\"\${c.gender}\"/\>\<br\>
  -------------------------------------------------

## javaBean

### javaBean定义

javaBean就是遵循特定写法的java类，写法如下：

1.  必须有1个无参的构造方法，存在多个构造方法时，也必须加上无参的构造方法

2.  [[属性]{.underline}](#属性-4)必须为私有的成员变量，不是属性的成员变量可以不是私有的

3.  属性必须通过public类型的get或set方法暴露给其他程序，并且方法的命名也必须遵守如下规范：

<!-- -->

a)  set、get必须小写

b)  后面跟上首字母改为大小后的属性名

### 属性

javaBean的属性是必须具有get或set方法（有其中1个或全有均可）的成员变量；只有get或set方法的属性称之为只读、只写属性

### 作用

javaBean通常用于封装数据

提交表单时数据过多时，可以直接传输javaBean对象，方便管理

### 例

-------------------------------------------------------------
  **public class** javaBeanDemo1 {\
  **private** String **name**; *//有get方法，是属性\
  ***private** String **passwd**; *//有get、set方法，是属性\
  ***private** String **sex**; *//没有get或set方法，不是属性\
  ***public** javaBeanDemo1() { *//无参构造方法\
  *}\
  **public** String getName() {\
  **return name**;\
  }\
  **public** String getPasswd() {\
  **return passwd**;\
  }\
  **public void** setPasswd(String passwd) {\
  **this**.**passwd** = passwd;\
  }\
  }

-------------------------------------------------------------

### 封装数据

#### 传统方式

传统方式使用javaBean封装数据就是将提交给后台的数据，通过set方法设置到1个javaBean对象中

--------------------------------------------------------
  String username = request.getParameter(**\"user\"**);\
  String passwd = request.getParameter(**\"passwd\"**);\
  User user = **new** User();\
  user.setUser(username);\
  user.setPasswd(passwd);

--------------------------------------------------------

#### 动态标签

动态标签封装数据与传统方式原理相同，不过有一些动作标签替你完成了，代码量更少；这种方式只能在jsp文件中使用

-------------------------------------------------------------------------------------
  \<**jsp:useBean id=\"u\" class=\"cn.itcast.javaBean.User\"**\>\</**jsp:useBean**\>\
  \<**jsp:setProperty name=\"u\" property=\"\*\"**\>\</**jsp:setProperty**\>\
  \<**jsp:getProperty name=\"u\" property=\"user\"**\>\</**jsp:getProperty**\>

-------------------------------------------------------------------------------------

#### 内省

内省计数是基于反射的，通过内省技术可以获取javaBean的所有属性和方法

这种方法了解即可，只能封装String类型数据，其他类型的会很复杂，一般使用[[beanutils工具包]{.underline}](#beanutils工具包)

--------------------------------------------------------------------------------------------------------------------------------
  **protected void** doGet(HttpServletRequest request, HttpServletResponse response) **throws** ServletException, IOException {\
  Map\<String,String\[\]\> map = request.getParameterMap();\
  User user = **new** User();\
  **try** {\
  pack(map, user);\
  }**catch**(Exception e){\
  e.printStackTrace();\
  }\
  System.***out***.println(**\"name = \"** + user.getUser());\
  System.***out***.println(**\"passwd = \"** + user.getPasswd());\
  }\
  \
  **private void** pack(Map\<String,String\[\]\> map,User user) **throws** Exception {\
  *//在user上进行内省，获取这个javaBean对象的信息，返回的是BeanInfo对象\
  *BeanInfo info = Introspector.*getBeanInfo*(user.getClass());\
  *//获取属性描述，返回的是PropertyDescriptor对象的数组\
  *PropertyDescriptor\[\] pds = info.getPropertyDescriptors();\
  *//遍历所有属性\
  ***for**(PropertyDescriptor pd : pds){\
  *//获取属性名称\
  *String name = pd.getName();\
  *//判断表单的属性中是否包含javaBean中的属性\
  //要求表单中与javaBean中同一属性的名称必须相同才能使用该方法\
  ***if**(map.containsKey(name)){\
  *//获取属性的写方法\
  *Method m = pd.getWriteMethod();\
  *//执行写方法，将表单中数据封装到javaBean中\
  *m.invoke(user,map.get(name));\
  }\
  }\
  }

--------------------------------------------------------------------------------------------------------------------------------

#### beanutils工具包

a)  beanutils是Apache开发的第三方工具类，所以需要引入如下两个jar包：

> ![](media/image468.png){width="2.5729166666666665in" height="0.5520833333333334in"}

b)  beanutils的底层也是使用内省的技术完成的，但是做了一些更复杂的处理，可以对大部分类型的数据使用BeanUtils.populate方法进行封装，推荐使用这种方法

c)  Date类型的数据不可以自动完成封装，需要注册1个日期类型转换器，才能将String转为Date类型进行封装

----------------------------------------------
  DateConverter dc = **new** DateConverter();\
  dc.setPattern(**\"yyyy-MM-dd\"**);\
  ConvertUtils.*register*(dc,Date.**class**);

----------------------------------------------

d)  对于其他无法自动完成封装的类型，可以使用自定义类型转换器。需要使用Converter接类型转换，并通过ConvertUtils.register方法进行注册

例：

实现Converter接口完成String转Date

-----------------------------------------------------------------------
  **class** ConvertStringToDate **implements** Converter{\
  **public** Object convert(Class aClass, Object o) {\
  String sdata = (String)o;\
  SimpleDateFormat sdf = **new** SimpleDateFormat(**\"yyyy-MM-dd\"**);\
  Date date;\
  **try** {\
  date = sdf.parse(sdata);\
  } **catch** (ParseException e) {\
  e.printStackTrace();\
  **throw new** RuntimeException(**\"转换日期错误\"**);\
  }\
  **return** date;\
  }\
  }

-----------------------------------------------------------------------

注册自定义转换器并封装

--------------------------------------------------------------------------
  *//获取表单属性的MAP集合\
  *Map\<String,String\[\]\> map = request.getParameterMap();\
  *//定义javaBean对象\
  *User user = **new** User();\
  *//注册自定义的String转Date转换器\
  *ConvertUtils.*register*(**new** ConvertStringToDate(),Date.**class**);\
  *//封装数据\
  ***try** {\
  BeanUtils.*populate*(user,map);\
  } **catch** (IllegalAccessException e) {\
  e.printStackTrace();\
  } **catch** (InvocationTargetException e) {\
  e.printStackTrace();\
  }

--------------------------------------------------------------------------

## 域对象总结

> 下面的域对象是由大到小排序

### ServletContext

> 代表整个web应用，一般存放数据库链接等共享数据；参见[[ServletContext（域对象）]{.underline}](#servletcontext域对象)

### session

> 一次会话的范围，一般存放个人信息，用户名密码等；参见[[session域对象]{.underline}](#session域对象)

### request

> 一次请求范围，一般存放错误处理；参见[[request域]{.underline}](#request域)

### pageContext

> 当前页面，参见[[pageContext]{.underline}](#pagecontext)

## MVC模式

### 介绍

> MVC模式是1种分层的思想，就是编写代码时分为3层：

-   M：Model层；使用JavaBean封装和处理数据

-   V：View层（视图层）；使用JSP显示数据

-   C：Controller层（控制层）；使用servlet处理请求

### 案例

#### 需求分析

> 功能：完成注册
>
> 描述：

1.  注册表单

-   用户名

-   密码

-   确认密码

-   昵称

-   邮箱

-   验证码

-   提交

> 该部分属于视图层

1.  用户名不能为空

2.  密码不能少于6位

3.  检查密码和确认密码是否一致

4.  昵称不能为空

5.  检查邮箱格式

<!-- -->

2.  servlet（控制层）

    -   获取用户输入数据

    -   调用Model层javaBean封装数据

    -   调用Model层javaBean处理数据

    -   将处理结果显示到JSP上

3.  javaBean（Model层）

> 控制层中的封装数据和处理数据都需要调用Model层的javaBean实现

封装数据：使用BeanUtils完成

处理数据：自己封装JavaBean完成业务逻辑，用户名、邮箱重名，验证码等

#### 方案设计

21. 数据库：使用xml代替

22. 架构：使用MVC模式

23. 技术：

    3.  DOM4J和XPATH解析xml

    4.  servlet

    5.  BeanUtils封装数据

    6.  JSTL+EL显示数据

#### 框架搭建

24. 新建工程

25. 导入如下jar包

> ![](media/image469.png){width="1.6875in" height="0.46875in"}解析xml：
>
> ![](media/image470.png){width="2.0416666666666665in" height="0.4375in"}beanutils工具类：

jstl标签库：

![](media/image471.png){width="1.15625in" height="0.4583333333333333in"}

26. 创建jsp文件，并实现表单中的内容

27. 创建包结构

> ![](media/image472.png){width="1.4479166666666667in" height="1.3229166666666667in"}
>
> 其中：

-   action：存放servlet程序（控制层）

-   vo：存放封装数据的javaBean代码

-   service：存放处理数据的JavaBean代码

-   utils：自己封装的一些工具类放在这里

#### 执行顺序

7.  jsp提交上来的表单传给action下的servlet程序

8.  servlet程序将数据封装到vo下的javaBean类的对象中

9.  servlet程序将javaBean对象用service下的程序进行进行处理

10. service下的程序调用utils下的工具类帮助进行处理

11. servlet根据处理结果将结果返回给jsp程序中

#### 代码

代码参见"MVCDemo1"工程

## DAO模式

### WEB三层架构

> WEB三层架构是服务器整体的1个架构，分为表现层、业务层、持久层。
>
> WEB层（表现层）：
>
> 该层使用MVC模式（JSP+Servlet+JavaBean）完成页面的显示、接受和响应请求、封装数据

Service层（业务层）：

将WEB层的数据和请求发送给业务层，在业务层进行业务逻辑的处理

dao层（持久层）：

> 在持久层通过DAO模式将对数据源的操作完成封装起来，业务层通过操作java对象完成对数据源的操作

#### VO、BO、TO

> 在WEB三层架构中，根据业务需求，每层对数据的封装可能是不同的，所以每层分别有自己的JavaBean去封装数据
>
> VO：在WEB层对数据的封装
>
> BO：在业务层对数据的封装
>
> TO：在持久层对数据的封装

#### 各层之间实现方式

> 各层之间使用接口实现代码的互相调用

### DAO模式

> DAO模式（Data Access Object数据访问对象）：在持久层通过DAO模式将对数据源的操作完成封装起来，业务层通过操作java对象完成对数据源的操作

1)  #### DAO模式结构

    1.  数据源（数据库）
    
    2.  DataAccessObject数据访问对象，持久层DAO程序，将对数据源的操作封装成java对象
    
    3.  TransferObject传输对象（值对象）业务层通过向持久层传输TO对象完成对数据源的操作（就是javaBean，用来封装数据的对象）

## 案例

### 文件上传

#### 原理

##### 浏览器端

(1) ###### 要素

    -   form表单的method必须为post，才可以携带大数据
    
    -   文件选择框必须使用"\<input type='file' name='f'\>"，且必须有name属性
    
    -   form表单必须有encType属性，且值必须为"multipart/form-data"才可以将文件内容上传，参见[[encType]{.underline}](#enctype)

> **此时，无法在通过getParameter等方法获取属性，只能通过fileItem获取，参见：[[getParameter]{.underline}](#getparameter)**

###### 代码

-------------------------------------------------------------------------------------------------------------------------
  \<**form action=\"\${**pageContext.request.contextPath**}/upload\" method=\"post\" enctype=\"multipart/form-data\"**\>\
  \<**input type=\"file\" name=\"file\"**\>\<**br**\>\
  \<**input type=\"submit\" value=\"上传\"**\>\
  \</**form**\>

-------------------------------------------------------------------------------------------------------------------------

###### HTTP协议

> 按如上方法编写文件上传页面后，提交表单是，发送给服务器的http协议中包含如下内容：

-   Content-Type：

> ![](media/image473.png){width="5.135416666666667in" height="0.2604166666666667in"}
>
> 此时，请求正文中会将本条协议中的所有属性打包，使用boundary的值进行分割

-   请求正文

> ![](media/image474.png){width="5.768055555555556in" height="0.9416666666666667in"}

##### 服务器端

> 请求中文中的内容可以通过request对象的[[getInputStream]{.underline}](#getinputstream)方法获取字节输入流，然后对该流中的内容进行解析即可获取到文件的内容。

-----------------------------------------------------
  ServletInputStream is = request.getInputStream();\
  **int** len = -1;\
  **byte**\[\] arr = **new byte**\[1024\];\
  **while** ((len=is.read(arr)) != -1){\
  System.***out***.print(**new** String(arr,0,len));\
  }

-----------------------------------------------------

> 实际开发中不会自己进行解析，直接使用commons-fileupload工具即可完成对输入流的解析

#### 工具包

##### jar包

> ![](media/image475.png){width="2.40625in" height="0.4583333333333333in"}
>
> commons-fileupload是文件上传工具
>
> commons-io是io工具

##### commons-fileupload工具

###### DiskFileItemFactory类

> 原理：
>
> 文件上传到服务器后，如果文件大小不超过缓存区大小，则会直接放在缓存区中，如果超过缓存区大小，则会保存在临时文件中，后面对输入流的操作也都会从缓存文件中获取内容
>
> 作用：

-   设置缓冲区大小（默认10k）

-   设置临时文件缓存位置（默认在系统的临时文件缓存目录中，可在环境变量中查看）

####### 构造方法

-   无参构造

> 语法：new DiskFileItemFactory()
>
> 说明：缓存区大小及临时文件位置均使用默认值

-   有参构造

> 语法：new DiskFileItemFactory(int sizeThreshold, File repository)
>
> 参数：
>
> sizeThreshold：指定缓存区大小（例如：10k为10240）
>
> repository：指定临时文件位置
>
> 例：

----------------------------------------------------------------------------
  File file = **new** File(getServletContext().getRealPath(**\"/temp\"**));\
  DiskFileItemFactory factory = **new** DiskFileItemFactory(1024\*100,file);

----------------------------------------------------------------------------

####### setSizeThreshold

> 语法：void setSizeThreshold(int sizeThreshold)
>
> 功能：设置缓存区大小
>
> 参数： sizeThreshold：缓存区大小
>
> 返回值：无

####### setRepository

> 语法：void setRepository(File repository)
>
> 功能：设置临时文件位置
>
> 参数： repository：临时文件目录的File对象
>
> 返回值：无
>
> 说明：
>
> 使用工程中的目录作为临时文件存储位置时，由于工程部署到服务器时不会讲自己创建的目录一同部署过去，所以需要检查一下缓存文件夹是否存在，不存在则创建文件夹

例：

-----------------------------------------------------------------------------
  DiskFileItemFactory factory = **new** DiskFileItemFactory();\
  *//设置临时文件缓存位置\
  *File tmpDir = **new** File(getServletContext().getRealPath(**\"tmp\"**));\
  *//部署之后的工程没有这个目录则创建\
  ***if**(!tmpDir.exists())\
  tmpDir.mkdirs();\
  factory.setRepository(tmpDir);

-----------------------------------------------------------------------------

###### ServletFileUpload类

####### 构造方法

> 语法：new ServletFileUpload(DiskFileItemFactory factory)
>
> 功能：创建1个上传工具对象，指定缓冲区与临时文件存储位置
>
> 参数：
>
> factory：DiskFileItemFactory对象，在该对象中指定缓存区大小及临时文件存储位置
>
> 例：

-----------------------------------------------------------------
  DiskFileItemFactory factory = **new** DiskFileItemFactory();\
  *//创建ServletFileUpload对象，并将factory对象传入\
  *ServletFileUpload upload = **new** ServletFileUpload(factory);

-----------------------------------------------------------------

####### parseRequest

> 语法：List\<FileItem\> parseRequest(HttpServletRequest request)
>
> 功能：解析request，得到所有上传项，每个FileItem是1个上传项
>
> 参数： request：请求对象
>
> 返回值：
>
> List\<FileItem\>：每个上传项分装到1个FileItem对象中，将所有上传项封装到List集合中。

####### isMultipartContent

> 语法：boolean isMultipartContent(HttpServletRequest request)
>
> 功能： 用于判断是否是上传；参见：[[原理]{.underline}](#原理-5)
>
> 可以理解为form表单的envType属性是否为**enctype=\"multipart/form-data\"**

####### setFileSizeMax

> 语法：void setFileSizeMax(long fileSizeMax)
>
> 功能：设置单个文件上传大小最大值
>
> 参数：fileSizeMax：单个文件上传大小的最大值
>
> 说明：如果超出最大值，解析request时会抛出异常
>
> 例：

--------------------------------------------------------------------
  upload.setFileSizeMax(1024\*1024\*10);*//设置单个文件大小最大10MB\
  ***try** {\
  List\<FileItem\> list = upload.parseRequest(request);\
  } **catch** (FileUploadException e) {\
  System.***out***.println(**\"单个文件大小超过最大值\"**);\
  }

--------------------------------------------------------------------

####### setSizeMax

> 语法：void setSizeMax(long sizeMax)
>
> 功能：设置总文件上传大小最大值
>
> 参数：sizeMax：总文件上传大小最大值
>
> 说明：如果超出最大值，解析request时会抛出异常
>
> 例：

--------------------------------------------------------------
  upload.setSizeMax(1024\*1024\*10);*//设置总文件大小最大10MB\
  ***try** {\
  List\<FileItem\> list = upload.parseRequest(request);\
  } **catch** (FileUploadException e) {\
  System.***out***.println(**\"超过总文件大小\"**);\
  }

--------------------------------------------------------------

####### setHeaderEncoding

> 语法：setHeaderEncoding(String encoding)
>
> 功能：设置上传文件名字符编码，用于解决上传文件名中文乱码问题
>
> request.setCharacterEncoding("utf-8")也能解决该问题，但是不建议使用
>
> 以后获取请求参数均使用本工具类的方法获取，不要使用request.getParameter方法获取
>
> 参数：encoding：字符编码
>
> 例：

------------------------------------------
  upload.setHeaderEncoding(**\"utf-8\"**);
  ------------------------------------------

###### FileItem类

####### isFormField

> 语法：Boolean isFormField()
>
> 功能：判断是否为普通字段；true：普通组件，false：上传组件
>
> 参数：无
>
> 返回值：boolean：true：普通组件，false：上传组件

####### getFieldName

> 语法：String getFieldName()
>
> 功能：获取控件的name属性
>
> 参数：无
>
> 返回值：String：控件的name属性
>
> 例：如下面控件的name属性是"file"

-------------------------------------------
  \<**input type=\"file\" name=\"file\"**\>
  -------------------------------------------

####### getName

> 语法：String getName()
>
> 功能：如果是上传组件，获取文件名，如果不是上传组件，返回null
>
> 参数：无
>
> 返回值：String：上传文件的文件名
>
> 说明：
>
> 部分浏览器返回的是在客户端电脑上的完整路径，部分浏览器返回的只有文件名（不包含路径）

####### getString

-   无参方法

> 语法：String getString()
>
> 功能：获取普通组件的value属性；上传组件的文件内容（不适合用于上传组件）
>
> 参数：无
>
> 返回值：
>
> 普通组件的value属性（相当于getParameter方法）；上传组件的文件内容

说明：

> 如果上传文件是图片等，不适合使用该方法获取文件内容
>
> 用于非上传组件时，value值为中文，会出现乱码问题

-   有参方法

> 语法：String getString(String encoding)
>
> 功能：同无参方法
>
> 参数：encoding：获取内容时使用的字符编码
>
> 返回值：同无参方法
>
> 说明：使用utf-8编码获取内容，即可解决内容中文乱码问题
>
> 例：

--------------------------------
  item.getString(**\"utf-8\"**);
  --------------------------------

####### getInputStream

> 语法：InputStream getInputStream()
>
> 功能：获取上传文件的输入流
>
> 参数：无
>
> 返回值：上传文件的输入流
>
> 说明：该方法只适用于上传组件

####### delete

> 语法：void delete(void)
>
> 功能：删除临时文件
>
> 说明：只能删除不是很大的临时文件

##### commons-io工具

###### IOUtils类

####### copy

> 语法：该方法有很多重写的方法
>
> ![](media/image476.png){width="4.833333333333333in" height="1.3046500437445319in"}
>
> 功能：输入流中的内容复制到输出流中
>
> 参数：
>
> input：输入流，根据实际情况选择哪个重写的方法
>
> output：输出流，根据实际情况选择
>
> 返回值：void：无
>
> int：
>
> 说明：复制之后会自动关闭文件流

#### 代码

##### 文件上传及存储（入门）

###### jsp

-------------------------------------------------------------------------------------------------------------------------
  \<**form action=\"\${**pageContext.request.contextPath**}/upload\" method=\"post\" enctype=\"multipart/form-data\"**\>\
  \<**input type=\"file\" name=\"file\"**\>\<**br**\>\
  \<**input type=\"submit\" value=\"上传\"**\>\
  \</**form**\>

-------------------------------------------------------------------------------------------------------------------------

###### servlet

---------------------------------------------------------------------------------
  *//创建DiskFileItemFactory类对象\
  *DiskFileItemFactory factory = **new** DiskFileItemFactory();\
  *//创建ServletFileUpload对象，并将factory对象传入\
  *ServletFileUpload upload = **new** ServletFileUpload(factory);\
  **try** {\
  *//对request对象请求中文中的数据进行解析，结果封装到List\<FileItem\>\
  //请求正文中每个分割线中的内容会被封装到1个FileItem对象中\
  *List\<FileItem\> items = upload.parseRequest(request);\
  *//遍历\
  ***for** (FileItem item : items) {\
  *//判断是否为普通字段；true：普通字段，false：上传文件\
  ***if** (!item.isFormField()) {\
  *//获取文件名\
  *String filename = item.getName();\
  filename = filename.substring(filename.lastIndexOf(**\"\\\\\"**)+1);\
  *//创建输出流\
  *FileOutputStream fos = **new** FileOutputStream(**\"d:/upload/\"**+filename);\
  *//文件复制，复制之后文件流已经自动关闭了\
  *IOUtils.*copy*(item.getInputStream(),fos);\
  }\
  }\
  } **catch** (FileUploadException e) {\
  e.printStackTrace();\
  }

---------------------------------------------------------------------------------

##### 多文件上传（入门）

###### jsp

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
  \<**body**\>\
  \<**input type=\"button\" value=\"添加\" onclick=\"***addFile*()**\"**\>\
  \<**form action=\"\" method=\"post\" enctype=\"multipart/form-data\"**\>\
  *\<!\-- div用于存放点击添加按钮时需要添加的组件 \--\>\
  *\<**div id=\"content\"**\>\</**div**\>\
  \<**input type=\"submit\" value=\"上传\"**\>\
  \</**form**\>\
  \</**body**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *addFile*() {\
  *//通过ID获取div组件\
  ***var** div = **document**.getElementById(**\"content\"**);\
  *//在div中加入新的上传文件控件及删除按钮\
  *div.**innerHTML** += **\"\<div\>\<input type=\'file\' name=\'f\'\>\<input type=\'button\' value=\'removefile\' onclick=\'***removefile***(this)\'\>\</div\>\"**;\
  }\
  **function** *removefile*(but) {\
  *//删除'content'DIV下被点击按钮的父div控件\
  ***document**.getElementById(**\"content\"**).removeChild(but.**parentNode**);\
  }\
  \</**script**\>

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

###### servlet

> 代码同[[servlet]{.underline}](#servlet-1)

##### 完整文件上传

###### jsp

> 同[[jsp]{.underline}](#jsp-2)

###### utils

-----------------------------------------------------------------
  **public class** fileUploadUtil {\
  **public static** String getUploadDirectory(String filename) {\
  **int** hashcode = filename.hashCode();\
  String dir = **\"\"**;\
  **for** (**int** i = 0; i \< 8; i++) {\
  dir = **\"/\"** + Integer.*toHexString*(hashcode & 0xf) + dir;\
  hashcode \>\>\>= 4;\
  }\
  **return** dir;\
  }\
  \
  **public static** String getRandomFilename(String filename) {\
  **int** index = filename.indexOf(**\".\"**);\
  **if**(index != -1)\
  **return** UUID.*randomUUID*()+filename.substring(index);\
  **else\
  return** UUID.*randomUUID*().toString();\
  }\
  }

-----------------------------------------------------------------

###### servlet

----------------------------------------------------------------------------------------------------------
  DiskFileItemFactory factory = **new** DiskFileItemFactory();\
  *//设置临时文件缓存位置\
  *File tmpDir = **new** File(getServletContext().getRealPath(**\"tmp\"**));\
  *//部署之后的工程没有这个目录则创建\
  ***if**(!tmpDir.exists())\
  tmpDir.mkdirs();\
  factory.setRepository(tmpDir);\
  ServletFileUpload upload = **new** ServletFileUpload(factory);\
  upload.setFileSizeMax(1024\*1024\*10);\
  upload.setSizeMax(1024\*1024\*100);\
  *//如果时上传操作\
  ***if** (upload.*isMultipartContent*(request)) {\
  *//设置字符编码解决上传文件名乱码问题\
  *upload.setHeaderEncoding(**\"utf-8\"**);\
  **try** {\
  *//解析request获取所有的上传项，封装到fileItem\
  *List\<FileItem\> items = upload.parseRequest(request);\
  **for** (FileItem item : items) {\
  **if**(!item.isFormField()){\
  *//获取上传文件名\
  *String filename = item.getName();\
  *//文件名去掉路径\
  *filename = fileUploadUtil.*getRealName*(filename);\
  *//获取上传文件存储路径\
  *String randomDir = fileUploadUtil.*getUploadDirectory*(filename);\
  String rootDir = getServletContext().getRealPath(**\"upload\"**);\
  File uploadDir = **new** File(rootDir,randomDir);\
  *//不存在则创建目录\
  ***if**(!uploadDir.exists()){\
  uploadDir.mkdirs();\
  }\
  *//获取随机文件名\
  *String randomFilename = fileUploadUtil.*getRandomFilename*(filename);\
  IOUtils.*copy*(item.getInputStream(),**new** FileOutputStream(**new** File(uploadDir,randomFilename)));\
  *//删除临时文件\
  *item.delete();\
  }\
  }\
  } **catch** (FileUploadException e) {\
  *//System.out.println(\"文件过大\");\
  *e.printStackTrace();\
  }\
  }

----------------------------------------------------------------------------------------------------------

#### 问题整理

##### 文件上传位置

> 上传文件中的文件上传位置分为2种：

-   可以被浏览器直接访问的位置

> 例如：商城的商品图片
>
> 保存在WEBROOT目录下（不包含META-INFO和WEB-INFO）

-   不可以被浏览器直接访问的位置

> 例如：付费视频
>
> META-INFO和WEB-INFO及其子目录
>
> 除了工程的磁盘目录下

##### 同一目录下重名问题

> 可以给上传文件起1个随机名称：

-   文件名+当前毫秒值

-   使用uuid

##### 目录分离

###### 目录分离规则

> 当上传的文件很多时，将所有文件放在同1个目录下会影响效率，需要进行目录分离

1)  按照上传的时间进行目录分离

> 如：1月的文件放在1个目录下，2月放在1个目录下

2)  按照上传的用户进行目录分离

> 每个用户上传的文件放在1个目录下

3)  按照固定数量进行目录分离

> 假如每个目录只能存3000文件，则当1个目录存满3000后创建新目录

4)  按照文件名的hashcode进行目录分离

> 每个文件名都有唯一的1个int类型的hashcode编码，将hashcode编码转换为16进制数后，得到8位16进制数，将这8位16进制数的每1位作为1层目录，将文件存在第8层目录下

-----------------------------------------------------------------
  **public** String getUploadDirectory(String filename){\
  **int** hashcode = filename.hashCode();\
  String dir = **\"\"**;\
  **for**(**int** i=0; i\<8; i++){\
  dir = **\"/\"** + Integer.*toHexString*(hashcode & 0xf) + dir;\
  hashcode \>\>\>= 4;\
  }\
  **return** dir;\
  }

-----------------------------------------------------------------

###### 创建目录

---------------------------------------------------
  **public void** test(){\
  String path = getUploadDirectory(**\"a.txt\"**);\
  System.***out***.println(path);\
  File RootDir = **new** File(**\"d:/upload\"**);\
  File dir = **new** File(RootDir,path);\
  *//如果没有该目录，创建目录\
  ***if**(!dir.exists()){\
  dir.mkdirs();\
  }\
  }

---------------------------------------------------

##### 上传信息封装到javaBean

> 在开发中，如果使用了文件上传操作，则form表单的encType属性被设置为"multipart/form-data"，此时无法通过getParameterMap方法获取参数的Map集合，也就无法像以前那样将数据封装到javaBean，此时可以自己先将数据封装到Map集合中，在使用BeanUtils将数据封装到JavaBean
>
> 重点代码时下面带波浪线部分的代码

----------------------------------------------------------------------------------------------------------
  Map\<String,String\[\]\> map = **new** HashMap\<String,String\[\]\>();\
  **for** (FileItem item : items) {\
  **if**(!item.isFormField()){\
  *//获取上传文件名\
  *String filename = item.getName();\
  *//文件名去掉路径\
  *filename = fileUploadUtil.*getRealName*(filename);\
  map.put(**\"realname\"**,**new** String\[\]{filename});\
  *//获取上传文件存储路径\
  *String randomDir = fileUploadUtil.*getUploadDirectory*(filename);\
  File uploadDir = **new** File(rootDir,randomDir);\
  *//不存在则创建目录\
  ***if**(!uploadDir.exists()){\
  uploadDir.mkdirs();\
  }\
  map.put(**\"savepath\"**,**new** String\[\]{uploadDir.getCanonicalPath()});\
  *//获取随机文件名\
  *String randomFilename = fileUploadUtil.*getRandomFilename*(filename);\
  map.put(**\"uuidname\"**,**new** String\[\]{randomFilename});\
  IOUtils.*copy*(item.getInputStream(),**new** FileOutputStream(**new** File(uploadDir,randomFilename)));\
  *//删除临时文件\
  *item.delete();\
  }\
  **else**{\
  map.put(item.getFieldName(),**new** String\[\]{item.getString(**\"utf-8\"**)});\
  }\
  }\
  fileBean filebean = **new** fileBean();\
  BeanUtils.*populate*(filebean,map);

----------------------------------------------------------------------------------------------------------

### 文件下载

#### 超链接下载

> 该下载方式前面提到过，参见：[[超链接标签]{.underline}](#超链接标签)

##### 例程

> 超链接下载在html页面中使用1个超链接直接连接到工程中的资源即可

-   在工程目录下放入可以下载的资源

> ![](media/image477.png){width="1.9060115923009624in" height="1.2394280402449693in"}

-   html代码

  -----------------------------------------------------------------------------------------------------
  \<**a href=\"\${**pageContext.request.contextPath**}/download/1.txt\"**\>1.txt\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/download/1.mp3\"**\>1.mp3\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/download/1.zip\"**\>1.zip\</**a**\>\<**br**\>

  -----------------------------------------------------------------------------------------------------

##### 说明

> 超链接下载具备以下特点：

-   如果文件可以直接被浏览器解析，会在浏览器中直接打开，如果想下载需要右键另存为；如果不能被浏览器直接解析，则会直接执行下载操作

-   超链接下载要求被下载的资源可以直接被浏览器访问到（在WEBROOT目录下，不包含META-INFO和WEB-INFO）

-   客户端访问服务器静态资源时，文件是通过缺省的Servlet返回的，在tomcat配置文件conf/web.xml找到 \-\--org.apache.catalina.servlet.DefaultServlet

#### 编程下载

##### 页面

> 在jsp中编写1个超链接请求后台的servlet，并将要下载的文件名通过参数发送给后台

--------------------------------------------------------------------------------------------------------------
  \<**a href=\"\${**pageContext.request.contextPath**}/download?filename=1.txt\"**\>1.txt\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/download?filename=1.mp3\"**\>1.mp3\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/download?filename=1.zip\"**\>1.zip\</**a**\>\<**br**\>

--------------------------------------------------------------------------------------------------------------

##### 后台

> 后台通过IO流操作完成下载

-   获取下载文件名

> 超链接是get请求，如果获取参数出现乱码，参见：[[获取参数乱码问题]{.underline}](#获取参数乱码问题)
>
> 超链接是get请求，如果获取参数出现乱码，参见：[[获取参数乱码问题]{.underline}](#获取参数乱码问题)

-   到下载目录下查看是否存在该文件

-   将该文件写到response的输出流中

  ----------------------------------------------------------------------
  String filename = request.getParameter(**\"filename\"**);\
  File file = **new** File(**\"d:/download\"**,filename);\
  **if**(file.exists()){\
  FileInputStream is = **new** FileInputStream(file);\
  ServletOutputStream os = response.getOutputStream();\
  **byte**\[\] arr = **new byte**\[1024\];\
  **int** len = 0;\
  **while** ((len = is.read(arr)) != -1){\
  os.write(arr,0,len);\
  os.flush();\
  }\
  is.close();\
  os.close();\
  }\
  **else**{\
  response.setContentType(**\"text/html;charset=UTF-8\"**);\
  response.getWriter().write(**\"文件不存在，请选择其他文件下载\"**);\
  }

  ----------------------------------------------------------------------

##### 浏览器展示方式

1)  使用相同类型文件进行展示

> 浏览器对文件的展示方式通过"response.setContentType()"方法设置mimeType类型来决定（也就是页面上的ConyentType属性），如：

  text/html;charset=UTF-8   全部展示为文本
------------------------- ----------------
  image/bmp                 全部展示位图片
  。。。                    

例：

---------------------------------------------
  response.setContentType(**\"image/bmp\"**);
  ---------------------------------------------

2)  根据不同的文件进行展示

    -   默认情况下，浏览器会将他认识的类型的文件直接以对应的当时进行展示，不认识的文件直接进行下载
    
    -   如果想手动设置为 根据不同文件进行展示的，可以通过如下方法设置

----------------------------------------------------------------
  *//根据文件名获取对应的mimeType类型\
  *String mimeType = getServletContext().getMimeType(filename);\
  response.setContentType(mimeType);

----------------------------------------------------------------

3)  不展示，直接下载

> 如果想无论文件类型一律直接在下，需要设置响应头"Content-Disposition"，前面使用该方法进行过文件下载，参见[[文件下载]{.underline}](#文件下载)

---------------------------------------------------------------------------------
  response.setHeader(\"Content-Disposition\", \"attachment;filename=\"+filename);
  ---------------------------------------------------------------------------------

#### 文件名乱码

> 参见：[[文件名乱码]{.underline}](#文件名乱码)

### 分页显示

> 具体参见工程：day22-cloudStorage

--------------------------------------------------------------------------------------------------------------------------------------------
  \<**c:if test=\"\${empty** showDL\_pageInfo.pageItems**}\"**\>\
  暂无可下载文件\
  \</**c:if**\>\
  \<**c:if test=\"\${not empty** showDL\_pageInfo.pageItems**}\"**\>\
  **\${**download\_msg**}\
  **\<**table border=\"1\" align=\"center\" width=\"80%\"**\>\
  \<**tr**\>\
  \<**td**\>id\</**td**\>\
  \<**td**\>uuidname\</**td**\>\
  \<**td**\>realname\</**td**\>\
  \<**td**\>savepath\</**td**\>\
  \<**td**\>uploadtime\</**td**\>\
  \<**td**\>description\</**td**\>\
  \</**tr**\>\
  \<**c:forEach items=\"\${**showDL\_pageInfo.pageItems**}\" var=\"d\"**\>\
  \<**tr**\>\
  \<**td**\>**\${**d.id**}**\</**td**\>\
  \<**td**\>**\${**d.uuidname**}**\</**td**\>\
  \<**td**\>\<**a href=\"\${**pageContext.request.contextPath**}/download?id=\${**d.id**}\"**\>**\${**d.realname**}**\</**a**\> \</**td**\>\
  \<**td**\>**\${**d.savepath**}**\</**td**\>\
  \<**td**\>**\${**d.uploadtime**}**\</**td**\>\
  \<**td**\>**\${**d.description**}**\</**td**\>\
  \</**tr**\>\
  \</**c:forEach**\>\
  \<**tr**\>\
  \<**td colspan=\"6\" align=\"center\"**\>\
  \<**c:if test=\"\${**showDL\_pageInfo.pageCurrent \<= 1**}\"**\>\
  上一页\
  \</**c:if**\>\
  \<**c:if test=\"\${**showDL\_pageInfo.pageCurrent \> 1**}\"**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/showDownload?page=\${**showDL\_pageInfo.pageCurrent - 1**}\"**\>上一页\</**a**\>\
  \</**c:if**\>\
  **&nbsp;&nbsp;&nbsp;\
  \${**showDL\_pageInfo.pageCurrent**}\
  &nbsp;&nbsp;&nbsp;\
  **\<**c:if test=\"\${**showDL\_pageInfo.pageCurrent \>= showDL\_pageInfo.pageCount**}\"**\>\
  下一页\
  \</**c:if**\>\
  \<**c:if test=\"\${**showDL\_pageInfo.pageCurrent \< showDL\_pageInfo.pageCount**}\"**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/showDownload?page=\${**showDL\_pageInfo.pageCurrent + 1**}\"**\>下一页\</**a**\>\
  \</**c:if**\>\
  \</**td**\>\
  \</**tr**\>\
  \</**table**\>\
  \</**c:if**\>

--------------------------------------------------------------------------------------------------------------------------------------------

### 获取目录及其子目录下的所有文件

> 在开发中，可能需要展示某个文件夹下的所有文件或文件夹的树形结构，下面提供2种方式以供参考。
>
> 下面不对获取的结果做实际处理，只打印输出。

#### 递归方式

##### 原理

> 从最上层目录开始，判断该项是文件还是目录，如果是文件，打印输出；如果是目录，遍历该目录下的所有子项，调用自身继续对该层目录下的所有子项进行判断。。。
>
> 判断完当前层的所有项后，退出本次调用自身的函数回到上一层调用自身的函数，继续判断上一层目录下剩余项，直到将所有项遍历完毕

##### 优缺点

> 该方式适合目录层次不是很深但是同一级别的所有项较多的目录结构
>
> 该方式任意时刻内存中保存的是：当前判断的项和最顶层目录之间每层目录下所有直接子项

##### 代码

----------------------------------------------------
  **public void** getFile(File file){\
  *//判断是否是目录\
  ***if**(file.isDirectory()) {\
  *//获取本层目录下的所有直接子项\
  *File\[\] fileList = file.listFiles();\
  **for** (File f : fileList) {\
  *//对所有子项再做一遍这套逻辑判断\
  *getFile(f);\
  }\
  }\
  **else**{\
  System.***out***.println(file.getAbsolutePath());\
  }\
  }

----------------------------------------------------

#### 队列方式

##### 原理

> 创建1个LinkedList集合
>
> 从最上层目录开始，判断该项是文件还是目录，是文件则打印输出，是目录则将该层目录下的所有子项先放入集合中；每判断完1项，在集合中取出下一个需要判断的子项继续进行判断，直到集合内没有元素
>
> 由于队列具有先进先出的特点，所以该方式会依次判断：第1级的所有项、第2级的所有项、第3级的所有项。。。

##### 优缺点

> 该方式适合目录层次较深但是同一级别的所有项不是很多的目录结构
>
> 该方式任意时刻内存中保存的是：某一级别的所有项中还没有进行判断的项，加上该级别中已经判断为目录的所有直接子项

##### 代码

----------------------------------------------------------
  **public void** getFile(File file) {\
  LinkedList\<File\> list = **new** LinkedList\<File\>();\
  *//将第一级目录放入队列\
  *list.offer(file);\
  **while** (!list.isEmpty()) {\
  *//从队列中取出下一个需要判断的项\
  *File f\_tmp = list.poll();\
  **if** (f\_tmp.isDirectory()) {\
  *//将该项下的所有子项放入队列\
  *File\[\] files = f\_tmp.listFiles();\
  **for** (File f : files) {\
  list.offer(f);\
  }\
  } **else** {\
  System.***out***.println(f\_tmp.getAbsolutePath());\
  }\
  }\
  }

----------------------------------------------------------

### 国际化

#### 定义及作用

> 国际化就是，在页面上选择不同的国家或语言时，可以将页面上固定使用的文本元素替换为对应的语言，例如：菜单栏、导航栏、提示信息等中使用的文本元素，对于程序动态所产生的数据，例如日期、货币等，应该根据所选地区的文化习惯进行显示。
>
> 作用就是，可以提供更友好的访问习惯

#### 文本国际化

1.  ##### 原理

    28. 针对不同地区要显示的信息，都配置到配置文件中

    29. 根据选择的地区cong不同的配置文件中获取信息，展示在页面上

##### 相关概念

###### 资源包

> 对于软件中的菜单栏、导航栏、提示信息等固定的文本信息写在1个properties文件中，根据不同的国家编写不同的properties文件，这一组properties文件称之为1个资源包

###### ResourceBundle

> 在Java API中提供了1个ResourceBundle类用于描述1个资源包，并提供了相应的方法getBundle来根据国家自动获取对应的资源文件来显示

###### 资源文件命名

> 规则：基名\_语言\_国家.properties
>
> 例：
>
> message\_zh\_CN.properties
>
> message\_en\_US.properties
>
> ![](media/image478.png){width="5.768055555555556in" height="1.6979166666666667in"}
>
> 说明：
>
> 在web开发中，一般还会有1个没有语言和国家的properties文件，当找不到需要的国家的版本的内容时，会使用这个文件中的内容，例如：
>
> message.properties
>
> 当需要france（法国）版本的内容时，在所有的配置文件中找不到法国版本的，则会到message.properties文件中找对应的内容使用
>
> 但是在java代码中，当找不到需要的国家的版本的内容时，会使用当前系统地区对应的配置文件中的内容

##### IDEA中配置资源包

###### properties文件乱码

> 为防止使用配置文件时出现中文乱码问题，可以在file-\>setting-\>editor-\>file encodings下，把transparent native-to-ascll conversion勾选上就行了。

###### 配置资源包

30. 资源包一般保存在classpath目录下（就是WEB-INFO下的classes目录），对于IDEA和myeclipse就是src目录

31. 创建文件步骤

    12. src目录右键 NEW Resource Bundle

    13. 在弹出的窗口中填写配置文件基名，下面添加地区/语言

> ![](media/image479.png){width="4.066102362204725in" height="3.28125in"}

14. 生成如下目录及文件

> ![](media/image480.png){width="2.5833333333333335in" height="0.9166666666666666in"}

15. 编辑配置文件

> 对于基名相同，地区不同的文件，随便打开1个即可对该基名下的所有国家的配置文件进行编辑
>
> ![](media/image481.png){width="4.4375in" height="3.878672353455818in"}

##### ResourceBundle

> 该类用于获取资源包中的内容

(1) ###### 获取ResourceBundle对象

    -   根据基名获取

----------------------------------------------------------------------
  ResourceBundle bundle = ResourceBundle.*getBundle*(**\"message\"**);
  ----------------------------------------------------------------------

> 该方法是根据系统的国家选择对应的配置文件

-   根据基名和国家获取

  ------------------------------------------------------------------------
  bundle = ResourceBundle.*getBundle*(**\"message\"**, Locale.***US***);
  ------------------------------------------------------------------------

> 该方法时根据指定的国家选择对应的配置文件

-   例程

  ----------------------------------------------------------------------------
  ResourceBundle bundle = ResourceBundle.*getBundle*(**\"message\"**);\
  System.***out***.println(bundle.getString(**\"msg\"**));\
  bundle = ResourceBundle.*getBundle*(**\"message\"**, Locale.***US***);\
  System.***out***.println(bundle.getString(**\"msg\"**));\
  bundle = ResourceBundle.*getBundle*(**\"message\"**,Locale.***FRANCE***);\
  System.***out***.println(bundle.getString(**\"msg\"**));

  ----------------------------------------------------------------------------

> 结果：
>
> ![](media/image482.png){width="1.0625in" height="0.7604166666666666in"}
>
> 说明：
>
> 上面代码是纯java程序，所以第3行打印"你好世界"，如果这段代码运行在web开发中，第3行则会打印"hello word"
>
> 对于获取法国对应的配置文件，因为找不到，所以会找其他版本中的内容：

-   在Java程序中，会找当前系统国家对应的配置文件

-   在web开发中，会找"message.properties"

###### API

####### getBundle

> 参见：[[获取ResourceBundle对象]{.underline}](#获取resourcebundle对象)
>
> 第2个参数也可以是Locale对象，例：

-------------------------------------------------------------------------------------------------------------
  ResourceBundle bundle = ResourceBundle.*getBundle*(**\"message\"**, **new** Locale(**\"zh\"**,**\"CN\"**));
  -------------------------------------------------------------------------------------------------------------

####### getString

> 语法：String getString(String key)
>
> 功能：获取配置文件中指定key对应的value
>
> 参数： key：指定的key
>
> 返回值：指定key对应的value

##### 例程

###### 用户选择语言（脚本）

####### 配置资源包

> ![](media/image483.png){width="5.768055555555556in" height="0.7013888888888888in"}

####### jsp

------------------------------------------------------------------------------------------------------
  \<**html**\>\
  **\<%\
  **String country = request.getParameter(**\"country\"**);\
  ResourceBundle bundle = **null**;\
  **if** (**\"us\"**.equals(country)) {\
  bundle = ResourceBundle.*getBundle*(**\"message\"**, Locale.***US***);\
  } **else** {\
  bundle = ResourceBundle.*getBundle*(**\"message\"**, Locale.***CHINA***);\
  }\
  **%\>\
  **\<**head**\>\
  \<**title**\>**\<%=**bundle.getString(**\"title\"**)**%\>**\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  \<**form action=\"\${**pageContext.request.contextPath**}/login1.jsp\" id=\"f\" method=\"post\"**\>\
  \<**select name=\"country\" onchange=\"***change*()**\"**\>\
  \<**option**\>\-\--请选择\-\--\</**option**\>\
  \<**option value=\"china\"**\>中国\</**option**\>\
  \<**option value=\"us\"**\>US\</**option**\>\
  \</**select**\>\<**br**\>\
  **\<%=**bundle.getString(**\"username\"**)**%\>**:\<**input type=\"text\"**\>\<**br**\>\
  **\<%=**bundle.getString(**\"password\"**)**%\>**:\<**input type=\"password\"**\>\<**br**\>\
  \</**form**\>\
  \</**body**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *change*() {\
  **document**.getElementById(**\"f\"**).submit();\
  }\
  \</**script**\>\
  \</**html**\>

------------------------------------------------------------------------------------------------------

####### 解析

> 该方式思路是，当用户选择国家下拉框时，触发onchange事件，调用change函数，将用户选择的国家重新提交到本页面，然后通过脚本代码获取到参数country的值，通过该值获取对应的国家对应的ResourceBundle对象，下面展示的文本内容均取自该对象。

###### 自动根据浏览器语言选择展示语言（脚本）

####### 原理

> 浏览器中有一项关于语言的设置如下：
>
> ![](media/image484.png){width="5.0169127296587925in" height="2.5in"}
>
> 上图中语言的顺序，就是请求头中Accept-Language的值：
>
> ![](media/image485.png){width="4.041666666666667in" height="1.1145833333333333in"}

可以把Accept-Language请求头中第一个语言当作用户选择的语言

####### 配置资源包

> 同：[[配置资源包]{.underline}](#配置资源包-1)

####### jsp

------------------------------------------------------------------------------------------------------------
  \<**html**\>\
  **\<%\
  **String language = request.getHeader(**\"accept-language\"**);\
  *//以中文为例：zh-CN\
  *language = language.substring(0,language.indexOf(**\",\"**));\
  *//zh，CN\
  *String\[\] strs = language.split(**\"-\"**);\
  ResourceBundle bundle = ResourceBundle.*getBundle*(**\"message\"**, **new** Locale(strs\[0\],strs\[1\]));\
  **%\>\
  **\<**head**\>\
  \<**title**\>**\<%=**bundle.getString(**\"title\"**)**%\>**\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  **\<%=**bundle.getString(**\"username\"**)**%\>**:\<**input type=\"text\"**\>\<**br**\>\
  **\<%=**bundle.getString(**\"password\"**)**%\>**:\<**input type=\"password\"**\>\<**br**\>\
  \</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------------------------

###### fmt国际化标签

> fmt国际化标签的使用参见[[fmt国际化标签]{.underline}](#fmt国际化标签)

------------------------------------------------------------------------------------------------------------
  \<%@**taglib prefix**=\"**fmt**\" **uri**=\"**http://java.sun.com/jsp/jstl/fmt**\" %\>\
  \<**html**\>\
  *\<!\-- 创建Locale对象，Locale构造方法参数为"zh-CN"，作用范围为本页 \--\>\
  *\<**fmt:setLocale value=\"en-US\" scope=\"page\"**/\>\
  *\<!\-- 根据资源包基名message创建ResourceBundle对象bundle，作用范围为本页 \--\>\
  *\<**fmt:setBundle basename=\"message\" var=\"bundle\" scope=\"page\"**/\>\
  \<**head**\>\
  *\<!\-- 通过bundle对象获取title属性的值 \--\>\
  *\<**title**\>\<**fmt:message bundle=\"\${**bundle**}\" key=\"title\"**/\> \</**title**\>\
  \</**head**\>\
  \<**body**\>\
  \<**fmt:message bundle=\"\${**bundle**}\" key=\"username\"**/\>:\<**input type=\"text\"**\>\<**br**\>\
  \<**fmt:message bundle=\"\${**bundle**}\" key=\"password\"**/\>:\<**input type=\"password\"**\>\<**br**\>\
  \</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------------------------

#### 日期国际化

> 日期国际化使用DateFormat类实现，DateFormat类可以使用format方法将日期对象转换为指定格式的字符串，也可以使用parse方法将指定格式的字符串解析为Date对象。
>
> 指定的格式，就是由DateFormat抽象类创建时决定的，他可以根据指定的日期类型、时间类型、国家来创建

##### DateFormat对象创建

> DateFormat时抽象类，不能直接new对象，它有9种方法创建对象：

------------------------------------------------------------------------------------------------------------------
  *//1.日期格式化对象，日期格式、国家均使用默认值\
  *DateFormat df1 = DateFormat.*getDateInstance*();\
  *//2.日期格式化对象，指定日期格式，国家使用默认值\
  *DateFormat df2 = DateFormat.*getDateInstance*(DateFormat.***FULL***);\
  *//3.日期格式化对象，指定日期格式和国家\
  *DateFormat df3 = DateFormat.*getDateInstance*(DateFormat.***FULL***, Locale.***US***);\
  *//4.时间格式化对象，时间合适、国家均使用默认值\
  *DateFormat df4 = DateFormat.*getTimeInstance*();\
  *//5.时间格式化对象，指定时间和格式，国家使用默认值\
  *DateFormat df5 = DateFormat.*getTimeInstance*(DateFormat.***FULL***);\
  *//6.时间格式化对象，指定时间格式和国家\
  *DateFormat df6 = DateFormat.*getTimeInstance*(DateFormat.***FULL***,Locale.***US***);\
  *//7.时间日期格式化对象，日期格式、时间格式和国家均使用默认值\
  *DateFormat df7 = DateFormat.*getDateTimeInstance*();\
  *//8.时间日期格式化对象，指定日期格式和时间格式，国家使用默认值\
  *DateFormat df8 = DateFormat.*getDateTimeInstance*(DateFormat.***FULL***,DateFormat.***FULL***);\
  *//9.时间日期格式化对象，指定日期合适、时间格式和国家\
  *DateFormat df9 = DateFormat.*getDateTimeInstance*(DateFormat.***FULL***,DateFormat.***FULL***,Locale.***US***);

------------------------------------------------------------------------------------------------------------------

> 日期国际化时，可以使用指定国家的方法来创建需要的DateFormat对象，然后就可以转换成不同国家的日期字符串，或者将指定国家的格式化日期字符串转换为Date对象

##### format

> format方法可以将日期转换为指定格式的字符串

+------------------------------------------------------------------------------------------------------------------+
| DateFormat df9 = DateFormat.*getDateTimeInstance*(DateFormat.***FULL***,DateFormat.***FULL***,Locale.***US***);\ |
| Date date = **new** Date();                                                                                      |
|                                                                                                                  |
| System.***out***.println(df9.format(date));                                                                      |
+------------------------------------------------------------------------------------------------------------------+

##### parse

> parse方法可以将符合指定格式要求的字符串解析为Date对象，但是如果字符串格式不符合DateFormat对象指定的格式，则会产生异常，解析失败

------------------------------------------------------------------------------------------------------------------
  DateFormat df9 = DateFormat.*getDateTimeInstance*(DateFormat.***FULL***,DateFormat.***FULL***,Locale.***US***);\
  String date\_str = **\"Friday, January 26, 2018 11:06:33 PM CST\"**;\
  System.***out***.println(df9.parse(date\_str));

------------------------------------------------------------------------------------------------------------------

#### 货币国际化

-------------------------------------------------------------------------
  NumberFormat nf = NumberFormat.*getCurrencyInstance*(Locale.***UK***);\
  System.***out***.println(nf.format(100));

-------------------------------------------------------------------------

#### 动态文本格式化

> MessageFormat可以对1个模板中的信息进行动态赋值

例：

> 模板："{0} is my {1}"
>
> 其中{0}和{1}是占位符，可以被替换为任意字符串，得到新的字符串

##### 占位符说明

> 占位符有3种写法：

-   {index}

-   {index，type}

-   {index，type，style}

> 参数说明：
>
> index：
>
> 0-9之间的数字，表示要格式化对象数据在参数数组中的索引

type：

参数的格式化类型

style：

> 格式化的样式，他的值必须是与格式化类型相匹配的合法模式、或表示合法模式的字符串

参数可取值参见下表：

![](media/image486.png){width="5.057620297462817in" height="3.1145833333333335in"}

##### MessageFormat使用

###### 入门

----------------------------------------------------------------------------------
  String mode = **\"{0} is my {1}\"**;\
  System.***out***.println(MessageFormat.*format*(mode,**\"Jie\"**,**\"wife\"**));

----------------------------------------------------------------------------------

###### 进阶

-------------------------------------------------------------------------------------------------------------------------
  String msg = **\"At {0,time,short} on {0,date,long},a thief take {1,number,integer} phone and {2,number,currency}\"**;\
  Calendar c = Calendar.*getInstance*();\
  c.set(2017,2,4,12,31);\
  Date date = c.getTime();\
  MessageFormat mf = **new** MessageFormat(msg,Locale.***US***);\
  String value = mf.format(**new** Object\[\]{date,99,10000});\
  System.***out***.println(value);

-------------------------------------------------------------------------------------------------------------------------

## ajax

### 定义

1)  #### ajax

    1.  ajax全称：Asynchronus JavaScript And XML，就是"异步JavaScript和XML"
    
    2.  ajax是一种用于创建快速动态网页的技术

> 案例：

1.  百度地图

> 用户点击放大，自动加载放大部分地图

2.  登陆页面

> 用户输入完用户名后，直接会给出用户名是否可用

#### 异步

32. 传统方式

> 浏览器向后台提交数据，必须跳转到新页面或刷新页面才能提交，再提交过程中只能等待

33. ajax方式

> 浏览器内置了ajax引擎，用户在当前页面的一些事件触发后，浏览器向ajax引擎提交了1个请求，ajax引擎自动将请求发送给服务器，服务器响应后将响应交给ajax引擎，ajax引擎直接将结果显示在当前页面上
>
> 例如：在登陆页面用户输入完毕后，触发对应的事件，该事件将触发1个函数将请求发送给ajax引擎，再转发给服务器，再将响应通过ajax引擎显示在当前页面上，用户没有刷新页面，就能知道该用户名是否可用，已经输入的信息不会因为刷新页面丢失

### 入门

#### 开发步骤

> ajax核心就是：XMLHttpRequest对象

1.  ##### 得到XMLHttpRequest对象

    1.  针对现代浏览器及IE7以上版本浏览器

-----------------------------------------
  ***xmlhttp***=**new** XMLHttpRequest();
  -----------------------------------------

2.  针对IE5、IE6

  -----------------------------------------------------
  *xmlhttp*=new ActiveXObject(\"Microsoft.XMLHTTP\");
  -----------------------------------------------------

3.  兼容以上两种情况的浏览器

  -----------------------------------------------------------------
  \<**script type=\"text/javascript\"**\>\
  **var *xmlhttp ***= **null**;\
  **if**(**window**.XMLHttpRequest){\
  *//现代浏览器\
  **xmlhttp***=**new** XMLHttpRequest();\
  }**else if**(**window**.ActiveXObject){\
  *//IE5、IE6\
  **xmlhttp***=**new** ActiveXObject(**\"Microsoft.XMLHTTP\"**);\
  }\
  \</**script**\>

  -----------------------------------------------------------------

##### 注册回调函数

> readyState属性改变时，会自动执行该回调函数

------------------------------------------------------
  ***xmlhttp***.onreadystatechange=**function** () {};
  ------------------------------------------------------

##### open

> 语法：open(method, url, async, username, password)
>
> 功能：该操作用于初始化请求方式和url，但是并不会立即发送请求
>
> 参数：
>
> method：请求方式："POST"或"GET"
>
> url：请求的url
>
> async：true：异步（默认）；false：同步。（该参数一般不使用）
>
> username：用户名（该参数一般不使用）
>
> password：密码（该参数一般不使用）
>
> 例：

------------------------------------------------------
  ***xmlhttp***.open(**\"GET\"**,**\"/ajax/ajax1\"**);
  ------------------------------------------------------

##### send

> 语法：send(param)
>
> 功能：发送请求
>
> 参数：
>
> param：请求参数:
>
> null代表没有参数；
>
> 如果有参数可以写成："username=tom&password=123"

##### 数据处理

> 由于回调函数是readyState属性改变即调用，但是一般我们只需要接收到响应并且响应成功才调用，所以需要在回调函数中进行判断
>
> 然后将获取到的数据进行处理

--------------------------------------------------------------------------------
  ***xmlhttp***.onreadystatechange=**function** () {\
  **if**((***xmlhttp***.**readyState**==4) && (***xmlhttp***.**status**==200)){\
  *//显示返回的文本内容\
  *alert(***xmlhttp***.**responseText**);\
  }\
  };

--------------------------------------------------------------------------------

#### 完整案例代码

--------------------------------------------------------------------------------
  \<**script type=\"text/javascript\"**\>\
  **var *xmlhttp ***= **null**;\
  **if**(**window**.XMLHttpRequest){\
  *//现代浏览器\
  **xmlhttp***=**new** XMLHttpRequest();\
  }**else if**(**window**.ActiveXObject){\
  *//IE5、IE6\
  **xmlhttp***=**new** ActiveXObject(**\"Microsoft.XMLHTTP\"**);\
  }\
  ***xmlhttp***.onreadystatechange=**function** () {\
  **if**((***xmlhttp***.**readyState**==4) && (***xmlhttp***.**status**==200)){\
  *//显示返回的文本内容\
  *alert(***xmlhttp***.**responseText**);\
  }\
  };\
  ***xmlhttp***.open(**\"GET\"**,**\"/ajax/ajax1\"**);\
  ***xmlhttp***.send(**null**);\
  \</**script**\>

--------------------------------------------------------------------------------

### 请求参数设置

#### get方式

> get方式的参数设置直接在url中拼接字符串就可以

----------------------------------------------------------------
  ***xmlhttp***.open(**\"GET\"**,**\"/ajax/ajax1?name=tom\"**);\
  ***xmlhttp***.send(**null**);

----------------------------------------------------------------

#### post方式

> post方式的请求参数需要通过send函数的参数进行设置，但是需要按顺序执行如下步骤（顺序不能错）：

-   open函数初始化请求方式和url

-   设置请求头content-type，值为"application/x-www-form-urlencoded"

-   send函数设置请求参数并发送请求

> 例：

--------------------------------------------------------------------------------------------------
  ***xmlhttp***.open(**\"post\"**,**\"/ajax/ajax1\"**);\
  ***xmlhttp***.setRequestHeader(**\"content-type\"**,**\"application/x-www-form-urlencoded\"**);\
  ***xmlhttp***.send(**\"name=shelly\"**);

--------------------------------------------------------------------------------------------------

### XMLHttpRequest

#### 属性

##### readyState

> 该属性代表XMLHttpRequest对象的状态
>
> ![](media/image487.png){width="5.768055555555556in" height="1.5673611111111112in"}

##### status

> 服务器返回的HTTP状态码，如200表示成功

##### onreadystatechange

> 用于存储回调函数的属性
>
> readyState属性发生改变时，会自动调用该属性指向的回调函数

##### responseText

> 响应回来的文本内容，接受json字符串传递数据时，使用该属性获取接收到的文本
>
> 使用该属性时，mimeType头必须设置为"text/html"，方法有2种：

-   服务器端设置

> response.setContentType(**\"text/html;charset=utf-8\"**);

-   浏览器端

> xmlhttp.overrideMimeType(**\"text/html;charset=utf-8\"**);

获取到XMLHttpRequest对象后，强制将mimeType响应头覆盖掉

例程参见[[最终版]{.underline}](#最终版)

##### responseXML

> 响应回来的xml，接收xml对象传递数据时，使用该属性获取接收到的xml对象
>
> 使用该属性时，mimeType头必须设置为"text/xml"，否则返回值永远为null。
>
> 设置mimeType响应头方法有2种：

-   服务器端设置

> response.setContentType(**\"text/xml;charset=utf-8\"**);

-   浏览器端

> xmlhttp.overrideMimeType(**\"text/xml;charset=utf-8\"**);

获取到XMLHttpRequest对象后，强制将mimeType响应头覆盖掉

#### 函数

##### 创建对象

> 参见[[得到XMLHttpRequest对象]{.underline}](#得到xmlhttprequest对象)

##### open

> 参见[[open]{.underline}](#open-1)

##### send

> 参见[[send]{.underline}](#send)

##### setRequestHeader

> 语法：setRequestHeader（header，value）
>
> 功能：设置请求头
>
> 参数： header：请求头名称
>
> value：请求头的值
>
> 例：

-------------------------------------------------------------------------------------------------
  ***xmlhttp***.setRequestHeader(**\"content-type\"**,**\"application/x-www-form-urlencoded\"**);
  -------------------------------------------------------------------------------------------------

### 使用文本传输数据

#### 原理

> 浏览器使用ajax向后台请求数据时，后台返回的数据均当做文本进行处理，可以当做字符串直接进行展示或自己解析；如果返回的是json字符串，也可以使用eval函数转换为js对象的数组进行使用
>
> 后台返回的文本内容，可以是自己组装html代码、json字符串，但是需要设置mimeType头为"text/html"，参见[[responseText]{.underline}](#responsetext)
>
> 传输的json数据，可以使用jsonlib工具将java对象转换为json字符串，参见[[json]{.underline}](#json)

#### 案例

##### 需求

> ![](media/image488.png){width="5.768055555555556in" height="0.7833333333333333in"}
>
> 点击"显示商品信息"，在下方展示出商品信息

##### 实现

###### 基础版

####### 思路

> 超链接禁用跳转，点击事件执行javascript函数，在函数中通过XMLHttpRequest对象向后台请求数据
>
> 后台接到请求后，将数据组装成html代码，再返回到html页面
>
> 页面接收到数据后，将返回的内容直接显示到span标签内

####### 代码

-   html

  ------------------------------------------------------------------------------------------------------
  \<**body**\>\
  \<**a href=\"javascript:void(0)\" onclick=\"***showGoods*()**\"**\>显示商品信息\</**a**\>\<**br**\>\
  \<**hr**/\>\
  \<**span id=\"span1\"**\>\</**span**\>\
  \</**body**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *showGoods*() {\
  **var** xmlhttp = **null**;\
  **if** (**window**.XMLHttpRequest) {\
  xmlhttp = **new** XMLHttpRequest();\
  } **else if** (**window**.ActiveXObject) {\
  xmlhttp = **new** ActiveXObject(**\"Microsoft.XMLHTTP\"**);\
  }\
  xmlhttp.onreadystatechange = **function** () {\
  **if** ((xmlhttp.**readyState** == 4) && (xmlhttp.**status** == 200)) {\
  **var** div1 = **document**.getElementById(**\"span1\"**);\
  div1.**innerHTML** = xmlhttp.**responseText**;\
  }\
  };\
  xmlhttp.open(**\"post\"**, **\"/ajax/ajax2\"**);\
  xmlhttp.setRequestHeader(**\"content-type\"**, **\"application/x-www-form-urlencoded\"**);\
  xmlhttp.send(**null**);\
  }\
  \</**script**\>

  ------------------------------------------------------------------------------------------------------

-   servlet

  ------------------------------------------------------------------------------------------------------------------------------------------------
  response.setContentType(**\"text/html;charset=utf-8\"**);\
  List\<goods\> list = **new** ArrayList\<goods\>();\
  list.add(**new** goods(**\"1\"**,**\"iphone X\"**,**\"10000\"**));\
  list.add(**new** goods(**\"2\"**,**\"iphone 8\"**,**\"8000\"**));\
  list.add(**new** goods(**\"3\"**,**\"iphone 7\"**,**\"6000\"**));\
  String value;\
  value = **\"\<table border=\\\"1\\\" align=\\\"center\\\" width=\\\"80%\\\"\>\"**;\
  value += **\"\<tr\>\<td\>编号\</td\>\<td\>商品\</td\>\<td\>价格\</td\>\</tr\>\"**;\
  **for**(goods item:list){\
  value += **\"\<tr\>\<td\>\"**+item.getId()+**\"\</td\>\<td\>\"**+item.getName()+**\"\</td\>\<td\>\"**+item.getPrice()+**\"\</td\>\</tr\>\"**;\
  }\
  value+=**\"\</table\>\"**;\
  response.getWriter().write(value);

  ------------------------------------------------------------------------------------------------------------------------------------------------

###### 增强版

####### 思路

> 由于jsp的本质就是servlet，他的原理就是使用类似于html的标记语言编写页面，然后将jsp页面的内容通过response对象输出到真正的页面上，所以在基础版的基础上我们可以作如下更改。
>
> 我们可以在后台将数据封装成javaBean的list集合，然后转发到1个jsp页面，在jsp页面将数据使用标记语言进行封装成需要展示的效果，这样响应回去时，封装后的效果就会被插入到span标签内

####### 代码

6.  html

> 代码同[[基础版]{.underline}](#基础版)中的html代码

7.  servlet

  -------------------------------------------------------------------------------
  response.setContentType(**\"text/html;charset=utf-8\"**);\
  List\<goods\> list = **new** ArrayList\<goods\>();\
  list.add(**new** goods(**\"1\"**,**\"iphone X\"**,**\"10000\"**));\
  list.add(**new** goods(**\"2\"**,**\"iphone 8\"**,**\"8000\"**));\
  list.add(**new** goods(**\"3\"**,**\"iphone 7\"**,**\"6000\"**));\
  request.setAttribute(**\"list\"**,list);\
  request.getRequestDispatcher(**\"/product.jsp\"**).forward(request,response);

  -------------------------------------------------------------------------------

8.  jsp

> 该页面内只有要嵌入到span标签内的内容，不可以有html、head、body等标签

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<%@**taglib prefix**=\"**c**\" **uri**=\"**http://java.sun.com/jsp/jstl/core**\" %\>\
  \
  \<**table border=\"1\" align=\"center\" width=\"80%\"**\>\
  \<**tr**\>\
  \<**td**\>ID\</**td**\>\
  \<**td**\>商品\</**td**\>\
  \<**td**\>价格\</**td**\>\
  \</**tr**\>\
  \<**c:forEach items=\"\${**list**}\" var=\"item\"**\>\
  \<**tr**\>\
  \<**td**\>**\${**item.id**}**\</**td**\>\
  \<**td**\>**\${**item.name**}**\</**td**\>\
  \<**td**\>**\${**item.price**}**\</**td**\>\
  \</**tr**\>\
  \</**c:forEach**\>\
  \</**table**\>

------------------------------------------------------------------------------------------

###### 最终版

####### 思路

> 现在浏览器端电脑配置都已经很高了，所以将工作尽量放到浏览器端去做，服务器端只负责返回数据，浏览器端对数据封装成需要展示的效果
>
> 但是setAttribute方法只是用与在jsp中封装数据，所以这里使用json字符串将数据返回。

a)  ####### 代码

    4.  html

-------------------------------------------------------------------------------------------------------------------------------------------------
  \<**body**\>\
  \<**a href=\"javascript:void(0)\" onclick=\"***showGoods*()**\"**\>显示商品信息\</**a**\>\<**br**\>\
  \<**hr**/\>\
  \<**span id=\"span1\"**\>\</**span**\>\
  \</**body**\>\
  \<**script type=\"text/javascript\"**\>\
  **function** *showGoods*() {\
  **var** xmlhttp = **null**;\
  **if** (**window**.XMLHttpRequest) {\
  xmlhttp = **new** XMLHttpRequest();\
  } **else if** (**window**.ActiveXObject) {\
  xmlhttp = **new** ActiveXObject(**\"Microsoft.XMLHTTP\"**);\
  }\
  xmlhttp.onreadystatechange = **function** () {\
  **if** ((xmlhttp.**readyState** == 4) && (xmlhttp.**status** == 200)) {\
  **var** json = eval(xmlhttp.**responseText**);\
  **var** str = **\"\<table border=\'1\' align=\'center\' width=\'80%\'\>\<tr\>\<td\>ID\</td\>\<td\>商品\</td\>\<td\>价格\</td\>\</tr\>\"**;\
  **for**(**var** i=0;i\<json.**length**;i++){\
  str+=**\"\<tr\>\<td\>\"**+json\[i\].**id**+**\"\</td\>\<td\>\"**+json\[i\].**name**+**\"\</td\>\<td\>\"**+json\[i\].price+**\"\</td\>\</tr\>\"\
  **}\
  str += **\"\</table\>\"\
  var** div1 = **document**.getElementById(**\"span1\"**);\
  div1.**innerHTML** = str;\
  }\
  };\
  xmlhttp.open(**\"post\"**, **\"/ajax/ajax2\"**);\
  xmlhttp.setRequestHeader(**\"content-type\"**, **\"application/x-www-form-urlencoded\"**);\
  xmlhttp.send(**null**);\
  }\
  \</**script**\>

-------------------------------------------------------------------------------------------------------------------------------------------------

5.  servlet

  ---------------------------------------------------------------------
  response.setContentType(**\"text/html;charset=utf-8\"**);\
  List\<goods\> list = **new** ArrayList\<goods\>();\
  list.add(**new** goods(**\"1\"**,**\"iphone X\"**,**\"10000\"**));\
  list.add(**new** goods(**\"2\"**,**\"iphone 8\"**,**\"8000\"**));\
  list.add(**new** goods(**\"3\"**,**\"iphone 7s\"**,**\"6000\"**));\
  *//转换为json\
  *JSONArray json = JSONArray.*fromObject*(list);\
  response.getWriter().write(json.toString());

  ---------------------------------------------------------------------

### 使用xml传输数据

#### 原理

> 浏览器使用ajax向后台请求数据时，如果后台返回的是xml，浏览器可以使用[[responseXML]{.underline}](#responsexml)属性接收响应的xml，然后当做document对象使用，来获取需要的节点的内容
>
> 后台返回的xml，可以是直接将xml文件通过response的outputSrtea输出流直接输出到前端；如果想将Java对象转换为xml响应给前端，则需要使用[[xstream]{.underline}](#xstream)工具将java对象转换为xml再响应回去
>
> 使用xml传输数据时，必须设置mimeType头为"text/html"，参见[[responseXML]{.underline}](#responsexml)

#### xstream

##### jar包

> ![](media/image489.png){width="1.6247965879265092in" height="0.5207677165354331in"}

##### XML与java对象转换

> 参见[[toXml]{.underline}](#toxml)和[[fromXml]{.underline}](#fromxml)

##### xstream注解

> xstream注解的目的是实现API中方法要做的事的另一种实现方式，每种注解的功能都能在API中找到对应的方法，使用注解或者API中函数，哪种方式都可以
>
> 注解需要调用[[autodetectAnnotations]{.underline}](#autodetectannotations)方法使注解生效

###### \@XStreamAlias(别名)

> 功能：对类和变量使用别名
>
> 说明：作用同[[alias]{.underline}](#alias)和[[aliasField]{.underline}](#aliasfield)
>
> 例：
>
> ![](media/image490.png){width="2.333041338582677in" height="0.5624300087489064in"}

###### \@XStreamAsAttribute

> 功能：将子元素设置成父元素的属性，而非子节点
>
> 说明：作用同[[useAttributeFor]{.underline}](#useattributefor)
>
> 例：
>
> ![](media/image491.png){width="1.895596019247594in" height="0.49993766404199474in"}

###### @ XStreamOmitField

> 功能：设置变量不生成到XML，忽略该变量
>
> 例：
>
> ![](media/image492.png){width="1.9997495625546806in" height="0.4791065179352581in"}

###### XStreamImplicit(itemFieldName = "别名")

> 功能： 去除集合变量节点，将集合内的内容平铺到集合变量节点所在层进行展示
>
> 说明：
>
> "(itemFieldName = "别名")"这部分内容可以省略，由于集合内均是相同类型的对象，该部分表示的是为集合内的对象起1个相同的别名
>
> 例：

-   不使用该注解

> ![](media/image493.png){width="2.9054768153980755in" height="0.53125in"}
>
> 转换效果：
>
> ![](media/image494.png){width="1.910676946631671in" height="1.5104166666666667in"}

-   使用该注解不使用"itemfieldName"别名

> ![](media/image495.png){width="3.2291666666666665in" height="0.7151848206474191in"}
>
> 转换效果：list集合变量标签被省略
>
> ![](media/image496.png){width="2.0043339895013124in" height="1.2708333333333333in"}

-   使用该注解和itemFieldName别名

> ![](media/image497.png){width="3.1810017497812773in" height="0.71875in"}
>
> 转换效果：list集合变量被忽略，并且集合内的对象均使用别名city
>
> ![](media/image498.png){width="1.96875in" height="1.259666447944007in"}

##### API

###### toXml

> 语法：String toXml(Object obj)
>
> 功能：将java对象转换为xml
>
> 参数： obj：待转换的java对象
>
> 返回值：String：转换成xml后的文本内容
>
> 例：

--------------------------------------------------------------
  List\<City\> jlCityList = **new** ArrayList\<City\>();\
  jlCityList.add(**new** City(**\"长春\"**));\
  jlCityList.add(**new** City(**\"吉林\"**));\
  jlCityList.add(**new** City(**\"农安\"**));\
  Province jilin = **new** Province(**\"吉林\"**,jlCityList);\
  XStream xs = **new** XStream();\
  String chinaXml = xs.toXML(jilin);\
  System.***out***.println(chinaXml);

--------------------------------------------------------------

> 效果：
>
> ![](media/image499.png){width="1.8229166666666667in" height="2.5322233158355205in"}

###### fromXml

> 语法：该函数有多个重载方法
>
> ![](media/image500.png){width="4.010416666666667in" height="1.3295002187226597in"}
>
> 功能：将xml字符串、文件等转换为java对象
>
> 例：

-   xml字符串转java对象

  --------------------------------------------------------
  Province jlProvince = (Province) xs.fromXML(chinaXml);
  --------------------------------------------------------

###### alias

> 语法：void alias(String name, Class type)
>
> 功能：设置类别名
>
> 如[[toXml]{.underline}](#toxml)中的例程，类在转换为xml中的节点时，会使用类的全路径作为这个节点的标签名，为了防止使用全路径，可以使用该方法设置类的别名
>
> 参数： name：别名
>
> type：类的class属性，如：Person.class
>
> 例：

------------------------------------------------
  xs.alias(**\"Province\"**,Province.**class**);
  ------------------------------------------------

###### aliasField

> 语法：void aliasField(String alias, Class definedIn, String fieldName)
>
> 功能：设置类的成员变量的别名
>
> 参数： alias：别名
>
> definedIn：要设置成员变量别名的类的class属性
>
> fieldname：成员变量名
>
> 说明：
>
> 如果设置的成员变量是1个类的对象时，则使用alias设置的类的别名要与这里设置的该成员变量的别名相同，否则该成员变量的子成员变量的转换会存在问题。

例：

------------------------------------------------------------------------------------
  *//设置City类的别名为City\
  *xs.alias(**\"City\"**,City.**class**);\
  *//设置Province类下的City类型的成员变量city的别名City，该别名要与City类的别名相同\
  *xs.aliasField(**\"City\"**,Province.**class**,**\"city\"**);

------------------------------------------------------------------------------------

###### useAttributeFor

> 语法：void useAttributeFor(Class definedIn, String fieldName)
>
> 功能：将子元素设置成父元素的属性，而非子节点
>
> 参数： definedIn：父元素转换前的类的class属性
>
> fieldname：需要设置为属性的成员变量
>
> 例：

------------------------------------------------------
  xs.useAttributeFor(Province.**class**,**\"name\"**);
  ------------------------------------------------------

###### aliasAttribute

> 语法：
>
> ![](media/image501.png){width="4.979166666666667in" height="0.3944488188976378in"}
>
> 功能：
>
> 设置属性的别名；第一种是将所有节点的该属性设置为该别名；第2种是将指定类下的该属性设置为该别名

参数： alias：别名

definedIn：指定哪个类

attributeName：属性名

例：将Province类下的name属性使用别名Name

------------------------------------------------------------------
  xs.aliasAttribute(Province.**class**,**\"name\"**,**\"Name\"**);
  ------------------------------------------------------------------

###### autodetectAnnotations

> 语法：autodetectAnnotations(Boolean mode)
>
> 功能：设置是否生效注解
>
> 参数：mode：true：注解生效；false：注解失效
>
> 例：

-------------------------------------
  xs.autodetectAnnotations(**true**);
  -------------------------------------

## json

### 定义

> json是一种轻量级的数据格式，本质就是按一定格式书写的字符串

### 格式

> 对于json数据，只有两种基本格式

#### 数组

> 格式：\[ 值1，值2，值3 \]
>
> 说明：这就是javascript中的数组

#### js对象

> 格式：{"key1":"value1", "key2":"value2"}
>
> 说明：这就是javascript中的js对象

#### 嵌套

> 对于json数据，只有数组、js对象这两种基本格式，但是这两种格式可以嵌套来达到类似于如下效果：
>
> \[{"key1":"value1", "key2":"value2"},{"key1":"value1", "key2":"value2"}\]

### 使用

#### javascript

在js中，可以使用eval内置函数，将json字符串转换为js对象的数组

但是responseText转换为json时，直接进行转换有时会转换失败，返回null，所以一般将左右加上括号，这样一定能转换成功

-------------------------------------------------------------------------------------------------------------------------------------------------
  **var** json = eval(**\"(\"**+xmlhttp.**responseText**+**\")\"**);\
  **var** str = **\"\<table border=\'1\' align=\'center\' width=\'80%\'\>\<tr\>\<td\>ID\</td\>\<td\>商品\</td\>\<td\>价格\</td\>\</tr\>\"**;\
  **for**(**var** i=0;i\<json.**length**;i++){\
  str+=**\"\<tr\>\<td\>\"**+json\[i\].**id**+**\"\</td\>\<td\>\"**+json\[i\].**name**+**\"\</td\>\<td\>\"**+json\[i\].price+**\"\</td\>\</tr\>\"\
  **}\
  str += **\"\</table\>\"**

-------------------------------------------------------------------------------------------------------------------------------------------------

#### java

> java对象与json字符串之间的互相转换需要使用jsonlib工具

##### jsonlib工具包

> ![](media/image502.png){width="2.2708333333333335in" height="1.4375in"}
>
> 使用jsonlib时，这些包都是需要使用的，其他包是jsonlib的依赖包

##### java对象转json

> 在java对象转换为json时，需要分为以下两种情况：

-   对于数组、List集合使用

> JSONArray.fromObject(Object obj)方法
>
> 即使集合或数组中存储的时javaBean，也需要使用该方法
>
> 该对象得到的最外层一定是如下格式：\[ , , \]

---------------------------------------------------------------------
  List\<goods\> list = **new** ArrayList\<goods\>();\
  list.add(**new** goods(**\"1\"**,**\"iphone X\"**,**\"10000\"**));\
  list.add(**new** goods(**\"2\"**,**\"iphone 8\"**,**\"8000\"**));\
  list.add(**new** goods(**\"3\"**,**\"iphone 7\"**,**\"6000\"**));\
  *//转换为json\
  *JSONArray.*fromObject*(list);

---------------------------------------------------------------------

-   对于javaBean、Map集合

> JSONObject.fromObject(Object obj)方法
>
> 该对象得到的最外层一定是如下格式：{ , , }

----------------------------------------------------------------------
  goods gd = **new** goods(**\"1\"**,**\"iPhone X\"**,**\"10000\"**);\
  *//转换为json\
  *JSONObject.*fromObject*(gd);

----------------------------------------------------------------------

对于转换为json时使用哪种方法，只需要看最外层是什么，符合上面哪种条件即可

##### JsonConfig

###### 不包含某属性

> 在将javaBean或带有JavaBean的list集合转换为json时，如果不想包含某属性，需要使用JsonConfig

---------------------------------------------------------------------
  List\<goods\> list = **new** ArrayList\<goods\>();\
  list.add(**new** goods(**\"1\"**,**\"iphone X\"**,**\"10000\"**));\
  list.add(**new** goods(**\"2\"**,**\"iphone 8\"**,**\"8000\"**));\
  list.add(**new** goods(**\"3\"**,**\"iphone 7\"**,**\"6000\"**));\
  *//创建JsonConfig对象\
  *JsonConfig config = **new** JsonConfig();\
  *//设置不包含的属性\
  *config.setExcludes(**new** String\[\]{**\"type\"**});\
  *//转换为json\
  *JSONArray.*fromObject*(list,config);

---------------------------------------------------------------------

# SSH框架

## struts2

1.  ### 介绍

    1.  struts2框架是1套标准的MVC框架

> M :action
>
> V :jsp
>
> C :action、StrutsPrepareAndExecuteFilter

2.  struts2框架是实现了部分功能的代码，使用它可以简化软件开发，提高开发效率

3.  本章使用struts2的2.3.15版本，其他版本使用时会有不同

### 入门

#### 新建struts2项目

-   新建工程和module

-   下载struts2并导入jar包

> 文件：![](media/image503.png){width="1.6872889326334208in" height="0.2395538057742782in"}
>
> jar包：
>
> 将struts-2.3.15-all.zip文件解压后进入apps目录，找到名为"struts2-blank.war"的示例程序，将其后缀名更改为"rar"，然后解压，将其"WEB-INF lib"目录下的所有jar包拷贝到工程中的lib目录下，这是使用strut2最少需要导入的jar包

-   在web.xml中进行配置，使能struts2

> 在web.xml中加入如下配置

-----------------------------------------------------------------------------------------------------------------
  \<**filter**\>\
  \<**filter-name**\>struts2\</**filter-name**\>\
  \<**filter-class**\>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter\</**filter-class**\>\
  \</**filter**\>\
  \
  \<**filter-mapping**\>\
  \<**filter-name**\>struts2\</**filter-name**\>\
  \<**url-pattern**\>/\*\</**url-pattern**\>\
  \</**filter-mapping**\>

-----------------------------------------------------------------------------------------------------------------

-   在src目录下创建struts2的配置文件"struts.xml"，内容如下：

  ----------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"UTF-8\"** *?\>\
  ***\<!DOCTYPE struts PUBLIC\
  \"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN\"\
  \"http://struts.apache.org/dtds/struts-2.3.dtd\"*\>\
  \
  ***\<**struts**\>\
  \
  \</**struts**\>

  ----------------------------------------------------------------------

> 使用struts2时的配置在该文件中进行配置即可

#### 使用struts2

##### 创建action类

> action类要求没有参数,并且返回值为String类型

------------------------------------------
  **public class** HelloAction {\
  **public** String say(){\
  System.***out***.println(**\"good\"**);\
  **return \"good\"**;\
  }\
  }

------------------------------------------

##### 创建hello.jsp

> 这个页面就是用来跳转的，随便显示点东西即可

##### 配置struts.xml 

--------------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"hello\" class=\"cn.itcast.action.HelloAction\" method=\"say\"**\>\
  \<**result name=\"good\"**\>/hello.jsp\</**result**\>\
  \</**action**\>\
  \</**package**\>

--------------------------------------------------------------------------------------

配置说明：

-   package标签

    -   namespace属性

> 用来配置该package下的所有action的根路径

-   action标签

    -   name属性

> 根路径下的子路径，根据经+子路径合成1个完整的请求路径，请求被拦截时，会将该请求路径与被拦截的请求路径进行匹配，目的是找到完全匹配时对应的action

-   class属性

> 匹配到对应的action后，会执行该action中配置的类中的方法，class属性指定的就是配置的需要被执行的方法所在的类

-   method属性

> action中配置的类中需要被执行的方法

-   result标签

    -   name属性

> 上面执行的方法的返回值会与该属性的值进行匹配，来找到对应的result标签

-   标签文本

> 找到对应的result标签后，就会跳转到该标签的文本内容指定的页面

##### 在index.jsp中创建1个超链接

----------------------------------------------------------------------------------------------
  \<**a href=\"\${**pageContext.request.contextPath**}/hello\"**\>第一次访问structs2\</**a**\>
  ----------------------------------------------------------------------------------------------

##### 实现后的效果

> 访问index.jsp页面，点击超链接即可跳转到hello.jsp页面

#### 流程分析

> struts的核心控制器就是1个filter

34. 因为在web.xml中对struts的核心控制器进行了配置，所以当服务器启动时，struts的核心控制器会被加载

35. 当点击iindex.jsp页面的超链接时，向服务器发送请求，访问"/hello"，这个请求会被核心控制器拦截，拦截后会在struts.xml的配置中寻找匹配的action（package的namespace属性+其下action的name属性与被拦截的请求进行匹配）

36. 找到匹配的action后，会执行该action中class属性指定的类中，method属性指定的方法，此时HelloAction中的say方法会被执行

37. 执行后的返回值，会与上面action下的result标签的name属性进行匹配，然后页面跳转到匹配到的result标签的文本内容指定的页面（/hello.jsp）

### struts工作流程图

> ![](media/image504.png){width="5.768055555555556in" height="4.245833333333334in"}

### struts2配置

1)  #### struts2配置文件加载顺序

    1.  default.properties文件

> 作用：定义了struts2框架中的所有常量
>
> 位置：核心jar包struts2-core下的org.apache.struts2下

2.  struts-default.xml

> 作用：配置bean、interceptor、result等，核心配置文件
>
> 位置：核心jar包struts2-core下
>
> struts-plugin.xml
>
> 作用：struts2框架中插件的配置文件
>
> 位置：插件的jar包中
>
> struts.xml
>
> 作用：我们自己使用struts2框架使用的配置文件
>
> 位置：src目录下

3.  自定义的struts.properties

> 可以用该文件自定义常量

4.  web.xml文件

> struts2框架会再次加载web.xml文件

注意：后加载配置文件会将先加载的配置文件中的常量覆盖

#### action配置

> 这里讲解的是struts.xml文件中对action的配置

##### 标签

(1) ###### package标签

    -   作用

> 用于定义1个包，来管理action

-   属性

    -   name

> 用于声明1个包名，包名必须唯一

-   namespace

> 他与action标签的name属性共同确定了一个唯一访问action的路径

-   extends

> 继承的包名，A包继承B包，B包中的内容会被继承到A包中
>
> 如：

------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \</**package**\>

------------------------------------------------------------------------------

> struts-default.xml文件中有1个name属性为struts-default的package，struts-default包中的内容会被继承到自定义的default包中

-   abstrace

> 取值为true/false
>
> 如果为true，代表这个包是可以被继承的

###### action标签

-   作用

> 用于声明1个action

-   属性

    -   name

> action的名称，在同一包内是唯一的，它与package标签的namespace属性共同确定了1个唯一访问action的路径

-   class

> action类的全名

-   method

> 要访问的action类中方法的名称

###### result标签

-   作用

> 根据方法返回值确定跳转路径

-   属性

    -   name

> 它与方法返回值进行对比来确定跳转路径

-   type

> 作用：用于定义跳转方式
>
> 取值：
>
> 在struts-default.xml文件的result-type标签中定义了结果集类型的可取值

**必会**：

  取值                 说明
-------------------- -----------------------------------------
  dispatcher（默认）   请求转发，一般用于action跳转到页面
  chain                请求转发，一般用于action跳转到action
  redirect             重定向，一般用于action跳转到页面
  redirectAction       重定向，一般用于action跳转到action
  stream               代表服务器端返回的是1个流，一般用于下载

**了解：**

fremarker、velocity：

用于模板，将数据填充到固定模板生成页面，类似于QQ空间的换肤

###### global-results

-   作用

> 用于定义某个package下所有action的全局结果页面

-   局部结果页面与全局结果页面

    -   局部结果页面

> 在action中使用result标签配置的跳转页面，叫做局部结果页面，这个result的配置仅用于该action

-   全局结果页面

> 当1个package下有多个action的结果页面相同时，可以在package下定义1个全局结果页面，该package下所有没有配置result标签的action均跳转到这个全局结果页面；但是在有全局结果页面的情况下，也配置了局部结果页面，则会跳转到局部结果页面

-   例

  ---------------------------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**global-results**\>\
  \<**result**\>/book.jsp\</**result**\>\
  \</**global-results**\>\
  \<**action name=\"book\" class=\"cn.itcast.action.BookAction\" method=\"add\"**\>\</**action**\>\
  \</**package**\>

  ---------------------------------------------------------------------------------------------------

##### 其他细节

###### 默认值

-   package

    -   namespace

> 默认值为""

-   action

    -   class

> 默认值为com.opensymphony.xwork2.ActionSupport

-   method

> 默认值为execute方法

-   result

    -   name

> 默认值为"success"

###### 关于访问action的路径问题

> 当我们访问http://localhost/ a/b/c/hello时，会首先查找
>
> namespace=\"/a/b/c\" action的name=hello 的action，如果没有，会查找
>
> namespace=\"/a/b\" action的name=hello 的action，如果没有，会查找
>
> namespace=\"/a\" action的name=hello 的action，如果没有，会查找
>
> namespace=\"/\" action的name=hello 的action，如果没有，则报404错误
>
> 所以当我们配置的action所在的package的namespace为"/"，时，访问http://localhost/ a/b/c/hello，也可以正常访问

###### 默认的action

> 作用：处理该package下其他action处理不了的路径
>
> 用法：
>
> 在package标签下，使用\<default-action-ref name=\"action的名称\" /\>标签，指定该action为默认的action

###### action的默认处理类

> 作用：用于设置action的class属性的默认值
>
> 用法：
>
> 在package标签下，使用\<default-class-ref class=\"类的全路径\"/\>标签，指定该类为action的默认处理类

#### 常量配置

> default.properties中配置了struts2中使用的常量
>
> default.properties文件位置：
>
> struts2-core-2.3.15.1.jar!\\org\\apache\\struts2\\default.properties

1.  ##### 如何人为设置struts2中的常量

    -   struts.xml（应用最多）

    -   struts.properties（基本不用）

    -   web.xml（了解）

##### struts.xml中配置常量

> 在struts标签下使用如下标签

--------------------------------------------------------------------
  \<**constant name=\"常量名\" value=\"常量值\"**\>\</**constant**\>
  --------------------------------------------------------------------

如：

------------------------------------------------------------------------------------
  \<**constant name=\"struts.action.extension\" value=\"abc,,\"**\>\</**constant**\>
  ------------------------------------------------------------------------------------

此时，struts2的拦截器只会拦截后缀名为abc或没有后缀名的请求

##### web.xml中配置常量

> 在web.xml中配置struts2的filter配置中，在filter标签下加入如下配置：

------------------------------------------------
  \<**init-param**\>\
  \<**param-name**\>常量名\</**param-name**\>\
  \<**param-value**\>常量值\</**param-value**\>\
  \</**init-param**\>

------------------------------------------------

> 如：

-----------------------------------------------------------------------------------------------------------------
  \<**filter**\>\
  \<**filter-name**\>struts2\</**filter-name**\>\
  \<**filter-class**\>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter\</**filter-class**\>\
  \<**init-param**\>\
  \<**param-name**\>struts.action.extension\</**param-name**\>\
  \<**param-value**\>d,,\</**param-value**\>\
  \</**init-param**\>\
  \</**filter**\>

-----------------------------------------------------------------------------------------------------------------

> 此时，struts2的拦截器只会拦截后缀名为do或没有后缀名的请求

##### 常用常量

###### struts.action.extension

> 默认值：action,,
>
> 说明：
>
> struts2拦截器拦截哪些后缀名的请求，默认会拦截后缀名为action或没有后缀名的请求

如：默认情况下

http://localhost/ a/b/c/hello

和

http://localhost/ a/b/c/hello.action

这两个请求都会被拦截，其他后缀名的不会拦截

###### struts.i18n.encoding

> 默认值:utf-8
>
> 说明：
>
> 相当于

----------------------------------------------
  request.setCharacterEncoding(**\"utf-8\"**);
  ----------------------------------------------

> 使用struts2框架可以自动解决post请求乱码问题

###### struts.serve.static.browserCache

> 默认值：false
>
> 说明：
>
> false不缓存，true浏览器会缓存静态内容，开发环境下应设置为fasle，但是产品发布后应设置为true以提高性能。

#### struts.xml文件分离

##### 意义

> struts.xml文件中，每个package对应1个模块，该文件中可能会有很多package，这样不方便阅读，所以需要将不同的package写到不同的xml文件中，然后统一在struts.xml中包含这些xml文件

##### 用法

> 将package写到不同的xml文件中
>
> 在struts.xml中使用如下命令包含该xml文件

-------------------------------------------------
  \<**include file=\"文件名\"**\>\</**include**\>
  -------------------------------------------------

##### 例

-   分离前

    -   原struts.xml文件：

--------------------------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"UTF-8\"** *?\>\
  ***\<!DOCTYPE struts PUBLIC\
  \"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN\"\
  \"http://struts.apache.org/dtds/struts-2.3.dtd\"*\>\
  \
  ***\<**struts**\>\
  \<**constant name=\"struts.i18n.encoding\" value=\"UTF-8\"**\>\</**constant**\>\
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"hello\" class=\"cn.itcast.action.HelloAction\" method=\"say\"**\>\
  \<**result name=\"good\"**\>/hello.jsp\</**result**\>\
  \</**action**\>\
  \</**package**\>\
  \</**struts**\>

--------------------------------------------------------------------------------------

-   分离后

    -   struts-test.xml

--------------------------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"UTF-8\"** *?\>\
  ***\<!DOCTYPE struts PUBLIC\
  \"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN\"\
  \"http://struts.apache.org/dtds/struts-2.3.dtd\"*\>\
  \
  ***\<**struts**\>\
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"hello\" class=\"cn.itcast.action.HelloAction\" method=\"say\"**\>\
  \<**result name=\"good\"**\>/hello.jsp\</**result**\>\
  \</**action**\>\
  \</**package**\>\
  \</**struts**\>

--------------------------------------------------------------------------------------

-   struts.xml

  ----------------------------------------------------------------------------------
  *\<?***xml version=\"1.0\" encoding=\"UTF-8\"** *?\>\
  ***\<!DOCTYPE struts PUBLIC\
  \"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN\"\
  \"http://struts.apache.org/dtds/struts-2.3.dtd\"*\>\
  \
  ***\<**struts**\>\
  \<**constant name=\"struts.i18n.encoding\" value=\"UTF-8\"**\>\</**constant**\>\
  \<**include file=\"struts-test.xml\"**\>\</**include**\>\
  \</**struts**\>

  ----------------------------------------------------------------------------------

### action

#### action类创建的3种方式

> 前两种不常用，开发中一般使用第三种

##### 创建1个POJO类

> 了解即可

###### POJO类

> 简单的JAVA对象（Plain Old Java Object）
>
> 没有实现任何接口，没有继承任何父类（Object类除外）的类，叫做POJO类

###### 优缺点

> 优点：无耦合
>
> 缺点：所有工作需要自己实现

##### 创建1个实现Action接口的类

> 了解即可

###### Action接口全称

com.opensymphony.xwork2.Action

###### 优缺点

> 优点：耦合低，提供了5种结果视图，定义了1个行为方法
>
> 缺点：所有工作自己实现

###### 5种结果视图

> ![](media/image505.png){width="5.768055555555556in" height="0.6736111111111112in"}

##### 创建1个继承ActionSupport类的类

> 常用

###### ActionSupport类全称

> com.opensymphony.xwork2.ActionSupport

###### 优缺点

> 优点：支持表单校验、错误信息设置、读取国际化信息 三个功能
>
> 缺点：耦合度高

#### action类中方法访问

##### 设置method属性

###### 方法

> 前端向服务器发送不同的请求，再struts.xml中配置不同action标签对应不同的请求，并将每个action标签的method属性设置为需要访问的action类中的方法

###### 例

-   前端超链接

  ---------------------------------------------------------------------------------------------
  \<**a href=\"\${**pageContext.request.contextPath**}/book/add\"**\>add\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/book/update\"**\>update\</**a**\>

  ---------------------------------------------------------------------------------------------

-   struts.xml配置

  -----------------------------------------------------------------------------------------
  \<**package name=\"book\" namespace=\"/book\" extends=\"struts-default\"**\>\
  \<**action name=\"add\" class=\"cn.itcast.action.BookAction\" method=\"add\"**\>\
  \</**action**\>\
  \<**action name=\"update\" class=\"cn.itcast.action.BookAction\" method=\"update\"**\>\
  \</**action**\>\
  \</**package**\>

  -----------------------------------------------------------------------------------------

##### 使用通配符简化配置

###### 例

-   前端链接

  ----------------------------------------------------------------------------------------------------
  \<**a href=\"\${**pageContext.request.contextPath**}/Book\_add\"**\>add\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/Book\_update\"**\>update\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/Product\_add\"**\>add\</**a**\>\<**br**\>\
  \<**a href=\"\${**pageContext.request.contextPath**}/Product\_update\"**\>update\</**a**\>

  ----------------------------------------------------------------------------------------------------

-   struts.xml

  -------------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"\*\_\*\" class=\"cn.itcast.action.{1}Action\" method=\"{2}\"**\>\
  \</**action**\>\
  \</**package**\>

  -------------------------------------------------------------------------------------

###### 分析

-   星号

> 星号用来匹配请求中的字符串
>
> 如果请求为Book\_add，则"\*\_\*"中，第一个星匹配到Book，第2个星匹配到add
>
> 如果请求为Product\_update，则"\*\_\*"中，第一个星匹配到Product，第2个星匹配到update

-   {n}

> 将第n个星号匹配到的内容替换到{n}的位置
>
> 如果请求为Book\_add，则class对应"**cn.itcast.action.BookAction**"，method对应"**add**"
>
> 如果请求为Product\_update，则class对应"**cn.itcast.action.ProductAction**"，method对应"**update**"

###### 注意事项

-   使用通配符必须定义1个同一的命名规范

-   不建议使用过多的通配符，不方便阅读

##### 动态方法调用

(1) ###### 用法

    -   使用动态方法调用的前提是struts2的常量配置中启用了动态方法调用

------------------------------------------------------
  **struts.enable.DynamicMethodInvocation** = **true**
  ------------------------------------------------------

> 该常量默认是true，表示启动动态方法调用

-   配置action标签时，只配置name和class属性，不配置method属性；当访问该action对应的路径时，后面加上"!方法",则可以通过该路径访问该类下的方法

###### 例

-   struts.xml配置

  ------------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"book\" class=\"cn.itcast.action.BookAction\"**\>\</**action**\>\
  \</**package**\>

  ------------------------------------------------------------------------------------

-   动态方法调用

> 访问路径"localhost/book!add"，即可调用BookAction类中的add方法
>
> 访问路径"localhost/book!update"，即可调用BookAction类中的update方法

### struts2中获取servlet API

> 前两种不常用，开发中一般使用第三种

#### 通过ActionContext获取

##### 使用方法

> 在action类中,先获取到ActionContext对象,再使用ActionContext对象进行操作

-   获取ActionContext对象

  -------------------------------------------------------
  ActionContext context = ActionContext.*getContext*();
  -------------------------------------------------------

##### ActionContext类常用方法

> ActionContext获取的不是真正的servlet API,而是Map集合

###### getApplication

> 功能:获取application域对象中的所有属性的map集合
>
> 例:

----------------------------------------------------------
  Map\<String, Object\> appMap = context.getApplication();
  ----------------------------------------------------------

###### getSession

> 功能: 获取session域对象中的所有属性的map集合
>
> 例:

----------------------------------------------------------
  Map\<String, Object\> sessionMap = context.getSession();
  ----------------------------------------------------------

###### getParameters

> 功能:获取request对象请求参数的Map集合
>
> 相当于request.getParameterMap();
>
> 例:

-------------------------------------------------------------
  Map\<String, Object\> parameters = context.getParameters();
  -------------------------------------------------------------

###### put

> 语法：void put(String key, Object value)
>
> 功能：向request域中存入1个属性，相当于request.setAttribute(String key, Object value)
>
> 例：

----------------------------------------
  context.put(**\"name\"**,**\"tom\"**);
  ----------------------------------------

#### 注入方式获取

1.  ##### 用法

    -   要求action类实现指定接口

> ServletContextAware ； 注入ServletContext对象
>
> ServletRequestAware ； 注入ServletRequest对象
>
> ServletResponseAware ； 注入ServletResponse对象

-   定义1个对应的web对象，并重写接口的方法，使用接口的方法的参数对该对象赋值

##### 例

---------------------------------------------------------------------------------------------
  **public class** HelloAction **extends** ActionSupport **implements** ServletRequestAware{\
  **private** HttpServletRequest **request** = **null**;\
  **public** String say(){\
  String name = **request**.getParameter(**\"name\"**);\
  **return null**;\
  }\
  **public void** setServletRequest(HttpServletRequest httpServletRequest) {\
  **request** = httpServletRequest;\
  }\
  }

---------------------------------------------------------------------------------------------

##### 分析

> 根据[[struts工作流程图]{.underline}](#struts工作流程图)可以看出，struts2框架在调用action类之前，调用了很多interceptor，在struts-default.xml文件中，可以找到如下一段interceptor的配置：

---------------------------------------------------------------------------------------------------------------
  \<**interceptor name=\"servletConfig\" class=\"org.apache.struts2.interceptor.ServletConfigInterceptor\"**/\>
  ---------------------------------------------------------------------------------------------------------------

> 也就是struts2在调用action类之前，调用了这段interceptor配置中的class属性对应的类中的方法，实际上struts2调用的是该类中的intercept方法。在该方法中，执行了如下代码：

------------------------------------------------------------------------------------------------------------
  Object action = invocation.getAction();\
  ActionContext context = invocation.getInvocationContext();\
  HttpServletRequest request;\
  **if** (action **instanceof** ServletRequestAware) {\
  request = (HttpServletRequest)context.get(**\"com.opensymphony.xwork2.dispatcher.HttpServletRequest\"**);\
  ((ServletRequestAware)action).setServletRequest(request);\
  }

------------------------------------------------------------------------------------------------------------

> 这段代码中，先获取到要执行的action类，然后判断该action类是否实现了servleyRequestAware接口，如果实现了，就调用该action类中的接口中的方法，这样就将底层的request对象传入到了action类中。
>
> 执行完这个interceptor后，在执行action类中的方法，此时action类中已经持有了request对象，在action类中就可以使用request对象了。

#### 通过ServletActionContext获取

##### 用法

> ServletActionContext类中的方法都是static的，可以调用该类中的方法直接获取需要的web对象

##### 例

-------------------------------------------------------------------
  HttpServletRequest request = ServletActionContext.*getRequest*();
  -------------------------------------------------------------------

##### ServletActionContext常用方法

###### getRequest

> 功能：获取request对象

###### getResponse

> 功能：获取response对象

###### getPageContext

> 功能：获取pageContext对象

### struts2获取请求参数

#### 获取请求参数及封装到javaBean

> struts2获取请求参数有3种方法，前两种不常用，开发中一般使用第三种

##### 属性驱动（了解）

###### 将action作为model

####### 使用方法

> 将action当做javaBean使用，在action类中将需要获取的请求参数定义为private全局变量，并提供get和set方法，即可直接将全局变量作为请求参数使用

####### 例

------------------------------------------------------------------------------------
  **public class** LoginAction **extends** ActionSupport {\
  **private** String **username**;\
  **private** String **password**;\
  **public** String getUsername() {\
  **return username**;\
  }\
  **public void** setUsername(String username) {\
  **this**.**username** = username;\
  }\
  **public** String getPassword() {\
  **return password**;\
  }\
  **public void** setPassword(String password) {\
  **this**.**password** = password;\
  }\
  **public** String login(){\
  HttpServletRequest request = ServletActionContext.*getRequest*();\
  **if**(**username**.equals(**\"admin\"**) && **password**.equals(**\"admin\"**)){\
  HttpSession session = request.getSession();\
  session.setAttribute(**\"username\"**,**username**);\
  **return *SUCCESS***;\
  }\
  **else**{\
  request.setAttribute(**\"msg\"**,**\"用户名或密码错误\"**);\
  **return *INPUT***;\
  }\
  }\
  }

------------------------------------------------------------------------------------

####### 原理分析

> struts在调用action类之前，在interceptor中通过反射调用了该action类的get和set方法将请求参数设置进来了，然后再调用的action类

####### 优缺点

-   优点

> 简单

-   缺点：

> 需要单独定义javaBean，将action中属性copy到javaBean中，无法直接传递给service层

###### 在action中声明model

a)  ####### 使用方法

    -   创建1个javaBean类，在action类中持有1个该javaBean类的对象的引用，并提供该javaBean对象的引用的get、set方法
    
    -   在jsp页面上使用ognl表达式描述请求参数

> 格式：Bean对象名 . 参数
>
> 说明： Bean对象名就是action类中javaBean对象的引用的名称
>
> 参数就是javaBean中的属性

####### 例

-   action

  --------------------------------------------------------------------------------------------------------
  **public class** LoginAction **extends** ActionSupport {\
  **private** User **user**;\
  **public** User getUser() {\
  **return user**;\
  }\
  **public void** setUser(User user) {\
  **this**.**user** = user;\
  }\
  **public** String login(){\
  HttpServletRequest request = ServletActionContext.*getRequest*();\
  **if**(**user**.getUsername().equals(**\"admin\"**) && **user**.getPassword().equals(**\"admin\"**)){\
  HttpSession session = request.getSession();\
  session.setAttribute(**\"username\"**,**user**.getUsername());\
  **return *SUCCESS***;\
  }\
  **else**{\
  request.setAttribute(**\"msg\"**,**\"用户名或密码错误\"**);\
  **return *INPUT***;\
  }\
  }\
  }

  --------------------------------------------------------------------------------------------------------

-   jsp

  ----------------------------------------------------------------------------------------------------
  \<**form action=\"\${**pageContext.request.contextPath**}/login/loginAction\" method=\"post\"**\>\
  **\${**msg**}**\<**br**\>\
  用户名：\<**input type=\"text\" name=\"user.username\"**\>\<**br**\>\
  密**&nbsp;&nbsp;&nbsp;**码：\<**input type=\"password\" name=\"user.password\"**\>\<**br**\>\
  \<**input type=\"submit\" value=\"登录\"**\>\
  \</**form**\>

  ----------------------------------------------------------------------------------------------------

####### 原理分析

> struts2中的interceptor对数据进行了封装
>
> \<**interceptor name=\"params\" class=\"com.opensymphony.xwork2.interceptor.ParametersInterceptor\"**/\>

####### 优缺点

-   优点

> 简单，解决了上一种方式中封装的问题

-   缺点

> 页面必须使用ognl表达式，页面不通用

##### 模型驱动（重点）

(1) ###### 使用方法

    -   创建1个javaBean对象，并在action类中实例化1个该javaBean类的对象
    
    -   将action类实现ModelDriven\<T\>接口，泛型参数为上面创建的javaBean类；重写接口中的getModel方法，在该方法中返回上面实例化的javaBean对象。

###### 例

-   action

  --------------------------------------------------------------------------------------------------------
  **public class** LoginAction **extends** ActionSupport **implements** ModelDriven\<User\>{\
  **private** User **user** = **new** User();\
  **public** User getModel() {\
  **return user**;\
  }\
  **public** String login(){\
  HttpServletRequest request = ServletActionContext.*getRequest*();\
  **if**(**user**.getUsername().equals(**\"admin\"**) && **user**.getPassword().equals(**\"admin\"**)){\
  HttpSession session = request.getSession();\
  session.setAttribute(**\"username\"**,**user**.getUsername());\
  **return *SUCCESS***;\
  }\
  **else**{\
  request.setAttribute(**\"msg\"**,**\"用户名或密码错误\"**);\
  **return *INPUT***;\
  }\
  }\
  }

  --------------------------------------------------------------------------------------------------------

-   jsp

  ----------------------------------------------------------------------------------------------------
  \<**form action=\"\${**pageContext.request.contextPath**}/login/loginAction\" method=\"post\"**\>\
  **\${**msg**}**\<**br**\>\
  用户名：\<**input type=\"text\" name=\"username\"**\>\<**br**\>\
  密**&nbsp;&nbsp;&nbsp;**码：\<**input type=\"password\" name=\"password\"**\>\<**br**\>\
  \<**input type=\"submit\" value=\"登录\"**\>\
  \</**form**\>

  ----------------------------------------------------------------------------------------------------

###### 优缺点

-   优点

> 解决了属性驱动中的所有问题，页面上也不需要使用ognl表达式，页面通用

-   缺点

> 1次只能封装1个model对象

#### 获取请求参数及封装到集合

> 将请求参数封装到集合需要在页面使用ognl表达式，类似于[[属性驱动（了解）]{.underline}](#属性驱动了解)中的[[在action中声明model]{.underline}](#在action中声明model)的方式

##### 封装到List集合

-   页面

  ----------------------------------------------------------------------------------
  username:\<**input type=\"text\" name=\"users\[0\].username\"**\>\<**br**\>\
  password:\<**input type=\"password\" name=\"users\[0\].password\"**\>\<**br**\>\
  username:\<**input type=\"text\" name=\"users\[1\].username\"**\>\<**br**\>\
  password:\<**input type=\"password\" name=\"users\[1\].password\"**\>\<**br**\>

  ----------------------------------------------------------------------------------

-   action类

> 在action类中持有1个User类的List集合的对象

**private** List\<User\> **users**;

> 提供get/set方法

##### 封装到Map集合

-   页面

  -------------------------------------------------------------------------------------
  username:\<**input type=\"text\" name=\"map\['aaa'\].username\"**\>\<**br**\>\
  password:\<**input type=\"password\" name=\" map\['aaa'\].password\"**\>\<**br**\>\
  username:\<**input type=\"text\" name=\" map\['bbb'\].username\"**\>\<**br**\>\
  password:\<**input type=\"password\" name=\" map\['bbb'\].password\"**\>\<**br**\>

  -------------------------------------------------------------------------------------

-   action类

> 在action类中持有1个User类的Map集合的对象

**private** Map\<String,User\> **map**;

> 提供get/set方法

#### 类型转换

> 在前面web开发中，封装请求参数到javaBean时使用BeanUtils（参见[[beanutils工具包]{.underline}](#beanutils工具包)），BeanUtils工具本身支持一些类型数据的封装，但是像Date类型的数据时无法进行封装的，需要自定义类型转换器
>
> 在上面struts2[[获取请求参数及封装]{.underline}](#获取请求参数及封装到javabean)中讲到，struts2框架本身就可以对请求参数进行封装，同样在封装过程中也会存在类型转换的问题

##### struts2内置类型转换

> struts2内提供了大量类型转换器，支持转换的类型如下：

-   Boolean和boolean

-   char和Character

-   int和Integer

-   long和Long

-   float和Float

-   double和Double

-   Date：可以接收"yyyy-MM-dd"或"yyyy年MM月dd日"格式字符串

-   数组：可以将多个同名参数转换到数组（如页面上的checkbox）

-   集合：可以将数据保存到List或Map集合

##### struts2中自定义类型转换器

> 使用了自定义类型转换器，则struts内置的对该类型的类型转换器将失效
>
> 如：
>
> struts内置类型转换器：
>
> 支持如下日期格式的转换：
>
> "1990-10-10" Date
>
> 不支持如下日期格式的转换：
>
> "1990/10/10" Date
>
> 如果配置了支持" 1990/10/10" Date的自定义类型转换器：
>
> 支持如下日期格式的转换：
>
> "1990/10/10" Date
>
> 不支持如下日期格式的转换：
>
> "1990-10-10" Date

###### 步骤

####### 创建1个类,继承StrutsTypeConverter类

####### 重写convertFromString和convertToString方法,实现类型转换功能

-   convertFromString

> 将页面传来的请求参数转换为javaBean中需要的数据类型

-   参数

    -   Map map

    -   String\[\] strings

> 该参数是1个String数组，他的第0个元素就是带转换的字符串
>
> 如：
>
> 要将"1990/10/10"转换为Date类型，则strings\[0\]中存放的就是"1990/10/10"

-   Class aClass

> 要转换成的类型

如：

要将"1990/10/10"转换为Date类型，则该参数内容就是"java.util.Date"

-   返回值

> 转换后的结果

-   convertToString

> 将javaBean中的数据的类型转换为String，用来在页面展示

-   参数

    -   Map map

    -   Object o

<!-- -->

-   例

> 自定义类型转换String和Date

####### 注册类型转换器

-   局部 \-- 针对action

    -   局部

> 配置文件名为：Action类名-conversion.properties
>
> 当struts2框架需要将请求参数封装到配置文件名中包含的Action类中时,并且需要对配置文件中配置的属性进行转换时,才会使用该自定义类型转换器

-   针对action

> 对于action本身就是mode的,使用该方式进行配置,如[[属性驱动（了解）]{.underline}](#属性驱动了解)中[[将action作为model]{.underline}](#将action作为model)中的使用方法

-   注册方法

    a.  在action类所在的包下,创建文件:Action类名-conversion.properties

    b.  使用如下书写格式在配置文件中进行配置：

> 属性名称=类型转换器的全类名
>
> 其中：
>
> 属性名称为：action中需要使用自定义类型转换器进行转换的属性的名称
>
> 类型转换器的全类名：上面创建的，用于对该属性进行类型转换的自定义转换器的全类名

-   例

> 要求：
>
> 使用LocalActionConvert类型转换器对LoginAction类中的birthday属性进行自定义类型转换

实现：

> 在LoginAction类的同一包下创建：LoginAction-conversion.properties文件，文件内容如下：

-------------------------------------------------------
  **birthday**=**cn.itcast.convert.LocalActionConvert**
  -------------------------------------------------------

-   局部 \-- 针对model

    -   局部

> 配置文件名为：model类名-conversion.properties
>
> 当struts2框架需要将请求参数封装到配置文件名中包含的model类中时,并且需要对配置文件中配置的属性进行转换时,才会使用该自定义类型转换器

-   针对model

> 对于action本身不是model，而是在action类内持有1个model对象的，使用该方法进行配置；如[[属性驱动（了解）]{.underline}](#属性驱动了解)中[[在action中声明model]{.underline}](#在action中声明model) 中的用法，或者[[模型驱动（重点）]{.underline}](#模型驱动重点)中的用法

-   注册方法

    a.  在model类所在的包下,创建文件:model类名-conversion.properties

    <!-- -->

    c.  使用如下书写格式在配置文件中进行配置：

> 属性名称=类型转换器的全类名
>
> 其中：
>
> 属性名称为：model类中需要使用自定义类型转换器进行转换的属性的名称
>
> 类型转换器的全类名：上面创建的，用于对该属性进行类型转换的自定义转换器的全类名

-   例

> 要求：
>
> 使用LocalModelConvert类型转换器对User类中的birthday属性进行自定义类型转换

实现：

> 在User类的同一包下创建：User-conversion.properties文件，文件内容如下：

------------------------------------------------------
  **birthday**=**cn.itcast.convert.LocalModelConvert**
  ------------------------------------------------------

-   全局

    -   全局

> 当struts2框架需要对请求参数进行封装时,只要碰到将String转换为xwork-conversion.properties中配置的类型时,就会调用对应的自定义类型转换器

-   注册方法

    a.  在src下创建文件：xwork-conversion.properties

    b.  使用如下格式在配置文件中进行配置

> 要转换的类型的全名=类型转换器全名

其中：

> 要转换的类型的全名：如要将前台传来的String转换为Date类型，则该位置应该为Date类的全名
>
> 类型转换器的全类名：上面创建的，用于对该属性进行类型转换的自定义转换器的全类名

-   例

> 要求：
>
> 使用GlobalConvert类型转换器对User类中的birthday属性进行自定义类型转换

实现：

在src下创建文件：xwork-conversion.properties，文件内容如下：

----------------------------------------------------------
  **java.util.Date** = **cn.itcast.convert.GlobalConvert**
  ----------------------------------------------------------

###### 转换时发生错误

> 在类型转换器进行类型转换时，如果发生错误，则或自动跳转到input视图，对于自定义类型转换器，需要手动抛出异常，才可跳转到input视图。
>
> 参见[[异常]{.underline}](#异常)

### 异常

#### struts2中如何处理异常

> 在struts2中,intercepter或action中执行发生错误时,会将错误信息一一记录下来,最后在名为workflow的intercepter中得到所有的错误信息,并跳转到input视图
>
> 对于自己的代码中执行到某一处，逻辑上认为这是1个异常，需要跳转到input结果视图时，可以向上一层抛出异常（在函数名后加上throw xxxException），或抛出自定义异常（如：throw new RuntimeException(\"转换日期错误\");）

#### 产生异常跳转时没有input视图

> 当在名为workflow的intercepter中检测到错误时,会跳转到当前访问的action下的input视图中
>
> 如果该action中没有配置input视图，页面将会展示如下错误：
>
> No result defined for action xx.xx.xx and result input
>
> 这段话的意思是xx.xx.xx这个action没有配置input结果视图，无法跳转到input结果视图
>
> 所以，以后在配置action时，必须配置input结果视图。
>
> 例：

----------------------------------------------------------------------------------------------
  \<**action name=\"loginAction\" class=\"cn.itcast.action.LoginAction\" method=\"login\"**\>\
  \<**result name=\"input\"**\>/index.jsp\</**result**\>\
  **type=\"redirect\"**\>/success.jsp\</**result**\>\
  \</**action**\>

----------------------------------------------------------------------------------------------

#### 在页面展示异常信息

##### 展示原始异常信息

> 在页面展示异常信息，需要使用struts标签库

5.  导入标签库

  ------------------------------------------------------------------
  \<%@**taglib prefix**=\"**s**\" **uri**=\"**/struts-tags**\" %\>
  ------------------------------------------------------------------

6.  使用标签展示信息

  -----------------------
  \<**s:fielderror**/\>
  -----------------------

7.  展示特定错误信息

  ------------------------------------------------------
  \<**s:fielderror fieldName=\"username.message\"**/\>
  ------------------------------------------------------

##### 自定义错误信息展示

###### 介绍

> struts2中展示的错误信息都是因为，一般描述并不清楚，此时需要展示自定义的错误信息

###### 方法

-   在action所在包下创建actionName.properties文件

-   在配置文件中按如下格式配置

  --------------------------------------------------
  **invalid.fieldvalue.属性名** = **错误提示信息**
  --------------------------------------------------

> 例：

------------------------------------------------------------
  **invalid.fieldvalue.birthday** = **日期格式：yyyy-MM-dd**
  ------------------------------------------------------------

#### 例

##### 内置类型转换器出错跳转到结果视图

> struts2内置了很多类型转换器，当内置的类型转换器转换时产生错误，则会自动跳转到input视图
>
> 对于自定义类型转换器，需要手动抛出异常或将异常抛给调用者

### 数据校验

#### 手动校验

##### 实现

(1) ###### 步骤

    8.  action类继承ActionSupport类
    
    9.  重写validate方法，完成校验功能，如果校验错误将错误信息存储到action
    
    10. 在页面展示错误信息

###### 知识点

####### 向action存储错误信息

> 在action类的方法中执行如下代码：

----------------------------------------------------------------------------
  **this**.addFieldError(**\"username.message\"**,**\"用户名或不能为空\"**);
  ----------------------------------------------------------------------------

> 参数1：错误信息名称，页面可以根据错误信息名称展示特定的错误信息
>
> 参数2：错误信息内容

####### 页面展示错误信息

> 参见：[[在页面展示异常信息]{.underline}](#在页面展示异常信息)

###### 例

-------------------------------------------------------------------------------------------------------
  **public class** ValidateAction **extends** ActionSupport **implements** ModelDriven\<User\> {\
  **private** User **user** = **new** User();\
  \
  **public** String execute() **throws** Exception {\
  System.***out***.println(**user**);\
  **return null**;\
  }\
  **public void** validate() {\
  **if** ((**user**.getUsername() == **null**) \|\| (**user**.getUsername().trim().length() == 0) \|\|\
  (**user**.getPassword() == **null**) \|\| (**user**.getPassword().trim().length() == 0)) {\
  **this**.addFieldError(**\"username.message\"**,**\"用户名或不能为空\"**);\
  }\
  }\
  \
  **public** User getModel() {\
  **return user**;\
  }\
  }

-------------------------------------------------------------------------------------------------------

##### 分析

> struts2框架接收到请求后进行手动校验的流程为：

-   封装请求参数

-   调用action类中的validate方法进行校验，如果校验错误，存储错误信息

-   调用action类的请求处理方法（execute）

> 其中任何一步出现问题，都会向action中存储错误信息，并立即在workflow拦截器中跳转到input试图

##### 部分校验

> 在开发中,1个action中会存在多个方法,而多个方法中可能部分方法需要校验,部分方法不需要校验,此时应该按如下方法进行校验

###### 全部校验

> 对于action中所有方法均需要校验的功能,可以放在validate方法中,在调用action中任何请求处理方法之前,都会调用该方法进行校验.参见[[实现]{.underline}](#实现-4)

###### 部分校验

> 对于action中某个方法需要校验的功能,可以放在如下方法中进行校验:
>
> validate请求处理方法名(); //请求方法名首字母大写
>
> 如：请求处理方法为login()；则validateLogin()只会在调用login方法之前调用，调用action中其他方法之前不会调用该方法。

###### 同时定义"validate"和"validate请求方法名"

当同时定义"validate"和"validate请求方法名"方法时：

-   如调用除该请求方法名之外的请求处理方法时，则先调用validate方法，在调用需要调用的请求处理方法

-   如调用该请求方法名对应的请求处理方法时，则先调用"validate请求处理方法名"方法，在调用"validate"方法，在调用需要调用的请求处理方法

#### 配置校验（xml）

##### 介绍

> 配置校验也叫struts2的校验框架，已经完成了校验操作，做了很多校验方法，我们使用时通过配置文件调用即可

**注意：**

struts2只会对需要封装的请求参数进行校验，如果前端提交上来的请求参数没有使用struts2封装，则不会进行校验

##### 使用

-   在需要校验的action类的同一包下创建"action类名-validation.xml"文件

> 如：
>
> 需要对UserAction类中的方法校验，则在ValidateAction类的同一包下创建文件"ValidateAction-validation.xml"
>
> ![](media/image506.png){width="2.832979002624672in" height="0.7499059492563429in"}

-   加入如下约束

  -------------------------------------------------------------------
  **\<!DOCTYPE validators PUBLIC\
  \"-//Apache Struts//XWork Validator 1.0.3//EN\"\
  \"http://struts.apache.org/dtds/xwork-validator-1.0.3.dtd\"*\>***

  -------------------------------------------------------------------

> 这段内容也可以在如下位置找到：
>
> xwork-core-2.3.15.1.jar 下的 xwork-validator-1.0.3.dtd 文件中第7-9行

-   配置

> 配置校验的配置文件中使用的标签参见：[[标签]{.underline}](#标签-1)
>
> 这只展示示例：

--------------------------------------------------
  \<**validators**\>\
  \<**field name=\"username\"**\>\
  \<**field-validator type=\"requiredstring\"**\>\
  \<**message**\>用户名不能为空\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>\
  \</**validators**\>

--------------------------------------------------

> 这段实例中内容表示：

-   对username请求参数进行校验

-   使用**requiredstring**校验器

-   校验失败的错误信息为：用户名不能为空

##### 标签

###### validators

-   所属关系

> 根标签

-   作用

> 管理该文件中所有的field

###### field

-   所属关系

> validators标签的子标签

-   作用

> 用来配置对1个参数的校验规则

-   属性

    -   name

> 需要校验的请求参数名
>
> 如：
>
> 需要对请求参数username进行校验，则name属性值为"username"

-   例

> 参见：[[使用]{.underline}](#使用-6)

###### field-validator

-   所属关系

> field标签的子标签

-   作用

> 用来配置对需要校验的请求参数使用的校验器和错误信息

-   属性

    -   type

> 指定校验器，校验器参见：[[校验器]{.underline}](#校验器)

-   例

> 参见：[[使用]{.underline}](#使用-6)

###### message

-   所属关系

> fiels-validator标签的子标签

-   作用

> 用来配置对需要校验的请求参数使用的错误信息

-   标签内容

> 校验失败的错误信息

-   例

> 参见：[[使用]{.underline}](#使用-6)

###### param

-   所属关系

> fiels-validator标签的子标签

-   作用

> 指定校验器参数

-   属性

    -   name

> 校验器的参数名称，具体值根据使用校验器有哪些参数决定

-   标签内容

> 参数值

-   例

> 指定这里使用的requiredstring校验器不去掉前后空格

--------------------------------------------------
  \<**validators**\>\
  \<**field name=\"username\"**\>\
  \<**field-validator type=\"requiredstring\"**\>\
  \<**param name=\"trim\"**\>false\</**param**\>\
  \<**message**\>用户名不能为空\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>\
  \</**validators**\>

--------------------------------------------------

##### 校验器

###### 介绍

> 校验器就是struts2内置的一些常用的校验代码，如requiredstring校验器就会校验传入的字符串是否为空

###### 内置校验器

> struts2内置的校验器可以在如下位置找到：
>
> xwork-core-2.3.15.1.jar!\\com\\opensymphony\\xwork2\\validator\\validators\\default.xml
>
> 该文件中定义了所有内置的校验器，内容如下：

-----------------------------------------------------------------------------------------------------------------------------------------
  \<**validators**\>\
  \<**validator name=\"required\" class=\"com.opensymphony.xwork2.validator.validators.RequiredFieldValidator\"**/\>\
  \<**validator name=\"requiredstring\" class=\"com.opensymphony.xwork2.validator.validators.RequiredStringValidator\"**/\>\
  \<**validator name=\"int\" class=\"com.opensymphony.xwork2.validator.validators.IntRangeFieldValidator\"**/\>\
  \<**validator name=\"long\" class=\"com.opensymphony.xwork2.validator.validators.LongRangeFieldValidator\"**/\>\
  \<**validator name=\"short\" class=\"com.opensymphony.xwork2.validator.validators.ShortRangeFieldValidator\"**/\>\
  \<**validator name=\"double\" class=\"com.opensymphony.xwork2.validator.validators.DoubleRangeFieldValidator\"**/\>\
  \<**validator name=\"date\" class=\"com.opensymphony.xwork2.validator.validators.DateRangeFieldValidator\"**/\>\
  \<**validator name=\"expression\" class=\"com.opensymphony.xwork2.validator.validators.ExpressionValidator\"**/\>\
  \<**validator name=\"fieldexpression\" class=\"com.opensymphony.xwork2.validator.validators.FieldExpressionValidator\"**/\>\
  \<**validator name=\"email\" class=\"com.opensymphony.xwork2.validator.validators.EmailValidator\"**/\>\
  \<**validator name=\"url\" class=\"com.opensymphony.xwork2.validator.validators.URLValidator\"**/\>\
  \<**validator name=\"visitor\" class=\"com.opensymphony.xwork2.validator.validators.VisitorFieldValidator\"**/\>\
  \<**validator name=\"conversion\" class=\"com.opensymphony.xwork2.validator.validators.ConversionErrorFieldValidator\"**/\>\
  \<**validator name=\"stringlength\" class=\"com.opensymphony.xwork2.validator.validators.StringLengthFieldValidator\"**/\>\
  \<**validator name=\"regex\" class=\"com.opensymphony.xwork2.validator.validators.RegexFieldValidator\"**/\>\
  \<**validator name=\"conditionalvisitor\" class=\"com.opensymphony.xwork2.validator.validators.ConditionalVisitorFieldValidator\"**/\>\
  \</**validators**\>

-----------------------------------------------------------------------------------------------------------------------------------------

###### 常用校验器

####### required

-   作用

> 必填校验器，要求被校验的属性值不能为null

####### requiredstring

-   作用

> 必填字符串校验器，要求被校验的属性不能为null，并且长度大于0，默认对字符串去掉前后空格

-   参数

    -   trim

> 指定是否去掉前后空格，取值true（默认）或false

####### stringlength

-   作用

> 字符串长度校验器，要求被校验的属性值必须在指定的范围内，否则校验失败

-   参数

    -   minLength

> 指定最小长度

-   maxLength

> 指定最大长度

-   trim

> 指定校验field之前是否去除字符串前后的空格

-   例：

  -----------------------------------------------------------------------------
  \<**field name=\"username\"**\>\
  \<**field-validator type=\"requiredstring\"**\>\
  \<**param name=\"trim\"**\>false\</**param**\>\
  \<**message**\>用户名不能为空\</**message**\>\
  \</**field-validator**\>\
  \<**field-validator type=\"stringlength\"**\>\
  \<**param name=\"minLength\"**\>6\</**param**\>\
  \<**param name=\"maxLength\"**\>10\</**param**\>\
  \<**message**\>用户名长度在\${minLength}-\${maxLength}之间\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  -----------------------------------------------------------------------------

####### int

-   作用

> 整数校验器，要求被校验属性值的大小必须在指定范围内

-   参数

    -   min

> 指定最小值

-   max

> 指定最大值

-   例

  ---------------------------------------------------------------
  \<**field name=\"age\"**\>\
  \<**field-validator type=\"int\"**\>\
  \<**param name=\"min\"**\>18\</**param**\>\
  \<**param name=\"max\"**\>60\</**param**\>\
  \<**message**\>年龄必须在\${min}-\${max}之间\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  ---------------------------------------------------------------

####### double

-   作用

> 双精度浮点数校验器,要求被校验属性值的双精度浮点数大小必须在指定范围内

-   参数

    -   mininclusive

> 指定最小值

-   maxInclusive

> 指定最大值

-   例

  ---------------------------------------------------------------------------------
  \<**field name=\"high\"**\>\
  \<**field-validator type=\"double\"**\>\
  \<**param name=\"minInclusive\"**\>1.70\</**param**\>\
  \<**param name=\"maxInclusive\"**\>1.90\</**param**\>\
  \<**message**\>身高必须在\${minInclusive}-\${maxInclusive}之间\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  ---------------------------------------------------------------------------------

####### date

-   作用

> 日期校验器要求被校验属性的值得大小必须在指定范围内

-   参数

    -   min

> 指定最小值，格式：yyyy-MM-dd

-   max

> 指定最大值，格式：yyyy-MM-dd

-   例

  ---------------------------------------------------------------
  \<**field name=\"birthday\"**\>\
  \<**field-validator type=\"date\"**\>\
  \<**param name=\"min\"**\>1970-1-1\</**param**\>\
  \<**param name=\"max\"**\>2018-3-13\</**param**\>\
  \<**message**\>生日必须在\${min}-\${max}之间\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  ---------------------------------------------------------------

####### email

-   作用

> 邮件地址校验器，要求如果被校验的属性值非空，则必须是合法的邮件地址

-   例

  ------------------------------------------------
  \<**field name=\"email\"**\>\
  \<**field-validator type=\"email\"**\>\
  \<**message**\>邮箱格式不正确\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  ------------------------------------------------

####### url

-   作用

> 网址校验器,要求如果被校验的属性值非空,则必须是合法的url地址
>
> url必须以开头

-   例

  -------------------------------------------------
  \<**field name=\"url\"**\>\
  \<**field-validator type=\"url\"**\>\
  \<**message**\>email格式不正确\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  -------------------------------------------------

####### regex

-   作用

> 正则表达式校验器，检查被校验的属性值是否匹配一个正则表达式

-   参数

    -   regexExpression

> 正则表达式内容，格式：\<!\[CDATA\[正则表达式\]\]\>

-   caseSensitive

> 指定进行正则表达式匹配时是否区分大小写，默认为true

-   例

  ------------------------------------------------------------------------------------------
  \<**field name=\"telphone\"**\>\
  \<**field-validator type=\"regex\"**\>\
  \<**param name=\"regexExpression\"**\>\<!\[CDATA\[\^135\[0-9\]{8}\$\]\]\>\</**param**\>\
  \<**message**\>手机号格式不正确\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  ------------------------------------------------------------------------------------------

####### fieldexpression

-   作用

> 字段OGNL表达式校验器,要求field满足一个ognl表达式

-   参数

    -   expression

> OGNL表达式内容，格式：\<!\[CDATA\[OGNL表达式\]\]\>

-   例

  --------------------------------------------------------------------------------------------
  \<**field name=\"repassword\"**\>\
  \<**field-validator type=\"fieldexpression\"**\>\
  \<**param name=\"expression\"**\>\<!\[CDATA\[(password == repassword)\]\]\>\</**param**\>\
  \<**message**\>两次密码不一致\</**message**\>\
  \</**field-validator**\>\
  \</**field**\>

  --------------------------------------------------------------------------------------------

###### 校验器参数

####### 查看校验器参数

> 在如下文件中可以找到struts所有的内置校验器：
>
> xwork-core-2.3.15.1.jar!\\com\\opensymphony\\xwork2\\validator\\validators\\default.xml
>
> 在该文件中选择要查看的校验的class属性值，使用ctrl+鼠标左键点进去，查看该校验器源码，查看该类中的get和set方法，查看该校验器有哪些参数

**如：**

> 在default.xml中使用ctrl+鼠标左键点击requiredstring校验器的class属性，查看其源码，可见如下代码：

----------------------------------------------
  **public void** setTrim(**boolean** trim) {\
  **this**.trim = trim;\
  }

----------------------------------------------

> 则trim就是这个校验器的1个校验参数

####### 校验器参数使用

> 参见[[param]{.underline}](#param-1)

##### 部分方法校验

###### 需求

> 当action类中存在多个请求处理方法时,只对部分方法进行校验,其他方法不进行校验.

###### 实现方法

> 修改配置文件名为:
>
> action类名-action名称-validation.xml
>
> 注意：
>
> action名称指的是struts.xml中action标签的name属性的值，而非action类中请求处理方法名

###### 例

-   action类

  -------------------------------------------------------------------------------------------------
  **public class** ValidateAction **extends** ActionSupport **implements** ModelDriven\<User\> {\
  **private** User **user** = **new** User();\
  \
  **public** User getModel() {\
  **return user**;\
  }\
  \
  **public** String login() **throws** Exception {\
  System.***out***.println(**user**);\
  **return null**;\
  }\
  \
  **public** String regist() **throws** Exception {\
  **return null**;\
  }\
  }

  -------------------------------------------------------------------------------------------------

-   struts.xml

  ----------------------------------------------------------------------------------------------
  \<**package name=\"default\" namespace=\"/\" extends=\"struts-default\"**\>\
  \<**action name=\"login1\" class=\"cn.itcast.action.ValidateAction\" method=\"login\"**\>\
  \<**result name=\"input\"**\>/index.jsp\</**result**\>\
  \</**action**\>\
  \<**action name=\"regist1\" class=\"cn.itcast.action.ValidateAction\" method=\"regist\"**\>\
  \<**result name=\"input\"**\>/index.jsp\</**result**\>\
  \</**action**\>\
  \</**package**\>

  ----------------------------------------------------------------------------------------------

-   需求

> 根据上面代码：
>
> login1的action对应validateAction类中的login方法
>
> regist1的action对应validateAction类中的regist方法

要求：

访问validateAction类中的regist方法时进行校验，login方法时不进行校验

-   校验配置文件

> 根据上述需求，在validateAction所在包下创建文件：
>
> validateAction-regist1-validation.xml
>
> 在配置文件中对需要校验的参数进行校验即可

##### struts2零配置

> 从struts2.1开始，struts2 引入了Convention插件来支持零配置
>
> 使用约定无需struts.xml或者Annotation配置
>
> 需要 struts2-convention-plugin-2.3.7.jar 、asm-\*.jar(三个)
>
> 插件会自动搜索action、actions、struts、struts2包下所有Java类
>
> 所有实现了com.opensymphony.xwork2.Action的Java类
>
> 所有类名以Action结尾的Java类
>
> 下面类名都符合Convention插件
>
> cn.itcast.struts2.HelloAction
>
> cn.itcast.actions.books.BookSearchAction
>
> cn.itcast.struts.user.UserAction
>
> cn.itcast.estore.action.test.LoginAction
>
> struts2-convention-plugin-2.3.7.jar 中struts-plugin.xml重要常量
>
> \<constant name=\"struts.convention.package.locators\" value=\"action,actions,struts,struts2\"/\> 默认扫描包
>
> \<constant name=\"struts.convention.exclude.packages\" value=\"org.apache.struts.\*,org.apache.struts2.\*,org.springframework.web.struts.\*,org.springframework.web.struts2.\*,org.hibernate.\*\"/\> 不扫描
>
> \<constant name=\"struts.convention.action.suffix\" value=\"Action\"/\> 默认扫描以Action结尾的类
>
> \<constant name=\"struts.convention.result.path\" value=\"/WEB-INF/content/\"/\> 结果result页面存放位置
>
> \<constant name=\"struts.convention.classes.reload\" value=\"false\" /\> Action类文件重新自动加载
>
> 如果Action类名包含Action后缀，将Action后缀去掉
>
> 将Action类名的驼峰写法，转成中划线写法
>
> 例如：
>
> cn.itcast.struts2.HelloAction 映射到 /hello.action
>
> cn.itcast.actions.books.BookSearchAction 映射到 /books/book-search.action
>
> cn.itcast.struts.user.UserAction 映射到 /user/user.action
>
> cn.itcast.estore.action.test.LoginAction 映射到 /test/login.action
>
> 默认情况下，Convention总会到Web应用的WEB-INF/content路径下定位结果资源
>
> \<constant name=\"struts.convention.result.path\" value=\"/WEB-INF/content/\"/\>
>
> 约定： actionName + resultCode + suffix
>
> 例如：
>
> 访问cn.itcast.struts.user.UserAction返回success
>
> Convention优先使用 WEB-INF/content/user/user-success.jsp
>
> 如果user-success.jsp不存在，会使用user-success.html
>
> 如果user-success.html不存在，会使用user.jsp

### 国际化

#### 介绍

> 不使用struts2时，国际化如何使用及介绍参见[[国际化]{.underline}](#国际化)
>
> struts2中对国际化进行了封装，我们只需要根据提供的API进行访问即可
>
> struts2中的国际化,struts2框架会自动根据浏览器的语言选择对应的资源包文件,从中读取信息

#### 使用

##### 创建及定义资源包文件

> 与MVC模式下的国际化相同，struts2中的国际化同样需要资源包文件，关于资源包文件介绍，参见[[资源包]{.underline}](#资源包)
>
> struts2中国际化的资源包文件可以定义为全局的，也可以定义为局部的，资源包文件的位置，也不尽相同

###### 全局

> 全局的资源包文件可以直接放在src下，也可以放置在其他位置

-   src下

    -   定义方法

> 当资源包文件放在src下时，在struts.xml中按如下方式配置properties文件：

------------------------------------------------------------------------
  \<**constant name=\"struts.custom.i18n.resources\" value=\"基名\"**/\>
  ------------------------------------------------------------------------

-   例如

    -   资源包文件位置

> ![](media/image507.png){width="2.1458333333333335in" height="1.265080927384077in"}

-   定义资源包文件

> 在struts.xml中定义资源包文件

---------------------------------------------------------------------------
  \<**constant name=\"struts.custom.i18n.resources\" value=\"message\"**/\>
  ---------------------------------------------------------------------------

-   其他位置

    -   定义方法

> 资源包文件放在其他位置时，在struts.xml中按如下方式配置properties文件：

-----------------------------------------------------------------------------
  \<**constant name=\"struts.custom.i18n.resources\" value=\"包名.基名\"**/\>
  -----------------------------------------------------------------------------

> 其中包名指的是：资源包文件所在的包名

-   例如

    -   资源包文件位置

> ![](media/image508.png){width="2.3854166666666665in" height="1.5623337707786527in"}

-   定义资源包文件

  ---------------------------------------------------------------------------------------------------
  \<**constant name=\"struts.custom.i18n.resources\" value=\"cn.itcast.i18n.resource.message\"**/\>
  ---------------------------------------------------------------------------------------------------

###### 局部

####### 针对于action类

-   针对action类

> 使用本方法的资源包文件只对当前action有效

-   位置

> 与action类在同一包下

-   文件名

> 基名改为action类名
>
> 格式：
>
> action类名.properties
>
> action类名\_zh\_CN.properties
>
> action类名\_en\_US.properties
>
> 本方法不需要额外配置资源包文件

-   例

> ![](media/image509.png){width="2.6171883202099737in" height="1.09375in"}

####### 针对于package下所有action

-   针对package下所有action

> 该package包下的所有action都可以使用这个properties文件

-   位置

> 针对的package包下

-   文件名

> 基名固定为"package"
>
> 例：
>
> package.properties
>
> package\_zh\_CN.properties
>
> package\_en\_US.properties
>
> 本方法不需要额外配置资源包文件

-   例

> ![](media/image510.png){width="2.110906605424322in" height="1.0833333333333333in"}
>
> 则:action包下的所有action都可以使用package资源包文件

####### jsp页面临时使用资源包文件

-   说明

> jsp页面上可以使用任意包下的资源包文件,在页面上引用该资源包即可

-   引用资源包文件

    -   引入struts2标签库

    -   使用\<s:i18n\>标签

------------------------------------------------------------------------------------------
  \<%@ **page contentType**=\"**text/html;charset=UTF-8**\" **language**=\"**java**\" %\>\
  \<%@**taglib prefix**=\"**s**\" **uri**=\"**/struts-tags**\" %\>\
  \<**html**\>\
  \<**head**\>\
  \<**title**\>\$Title\$\</**title**\>\
  \</**head**\>\
  \<**body**\>\
  \<**s:i18n name=\"cn.itcast.i18n.resource.message\"**/\>\
  \</**body**\>\
  \</**html**\>

------------------------------------------------------------------------------------------

##### 使用国际化

###### action中使用

-   要求

> 在action中使用struts2国际化，要求action类必须继承ActionSupport类

-   方法

> 由于action类继承了ActionSupport类，所以该action类中有1个方法getText获取资源包文件的字段值

-   方法：String getText(String name)

-   功能：

> 在action类中获取资源包文件中字段的值，语言及国家由struts框架自动根据浏览器语言进行判断

-   参数：

> name：资源包文件中字段名

-   返回值：

> 要获取的字段的值

###### 配置文件中使用（validation.xml）

-   validation.xml参加[[配置校验（xml）]{.underline}](#配置校验xml)

-   说明

> 在使用配置校验时，校验出错时返回的错误信息是需要在前台展示的，所以这个错误信息需要使用国际化真毒不同的语言进行展示。
>
> 在配置文件中使用国际化时，只能使用全局或针对package的资源包

-   用法

> 在validation.xml文件中使用message标签时，按如下方法使用：

---------------------------------
  \<**message key=\"字段名\"**/\>
  ---------------------------------

> 字段名为资源包文件中的字段名

-   例程

  --------------------------------------------------
  \<**validators**\>\
  \<**field name=\"username\"**\>\
  \<**field-validator type=\"requiredstring\"**\>\
  \<**message key=\"usernameError\"**/\>\
  \</**field-validator**\>\
  \</**field**\>\
  \</**validators**\>

  --------------------------------------------------

###### jsp页面使用

> 参见[[jsp页面临时使用资源包文件]{.underline}](#jsp页面临时使用资源包文件)，在jsp页面引用资源包时使用了\<s:i18n\>标签
>
> 获取资源包中字段参见例程

-----------------------------------------------------------
  *\<!\-- 在指定资源包中查找字段 \--\>\
  *\<**s:i18n name=\"cn.itcast.i18n.resource.message\"**\>\
  \<**s:text name=\"usernameError\"**/\>\
  \</**s:i18n**\>\
  *\<!\-- 在src下的message资源包中查找字段 \--\>\
  *\<**s:i18n name=\"message\"**\>\
  \<**s:text name=\"usernameError\"**/\>\
  \</**s:i18n**\>\
  *\<!\-- 在全局资源包中查找字段 \--\>\
  *\<**s:text name=\"usernameError\"**/\>

-----------------------------------------------------------

###### 对应多个资源包

> 当同时配置了针对action的资源包、针对package的资源包、全局资源包时
>
> 1个action最多可以从3种资源包中获取字段：
>
> 针对action的资源包、针对package的资源包、全局资源包
>
> 配置文件最多可以从2种资源包中获取字段：
>
> 针对package的资源包、全局资源包
>
> jsp页面是临时指定资源包，所以不会出现对应多个资源包的情况
>
> 此时，action或配置文件会根据范围从最小到最大在资源包中查找字段，资源包范围从小到大排序为：
>
> 针对action的资源包 针对package的资源包 全局资源包

例如：

> action在资源包中查找字段时，会先在针对action的资源包中查找字段，如果找不到该资源包或在该资源包中找不到该字段，则继续在针对package的资源包中查找该字段，如果找不到该资源包或在该资源包中找不到该字段，则继续在全局资源包中查找

##### 动态文本

###### 介绍

> 动态文本在MVC模式下的国际化中讲过，参见[[动态文本格式化]{.underline}](#动态文本格式化)
>
> struts2国际化中使用动态文本时，一般将格式化字符串写在资源包中，在action或jsp页面上使用时，对占位符内容进行赋值并得到需要的字符串

###### 资源包中配置格式化字符串

> 在国际化的资源包中配置字段值时可以使用格式化字符串
>
> ![](media/image511.png){width="3.3962259405074366in" height="2.6341087051618546in"}

###### action类中获取动态文本

####### 方法

> 方法：getText(String key, String\[\] strs)
>
> 功能：获取资源包文件中的动态文本字段值，并对占位符进行赋值得到最终的文本
>
> 所属类：
>
> 该方法是ActionSupport类中的方法，所以可以在继承了ActionSupport类的action类中直接使用
>
> 参数：
>
> key：资源包文件中的字段名
>
> srtrs：String数组内存放的是对占位符赋值的所有参数
>
> 返回值：
>
> 通过key获取资源包文件中格式化字符串后使用数组中的内容对占位符进行赋值后得到的字符串。

####### 例

-   资源包文件中内容如[[资源包中配置格式化字符串]{.underline}](#资源包中配置格式化字符串)中配置一样

-   action代码：

  ----------------------------------------------------------------------------------------------
  **public class** i18nDemo1Action **extends** ActionSupport {\
  **public** String execute() **throws** Exception {\
  String msg = **this**.getText(**\"msg\"**, **new** String\[\]{**\"tom\"**, **\"jerry\"**});\
  System.***out***.println(msg);\
  **return null**;\
  }\
  }

  ----------------------------------------------------------------------------------------------

-   测试

> 将浏览器语言选择为中文时，输出内容如下：
>
> ![](media/image512.png){width="1.1770833333333333in" height="0.28125in"}
>
> 将浏览器语言选择为英文时，输出内容如下：
>
> ![](media/image513.png){width="1.2708333333333333in" height="0.21875in"}

###### jsp页面获取动态文本

####### 方法

> 在[[jsp页面使用]{.underline}](#jsp页面使用)中讲述了如何在jsp页面获取资源包中字段值，在该用法基础上，使用\<s:text\>标签获取字段值后，使用\<s:text\>标签的子标签\<s:param\>对获取到的格式化字符串中的占位符进行赋值

####### 例

-   资源包文件中内容如[[资源包中配置格式化字符串]{.underline}](#资源包中配置格式化字符串)中配置一样

-   jsp页面

  ---------------------------------------------------
  \<**s:i18n name=\"cn.itcast.action.package\"**\>\
  \<**s:text name=\"msg\"**\>\
  \<**s:param**\>tom\</**s:param**\>\
  \<**s:param**\>jerry\</**s:param**\>\
  \</**s:text**\>\
  \</**s:i18n**\>

  ---------------------------------------------------

-   测试

> 将浏览器语言选择为中文时，输出内容如下：
>
> ![](media/image514.png){width="1.4479166666666667in" height="0.40625in"}
>
> 将浏览器语言选择为英文时，输出内容如下：
>
> ![](media/image515.png){width="1.3333333333333333in" height="0.3645833333333333in"}

### interceptor拦截器

#### 介绍

-   struts2拦截器使用的是AOP思想

-   AOP底层实现就是动态代理

-   拦截器采用责任链模式

    -   在责任链模式里，很多对象由每一个对象对下家的引用而连接成1条链

    -   责任链的每一个节点，都可以继续调用下一个节点，也可以阻止流程继续执行

-   struts2在struts-default.xml中声明了所有的拦截器

-   而struts2框架默认使用的是defaultStack

2.  ## hibernate

3.  ## spring

### 概述

#### 什么是spring

> Spring是分层的JavaSE/EE full-stack（一站式）轻量级开源框架

-   分层

    -   SUN提供的EE三层结构：web层、业务层、持久层

    -   web层：struts2、springMVC

    -   持久层：hibernate、mybatis

-   一站式

    -   spring针对三层架构中的每层均具有解决方案

    -   web层：SpringMVC

    -   持久层：JDBC Template（jdbc模板）

    -   业务层：Spring的Bean管理

#### Spring核心

##### IOC（控制反转）

###### 什么叫控制反转

> 将对象的创建权交由spring完成
>
> 以前开发中，web层调用service层时，需要手动创建1个service层类的对象；使用spring进行开发时，不用自己手动创建对象，在spring的配置文件中进行配置后，由spring通过反射创建对象，web层使用service层的对象时，直接通过spring获取即可。

###### IOC原理

> 将service层中类的全路径写在配置文件中，在web层与service层之间，引入1个工厂类，在该类中先获取到配置文件中对应的类的全路径，然后通过反射创建service层类的实例并返回；当web层中需要使用service层类的对象时，通过该工厂类获取即可。

##### AOP（面向切面编程）

###### 

#### spring的jar包

> ![](media/image516.png){width="3.5625in" height="0.4583333333333333in"}

##### spring-framework-3.2.0.RELEASE-dist.zip

###### 说明

spring的jar包

###### 目录结构

-   docs

> spring的API和规范

-   libs

> spring的开发jar包

-   schema

> spring的xml文件中需要使用的约束

##### spring-framework-3.0.2.RELEASE-dependencies.zip

###### 说明

> spring的依赖包（包含之前用过的c3p0、dbutils等）
>
> 在3.2.0之前的版本中是提供依赖包的，但是3.2.0及以后版本就不再提供依赖包了，所以这里使用3.0.2版本中的依赖包

#### spring优点

-   **方便解耦，简化开发**

> Spring就是一个大工厂，可以将所有对象创建和依赖关系维护，交给Spring管理

-   **AOP编程的支持**

> Spring提供面向切面编程，可以方便的实现对程序进行权限拦截、运行监控等功能

-   **声明式事务的支持**

> 只需要通过配置就可以完成对事务的管理，而无需手动编程

-   **方便程序的测试**

> Spring对Junit4支持，可以通过注解方便的测试Spring程序

-   **方便集成各种优秀框架**

> Spring不排斥各种优秀的开源框架，其内部提供了对各种优秀框架（如：Struts、Hibernate、MyBatis、Quartz等）的直接支持

-   **降低JavaEE API的使用难度**

> Spring 对JavaEE开发中非常难用的一些API（JDBC、JavaMail、远程调用等），都提供了封装，使这些API应用难度大大降低

### 入门程序

#### 导入jar包

-   spring开发中的如下jar包

> spring-beans-3.2.0.RELEASE.jar
>
> spring-context-3.2.0.RELEASE.jar
>
> spring-core-3.2.0.RELEASE.jar
>
> spring-expression-3.2.0.RELEASE.jar

-   spring依赖包中的如下jar包

> com.springsource.org.apache.commons.logging-1.1.1.jar
>
> com.springsource.org.apache.log4j-1.2.15.jar

# Maven

## 介绍

> maven是亏啊平台的项目管理工具，主要服务于基于java平台的项目构建、依赖管理和项目信息管理

### 项目构建

> 项目构建就是将代码上传到服务器后，在服务器上执行如下操作的过程
>
> ![](media/image517.png){width="4.322916666666667in" height="0.75in"}
>
> maven的优点：
>
> 高度自动化、跨平台、可重用的组件、标准化

### 依赖管理

> 自动下载，统一依赖管理

### 项目信息

> 项目发布日志，发布者信息等

## maven模型

![](media/image518.png){width="4.96875in" height="3.4791666666666665in"}

### 项目对象模型

> POM：project object module
>
> maven将整个项目看作1个对象，这个项目对象的属性在pom.xml中进行配置

### 依赖管理模型

# SSM框架

## mybatis

### 基础

#### 纯JDBC问题总结

##### 频繁连接数据库

###### 问题

> 纯jdbc操作数据库时,需要使用时创建连接,不使用立即释放,对数据库频繁的连接开启和关闭,造成数据库资源浪费,影响性能

###### 解决方案(设想)

> 使用数据库连接池管理数据库连接

##### sql语句硬编码

###### 问题

> 将sql语句硬编码到java代码中,如果sql语句修改,需要重新编译java代码,不利于系统维护.

###### 解决方案(设想)

> 将sql语句配置在xml配置文件中,即使sql语句改变,不需要重新编译java代码

##### 参数硬编码

###### 问题

> 向preparedstatement中设置参数时,占位符位置和设置参数时硬编码到java代码中的,不利于系统维护

###### 解决方案(设想)

> 将sql语句、占位符、参数均配置在xml文件中

##### 结果集硬编码

###### 问题

> 从resultset中遍历数据时存在硬编码，不利于系统维护

###### 解决方案（设想）

> 将查询的结果集自动映射为java对象

#### mybatis框架介绍

1)  mybatis是1个持久层的框架。

2)  下载地址：https://github.com/mybatis/mybatis-3/releases

3)  mybatis让程序员将主要精力放到sql上，通过mybatis提供的映射方式，自由灵活的生成（半自动化，大部分需要程序员编写sql）满足需要sql语句

4)  mybatis可以将preparedstatement中的输入参数自动进行输入映射，将查询结果集灵活映射成java对象（输出映射）。

#### mybatis框架

#### mybatis驱动包

![](media/image519.png){width="1.5520833333333333in" height="1.1979166666666667in"}

mybatis-3.2.7.jar：核心包

lib：依赖包

### 入门程序

#### 需求

1)  根据ID（主键）查询用户信息

2)  根据用户名模糊查询用户信息

3)  增、删、改用户

#### 环境搭建

1)  JDK：jdk1.7

2)  IDE：myeclipse

3)  数据库：mysql

4)  jar包：mysql驱动、mybatis驱动包

> 在工程中导入mysql驱动包，和mybatis驱动包下lib目录下的所有jar包

#### 搭建工程结构

##### 导入jar包

1)  需要导入mysql驱动jar包：

> ![](media/image520.png){width="2.5in" height="0.3125in"}

2)  mybatis驱动jar包：

> lib目录下的所有jar包
>
> ![](media/image521.png){width="1.5520833333333333in" height="1.2083333333333333in"}

##### log4j.properties

> 该文件用于配置打印log信息

1)  工程下新建source folder，命名为"config"

2)  在config下新建file，命名为"log4j.properties"

3)  在log4j.properties文件中输入如下内容：

> \# Global logging configuration
>
> log4j.rootLogger=DEBUG, stdout
>
> \# Console output\...
>
> log4j.appender.stdout=org.apache.log4j.ConsoleAppender
>
> log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
>
> log4j.appender.stdout.layout.ConversionPattern=%5p \[%t\] - %m%n
>
> 其中的rootLogger：
>
> 在开发环境中设置为DEBUG，生产环境中设置为infor或error

1.  SqlMapConfig.xml

> 全局配置文件

1)  在config目录下新建file，命名为"SqlMapConfig.xml"

<!-- -->

2.  mapper.xml

<!-- -->

1)  在config目录下新建Package，命名为"sqlmap"，用于存放mapper.xml文件

<!-- -->

3.  工程结构

> 经过上面的步骤，工程结构搭建完成，如下如：

![image427.png](media/image522.png){width="3.0555555555555554in" height="4.5729407261592305in"}

#### SqlMapConfig.xml

> 该文件是全局配置文件，用于配置mybatis的运行环境，数据源，事务等
>
> 暂时使用下面的配置内容，与spring整合后，envirments配置将废除
>
> \<?xmlversion=*\"1.0\"*encoding=*\"UTF-8\"*?\>
>
> \<!DOCTYPEconfiguration
>
> PUBLIC\"-//mybatis.org//DTD Config 3.0//EN\"
>
> \"http://mybatis.org/dtd/mybatis-3-config.dtd\"\>
>
> \<configuration\>
>
> \<!\-- 和spring整合后 environments配置将废除\--\>
>
> \<environmentsdefault=*\"development\"*\>
>
> \<environmentid=*\"development\"*\>
>
> \<!\-- 使用jdbc事务管理\--\>
>
> \<transactionManagertype=*\"JDBC\"*/\>
>
> \<!\-- 数据库连接池\--\>
>
> \<dataSourcetype=*\"POOLED\"*\>
>
> \<propertyname=*\"driver\"*value=*\"com.mysql.jdbc.Driver\"*/\>
>
> \<propertyname=*\"url\"*value=*\"jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8\"*/\>
>
> \<propertyname=*\"username\"*value=*\"root\"*/\>
>
> \<propertyname=*\"password\"*value=*\"mysql\"*/\>
>
> \</dataSource\>
>
> \</environment\>
>
> \</environments\>
>
> \</configuration\>

#### 根据用户ID（主键）查询用户信息

##### 映射文件

> 用于配置sql语句

###### 命名

(1) mybatis非代理开发的映射文件命名方式为：xxx.xml

> 如：User.xml

(2) mybatis代理开发的映射文件命名方式为：xxxMaper.xml

> 如：UserMaper.xml

###### 内容

> 本程序使用非代理开发
>
> 在"sqlmap"的包下 新建User.xml文件，并加入如下内容：
>
> \<?xmlversion=*\"1.0\"*encoding=*\"UTF-8\"*?\>
>
> \<!DOCTYPEmapper
>
> PUBLIC\"-//mybatis.org//DTD Mapper 3.0//EN\"
>
> \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\"\>
>
> \<mappernamespace=*\"test\"*\>
>
> \</mapper\>

####### dtd约束

> SqlMapConfig.xml文件和User.xml文件中均有dtd约束，分别为：

1)  SqlMapConfig.xml：

![image428.png](media/image523.png){width="3.4305555555555554in" height="0.3440977690288714in"}

2)  User.xml：

![image429.png](media/image524.png){width="3.4722222222222223in" height="0.3858027121609799in"}

####### 命名空间

> xxx.xml文件中的下面部分内容就是 命名空间：

![image430.png](media/image525.png){width="1.875in" height="0.5in"}

1)  作用

> 对sql进行分类化管理，可以理解为对sql进行隔离
>
> 但是在代理开发的xxxMaper.xml文件中，命名空间有特殊重要的作用

###### 配置sql语句

> sql语句的配置需要在命名空间中进行配置
>
> 这里用通过ID查询用户信息为例
