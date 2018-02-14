package keywords;

/**
 * Created by rajan on 31/1/18.
 */
public class This {

    int a,b;
    This(int a,int b)
    {
        this();
        this.a=a;
        this.b=b;
        System.out.println("a : "+a+" b :"+b);
    }

    This()
    {
        this(30);
        System.out.println("inside default constructor");
    }

    This(int a)
    {
        System.out.println(" a: "+a);
    }

    void getData(int a,int b)
    {
        this.a=a;
        this.b=b;
        this.display();
    }
    void display()
    {
        System.out.println("a : "+a+" b: "+b);
    }
    public static void main(String[] args) {

        This thisKey=new This(10,20);
        thisKey.getData(70,80);
    }


}
