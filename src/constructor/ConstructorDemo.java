package constructor;

/**
 * Created by rajan on 30/1/18.
 */
public class ConstructorDemo {

    int a,b;
    ConstructorDemo(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("add : "+(a+b));
    }

    ConstructorDemo()
    {
        System.out.println("in default constructor");
    }

    void display()
    {

        System.out.println("addition : "+(a+b));
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo=new ConstructorDemo(10,20);
        ConstructorDemo constructorDemo1=new ConstructorDemo();
    }
}

