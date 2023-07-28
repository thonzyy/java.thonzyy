--DD : Data Dictionary ( 데이터 사전 )
-- DBMS의 운영정보가 들어있는 테이블
--계정마다 사용가능한 DD가 다르다.select * from TEST_NUMBERselect rowid, t.* from TEST_NUMBER t

select * from tab;

select * from dba_users;

select * from TEST_NUMBER;


--TEST_NUMBER 테이블에 1,28, 65.23을 추가
insert into test_number(num1, NUM2,weight)
values (1, 128, 65.23);
--num1 컬럼은 숫자 22개가 기본
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
--실수는 자리수를 초과하더라도 입력이 된다.
insert into test_number(num1, NUM2,weight)
values (5, 1, 1.123);
commit;
--weight 0.00~999.99까지 입력 가능
select * from TEST_NUMBER



