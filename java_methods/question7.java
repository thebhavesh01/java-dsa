package java_methods;

/*
create:

reverse(int n)

Example:

reverse(1234) → 4321
*/

public class question7 {

    public static int reverse(int n) {

        int reverse = 0;

        while (n > 0) {

            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;

        }

        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reverse(1234));

    }
}