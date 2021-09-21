# KAYNAK
## **[patika.dev](https://app.patika.dev/)**

## Patika.dev - JAVA101 eğitimi kapsamındaki içeriklere göre hazırlanmıştır.  
> Ufak düzeyde değişiklikler ve düzenlemeler yapıldı.

<br>

## **BAŞLIKLAR**
- Soyut Düşünme
- Program Nedir?
- Programlama Nedir?
- Programlama Dili Nedir?
- Algoritma Nedir?
- Java Nedir?
  - Tarihçesi
  - Java'nın Avantajları Nelerdir?
- Geliştirme Ortamı (JDK)
- Sözdizimi (Syntax) Nedir?
- Yazım Kuralları
- İsimlendirme Kuralları
- Java İsimlendirme Kuralları
- Main Metodu ve Kullanımı
- Escape Karakterler
- Yorum Satırları
- Değişkenler ve Veri Tipleri
- Değişken Tanımlama
- Temel Operatörler
  - Atama Operatörleri
  - Aritmetik Operatörler
  - Karşılaştırma Operatörleri
  - Mantıksal Operatörler
  - Koşul Operatörü
- Kullanıcıdan Veri Alma
  - Veri Tiplerine Göre Scanner Metotları
- Kod Blokları(Scope)
- Karar Yapıları
  - If-Else Mekanizması
  - Switch-Case Mekanizması
- Döngü Yapıları
  - For Döngüsü
  - While Döngüsü
  - Do-While Döngüsü
  - For-Each Döngüsü
  - For | While | Do-While Arasındaki Farklar
- Continue ve Break Komutları
- Metotlar(Fonksiyonlar)
  - Neden Metot Kullanılır?
- Return ve Void
  - Return Metotlar
  - Void Metotlar
- Metotlarda OverLoading(Aşırı Yükleme)
- Lokal Değişken Kavramı
- Recursive(Özyineli) Metotlar
- Sınıf ve Nesne Kavramları
  - Sınıf(Class) Nedir?
  - Nesne Yönelimli Programlama(OOP) Nedir?
  - Neden Nesne Yönelimli Programlama?
  - Modelleme ve Soyut Düşünme
  - Sınıflar(Classes)
  - Nesne Oluşturma
  - Constructor (Kurucu/Yapıcı) Metotlar
- Diziler
  - Dizilerin Genel Mantıkları
  - Dizileri Parametre Olarak Göndermek
  - Dizileri Fonksiyonlardan Geri Döndürmek
  - Tek Boyutlu Diziler
  - Çok Boyutlu Diziler
  - Sütun Kapasiteleri Farklı Matris Oluşturma(Düzensiz Diziler)
- Yardımcı Sınıflar
  - Array Sınıfı ve Metotları
  - Math Sınıfı ve Metotları
  - String Sınıfı ve Metotları

<br>

# Soyut Düşünme
Programlama öğrenmek kişilerin soyut düşünme yetisini de geliştirmektedir. Her ne kadar programlar bilgisayar ekranında somut olarak bir çıktı verseler de, programı tasarlamak soyut bir kavramdır. Bu bağlamda bir programcı her zaman soyut düşünmelidir.
# Program Nedir
Sözlükte program kelimesi, belirli şartlara ve düzene göre yapılması öngörülen işlemlerin bütünü ve aynı zamanda izlence olarak tanımlanmıştır. Yazılımcılara göre Program, bilgisayara bir işlemi yaptırmak için yazılan komutlar dizisidir.
# Programlama Nedir?
Programlama, "bilgisayara çeşitli görevleri yerine getirmesi için talimat vermenin" bir yoludur. Bu talimatlar, makinelerin nasıl çalışacağını veya çalıştıracağını söyleyebilir. Programlama bilgisayara ne yapması gerektiğini söyleyen, problemlere çözümler üreten ve bu çözümleri algoritmalar ile destekleyen bir öğretme işlemidir.

