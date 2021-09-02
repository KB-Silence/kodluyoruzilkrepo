import java.util.Scanner;

public class KucukBuyuk {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. Sayı: ");
        a = scn.nextInt();
        System.out.print("2. Sayı: ");
        b = scn.nextInt();
        System.out.print("3. Sayı: ");
        c = scn.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + ">" + b + ">" + c);
            } else {
                System.out.println(a + ">" + c + ">" + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + ">" + a + ">" + c);
            } else {
                System.out.println(b + ">" + c + ">" + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + ">" + a + ">" + b);
            } else {
                System.out.println(c + ">" + b + ">" + a);
            }
        }

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + ">" + b + ">" + c);
            } else {
                System.out.println(a + ">" + c + ">" + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + ">" + a + ">" + c);
            } else {
                System.out.println(b + ">" + c + ">" + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + ">" + a + ">" + b);
            } else {
                System.out.println(c + ">" + b + ">" + a);
            }
        }
    }
}