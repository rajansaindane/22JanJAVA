package keywords;

/**
 * Created by rajan on 30/1/18.
 */
public class Break {

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
    }

}
