public class sumofarrR {
    public static void findsum(int i,int sum) {
        int arr[]={1,2,3,4,5,2,3,5,6};
        if(i>arr.length-1){
          System.out.println("sum of array element is="+sum);
        }else{
        sum=sum+arr[i];
       findsum(i+1, sum);
        }
    }
 public static void main(String[] args) {
    int i=0;
    int sum=0;
    findsum(i, sum);
 }
}
