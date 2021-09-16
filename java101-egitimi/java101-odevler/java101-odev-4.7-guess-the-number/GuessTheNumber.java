import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int rnd = random.nextInt(100);
        int guess, guessCount = 0;
        int[] wrongGuess = new int[5];
        boolean isKnow = false;
        boolean isWrong = false;
        System.out.println("Patika.dev | Sayı Tahmin Oyunu");
        System.out.println("=".repeat(31));
        System.out.println("\t\tKurallar");
        System.out.println("-".repeat(31));
        System.out.println("1: Tahmin etmek için 5 hakkın var.");
        System.out.println("2: Girdiğin sayı 0 ile 100 arasında olmalıdır.");
        System.out.println("3: Eğer 0-100 arasında olmayan birden fazla giriş yaparsan deneme hakkın azalır.");
        System.out.println("-".repeat(31));
        while (!isKnow) {
            if (guessCount == 5) break;
            System.out.print("Lütfen Tahminini Gir: ");
            guess = scan.nextInt();
            wrongGuess[guessCount] = guess;
            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı girin.");
                if (isWrong) {
                    guessCount++;
                    System.out.println("Birden fazla hatalı giriş yaptınız. Kalan Hakkınız: " + (5 - guessCount));
                } else {
                    isWrong = true;
                    System.out.println("Sonraki hatalı girişleriniz hakkınızdan düşülecektir.");
                }
                continue;
            }
            guessCount++;
            if (guess == rnd) {
                isKnow = true;
            } else if (guess < rnd) {
                System.out.println("Daha büyük bir sayı dene. Kalan Hakkınız: " + (5 - guessCount));
            } else {
                System.out.println("Daka küçük bir sayı dene. Kalan Hakkınız: " + (5 - guessCount));
            }
        }
        System.out.println("=".repeat(31));
        if (isKnow && guessCount == 1) {
            System.out.printf("Vaoov ilk denemede bildin.\nTuttuğum Sayı: %s", rnd);
        } else if (isKnow) {
            System.out.println("Tebrikler sayıyı doğru tahmin ettin.\nTuttuğum Sayı: " + rnd);
        } else {
            System.out.println("Sayıyı doğru tahmin edemedin.");
            if (!isWrong) {
                System.out.println(Arrays.toString(wrongGuess));
            }
            System.out.println("Tuttuğum Sayı: " + rnd);
        }
    }
}
