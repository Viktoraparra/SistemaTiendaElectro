-- muestra de datas generales
show tables;

-- Muestra de usuarios
select * from usuarios;

-- describir Tabla Almacen
describe Almacen;

-- solicitud de Productos
select * from Productos;

-- consulta especifica de un item de la tabla producto 'Marca'
select	*
from	productos
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
	on			c.codigo = f.ClienteId;
-- Consulta anidada Productos y almacen
select		*
	from		Almacen a
	join		Productos as p
	on			p.IdAlmacen = a.codigo;
-- Consulta anidada Producto, Cliente y factura
select		c.Nombre,c.Apellido,p.Nombre,f.Fecha,p.PUnitario
from		Clientes c
inner join	Facturas f on c.Codigo = f.ClienteId
inner join	DetalleFacturas d on f.codigo = d.FacturasId
inner join  Productos p on d.ProductoId =p.Codigo
where		p.Nombre like '%T%';