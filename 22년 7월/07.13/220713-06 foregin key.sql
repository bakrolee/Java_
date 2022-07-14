-- 식당 정보 테이블
-- 상호명
-- 전화번호
-- 주소 : 검색할 때를 생각하면 쪼개서 관리하면 좋음 (시/동/...)
create table Restaurants (
	id int primary key auto_increment,
	name varchar(15) not null,
    phoneNumber varchar(14) not null unique,
    address varchar(100) not null unique
);

desc restaurants;

insert into restaurants (name, phoneNumber, address) 
	values ('영자면옥', '010-2272-0755', '부산광역시 부산진구 중앙대로 763')
    , ('대모골', '051-803-3109', '부산광역시 부산진구 부전로152번길 71')
    , ('도연정', '051-805-0071', '부산 부산진구 새싹로 16');

select * from restaurants;
-- drop table restaurants;

-- 메뉴 정보 테이블
-- 음식명
-- 가격
-- drop table menus;
create table menus (
	menuId int primary key auto_increment,
	name varchar(15) not null,
    price int not null
);

insert into menus (name, price) values ('고추장숯불정식', 8000), ('칼국수', 3000), ('짜장면', 3500);
insert into menus (name, price) values ('칼국수', 3500);

ALTER table menus ADD column restID INT;  -- 칼럼 추가

UPDATE menus
set restid = 2  -- 행의 값 변경
where menuid <> 1;  -- 변경할 행 선택 (없으면 전체 변경됨)

-- 외래키 만들기 // add constraint 외래키이름 (지금은 생략함) foreign key (외래키가 들어갈 속성 이름) references 참조테이블 (참조할 키=속성)
alter table menus add constraint foreign key (restID) references restaurants (id);

desc menus;

select * from menus;