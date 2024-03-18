import java.util.Scanner;
public class cons {
          int id;
     String name;
     cons(){
      System.out.println("default constructor called");
     }  
     cons(int a,String b){
      System.out.println("perameterized constructor called");
      id=a;
      name=b;
     }
     void display(){
      System.out.println("id="+id+"\tname="+name);
     }
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  cons obj=new cons();
  int a;
   String b;
  System.out.println("enter id and name of the student");
  cons obj1=new cons(1,"s");
  cons obj3=new cons(12,"sqw");
  obj1.display();
  obj3.display();
 }
}
