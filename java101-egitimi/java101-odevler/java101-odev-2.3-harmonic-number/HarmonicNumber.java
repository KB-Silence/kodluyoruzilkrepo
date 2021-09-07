import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double result = 0;

        System.out.print("N Sayısını Girin: ");
        int n = scan.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }

        System.out.println(result);
    }
}