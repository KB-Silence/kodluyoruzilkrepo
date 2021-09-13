public class HelperArray {
    int absolute(int n) {
        if (n < 0) return -n;
        return n;
    }

    int findSmallest(int[] a, int n) {
        int nearest = a[0];
        int smallest = 0;
        for (int i : a) {
            if (i < n && absolute(i - n) < nearest) {
                nearest = absolute(i - n);
                smallest = i;
            }
        }
        return smallest;
    }

    int findBiggest(int[] a, int n) {
        int nearest = a[0];
        int biggest = 0;
        for (int i : a) {
            if (i > n && absolute(i - n) < nearest) {
                nearest = absolute(i - n);
                biggest = i;
            }
        }
        return biggest;
    }
}
