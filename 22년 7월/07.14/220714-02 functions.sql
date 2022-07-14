select * from employees;

select rtrim('a       ');
select ltrim('      a');
select trim('   a    ');

select LOWER('ABCDE'); -- 대문자 -> 소문자로
SELECT UPPER('abcde'); -- 소문자 -> 대문자로

select REVERSE('qwer'); -- 글자 반전 

select CONCAT('문자열', '결합', '함수');
select CONCAT('결합', null, '값이 있으면?'); -- null이 있으면 무조건 null

select replace('원본 문자열에서 변환합니다', '변환', 'Replace'); -- 변환 

select substring('employees', 5); -- 문자열, 자를 시작 위치(1 = 맨앞)
select substring('employees', 5, 2); -- 문자열, 자를 시작 위치, 개수
select substring('employees', -3); -- 음수일 때 우측에서부터 위치 셈
select substring('employees', -3, 2); -- 우측에서부터 자름 (결과 ee)

select Lpad('123', 5, '0');
select Rpad('456', 5, '*');

select repeat('반복결합', 3);

select locate('D', 'ABCDEFG');  -- 위치 구하기
select locate('D', 'ABCDEFG ABCD', 5);  -- 시작 위치 정하기
SELECT LOCATE('위치', '문자열의 위치를 찾는데, SQL의 문자 순서는 1부터임');

-- "512.123.4567"
-- .을 기준으로 각각 자르기
select substring("512.123.4567", 1, 3);
select substring("512.123.4567", 5, 3);
select substring("512.123.4567", -4, 4);

select Locate('.', "512.123.4567");
-- 직원테이블 전화번호 앞자리 3자리를 분류해서 개수
select substring(PHONE_NUMBER, 1, 3), count(*) from employees
group by substring(PHONE_NUMBER, 1, 3);


-- 
select rand(); -- 0 ~ 1 사이의 난수(소수) 생성
select Round(123.125, 2); -- 반올림 (결과 : 123.13)
select floor(1.555); -- 내림
select ceil(1.222); -- 올림

select abs(-55); -- 절대값
select pow(2, 8); -- 제곱

-- 주사위 1~6 사이의 난수(정수) 생성
select ceil(rand() * 6);