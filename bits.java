public class bits {
    public static void main(String[] args) {//its work on AND(&) operator
        int pos=2;//for position 1
        int n=5;//0101
        int bitmask=5<<pos;//0100
       if((bitmask & n)==0){//get-bit operation (0101  AND 0100)=0 
            System.out.println("bit was 0");
        }else
        System.out.println("bit was 1");
    }
}
