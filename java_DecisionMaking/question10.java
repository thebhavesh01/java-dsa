package java_DecisionMaking;
//given a number check whether it is positive even or positive odd or negative even or negative odd or zero
import java.util.*;
public class question10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if(number > 0){
            if(number % 2 == 0){
                System.out.println("The number is positive and even.");
            }else{
                System.out.println("The number is positive and odd.");
            }
        }else if(number < 0){
            if(number % 2 == 0){
                System.out.println("The number is negative and even.");
            }else{
                System.out.println("The number is negative and odd.");
            }
        }else{
            System.out.println("The number is zero.");
        }
        
        sc.close();
    }

}
