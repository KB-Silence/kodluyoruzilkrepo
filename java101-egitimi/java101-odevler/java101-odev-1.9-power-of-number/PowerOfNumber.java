import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Sınır Sayısını Girin: ");
        number = scan.nextInt();

        System.out.println("-----2'nin kuvvetleri-----");
        for (int i = 1; i < number; i*=2) {
            System.out.println(i);
        }

        System.out.println("-----4'ün kuvvetleri-----");
        for (int i = 1; i < number; i*=4) {
            System.out.println(i);
        }

        System.out.println("-----5'in kuvvetleri-----");
        for (int i = 1; i < number; i*=5) {
            System.out.println(i);
        }
    }
}
