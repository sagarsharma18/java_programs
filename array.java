import java.util.*;

public class array {
    public static void main(String[] args) {
        int s[]={1,2,3,4,5,6,7,8,9};//static kind of array
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=sc.nextInt();
        int []marks=new int[size];
        for (int i = 0; i < marks.length; i++) {
            //user input array
            System.out.print("enter marks=");
             marks[i]=sc.nextInt();
        }
        System.out.println("enter number u want to search");
        int x=sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
        //print the value of array
          if(x==marks[i]){
            System.out.println("number found at position="+i);
          }
        }
        
    }
}
