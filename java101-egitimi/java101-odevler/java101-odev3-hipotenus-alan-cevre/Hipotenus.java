import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfından nesne oluşturuldu.
        Scanner inp = new Scanner(System.in);

        // Hipotenüs hesaplama ile ilgili değişkenler oluşturuldu.
        int a, b;
        double c;

        // Çevre ve Alan hesaplama ile ilgili değişkenler oluşturuldu.
        double kenar1, kenar2, kenar3, cevre, cevreYarisi, alan;


        // Kullanıcıya giriş yapması belirtildi ve girilen değerler değişkenlere atandı.
        System.out.print("1. Kenarı Giriniz: ");
        a = inp.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = inp.nextInt();
        System.out.println("----------------------");

        // Hipotenüs hesaplaması yapıldı ve sonuç ekrana yazdırıldı.
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);
        System.out.println("----------------------");

        // Kullanıcıya giriş yapması belirtildi ve girilen değerler değişkenlere atandı.
        System.out.print("1.Kenar Uzunluğu : ");
        kenar1 = inp.nextDouble();
        System.out.print("2.Kenar Uzunluğu : ");
        kenar2 = inp.nextDouble();
        System.out.print("3.Kenar Uzunluğu : ");
        kenar3 = inp.nextDouble();
        System.out.println("----------------------");

        // Çevre ve çevre uzunluğunun yarısının hesaplanması
        cevre = kenar1 + kenar2 + kenar3;
        cevreYarisi = (cevre) / 2;

        // Alan hesaplaması
        alan = Math.sqrt(cevreYarisi*(cevreYarisi-kenar1)*(cevreYarisi-kenar2)*(cevreYarisi-kenar3));

        // Alan ve Çevre sonuçları ekrana yazdırıldı
        System.out.println("Üçgenin Çevresi: " + cevre + " birim.");
        System.out.println("Çevre Uzunluğunun Yarısı: " + cevreYarisi);
        System.out.println("Üçgenin Alanı: " + alan + " birim.");
    }
}
