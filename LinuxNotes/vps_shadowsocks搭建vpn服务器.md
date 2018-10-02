# vps+shadowsocks搭建vpn服务器

> 搭建vpn服务器需要购买1个国外的vps服务器，安装shadowsocks

## vps

> + vps就是虚拟的ecs服务器，因为是虚拟的，配置较低，所以价格比ecs服务器便宜，不适合搭建web服务，但是用来搭建vpn服务器足够了
> + 下面介绍几个常用的vps服务器

### vultr

+ 价格

  > 选购vps服务器时，选尽可能便宜的就可以，主要选择如下：

  + `$2.5/month`

    500G流量每月

    只有ipv6地址（此特性决定了不能访问很多只有ipv4地址的网站，所以不能选择该套餐）

  + `$3.5/month`

    500G流量每月

    有ipv4地址（因为此特性，该套餐是最好的选择）

+ 优惠

  + 优惠信息参见[vultr优惠网](https://www.vultryhw.com/vultr-lastest-promo/)

  + 2018.10.1更新

    >  vultr的优惠活动基本只针对新用户，目前优惠主要有2种：

    + 冲`$10`送`$100`

      > 该活动需要在指定的注册入口进行注册，具体入口地址参见优惠网，该入口地址页面上回标注对应的优惠信息的，如果没有标注，不要注册。
      >
      > 本活动中的`$100`有效期仅2个月，因为我们选购的是`$3.5/month`的套餐，所以该优惠相对下面的优惠并不合适

    + 冲`$10`送`$25`

      > 该活动需要在指定的注册入口进行注册，具体入口地址参见优惠网，该入口地址页面上回标注对应的优惠信息的，如果没有标注，不要注册。
      >
      > 本活动中的`$25`有效期为1年，该套餐相对划算

    + 关注`twitter`账号送`$3`

      在`vultr优惠网`中找到该活动地址，进入后按照要求完成验证、关注、发推文，即可获得`$3`

  + 新用户检测

    vultr会检测你是否是老用户找了个新账号进行注册，一旦检测到两个账后都会被封，所以真正的新用户使用vultr比较划算，老用户就不划算了

### 搬瓦工

> [搬瓦工官网](https://bwh1.net/)

+ 价格

  > + $19.99
  > + 500G流量/月
  > + 有ipv4

+ 优惠

  > + [搬瓦工优惠网](https://www.bwgyhw.com/bandwagonhost-lastest-promo/)
  > + 在优惠网上可以找到优惠码，可以便宜`6.25%`，算下来一年`￥134`
  > + 搬瓦工的优惠是针对所有用户的，所以适合长期使用

+ kvm对比openVZ

  不要选择openVZ，要选择kvm

## 搭建vpn服务器

> 2018.10.1：购买的是vultr的冲`$10`送`$25`，并关注`twitter`共获得`$38`，使用的是`$3.5/month`，算下来`$10`使用10个半月（`$1`=`￥7.142`）

+ 打开[shadowsocks安装脚本](https://github.com/liuyongchao/url_recoder/raw/master/install-shadowsocks.sh)，新建文件`install_shadowsocks.sh`，复制网页内容到该文件

+ 增加执行权限并执行脚本

  ```shell
  chmod +x install_shadowsocks.sh
  ./install_shadowsocks.sh
  ```

  > 此时shadowsocks服务已经安装完成，会自动打印出连接vpn的相关信息

  ```txt
  server:      45.76.196.180
  server_port: 8388
  password:    5g5zU2LvLquPbhHtWomWA3q9FiXdDVoc
  method:      aes-256-cfb
  ```

+ 修改vpn配置（可选）

  修改`/etc/shadowsocks.json`，保存退出，并执行`systemctl restart shadowsocks`生效更改

+ 防火墙开始ss服务端口

  > + ss服务端口就是在`/etc/shadowsocks.json`文件汇总配置的端口
  > + 不同linux服务器开启端口的方式不太相同，这里使用的是centos7

  ```shell
  firewall-cmd --permanent --add-port=8388/tcp
  firewall-cmd --reload
  ```






