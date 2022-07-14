CREATE DATABASE my_db;

show databases;

use my_db;

show tables;

-- 사람 테이블 만들기
-- 열 1 이름 문자열
-- 열 2 나이 정수
create table persons (
	name varchar(10), -- varchar : 문자열을 나타내는 하나의 타입, 괄호 안은 길이
    age int
);

desc persons;

select * from persons;

insert into persons (name, age) values ("홍길동", 22);

-- 행 추가
-- '스티븐 킹', 40살 
insert into persons (name, age) values ("스티븐 킹", 40);
-- '브루스 리', 30살
insert into persons (name, age) values ("브루스 리", 30);
-- '철수', 20살
-- '철수', 30살
-- '철수', 40살
insert into persons (name, age) values ('철수', 20), ('철수', 30), ('철수', 40);

delete from persons; 

DROP table persons;


-- 책 테이블 
-- 제목 : 문자열
-- 가격 : 정수
create table books (
	title varchar(25),
    price int
);

select * from books;

insert into books (title, price) values ('파워자바', 25000), ('하늘과 바람과 별과 시', 15000), ('꽃을 보듯 너를 본다', 12000);


-- char, varchar 비교 연습용 테이블
create table testChar (
	fixLength char(5),
    varLength varchar(5)
);

insert into testChar (fixLength, varLength) values ('A', 'A');
-- SET sql_mode = 'PAD_CHAR_TO_FULL_LENGTH';  -- MySQL에서 최적화를 해줘서 길이값을 자동 조절해줘버렸음.(하지만 모든 DB툴이 이렇지는 않을 것)
select char_length(fixLength), char_length(varLength) from testChar;


-- 빈칸 지우기
select rtrim('A           '); 
select Ltrim('          A');





