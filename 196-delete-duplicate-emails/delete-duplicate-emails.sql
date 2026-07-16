with ids as(
    select min(id) as id,email,count(email)
    from person 
    group by email
)

delete from person
where id not in (select id from ids);