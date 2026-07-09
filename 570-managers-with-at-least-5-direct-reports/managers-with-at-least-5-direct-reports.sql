# Write your MySQL query statement below
with counts as (
    select managerId,count(managerId) as counting
    from employee
    group by managerId
)

select e.name as name
from employee as e
join counts as c
on c.managerId=e.id
where c.counting>=5;