package exceptionHandling;

/**
 * Created by rajan on 13/2/18.
 */
public class ExceptionDemo {

    public static void main(String[] args) {
try {


   int array[]=new int[4];
   array[5]=6;
    System.out.println(array[6]);
}
catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}
finally {
    int a=10,b=20;

    System.out.println("before : "+a);
    System.out.println("before : "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after : "+a);
    System.out.println("after : "+b);
    System.out.println("inside finally");
}

    }


}
