with counts as (
    select activity_date as day,count(DISTINCT user_id) as active_users
    from activity
    where DATEDIFF('2019-07-27',activity_date) between 0 AND 29
    group by activity_date
)

select * from counts;