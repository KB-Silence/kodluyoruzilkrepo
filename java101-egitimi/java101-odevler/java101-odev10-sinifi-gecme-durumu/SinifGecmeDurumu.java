package Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double mat, fizik, turkce, kimya, muzik;
        double ortalama;

        System.out.print("Matematik Notunu Girin: ");
        mat = scn.nextInt();
        System.out.print("Fizik Notunu Girin: ");
        fizik = scn.nextInt();
        System.out.print("Türkçe Notunu Girin: ");
        turkce = scn.nextInt();
        System.out.print("Kimya Notunu Girin: ");
        kimya = scn.nextInt();
        System.out.print("Müzik Notunu Girin: ");
        muzik = scn.nextInt();
        System.out.println("----------------------");

        mat = (mat < 0 || mat > 100) ? 0 : mat;
        fizik = (fizik < 0 || fizik > 100) ? 0 : fizik;
        turkce = (turkce < 0 || turkce > 100) ? 0 : turkce;
        kimya = (kimya < 0 || kimya > 100) ? 0 : kimya;
        muzik = (muzik < 0 || muzik > 100) ? 0 : muzik;

        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama >= 55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız.");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
