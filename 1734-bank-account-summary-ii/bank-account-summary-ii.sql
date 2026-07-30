with sums as(
    select account,sum(amount) as amt
    from transactions
    group by account
)

select u.name,s.amt as balance
from users as u
join sums as s
on u.account=s.account
where s.amt>10000;