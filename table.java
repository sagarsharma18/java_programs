import java.util.Scanner;
public class table {
        public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int marks;
     int num;
    do {
        System.out.print("enter number");
         num=sc.nextInt(); 
         if(num==0){
            break;
        }
         System.out.println("enter marks");
         marks=sc.nextInt();
         if (marks>=90) {
            System.out.println("this is good");
         }else if (89 >= marks || marks  >=60) {
            System.out.println("this is also good");
         }else if (59 >=marks || marks >= 0) {
            System.out.println("this is good as well");
         }
    } while (num==1);
    }
}
