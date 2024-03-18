public class setbit {
    public static void main(String[] args) {//for set bit OR(|)operator work
        int n=5;//0101
        int pos=1;
        int bitmask=1<<pos;  //0100 
       int set_bit=n | bitmask;
       System.out.println(set_bit);
    }
}
