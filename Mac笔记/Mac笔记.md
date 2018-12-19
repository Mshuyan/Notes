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