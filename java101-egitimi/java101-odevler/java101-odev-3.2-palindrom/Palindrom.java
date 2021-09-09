import java.util.Scanner;

public class Palindrom {
    static int palindrom(int n, int reverseNumber) {
        // metot her çağırıldığında(recursive)
        // reverseNumber = 0 olacağı için, bu metot içerisinde tanımlama yapamıyoruz.
        if (n == 0) {
            return reverseNumber;
        }
        reverseNumber = (reverseNumber * 10) + (n % 10);
        return palindrom(n / 10, reverseNumber);
    }
        /*
            1. Çalıştırma(n = 2442, reverseNumber = 0):
            reverseNumber = (reverseNumber * 10) + (n % 10);
            --> 0 = ( 0 * 10 ) + ( 2443 % 10 ) = 0 + 2 = 2
            return palindrom(n / 10, reverseNumber);        *** Eğer N'i 2443 olarak alırsak 2. çalıştırmada reverseNumber = 3 oluyor. Yani palindrom sayı dönmeyecek.
            --> return palindrom(244, 2);                   --> işlemler sonucu fonksiyon 2442 değeri döndü.

            2. Çalıştırma(n = 244, reverseNumber = 2):
            reverseNumber = (reverseNumber * 10) + (n % 10);
            --> 2 = ( 2 * 10 ) + ( 244 % 10 ) = 20 + 4 = 24
            return palindrom(n / 10, reverseNumber);
            --> return palindrom(24, 24);                   --> üst fonksiyona 2442 değeri döndü

            3. Çalıştırma(n = 24, reverseNumber = 24):
            reverseNumber = (reverseNumber * 10) + (n % 10);
            --> 24 = ( 24 * 10 ) + ( 24 % 10 ) = 240 + 4 = 244
            return palindrom(n / 10, reverseNumber);
            --> return palindrom(2, 244);                   --> üst fonksiyona 2442 değeri döndü

            4. Çalıştırma(n = 2, reverseNumber = 244):
            reverseNumber = (reverseNumber * 10) + (n % 10);
            --> 244 = ( 244 * 10 ) + ( 2 % 10 ) = 2440 + 2 = 2442
            return palindrom(n / 10, reverseNumber);
            --> return palindrom(0, 2442);                  --> üst fonksiyona 2442 değeri döndü

            5. Çalıştırma(n = 0, reverseNumber 2442):       --> Üst fonksiyona 2442 değeri döndü
            if(n == 0) --> return reverseNumber;
            --> if(true) --> return 2442;
        */

    static boolean isPalindrom(int n) {
        // reverseNumber'ın değer atamasını burada yaptık.
        if (n == palindrom(n, 0)) {
            return true;
        }
        return false;
    }
    // n = 2442
    // if (n == polindrom(n, 0)) --> if (2442 == polindrom(2442, 0)) => TRUE
    // else => FALSE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Girin: ");
        int number = scan.nextInt();
        System.out.print("Sayı Girin: ");
        int number2 = scan.nextInt();

        System.out.printf(isPalindrom(number) ? "%s Palindrom sayı.%n" : "%s Palindrom sayı değil.%n", number);
        System.out.printf(isPalindrom(number2) ? "%s Palindrom sayı.%n" : "%s Palindrom sayı değil.%n", number2);
    }
}
