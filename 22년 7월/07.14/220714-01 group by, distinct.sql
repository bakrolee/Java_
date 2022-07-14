
-- 집계를 할 때 분류를 하기 = 같은 값을 가지는 행들끼리 그룹을 짓고, 그 그룹에 대해 집계할 수 있음.

-- 부서별로(그룹) 직원들의 인원 수
select DEPARTMENT_ID, count(*) from employees group by DEPARTMENT_ID;

-- 부서별 최고 연봉, 최저 연봉, 평균 연봉, 연봉 합
select DEPARTMENT_ID, max(salary), min(salary), avg(salary), sum(salary) from employees group by DEPARTMENT_ID;


-- 중복을 배제한 값을 볼 때
select JOB_ID, LAST_NAME from employees group by JOB_ID;
select distinct job_Id, last_Name from employees;

-- 직원 테이블 last_name을 중복 제거하고 조회
select distinct last_name from employees;

-- 직원 테이블 last_name 그룹 별로 인원 수 조회
select LAST_NAME, count(*) from employees group by LAST_NAME;

-- last_name 그룹의 카운트가 2 이상인 행들만 조회
select LAST_NAME, count(*) from employees group by LAST_NAME 
	HAVING count(*) > 1;
-- 위의 성을 가지는 직원 목록 조회
select * from employees where LAST_NAME in (
	select LAST_NAME from employees group by LAST_NAME 
	HAVING count(*) > 1
) order by LAST_NAME;

-- 연봉을 5번째로 적게 받는 직원들 목록
select * from employees 
where salary = (
	select distinct SALARY from employees order by salary limit 1 offset 4
);

-- 상위 연봉 50명에 대해서 부서별로 몇 명씩 있는지
select * from employees order by SALARY desc, FIRST_NAME asc limit 50;

select DEPARTMENT_ID, count(*) from 
(select * from employees order by SALARY desc, FIRST_NAME asc limit 50) as A
group by DEPARTMENT_ID;
