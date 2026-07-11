# Write your MySQL query statement below
with quality as(
    select query_name,IFNULL(ROUND((SUM(rating/position))/count(position),2),0) as quality,count(rating) as counts
    from queries
    group by query_name
),poor as (
    select q.query_name as name,IFNULL(ROUND((count(q.rating)/qq.counts)*100,2),0) as poor_perc
    from queries as q
    left join quality as qq
    on q.query_name=qq.query_name
    where q.rating<3
    group by q.query_name 
)

select qr.query_name as query_name,IFNULL(q.quality,0) as quality,
IFNULL(p.poor_perc,0) as poor_query_percentage
from queries as qr
left join quality as q
on qr.query_name=q.query_name
left join poor as p
on qr.query_name=p.name
group by query_name;