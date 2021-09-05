import java.text.DecimalFormat;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;

        System.out.print("Enter Year: ");
        year = scan.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.printf("%s is a leap year.", year);
        } else {
            System.out.printf("%s is not a leap year.", year);
        }
    }
}
