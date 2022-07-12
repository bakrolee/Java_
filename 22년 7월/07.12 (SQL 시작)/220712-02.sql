-- SELECT ?? (보고싶은 거) FROM country (테이블 이름, 어디서 볼건지?);
select * from country;
select * from city;

select Name, 
Population
from 
country;

desc country;

-- country 테이블 code열과 gnp열을 조회해보세요.
select GNP, Code from country;

select * from country where name = 'south korea';

select * from country where name = 'japan';

select * from country where name = 'china';

-- Continent 값이 'Asia'인 행 조회하기
select name, HeadOfState from country where Continent = 'asia';

-- 한중일 한번에 보기
select * from country where name = 'south korea' OR name = 'japan' OR name = 'china';


-- population(인구) 컬럼 값이 40,000,000 이상인 국가의 모든 컬럼 조회
select * from country where Population >= 40000000;
select * from country where Population >= 40000000 and Population <= 50000000;


-- continent 값이 aisa를 제외한 국가
select * from country where Continent <> 'asia';