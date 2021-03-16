create table if not exists public."Admin"
(
    id    bigint not null
        constraint "Admin_pkey"
            primary key,
    user_id bigint    not null
        constraint user_id
            references public."Admin"
);