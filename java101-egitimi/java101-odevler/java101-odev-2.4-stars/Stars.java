import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int n = scan.nextInt();

        // Üçgen
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) System.out.print(" ");

            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }

        // Elmas

        // Satır Formülü    --> i
        // Boşluk Formülü   --> (n-i)
        // Yıldız Formülü   --> (2 * i - 1)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) System.out.print(" ");

            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }

        // Satır Formülü    --> (n - 1)
        // Boşluk Formülü   --> (n - i)
        // Yıldız Formülü   --> (2 * i - 1)
        for (int i = (n - 1); i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) System.out.print(" ");

            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }
}
