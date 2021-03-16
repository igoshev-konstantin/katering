create table if not exists public."Cook"
(
    id    bigint not null
        constraint "Cook_pkey"
            primary key,
    user_id bigint    not null
        constraint user_id
            references public."Cook",
    startSalary double precision,
    cookType text not null
);