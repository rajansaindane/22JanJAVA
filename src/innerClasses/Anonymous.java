package innerClasses;

/**
 * Created by rajan on 12/2/18.
 */
abstract public class Anonymous {

    abstract void display();
}

class CheckAnonymous
{
    public static void main(String[] args) {

        Anonymous anonymous=new Anonymous() {
            @Override
            void display() {
                System.out.println("inside display of anonymous inner class");
            }
        };
        anonymous.display();
    }
}
