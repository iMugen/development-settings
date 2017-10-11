## 初次配置IntelliJ IDEA

### 下载

	https://www.jetbrains.com/idea/download/#section=windows

### 解压或安装

本文将IDEA解压或安装目录称为`%idea-client%`

### 配置路径

编辑`%idea-client%\bin\idea.properties`

	idea.config.path=C:/java-development/idea-metadata/config
	idea.system.path=C:/java-development/idea-metadata/system

- `%idea-metadata%\config`可以认为是配置文件夹，配置结束后可以打包备份
- `%idea-metadata%\system`可以认为是的缓存文件夹，隔段时间可以清空一下

### 启动

- 运行`%idea-client%\bin\idea64.exe`
- 选择`Do not import settings`

### 授权

- 选择`License Server`
- `License server address`填入 http://idea.iteblog.com/key.php

### UI themes

选择`Darcula`

### Default plugins

- `Java Frameworks` 只选择`Hibernate`、`AspectJ`、`Spring`、`Java EE`
- `Build Tools` 只选择Maven
- `Web Development` 不变动
- `Version Controls` 只选择`GitHub`、`Subversion`、`Git`
- `Test Tools` 只选择`JUnit`
- `Application Servers` 只选择`Tomcat and TomEE`、`Jetty`
- `Clouds` 禁用所有
- `Swing` 禁用
- `Android` 禁用
- `Database Tools` 不变动
- `Other Tools` 不变动
- `Plugin Development` 禁用

### Featured plugins

- `Live Edit Tool` 安装

### Welcome窗口

这里可以备份一下文件夹`%idea-metadata%\config`

### JDK

`Configure` - `Project Defaults` - `Project Structure` > `Project` > `New` > ...

### UI字体

`Configure` - `Settings` - `Appearance & Behavior` - `Appearance` > `Override default fonts by(not recommended):` - ...

### 代码字体

`Editor` - `Font` > `Show only monospaced fonts` - ...

### 全局编码

`Editor` - `File Encodings` > 三个选择框全都选择UTF-8

### Git和GitHub

- `Version Control` - `Git` > `…` - ...
- `Version Control` - `GitHub` > `Create API Token` > ...

### Maven

`Build, Execution, Deployment` - `Build Tools` - `Maven` > `Maven home directory:`以及`User settings file:`

### 关闭拼写检查

`Editor` - `Inspections` > `Spelling` - `Typo`取消勾选

### 去除斜体字

`Editor` - `Color Scheme` - `General`、`Language Defaults`、`Java`下的所有条目的`Italic`取消勾选

### 去除JavaDoc中标签的下划线

`Editor` - `Color Scheme` - `Language Defaults` > `Comments` - `Doc Comments` - `Tag` - `Effects`取消勾选

### Mybatis的xml中SQL的背景颜色

- `Editor` - `Inspections` > `SQL` - `No data sources configured`和`SQL dialect detection`取消勾选（橘黄色背景变成灰色）
- `Editor` - `Color Scheme` - `General` > `Code` - `Injected language fragment` - `Background`取消勾选（灰色背景消失）

### 引用eclipse中的Java代码格式化策略

- `Configure` - `Plugins` > `Browse repositories...` > 搜索`Eclipse Code Formatter` - `Install`
- 等待IDEA重启
- `Configure` - `Settings` - `Eclipse Code Formatter` > `Use the Eclipse code formatter` - `Eclipse Java Formatter config file`选择code-style.xml

### 备份点2

这里可以备份一下文件夹`%idea-metadata%\config`

### 关闭自动保存

`Appearance & Behavior` - `System Settings` > `Synchronize files on frame or editor tab activation`和`Save files on frame deactivation`取消勾选

### 修改后未保存的文件标签标记为*号

`Editor` - `General` - `Editor Tabs` > `Mark modified tabs with asterisk`

### 开启自动import

`Editor` - `General` - `Auto Import` > `Add unambiguous imports on the fly`和`Optimize imports on the fly (for current project)`勾选

### 备份点3

这里可以备份一下文件夹`%idea-metadata%\config`

### 使用eclipse风格的快捷键

`Keymap` - `default`变更为`Eclipse`

### XML格式化风格

`Editor` - `Code Style` - `XML` > `Other` - `Spaces` - `In empty tag`勾选

### 代码高亮

`Editor` - `Color Scheme` - `General` >

- 光标所在行 `Editor` - `Caret row`，Deolin习惯将`Background`改为`#464646`

- 垂直缩进线 `Code` - `Vertical indent guide`

- 与光标所在位置一致的其他标识符 `Code` - `Identifier under caret`和`Identifier under caret (write)`

- 选中代码的背景色 `Editor` - `Selection background`

- 选中代码的文字色 `Editor` - `Selection foreground`

- 检索时关键字高亮 `Search Results` - `Text search result`

### 备份点4

这里可以备份一下文件夹`%idea-metadata%\config`

### 保存时自动格式化插件

- `Configure` - `Plugins` > `Browse repositories...` > 搜索`Save Actions` - `Install`
- 等待IDEA重启
- `Configure` - `Settings` - `Other Settings` - `Save Actions` > `No action if compile errors`勾选，`Organize imports`取消勾选

### 消除字符串字面量前面的“S:”

- `Setting` - `Editor` - `General` - `Appearance` > `Show parameter name hints`取消勾选

### 备份点5
