public class Armstrong_1_to_999 {
    public static void main(String[] args) {
        int tempNumber, digitValue, digitPow, result, digitCounter;

        for (int i = 1; i <= 999; i++) {

            result = 0;
            tempNumber = i;
            digitCounter = 0;

            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCounter++;
            }

            tempNumber = i;

            while (tempNumber != 0) {
                digitValue = tempNumber % 10;
                digitPow = 1;
                for (int j = 1; j <= digitCounter; j++) {
                    digitPow *= digitValue;
                }
                result += digitPow;
                tempNumber /= 10;
            }

            if (result == i) {
                if (i % 8 == 0) System.out.println();
                System.out.printf("|-%s-|", result);
            }
        }
    }
}
