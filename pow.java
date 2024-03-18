import java.util.*;
public class pow {
    public static void power(int x,int n) {
        int temp=1;
        for (int i =1; i<=n; i++) {
            temp=temp*x;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int x=sc.nextInt();
        int n=sc.nextInt();
        power(x, n);  
    }
}