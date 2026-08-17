package java_loops;
// find sum of digits of a number using for loop
import java.util.*;
public class question13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int temp = n; temp != 0; temp /= 10){
            sum += temp % 10;
        }
        System.out.println("Sum of digits of " + n + " is: " + sum);
        sc.close();
    }
    
}
