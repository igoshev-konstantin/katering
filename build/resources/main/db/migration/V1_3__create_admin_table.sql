create table if not exists public."Admin"
(
    id    integer not null
        constraint "Admin_pkey"
            primary key,
    user_id integer    not null
        constraint user_id
            references public."Admin"
);