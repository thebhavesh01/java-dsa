package java_loops;
// print the first n natural numbers using for loop
import java.util.*;
public class question5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " natural numbers:");
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
