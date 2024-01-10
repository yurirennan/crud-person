CREATE SEQUENCE seq_person;

CREATE TABLE t_persons (
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);