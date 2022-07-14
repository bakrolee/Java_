drop database my_db;

create database my_db;

use my_db;

create table students (
	number int primary key -- 학번 (학생을 고유하게 나타내기 위해 key로 쓸 것)
	, name varchar(10)
    , age int
    , score double
);

desc students;

insert into students (number, name, age, score) values (1234, '길동', 20, 3.3);
insert into students (number, name, age, score) values (1235, '둘리', 30, 4.4);
insert into students (number, name, age, score) values (1236, '길동', 20, 3.3);

select * from students;