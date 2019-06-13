use DBTiendaElectronica;
-- muestra de datas generales
show tables;

-- Muestra de usuarios
select * from Usuarios;

-- describir Tabla Almacen
describe Almacen;

-- consulta especifica de un item de la tabla producto 'Marca'
select	*
from	Productos
where	marca = 'Noblex' or marca = 'Samsung';

-- consulta de facturas por fechas
select 	* 
from 	Facturas
where fecha between '2019-01-01' and '2019-02-31';
-- Consulta de apellido en la tabla Clientes que terminen en
select 	*
from	Clientes
where	apellido like '%ez';

-- seleccionar Facturas
select * from Facturas;
-- Consulta con un bajo una solicitud de Orden especifica
select		*
from		Clientes
order by	apellido, nombre asc;

-- Consulta Anidada de cliente y factura
select		*
	from		Clientes c
	join		Facturas as f
	on			c.IdCliente = f.ClienteId;
-- Consulta anidada Productos y almacen
select		*
	from		Almacen a
	join		Productos as p
	on			p.AlmacenId = a.IdAlmacen;
-- Consulta anidada Producto, Cliente y factura
select		c.Nombre,c.Apellido,p.Marca,f.Fecha,p.PUnitario
from		Clientes c
inner join	Facturas f on f.ClienteId = c.IdCliente 
inner join	DetalleFacturas d on f.Numero = d.FacturaId
inner join  Productos p on d.ProductoId =p.IdProducto
where		p.Marca like '%T%';

-- Consulta Anidada solicitando ventas Mayor a
select		c.Nombre,c.Apellido,p.Marca,f.Fecha,p.PUnitario
from		Clientes c
inner join	Facturas f on f.ClienteId = c.IdCliente 
inner join	DetalleFacturas d on f.Numero = d.FacturaId
inner join  Productos p on d.ProductoId =p.IdProducto
where		d.Total > 1000;