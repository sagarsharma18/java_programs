import java.util.*;
interface a{
    void getdata();
}
interface b{
  void show();
}

public class interface1 implements a,b{
private  static int id;
  private static String name;
 public  void getdata() {
    Scanner s=new Scanner(System.in);
    System.out.println("enter name");
    name=s.nextLine();
    System.out.println("enter id");
    id=s.nextInt();
 }
 public void show() {
    System.out.println(id);
    System.out.println(name);
 }
public static void main(String[] args) {
   a obj1=new interface1();
   b obj2=new interface1();
obj1.getdata();
obj2.show();
}
  
}
