-- DDL
create table if not exists public."User"
(
    id       bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    login    text   not null UNIQUE,
    password text   not null,
    name     text   not null
);

create table if not exists public."Cook"
(
    id          bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    user_id     bigint not null
        references public."User" (id),
    startSalary double precision,
    cookType    text   not null
);

create table if not exists public."Admin"
(
    id      bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    user_id bigint not null
        constraint id
            references public."User" (id)
);

create table if not exists public."Customer"
(
    id      bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    user_id bigint not null
        references public."User" (id),
    wallet  double precision
);

create table if not exists public."Dish"
(
    id       bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    name     text   not null,
    dishCost double precision
);

create table if not exists public."Order"
(
    id          bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
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
        references public."Customer" (id)
);

create table if not exists public."CartItem"
(
    cartId   bigint not null
        primary key
        generated ALWAYS AS IDENTITY,
    order_id bigint not null
        references public."Order" (id),
    dish_id  bigint not null
        references public."Dish" (id),
    count    bigint not null
);

-- DML
INSERT INTO public."User"(login, password, name)
VALUES (N'admin', N'admin', N'Administrator'),
       (N'customer1', N'customer1', N'Customer 1'),
       (N'cook1', N'cook1', N'Cook 1');