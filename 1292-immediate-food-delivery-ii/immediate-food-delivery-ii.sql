# Write your MySQL query statement below
with mins as(
    select customer_id as id,MIN(order_date) as datee
    from delivery
    group by customer_id
),imd as(
    select d.customer_id as id
    from delivery as d
    join mins as m
    on d.customer_id = m.id and d.order_date = m.datee
    where d.order_date=d.customer_pref_delivery_date
)

-- select count(id) from mins;
select ROUND(count(imd.id)*100/count(mins.id),2) as immediate_percentage
from mins
left join imd
on imd.id=mins.id;