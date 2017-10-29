## 新环境中使用IDEA

### 下载

	https://www.jetbrains.com/idea/download/#section=windows

### 解压或安装

本文将IDEA解压或安装目录称为 `%idea-client%`，

### 配置路径

编辑 `%idea-client%\bin\idea.properties`

	idea.config.path=C:/java-development/idea-metadata/config
	idea.system.path=C:/java-development/idea-metadata/system

- `%idea.config.path%`可以认为是配置文件夹，配置结束后可以打包备份
- `%idea.system.path%`可以认为是的缓存文件夹，隔段时间可以清空一下
- 配置过程，每隔几个流程点可以适当打包备份一下作为快照，如果有哪些步骤出现问题，可以删除 `%idea.config.path%`，退回上一个快照

### 启动

- 运行 `%idea-client%\bin\idea64.exe`
- 选择 `Do not import settings`

### 授权

- 选择 `License Server`
- `License server address`填入 `一个地址`

---

下一篇：[功能集成](https://github.com/spldeolin/intellij-idea-config/blob/master/doc/%e5%8a%9f%e8%83%bd%e9%9b%86%e6%88%90.md)