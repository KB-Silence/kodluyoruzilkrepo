import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isError = false;
        String errorMessage = "You entered incorrect information.";

        int distance, age, tripType;
        double normalPrice,
                ageDiscountPrice = 0,
                tripDiscountPrice = 0,
                totalPrice,
                perKmFee = 0.10;

        System.out.print("Enter Distance(KM): ");
        distance = scan.nextInt();
        if (distance <= 0) {
            isError = true;
            errorMessage += "\nKM: " + distance;
        }
        System.out.println("Choose Trip Type:");
        System.out.println("| 1- Round Trip | OR | 2- One-Way |");
        System.out.print("Choice: ");
        tripType = scan.nextInt();
        if (tripType != 1 && tripType != 2) {
            isError = true;
            errorMessage += "\nTrip Type: " + tripType;
        }
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        if (age < 0) {
            isError = true;
            errorMessage += "\nAge: " + age;
        }
        System.out.println("-----------------------");

        normalPrice = distance * perKmFee;

        if (age < 12) {
            ageDiscountPrice = normalPrice * 0.50;
        } else if (age >= 12 && age < 24) {
            ageDiscountPrice = normalPrice * 0.10;
        } else if (age > 65) {
            ageDiscountPrice = normalPrice * 0.30;
        }

        totalPrice = normalPrice - ageDiscountPrice;

        if (tripType == 2) {
            tripDiscountPrice = totalPrice * 0.20;
            totalPrice = (totalPrice - tripDiscountPrice) * 2;
        }

        if (isError) {
            System.out.println(errorMessage);
        } else {
            System.out.printf("Normal Price: %s TL%n", normalPrice);
            System.out.printf("Age Discount: %s TL%n", ageDiscountPrice);
            System.out.printf("Round-Trip Discount: %s TL%n", tripDiscountPrice);
            System.out.println("-----------------------");
            System.out.printf("Total Price: %s TL", totalPrice);
        }
    }
}
