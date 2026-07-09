# Write your MySQL query statement below
with averg as (
    select a1.machine_id as id,a1.process_id as proc,avg(a2.timestamp-a1.timestamp) as aver
    from activity as a1
    join activity as a2
    on a1.machine_id=a2.machine_id And a1.process_id=a2.process_id AND a1.activity_type='start' And a2.activity_type='end'
    group by id,proc
)

select id as machine_id,ROUND(avg(aver),3) as processing_time
from averg
group by id;