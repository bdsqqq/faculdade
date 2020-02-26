SELECT FROM HR.EMPLOYEES WHERE SALARY BETWEEN 1000 AND 2000;
SELECT DEPARTMENT_NAME, DEPARTMENT_ID FROM HR.DEPARTMENTS ORDER BY DEPARTMENT_NAME;
SELECT distinct JOB_ID, JOB_TITLE FROM HR.JOBS;
SELECT FROM HR.EMPLOYEES WHERE DEPARTMENT_ID IN (10,20) ORDER BY FIRST_NAME;
SELECT FIRST_NAME,JOB_ID FROM HR.EMPLOYEES WHERE JOB_ID LIKE '%CLERK%' AND DEPARTMENT_ID in (50);
SELECT FIRST_NAME FROM HR.EMPLOYEES WHERE FIRST_NAME LIKE '%th%' OR FIRST_NAME LIKE '%ll%';
SELECT FIRST_NAME, JOB_ID, SALARY FROM HR.EMPLOYEES WHERE MANAGER_ID IS NOT NULL;