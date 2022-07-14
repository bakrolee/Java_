create table persons (
	personID int primary key auto_increment
    , firstName varchar(10) NOT NULL -- 
    , lastName varchar(10) NOT NULL
    , age INT NOT NULL
    , email varchar(50) not null UNIQUE
);

-- insert into (firstname, lastname, age) values (null, null, null); -- 제약사항을 어겼으므로 튜플 생성되지 않음.
insert into persons (firstname, lastname, age, email) values ("길동", "홍", 20, "길동@길동.net");
-- insert into persons (firstname, lastname, age, email) values ("길동", "고", 20, "길동@길동.net"); -- email이 중복
insert into persons (firstname, lastname, age, email) values ("길동", "고", 42, "kildong@길동.net");

select * from persons;

drop table persons;