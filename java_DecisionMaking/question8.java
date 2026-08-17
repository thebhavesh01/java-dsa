package java_DecisionMaking;
// check whether a person is eligible for a job: age >= 18 and qualification=B.tech
import java.util.*;
public class question8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        System.out.print("Enter the qualification of the person: ");
        String qualification = sc.next();
        
        if(age >= 18 && qualification.equals("B.tech")){
            System.out.println("The person is eligible for the job.");
        }else{
            System.out.println("The person is not eligible for the job.");
        }
        
        sc.close();
    }

}
