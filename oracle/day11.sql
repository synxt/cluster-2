WITH SALARY_RANKS AS
(   
    SELECT EMPLOYEE_ID,SALARY,DEPARTMENT_ID, DENSE_RANK() OVER(PARTITION BY DEPARTMENT_ID ORDER BY SALARY DESC) as SAL_RANK
    FROM HR.EMPLOYEES
)
SELECT * FROM SALARY_RANKS WHERE SAL_RANK=1;

SELECT LPAD(' ',LEVEL*4)||EMPLOYEE_ID
FROM HR.EMPLOYEES
CONNECT BY PRIOR EMPLOYEE_ID = MANAGER_ID
START WITH EMPLOYEE_ID=101;