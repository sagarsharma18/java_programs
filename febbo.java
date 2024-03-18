import java.util.*;
public class febbo {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int t=0;
    int a=0;
    int b=1;
    for (int i =1; i <=n; i++) {
         t=a+b;
         b=a;
         a=t;
        System.out.print(b+" ");
    }
    
    
   } 
}
