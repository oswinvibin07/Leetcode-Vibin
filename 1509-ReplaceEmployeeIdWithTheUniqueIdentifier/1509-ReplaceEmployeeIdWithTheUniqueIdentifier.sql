-- Last updated: 8/11/2026, 2:52:33 PM
# Write your MySQL query statement below
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;