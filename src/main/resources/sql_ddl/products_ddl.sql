CREATE TABLE product (
	id bigint primary key,
  	name varchar(255),
  	description varchar(255),
  	price decimal(10,2)
);

INSERT INTO product (id, name, description, price) VALUES (1, 'Television Samsmg', 'Samsumg 4K Smartv', 2000.99);
INSERT INTO product (id, name, description, price) VALUES (2, 'Television LG', 'LG 4K Smartv', 1500.99);
INSERT INTO product (id, name, description, price) VALUES (3, 'Television Sony', 'Sony 4K Smartv', 1233.99);
INSERT INTO product (id, name, description, price) VALUES (4, 'Smartphone Samsung', 'Galaxy S10', 1543.99);
INSERT INTO product (id, name, description, price) VALUES (5, 'Smartphone Apple', 'Iphone X', 1000.99);
INSERT INTO product (id, name, description, price) VALUES (6, 'Smartphone LG', 'Nokia X', 1332.99);
INSERT INTO product (id, name, description, price) VALUES (7, 'Smartphone Nokia', 'Nokia Y', 998.99);