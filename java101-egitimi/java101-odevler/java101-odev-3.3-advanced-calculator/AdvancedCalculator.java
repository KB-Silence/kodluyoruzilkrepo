import java.text.DecimalFormat;
import java.util.Scanner;

public class AdvancedCalculator {
    static Scanner scan = new Scanner(System.in);
    static int result, number, i = 1;

    static void resetVariable() {
        result = 0;
        number = 0;
        i = 1;
    }

    static void sum() {
        while (true) {
            System.out.printf("%s. Sayıyı Girin: ", i);
            number = scan.nextInt();
            if (number == 0) break;
            result += number;
            i++;
        }
        System.out.println("\nToplam Sonuç: " + result);
        resetVariable();
    }

    static void sub() {
        System.out.printf("%s. Sayıyı Girin: ", i);
        result = scan.nextInt();
        while (true) {
            i++;
            System.out.printf("%s. Sayıyı Girin: ", i);
            number = scan.nextInt();
            if (number == 0) break;
            result -= number;
        }
        System.out.println("\nÇıkartma Sonuç: " + result);
        resetVariable();
    }

    static void multi() {
        System.out.printf("%s. Sayıyı Girin: ", i);
        result = scan.nextInt();
        while (true) {
            i++;
            System.out.printf("%s. Sayıyı Girin: ", i);
            number = scan.nextInt();
            if (number == 0) break;
            result *= number;
        }
        System.out.println("\nÇarpma Sonuç: " + result);
        resetVariable();
    }

    static void divide() {
        double divideResult, divideNumber;
        System.out.printf("%s. Sayıyı Girin: ", i);
        divideResult = scan.nextDouble();
        while (true) {
            i++;
            System.out.printf("%s. Sayıyı Girin: ", i);
            divideNumber = scan.nextDouble();
            if (divideNumber == 1) break;
            while (divideNumber == 0) {
                System.out.print("0'a Bölünemez. Lütfen farklı bir değer girin: ");
                divideNumber = scan.nextDouble();
            }
            divideResult /= divideNumber;
        }
        System.out.println("\nBölme Sonuç: " + new DecimalFormat("##.###").format(divideResult));
        resetVariable();
    }

    static void power() {
        int pow, powResult = 1;
        System.out.print("Hesaplanacak Sayıyı Girin: ");
        number = scan.nextInt();
        System.out.print("Üs Olacak Sayıyı Girin: ");
        pow = scan.nextInt();
        for (int i = 0; i < pow; i++) {
            powResult *= number;
        }
        System.out.println("\nÜslü Sayı Sonuç: " + powResult);
        resetVariable();
    }

    static void factorial() {
        System.out.print("Faktoriyel Alınacak Sayıyı Girin: ");
        long n = scan.nextLong();
        while (n > 20) {
            System.out.print("En Fazla 20 Değerini Girebilirsiniz: ");
            n = scan.nextLong();
        }
        long result = factorialCalculate(n);
        System.out.println("\nSayının Faktoriyeli: " + result);
    }

    // aynı isim verilerek overloading yapılabilirdi. okunabilirlik açısından böyle yapmak istedim.
    static long factorialCalculate(long n) {
        if (n == 1) return 1;
        n *= factorialCalculate(n - 1);
        return n;
    }

    static void mod() {
        System.out.print("1. Sayıyı Girin: ");
        number = scan.nextInt();
        System.out.print("2. Sayıyı Girin: ");
        result = scan.nextInt();
        number %= result;
        System.out.println("\nMod Alma Sonuç: " + number);
        resetVariable();
    }

    static void rectAngle() {
        int perimeter, area;
        System.out.print("Kısa Kenarı Girin: ");
        number = scan.nextInt();
        System.out.print("Uzun Kenarı Girin: ");
        result = scan.nextInt();
        area = number * result;
        perimeter = 2 * (number + result);
        System.out.format("\nDikdörtgen Alanı: %s Birim\nDikdörtgen Çevresi: %s Birim\n", area, perimeter);
        resetVariable();
    }

    public static void main(String[] args) {
        int choose;
        boolean loop = true;
        String format = "%-25s %-35s %s%n";

        String divider = "=".repeat(30);
        System.out.println("\n" + divider);
        System.out.println("Patika.dev | Gelişmiş Hesap Makinesi Uygulaması");
        System.out.println(divider);
        System.out.format("%50s%n%n", "Hangi İşlemi Yapmak İstiyorsunuz?");
        while (loop) {
            System.out.format(format, "1- Toplama İşlemi", "2- Çıkarma İşlemi", "3- Çarpma İşlemi");
            System.out.format(format, "4- Bölme İşlemi", "5- Üslü Sayı Hesaplama", "6- Faktoriyel Hesaplama");
            System.out.format(format, "7- Mod Alma", "8- Dikdörtgen Alan ve Çevre", "0- Uygulamayı Sonlandır");
            System.out.print("\nYapmak İstediğiniz İşlem --> ");
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(divider);
                    System.out.println("Toplama İşlemi Seçildi.\n'0' değeri girildiğinde işlem sonlandırılacaktır.\n");
                    sum();
                    System.out.println(divider);
                    break;
                case 2:
                    System.out.println(divider);
                    System.out.println("Çıkartma İşlemi Seçildi.\n'0' değeri girildiğinde işlem sonlandırılacaktır.");
                    sub();
                    System.out.println(divider);
                    break;
                case 3:
                    System.out.println(divider);
                    System.out.println("Çarpma İşlemi Seçildi.\n'0' değeri girildiğinde işlem sonlandırılacaktır.");
                    multi();
                    System.out.println(divider);
                    break;
                case 4:
                    System.out.println(divider);
                    System.out.println("Bölme İşlemi Seçildi.\n'1' değeri girildiğinde işlem sonlandırılıacaktır.");
                    divide();
                    System.out.println(divider);
                    break;
                case 5:
                    System.out.println(divider);
                    System.out.println("Üslü Sayı Hesaplama Seçildi.");
                    power();
                    System.out.println(divider);
                    break;
                case 6:
                    System.out.println(divider);
                    System.out.println("Faktoriyel Hesaplama Seçildi.\nEn fazla '20' değerini girebilirsiniz.");
                    factorial();
                    System.out.println(divider);
                    break;
                case 7:
                    System.out.println(divider);
                    System.out.println("Mod Alma İşlemi Seçildi.");
                    mod();
                    System.out.println(divider);
                    break;
                case 8:
                    System.out.println(divider);
                    System.out.println("Dikdörtgen Alan ve Çevre Hesaplaması Seçildi.");
                    rectAngle();
                    System.out.println(divider);
                    break;
                case 0:
                    System.out.println("Uygulama Sonlandırılıyor. Hoşçakal :)");
                    loop = false;
                    break;
                default:
                    System.out.println("Hatalı seçim yapıldı. Lütfen tekrar deneyin.\n");
                    break;
            }
        }
    }
}
