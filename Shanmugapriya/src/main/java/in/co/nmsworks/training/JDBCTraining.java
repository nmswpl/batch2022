package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTraining
{
    public static void main(String[] args)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");

//            PreparedStatement stmt1 = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values (1,'Abi','purchase clothes','2022-10-06 11:00:00')");
//            stmt1.executeUpdate();
//
//            PreparedStatement stmt2 = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values (2,'Banu','studying','2022-10-10 08:00:00')");
//            stmt2.executeUpdate();
//
//
//            PreparedStatement stmt3 = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values (3,'Divya','project works','2022-10-08 00:00:00')");
//            stmt3.executeUpdate();
//
//            PreparedStatement stmt4 = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values (4,'Hema','purchase crackers','2022-10-09 10:00:00')");
//            stmt4.executeUpdate();
//
//            PreparedStatement stmt5 = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values (5,'Indhu','cooking','2022-10-09 08:30:00')");
//            stmt5.executeUpdate();

            String[] details = {"1 ,'Abi' ,'purchase clothes' ,'2022-10-06 11:00:00'","2,'Banu','studying','2022-10-10 08:00:00'","3,'Divya','project works','2022-10-08 00:00:00'","4,'Hema','purchase crackers','2022-10-09 10:00:00'","5,'Indhu','cooking','2022-10-09 08:30:00'"};
            for (int i = 0; i < details.length; i++)
            {
                PreparedStatement stmt = con.prepareStatement("insert into TodoList (sno,uname,descr,addeddate) values ("+details[i]+")" );
                stmt.executeUpdate();
            }
        }
        catch(Exception e){
            System.out.println();
            e.printStackTrace();
        }
    }
}
