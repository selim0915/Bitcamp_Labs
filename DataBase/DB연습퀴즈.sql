--@190319 ������
--1. �̸�, ��ȭ��ȣ, ���̰� ����ִ� person���̺� ���� (�̸��� ���̿ü�����)
create table person(
  name varchar2(30) not null,
  phone varchar2(50),
  age number
);
desc person;
--2. person���̺� ȫ�浿(20, 1234-5678) / ö��(18, 1111-1111) / ����(?, 0000-7777) / �ƹ���(22, 1212-1212)�߰�
insert into person (name, phone, age) values ('ȫ�浿', '1234-5678', 20);
insert into person (name, phone, age) values ('ö��', '1111-1111', 18);
insert into person (name, phone) values ('����', '0000-7777');
insert into person (name, phone, age) values ('�ƹ���', '1212-1212', 22);
select * from person;
--3. ��ȭ��ȣ�� 1�� ���鼭 ���̰� 20�̻��� ��� ���
select * from person where phone like '%1%' and age>=20;
--4. �̸�,�а�,������ ����ִ� student ���̺� ������ ���� ȫ�浿(�İ�,A) / ������(����,B) / �ƹ���(����,F)
create table student (
  name varchar2(20),
  major varchar2(30),
  grade varchar2(10)
);
insert into student (name, major, grade) values ('ȫ�浿','�İ�','A');
insert into student (name, major, grade) values ('������','����','B');
insert into student (name, major, grade) values ('�ƹ���','����','F');
select * from student;
--5. person���̺��� �л��̸鼭, ������ B�̻��� ����� �̸�, ��ȣ, �а�, ���� ���
select person.name, phone, major, grade 
from person 
join STUDENT on person.NAME = student.name 
where student.grade='A' or student.grade='B';


--@190319 �켼��
--------------------------
create table student2(
  name varchar2(20) not null,
  age number not null,
  phone number(30),
  birthday date not null
);
desc student2;

insert into student2 (name, age, phone, birthday) values ('�����', 16, 01012341234, '2004-08-04');
insert into student2 (name, age, phone, birthday) values ('���ҽ�', 15, 01023456789, '2004-01-04');
insert into student2 (name, age, phone, birthday) values ('�質��', 15, 01034567890, '2005-01-02');
insert into student2 (name, age, phone, birthday) values ('������', 15, 01056789012, '2005-01-17');
insert into student2 (name, age, birthday) values ('ȫ����', 15, '2005-07-04');
insert into student2 (name, age, birthday) values ('������', 15, '2005-11-04');
insert into student2 (name, age, phone, birthday) values ('������', 14, 01067890123, '2006-01-01');
insert into student2 (name, age, phone, birthday) values ('�質��', 14, 01078901234, '2006-06-06');
insert into student2 (name, age, phone, birthday) values ('�弮��', 14, 01089012345, '2006-05-04');
insert into student2 (name, age, phone, birthday) values ('�����', 16, 01012341234, '2004-08-04');
select * from student2;
--1
select name as "�л� �̸�", age+10, phone, birthday from student2 order by name;
select *
from Student2;
--2
select name||' �����л�', age, phone, birthday from student2 where name like '��%' or name like '��%' or name like'��%';
select name||' �����л�', age, phone, birthday from student2 where regexp_like(name, '[���幮]');
--3
select distinct name, age from student2 order by name desc, age desc;
--4
select mod(2000,3) from dual;
--5
select name, age, nvl(phone,0) from student2 where birthday between '2005-01-01' and '2006-12-31';


