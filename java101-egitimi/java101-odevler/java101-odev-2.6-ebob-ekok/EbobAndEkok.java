import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob, ekok;
        System.out.print("N1 Sayısını Girin: ");
        int smallNumber = scan.nextInt();
        n1 = smallNumber;
        System.out.print("N2 Sayısını Girin: ");
        int bigNumber = scan.nextInt();
        n2 = bigNumber;

        if (smallNumber > bigNumber) {
            n1 = bigNumber;
            n2 = smallNumber;
        }
        System.out.println("-----------------------------");
        System.out.println("N1 Sayısı: " + n1);
        System.out.println("N2 Sayısı: " + n2);

        ebob = n1;
        while (ebob >= 1) { // ya da direkt "true" yazılabilir.
            if (n1 % ebob == 0 && n2 % ebob == 0) {
                ebob = ebob;
                break;
            }
            ebob--;
        }

        ekok = 1;
        while (ekok <= (n1 * n2)) {  // ya da direkt "true" yazılabilir.
            if (ekok % n1 == 0 && ekok % n2 == 0) {
                ekok = ekok;
                break;
            }
            ekok++;
        }             // EKOK formülü -->   ekok = (n1 * n2) / ebob;

        System.out.println("-----------------------------");
        System.out.println("En Büyük Ortak Bölen: " + ebob);
        System.out.println("En Küçük Ortak Kat: " + ekok);
    }
}
