# Ödev
Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

- Hayvanlar
  - Atlar(atlar, zebralar, eşekler vb.),
  - Kedigiller(kaplanlar, aslanlar vb.),
  - Kemirgenler(sıçanlar, kunduzlar vb.)
- Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
  - tür adı, ağırlığı, yaşı vb.
- Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli.
  - `getDosage()`
- Sistem yem ver zamanlarını hesaplayabilmelidir.
  - `getFeedSchedule()`

> Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.
>
> Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.

## **OUTPUT**
![output115](https://user-images.githubusercontent.com/74976052/134783586-2457a805-5442-4c42-bfa2-68ee10de99fc.png)

- Hayvan adında ata sınıf`(super class)` olacak soyutlanmış`(abstract)` bir sınıfımız var.
- Hayvan sınıfından hiyerarşik kalıtım yapan 3 alt sınıf`(sub class)` var.
  - Kalıtım yapan alt sınıflar, ata sınıfın niteliklerini alıyor.
  - Kalıtım yapan alt sınıflar, ihtiyaçlarına göre kullanmak için ata sınıfın metotlarını eziyor`(overriding)`.
- Atgiller sınıfından hiyerarşik kalıtım yapan 3 alt sınıf`(sub class)` var.
  - Kalıtım yapan alt sınıflar, ata sınıfın niteliklerini alıyor.
  - At sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` ve `getFeedSchedule()` metotlarını eziyor`(overriding)`.
  - Zebra sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` metodunu eziyorç
  - Eşek sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getFeedSchedule()` metodunu eziyor.
- Kedigiller sınıfından hiyerarşik kalıtım yapan 3 alt sınıf`(sub class)` var.
  - Kalıtım yapan alt sınıflar, ata sınıfın niteliklerini alıyor.
  - Kaplan sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getFeedSchedule()` metodunu eziyor.
  - Aslan sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getFeedSchedule()` metodunu eziyor.
  - Kedi sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` metodunu eziyor.
- Kemirgenler sınıfından hiyerarşik kalıtım yapan 3 alt sınıf`(sub class)` var.
  - Kalıtım yapan alt sınıflar, ata sınıfın niteliklerini alıyor.
  - Sincap sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` ve `getFeedSchedule()` metotlarını eziyor.
  - Kunduz sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` ve `getFeedSchedule()` metotlarını eziyor.
  - Sıçan sınıfı ihtiyaca göre kullanım amacıyla ata sınıfın `getDossage()` ve `getFeedSchedule()` metotlarını eziyor.