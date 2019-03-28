show databases;
use mysql;

select host, user, password from mysql.user;
CREATE USER 'bit'@'localhost' IDENTIFIED BY '1004';
CREATE USER 'bit'@'%' IDENTIFIED BY '1004';
create database bituser;
grant all privileges on bituser.* to bit;
grant all privileges on bituser.* to 'bit'@'localhost';
show databases;
use bituser;
CREATE TABLE EMP
(EMPNO BIGINT not null,
ENAME VARCHAR(10),
JOB VARCHAR(9),
MGR INT ,
HIREDATE DATE,
SAL INT ,
COMM INT ,
DEPTNO INT );
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,200,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,30,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,300,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,'1981-04-01',2850,null,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,'1981-06-01',2450,null,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,'1982-10-09',3000,null,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',null,'1981-11-17',5000,3500,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,'1981-10-03',950,null,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,'1981-10-3',3000,null,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);
FLUSH PRIVILEGES; -- COMMIT;
SELECT * FROM EMP;
CREATE TABLE DEPT
(DEPTNO INT,
DNAME VARCHAR(14),
LOC VARCHAR(13) );
INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');
FLUSH PRIVILEGES; -- COMMIT;
SELECT * FROM DEPT;
CREATE TABLE SALGRADE
( GRADE INT,
LOSAL INT,
HISAL INT );
INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
FLUSH PRIVILEGES; -- COMMIT;

use bituser;
select * from dmlemp;

create table trans_A(
  num number,
  name varchar2(20)
);

create table trans_B(
  num number constraint pk_trans_B_num primary key,
  name varchar2(20)
);

select * from trans_A;
select * from trans_B;

select * from dept;

create table department(
deptno number,
dname varchar2(20)
);

select * from department;

create table student(
snum number,
sname varchar2(20)
);

select * from student;
drop table student;

insert into student (snum,sname) values (1,'kim');
insert into student (snum,sname) values (2,'park');
insert into student (snum,sname) values (3,'jeong');
