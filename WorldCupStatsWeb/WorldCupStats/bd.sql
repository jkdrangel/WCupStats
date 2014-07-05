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
  `ID_SELECAO` int(11) DEFAULT NULL,
  `ID_SEDE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_SELECAO` (`ID_SELECAO`),
  KEY `ID_SEDE` (`ID_SEDE`),
  KEY `FK_6bo63t1ktmsamyjx9lckj26uq` (`ID_SELECAO`),
  KEY `FK_qjg6s7ruo90ku3gr4wnhlp2aw` (`ID_SEDE`),
  CONSTRAINT `Copa_ibfk_1` FOREIGN KEY (`ID_SELECAO`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Copa_ibfk_2` FOREIGN KEY (`ID_SEDE`) REFERENCES `Pais` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `Jogador6` int(11) DEFAULT NULL,
  `Jogador5` int(11) DEFAULT NULL,
  `Jogador4` int(11) DEFAULT NULL,
  `Jogador3` int(11) DEFAULT NULL,
  `Jogador2` int(11) DEFAULT NULL,
  `Jogador1` int(11) DEFAULT NULL,
  `Jogador10` int(11) DEFAULT NULL,
  `Jogo` int(11) DEFAULT NULL,
  `Jogador11` int(11) DEFAULT NULL,
  `Jogador9` int(11) DEFAULT NULL,
  `Jogador8` int(11) DEFAULT NULL,
  `Jogador7` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_forjmpxm0hb834u33uu4le7v1` (`Selecao`),
  KEY `FK_gfb1gjaqoxv64vrtq4rstjnfq` (`Jogador6`),
  KEY `FK_gsly25grh9w298ngkkviu9erg` (`Jogador5`),
  KEY `FK_d1mj72g07mgi075uu6ciaqpvq` (`Jogador4`),
  KEY `FK_29l2o3dwofv0uq0vhrd2mmy52` (`Jogador3`),
  KEY `FK_l9l40da5kd0lu0qe23ow7t0af` (`Jogador2`),
  KEY `FK_1mfys6wuqe7wqw7o2n8mvixe8` (`Jogador1`),
  KEY `FK_nx3v0x66lbu7c9fhlm3qxv72y` (`Jogador10`),
  KEY `FK_lbv7ihfcp23wur4v0jjgx05ak` (`Jogo`),
  KEY `FK_jxs8dt69hhjlmykwrxn0xg7hs` (`Jogador11`),
  KEY `FK_nowt5fjie2u1ak0gsrfcapk85` (`Jogador9`),
  KEY `FK_q2jfefdbhjxfks6antx74vr4x` (`Jogador8`),
  KEY `FK_a6x7t2svmt00kk9xs9v1fs1ag` (`Jogador7`),
  CONSTRAINT `FK_1mfys6wuqe7wqw7o2n8mvixe8` FOREIGN KEY (`Jogador1`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_29l2o3dwofv0uq0vhrd2mmy52` FOREIGN KEY (`Jogador3`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_a6x7t2svmt00kk9xs9v1fs1ag` FOREIGN KEY (`Jogador7`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_d1mj72g07mgi075uu6ciaqpvq` FOREIGN KEY (`Jogador4`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_forjmpxm0hb834u33uu4le7v1` FOREIGN KEY (`Selecao`) REFERENCES `Selecao` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_gfb1gjaqoxv64vrtq4rstjnfq` FOREIGN KEY (`Jogador6`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_gsly25grh9w298ngkkviu9erg` FOREIGN KEY (`Jogador5`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_jxs8dt69hhjlmykwrxn0xg7hs` FOREIGN KEY (`Jogador11`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_l9l40da5kd0lu0qe23ow7t0af` FOREIGN KEY (`Jogador2`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_lbv7ihfcp23wur4v0jjgx05ak` FOREIGN KEY (`Jogo`) REFERENCES `Jogo` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_nowt5fjie2u1ak0gsrfcapk85` FOREIGN KEY (`Jogador9`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_nx3v0x66lbu7c9fhlm3qxv72y` FOREIGN KEY (`Jogador10`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_q2jfefdbhjxfks6antx74vr4x` FOREIGN KEY (`Jogador8`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `Jogador1` int(11) DEFAULT NULL,
  `Jogador2` int(11) DEFAULT NULL,
  `Jogador3` int(11) DEFAULT NULL,
  `Jogador5` int(11) DEFAULT NULL,
  `Jogador6` int(11) DEFAULT NULL,
  `Jogador7` int(11) DEFAULT NULL,
  `Jogador8` int(11) DEFAULT NULL,
  `Jogador9` int(11) DEFAULT NULL,
  `Jogador10` int(11) DEFAULT NULL,
  `Jogador11` int(11) DEFAULT NULL,
  `Jogador12` int(11) DEFAULT NULL,
  `Jogador13` int(11) DEFAULT NULL,
  `Jogador14` int(11) DEFAULT NULL,
  `Jogador15` int(11) DEFAULT NULL,
  `Jogador16` int(11) DEFAULT NULL,
  `Jogador17` int(11) DEFAULT NULL,
  `Jogador18` int(11) DEFAULT NULL,
  `Jogador19` int(11) DEFAULT NULL,
  `Jogador20` int(11) DEFAULT NULL,
  `Jogador21` int(11) DEFAULT NULL,
  `Jogador22` int(11) DEFAULT NULL,
  `Jogador23` int(11) DEFAULT NULL,
  `Jogador4` int(11) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `grupo` (`grupo`),
  KEY `ID_COPA` (`ID_COPA`),
  KEY `ID_PAIS` (`ID_PAIS`),
  KEY `FK_mlrgqhubj4vh2qgyiyfi4kro2` (`ID_COPA`),
  KEY `FK_o7gtr1yf1274ugdvl3rx41sah` (`ID_PAIS`),
  KEY `Tecnico` (`Tecnico`),
  KEY `Jogador1` (`Jogador1`),
  KEY `Jogador2` (`Jogador2`),
  KEY `Jogador3` (`Jogador3`),
  KEY `Jogador5` (`Jogador5`),
  KEY `Jogador6` (`Jogador6`),
  KEY `Jogador7` (`Jogador7`),
  KEY `Jogador8` (`Jogador8`),
  KEY `Jogador9` (`Jogador9`),
  KEY `Jogador10` (`Jogador10`),
  KEY `Jogador11` (`Jogador11`),
  KEY `Jogador12` (`Jogador12`),
  KEY `Jogador13` (`Jogador13`),
  KEY `Jogador14` (`Jogador14`),
  KEY `Jogador15` (`Jogador15`),
  KEY `Jogador16` (`Jogador16`),
  KEY `Jogador17` (`Jogador17`),
  KEY `Jogador18` (`Jogador18`),
  KEY `Jogador19` (`Jogador19`),
  KEY `Jogador20` (`Jogador20`),
  KEY `Jogador21` (`Jogador21`),
  KEY `Jogador22` (`Jogador22`),
  KEY `Jogador23` (`Jogador23`),
  KEY `FK_kebaqynihk41ibm69lwxm0cjx` (`Tecnico`),
  KEY `Jogador4` (`Jogador4`),
  KEY `FK_33l6pxg0sp3jsb6jjd0ckx46q` (`Jogador20`),
  KEY `FK_6ewywdb3bef5h5ukc3h2r3saa` (`Jogador6`),
  KEY `FK_42sfhf0c31mipsvbyw4hv0c4l` (`Jogador5`),
  KEY `FK_m67xtmynwyw1ny4jeqa333hd8` (`Jogador4`),
  KEY `FK_l7q1lkygymx6q1vjhw2xllvk2` (`Jogador3`),
  KEY `FK_t4y31x3j32djpmo2bkp90bwli` (`Jogador2`),
  KEY `FK_ho9njo2o3lmiy4ykap5w20ye7` (`Jogador18`),
  KEY `FK_9t3sky2nnkpk79603spaw2crf` (`Jogador1`),
  KEY `FK_okfw2ufwr4wir0u8e5ndq8pl3` (`Jogador19`),
  KEY `FK_f9qrlp213a9ainvanbbfj1iw3` (`Jogador14`),
  KEY `FK_r5g9eic6o7agsq5ks107gukcf` (`Jogador15`),
  KEY `FK_e775828e4iodqu0ctb7e85puk` (`Jogador16`),
  KEY `FK_rs9ikka9kd9rghmalfqs2pb1w` (`Jogador17`),
  KEY `FK_5ulndwaaaqeyhrfu13prtsb7a` (`Jogador23`),
  KEY `FK_r3bb083kjr5jh5qmrrmiq4y0` (`Jogador10`),
  KEY `FK_3gcpi65v2ngdu9sl3w2c811qf` (`Jogador9`),
  KEY `FK_3w66mkva3txv0s0wuqvrpulka` (`Jogador11`),
  KEY `FK_t0rulrv47k0husbjsb1gkhuib` (`Jogador21`),
  KEY `FK_1ilj8j8jitxnqcvyfaup4bu7w` (`Jogador8`),
  KEY `FK_fr72qd367e9jc747wlryqbnw7` (`Jogador12`),
  KEY `FK_2hxx7ovj8be2l2lw90aadgycq` (`Jogador22`),
  KEY `FK_1poorm7enb3n7p5u7trxrffp7` (`Jogador13`),
  KEY `FK_lwjwcbnuqrefsptx6sk23wlkx` (`Jogador7`),
  CONSTRAINT `Selecao_ibfk_1` FOREIGN KEY (`ID_COPA`) REFERENCES `Copa` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_10` FOREIGN KEY (`Jogador8`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_11` FOREIGN KEY (`Jogador9`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_12` FOREIGN KEY (`Jogador10`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_13` FOREIGN KEY (`Jogador11`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_14` FOREIGN KEY (`Jogador12`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_15` FOREIGN KEY (`Jogador13`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_16` FOREIGN KEY (`Jogador14`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_17` FOREIGN KEY (`Jogador15`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_18` FOREIGN KEY (`Jogador16`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_19` FOREIGN KEY (`Jogador17`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_2` FOREIGN KEY (`ID_PAIS`) REFERENCES `Pais` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_20` FOREIGN KEY (`Jogador18`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_21` FOREIGN KEY (`Jogador19`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_22` FOREIGN KEY (`Jogador20`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_23` FOREIGN KEY (`Jogador21`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_24` FOREIGN KEY (`Jogador22`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_25` FOREIGN KEY (`Jogador23`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_26` FOREIGN KEY (`Jogador4`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_3` FOREIGN KEY (`Tecnico`) REFERENCES `Tecnico` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_4` FOREIGN KEY (`Jogador1`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_5` FOREIGN KEY (`Jogador2`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_6` FOREIGN KEY (`Jogador3`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_7` FOREIGN KEY (`Jogador5`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_8` FOREIGN KEY (`Jogador6`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Selecao_ibfk_9` FOREIGN KEY (`Jogador7`) REFERENCES `Jogador` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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

-- Dump completed on 2014-07-05 13:33:08
