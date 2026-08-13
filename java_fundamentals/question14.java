package java_fundamentals;
//build a simple student information program that takes name, age, branch, cgpa as input and prints the information in a formatted way
import java.util.Scanner;
public class question14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();
        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
    
}
