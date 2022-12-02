CREATE DATABASE "store";

CREATE TYPE userRole AS ENUM ('ADMIN', 'USER');

CREATE TABLE "user" (
    id UUID PRIMARY KEY,
    first_name VARCHAR (55) NOT NULL,
    last_name VARCHAR (55) NOT NULL,
    role VARCHAR (55) NOT NULL,
    email VARCHAR (55) UNIQUE NOT NULL,
    password VARCHAR (255) NOT NULL
);

INSERT INTO "user" (id, first_name, last_name, role, email, password)
    VALUES ('05debd41-0914-4e84-944f-4cb9534469f5', 'admin', 'admin', 'ADMIN', 'admin', '1');

CREATE TABLE product (
    id UUID PRIMARY KEY,
    name VARCHAR (55) NOT NULL,
    price DOUBLE NOT NULL,
    description VARCHAR (255) NOT NULL
);
