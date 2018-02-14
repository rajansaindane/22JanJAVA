package polymorphism;

/**
 * Created by rajan on 5/2/18.
 */
public class MethodOverriding extends MethodOverloadingDemo {

    int id=200;
    int add(int a,int b)
    {
        System.out.println(a-b);
        return a-b;
    }
    void check()
    {
        System.out.println("id in child class :"+id);
        System.out.println("id in parent class :"+super.id);
    }

    public static void main(String[] args) {
        MethodOverriding methodOverriding=new MethodOverriding();
        methodOverriding.add(2,1);
      methodOverriding.check();
    }

}
