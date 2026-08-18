package java_methods;
/*
create :
max(inta, intb)
that returns the larger number
*/
public class question5 {
    public static int larger(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
    public static void  main(String[]args){
        System.out.println("the larger number is"+" "+ larger(5,9));
        
    }
}
