package in.co.nmsworks.training;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class JDBCTraining
{
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        try
        {
            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"ramya","do homework"});
            queries.add(new String[]{"blessy","do cleaning"});
            queries.add(new String[]{"athithi","do yoga"});
            queries.add(new String[]{"keerthana","purchase dress"});
            queries.add(new String[]{"priya","write assignment"});
            queries.add(new String[]{"meenu","purchase grossery"});
            queries.add(new String[]{"packiya","do exercise"});
            queries.add(new String[]{"dharshini","purchase paper"});
            queries.add(new String[]{"joo","purchase watch"});
            queries.add(new String[]{"narmadha","purchase specs"});

            con = DriverManager.getConnection("JDBC:mysql://localhost/Training");
            stmt = con.prepareStatement("insert into TodoList values(?,?,?,?)");

            for (int i = 0; i < queries.size(); i++)
            {
                stmt.setInt(1,i+1);
                stmt.setString(2,queries.get(i)[0]);
                stmt.setString(3,queries.get(i)[1]);
                stmt.setDate(4, new Date(System.currentTimeMillis()));

                stmt.executeUpdate();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("not obtained");

        }
        finally
        {
            if(con!=null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
