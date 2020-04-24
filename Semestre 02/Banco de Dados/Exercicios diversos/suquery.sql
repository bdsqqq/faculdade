SELECT FIRST_NAME, HIRE_DATE,JOB_ID, DEPARTMENT_ID
FROM HR.EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                        FROM HR.EMPLOYEES 
                        WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King');
                        
SELECT FIRST_NAME, DEPARTMENT_ID, JOB_ID
FROM HR.EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM HR.DEPARTMENTS
                        WHERE LOCATION_ID = (SELECT LOCATION_ID FROM HR.LOCATIONS
                                                        WHERE CITY = 'São Paulo'));
                                                        
SELECT DEPARTMENT_ID, FIRST_NAME, JOB_ID
FROM HR.EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM HR.DEPARTMENTS
                        WHERE DEPARTMENT_NAME = 'Sales');
                        
SELECT FIRST_NAME, JOB_ID, SALARY
FROM HR.EMPLOYEES
WHERE SALARY > (SELECT AVG(SALARY) FROM HR.EMPLOYEES)
ORDER BY SALARY;

SELECT FIRST_NAME, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM HR.EMPLOYEES
WHERE SALARY < (SELECT AVG(SALARY) FROM HR.EMPLOYEES
                  WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                        FROM HR.EMPLOYEES 
                        WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King'))
                        ORDER BY SALARY;