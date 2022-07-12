select code AS '코드', name as "이름", Population As "인구" From country;

-- 위의 조회 + SurfaceArea(별명 = 면적) 컬럼을 추가로 조회 
select code AS '코드', name as "이름", Population As "인구", SurfaceArea as "면적" From country;

select code AS '코드', name as "이름", Population As "인구", SurfaceArea as "면적", 15 + 15 as "계산 결과",
		Population / SurfaceArea
From country;

select code AS '코드', name as "이름", Population As "인구", SurfaceArea as "면적",
		Round(Population / SurfaceArea, 1) as "인구밀도"
From country;

-- surFaceArea가 50,000이하이면서 population이 10,000,000이상인 국가의 인구밀도 조회
select code AS '코드', name as "이름", Population As "인구", SurfaceArea as "면적",
		Round(Population / SurfaceArea, 1) as "인구밀도"
	From country
	where SurfaceArea <= 50000 AND Population >= 10000000;

-- 인구 밀도 조회
select code AS '코드', name as "이름", Population As "인구", SurfaceArea as "면적",
		Round(Population / SurfaceArea, 1) as "인구밀도"
	From country
    order by 인구밀도 DESC;
    
select * from country where Continent = 'Asia' order by Population desc;

-- lifeEcpectancy 오름차순으로 조회 (null 제외)
select *
	from country
    where LifeExpectancy is not null
    order by LifeExpectancy asc;

-- 국가의 이름, 인구, gnp, gnpold + (gnpold와 gnp의 차를 구해서 "변화량")을 같이 조회
select Name, Population, GNP, GNPOld, (GNPOld - GNP) as "GNP 변화량"
	from country
    where gnp is not null AND GNPOld is not null
    order by `gnp 변화량` desc;

select *
	from country
    order by Continent, Population;
-- 정렬에 대한 기준 추가적으로 제시가능 , 쓰면 됨 (앞에 쓴 기준으로 1차 정렬, 정렬된 상태에서 뒤의 기준으로 2차 정렬, 이렇게 3,4,5... 가능)

select * from country order by GovernmentForm asc, gnp desc;

