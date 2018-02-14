package loops;

import java.util.Scanner;

/**
 * Created by rajan on 30/1/18.
 */
public class PyramidDemo {

    public static void main(String[] args) {

        int n;
        System.out.println("enter n : ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int k=2*n-1;
        for(int i=0;i<n;i++)
        {

            for(int j=0;j<k;j++)

            {
                System.out.print(" ");

            }
            k=k-1;
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
