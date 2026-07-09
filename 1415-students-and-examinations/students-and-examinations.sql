with counting as (
    select e.student_id as id,e.subject_name as subs,count(e.subject_name) as counts
    from examinations as e
    group by id,subs
), joined_table as (
    select s.student_id as id,s.student_name as name,sb.subject_name as subs
    from students as s
    cross join subjects as sb
    order by id,subs
)

select j.id as student_id,j.name as student_name,j.subs as subject_name,IFNULL(c.counts,0) as attended_exams
from joined_table as j
left join counting as c
on c.id=j.id and c.subs=j.subs
order by student_id,subject_name;