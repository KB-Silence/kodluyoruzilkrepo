import java.text.DecimalFormat;
import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama = 0;

        System.out.print("Matematik Notunu Girin: ");
        matematik = inp.nextDouble();
        System.out.print("Fizik Notunu Girin: ");
        fizik = inp.nextDouble();
        System.out.print("Kimya Notunu Girin: ");
        kimya = inp.nextDouble();
        System.out.print("Türkçe Notunu Girin: ");
        turkce = inp.nextDouble();
        System.out.print("Tarih Notunu Girin: ");
        tarih = inp.nextDouble();
        System.out.print("Müzik Notunu Girin: ");
        muzik = inp.nextDouble();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("-------------------------------------------");
        System.out.print("Not Ortalaması: " + new DecimalFormat("##.##").format(ortalama));
        System.out.print((ortalama > 60) ? " | Sınıfı Geçti" : " | Sınıfta Kaldı");
    }
}
