# KAYNAK
## **[patika.dev](https://app.patika.dev/)**

## Patika.dev - GIT ve İleri Düzey GIT eğitimleri kapsamındaki içeriklere göre hazırlanmıştır.  
> Ufak düzeyde değişiklikler ve düzenlemeler yapıldı.

<br>

## **BAŞLIKLAR**
- [KAYNAK](#kaynak)
  - [**patika.dev**](#patikadev)
  - [Patika.dev - GIT ve İleri Düzey GIT eğitimleri kapsamındaki içeriklere göre hazırlanmıştır.](#patikadev---git-ve-i̇leri-düzey-git-eğitimleri-kapsamındaki-içeriklere-göre-hazırlanmıştır)
  - [**BAŞLIKLAR**](#başliklar)
- [GIT Eğitimi](#git-eğitimi)
  - ["git" Kelimesinin Anlamı](#git-kelimesinin-anlamı)
  - [GIT'in Tarihsel Gelişimi](#gitin-tarihsel-gelişimi)
  - [GIT Versiyon Kontrol Sistemi Nedir?](#git-versiyon-kontrol-sistemi-nedir)
  - [GIT Ne Sağlar?](#git-ne-sağlar)
  - [GitHub, GitLab, BitBucket Nedir?](#github-gitlab-bitbucket-nedir)
  - [GIT Temel Komutları](#git-temel-komutları)
    - [Başlıca Bilinmesi Gereken Terimler](#başlıca-bilinmesi-gereken-terimler)
    - [git init](#git-init)
    - [git config](#git-config)
    - [git add](#git-add)
    - [git rm](#git-rm)
    - [git status](#git-status)
    - [git commit](#git-commit)
    - [git log](#git-log)
    - [git branch](#git-branch)
    - [git checkout](#git-checkout)
    - [git merge](#git-merge)
    - [git clone](#git-clone)
    - [git pull](#git-pull)
    - [git push](#git-push)
    - [git diff](#git-diff)
  - [.gitignore Ne İşe Yarar? Nasıl Kullanılır?](#gitignore-ne-i̇şe-yarar-nasıl-kullanılır)
    - [Hangi Tür Dosyalar?](#hangi-tür-dosyalar)
    - [Nasıl Oluşturulur?](#nasıl-oluşturulur)
    - [Nasıl Kullanılmalı?](#nasıl-kullanılmalı)
    - [Dikkat Edilmesi Gerekenler](#dikkat-edilmesi-gerekenler)
  - [Markdown Nedir?](#markdown-nedir)
    - [Başlıklar](#başlıklar)
    - [Paragraf](#paragraf)
    - [Kalın, Eğik ve Üstü Çizili İfadeler](#kalın-eğik-ve-üstü-çizili-i̇fadeler)
    - [Tek ve Çok Satırlı Kod Blokları](#tek-ve-çok-satırlı-kod-blokları)
    - [Yatay Çizgi](#yatay-çizgi)
    - [Listeler](#listeler)
    - [Tablolar](#tablolar)
    - [Bağlantı ve Resim Eklemek](#bağlantı-ve-resim-eklemek)
    - [Alıntı](#alıntı)

# GIT Eğitimi
## "git" Kelimesinin Anlamı
Cambridge Sözlüğe göre; aptal, hoş olmayan kişi anlamına geliyor.
> “Ben bir egoistim ve projelerime kendi ismimi veriyorum. Önceki Linux şimdiki git.”
> 
> -Torvalds

- Torvalds alternatif olarak kelimenin ruh haline göre aşağıdaki anlamlara da gelebileceğinden bahsediyor;
  - Yayın bir UNIX* komutu tarafından kullanılmayan, telaffuz edilebilir, rastgele üç harfli bir kombinasyon.
  - Sözlükteki argo anlamı ile; Aptal, Aşağılık ve Basit.
  - “Küresel bilgi izleyici” (Global Information Tracker)
“Kahrolası aptal kamyon dolusu pislik” (Goddamn Idiotic Truckload of shit).
## GIT'in Tarihsel Gelişimi
Linux’un mimarı Linus Torvalds, çok sayıda kişi ile birlikte Linux çekirdeğini geliştirirken projenin yönetimi için o dönem piyasada bulunan BitKeeper* adındaki versiyon kontrol sistemini tercih etmiş. Fakat BitKeeper’in telif haklarını elinde bulunduran kişi ile yaşanan yasal sorunlardan ötürü bu kullanımdan vazgeçilmiş.

O günlerde piyasada bulunan versiyon kontrol sistemlerinin hiçbiri aslında Torvalds’ın beklentilerini karşılamıyormuş.

Bu sebeple ihtiyaçlarına çözüm için kolları sıvayan Torvalds, piyasadaki sistemleri inceleyerek kendi version kontrol sistemini yazmaya başlamış. İlk sürüm 2005 yılında piyasaya sürülmüş. Yayınlanmasından günümüze kadar geçen sürede ise GIT büyük bir pazar hacmine ulaştı.
## GIT Versiyon Kontrol Sistemi Nedir?
Bir döküman(yazılım projesi, ofis belgesi vb.) üzerinde yaptığımız değişiklikleri adım adım izleyen, istediğinizde kayıt eden ve isterseniz bunu internet üzerindeki bir bilgisayarda veya yerel bir cihazda(repository/repo) saklamanızı ve yönetmenizi sağlayan bir sistemdir.

Versiyon Kontrol Sistemi yerine Kaynak Kod Yönetim sistemi ifadesi ile de bahsedilebilir.
## GIT Ne Sağlar?
-	Birden fazla yerde(dağıtık olarak) dosyalarını ve versiyon kontrol bilgilerini depolayabilirsiniz. Böylelikle cihaz bağımsız olarak dosyalarınıza erişebilirsiniz.
-	“commit” yaparak SnapShot*(anlık görüntü) özelliği ile istediğiniz zaman proje veya dosyaların o anki halini kayıt altına alabilirsiniz. Böylelikle ileride bir hata ile karşılaşırsanız herhangi bir zamandaki herhangi bir versiyona dönüş yapabilirsiniz.
-	SnapShot alındıktan sonra değişiklik yapılan dosyaları görebilirsiniz.
-	Takımların aynı projede beraber çalışmasına imkan verir. Kimin neyi ekleyip/düzenlediği, neyi çıkarttığı, ne zaman değişiklik yaptığı  gibi bilgilere erişebilirsiniz. Bu sayede topluluk ile proje geliştirme süreçlerini kolaylaştırabilirsiniz.
-	Projede versiyonlanmasını istemediğiniz dosyaları belirtebilirsiniz. (node_modules, .mp4, .log, .env gibi)
## GitHub, GitLab, BitBucket Nedir?
- **GitHub**
  - Yazılımcılar için bir kod kütüphanesi ve bir çeşit sosyal medya ortamıdır. Yazılım geliştiriciler projelerini halka açık veya özel olarak saklayabilir. Ücret3i ve ücretsiz paket seçenekleri mevcuttur.
- **GitLab**
  - GitHub gibi bir GIT servisidir. Farklı olarak firmalara GitLab’I kendi sunucularına kurma imkanı verildiği için genelde kurumsal tarafta kullanılır. GitLab ile firmalar kendi içerisinde GIT hizmetlerinden faydalanabilir.
- **BitBucket**
  - Genelde kişisel kullanıma yöneliktir.GitHub tarafındaki açık kaynak projeler ve sosyal medya ortamı burada gelişmemiştir.

> Bu servisler haricinde **GitKraken**, **SourceTree** gibi irili ufaklı farklı servisler de mevcuttur.
## GIT Temel Komutları
### Başlıca Bilinmesi Gereken Terimler
- untracked (izlenmeyen)
  - GIT tarafından henüz takip edilmeyen, yani yeni oluşturulmuş dosyaları ifade eder.
- unstaged (hazırlanmamış)
  - Güncellenmiş ancak commit’lenmek için hazırlanmamış dosyaları ifade eder.
- staged (hazırlanmış)
  - Commit’lenmeye hazır olan dosyaları ifade eder.
- deleted (silinmiş)
  - Projeden silinmiş ama GIT üzerinden kaldırılmamış dosyaları ifade eder.
### git init
Henüz versiyon kontrolü altında olmayan bir projenin dizininde, boş bir git deposu oluşturmak için kullanılır.
`git init`
### git config
GIT'in bir çok konfigürasyon ve ayarı vardır, bunlardan ikisi user.name ve user.email olanıdır. Bu ayarları yapılandırmak için aşağıdaki komutları kullanırız. GIT'i ilk kurduğumuzda genellikle aldığımız ilk hata bu konfigürasyon ayarlarını yapmadığımız için gelir. Ayrıca bu ayarlar "--global" yani sistem genelinde geçerli ayarlardır. Proje bazlı bu ayarları değiştirebiliriz.  
`git config --global user.name "KB-Silence"`  
`git config --global user.email berkcanserbest5@gmail.com`
- Bu ayarların bütününü görüntülemek için
  - `git config --list`
- Hata alma durumunda
  - `git config core.autocrlf true`
### git add
Yeni eklenen veya üzerinde değişiklik yapılan dosyaları "staged" ortamına göndermek için kullanılır.
- Tek seferde bütün dosyaları eklemek için
  - 3 komutta aynı görevi görür.
    - `git add .`
    - `git add *`
    - `git add -A .`
>-A(all) tümü anlamındadır.
>
>.(nokta) ise tüm dosya uzantılarını ifade eder.
- Tek bir dosya veya klasör eklemek için
  - `git add <file_name or folder_name>`
### git rm
Staged ortamına eklenmiş bir dosyanın takibinin bırakılması yani untracked(izlenmeyen) hale getirilmesini sağlayan komuttur.  
`git rm --cached <dosya_adi veya klasor_adi>`
- Dosyayı klasörden silmek istiyorsak
  - `git rm <dosya_adi veya klasor_adi>`
### git status
Üzerinde çalışılan projenin o anki durumu hakkında bilgi verir. Yapılan değişiklikler, eklenen ve silinen dosyalar gibi bilgiler listelenir.
- On Branch Main
  - Hangi branchte olduğumuzu gösterir.
- Changes to be commited
  - Commit'lenmeye hazır değişiklikler olduğunu gösterir.
- Modified
  - Değişiklik yapılan dosyaları gösterir.
- Deleted
  - Silinen dosyaları gösterir.
- Changes Not Staged For Commit
  - Üzerinde değişiklik yapılan ama staged ortamına gönderilmemiş dosyaları gösterir.
- Untracked File
  - Takibi yapılmayan dosyaları gösterir.
### git commit
Commit, staged ortamına alınan dosyaların Local Repository'e gönderilmesidir. En iyi uygulama yöntemi her kayıt sırasında yapılan değişikliklere açıklayıcı bir mesaj eklemektir. Ayrıca her commit benzersiz bir kimliğe (unique ID) sahip olur. Bu sayede eski bir commit'e geri dönebilirsiniz ve herhangi bir kayıp yaşama ihtimaliniz kalmaz.  
`git commit -m "ilk commit mesajı"`
> "-m" ifadesi, mesaj(message) kelimesinin kısaltmasıdır.
### git log
Projedeki commit geçmişini görüntülememizi sağlar. Bütün commitler, ID'si, yazarı, tarihi ve mesajı ile beraber listelenir.
### git branch
Local veya remote(uzak) repository üzerinde yeni bir branch(dal) eklemek, silmek, veya listelemek için kullanılır.
- Yeni bir branch eklemek için
  - `git branch <branch_name>`
- Tüm branchleri listelemek için
  - `git branch -a`
- Bir branch silmek için
  - `git branch -d <branch_Name>`
### git checkout
Branchler(dallar) veya commitler arasında geçiş yapmak için kullanılan komut. Takım halinde çalışılan projelerde kullanımı daha yaygındır.
- Mevcut bir branch'a geçiş yapmak için
  - `git checkout <branch_name>`
- Yeni bir branch oluşturup, oluşturulan branch'a geçiş yapmak için
  - `git checkout -b <branch_name>`
- Commitler arası geçiş yapmak için
  - `git checkout <commit_ID>`
### git merge
Başka bir branch'da olan değişiklikleri, bulunduğumuz branch ile birleştirmek istediğimizde kullanılır.  
`git merge <branch_name>`
### git clone
Mevcut bir Remote Repository'de bulunan dosyaların bilgisayarımızda bir kopyasının oluşturulmasını sağlar.
`git clone <remote_URL>`
### git pull
Remote Branch'te yapılan değişiklikler ile ilgili bilgileri indirmek ve bu değişiklikleri local branch'e entegre etmek için kullanılır.
### git push
Projemizde aldığımız commit'leri, remote repository'e gönderir.  
`git push origing master`
> Burada bahsi geçen origin remote repository’nin kök dizinini belirtir ve sabit bir isimdir. master ise sizin çalıştığınız branch (dal)’ı belirtir.

- Henüz remote repository yoksa local deponuzu uzak sunucudaki depoya bağlamak için
  - `git remote add origin http://uzak_deponun_adresi.git`
### git diff
Repository üzerindeki yapılan değişikliklerden sonra dosyalar arasında oluşan farklılıkları gösterir.
- Çalışma dizini ile Repository(HEAD) arasındaki farklılıklar için
  - `git diff HEAD`
- İki Commit arasındaki farklılıkları görmek için
  - `git diff <commit_ID_1>..<commit_ID_2>`
- Çalışma dizini ve Staged ortamı arasındaki farklılıkları görmek için
  - `git diff --staged`
## .gitignore Ne İşe Yarar? Nasıl Kullanılır?
.gitignore dosyası projemizin kök dizinine oluşturulan düz bir metin dosyasıdır. Local çalışma alanındaki takip edilmesini istemediğimiz, takım arkadaşlarımız için gerekmeyen dosyalar varsa veya bu dosyaların boyutu repoya atmaya gerek olmayacak kadar büyük ölçekli ise gitignore kullanmamız gerekiyor.

Bu dosyaları .gitignore dosyasına eklersek GIT bu dosyaları artık takip etmez. Üstelik bu işlemler yapılırken halihazırdaki dosyaları hiç bir şekilde etkilemez.
### Hangi Tür Dosyalar?
- Paket yöneticisinden indirilen bağımlılıklar.
- Image ve video dosyaları(dosya boyutları fazla olabilir).
- IDE eklentileri. **(.vscode)**
- Sadece kendi çalışma alanınızda olması gereken başkaları tarafından görülmemesi gereken dosyalar. **(veritabanı konfigürasyonu)**
- API anahtarları, kimlik bilgileri veya hassas bilgiler içeren dosyalar. **(.env)**
- Çalışma dizinindeki geçici dosyalar
- Log dosyaları
- Yararsız sistem dosyaları. **(MacOS işletim sisteminin .DS_Store dosyası)**
- dist gibi oluşturulan dosyalar

Bunlar haricinde GIT'in takip etmesini istemediğiniz ve repository'e göndermek istemediğiniz herhangi bir dosya da olabilir.
### Nasıl Oluşturulur?
Reponuzu oluştururken **add .gittignore file** seçeneğine tıklayarak reponuzla beraber oluşturabilirsiniz. Aynı şekilde editörde .gitignore şeklinde de oluşturulabilir.
- Terminalden oluşturmak için
  - `echo some-text or nothing > .gitignore`
  - Buradaki **some-text or nothing** kısmı .gitignore dosyasına yazılmasını istediğiniz metini ekler. Hiçbir şey de yazmayabilirsiniz.
### Nasıl Kullanılmalı?
.gitignore dosyasının her satırına takip edilmesini istemediğimiz dosyaları veya dizinleri yazarak göz ardı edebiliriz.  
**Tabii bu dosyaları yazarken bize kolaylık sağlayan bazı formatlar var**
- .env
- Dizinleri klasör isminin sonuna '/' işareti ekleyerek belirtiriz.
  - node-modules/
  - dist/
  - logs/
- Bir klasörün içerisindeki **'example.txt'** haricindeki dosyaların izlenmesini istemiyorsak '!' işaretini kullanırız.
  - !files/example.txt
  - Daha öncesinde 'files' klasörü .gitignore dosyasına eklenmişse sonradan '!' kullanımı ile işlem yapmak işe yaramayacaktır.
  - files/
  - !files/example.txt
- .gitignore dosyasında yorum satırı oluşturmak için '#' karakterini kullanırız.
  - **\# production**
  - build/
  - **\# dependencies**
  - node_modules/
### Dikkat Edilmesi Gerekenler
Eğer projeyi 'git add .' veya 'git commit' etmişseniz sonrasında '.gitignore' dosyasına eklemek istediğiniz dosyası ekleseniz de bu işlem gerçekleşmeyecektir ve o dosyanız reponuzda hala GIT ile takip edilecektir.
- Bu gibi bir durum için
  - `git rm --cached FILENAME`

Belli başlı dosyaları her projede .gitignore dosyasına eklemek yerine `C:\Users\kullanıcıadı\` adresine `.gitignore_global` dosyası oluşturup içerisine global olmasını istediğimiz dosyaları ekledikten sonra `git bash` terminalini açarak aşağıdaki komut ile konfigürasyon sağlayabiliriz.
- `git config --global core.excludesfile "%USERPROFILE%\.gitignore"`
- Doğru çalıştığını kontrol etmek için ise aşağıdaki komutu çalıştırarak aynı çıktıyı aldığınızda sorunsuz çalıştırabilmişsinizdir.
  - `git config --global core.excludesfile`
  - **Çıktı:** `C:/Users/user-name/.gitignore-global`

Son olarak, hangi `.gitignore` dosyalarını eklememiz gerektiğini, hangi dil, hangi framework vs. kullanıyorsak ona ait `.gitignore` dosyalarını ilgili kaynaktan bulabiliriz.  
- **[.gitignore](https://github.com/github/gitignore)**

Global olarak düzenlemek istediğimiz, `.gitignore` dosyaları için
- **[.gitignore/Global](https://github.com/github/gitignore/tree/master/Global)**
## Markdown Nedir?
Markdow, John Gruber ve Aaron Swartz tarafından geliştirilen ve 2004 yılından bu yana kullanılan metinden HTML'e (text-to-HTML) dönüşüm için kullanılan hafif bir işaretleme dilidir.
GitHub gibi platformları kullananların aşina olduğu Markdown formatı, yaygın kanının aksine sadece README dosyaları oluşturmak için kullanılamaz. Temel amaç okunabilirliği ve kullanılabilirliği arttırmaktır. Basitliği ve sadeliği sayesinde forumlarda ileti yazmaktan, kitap yazmaya kadar pek çok yerde kullanılabilir. Asıl güçlü olduğu kısım klavyeden elinizi kaldırmadan tablolardan, matematiksel ifadelere kadar ihtiyaç duyduğunuz her şeyi oluşturabilmeniz ve sonrasında biçimlendirebilmenizdir.
### Başlıklar
HTML'de `<h1>, <h2>, <h3>` etiketleri ile aç-kapat yaparak oluşturduğumuz başlıkları, Markdown ile sadece `#` karakterini kullanarak oluşturabiliyoruz. Burada önemli olan nokta `#` karakterinden sonra boşluk bırakmaktır.

`h1` ve `h2` başlıklar yazarken alternatif olarak bir yöntem daha mevcut. `h1` için `=` ve `h2` için `-` kullanabilirsiniz.
### Paragraf
Paragraf oluşturmak için haricen bir işlem yapmak gerekmiyor. Markdown formatında yazıyorsanız yeni bir satır oluşturmak paragraf için yeterli. Bir paragraf tek satırdan oluşabilecei gibi, arada boşluk bırakmadan alt satırdan devam etmek de mümkün.
### Kalın, Eğik ve Üstü Çizili İfadeler
Yaygın kullanımda kalın yazmak için `**`, eğik yazmak için `*`, hem kalın hem eğik yazmak için `***` kullanılmaktadır. Üstü çizili ifadeler için `~~` karakterleri kullanılır.
- **Kalın İfade**
- *Eğik İfade*
- ***Eğik ve Kalın İfade***
- ~~Üstü Çizili İfade~~ 
### Tek ve Çok Satırlı Kod Blokları
- Tek satır kod bloğu için kodun başına ve sonuna `(backtick) karakteri eklenir.
- Çok satır kod bloğu için kodun başına ve sonuna 3 adet ```(backtick) karakteri eklenir.

Yazılım diline göre kod bloğundaki ifadelerin stillendirilmesini isterseniz, kod bloğunun başındaki 3 adet backstick ifadesinden sonra `javascript, python, css` gibi etiketler ekleyebilirsiniz.
### Yatay Çizgi
İçerikte bölümleme yapmak için `---` kullanabilirsiniz. HTML'deki karşılığı `<hr>` tagıdır.
### Listeler
HTML'de `<ul></ul>` ve `<li></li>` etiketleri ile oluşturulan listeler Markdown formatında `-` ve `*` ile oluşturulur.
- Liste Elemanı 1
- Liste Elemanı 2
- Liste Elemanı 3

Sıralı liste elde etmek için tek yapmanız gereken liste elemanlarının başına sıra numarası ve .(nokta) eklemek.
1. Liste Elemanı
2. Liste Elemanı
3. Liste Elemanı

Markdown ile iç içe listeler yapmak da oldukça kolay. Alt listelere tab ile girinti verdiğinizde otomatik olarak `nested list` yapısına dönüşmekte.
- Liste Elemanı 1
  - Alt liste elemanı 1
    - Alt liste elemanı 2
- Liste Elemanı 2
  - Alt liste elemanı 1
    - Alt liste elemanı 2
### Tablolar
Tablo oluşturmak için aşağıdaki yapı kullanılır. Satır çizgisi için kullanılan `-` karakterine, `:(iki nokta)` işareti eklenerek tabloda sola, sağa veya ortaya hizalama yapılabilir.
```
| Ürünlerin Numaraları| Ürün Açıklaması| Ürünlerin Fiyatı|
| :--- | :---: | ---: |
| 1 | Açıklama | Fiyatı |
```
| Ürünlerin Numaraları| Ürün Açıklaması| Ürünlerin Fiyatı|
| :--- | :---: | ---: |
| 1 | Açıklama | Fiyatı |
### Bağlantı ve Resim Eklemek
HTML'den aşina olduğumuz `<a>` etiketi yerine Markdown'da `[]()` karakterleri ile bağlantı ekleyebiliriz. Resim eklemek için ise `![]()` karakterleri kullanılır.
- `[]` Köşeli parantez açıklamayı, `()` küme parantezi ise bağlantı adresini barındırır.
- Resim eklerken köşeli parantez içerisini doldurmak zorunlu değildir.
- Bağlantı eklemek için
  - `[baglanti-aciklamasi](baglanti-adresi)`
  - **[Berkcan Serbest - Github](https://github.com/KB-Silence)**
- Resim eklemek için
- `![resim-aciklamasi](resim-baglanti-adresi)`
- ![git](https://user-images.githubusercontent.com/74976052/134555972-49abbcd7-ed1c-4ed2-b87f-e9f5709f51d3.png)
### Alıntı
Yazının içinde alıntı kullanmak için metinin başına `>` karakteri koyulur.
> Alntı bir metin.