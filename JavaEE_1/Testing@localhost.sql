# create procedure countBooks (out count int)
# begin
#   select count(*) from books;
# end

# create procedure getBooks(in bookId int)
#   begin
#     select * from books where id = bookId;
#   end;

create procedure getCount()
  begin
    select count(*) from users;
    select count(*) from books;
  end