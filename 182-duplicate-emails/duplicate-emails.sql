with counts as (
    select email,count(email) counting
    from person 
    group by email
)

select email as Email
from counts 
where counting>1;