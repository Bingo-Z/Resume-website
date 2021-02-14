-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: curriculum-vitae
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bingo_edu`
--

DROP TABLE IF EXISTS `bingo_edu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bingo_edu` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int DEFAULT NULL COMMENT '用户编号',
  `start` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开始时间',
  `end` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '结束时间',
  `school` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学校',
  `study` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业名称',
  `description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  KEY `edu_userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用于描述用户的学习';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingo_edu`
--

LOCK TABLES `bingo_edu` WRITE;
/*!40000 ALTER TABLE `bingo_edu` DISABLE KEYS */;
/*!40000 ALTER TABLE `bingo_edu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingo_skill`
--

DROP TABLE IF EXISTS `bingo_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bingo_skill` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int DEFAULT NULL COMMENT '用户编号',
  `keywords` varchar(1024) DEFAULT NULL COMMENT '用户的技能词列表',
  PRIMARY KEY (`id`),
  KEY `skill_userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户技能表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingo_skill`
--

LOCK TABLES `bingo_skill` WRITE;
/*!40000 ALTER TABLE `bingo_skill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bingo_skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingo_specialty`
--

DROP TABLE IF EXISTS `bingo_specialty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bingo_specialty` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int DEFAULT NULL COMMENT '用户编号',
  `name` varchar(64) DEFAULT NULL COMMENT '特长名称',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='用于描述用户特长';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingo_specialty`
--

LOCK TABLES `bingo_specialty` WRITE;
/*!40000 ALTER TABLE `bingo_specialty` DISABLE KEYS */;
/*!40000 ALTER TABLE `bingo_specialty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingo_user`
--

DROP TABLE IF EXISTS `bingo_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bingo_user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '用户唯一标示，用于关联教育经历、工作经历、特长以及技能列表',
  `name` varchar(16) DEFAULT NULL COMMENT '姓名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `city` varchar(32) DEFAULT NULL COMMENT '地区城市',
  `address` varchar(256) DEFAULT NULL COMMENT '详细地址',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱地址',
  `phone` varchar(32) DEFAULT NULL COMMENT '电话或手机号码',
  `weixin` varchar(64) DEFAULT NULL COMMENT '微信号码',
  `qq` varchar(32) DEFAULT NULL COMMENT 'qq号码',
  `weibo` varchar(256) DEFAULT NULL COMMENT '微博地址',
  `sex` varchar(8) DEFAULT NULL COMMENT '用户性别',
  `description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '个人简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COMMENT='用户基础信息表，包含了用户的基本信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingo_user`
--

LOCK TABLES `bingo_user` WRITE;
/*!40000 ALTER TABLE `bingo_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `bingo_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingo_work`
--

DROP TABLE IF EXISTS `bingo_work`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bingo_work` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int DEFAULT NULL COMMENT '用户编号',
  `start` varchar(64) DEFAULT NULL COMMENT '开始时间',
  `end` varchar(64) DEFAULT NULL COMMENT '结束时间',
  `company` varchar(64) DEFAULT NULL COMMENT '所在公司',
  `job` varchar(64) DEFAULT NULL COMMENT '岗位名称',
  `description` varchar(1024) DEFAULT NULL COMMENT '工作描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='用于描述用户的工作经历';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingo_work`
--

LOCK TABLES `bingo_work` WRITE;
/*!40000 ALTER TABLE `bingo_work` DISABLE KEYS */;
/*!40000 ALTER TABLE `bingo_work` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-24 15:44:33
