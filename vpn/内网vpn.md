# 内网vpn

+ 执行[openvpn-install.sh](./openvpn-install.sh)脚本

  第2步选择`tcp`，其他一路回车

+ 修改配置文件

  + vim文件

    ```sh
    $ vim /etc/openvpn/server/server.conf
    ```

  + 以下四个配置修改为绝对路径

    ```
    ca /etc/openvpn/server/ca.crt
    cert /etc/openvpn/server/server.crt
    key /etc/openvpn/server/server.key
    dh /etc/openvpn/server/dh.pem
    ```

  + 修改如下配置

    ```
    # 禁止所有请求都重定向到vpn服务
    # push "redirect-gateway def1 bypass-dhcp"
    # 客户端互通
    client-to-client
    # 允许1个client多地登录，分配不同ip
    duplicate-cn
    ```

+ 修改启动脚本

  + ```sh
    $ vi /lib/systemd/system/openvpn@.service
    ```

  + ```
    --cd /etc/openvpn/
    # 修改为
    --cd /etc/openvpn/server/
    ```

  + 加载修改

    ```sh
    $ systemctl daemon-reload
    ```

+ 重启

  ```sh
  $ sudo systemctl restart openvpn@server.service
  ```

+ 开放1194端口

+ 在`openvpn-install.sh`同级目录下，已经生成了1个`client.ovpn`文件，下载下来

  + 每个用户需要使用安装脚本生成单独得`*.ovpn`文件，否则会导致抢ip
  + 理论上server端配置了`duplicate-cn`应该不会抢ip，但是发现了该问题，以后就使用不同得客户端文件登陆就可以了，这样也可以保证客户端ip固定

+ 修改`client.ovpn`

  ```sh
  # 删除 block-outside-dns，否则将使用vpn的dns解析
  # block-outside-dns
  # 禁止从服务端拉取配置
  route-nopull
  # 只有这个号段走vpn
  route 10.8.0.0 255.255.255.0  vpn_gateway
  ```

+ 下载客户端并安装，导入`client.ovpn`配置文件，连接

  + windows

    https://openvpn.net/community-downloads/

  + mac

    https://openvpn.net/vpn-server-resources/connecting-to-access-server-with-macos/

+ 查看自己ip
  + 鼠标放在右下角的图标上，即可看见分配的ip
  + 执行`ifconfig`或`ipconfig`，查看`10.8.0.x`的ip

