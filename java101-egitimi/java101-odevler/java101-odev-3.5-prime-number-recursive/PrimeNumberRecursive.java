import java.util.Scanner;

public class PrimeNumberRecursive {
    static boolean primeNumber(int num, int initial) {
        if (num <= 2) return num == 2;
        if (num % initial == 0) return false;
        if (initial * initial > num) return true;

        return primeNumber(num, initial + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = scan.nextInt();
        boolean isPrime = primeNumber(num, 2);
        System.out.printf((isPrime) ? "%s sayısı ASALDIR !\n" : "%s sayısı ASAL değildir !\n", num);
    }
}
