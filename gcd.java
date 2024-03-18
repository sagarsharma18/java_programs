import java.util.*;
public class gcd {
    public static void calgcd(int a, int b) {
        int temp=1;
      for (int i = 1; i<=a && i<=b; i++) {
         if(a%i==0 && b%i==0){
            if(temp<i){
            temp=i;
            }
         }
      }    
      System.out.println("the gcd of "+a+" and "+b+"is="+temp);  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
       calgcd(a, b);
    }
}
