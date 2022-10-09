CREATE TABLE "account"
(
    id       UUID NOT NULL,
    email    VARCHAR(255),
    password VARCHAR(255),
    CONSTRAINT pk_user PRIMARY KEY (id)
);