--@190320 �켼��
--1. EMP ���̺��� �޿��� 3000 �̸鼭 �����ȣ�� 7788�� ����� �����ȣ,�̸�,������,�޿��� ���
select empno, ename, JOB, sal from emp where sal>=3000 and empno=7788;
--2.EMP ���̺��� �Ի����� 1981 ������ ������� �̸�,����,�Ի����� �Ի��� ������ ����Ͻÿ�.
select ename, job, hiredate from emp where to_char(hiredate,'YYYY-MM-DD') > '1981' order by hiredate; 
--3. EMP ���̺��� �μ���ȣ�� 10,20 �� ����� �̸��� 'S'�� �����ϴ� ����� �̸�, �μ���ȣ�� ���, �� �̸������� ���� (in���)
select ename, deptno from emp where deptno in (10,20) and ename like 'S%' order by ename;
--4. EMP ���̺��� �޿��� 1500 �̻��̰� �μ���ȣ�� 10,30 �� ��� �� 1982 �⿡ �Ի��� ����� ������ ���
select * from emp where sal >=1000 and deptno in (10,30) and to_char(hiredate,'YYYY') = '1982';
--5. EMP ���̺��� COMM �� NULL �� �ƴϰ� MANAGER�� �ƴ� ����� ��� ������ ���
select * from emp where comm is not null and job != 'MANAGER';
--6. EMP ���̺��� ���ʽ��� �޿����� 10%�� ���� ��� �������� �μ���ȣ ������������ �����Ͽ� ���
select * from emp where comm < sal*10 order by deptno asc;
--7. EMP ���̺��� �̸��� L �� �� �ڰ� �ְ� �μ��� 30 �̰ų� �Ǵ� �����ڰ� 7782 �� ����� ��� ������ ����ϴ� SELECT ���� �ۼ��Ͽ���.
select * from emp where ename like '%L%L%' and deptno=30 or mgr='7782';
--8. ���� ��¥�� ���(2019.03.05 07:03)�ϰ� �� ���̺��� '����ð�' ���� ���
select to_char(sysdate,'YYYY.MM.ss HH:mm') as "����ð�" from dual;
--9. EMP ���̺��� ���� �޿��� 15%�� ������ �޿��� �����ȣ,�̸�,����,�޿�,������ �޿�(New Salary),������(Increase)�� ����ϴ� SELECT ������ ����Ͻÿ�.
select empno, ename, job, sal as "�޿�", sal*15 as "������ �޿�", (sal*15)-sal as "������" from emp;
--10. EMP ���̺��� �̸�,�Ի���,�Ի��Ϸκ��� 6 ���� �� ���ƿ��� ������ ���Ͽ� ���
select hiredate "��¥", add_months(hiredate, 6) "6������", next_day(add_months(hiredate, 6), '������') "6������ ��" from emp;
--11. EMP ���̺��� �Ի���, �Ի��Ϸκ��� ��������� ����, �޿�, �Ի��Ϻ��� ��������� �޿��� �Ѱ踦 ���
select hiredate, trunc(months_between(sysdate, HIREDATE),0) as "��������� ����" 
, sal, to_char(trunc(months_between(sysdate, HIREDATE),0)*sal,'999,999,999') as "��������� �޿�" from emp;
--12. EMP ���̺��� ��� ����� �̸��� �޿�(15 �ڸ��� ��� ������ ����� ��*���� ��ġ)�� ���
select rpad(ename||sal,15,'*') from emp;
--13. EMP ���̺��� ��� ����� �Ի���,�Ի��� ������ ���
select hiredate, to_char(hiredate,'day') from emp;
--14. EMP ���̺��� �̸��� ���̰� 6 �� �̻��� ����� ������ �̸�,�̸��� ���ڼ�,������ ���
select * from emp where length(ename)=6;
--15. EMP ���̺��� ��� SALESMAN �� ���Ͽ� �޿��� ���, �ְ��, ������, �հ踦 ���Ͽ� ���
select avg(sal), max(sal), min(sal), sum(sal) from emp where job ='SALESMAN';
--16. EMP ���̺� ��ϵǾ� �ִ� �ο���, ���ʽ��� NULL �� �ƴ� �ο���, ���ʽ��� ���(null ����, ��������), �μ��� ��(3��)�� ���Ͽ� ���
select count(*), count(comm), trunc(avg(nvl(comm,0)),0), count(distinct deptno) from emp;
--17. EMP ���̺��� �μ����� �ο���,��� �޿�,�����޿�,�ְ� �޿�,�޿��� ���� ���Ͽ� �޿��� ���� ���� ������ ���
select job, count(*), round(avg(sal),1), max(sal), min(sal), sum(sal) from emp group by job order by sum(sal) desc;
--18. EMP ���̺��� �μ��� �ְ� �޿��� �ּ� �޿��� ���̴� ���ΰ� ���
select job, max(sal)-min(sal) as "�޿�����" from emp group by JOB;


