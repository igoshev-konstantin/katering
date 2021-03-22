create table if not exists public."User"
(
    id       bigint not null
        primary key,
    login    text   not null,
    password text   not null,
    name     text   not null
);

create table if not exists public."Cook"
(
    id          bigint not null
        primary key,
    user_id     bigint not null
        references public."User" (id),
    startSalary double precision,
    cookType    text   not null
);

create table if not exists public."Admin"
(
    id      bigint not null
        primary key,
    user_id bigint not null
        constraint id
            references public."User" (id)
);

create table if not exists public."Customer"
(
    id      bigint not null
        primary key,
    user_id bigint not null
        references public."User" (id),
    wallet  double precision
);

create table if not exists public."Dish"
(
    id       bigint not null
        primary key,
    name     text   not null,
    dishCost double precision
);

create table if not exists public."Order"
(
    id          bigint not null
        primary key,
    orderNumber smallint,
    adrRegion   text,
    adrCity     text,
    adrStreet   text,
    adrFlat     text,
    adrIndex    text,
    orderDate   date,
    orderStatus text,
    cook_id     bigint not null
        references public."Cook" (id),
    customer_id bigint not null
        references public."Cook" (id)
);