import java.util.*;
public class updatebit {
 public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    int s;
    System.out.println("enter the operation value");
    s=op.nextInt();////operation value 
   int n=5;//0101
   int pos=1;
   int a;
   int b;
   int bitmask=1<<pos;//0010
   if((s==1)){//update bit to 1 means perform set bit operation
     a=n |bitmask;
     System.out.println(a);
 } 
   if (s==0) {//update bit to 0 means perform clear bit operation
    b=(~(bitmask) & n);
    System.out.println(b); 
   }
}
}

