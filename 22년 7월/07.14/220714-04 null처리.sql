select Name, LifeExpectancy from country;

select case when 10 > 5 then '왼쪽은 오른쪽보다 큽니다'
			else '왼쪽이 오른쪽보다 작거나 같습니다' 
            end;

select (case when 10 > 5 then "왼쪽"
			when 10 = 5 then "같음"
            when 10 < 5 then "오른쪽"
            end) as '비교';
            
select name
	, case when LifeExpectancy is null then 0.0 
		else LifeExpectancy 
        end as life
from country;

use hr;
-- 직원 이름 (이름 + 성) 결합시킨 Full Name, 전화번호가 011로 시작하는 경우 '개인전화', 그 외의 경우 '내선 번호'라고 별명은 '분류'조회
select 
	concat(First_Name, Last_Name) as Full_Name, 
    -- PHONE_NUMBER, 
    case when substring(PHONE_NUMBER, 1, 3) = '011' 
		 then '개인전화'
         else '내선번호'
         end as '분류'
 from employees;
 
 --
 select ifnull(null, '대체값');
 
 -- 값이 3개. 1번째 값이 null이면 2번째값, 2번째 값도 널이면 3번째 값
 select ifnull(ifnull('첫번째값', '두번째값'), '세번째값');
 
 select coalesce('첫', '두', '세'); -- 나열만 해주면 위의 기능 구현.
 
 
 -- (주의) 헷갈리는 녀석
 select NULLIF('a', 'b'); -- 두 값이 같으면 null, 다르면 'a'(첫번째 값)
 
 