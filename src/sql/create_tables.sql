CREATE TABLE Domain (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Asset (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    domain_id INT,
    FOREIGN KEY (domain_id) REFERENCES Domain(id)
);