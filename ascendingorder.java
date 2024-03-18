import java.util.*;
public class ascendingorder {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the size:");
     int size=sc.nextInt();
     int a[]=new int[size];
     boolean ischeck=false;
     for( int i = 0; i <size; i++) {
      a[i]=sc.nextInt();
     }
     for (int i = 0; i <a.length-1; i++) {
        if(a[i] > a[i+1]){
          ischeck=true;
    }else{
        ischeck=false;
        break;
    }     
}
     if(ischeck){
      System.out.println("list is sorted in decending order");
     }else
     System.out.println("list is not sorted in decending order");
  }
}

