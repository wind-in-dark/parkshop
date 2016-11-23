CREATE DATABASE  IF NOT EXISTS `jcala_blog` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `jcala_blog`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: jcala_blog
-- ------------------------------------------------------
-- Server version	5.5.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(64) DEFAULT '#',
  `github` varchar(64) NOT NULL DEFAULT '#',
  `twitter` varchar(64) NOT NULL DEFAULT '#',
  `md` text,
  `resume` text,
  `avatar` varchar(80) NOT NULL DEFAULT '../img/avatar.jpg',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'admin','21232f297a57a5a743894a0e4a801fc3','1373918920@qq.com','github.uchiyou.com','#','###个人信息\r\n- **姓名：** 周游\r\n- **性别：** 男\r\n- **邮箱：** uchiyou@sina.com\r\n- **学历：** 西安电子科技大学(2013-2017)本科-软件工程-web方向\r\n- **博客：** http://blog.sina.com.cn/uchiyoublog\r\n- **Github：** http://github.com/uchiyou\r\n- **期望职位：**软件工程师\r\n\r\n\r\n---\r\n###荣誉证书\r\n- 国家中级软件设计师证书\r\n- CET四级证书\r\n- 软件学院三等奖学金\r\n\r\n---\r\n###自我评价\r\n- 喜欢共同探讨问题，与人分享；\r\n- 比较努力，暑假留校自学后台相关的知识。\r\n\r\n###技能\r\n- 有良好的软件工程的知识底蕴；\r\n- 熟练掌握Java(1.8万行)，C语言（1.2万行），熟悉SSH框架；\r\n- 熟练掌握redis，Mysql，熟悉Linux环境下编程，常用命令和内核；\r\n- 熟悉java虚拟机， git版本管理,C++,tomcat服务器，javascript/html/css；\r\n\r\n\r\n---\r\n\r\n###实习经历\r\n####普元信息技术有限公司（2016.6-9）\r\n在普元信息技术股份有限公司的SOA 研发部参与基于Docker和微服务的自动化运维平台的产品开发，和Primeton EOS对glassfish的支持\r\n\r\n###项目经历\r\n\r\n* Primeton EOS 对glassfish 的支持\r\n		在普元实习期间，华南区某客户需要将项目迁移到glassfish服务器上，公司决定在一个月内增加 EOS 对glassfish的支持。\r\n		在此项目中，主要参与完成EOS对glassfish 中ejb 模块的jndi,jms不支持的改进；\r\n		处理产品导出的 war 中携带的依赖库与glassfish依赖库的冲突；\r\n		实现glassfish的EOS Studio 扩展服务器接口模块。\r\n\r\n* OA自动化管理系统（16.3-5）\r\n		该系统是为了自动化管理公司的事务，提高工作效率。\r\n		员工信息及个人考勤日程安排计划，项目审批，论坛，内部资源共享，岗位和部门管理，重要事件的记录和通知等事务功能。\r\n		在此项目中，主要负责后端用户信息，权限管理，部门管理，论坛的业务逻辑模块，一些工具类和部分测试类的代码编写。\r\n             项目开发环境  ： windows7 , tomcat8 ,jdk7.2 , mysql5.6\r\n             主要使用框架：struts2, spring2.5 ,hibernate3 ,c3p0，log4j\r\n             源代码获取地址：https://github.com/uchiyou/oa\r\n\r\n---\r\n\r\n\r\n','<h3 id=\"h3-u4E2Au4EBAu4FE1u606F\"><a name=\"个人信息\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>个人信息</h3><ul>\r\n<li><strong>姓名：</strong> 周游</li><li><strong>性别：</strong> 男</li><li><strong>邮箱：</strong> <a href=\"mailto:uchiyou@sina.com\">uchiyou@sina.com</a></li><li><strong>学历：</strong> 西安电子科技大学(2013-2017)本科-软件工程-web方向</li><li><strong>博客：</strong> <a href=\"http://blog.sina.com.cn/uchiyoublog\">http://blog.sina.com.cn/uchiyoublog</a></li><li><strong>Github：</strong> <a href=\"http://github.com/uchiyou\">http://github.com/uchiyou</a></li><li><strong>期望职位：</strong>软件工程师</li></ul>\r\n<hr>\r\n<h3 id=\"h3-u8363u8A89u8BC1u4E66\"><a name=\"荣誉证书\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>荣誉证书</h3><ul>\r\n<li>国家中级软件设计师证书</li><li>CET四级证书</li><li>软件学院三等奖学金</li></ul>\r\n<hr>\r\n<h3 id=\"h3-u81EAu6211u8BC4u4EF7\"><a name=\"自我评价\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>自我评价</h3><ul>\r\n<li>喜欢共同探讨问题，与人分享；</li><li>比较努力，暑假留校自学后台相关的知识。</li></ul>\r\n<h3 id=\"h3-u6280u80FD\"><a name=\"技能\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>技能</h3><ul>\r\n<li>有良好的软件工程的知识底蕴；</li><li>熟练掌握Java(1.8万行)，C语言（1.2万行），熟悉SSH框架；</li><li>熟练掌握redis，Mysql，熟悉Linux环境下编程，常用命令和内核；</li><li>熟悉java虚拟机， git版本管理,C++,tomcat服务器，javascript/html/css；</li></ul>\r\n<hr>\r\n<h3 id=\"h3-u5B9Eu4E60u7ECFu5386\"><a name=\"实习经历\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>实习经历</h3><h4 id=\"h4--2016-6-9-\"><a name=\"普元信息技术有限公司（2016.6-9）\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>普元信息技术有限公司（2016.6-9）</h4><p>在普元信息技术股份有限公司的SOA 研发部参与基于Docker和微服务的自动化运维平台的产品开发，和Primeton EOS对glassfish的支持</p>\r\n<h3 id=\"h3-u9879u76EEu7ECFu5386\"><a name=\"项目经历\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>项目经历</h3><ul>\r\n<li><p>Primeton EOS 对glassfish 的支持</p>\r\n<pre class=\"prettyprint linenums prettyprinted\"><ol class=\"linenums\"><li class=\"L0\"><code><span class=\"pln\">  </span><span class=\"pun\">在普元实习期间，华南区某客户需要将项目迁移到</span><span class=\"pln\">glassfish</span><span class=\"pun\">服务器上，公司决定在一个月内增加</span><span class=\"pln\"> EOS </span><span class=\"pun\">对</span><span class=\"pln\">glassfish</span><span class=\"pun\">的支持。</span></code></li><li class=\"L1\"><code><span class=\"pln\">  </span><span class=\"pun\">在此项目中，主要参与完成</span><span class=\"pln\">EOS</span><span class=\"pun\">对</span><span class=\"pln\">glassfish </span><span class=\"pun\">中</span><span class=\"pln\">ejb </span><span class=\"pun\">模块的</span><span class=\"pln\">jndi</span><span class=\"pun\">,</span><span class=\"pln\">jms</span><span class=\"pun\">不支持的改进；</span></code></li><li class=\"L2\"><code><span class=\"pln\">  </span><span class=\"pun\">处理产品导出的</span><span class=\"pln\"> war </span><span class=\"pun\">中携带的依赖库与</span><span class=\"pln\">glassfish</span><span class=\"pun\">依赖库的冲突；</span></code></li><li class=\"L3\"><code><span class=\"pln\">  </span><span class=\"pun\">实现</span><span class=\"pln\">glassfish</span><span class=\"pun\">的</span><span class=\"pln\">EOS </span><span class=\"typ\">Studio</span><span class=\"pln\"> </span><span class=\"pun\">扩展服务器接口模块。</span></code></li></ol></pre></li><li><p>OA自动化管理系统（16.3-5）</p>\r\n<pre class=\"prettyprint linenums prettyprinted\"><ol class=\"linenums\"><li class=\"L0\"><code><span class=\"pln\">  </span><span class=\"pun\">该系统是为了自动化管理公司的事务，提高工作效率。</span></code></li><li class=\"L1\"><code><span class=\"pln\">  </span><span class=\"pun\">员工信息及个人考勤日程安排计划，项目审批，论坛，内部资源共享，岗位和部门管理，重要事件的记录和通知等事务功能。</span></code></li><li class=\"L2\"><code><span class=\"pln\">  </span><span class=\"pun\">在此项目中，主要负责后端用户信息，权限管理，部门管理，论坛的业务逻辑模块，一些工具类和部分测试类的代码编写。</span></code></li><li class=\"L3\"><code><span class=\"pln\">       </span><span class=\"pun\">项目开发环境</span><span class=\"pln\">  </span><span class=\"pun\">：</span><span class=\"pln\"> windows7 </span><span class=\"pun\">,</span><span class=\"pln\"> tomcat8 </span><span class=\"pun\">,</span><span class=\"pln\">jdk7</span><span class=\"pun\">.</span><span class=\"lit\">2</span><span class=\"pln\"> </span><span class=\"pun\">,</span><span class=\"pln\"> mysql5</span><span class=\"pun\">.</span><span class=\"lit\">6</span></code></li><li class=\"L4\"><code><span class=\"pln\">       </span><span class=\"pun\">主要使用框架：</span><span class=\"pln\">struts2</span><span class=\"pun\">,</span><span class=\"pln\"> spring2</span><span class=\"pun\">.</span><span class=\"lit\">5</span><span class=\"pln\"> </span><span class=\"pun\">,</span><span class=\"pln\">hibernate3 </span><span class=\"pun\">,</span><span class=\"pln\">c3p0</span><span class=\"pun\">，</span><span class=\"pln\">log4j</span></code></li><li class=\"L5\"><code><span class=\"pln\">       </span><span class=\"pun\">源代码获取地址：</span><span class=\"pln\">https</span><span class=\"pun\">:</span><span class=\"com\">//github.com/uchiyou/oa</span></code></li></ol></pre></li></ul>\r\n<hr>\r\n','http://127.0.0.1:8090/img/20168/1474817524426.jpg'),(2,'test','098f6bcd4621d373cade4e832627b4f6','#','#','#',NULL,NULL,'../img/avatar.jpg'),(3,'uchiyou','477c6510370ba163bc1cdd86f0751ac3','#','#','#',NULL,NULL,'../img/avatar.jpg'),(4,'uchiyou1','477c6510370ba163bc1cdd86f0751ac3','#','#','#',NULL,NULL,'../img/avatar.jpg');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_view`
--

DROP TABLE IF EXISTS `blog_view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_view` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `title` varchar(50) NOT NULL,
  `article` text NOT NULL,
  `tags` varchar(80) NOT NULL,
  `md` text NOT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_view`
