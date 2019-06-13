-- Datos Usuarios
insert into Usuarios values								
(1,'Pedro','Carmona','Pedroca','pedrocar','Administrador'),
(2,'Jose','Cabrera','josecabre','josecabre','Administrador'),
(3,'Roberto','Perez','robertop','robertop','Empleado'),
(4,'Marcelo','Pompillo','Marcelopompi','mpompillo','Empleado'),
(5,'Anibal','Alfaro','Anibalfaro','aalfaro@','Empleado'),
(6,'Angeles','Rito','Gelesrito','angelesrito','Empleado'),
(7,'Eduardo','Gonzalez','EduaGonza','eduagonza','Empleado'),
(8,'Daniela','Jimenez','Danijimen','danielajime','Empleado'),
(9,'Alan','Brito','Alanbrito','alanbrito','Supervisor'),
(10,'Benito','Camelo','benitocamelo','benitocaca','Supervisor');
-- Datos Clientes
insert into Clientes values
(34650121,'Florencia','Montalban','florenciamontalban@gmail.com',1134244410,'Aguero,345,Almagro,CABA'),
(33827115,'Genaro','Laubert','Genarolaubert@gmail.com',1154311859,'Fitz Roy,2470,Palermo,CABA'),
(31673815,'Carolina','Eckbert','caroeck@gmail.com',1144531120,'Santa fe,2011,Recoleta,CABA'),
(29227113,'Ignacio','Menendez','imenendez@gmail.com',1198311011,'Rivadavia,4509,Caballito,CABA'),
(32551621,'Manuela','Montilla','manuelamontilla@gmail.com',113301731,'Bulnes,1230,Almagro,CABA'),
(32106345,'Ramiro','Almarza','ramiroalmarza@hotmail.com',112212345,'Calasanz,210,Caballito,CABA'),
(33713317,'Mildred','Molero','mildredmolero@hotmail.com',118559271,'Peru,989,Congreso,CABA'),
(34828011,'Ivan','Simonovich','ivansimon@gmail.com',117339110,'Estados Unidos,545,Congreso,CABA'),
(33905905,'Dalila','Calva','dalilacalva@gmail.com',1155973790,'Guayaquil,1024,Caballito,CABA'),
(24101982,'Joana','Ferngunches','joanafergu@gmail.com',1141477731,'Rosario,124,Caballito,CABA'),
(92113989,'Rigoberto','Andrade','rigoandrade@gmail.com',1187823322,'Billingurst,2011,Almagro,CABA');
-- Datos Tabla Almacen
insert into Almacen values
(1,'Samsung','Televisor','SMART TV 50” 4K ULTRA HD',20),
(2,'Oster','Electrodomestico','PROCESADORA OSTER 550W 2LTS',30),
(3,'Xiaomi','Celular','Xiaomi NOTE 7 64 GB NEGRO',45),
(4,'Noblex','Televisor','SMART TV HD 32”',50),
(5,'ACER','Notebook','NOTEBOOK ACER 15.6" CORE I5 RAM 4GB OPTANE',25),
(6,'Samsung','Celular','SAMSUNG GALAXY J6 PLUS ALUMINIO',120),
(7,'RCA','Equipo de sonido','MICROCOMPONENTE RCA 30W RMS',40),
(8,'Lenovo','Notebook','NOTEBOOK LENOVO 15, 6” CORE I5 RAM 8G 1TB',35),
(9,'Hitachi','Equipo de sonido','PARLANTE CROWN MUSTANG 7000W PMPO',80),
(10,'Atma','Electrodomestico','HORNITO ELÉCTRICO ATMA HG4010AE 40LTS',92);

-- Datos Tabla Productos
insert into Productos values
(1,'Samsung','Televisor','SMART TV 50” 4K ULTRA HD',20,25456,1),
(2,'Oster','Electrodomestico','PROCESADORA OSTER 550W 2LTS',30,1999,2),
(3,'Xiaomi','Celular','Xiaomi NOTE 7 64 GB NEGRO',45,14000,3),
(4,'Noblex','Televisor','SMART TV HD 32”',50,12399,4),
(5,'ACER','Notebook','NOTEBOOK ACER 15.6" CORE I5 RAM 4GB OPTANE',25,27899,5),
(6,'Samsung','Celular','SAMSUNG GALAXY J6 PLUS ALUMINIO',120,12300,6),
(7,'RCA','Equipo de sonido','MICROCOMPONENTE RCA 30W RMS',40,3099,7),
(8,'Lenovo','Notebook','NOTEBOOK LENOVO 15, 6” CORE I5 RAM 8G 1TB',35,22499,8),
(9,'Hitachi','Equipo de sonido','PARLANTE CROWN MUSTANG 7000W PMPO',80,2599,9),
(10,'Atma','Electrodomestico','HORNITO ELÉCTRICO ATMA HG4010AE 40LTS',92,2699,10);
-- Datos Tabla Factura
insert into Facturas values
('A-03246','2019-04-11',34650121),
('B-03244','2019-01-27',33827115),
('C-03543','2019-02-03',92113989),
('C-03112','2019-03-19',24101982),
('A-03247','2019-01-27',31673815),
('A-03277','2019-05-17',33905905),
('B-03671','2019-04-30',29227113),
('C-03540','2019-03-11',34828011),
('B-03910','2019-03-11',32551621),
('A-03991','2019-01-27',33713317);
-- Datos Tabla DetalleFactura
insert into DetalleFacturas values
(1,'A-03246',1,1,25456),
(2,'B-03244',2,2,3998),
(3,'C-03543',3,1,42000),
(4,'C-03112',4,2,12399),
(5,'A-03247',5,1,27899),
(6,'A-03277',6,1,12300),
(7,'B-03671',7,2,6128),
(8,'C-03540',8,1,22499),
(9,'B-03910',9,4,10399),
(10,'A-03991',10,2,2699);
