## 第1章 课程介绍与项目准备
如果你从事Android开发，那你一定要学习一些开发技巧和掌握一些开发逻辑，而很不巧，我这里全部都有，最开始我们介绍一下我们这个应用的整体组织架构，通过对各个平台的api进行一个简单的分析，以及说明一下我们的RxVolley的网络框架使用教程，在本章中，我们将分析整个项目的大致架构，同时，我们有规范性的部署我们的项目...

## 第2章 工具类封装与首页引导页开发
项目最讲究的前期架构搭建，我们把标准的Log和SharedPreferences进行封装，同时开发我们的首页和引导页做一些技巧性的处理，项目开发效率将大大的提高，同时我们继承腾讯的bugly为我们的Carsh做一些约束性的策略！

* log ==> L
* SharedPreferences ==> ShareUtils
* 首页和引导 ==> SplashActivity && GuideActivity
* 腾讯的bugly集成

[相关笔记](https://blog.csdn.net/qq_39981500/article/details/80376471)  



## 第3章 用户注册/登录/忘记重置密码开发
Bmob后端云为我们用户操作带来了极大的便捷，本章主要是涵盖了一个用户系统逻辑，实现用户的登录，注册，找回密码，修改密码，邮箱验证，以及记住密码等功能的实现，通过本章你可以学习到宝贵的用户操作逻辑，同时可以学习到自定义的Dialog以及头像的选择和裁剪！...

![Bomb](pic/Bmob.png)  
* [Bmob官网](https://www.bmob.cn/)  
* [通过Bmob + Android轻松制作一个APP](https://blog.csdn.net/c10wtiybq1ye3/article/details/78316672)  
* 头像的选择和裁剪：[CircleImageView](https://github.com/hdodenhof/CircleImageView)

## 第4章 个人数据编辑/快递及号码地查询开发
时间轴时一个很炫酷的效果，一般作用在物流信息上，我们同样也可以作为一个学习对象去学习他的使用方法，同时吗，我们可以在线查询我们的电话号码归属地，巧用键盘的逻辑提升我们用户体验。

* 时间轴的Adapter实现  
* 快递的查询和手机号码归属地查询 [接口](https://www.juhe.cn/docs/api/id/43)   
* RxVolley的使用  


## 第5章 语音机器人聊天开发
Android智能问答机器人是时下非常流行的一种服务，微软“小冰”的出现更是让其实实在在的风靡了一把。那么，本课程就将带领大家完整的实现整个问答机器人的制作。大家可通过本课程的学习，即将可以打造自己的专属智能机器人,这也是我们管家名字的由来，同时你还可以学习到我们的ListView高级用法-对话列表，也就是我们自定...

* 搜索：问答机器人 [接口](https://www.juhe.cn/docs/api/id/43)   


## 第6章 微信精选文章查看开发
既然是一款轻松娱乐的应用怎么能没有一个新闻列表呢？我们listview实现新闻列表 ，通过webview去加载新闻详情，本章节会讲解Picasso图片加载，以及webview的一些基本应用,自定义加载进度条！

* 搜索：微信精选 [接口](https://www.juhe.cn/docs/api/id/43)   
* WebViewActivity 

## 第7章 美女图片加载/裁剪/缩放开发
有新闻了怎么能少得了美女，我们使用Gank的接口实现一个美女列表，封装我们的图片 加载库Picasso，使用起来更加的方便，并且使用我们的PhotoView实现多点触摸式预览缩放！很值得期待

* 封装 [Picasso](http://square.github.io/picasso/)  ==> PicassoUtils



## 第8章 语音播报/短信提醒/下载更新开发
本章节主要还是作用于设置中心，加入科大讯飞的语音聊天功能，这才是真正的语音机器人，同时我们后台动态注册BroadcastReceiver监听我们的短信智能显示，通过事件分发监听我们的Home和Back键，同时模拟搭建我们的TomCat服务器，这样就可以实现我们的版本更新功能，同时监听我们的进度实现百分比进度条，perfect，逻辑非常的...

* 科大讯飞TTS引擎 [讯飞官网](https://www.xfyun.cn/)
* 事件分发：DispatchLinearLayout  

#### TomCat 四步
* Tomcat: http://tomcat.apache.org/
* 配置环境：CATALINA_HOME 
* 验证： http://localhost:8080/
* 模拟器：127.0.0.1 或者 localhost
* 开启：startup.sh
* 关闭：shutdown.sh  


## 第9章 二维码扫描生成/百度地图定位及绘制开发
二维码现在非常的火，不管什么App，基本上都有集成二维码。所以，在自己的项目中集成二维码功能还是非常有必要的。而百度地图，则是我们扩展的必须功能，不管你认不认可，地图功能都已经成为了我们开发的标配功能了，所以我们通过定位服务在我们的地图上绘制一个我们所在位置的图层。...

* 二维码：Google zxing ==> qrcode
* 二维码使用修改过的：http://github.com/xuyisheng/ZXingLib
* [百度地图](http://lbsyun.baidu.com/)
* 百度地图定位，多图层绘制

## 第10章 细节优化与项目总结
本章，我们把所有的知识点都回顾一遍，哪些不清晰的地方我们再次讲解，做到包学包会的底部来介绍我们本系列课程的视频。