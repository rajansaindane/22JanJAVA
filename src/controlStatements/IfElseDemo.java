package controlStatements;

import java.util.Scanner;

/**
 * Created by rajan on 24/1/18.
 */
public class IfElseDemo {

        int num,percentage;
        Scanner scanner=new Scanner(System.in);
    void ifElse()
    {
        System.out.println("enter the number : ");
        num=scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }

    void elseIFDemo()
    {
        System.out.println("enter the percentage : ");
        percentage=scanner.nextInt();
        if(percentage<35)
        {
            System.out.println("fail");
        }
        else if (percentage>=35 && percentage<60)
        {
            System.out.println("pass class");
        }
        else if(percentage>=60 && percentage<=100)
        {
            System.out.println("first class");
        }
        else
        {
            System.out.println("invalid");
        }

    }

    public static void main(String[] args) {
        new IfElseDemo().elseIFDemo();
    }
}
