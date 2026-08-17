package java_DecisionMaking;
// build a calculator using switch case
import java.util.*;
public class question9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        
        switch(operation){
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                }else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        
        sc.close();
    }

}
