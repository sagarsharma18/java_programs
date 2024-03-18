import java.util.*;
public class conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter operator");
        String x=sc.next();
        switch (x) {
            case "+":
                System.out.println(a+b);    
                break;
            case "-":
                 System.out.println(a-b);
                 break;
            case "*":
                 System.out.println(a*b);
                 break;
            case "/":
                 System.out.println(a/b);
                 break;
            case "%":
            System.out.println(a%b);
            break;
            default:
            System.out.println("invalid operator"); 
        }
    }
}


