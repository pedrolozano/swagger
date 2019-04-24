DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
  customerId INTEGER PRIMARY KEY,
  originChannel VARCHAR(255) NOT NULL,
  fullName VARCHAR(64) NOT NULL,
  condition VARCHAR(64) NOT NULL,
  segment VARCHAR(64) NOT NULL, 
  address VARCHAR(128) NOT NULL, 
  customerCategory VARCHAR(64) NOT NULL);
