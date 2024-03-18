import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String fname="sagar";
       String lname="sharma";
       String name=fname+" "+lname;
       //concatenation
       System.out.println(name.length());
    //char at 
       for (int i = 0; i <name.length(); i++) {
        System.out.println(name.charAt(i));
       }
       if(fname.compareTo(lname)>0){
        System.out.println("s1 is big ");
       }else{
        System.out.println("s2 is big ");
       }
       String s="my name is stive";
       String b=s.substring(3);
       System.out.println(b);
       //to convert string->int or int->string 
       String d="112";
       int a=Integer.parseInt(d);
       System.out.println(a);
       int o=124;
       String e=Integer.toString(o);
       System.out.println(e);
    }
}
