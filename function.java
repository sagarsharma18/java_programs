import java.util.*;
public class function {
    //defination of function 
   //function of fectoril
//     public static void factorial(int n){
//       int temp=1;
//       if(n<0){
//         System.out.println("WORNG INPUT!");
//         return;
//       }
//       for (int i = n; i>0; i--) {
//         temp=temp*i;
//       }
//      System.out.println(temp);
//    }

     //FUNCTION OF PRIME NUMBER
// public static void printprimeno(int n){
//     int count=0;
//     for (int i =1; i <=n/2; i++) {
//       if(n%i==0){
//         count++;
//       }
//     }
//     if(count>2){
//       System.out.println("number is not prime");
//     }else{
//       System.out.println("number is prime");
//     }
//    }

      //FUNCTION TO CHECK NUMBER ISEVEN OR ODD
    // public static void checkno(int n){
    //     if (n%2==0) {
    //         System.out.print("number is even");
    //     }else
    //     System.out.println("number is odd");
    // }

       // FUNCTION FOR TABLE
public static void printtable(int n) {
    for (int i = 1; i <=10; i++) {
        System.out.print(n*i+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        printtable(n);
    }
}
