import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        long fact = 1L;

        System.out.println("MAKS: 20 !!!");
        System.out.print("Faktoriyel Hesaplanacak Sayıyı Girin: ");
        n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        System.out.printf("Sayının Faktoriyeli: %s", fact);
    }
}
