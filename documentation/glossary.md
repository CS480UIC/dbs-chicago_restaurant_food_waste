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
user_id 1(1)
user_password 1(1)
user_email 1(1)

restaurant_id 1(1)
name 1(1)
address 1(1)
phone_number M(1)

customer_id 1(1)
email_address 1(1)
name 1(1)

order_id M(1)
customer_id M(1)
restaurant_id M(1)

restaurant_id M(1)
avg_daily_waste 1(0)

dumpster_id M(1)
restaurant_id M(1)
capacity 1(0)

restaurant_id M(1)
menu_id M(1)
menu_items M(1)

supplier_id M(1)
restauarant_id M(1)
address M(1)
phone_number M(1)




Key: Max number next to attribute. Min denotes number in paranthesis
-------

# ENTITIES

