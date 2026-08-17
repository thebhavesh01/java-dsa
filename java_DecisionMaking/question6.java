package java_DecisionMaking;
// check whether a number is divisible by 3 or 5 but not both
import java.util.*;
public class question6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if((num % 3 == 0 || num % 5 == 0) && !(num % 3 == 0 && num % 5 == 0)){
            System.out.println(num + " is divisible by either 3 or 5 but not both.");
        }else{
            System.out.println(num + " is not divisible by either 3 or 5 but not both.");
        }
        
        sc.close();
    }
    
}
