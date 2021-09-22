# KAYNAK
## **[patika.dev](https://app.patika.dev/)**

<br/>

## Patika.dev - SQL eğitimi kapsamındaki içeriklere göre hazırlanmıştır.  
> Ufak düzeyde değişiklikler ve düzenlemeler yapıldı.
<br/>

---
## **Başlıklar**
- [SQL Nedir?](#sql-structered-query-language-nedir)
- [Data(Veri) Nedir?](#dataveri-nedir)
- [Database(Veritabanı)Nedir?](#databaseveritabanı-nedir)
- [Database Management System(DBMS) Nedir?](#database-management-systemdbms-nedir)
- [İlişkisel Veritabanı Yönetim Sistemleri(RDBMS)](#i̇lişkisel-veritabanı-yönetim-sistemleri)
- [Query(Sorgu)](#querysorgu)
  - [Select](#select)
  - [Where](#where)
- [Karşılaştırma Operatörleri](#karşılaştırma-operatörleri)
- [Mantıksal Operatörler](#mantıksal-operatörler)
- [LIKE ve ILIKE](#like)
-[Aggregate Fonksiyonlar](#aggregate-fonksiyonlar)
- [Terminalde PSQL Kullanımı](#terminalde-psql-kullanımı)
- [ORDER BY](#order-by)
- [GROUP BY](#group-by)
  - [HAVING](#having)
- [LIMIT](#limit)
- [OFFSET](#offset)
- [ALIAS](#alias-as)
- [Tablo Yönetimi](#tablo-yönetimi)
  - [Tablo Oluşturma](#tablo-oluşturmak)
  - [Tablo Silme](#tablo-silmek)
- [INSERT](#insert)
- [UPDATE](#update)
- [DELETE](#delete)
- [PRIMARY KEY](#primary-key)
- [FOREIGN KEY](#foreign-key)
- [Veri Tipleri](#veri-tipleri)
  - [Sayısal Veri Tipleri](#sayısal-veri-tipleri)
  - [Karakter Veri Tipleri](#karakter-veri-tipleri)
  - [Boolean Veri Tipleri](#boolean-veri-tipi)
  - [Zaman/Tarih Veri Tipleri](#zaman--tari̇h-veri-tipleri)
- [NOT NULL](#not-null)
  - [Alter ve NOT NULL](#alter-ve-not-null)
- [UNIQUE](#unique)
  - [Alter ve UNIQUE](#alter-ve-unique)
- [CHECK](#check)
  - [ALTER ve CHECK](#alter-ve-check)
- [JOIN KAVRAMI (Birleştirme)](#join-kavrami-birleştirme)
  - [INNER JOIN](#inner-join)
  - [LEFT JOIN](#left-join)
  - [RIGHT JOIN](#right-join)
  - [FULL JOIN](#full-join)
- [UNION](#union)
- [INTERSECT](#intersect)
- [EXCEPT](#except)
- [SUBQUERIES](#subqueries-alt-sorgular)
  - [ANY](#any)
  - [ALL](#all)
---
<br/><br/><br/>

# SQL *(Structered Query Language)* Nedir?
SQL, verileri yönetmek ve tasarlamak için kulalnılan bir dildir. SQL, veritabanı yönetim sisteleri ile ilişki kurmayı sağlayacan declarative yani bildirimsel bir 4.nesil programlama dilidir.  
Türkçe ifadesiyle Yapılandırılmış Sorgu Dili anlamına gelmektedir. SQL sayesinde verilerin bulunduğu veritabanı ile iletişime geçilir.

## **ÖRNEK SQL Sorgusu**
```SQL
SELECT title FROM book WHERE page_number > 200;
```
SQL'in, ***DBMS(Database Management System)*** ile nasıl çalıştığının, arka planda ne tür işlemler döndüğünün bizim açımızdan pek önemi yoktur. Bundan dolayı SQL **declarative** yani bildirimsel, beyan edici bir yaklaşıma sahiptir. 

<br/>

# Data(Veri) Nedir?
Ölçüm, sayım, deney, gözlem veya araştırma sonucuyla elde edilen ham bilgilerdir.

<br/>

# Database(Veritabanı) Nedir?
Verilerin organize bir şekilde depolanmasını ve belirli işlemlerle modifiye edilmesini sağlayan sistemlerdir.

### **Düzenli verilere sahip olursak**;
- İleriye yönelik geliştirici kararlar verebiliriz.
- Hatalarımızı daha kolay çözeriz.
- Geleceğe yönelik başarılı tahminlerde bulunabiliriz.

Örneğin, EXCEL benzeri yazılımlar sayesinde verilerimizi saklayabiliriz. Neden bir veritabanına ihtiyaç duyalım?

### Veritabanı sayesinde;
- Sütunlarda bulunacak verilerin aynı veri tipinde olmasını garanti ederiz.
- Çok büyük boyutlu veri kümeleriyle daha kolay çalışırız.
- Çoklu kullanıcı verilerini daha kolay yönetiriz.
- Başka yazılım ve uygulamalarla daha kolay çalışırız.

<br/>

# Database Management System(DBMS) Nedir?
Veritabanı verilerimizi organize bir şekilde depolamamızı sağlayan yapılardır. Veritabanımızı oluşturmamızı, yönetmemizi ve SQL yardımıyla gerekli gördüğümüz sorguları oluşturmamızı sağlayan yazılımlara Database Management System(DBMS) adı verilir. SQL sorguları sayesinde veritabanı üzerinde yapmak istediğimiz işlemleri, veritabanı yönetim sistemi yazılımı aracaılığıyla yaparız.
<br/>
Farklı ihtiyaçlara göre çeşitli veritabanı yönetim sistemleri bulunur.

### Temel Veritabanı Yönetim Sistemleri;
- Hiyerarşik Veritabanı
- Ağ Veritabanı
- İlişkisel Veritabanı(RDBMS)
- Nesneye Yönelik Veritabanı

<br/>

# İlişkisel Veritabanı Yönetim Sistemleri
İlişkisel veritabanı yönetim sistemlerinde veriler satır ve sütunlardan oluşan tablolarda tutulur. Her sütunda aynı tür verilerin tutulması sebebiyle yüksek bir veri tutarlılığına sahiptir.

### Bazı Popüler Veritabanı Yönetim Sistemleri;
- Oracle
- Microsoft SQL
- IBM DB2
- Informix
- MySQL
- mongoDB
- PostgreSQL

# Query(Sorgu)
SQL komutlarını içeren sorgu cümleleridir. SQL komutlarının büyük-küçük harf duyarlılıkları(Case Insensitive) yoktur.

<br/>

# SELECT
SELECT en çok kullanılan SQL komutudur ve veritabanında belirtilen sütunlardaki verileri çekmemizi sağlar. Ayrıca SELECT komutunu çoğunlukla diğer SQL komutlarıyla birlikte kullanırız.

## **SELECT Söz Dizimi**
```SQL
SELECT column_name, column_name FROM table_name;
```
Eğer tüm sütunlardaki verileri çekmek istersek ***asteriks***(*) karakterini kullanırız.
```SQL
SELECT * FROM table_name;
```

# WHERE
Çoğu durumda verilerin tamamını değil belirli koşulları sağlayan verileri görmek isteriz. Bunun için WHERE anahtar kelimesini kullanırız.

### WHERE Söz Dizimi
```SQL
SELECT column_name, column_name FROM table_name WHERE condition
```

<br/>

## **Karşılaştırma Operatörleri**
Operatör    |   Açıklama    | Operatör  | Açıklama
--------    |   --------    | --------  | --------
**<**       | Küçüktür      | **<=**    | Küçük Eşit
**>**       | Büyüktür      | **>=**    | Büyük Eşit
**<>**      | Eşit Değil    | **!=**    | Eşit Değil
**=**       | Eşit
<br/>

## **Mantıksal Operatörler**
Çoğu durumda birden fazla koşulu gerçekleştirmek isteriz bunun için mantıksal operatörlerden faydalanırız.

## **AND (Ve)**
Veri gelmesi için AND operatörünün sağına ve soluna yazılan koşulların ikisinin de TRUE sonuç döndürmesi gerekiyor. Eğer koşullardan bir tanesi TRUE diğeri FALSE sonuç dönerse işlem FALSE olur ve veri getirilmez.
```SQL
SELECT * FROM table_name WHERE condition AND condition
```

## **OR (Veya)**
Veri gelmesi için OR operatörünün sağına ve soluna yazılan koşulların bir tanesinden TRUE sonuç dönmesi gerekmekte. Eğer koşullardan bir tanesi TRUE diğeri FALSE sonuç dönerse işlem TRUE olur ve veri getirilir.
```SQL
SELECT * FROM table_name WHERE condition OR condition
```

## **BETWEEN AND**
Girilen 2 değer arasındaki verileri (girilen değerler dahil) getirmek için kullanılır.
```SQL
SELECT * FROM table_name WHERE column_name BETWEEN value AND value
```

## **IN**
Çok fazla değere göre sorgulama yapmak istiyorsak, istenilen değerli liste haline getirip IN operatörü ile kullanabiliriz.
```SQL
SELECT column_name, column_name, ... FROM table_name
WHERE column_name IN (value1, value2, value3 ...)
```

# **LIKE**
Bazı durumlarda tam eşleşme değil, belirli şablonlara uyan koşulların sağlanmasını isteyebiliriz. Örneğin; first_name sütununa göre sorgu hazırlarken tam değeri yazmak yerine ilk harfin ne olacağını belirtiriz ve karakter tutucu operatörü ekleriz. Bu gibi durumlarda LIKE operatörünü kullanırız.

```SQL
SELECT column_name, column_name ... FROM table_name
WHERE condition_column_name LIKE 'P%'
```
>***Bu kullanımda belirtilen kolondan P ile başlayan veriler getirilir.***

>***ILIKE operatörü ise, LIKE operatörünün case insensitive versiyonudur. LIKE operatörünün büyük-küçük harf duyarlılığı vardır, ILIKE operatöründe bu duyarlılık yoktur.***

```JAVA
// C karakteri temsil ediyor. Herhangi bir karakter veya birden fazla karakter kullanılabilir.

'C%' -> % işareti değerin sonunda yer alıyorsa, değerden sonra ya herhangi bir karakter yoktur ya da bir veya birden fazla karakter için yer tutucu görevi görür.

'%c' -> % işareti değerin başında yer alıyorsa, değerden önce ya herhangi bir karakter yoktur ya da bir veya birden fazla karakter için yer tutucu görevi görür.

'C%c' -> % işareti 2 değerin ortasında yer alıyorsa, iki taraf için de bir veya birden fazla karakter için yer tutucu görevi görür.

// Eğer sorguda sadece bir karakter için yer tutmak istiyorsak _(underscore) karakterini kullanırız.
```
> " ~~ " çift tilda karakteri **LIKE**,  
> " ~~* " çift tilda ve asteriks karakterlerinin birleşimi ise **ILIKE** ifadelerini temsil eder.

<br/>

# Aggregate Fonksiyonlar
Aggregate fonksiyonlar yardımıyla veri kümelerimiz üzerinde işlemler yapabilir ve bu işlemlerden sonuçlar çıkarabiliriz.
    
- Bir veritabanında toplam kaç kullanıcı var?
- Bir veritabanındaki filmleri ortalama uzunluğu nedir?

gibi belirli veri kümelerinden tek bir sonuç çıkarmak için aggregate fonksiyonları kullanırız.
## **Bazı Aggregate Fonksiyonlar**
- AVG -> Sayısal değerlerden oluşan sütunun ortalama değerini gösterir.
- SUM -> Sayısal değerlerden oluşan sütunda bulunan verilerin hepsini toplar ve toplam sonucu gösterir.
- MAX -> Sütundaki maksimum değeri gösterir.
- MIN -> Sütundaki minimum değeri gösterir.
> **Max ve Min fonksiyonlarının kullanıldığı sütun metinsel değerlerden oluşuyorsa alfabetik sıraya göre maksimum ve minimum değerleri gösterir.**  
> 
> **Max -> Maksimum değer olarak Z'yi baz alır.**  
> **Min -> Minimum değer olarak A'yı baz alır.**

## **DISTINCT**
Çoğu durumda aynı sütun içerisinde birbirinin aynı, birbrini tekrar eden veriler ile karşılaşabiliriz. Bu gibi durumlarda bir sütun içerisinde bulunan farklı değerleri görmek için DISTINCT anahtar kelimesini kullanırız.

```SQL
SELECT DISTINCT column_name FROM table_name
```

## **COUNT**
COUNT aggregate fonksiyonu ilgili sorgu sonucunda oluşan veri sayısını bildirir. Yani normal bir SELECT sorgusu ya da WHERE ile koşullu bir sorgu gerçekleştirdiğimizde kaç tane veri geldiğini öğrenmek için COUNT fonksiyonunu kullanabiliriz.

```SQL
SELECT COUNT(*) FROM table_name WHERE condition
```

<br/>

# Terminalde PSQL Kullanımı
## **PSQL ile PostgreSQL'e Bağlanma**
```powershell
psql -U username

Default kullanıcı adı 'postgres' olarak gelir.

psql -U postgres
```
## **host, port, kullanıcı adı ve veritabanı ismi ile bağlanmak**
```powershell
psql -h host_name -p port -U <username> <db_name>
```

## **Veritabanlarını listelemek**
```powershell
\l
        veya
\list
```

## **Veritabanlarına bağlanmak**
```powershell
\c DB_name
                    veya
\connect DB_name
```

## **Veritabanındaki tabloları listelemek**
```powershell
\dt
```

## **Bir tablonun sütunlarını ve tablo detaylarını görmek**
```powershell
\dt table_name
                    ve
\d+ table_name
```

## **Yeni veritabanı oluşturmak**
```SQL
CREATE DATABASE db_name
```

## **Yeni tablo oluşturmak**
```SQL
CREATE TABLE table_name (
    <column_name> <data_type> <constraint>
    ...
)
```
## **Tablodaki sütun ismini değiştirmek**
```SQL
ALTER TABLE table_name RENAME COLUMN column_name TO new_column_name
```

## **Sütuna UNIQUE kısıtlaması eklemek**
```SQL
ALTER TABLE table_name ADD CONSTRAINT constraint_name UNIQUE(column_name)
```

>Terminal ekranında oluşturulan sorguların bittiğini belirtmek için sonuna ';' koymak zorunludur.  
PSQL terminal ekranında çıkmak için CTRL + C kombinasyonunu veya \q komutunu kullanabilirsiniz.

# ORDER BY
ORBER BY anahtar kelimesi sayesinde herhangi bir sütunda bulunan değerlere göre artan veya azalan şekilde sıralama yapabiliriz.
> A'dan Z'ye | Z'den A'ya  
> ya da  
> 0'dan 9'a | 9'dan 0'a

```SQL
SELECT column_name, column_name ... FROM table_name
ORDER BY column_name ASC/DESC

-- ASC veya DESC diye belirtmediğimiz durumda default olarak ASC yani artan şekilde sıralar.

-- Sıralama birden fazla sütuna göre de yapılabilir.

SELECT * FROM table_name WHERE condition
ORDER BY column_name ASC, column_name DESC
```

# GROUP BY
Aynı değerlere sahip verileri gruplamamızı sağlar. GROUP BY komutu verileri bir veya daha fazla sütunla gruplamak için aggregate fonksiyonları kullanır. 

> (COUNT, MAX, MIN, AVG, SUM)
```SQL
SELECT column_name(s) FROM table_name
GROUP BY column_name(s)
```

# HAVING
HAVING sadece GROUP BY anahtar kelimesiyle birlikte kullanılır. İşlevi WHERE ile aynı denilebilir. Gruplama yaptığımız verilere WHERE ifadesi ile koşul belirtemediğimiz için HAVING ifadesine ihtiyaç duyarız.
```SQL
SELECT column_name(s) FROM table_name 
GROUP by column_name(s) 
HAVING condition
```

# LIMIT
Bazı durumlarda koşulları sağlayan verilerin tamamını değil belirli bir sayı kadar sıralamak isteriz, bunun için LIMIT anahtar kelimesini kullanırız.

```SQL
SELECT column_name, column_name FROM table_name
LIMIT value

-- value sayısal bir değer olmalıdır.
```

# OFFSET
Bazı durumlarda sonuç olarak gördüğümüz eri grubu içerisinden bazılarını "pass" geçmek isteyebiliriz. Bu durumda OFFSET anahtar kelimesini kullanabiliriz.

```SQL
SELECT column_name, column_name FROM table_name
OFFSET value
-- value sayısal bir değer olmalıdır.
```

# ALIAS (AS)
ALIAS ifadesi ile uzun ve kullanımı zor olan tablo veya alan adlarına geçici olarak kısa isimler(takma isimler) vererek bu alanları/tabloları daha kolay kullanabiliriz. Böylece mevcut tablo yapısını bozmadan anlık olarak belirlediğimiz isimleri kullanabiliriz.
    Geçici isimlendirme yaparken Türkçe karakter kullanılmamalıdır.

```SQL
SELECT column_name AS alias FROM table_name AS alias
-------------------------------------------
SELECT first_name AS f FROM customers AS c
```
# Tablo Yönetimi
## Tablo Oluşturmak
SQL ile yeni bir tablo oluşturmak için CREATE anahtar kelimesi kullanılır. Sütunlara verilecek isim, sütunların veri tipi ve varsa sütunlarda bulunacak kısıtlama yapıları CREATE ile belirlenebilir.

```SQL
CREATE TABLE table_name (
    <column_name> <data_type> <constraint>
    ...
    <column_name> <data_type> <constraint>
)
```

## Tablo Silmek
Oluşturulan tabloyu DROP anahtar kelimesi ile silebiliriz.
```SQL
DROP TABLE table_name
```

# INSERT
Anahtar kelimesi ile tabloya yeni veriler ekleyebiliriz.
```SQL
INSERT INTO table_name (column_name, column_name ...)
VALUES (value1, value2, ...)
```

# UPDATE
Anahtar kelimesi ile tabloda bulunan verileri güncelleyebiliriz.
```SQL
UPDATE table_name
SET column_name = value,
    column_name = value,
    ...
WHERE condition

-- WHERE ile koşul belirtmeden UPDATE sorgusunu çalıştırırsanız belirttiğiniz sütunlardaki bütün verileri günceller.
```

# DELETE
Anahtar kelimesi ile tabloda bulunan verileri silebiliriz.
```SQL
DELETE FROM table_name WHERE condition

-- WHERE ile koşul belirtmeden DELETE sorgusunu çalıştırırsak tablodaki bütün verileri siler.
```

# PRIMARY KEY
Bir tabloda bulunan veri sıralarını birbirinden ayırmamızı sağlayan bir kısıtlama(constraint) yapısıdır. Tabloda bulunan veri sıralarına ait "benzersiz tanımlayıcıdır."

- Benzersiz(Unique) olmalıdır.
- NULL değere sahip olamaz.
- Bir tabloda en fazla bir tane PRIMARY KEY bulunur.

# FOREIGN KEY
Bir tabloda bulunan herhangi bir sütundaki verilerin genelde başka bir tablo sütununa referans vermesi durumudur. Tablolar arası ilişki kurulmasını sağlar.

- Bir tabloda birden fazla sütun FOREIGN KEY olarak tanımlanabilir.
- Aynı sütun içerisinde aynı değerler bulunabilir.

# Veri Tipleri

## **Sayısal Veri Tipleri**

| TYPE |   | VALUE |
| ---- | - | ----- |
smallint   |-| -32768 to +32767
integer    |-| 2147483648 to +2147483647
bigint     |-| -92233720368547755808 tp +9223372036854775807
decimal    |-| up to 131072 digits before the decimal point, up to 16383 digits after the decimal point
numeric    |-| up to 131072 digits before the decimal point, up to 16383 digits after the decimal point
real       |-| 6 decimal digits precision
double precision   |-| 15 decimal digits precision
smallserial       |-| 1 to 32767
serial       |-| 1 to 2147483647
bigserial       |-| 1 to 9223372036854775807

## **Karakter Veri Tipleri**
| TYPE | | VALUE |
| ---- |-| ----- |
character varying(n), varchar(n) | - | veriable-length with limit
character(n), char(n) | - | fixed-length, blank padded
text | - | veriable unlimited length

Sınırlı sayıda karakter kullanımı için VARCHAR veya CHAR veri tipleri kullanılır. VARCHAR veri tipi doldurulmayan karakterleri yok sayar, CHAR veri tipi ise doldurulmayan karakterler için boşluk bırakır. Sınırsız karakter kullanımı için ise TEXT veri tipi kullanılır.

## **Boolean Veri Tipi**
TRUE, FALSE veya NULL(bilinmeyen) değerlerini alabilirler.

- **TRUE:** true, yes, on, 1
- **FALSE:** false, no, off, 0

## **ZAMAN / TARİH Veri Tipleri**
| TYPE | | VALUE |
| ---- |-| ----- |
timestamp[(p)] [without time zone]|-|both date and time(no time zone)
timestamp[(p)] with time zone|-|both date and time, with time zone
date|-|date (no time of day)
time[(p)] [without time zone]|-|time of day(no date)
time[(p)] with time zone|-|time of day(no date), with time zone
interval[fields][(p)]|-|time interal

<br/>

# NOT NULL
Birçok durumda herhangi bir sütuna yazılacak olan verilere belirli kısıtlamalar getirebiliriz. Örneğin; kullanıcı adı sütununda bilinmeyen(NULL) değerlerin olmasını isteyebiliriz. Bu durumda ilgili sütunda NOT NULL constraint kullanılır.

> NULL bilinmeyen veri anlamına gelir. Boş string veya 0 verilerinden farklıdır.

> **Employees tablosu oluşturalım ve tablodaki first_name ile last_name sütunlarına bilinmeyen veri girilmesini engellemek için NOT NULL kısıtlama yapısını kullanalım.**

```SQL
CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INTEGER
)
```

## **ALTER ve NOT NULL**
ALTER anahtar kelimesi varolan bir tabloda değişiklik yapmak için kullanılır.
```SQL
ALTER TABLE table_name
ALTER COLUMN column_name
SET NOT NULL

-- Belirtilen sütunda önceden eklenmiş NULL değerler varsa, bu verileri düzenlememiz gerekir aksi halde ALTER sorgusu hata verir.
```

# UNIQUE
UNIQUE kısıtlaması uyguladığımız sütundaki verilerin birbirinden farklı, benzersiz olmalarını isteriz. PRIMARY KEY kısıtlaması kendiliğinden UNIQUE kısıtlamasına sahiptir. CREATE TABLe ile tablo oluştururken veya önceden oluşturulmuş bir taloba ALTER komutu ile UNIQUE kısıtlamasını ekleyebiliriz.

```SQL
CREATE TABLE employees (
    employee_id SERIAL PRIMARY_KEY,
    ...
    email VARCHAR(100) UNIQUE
)
```

## **ALTER ve UNIQUE**
```SQL
ALTER TABLE table_name
ADD UNIQUE(column_name)

-- Belirtilen sütunda önceden eklenmiş benzer değerler varsa, bu verileri düzenlememiz gerekir aksi halde ALTER sorgusu hata verir.
```

# CHECK
CHECK kısıtlaması ile uyguladığımız sütundaki verilere belirli koşullar verebiliriz. Örneğin; age(yaş) olarak belirlediğimiz bir sütuna negatif değerler girilmemesi ya da kayıt olan kullanıcıların yaşlarının 18'den büyük olması gibi kısıtlamalar uygulamak isteyebiliriz.

```SQL
CREATE TABLE table_name (
    ...
    age INTEGER CHECK(age > 18),
    ...
)
```

## **ALTER ve CHECK**
```SQL
ALTER TABLE table_name
ADD CHECK (age > 18)
```

<br/>

# JOIN KAVRAMI (Birleştirme)
Veritabanları çoğunlukla birbiri ile ilişkili olan tablolardan oluşur. Birbiri ile ilişkili olan tablolardaki verileri farklı JOIN yapıları kullanarak sanal olarak birleştirip daha anlamlı veriler haline getirebiliriz.

## **INNER JOIN**
Bu yapı sayesinde birbiriyle ilişkili olan tabloların, birbiriyle eşleşen(kesişen) verilerini sıralayabiliriz.
```SQL
SELECT column_name, column_name FROM table1
INNER JOIN table2 ON table1.column_name = table2.column_name

-- TABLE1 'left table', TABLE2 'right table' olarak da tanımlanabilir.
```

## **LEFT JOIN**
Bu yapıdaki tablo birleştirmesinde, birleştirme işlemi TABLO1(soldaki tablo) üzerinden gerçekleştirilir. Tablo1'de ilgili sütundaki tüm verileri alır, sonrasında bu verilerin eşleştiği ilgili TABLO2 sütünundaki verileri alır. TABLO1'de olup TABLO2'de olmayan veriler için NULL değer kullanılır.

```SQL
SELECT column_name, column_name FROM TABLE1
LEFT JOIN TABLE2 ON table1.column_name = table2.column_name;
```

## **RIGHT JOIN**
Bu yapıdaki tablo birleştirmesinde, birleştirme işlemi TABLO2(sağdaki tablo) üzerinden gerçekleştirilir. TABLO2'de ilgili sütundaki tüm verileri alır, sonrasında bu verilern eşleştiği ilgili TABLO1 sütunundaki verileri alır. TABLO2'de olup TABLO1'de olmayan veriler için NULL değer kullanılır.
```SQL
SELECT column_name, column_name FROM TABLE1
RIGHT JOIN TABLE2 ON table1.column_name = table2.column_name;
```

## **FULL JOIN**
Bu yapıdaki tablo birleştirmesinde, birleştirme işlemi her iki tablo üzerinden gerçekleştirilir. TABLO1'de ilgili sütundaki tüm verileri alır, sonrasında TABLO2'deki ilgili sütünlardan tüm verileri alır. TABLO1'de olup TABLO2'de olmayan ve TABLO2'de olup TABLO1'de olmayan veriler için NULL değer kullanılır.
```SQL
SELECT column_name, column_name FROM TABLE1
FULL JOIN TABLE2 ON table1.column_name = table2.column_name;
```

# UNION
UNION operatörü sayesinde farklı SELECT sorgularıyla oluşan sonuçları tek bir sonuç kümesi haline getiririz.

UNION operatörü kullanılan sorguların, sütun sayıları eşit olmalıdır ve sütunlardaki veri tipleri eşleşmelidir.
```SQL
(
SELECT column_name, column_name
FROM TABLE1
)

UNION

(
SELECT column_name, column_name
FROM table2
)

-- UNION operatörü bize birleşik veriler içerisinde tekrar edenleri göstermez. Tekrar eden verileri görmek için UNION ALL kullanılır.
```

# INTERSECT
Intersect operatörü sayesinde farklı SELECT sorgularıyla oluşan sonuçların kesişen verilerini tek bir sonuç kümesi haline getiririz.
```SQL
(
SELECT column_name, column_name FROM TABLE1
)

INTERSECT

(
SELECT column_name, column_name FROM TABLE2
)
```

# EXCEPT
Except operatörü sayesinde farklı SELECT sorgularıyla oluşan sonuçlardan ilk sorguda olup ikinci sorguda olmayan verileri tek bir sonuç kümesi haline getiririz.

```SQL
(
SELECT column_name, column_name FROM TABLE1
)

EXCEPT

(
SELECT column_name, column_name FROM TABLE2
)

-- Tekrar eden verileri görmek için EXCEPT ALL kullanılır.
```

<br/>

# Subqueries (Alt Sorgular)
Bir sorgu içerisinde, o sorgunun ihtiyaç duyduğu veri veya verileri getiren sorgulardır.

```SQL
SELECT * FROM table_name
WHERE condition (
    SELECT column_name FROM table_name WHERE condition
)

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

SELECT column_name, (
    SELECT aggregate(column_name) FROM table_name) 
FROM table_name WHERE condition (
    SELECT column_name FROM table_name 
    WHERE condition)
```

## **ANY ve ALL Operatörleri**
Any ve All operatörleri sıklıkla kullanılır ve tek bir sütunda bulunan bir değerle bir değer dizisinin karşılaştırılmasını sağlar.
## **ANY**
Alt sorgudan gelen herhangi bir değerin koşulu sağlanması durumunda TRUE olarak ilgili değerin koşulu sağlamasını sağlar.
```SQL
SELECT first_name, last_name FROM author
WHERE id = ANY
(
	SELECT book_id FROM book
	WHERE title = 'Abe Lincoln in Il linois' 
    OR title = 'Saving Shiloh'
)
```
>Alt sorgudan gelebilecek iki ID değeri var, bu ID değerinin her ikisi de birbirinden bağımsız olarak ana sorgudaki ID sütununda bulunan değerler ile eşleştiği için sorgu sonucunda oluşan sanal tabloda ID değeri 4 ve 5 olan yazarlara ait first_name ve last_name değerleri getirilir.

## **ALL**
Alt sorgudan gelen tüm değerlerin koşulu sağlaması durumunda TRUE olarak döner.
```SQL
SELECT first_name, last_name FROM author
WHERE id = ALL
(
  SELECT id FROM book
  WHERE title = 'Abe Lincoln in Illinois' 
  OR title = 'Saving Shiloh'
)
```
>Alt sorgudan 4 ve 5 ID'leri gelecek. Burada eşitlik (WHERE id = ) için aynı anda 4 ve 5'in bu koşulu sağlaması olanaksız olduğu için herhangi bir değer dönmeyecektir.