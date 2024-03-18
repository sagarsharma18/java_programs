import java.util.*;
public class sumofnnatural {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter a number");
     int n=s.nextInt();
     int sum=0;
     for(int i=1;i<=n;i++){
       sum=sum+i; 
       System.out.print(sum+"+");
     }
     System.out.println("="+sum);
    }
}