Günümüzde bir çok özelliğe sahip, işlem güçleri yüksek bilgisayarlar ve donanımlar mevcut. Hatta süper bilgisayar olarak adlandırılan milyon dolarlar harcanan donanımlar bile kullanılıyor. Ama bu bilgisayarlara ne yapacağını söylemediğimiz sürece, dünyanın en vasıfsız cihazlarından bir farkları olmayacaktır. Bilgisayarları hayatımızda bu kadar önemli hale getirmek için programlama tanımı devreye girmektedir.
# Programlama Dili Nedir?
Dil, binlerce yıldır insanlar için iletişim aracı olmuştur. Bir topluluk için, dil insanların iletişim kurması gereken kelimeleri içerir. Bilgisayarlara baktığımızda, bu durumun çok farlı olmadığını görürüz. Birbirleriyle iletişim kurması gereken bir çok donanım ve yazılım bileşenleri vardır.

Eski bilgisayarlar aslında devre ve kabloların yerleriyle oynayarak bir ve sıfırların elle değiştirilmesiyle programlandı. Tabii ki, bu tür ilkel programlar için kullanılan yöntem zordu. Bu nedenle programlama dillerinin oluşturulması, bilgisayar bilimlerini başka bir seviyeye taşıyan devrim niteliğinde bir adımdı. Normal dillerden farklı olarak, programlama dillerindeki anahtar kelimeler sınırlıdır. Bu kelimeleri birleştirerek, programcılar farklı türlerde programlar oluşturabilirler. Yazılan kodları makinenin anladığı dile dönüştüren ara birimlerde mevcuttur.

> "Programlama dili, insanların bilgisayarlarla etkileşime girdiği bir dizi talimattır."

# Algoritma Nedir?
Algoritma belirli bir problemi çözmek veya belirli bir şartı sağlamak için tasarlanmış yoldur. Bilgisayar bilimlerinde ve Matematikte bir işi yapmak için oluşturulan, başlangıç ve bitiş noktası olan sonlu işlemler kümesidir. Bilgisayar bilimlerinin önemli bir parçası olup, programlamada kullanılır. Tüm programlama dillerinin temelleri algoritmaya dayanır.

Bir bilgisayarı harekete geçirmek için, bilgisayar programları yazmak gerekmektedir. Bir program yazmak için, bilgisayara adım adım, tam olarak ne yapması gerektiğini söylemek gerekir. Bilgisayar daha sonra bu adımları izleyerek istediğimiz eylemi gerçekleştirir.

Bilgisayara ne yapacağınızı söylediğinizde, bunun nasıl yapılacağını da seçersiniz. İşte burada bilgisayar algoritmaları devreye giriyor. Algoritma işi yapmak için kullanılan temel tekniktir.

Örneğin; başka şehirden bir arkadaşımız ziyarete geliyor. Arkadaşımızın havaalanından evimize gelmesi için verebileceğimiz dört farklı algoritma:
  - Taksiye bin
  - Araç kirala
  - Otobüse bin
  - Ben seni alırım

Bu algoritmaların dördü de aynı hedefe ulaşır, ancak her algoritma bunu tamamen farklı bir şekilde yapar. Her algoritmanın farklı bir maliyeti ve farklı bir seyahat süresi vardır. Örneğin, taksiye binmek muhtemelen en hızlı, ama aynı zamanda en pahalı olan seçenektir. Otobüse binmek daha ucuz, ama çok daha yavaş. Algoritmayı koşullara göre seçeriz.

Bilgisayar programlamada, verilen herhangi bir görevi yerine getirmenin bir çok farklı yolu vardır. Her algoritmanın farklı durumlarda avantajları ve dezavantajları vardır. Bizler en uygun algoritmaları seçmeye çalışırız.
# Java Nedir?
## Tarihçesi
1991 yılında Sun Microsystems şirketi mühendislerinden James Gosling ve 12 arkadaşı Green Project(Yeşil Proje) isimli bir proje geliştirmeye başladılar. Gömülü sistemler üzerine çalışan James Gosling ve ekibi başlangıçta C ve C++ dillerini kullansalar da bu dillerin geliştirdikleri projeye uygun bir dil olmadığını ve geliştirdikleri proje için yetersiz olduğunu görüp yeni bir dil arayışı içine girdiler ve bu sırada "Oak" şimdiki adıyla Java dili doğmuş oldu.

