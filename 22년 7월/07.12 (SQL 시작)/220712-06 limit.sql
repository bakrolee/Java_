-- limit : 맨 마지막에 위치함(문법). 행의 개수를 제한함.
select * from country limit 5;

-- 인구가 가장 많은 1개의 국가 조회
select * from country 
order by Population desc 
limit 1;

-- 면적 순 탑 5
select * from country
order by SurfaceArea desc
limit 5;

-- continent가 'Asia'인 국가들 중 면적이 좁은 순 10개 국가 조회
select * 
	from country
	where Continent = 'asia'
    order by SurfaceArea desc
    limit 10;
    
-- region이 '~africa'로 끝나는 국가들 중 독립년도가 가장 최근인 10개 국가 
select *
	from country
    where region like '%africa'
    order by indepYear desc
    limit 10;

-- 면적당 인구비율(SurfaceArea / population)을 구해서 탑 10 국가 조회
select *, Population / SurfaceArea as '인구비율'
	from country
    order by 인구비율 desc
    limit 10;
    
-- (gnp - gnpold 변화량) 최상위 10 조회
select *, gnp - gnpold
	from country
    order by gnp - gnpold desc
    limit 10;

