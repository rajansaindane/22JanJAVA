package string;

/**
 * Created by rajan on 8/2/18.
 */
public class StringDemo {


    String stringCheck()
    {
        String s="codekul";

        for (int i=0;i<10000;i++)
        {
           s=s.concat("institute");
        }
        return s;
    }

    StringBuffer stringBuffCheck()
    {
        StringBuffer s=new StringBuffer("codekul");

        for (int i=0;i<10000;i++)
        {
            s.append("institute");
        }
        return s;
    }

    StringBuilder stringBuildCheck()
    {
        StringBuilder s=new StringBuilder("codekul");

        for (int i=0;i<10000;i++)
        {
            s.append("institute");
        }
        return s;
    }


    public static void main(String[] args) {

      StringDemo stringDemo=new StringDemo();

      long i=System.currentTimeMillis();
      stringDemo.stringCheck();
      long diff=System.currentTimeMillis()-i;
        System.out.println(diff);

        long i1=System.currentTimeMillis();
        stringDemo.stringBuffCheck();
        long diff1=System.currentTimeMillis()-i1;
        System.out.println(diff1);

        long i2=System.currentTimeMillis();
        stringDemo.stringBuildCheck();
        long diff2=System.currentTimeMillis()-i2;
        System.out.println(diff2);
    }

}