Java Doğrudan C++ ile bağlantılıdır. C++ ise C'nin devamıdır. Java, karakteristik özelliklerinin birçoğunu bu iki dilden almıştır. C'nin sözdizimi(syntax), C++'ın ise nesne yönelimli programlama(Object Oriented Programming - OOP) kavramı Java'ya miras kalmıştır. Bunun yanı sıra, Java, bu dillerdeki karmaşıklığı ortadan kaldırmış, eksik özelliklerini ise tamamlamıştır.
## Java'nın Avantajları Nelerdir?
### **Basit Olması**  
Java'nın yazımı kolaydır. Daha okunaklı bir yapısı vardır ve dikkat çekicidir. Java geleceğe dönük olarak oluşturulacak yapılarla kullanımı kolaylaştırır, sadeleştirir ve öğrenmesi kolaydır.
### **Tarafsız Mimariye Sahip**
Java özel makinelere ya da işletim sistemi mimarilerine bağlı değildir. Java donanımdan bağımsızdır. Java'yı platform bağımsız kılan özelliği, yazılan kaynak kodlar derlendikten sonra ara bir dil olan byte code'a çevrilmesidir. Ara dile çevrilen bu kod parçaları Java Virtual Machine vasıtasıyla yorumlanır ve çalıştırılır. Buradaki tek sorun hız sorunudur. Çünkü işletim sistemiyle birlikte Virtual Machine'de bilgisayarın kaynaklarını kullandığı için daha yavaş çalışmaktadır.
### **Nesne Yönelimli Olması**
Java da C++ gibi nesne yönelimlinin özelliklerinden faydalanır. Sınıflar oluşturularak daha az kod yazıp daha fazla iş yaparak kod tekrarı önlenmiş olur. Böylece geliştirme sürecinin verimliliği artar.
### **Zengin Kütüphane Desteği**
Java çok zengin ve geniş bir kütüphaneye sahiptir ve ücretsiz olarak erişim sağlayıp temin edilebilir. Bu sayede bir çok platformda uygulama geliştirme imkanı sağlar.
### **Multi-Thread & Dinamik**
'Multi-Thread', bir programda bir çok işlemin aynı zamanda gerçekleşmesi özelliğidir. Eş zamanlı işlemleri programlayabilmenize imkan tanır. Java bu tür program geliştirmeyi destekler.
### **Neden Java Kullanmalıyız?**
- Bilgisayarların %97'sinde Java bulunuyor.
- Dünyada 9 Milyon Java geliştirici var.
- 3 milyar cep telefonunda java bulunuyor.
- 125 milyon TV cihazı Java kullanıyor.
- Dizüstü bilgisayarlardan veri depolama merkezlerine, oyun konsollarından bilimsel süper bilgisayarlara, cep telefonlarından Internet'e kadar Java her yerde.
### **Java ile Uygulama Geliştirme Yapabileceğiniz Alanlar**
Teknoloji ve onları geliştirmek için kullanılan diller sürekli bir evrim geçirmekte. Java dili, çok sayıda uygulamaya sahip popüler programlama dillerinden biridir. Java ile ne tür uygulamalar yapılabilir?
 - Mobil uygulamalar
   - Java, mobil uygulama geliştirme için çok kullanılan bir programlama dilidir. Android Studio ve Kotlin gibi yazılımlarla uyumludur. Çünkü Android İşletim Sistemi Java ile yazılmıştır. Android'in sınıf dosyalarını yönetmek için DVK(Dalvik Virtual Machine) kullanılırken, Java, Virtual Machine(JVM) üzerinde çalışmaktadır. Java ve OOP ilkeleri ile Android daha iyi güvenlik ve basitlik sağlar.
- Masaüstü uygulamalar
  - Masaüstü uygulamaları Java ile kolaylıkla geliştirilebilir. Java ayrıca AWT, Swing ve JavaFX gibi eklentileri ile arayüz geliştirme desteği ve kolaylığı sağlar.
- Web Tabalı Uygulamalar
  - Java, web uygulamaları geliştirmek için de kullanılır. Servlets, Struts, Springboot veya JSP eklentileri ile web uygulamaları için geniş destek sağlar. Bu teknolojiler sayesinde ihtiyacınız olan her türlü web uygulamasını geliştirebilirsiniz.
