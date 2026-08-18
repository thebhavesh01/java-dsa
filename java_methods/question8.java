package java_methods;
/*
create:
sumofDigits(int n)
Example:
1234-10
*/
public class question8 {
    public static int sumofDigits(int n){
        int sum = 0;
        while (n>0){
            int lastdigit = n%10;
            sum+=lastdigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.println(sumofDigits(4563));
    }
}
