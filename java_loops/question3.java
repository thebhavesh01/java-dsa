package java_loops;
// print all even numbers from 1 to n using for loop
import java.util.*;
public class question3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Even numbers from 1 to " + n + ":");
        for(int i = 2; i <= n; i += 2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
