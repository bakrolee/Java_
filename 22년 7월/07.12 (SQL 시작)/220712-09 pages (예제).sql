SET @rowCount := 239;
set @pageNumber := 2;
set @pagePer := 10;  -- 페이지에 몇 개가 나오는지
set @pageNum := @pagePer * @pageNumber;
set @totalPage := ceil(@rowCount / @pagePer);  -- 총 페이지 수가 몇 개가 될지 계산 하는 수식

-- 239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자하는 페이지 번호를 정하면 
-- 해당 row들을 조회할 수 있는 select 문을 작성해보기

PREPARE STMT FROM 'select * from country Limit ? offSet ?';
EXECUTE STMT USING @pagePer, @pageNum;

-- select * 
-- from country
-- limit 10 offset 10;


