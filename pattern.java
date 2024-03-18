/**
 * pattern
 */
public class pattern {
public static void main(String[] args) {
  int n=5;
  // inverted half peramid 180 D
    for (int i = 1; i <=n; i++) {

      for (int j = 1; j <=n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
   System.out.println();
   System.out.println();
   // for inverteed half peramid
    for (int i = 5; i > 1; i--) {
      for (int j = 1; j <=i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    //print a solid rhombus
    for (int i = 1; i <=n; i++) {
      for (int j = 1; j <=n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <=n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
}
 
}