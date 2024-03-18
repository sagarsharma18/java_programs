import java.util.Scanner;
public class two_power_check {
    public static void main(String[] args) {//its work on AND(&) operator
     Scanner sc=new Scanner(System.in);
 System.out.println("enter a numbers");
 int n=sc.nextInt();
 int bitmask=(n &(n-1));//if num is 4 =100 & 011=000;
 if(bitmask==0){//000==0;
 System.out.println("yse");
}else
  System.out.println("no");
    }
}
