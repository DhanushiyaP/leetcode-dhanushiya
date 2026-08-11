-- Last updated: 8/11/2026, 4:00:58 PM
# Write your MySQL query statement below
SELECT email as Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1