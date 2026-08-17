package java_loops;
// find sum of even numbers from 1 to n using for loop
import java.util.*;
public class question7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i += 2){
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}
