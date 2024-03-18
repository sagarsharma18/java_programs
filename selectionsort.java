public class selectionsort {
   public static void printarray(int a[]) {
    for (int i = 0; i < a.length; i++) {
        System.out.print(" "+a[i]);
    }
  }
  public static void main(String[] args) {
    int a[]={7,8,3,1,2};
    int temp=0;
    int smallest=0;
    for (int i = 0; i < a.length-1; i++) {
        smallest=i;
        for (int j = i+1; j < a.length; j++) {
            if (a[smallest]>a[j]) {
                smallest=j;
            }
        }
        temp=a[i];
        a[i]=a[smallest];
        a[smallest]=temp;
    }
    System.out.print("list after sort:");
    printarray(a);
  }    
}
