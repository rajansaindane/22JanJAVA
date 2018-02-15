package jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by rajan on 15/2/18.
 */
public class Jdbc {
    static Connection con;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java22Batch","root","rajan");

        Statement statement=con.createStatement();

//        PreparedStatement p=con.prepareCall("insert into students values(?,?,?)");
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter no of students");
//        int numberOfStudents=scanner.nextInt();
//        for (int j=numberOfStudents;j>0;j--) {
//            System.out.println("insert id name and city of student : ");
//            int i = scanner.nextInt();
//            String name = scanner.nextLine();
//            String city = scanner.nextLine();
//            p.setInt(1, i);
//            p.setString(2, name);
//            p.setString(3, city);
//            p.execute();
//        }
      //  ResultSet rs=statement.executeQuery("select * from students");

       statement.executeUpdate("update students set name='codekul' where id=1");
        ResultSet rs=statement.executeQuery("select * from students");
        while (rs.next())
        {
            System.out.println("id :"+rs.getInt(1)+" name :"+rs.getString(2)
            +" city : "+rs.getString(3));
        }
        con.close();
    }

}
