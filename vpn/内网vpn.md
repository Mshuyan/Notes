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





```
client
dev tun
proto tcp
remote 120.76.135.177 1194
resolv-retry infinite
nobind
persist-key
persist-tun
remote-cert-tls server
auth SHA512
cipher AES-256-CBC
ignore-unknown-option block-outside-dns
# 禁止从服务端拉取配置
route-nopull
# 只有这个号段走vpn
route 10.8.0.0 255.255.255.0  vpn_gateway
verb 3
<ca>
-----BEGIN CERTIFICATE-----
MIIDKzCCAhOgAwIBAgIJAJu7CM+v2ZeZMA0GCSqGSIb3DQEBCwUAMBMxETAPBgNV
BAMMCENoYW5nZU1lMB4XDTIxMDIyMjAyMTgzMloXDTMxMDIyMDAyMTgzMlowEzER
MA8GA1UEAwwIQ2hhbmdlTWUwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB
AQCmeRpuszE/dPv76eV4AnXSxIShs2dH3dN0/XlgMBH9ZsfmXl0jUGcMgyN4hv//
Ih52aJkh4SFLpl/yZiFE/8+/YyjooLwcOqEB9i+FdJXqIMgsG4ZN+HjVag5BlPo/
67wmbl443VpQ8Osu8LNxCAlhCKi4ORE28L76nmRRr5MQjJ2nN7LcCIMkOQ8xGFeS
IyFqgl/WR+EK/OA9RS9Zs+1ZJYAAWmhXS3J3W/tR0tZRPMto+7rLhYzU1J6bj1S2
/9zhRU5RqM6mus/QVUSitvtFoygTlMxEUHZrvoE3NOiG68dv9oFGdDjWYe+wjeMk
/o5+rYDiwmP59ed7zXjXFhWFAgMBAAGjgYEwfzAdBgNVHQ4EFgQUPwvmUz+0So+B
oCyljZvqbFgvKg4wQwYDVR0jBDwwOoAUPwvmUz+0So+BoCyljZvqbFgvKg6hF6QV
MBMxETAPBgNVBAMMCENoYW5nZU1lggkAm7sIz6/Zl5kwDAYDVR0TBAUwAwEB/zAL
BgNVHQ8EBAMCAQYwDQYJKoZIhvcNAQELBQADggEBAEWocgZwSTZ3E9RE24C6fGZz
1+N7NqFTuzO7y2GT+0u2RjJnm4ILdSoMWAc5U6uP9cUK5wj/D7G5GwojvNfRs96r
qjuaj78dv+RnQAzyucAHgafvGJ1ntTL6I4QDJgTRp3e/qRdp8Ak7e2ZIbA+N19nO
xizy+PMATlQtIEvJRwebmWpQ+D973lNcEJq6/ikDM0SrFCIyCmbj6mqhYoMCraxi
rPxcHae1PcaD8Epn7mm5EVGF8ySx29KoSCf4AaLAjHeQbI5uLgkq0w5EnfEQ7/PN
/A3CwaGU1UVQvjLlwmtQ08RHtfDUFJH8KeRua4bzVL6SsGoV6EAylYqK7ekBBNM=
-----END CERTIFICATE-----
</ca>
<cert>
-----BEGIN CERTIFICATE-----
MIIDRDCCAiygAwIBAgIRAO1vUR8Jnyi9e3FOwcqe/xIwDQYJKoZIhvcNAQELBQAw
EzERMA8GA1UEAwwIQ2hhbmdlTWUwHhcNMjEwMjIyMDIxODMzWhcNMzEwMjIwMDIx
ODMzWjARMQ8wDQYDVQQDDAZjbGllbnQwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAw
ggEKAoIBAQDSc5tpeIB/PiWlcvC2NBiDAyKhSntZazfna8oyUruMr8trlr9wQNuO
09G14wyoNaOqajRRuEyKVV3+aRj3gnjSQByarbPc1Ui/Xki2gskveftGC1HD3REk
+wh3dEF+E5eig3Hk4rfAHqQSVRdKn1Pq7hZPbXhJfGXgsshnb4ArFgNKOgWg5kKs
JToRgA4RpMhDCMGUJWIipf1A9H78v7ElazRaSCQAqVmM1s8u42DC9uyIRSCLlNK4
Z2kQbhSYF7CgJKU2lB6RIU3pzCAzviMbkWAK1yANZ2jEzMS15EDXlWxGPJ+Dm/aj
VHY2KwlgNQDjByZbZiJP7Bp4i2R3bnr5AgMBAAGjgZQwgZEwCQYDVR0TBAIwADAd
BgNVHQ4EFgQUvecWfmhjwjsvEfV7pMowhB4IE0EwQwYDVR0jBDwwOoAUPwvmUz+0
So+BoCyljZvqbFgvKg6hF6QVMBMxETAPBgNVBAMMCENoYW5nZU1lggkAm7sIz6/Z
l5kwEwYDVR0lBAwwCgYIKwYBBQUHAwIwCwYDVR0PBAQDAgeAMA0GCSqGSIb3DQEB
CwUAA4IBAQBESkdgpr3z7x83r8W/gB7tGLWHsqKqbOrr3Mt8YvQjh/w5Zifx0FLk
Cdpg5KpMJR+18wZcRkqfVCJ0DCe0Zx9AJu7CMX1WrU11nak4tlsAicrlgePH/IQj
INrFbyCm1bXSxhg2hu+r4aini6WywZ9GqEC8+b4aD2Vts7+l6mOvFdGg5wlUVIc0
tqlcza6me9tAxUuUtw6ukPEGRl+ZPyjGfUQHY88Rk36Bjn/r5G5w3kHWGAvgmsB2
9Z53IkZeRanIrtWQgHax1D3cCwpBLttojCgWvo4m/qmOOcWxDJKUgoYiHxNqgP1W
+iE+7Q1/H9UNLLh9f+n66G7+719ysxCr
-----END CERTIFICATE-----
</cert>
<key>
-----BEGIN PRIVATE KEY-----
MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDSc5tpeIB/PiWl
cvC2NBiDAyKhSntZazfna8oyUruMr8trlr9wQNuO09G14wyoNaOqajRRuEyKVV3+
aRj3gnjSQByarbPc1Ui/Xki2gskveftGC1HD3REk+wh3dEF+E5eig3Hk4rfAHqQS
VRdKn1Pq7hZPbXhJfGXgsshnb4ArFgNKOgWg5kKsJToRgA4RpMhDCMGUJWIipf1A
9H78v7ElazRaSCQAqVmM1s8u42DC9uyIRSCLlNK4Z2kQbhSYF7CgJKU2lB6RIU3p
zCAzviMbkWAK1yANZ2jEzMS15EDXlWxGPJ+Dm/ajVHY2KwlgNQDjByZbZiJP7Bp4
i2R3bnr5AgMBAAECggEAGxH/1atIbBWkZgnI6Mb+uCt5EuIvx6rBACWfVqXJtikO
s4Iqkdfl5hNdEFZqVGDB8rPCkxhv0AN3GbiPG5dOz0yr4UGity9AMk2AcOmV02OP
bM0b8WPIRsd7qVHs8ri2cpMR3W1EUZQfarRDULf55WhGumTMajd0K1kT6iovhFsO
zi/OmzVLnUXUWCJOcvKqKJRuhFVjJWBHUWmTaZlW2c6vNCV+caKYuPqWD7cBIWrq
9GRS8jkA2E4/193GaOnG7YrfxLbef8S9u9DYiYbIz4zSh5+iK+qTxfPnYEGNWxUu
aYdInMRRiEaKRHYi9ZH9zh6g5i1KhYfN4ai4za0s+QKBgQDpyK4p9Hx2q6YOqtwh
x9KWwwey6OFDyIqM1BA97nQzLxqqFc3o5Cgchy+pkkmQYAzSHSaZ9DRb/rzHuc2f
NS68rwCQC1rv9Xh7Mx5KTFGmYT889e5eurnYJEzwSQl0ZtoFN7FK62vjlUp+mQma
CBIXh/6M1dogeZl64vzBMEG92wKBgQDmc1DMlIwWYrkP442tFdvBhtlsqg3lyLlU
jqImHUYSqyNiCQ6W+EZf9Tbv2ghjO1/MFzRpHjYJueBQ3EGkX+2iZRdJ1sgd02CA
lRMhsMhPGvZNdiRIOuhdxngD6l3gpV+V+9jTGty8fR81SmWJeC0DObzFWSS8VLQP
mMIBhwIkuwKBgDuJYeFJZBEMsaN2m8z2iIjgbit/5y5N+grXTrOW8HzAeDfsiZ3P
zO9G9jpnCNj9vQYdamE2scbj3su2Y8kx0A85Ohl06tnFV8N4RzSAryKCDYrGzsfN
IdsLk5R15TSBpPBDOKFtxvIUaP5IlwtlFsZrWcYgCAbRMOb8u4Wvdm6VAoGAbEAk
50SsHWPYbJdGmNSYuuqePYYQKy1DqW2qy16a6PANGeMJQG91l2O3n6l6oSpl0Jfh
3bL8TUtMDI+6If2RwePcsam7rQ762MuuBfhlz4rpwe9KEcfiGRK+k5BG8tyb7vcz
nc6Te9MGkuDUm2OhOU+o1ccPE4xyXJU0JMWHgzsCgYEAsMDheA+ERt05cw97y0Gh
uetnn2LkZk2g/Yxfq/073gpZYbM68ejv43w7PZGM0c/T3Ovd/G5yeZQC2/JNpJ13
JsBP2TFlUiL4P8D+6TjA6fbqLcOzFGS1UkC+gDzET5nzB7shU2PI3i+9XUXSfzCs
kF+oVk5D8o0u6Rz/f3Xcbu4=
-----END PRIVATE KEY-----
</key>
<tls-crypt>
-----BEGIN OpenVPN Static key V1-----
96e04e09331ba9f8fda14e6f3ede612b
a8eb97e5c75e82affd7efdff76b2dbbd
fe0e2bb322dbf963642317c72120db83
5a313721085ce44e61ca1be0ea27c4e8
b4595cefa585caa592e46b3579bb9e0b
e80d68276a418406dd1fb62f213db49d
01c71e6c7ebeba43b45d10124c50de49
0e5f78eb8180ed04e697ae7e31f6cf43
28f6532f3d74ff8ee9022e0e25c27e64
16c7be65524900c7c4c8cc6b1f85eba1
12cd0824fbd536eaa2602afc4341ff4b
06b5a93be2eb2b5ffcf741df4fa0849e
65dd1ceaf65afb50bc3fa2e8dcd757bf
0c58bbb5808e16af1bca99adcc995d9f
7f8c7d6457a3b17a6611316623965cbd
d2b93e6915a22a08f9a7be25bbf62d9c
-----END OpenVPN Static key V1-----
</tls-crypt>

```

