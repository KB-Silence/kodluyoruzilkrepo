public class PrimeNumber {
    public static void main(String[] args) {

        boolean prime;
        for(int i = 2; i <= 100; i++) {
            prime = true;
            for (int j =2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (i == 50) System.out.println();
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
