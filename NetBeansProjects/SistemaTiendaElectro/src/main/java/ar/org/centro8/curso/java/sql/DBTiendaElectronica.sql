drop database DBTiendaElectronica;
create database DBTiendaElectronica;
use DBTiendaElectronica;
-- tabla de usuarios
create table Usuarios(
        Codigo int not null auto_increment ,
        Nombre varchar (24) not null,
        Apellido varchar (24) not null,
        Usuario varchar (24) not null,
        Clave varchar (16) not null,
        Perfil enum ('ADMINISTRADOR','SUPERVISOR','EMPLEADO'),
        primary key(Codigo));
-- tabla de Cliente
create table Clientes(
		Codigo int not null unique,
        Nombre varchar(25) not null,
        Apellido varchar(25) not null,
        Correo varchar(50) not null,
        telefono varchar (15) not null,
        domicilio varchar(50) not null,
        primary key(Codigo));
-- tabla almacen
-- idAlmacen se puede configurar con codigos de barras
create table Almacen(
		Codigo int not null auto_increment,
        Marca varchar(25) not null,
        CategoriaId enum('Televisor','Celular','Equipo de sonido','Notebook','Electrodomestico','Accesorios'),
        Descripcion varchar(42) not null,
        Stock int not null,
        primary key(Codigo));
-- tabla de Producto        
create table Productos(
		Codigo int not null auto_increment,
        Nombre varchar (24) not null,
        IdCategoria varchar(25) not null,
        Descripcion varchar(50) not null,
		Stock int not null,
        PUnitario double(10,2) not null,
        IdAlmacen int not null,
        primary key(Codigo),
        foreign key(IdAlmacen) references Almacen(Codigo));

-- tabla de facturas        
create table Facturas(
		Letra char(1) not null,
		Codigo int not null,
        Fecha date not null,
        ClienteId int not null,
        primary key(Codigo),
		foreign key(ClienteId) references Clientes(Codigo));
        
-- tabla detalle de facturas
create table DetalleFacturas(
		Codigo int not null,
		FacturasId int not null,
        ProductoId int not null,
        Cantidad int not null,
        Total 	double(10,2) not null,
        primary key(Codigo),
        foreign key(FacturasId) references Facturas(Codigo),
        foreign key(ProductoId) references Productos(Codigo)
        );
show tables;
