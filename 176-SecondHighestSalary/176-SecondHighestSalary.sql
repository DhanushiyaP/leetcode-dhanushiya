-- Last updated: 8/11/2026, 4:01:03 PM
# Write your MySQL query statement below
SELECT 
    MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < 
    (SELECT  MAX(salary) FROM Employee
);





