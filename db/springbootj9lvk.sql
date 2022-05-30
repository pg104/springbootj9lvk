-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootj9lvk
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `springbootj9lvk`
--

/*!40000 DROP DATABASE IF EXISTS `springbootj9lvk`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootj9lvk` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootj9lvk`;

--
-- Table structure for table `bianji`
--

DROP TABLE IF EXISTS `bianji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bianji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianjizhanghao` varchar(200) NOT NULL COMMENT '编辑账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `bianjixingming` varchar(200) NOT NULL COMMENT '编辑姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianjizhanghao` (`bianjizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642202585 DEFAULT CHARSET=utf8 COMMENT='编辑';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bianji`
--

LOCK TABLES `bianji` WRITE;
/*!40000 ALTER TABLE `bianji` DISABLE KEYS */;
INSERT INTO `bianji` VALUES (31,'2022-03-07 08:31:03','编辑账号1','123456','编辑姓名1','男','773890001@qq.com','13823888881','upload/bianji_xiangpian1.jpg'),(32,'2022-03-07 08:31:03','编辑账号2','123456','编辑姓名2','男','773890002@qq.com','13823888882','upload/bianji_xiangpian2.jpg'),(33,'2022-03-07 08:31:03','编辑账号3','123456','编辑姓名3','男','773890003@qq.com','13823888883','upload/bianji_xiangpian3.jpg'),(34,'2022-03-07 08:31:03','编辑账号4','123456','编辑姓名4','男','773890004@qq.com','13823888884','upload/bianji_xiangpian4.jpg'),(35,'2022-03-07 08:31:03','编辑账号5','123456','编辑姓名5','男','773890005@qq.com','13823888885','upload/bianji_xiangpian5.jpg'),(36,'2022-03-07 08:31:03','编辑账号6','123456','编辑姓名6','男','773890006@qq.com','13823888886','upload/bianji_xiangpian6.jpg'),(1646642202584,'2022-03-07 08:36:42','33','33','王五','女','134@136.com','13444444444','upload/1646642357825.jpg');
/*!40000 ALTER TABLE `bianji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/1646642571881.png'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussgaojianxinxi`
--

DROP TABLE IF EXISTS `discussgaojianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussgaojianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642677441 DEFAULT CHARSET=utf8 COMMENT='稿件信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussgaojianxinxi`
--

LOCK TABLES `discussgaojianxinxi` WRITE;
/*!40000 ALTER TABLE `discussgaojianxinxi` DISABLE KEYS */;
INSERT INTO `discussgaojianxinxi` VALUES (111,'2022-03-07 08:31:03',1,1,'用户名1','评论内容1','回复内容1'),(112,'2022-03-07 08:31:03',2,2,'用户名2','评论内容2','回复内容2'),(113,'2022-03-07 08:31:03',3,3,'用户名3','评论内容3','回复内容3'),(114,'2022-03-07 08:31:03',4,4,'用户名4','评论内容4','回复内容4'),(115,'2022-03-07 08:31:03',5,5,'用户名5','评论内容5','回复内容5'),(116,'2022-03-07 08:31:03',6,6,'用户名6','评论内容6','回复内容6'),(1646642677440,'2022-03-07 08:44:36',1646642476237,1646642167169,'11','这里可以评论',NULL);
/*!40000 ALTER TABLE `discussgaojianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fenpeixinxi`
--

DROP TABLE IF EXISTS `fenpeixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fenpeixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `zhangjie` varchar(200) NOT NULL COMMENT '章节',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  `jianjie` longtext COMMENT '简介',
  `neirong` longtext COMMENT '内容',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `faburiqi` varchar(200) DEFAULT NULL COMMENT '发布日期',
  `zhuanjiazhanghao` varchar(200) DEFAULT NULL COMMENT '专家账号',
  `zhuanjiaxingming` varchar(200) DEFAULT NULL COMMENT '专家姓名',
  `fenpeibeizhu` varchar(200) DEFAULT NULL COMMENT '分配备注',
  `fenpeishijian` date DEFAULT NULL COMMENT '分配时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642403957 DEFAULT CHARSET=utf8 COMMENT='分配信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fenpeixinxi`
--

LOCK TABLES `fenpeixinxi` WRITE;
/*!40000 ALTER TABLE `fenpeixinxi` DISABLE KEYS */;
INSERT INTO `fenpeixinxi` VALUES (51,'2022-03-07 08:31:03','名称1','章节1','upload/fenpeixinxi_fengmian1.jpg','类别1','简介1','内容1','','账号1','姓名1','发布日期1','专家账号1','专家姓名1','分配备注1','2022-03-07'),(52,'2022-03-07 08:31:03','名称2','章节2','upload/fenpeixinxi_fengmian2.jpg','类别2','简介2','内容2','','账号2','姓名2','发布日期2','专家账号2','专家姓名2','分配备注2','2022-03-07'),(53,'2022-03-07 08:31:03','名称3','章节3','upload/fenpeixinxi_fengmian3.jpg','类别3','简介3','内容3','','账号3','姓名3','发布日期3','专家账号3','专家姓名3','分配备注3','2022-03-07'),(54,'2022-03-07 08:31:03','名称4','章节4','upload/fenpeixinxi_fengmian4.jpg','类别4','简介4','内容4','','账号4','姓名4','发布日期4','专家账号4','专家姓名4','分配备注4','2022-03-07'),(55,'2022-03-07 08:31:03','名称5','章节5','upload/fenpeixinxi_fengmian5.jpg','类别5','简介5','内容5','','账号5','姓名5','发布日期5','专家账号5','专家姓名5','分配备注5','2022-03-07'),(56,'2022-03-07 08:31:03','名称6','章节6','upload/fenpeixinxi_fengmian6.jpg','类别6','简介6','内容6','','账号6','姓名6','发布日期6','专家账号6','专家姓名6','分配备注6','2022-03-07'),(1646642403956,'2022-03-07 08:40:03','这里发布稿件','第一章节','upload/1646642286619.jpg','类别3','附件则是上传本地的稿件','<p>这里输入稿件的内容</p><p>还可以适当的插入图片</p><p><img src=\"http://localhost:8080/springbootj9lvk/upload/1646642331956.jpg\"></p>','upload/1646642308607.docx','11','张三','2022-03-07','22','李四','这里备注一下情况','2022-03-07');
/*!40000 ALTER TABLE `fenpeixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gaojianxinxi`
--

DROP TABLE IF EXISTS `gaojianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gaojianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `zhangjie` varchar(200) NOT NULL COMMENT '章节',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  `jianjie` longtext COMMENT '简介',
  `neirong` longtext COMMENT '内容',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `faburiqi` varchar(200) DEFAULT NULL COMMENT '发布日期',
  `zhuanjiazhanghao` varchar(200) DEFAULT NULL COMMENT '专家账号',
  `zhuanjiaxingming` varchar(200) DEFAULT NULL COMMENT '专家姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642476238 DEFAULT CHARSET=utf8 COMMENT='稿件信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gaojianxinxi`
--

LOCK TABLES `gaojianxinxi` WRITE;
/*!40000 ALTER TABLE `gaojianxinxi` DISABLE KEYS */;
INSERT INTO `gaojianxinxi` VALUES (61,'2022-03-07 08:31:03','名称1','章节1','upload/gaojianxinxi_fengmian1.jpg','类别1','简介1','内容1','','账号1','姓名1','发布日期1','专家账号1','专家姓名1','是',''),(62,'2022-03-07 08:31:03','名称2','章节2','upload/gaojianxinxi_fengmian2.jpg','类别2','简介2','内容2','','账号2','姓名2','发布日期2','专家账号2','专家姓名2','是',''),(63,'2022-03-07 08:31:03','名称3','章节3','upload/gaojianxinxi_fengmian3.jpg','类别3','简介3','内容3','','账号3','姓名3','发布日期3','专家账号3','专家姓名3','是',''),(64,'2022-03-07 08:31:03','名称4','章节4','upload/gaojianxinxi_fengmian4.jpg','类别4','简介4','内容4','','账号4','姓名4','发布日期4','专家账号4','专家姓名4','是',''),(65,'2022-03-07 08:31:03','名称5','章节5','upload/gaojianxinxi_fengmian5.jpg','类别5','简介5','内容5','','账号5','姓名5','发布日期5','专家账号5','专家姓名5','是',''),(66,'2022-03-07 08:31:03','名称6','章节6','upload/gaojianxinxi_fengmian6.jpg','类别6','简介6','内容6','','账号6','姓名6','发布日期6','专家账号6','专家姓名6','是',''),(1646642476237,'2022-03-07 08:41:15','这里发布稿件','第一章节','upload/1646642286619.jpg','类别3','专家可以直接修改或者由作者再重新修改','<p>这里输入稿件的内容</p><p>还可以适当的插入图片</p><p><img src=\"http://localhost:8080/springbootj9lvk/upload/1646642331956.jpg\"></p>','upload/1646642308607.docx','11','张三','2022-03-07','22','李四','是','编辑再次审核修改后的稿件');
/*!40000 ALTER TABLE `gaojianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gerengaojian`
--

DROP TABLE IF EXISTS `gerengaojian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gerengaojian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `zhangjie` varchar(200) NOT NULL COMMENT '章节',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  `jianjie` longtext COMMENT '简介',
  `neirong` longtext COMMENT '内容',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642334048 DEFAULT CHARSET=utf8 COMMENT='个人稿件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gerengaojian`
--

LOCK TABLES `gerengaojian` WRITE;
/*!40000 ALTER TABLE `gerengaojian` DISABLE KEYS */;
INSERT INTO `gerengaojian` VALUES (41,'2022-03-07 08:31:03','名称1','章节1','upload/gerengaojian_fengmian1.jpg','类别1','简介1','内容1','','账号1','姓名1','2022-03-07','是',''),(42,'2022-03-07 08:31:03','名称2','章节2','upload/gerengaojian_fengmian2.jpg','类别2','简介2','内容2','','账号2','姓名2','2022-03-07','是',''),(43,'2022-03-07 08:31:03','名称3','章节3','upload/gerengaojian_fengmian3.jpg','类别3','简介3','内容3','','账号3','姓名3','2022-03-07','是',''),(44,'2022-03-07 08:31:03','名称4','章节4','upload/gerengaojian_fengmian4.jpg','类别4','简介4','内容4','','账号4','姓名4','2022-03-07','是',''),(45,'2022-03-07 08:31:03','名称5','章节5','upload/gerengaojian_fengmian5.jpg','类别5','简介5','内容5','','账号5','姓名5','2022-03-07','是',''),(46,'2022-03-07 08:31:03','名称6','章节6','upload/gerengaojian_fengmian6.jpg','类别6','简介6','内容6','','账号6','姓名6','2022-03-07','是',''),(1646642334047,'2022-03-07 08:38:53','这里发布稿件','第一章节','upload/1646642286619.jpg','类别3','附件则是上传本地的稿件','<p>这里输入稿件的内容</p><p>还可以适当的插入图片</p><p><img src=\"http://localhost:8080/springbootj9lvk/upload/1646642331956.jpg\"></p>','upload/1646642308607.docx','11','张三','2022-03-07','是','这里是审核用户发布的稿件信息，并安排专家审核');
/*!40000 ALTER TABLE `gerengaojian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leibie`
--

DROP TABLE IF EXISTS `leibie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leibie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `leibie` varchar(200) NOT NULL COMMENT '类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642545184 DEFAULT CHARSET=utf8 COMMENT='类别';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leibie`
--

LOCK TABLES `leibie` WRITE;
/*!40000 ALTER TABLE `leibie` DISABLE KEYS */;
INSERT INTO `leibie` VALUES (71,'2022-03-07 08:31:03','类别1'),(72,'2022-03-07 08:31:03','类别2'),(73,'2022-03-07 08:31:03','类别3'),(74,'2022-03-07 08:31:03','类别4'),(75,'2022-03-07 08:31:03','类别5'),(76,'2022-03-07 08:31:03','类别6'),(1646642545183,'2022-03-07 08:42:25','科幻类');
/*!40000 ALTER TABLE `leibie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `cpicture` varchar(200) DEFAULT NULL COMMENT '留言图片',
  `reply` longtext COMMENT '回复内容',
  `rpicture` varchar(200) DEFAULT NULL COMMENT '回复图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642230273 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (101,'2022-03-07 08:31:03',1,'用户名1','留言内容1','upload/messages_cpicture1.jpg','回复内容1','upload/messages_rpicture1.jpg'),(102,'2022-03-07 08:31:03',2,'用户名2','留言内容2','upload/messages_cpicture2.jpg','回复内容2','upload/messages_rpicture2.jpg'),(103,'2022-03-07 08:31:03',3,'用户名3','留言内容3','upload/messages_cpicture3.jpg','回复内容3','upload/messages_rpicture3.jpg'),(104,'2022-03-07 08:31:03',4,'用户名4','留言内容4','upload/messages_cpicture4.jpg','回复内容4','upload/messages_rpicture4.jpg'),(105,'2022-03-07 08:31:03',5,'用户名5','留言内容5','upload/messages_cpicture5.jpg','回复内容5','upload/messages_rpicture5.jpg'),(106,'2022-03-07 08:31:03',6,'用户名6','留言内容6','upload/messages_cpicture6.jpg','回复内容6','upload/messages_rpicture6.jpg'),(1646642230272,'2022-03-07 08:37:10',1646642167169,'11','这里可以发布留言',NULL,'这里是回复留言的地方',NULL);
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642599791 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (93,'2022-03-07 08:31:03','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(94,'2022-03-07 08:31:03','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(95,'2022-03-07 08:31:03','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(96,'2022-03-07 08:31:03','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(1646642599790,'2022-03-07 08:43:19','这里是发布公告信息的地方','公告的简介','upload/1646642589582.jpg','<p>公告的内容</p><p><img src=\"http://localhost:8080/springbootj9lvk/upload/1646642598708.jpg\"></p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642219193 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1646642167169,'11','zuozhe','作者','elgxxdh94b7xwhxan09hmnk6vu664b75','2022-03-07 08:36:48','2022-03-07 09:43:28'),(2,1646642202584,'33','bianji','编辑','1zugc9urmuv8ad6k7kws25wcdyg20z98','2022-03-07 08:39:07','2022-03-07 09:41:26'),(3,1646642185630,'22','zhuanjia','专家','2juebevc51ntt78wrcwvwn9iz1py1lf2','2022-03-07 08:40:11','2022-03-07 09:40:11'),(4,1,'abo','users','管理员','ybs5xabhwrrxw7sd86mfvknxvnqoskex','2022-03-07 08:42:07','2022-03-07 09:42:08');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-03-07 08:31:03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanjia`
--

DROP TABLE IF EXISTS `zhuanjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanjiazhanghao` varchar(200) NOT NULL COMMENT '专家账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhuanjiaxingming` varchar(200) NOT NULL COMMENT '专家姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `lianxishouji` varchar(200) DEFAULT NULL COMMENT '联系手机',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanjiazhanghao` (`zhuanjiazhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642185631 DEFAULT CHARSET=utf8 COMMENT='专家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanjia`
--

LOCK TABLES `zhuanjia` WRITE;
/*!40000 ALTER TABLE `zhuanjia` DISABLE KEYS */;
INSERT INTO `zhuanjia` VALUES (21,'2022-03-07 08:31:03','专家账号1','123456','专家姓名1','男','773890001@qq.com','13823888881','upload/zhuanjia_xiangpian1.jpg'),(22,'2022-03-07 08:31:03','专家账号2','123456','专家姓名2','男','773890002@qq.com','13823888882','upload/zhuanjia_xiangpian2.jpg'),(23,'2022-03-07 08:31:03','专家账号3','123456','专家姓名3','男','773890003@qq.com','13823888883','upload/zhuanjia_xiangpian3.jpg'),(24,'2022-03-07 08:31:03','专家账号4','123456','专家姓名4','男','773890004@qq.com','13823888884','upload/zhuanjia_xiangpian4.jpg'),(25,'2022-03-07 08:31:03','专家账号5','123456','专家姓名5','男','773890005@qq.com','13823888885','upload/zhuanjia_xiangpian5.jpg'),(26,'2022-03-07 08:31:03','专家账号6','123456','专家姓名6','男','773890006@qq.com','13823888886','upload/zhuanjia_xiangpian6.jpg'),(1646642185630,'2022-03-07 08:36:25','22','22','李四','女','132@163.com','13222222222','upload/1646642415816.jpg');
/*!40000 ALTER TABLE `zhuanjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuozhe`
--

DROP TABLE IF EXISTS `zuozhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuozhe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646642167170 DEFAULT CHARSET=utf8 COMMENT='作者';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuozhe`
--

LOCK TABLES `zuozhe` WRITE;
/*!40000 ALTER TABLE `zuozhe` DISABLE KEYS */;
INSERT INTO `zuozhe` VALUES (11,'2022-03-07 08:31:03','账号1','123456','姓名1','男','773890001@qq.com','13823888881','upload/zuozhe_xiangpian1.jpg'),(12,'2022-03-07 08:31:03','账号2','123456','姓名2','男','773890002@qq.com','13823888882','upload/zuozhe_xiangpian2.jpg'),(13,'2022-03-07 08:31:03','账号3','123456','姓名3','男','773890003@qq.com','13823888883','upload/zuozhe_xiangpian3.jpg'),(14,'2022-03-07 08:31:03','账号4','123456','姓名4','男','773890004@qq.com','13823888884','upload/zuozhe_xiangpian4.jpg'),(15,'2022-03-07 08:31:03','账号5','123456','姓名5','男','773890005@qq.com','13823888885','upload/zuozhe_xiangpian5.jpg'),(16,'2022-03-07 08:31:03','账号6','123456','姓名6','男','773890006@qq.com','13823888886','upload/zuozhe_xiangpian6.jpg'),(1646642167169,'2022-03-07 08:36:07','11','11','张三','男','131@163.com','13111111111','upload/1646642249400.jpg');
/*!40000 ALTER TABLE `zuozhe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-08 11:57:43
