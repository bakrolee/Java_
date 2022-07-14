select * from employees;

desc employees;
-- mySQL 에서 
-- 날짜 = DATE
-- 시간 = TIME
-- 날짜 시간 : DateTIME / timeSTAMP

select current_date();
select current_time();
select current_timestamp();

select date '2022-07-14';
select time '12:05:33';

-- Hire_Date가 1987년 6월인 직원
select * from employees where HIRE_DATE between Date '1987-06-01' and '1987-06-20';
select * from employees where HIRE_DATE between '1987/06/01' and '1987/06/30'; -- 얘도 됨 
	-- (MySQL에서 날짜를 비교할 때 문자열로 입력해도 알아서 형변환 하는 편의 제공)

select adddate('1987-06-01', 40); -- 날짜 더하기
select subdate('1987-06-01', 1); -- 날짜 빼기
select date_add('1987-06-01', interval 40 day); -- 기간을 연산함.
select date_sub('1987-06-01', interval 1 Month);
select '1987-06-01' + interval 1 year; -- 합연산 할 때 간격 표현으로 처리하면(그냥 정수 X) 가능 
select '1987-06-30' + interval 1 day; 
select '1987-07-01' - interval 1 day;

-- 요일 구하기
select dayOfWeek('2022-07-14');  -- 1(= 일요일) 

-- 해당 단위만 구하기
select extract(year from '2022-07-14');
select extract(month from '2022-07-14');
select extract(day from '2022-07-14');

-- 날짜 빼기
select dateDiff('2022-06-13', '2022-06-01'); 

-- 문자열을 날짜표현으로 바꿈
select str_to_date('  2021  /  05  /  13  ', '%Y/%m/%d');
-- 날짜 -> 영문표현으로 바꿈
select date_Format(Date '2021-06-13', '%y/%M/%D');

-- 17일에 고용된 직원 목록
select * from employees where extract(day from hire_date) = 17;
select * from employees where hire_date like '%-17';
	-- mySQL은 문자열 취급해서 패턴 검색도 가능함.

-- job_history 각 행별로 일한 기간(일) 조회
select START_DATE, END_DATE, dateDiff(END_DATE, START_DATE) as inter from job_history;


-- 자료형 숫자, 문자열, 날짜
select cast(10 as time);  -- 임의의 값을 원하는 형(As ?)으로 변환
select cast('10' as double) + 5.5;

select convert(10, time);
select convert('10', double) + 5.5;
