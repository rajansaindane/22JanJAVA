package operators;

import java.util.Scanner;

/**
 * Created by rajan on 22/1/18.
 */
public class Operators {

   static int a,b,result;
   static Scanner scanner=new Scanner(System.in);
    void add()
    {
        result=a+b;
        System.out.println("result of add= "+result);
    }

    void sub()
    {
        result=a-b;
        System.out.println("result of sub = "+result);
    }
    public static void main(String[] args) {
        System.out.println("enter the values of a and b");
        a=scanner.nextInt();
        b=scanner.nextInt();
        Operators firstDemo=new Operators();
        firstDemo.add();
        firstDemo.sub();
    }

}