- Kurumsal Uygulamalar
  - Java en çok talep gören programlama dillerinden biridir. Büyük ve küçük işletmeler, bu dilde yazılmış uygulamalarla desteklenmektedir. Yenilikçi bir ticari yazılım türü fikriniz varsa, Java muhtemelen sizin için en iyi dildir. Havayollarının, devlet kurumlarının her gün kullandığı özel işletme yazılımlarının çoğu için geçerlidir.
- Bilimsel Uygulamalar
  - Bilimsel hesaplamalar ve matematiksel işlemler yaptırmak için Java çok kullanılan bir dildir. MATLAB gibi en popüler uygulamalardan bazıları, GUI(Arayüz) ve çekirdek yapılarında Java kullanır.
- Oyun Programlama
  - Java, bağımsız oyun geliştirme şirketleri tarafından ve mobil oyunlar oluşturmak için yaygın olarak kullanılmaktadır. Java, 3 boyutlu oyunların tasarımı söz konusu olduğunda benzersiz bir yeteneğe sahip olan açık kaynaklı 3D motor olan jMonkeyEngine'in desteğine sahiptir. Dünyanın en iyi mobil oyunlarının çoğu Java'da geliştirilmiştir. Minecraft, Mission Impossible III ve Asphalt 6 vb.
- Gömülü Sistem Uygulamaları
  - Java2Me Embedded altyapısı ile Java, gömülü sistem tasarımcıları için bir dizi avantaja sahiptir. Java dil olarak, C++ tehlikeleri olmadan nesne yönelimli programlamaya izin verir. Örneğin, Java sınıf kalıtımına izin verir, ancak birden çok ebeveynden gelmez, bu nedenle kafa karışıklığı fırsatı yoktur. Ayrıca Java, teknoloji geliştiricilerinin değişen pazar koşullarına hızla yanıt vermesini mümkün kılar. Uygun şekilde uygulanırsa, gömülü bir uygulamanın Java bölümleri, uygulamanın geri kalanında izole edilebilir, böylece görev açısından kritik bölümleri Java bölümlerinin yol açtığı bozulmaya karşı korur.
# Geliştirme Ortamı(JDK)
Java Geliştirme Kiti(JDK), JVM(Java Sanal Makinesi) ve JRE(Java Çalışma Zamanı Ortamı) ile birlikte Java programlamada kullanılan üç temel teknoloji paketinden biridir. JDK, geliştiricilerin JVM ve JRE tarafından çalıştırılabilen Java programları oluşturmalarına izin verir.
# Sözdizimi(Syntax) Nedir?
Syntax(Sözdizimi), bilgisayar biliminde, bir bilgisayar dilinin sözdizimi, o dilde doğru yapılandırılmış ifadeler veya ifadeler olarak kabul edilen sembollerin kombinasyonlarını tanımlayan kurallar kümesidir. Programlama dillerinde de tıpkı bizim günlük hayatta kullandığımız dilde olduğu gibi belli dizilim kuralları vardır. Bu dizilim kuralları sayesinde her şey makineler ve insanlar tarafından daha rahat anlaşılabilir ve yorumlanabilir bir hal almaktadır. Bunların dışına çıkıldığında veya bir eksiklik yapıldığında o kod satırı tam olarak yorumlanamaz ve syntax hatası(Syntax Error) dediğimiz hatalarla karşılaşırız.
# Yazım Kuralları
- Türkçe Karakter Kullanımı
  - Java ve birçok programlama dili Türkçe karakter desteklememektedir. Programdaki metin ifadeleri dışında Türkçe karakter kullanılmamalıdır.
- Harf Duyarlılığı
  - Java harfe duyarlı bir dildir. Kelimelerdeki küçük ve büyük harfler farklı olarak algılanır. Java'da "Kodluyoruz" ile "kodluyoruz" ifadeleri farklı anlama gelmektedir.
- Sınıf Adları
  - Java'da sınıf adlarının ilk harfi büyük olmalıdır. Eğer 2 kelimeyi birleştirerek bir sınıf adı oluşturursak bu isimlerin baş harfleri büyük olmalıdır.
  - ```
    Örnek; PascalCase, UpperCamelCase
    ```
