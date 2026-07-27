with sums as(
    select user_id,sum(distance) as tots
    from rides 
    group by user_id
)

select u.name as name,IFNULL(s.tots,0) as travelled_distance
from users as u
left join sums as s
on u.id=s.user_id
order by travelled_distance DESC,name ASC;