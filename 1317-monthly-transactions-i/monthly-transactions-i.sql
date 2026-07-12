with total as(
    select country,DATE_FORMAT(trans_date,'%Y-%m') as month,count(*) as trans_count,SUM(amount) as tot from transactions
    group by country,month
),approve as (
    select country,DATE_FORMAT(trans_date,'%Y-%m') as month,count(*) as app_count,SUM(amount) as tot from transactions
    where state='approved'
    group by country,month
)

-- select * from approve;
select  t.month as month,t.country as country,t.trans_count as trans_count,IFNULL(a.app_count,0) as approved_count,
IFNULL(t.tot,0) as trans_total_amount, IFNULL(a.tot,0) as approved_total_amount 
from total as t
Left join approve as a
on t.month=a.month AND t.country <=> a.country;