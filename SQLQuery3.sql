
create table visitor(
	vid int primary key identity(1,1),
	vname varchar(15),
	age tinyint check (age between 1 and 150),
	purpose varchar(10),
	gender varchar(7) check (gender in ('M','F','m','f','female','male','Female','Male')),
	dept varchar(10),
	logintime datetime default getdate(),
	phoneno char(10) check (phoneno like '[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
)
insert into visitor(vname,age,purpose,gender,dept,phoneno) values('niketh','21','training','male','fsd','9234567890'),
('saketh','32','eating','male','bpo','8987654321'),
('akshaya','145','sleeping','f',null,'9010101010')

select * from visitor

