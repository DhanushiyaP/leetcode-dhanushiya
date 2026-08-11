-- Last updated: 8/11/2026, 3:59:33 PM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;
