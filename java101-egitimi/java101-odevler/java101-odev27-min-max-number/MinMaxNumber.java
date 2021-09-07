import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minNum = 0, maxNum = 0, readNumber;

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.printf("%s. Sayıyı Giriniz: ", i);
            readNumber = scan.nextInt();
            if (readNumber < minNum) minNum = readNumber;
            else if (readNumber > maxNum) maxNum = readNumber;
        }
        System.out.println("En Büyük Sayı: " + maxNum);
        System.out.println("En Küçük Sayı: " + minNum);
    }
}
