select * from country where name LIKE '%korea%';

select * from country where name like '%k';
select * from country where name like 'k%';

-- 국가 이름이 'a'로 시작하고 'a로 끝나는 국가 조회
select * from country where name like 'a%a';

-- 국가 이름이 'a'로 시작하고 'a로 끝나는 국가 조회 (6자)
select * from country where name like 'a____a';

-- 국가 명이 ~ria로 끝나는 국가 조회
select * from country where name like '%ria';

-- region 컬럼이 north~ 로 시작하는 국가 조회
select * from country where Region like 'north%';

-- region 컬럼에 a로 시작해서 a로 끝나는 명칭을 포함하지 않는 국가 조회
select * from country 
	where 
	-- Region not like 'a%a'  (%a%a가 포함함. 맨앞 %의 값이 0이어도 되니깐...)
	Region not like '%a%a'
    AND Region not like 'a%a%';
