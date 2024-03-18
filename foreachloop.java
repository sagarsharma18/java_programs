import java.util.*;
public class foreachloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        int max=0;
        for (int j = 0; j < a.length; j++) {
            a[j]=sc.nextInt();
        }
      //to check maximum in array
      for (int i : a) {
        if(i>max){
        max=i;
        }
      }
      System.out.print("maximum of array is"+max);
    }
}