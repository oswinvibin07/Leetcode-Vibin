-- Last updated: 8/11/2026, 2:54:42 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee AS e 
INNER JOIN Employee AS m ON e.id=m.managerId 
GROUP BY m.managerId 
HAVING COUNT(m.managerId) >= 5