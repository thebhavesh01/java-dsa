package java_operators;
//find largest of 2 numbers using ternary operator
import java.util.*;
public class question5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + largest);
        sc.close();
    }
    
}
