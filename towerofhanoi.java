/**
 * program of towerofhanoi
 */
public class towerofhanoi {
    public static void toh(int n,String src,String hel,String des) {
        if (n==1) {
            System.out.println("value "+n + "tranfering from "+src+" to "+des);
            return;
        }
        toh(n-1, src, des, hel);
        System.out.println("value "+n+" transfiring from "+src+" to "+des);
        toh(n-1, hel, src, des);
    }
    public static void main(String[] args) {
        int n=3;
        toh(n, "s", "h", "d");
    }
}