package lab;

/**
 * Created by htplex on 4/24/16.
 */
public class ee {
  public ee(){
    System.out.println("ha");
  }
  {
    System.out.println("AC");
  }
  static {
    System.out.println("Sta A");
  }

  public static void main(String[]args){
    B m=new B();
  }
}
class B extends ee{
  public B(){
    System.out.println("HB");
  }
  {
    System.out.println("IB");
  }
  static {
    System.out.println("KK");
  }

}