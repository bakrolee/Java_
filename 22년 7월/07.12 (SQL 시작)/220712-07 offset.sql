select * from country;
select * from country limit 1 offset 2;
select * from country limit 2, 1;  -- 앞이 offset임

-- page 나누기 (paging 기법 : 원하는 분량만큼만 뚝뚝 잘라서 봄)
select * from country limit 10 offset 0;
select * from country limit 10 offset 10;
select * from country limit 10 offset 20;