drop database if exists DBTiendaElectronica;
create database DBTiendaElectronica;
use DBTiendaElectronica;
-- tabla de usuarios
create table Usuarios(
        IdUsuario int not null auto_increment ,
        Nombre varchar (24) not null,
        Apellido varchar (24) not null,
        Usuario varchar (24) not null,
        Clave varchar (16) not null,
        Perfil enum ('ADMINISTRADOR','SUPERVISOR','EMPLEADO'),
        primary key(IdUsuario));
-- tabla de Cliente
create table Clientes(
		IdCliente int not null unique,
        Nombre varchar(25) not null,
        Apellido varchar(25) not null,
        Correo varchar(50) not null,
        telefono varchar (15) not null,
        domicilio varchar(50) not null,
        primary key(IdCliente));
-- tabla almacen
-- idAlmacen se puede configurar con codigos de barras
create table Almacen(
		IdAlmacen int not null auto_increment,
        Marca varchar(25) not null,
        CategoriaId enum('Televisor','Celular','Equipo de sonido','Notebook','Electrodomestico','Accesorios'),
        Descripcion varchar(42) not null,
        Stock int not null,
        primary key(IdAlmacen));
-- tabla de Producto        
create table Productos(
		IdProducto int not null auto_increment,
        Marca varchar (24) not null,
        IdCategoria varchar(25) not null,
        Descripcion varchar(50) not null,
		Stock int not null,
        PUnitario double(10,2) not null,
        AlmacenId int not null,
        primary key(IdProducto),
        foreign key(AlmacenId) references Almacen(IdAlmacen));

-- tabla de facturas        
create table Facturas(
		Numero varchar(20) not null,
        Fecha date not null,
        ClienteId int not null,
        primary key(Numero),
		foreign key(ClienteId) references Clientes(IdCliente));
        
-- tabla detalle de facturas
create table DetalleFacturas(
		IdDFactura int not null,
		FacturaId varchar(25) not null,
        ProductoId int not null,
        Cantidad int not null,
        Total 	double(10,2) not null,
        primary key(IdDFactura),
        foreign key(FacturaId) references Facturas(Numero),
        foreign key(ProductoId) references Productos(IdProducto)
        );
