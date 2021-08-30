# 1
>actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
```SQL
(
SELECT first_name FROM actor
)
UNION
(
SELECT first_name FROM customer
)
-- 647 satır döner.
```

# 2
>actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
```SQL
(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name FROM customer
)
-- 72 satır döner.
```

# 3
>actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
```SQL
(
SELECT first_name FROM actor
)
EXCEPT
(
SELECT first_name FROM customer
)
-- 56 satır döner.
```

# 4
>İlk 3 sorguyu tekrar eden veriler için de yapalım.
```SQL
(
SELECT first_name FROM actor
)
UNION ALL
(
SELECT first_name FROM customer
)
-- 799 satır döner.

(
SELECT first_name FROM actor
)
INTERSECT ALL
(
SELECT first_name FROM customer
)
-- 72 satır döner.

(
SELECT first_name FROM actor
)
EXCEPT ALL
(
SELECT first_name FROM customer
)
-- 128 satır döner.
```