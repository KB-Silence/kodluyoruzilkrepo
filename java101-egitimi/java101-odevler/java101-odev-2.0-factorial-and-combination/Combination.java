import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, r;
        long nFact = 1, rFact = 1, result = 1;

        do {
            System.out.print("Küme Eleman Sayısı Girin: ");
            n = scan.nextInt();
            System.out.print("Alt Küme Eleman Sayısı Girin: ");
            r = scan.nextInt();
            if (r > n) System.out.println("Alt küme eleman sayısı, küme eleman sayısından büyük olamaz.");
        } while (r > n);

        // Küme eleman sayısı faktoriyeli
        for (int i = n; i >= 1; i--) nFact *= i;

        // Alt küme eleman sayısı faktoriyeli
        for (int j = r; j >= 1; j--) rFact *= j;

        // (n-r)! işleminin faktoriyeli
        for (int k = (n-r); k >= 1; k--) result *= k;

        result = nFact / (rFact * result);

        System.out.println("-----------------------");
        System.out.printf("C(n,r) = %s", result);
    }
}
