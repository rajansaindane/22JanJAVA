package inheritance;

/**
 * Created by rajan on 2/2/18.
 */
public class SingleInheritance {

    void addition(int a,int b)
    {
        System.out.println(a+b);
    }

}
class CheckChild extends SingleInheritance
{

    void sub(int a,int b)
    {
        System.out.println(a-b);
    }


}
class SubChild extends CheckChild
{
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        SubChild subChild=new SubChild();
        subChild.addition(10,20);
        subChild.sub(30,10);
        subChild.mul(10,20);

    }
}
