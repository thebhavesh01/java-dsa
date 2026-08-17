package java_loops;
// find the factorial of a number using for loop
import java.util.*;
public class question8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        sc.close();
    }
}