- Metot Adları
  - Metot adları küçük harfle başlar. Metot adı verilirken iki kelime birleştirilecekse ismin başlangıç harfi küçük diğer birleştirilen kelimelerin başlangıç harfleri büyük yazılır.
  - ```
    Örnek; camelCaseExample
    ```
# İsimlendirme Kuralları
> İsimlendirme kurallarına uymak kod okunurluğunu arttırır.
- Camel Case
  - İlk kelime küçük harfle başlar ve sonraki kelimelerin ilk harfleri büyük harfle başlar. Yazılım geliştiricileri genellikle kaynak kodu yazarken "Camel Case" kullanır. Camel Case kullanımı zorunlu bir kullanım olmasa da topluluk tarafından kabul edilmiş bir isimlendirme kuralıdır ve çoğu yazılımcı bu kurala uyar. 
  - ```
    Örnek; patikaDev, camelCaseKurali, isimlendirmeKurallari
    ```

- Upper Camel Case - Pascal Case
  - Upper Camel Case veya Pascal Case, kuralında bütün kelimelerin ilk hafleri büyük harfle başlar.
  - ```
    Örnek; PatikaDev, UpperCamelCase, PascalCase, IsimlendirmeKurallari
    ```

- Snake Case
  - İsimlendirmedeki her kelimenin arasına alt tire(_) konulur.
  - ```
    Upper Snake Case -> Patika_Dev
    Lower Snake Case -> lower_snake_case
    ```

- Screaming Snake Case
  - İsimlendirmedeki bütün harfler büyük yazılır. Genellikle sabit değişkenleri isimlendirmede kullanılır.
  - ```
    Örnek; PATIKA_DEV, SCREAMING_SNAKE_CASE
    ```
# Java İsimlendirme Kuralları
- 7Java'da isimlendirilen tüm öğeler sadece A-Z veya a-z gibi harfler, $ karakteri veya _(alt tire) karakteri ile başlayabilirler.
- Javaya özel Keywordler(anahtar kelimeler) isimlendirmede kullanılamaz.

Keywords|        |          |         |            |
--------|--------|----------|---------|------------|
abstract|continue|for       |new      |switch      |
assert  |default |goto      |package  |synchronized|
boolean |do      |if        |private  |this        |
break   |double  |implements|protected|throw       |
byte    |else    |import    |public   |throws      |
case    |enum    |instanceof|return   |transient   |
catch   |extends |int       |short    |try         |
char    |final   |interface |static   |void        |
class   |finally |long      |strictfp |volatile    |
const   |float   |native    |super    |while       |

