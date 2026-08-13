package java_fundamentals;
// find average of three numbers
import java.util.Scanner;
public class question5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        double average=(a+b+c)/3;
        System.out.println("The average of three numbers is: "+average);

        sc.close();
    }
}
