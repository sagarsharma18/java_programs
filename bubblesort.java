public class bubblesort {
   public static void printarray(int a[]){
    System.out.print("list after sort:");
    for (int i = 0; i < a.length; i++) {
        System.out.print(" "+a[i]);
    }
   }
    public static void main(String[] args) {
        int a[]={7,8,3,2,1};
        int temp=0;
        //bubble sort
        for (int i = 0; i < a.length-1; i++) {
          for (int j = 0; j < a.length-i-1; j++) {
            if(a[j] > a[j+1] ){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }
          }
        }
        printarray(a);
    }
    
} 
