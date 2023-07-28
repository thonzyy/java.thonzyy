--문자열을 작성할 때

create table test_string(
ssn char,
name varchar2(1));


insert into test_string(ssn,name) values('abc','a');

drop table test_string;
purge recyclebin;
--이름, 성별, 주소 저장하는 테이블 생성
create table test_string (
 name varchar2(15),
 gender char(1),
 addr varchar2(200));
 select tname
 from tab;
 --값 추가 - 한글 1자는 3byte , 영문자나 숫자 하나는 1바이트로 계산
 insert into test_string(name,gender,addr)
 values('이동원','M','서울시 성북구 솔샘로4길 30-29');


 --계정이 가지고 있는 테이블을 검색.
select * from test_string;
--한글 1자는 3바이트
insert into test_string(name,gender,addr)
values('황금독수리','M','서울시 동작구 상도동');
select * from test_string;
insert into test_string(name,gender,addr)
values('황금독수리온','M','서울시 동작구 상도동');
insert into test_string(name,gender,addr)
values('MMMMMMMMMMMMMM1','M','서울시 동작구 상도동');
insert into test_string(name,gender,addr)
values('MMMMMMMMMMMMMM11','M','서울시 동작구 상도동');
select * from test_string;
