package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo1 {
    public static void main(String[] args)  {
        Connection conn=null;
        PreparedStatement stmt=null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"Pradeep","Playing games"});
            queries.add(new String[]{"Sridhar", "Eating cake"});
            queries.add(new String[]{"Praveen", "Celebrating birthday"});
            queries.add(new String[]{"Manoj", "search job"});
            queries.add(new String[]{"Sundhar", "Eating food"});
            queries.add(new String[]{"Anjana", "washing dress"});
            queries.add(new String[]{"Ananthi", "Drinking milk"});
            queries.add(new String[]{"Chinchan", "Going to school"});
            queries.add(new String[]{"Ben", "Drive the car"});
            queries.add(new String[]{"Gwen", "Reading book"});
//            System.out.println(queries);;


//
            for (int i = 0; i < queries.size(); i++) {

                stmt = conn.prepareStatement( "insert into TodoList values (?,?,?,?)");
                stmt.setInt(1, i + 1);
                stmt.setString(2, queries.get(i)[0]);
                stmt.setString(3, queries.get(i)[1]);
                stmt.setDate(4, new Date(System.currentTimeMillis()));
                stmt.executeUpdate();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("DB is not connected ");
        }
        finally {
            try {
                if(conn!=null)
                {
                    conn.close();
                }
                if (stmt!=null)
                {
                    stmt.close();
                }
            }
            catch (Exception e)
            {

                e.printStackTrace();
            }
        }

    }
}
