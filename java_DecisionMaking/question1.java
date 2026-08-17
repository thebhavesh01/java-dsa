package java_DecisionMaking;
//check whether a number is positive negative or zero
import java.util.*;
public class question1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println(number + " is positive.");
        }else if(number < 0){
            System.out.println(number + " is negative.");
        }else{
            System.out.println("The number is zero.");
        }
        sc.close();
    }

    
}
