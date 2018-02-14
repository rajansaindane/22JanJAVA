package loops;

/**
 * Created by rajan on 29/1/18.
 */
public class WhileLoop {

    public static void main(String[] args) {

        int i=0;
        while (i<4)
        {
            System.out.println("inside while");
            i++;
        }

        int j=0;
        do {
            System.out.println("inside do while");
            j++;
        }while (j<4);

    }
}
