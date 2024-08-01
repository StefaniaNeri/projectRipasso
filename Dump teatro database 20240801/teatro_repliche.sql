-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: teatro
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `repliche`
--

DROP TABLE IF EXISTS `repliche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repliche` (
  `cod_replica` varchar(4) NOT NULL,
  `cod_spettacolo` varchar(4) DEFAULT NULL,
  `data_replica` date DEFAULT NULL,
  PRIMARY KEY (`cod_replica`),
  KEY `FK8exk5i6dd4ownkpbyv5xw1tsj` (`cod_spettacolo`),
  CONSTRAINT `FK8exk5i6dd4ownkpbyv5xw1tsj` FOREIGN KEY (`cod_spettacolo`) REFERENCES `spettacoli` (`cod_spettacolo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repliche`
--

LOCK TABLES `repliche` WRITE;
/*!40000 ALTER TABLE `repliche` DISABLE KEYS */;
INSERT INTO `repliche` VALUES ('R001','S001','2018-10-05'),('R002','S001','2018-10-06'),('R003','S001','2018-10-07'),('R004','S001','2018-10-08'),('R005','S001','2018-10-09'),('R006','S002','2018-11-12'),('R007','S002','2018-11-13'),('R008','S002','2018-11-14'),('R009','S002','2018-11-15'),('R010','S002','2018-11-16'),('R011','S003','2019-01-05'),('R012','S003','2019-01-06'),('R013','S003','2019-01-07'),('R014','S003','2019-01-08'),('R015','S003','2019-01-09'),('R016','S004','2019-01-12'),('R017','S004','2019-01-13'),('R018','S004','2019-01-14'),('R019','S004','2019-01-15'),('R020','S004','2019-01-16'),('R021','S005','2018-11-05'),('R022','S005','2018-11-06'),('R023','S005','2018-11-07'),('R024','S005','2018-11-18'),('R025','S005','2018-11-19'),('R026','S006','2018-12-12'),('R027','S006','2018-12-13'),('R028','S006','2018-12-14'),('R029','S006','2018-12-15'),('R030','S006','2018-12-16');
/*!40000 ALTER TABLE `repliche` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-01  9:53:41
