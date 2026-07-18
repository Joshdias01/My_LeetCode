select *,
Case when x+y>z AND y+z>x AND z+x>y then 'Yes'
     else 'No'
End as triangle 
from triangle;