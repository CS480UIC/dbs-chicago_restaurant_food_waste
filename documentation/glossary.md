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
  
RELATIONSHIPS
-------
customer_visits_restaurant many-to-one

order_placed_at_restaurant many-to-one

restaurant_owns_dumpster   one-to-one

restaurant_offers_menu     one-to-one

restaurant_uses_supplier   one-to-many

customer_places_order      one-to-many

restaurant_produces_avg_waste  one-to-one

ATTRIBUTES
-------
int user_id 1(1) |
varchar (200) user_password 1(1)
varchar (200) user_email 1(1)

int restaurant_id 1(1)
varchar (200) name 1(1)
varchar (200) address 1(1)
varchar (200) phone_number M(1)

int customer_id 1(1)
varchar (200) email_address 1(1)
varchar (200) name 1(1)

int order_id M(1)
int customer_id M(1)
int restaurant_id M(1)

int restaurant_id M(1)
float avg_daily_waste 1(0)

int dumpster_id M(1)
int restaurant_id M(1)
float capacity 1(0)

int restaurant_id M(1)
int menu_id M(1)
varchar (200) menu_items M(1)

int supplier_id M(1)
int restauarant_id M(1)
varchar (200) address M(1)
varchar (200) phone_number M(1)




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
  
## SUPERTYPES SUBTYPES AND PARTITIONS

restaurant: Supertype has subtypes menu, dumpster, and food_waste

customer: Supertype has subtype order

## CASCADE AND RESTRICT ACTIONS

order: foreign keys customer_id and restaurant_id NOT NULL
  
food_waste: foreign key restauant_id UNIQUE
  
dumpster: foreign key restaurant_id NOT NULL
  
menu: foreign key restaurant_id NOT NULL
  
supplier: foreign key restaurant_id NOT NULL

## CASCADE AND RESTRICT RULES

### Note: When a row is deleted in restuarant, we want the child tables' row containing that restaurant to delete and update.

order: foreign keys customer_id ON DELETE CASCADE and restaurant_id ON DELETE CASCADE

food_waste: foreign key restauant_id ON DELETE CASCADE
  
dumpster: foreign key restaurant_id ON DELETE CASCADE
  
menu: foreign key restaurant_id ON DELETE CASCADE
  
supplier: foreign key restaurant_id ON DELETE CASCADE



