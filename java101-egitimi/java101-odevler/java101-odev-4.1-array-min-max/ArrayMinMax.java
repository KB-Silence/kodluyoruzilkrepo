import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HelperArray helper = new HelperArray();

//        int[] list = {56, -34, 1, 8, 101, -2, 33};

        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = array[0];
        int max = array[0];
        int kucukEnYakin;
        int buyukEnYakin;

        for (int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maksimum Değer: " + max);
        System.out.println("=".repeat(40));
        System.out.print("Bir Sayı Girin: ");
        int n = scan.nextInt();

        kucukEnYakin = helper.findSmallest(array, n);
        buyukEnYakin = helper.findBiggest(array, n);
        System.out.printf("%s'ten Küçük En Yakın Sayı: %s\n", n, kucukEnYakin);
        System.out.printf("%s'ten Büyük En Yakın Sayı: %s\n", n, buyukEnYakin);
    }
}