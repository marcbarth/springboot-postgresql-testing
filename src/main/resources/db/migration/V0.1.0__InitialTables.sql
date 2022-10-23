CREATE SEQUENCE person_seq START WITH 1000 INCREMENT 1;

create table person
(
    id            bigint       not null,
    firstname     varchar(255) not null,
    lastname      varchar(255) not null,
    date_of_birth date         not null,
    constraint person_pk primary key (id)
);
