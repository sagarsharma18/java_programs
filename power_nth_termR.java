import java.math.*;
public class power_nth_termR {
 public static int power(int x,int n) {
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    int a=power(x, n-1);
    int b=x*a;
    return b;

 }
 public static void main(String[] args) {
    int x;
    int n;
    int c=power(2, 4);
    System.out.println(c);
 }   
}