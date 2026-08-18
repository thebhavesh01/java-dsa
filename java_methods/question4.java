package java_methods;
/*
create:
isEven(int n)
that returns true or false
*/
public class question4 {
    public static boolean isEven( int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
        public static void main(String[]args){
        System.out.println(isEven(65));   
    } 
}
