// object  by constructor
class met{
    int a;
    String s;
    met(int r,String b){
        a=r;
        s=b;
     }
     public void display(){
      System.out.println("roll no is="+a);
      System.out.println("name of the student is:"+s);
     }
    }
   public class objectbyconstructor{
    public static void main(String[] args) {
      met o=new met(51,"sagar");
      o.display();
    }
  }
  
