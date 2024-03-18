import java.util.*;
public class two_d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of row and column:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the element u want to search");
        int x=sc.nextInt();
        for (int i = 0; i < row; i++) {//loop for row 
            for (int j = 0; j <col; j++) {//loop for column 
               if(a[i][j]==x){
                System.out.print("value"+x+"found at row"+i+"and column"+j);
               }
            }
        }

    }
}
