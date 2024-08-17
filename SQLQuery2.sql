create table student(
id int primary key identity(1,1), -- column level constraint
sname varchar(20),
section varchar(10),
phoneno char(10)
)
select * from student

insert into student (sname,section,phoneno) values('niketh','it-b','8247373288'),
('pankaj','it-c','1234567890');


create table employee(
slno int, -- column level constraint
ename varchar(20),
dept varchar(10),
phoneno char(10),primary key (slno)
)

select * from employee

insert into employee (slno,ename,dept,phoneno) values(101,'ajay','cse-c','0987654321'),
(102,'sathvik','cse-b','1111111111');