import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner sınıfından nesne oluşturuldu.
        Scanner inp = new Scanner(System.in);

        // İlgili işlemler için değişkenler oluşturuldu.
        double pi = 3.14, alan, cevre, yariCap, dilimYariCap, merkezAci, dilimAlanı ;

        // Kullanıcıdan giriş yapması istendi ve girilen değer değişkene atandı.
        System.out.print("Dairenin Yarı Çapını Girin: ");
        yariCap = inp.nextDouble();
        System.out.println("----------------------");

        // Dairenin alan ve çevre hesaplamaları yapıldı.
        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        // İşlem sonuçları ekrana bastırıldı
        System.out.println("Dairenin Çevresi : " + cevre + " birim.");
        System.out.println("Dairenin Alanı: " + alan + " birim.");
        System.out.println("----------------------");

        // Kullanıcıdan giriş yapması istendi ve girilen değer değişkene atandı.

        System.out.print("Dilim Yarı Çapını Girin: ");
        dilimYariCap = inp.nextDouble();
        System.out.print("Merkez Açısını Girin: ");
        merkezAci = inp.nextDouble();

        // Merkez Açı hesaplaması yapıldı.
        dilimAlanı = (pi * (dilimYariCap * dilimYariCap) * merkezAci) / 360;

        // İşlem sonuçları ekrana bastırıldı
        System.out.println("Daire Diliminin Alanı: " + dilimAlanı);
    }
}
