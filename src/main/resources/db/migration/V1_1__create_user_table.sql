create table if not exists public."User"
(
    id    bigint not null
        constraint "User_pkey"
            primary key,
    login text    not null,
    password   text    not null,
    name  text    not null
);