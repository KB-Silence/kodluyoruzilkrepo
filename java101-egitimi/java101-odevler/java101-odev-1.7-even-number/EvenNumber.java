import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, total = 0, count = 0;

        System.out.print("Sayı Girin: ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if(i %2 != 0) continue;
            System.out.printf("|-%s-|", i);
            if(i % 10 == 0) System.out.println();
        }

        for (int i = 0; i <= number; i++) {
            if (i == 0) continue;
            // 0 değerinden mod alınca sonuç 0 döndüğü için if yapısı true döndürüyor.
            // ortalama sonucunu etkileyeceğinden dolayı 0 değerini görünce işlem yapmamasını sağladım.
            // başlangıç değeri 1 olarak verilebilirdi lakin 0'dan girilen sayıya kadar olarak belirtildiğinden ve
            // continue ifadesini kullanarak bir nevi pratik yapmak istediğimden dolayı bu yolu tercih ettim.
            if(i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }
        System.out.printf("3 ve 4 Rakamlarına Tam Bölünen Sayı Miktarı: %s%n", count);
        System.out.printf("3 ve 4 Rakamlarına Tam Bölünen Sayıların Toplamı: %s%n", total);
        System.out.printf("3 ve 4 Rakamlarına Tam Bölünen Sayıların Ortalaması: %s", total / count);
    }
}