--@190320 ������
--1. �μ� ��ȣ(department_id)�� 50�� ������� �̸��� ���̵� �ҷ��� ���̵� �ҹ��ڷ� �ٲٰ� ���̵�@oracle.com �������� ����ϼ���.
select lower(email)||'@oracle.com' as "�̸���" from EMPLOYEES where DEPARTMENT_ID=50;
--2. ��� ����� ��ȭ��ȣ�� �ҷ��� ���� 3�� ���ڸ� 010���� �ٲٰ� '.'�� '-'�� �ٲ㼭 ����ϼ���
select phone_number, replace(replace(phone_number, substr(phone_number,1,3), '010'),'.','-') from EMPLOYEES;
--3. �μ� ��ȣ ���� �޿�(salary)�� ������ ������ ����ϵ� ��� ��ȣ(employee_id)�� 100������ 150�������� ����� ����ؼ� ����ϼ���
select sum(salary) , employee_id from EMPLOYEES where EMPLOYEE_ID between 100 and 150 group by DEPARTMENT_ID;
--4. �Ի� �������� �Ի����� ���� ����ϰ� ����� �̸�(first_name)�� ��(last_name)�� �߰��� ������ �־� ���� ����ϼ���
select case when to_char(hire_date,'YYYY')>2002 then '����' 
            when to_char(hire_date,'YYYY')>2005 then 'û��' 
            when to_char(hire_date,'YYYY')>2007 then '������' 
            else '�ܰ���'
      end as "���", FIRST_NAME || ' ' || LAST_NAME
from EMPLOYEES;


--@190320 �赿��
--1. empno �� ename �����Ͽ� ����Ͻÿ�.  ( || ���!)
select empno || ename from EMP;
--2. �̸��� SMITH �̰� ������ CLERK �� ����� �����ȣ, �̸�, ����, �޿��� ����Ͻÿ�. (where �̸� =' ' and ����=' ')
select empno, ename, job, sal from emp where ename='SMITH' and job='CLERK';
--3. �����ȣ�� 10 �̻��̰� �޿��� 2000 �̻��� ����� ��� ������ ����Ͻÿ�. where �����ȣ = ' ' and �޿�(sal) = ' ';
select * from emp where deptno >10 and sal >=2000;
--4. ������ null �� ��� ����� ������ ����Ͻÿ�.where comm IS NULL
select * from emp where comm is null;
--5. ���, �̸�, �޿�, ����, �ѱ޿��� ����Ͻÿ�.select sal + nvl(comm,0) from emp;
select empno, ename, sal, comm, sal+nvl(COMM,0) from emp;
--6. �̸����� A�� �����ϴ� ����� ���,�̸�, �޿�, ���� �� ����Ͻÿ�. ��, ������ null�̶�� 0 �� ����Ͻÿ�. (edited) 
select empno, ename, sal, nvl(comm,0) from emp where ename like 'A%';

---------------------
--@190321 �켼��
-- 1. ��å(Job Title)�� Sales Manager�� ������� �Ի�⵵��
-- �Ի�⵵(hire_date)�� ��� �޿��� ����Ͻÿ�.
-- ��� �� �⵵�� �������� �������� �����Ͻÿ�.
select to_char(hire_date,'YY'), SALARY, job_id from EMPLOYEES where SALARY in(select SALARY from EMPLOYEES) and  job_id = 'SA_MAN' order by to_char(hire_date,'YY');


--2. �� ����(city)�� �ִ� ��� �μ� �������� ��ձ޿��� ��ȸ�ϰ��� �Ѵ�. 
--   ��ձ޿��� ���� ���� ���ú��� ���ø�(city)�� ��տ���, �ش� ������ �������� ����Ͻÿ�. 
--   ��, ���ÿ� �� ���ϴ� ������ 10�� �̻��� ���� �����ϰ� ��ȸ�Ͻÿ�.

--3. ��Public  Accountant���� ��å(job_title)���� ���ſ� �ٹ��� ���� �ִ� ��� ����� ����� �̸��� ����Ͻÿ�. 
--   (���� ��Public Accountant���� ��å(job_title)���� �ٹ��ϴ� ����� ��� ���� �ʴ´�.)      
--   �̸��� first_name, last_name�� �Ʒ��� �������� ���� ����Ѵ�.

--4. �ڽ��� �Ŵ������� ����(salary)�� ���� �޴� �������� ��(last_name)�� ����(salary)�� �� ���Ͻÿ�. 

--5. 2007�⿡ �Ի�(hire_date)�� �������� ���(employee_id), �̸�(first_name), ��(last_name), 
--   �μ���(department_name)�� ��ȸ�մϴ�.  
--   �̶�, �μ��� ��ġ���� ���� ������ ���, ��<Not Assigned>���� ����Ͻÿ�. 

------------------------------------------------------------------
------------------------------------------------------------------










