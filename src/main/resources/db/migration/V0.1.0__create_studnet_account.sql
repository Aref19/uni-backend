CREATE TABLE studentaccount
(
    id       UUID NOT NULL,
    email    VARCHAR(255),
    name     VARCHAR(255),
    password VARCHAR(255),
    CONSTRAINT pk_studentaccount PRIMARY KEY (id)
);