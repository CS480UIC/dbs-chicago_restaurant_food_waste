package init.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import user.domain.User;



/**
 * DDL functions performed in database
 */
public class InitDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "chicago_restaurant_food_waste";  //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "foodwaste";  //TODO change password

	public void initialize() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chicago_restaurant_food_waste?allowMultiQueries=true", MySQL_user, MySQL_password);
			
			String sql = """
					DROP TABLE IF EXISTS customer;
					CREATE TABLE customer (
					  customer_id INTEGER NOT NULL,
					  email_address varchar(200) DEFAULT NULL,
					  name varchar(200) NOT NULL,
					  PRIMARY KEY (customer_id),
					  UNIQUE KEY customer_id (customer_id)
					);
					LOCK TABLES customer WRITE;
					INSERT INTO customer VALUES (1,'john223@gmail.com','John Ham'),(2,'bill@gmail.com','Bill Burham'),(3,'fish89@gmail.com','Henry Fisher'),(4,'money99@gmail.com','Robert Hansen'),(5,'cloud21@yahoo.com','Angela Jefferson');
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `restaurant`;
					CREATE TABLE `restaurant` (
					  `restaurant_id` int NOT NULL,
					  `name` varchar(200) NOT NULL,
					  `address` varchar(200) DEFAULT NULL,
					  `phone_number` varchar(200) DEFAULT NULL,
					  `founded_date` date NOT NULL,
					  PRIMARY KEY (`restaurant_id`),
					  UNIQUE KEY `restaurant_id` (`restaurant_id`)
					);
					LOCK TABLES `restaurant` WRITE;
					INSERT INTO `restaurant` VALUES (12,'Pizza Hut','2516 W North Ave','(773) 342-6919','1997-07-08'),(23,'Mannys','1141 S Jefferson St','(312) 939-2855','2014-05-04'),(40,'Fontanos Subs','1058 W Polk St','(312) 421-4474','2018-10-12'),(66,'McDonalds Global Menu Restaurant','1035 W Randolph St','(312) 291-9224','1999-07-12'),(76,'Zeus Restaurant','806 W Jackson Blvd','(312) 258-8789','2001-12-04');
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `dumpster`;
					CREATE TABLE `dumpster` (
					  `dumpster_id` int NOT NULL,
					  `restaurant_id` int NOT NULL,
					  `capacity` float DEFAULT NULL,
					  PRIMARY KEY (`dumpster_id`),
					  UNIQUE KEY `dumpster_id` (`dumpster_id`),
					  KEY `restaurant_id` (`restaurant_id`),
					  CONSTRAINT `dumpster_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
					);
					LOCK TABLES `dumpster` WRITE;
					INSERT INTO `dumpster` VALUES (11,40,40),(44,66,100),(76,12,60),(99,12,30),(100,23,50);
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `entity1`;
					CREATE TABLE `entity1` (
					  `username` varchar(50) NOT NULL,
					  `password` varchar(50) NOT NULL,
					  `email` varchar(50) NOT NULL,
					  PRIMARY KEY (`username`)
					);
					LOCK TABLES `entity1` WRITE;
					UNLOCK TABLES;

					DROP TABLE IF EXISTS `food_waste`;
					CREATE TABLE `food_waste` (
					  `food_waste_id` int NOT NULL,
					  `avg_daily_waste` float DEFAULT NULL,
					  `restaurant_id` int NOT NULL,
					  PRIMARY KEY (`food_waste_id`),
					  UNIQUE KEY `food_waste_id` (`food_waste_id`),
					  KEY `restaurant_id` (`restaurant_id`),
					  CONSTRAINT `food_waste_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
					);
					LOCK TABLES `food_waste` WRITE;
					INSERT INTO `food_waste` VALUES (5,15.7,23),(10,12.33,40),(15,24.8,12),(20,3.1,76),(25,11.4,66);
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `garbage_truck`;
					CREATE TABLE `garbage_truck` (
					  `truck_id` int NOT NULL,
					  `restaurant_id` int NOT NULL,
					  `truck_capacity` int NOT NULL,
					  PRIMARY KEY (`truck_id`),
					  UNIQUE KEY `truck_id` (`truck_id`),
					  KEY `restaurant_id` (`restaurant_id`),
					  CONSTRAINT `garbage_truck_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
					);
					LOCK TABLES `garbage_truck` WRITE;
					INSERT INTO `garbage_truck` VALUES (7,23,15),(25,12,70),(39,66,99),(47,76,55),(852,40,16);
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `menu`;
					CREATE TABLE `menu` (
					  `menu_id` int NOT NULL,
					  `restaurant_id` int NOT NULL,
					  `menu_item` varchar(200) NOT NULL,
					  PRIMARY KEY (`menu_id`),
					  UNIQUE KEY `menu_id` (`menu_id`),
					  KEY `restaurant_id` (`restaurant_id`),
					  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
					);
					LOCK TABLES `menu` WRITE;
					INSERT INTO `menu` VALUES (11,40,'Ham Sub'),(20,23,'Burger'),(52,76,'Gyro Sandwich'),(88,12,'Pepperoni Pizza'),(96,66,'Big Mac');
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `order`;
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
					);
					LOCK TABLES `order` WRITE;
					INSERT INTO `order` VALUES (10,3,12),(20,1,23),(30,1,66),(40,4,76),(50,5,40);
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `supplier`;
					CREATE TABLE `supplier` (
					  `supplier_id` int NOT NULL,
					  `restaurant_id` int NOT NULL,
					  `address` varchar(200) DEFAULT NULL,
					  `phone_number` varchar(200) DEFAULT NULL,
					  PRIMARY KEY (`supplier_id`),
					  UNIQUE KEY `supplier_id` (`supplier_id`),
					  KEY `restaurant_id` (`restaurant_id`),
					  CONSTRAINT `supplier_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`) ON DELETE CASCADE
					);
					LOCK TABLES `supplier` WRITE;
					INSERT INTO `supplier` VALUES (7,23,'12 West Ave','(232) 111-8365'),(25,12,'350 West Harrison St','(267) 634-8084'),(39,66,'839 North Jones St','(700) 963-0147'),(47,76,'408 Broadway Ave','(999) 820-8029'),(852,40,'684 Jefferson St','(898) 627-3766');
					UNLOCK TABLES;
					
					DROP TABLE IF EXISTS `user`;
					CREATE TABLE `user` (
					  `username` varchar(50) NOT NULL,
					  `password` varchar(50) NOT NULL,
					  `email` varchar(50) NOT NULL,
					  PRIMARY KEY (`username`)
					);
					LOCK TABLES `user` WRITE;
					UNLOCK TABLES;
					""";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
}
