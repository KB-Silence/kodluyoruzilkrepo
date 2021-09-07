import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfından nesne oluşturuldu.
        Scanner inp = new Scanner(System.in);

        // İlgili işlemler için değişkenler oluşturuldu.
        int acilis = 10 , minTutar = 20;
        double kmBasi = 2.20, km, taksiUcreti, odenecekTutar;

        // Kullanıcıdan giriş yapması istendi ve girilen değer değişkene atandı.
        System.out.print("Kilometre Girin: ");
        km = inp.nextDouble();
        System.out.println("----------------------");

        // KM'ye göre fiyat hesaplaması ve kontrolü yapıldı.
        taksiUcreti = acilis + (km * kmBasi);
        odenecekTutar = (taksiUcreti > 20) ? taksiUcreti : minTutar ;

        // İşlem sonuçları ekrana bastırıldı.
        System.out.println("Minimum Ödeme Tutarı: " + minTutar + " TL");
        System.out.println("Taksi Ücreti: " + taksiUcreti + " TL");
        System.out.println("Ödenecek Tutar: " + odenecekTutar + " TL");
    }
}
