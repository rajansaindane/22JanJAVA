package operators;

/**
 * Created by rajan on 23/1/18.
 */
public class UneryOperator {

    public static void main(String[] args) {
        int a=10,b=0;
        b=(a++)+b++;
        System.out.println("b : "+b);
        int c=(++b)+(b++);
        System.out.println("c : "+c);
        a=(c++)+(++b);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }

}
