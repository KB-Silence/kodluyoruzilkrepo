public class HarmonicAVG {
    public static void main(String[] args) {
        // int[] list = {15, 6, 7, 12, 7, 9, 3};
        int[] harmonic = {27, 32, 47, 38, 87, 31, 83, 58, 94, 67};
        double avarage = 0;
        double harmonicAvg = 0;

        System.out.println("Dizideki Elemanların Ortalaması");
        for (int i = 0; i < harmonic.length; i++) {
            avarage += harmonic[i];
        }
        avarage /= harmonic.length;
        System.out.println(avarage);
        System.out.println("=".repeat(40));
        System.out.println("Dizideki Elemanların Harmonik Ortalaması");
        for (int i = 0; i < harmonic.length; i++) {
            harmonicAvg += (double) 1 / harmonic[i];
        }
        harmonicAvg = harmonic.length / harmonicAvg;
        System.out.println(harmonicAvg);
    }
}
