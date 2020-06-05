# AndroidUtilsProject

Android 开发工具类，助力快速开发  

## 系列

在工作之余，打算将一些常用的逻辑页面，模块，功能点做成library库，这样当有相似需求的时候，可以做到插拔式开发！现在系列中有以下内容

+ [App内部自动更新-AutoUpdateProject](https://github.com/MZCretin/AutoUpdateProject)
+ [选择城市-CitySelect](https://github.com/MZCretin/CitySelect)
+ [扫描二维码条形码控件-ScanCode](https://github.com/MZCretin/ScanCode)
+ [一键打开WebView件-WebViewUtils](https://github.com/MZCretin/WebViewUtils)
+ [简约动态权限申请库-FanPermission](https://github.com/MZCretin/FanPermission)
+ [弹出自定义支付密码输入框-InputPswDemo](https://github.com/MZCretin/InputPswDemo)
+ [安卓常用工具集成-AndroidUtils](https://github.com/MZCretin/AndroidUtilsProject)

## APIS

### 字符串处理 StringUtils.java

| 方法名         | 说明             |
| -------------- | ---------------- |
| isSomeOneEmpty | 参数中有一个为空 |
| isAllNotEmpty  | 参数都不为空     |
| isAllEmpty     | 参数都为空       |

### 邮件处理 EmailUtils.java

| 方法名    | 说明                   |
| --------- | ---------------------- |
| sendEmail | 调用系统邮件软件发邮件 |

### 打开外部app工具 OpenAppUtils.java

| 方法名                | 说明                                          |
| --------------------- | --------------------------------------------- |
| openDefaultBrowser    | 打开默认浏览器                                |
| openAimPackageBrowser | 打开指定浏览器 打开失败则打开默认浏览器       |
| openPhoneBrowser      | 打开系统自带的浏览器 打开失败则打开默认浏览器 |

### 密码相关工具类 PswUtils.java

| 方法名                                | 说明                                                         |
| ------------------------------------- | ------------------------------------------------------------ |
| isContainsNumUpperLowerOtherCase      | 是否包含【大写字母】【小写字母】【数字】【特殊字符】所有类型 |
| isContainsNumUpperLowerOtherCaseWith2 | 是否包含【大写字母】【小写字母】【数字】【特殊字符】中的两种 |
| isContainsNumUpperLowerOtherCaseWith3 | 是否包含【大写字母】【小写字母】【数字】【特殊字符】中的三种 |

