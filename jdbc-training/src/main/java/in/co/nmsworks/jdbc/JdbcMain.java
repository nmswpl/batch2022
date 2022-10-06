package in.co.nmsworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMain
{
    private void select() throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prodcopy", "bill", "pass");

        PreparedStatement ps = con.prepareStatement("select * from todo_item");
        ResultSet rs = ps.executeQuery();

        while (rs.next())
        {
            System.out.println(rs.getString(1) +
                    " | " + rs.getString(2) +
                    " | " + rs.getString(3) +
                    " | " + rs.getString(4) +
                    " | " + rs.getString(5) +
                    " | " + rs.getString(6) +
                    " | " + rs.getString(7) +
                    " | " + rs.getString(8));
        }
    }

    private void update() throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prodcopy", "bill", "pass");

        PreparedStatement ps = con.prepareStatement("update todo_item set description = 'some descr1' where id = 2");
        int rows = ps.executeUpdate();
        System.out.println("updated rows = " + rows);
    }

    public static void main(String[] args) throws Exception
    {
        JdbcMain main = new JdbcMain();
        //main.select();
        main.update();
    }
}


