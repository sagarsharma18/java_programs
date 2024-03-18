public class switchs {
    public static void main(String[] args) {

      System.out.println("enter a charcter");
      System.out.println("m for mumbai");
      System.out.println("j for jaipur");
      System.out.println("d for delhi");
      System.out.println("h for himachal");
      char choice;
      System.out.flush();
      try{
      switch (choice=(char)System.in.read()) {
        case 'm':
            System.out.println("mumbai");
            break;
        case 'j':
        System.out.println("jaipur");
        break;
        case 'd':
            System.out.println("delhi");
            break;
        case 'h':
        System.out.println("himachal");
        break;
        default:        
        System.out.println("wrong input");
            break;
      }
    }
    catch(Exception obj){
        System.out.println("error caught");
    }
  }
}
