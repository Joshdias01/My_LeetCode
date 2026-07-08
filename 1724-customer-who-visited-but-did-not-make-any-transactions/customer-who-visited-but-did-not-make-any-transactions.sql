# Write your MySQL query statement below
with trans_count as (
    select visit_id,count(transaction_id) as counts
    from transactions
    group by visit_id
),trans as (
    select v.visit_id as vis_id,v.customer_id as cust_id,t.counts as counts
    from visits as v
    left join trans_count as t
    on v.visit_id=t.visit_id
    where counts is null
)
select cust_id as customer_id,count(IFNULL(counts,0)) as count_no_trans
from trans
group by customer_id;