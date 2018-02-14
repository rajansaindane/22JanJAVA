package inheritance;

/**
 * Created by rajan on 2/2/18.
 */
public class HierarchicalInheritance {

    void addition(int a,int b)
    {
        System.out.println(a+b);
    }

}
class A extends HierarchicalInheritance
{
  void sub()
  {
      System.out.println("in sub method");
  }
}
class B extends HierarchicalInheritance
{
    void div()
    {
        System.out.println("inside div method");
    }
    public static void main(String[] args) {
        B b=new B();
        b.addition(30,40);
        A a=new A();
        a.addition(30,40);
        a.sub();
    }
}
