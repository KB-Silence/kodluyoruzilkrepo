import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayısı Girin: ");
        int n = scan.nextInt();
        System.out.println("--------------------");
        for (int i = n; i >= 1; i-- ) {
            for(int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
