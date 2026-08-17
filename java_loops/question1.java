package java_loops;
// print numbers from 1 to n using for loop
import java.util.*;
public class question1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
