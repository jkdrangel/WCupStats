CREATE DATABASE  IF NOT EXISTS `wcupstats` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `wcupstats`;
-- MySQL dump 10.13  Distrib 5.5.37, for debian-linux-gnu (i686)
--
-- Host: 127.0.0.1    Database: wcupstats
-- ------------------------------------------------------
-- Server version	5.5.37-0+wheezy1

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
-- Table structure for table `copa`
--

DROP TABLE IF EXISTS `copa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `copa` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_SEDE` int(11) DEFAULT NULL,
  `ano` date NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_7us0yfr5h78wmtkp6px1e3icc` (`ID_SEDE`),
  CONSTRAINT `FK_7us0yfr5h78wmtkp6px1e3icc` FOREIGN KEY (`ID_SEDE`) REFERENCES `pais` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `copa`
--

LOCK TABLES `copa` WRITE;
/*!40000 ALTER TABLE `copa` DISABLE KEYS */;
/*!40000 ALTER TABLE `copa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escalacao`
--

DROP TABLE IF EXISTS `escalacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `escalacao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Selecao` int(11) DEFAULT NULL,
  `Jogador` int(11) DEFAULT NULL,
  `Jogo` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ox2i60ek781t5ba270s0bxjrx` (`Selecao`),
  KEY `FK_flj19ajw87jnm4pdvo21agvga` (`Jogador`),
  KEY `FK_i6vicdabn76eclsqqjksvt107` (`Jogo`),
  CONSTRAINT `FK_i6vicdabn76eclsqqjksvt107` FOREIGN KEY (`Jogo`) REFERENCES `jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_flj19ajw87jnm4pdvo21agvga` FOREIGN KEY (`Jogador`) REFERENCES `jogador` (`ID`),
  CONSTRAINT `FK_ox2i60ek781t5ba270s0bxjrx` FOREIGN KEY (`Selecao`) REFERENCES `selecao` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escalacao`
--

