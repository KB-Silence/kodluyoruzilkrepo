import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number1, number2, select, result = 0;

        System.out.print("1. Sayıyı Girin: ");
        number1 = scn.nextInt();
        System.out.print("2. Sayıyı Girin: ");
        number2 = scn.nextInt();
        System.out.println("---------------------");
        System.out.println("Yapmak İstediğiniz İşlemi Seçin");
        System.out.println("---------------------");
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("---------------------");
        System.out.print("Seçim(İşlem Numarası): ");
        select = scn.nextInt();

        // If-Else Karar Mekanizması
        if (select == 1) {
            result = number1 + number2;
            System.out.println("Sonuç: " + result);
        } else if (select == 2) {
            result = number1 - number2;
            System.out.println("Sonuç: " + result);
        } else if (select == 3) {
            result = number1 * number2;
            System.out.println("Sonuç: " + result);
        } else if (select == 4) {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println("Sonuç: " + result);
            } else {
                System.out.println("Bir sayı 0'a bölünemez.");
            }
        } else {
            System.out.println("Hatalı seçim yaptınız.");
        }

        // Switch-Case Karar Mekanizması
        switch (select) {
            case 1:
                result = number1 + number2;
                System.out.println("Sonuç: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Sonuç: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Sonuç: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Sonuç: " + result);
                    break;
                }else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                }
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }
    }
}