```
- Sınıflar için UpperCamelCase / PascalCase kullanılır. --> PatikaDev
- Metotlar için camelCase kullanılır. --> patikaDev
- Değişkenler için camelCase kullanılır. --> patikaDev
- Sabitler için SCREAMING_SNAKE_CASE kullanılır. --> PATİKA_DEV
```
# Main Metodu ve Kullanımı
Java'da bir program çalışacağı zaman, kodlar ilk olarak Main metodu içerisinden başlar. Main metodu sayesinde derleyiciye, programın buradan başlatılması konusunda referans oluşturulur.
```Java
public Class JavaPatika {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
>     Main metodu yazılırken, args yerine başka bir isimlendirme yapılabilir. Ancak genellikle args sözcüğü kullanılır ve bu sözcük arguments sözcüğünün kısaltmasıdır. Arguments ile ifade edilen kısım, sınıf çalıştırılırken JVM tarafından bu sınıfa verilen parametrelerdir.
# Escape Karakterler
Karakter | Açıklama
-------- | --------
\t       | Tab boşluk ekler.
\b       | Bir önceki karakteri siler.
\n       | Bir satır aşağı atlar.
\r       | Metine satır başı ekler.
\f       | Sayfa sonunu belirlemek için kullanılır.
\'       | Tek tırnak eklemek için kullanılır.
\"       | Çift tırnak eklemek için kullanılır.
\ \      | Ters eğik çizgi eklemek için kullanılır.
# Yorum Satırları
Yorum satırları, kod içi belgeleme amacıyla kullanılan ve derleyiciler tarafından dikkate alınmayan kod parçalarıdır. Yorum satırları oluşturmamızın sebebi, yazdığımız kodun kritik kesimlerini açıklayarak, o koda daha sonra bakan kimselerin(büyük olasılıkla kendimiz) işini kolaylaştırmak amaçlanmaktadır. Java'da yorum satırları 3 farklı şekilde yazılır.
- // ile yapılan yorumlar
  - Tek satırlık bir açıklama yapılacaksa o satırın başına // işareti yazılır. // işaretinden sonra satır sonuna kadar her şey yorum satırı olarak kabul edilir. Anlaşılacağı üzere bu işaretin satırın en başında olması zorunlu değildir. Ancak kodlama alışkanlığı bakımından satır başında kullanılması daha uygundur.
- /* ... */ ile yapılan yorumlar
  - Eğer birden fazla satırda yazılan bir açıklama varsa, her satırın başına // işareti koymak programcıya zor gelebilir. Bunun yerine, açıklama olarak değerlendirilmesi istenen satırlar /* ve */ işaretleri arasına alınır. Bu iki işaret arasında kalan kesimler derleyici tarafından yorum satırı olarak kabul edilir.
- /** ... */ ile yapılan yorumlar
  - Bir uygulama geliştirilirken kod içi belgeleme yapmak güzel bir programlama alışkanlığıdır. Çünkü hem yapmakta olduğunuz işi en güzel o işi yaparken açıklayabilirsiniz, hem de açıklayabildiğiniz kodu anlamışsınız demektir ve o kodu açıklayarak yazdığınız için hata yapma olasılığınız düşer.
  - Öte yandan, çoğu zaman uygulamaların raporlarının oluşturulması gerekir. Kod yazıldıktan sonra kodun içine yazılan açıklamalardan bir belge oluşturarak bu belgeyi raporun sonuna eklemek programcının yükünü hafifletecektir.
  - /** ... */ işaretleri arasına yazılan açıklamalar bir takım özel etiketler içerebilir. Kod içi belgeleme, bu etiketleri tanıyan ve etiketlerden faydalanarak belge üreten bir aracın yardımı ile belgeye dönüştürülebilmektedir.
  - Bu tarzda yazılan açıklama satırlarına Javadoc adı verilir. 
### JavaDOC için kullanılabilecek bazı etiketler
Etiket  | Açıklama  | Örnek |
--------|-----------|-------|
@author     |Class'ı yazan kişi.                                                    |@author Berkcan Serbest
{@code}     |Metodun kullanım örneğini vermek için.                                 |{@code ...}
@exception  |Metot istisnası ve açıklaması.                                         |@exception istisna açıklama
@param      |Değişkenler, değişken tipleri, ve bu değişkenlerin açıklamaları.       |@param değişken-açıklama
@return     |Metottan bir değer dönüyorsa açıklaması.                               |@return açıklama
@see        |Başka bir metot ya da açıklamaya referans göstermek için kullanılır.   |@see referans
@since      |Metodun oluşturulma tarihi.                                            |@since tarih
@version    |Sınıfın versiyon numarası.                                             |@version versiyon numarası
# Değişkenler ve Veri Tipleri
Değişkenler programlamada geçici bilgileri sakladığımız ve programcı tarafından belirlenen yapılardır. Değişkenler programlamanın temel yapısını oluşturmaktadır ve tüm programlama dillerinde kullanılan bir yapıdır. Değişkenler sayesinde program içinde yaptığımız işlemleri hafıza da tutar ve gerektiği yerlerde kullanırız.
```
Değişkenlerin 4 özelliği bulunur;
Veri Tipi, Değişken İsmi, Değer ve Adres
```
Değişkenlerde Veri Tipi, adından da anlaşılacağı üzere verinin saklanacağı türü belirtmektedir. Bunlar; sayılar, sözcükler ve programatik alanlar olabilir. Her değişkenin program içinde kullanıldığı ve çağrıldığı benzersiz bir ismi vardır. Bu değişkenlere birde değer atarız, işletim sistemimizde bu değişkeni hafızada tutar ve bir adres belirler.  
Java'da değişkenlerin veri tipleri vardır. Bu tipler Java'da varsayılan olarak tanımlı gelen İlkel(primitive) tipler de olabilir veyahut yazılımcıların kendi tanımladığı ilkel olmayan(non-primitive) tipler de olabilir. İlkel tipler her zaman bir değere sahiptir. İlkel olmayan tipler ise 'null'(bilinmeyen - boş) olabilir. İlkel olmayan türlerin tümü aynı boyuta sahipken ilkel veri tiplerin boyutu alacağı veri tipine bağlıdır.
# Değişken Tanımlama
```
<veri tipi> <degisken ismi> = <deger>;
```
İlk önce değişkenin veri tipini ve değişkenin ismini yazarız ve istenirse "=" eşittir operatörü ile değerini atarız.
```Java
int a,b,c;

