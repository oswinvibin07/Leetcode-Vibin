-- Last updated: 8/11/2026, 2:52:25 PM
# Write your MySQL query statement below
select sell_date, count( DISTINCT product ) as num_sold ,
GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products
FROM Activities 
GROUP BY sell_date 
order by sell_date ASC;