package controlStatements;

import java.util.Scanner;

/**
 * Created by rajan on 29/1/18.
 */
public class SwitchCase {

    public static void main(String[] args) {

        int caseNo;
        System.out.println("enter the choice");
        Scanner scanner=new Scanner(System.in);
        caseNo=scanner.nextInt();
        switch (caseNo)
        {
            case 1:
                System.out.println("inside case 1");
                break;
            case 2:
                System.out.println("inside case 2");
                break;
            case 3 :
                System.out.println("inside case 3");
                break;
                default:
                    System.out.println("invalid case no");
        }

    }
}
