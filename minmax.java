import java.util.*;
public class minmax {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the size:");
     int size=sc.nextInt();
     int a[]=new int[size];
     int i;
     for( i = 0; i <size; i++) {
      a[i]=sc.nextInt();
     }
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for (i = 0; i < a.length; i++) {
      if(a[i]<min){
        min=a[i];
      }if(a[i]>max)
      max=a[i];
     }
     System.out.println("minimum value:"+min);
     System.out.println("max value is:"+max);
  }

}

