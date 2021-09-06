import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayı aldık.
        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();

        // Kullanıcıdan aldığımız değeri kaybetmemek için geçici bir değişkene atadık.
        int tempNumber = number;

        // Değerin kaç basamaktan oluştuğunu tutacak değişkeni oluşturduk.
        int digitCounter = 0;

        // Basamakların değerlerini tutacak değişkeni oluşturduk.
        int digitValue;

        // Basamkların değerlerine yapılacak üs alma işleminin sonucu tutacak değişkeni oluşturduk.
        int digitPow;

        // Üs alma işlemleri yapılmış basamak değerlerinin toplamını tutacak değişkeni oluşturduk.
        int result = 0;

        // Durumu ekrana bastırmak için String değişkeni oluşturduk.
        String message = "";

        /*
        While döngüsü ile kullanıcıdan aldığımız değerin kaç basamaklı olduğunu bulduk.
        İşlem sonrasında kullanıcıdan aldığımız değeri diğer işlemler için tekrar tempNumber değişkenine atadık.
        */

        /* tempNumber = 2451, digitCounter = 0

            tempNumber /= 10 --> 2451 / 10 = 245
            digitCounter++   --> digitCounter = 1
            tempNumber /= 10 --> 245 / 10 = 24
            digitCounter++   --> digitCounter = 2
            tempNumber /= 10 --> 24 / 10 = 2
            digitCounter++   --> digitCounter = 3
            tempNumber /= 10 --> 2 / 10 = 0
            digitCounter++   --> digitCounter = 4
            tempNumber 0'a eşit olduğu için döngüden çık.

        */

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCounter++;
        }
        tempNumber = number;


        /*
            While döngüsü ile sırasıyla;
            1- tempNumber değişkenindeki değere mod alma işlemi uyguladık ve sonucu digitValue değişkenine atadık.
            2- Üs alma işlemi için digitPow değişkenine varsayılan olarak 1 değerini atadık.
            3- Üs alma işlemi için for döngüsü oluşturduk ve digitCounter değeri kadar tekrar edeceğini belirttik.
            4- Döngü her tekrar ettiğinde digitPow değişkenindeki değer ile digitValue değişkenindeki değerleri çarpıp
                çıkan sonucu digitPow değişkenine atadık.
            5- İşlem sonucunda digitPow değişkenine atanmış değer ile result değişkenindeki değerleri toplayıp çıkan
                sonucu result değişkenine değer olarak atadık.
            6- Koşulun sağlanması ve diğer basamaklara da aynı işlemleri yapabilmek için tempNumber değişkenindeki
                değeri 10'a böldük.
            7- tempNumber değişkeni 0'a eşit olana kadar bu döngü devam eder ve her basamakta bulunan değer için
                üs alma işlemini yapıp, işlem sonucu result değişkeni ile toplar.
        */

        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPow = 1;
            for(int i = 1; i <= digitCounter; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /= 10;
        }

        /* tempNumber 0 olana kadar while döngüsü çalışır.

            tempNumber = 2451, result = 0, digitCounter = 4
            digitValue = 2451 % 10 = 1     -->     digitValue = 1, digitPow = 1
            for döngüsü digitCounter(4) kadar çalışır
            digitPow *= digitValue -->       1 * 1 = 1               --> i = 2
            digitPow *= digitValue -->       1 * 1 = 1               --> i = 3
            digitPow *= digitValue -->       1 * 1 = 1               --> i = 4
            digitPow *= digitValue -->       1 * 1 = 1               --> i = 5 -> Döngüden çık
            result += digitPow     -->       0 + 1 = 1               result = 1
            tempNumber /= 10       -->       2451 / 10 = 245         --> 0'a eşit değil

            result = 5, tempNumber = 245
            digitValue = 245 % 10 = 5     -->     digitValue = 5, digitPow = 1
            for döngüsü digitCounter(4) kadar çalışır
            digitPow *= digitValue -->       1 * 5 = 5               --> i = 2
            digitPow *= digitValue -->       5 * 5 = 25              --> i = 3
            digitPow *= digitValue -->       25 * 5 = 125            --> i = 4
            digitPow *= digitValue -->       125 * 5 = 625           --> i = 5 -> Döngüden Çık
            result += digitPow     -->       1 = 1 + 625 = 626       result = 626
            tempNumber /= 10       -->       245 / 10 = 24           --> 0'a eşit değil

            result = 626, tempNumber = 24,
            digitValue = 24 % 10 = 4     -->     digitValue = 4, digitPow = 1
            for döngüsü digitCounter(4) kadar çalışır
            digitPow *= digitValue -->       1 * 4 = 4               --> i = 2
            digitPow *= digitValue -->       4 * 4 = 16              --> i = 3
            digitPow *= digitValue -->       16 * 4 = 64            --> i = 4
            digitPow *= digitValue -->       64 * 4 = 256           --> i = 5 -> Döngüden Çık
            result += digitPow     -->       626 = 626 + 256 = 882       result = 882
            tempNumber /= 10       -->       24 / 10 = 2                 --> 0'a eşit değil

            result = 882, tempNumber = 2
            digitValue = 2 % 10 = 2     -->     digitValue = 2, digitPow = 1
            for döngüsü digitCounter(4) kadar çalışır
            digitPow *= digitValue -->       1 * 2 = 2                   --> i = 2
            digitPow *= digitValue -->       2 * 2 = 4                   --> i = 3
            digitPow *= digitValue -->       4 * 2 = 8                   --> i = 4
            digitPow *= digitValue -->       8 * 2 = 16                  --> i = 5 -> Döngüden Çık
            result += digitPow     -->       882 = 882 + 16 = 898        result = 898
            tempNumber /= 10       -->       2 / 10 = 0                  --> 0'a eşit -> Döngüden Çık

        */

        // Result = 898
        // result == number --> 898 == 2451 --> False --> Armstrong sayısı değildir.

        /* İşlemler sonucunda elde ettiğimiz değer ile kullanıcıdan aldığımız değeri karşılaştırdık
            ve durumu ekrana yazdırdık. */
        message = (result == number) ? "Sayısı Armstrong sayıdır." : "Sayısı Armstrong sayı değildir.";
        System.out.printf("%s %s",number,message);
    }
}
