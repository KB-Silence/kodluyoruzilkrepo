import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double sicaklik;
        String tavsiye;
        boolean kayak = false, sinema = false, piknik = false, deniz = false;

        System.out.print("Sıcaklık Bilgisini Girin: ");
        sicaklik = scn.nextDouble();

        // If-Else Karar Mekanizması
        if (sicaklik < 5) {
            tavsiye = "kayak";
        } else if (sicaklik >= 5 && sicaklik < 15) {
            tavsiye = "sinema";
        } else if (sicaklik >= 15 && sicaklik < 25) {
            tavsiye = "piknik";
        } else {
            tavsiye = "deniz";
        }

        // Switch Mekanizması
        switch (tavsiye) {
            case "kayak":
                kayak = true;
                break;
            case "sinema":
                sinema = true;
                break;
            case "piknik":
                piknik = true;
                break;
            case "deniz":
                deniz = true;
                break;
            default:
                System.out.println("Bir şeyler terst gitti. Lütfen tekrar dene.");
                break;
        }

        // Koşul Operatörü ile Oluşturulan Mekanizma
        System.out.println(
                (kayak) ? "Kayak yapmak için çok güzel bir hava!" :
                        (sinema) ? "Vizyondaki filmlere bakmaya ne dersin?" :
                                (piknik) ? "Mangal malzemelerini kap! Pikniğe gidiyoruz." :
                                        (deniz) ? "Hadi denize gidelim. Güneş kremini unutma!" :
                                                "Bir şeyler ters gitti."
        );
    }
}
