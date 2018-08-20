# Linux笔记

## 常用命令

### mysql

> Centos

+ 重启mysql

  ```
  systemctl stop mysqld.service
  ```

+ 开机自动启动

  ```
  systemctl enable mysqld.service
  ```

### node

> Centos

+ 安装

  安装EPEL（linux企业版额外软件包）

  ```
  yum install epel-release
  ```

  > 不安装EPEL会导致安装nodejs后没有npm

  安装nodejs、npm

  ```
  yum install nodejs
  ```

  > 此时安装后node版本一般为`6.*`版本，需要升级

  安装nodejs管理工具`n`

  ```
  npm install -g n
  ```

  升级node

  ```
  sudo n latest
  ```

+ 卸载

  ```
  yum remove nodejs npm -y
  ```

  > - 进入 /usr/local/lib 删除所有 node 和 node_modules文件夹
  > - 进入 /usr/local/include 删除所有 node 和 node_modules 文件夹
  > - 检查 ~ 文件夹里面的"local" "lib" "include" 文件夹，然后删除里面的所有 "node" 和 "node_modules" 文件夹
  > - 可以使用以下命令查找 `$ find ~/ -name node` `$ find ~/ -name node_modules`
  > - 删除: /usr/local/bin/npm
  > - 删除: /usr/local/share/man/man1/node.1
  > - 删除: /usr/local/lib/dtrace/node.d
  > - 删除: rm -rf /home/[homedir]/.npm
  > - 删除: rm -rf /home/root/.npm

## 常用操作

### 修改环境变量

1. 对所有用户生效

   ```shell
   vim /etc/profile
   ```

   > 将如下内容添加都文件最后

   ```
   PATH=/usr/local/webserver/php/bin:$PATH
   export PATH
   ```

   > 其中路径是要添加的程序所在的路径
   >
   > 然后退出vim

   ```
   source /etc/profile
   ```

2. 对当前用户生效

   > + 这种方法对root用户貌似没有效果
   > + 将上述方法中的`/etc/profile`替换为`~/.bash_profile`即可

3. 只对当前会话有效（临时）

   > 执行如下命令

   ```shell
   export PATH=/usr/local/webserver/php/bin:$PATH
   ```

   

   