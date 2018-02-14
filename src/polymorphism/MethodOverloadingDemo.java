package polymorphism;

/**
 * Created by rajan on 5/2/18.
 */
public class MethodOverloadingDemo
{

    int id=100;
    int add(int a,int b)
    {
        System.out.println(a+b);
        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.out.println(a+b+c);
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo m=new MethodOverloadingDemo();
        m.add(1,2,3);
        m.add(1,2);
    }

}
