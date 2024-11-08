CREATE TABLE products (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    account_number VARCHAR(255),
    balance DECIMAL(10, 2),
    product_type VARCHAR(255),
    user_id BIGINT
);