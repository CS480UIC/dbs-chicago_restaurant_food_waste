CREATE VIEW SimpleQuery1 AS
SELECT name
FROM Customer
WHERE customer_id > 2;

CREATE VIEW SimpleQuery2 AS
SELECT dumpster_id, restaurant_id
FROM dumpster
WHERE capacity > 50;

CREATE VIEW SimpleQuery3 AS
SELECT menu_item
FROM menu
WHERE menu_id < 75;

CREATE VIEW SimpleQuery4 AS
SELECT truck_id, restaurant_id
FROM garbage_truck
WHERE truck_capacity < 55;

CREATE VIEW AggregateQuery1 AS
SELECT AVG(truck_capacity)
FROM garbage_truck;

CREATE VIEW AggregateQuery2 AS
SELECT CONCAT('Customer: ', name)
FROM customer;

CREATE VIEW AggregateQuery3 AS
SELECT DATE(founded_date)
FROM restaurant
WHERE name = 'Zeus Restaurant';

CREATE VIEW AggregateQuery4 AS
SELECT food_waste_id, avg_daily_waste
FROM food_waste
GROUP BY food_waste_id
HAVING food_waste_id < 25;

CREATE VIEW ComplexQuery1 AS
SELECT name, CONCAT('Dumpster capacity: ', capacity)
FROM restaurant
JOIN dumpster
ON restaurant.restaurant_id = dumpster.restaurant_id; 

CREATE VIEW ComplexQuery2 AS
SELECT name, address, avg_daily_waste
FROM restaurant
INNER JOIN food_waste
ON restaurant.restaurant_id = food_waste.restaurant_id;

CREATE VIEW ComplexQuery3 AS
SELECT name, founded_date
FROM restaurant
WHERE 5 >= 
	(SELECT COUNT(*)
    FROM supplier
    WHERE restaurant_id = restaurant.restaurant_id);

CREATE VIEW ComplexQuery4 AS
SELECT restaurant_id, avg_daily_waste
FROM food_waste
WHERE EXISTS
	(SELECT *
    FROM garbage_truck
    WHERE restaurant_id = food_waste.restaurant_id
    AND truck_capacity > 25);


