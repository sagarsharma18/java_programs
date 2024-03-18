import java.util.*;
public class stringsbuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("steve");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //set char at
        sb.setCharAt(0, 'w');
        System.out.println(sb);
        //insert ()
        sb.insert(3, 'v');
        System.out.println(sb);
        //delete extra v
        sb.delete(3, 4);
        System.out.println(sb);
        //append to add value at th end 
        sb.append('r');
        System.out.println(sb.length());       
    }
}
