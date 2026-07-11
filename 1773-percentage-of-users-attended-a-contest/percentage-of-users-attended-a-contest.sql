# Write your MySQL query statement below
with countings as(
    select contest_id,count(user_id) as counts
    from register
    group by contest_id
),total as (
    select count(*) as totals from users
)

select c.contest_id as contest_id,ROUND((c.counts/t.totals)*100,2) as percentage 
from countings as c,total as t
order by percentage DESC,contest_id ASC;