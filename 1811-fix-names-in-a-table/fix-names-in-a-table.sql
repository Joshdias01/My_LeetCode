with lowers as (select user_id,LOWER(name) as namee from users )

select user_id,CONCAT(UPPER(SUBSTRING(namee,1,1)),SUBSTRING(namee,2,LENGTH(namee))) as name
from lowers
order by user_id;