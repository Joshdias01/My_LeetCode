with counts as (
    select date_id,make_name,count(DISTINCT lead_id) as counti
    from DailySales
    group by date_id,make_name
),partners as (
    select date_id,make_name,count(DISTINCT partner_id) as counts
    from DailySales
    group by date_id,make_name
)

select c.date_id,c.make_name,IFNULL(c.counti,0) as unique_leads,IFNULL(p.counts,0) as unique_partners
from counts as c
join partners as p
on c.date_id=p.date_id AND c.make_name=p.make_name;