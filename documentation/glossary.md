ENTRIES  
----------
restaurant: (place, diner)
  Table representing each restaurant that is tracked by our system.
 
customer: (person)
  Table representing every person that makes an order to the restaurant.
  
order: (ticket)
  Table representing every order a customer makes to the restaurant. 
  
food_waste: 
  Table representing the avg daily food waste of a restaurant.
  
dumpster: 
  Table representing the dumpster of each restaurant.
  
menu: 
  Table representing the menu of options a customer can make an order from. 
  
supplier:
  Table representing the source of food the restaurant uses.
  
user_login: 
  Table to hold user login data to the datebase.
  
garbage_truck:
  Table to represent each garbage truck servicing a particular restaurant.
  
RELATIONSHIPS
-------
customer_visits_restaurant many-to-one

order_placed_at_restaurant many-to-one

restaurant_owns_dumpster   one-to-one

restaurant_offers_menu     one-to-one

restaurant_uses_supplier   one-to-many

customer_places_order      one-to-many

restaurant_produces_avg_waste  one-to-one

restaurant_uses_garbage_truck one-to-many

ATTRIBUTES
-------

### An example of a plural attribute would be menu_item of the table menu, since each restaurant offers many different kinds of unique foods to eat.

user_id INT UNIQUE 1(1) |
user_password VARCHAR(200) NOT NULL 1(1) |
user_email VARCHAR(200) UNIQUE 1(1) 

restaurant_id INT UNIQUE 1(1) |
name VARCHAR(200) NOT NULL 1(1) |
address VARCHAR(200) 1(1) |
phone_number VARCHAR(200) M(1) 

customer_id INT UNIQUE 1(1) |
email_address VARCHAR(200) 1(1) |
name VARCHAR(200) NOT NULL 1(1) 

order_id INT UNIQUE  M(1) |
customer_id INT NOT NULL  M(1) |
restaurant_id INT NOT NULL  M(1) 

food_waste_id INT UNIQUE M(1) |
restaurant_id INT UNIQUE M(1) |
avg_daily_waste FLOAT 1(0) 

dumpster_id INT UNIQUE M(1) |
restaurant_id INT NOT NULL M(1) |
capacity FLOAT 1(0) 

restaurant_id INT NOT NULL M(1) |
menu_id INT UNIQUE M(1) |
menu_items VARCHAR(200) NOT NULL M(1) 

supplier_id INT UNIQUE M(1) |
restauarant_id INT NOT NULL M(1) |
address VARCHAR(200) M(1) |
phone_number VARCHAR(200) M(1) 

truck_id INT UNIQUE M(1) |
restaurant_id INT NOT NULL M(1) |
truck_capacity INT NOT NULL M(1)




Key: Max number next to attribute. Min denotes number in paranthesis
-------

## ENTITIES AND DEPENDENCY RELATIONSHIPS

restaurant: Independent Entity
 
customer: Independent Entity
  
order: Dependent entity depends on restaurant and customer 
  
food_waste: Dependent Entity depends on restaurant
  
dumpster: Dependent Entity depends on restaurant
  
menu: Dependent Entity depends on restaurant
  
supplier:Dependent Entity depends on restaurant
  
user_login: Independent Entity

garbage_truck: Dependent Entity depends on restaurant
  
## SUPERTYPES SUBTYPES AND PARTITIONS

restaurant: Supertype has subtypes menu, dumpster, food_waste, and garbage_truck

customer: Supertype has subtype order

## CASCADE AND RESTRICT ACTIONS

order: foreign keys customer_id and restaurant_id NOT NULL
  
food_waste: foreign key restauant_id UNIQUE
  
dumpster: foreign key restaurant_id NOT NULL
  
menu: foreign key restaurant_id NOT NULL
  
supplier: foreign key restaurant_id NOT NULL

garbage_truck: foreign key restaurant_id NOT NULL

## CASCADE AND RESTRICT RULES

### Note: When a row is deleted in restuarant, we want the child tables' row containing that restaurant to delete and update.

order: foreign keys customer_id ON DELETE CASCADE and restaurant_id ON DELETE CASCADE

food_waste: foreign key restauant_id ON DELETE CASCADE
  
dumpster: foreign key restaurant_id ON DELETE CASCADE
  
menu: foreign key restaurant_id ON DELETE CASCADE
  
supplier: foreign key restaurant_id ON DELETE CASCADE

garbage_truck: foreign key restaurant_id ON DELETE CASCADE



