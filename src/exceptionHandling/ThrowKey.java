package exceptionHandling;

import java.util.Scanner;

/**
 * Created by rajan on 14/2/18.
 */
public class ThrowKey {

    static void voteLimit(int result)
    {
        if(result<0)
        {
            throw new ArithmeticException("not able to vote");
        }
        else
        {
            System.out.println("welcome to vote");
        }

    }

    public static void main(String[] args) {
        System.out.println("enter your age : ");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        voteLimit(age);
    }

}
