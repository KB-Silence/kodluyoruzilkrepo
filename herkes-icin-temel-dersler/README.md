# KAYNAK
## **[patika.dev](https://app.patika.dev/)**

## Patika.dev - Herkes İçin Temel Dersler eğitimi kapsamındaki içeriklere göre hazırlanmıştır.  
> Ufak düzeyde değişiklikler ve düzenlemeler yapıldı.

<br>

## **BAŞLIKLAR**
- [KAYNAK](#kaynak)
  - [**patika.dev**](#patikadev)
  - [Patika.dev - Herkes İçin Temel Dersler eğitimi kapsamındaki içeriklere göre hazırlanmıştır.](#patikadev---herkes-i̇çin-temel-dersler-eğitimi-kapsamındaki-içeriklere-göre-hazırlanmıştır)
  - [**BAŞLIKLAR**](#başliklar)
- [Frontend ve Backend'e Giriş](#frontend-ve-backende-giriş)
  - [Frontend Nedir?](#frontend-nedir)
  - [Backend Nedir?](#backend-nedir)
  - [Frontend ve Backend Karşılaştırması](#frontend-ve-backend-karşılaştırması)
- [Algoritma Nedir?](#algoritma-nedir)
  - [Algoritma Neden Gereklidir?](#algoritma-neden-gereklidir)
- [Pseudocode (Sözde Kod) Nedir?](#pseudocode-sözde-kod-nedir)
  - [Pseudocode Neden Kullanılır?](#pseudocode-neden-kullanılır)
  - [Pseudocode Özellikleri](#pseudocode-özellikleri)
- [İnternet Nedir?](#i̇nternet-nedir)
  - [Fiziksel Elemanlar ve Wifi](#fiziksel-elemanlar-ve-wifi)
  - [IP Adress ve DNS](#ip-adress-ve-dns)
  - [Paketler, Yönlendirme ve Güvenilirlik](#paketler-yönlendirme-ve-güvenilirlik)
    - [Nasıl Çalışır?](#nasıl-çalışır)
  - [HTTP ve HTML](#http-ve-html)
  - [Şifreleme ve Public Key](#şifreleme-ve-public-key)
  - [Siber Güvenlik ve Suçlar](#siber-güvenlik-ve-suçlar)
  - [Tarayıcılar](#tarayıcılar)
    - [Tarayıcılar Ne İşe Yarar?](#tarayıcılar-ne-i̇şe-yarar)
    - [Farklı tarayıcılar farklı rendering motorları kullanır.](#farklı-tarayıcılar-farklı-rendering-motorları-kullanır)
  - [IP(Internet Protocol)](#ipinternet-protocol)
  - [Transmission Control Protocol(TCP)](#transmission-control-protocoltcp)
  - [HTTP ve HTTP Status Code](#http-ve-http-status-code)
    - [**HTTP HEADER**](#http-header)
    - [**HTTP BODY**](#http-body)
  - [DNS(Domain Name System) Alan Adı sunucusu](#dnsdomain-name-system-alan-adı-sunucusu)
    - [Domain Name(Alan Adı)](#domain-namealan-adı)
  - [Hosting](#hosting)
    - [Farklı Hosting Hizmetleri](#farklı-hosting-hizmetleri)
  - [Google'lamak](#googlelamak)
    - [**Sırasıyla**](#sırasıyla)
    - [**Nasıl Etkili Kullanılır?**](#nasıl-etkili-kullanılır)
- [Developer'lar İçin Platformlar](#developerlar-i̇çin-platformlar)

<br><br>

# Frontend ve Backend'e Giriş
Konu web tasarımı olduğunda, frontend ve backend en sık sözü geçen terimler arasında yer alır. Bu iki terim, aslında "görülen ve etkileşime geçilen katman" ve "görülmeyen arka plan" olarak da anlaşılır bir halde ifade edilebilir.
Bu iki terim genelde sektörün dışından olanlarda kafa karışıklığı yaratıyor gibi görünse de aslında aralarındaki farkı açıklamak nispeten kolay. 
- Bunu en basit tabirle açıklamak gerekirse;
  - frontend, bir web sitesine girdiğinizde etkileşime girdiğiniz arayüzün tasarımının geliştirilmesine
  - backend, bu web sitesinin perde arkasında yer alan, işin server kısmı ve taban yazılımını geliştirme işine verilen adlardır.
## Frontend Nedir?
Frontend, web'in görüp etkileşimee girebildiğiniz kısımlarına verilen addır. Frontend genellikle web tasarımı ve web'in ön yüzünün geliştirilmesini kapsar.

Son dönemlerde tasarım ve tasarımın kodlanması süreçleri neredeyse tamamen ayrılmıştır. Yine de web tasarımı dendiğinde; Adobe XD, Photoshop ve Sketch gibi tasarım programlarını kullanabilen, aynı zamanda da HTML, CSS, JavaScript ve yeni nesil frameworkler(react.js, vue.js) ile kod yazabilen tasarımcılardan bahsedilir.

Bir web sitesini kullanırken gördüğünüz her şey; HTML, CSS ve JavaScript'in, kullandığınız web tarayıcı tarafından kontrol edilmesidir. Bunun içinde de fontlar, açılır menüler, geçişler, sliderlar, iletişim formları vb. tasarımsal işler yer alır.

Frontend'de yer alan bu öğelere eklenen bilgilerin depolanabilmesi, yani kısaca frontend'in hayata geçebilmesi için gereken alt yapı ve teknolojilyi sağlayan ise backend'dir
## Backend Nedir?
Backend genellikle bir sunucu, bir uygulama ve bir veri tabanından oluşur.

Bir havayolu veya otobüs firamsının web sitesine girerek bilet aldığınızda frontend ile etkileşime girmiş olursunuz. Siz bilgilerinizi web sitesine girdiğinizde, uygulama bu bilgiyi alır ve bir sunucu üzerinde kurulmuş olan veri tabanına depolar. Backend işleyişini basit bir şekilde anlatabilmek için şöyle örnekleyebiliriz: Siz(uygulama), bir bilgiyi bisayarınızda(sunucu) bulunan bir Excel(veri tabanı) dosyasına kaydediyorsunuz.

Örnek olarak kayıtlı olduğunuz bir web sitesine giriş yapmak istiyorsunuz, ilk olarak bu Giriş Yap isteği sunucuya iletilir daha sonra ise sunucunun veri tabanında kullanıcı adınız ile şifrenizin uyuşup uyuşmadığına bakılır ve ona göre bir cevap gelir. Siz giriş yapma isteği gönderdiğinizde bunu veri tabanında arayan, bulan ve nasıl bir cevap verileceğini belirleyen şey backend'tir.

Backend kodlayanlara, Backend Developer denir. Backend Developer'ların kullandığı bazı yaygın dil, framework ve teknolojilerden bir kısmı;
|||||
|---|---|---|---|
|Java|Spring|.NET
|Python|Django|JavaScript|
|Node.js|PHP|Laravel|
|SQL|MySQL|MSSQL|OracleSQL|
## Frontend ve Backend Karşılaştırması
Backend ile Frontend geliştirimi arasındaki farkı belirlemek için uygun bir benzetme, bir sahne oyunudur. Backend, ışıkları ve ses tahtasını çalıştıran perdelerin arkasındaki mürettebat ise, Frontend, setin ve aktörlerin de içinde bulunduğu seyircinin gördüğü şeydir.

HTML insan biyolojisinde iskeletimizi temsil eder. Bir web sayfası oluşturmak istiyorsanız ilk olarak bir iskelet yapısı kodlamalısınız. CSS bir sitenin gözümüze güzel gözükmesini sağlayan bir stil aracıdır. CSS'in insan vücudundaki yeri derimiz, kaşımız, gözümüz ve hatta göz rengimizdir. Yani CSS, iskeletimizin üzerini örterek güzel gözükmesini sağlar. JavaScript ise insan vücuduna fonksiyon kazandıran yapıdır yani duyu organlarımız buna en güzel örnektir. Mesela gözümüz dışarıyla uyumlu olmamızı sağlayan bir duyu organıdır. Dışarıdan veriyi alır beyne iletir.

Peki, backend bunun neresinde diye soracak olursanız: Backend ise beynimizdir. Bisiyle karşılaştığınızda ilk olarak o kişiyi gözlerinizle görürsünüz daha sonra görme verisi beynimize aktarılır. O kişiyi tanıyıp tanımadığınıza karar veren yapı yani beynimiz de backend'tir.

Son olarak, Web tasarımı(frontend) ve web geliştirme(backend), ancak bir araya geldiklerinde bir web sitesi oluşabilir, ancak her ikisi de birbirinden farklı işler yapar. Hem frontend hem de backend'i tek başına yapabilen nadir yazılımcılar da "Full-Stack Developer" olarak adlandırılır.

Tekrar kısaca özetlemek gerekirse de bir web sitesini sıfırdan oluşturabilmek için frontedn ve backend'in bir arada olması gerekir; biri olmadan diğeri, tek başına web sitesi oluşturamaz.
# Algoritma Nedir?
Bir sorunu çözmek veya belirlenmiş bir amaca ulaşmak için tasarlanan yola, takip edilen işlem basamaklarına algoritma denir. Algoritmalar açıkça belirtilmiş bir başlangıcı ve sonu olan işlemler kümesidir.

Amaca ulaşmak için işlenecek çözüm yolları ve sıralamaları belirlenir ve algoritma bu sırayı takip ederek en mantıklı çözüme ulaşır.
## Algoritma Neden Gereklidir?
Algoritma geliştirmek bize günlük hayatımızda, programlama ve matematikte birçok kolaylık sağlamaktadır. Çoğumuz, iş hayatımızda ve normal yaşantımızda algoritmayı birçok yerde kullanmaktayız. Algoritma kullanımı, hayatımızda belirli bir düzen oluşturmak açısından gerekli bir yoldur.
# Pseudocode (Sözde Kod) Nedir?
Pseudocode(Sözde Kod), bilgisayar bilimleri alanında algoritmalar ve programlar oluşturulurken ve aktarılırken kullanılan, günlük konuşma diline benzer ve belli bir programlama dilinin detaylarından uzak anlatımlardır.

Programın yapısının ve çalışma mantığının yüksek seviyeli bir biçimde, gerektiği yerde doğrudan doğal dil cümleleriyle, ama yine de bir program yapısı ve akışı içinde anlatılmasıdır. Böylelikle sözde kodu okuyan ya da yazan birisi, programlama dillerinin söz dizim detaylarına dikkat etmek zorunda kalmadan, programnın ve algoritmanın çalışma mantığını düşünebilir.
## Pseudocode Neden Kullanılır?
- Pseudocode(Sözde Kod)'a ihtiyaç duyulmasının temel nedeni programlama dillerini bilmeyen sıradan bir insanın ve her türden yazılımcının programlardaki algoritma mantığını anlamasını sağlamaktır.
- Sözde kodun kullanılmasının bir diğer amacı programın yapısına veya programın kullanıcılarına, kullanılan programlama dilinden bağımsız olarak, o programın çözüm, çalışma mantığının sunulmasının sağlanmasıdır.
## Pseudocode Özellikleri
- İsminde her ne kadar "Code (Kod)" geçiyor olsa da kod niteliği taşımaz.
- Kod niteliği taşımadıkları için; herhangi bir derleyici tarafından derlenemezler.
- Üzerlerinde hata ayıklaması(debugging) yapılamaz. Sade ve kolaylıkla anlaşılabilir olmalıdır.
- Söz dizim(syntax) kurallarına dikkat etmek zorunda olunmadığı için algoritma özelliği göstermezler.
# İnternet Nedir?
İnternet, belirli standartlar dâhilindeki protokoller aracılığı ile iletişimi sağlayan küresel bir ağdır. Dağıtık sistem mimarisi vardır, bu sayede merkezi değildir, biri tarafından yönetilmez.
## Fiziksel Elemanlar ve Wifi
İnternette paylaştığımız bilgiler bit formatında gidiyor ve ne kullanırsak kullanalım kaynak her zaman fiziksel bir elemana dayanıyor.

Bu elektrik, ışığın geçtiği kablo veya modemden yayılan dalgalar olabilir ama ana kaynak elle tutulur oluyor.

Kullandığımız geleneksel yöntem elektrik, ışık ise fiber olarak hayatımıza girmiş çok daha yüksek hızlara çıkabildiğimiz yeni nesil bir yöntem.

Wifi'ye bağlandığımızda bilgi havadan geliyor gibi görünse de orada bağlandığımız modem olduğunu unutmamamız gerekiyor. Bu durumda dalgalar aracılığı ile iletim sağlanıyor. Bilgi bit'e dönüştürülüyor ve fiziksel elemanlar aracılığı ile hedefe ulaşıyor.

Bant genişliği ise saniyede gönderebildiğimiz bit sayısını ifade ediyor. Bant genişliğinin yüksek olması taşıyacağı bit sayısını arttırıyor ve dolayısıyla o kadar hızlı iletim yapabiliyoruz.

|Yöntem|Avantaj|Dezavantaj|
|------|-------|----------|
|Elektrik|Ucuz|Sinyal Kaybolması|
|Işık|Çok Hızlı|Çalışması zor, Pahalı|
|Radyo Dalgaları|Taşınabilir|Kısa Mesafe|
## IP Adress ve DNS
İnternete bağlanan her bir cihazın kendisine has bir IP(Internet Protocol) adresi vardır.

IP adresler sayılardan ve belirli bir formattan oluşur. Bu adresleri belirleyen sistem önceleri IPv4 sistemi olsa da şimdilerde yerini IPv6 alıyor. IPv4 32 bitlik bir IP adres uzunluğuna sahipken, IPv6 128 bitlik bir uzunluğa erişti. Bu ise daha fazla cihaza özel adres verilmesini sağladı.

Bir web sitesine girmek istediğinizde o servise ait IP adresine bağlanmanız gerekir. Ama kimse Google'a veya Instagram'a bu yolla bağlanmaz. Bunun yerine sitenin adını yani Domain adresini biliriz.

Web sitesi adını DNS(Domain Name System) sunucuları üzerinde sorgular ve eşleşen IP adres ile iletişim kurarız. Bunu fark etmeden cihazlarımız bizim için yapar ve olumlu sonuç dönüldüğünde siteyi karşımızda görürüz.

Yani **kodluyoruz.org** adresini tarayıcınıza yazdığınızda domain sunucusu üzerinden kodluyoruz'a ait IP adresi(adresleri) aranır ve eşleşen adrese sizi yönlendirir. Bir web sitesi kurmak istediğinizde almanız gereken domain'in yaptığı şey de tam olarak budur.
## Paketler, Yönlendirme ve Güvenilirlik
Bilginin bir cihazdan diğerine gitmesi için illa ki dümdüz bir yola ihtiyacı yoktur. Bu yol karmaşık olabilir. Trafik durumuna göre veri farklı yollardan hedefe ulaşabilir. Bu tarifği yönlendiricler(routers) yönetir.

Trendyol gibi Türkiye'de üzerinde milyonlarca insanın kullandığı bir e-ticaret sitesini düşünelim. Böyle bir platform genellikle sunucularını tek bir merkezde tutmaz. Bunun yerine İstanbul, Ankara veya farklı şehirler olmak üzere birkaç noktada konumlandırır.
- Bunun temelde iki sebebi vardır;
  - Bağlanti isteği gönderdiğiniz sunucu fiziksel olarak ne kadar uzakta olursa o kadar geç bağlanırsınız. Bütün sunucular İstanbul'da olsaydı Hakkari'den birisi istek yolladığında gecikme yaşanabilirdi. Bunun olmaması için Ankara gibi nispeten Türkiye'nin orta noktası olan bir şehirde 2. bir merkez açmak süreci hızlandıracaktır.
  - İkinci sebep ise güvenlik ve olası sorunlar. Eğer sunucuları tuttuğunuz yerde bir elektrik kesintisi yaşansa veya başka bir durumdan ötürü cihazlar kapansa kimse istek gönderemezdi. Dolayısıyla bembeyaz bir ekran ile karşılaşırdınız. Bunun olmaması için farklı bir şehirde 2. bir merkez kurulup olası durumlarda trafik o noktaya yönlendirilir.

İşte bu gibi durumları yöneten ve size en yakın sunucu ile iletişim kurmanızı sağlayan şey routers'lardır.
### Nasıl Çalışır?
Bilgi bitlere dönüştükten sonra paketler içerisinde hedefe gönderilir. Her paket içerisinde hedef ve kaynak IP adresler bulunur. Böylelikle nereden geldiği ve nereye gideceği bilgisi karışmaz. Paketler farklı yollardan veya farklı zamanlarda hedefe ulaşabilir. Tüm paketler hedefe ulaştığında birleştirilir ve bilgi bütünleşir.
> **Peki, paketler hedefe ulaşmazsa ne olur?**

Bu durumun çözümü olarak yeni bir protokol karşımıza çıkıyor. TCP(Transmission Control Protocol). TCP tüm paketlerin geldiğini onaylayana kadar paketleri tekrar tekrar talep ediyor. Tüm paketler geldiğinde ise işlem tamamlanıyor, TCP işlemi onaylıyor.
## HTTP ve HTML
HTTP(HyperText Transfer Protocol) web sitelerinde iletişimi sağlayan standart protokoldür. İletişim sırasında çeşitli komutlar ile istekler iletilir.

Kullanıcı giriş sayfasına ulaşmak için GET isteği gider, giriş sayfası gelir, parola ve kullanıcı adını girdikten sonra tamama basıldığında POST ile girilen bilgiler sunucuya gönderilir. Bilgiler doğruysa kullanıcıya özel sayfa gelir.

HTML, bir web sitesinin temel görünümünü oluşturduğumuz dildir. Yazı kalın mı olsun italik mi olsun sağda mı olsun solda mı gibi seçenekler sunar.

İnternette gezinmek, gözetlenme ve onay olmadan değiştirme gibi tehlikeleri barındırır. Bilgilerimizin çalınma tehlikesi olduğu için güvenilir olmayan siteler konusunda dikkatli olmalıyız.

Öncelikle TLS(Transport Layer Security) ve SSL(Security Sockets Layer) kullanarak güvenli bir kanal oluşturması gereklidir. HTTPS(HyperText Transfer Protocol Security) protokolü kullanarak istekleri iletmesini bekleriz.

Tarayıcımız ile bir adrese girdiğimizde http yerine https ile başladığına ve kilit işaretinin olduğuna dikkat etmeliyiz, sertifika olmadığında tarayıcımız uyarı verecektir.
Son dönemde Google https kullanmayan ve özellikle bizden bilgi talep eden servisleri göstermeme kararı aldı. Bir web sitesi oluştururken https sertifikası olduğuna emin olmalıyız.
## Şifreleme ve Public Key
İki cihaz iletişim kurarken, veriyi olduğu gibi gönderseydi araya biri girip veriyi değiştirebilir ve bize ulaştırabilirdi. Çünkü veri hedefe ulaştığı sürece ufak bir gecikme olduğunu düşünürdük. Bu sebeple veriyi olduğu gibi göndermek yerine şifreliyoruz.
Bunun için çeşitli yöntemler var ve şifreleme yüzyıllardan beridir kullanılıyor. Sezar şifreleme bilinen eski yöntemlerden biri. Bu yöntemde mesajı gönderenin ve alanın bildiği bir anahtar sayı vardır. Mesajdaki her harf ayrı olarak ele alınır ve alfabede anahtar sayı kadar kaydırılır. Örneğin anahtar sayımız 3 olsun ve göndermek istediğimiz mesaj "Sifreleme". Aşağıdaki gibi her harfi alfabedeki 3 sıra sonraki harf ile değiştiriyoruz.

> Sifrele -> Vliuhohph

Sonuç olarak elde ettiğimiz **"Vliuhohph"** mesajını gönderiyoruz. Alıcı bunu alıp alfabede geriye doğru gidiyor ve mesajı çözüyor. Bu yöntem eskide çok kullanılmış olsa da günümüzde alfabedeki sınırlı harf ve bilgisayarlarımızın işlem gücüyle çözülmesi oldukça kolay. Saniyeleri bulmadan sezar şifreleme çözülüyor. Günümüzde 256 bitlik anahtarlar ile şifrelem yapılıyor. Bu anahtarlar kullanılarak veri değiştiriliyor anlaşılmaz hale geliyor.

> **Anahtar bizde var bununla şifreledik karşı taraf nasıl çözecek ?**

Bu durumu çözmek için de asimetrik şifreleme var. Asimetrik şifrelemede iki anahtarımız var: genel(public) anahtar ve özel(private) anahtar. Genel anahtar ile ekleme yapılabilir ama özel anahtar kimde ise veriyi o görebilir mantığı vardır. İnternette TSL ve SSL protokollerinde de bu yöntem temel alınır.
## Siber Güvenlik ve Suçlar
```
En yaygın siber suçlar:
Virüsler, DDoS ataklar ve oltalama(phishing) yöntemleridir.
```

Virüsler bilgisayarımızda çoğu şeye erişim sağlayarak dosyalarımız üzerinde işlem yapabilirken, DDoS ataklarda ise virüsler sayesinde ele geçirilmiş bilgisayarlardan bir ordu oluşturularak bir web sitesini aşırı talebe boğma amaçlanır.
Virüsler sayesinde kendi kendine sürüş yeteneğine sahip otomobilimiz ele geçirilir ve virüsü yöneten kişi bu aracı istediği lokasyona yönlendirebilir aynı zamanda bütün bilgilere(resimler, dosyalar, internet geçmişi) erişebilir.

DDoS atağını ise ele geçirilmiş binler hatta milyonlarca aracın aynı cadde üzerine yönlendirilmesi olarak düşünebilirsiniz. Bu sayede o lokasyonda büyük bir trafik sağlanır ve saldırıya maruz kalan sunucu iş göremez hale gelir.

Oltalama yöntemi ise çok basit bir dikkatsizlik sonucu oluşur ve kandırma yeteneğine bağlıdr. Genellikle kullandığınız bir servisi taklit ederek sizden giriş bilgilerinizi isterler. Eğer bu durumu kontrol etmez ve istenilen bilgileri karşı tarafa verirseniz, bu bilgiler kötü niyetli kişilerin eline geçer.

Mail kutunuza düşen bir emailin bankadan geldiğine inanırsınız ve linke tıklayarak giriş bilgilerinizi vererek giriş yaparsınız. O sırada bilgisayar korsanları bilgileriniz ile gerçek sistemden giriş yapabilirler. Bu sebeple izin veren bütün uygulamalarda 2 adımlı doğrulama hizmetini açmanızı ve araya bir katman daha eklemenizi öneririz.

Siber suçlar yazılım kaynaklı gibi görünse de çoğu insan kaynaklıdır. Biz ne kadar dikkat edersek saldırıya uğrama ihtimalimiz o kadar azalır.
## Tarayıcılar
Masaüstünde ve mobil cihazlarımızda birçok tarayıcı var. Kullanıcıların hangi tarayıcıları tercih ettiğine baktığımızda büyük yüzdeyi Chrome alıyor. Bu bilgi bizim için önemli çünkü kodlama yaparken neredeyse pek çok standart aynı olsa da zaman zaman bazı komutlarda tarayıcı davranışları değişiklik gösteriyor ve bu durumları ekstra komutlarla düzenlememiz gerekebiliyor.
### Tarayıcılar Ne İşe Yarar?
Tarayıcılar kullanıcının seçtiği web kaynağını görüntülemek için sunucuya istek yapar ve gelen cevabı kullanıcıya gösterir. Ana görevi budur. Yapılan isteğin cevabı genelde HTML içeriktir ama PDF, görüntü, video gibi farklı içerik tipleri de olabilir. Kaynağın tam konumu kullanıcı tarafından URI(Uniform Resource Identifier) kullanılarak belirtilir.

Tarayıcılar yorumlama ve HTML dosya görüntülemede belirli standartlara uyar. Bu standartlar W3C tarafından belirlenir. Tarayıcıların kullanıcı arayüzlerinde belirli bir standart olmamasına rağmen genel kullanıcı alışkanlıklarını bozmamak ve de belirli bilgilere ihtiyaç tüm tarayıcılarda ortak olduğu için benzer özellikler içerir.

> Örneğin; hepsinde adres çubuğu vardır, sayfa yenileme ve işlemin durdurulması için butonlar vardır.

- Tarayıcıların ana işlevleri:
  - Kullanıcı Arayüzü:
    - Ekranda gördüğümüz butonlar, araç çubukları gibi elemanları içeren arayüz.
  - Tarayıcı Motoru:
    - Rendering motoru ve kullanıcı arayüzü arasında sıraya koyma aksiyonlarını denetler.
  - Rendering Motoru:
    - Görüntüleme için istek yapılmış içeriği görüntülemeden sorumludur.

> Örneğin; bir HTML içeriği için istek yapıldı, gelen içerikte HTML ve CSS çözümlenir ve ekranda görüntülenir.

- Ağ İletişimi(Networking):
  - HTTP istekleri gibi network istekleri için kullanılır. Kullanılan platformdan bağımsız olarak farklı platformlar için farklı uygulamalar kullanılarak çözümler sunulur.
- Kullanıcı Arayüzü:
  - (UI - User Interface)
    - Backend: Combobox ve pencereler gibi basit grafiksel araçları çizmek için kullanılır. İşletim sistemi kullanıcı arayüz metotları kullanır. Böylelikle platform bağımsız genel bir arayüz ortaya çıkar.
- JavaScript Yorumlayıcı:
  - JavaScript kodları ayrıştırılır ve çalıştırılır.
- Veri Belleği(Data Storage):
  - Süreklilik(Persistence) katmanıdır. Tarayıcı verilerin hepsini lokal olarak depolamak isteyebilir, çerezler(cookies) bu tür verilere örnektir. IndexedDB, localStorage, WebSQL ve FileSystem gibi farklı depolama sistemlerini de tarayıcılar destekler.

Chrome gibi tarayıcılar her sekmede bir tane olacak şekilde birden fazla rendering motoru çalıştırırlar. Her sekme ayrı işlemlerde çalışır. Çok fazla sekme ile çalıştığınızda RAM'inizin şişmesine sebep olur.

Rendering motorunun görevi istek yapılmış içeriği ekranda görüntülemektir. Görevinden dolayı tarayıcılar için oldukça kritik bir bileşendir. Varsayılan olarak XML ve HTML dökümanlarını görüntüler ama eklenti ve uzantılar sayesinde diğer dökümanları da görüntüleyebilir.

> Örneğin; PDF dökümanı varsayılan olarak görüntülenmez ama PDF eklentisi ile görüntülenebilir.

### Farklı tarayıcılar farklı rendering motorları kullanır.
|Tarayıcı|Rendering|
|--------|---------|
|Firefox|Gecko|
|Safari|WebKit|
|Chrome ve Opera|Blink|

> WebKit, ilk zamanlarında Linux için oluşturulmuş açık kaynak bir rendering motorudur, sonradan Apple tarafından Mac ve Windows desteklemesi için değiştirilmiştir.

Rendering motoru HTML belgesini aldığında çözümlemeye başlar, belgedeki elementleri içerik ağacı(content tree) olarak adlandırılan ağaçta yer alan DOM düğümlerine çevirir. Motor aynı zamanda hem harici CSS dosyalarını hem de satır içi style elemanlarını da ayrıştırır. HTML'de bulunan görsel talimatlar ile diğer tasarım bilgileri başka bir ağaç olan render ağacını oluşturur. Render ağacı boyut ve renk gibi görsel özellikleri içeren dikdörtgenler bulundurur. Bu dikdörtgenler ekranda görünmek üzere düzgün sırada bulunurlar. Render ağacı oluşturulduktan sonra düzenleme(layout) işlemi başlar. Bu işlemde düğümdeki elemanlara ekranda nerede görüntüleneceklerine dair tam koordinatlar verilir. Sonraki aşama ise boyama(painting) aşamasıdır. Render ağacındaki her düğüm işlenerek UI(Kullanıcı Arayüzü) backend katmanı kullanılarak boyama işlemi yapılır.

Tüm bu süreç kademeli olarak gerçekleşir. Tarayıcılar daha iyi kullanıcı deneyimi sunmak için olabildiğince hızlı ekrana getirmeye çalışırlar. Bir adım tüm içerik için tamamen bitince diğer adım başlar gibi sıralı bir süreç olduğunu düşünmemek gerekir. İçerik parçalara ayrılır ve bu parçalar için işlemler gerçekleşir.

Örneğin; sayfa gelirken bir anda bütün elemanların görüntülenmesi yerine ilk önce yazıların sonra görsellerin geldiğine şahit olmuşsunuzdur. Bunun sebebi yazının işlemlerden çok daha hızlı geçip süreç bitince de ekrana yansıtılması, görseller için ise sürecin tamamlanmamış olmasındandır.
## IP(Internet Protocol)
Bir noktadan diğer noktaya veri iletişimini sağlarken verinin yolculuğunu sağlayan iletişim sistemine network denir.

Eğer sadece iki cihazı kablo ile bağlasaydık ve veri iletişimi sağlasaydık, verinin kafası karışmazdı ve karşı bilgisayara giderdi. Eğer sistemde verinin çıkacağı bilgisayara başka bir bilgisayar daha bağlasaydık bu sefer hangisine gideceğini nasıl bilecekti ?

Veri iletişiminin sağlandığı ağda çok fazla cihaz olabilir. Hepsini fiziksel olarak bağlamamıza gerek yoktur. Yönlendiriciler(routers) üzerinden iletişim sağlanır. Yönlendiricler ağdaki karmaşıklığı gidererek ağdaki iletişim için yardımcı olurlar. İnternet büyük bir ağdır ve milyonlarca cihaz bu ağ içinde iletişimdedir. İnternete bağlanırken bir yönlendiriciye bağlanırız ve ulaşmak istediğimiz noktaya kadar yönlendiriciler bizi adım adım götürür. Tıpkı adres sorduğumuz insanlar gibi bize yardımcı olurlar.

Yönlendiriciler ağ üzerindeki diğer yönlendiricilere veya cihazlara yönlendirme yaparken bir tablo kullanır. Bu gitmek istenilen adrese göre "sağdan git soldan git" diye adres tarif etmek gibidir.

```
2 tane IP versiyonu vardır: IPv4 ve IPv6
IPv4 Adres Örneği: 192.168.1.152
IPv6 Adres Örneği: 4ggr:1925:5656:7:600:t4tt:tc54:98vt
```

Normalde cihazları gerçekten birbirine bağlamış olsak ve yönlendirici kullanmasak daha hızlı iletişim sağlayabiliriz. Ama direkt bağlamak hem maliyetli hem de bakımı zor. IP ile veri gönderirken veri paketlere bölünür. Paketlerin kaybolması gibi durumlarda iletişim kopar. Aşırı fazla paket olması da yönlendiricilerde trafik olmasına yol açabilir. Bu sebeple yavaşlık olur. Ama veriyi tek parça halinde gönderirsek de fazla maliyetlidir. Yönlendirici ağda iki veya daha fazla seçeneği olduğunda trafik kontrolü yapılabilir. Trafik durumuna göre farklı rotalarda önererek veri paketlerinin daha hızlı gitmesini sağlayabilir. Buna connectionless(bağlantı gerektirmeyen) kavramı denilir. Veriler bir bilgisayardan diğerine belirli bir akış kontrolü olmadan farklı rotalar ile gidebilir. IP ile veri iletiminin %100 gerçekleşeceğini garanti edemeyiz. Aktarım sırasında hatalar meydana gelirse iletişim gerçekleşmez. Bu yüzden güvenilmez(unreliable) bir protokoldür. TCP gibi güvenilir bir protokol ile kullanıldığında güvenilir hale gelir.
## Transmission Control Protocol(TCP)
TCP, ağdaki cihazlar arası iletişimi kolaylaştıran bağlantı odaklı(connection oriented) iletişim protokolüdür. IP ile beraber çalışırlar, genelde TCP/IP olarak beraber görülür. TCP/IP beraber internetin temel taşlarını oluşturur. TCP'yi diğerlerinden ayıran bağlantının sağlanması konusundaki kaygısıdır. Mesaj gönderileceğinde sorun yaşamamak adına bağlantının varlığından emin olunur.

TCP bağlantısı istemci(client) ve sunucu(server) arasında gerçekleşir. İstemci ve sunucu arasında veri alışverişi başlamadan önce 3-way handshake ile bağlantı doğrulanır. Bunun amacı veri gönderimi için güvenilir, veriyi düşürmeyecek bir bağlantı olduğunu kanıtlamak. Bu kanıtlama için standart paketler gönderiliyor. İstemci tarafından SYN biti işaretlenmiş(rastgele işaretleme yapılıyor) paket gönderiliyor. Sunucu paketi aldığında biti bir arttırarak, kendi de rastgele bir biti işaretleyerek gönderiyor. İstemci sunucudan gelen paketi aldığında kendi gönderdiğinin bir fazlasını bulduğu için mutlu, demek ki yolda paketi yanlış yere gitmemiş. Bu sefer kendi bitine dokunmadan sunucunun göndereceği biti bir arttırıyor ve tekrar paketi gönderiyor. Paketi alan sunucu da mutlu. İstemci ve sunucuyu mutlu ettiğimizde iletişim başlıyor, artık mesajları gönderebileceğimiz bir bağlantı kanalı oluştu.

TPC iki yönlüdür(bidirectional). Yani hem sunucu istemciye mesaj/veri gönderebilir hem de istemci sunucuya mesaj/veri gönderebilir. Veri ise bir bütün halinde karşı tarafa iletilmez, paketler halinde gönderilir. TCP, verinin eksiksiz karşı tarafa gitmesini istediği için önlemler alır. Veri alışverişi sırasında ACK gelmeyen paketlerde(ki bu karşı tarafın mesajını aldım deme yoludur) tekrar paket gönderir. Veri paketler halinde gönderildiği için gönderirken bir listeye yazar ve ACK geldikçe tamam bunu göndermişiz diyerek listeden siler gibi düşünülebilir. Eğer ACK alamazsa ki bu da paket kayboldu demektir, yeniden gönderilecekler listesi tutar ve paket orada yer alır.

Paketi gönderdi, hemen ACK gelmezse tekrar mı gönderiyor? Biraz beklese belki gelecekti, değil mi? Bu sorunu da çözmek için timeout süresi var. Bu süre dolduğunda ACK mesajı gelmediyse o paket kayboldu diye düşünülür. Evet, belki 1 saniye sonra gelecekti ama süremiz doldu cevap veren taraf için üzgünüz tekrar paket ona ulaştığında bu sefer elini çabuk tutsun ACK ile aldım desin.

TCP bağlantısını kendiniz de rahatlıkla kodlayabilirsiniz. Bir programlama dili seçip, TCP server/TCP client olarak arama yaptığımızda bir sürü örnek bulabiliriz. 

```
Java için örnek:
https://github.com/aysedemirel/Socket-Programming/tree/master/BasicClientServer
```

Linkteki projede basit bir sunucu-istemci kodu vardır. Kendi bilgisayarınıza alarak istemci ve sunucuyu ayrı ayrı çalıştırırsanız konsol üzerinden veri alışverişi gerçekleştirebilirsiniz. Kodda geliştirme yaparak TCP tabanlı kendi mesajlaşma uygulamanızı yapabilirsiniz. Mesaj trafiğini incelemek için Wireshark uygulamasını indirerek gözlem yapabilirsiniz.
## HTTP ve HTTP Status Code
HTTP(HyperText Transfer Protocol), istemci ve sunucunun birbiri ile nasıl iletişim kurduğunu standartlaştıran TCP/IP tabanlı application layer(uygulama katmanlı) iletişim protokolüdür. İçeriğin internet üzerinden nasıl talep edildiğini ve iletildiğini tanımlar. 

Varsayılan olarak TCP portu 80'dir ama diğer portlar da kullanılabilir. Ama HTTPS 443 portunu kullanır.


İstemci ve sunucu ilk önce TCP bağlantısı kurar. İletişimin güvenli olduğunu kanıtlamak için üçlü el sıkışma(three-way handshake) denilen paket alışverişi gerçekleştirilir. İletişim güvenli olduktan sonra istek ve cevaplar ile veri alışverişi başlar. HTTP burada devreye girer. HTTP bir protokol olarak mesajlaşmanın nasıl olacağını tanımlar. Belirli formatlar sağlayarak iki tarafın da aynı dili konuşmasını sağlar.

```
Genel format -> "method istek-hedefi HTTP/version" şeklindedir.
Örnek -> "GET /doc HTTP/1.1"
Protokol içerisinde çeşitli metodlar mevcuttur.
Bunlar: "GET, POST, PUT, HEAD, DELETE"
```

### **HTTP HEADER**
```
GET /doc/test.html HTTP/1.1
Host: www.test101.com
Accept: image/gif, image/jpeg, */*
Accept-Language: en-us
Accept-Encoding: gzip, deflate
User-Agent: Mozilla/4.0
Content-Lenght:35
```
### **HTTP BODY**
```
kitapId = 12345&yazar=Ayse 

İstek Mesajı(Body) kısmı sunucudan veri
istediğimizde/verdiğimizde dolu olarak gider-gelir.
```
- Host:
  - Hangi web sitesine bu talebi yaptığımızdır.
- Bağlantının nasıl devam edilecedeği belirtilir. İki türlü devam edebilir:
  - Connection:close
    - İstek için cevap gelince bağlantı sonlandırılır.
  - Connection:keep-alive
    - İstek için cevap gelince bağlantı devam eder.
> Close her seferinde bağlantı kurmayı gerektirdiği için performans ve kaynak kaybına sebep olabilir.
- Tarayıcıların kendine ait "user-agent" var. Bununla sunucu tarayıcıya özel ayarlar yapabiliyor ya da tarayıcıya özel içerikler üretebiliyor.
- "Accept-Language" başlığı ile tercih edilen dil belirtiliyor.

Sunucu cevap döndüğünde de istek gibi HTTP formatında gelir. İlk satırda durum kodu olur.
Durum kodu(status code), isteğimiz ile cevabın uyumunu gösterir. Bu kodlar grup halindedir.

- 100 ile başlayan kodlar "Bilgi" amaçlı.
- 200 ile başlayan kodlar "Başarı" ile gerçekleşen komut bildirmek amaçlı.
- 300 ile başlayan kodlar "Yönlendirme" amaçlı gönderilir bu kodu gördüğümüzde yönlendirdiği şekilde aksiyon alınır.
- 400 ile başlayan kodlar "İstemci Hatası" bildirmek içindir. Yanlış kaynağı istemiş olmak gibi.
- 500 ile başlayan kodlar "Sunucu Hatası" bildirmek amaçlıdır. Sunucuda problem olduğunda verilir.

Cevap içerisinde aynı zamanda sunucu başlığı da bulunuyor. Bu kullanılan web servisinin adı ve işletim sistemi adını dönüyor. Bu başlık zorunlu olmadığı için genelde HTTP cevap mesajında bulunmaz.

- Bir diğer başlık "Last-modified", istenilen objenin en son ne zaman düzenlendiğini bildiriyor.
- "Content-Lenght", gönderilen objenin boyutunu byte cinsinden bildiriyor, bu header kullanım amacı veri parça parça geldiğinde istemciye "Veri akmaya ediyor, cevap bitmedi" mesajını vermek.
- "Set-cookie" başlığı, sunucunun çerez(cookies) oluşturması için bulunuyor.
- "Content-Type", gönderilen verinin tipini belirtiyor.

Başlık kısmından sonra body kısmı bulunuyor ve sunucudan veri geliyorken sunucudan istenilen objenin kendisi bulunuyor(tabi durum kodu OK ise). Body içeriği, istek sırasında header içerisinde "content-type" ile belirtilen format ile gelir.
## DNS(Domain Name System) Alan Adı sunucusu
Bilgisayarlar veya diğer cihazlar iletişimi kurmak için IP adres kullanırlar. Bu her bir cihaz için kimlik gibidir. Veri nereye gideceğini elindeki adres ile bilir. İnternette her şey aslında veri almak/vermekten ibaret ve bu da IP gibi protokoller aracılığı ile oluyor.

Örneğin; www.google.com ya da http://www.google.com yazdığımızda IP adresini bilmemize gerek yok. Fakat tarayıcı halen IP adrese ihtiyaç duyuyor. Bunun için de DNS sunucuları var. Biz alan adı ile bir web sayfasına erişmek istediğimizde arka planda bu sunuculara gidip IP adreslerini soruyoruz.

```
http:// -> protocol
www.    -> subdomain
google  -> domain(name)
.com    -> TLD(Top Level Domain)
```

DNS sunucularına sorarken hızlı olmak için belli bir sıra ile sorulur. Öncelikle lokalde veya ağda ön bellekte(cache) bu alan adı daha önce saklanmış mı diye bakılıyor. Daha önce bu web sitesine girmişsek ilk önce saklanan IP adrese istek atılır. Eğer başarılı değilse tekrardan doğru IP'ye ulaşmak için root DNS sunucularında aranır.

Her TLD(Top Level Domain - Üst Düzey Alan Adı), ki bunlar " .com, .me, .io " gibidir, kendi sunucusuna sahiptir.

Root DNS ise alan adı geldiğinde hangi TLD'nin sorumlu olduğunu bulmaktan sorumludur. Root hangi TLD sunucusuna gidileceğini söyledikten sonra TLD sunucusunda aradığımız bilgiyi nerede bulabileceğimize yönelik tekrardan yönlendirme olur. IP bilgisine erişilir ve iletişim sağlanır.
### Domain Name(Alan Adı)
Bir web sitesine ulaşırken "www.ornek.com" gibi bir uzantı gireriz. Burada "www" kısmı her web sitesinde ortak olduğu için hatırlamamız gereken kısım "ornek.com" olur. Eğer bu kısmı hatırlarsak web sitesine direkt giriş sağlayabiliriz. İşte bu kısım yani "ornek.com" domain name(alan adı).

Bir cihazdan diğer cihaza ulaşmak için IP adres gerekliydi. Ama tüm web sitelerinin IP adresini hatırlamamız mümkün değil. Bu yüzden alan adları IP adreslere karşılık gelen kullanıcı dostu metinlerdir.
## Hosting
Web sitesini canlı tutabilmek için sunucuya ihtiyacımız var. Kendi lokalimizde çalışırken kodları derleyip bakarken sunucu olarak kendi bilgisayarımızı kullanırız. (Buna local'de çalışmak da denir.)

Şimdi diğer insanlar da kullansın istiyorsak bunu kendi bilgisayarımızda halletmek çok pahalıdır, oldukça karmaşıktır, oldukça da zordur. Bunun için de daha büyük, hızlı ve iyi bilgisayarlara ihtiyacımız var.

Sunucu ihtiyacımızı çözmek için hosting hizmeti sunan şirketler var. Bu şirketler aracılığı ile yer satın alarak, daha güçlü bilgisayarlara içeriğimizi koyuyoruz. Böylelikle web sayfasına bir günde 1 milyon insan girse bile daha hızlı sunucularda sorun yaşama olasılığımızı düşürüyoruz. Burada sorun yaşayacağımız tek durum güçlü bilgisayara sahip olmamak değil aynı zamanda iyi ve stabil bir internet bağlantısına da sahip olmamaktır. 

### Farklı Hosting Hizmetleri
||||
|-|-|-|
|Shared|Dedicated|VPS|
|Cloud|Managed|
## Google'lamak
Google arama motorunda klasik bir arama yaptığınızda, bunlara karşılık gelebilecek binlerce web sayfası bulabilirsiniz. Google bunları belli bir tekniğe göre bulur ve sıralar. Bunu bilirseniz aradıklarınızı çok daha rahat bir şekilde bulabilirsiniz.

### **Sırasıyla**
- Arama sayfasına yazdığınız kelimeyi, anlamına karşılık gelen kavramları, dilini ve bu kelimeyi aratan insanların ortak amacına göre bir algoritma çizer.
- Sorguladığınız kavram ile eşleşen web sayfalarını arar. Alakalı bir sayfa bulduğuna dair en temel sinyal ise arama sırasında kullandığınız anahtar kelimeleri içermesidir. Aranan kelimenin hangi sayfada sıklıkla kullanıldığını belirler.
- Örneğin; ana başlıkta, alt başlıkta ya da metnin içinde kullanılıyor olabilir. Alaka düzeyinin artması için yoğunluğu yüksek sayfaları sıralamada yukarı taşır. Bu durumda anahtar kelimeyi başlık ve alt başlıkta geçirmek üst sıralara çıkmanızı kolaylaştırır.
- Sonuçları sunmaya bir adım kala web sayfalarındaki bilgilerin bir araya geliş şeklini değerlendirir. Yani sayfada tek bir konuya mı odaklanılmış yoksa birden çok konu tek seferde mi işlenmiş, buna bakılır. Olabildiğince kapsamlı ve geniş bilgiler içeren web sitelerinin bizlere daha çok yardımcı olacağı varsayımıyla hareket eder.
- Bulunduğunuz konumu, geçmiş aramalarınızı, arama için yaptığınız ayarları, gemişte sık sık kullandığınız web sitelerini de dikkate alarak karşınıza bir sonuç sayfası çıkarır.
### **Nasıl Etkili Kullanılır?**
- Mümkün olduğunca basite indirgeyin.
  - Yapacağınız aramayı ne kadar komplike hale getirirseniz sonuçlar da bir o kadar karmaşık olacaktır. Bu yüzden aramanızı mümkün olduğunca basit tutun. Aramak istediğiniz konu hakkında bir veya iki kelime seçin ve bu şekilde aratın. Eğer arama yetersiz gelirse birkaç adet daha konuyla alakalı kelime yazarak arama yapabilirsiniz.
  - ```
    Arama -> Türkiye'nin yüzölçümü kaç kilometrekaredir?
    Örnek Arama -> Türkiye yüzölçümü
    ```
- Kelimelerin dizilimine dikkat edin.
  - Arama yaparken doğru kelimeleri seçmek kadar bu kelimelerin nasıl dizildiği de çok önemli. Google'da çıkacak sonuçlar tamamen yazdığınız kelimelerle alakalı olacağından anahtar kelimeleri mümkün olduğunca nokta atışı yapacak şekilde seçmek gerekiyor. Google'da ünlü bir cümle veya özlü söz aratacağınız zaman anahtar kelimelerin sırasına mümkün olduğunca dikkat etmek gerekiyor.
  - ```
    Arama -> Az düşünürse insan konuşur
    Örnek Arama -> İnsan ne kadar az düşünürse, o kadar çok konuşur.
    ```
  - Her ikisinde de sonuçlar çıkıyor fakat ikinci adımdaki mantığı uygularsak daha karmaşık sonuçlar için daha etkili bir arama metodu uygulamış oluruz.
- Gereksiz kelimeleri ve işaretleri atlayın.
  - Google yapılan aramalardaki eksikleri ve hataları düzeltebilecek kapasiteye sahip. Bu özelliği sayesinde Google anahtar kelime olarak belirtilenler arasından gereksiz olarak algıladıklarını zaten göz ardı edecektir. Bu yüzden o kelimeleri girmekle vakit harcamayın ve direkt olarak sonuç odaklı çalışın.
> Google'da arama yaparken aşağıdaki maddelere dikkat etmeseniz de olur;
> - Heceleme
> - Büyük ve küçük harf
> - Noktalama işaretleri
> - Özel karakterler(parantez, artı, eksi vb.)
- Dosya tipleriyle arama yapın.
  - Özel bir dosya türüne ait bilgi için Google'da arama yaptığınızda "internetin zararları word" gibi arama kalıplarıyla istediğiniz sonuçlara ulaşamayabilirsiniz. Bunun için bir arama yöntemine sahip olan Google'da, aramak istediğiniz bilginin önüne filetype: ekini ve sonuna da dosya türünü getirmenizle beraber sadece o dosya türüne ait sonuçlar ekranınıza listelenecek. Bu akıllıca kullanıldığında gereksiz pek çok sayfası elemenizi sağlar.
  - `Örnek Arama -> internetin zararları filetype:doc`
- Bir kısmını unuttuğunuz cümleleri arama.
  - Gün içerisinde bir söz veya şarkı sözü duyduğunuzda ancak bunun sadece belli kısımlarını anlayabildiğinizde ve tamamına ulaşmak istediğinizde 'Google'ın bu arama yöntemi fazlasıyla yardımcı oluyor. Böyle bir durumla karşılaştığınızda, cümlenin bilmediğiniz kısmına Google'da arama yaparken "*" ifadesini eklemek. Ayrıca bu özelliği bir hata aldığınızda sizin cihazınıza özel alanları belirtmek için de kullanabilirsiniz.
- Birden fazla kelime ile arama yapma.
  - Birden fazla kelime ile arama yaptığınızda ve her kelimenin aramanın içinde geçmesini istiyorsanız çift tırnak kullanabilirsiniz. Aksi halde google bu kelimelerden bir kısmını eleyerek size sonuçlar gösterebilir.
  - `Örnek Arama -> "kodluyoruz hakkında"`
- Bir site içerisinde arama yapma.
  - Bir web sitesi içinde arama yapmak istiyorsanız site: özelliğini kullanabilirsiniz. Çoğu durumda sitelerin kendi arama özelliklerinden daha iyi çalışır.
- Sosyal aramalar.
  - Sosyal medya kanalları üzerinde aradığınız sonuçlar için yapacağınız aramalarda bazı noktalara dikkat etmeniz gerekiyor.
    - #[kelime]
      - Hashtag(#) sembolünü kullanarak yapacağınız aramalarla Google+, Twitter ve diğer sosyal medya platformlarında yer alan hashtag'lere ait sonuçları listeleyebilirsiniz.
    - @[kisi-ismi]
      - Sosyal medya kanalları üzerinde yapacağınız kişi aramaları için kişi isminden önce "@" sembolünü kullanmamız gerekmekte.
- Gün doğumu ve gün batımı sonuçları.
  - Google'ı dünya üzerindeki herhangi bir şehrin veya bölgenin gün doğumu ve gün batımı saatlerini öğrenmek için kullanabilirsiniz.
- Eş anlamlı kelime ile arama yapma.
  - "~" sembolünden sonra yazacağınız herhangi bir kelime eş anlamlı alternatifleriyle aratılacak. Bu sembolü yapmak için;
  - `AltGr + Ü kombinasyonunu kullanabilirsiniz.`
- Limitler arası arama yapma.
  - Google'da belirli limitler arasında arama yapabilirsiniz. Bu limitler fiyat aralığı, tarih veya ölçü birimi olabilir.
  - `Örnek Arama -> 3000..4000 TL Android Telefon`

Google'da arama yaparken bu adımları izleyerek daha hedef odaklı aramalar yapılabilir ve arama yaparken harcayacağınız vakti hatırı sayılır ölçüde kısaltabilirsiniz. Bahsini ettiğimiz teknikleri tek tek uygulayabileceğiniz gibi birkaç tanesini kombine edip arama yapmak da mümkün.
# Developer'lar İçin Platformlar
- **[Stack Overflow](https://stackoverflow.com/)**
  - Stack Overflow programlama ve kodlama ile ilgili spesifik sorularınızı sorabileceğiniz veya başkalarının sorduğu sorulara cevap verebileceğiniz bir platform. Kurulduğu günden bu yana milyonlarca kullanıcı tarafından milyonlarca soruya cevap verildiği için yeni soru oluşturmadan önce cevaplananlara göz atmakta fayda var.
- **[HackerRank](https://www.hackerrank.com/)**
  - Bu sitenin genel kuruluş amacı aslında yazılımcı çalıştırmak isteyen firmalara yazılımcı istihdamı sağlamak. Firmalar bu site içerisinde yazılımcıların mülakatlarını yapıp bilgi seviyelerini ölçebiliyor ve profillerini inceleyip onlara iş teklifi sunabiliyor. Türkiye'de henüz bu amaçla kullanılmasa da mülakatlarda göreceğiniz test caselerde bu platformdan sorulara denk gelebilirsiniz. Kendinizi geliştirmek istediğiniz bir programlama dilinde veya yapay zeka, veri tabanı, SQL programlama, matematik gibi birçok alanda pratik yapabiliyorsunuz. Eğitim kamplarına katılabiliyor ve ilerleme kaydettikçe rozet/sertifika kazanabiliyorsunuz. Yazdığınız çözümün daha kısa yolu varsa bununla ilgili geri bildirim alabiliyor ve buna göre kodunuzu düzenleyebiliyorsunuz. Başkalarının yazdığı kodları görebiliyor, diğer yazılımcılarla toplu halde veya birebir iletişime geçebiliyorsunuz.
- **[Codility](https://www.codility.com/)**
  - Codility de HackerRank'e benzer şekilde şirketlerin programcı işe alım süreçlerini hızlandırmaya yönelik kurulmuş bir site. Bu servisi kullanan şirketler, programcı işe almak istedikleri zaman platform üzerinde bir challenge oluşturup adaylara ilgili linki yolluyorlar. Adaylar da ilgili platforma girip, verilen süre zarfında ilgili sorunları çözüyor. Platform her ne kadar şirketler için kurulmuş olsa da bireysel olarak kendini test etmek isteyen kişiler ücretsiz bir şekilde kayıt olup, yararlanabiliyorlar. Programcılar için dersler kategorisi altında algoritma yeteneğinizi geliştirmeye yönelik pek çok soru bulunuyor. Testlerin hemen altında bulunan yorumlar kısmından da takıldığınız yerlerle ilgili sorular sorabiliyor ve cevaplar alabiliyorsunuz.
- **[Project Euler](https://projecteuler.net/)**
  - Project Euler sitesi oldukça zorlu matematik ve problemlerinden oluşuyor. Zihninize farklı düşünmeyi öğretmek ve problem çözme yeteneğinizi geliştirmek istiyorsanız Project Euler iyi bir seçenek olacaktır.
- **[GitHub](https://github.com/)**
  - GitHub, proje yönetim ve versiyon kontrol sistemi olmakla birlikte, ayrıca geliştiricler için yapılmış bir sosyal ağ platformu. Tüm dünyadan başka insanlarla işbirliği içinde çalışmanıza, projelerinizi planlamanıza ve izlemenize olanak sağlıyor.
- **[Kod Koda](https://www.kodkoda.com/)**
  - Kod Koda, 2020 yılında Kodluyoruz tarafından hazırlanan, yazılımla ilgilenen kişilerin sorular sorup cevaplayabildiği bir platformdur.
- **[CodeWars](https://www.codewars.com/)**
- **[LeetCode](https://leetcode.com/)**
- **[edabit](https://edabit.com/)**
- **[repl.it](https://repl.it/)**
- **[CodePen](https://codepen.io/)**
- **[Exercism .io](https://exercism.io/)**