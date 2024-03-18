import java.util.*;
public class function2nd {
   //function of avg.. of 3 numbers
    // public static void avg(int a,int b, int c) {
    //     int avg;
    //     avg=(a+b+c)/3;
    //     System.out.println("avg of number is"+avg);
    // }
    //function of sum of all odd 1 to n;
    // public static void sumofodd(int n) {
    //     int sum=0;
    //     for (int i = 0; i <=n; i++) {
    //         if(i%2==1){
    //           sum=sum+i; 
    //           System.out.print(i+"+"); 
    //         }
    //     }
    //     System.out.println();
    //     System.out.println(" sum of odd number="+sum);
    // }
    //function to check greater of 2 number
    // public static void checkgreater(){
    //     System.out.print("enter two numbers");
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     if(a>b){
    //         System.out.println("a is greater"+a);
    //     }else if(a==b){
    //         System.out.println("a and b is same");
    //     }else
    //     System.out.println("b is greater"+b);
    // }
    //function to calculate circumfrence of circule
    // public static void calcircumfrence() {
    //     Scanner s=new Scanner(System.in);
    //     System.out.print("enter the redius of circle");
    //     double r=s.nextFloat();
    //     double pi=3.14159;
    //     r=2*pi*r;
    //     System.out.println(r);
    // }
    //function to check voter is eligeble or not 
    // public static void checkvoter() {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter your age");
    //     int age=sc.nextInt();
    //     if(age<18){
    //         System.out.println("not eligeble for vote");
    //     }else
    //     System.out.println("eligeble for vote");

    // }
    //answer of do-while infinite loop
    // boolean v=true;
    //   do {
    //     System.out.print("hi");
    //   } while(v);
          
    //PROGRMA FOR COUNT NEGTIVE POSITIVE AND ZERO'S INPUT 
    public static void main(String[] args) {
    int n;
    int p=0;
    int u=0;
    int r=0;
   do {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter 1 for continuew and 0 to stop");
      n=sc.nextInt();
      if (n==0) {
        break;
      }
      System.out.println("enter number for sum");
      int temp=sc.nextInt();
      if (temp>0) {
        p++;
      } else if (temp<0) {
         u++;
      } else{
        r++;
      }
   } while (n==1);
   System.out.println("count of positive numbers= "+p);
   System.out.println("count of negitive numbesr= "+u);
   System.out.println("count of zero '0' is= 1"+r);
 }
}
