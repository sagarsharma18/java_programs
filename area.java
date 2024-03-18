//program of area of rectangle
import java.util.*;
public class area {
   private double length;
    private double breadth;
 public void set_dim(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
  }
 public  void get_area(){
    double c=length*breadth;
    System.out.println("area of rectangle is:"+c);
  }
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("");
   System.out.println("enter the length of rectangle");
  double  length=sc.nextDouble();
   System.out.println("enter the bredth of rectangle");
   double breadth=sc.nextDouble();
   area obj=new area();
   obj.set_dim(length,breadth);
  obj.get_area();
   }
    
}