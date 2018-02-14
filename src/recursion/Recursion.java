package recursion;

import java.util.Scanner;

/**
 * Created by rajan on 7/2/18.
 */
public class Recursion {

    static long fact=0;
   int factorial(long number)
   {
       if(number==1)
       {
           return 1;
       }
       fact=factorial(number-1)*number;
               return (int) fact;
   }

    public static void main(String[] args) {
        System.out.println("number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        new Recursion().factorial(num);
        System.out.println("factorial of "+num+" is :"+fact);
    }

}
