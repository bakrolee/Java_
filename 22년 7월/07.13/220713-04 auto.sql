create table books (
	bookId INT primary key auto_increment
    , title varchar(30)
    , price int
);

desc books;

insert into books (title, price) values ("책1", 2000), ("책2", 3000), ("중복이름", 2500), ("중복이름", 3000);
delete from books where bookid = 3;
insert into books (title, price) values ("새로운이름", 3500);

select * from books;
drop table books;

