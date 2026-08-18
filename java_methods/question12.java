package java_methods;

/*
print numbers n to 1 using recursion
*/

public class question12 {

    public static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        printNumbers(5);

    }
}