with countings as (
    select book_id,count(record_id) as nums
    from borrowing_records
    where return_date is null
    group by book_id
)

select l.book_id,l.title,l.author,l.genre,l.publication_year,c.nums as current_borrowers 
from library_books as l
right join countings as c
on c.book_id=l.book_id
where c.nums=l.total_copies
order by current_borrowers DESC,l.title ASC;
