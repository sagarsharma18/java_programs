
//multilevel inheritance in java 
import java.util.*;
class base{
    int r;
    int m;
}
class derived extends base{
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a rollno");
        r=sc.nextInt();
        System.out.print("enter marks");
        m=sc.nextInt();
    }
}
class derived2 extends derived{
    int s;
    Scanner sc=new Scanner(System.in);
    void showdata(){
        System.out.print("enter the sports marks");
        s=sc.nextInt();
       System.out.println("roll_number="+r);
       System.out.println("marks="+m);
       System.out.println("sports marks="+s);
    }
}
public class inheritanceprogram {
    public static void main(String[] args) {
     derived2 obj=new derived2();
     obj.getdata();
     obj.showdata();
     obj.getdata();
     obj.showdata();
        }
}
