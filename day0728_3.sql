--���ڿ��� �ۼ��� ��

create table test_string(
ssn char,
name varchar2(1));


insert into test_string(ssn,name) values('abc','a');

drop table test_string;
purge recyclebin;
--�̸�, ����, �ּ� �����ϴ� ���̺� ����
create table test_string (
 name varchar2(15),
 gender char(1),
 addr varchar2(200));
 select tname
 from tab;
 --�� �߰� - �ѱ� 1�ڴ� 3byte , �����ڳ� ���� �ϳ��� 1����Ʈ�� ���
 insert into test_string(name,gender,addr)
 values('�̵���','M','����� ���ϱ� �ֻ���4�� 30-29');


 --������ ������ �ִ� ���̺��� �˻�.
select * from test_string;
--�ѱ� 1�ڴ� 3����Ʈ
insert into test_string(name,gender,addr)
values('Ȳ�ݵ�����','M','����� ���۱� �󵵵�');
select * from test_string;
insert into test_string(name,gender,addr)
values('Ȳ�ݵ�������','M','����� ���۱� �󵵵�');
insert into test_string(name,gender,addr)
values('MMMMMMMMMMMMMM1','M','����� ���۱� �󵵵�');
insert into test_string(name,gender,addr)
values('MMMMMMMMMMMMMM11','M','����� ���۱� �󵵵�');
select * from test_string;
