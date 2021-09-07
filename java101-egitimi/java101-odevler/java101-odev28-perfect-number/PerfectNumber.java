import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = 0;
        String message = "";

        System.out.print("Bir Sayı Girin: ");
        int number = scan.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                p += i;
            }
        }
        message = (p == number) ? "Mükemmel Sayıdır." : "Mükemmel Sayı Değildir.";
        System.out.printf("%s %s", number, message);
    }
}
