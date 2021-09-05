import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, total = 0;

        System.out.println("Negatif bir sayı girilene kadar giriş yapabilirsiniz.");
        do {
            System.out.print("Sayı Girin: ");
            number = scan.nextInt();
            if (number % 2 != 0) total += number;
        } while (number > 0);
        System.out.printf("Girilen Tek Sayıların Toplamı: %s", total);

        System.out.println("Tek bir sayı girilene kadar giriş yapabilirsiniz.");
        System.out.print("Sayı Girin: ");
        number = scan.nextInt();
        while (number % 2 == 0) {
            if (number % 4 == 0) total += number;
            System.out.print("Sayı Girin: ");
            number = scan.nextInt();
        }

        System.out.println("Girilen Değerlerden 'Çift' ve 4'ün Katları Olan Sayıların Toplamı: " + total);
    }
}
