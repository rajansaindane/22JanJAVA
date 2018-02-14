package innerClasses;

import java.util.Locale;

/**
 * Created by rajan on 12/2/18.
 */
public class LocalDemo {

    String name="codekul";

    void javaClasses()
    {
        class LocalInner
        {
            void display()
            {
                System.out.println(name);
            }

        }
        LocalInner localInner=new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        LocalDemo locale=new LocalDemo();
        locale.javaClasses();
    }
}
