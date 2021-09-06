import java.util.Scanner;

public class PowerOfNumber2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, power, result = 1;

        System.out.print("Üssü Alınacak Sayıyı Girin: ");
        number = scan.nextInt();
        System.out.print("Üs Olacak Sayıyı Girin: ");
        power = scan.nextInt();
        int j = 1;
        while (j <= power) {
            result *= number;
            j++;
        }
        System.out.println("--WHILE LOOP--\nCevap: " + result);

        result = 1;

        for (int i = 1; i <= power; i++)  result *= number;
        System.out.println("--FOR LOOP--\nCevap: " + result);
    }
}
