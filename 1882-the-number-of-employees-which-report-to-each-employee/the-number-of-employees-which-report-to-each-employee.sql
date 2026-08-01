with joining as (
    select e1.employee_id,e1.name as names,e2.name,e2.age
    from employees as e1
    join employees as e2
    on e1.employee_id=e2.reports_to
)
select employee_id,names as name,count(name) as reports_count,ROUND(AVG(age)) as average_age
from joining
group by employee_id,names
order by employee_id;