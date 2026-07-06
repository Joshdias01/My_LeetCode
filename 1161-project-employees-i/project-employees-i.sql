with avg_sal AS(
    select p.project_id as ids,COUNT(p.project_id) as counts,SUM(e.experience_years) as sums
    from Project AS p
    inner join Employee AS e
    ON p.employee_id=e.employee_id
    group by p.project_id
)
select ids as project_id,ROUND(sums/counts,2) as average_years 
from avg_sal;