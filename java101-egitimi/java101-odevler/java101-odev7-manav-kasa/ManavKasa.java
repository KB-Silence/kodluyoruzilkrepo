import java.text.DecimalFormat;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double  kg,
                toplamTutar = 0,
                armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00;

        System.out.print("Armut Kaç Kilo: ");
        kg = inp.nextDouble();
        toplamTutar += kg * armut;

        System.out.print("Elma Kaç Kilo: ");
        kg = inp.nextDouble();
        toplamTutar += kg * elma;

        System.out.print("Domates Kaç Kilo: ");
        kg = inp.nextDouble();
        toplamTutar += kg * domates;

        System.out.print("Muz Kaç Kilo: ");
        kg = inp.nextDouble();
        toplamTutar += kg * muz;

        System.out.print("Patlıcan Kaç Kilo: ");
        kg = inp.nextDouble();
        toplamTutar += kg * patlican;
        System.out.println("----------------------");

        System.out.println("Toplam Tutar: " + new DecimalFormat("##.##").format(toplamTutar) + " TL");
    }
}
