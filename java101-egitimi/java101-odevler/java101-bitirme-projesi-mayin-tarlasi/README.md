# Ödev
### Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.
```
Oyun metin tabanlıdır.

Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.

Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.

Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)

Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.

Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.

Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.

Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı,solu,yukarısı,aşağısı,sol üst çapraz,sağ üst çapraz,sağ alt çapraz,sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.

Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
```

## **OUTPUT**
![output106](https://user-images.githubusercontent.com/74976052/134213455-c0ea18ab-a05e-4681-8e46-d84828b117b4.png)  
![output107](https://user-images.githubusercontent.com/74976052/134213453-fd0cc931-f6ce-4f37-9ca3-e08bdce74d4d.png)  
![output108](https://user-images.githubusercontent.com/74976052/134213452-60b9ba01-1f98-4a3a-8959-350341d596c7.png)  
![output109](https://user-images.githubusercontent.com/74976052/134213451-8ed545e1-9a29-4809-9f9a-a8bb771819c4.png)  
![output110](https://user-images.githubusercontent.com/74976052/134213450-e867f517-565b-4a35-8611-0c1fa3349493.png)  
![output111](https://user-images.githubusercontent.com/74976052/134213448-325ab9e4-87ea-411d-a82e-16e8a0f8a2e1.png)