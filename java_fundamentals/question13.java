package java_fundamentals;
//find largest of 3 numbers
public class question13 {
    public static void main(String[]args){
        int a=20;
        int b=30;
        int c=10;
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
    
}
