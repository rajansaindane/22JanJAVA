package abstraction;

/**
 * Created by rajan on 6/2/18.
 */
public class CheckAbstract extends AbstractClass implements InterfaceDemo {

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void display() {
        System.out.println("from interface");
    }

    public static void main(String[] args) {
        CheckAbstract checkAbstract=new CheckAbstract();
        checkAbstract.add(10,20);
        checkAbstract.showData();
        checkAbstract.display();
    }
}
