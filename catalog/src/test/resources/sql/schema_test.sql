DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT (
  product_id INT PRIMARY KEY,
  product_name VARCHAR(50) NOT NULL,
  price VARCHAR(50) NOT NULL
);