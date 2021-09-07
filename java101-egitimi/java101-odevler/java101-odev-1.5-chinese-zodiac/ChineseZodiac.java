import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear;
        String zodiac = "";

        System.out.print("Enter Year of Birth: ");
        birthYear = scan.nextInt();

        birthYear = birthYear % 12;

        switch (birthYear) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Cockerel";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Mouse";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            default:
                break;
        }

        System.out.printf("Chinese Zodiac Horoscope: %s --- SWITCH-CASE%n", zodiac);

        if (birthYear == 0) {
            zodiac = "Monkey";
        } else if (birthYear == 1) {
            zodiac = "Cockerel";
        } else if (birthYear == 2) {
            zodiac = "Dog";
        } else if (birthYear == 3) {
            zodiac = "Pig";
        } else if (birthYear == 4) {
            zodiac = "Mouse";
        } else if (birthYear == 5) {
            zodiac = "Ox";
        } else if (birthYear == 6) {
            zodiac = "Tiger";
        } else if (birthYear == 7) {
            zodiac = "Rabbit";
        } else if (birthYear == 8) {
            zodiac = "Dragon";
        } else if (birthYear == 9) {
            zodiac = "Snake";
        } else if (birthYear == 10) {
            zodiac = "Horse";
        } else if (birthYear == 11) {
            zodiac = "Sheep";
        }

        System.out.printf("Chinese Zodiac Horoscope: %s --- IF-ELSE", zodiac);
    }
}
