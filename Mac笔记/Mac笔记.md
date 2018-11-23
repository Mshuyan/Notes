# Mac笔记

## 普通用户无法使用1024以下端口

> 使用80端口启动web项目时始终提示80端口被占用，原因是Mac的普通用户无法使用1024以下端口
>
> 可以通过端口转发解决

- `sudo vim /etc/pf.conf`
- 添加 `rdr on lo0 inet proto tcp from any to 127.0.0.1 port 80 -> 127.0.0.1 port 8080` 到 pf.conf文件的 `rdr-anchor "com.apple/*"` 这一行后面。
- 其中 lo0 通过 ifconfig 看自己那个设备绑定的是 127.0.0.1, lo0是这个网络设备的名字。 8080是要转发的端口
- `sudo pfctl -f /etc/pf.conf`
- `sudo pfctl -e`

这时，应用启动8080端口即可以，访问的话就可以通过80端口来访问了！

> 注意:每次重启过后如果要转发都要执行上面最后两条命令