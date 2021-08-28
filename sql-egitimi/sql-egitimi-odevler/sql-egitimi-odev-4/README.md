# 1
> **film** tablosunda bulunan **replacement_cost** sütununda bulunan birbirinden farklı değerleri sıralayınız.
```SQL
SELECT DISTINCT replacement_cost from film
```

# 2
> **film** tablosunda bulunan **replacement_cost** sütununda birbirinden farklı kaç tane veri vardır?
```SQL
SELECT COUNT(DISTINCT replacement_cost) FROM film
```

# 3
> **film** tablosunda bulunan film isimlerinde **(title)** kaç tanesi T karakteri ile başlar ve aynı zamanda **rating** 'G' ye eşittir?
```SQL
SELECT COUNT(*) FROM film 
WHERE title LIKE 'T%'
AND rating = 'G'
```

# 4
> **country** tablosunda bulunan ülke isimlerinden **(country)** kaç tanesi 5 karakterden oluşmaktadır?
```SQL
SELECT COUNT(*) from country WHERE length(country) = 5
```

# 5
> **city** tablosundaki şehir isimlerinin kaçtanesi 'R' veya r karakteri ile biter?
```SQL
SELECT COUNT(*) FROM city WHERE city ILIKE '%R'
```