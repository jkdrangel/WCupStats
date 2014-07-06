CREATE DATABASE  IF NOT EXISTS `wcupstats` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `wcupstats`;
-- MySQL dump 10.13  Distrib 5.6.17, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: wcupstats
-- ------------------------------------------------------
-- Server version	5.6.19

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
-- Table structure for table `Copa`
--

DROP TABLE IF EXISTS `Copa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Copa` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ano` date NOT NULL,
  `ID_SEDE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_SEDE` (`ID_SEDE`),
  KEY `FK_qjg6s7ruo90ku3gr4wnhlp2aw` (`ID_SEDE`),
  CONSTRAINT `Copa_ibfk_2` FOREIGN KEY (`ID_SEDE`) REFERENCES `Pais` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Copa`
--

LOCK TABLES `Copa` WRITE;
/*!40000 ALTER TABLE `Copa` DISABLE KEYS */;
/*!40000 ALTER TABLE `Copa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Escalacao`
--

DROP TABLE IF EXISTS `Escalacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Escalacao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Selecao` int(11) DEFAULT NULL,
  `Jogador` int(11) DEFAULT NULL,
  `Jogo` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_forjmpxm0hb834u33uu4le7v1` (`Selecao`),
  KEY `FK_gfb1gjaqoxv64vrtq4rstjnfq` (`Jogador`),
  KEY `FK_lbv7ihfcp23wur4v0jjgx05ak` (`Jogo`),
  CONSTRAINT `FK_forjmpxm0hb834u33uu4le7v1` FOREIGN KEY (`Selecao`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_gfb1gjaqoxv64vrtq4rstjnfq` FOREIGN KEY (`Jogador`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_lbv7ihfcp23wur4v0jjgx05ak` FOREIGN KEY (`Jogo`) REFERENCES `Jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Escalacao`
--

LOCK TABLES `Escalacao` WRITE;
/*!40000 ALTER TABLE `Escalacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Escalacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Gol`
--

DROP TABLE IF EXISTS `Gol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Gol` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_JOGADOR` int(11) DEFAULT NULL,
  `ID_SELECAO` int(11) DEFAULT NULL,
  `ID_JOGO` int(11) DEFAULT NULL,
  `tempo` time NOT NULL,
  `foiContra` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_jxn1iwy5gk1ljngufdab0s87l` (`ID_JOGADOR`),
  KEY `FK_dy5t574jj3r0cas0436rmsw4t` (`ID_SELECAO`),
  KEY `FK_i0ofbqls399gh6emlo72nxl9p` (`ID_JOGO`),
  CONSTRAINT `FK_dy5t574jj3r0cas0436rmsw4t` FOREIGN KEY (`ID_SELECAO`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_i0ofbqls399gh6emlo72nxl9p` FOREIGN KEY (`ID_JOGO`) REFERENCES `Jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_jxn1iwy5gk1ljngufdab0s87l` FOREIGN KEY (`ID_JOGADOR`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Gol`
--

LOCK TABLES `Gol` WRITE;
/*!40000 ALTER TABLE `Gol` DISABLE KEYS */;
/*!40000 ALTER TABLE `Gol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Jogador`
--

DROP TABLE IF EXISTS `Jogador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Jogador` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `data_nascimento` date NOT NULL,
  `nome` varchar(50) NOT NULL,
  `numero` int(11) NOT NULL,
  `posicao` varchar(13) NOT NULL,
  `Selecao` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Jogador_1_idx` (`Selecao`),
  CONSTRAINT `fk_Jogador_1` FOREIGN KEY (`Selecao`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Jogador`
--

LOCK TABLES `Jogador` WRITE;
/*!40000 ALTER TABLE `Jogador` DISABLE KEYS */;
/*!40000 ALTER TABLE `Jogador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Jogo`
--

DROP TABLE IF EXISTS `Jogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Jogo` (
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
  KEY `FK_tc7gt20drtr0gj0om4wweu29b` (`ID_COPA`),
  KEY `FK_10ebi8emygefnkbtgnindonx2` (`SelecaoB`),
  KEY `FK_pofmnrxros002j18bv4sa0bob` (`SelecaoA`),
  CONSTRAINT `FK_10ebi8emygefnkbtgnindonx2` FOREIGN KEY (`SelecaoB`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_pofmnrxros002j18bv4sa0bob` FOREIGN KEY (`SelecaoA`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_tc7gt20drtr0gj0om4wweu29b` FOREIGN KEY (`ID_COPA`) REFERENCES `Copa` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Jogo`
--

LOCK TABLES `Jogo` WRITE;
/*!40000 ALTER TABLE `Jogo` DISABLE KEYS */;
/*!40000 ALTER TABLE `Jogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pais`
--

DROP TABLE IF EXISTS `Pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Pais` (
  `nome` varchar(20) NOT NULL,
  `continente` varchar(20) NOT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pais`
--

LOCK TABLES `Pais` WRITE;
/*!40000 ALTER TABLE `Pais` DISABLE KEYS */;
/*!40000 ALTER TABLE `Pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Selecao`
--

DROP TABLE IF EXISTS `Selecao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Selecao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `grupo` varchar(20) NOT NULL,
  `ano` date NOT NULL,
  `posicao` int(11) NOT NULL,
  `ID_COPA` int(11) DEFAULT NULL,
  `ID_PAIS` int(11) DEFAULT NULL,
  `Tecnico` int(11) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `grupo` (`grupo`),
  KEY `ID_COPA` (`ID_COPA`),
  KEY `ID_PAIS` (`ID_PAIS`),
  KEY `FK_mlrgqhubj4vh2qgyiyfi4kro2` (`ID_COPA`),
  KEY `FK_o7gtr1yf1274ugdvl3rx41sah` (`ID_PAIS`),
  KEY `Tecnico` (`Tecnico`),
  KEY `FK_kebaqynihk41ibm69lwxm0cjx` (`Tecnico`),
  CONSTRAINT `Selecao_ibfk_1` FOREIGN KEY (`ID_COPA`) REFERENCES `Copa` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_2` FOREIGN KEY (`ID_PAIS`) REFERENCES `Pais` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_3` FOREIGN KEY (`Tecnico`) REFERENCES `Tecnico` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Selecao`
--

LOCK TABLES `Selecao` WRITE;
/*!40000 ALTER TABLE `Selecao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Selecao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Substituicao`
--

DROP TABLE IF EXISTS `Substituicao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Substituicao` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `JogadorSai` int(11) DEFAULT NULL,
  `ID_SELECAO` int(11) DEFAULT NULL,
  `ID_JOGO` int(11) DEFAULT NULL,
  `JogadorEntra` int(11) DEFAULT NULL,
  `tempo` time NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_hwrhqfa1v9dnb9afekp7t90xn` (`JogadorSai`),
  KEY `FK_dk2tvg7gq07k8a3kw4maevu9f` (`ID_SELECAO`),
  KEY `FK_g873mceb22x4uv45fh4m1ijtc` (`ID_JOGO`),
  KEY `FK_exot7nm0x8o0unbp09kb5or5r` (`JogadorEntra`),
  CONSTRAINT `FK_dk2tvg7gq07k8a3kw4maevu9f` FOREIGN KEY (`ID_SELECAO`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_exot7nm0x8o0unbp09kb5or5r` FOREIGN KEY (`JogadorEntra`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_g873mceb22x4uv45fh4m1ijtc` FOREIGN KEY (`ID_JOGO`) REFERENCES `Jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_hwrhqfa1v9dnb9afekp7t90xn` FOREIGN KEY (`JogadorSai`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Substituicao`
--

LOCK TABLES `Substituicao` WRITE;
/*!40000 ALTER TABLE `Substituicao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Substituicao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tecnico`
--

DROP TABLE IF EXISTS `Tecnico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tecnico` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tecnico`
--

LOCK TABLES `Tecnico` WRITE;
/*!40000 ALTER TABLE `Tecnico` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tecnico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-06 14:05:31
