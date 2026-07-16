# Write your MySQL query statement below
with orderings as (
    select c.id as id,c.name as name,o.customerId as cid
    from customers as c 
    left join orders as o
    on c.id=o.customerId
)

select name as customers 
from orderings 
where cid is null;