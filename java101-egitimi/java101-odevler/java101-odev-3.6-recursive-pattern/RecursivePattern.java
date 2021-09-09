import java.util.Scanner;

public class RecursivePattern {
    static void printPattern(int num, int temp, boolean patternControl) {
        System.out.print(temp + " ");
        if (!patternControl && num == temp) return;

        if (patternControl) {
            printPattern(num, temp - 5, temp - 5 > 0);
        } else {
            printPattern(num, temp + 5, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int number = scan.nextInt();
        System.out.print("Çıktısı: ");
        printPattern(number, number, true);
    }
}
