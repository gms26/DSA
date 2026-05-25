-- Last updated: 5/25/2026, 11:11:21 AM
# Write your MySQL query statement below
select score,dense_rank() over(order by score desc)as 'rank' from scores;