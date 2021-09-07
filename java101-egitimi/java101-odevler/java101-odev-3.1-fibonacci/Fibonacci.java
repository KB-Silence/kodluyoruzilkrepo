import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Eleman Sayısını Girin: ");
        int counter = scan.nextInt();

        int fi = 0, bo = 1, nacci;
        System.out.print(fi + " " + bo);

        for (int i = 2; i < counter; i++) {
            nacci = fi + bo;
            System.out.print(" " + nacci);
            fi = bo;
            bo = nacci;
        }
    }
}
