public class numberpattren {
    public static void main(String[] args) {
/*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */
        int n=5;
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 1
         * 23
         * 456
         * 78910
         * 11121314
         */
        int temp=1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
       System.out.println();
       /*
        1
        01
        010
        1010
        10101
        */
        int t=0;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                t=i+j;
               if(t%2==0){//even value
                System.out.print("1 ");
               }else//odd value
               System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("number pyramid");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {           
                  System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("pailndrom number pyramid");
         //space
       for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }// 1st half
        for (int j =i; j>=1; j--) {
            System.out.print(j);
        }//2nd half
        for (int j =2; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
       }
       System.out.println();
       System.out.println("diamond pattern");
        //1st half 
      for (int i = 1; i<=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
      }// 2nd half 
      for (int i = n; i>=1; i--) {
        //space 
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //star
        for (int j = 1; j <=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.println("half pyramid");
      for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
      }
      
    }
}
