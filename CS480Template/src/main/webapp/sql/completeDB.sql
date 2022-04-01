-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: chicago_restaurant_food_waste
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Temporary view structure for view `aggregatequery1`
--

DROP TABLE IF EXISTS `aggregatequery1`;
/*!50001 DROP VIEW IF EXISTS `aggregatequery1`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `aggregatequery1` AS SELECT 
 1 AS `AVG(truck_capacity)`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `aggregatequery2`
--

DROP TABLE IF EXISTS `aggregatequery2`;
/*!50001 DROP VIEW IF EXISTS `aggregatequery2`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `aggregatequery2` AS SELECT 
 1 AS `DATE(founded_date)`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `aggregatequery4`
--

DROP TABLE IF EXISTS `aggregatequery4`;
/*!50001 DROP VIEW IF EXISTS `aggregatequery4`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `aggregatequery4` AS SELECT 
 1 AS `food_waste_id`,
 1 AS `avg_daily_waste`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `complexquery1`
--

DROP TABLE IF EXISTS `complexquery1`;
/*!50001 DROP VIEW IF EXISTS `complexquery1`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `complexquery1` AS SELECT 
 1 AS `name`,
 1 AS `CONCAT('Dumpster capacity: ', capacity)`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `complexquery2`
--

DROP TABLE IF EXISTS `complexquery2`;
/*!50001 DROP VIEW IF EXISTS `complexquery2`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `complexquery2` AS SELECT 
 1 AS `name`,
 1 AS `address`,
 1 AS `avg_daily_waste`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `complexquery3`
--

DROP TABLE IF EXISTS `complexquery3`;
/*!50001 DROP VIEW IF EXISTS `complexquery3`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `complexquery3` AS SELECT 
 1 AS `name`,
 1 AS `founded_date`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `complexquery4`
--

DROP TABLE IF EXISTS `complexquery4`;
/*!50001 DROP VIEW IF EXISTS `complexquery4`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `complexquery4` AS SELECT 
 1 AS `restaurant_id`,
 1 AS `avg_daily_waste`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` int NOT NULL,
  `email_address` varchar(200) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'john223@gmail.com','John Ham'),(2,'bill@gmail.com','Bill Burham'),(3,'fish89@gmail.com','Henry Fisher'),(4,'money99@gmail.com','Robert Hansen'),(5,'cloud21@yahoo.com','Angela Jefferson');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dumpster`
--

DROP TABLE IF EXISTS `dumpster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dumpster` (
  `dumpster_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  `capacity` float DEFAULT NULL,
  PRIMARY KEY (`dumpster_id`),
  UNIQUE KEY `dumpster_id` (`dumpster_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `dumpster_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dumpster`
--

LOCK TABLES `dumpster` WRITE;
/*!40000 ALTER TABLE `dumpster` DISABLE KEYS */;
INSERT INTO `dumpster` VALUES (11,40,40),(44,66,100),(76,12,60),(99,12,30),(100,23,50);
/*!40000 ALTER TABLE `dumpster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_waste`
--

DROP TABLE IF EXISTS `food_waste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_waste` (
  `food_waste_id` int NOT NULL,
  `avg_daily_waste` float DEFAULT NULL,
  `restaurant_id` int NOT NULL,
  PRIMARY KEY (`food_waste_id`),
  UNIQUE KEY `food_waste_id` (`food_waste_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `food_waste_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_waste`
--

LOCK TABLES `food_waste` WRITE;
/*!40000 ALTER TABLE `food_waste` DISABLE KEYS */;
INSERT INTO `food_waste` VALUES (5,15.7,23),(10,12.33,40),(15,24.8,12),(20,3.1,76),(25,11.4,66);
/*!40000 ALTER TABLE `food_waste` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `garbage_truck`
--

DROP TABLE IF EXISTS `garbage_truck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `garbage_truck` (
  `truck_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  `truck_capacity` int NOT NULL,
  PRIMARY KEY (`truck_id`),
  UNIQUE KEY `truck_id` (`truck_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `garbage_truck_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garbage_truck`
--

LOCK TABLES `garbage_truck` WRITE;
/*!40000 ALTER TABLE `garbage_truck` DISABLE KEYS */;
INSERT INTO `garbage_truck` VALUES (7,23,15),(25,12,70),(39,66,99),(47,76,55),(852,40,16);
/*!40000 ALTER TABLE `garbage_truck` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `menu_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  `menu_item` varchar(200) NOT NULL,
  PRIMARY KEY (`menu_id`),
  UNIQUE KEY `menu_id` (`menu_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (11,40,'Ham Sub'),(20,23,'Burger'),(52,76,'Gyro Sandwich'),(88,12,'Pepperoni Pizza'),(96,66,'Big Mac');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `order_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id` (`order_id`),
  KEY `customer_id` (`customer_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE,
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (10,3,12),(20,1,23),(30,1,66),(40,4,76),(50,5,40);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `restaurant` (
  `restaurant_id` int NOT NULL,
  `name` varchar(200) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone_number` varchar(200) DEFAULT NULL,
  `founded_date` date NOT NULL,
  PRIMARY KEY (`restaurant_id`),
  UNIQUE KEY `restaurant_id` (`restaurant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (12,'Pizza Hut','2516 W North Ave','(773) 342-6919','1997-07-08'),(23,'Manny\'s','1141 S Jefferson St','(312) 939-2855','2014-05-04'),(40,'Fontano\'s Subs','1058 W Polk St','(312) 421-4474','2018-10-12'),(66,'McDonaldâ€™s Global Menu Restaurant','1035 W Randolph St','(312) 291-9224','1999-07-12'),(76,'Zeus Restaurant','806 W Jackson Blvd','(312) 258-8789','2001-12-04');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `simplequery1`
--

DROP TABLE IF EXISTS `simplequery1`;
/*!50001 DROP VIEW IF EXISTS `simplequery1`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `simplequery1` AS SELECT 
 1 AS `name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `simplequery2`
--

DROP TABLE IF EXISTS `simplequery2`;
/*!50001 DROP VIEW IF EXISTS `simplequery2`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `simplequery2` AS SELECT 
 1 AS `dumpster_id`,
 1 AS `restaurant_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `simplequery3`
--

DROP TABLE IF EXISTS `simplequery3`;
/*!50001 DROP VIEW IF EXISTS `simplequery3`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `simplequery3` AS SELECT 
 1 AS `menu_item`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `simplequery4`
--

DROP TABLE IF EXISTS `simplequery4`;
/*!50001 DROP VIEW IF EXISTS `simplequery4`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `simplequery4` AS SELECT 
 1 AS `truck_id`,
 1 AS `restaurant_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supplier_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone_number` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `supplier_id` (`supplier_id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `supplier_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (7,23,'12 West Ave','(232) 111-8365'),(25,12,'350 West Harrison St','(267) 634-8084'),(39,66,'839 North Jones St','(700) 963-0147'),(47,76,'408 Broadway Ave','(999) 820-8029'),(852,40,'684 Jefferson St','(898) 627-3766');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `aggregatequery1`
--

/*!50001 DROP VIEW IF EXISTS `aggregatequery1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `aggregatequery1` AS select avg(`garbage_truck`.`truck_capacity`) AS `AVG(truck_capacity)` from `garbage_truck` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `aggregatequery2`
--

/*!50001 DROP VIEW IF EXISTS `aggregatequery2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `aggregatequery2` AS select cast(`restaurant`.`founded_date` as date) AS `DATE(founded_date)` from `restaurant` where (`restaurant`.`name` = 'Zeus Restaurant') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `aggregatequery4`
--

/*!50001 DROP VIEW IF EXISTS `aggregatequery4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `aggregatequery4` AS select `food_waste`.`food_waste_id` AS `food_waste_id`,`food_waste`.`avg_daily_waste` AS `avg_daily_waste` from `food_waste` group by `food_waste`.`food_waste_id` having (`food_waste`.`food_waste_id` < 25) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `complexquery1`
--

/*!50001 DROP VIEW IF EXISTS `complexquery1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `complexquery1` AS select `restaurant`.`name` AS `name`,concat('Dumpster capacity: ',`dumpster`.`capacity`) AS `CONCAT('Dumpster capacity: ', capacity)` from (`restaurant` join `dumpster` on((`restaurant`.`restaurant_id` = `dumpster`.`restaurant_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `complexquery2`
--

/*!50001 DROP VIEW IF EXISTS `complexquery2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `complexquery2` AS select `restaurant`.`name` AS `name`,`restaurant`.`address` AS `address`,`food_waste`.`avg_daily_waste` AS `avg_daily_waste` from (`restaurant` join `food_waste` on((`restaurant`.`restaurant_id` = `food_waste`.`restaurant_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `complexquery3`
--

/*!50001 DROP VIEW IF EXISTS `complexquery3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `complexquery3` AS select `restaurant`.`name` AS `name`,`restaurant`.`founded_date` AS `founded_date` from `restaurant` where (5 >= (select count(0) from `supplier` where (`supplier`.`restaurant_id` = `restaurant`.`restaurant_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `complexquery4`
--

/*!50001 DROP VIEW IF EXISTS `complexquery4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `complexquery4` AS select `food_waste`.`restaurant_id` AS `restaurant_id`,`food_waste`.`avg_daily_waste` AS `avg_daily_waste` from `food_waste` where exists(select 1 from `garbage_truck` where ((`garbage_truck`.`restaurant_id` = `food_waste`.`restaurant_id`) and (`garbage_truck`.`truck_capacity` > 25))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `simplequery1`
--

/*!50001 DROP VIEW IF EXISTS `simplequery1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `simplequery1` AS select `customer`.`name` AS `name` from `customer` where (`customer`.`customer_id` > 2) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `simplequery2`
--

/*!50001 DROP VIEW IF EXISTS `simplequery2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `simplequery2` AS select `dumpster`.`dumpster_id` AS `dumpster_id`,`dumpster`.`restaurant_id` AS `restaurant_id` from `dumpster` where (`dumpster`.`capacity` > 50) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `simplequery3`
--

/*!50001 DROP VIEW IF EXISTS `simplequery3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `simplequery3` AS select `menu`.`menu_item` AS `menu_item` from `menu` where (`menu`.`menu_id` < 75) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `simplequery4`
--

/*!50001 DROP VIEW IF EXISTS `simplequery4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `simplequery4` AS select `garbage_truck`.`truck_id` AS `truck_id`,`garbage_truck`.`restaurant_id` AS `restaurant_id` from `garbage_truck` where (`garbage_truck`.`truck_capacity` < 55) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-01 17:17:55
