# Write your MySQL query statement below
with avg_price as (
    select p.product_id as id,SUM(p.price*u.units) as total,sum(u.units) as sums
    from prices as p
    left join unitssold as u
    on p.product_id=u.product_id AND 
    u.purchase_date between p.start_date AND p.end_date
    group by id
)
select id as product_id,IFNULL(ROUND((total/sums),2),0) as average_price
from avg_price;