with sals as (
    select e1.id,e1.name as emp,e1.salary as sal,e2.salary as sala
    from employee as e1
    join employee as e2
    on e1.managerId=e2.id
)

select emp as Employee
from sals
where sal>sala;