package java_operators;
//calculate electricity bills using operators
import java.util.*;
public class question8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if(units <= 100){
            bill = units * 1.2;
        }else if(units <= 200){
            bill = 100 * 1.2 + (units - 100) * 2;
        }else{
            bill = 100 * 1.2 + 100 * 2 + (units - 200) * 3;
        }
        System.out.println("The electricity bill is: " + bill);
        sc.close();
    }

}
