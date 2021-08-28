# 1
> **film** tablosunda bulunan tüm sütunlardaki verileri **replacement_cost** değeri 12.99 dan **büyük eşit** ve 16.99 **küçük** olma koşuluyla sıralayınız ( **BETWEEN - AND** yapısını kullanınız.)
```SQL
-- 16.99'dan küçük.
SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.98

-- YA DA

SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99
-- 16.99'dan küçük eşit
```

# 2
> **actor** tablosunda bulunan **first_name** ve **last_name** sütunlardaki verileri **first_name 'Penelope'** veya **'Nick'** veya **'Ed'** değerleri olması koşuluyla sıralayınız. ( **IN** operatörünü kullanınız.)
```SQL
SELECT first_name, last_name FROM actor
WHERE first_name IN ('Penelope', 'Nick', 'Ed')
```
# 3
> **film** tablosunda bulunan tüm sütunlardaki verileri **rental_rate** 0.99, 2.99, 4.99 **VE** **replacement_cost** 12.99, 15.99, 28.99 olma koşullarıyla sıralayınız. (**IN** operatörünü kullanınız.)
```SQL
SELECT * FROM film
WHERE rental_rate IN (0.99, 2.99, 4.99) 
AND replacement_cost IN (12.99, 15.99, 28.99)
```