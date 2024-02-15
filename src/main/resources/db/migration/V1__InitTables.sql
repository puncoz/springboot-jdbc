CREATE TABLE movie (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    released_date DATE NOT NULL,

    unique (name)
)
