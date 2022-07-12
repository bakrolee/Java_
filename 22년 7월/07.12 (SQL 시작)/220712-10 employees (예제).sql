-- hr 데이터 베이스 사용하기 / 명령어 작성

-- employees(직원) 테이블의 구조(어떤 칼럼이 있는지) 조회
desc hr.employees;

-- employees(직원) 테이블의 모든 행의 모든 열을 조회
select * from employees;

-- 직원 테이블의 first_name(이름) 열의 값이 'John'인 직원 조회
select * from employees
where FIRST_NAME = 'John';

-- 직원 테이블의 last_name(성) 열의 값이 'John'을 포함하는 직원 조회
select * from employees
where LAST_NAME Like '%John%';

-- 직원 테이블의 이름의 값이 6글자인 직원 조회
select * from employees
where FIRST_NAME Like '______';

-- 직원 테이블 Salary(연봉) 열의 값이 10000 ~ 15000인 직원 조회
select * from employees
where SALARY between 10000 and 15000;

-- 직원 테이블의 이름, 성, 연봉 컬럼과 연봉의 6%를 연산하여 'tax'라는 별명으로 조회
select FIRST_NAME, LAST_NAME, SALARY, round(SALARY * 0.06, 1) as 'tax' 
from employees;
