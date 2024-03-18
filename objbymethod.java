// object  by method variable
class best{
    int a;
    String s;
    void getdata(int id,String name){
        a=id;
        s=name;
        System.out.print(a+" "+s);
    }
  }
   public class objbymethod{
    public static void main(String[] args) {
      best o=new best();
      int id;
      int name;
      o.getdata(51,"sagar");
    }
  }
  