int a = 1, b = 2;
```
Veri tipleri aynı olan değişkenleri aynı satırda tanımlayabiliriz ve istenirse "=" eşittir operatörü ile değer atayabiliriz.
## İlkel Veri Tipleri
Type    | Size  | Range                 |
--------|-------|-----------------------|
byte    |8  bit |-128 to 127            |
short   |16 bit |-32,768 to 32,767      |
int     |32 bit |-2^31 to 2^31-1        |
long    |64 bit |-2^63 to 2^63-1        |
float   |32 bit |1.4e-045 to 3.4e+038   |
double  |64 bit |4.9e-324 to 1.8e+308   |
char    |16 bit |0 to 65.535            |
boolean |1  bit |true or false          |
> String, ilkel(primitive) veri tipi değildir. String karakter(char) kümelerini tutmak için tasarlanmış bir sınıftır.
# Temel Operatörler
Java dilinde operatörler birçok işlemi yapabilmemize olanak tanır. Örneğin; matematiksel operatörlerle birlikte aritmetik işlemler yapabilir, ilişkisel operatörlerle verileri kıyaslayabilir, atama operatörleri ile değişkenlerin değerlerini değiştirebiliriz.
- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörleri
- Koşul Operatörleri
- Mantıksal Operatörler

## Atama Operatörleri
Operatör    | Açıklama                  | Örnek                                 |
------------|---------------------------|---------------------------------------|
=           |Basit atama operatörüdür. Operatörün sağındaki değeri solundaki değişkene atar.|C = 4 + 5 **--ya da--** C = "Kodluyoruz";  |
+=          |Operatörün sağındaki değeri solundaki değerle toplayıp sonucu solundaki değişkene atar.|C += A; -**-ya da--** C += 5;
-=          |Operatörün sağındaki değeri solundaki değerden çıkartıp sonucu solundaki değişkene atar.|C -= A; **--ya da--** C-=5;
*=          |Operatörün sağındaki değeri solundaki değerle çarpıp sonucu solundaki değişkene atar.|C *= A; **--ya da--** C *= 5;
/=          |Operatörün sağındaki değeri solundaki değerle bölüp sonucu solundaki değişkene atar.|C /= A; **--ya da--** C /= 5;
%=          |Operatörün sağındaki değerin solundakine göre modunu alıp sonucu solundaki değişkene atar.| C %= A; **--ya da--** C %= 5;
## Aritmetik Operatörler
> Matematiksel işlemleri programlama dilinde uygulamamızı sağlar.

|Operatör   | Açıklama  |
|-----------|-----------|
|+          |Toplama    |
|-          |Çıkarma    |
|*          |Çarpma     |
|/          |Bölme      |
|%          |Mod Alma   |
|++         |1 Arttırma |
|--         |1 Eksiltme |
## Karşılaştırma Operatörleri
> İki nesnenin birbirleriyle olan durumlarını kontrol eder.

|Operatör   |Açıklama       |
|-----------|---------------|
|==         |Eşitlik        |
|!=         |Eşit Değil     |
|>          |Büyüktür       |
|<          |Küçüktür       |
|>=         |Büyük Eşittir  |
|<=         |Küçük Eşittir  |
## Mantıksal Operatörler
> Nesnelerin veya ifadelerin mantıksal karşılaştırmalarını yapmak için kullanılır. True veya False sonuç döndürür.

|Operatör|Açıklama|
|--------|--------|
|&&      |Ve      |
|\|\|    |Veya    |
|!(&&)   |Değil   |

## Koşul Operatörü
> İfadelerin sonucunda oluşacak olayları belirler.

```Java
int a = 5;
boolean b = (a==1); // False
a = b ? 1 : 0;
System.out.println(a);

//Output: 0
```