use hr;
-- hr 부서(departments) 테이블 모든 행과 열 조회
select * from departments;

-- 부서 명이 'it%'로 시작하는 부서들 조회
select * from departments where department_name LIKE 'it%';

-- 직원 테이블에서 it 부서에서 근무하는 직원 조회
select * from employees where department_id in 
	(select department_id from departments where department_name LIKE 'it%'); -- 서브쿼리.

-- 연봉을 내림차순 정렬 
-- 연봉 탑 10인데, 연봉을 오름차순으로 보고싶음
select * from (
	select * from employees order by salary desc limit 10
) as A -- 별명은 무조건 있어야 함. (없으면 에러)
order by salary asc;

-- 
select (select 1 + 1), 2, 3, 4;

-- David Austin의 연봉과 같은 연봉을 받는 직원들 조회
select * from employees where salary = (
	select salary from employees where first_name = 'David' AND last_name = 'Austin'
);
