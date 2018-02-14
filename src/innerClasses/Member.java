package innerClasses;

/**
 * Created by rajan on 12/2/18.
 */
public class Member {

    void showData()
    {
        System.out.println("hii");
    }
    class MemberInner
    {
       private void display()
        {
            System.out.println("hello");
        }
        class InnerClass
        {
            void getData(int a)
            {
                System.out.println("a: "+a);
            }
        }
    }
    public static void main(String[] args) {
        Member member=new Member();
        Member.MemberInner memberInner=member.new MemberInner();
        memberInner.display();
        Member.MemberInner.InnerClass innerClass=memberInner.new InnerClass();
        innerClass.getData(2);

    }

}
