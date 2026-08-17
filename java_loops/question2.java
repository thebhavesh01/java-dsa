package java_loops;
// print numbers from n to 1 using while loop
import java.util.*;
public class question2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Numbers from " + n + " to 1:");
        int i = n;
        while(i >= 1){
            System.out.print(i + " ");
            i--;
        }
        sc.close();
    }
}
