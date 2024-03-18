
 class test{
     float len;
     float br;
   public void getdata(float a,float b){
     len = a;
     br =b;
    }
}
public class areaofclass {
    public static void main(String[] args) {
        float area;
        test obj=new test();
        obj.getdata(10, 20);
        area=obj.len*obj.br;
        System.out.println(area);
    }
}
