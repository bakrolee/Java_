-- 각 직원들의 이름과 연봉, 평균연봉과의 차(연봉 - 평균연봉)를 조회
select First_name, salary, salary - (select avg(salary) from employees) as '평균연봉과 차' from employees;


-- 최고 연봉직원과 최저 연봉직원들의 이름을 조회
select FIRST_NAME from employees
where SALARY = (select max(SALARY) from employees) 
	OR SALARY = (select min(SALARY) from employees); 


-- 평균 연봉보다 높게 받는 직원 조회departments
select * from employees 
where salary > (select avg(salary) from employees);


-- 부서명이 IT로 시작하는 직원들의 수(카운트)를 조회
select count(*) 
	from employees
	where DEPARTMENT_ID in 
	(select DEPARTMENT_ID from departments where DEPARTMENT_NAME like 'it%');


-- Douglas Grant의 이메일을 'dog@naver.com'으로 변경
select * from employees where FIRST_NAME = 'Douglas' AND LAST_NAME = 'Grant';

update employees
set email = 'dog@naver.com'
where FIRST_NAME = 'Douglas' AND LAST_NAME = 'Grant';


-- Ellen Abel과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
select * from employees
where DEPARTMENT_ID = 
	(select DEPARTMENT_ID from employees where FIRST_NAME = 'Ellen' AND LAST_NAME = 'Abel')
order by SALARY desc;


-- 부서명이 IT로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 직원 목록을 연봉 오름차순으로 조회
select * from employees 
where salary > (
	select salary from employees where DEPARTMENT_ID in 
		(select DEPARTMENT_ID from departments where DEPARTMENT_NAME like 'it%')
		order by SALARY desc limit 1
	)
order by SALARY;


-- 자기가 속한 부서의 평균보다 많이 받는 직원
select distinct DEPARTMENT_ID from employees order by DEPARTMENT_ID;
-- 임의의 부서 평균 구하기
select avg(salary) from employees where DEPARTMENT_ID = '90';
-- 90부서에서 평균보다 많이 받는 직원 구하기
select * from employees 
where DEPARTMENT_ID = '90' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '10')
    OR DEPARTMENT_ID = '10' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '20')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '30')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '40')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '50')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '60')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '40')
    OR DEPARTMENT_ID = '20' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '40')
    OR DEPARTMENT_ID = '30' AND SALARY >= (select avg(salary) from employees where DEPARTMENT_ID = '50');


-- 부서 평균 연봉 나타내게 해보기
select avg(salary) from employees where DEPARTMENT_ID = '90';