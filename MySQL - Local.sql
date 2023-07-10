---------------------------------------------- Data Base development_practice ----------------------------------------------

-- Create Data Base
-- create database development_practice;
-- use development_practice;

---------------------------------------------- Tabla Persona ----------------------------------------------



-- Tabla
create table persona(
ID integer PRIMARY KEY NOT NULL,
NOMBRE varchar(50) NOT NULL,
A_PATERNO varchar(50) NOT NULL,
A_MATERNO varchar(50) NOT NULL,
EDAD integer NULL,
CURP varchar(50) UNIQUE NOT NULL,
FECHA_ALTA date,
EMPLEADO_ID integer NOT NULL
);

-- Para utilizar la secuencia creada en una inserci�n de fila:
insert into persona values(1, 'Angel', 'Martinez', 'Leon', '37', 'MALA851207HDFRNN06', now(), 1);
-- insert into persona values(2, 'Diana', 'Martinez', 'Leon', '28', 'MALD941011MDFRNN06', sysdate, 2);

-- Consultar la Tabla
Select * from persona;

-- OPCIONES PARA OBTENER FECHAS DEL SISTEMA
-- Select now()
---------------------------------------------- Tabla Empleado ----------------------------------------------

-- Tabla
create table empleado(
ID integer PRIMARY KEY AUTO_INCREMENT NOT NULL,
PUESTO varchar(50) NOT NULL,
SUELDO float NOT NULL
);

-- Insertar
-- insert into empleado values(sec_empleado.currval, 'Desarrollador2', 45850);
-- insert into empleado values(sec_empleado.nextval, 'Desarrollador7', 45850);
insert into empleado values(2, 'Desarrollador', 51200);
-- Consultar
Select * from empleado;
-- Delete from empleado
-- Drop table empleado;




---------------------------------------------- Consultar OBJETOS CREADOS ----------------------------------------------

-- Consultar la Tablas
Select * from empleado;
Select * from persona;
