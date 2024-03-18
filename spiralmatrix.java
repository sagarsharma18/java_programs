import java.util.*;
public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of row and column:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int rb=0;
        int re=4;
        int cb=0;
        int ce=6;
       while (rb<=re && cb<=ce) {
          // right triverse
          for (int i = cb; i <=ce; i++) {
            System.out.print(cb);
          }
          rb++;
          //top to buttom
          for (int i = rb; i <=re; i++) {
            System.out.print(rb);
          }
          ce--;
          //left tiverse
          if(rb<=re){
          for (int i = ce; i>=cb; i--) {
            System.out.print(ce);
          }
        }
        re--;
        //top triverse
        if(cb<=ce){
        for (int i = re; i>=rb; i--) {
         System.out.print(re);   
        }
    }
    cb++;
}
                       
    }
}
