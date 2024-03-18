public class clearbit {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;
        int clb=((~(bitmask) & n));
        System.out.println(clb);
    }
}
