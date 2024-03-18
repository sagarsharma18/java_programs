public class fectorial_by_recursion {
public static int fact(int n) {
   if(n==1 || n==0){
    return 1;
   }
    int c=fact(n-1);
    int ans=n*c;
    return ans;
}
 
 public static void main(String[] args) {
    int n=4;
    int ans=fact(n);
    System.out.println("foctorial="+ans);
 }   
}
