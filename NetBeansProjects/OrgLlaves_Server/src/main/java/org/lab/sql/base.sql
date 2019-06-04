create database tengo_llave;
use tengo_llave;

create table llaves(
	Llave varchar(100) unique not null,
        Nombre varchar(20) not null,
        Fecha date not null,
        primary key(Llave)
        );
