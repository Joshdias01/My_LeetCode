with joinings as (
    select n.num as nums,count(nm.num) as cnt
    from MyNumbers as n
    left join MyNumbers as nm
    on n.num=nm.num
    group by nums
)
select MAX(nums) as num
from joinings 
where cnt=1;