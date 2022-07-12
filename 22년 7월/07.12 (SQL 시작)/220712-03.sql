select * from country where name not in ('south korea', 'japan', 'china');

select * from country where Population between 40000000 and 50000000;

-- continent 컬럼 값이 north America, euproe, asia를 제외한 국가들 중
-- gnp 값이 100이상 1000이하인 국가 목록 조회
select * from country where 
	Continent not in ('North America', 'europe', 'asia') 
    AND GNP between 100 and 1000;
    
select * from country where IndepYear is not null;
