-- 학생 
-- 이름 : 가변길이 문자열(10자)
-- 학점 : 실수

create table students (
	name varchar(10)
    , age int
    , score double
);

desc students;

insert into students (name, age, score) values ('길동', 20, 3.3);
insert into students (name, age, score) values ('길동', 21, 2.6);
insert into students (name, age, score) values ('둘리', 20.5, 3);  -- int에 실수 넣으면 자동 반올림 됨.

select * from students;

delete from students where name = '둘리';


-- 중복된 값을 가진 행을 선택할 때 -> KEY를 가져야 함.