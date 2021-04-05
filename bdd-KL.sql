create database BDDColegioKLF
go

use BDDColegioKLF
go


CREATE TABLE preguntasP(
    id int IDENTITY(1,1) primary key NOT NULL,
    anio varchar(10) NOT NULL,
	bimestre varchar(10) NOT NULL,
	curso varchar(max) NOT NULL,
	dificultad varchar(10) NOT NULL,
	pregunta varchar(max) NOT NULL,
)
go

CREATE TABLE usuario(
	id int IDENTITY(1,1) primary key NOT NULL,
	ident varchar(40) NOT NULL,
	clave varchar(50) NOT NULL,
	nombre varchar(50) NOT NULL,
	apellido varchar(50) NOT NULL,
)
go

create table examen(
ExamenID int identity(1,1) primary key not null,
profesor varchar(50)
)
go


create table examenP(
ExamenP int identity(1,1) primary key not null,
ExamenID int,
idPreguntas int
)
go

alter table examenP add constraint fkExamen
foreign key(ExamenID) references examen

alter table examenP add constraint fkPreguntas
foreign key(idPreguntas) references preguntasP

insert into usuario values('garyvelarde@gmail.com','123456','Gary','Velarde')
go

insert into preguntasP values ('1','II','Matematica','A','Como te llamas?')
go

select*from usuario
go

select*from examenP
go

select*from preguntasP
go

select*from examen
go

