## Table of Contents
1. [Database](#database)
1. [Author(s)](#author)
1. [Database description](#description)
# Database
chicago-restaurant_food_waste
# Author(s)
Lucas Beasley
Niko Castellana
(add your names here)
# Database description
Database built to monitor average food waste in Chicago restaurants. Schema as follows
CREATE TABLE(
  restaurant name varchar(200),
  address varchar(200),
  daily_avg_customers float,
  kg_food_waste_daily_avg float
);
