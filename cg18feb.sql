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
INSERT INTO dep (did, dname, city) VALUES (20, 'Admin', 'Chennai');
INSERT INTO dep (did, dname, city) VALUES (30, 'Sales', 'Pune');
INSERT INTO dep (did, dname, city) VALUES (40, 'Mgmnt', 'Bengaluru');
commit; 

SELECT * FROM dep; 

INSERT INTO emp (eid, ename, salary, did) VALUES (101, 'Sonu', 50000, 10);
INSERT INTO emp (eid, ename, salary, did) VALUES (102, 'Monu', 60000, 20);
INSERT INTO emp (eid, ename, salary, did) VALUES (103, 'Tonu', 55000, 20);
INSERT INTO emp (eid, ename, salary, did) VALUES (104, 'Gonu', 65000, 30);
INSERT INTO emp (eid, ename, salary, did) VALUES (105, 'Ponu', 40000, null);
commit; 

SELECT * FROM emp; 
SELECT * FROM dep; 

-- error 
-- INSERT INTO emp (eid, ename, salary, did) VALUES (106, 'Ponu', 40000, 50);
-- INSERT INTO emp (eid, ename, salary, did) VALUES (101, 'Ponu', 40000, 10);
-- INSERT INTO emp (eid, ename, salary, did) VALUES (null, 'Ponu', 40000, 50);

-- In which city does Sonu work? 
-- not workable 
-- SELECT ename, city FROM emp, dep WHERE ename = 'Sonu'; 

-- JOINS - fetch data from mutiple tables 

-- SELECT ename, city 
-- FROM emp
-- JOIN dep 
-- ON emp.did = dep.did
-- WHERE ename = 'Sonu'; 

SELECT e.ename, d.city 
FROM emp e
JOIN dep d
ON e.did = d.did
WHERE e.ename = 'Sonu'; 

SELECT * FROM emp;
SELECT * FROM dep;

-- types of join - 
-- 1. inner join - only matching records 
-- outer joins 
-- 2. left outer join -  matching records from both tables and non-matching records from left table  
-- 2. right outer join -  matching records from both tables and non-matching records from right table  
-- 3. full outer join -  matching and non-mathcing records from both tables 

-- 2. left outer join -
SELECT * 
FROM emp e
LEFT JOIN dep d
ON e.did = d.did;

-- 3. right outer join -
SELECT * 
FROM emp e
RIGHT JOIN dep d
ON e.did = d.did;

-- 4. full outer join -
SELECT * 
FROM emp e
FULL JOIN dep d
ON e.did = d.did;


SELECT * FROM emp;

-- Which employee has the highest salary?

-- subquery 
SELECT ename, salary FROM emp WHERE salary = 
(SELECT max(salary) FROM emp);

SELECT * FROM emp;
SELECT * FROM emp5;

COMMIT ;

INSERT INTO emp (eid, ename, salary, did) VALUES (106, 'SonuSonuSonuSonu', 50000, 10);


drop table t1;

create table t1 (c1 int);

insert into t1 values (10);
insert into t1 values(20);
insert into t1 values(30);

select * from t1;

delete from t1 where c1 = 10;
-- delete t1 where c1 = 20;

commit; 

CREATE TABLE emp_table(
	eid INT CONSTRAINT emp_table_pk PRIMARY KEY, 
	firstName VARCHAR(10), 
	salary DECIMAL);

select * from emp_table;

commit; 

select * from emp_table;

-- drop table emp_table;

