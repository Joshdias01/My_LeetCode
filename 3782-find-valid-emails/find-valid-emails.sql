select * from users 
where email REGEXP '^[0-9a-zA-Z_]+@[a-zA-Z]+\\.com$'
order by user_id;