public class RepeatingNumber {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] list = {16, 98, 34, 17, 77, 25, 39, -45, 72, 98, 16, 25, 34};
        int[] list = {3, 7, 2, 3, 2, 16, 7, 21, 1, 3, 16, 1, 21, 16};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) { // i = 10 -- j = 0
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Tekrar Eden Sayılar: ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.print("\nTekrar Eden Çift Sayılar: ");
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) { // for döngüsünde de bu kontrol yapılabilir.
                System.out.print(value + " ");
            }
        }
    }
}
