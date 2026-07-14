# Write your MySQL query statement below
with min_year as(
    select product_id,min(year) as yr
    from sales 
    group by product_id
)

select m.product_id as product_id,m.yr as first_year,s.quantity as quantity,s.price as price
from min_year as m
join sales as s 
on m.product_id=s.product_id AND m.yr=s.year;