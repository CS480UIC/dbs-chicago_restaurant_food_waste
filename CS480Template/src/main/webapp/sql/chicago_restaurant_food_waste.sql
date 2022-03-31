CREATE DATABASE chicago_restaurant_food_waste;

use chicago_restaurant_food_waste;

CREATE table restaurant
(
	restaurant_id INT UNIQUE PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	address VARCHAR(200),
	phone_number VARCHAR(200),
	founded_date DATE NOT NULL
);

CREATE table customer
(
	customer_id INT UNIQUE PRIMARY KEY,
	email_address VARCHAR(200),
	name VARCHAR(200) NOT NULL
);

CREATE table `order`
(
	order_id INT UNIQUE PRIMARY KEY,
	customer_id INT NOT NULL,
	restaurant_id INT NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE table food_waste
(
	food_waste_id INT UNIQUE PRIMARY KEY,
	avg_daily_waste FLOAT,
	restaurant_id INT NOT NULL,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE table dumpster
(
	dumpster_id INT UNIQUE PRIMARY KEY,
	restaurant_id INT NOT NULL,
	capacity FLOAT,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE table menu
(
	menu_id INT UNIQUE PRIMARY KEY,
	restaurant_id INT NOT NULL,
	menu_item VARCHAR(200) NOT NULL,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE table garbage_truck
(
	truck_id INT UNIQUE PRIMARY KEY,
	restaurant_id INT NOT NULL,
	truck_capacity INT NOT NULL,
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE table supplier
(
	supplier_id INT UNIQUE PRIMARY KEY,
	restaurant_id INT NOT NULL,
	address VARCHAR(200),
	phone_number VARCHAR(200),
	FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id) ON DELETE CASCADE
);

CREATE TABLE user
(
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);


CREATE TABLE entity1 
(
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);


