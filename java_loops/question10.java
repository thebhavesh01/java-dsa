package java_loops;
// count the number of digits in a number using while loop
import java.util.*;
public class question10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits in " + n + " is: " + count);
        sc.close();
    }
}