LOCK TABLES `escalacao` WRITE;
/*!40000 ALTER TABLE `escalacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `escalacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gol`
--

DROP TABLE IF EXISTS `gol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gol` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_JOGADOR` int(11) DEFAULT NULL,
  `ID_SELECAO` int(11) DEFAULT NULL,
  `ID_JOGO` int(11) DEFAULT NULL,
  `tempo` time NOT NULL,
  `foiContra` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_pa2bxjpa76qtsuxmaijdoaojq` (`ID_JOGADOR`),
  KEY `FK_2akdl0ay2gt3hsc6gulioqtyo` (`ID_SELECAO`),
  KEY `FK_e6u6sltajs1nki2ki4ogdd3ws` (`ID_JOGO`),
  CONSTRAINT `FK_e6u6sltajs1nki2ki4ogdd3ws` FOREIGN KEY (`ID_JOGO`) REFERENCES `jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_2akdl0ay2gt3hsc6gulioqtyo` FOREIGN KEY (`ID_SELECAO`) REFERENCES `selecao` (`ID`),
  CONSTRAINT `FK_pa2bxjpa76qtsuxmaijdoaojq` FOREIGN KEY (`ID_JOGADOR`) REFERENCES `jogador` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gol`
--

LOCK TABLES `gol` WRITE;
/*!40000 ALTER TABLE `gol` DISABLE KEYS */;
/*!40000 ALTER TABLE `gol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogador`
--

DROP TABLE IF EXISTS `jogador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jogador` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Selecao` int(11) DEFAULT NULL,
  `data_nascimento` date NOT NULL,
  `nome` varchar(50) NOT NULL,
  `numero` int(11) NOT NULL,
  `posicao` varchar(13) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_6rt03f3oihv63jfc3suvkbls7` (`Selecao`),
  CONSTRAINT `FK_6rt03f3oihv63jfc3suvkbls7` FOREIGN KEY (`Selecao`) REFERENCES `selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=927 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogador`
--

LOCK TABLES `jogador` WRITE;
/*!40000 ALTER TABLE `jogador` DISABLE KEYS */;
/*!40000 ALTER TABLE `jogador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogo`
--

DROP TABLE IF EXISTS `jogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jogo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_COPA` int(11) DEFAULT NULL,
  `SelecaoB` int(11) DEFAULT NULL,
  `SelecaoA` int(11) DEFAULT NULL,
  `data` date NOT NULL,
  `local` varchar(20) NOT NULL,
  `fase` varchar(16) NOT NULL,
  `GolA` int(11) DEFAULT NULL,
  `GolB` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_1d6a6w4fp98akvk3t2p6ljx09` (`ID_COPA`),
  KEY `FK_sempip5ppll9r2fy99q0ntd9s` (`SelecaoB`),
  KEY `FK_h9s0jj2hkr1dll9juuuq56fng` (`SelecaoA`),
  CONSTRAINT `FK_h9s0jj2hkr1dll9juuuq56fng` FOREIGN KEY (`SelecaoA`) REFERENCES `selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_1d6a6w4fp98akvk3t2p6ljx09` FOREIGN KEY (`ID_COPA`) REFERENCES `copa` (`ID`),
  CONSTRAINT `FK_sempip5ppll9r2fy99q0ntd9s` FOREIGN KEY (`SelecaoB`) REFERENCES `selecao` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=220 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogo`
--

LOCK TABLES `jogo` WRITE;
/*!40000 ALTER TABLE `jogo` DISABLE KEYS */;
/*!40000 ALTER TABLE `jogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pais` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  `continente` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (231,'Pais','Mundo'),(232,'Country','World'),(233,'Pais','Mundo'),(234,'Country','World');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `selecao`
--

DROP TABLE IF EXISTS `selecao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `selecao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_COPA` int(11) DEFAULT NULL,
  `ID_PAIS` int(11) DEFAULT NULL,
  `Tecnico` int(11) DEFAULT NULL,
  `grupo` varchar(20) NOT NULL,
  `ano` date NOT NULL,
  `posicao` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_1o63bym3r1v16c50dk63rf569` (`ID_COPA`),
  KEY `FK_oxviobyjdxwn58dqj95d19tv7` (`ID_PAIS`),
  KEY `FK_diheysvp1aciryotutg7iep9r` (`Tecnico`),
  CONSTRAINT `FK_diheysvp1aciryotutg7iep9r` FOREIGN KEY (`Tecnico`) REFERENCES `tecnico` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_1o63bym3r1v16c50dk63rf569` FOREIGN KEY (`ID_COPA`) REFERENCES `copa` (`ID`),
  CONSTRAINT `FK_oxviobyjdxwn58dqj95d19tv7` FOREIGN KEY (`ID_PAIS`) REFERENCES `pais` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=383 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selecao`
--

LOCK TABLES `selecao` WRITE;
/*!40000 ALTER TABLE `selecao` DISABLE KEYS */;
/*!40000 ALTER TABLE `selecao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `substituicao`
--

DROP TABLE IF EXISTS `substituicao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `substituicao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `JogadorSai` int(11) DEFAULT NULL,
  `ID_SELECAO` int(11) DEFAULT NULL,
  `ID_JOGO` int(11) DEFAULT NULL,
  `JogadorEntra` int(11) DEFAULT NULL,
  `tempo` time NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_g81iew0oyrf7i5rane5ib3smq` (`JogadorSai`),
  KEY `FK_27hwnwrj8h9in6971ia0i48io` (`ID_SELECAO`),
  KEY `FK_96i7w3syb7ipybu5ysiqoh9mu` (`ID_JOGO`),
  KEY `FK_7h9ype3jjahmd3242q4fbarrk` (`JogadorEntra`),
  CONSTRAINT `FK_7h9ype3jjahmd3242q4fbarrk` FOREIGN KEY (`JogadorEntra`) REFERENCES `jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_27hwnwrj8h9in6971ia0i48io` FOREIGN KEY (`ID_SELECAO`) REFERENCES `selecao` (`ID`),
  CONSTRAINT `FK_96i7w3syb7ipybu5ysiqoh9mu` FOREIGN KEY (`ID_JOGO`) REFERENCES `jogo` (`ID`),
  CONSTRAINT `FK_g81iew0oyrf7i5rane5ib3smq` FOREIGN KEY (`JogadorSai`) REFERENCES `jogador` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `substituicao`
--

LOCK TABLES `substituicao` WRITE;
/*!40000 ALTER TABLE `substituicao` DISABLE KEYS */;
/*!40000 ALTER TABLE `substituicao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tecnico`
--

DROP TABLE IF EXISTS `tecnico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tecnico` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecnico`
--

LOCK TABLES `tecnico` WRITE;
/*!40000 ALTER TABLE `tecnico` DISABLE KEYS */;
/*!40000 ALTER TABLE `tecnico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-07 13:07:50
