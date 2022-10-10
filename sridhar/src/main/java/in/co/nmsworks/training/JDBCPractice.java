package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class JDBCPractice {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement stmt=null;
        List<String[]> sqlValues=new ArrayList<>();

        sqlValues.add(new String[]{"Sridhar","Do HomeWork"});
        sqlValues.add(new String[]{"Nandha","Do TypeWrite"});
        sqlValues.add(new String[]{"Praveen","Do Coding"});
        sqlValues.add(new String[]{"Pradeep","Washing Clothes"});
        sqlValues.add(new String[]{"Mano","Playing VolleyBall"});

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/Training");

            stmt= con.prepareStatement("insert into TodoList(sno,username,descr,addedDate)VALUES(?,?,?,?)");

            for( int i=0; i< sqlValues.size(); i++)
            {
                stmt.setInt(1,i+1);
                stmt.setString(2,sqlValues.get(i)[0]);
                stmt.setString(3,sqlValues.get(i)[1]);
                stmt.setDate(4,new Date(System.currentTimeMillis()));
                stmt.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            System.err.println("Wrong Path Connection");
            e.printStackTrace();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if(stmt!=null)
                {
                    stmt.close();
                }
            }
            catch (Exception e)
            {
                System.err.println("Path wrong");
            }
        }
    }
}
