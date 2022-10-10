package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo
{
    public static void main(String[] args)
    {
        Connection con=null;
        PreparedStatement stmt=null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            List<String[]> queries=new ArrayList<>();
            queries.add(new String[]{"Divya", "Do HW"});
            queries.add(new String[]{"Priya", "Writing"});
            queries.add(new String[]{"Keerthana","Do HW"});
            queries.add(new String[]{"Aju","Writing"});
            queries.add(new String[]{"Swathe","hw"});
            queries.add(new String[]{"kavitha","work"});
            queries.add(new String[]{"Muthu","Writing"});
            queries.add(new String[]{"Santhosh","hw"});
            queries.add(new String[]{"kumar","hw"});
            queries.add(new String[]{"Kabila","hw"});

            stmt=con.prepareStatement("INSERT INTO TodoList VALUES(?,?,?,?)");
            for(int i=0;i< queries.size();i++)
            {
                stmt.setInt(1,i+1);
                stmt.setString(2,queries.get(i)[0]);
                stmt.setString(3,queries.get(i)[1]);
                stmt.setDate(4,new Date(System.currentTimeMillis()));
                stmt.executeUpdate();
            }


        }
        catch(Exception e)
        {
            System.err.println("ERROR occured");
            e.printStackTrace();
        }
        finally {
            if (stmt != null)
            {
                try {
                    stmt.close();
                } catch (SQLException e)
                {
                    System.out.println("Catch");
                }
            }

            if (con != null)
            {
                try {
                    con.close();
                }
                catch (SQLException e)
                {
                    System.out.println("Catch");
                }
            }
        }
    }
}

