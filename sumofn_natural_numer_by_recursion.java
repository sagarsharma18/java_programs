import java.util.*;
public class sumofn_natural_numer_by_recursion{
        public static void printnum(int a,int sum,int n){
          if(a==n){
            sum+=a;
           System.out.println(sum);
           return;
          }
          sum=sum+a;
          printnum(a+1, sum, n);
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        int a=1;
        int sum=0;
        printnum(a,sum,n);
       }
    }
    
