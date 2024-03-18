public class advancepattern {
    public static void main(String[] args) {
     int n=5;
     //butterfly pattern
     System.out.println("butterfly pattern");
     //first pattern
     for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }//space 
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        //2nd pattern
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
     }
     //lower half 
     for (int i = n; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }//space 
        
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        //2nd pattern
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
     }
     System.out.println("hollow rhombus");
     for ( int i = 1; i <=n; i++) {
        //vertical space loop
         for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
         }
         //for * and hollow space
        for (int j = 1; j<=n; j++) {
            if (j==1 ||i==1 || j==5 || i==5 ) {
                System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        System.out.println();
      }
      System.out.println("inverted half pyramid pt-1");
      for (int i = 1; i<=n; i++) {
         for (int j = i; j <=n; j++) {
             System.out.print(i);
         }
         System.out.println();
         }
         System.out.println("2nd type of inverted half pyrmid pt- 2");
         for (int i = 1; i<=n; i++) {
             for (int j =1; j <=n-i; j++) {
                 System.out.print(i);
             }
             System.out.println();
        } 
        System.out.println("hollow butterfly");
        //half holo code
        //part 1
      for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            if (i==1||j==1||i==j) {
                System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        //mid space loop
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        //part 2
        for (int j = 1; j <=i; j++) {
            if (i==1||j==1||i==j) {
                System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        System.out.println();
      }
      // 2nd half holo
      //reverse the code or mirror the code
      for (int i = n; i>=1; i--) {
        for (int j = 1; j <=i; j++) {
            if (i==1||j==1||i==j) {
                System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            if (i==1||j==1||i==j) {
                System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
}
