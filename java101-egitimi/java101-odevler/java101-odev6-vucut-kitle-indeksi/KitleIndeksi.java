import java.util.Scanner;

public class KitleIndeksi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double boy, kilo, kitleIndeksi;

        System.out.print("Kilonuzu Girin: ");
        kilo = inp.nextDouble();
        System.out.print("Boyunuzu(Metre Cinsinde) Girin: ");
        boy = inp.nextDouble();
        System.out.println("----------------------");

        kitleIndeksi = kilo / (boy * boy);

        System.out.println("Kilonuz: " + kilo + " KG" + "\nBoyunuz: " + boy + " CM");
        System.out.println("Vücut Kitle İndeksiniz: " + kitleIndeksi);
    }
}
