package encapsulation;

import java.util.Scanner;

/**
 * Created by rajan on 9/2/18.
 */
public class CheckEncapsulation {

    public static void main(String[] args) {
        EncapsulationDemo demo=new EncapsulationDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the id and name : ");
        int id=scanner.nextInt();
        String name=scanner.nextLine();
        demo.setId(id);
        demo.setName(name);
        System.out.println(demo.getId());
        System.out.println(demo.getName());

    }

}
