--DD : Data Dictionary ( ������ ���� )
-- DBMS�� ������� ����ִ� ���̺�
--�������� ��밡���� DD�� �ٸ���.select * from TEST_NUMBERselect rowid, t.* from TEST_NUMBER t

select * from tab;

select * from dba_users;

select * from TEST_NUMBER;


--TEST_NUMBER ���̺� 1,28, 65.23�� �߰�
insert into test_number(num1, NUM2,weight)
values (1, 128, 65.23);
--num1 �÷��� ���� 22���� �⺻
insert into test_number(num1, NUM2,weight)
values (1111111111111111111111, 28, 65.23);
insert into test_number(num1, NUM2,weight)
values (2, 0, 65.23);
insert into test_number(num1, NUM2,weight)
values (3, 0, 65.23);
insert into test_number(num1, NUM2,weight)
values (999, 0, 65.23);
insert into test_number(num1, NUM2,weight)
values (5, 1, 0.00);
insert into test_number(num1, NUM2,weight)
values (5, 1, 65.7);
insert into test_number(num1, NUM2,weight)
values (5, 1, 999.99);
--insert into test_number(num1, NUM2,weight)
--values (5, 1, 99999.99);
--�Ǽ��� �ڸ����� �ʰ��ϴ��� �Է��� �ȴ�.
insert into test_number(num1, NUM2,weight)
values (5, 1, 1.123);
commit;
--weight 0.00~999.99���� �Է� ����
select * from TEST_NUMBER



