package java_methods;
/*
find the sum:
1+2+3+4+5+6+......+N
using recursion
*/
public class question14 {
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[]args){
        System.out.println(sum(5));
    }
}
