# SQL *(Structered Query Langugae)* Nedir?
    SQL, verileri yönetmek ve tasarlamak için kulalnılan bir dildir. SQL, veritabanı yönetim sisteleri ile ilişki kurmayı sağlayacan declarative yani bildirimsel bir 4.nesil programlama dilidir.  
    Türkçe ifadesiyle Yapılandırılmış Sorgu Dili anlamına gelmektedir. SQL sayesinde verilerin bulunduğu veritabanı ile iletişime geçilir.

## ÖRNEK SQL Sorgusu
```SQL
SELECT title FROM book WHERE page_number > 200;
```
SQL'in, ***DBMS(Database Management System)*** ile nasıl çalıştığının, arka planda ne tür işlemler döndüğünün bizim açımızdan pek önemi yoktur. Bundan dolayı SQL **declarative** yani bildirimsel, beyan edici bir yaklaşıma sahiptir. 

<br/>

# Data(Veri)
    Ölçüm, sayım, deney, gözlem veya araştırma sonucuyla elde edilen ham bilgilerdir.

<br/>

# Database(Veritabanı)
    Verilerin organize bir şekilde depolanmasını ve belirli işlemlerle modifiye edilmesini sağlayan sistemlerdir.

### Düzenli verilere sahip olursak;
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

# Database Management System(DBMS)
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

<br/><br/><br/><br/>

# SELECT
    SELECT en çok kullanılan SQL komutudur ve veritabanında belirtilen sütunlardaki verileri çekmemizi sağlar. Ayrıca SELECT komutunu çoğunlukla diğer SQL komutlarıyla birlikte kullanırız.

## SELECT Söz Dizimi
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

## Karşılaştırma Operatörleri
Operatör    |   Açıklama    | Operatör  | Açıklama
--------    |   --------    | --------  | --------
**<**       | Küçüktür      | **<=**    | Küçük Eşit
**>**       | Büyüktür      | **>=**    | Büyük Eşit
**<>**      | Eşit Değil    | **!=**    | Eşit Değil
**=**       | Eşit
<br/>

## Mantıksal Operatörler
    Çoğu durumda birden fazla koşulu gerçekleştirmek isteriz bunun için mantıksal operatörlerden faydalanırız.

