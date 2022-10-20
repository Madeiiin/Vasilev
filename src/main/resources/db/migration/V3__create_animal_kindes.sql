/*CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
create table if not exists kindes
(
    name        varchar     not null,
    UNIQUE      (name),
    PRIMARY KEY (name)
    );
create table if not exists animals
(
    id          uuid         not null,
    animal_name varchar(100) not null,
    kind        varchar,
    UNIQUE      (id),
    PRIMARY KEY (id)
    );
ALTER TABLE animals ADD CONSTRAINT fk_kindes FOREIGN KEY (kind) references kindes(name)
*/