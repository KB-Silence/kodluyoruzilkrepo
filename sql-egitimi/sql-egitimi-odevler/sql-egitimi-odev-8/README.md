# 1
>**test** veritabanınızda **employee** isimli sütun bilgileri **id(INTEGER)**, **name VARCHAR(50)**, **birthday DATE**, **email VARCHAR(100)** olan bir tablo oluşturalım.
```SQL
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	email VARCHAR(100),
	birthday DATE
)
```

# 2
>Oluşturduğumuz **employee** tablosuna **'Mockaroo'** servisini kullanarak 50 adet veri ekleyelim.
<details>
<summary>INSERT Queries</summary>
<br>
<pre>
insert into employee (name, email, birthday) values ('Holt', 'hbatterton0@ow.ly', null);
insert into employee (name, email, birthday) values ('Kaye', 'kpetracchi1@wix.com', '1986-11-03');
insert into employee (name, email, birthday) values ('Sebastien', 'slintott2@w3.org', null);
insert into employee (name, email, birthday) values ('Levy', 'lhanmore3@nsw.gov.au', '1985-06-09');
insert into employee (name, email, birthday) values ('Delores', 'dland4@google.co.uk', null);
insert into employee (name, email, birthday) values ('Radcliffe', 'resmead5@discovery.com', null);
insert into employee (name, email, birthday) values ('Barrie', 'bslocket6@jigsy.com', '1973-02-05');
insert into employee (name, email, birthday) values ('Desdemona', 'dmartonfi7@soup.io', '1999-03-04');
insert into employee (name, email, birthday) values ('Sophi', null, '2006-11-21');
insert into employee (name, email, birthday) values ('Augie', 'akynnd9@mysql.com', null);
insert into employee (name, email, birthday) values ('Dannie', null, '1979-03-07');
insert into employee (name, email, birthday) values ('Shaun', 'shimsworthb@discuz.net', null);
insert into employee (name, email, birthday) values ('Bethena', 'bdoidgec@1688.com', '1960-03-30');
insert into employee (name, email, birthday) values ('Fran', 'fdustingd@1688.com', '1958-07-30');
insert into employee (name, email, birthday) values ('Chadwick', 'ccrumleye@youtu.be', null);
insert into employee (name, email, birthday) values ('Zuzana', null, '1976-04-09');
insert into employee (name, email, birthday) values ('Giff', 'gmcrobbieg@cnet.com', null);
insert into employee (name, email, birthday) values ('Samuel', null, '2020-03-09');
insert into employee (name, email, birthday) values ('Ula', 'usissensi@ed.gov', null);
insert into employee (name, email, birthday) values ('Doroteya', null, null);
insert into employee (name, email, birthday) values ('Herschel', 'hbawdonk@businessweek.com', '1973-01-09');
insert into employee (name, email, birthday) values ('Burgess', 'bgallearl@google.com', null);
insert into employee (name, email, birthday) values ('Godfree', 'gcomminsm@nytimes.com', '2005-07-27');
insert into employee (name, email, birthday) values ('Jennifer', 'jdomangen@google.com', '1992-09-25');
insert into employee (name, email, birthday) values ('Aldric', 'asowteno@etsy.com', null);
insert into employee (name, email, birthday) values ('Birk', 'bburnsallp@meetup.com', '1983-01-23');
insert into employee (name, email, birthday) values ('Eden', 'elarchierq@tiny.cc', '1999-03-11');
insert into employee (name, email, birthday) values ('Serge', 'shadlowr@nature.com', '1978-08-19');
insert into employee (name, email, birthday) values ('Melinda', 'mberrisfords@mozilla.org', '1951-04-30');
insert into employee (name, email, birthday) values ('Emmery', 'efairnt@oakley.com', '2007-03-30');
insert into employee (name, email, birthday) values ('Sybila', null, null);
insert into employee (name, email, birthday) values ('Kylie', 'kjewsonv@fema.gov', '1951-07-22');
insert into employee (name, email, birthday) values ('Den', 'dwoodfinew@pbs.org', null);
insert into employee (name, email, birthday) values ('Grier', null, null);
insert into employee (name, email, birthday) values ('Aurilia', 'amaccraey@last.fm', null);
insert into employee (name, email, birthday) values ('Jilli', 'jcampaz@privacy.gov.au', '2019-09-15');
insert into employee (name, email, birthday) values ('Karena', 'kgiraudy10@fotki.com', null);
insert into employee (name, email, birthday) values ('Kirby', 'klefebre11@unesco.org', null);
insert into employee (name, email, birthday) values ('Ellwood', 'emonks12@archive.org', '2015-10-17');
insert into employee (name, email, birthday) values ('Maureene', 'movenden13@omniture.com', '2005-12-07');
insert into employee (name, email, birthday) values ('Eugenius', 'eclaussen14@artisteer.com', '1986-01-17');
insert into employee (name, email, birthday) values ('Beckie', 'bbenedikt15@mediafire.com', '2011-01-29');
insert into employee (name, email, birthday) values ('Diego', null, null);
insert into employee (name, email, birthday) values ('Karlyn', null, '2013-05-28');
insert into employee (name, email, birthday) values ('Vinnie', null, '1989-01-09');
insert into employee (name, email, birthday) values ('Monroe', 'mharriday19@mozilla.com', '1969-08-28');
insert into employee (name, email, birthday) values ('Celisse', 'cmckevitt1a@businesswire.com', null);
insert into employee (name, email, birthday) values ('Marlo', 'mstrettell1b@berkeley.edu', '1971-08-07');
insert into employee (name, email, birthday) values ('Yanaton', 'yhuccaby1c@yahoo.co.jp', '1971-02-22');
insert into employee (name, email, birthday) values ('Christen', null, '2014-12-21');
</pre>
</details>

# 3
>Sütunların her birine göre diğer sütunları güncelleyecek 5 adet **UPDATE** işlemi yapalım.
```SQL
UPDATE employee
SET name = 'Ahmet',
	email = 'ahmet@mail.com',
	birthday = '1980-05-15'
WHERE id = 9
RETURNING *

UPDATE employee
SET email = 'doroteya@ed.gov'
WHERE name = 'Doroteya'

UPDATE employee
SET birthday = '2000-01-01'
WHERE birthday IS NULL

UPDATE employee
SET name = 'MR. Employee'
WHERE name LIKE 'Au%'

UPDATE employee
SET name = 'Teacher',
	email = 'correctmail@gmail.com'
WHERE email LIKE '%@1688%'
```

# 4
>Sütunların her birine göre ilgili satırı silecek 5 adet **DELETE** işlemi yapalım.
```SQL
DELETE FROM employee WHERE id = 13

DELETE FROM employee WHERE name = 'Ahmet'

DELETE FROM employee WHERE email IS NULL

DELETE FROM employee WHERE birthday = '2000-01-01'

DELETE FROM employee WHERE email LIKE '%au'
```