# Git

## git使用多个仓库

使用`sourcetree`，进入仓库，设置，远程仓库

## 问题记录

### HTTP方式clone失败

+ 提示信息

  ```shell
  fatal: unable to access 'http://192.168.66.254/G_TechnicalService/bidding-bigdata.git/': Failed to connect to 127.0.0.1 port 1086: Connection refused
  ```

+ 解决方案

  执行如下命令

  ```shell
  $ git config --global http.proxy
  ```


