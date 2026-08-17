package java_DecisionMaking;
//print give marks 90-100 A+ 80-89 A 70-79 B 60-69 C 50-59 D <50 F
import java.util.*;
public class question3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade: A+");
        }else if(marks >= 80 && marks < 90){
            System.out.println("Grade: A");
        }else if(marks >= 70 && marks < 80){
            System.out.println("Grade: B");
        }else if(marks >= 60 && marks < 70){
            System.out.println("Grade: C");
        }else if(marks >= 50 && marks < 60){
            System.out.println("Grade: D");
        }else if(marks < 50){
            System.out.println("Grade: F");
        }else{
            System.out.println("Invalid marks entered.");
        }
        
        sc.close();
    }
    
}
