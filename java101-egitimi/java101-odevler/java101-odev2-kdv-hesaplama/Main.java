import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {

        // kullanıcıdan veri almak için scanner sınıfından 'inp' adında nesne oluşturuldu.
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan veri almak ve kdv hesaplaması yapmak için değişkenler oluşturuldu.
        int kdv;
        double fiyat;
        double sonuc;

        // kullanıcının giriş yapması için mesaj bastırıldı ve girilen değer değişkene atandı.
        System.out.print("Ürün Fiyatı Girin: ");
        fiyat = inp.nextDouble();
        System.out.println("----------------------------------");

        // fiyat tutarına göre kdv değeri belirlendi ve  hesaplaması yapıldı.
        kdv = (fiyat < 1000) ? 18 : 8;
        sonuc = fiyat + (fiyat * kdv / 100);

        // hesaplama sonucu ve tutarlar ekrana bastırıldı.
        System.out.println("KDV'siz Fiyat: " + fiyat + " TL");
        System.out.println("KDV Tutarı: %" + kdv);
        System.out.println("KDV'li Fiyat: " + sonuc + " TL");
    }
}
