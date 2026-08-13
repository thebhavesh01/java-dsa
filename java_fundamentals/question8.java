package java_fundamentals;

// convert Celsius to Fahrenheit
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Celsius temperature:");
        float celcius = sc.nextFloat();

        float farehenheit = ((celcius * 9) / 5) + 32;

        System.out.println("Fahrenheit temperature: " + farehenheit);

        sc.close();
    }
}