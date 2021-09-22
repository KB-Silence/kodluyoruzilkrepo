# KAYNAK
## **[patika.dev](https://app.patika.dev/)**

## Patika.dev - JAVA101 eğitimi kapsamındaki içeriklere göre hazırlanmıştır.  
> Ufak düzeyde değişiklikler ve düzenlemeler yapıldı.

<br>

## **BAŞLIKLAR**
- [KAYNAK](#kaynak)
  - [**patika.dev**](#patikadev)
  - [Patika.dev - JAVA101 eğitimi kapsamındaki içeriklere göre hazırlanmıştır.](#patikadev---java101-eğitimi-kapsamındaki-içeriklere-göre-hazırlanmıştır)
  - [**BAŞLIKLAR**](#başliklar)
- [Soyut Düşünme](#soyut-düşünme)
- [Program Nedir](#program-nedir)
- [Programlama Nedir?](#programlama-nedir)
- [Programlama Dili Nedir?](#programlama-dili-nedir)
- [Algoritma Nedir?](#algoritma-nedir)
- [Java Nedir?](#java-nedir)
  - [Tarihçesi](#tarihçesi)
  - [Java'nın Avantajları Nelerdir?](#javanın-avantajları-nelerdir)
    - [**Basit Olması**](#basit-olması)
    - [**Tarafsız Mimariye Sahip**](#tarafsız-mimariye-sahip)
    - [**Nesne Yönelimli Olması**](#nesne-yönelimli-olması)
    - [**Zengin Kütüphane Desteği**](#zengin-kütüphane-desteği)
    - [**Multi-Thread & Dinamik**](#multi-thread--dinamik)
    - [**Neden Java Kullanmalıyız?**](#neden-java-kullanmalıyız)
    - [**Java ile Uygulama Geliştirme Yapabileceğiniz Alanlar**](#java-ile-uygulama-geliştirme-yapabileceğiniz-alanlar)
- [Geliştirme Ortamı(JDK)](#geliştirme-ortamıjdk)
- [Sözdizimi(Syntax) Nedir?](#sözdizimisyntax-nedir)
- [Yazım Kuralları](#yazım-kuralları)
- [İsimlendirme Kuralları](#i̇simlendirme-kuralları)
- [Java İsimlendirme Kuralları](#java-i̇simlendirme-kuralları)
- [Main Metodu ve Kullanımı](#main-metodu-ve-kullanımı)
- [Escape Karakterler](#escape-karakterler)
- [Yorum Satırları](#yorum-satırları)
    - [JavaDOC için kullanılabilecek bazı etiketler](#javadoc-için-kullanılabilecek-bazı-etiketler)
- [Değişkenler ve Veri Tipleri](#değişkenler-ve-veri-tipleri)
- [Değişken Tanımlama](#değişken-tanımlama)
  - [İlkel Veri Tipleri](#i̇lkel-veri-tipleri)
- [Temel Operatörler](#temel-operatörler)
  - [Atama Operatörleri](#atama-operatörleri)
  - [Aritmetik Operatörler](#aritmetik-operatörler)
  - [Karşılaştırma Operatörleri](#karşılaştırma-operatörleri)
  - [Mantıksal Operatörler](#mantıksal-operatörler)
  - [Koşul Operatörü](#koşul-operatörü)
- [Kullanıcıdan Veri Alma](#kullanıcıdan-veri-alma)
    - [Veri Tipine Göre Scanner Metotları](#veri-tipine-göre-scanner-metotları)
- [Kod Blokları(Scope)](#kod-bloklarıscope)
- [Karar Yapıları](#karar-yapıları)
  - [If-Else Mekanizması](#if-else-mekanizması)
  - [Switch-Case Mekanizması](#switch-case-mekanizması)
- [Döngü Yapıları](#döngü-yapıları)
  - [While Döngüsü](#while-döngüsü)
  - [Do-While Döngüsü](#do-while-döngüsü)
  - [For Döngüsü](#for-döngüsü)
  - [For-Each Döngüsü](#for-each-döngüsü)
  - [While | Do-While | For Arasındaki Farklar](#while--do-while--for-arasındaki-farklar)
- [Continue ve Break Komutları](#continue-ve-break-komutları)
- [Metotlar(Fonksiyonlar)](#metotlarfonksiyonlar)
  - [Neden Metot Kullanırız?](#neden-metot-kullanırız)
  - [Return ve Void](#return-ve-void)
    - [Return Metotlar](#return-metotlar)
    - [Void Metotlar](#void-metotlar)
  - [Metotlarda Over-Loading(Aşırı Yüklenme)](#metotlarda-over-loadingaşırı-yüklenme)
  - [Recursive(Özyineli) Metotlar](#recursiveözyineli-metotlar)
- [Lokal Değişken Kavramı](#lokal-değişken-kavramı)
- [Sınıf ve Nesne Kavramları](#sınıf-ve-nesne-kavramları)
  - [Sınıf(Class) Nedir?](#sınıfclass-nedir)
  - [Nesne Yönelimli Programlama(OOP) Nedir?](#nesne-yönelimli-programlamaoop-nedir)
    - [Neden Nesne Yönelimli Programlama?](#neden-nesne-yönelimli-programlama)
  - [Modelleme ve Soyut Düşünme](#modelleme-ve-soyut-düşünme)
  - [Sınıflar(Classes)](#sınıflarclasses)
  - [Nesne Oluşturma](#nesne-oluşturma)
    - [Niteliklere ve Metotlara Erişim](#niteliklere-ve-metotlara-erişim)
  - [Constructor(Kurucu/Yapıcı) Metotlar](#constructorkurucuyapıcı-metotlar)
- [Diziler](#diziler)
  - [Dizilerin Genel Mantıkları](#dizilerin-genel-mantıkları)
  - [Dizileri Parametre Olarak Göndermek](#dizileri-parametre-olarak-göndermek)
  - [Dizileri Fonksiyonlardan Geri Döndürmek](#dizileri-fonksiyonlardan-geri-döndürmek)
  - [Tek Boyutlu Diziler](#tek-boyutlu-diziler)
  - [Çok Boyutlu Diziler](#çok-boyutlu-diziler)
  - [Sütun Kapasiteleri Farklı Matris Oluşturma(Düzensiz Diziler)](#sütun-kapasiteleri-farklı-matris-oluşturmadüzensiz-diziler)
- [Yardımcı Sınıflar](#yardımcı-sınıflar)
  - [Array Sınıfı ve Metotları](#array-sınıfı-ve-metotları)
  - [Math Sınıfı ve Metotları](#math-sınıfı-ve-metotları)
  - [String Sınfı ve Metotları](#string-sınfı-ve-metotları)

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

| Keywords |          |            |           |              |
| -------- | -------- | ---------- | --------- | ------------ |
| abstract | continue | for        | new       | switch       |
| assert   | default  | goto       | package   | synchronized |
| boolean  | do       | if         | private   | this         |
| break    | double   | implements | protected | throw        |
| byte     | else     | import     | public    | throws       |
| case     | enum     | instanceof | return    | transient    |
| catch    | extends  | int        | short     | try          |
| char     | final    | interface  | static    | void         |
| class    | finally  | long       | strictfp  | volatile     |
| const    | float    | native     | super     | while        |

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
> Main metodu yazılırken, args yerine başka bir isimlendirme yapılabilir. Ancak genellikle args sözcüğü kullanılır ve bu sözcük arguments sözcüğünün kısaltmasıdır. Arguments ile ifade edilen kısım, sınıf çalıştırılırken JVM tarafından bu sınıfa verilen parametrelerdir.
# Escape Karakterler
| Karakter | Açıklama                                 |
| -------- | ---------------------------------------- |
| \t       | Tab boşluk ekler.                        |
| \b       | Bir önceki karakteri siler.              |
| \n       | Bir satır aşağı atlar.                   |
| \r       | Metine satır başı ekler.                 |
| \f       | Sayfa sonunu belirlemek için kullanılır. |
| \'       | Tek tırnak eklemek için kullanılır.      |
| \"       | Çift tırnak eklemek için kullanılır.     |
| \ \      | Ters eğik çizgi eklemek için kullanılır. |
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
| Etiket     | Açıklama                                                             | Örnek                       |
| ---------- | -------------------------------------------------------------------- | --------------------------- |
| @author    | Class'ı yazan kişi.                                                  | @author Berkcan Serbest     |
| {@code}    | Metodun kullanım örneğini vermek için.                               | {@code ...}                 |
| @exception | Metot istisnası ve açıklaması.                                       | @exception istisna açıklama |
| @param     | Değişkenler, değişken tipleri, ve bu değişkenlerin açıklamaları.     | @param değişken-açıklama    |
| @return    | Metottan bir değer dönüyorsa açıklaması.                             | @return açıklama            |
| @see       | Başka bir metot ya da açıklamaya referans göstermek için kullanılır. | @see referans               |
| @since     | Metodun oluşturulma tarihi.                                          | @since tarih                |
| @version   | Sınıfın versiyon numarası.                                           | @version versiyon numarası  |
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
| Type    | Size   | Range                |
| ------- | ------ | -------------------- |
| byte    | 8  bit | -128 to 127          |
| short   | 16 bit | -32,768 to 32,767    |
| int     | 32 bit | -2^31 to 2^31-1      |
| long    | 64 bit | -2^63 to 2^63-1      |
| float   | 32 bit | 1.4e-045 to 3.4e+038 |
| double  | 64 bit | 4.9e-324 to 1.8e+308 |
| char    | 16 bit | 0 to 65.535          |
| boolean | 1  bit | true or false        |
> String, ilkel(primitive) veri tipi değildir. String karakter(char) kümelerini tutmak için tasarlanmış bir sınıftır.
# Temel Operatörler
Java dilinde operatörler birçok işlemi yapabilmemize olanak tanır. Örneğin; matematiksel operatörlerle birlikte aritmetik işlemler yapabilir, ilişkisel operatörlerle verileri kıyaslayabilir, atama operatörleri ile değişkenlerin değerlerini değiştirebiliriz.
- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörleri
- Koşul Operatörleri
- Mantıksal Operatörler

## Atama Operatörleri
| Operatör | Açıklama                                                                                   | Örnek                                     |
| -------- | ------------------------------------------------------------------------------------------ | ----------------------------------------- |
| =        | Basit atama operatörüdür. Operatörün sağındaki değeri solundaki değişkene atar.            | C = 4 + 5 **--ya da--** C = "Kodluyoruz"; |
| +=       | Operatörün sağındaki değeri solundaki değerle toplayıp sonucu solundaki değişkene atar.    | C += A; -**-ya da--** C += 5;             |
| -=       | Operatörün sağındaki değeri solundaki değerden çıkartıp sonucu solundaki değişkene atar.   | C -= A; **--ya da--** C-=5;               |
| *=       | Operatörün sağındaki değeri solundaki değerle çarpıp sonucu solundaki değişkene atar.      | C *= A; **--ya da--** C *= 5;             |
| /=       | Operatörün sağındaki değeri solundaki değerle bölüp sonucu solundaki değişkene atar.       | C /= A; **--ya da--** C /= 5;             |
| %=       | Operatörün sağındaki değerin solundakine göre modunu alıp sonucu solundaki değişkene atar. | C %= A; **--ya da--** C %= 5;             |
## Aritmetik Operatörler
> Matematiksel işlemleri programlama dilinde uygulamamızı sağlar.

| Operatör | Açıklama   |
| -------- | ---------- |
| +        | Toplama    |
| -        | Çıkarma    |
| *        | Çarpma     |
| /        | Bölme      |
| %        | Mod Alma   |
| ++       | 1 Arttırma |
| --       | 1 Eksiltme |
## Karşılaştırma Operatörleri
> İki nesnenin birbirleriyle olan durumlarını kontrol eder.

| Operatör | Açıklama      |
| -------- | ------------- |
| ==       | Eşitlik       |
| !=       | Eşit Değil    |
| >        | Büyüktür      |
| <        | Küçüktür      |
| >=       | Büyük Eşittir |
| <=       | Küçük Eşittir |
## Mantıksal Operatörler
> Nesnelerin veya ifadelerin mantıksal karşılaştırmalarını yapmak için kullanılır. True veya False sonuç döndürür.

| Operatör | Açıklama |
| -------- | -------- |
| &&       | Ve       |
| \|\|     | Veya     |
| !(&&)    | Değil    |

## Koşul Operatörü
> İfadelerin sonucunda oluşacak olayları belirler.

```Java
int a = 5;
boolean b = (a==1); // False
a = b ? 1 : 0;
System.out.println(a);

//Output: 0
```
# Kullanıcıdan Veri Alma
Java'da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Java'da bulunan sınıfları kullanabilmemiz için bu sınıfları kendi sınıfımıza import etmemiz gerekir. Import ifadeleri sınıfın en başına yazılır.
```Java
import java.util.Scanner;
```
Import ettiğimiz Scanner sınıfından bir nesne oluşturuyoruz ve kullanıcıdan verileri almak için ilgili değişkenleri oluşturuyoruz. Değişkenlere veri almak için, değişkenin türüne göre Scanner sınıfından ilgili metotları kullanmamız gerekiyor. Değişken 'integer' türünde ise 'input.nextInt()' ya da 'double' türünde ise 'input.nextDouble()' metotlarını kullanabiliriz.
```Java
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(system.in);
        int sayi1, sayi2;

        System.out.print("1. Sayıyı Girin: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        sayi2 = input.nextInt();

        System.out.print("1. Sayı: " + sayi1);
        System.out.print("2. Sayı: " + sayi2);
    }
}
```
### Veri Tipine Göre Scanner Metotları
Metot|Açıklama|Örnek|
-----|--------|-----|
nextBoolean()|Boolean tipinde veri almak için|boolean isTrue = input.nextBoolean();
nextByte()|Byte tipinde veri almak için|byte byteData = input.nextByte();
nextShort()|Short tipinde veri almak için.|short shortData = input.nextShort();
nextDouble()|Double tipinde veri almak için|double doubleData = input.nextDouble();
nextFloat()|Float tipinde veri almak için|float floatData = input.nextFloat();
nextInt()|Integer tipinde veri almak için|int intData = input.nextInt();
nextLong()|Long tipinde veri almak için|long longData = input.nextLong();
nextLine()|String türünde veri alamk için|String strData = input.nextLine();
# Kod Blokları(Scope)
İki küme parantezi "{" ve "}" arasında kalan kod kesimine blok(scope) denir. "{" işareti bir kod bloğunu başlatır ve "}" işareti başlatılan kod bloğunu bitirir. Bu işaretler kodun sınırlarını belirlemekte kullanılır. Herhangi bir değişken, tanımlandığı kod bloğu içinde fiziksel olarak vardır ve o kod bloğu içine yazılan kod kesimlerinden erişilebilirdir. Bir blok içinde aynı değişken adı birden fazla kez kullanılamaz.

İç içe bir kod yapısını ve öğelerin bir birlerine aitlik durumlarını kod blokları ile sağlarız. Ayrıca her kod bloğundan sonra bir tab boyutunda boşluk bırakılır. Bunun sebebi kodun okunabilirliğini arttırmaktır. Kodun okunabilirliği bir yazılımcı için çok önemli bir noktadır.
# Karar Yapıları
## If-Else Mekanizması
Java'da mantıksal ve koşullu ifadeler için "if-else" yapısı kullanılır. Programlamada if ve else deyimleri çok önemlidir ve kodlamanın temel yapı taşlarını oluşturur. If ve Else yapısı ile programımız içerisindeki algoritmalarımızı oluştururuz.

Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir. If-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır. Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında Switch-Case gibi yapılarda kullanılmaktadır. If-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır.
- Programda belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için If kullanılır.
- Aynı koşul yanlışsa yürütülecek bir kod bloğu belirtmek için else deyimi kullanır.
- İlk koşul yanlışsa, kontrol edilecek yeni bir koşul belirtmek için else if deyimi kullanılır.
- Yürütülecek bir çok alternatif kod bloğu belirtmek için switch deyimi kullanılır.
- if - else if
  - if - else if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe balı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmaya devam eder.
## Switch-Case Mekanizması
Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.
```Java
switch(value) {
    case x:
        // değer x'e eşitse bu kod bloğu çalışır
        break;
    case y:
        // değer y'ye eşitse bu kod bloğu çalışır
        break;
    default:
        // değer hiç bir duruma eşit değilse bu kod bloğu çalışır.
}
```
Burada dikkat edilmesi gereken durum switch içine yazdığımız değerleri case deyimi ile kontrol ediyoruz. Switch içinde ki herhangi bir değer caselerden biri ile uyuşuyorsa o case içindeki kod bloğu çalışır.

  Switch case ifadeleri, çalışma mantığı açısından If-Else ifadeleri ile benzerlik göstermektedir. Ancak çok fazla koşul gerektiren durumlarda If-Else ifadelerinin yerine Switch ifadelerin tercih edebiliriz. Bu sayede uzun kod satırlarının aksine daha sade ve düzenli bir görünüm elde edebilir ve kodumuzun okunabilirliğini arttırmış oluruz.
> Not: "switch-case" yapısında eğer her case'in sonuna "break" ifadesi koymazsak aramış olduğu koşulu bulana kadar tüm case'lere girip o kod bloklarını çalıştıracaktır.

# Döngü Yapıları
Döngüler, belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan progralama kodlarıdır. Döngü deyimleri, bahsedilen komut parçalarının belirltilen şartlar gerçekleştikçe tekrar tekrar işlenmesini sağlar. Java'da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır. For döngüsünün, for-each olarak anılan farklı bir kullanımı da vardır.

Döngü yapıları kodumuzun belirli kısımlarının döngüye girmesini ve birden fazla kez çalışmasını sağlar. Döngüler bir koşula bağlanır ve bu koşul var olduğu sürece aynı kod bloğu çalışmaya devam eder. Koşul artık sağlanmıyorsa döngü sona erer.
## While Döngüsü
While döngüsü Java'nın temel yapı taşlarından bir tanesidir. While terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına boolean bir değer girilir. Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır. Bu parantezler içindeki değer doğru(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.
```Java
while (condition) {
    //statements
}
```
Burada belirtilen koşul, boolean bir ifadedir. Bu koşul true olduğu sürece döngü devam eder. Koşul false olursa döngü sonlanır. Koşul ifadesi parantez içine yazılır. Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.

While döngüsü genellikle işlemin kaç kez tekrar edeceği bilinmediği durumlarda kullanılır. Örneğin; müşterinin hesabına giriş şifresini kaç kez yanlış gireceğini bilemeyiz. Bu nedenle bu tarz durumlarda "while" döngüsü tercih edilir.
## Do-While Döngüsü
Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır, fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.
```Java
do {
    //statements
} while (condition);
```
Koşul döngünün sonunda kontrol edilir. Bu durumda, koşul false olsa bile döngü bir kere çalıştırılmış olur.
Java'da Do-While ve While döngüleri arasındaki tek fark, Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir. Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir. While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.
## For Döngüsü
For döngüsü de While döngüsü gibi Java'nın temel yapı taşlarından bir tanesidir. Döngüler ile tekrar eden işlemleri daha düzenli ve sistematik şekilde yapabiliriz. Döngüler aynı zamanda daha az kod yazmamızı sağlar. For döngüsünü genellikle döngü sayısını bildiğimiz durumlarda kullanmaktayız. For döngüsünde aynı zamanda döngümüzdeki sayacımızın başlangıç, bitiş ve artış/azalış değerlerini tanımlayabilmekteyiz.
```Java
for(initial value; condition; increment value) {
    //statements
}
```
- Initial Value
  - Döngünün başlangıç değerini ifade eder. Bir nevi sayaç görevi görmektedir.
- Condition
  - Döngünün çalışması için gerekli koşulu ifade eder. Koşul doğruysa(true) döngü tekrar eder, yanlış ise(false) döngü sona erer.
- Increment Value
  - Artış değerini ifade eder. Döngü her tekrar ettiğinde başlangıç değerini belirtilen değer kadar arttırır.
## For-Each Döngüsü
Java'da For-Each deyimi adından da anlaşılacağı gibi bir döngüyü ifade eder. Genelde dizilerdeki ve listelerdeki elemanlara daha hızlı bir şekilde ulaşmak için kullanılan kısa bir yöntemdir. Kısacası for döngüsünün modifiye edilmiş halidir. Aynı for döngüsündeki gibi For-Each döngüsü de "for" deyimiyle oluşturulur. För deyiminin ardından parantez içerisine iki parametre girilir ve parametreler iki nokta(:) ile ayrılır. Sol tarafa dizinin döndüreceği veri tipini ve döngü içerisinde dizinin elemanı olarak kullanılacak değişken tanımlanır, sağ tarafta ise elemanlarına ulaşmak istediğimiz dizinin adı yazılır.
```Java
for (datatType variableName : arrayName) {
    // statements
}
```
## While | Do-While | For Arasındaki Farklar
Hiç bir algoritmada hangi döngünün kullanılması gerekiği ile ilgili kesin bir yargı ve kural söz konusu değildir. Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler. Ama genellikle, kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği durumlarda While ya da Do-While döngüsü kullanılırken, diziler gibi, tekrar sayısı belirli olan durumlarda ise for döngüsü kullanılması tercih edilir.
# Continue ve Break Komutları
- Continue Deyimi:
  - Java'da "continue" deyimi, döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.
- Break Deyimi:
  - Bazı durumlarda, döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz. Bu gibi durumlarda "break" deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü anında sonlandırır.
# Metotlar(Fonksiyonlar)
Java'da metotlar sadece çağırıldığında kullanılan kod bloklarıdır. Metotlara bir diğer adlandırma olarak "Fonksiyonlar" da denilmektedir. Bunun sebebi bu kod yapısının matematikte ki fonksiyon mantığına çok benzemesidir. Java'da metotlarımızın içerisine veri aktarmak için ise parametre girebilmekteyiz.
## Neden Metot Kullanırız?
Programlamada metot kullanmamızın sebebi, bir çok yerde kullanacağımız kodu tek seferde yazıp lazım olduğunda çağırmaktır. Örnek vermek gerekirse, programımız içerisinde bir çok yerde matematikteki "üs alma" işlemini gerçekleştirmiş olalım. Her defasında üs alma işlemi için aynı kodları yazmak yerine bu kodları metot olarak yazıp, lazım olduğunda çağırmak işlerimizi kolaylaştıracaktır. Ayrıca metotlar "Nesne Yönelimli Porgramlamanın" yapı taşlarındandır. Programlamada karmaşık bir problemi daha küçük parçalara bölmek programımızın anlaşılmasını kolaylaştırır ve yeniden kullanılabilir hale getirir.
```Java
    <dataType> <methodName> (parameter1, parameter2, ...) {
        // statements
    }
```
- Data Type
  - Metotlar geriye bir değer döndürebilir, bu değerin veri tipi metot tanımlanırken belirtilir. Örneğin; metot geriye "integer" veri tipinde bir değer döndürecekse "dateType" kısmına int anahtar sözcüğü yazılmalıdır. Eğer metotlar geriye bir değer döndürmeyecekse "void" anahtar sözcüğü kullanılır.

- Method Name
  - Metodumuzun benzersiz ismidir ve bu isimlendirme ile metotlar çağırılır.

- Statements
  - Bu kısım metot çağırıldığı zaman, program tarafından çalışacak kod bloğudur.

- Parameters (parameter1/parameter2)
  - Bu kısım metot içerisine aktarmak istediğimiz verilerdir ve parametre olarak adlandırılır.
## Return ve Void
Java'da iki tür metot mevcuttur bunlar; Return(geri dönüşü olan), Void(geri dönüşü olmayan) metotlar. Return metotlar çağırıldığında geriye bir değer döndürürken, Void metotlar geriye bir değer döndürmemektedir.
### Return Metotlar
Java'da oluşturduğumuz bir metodun bir değer üretmesi istendiğinde, "return" deyimi kullanılır. Metot içerisinde yazılan kod parçacıkları çalışacaktır, buna ek olarak metot içinde oluşturduğumuz bir veriyi dışarıya aktarma ihtiyacı duyabiliriz, bu durumlarda "return" deyimi kullanılır. Geri dönecek değerin veri tipi, metot tanımlanırken verdiğimiz veri tipi ile aynı olmalıdır. Aksi halde derleyici tarafından hata alınır.
### Void Metotlar
Java'da yazılan bir metodun geriye bir değer döndürülmesi istenmiyor, sadece metot içindeki kod bloğunun çalışması isteniyor ise "void" deyimi kullanılır. Metot tanımlarken veri tipi kısmına "void" deyimi yazılması yeterlidir. Void metotlar içerisinde "return" deyimi kullanılmamalıdır.
## Metotlarda Over-Loading(Aşırı Yüklenme)
Java'da iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir. Bu kullanımın amacı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. Overloading işlemi "Nesne Yönelimli Programlamada" da çok kullanılmaktadır.
## Recursive(Özyineli) Metotlar
Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. Bu teknik karmaşık problemleri, çözmesi daha kolay problemlere ayırmayı sağlar. İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken durum en son aşama için koşul koyulmasıdır.
# Lokal Değişken Kavramı
Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler. Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler tanımlandıkları({...}) kod blokları arasında kullanılır.
# Sınıf ve Nesne Kavramları
> **Nesnenin TDK Tanımı:** Belli bir ağırlığı ve hacmi, rengi olan her türlü cansız varlık, şey, obje.
> 
> **Nesnelere Örnek:** Araba, telefon, elma, pense, kalem gibi günlük hayatta kullandığımız şeyler.

Bildiğimiz gibi her nesnenin kendine ait nitelikleri ve davranışları vardır. Nesneler birbirlerinden farklıdır ve kendi varoluşlarına göre davranılar ve kendi niteliklerine sahiptirler.

> **Nitelik:** Nitelik kavramı, bir nesnenin özellikleridir ve nesnenin mevcut durumunu tanımlar. Mesela bir ördeğin rengi o ördeğin niteliklerindendir. Bir ördeğin rengi siyah, diğer ördeğin rengi beyazdır. Bu durumda her iki nesne(yani ördek) nitelikleri sebebi ile birbirlerinden bağımsızdılar.
> 
> **Davranış:** Bir nesnenin kendine özel yaptığı eylemlerdir. Yine ördek örneğine bakarsak, bir ördek uçabiliyorken diğer bir ördek fiziksel durumu gereği uçamayabilir.
## Sınıf(Class) Nedir?
NYP(OOP) sınıflar ve nesneler üzerine kurulmuştur, "Sınıflar" bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya kılavuzlardır. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu özellikler nesnenin ne tür nitelikleri ve davranışları olacağını belirler.

Mesela "Araba" bir sınıftır. Arabalar; renk, hız, vites sayısı, yakıt türü vb. gibi bir sürü niteliğe sahip olabilirler. Ayrıca bazı arabalara özel davranışlar olabilir, park sensörü, oto pilot, hız sabitleme gibi arabaların kendilerine özel davranışları da olabilir. Bir araba üretilirken, bir yapım kılavuzuna ihtiyaç vardır. Programlama da bu kılavuzlara "Sınıf(Class)" denir.
## Nesne Yönelimli Programlama(OOP) Nedir?
Nesne Yönelimli Programlama(Object Oriented Programming), sınıflar ve nesneler kavramına dayanan bir programlama yaklaşımıdır. Bu yaklaşımın amacı, ihtiyaç duyulan programı daha küçük parçalara bölerek, yönetilebilir ve yeniden kullanılabilir hale getirmektir. Her küçük parçanın kendine ait özelliği, verileri ve diğer küçük parçalarla nasıl iletişim kuracağı bilgileri bulunur.

NYP'de programlar, nesnelerin birbirleriyle etkileşime geçmeleri sağlanmasıyla tasarlanır. Bizler gerçek hayattaki karmaşıklığı bir şekilde modelleyerek bunu bilgisayarın anlamasını sağlamaktayız. Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Nesne Yönelimli Programlama ile bizler yapacağımız her şeyi bilgisayarın anlayacağı şekilde modelleyip, "nesne" halinde aktarıyoruz. Böylelikle gerçek hayatta bizim için geçerli olan nesneleri artık bilgisayarların anlayacağı hale getirmiş oluyoruz. Tabii ki kullanılan programlamla dilinin bizlere verdiği imkanlar dahilinde. Böylelikle kodlayan kişi ile bilgisayar arasında dilden bağımsız bir anlaşma, bir felsefe ortaya çıkmış oluyor. Artık bizim için "araba" nesnesi ne anlama geliyorsa, bilgisayar için de aynı anlama geliyor.
### Neden Nesne Yönelimli Programlama?
- NYP, hızlı ve uygulaması kolay bir yaklaşımdır.
- NYP, programlar için net bir yapı sağlar.
- NYP, "Don't Repeat Yourself" yani "Kendini Tekrar Etme" ilkesini uygular ve kodun bakımını, düzenlenmesini ve hata ayıklamasını kolaylaştırır.
- NYP, daha az kod ve daha kısa geliştirme süresiyle, yeniden kullanılabilir uygulamalar oluşturmayı mümkün kılar.
- NYP, yapıya daha sonradan yeni özellikler ekleyerek genişletebilir olmasını sağlar.
- NYP, problemleri gerçek hayattaki işlemlere göre modeller.
## Modelleme ve Soyut Düşünme
Gerçek hayattaki problemleri bilgisayarın sanal ortamında çözebilmek için, ilk önce problemin uygun şekilde bilgisayar ortamına aktarılması gerekmektedir. Bu işlem "soyutlama(abstraction)" ya da "modelleme(modeling)" olarak adlandırılır.

Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Model, var olan ya da gerçekleştirilmesi planlanan bir sistemi anlamak ya da anlatmak üzere oluşturulabilir ve birçok farklı alanda etkili bir şekilde kullanılmaktadır. Örneğin, bir toplu konut inşaatını müşterilerine tanıtmak isteyen bir inşaat firması, binaların yerleşimlerini, renk ve göreli büyüklüklerini görsel olarak ifade eden maket ya da maketler hazırlar. Bu maketi inceleyen bir kimse, almak istediği konutun nere olduğunu, okul binasına yakınlığını ya da anayola ulaşımın nasıl olduğunu görerek değerlendirebilir. Burada model makettir ve "hedef sistemi anlatmak" amacını yerine getirmektedir.

Bir sistemle ilgili birden çok model oluşturulabilir. Tek bir model ile sistemin tamamını görmeye çalışmak yerine, üzerinde çalışan sistemin farklı yönlerini öne çıkaran modeller hazırlanabilir. Örneğin inşaat firması toplu konutu müşterilere anlatmak üzere estetik tasarımı ön plana çıkan bir maket hazırlarken, bu toplu konut projesindeki binaların elektrik tesisatı için farklı, su tesisatı için farklı, genel daire görünümü için farklı projeler hazırlar. Böylece aynı sistemin farklı yönleriyle ilgilenen kimseler, yalnızca kendilerini ilgilendiren yönü öne çıkaran model üzerinde çalışma olanağı bulurlar.

Modelin mutlaka elle tutulur olması da gerekmez. Bilgisayar benzetimi ile de çeşitli modeller oluşturulabilir. Örneğin bir uçağın havadaki hareketlerini incelemek üzere geliştirilmiş bir bilgsayar benzetimi ile uçak modellenebilir. Kanat uzunluğu ya da gövde eğimi gibi parametrelerle oynanarak uçağın farklı hava koşullarında nasıl davranacağı anlaşılmaya çalışılabilir. Burada, sistemin davranışını anlamak amacıyla, sanal ortamda oluşturulmuş bir model söz konusudur.
## Sınıflar(Classes)
Java, Nesne Yönelimli Programlama dilidir. Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin; gerçek hayatta araba bir nesnedir. Otomobilin ağırlık ve renk gibi değişkenleri ve sürüş/fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodları soyut bir kavrama dönüştürmektir.

Sınıflara ait nitelikler ve davranışlar vardır. Programlamada nitelikler için değişkenler(variable), davranışlar için ise metotlar(method) tanımlanır.
```Java
class <class_name> {
    <variables>;
    <methods>;
}
```
Java'da "sınıf" tanımlanırken "class" deyimi kullanılır ve sonrasında sınıf ismi yazılır. Java'da sınıf isimlerinin her zaman büyük harf ile başlaması gerekmektedir ve oluşturulan Java dosyası ile aynı isimde olmalıdır.

Sınıf ismini verdikten sonra "{" karakteri ile sınıfa ait kapsamı yani kod bloğunu oluşturup, "}" karakteri ile de sınıfa ait kapsamı kapatırız. Böylece, sınıfımız için yazacağımız kodları "{}" arasındaki alana yazmış oluruz.

Sınıflar nesneler oluşturabilmek için yazılım dünyasında oluşturulmuş şablonlardır. Bu şablon nesne ile ilgili modellenecek tüm özellikleri ve davranışları bir taslak halinde kodlanmasını sağlar. Böylece, tanımlanmış bir sınıftan binlerce nesne oluşturabiliriz.
## Nesne Oluşturma
Sınıflar nesneleri tarif eden şablonlardır. Nesneler ise bu şablonlardan üretilen fiziksel yapılardır. Her üretilen nesne "Heap" hafıza bölgesinde tutulur. Böylece sınıftan fiziksel karşılığı olan bir yapı elde etmiş oluruz. Sınıftan onlarca, yüzlerce nesne oluşturabiliriz. Hepsi de hafızada farklı referans adreslerini gösterir.
```Java
ClassName object = new ClassName();
```
- ClassName
  - Nesne oluşturmak istediğimiz sınıfı belirtiyoruz. Bu sınıfın daha öncesinde projede tanımlanmış olması(import) gerekmektedir.
- object
  - Oluşturacağımız nesneye verilen isimdir ve aynı isimde birden fazla nesne oluşturulamaz.
- new
  - Java'da yeni bir nesne üretmek için "new" anahtar kelimesi kullanılır.
- ClassName()
  - Sınıfa ait Yapıcı(Constructor) metodu temsil eder. Varsayılan olarak parametresiz tanımlanır.
### Niteliklere ve Metotlara Erişim
Oluşturulan nesnenin niteliklerine veya metotlarına erişmek için nokta(.) kullanılır. İlgili nesnenin isminin sonuna nokta koyularak erişilmek istenilen niteliğin ya da metodun ismi yazılır. Metodun varsa parametresi girilir.
```Java
//Niteliklere ulaşmak için.
object.attributeName();
// Metotlara ulaşmak için.
object.methodName();
```
## Constructor(Kurucu/Yapıcı) Metotlar
Kurucu metotlar sınıf tasarlanırken yazılır. Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz. Eğer sınıf içinde hiç kurucu metot tanımlamazsanız parametresiz boş bir kurucu metot Java tarafından otomatik olarak tanımlanır.

Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne üretme aşamasında çalıştırılan özel metotlardır(fonksiyonlardır). Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır. Dönüş tipi veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.

> "new" anahtar kelimesi ile nesne üretirken kurucu metot çağırımı yapılır. İki tip kurucu metot vardır.
> - Parametresiz Varsayılan Kurucu Metot
> - Parametreli Kurucu Metot
# Diziler
## Dizilerin Genel Mantıkları
Java'da Diziler(Arrays), her değer için ayrı değişkenler oluşturmak yerine, birden çok değeri tek bir değişkende depolamak için kullanılır. Değişkenler hafızada tek bir değer tutmamızı sağlar. Fakat bazı durumlarda, birden çok veriyi bir arada bulundurmak isteriz. Örneğin, bir sınıfta okuyan 20 öğrenci olsun. Bu 20 öğrenci için hafızada ayrı ayrı 20 tane değişken oluşturmak yerine, tek bir değişken kullanarak 20 öğrencinin koleksiyonunu tutmak isteyebiliriz.

Bu gibi durumlarda dizileri kullanırız. Dizi, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza birimidir. Kısaca, dizileri aynı türden elemanları gruplamak için kullanırız. Dizi oluşturduktan sonra dizinin içerisindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz. Ayrıca, çok boyutlu diziler oluşturmak da mümkündür. Tek boyutlu dizi kullanabileceğimiz gibi 2 veya 3 boyutlu diziler de oluşturabiliriz. 2 boyutlu dizilere matris denir.

Dizi(Array) kavramı programlama dillerinde bir veri tipini ifade eder. Bu veri tipi liste halindeki verileri bir arada tutan yapıya denilir. Bu ardışık yapıya ait elemanlara indis yoluyla erişim sağlanabilir. Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir. Dizi indisleri her zaman 0'dan başlar o yüzden dizinin son elemanının değeri, dizi boyutuna eşit değildir ve bu dikkat edilmesi gereken bir konudur.

Dizi'nin hafızada bir başlangıç değeri olur ve ardışık olan diğer elemanlar sırayla hafızaya yerleştirilir. Diziler "new" anahtar sözcüğüyle oluşturulur. Böylece, Heap Hafıza bölgesinde yer kaplar.

Diziler, veri tipi ve [] parantezler ile belirtilir. Hafızadan yer alıp diziye alan ayırabilmek için "new" anahtar kelimesi kullanılır.
```Java
double[] myList = new double[10];
```
## Dizileri Parametre Olarak Göndermek
Tanımladığımız dizileri fonksiyonlara parametre olarak gönderebiliriz.
```Java
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i] + " ");
    }
}
```
printArray(int[] array) olarak tanımladığımız kısım, diziyi yerel değişken olarak fonksiyona gönderdiğimiz noktadır. Java'da tüm değişkenler "Pass by Value" yöntemiyle geçilir. Bu, sizin tanımladığınız değişkenin, nesnenin veya dizinin birebir kopyası oluşturulur. Bu kopya değer, fonksiyona yerel değişken olarak gider.
## Dizileri Fonksiyonlardan Geri Döndürmek
Fonksiyonlar belli bir işi yapıp sonucunda değer dönebilen veya dönmeyen kod bloklarıdır. Fonksiyonlar için altın kural, her fonksiyonun tek bir işi olmalıdır. Örneğin; dizi ortalaması alma işi yapan bir fonksiyon dizileri ekrana yazdırma işini yapmamalıdır. Veya dizilerin ortalamasını alma işi ile dizileri toplama işlemi aynı fonksiyon içinde olmamalıdır.
```Java
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];
    for (int i = 0, j = result.length; i < list.length; i++, j--) {
        result[j] = list[i];
    }
    return result;
}
```
public static int[] olarak belirlediğimiz kısım, fonksiyonun dizi döndüreceğini ve dizinin veri tipini ifade ediyor.
## Tek Boyutlu Diziler
Tek boyutlu diziler bastiçe, aynı türden elemanların listesini tutan bir yapıdır. Dizi oluşturmak için, önce dizide yer alacak elemanların türü belirtilir, veri tipinden sonra köşeli parantezler( [ ] ) konulur, köşeli parantezlerden sonra diziye bir isim verilir.

Diziler "new" deyimiyle oluşturulur. Dizi oluştururken kapasite değeri vermek zorunludur. Kapasite değeri, dizinin kaç eleman barındıracağını belirtir.
Dizi indeksleri "0"'dan başlar ve eleman sayısının "1" eksiğine kadar gider.
Eğer dizinin aralığı dışında bir indekse erişmeye çalışırsak, "IndexOutOfBoundsException" hatası meydana gelir.
Her dizinin length adında bir özelliği bulunur. Bu özelliği kullanarak dizinin kapasitesini öğrenebilirsiniz.
## Çok Boyutlu Diziler
Java'da çok boyutlu diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.İki boyutlu dizilerde de tek boyutlu diziler gibi indis değeri 0'dan başlar. Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.
|-       |Column 0|Column 1|Column 2|
---------|--------|--------|--------|
**Row 0**|[0][0]  |[0][1]  |[0][2]  |
**Row 1**|[1][0]  |[1][1]  |[1][2]  |
**Row 2**|[2][0]  |[2][1]  |[2][2]  |

Bir değişkenin dizi olduğunu köşeli parantezler ile belirttiğimiz gibi çok boyutlu dizileri de köşeli parantezler ile belirtiriz. Çok boyutlu dizi oluştururken, boyut sayısı kadar köşeli parantez belirtilir. İlk köşeli parantez birinci boyutu(satırları), diğerleri ise ikinci boyutu(sütunları) belirtir.
```Java
degiskenTipi[][] arrayIsmi;  // 2 boyutlu matris dizisi
```
## Sütun Kapasiteleri Farklı Matris Oluşturma(Düzensiz Diziler)
Farklı sütun değerine sahip dizilere "Ragged Arrays" yani düzensiz diziler denir. Başka bir açıdan bakıldığında ise, 2 boyutlu dizileri, dizilerin dizisi(array of arrays) olarak düşünmek doğru olur. Yani iki boyutlu dizileri tek boyutlu diziler oluşturur.

Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir. Yalnızca ilk boyutun(en soldaki) kapasitesini belirtmek yeterlidir. Diğer boyutların kapasitesini dinamik olarak belirtebiliriz.
```Java
int[][] matrix = new int[3][];
matrix[0] = new int[1] // 0. satır, 1 sütuna sahip olacak. [0][0]
matrix[1] = new int[2] // 1. satır, 2 sütuna sahip olacak. [1][0] ve [1][1]
matrix[2] = new int[3] // 2. satır, 3 sütuna sahip olacak. [2][0] ve [2][1] ve [2][2]
```
# Yardımcı Sınıflar
## Array Sınıfı ve Metotları
Java.util paketindeki Arrays sınıfı, Java Collection Framework'ün bir parçasıdır. Bu sınıf, Java dizilerini dinamik olarak oluşturmak ve bunlara erişmek için statik metotlar sağlar. Yalnızca statik metotlar ve Object sınıfının metotlarından oluşur. Bu sınıfın metotları, sınıf adının kendisi tarafından kullanılabilir.
```Java
Arrays.fill(array);

Arrays.sort(array);
```
Metot|Açıklama|
-----|--------|
Arrays.toString()|Diziye ait elemanları direkt ekrana bastırmak için kullanılır.
Arrays.fill()|Dizideki elemanları ya da belli bir indis aralığındaki elemanların değerlerini değiştirmek için kullanılır.
Arrays.sort()|Dizilerdeki elemanları sıralamak için kullanılır.
Arrays.binarySearch()|Sıralanmış(Arrays.sort()) dizideki bir elemanın indis sırasını bulmak için kullanılır.
Arrays.copyOf()|Mevcut diziden belli uzunlukta yeni bir dizi oluşturmak için kullanılır.
Arrays.copyOfRange()|Mevcut diziden belli aralıkta yeni bir dizi oluşturmak için kullanılır.
Arrays.equals()|Mevcut iki dizinin elemanlarının eşitliğini kontrol etmek için kullanılır.
## Math Sınıfı ve Metotları
Java önceden yazdığı sınıflar ile bazı durumları kolaylaştırmıştır. Bu sınıflardan bir tanesi de Math sınıfıdır. Adından da anlaşılacağı üzere Java'da matematiksel işlemler için fonksiyonlar sunan sınıftır. Math sınıfı varsayılan olarak Java projelerinde bulunduğundan dolayı dışarıdan import etmeye gerek duymaz ve Math sınıfının fonksiyonları static olarak tanımlandıklarından dolayı sınıftan bir nesne türetmeye gerek yoktur.
```Java
Math.abs(x);

Math.round(x);
```
|Metot|Açıklama|Veri Dönüş Tipi|
|-----|--------|---------------|
|abs(x)|X'in mutlak değerini verir.|double \| float \| int \| long
|acos(x)|X'in arkkosinüsünü radyan cinsinden verir.|double
|asin(x)|X'in arksinüsünü radyan cinsinden verir.|double
|atan(x)|X'in arkini radyan cinsinden verir.|double
|atan2(y, x)|Dikdörtgen koordinatların(x,y) kutupsal koordinatlara(r,teta) dönüştürülmesinden teta açısını verir.|double
|cbrt(x)|X'in küp kökünü verir.|double
|ceil(x)|Ondalıklı sayıyı yukarı yuvarlar.|double
|copySign(x, y)|İkinci kayan nokta y'nin işaretiyle birlikte ilk kayan nokta x'i verir.|double
|cos(x)|X'in kosinüsünü verir (x radyan cinsindendir)|double
|cosh(x)|Çift değerin hiperbolik kosinüsünü verir.|double
|exp(x)|e üzeri x değerini verir.|double
|expm1(x)|e üzeri x'in tersini verir.|double
|floor(x)|Ondalıklı sayıyı aşağı yuvarlar.|double
|getExponent(x)|X'Te kullanılan yansız üssü verir.|int
|IEEEremainder(x, y)|IEEE 754 standardında belirtildiği gibi x ve y üzerindeki kalan işlemi hesaplar.|double
|log(x)|X'in doğal logaritmasını (e tabanında) verir.|double
|log10(x)|X'in 10 tabanındaki logaritmasını verir.|double
|log1p(x)|X ve 1 toplamının doğal logaritmasını (e tabanında) verir.|double
|max(x, y)|En yüksek değere sahip sayıyı verir.|double \| float \| int \| long
|min(x, y)|En düşük değere sahip sayıyı verir.| double \| float \| int \| long
|nextAfter(x, y)|X'in y yönünde bitişiğinde değen nokta sayısını verir.|double \| float
|nextUp(x)|Pozitif sonsuzluk yönünde x'e bitişik kayan nokta değerini verir.|double \| float
|pow(x, y)|X'in değerini y'nin üssüne döndürür.|double
|random()|0 ile 1 arasında rastgele bir sayı verir.|double
|round(x)|En yakın tam sayıa yuvarlanmış x değerini verir.|int
|rint(x)|X'e en yakın ve matematiksel tam sayıya eşit olan çift değeri verir.|double
|signum(x)|X'in işaretini verir.|double
|sin(x)|X'in sinüsünü verir(x radyan cinsindendir).|double
|sinh(x)|Çift değerin hiperbolik sinüsünü verir.|double
|sqrt(x)|X'in karekökünü verir.|double
|tan(x)|Bir açının tanjantını verir.|double
|tanh(x)|Çift değerin hiperbolik tanjantını verir.|double
|toDegrees(x)|Radyan cinsinden ölçülen bir açıyı yaklaşık derece cinsinden ölçülen açısını verir.|double
|toRadians(x)|Derece cinsinden ölçülen bir açıyı yaklaşık radyan cinsinden ölçülen açısını verir.|double
|ulp(x)|X'in en az duyarlıklı(ulp) biriminin boyutunu verir.|double \| float
## String Sınfı ve Metotları
Java'da String sınıfları, char türünde verilerden oluşmuş bir karakter dizisidir, yani karakterlerden oluşur. Java işlerimizi kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar. String sınıfının fonksiyonları static olmadığından dolayı metotlara ulaşmak için öncesinde String bir veri oluşturmamız gerekir.(String sınıfından nesne oluşturmak da denebilir.)

|Metot|Açıklama|Veri Dönüş Tipi|
|-----|--------|---------------|
|charAt()|Belirtilen indisteki(konum) karakteri verir.|char|
|codePointAt()|Belirtilen indisteki karakterin Unicode'unu verir.|int|
|codePointBefore()|Belirtilen indisten bir önceki karakterin Unicode'unu verir.|int|
|compareTo()|İki dizinin karakterlerini Unicode olarak karşılaştırır.|int|
|compareToIgnoreCase()|Büyük/küçük harf duyarlılığını döz ardı ederek iki dizinin karakterlerini Unicode olarak karşılaştırır.|int|
|concat()|Bir dizinin sonuna farklı bir dizi ekler.|String|
|contains()|Bir dizinin, bir dizi karakter içerip içermediğini sorgular.|boolean|
|contentEquals()|Bir dizinin belirtilen CharSequence veya StringBuffer ile aynı karakter dizisini içerip içermediğini kontrol eder.|boolean|
|endsWith()|Bir dizinin belirtilen karakter(ler) ile bitip bitmediğini kontrol eder.|boolean|
|startsWith()|Bir dizinin belirtilen karakter(ler) ile başlayıp başlamadığını kontrol eder.|boolean|
|equals()|İki diziyi karşılaştırır. Dizilerin eşit olup olmadığını kontrol eder.|boolean|
|equalsIgnoreCase()|İki diziyi büyük/küçük harf duyarlılığını göz ardı ederek karşılaştırır. Dizilerin eşit olup olmadığını kontrol eder.|boolean|
|format()|Belirtilen yerel ayarı, biçim dizisini ve bağımsız değişkenleri kullanarak biçimlendirilmiş bir dizi döndürür.|String|
|getBytes()|Diziyi karakterlere ayırır ve karakterlerin Unicode değerlerinden yeni bir byte dizisi oluşturur.|byte[]|
|getChars()|Dizinin karakterlerini parametreler doğrultusunda başka bir diziye aktarır.|void|
|hashCode()|Bir dizinin karma kodunu verir.|int|
|indexOf()|Bir dizide belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir.|int|
|isEmpty()|Bir dizinin boş olup olmadığını kontrol eder.|boolean|
|lastIndexOf()|Bir dizide belirtilen karakterlerin son bulunan oluşumunun konumunu verir.|int|
|length()|Dizinin uzunluğunu verir.|int|
|matches()|Belirtilen regex'e göre dizide eşleşme olup olmadığını kontrol eder.|boolean|
|replace()|Belirtilen hedef değeri dizide arar ve belirtilen yeni değerlerin değiştirildiği yeni bir dizi döndürür.|String|
|replaceFirst()|Belirtilen hedef değeri dizide arar ve ilk bulduğu oluşumu belirtilen yeni değerlerin değiştirildiği yeni bir dizi döndürür.|String|
|replaceAll()|Belirtilen regex ile eşleşen hedef değeri, belirtilen yeni değerlerle değiştirildiği yeni bir dizi döndürür.|String|
|split()|Bir diziyi belirtilen regex'e göre alt diziye böler.|String|
|subSequence()|Belirtilen indislere göre bir dizinin alt dizisi olan yeni bir karakter dizisi verir.|CharSequence|
|substring()|Karakterleri bir diziden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen bitiş konumuna kadar ayıklar.|String|
|toCharArray()|Bir diziyi yeni bir karakter dizisine dönüştürür.|char[]|
|toLoweCase()|Bir diziyi küçük harflere dönüştürür.|String|
|toUpperCase()|Bir diziyi büyük harflere dönüştürür.|String|
|toString()|Bir nesnenin String temsilini döndürür.|String|
|trim()|Bir dizinin her iki ucundaki boşluğu kaldırır.|String|