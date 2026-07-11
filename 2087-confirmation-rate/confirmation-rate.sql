# Write your MySQL query statement below
with total_counts as (
    select user_id,count(action) as action_count
    from confirmations
    group by user_id
),confirm_counts as (
    select user_id,count(action) as conf_count
    from confirmations 
    where action='confirmed'
    group by user_id
)
select s.user_id as user_id,
IFNULL(ROUND(IFNULL(cc.conf_count,0)/IFNULL(c.action_count,0),2),0) as confirmation_rate
from signups as s
left Join confirm_counts as cc
on s.user_id=cc.user_id
left join total_counts as c
on s.user_id=c.user_id;