class cool{
  int id;
  String name;
  void getdata1(int a,String b){
    id=a;
    name=b;
  }
  void show(){
    System.out.println("id="+id+"\n"+"name ="+name);
  }
}
public class operators {
  public static void main(String[] args) {
    cool obj=new cool();
    obj.getdata1(51,"sagar");
    obj.show();
  }    
}
