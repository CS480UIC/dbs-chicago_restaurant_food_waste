## Table of Contents
1. [Database](#database)
1. [Author(s)](#author)
1. [Database description](#description)
# Database
chicago-restaurant_food_waste
# Author(s)
Lucas Beasley
Niko Castellana
Justin Long
Vishvak Kumaran
# Database description
Database built to monitor average food waste in Chicago restaurants. Schema as follows
CREATE TABLE(
  restaurant name varchar(200),
  address varchar(200),
  daily_avg_customers float,
  kg_food_waste_daily_avg float
);

# Restaurant CRUD
![image](https://user-images.githubusercontent.com/45473244/158448160-40724d77-8265-4093-a6c5-0cc59f354699.png)
![image](https://user-images.githubusercontent.com/45473244/158448216-b456519d-2481-41ed-bee6-1c4461a28ca2.png)
![image](https://user-images.githubusercontent.com/45473244/158448245-9a7fe867-a7d3-402c-b2dd-fefdc9c0053c.png)
![image](https://user-images.githubusercontent.com/45473244/158448299-4398f291-759c-4b8b-9d0d-d0809f4452e1.png)

# Customer CRUD
![image](https://user-images.githubusercontent.com/45473244/158448422-b743a0dd-8fb6-424e-bf2c-97432153d419.png)
![image](https://user-images.githubusercontent.com/45473244/158448459-563fe902-a517-4de0-8e92-1a8b0c1215bb.png)
![image](https://user-images.githubusercontent.com/45473244/158448486-73e33c39-fec0-4f37-a975-27bc0e17ec97.png)
![image](https://user-images.githubusercontent.com/45473244/158448519-b098c21f-b054-4f2d-ba51-3934439c8720.png)

# Supplier CRUD
![suppliermenu](https://user-images.githubusercontent.com/89756130/158476548-a96cc1f8-a0a9-4f44-8cf1-c84f8440b9f5.PNG)
![suppliercreate](https://user-images.githubusercontent.com/89756130/158476560-0a4ce0f2-7cc5-4a50-8977-5821ce939015.PNG)
![supplierread](https://user-images.githubusercontent.com/89756130/158476565-dc443cd5-c357-4a80-ae75-f9a69f405efb.PNG)
![supplierupdate](https://user-images.githubusercontent.com/89756130/158476581-c99804ff-5ba2-4fa4-ab87-7f938e4b3960.PNG)
![supplierdelete](https://user-images.githubusercontent.com/89756130/158476587-887d8b9b-4990-4312-bf3f-d4e796aa546a.PNG)

# Garbage Truck CRUD
![trucksupplier](https://user-images.githubusercontent.com/89756130/158476618-10c357e1-1f0a-4eb0-836e-6079ada33922.PNG)
![truckcreate](https://user-images.githubusercontent.com/89756130/158476641-c4bbbfc5-66b5-4b68-9248-68f3bf765b52.PNG)
![truckread](https://user-images.githubusercontent.com/89756130/158476659-ee44ac81-9f8c-4e9f-abab-38b0264dc596.PNG)
![truckupdate](https://user-images.githubusercontent.com/89756130/158476667-613590a2-325a-4c9a-9f91-233c99e4feb7.PNG)
![truckdelete](https://user-images.githubusercontent.com/89756130/158476676-be58a4e6-b3eb-4d61-968b-684549f9944a.PNG)

# Menu CRUD
![Screen Shot 2022-03-15 at 6 56 30 PM](https://user-images.githubusercontent.com/65303089/158491089-8941e752-d5d8-4eb3-9665-3bbcb04bece2.png)
![Screen Shot 2022-03-15 at 7 06 45 PM](https://user-images.githubusercontent.com/65303089/158491940-e29d51b3-2eb0-4aaa-8374-cf869a158e80.png)
![Screen Shot 2022-03-15 at 7 10 11 PM](https://user-images.githubusercontent.com/65303089/158492207-a23220fb-cd24-4f2a-ab06-fbea69c9230d.png)
![Screen Shot 2022-03-15 at 7 12 40 PM](https://user-images.githubusercontent.com/65303089/158492437-27665a5d-b1e1-4709-a450-f429e3a5331a.png)
![Screen Shot 2022-03-15 at 7 15 00 PM](https://user-images.githubusercontent.com/65303089/158492600-c6eb20e3-7b40-41fa-bd51-e35e73a3cb7a.png)

# Dumpster CRUD
![Screen Shot 2022-03-15 at 7 24 16 PM](https://user-images.githubusercontent.com/65303089/158493306-b8b60120-0e4b-4adc-85e1-c2923df15e27.png)
![Screen Shot 2022-03-15 at 7 32 42 PM](https://user-images.githubusercontent.com/65303089/158494056-4acf1051-7209-4d62-8163-83d51f882344.png)
![Screen Shot 2022-03-15 at 7 34 43 PM](https://user-images.githubusercontent.com/65303089/158494213-40435f89-1483-48ec-91b1-fb2b58e294b8.png)
![Screen Shot 2022-03-15 at 7 35 11 PM](https://user-images.githubusercontent.com/65303089/158494248-1571bb65-4907-4aaf-9807-a88652b77129.png)
![Screen Shot 2022-03-15 at 7 35 50 PM](https://user-images.githubusercontent.com/65303089/158494299-bebaf9d7-c2c9-4201-81d9-897856447777.png)

# Food Waste CRUD
<img width="692" alt="Screen Shot 2022-03-15 at 10 45 04 PM" src="https://user-images.githubusercontent.com/65250592/158513510-05e2c194-e4aa-401c-bc35-aa7fff9d6d01.png">
<img width="482" alt="Screen Shot 2022-03-15 at 10 46 08 PM" src="https://user-images.githubusercontent.com/65250592/158513748-83d6343d-22ab-4845-933d-7c9f918fe9df.png">
<img width="668" alt="Screen Shot 2022-03-15 at 10 48 00 PM" src="https://user-images.githubusercontent.com/65250592/158513567-9c6aa982-0b71-4bc6-917d-a1956703e314.png">
<img width="576" alt="Screen Shot 2022-03-15 at 10 46 39 PM" src="https://user-images.githubusercontent.com/65250592/158513793-9563a02f-f58f-477f-8363-1f2d54ac7779.png">
<img width="661" alt="Screen Shot 2022-03-15 at 10 47 24 PM" src="https://user-images.githubusercontent.com/65250592/158513816-fb4b913a-22c1-4ed2-ae2e-3f165c6dfd33.png">


# Order CRUD
<img width="640" alt="Screen Shot 2022-03-15 at 10 49 06 PM" src="https://user-images.githubusercontent.com/65250592/158513420-e0736dd5-9c31-4d30-b0bd-710aafad3cee.png">
<img width="661" alt="Screen Shot 2022-03-15 at 10 49 30 PM" src="https://user-images.githubusercontent.com/65250592/158513626-b6b08672-68b4-40cd-bd6e-7ca4e91f138a.png">
<img width="503" alt="Screen Shot 2022-03-15 at 10 49 48 PM" src="https://user-images.githubusercontent.com/65250592/158513681-5b69b282-37cc-4e85-8f7f-ac52692fe73c.png">
<img width="468" alt="Screen Shot 2022-03-15 at 10 50 03 PM" src="https://user-images.githubusercontent.com/65250592/158513724-6efb76d4-fe5e-4571-9199-802736e98cba.png">
<img width="499" alt="Screen Shot 2022-03-15 at 10 50 21 PM" src="https://user-images.githubusercontent.com/65250592/158513777-fb14c290-57ee-4634-9feb-6e48eed42643.png">





