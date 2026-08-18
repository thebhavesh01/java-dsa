package java_methods;

/*
calculate:
power(a,b)

Example:
power(2,5) = 32

using recursion
*/

public class question15 {

    public static int power(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {

        System.out.println(power(2, 5));

    }
}