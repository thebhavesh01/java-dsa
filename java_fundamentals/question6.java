package java_fundamentals;
// swap two numbers using a third variable
public class question6 {
    public static void main(String[]args){
        int a=20;
        int b=30;
        System.out.println("Before swapping: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" b="+b);
    }
    
}
