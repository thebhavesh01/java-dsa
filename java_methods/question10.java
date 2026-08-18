package java_methods;

/*
create:

isPalindrome(int n)
*/

public class question10 {

    public static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;

        }

        return original == reverse;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }
}