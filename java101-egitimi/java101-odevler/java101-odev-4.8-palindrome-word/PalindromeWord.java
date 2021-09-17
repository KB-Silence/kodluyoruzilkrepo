public class PalindromeWord {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        String[] palindrome = {"kavak", "kaval", "aca", "ace"};
        boolean checkPalindrome;
        for (String pal : palindrome) {
            checkPalindrome = isPalindrome(pal);
            System.out.printf(checkPalindrome ? "%s kelimesi Palindromiktir.\n" : "%s kelimesi palindromik değildir.\n", pal);
            checkPalindrome = isPalindrome2(pal);
            System.out.printf(checkPalindrome ? "%s kelimesi Palindromiktir.\n" : "%s kelimesi palindromik değildir.\n", pal);
            System.out.println("-".repeat(30));
        }
    }
}
