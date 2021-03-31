-- DML
INSERT INTO katering.public."pg_user"(login, password, name)
VALUES (N'admin', N'admin', N'Administrator'),
       (N'customer1', N'customer1', N'Customer 1'),
       (N'cook1', N'cook1', N'Cook 1');

INSERT INTO katering.public."Dish"(name, dishcost)
VALUES (N'Fried chicken', 270),
       (N'Salad with cucumber', 300),
       (N'Salad with water', 150),
       (N'Energy drink', 50),
       (N'Sushi arigatto', 430),
       (N'Sushi sen-sei', 400),
       (N'Sushi kitayosa', 500),
       (N'Soup with meat and fish', 500);