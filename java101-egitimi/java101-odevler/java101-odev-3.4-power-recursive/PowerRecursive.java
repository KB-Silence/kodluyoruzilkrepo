import java.util.Scanner;

public class PowerRecursive {
    static int powerRecursive(int base, int pow) {
        if (base == 1 || pow == 0) return 1;
        if (pow == 1) return base;
        return base * powerRecursive(base, pow - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, pow, result;

        System.out.print("Taban Değeri Girin: ");
        base = scan.nextInt();
        System.out.print("Üs Değerini Girin: ");
        pow = scan.nextInt();
        result = powerRecursive(base, pow);
        System.out.println("Sonuç: " + result);
    }
}
