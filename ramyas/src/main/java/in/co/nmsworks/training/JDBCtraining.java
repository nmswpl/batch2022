package in.co.nmsworks.training;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBCtraining
{
    public static void main(String[] args)  {
        try
        {
            Connection con = DriverManager.getConnection("JDBC:mysql://localhost/Training");

            String[] arr = {"insert into TodoList(sno,uname,descr,addeddate)VALUES('12','ramya','purchase dress','2022-08-18')",
                    "insert into TodoList(sno,uname,descr,addeddate)VALUES('12','priya','purchase dress','2022-08-18')",
                    "insert into TodoList(sno,uname,descr,addeddate)VALUES('12','blessy','purchase dress','2022-08-18')",
                    "insert into TodoList(sno,uname,descr,addeddate)VALUES('12','athithi','purchase dress','2022-08-18')",
                    "insert into TodoList(sno,uname,descr,addeddate)VALUES('12','meenuu','purchase dress','2022-08-18')"};

            for (String s : arr) {
                PreparedStatement stmt = con.prepareStatement(s);
                stmt.executeUpdate();
            }
            System.out.println("obtained!!!");

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("not obtained");
        }


    }
}