--

LOCK TABLES `blog_view` WRITE;
/*!40000 ALTER TABLE `blog_view` DISABLE KEYS */;
INSERT INTO `blog_view` VALUES (1,'2016-10-20','fiddler无法抓取chrome解决方法','<p>之前使用fiddler是可以抓chrome的请求的。</p>\r\n<pre class=\"prettyprint linenums prettyprinted\"><ol class=\"linenums\"><li class=\"L0\"><code><span class=\"pln\">    </span><span class=\"pun\">由于我的</span><span class=\"pln\">chrome</span><span class=\"pun\">安装了代理管理的插件</span><span class=\"typ\">SwitchySharp</span><span class=\"pun\">，无论选择直接连接还是选择使用代理连接，插件都会屏蔽</span><span class=\"pln\">fiddler</span><span class=\"pun\">的设置。</span></code></li><li class=\"L1\"><code></code></li><li class=\"L2\"><code><span class=\"pln\">  fiddler</span><span class=\"pun\">会自动给浏览器设置一个代理</span><span class=\"lit\">127.0</span><span class=\"pun\">.</span><span class=\"lit\">0.1</span><span class=\"pln\"> </span><span class=\"pun\">端口</span><span class=\"lit\">8888</span><span class=\"pun\">，并且记忆浏览器的代理设置，所有的请求先走</span><span class=\"pln\">fiddler</span><span class=\"pun\">代理，再走浏览器代理。</span></code></li><li class=\"L3\"><code></code></li><li class=\"L4\"><code><span class=\"pln\"> </span><span class=\"pun\">如果使用插件，可能会直接屏蔽了</span><span class=\"pln\">fiddler</span><span class=\"pun\">的代理，因此无法监听到请求了。</span><span class=\"pln\">chrome</span><span class=\"pun\">下的解决方法，代理插件选择“使用系统代理设置”选项，</span><span class=\"pln\">fiddler</span><span class=\"pun\">又重新能看到</span><span class=\"pln\">chrome</span><span class=\"pun\">的请求了。或者不使用插件，不用卸载，</span><span class=\"pln\">chrome</span><span class=\"pun\">很方便禁用一个插件。然后使用浏览器默认的代理设置方式就</span><span class=\"pln\">ok</span><span class=\"pun\">了。</span></code></li><li class=\"L5\"><code></code></li><li class=\"L6\"><code><span class=\"pun\">使用代理插件是为了方便切换代理，但是可能会导致</span><span class=\"pln\">fiddler</span><span class=\"pun\">等工具无法使用。真是鱼和熊掌不可兼得。</span></code></li></ol></pre>','fiddler ,chrome,SwitchySharp','之前使用fiddler是可以抓chrome的请求的。\r\n\r\n        由于我的chrome安装了代理管理的插件SwitchySharp，无论选择直接连接还是选择使用代理连接，插件都会屏蔽fiddler的设置。\r\n\r\n      fiddler会自动给浏览器设置一个代理127.0.0.1 端口8888，并且记忆浏览器的代理设置，所有的请求先走fiddler代理，再走浏览器代理。\r\n\r\n     如果使用插件，可能会直接屏蔽了fiddler的代理，因此无法监听到请求了。chrome下的解决方法，代理插件选择“使用系统代理设置”选项，fiddler又重新能看到chrome的请求了。或者不使用插件，不用卸载，chrome很方便禁用一个插件。然后使用浏览器默认的代理设置方式就ok了。\r\n\r\n    使用代理插件是为了方便切换代理，但是可能会导致fiddler等工具无法使用。真是鱼和熊掌不可兼得。\r\n\r\n');
/*!40000 ALTER TABLE `blog_view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `url` varchar(60) NOT NULL DEFAULT '#',
  `tech` varchar(250) NOT NULL,
  `desp` text NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (3,'math_draw_compiler','https://github.com/uchiyou/draw_compiler','C ，编译原理 ，数学','该解析器可以将数学函数公式解析为具体的图形，使用C 语言实现。','2016-10-17 06:01:53'),(4,'学生课程管理系统','https://github.com/uchiyou/sms','javaee','              该系统是为了方便学生和教授们课程的管理，如学生可以选择和查询课程，考试后可以查询自己的成绩；\r\n教授可以查询选择了自己课程的学生，发布作业和考试大纲，登记查询或修改学生成绩等功能。在服务端使用 MVC 设计模式，作为项目的设计者，负责定义各个模块的功能，边界和功能模块的通信接口等。\r\n             项目的开发环境： windows7, tomcat7.1, jdk7.2, mysql5.6.\r\n             源代码文档获取地址： https://github.com/uchiyou/sms\r\n','2016-10-17 06:13:05');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view_tag`
--

DROP TABLE IF EXISTS `view_tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `view_tag` (
  `name` varchar(40) NOT NULL,
  `vid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`name`,`vid`),
  KEY `fk_vid` (`vid`),
  CONSTRAINT `fk_vid` FOREIGN KEY (`vid`) REFERENCES `blog_view` (`vid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view_tag`
--

LOCK TABLES `view_tag` WRITE;
/*!40000 ALTER TABLE `view_tag` DISABLE KEYS */;
INSERT INTO `view_tag` VALUES ('chrome',1),('fiddler ',1),('SwitchySharp',1);
/*!40000 ALTER TABLE `view_tag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'jcala_blog'
--

--
-- Dumping routines for database 'jcala_blog'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-26 20:31:53
