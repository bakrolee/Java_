/*	(참조 방향)
	부서 -- employees.department_id -> departments.department_id
	직책 -- employees.job_id -> job.job_id
    매니저 -- departments.MANAGER_ID -> employees.employee_id 참조
*/
-- 1. 모든 부서의 부서명과 관리자의 이름 조회
SELECT A.DEPARTMENT_NAME, A.MANAGER_ID, B.MANAGER_ID, B.FIRST_NAME, B.LAST_NAME FROM departments As A
JOIN employees AS B ON A.Manager_ID = B.Manager_ID;

-- 2. 부서명이 IT로 시작하는 부서명과 근무하는 직원들의 이름 조회.
SELECT * FROM departments As A
JOIN employees AS Bjobs ON A.DEPARTMENT_ID = B.DEPARTMENT_ID
WHERE A.DEPARTMENT_NAME LIKE 'IT%';

-- 3. 모든 직원들의 이름과 직책(Job_Title) 조회
SELECT A.FIRST_NAME, A.LAST_NAME, B.JOB_TITLE FROM employees As A
JOIN jobs AS B ON A.JOB_ID = B.JOB_ID;

-- 4. 직원의 해당 직책의 jobs테이블에 책정된 최대 연봉(Max_Salary)을 초과한 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
SELECT A.FIRST_NAME, A.LAST_NAME, A.SALARY, B.Max_Salary FROM employees As A
JOIN jobs AS B ON A.JOB_ID = B.JOB_ID
WHERE A.SALARY < B.MAX_SALARY;

-- 5. 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명.
SELECT A.FIRST_NAME, A.LAST_NAME, B.DEPARTMENT_NAME, D.country_ID FROM employees As A
JOIN departments As B ON A.DEPARTMENT_ID = B.DEPARTMENT_ID
LEFT JOIN locations AS C ON B.location_ID = C.location_ID
LEFT JOIN countries As D ON C.Country_id = D.COUNTRY_ID
WHERE C.COUNTRY_ID = 'US';

