# Mac笔记

## 普通用户无法使用1024以下端口

> 使用80端口启动web项目时始终提示80端口被占用，原因是Mac的普通用户无法使用1024以下端口
>
> 可以通过端口转发解决

- `sudo vim /etc/pf.conf`
- 添加 `rdr on lo0 inet proto tcp from any to 127.0.0.1 port 80 -> 127.0.0.1 port 8080` 到 pf.conf文件的 `rdr-anchor "com.apple/*"` 这一行后面。

  其中 lo0 通过 ifconfig 看自己那个设备绑定的是 127.0.0.1, lo0是这个网络设备的名字。 8080是要转发的端口
- `sudo pfctl -f /etc/pf.conf`
- `sudo pfctl -e`

这时，应用启动8080端口即可以，访问的话就可以通过80端口来访问了！

> 注意:每次重启过后如果要转发都要执行上面最后两条命令

## 移动硬盘意外推出

> 参见：[Mac移动硬盘分区无法装载](https://blog.csdn.net/tyforfreedom/article/details/48092901) 

+ 执行如下命令，找到要装载的分区

  ```shell
  WilldeMacBook-Air:dev will$ diskutil list
  /dev/disk0 (internal, physical):
     #:                       TYPE NAME                    SIZE       IDENTIFIER
     0:      GUID_partition_scheme                        *121.3 GB   disk0
     1:                        EFI EFI                     209.7 MB   disk0s1
     2:                 Apple_APFS Container disk1         121.1 GB   disk0s2
  
  /dev/disk1 (synthesized):
     #:                       TYPE NAME                    SIZE       IDENTIFIER
     0:      APFS Container Scheme -                      +121.1 GB   disk1
                                   Physical Store disk0s2
     1:                APFS Volume Macintosh HD            83.8 GB    disk1s1
     2:                APFS Volume Preboot                 45.1 MB    disk1s2
     3:                APFS Volume Recovery                512.8 MB   disk1s3
     4:                APFS Volume VM                      4.3 GB     disk1s4
  
  /dev/disk2 (external, physical):
     #:                       TYPE NAME                    SIZE       IDENTIFIER
     0:     FDisk_partition_scheme                        *1.0 TB     disk2
     1:               Windows_NTFS shuyan                  1.0 TB     disk2s1
  ```

  `disk2s1`就是要装载的分区

+ 执行如下命令，装载分区

  ```shell
  WilldeMacBook-Air:dev will$ sudo diskutil mount /dev/disk2s1
  Password:
  Volume on disk2s1 failed to mount
  If the volume is damaged, try the "readOnly" option
  ```

  这里虽然提示`failed`，但是已经可以在桌面上看到移动硬盘了

## 启动mysql

```shell
$ mysql.server start
```

## Idea破解

参见https://www.jianshu.com/p/f404994e2843

## 软件安装

### ruby

mac本身自带ruby环境，如果存在版本问题，安装教程参见[如何在Mac OS X上安装 Ruby运行环境](https://www.cnblogs.com/daguo/p/4097263.html) 

## 自己编写ssh工具

+ [mac下使用sshpass实现ssh记住密码](https://blog.csdn.net/zhaojianyin/article/details/83899671) 

+ python脚本

  ```python
  #!/usr/local/bin/python3.6
   
  import json
  import sys
  import os
   
  path = os.path.split(os.path.realpath(__file__))[0] + "/sshs.conf"
   # 读取配置文件
  try:
      f = open(path,'r')
  except IOError:
      print ("ERROR：找不到配置文件")
      exit()
  
  # 检查配置文件
  try:
      js = json.load(f)
  except ValueError:
      print ("ERROR：配置文件不是json文件")
      exit()
  
  # 遍历并打印配置
  if isinstance(js,dict):
      for key in js.keys():
          if isinstance(js[key],dict):
              if("name" in js[key].keys()):
                  if isinstance(js[key]["name"],str):
                      if len(sys.argv) > 1:
                          if sys.argv[1] == key:
                              if("cmd" in js[key].keys()):
                                  if isinstance(js[key]["cmd"],str):
                                      os.system(js[key]["cmd"])
                                  else:
                                      print ("ERROR：host " + key + "：cmd属性值格式错误")
                              else:
                                  print ("ERROR：host " + key + "：没有找到cmd选项")
                              exit()
                      else:
                          print (key + "  " + js[key]["name"])
                  else:
                      print ("ERROR：host " + key + "：name属性值格式错误")
              else:
                  print ("ERROR：host " + key + "：对象中找不到name属性")
          else:
              print ("ERROR：host " + key + "：属性值格式错误")
  else:       
      print ("ERROR：配置文件格式错误")
  if len(sys.argv) > 1:
      print ("未找到指定的host")
  
  ```

+ ssh账号配置文件

  ```json
  {
      "m1":{
          "cmd": "sshpass -p 'your-password'  ssh -o StrictHostKeychecking=no -p 22 root@192.168.0.12",
          "name": "short-name"
      }
  }
  ```

## 终端调色

[Mac 终端的字体和配色](https://1ili.github.io/2018/04/19/my-terminal-confing/) 