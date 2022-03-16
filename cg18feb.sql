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

-- PostgreSQL, Oracle, MySQL, SQL Server, DB2, MariaDB, H2, Derby... 

create table emp2(eid INT, first_name varchar(10), salary decimal);

select * from emp2;

insert into emp2 (eid, first_name, salary) values (101, 'Sonu', 50000);
insert into emp2 (eid, first_name, salary) values (102, 'Monu', 60000);
insert into emp2 (eid, first_name, salary) values (103, 'Tonu', 55000);
insert into emp2 (eid, first_name, salary) values (104, 'Ponu', 40000);
insert into emp2 (eid, first_name, salary) values (105, 'Gonu', 65000);
insert into emp2 (eid, first_name, salary) values (101, 'Ronu', 70000);
insert into emp2 (eid, first_name, salary) values (null, 'Monu', 45000);

commit; 

SELECT * FROM emp2 WHERE salary > 50000;
SELECT * FROM emp2 WHERE salary > 70000;

-- Database 
-- DBMS 
-- RDBMS 

-- OOP 
-- Entity - class 
-- features - fields 
-- functions - methods 

-- ER Model 
-- Entity - table  
-- features - columns 
-- instance - row / record 

-- Employee - works in - Department 

-- SELECT ? FROM ? WHERE ? 

-- RDBMS, PK, FK, Entity, Relationship

DROP TABLE emp; 

commit; 

-- creating table without constraints
-- CREATE TABLE dep(did INT, dname VARCHAR(10), city varchar(10));
-- creating table WITH constraints
CREATE TABLE dep(did INT CONSTRAINT dep_pk PRIMARY KEY, dname VARCHAR(10), city varchar(10));

SELECT * FROM dep; 

CREATE TABLE emp(
	eid INT CONSTRAINT emp_pk PRIMARY KEY, 
	ename VARCHAR(10), 
	salary DECIMAL, 
	did INT CONSTRAINT emp_dep_fk REFERENCES dep(did));

SELECT * FROM emp; 

INSERT INTO dep (did, dname, city) VALUES (10, 'HR', 'Hyderabad');

