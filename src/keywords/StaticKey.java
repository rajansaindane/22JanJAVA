package keywords;

/**
 * Created by rajan on 1/2/18.
 */
public class StaticKey {

    static String collegeName="SAOE";
    String studentName;
    int rollNo;

    StaticKey(int rollNo,String studentName)
    {
        this.rollNo=rollNo;
        this.studentName=studentName;
    }
    void  show()
    {

        System.out.println("roll no : "+rollNo+" student name : "+studentName+
                " college : "+collegeName);
    }

    static
    {
        System.out.println("inside static block");
    }

    static void check()
    {
        System.out.println("inside static method");
    }
    public static void main(String[] args) {
        StaticKey staticKey=new StaticKey(1,"shubham");
        StaticKey staticKey1=new StaticKey(2,"asma");
        StaticKey staticKey2=new StaticKey(3,"Ganesh");
        staticKey.show();
        staticKey1.show();
        staticKey2.show();
        check();
    }



}
