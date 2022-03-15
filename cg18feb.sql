select current_date;

create table emp(eid INT, first_name varchar(10));

commit;

insert into emp (eid, first_name) values (101, 'Sonu');
insert into emp (eid, first_name) values (102, 'Monu');
insert into emp (eid, first_name) values (103, 'Tonu');

SELECT * FROM emp; 
SELECT eid FROM emp; 
SELECT first_name FROM emp; 
SELECT eid, first_name FROM emp; 

-- what is the name of employee 101?
SELECT first_name FROM emp where eid = 101; 


update emp set first_name = 'Sonuuuuuu' WHERE eid = 101; 

delete from emp where eid = 102;

-- CRUD 

rollback;

-- SQL Learning 
-- datatypes 
-- operators 
-- syntax 
-- DDL - CREATE, DROP, ALTER 
-- DML - INSERT, UPDATE, DELETE 
-- DQL / DRL - SELECT




