package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample2
{
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            List<String[]> queries = new ArrayList<>();
            queries.add(new String[] {"Priya","Product Purchase","2022-10-06 10.00.00"});
            queries.add(new String[] {"Suba","Reading Books","2022-10-06 20:28:00"});
            queries.add(new String[] {"Mala","Cooking" ,"2022-10-06 20:00:00"});
            queries.add(new String[] {"Selvi","Doing Crafts","2022-10-08 18:00:00"});
            queries.add(new String[] {"Bala","Playing Cricket","2022-10-09 18:00:00"});
            queries.add(new String[] {"Sathish","Doing homework","2022-10-06 19:00:00"});
            queries.add(new String[] {"Jasmine","Studying for exam","2022-10-07 00:00:00"});
            queries.add(new String[] {"Malathi","Preparing food","2022-10-06 20:00:00"});
            queries.add(new String[] {"Suganya","Purchasing crackers","2022-10-08 11:00:00"});
            queries.add(new String[] {"Naren","Playing Chess","2022-10-07"});

            stmt = conn.prepareStatement("INSERT INTO TodoList VALUES (?,?,?,?)");
            for ( int i = 0 ; i < queries.size(); i++)
            {
                stmt.setInt(1,i+1);
                stmt.setString(2,queries.get(i)[0]);
                stmt.setString(3,queries.get(i)[1]);
                stmt.setString(4,queries.get(i)[2]);
             //   stmt.setDate(4, Date.valueOf("2022-10-08 17:00:00"));
                stmt.executeUpdate();

            }
        }
        catch(Exception e)
        {
            System.out.println();
            e.printStackTrace();
        }
        finally
        {
            if(stmt != null)
                stmt.close();

            if(conn != null)
                conn.close();

    }
}
}